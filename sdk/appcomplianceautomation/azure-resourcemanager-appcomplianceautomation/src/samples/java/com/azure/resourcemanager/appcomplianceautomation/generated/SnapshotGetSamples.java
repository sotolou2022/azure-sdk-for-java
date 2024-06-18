// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.generated;

/**
 * Samples for Snapshot Get.
 */
public final class SnapshotGetSamples {
    /*
     * x-ms-original-file:
     * specification/appcomplianceautomation/AppComplianceAutomation.Management/examples/2024-06-27/Snapshot_Get.json
     */
    /**
     * Sample code: Snapshot_Get.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void
        snapshotGet(com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.snapshots().getWithResponse("testReportName", "testSnapshot", com.azure.core.util.Context.NONE);
    }
}
