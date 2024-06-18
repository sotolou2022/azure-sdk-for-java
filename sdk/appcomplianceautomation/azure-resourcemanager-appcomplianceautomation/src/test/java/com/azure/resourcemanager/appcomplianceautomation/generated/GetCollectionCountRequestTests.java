// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcomplianceautomation.models.GetCollectionCountRequest;
import org.junit.jupiter.api.Assertions;

public final class GetCollectionCountRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GetCollectionCountRequest model
            = BinaryData.fromString("{\"type\":\"uyav\"}").toObject(GetCollectionCountRequest.class);
        Assertions.assertEquals("uyav", model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GetCollectionCountRequest model = new GetCollectionCountRequest().withType("uyav");
        model = BinaryData.fromObject(model).toObject(GetCollectionCountRequest.class);
        Assertions.assertEquals("uyav", model.type());
    }
}
