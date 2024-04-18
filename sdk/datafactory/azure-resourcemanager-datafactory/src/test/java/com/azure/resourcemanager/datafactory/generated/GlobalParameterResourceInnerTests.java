// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.GlobalParameterResourceInner;
import com.azure.resourcemanager.datafactory.models.GlobalParameterSpecification;
import com.azure.resourcemanager.datafactory.models.GlobalParameterType;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class GlobalParameterResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GlobalParameterResourceInner model = BinaryData.fromString(
            "{\"properties\":{\"vjhvefgwbm\":{\"type\":\"Bool\",\"value\":\"dataoeoq\"}},\"name\":\"c\",\"type\":\"tasfaymxbulpzeal\",\"etag\":\"qkyojwyvf\",\"id\":\"btsuahxs\"}")
            .toObject(GlobalParameterResourceInner.class);
        Assertions.assertEquals("btsuahxs", model.id());
        Assertions.assertEquals(GlobalParameterType.BOOL, model.properties().get("vjhvefgwbm").type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GlobalParameterResourceInner model = new GlobalParameterResourceInner().withId("btsuahxs")
            .withProperties(mapOf("vjhvefgwbm",
                new GlobalParameterSpecification().withType(GlobalParameterType.BOOL).withValue("dataoeoq")));
        model = BinaryData.fromObject(model).toObject(GlobalParameterResourceInner.class);
        Assertions.assertEquals("btsuahxs", model.id());
        Assertions.assertEquals(GlobalParameterType.BOOL, model.properties().get("vjhvefgwbm").type());
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
