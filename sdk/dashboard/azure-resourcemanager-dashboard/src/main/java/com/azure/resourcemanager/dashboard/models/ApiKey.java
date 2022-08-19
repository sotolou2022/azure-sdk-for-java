// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dashboard.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ApiKey. */
public final class ApiKey extends ExpandableStringEnum<ApiKey> {
    /** Static value Disabled for ApiKey. */
    public static final ApiKey DISABLED = fromString("Disabled");

    /** Static value Enabled for ApiKey. */
    public static final ApiKey ENABLED = fromString("Enabled");

    /**
     * Creates or finds a ApiKey from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ApiKey.
     */
    @JsonCreator
    public static ApiKey fromString(String name) {
        return fromString(name, ApiKey.class);
    }

    /**
     * Gets known ApiKey values.
     *
     * @return known ApiKey values.
     */
    public static Collection<ApiKey> values() {
        return values(ApiKey.class);
    }
}