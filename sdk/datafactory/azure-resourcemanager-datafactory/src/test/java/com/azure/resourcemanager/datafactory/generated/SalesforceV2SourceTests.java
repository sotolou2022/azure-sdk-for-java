// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SalesforceV2Source;

public final class SalesforceV2SourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SalesforceV2Source model = BinaryData.fromString(
            "{\"type\":\"riviftjjmtk\",\"SOQLQuery\":\"datagxxmxdrgxhrta\",\"includeDeletedObjects\":\"datajboiyqixb\",\"queryTimeout\":\"datafw\",\"additionalColumns\":\"dataqj\",\"sourceRetryCount\":\"datadgfjvit\",\"sourceRetryWait\":\"dataa\",\"maxConcurrentConnections\":\"dataesxn\",\"disableMetricsCollection\":\"dataslhncaspwvgl\",\"\":{\"qhatwxq\":\"datan\",\"aicyuplmdhuu\":\"dataggbirzj\",\"tjqjtoeaug\":\"datatiecnpka\"}}")
            .toObject(SalesforceV2Source.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SalesforceV2Source model = new SalesforceV2Source().withSourceRetryCount("datadgfjvit")
            .withSourceRetryWait("dataa")
            .withMaxConcurrentConnections("dataesxn")
            .withDisableMetricsCollection("dataslhncaspwvgl")
            .withQueryTimeout("datafw")
            .withAdditionalColumns("dataqj")
            .withSoqlQuery("datagxxmxdrgxhrta")
            .withIncludeDeletedObjects("datajboiyqixb");
        model = BinaryData.fromObject(model).toObject(SalesforceV2Source.class);
    }
}
