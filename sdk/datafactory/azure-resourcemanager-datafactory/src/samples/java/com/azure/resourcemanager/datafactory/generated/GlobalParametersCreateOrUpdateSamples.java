// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.resourcemanager.datafactory.models.GlobalParameterResource;
import com.azure.resourcemanager.datafactory.models.GlobalParameterSpecification;
import java.util.Map;

/**
 * Samples for GlobalParameters CreateOrUpdate.
 */
public final class GlobalParametersCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/datafactory/resource-manager/Microsoft.DataFactory/stable/2018-06-01/examples/GlobalParameters_Create.json
     */
    /**
     * Sample code: GlobalParameters_Create.
     * 
     * @param manager Entry point to DataFactoryManager.
     */
    public static void globalParametersCreate(com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        manager.globalParameters()
            .define("default")
            .withExistingFactory("exampleResourceGroup", "exampleFactoryName")
            .withProperties((Map<String, GlobalParameterSpecification>) null)
            .create();
    }

    /*
     * x-ms-original-file: specification/datafactory/resource-manager/Microsoft.DataFactory/stable/2018-06-01/examples/GlobalParameters_Update.json
     */
    /**
     * Sample code: GlobalParameters_Update.
     * 
     * @param manager Entry point to DataFactoryManager.
     */
    public static void globalParametersUpdate(com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        GlobalParameterResource resource = manager.globalParameters()
            .getWithResponse("exampleResourceGroup", "exampleFactoryName", "default", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().apply();
    }
}
