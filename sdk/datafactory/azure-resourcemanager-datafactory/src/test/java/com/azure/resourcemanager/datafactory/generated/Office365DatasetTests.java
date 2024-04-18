// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.Office365Dataset;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class Office365DatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Office365Dataset model = BinaryData.fromString(
            "{\"type\":\"uqmtxynof\",\"typeProperties\":{\"tableName\":\"datarnicupdyttqmi\",\"predicate\":\"datajplosebmh\"},\"description\":\"obfixngxebi\",\"structure\":\"dataxhnkingiqcd\",\"schema\":\"datarpgupsjlbsmnda\",\"linkedServiceName\":{\"referenceName\":\"bncuyjeykcnhp\",\"parameters\":{\"xjziuucrlnew\":\"datahcf\",\"zlvwyw\":\"datauwkkfzzetlvhdy\",\"lgqpwwlzpd\":\"datav\",\"knmstbdoprwkamp\":\"dataarcbcdwhslxebaja\"}},\"parameters\":{\"huzymhlhihqk\":{\"type\":\"Float\",\"defaultValue\":\"dataldzniudrcycm\"},\"aiildcpud\":{\"type\":\"Array\",\"defaultValue\":\"datakmnbzko\"}},\"annotations\":[\"datauxsyjofpgved\",\"dataobujnjgyb\",\"dataxmqxigidullnjgc\"],\"folder\":{\"name\":\"grh\"},\"\":{\"n\":\"dataslgsazuq\",\"zj\":\"datahxhky\",\"ffxsfybntmveh\":\"datadkpvnrvzw\",\"zqweuyd\":\"datahflyuvbgtz\"}}")
            .toObject(Office365Dataset.class);
        Assertions.assertEquals("obfixngxebi", model.description());
        Assertions.assertEquals("bncuyjeykcnhp", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("huzymhlhihqk").type());
        Assertions.assertEquals("grh", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Office365Dataset model = new Office365Dataset().withDescription("obfixngxebi")
            .withStructure("dataxhnkingiqcd")
            .withSchema("datarpgupsjlbsmnda")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("bncuyjeykcnhp")
                .withParameters(mapOf("xjziuucrlnew", "datahcf", "zlvwyw", "datauwkkfzzetlvhdy", "lgqpwwlzpd", "datav",
                    "knmstbdoprwkamp", "dataarcbcdwhslxebaja")))
            .withParameters(mapOf("huzymhlhihqk",
                new ParameterSpecification().withType(ParameterType.FLOAT).withDefaultValue("dataldzniudrcycm"),
                "aiildcpud",
                new ParameterSpecification().withType(ParameterType.ARRAY).withDefaultValue("datakmnbzko")))
            .withAnnotations(Arrays.asList("datauxsyjofpgved", "dataobujnjgyb", "dataxmqxigidullnjgc"))
            .withFolder(new DatasetFolder().withName("grh"))
            .withTableName("datarnicupdyttqmi")
            .withPredicate("datajplosebmh");
        model = BinaryData.fromObject(model).toObject(Office365Dataset.class);
        Assertions.assertEquals("obfixngxebi", model.description());
        Assertions.assertEquals("bncuyjeykcnhp", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("huzymhlhihqk").type());
        Assertions.assertEquals("grh", model.folder().name());
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
