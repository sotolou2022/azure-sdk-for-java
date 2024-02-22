// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.PlannedFailoverInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.PlannedFailoverInputProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.PlannedFailoverProviderSpecificFailoverInput;
import org.junit.jupiter.api.Assertions;

public final class PlannedFailoverInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PlannedFailoverInput model = BinaryData.fromString(
            "{\"properties\":{\"failoverDirection\":\"tizzronasxif\",\"providerSpecificDetails\":{\"instanceType\":\"PlannedFailoverProviderSpecificFailoverInput\"}}}")
            .toObject(PlannedFailoverInput.class);
        Assertions.assertEquals("tizzronasxif", model.properties().failoverDirection());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PlannedFailoverInput model = new PlannedFailoverInput()
            .withProperties(new PlannedFailoverInputProperties().withFailoverDirection("tizzronasxif")
                .withProviderSpecificDetails(new PlannedFailoverProviderSpecificFailoverInput()));
        model = BinaryData.fromObject(model).toObject(PlannedFailoverInput.class);
        Assertions.assertEquals("tizzronasxif", model.properties().failoverDirection());
    }
}
