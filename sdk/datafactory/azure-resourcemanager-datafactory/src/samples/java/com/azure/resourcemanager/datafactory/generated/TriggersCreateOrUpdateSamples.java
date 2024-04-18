// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.datafactory.models.PipelineReference;
import com.azure.resourcemanager.datafactory.models.RecurrenceFrequency;
import com.azure.resourcemanager.datafactory.models.ScheduleTrigger;
import com.azure.resourcemanager.datafactory.models.ScheduleTriggerRecurrence;
import com.azure.resourcemanager.datafactory.models.TriggerPipelineReference;
import com.azure.resourcemanager.datafactory.models.TriggerResource;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Triggers CreateOrUpdate.
 */
public final class TriggersCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/datafactory/resource-manager/Microsoft.DataFactory/stable/2018-06-01/examples/Triggers_Create.json
     */
    /**
     * Sample code: Triggers_Create.
     * 
     * @param manager Entry point to DataFactoryManager.
     */
    public static void triggersCreate(com.azure.resourcemanager.datafactory.DataFactoryManager manager)
        throws IOException {
        manager.triggers()
            .define("exampleTrigger")
            .withExistingFactory("exampleResourceGroup", "exampleFactoryName")
            .withProperties(new ScheduleTrigger()
                .withPipelines(Arrays.asList(new TriggerPipelineReference()
                    .withPipelineReference(new PipelineReference().withReferenceName("examplePipeline"))
                    .withParameters(mapOf("OutputBlobNameList",
                        SerializerFactory.createDefaultManagementSerializerAdapter()
                            .deserialize("[\"exampleoutput.csv\"]", Object.class, SerializerEncoding.JSON)))))
                .withRecurrence(new ScheduleTriggerRecurrence().withFrequency(RecurrenceFrequency.MINUTE)
                    .withInterval(4)
                    .withStartTime(OffsetDateTime.parse("2018-06-16T00:39:13.8441801Z"))
                    .withEndTime(OffsetDateTime.parse("2018-06-16T00:55:13.8441801Z"))
                    .withTimeZone("UTC")
                    .withAdditionalProperties(mapOf())))
            .create();
    }

    /*
     * x-ms-original-file: specification/datafactory/resource-manager/Microsoft.DataFactory/stable/2018-06-01/examples/Triggers_Update.json
     */
    /**
     * Sample code: Triggers_Update.
     * 
     * @param manager Entry point to DataFactoryManager.
     */
    public static void triggersUpdate(com.azure.resourcemanager.datafactory.DataFactoryManager manager)
        throws IOException {
        TriggerResource resource = manager.triggers()
            .getWithResponse("exampleResourceGroup", "exampleFactoryName", "exampleTrigger", null,
                com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withProperties(new ScheduleTrigger().withDescription("Example description")
                .withPipelines(Arrays.asList(new TriggerPipelineReference()
                    .withPipelineReference(new PipelineReference().withReferenceName("examplePipeline"))
                    .withParameters(mapOf("OutputBlobNameList",
                        SerializerFactory.createDefaultManagementSerializerAdapter()
                            .deserialize("[\"exampleoutput.csv\"]", Object.class, SerializerEncoding.JSON)))))
                .withRecurrence(new ScheduleTriggerRecurrence().withFrequency(RecurrenceFrequency.MINUTE)
                    .withInterval(4)
                    .withStartTime(OffsetDateTime.parse("2018-06-16T00:39:14.905167Z"))
                    .withEndTime(OffsetDateTime.parse("2018-06-16T00:55:14.905167Z"))
                    .withTimeZone("UTC")
                    .withAdditionalProperties(mapOf())))
            .apply();
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
