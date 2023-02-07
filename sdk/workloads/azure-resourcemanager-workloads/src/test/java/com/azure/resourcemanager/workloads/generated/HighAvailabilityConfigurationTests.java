// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.workloads.models.HighAvailabilityConfiguration;
import com.azure.resourcemanager.workloads.models.SapHighAvailabilityType;
import org.junit.jupiter.api.Assertions;

public final class HighAvailabilityConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HighAvailabilityConfiguration model =
            BinaryData
                .fromString("{\"highAvailabilityType\":\"AvailabilitySet\"}")
                .toObject(HighAvailabilityConfiguration.class);
        Assertions.assertEquals(SapHighAvailabilityType.AVAILABILITY_SET, model.highAvailabilityType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HighAvailabilityConfiguration model =
            new HighAvailabilityConfiguration().withHighAvailabilityType(SapHighAvailabilityType.AVAILABILITY_SET);
        model = BinaryData.fromObject(model).toObject(HighAvailabilityConfiguration.class);
        Assertions.assertEquals(SapHighAvailabilityType.AVAILABILITY_SET, model.highAvailabilityType());
    }
}
