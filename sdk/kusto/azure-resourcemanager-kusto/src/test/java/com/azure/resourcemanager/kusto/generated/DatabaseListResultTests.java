// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.DatabaseInner;
import com.azure.resourcemanager.kusto.models.DatabaseListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DatabaseListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DatabaseListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"kind\":\"Database\",\"location\":\"s\",\"id\":\"bpg\",\"name\":\"xytxhpzxbz\",\"type\":\"fzab\"}]}")
                .toObject(DatabaseListResult.class);
        Assertions.assertEquals("s", model.value().get(0).location());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DatabaseListResult model =
            new DatabaseListResult().withValue(Arrays.asList(new DatabaseInner().withLocation("s")));
        model = BinaryData.fromObject(model).toObject(DatabaseListResult.class);
        Assertions.assertEquals("s", model.value().get(0).location());
    }
}
