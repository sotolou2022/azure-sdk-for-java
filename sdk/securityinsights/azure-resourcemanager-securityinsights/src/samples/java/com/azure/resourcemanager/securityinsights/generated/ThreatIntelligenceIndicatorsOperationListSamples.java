// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.Context;

/** Samples for ThreatIntelligenceIndicatorsOperation List. */
public final class ThreatIntelligenceIndicatorsOperationListSamples {
    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-01-01-preview/examples/threatintelligence/GetThreatIntelligence.json
     */
    /**
     * Sample code: Get all threat intelligence indicators.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getAllThreatIntelligenceIndicators(
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager
            .threatIntelligenceIndicatorsOperations()
            .list("myRg", "myWorkspace", null, null, null, null, Context.NONE);
    }
}
