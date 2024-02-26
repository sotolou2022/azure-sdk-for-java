// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloadssapvirtualinstance.generated;

import com.azure.resourcemanager.workloadssapvirtualinstance.models.SapAvailabilityZoneDetailsRequest;
import com.azure.resourcemanager.workloadssapvirtualinstance.models.SapDatabaseType;
import com.azure.resourcemanager.workloadssapvirtualinstance.models.SapProductType;

/**
 * Samples for ResourceProvider SapAvailabilityZoneDetails.
 */
public final class ResourceProviderSapAvailabilityZoneDetailsSamples {
    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/
     * examples/sapvirtualinstances/SAPAvailabilityZoneDetails_northeurope.json
     */
    /**
     * Sample code: SAPAvailabilityZoneDetails_northeurope.
     * 
     * @param manager Entry point to WorkloadsSapVirtualInstanceManager.
     */
    public static void sAPAvailabilityZoneDetailsNortheurope(
        com.azure.resourcemanager.workloadssapvirtualinstance.WorkloadsSapVirtualInstanceManager manager) {
        manager.resourceProviders().sapAvailabilityZoneDetailsWithResponse(
            "centralus", new SapAvailabilityZoneDetailsRequest().withAppLocation("northeurope")
                .withSapProduct(SapProductType.S4HANA).withDatabaseType(SapDatabaseType.HANA),
            com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/SAPVirtualInstance/preview/2023-10-01-preview/
     * examples/sapvirtualinstances/SAPAvailabilityZoneDetails_eastus.json
     */
    /**
     * Sample code: SAPAvailabilityZoneDetails_eastus.
     * 
     * @param manager Entry point to WorkloadsSapVirtualInstanceManager.
     */
    public static void sAPAvailabilityZoneDetailsEastus(
        com.azure.resourcemanager.workloadssapvirtualinstance.WorkloadsSapVirtualInstanceManager manager) {
        manager.resourceProviders().sapAvailabilityZoneDetailsWithResponse(
            "centralus", new SapAvailabilityZoneDetailsRequest().withAppLocation("eastus")
                .withSapProduct(SapProductType.S4HANA).withDatabaseType(SapDatabaseType.HANA),
            com.azure.core.util.Context.NONE);
    }
}
