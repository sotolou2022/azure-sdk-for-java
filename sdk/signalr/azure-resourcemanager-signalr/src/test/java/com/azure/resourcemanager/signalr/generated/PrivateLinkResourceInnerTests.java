// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.signalr.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.signalr.models.ShareablePrivateLinkResourceType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PrivateLinkResourceInnerTests {
    @Test
    public void testDeserialize() {
        PrivateLinkResourceInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"groupId\":\"zzewkfvhqcrai\",\"requiredMembers\":[\"n\",\"pfuflrw\"],\"requiredZoneNames\":[\"dlxyjrxs\",\"gafcnihgwqapnedg\",\"bcvkcvqvpkeq\",\"cvdrhvoodsot\"],\"shareablePrivateLinkResourceTypes\":[{\"name\":\"dopcjwvnh\"},{\"name\":\"wmgxcxrsl\"}]},\"id\":\"utwu\",\"name\":\"egrpkhj\",\"type\":\"niyqslui\"}")
                .toObject(PrivateLinkResourceInner.class);
        Assertions.assertEquals("zzewkfvhqcrai", model.groupId());
        Assertions.assertEquals("n", model.requiredMembers().get(0));
        Assertions.assertEquals("dlxyjrxs", model.requiredZoneNames().get(0));
        Assertions.assertEquals("dopcjwvnh", model.shareablePrivateLinkResourceTypes().get(0).name());
    }

    @Test
    public void testSerialize() {
        PrivateLinkResourceInner model =
            new PrivateLinkResourceInner()
                .withGroupId("zzewkfvhqcrai")
                .withRequiredMembers(Arrays.asList("n", "pfuflrw"))
                .withRequiredZoneNames(Arrays.asList("dlxyjrxs", "gafcnihgwqapnedg", "bcvkcvqvpkeq", "cvdrhvoodsot"))
                .withShareablePrivateLinkResourceTypes(
                    Arrays
                        .asList(
                            new ShareablePrivateLinkResourceType().withName("dopcjwvnh"),
                            new ShareablePrivateLinkResourceType().withName("wmgxcxrsl")));
        model = BinaryData.fromObject(model).toObject(PrivateLinkResourceInner.class);
        Assertions.assertEquals("zzewkfvhqcrai", model.groupId());
        Assertions.assertEquals("n", model.requiredMembers().get(0));
        Assertions.assertEquals("dlxyjrxs", model.requiredZoneNames().get(0));
        Assertions.assertEquals("dopcjwvnh", model.shareablePrivateLinkResourceTypes().get(0).name());
    }
}
