// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcomplianceautomation.models.ResourceItem;

public final class ResourceItemTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceItem model = BinaryData.fromString(
            "{\"subscriptionId\":\"wbqpl\",\"resourceGroup\":\"vnuuepzl\",\"resourceType\":\"hw\",\"resourceId\":\"oldweyuqdu\"}")
            .toObject(ResourceItem.class);
    }
}
