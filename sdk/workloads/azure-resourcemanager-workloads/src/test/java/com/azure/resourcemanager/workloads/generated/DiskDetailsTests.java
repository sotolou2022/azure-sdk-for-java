// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.workloads.models.DiskDetails;
import com.azure.resourcemanager.workloads.models.DiskSku;
import com.azure.resourcemanager.workloads.models.DiskSkuName;
import org.junit.jupiter.api.Assertions;

public final class DiskDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DiskDetails model =
            BinaryData
                .fromString(
                    "{\"sku\":{\"name\":\"Standard_LRS\"},\"sizeGB\":5612595688544592348,\"minimumSupportedDiskCount\":8451324547573976029,\"maximumSupportedDiskCount\":4274110393583912034,\"iopsReadWrite\":5470433313051888734,\"mbpsReadWrite\":7911846487069687431,\"diskTier\":\"nwzsymg\"}")
                .toObject(DiskDetails.class);
        Assertions.assertEquals(DiskSkuName.STANDARD_LRS, model.sku().name());
        Assertions.assertEquals(5612595688544592348L, model.sizeGB());
        Assertions.assertEquals(8451324547573976029L, model.minimumSupportedDiskCount());
        Assertions.assertEquals(4274110393583912034L, model.maximumSupportedDiskCount());
        Assertions.assertEquals(5470433313051888734L, model.iopsReadWrite());
        Assertions.assertEquals(7911846487069687431L, model.mbpsReadWrite());
        Assertions.assertEquals("nwzsymg", model.diskTier());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DiskDetails model =
            new DiskDetails()
                .withSku(new DiskSku().withName(DiskSkuName.STANDARD_LRS))
                .withSizeGB(5612595688544592348L)
                .withMinimumSupportedDiskCount(8451324547573976029L)
                .withMaximumSupportedDiskCount(4274110393583912034L)
                .withIopsReadWrite(5470433313051888734L)
                .withMbpsReadWrite(7911846487069687431L)
                .withDiskTier("nwzsymg");
        model = BinaryData.fromObject(model).toObject(DiskDetails.class);
        Assertions.assertEquals(DiskSkuName.STANDARD_LRS, model.sku().name());
        Assertions.assertEquals(5612595688544592348L, model.sizeGB());
        Assertions.assertEquals(8451324547573976029L, model.minimumSupportedDiskCount());
        Assertions.assertEquals(4274110393583912034L, model.maximumSupportedDiskCount());
        Assertions.assertEquals(5470433313051888734L, model.iopsReadWrite());
        Assertions.assertEquals(7911846487069687431L, model.mbpsReadWrite());
        Assertions.assertEquals("nwzsymg", model.diskTier());
    }
}
