// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureFileStorageReadSettings;

public final class AzureFileStorageReadSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureFileStorageReadSettings model = BinaryData.fromString(
            "{\"type\":\"oyusrbuydeyh\",\"recursive\":\"datalkpvaagrdf\",\"wildcardFolderPath\":\"dataglqdsphvosucryh\",\"wildcardFileName\":\"datahthzfotfrfhrjkah\",\"prefix\":\"datafshgmqxwoppn\",\"fileListPath\":\"datarmzv\",\"enablePartitionDiscovery\":\"datafkznyait\",\"partitionRootPath\":\"datamobrxhwpg\",\"deleteFilesAfterCompletion\":\"datanxrjmilogcnzfg\",\"modifiedDatetimeStart\":\"databbtplrtxhzt\",\"modifiedDatetimeEnd\":\"datawyrsfj\",\"maxConcurrentConnections\":\"datattkdrblehenj\",\"disableMetricsCollection\":\"dataiwdeosbijikjf\",\"\":{\"avfjx\":\"datauwhbpojujpifxtgr\",\"lauhr\":\"dataiwx\",\"r\":\"datachphovu\"}}")
            .toObject(AzureFileStorageReadSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureFileStorageReadSettings model
            = new AzureFileStorageReadSettings().withMaxConcurrentConnections("datattkdrblehenj")
                .withDisableMetricsCollection("dataiwdeosbijikjf")
                .withRecursive("datalkpvaagrdf")
                .withWildcardFolderPath("dataglqdsphvosucryh")
                .withWildcardFileName("datahthzfotfrfhrjkah")
                .withPrefix("datafshgmqxwoppn")
                .withFileListPath("datarmzv")
                .withEnablePartitionDiscovery("datafkznyait")
                .withPartitionRootPath("datamobrxhwpg")
                .withDeleteFilesAfterCompletion("datanxrjmilogcnzfg")
                .withModifiedDatetimeStart("databbtplrtxhzt")
                .withModifiedDatetimeEnd("datawyrsfj");
        model = BinaryData.fromObject(model).toObject(AzureFileStorageReadSettings.class);
    }
}
