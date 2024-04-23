// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confidentialledger.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.confidentialledger.models.CheckNameAvailabilityRequest;
import org.junit.jupiter.api.Assertions;

public final class CheckNameAvailabilityRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CheckNameAvailabilityRequest model = BinaryData.fromString("{\"name\":\"tu\",\"type\":\"nryrtihf\"}")
            .toObject(CheckNameAvailabilityRequest.class);
        Assertions.assertEquals("tu", model.name());
        Assertions.assertEquals("nryrtihf", model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CheckNameAvailabilityRequest model = new CheckNameAvailabilityRequest().withName("tu").withType("nryrtihf");
        model = BinaryData.fromObject(model).toObject(CheckNameAvailabilityRequest.class);
        Assertions.assertEquals("tu", model.name());
        Assertions.assertEquals("nryrtihf", model.type());
    }
}
