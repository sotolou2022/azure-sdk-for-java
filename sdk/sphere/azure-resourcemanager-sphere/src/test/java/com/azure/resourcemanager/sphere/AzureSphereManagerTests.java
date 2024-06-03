// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.sphere;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.Region;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.TestBase;
import com.azure.core.test.annotation.LiveOnly;
import com.azure.core.util.Configuration;
import com.azure.core.util.CoreUtils;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.resourcemanager.resources.ResourceManager;
import com.azure.resourcemanager.sphere.models.Catalog;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class AzureSphereManagerTests extends TestBase {
    private static final Random RANDOM = new Random();
    private static final Region REGION_USEAST = Region.US_EAST;
    private static final Region REGION_GLOBAL = Region.create("global", "Global");
    private String resourceGroupName = "rg" + randomPadding();
    private AzureSphereManager azureSphereManager = null;
    private ResourceManager resourceManager;
    private boolean testEnv;

    @Override
    public void beforeTest() {
        final TokenCredential credential = new DefaultAzureCredentialBuilder().build();
        final AzureProfile profile = new AzureProfile(AzureEnvironment.AZURE);

        azureSphereManager = AzureSphereManager
            .configure()
            .withLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC))
            .authenticate(credential, profile);

        resourceManager = ResourceManager
            .configure()
            .withLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC))
            .authenticate(credential, profile)
            .withDefaultSubscription();

        // use AZURE_RESOURCE_GROUP_NAME if run in LIVE CI
        String testResourceGroup = Configuration.getGlobalConfiguration().get("AZURE_RESOURCE_GROUP_NAME");
        testEnv = !CoreUtils.isNullOrEmpty(testResourceGroup);
        if (testEnv) {
            resourceGroupName = testResourceGroup;
        } else {
            resourceManager.resourceGroups()
                .define(resourceGroupName)
                .withRegion(REGION_USEAST)
                .create();
        }
    }

    @Override
    protected void afterTest() {
        if (!testEnv) {
            resourceManager.resourceGroups().beginDeleteByName(resourceGroupName);
        }
    }

    @Test
    @LiveOnly
    public void testCreateCatalog() {
        Catalog catalog = null;
        try {
            String catalogName = "catalog" + randomPadding();
            // @embedStart
            catalog = azureSphereManager.catalogs()
                .define(catalogName)
                .withRegion(REGION_GLOBAL)
                .withExistingResourceGroup(resourceGroupName)
                .create();
            // @embedEnd
            catalog.refresh();
            Assertions.assertEquals(catalogName, catalog.name());
            Assertions.assertEquals(catalogName, azureSphereManager.catalogs().getById(catalog.id()).name());
            Assertions.assertTrue(azureSphereManager.catalogs().listByResourceGroup(resourceGroupName).stream().findAny().isPresent());
        } finally {
            if (catalog != null) {
                azureSphereManager.catalogs().deleteById(catalog.id());
            }
        }
    }

    private static String randomPadding() {
        return String.format("%05d", Math.abs(RANDOM.nextInt() % 100000));
    }
}
