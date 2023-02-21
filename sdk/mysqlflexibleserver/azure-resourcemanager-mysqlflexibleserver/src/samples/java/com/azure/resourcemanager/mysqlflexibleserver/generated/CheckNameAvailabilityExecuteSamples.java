// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.resourcemanager.mysqlflexibleserver.models.NameAvailabilityRequest;

/** Samples for CheckNameAvailability Execute. */
public final class CheckNameAvailabilityExecuteSamples {
    /*
     * x-ms-original-file: specification/mysql/resource-manager/Microsoft.DBforMySQL/preview/2021-12-01-preview/examples/CheckNameAvailability.json
     */
    /**
     * Sample code: Check name availability.
     *
     * @param manager Entry point to MySqlManager.
     */
    public static void checkNameAvailability(com.azure.resourcemanager.mysqlflexibleserver.MySqlManager manager) {
        manager
            .checkNameAvailabilities()
            .executeWithResponse(
                "SouthEastAsia",
                new NameAvailabilityRequest().withName("name1").withType("Microsoft.DBforMySQL/flexibleServers"),
                com.azure.core.util.Context.NONE);
    }
}
