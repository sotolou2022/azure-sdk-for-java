// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.search.fluent.models.SharedPrivateLinkResourceInner;
import com.azure.resourcemanager.search.models.SharedPrivateLinkResourceProperties;

/** Samples for SharedPrivateLinkResources CreateOrUpdate. */
public final class SharedPrivateLinkResourcesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/search/resource-manager/Microsoft.Search/stable/2020-08-01/examples/CreateOrUpdateSharedPrivateLinkResource.json
     */
    /**
     * Sample code: SharedPrivateLinkResourceCreateOrUpdate.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void sharedPrivateLinkResourceCreateOrUpdate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .searchServices()
            .manager()
            .serviceClient()
            .getSharedPrivateLinkResources()
            .createOrUpdate(
                "rg1",
                "mysearchservice",
                "testResource",
                new SharedPrivateLinkResourceInner()
                    .withProperties(
                        new SharedPrivateLinkResourceProperties()
                            .withPrivateLinkResourceId(
                                "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Storage/storageAccounts/storageAccountName")
                            .withGroupId("blob")
                            .withRequestMessage("please approve")),
                null,
                Context.NONE);
    }
}