// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.workloads.fluent.models.SapVirtualInstanceInner;
import com.azure.resourcemanager.workloads.models.ManagedRGConfiguration;
import com.azure.resourcemanager.workloads.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.workloads.models.SapConfiguration;
import com.azure.resourcemanager.workloads.models.SapEnvironmentType;
import com.azure.resourcemanager.workloads.models.SapProductType;
import com.azure.resourcemanager.workloads.models.UserAssignedIdentity;
import com.azure.resourcemanager.workloads.models.UserAssignedServiceIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SapVirtualInstanceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SapVirtualInstanceInner model =
            BinaryData
                .fromString(
                    "{\"identity\":{\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"czbysc\":{\"principalId\":\"e76ec0f3-cd61-4307-8671-be9481977d77\",\"clientId\":\"bf68fb1e-ffd0-48e4-bda4-e947e6a685f0\"},\"x\":{\"principalId\":\"653de1ca-4520-4108-9f08-6388d3a70cce\",\"clientId\":\"dbb95990-0b24-4cdc-a73b-084cead69764\"},\"vyq\":{\"principalId\":\"ba05157b-af34-49f2-a7c2-5ee19180566c\",\"clientId\":\"950342a0-ef61-43da-aa5e-7a1282d209e8\"},\"b\":{\"principalId\":\"7ef32b53-d2ca-4bf3-a382-27cb905ca89c\",\"clientId\":\"cbf85106-9cca-493e-a6f3-3f84fcde2335\"}}},\"properties\":{\"environment\":\"NonProd\",\"sapProduct\":\"Other\",\"configuration\":{\"configurationType\":\"SapConfiguration\"},\"managedResourceGroupConfiguration\":{\"name\":\"vd\"},\"status\":\"Running\",\"health\":\"Unknown\",\"state\":\"DiscoveryInProgress\",\"provisioningState\":\"Updating\",\"errors\":{}},\"location\":\"gaudcc\",\"tags\":{\"cnyejhkryhtnapcz\":\"s\"},\"id\":\"lokjyemkk\",\"name\":\"ni\",\"type\":\"joxzjnchgejspodm\"}")
                .toObject(SapVirtualInstanceInner.class);
        Assertions.assertEquals("gaudcc", model.location());
        Assertions.assertEquals("s", model.tags().get("cnyejhkryhtnapcz"));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.identity().type());
        Assertions.assertEquals(SapEnvironmentType.NON_PROD, model.environment());
        Assertions.assertEquals(SapProductType.OTHER, model.sapProduct());
        Assertions.assertEquals("vd", model.managedResourceGroupConfiguration().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SapVirtualInstanceInner model =
            new SapVirtualInstanceInner()
                .withLocation("gaudcc")
                .withTags(mapOf("cnyejhkryhtnapcz", "s"))
                .withIdentity(
                    new UserAssignedServiceIdentity()
                        .withType(ManagedServiceIdentityType.USER_ASSIGNED)
                        .withUserAssignedIdentities(
                            mapOf(
                                "czbysc",
                                new UserAssignedIdentity(),
                                "x",
                                new UserAssignedIdentity(),
                                "vyq",
                                new UserAssignedIdentity(),
                                "b",
                                new UserAssignedIdentity())))
                .withEnvironment(SapEnvironmentType.NON_PROD)
                .withSapProduct(SapProductType.OTHER)
                .withConfiguration(new SapConfiguration())
                .withManagedResourceGroupConfiguration(new ManagedRGConfiguration().withName("vd"));
        model = BinaryData.fromObject(model).toObject(SapVirtualInstanceInner.class);
        Assertions.assertEquals("gaudcc", model.location());
        Assertions.assertEquals("s", model.tags().get("cnyejhkryhtnapcz"));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.identity().type());
        Assertions.assertEquals(SapEnvironmentType.NON_PROD, model.environment());
        Assertions.assertEquals(SapProductType.OTHER, model.sapProduct());
        Assertions.assertEquals("vd", model.managedResourceGroupConfiguration().name());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
