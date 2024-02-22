// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.StorageClassificationMappingInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.StorageClassificationMappingCollection;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.StorageClassificationMappingProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class StorageClassificationMappingCollectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StorageClassificationMappingCollection model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"targetStorageClassificationId\":\"mlnwiaaomylweazu\"},\"location\":\"sethwwn\",\"id\":\"jhlfzswpchwahf\",\"name\":\"ousnfepgfewe\",\"type\":\"wlyxgncxyk\"},{\"properties\":{\"targetStorageClassificationId\":\"jhlimmbcxfhbcpo\"},\"location\":\"vxcjzhqizxfpxtgq\",\"id\":\"cja\",\"name\":\"ftjuh\",\"type\":\"qaz\"}],\"nextLink\":\"tgguwpijrajcivmm\"}")
            .toObject(StorageClassificationMappingCollection.class);
        Assertions.assertEquals("mlnwiaaomylweazu", model.value().get(0).properties().targetStorageClassificationId());
        Assertions.assertEquals("sethwwn", model.value().get(0).location());
        Assertions.assertEquals("tgguwpijrajcivmm", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StorageClassificationMappingCollection model
            = new StorageClassificationMappingCollection()
                .withValue(
                    Arrays.asList(
                        new StorageClassificationMappingInner()
                            .withProperties(new StorageClassificationMappingProperties()
                                .withTargetStorageClassificationId("mlnwiaaomylweazu"))
                            .withLocation("sethwwn"),
                        new StorageClassificationMappingInner()
                            .withProperties(new StorageClassificationMappingProperties()
                                .withTargetStorageClassificationId("jhlimmbcxfhbcpo"))
                            .withLocation("vxcjzhqizxfpxtgq")))
                .withNextLink("tgguwpijrajcivmm");
        model = BinaryData.fromObject(model).toObject(StorageClassificationMappingCollection.class);
        Assertions.assertEquals("mlnwiaaomylweazu", model.value().get(0).properties().targetStorageClassificationId());
        Assertions.assertEquals("sethwwn", model.value().get(0).location());
        Assertions.assertEquals("tgguwpijrajcivmm", model.nextLink());
    }
}
