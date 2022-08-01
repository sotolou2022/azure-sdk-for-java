// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.email.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for EmailImportance. */
public final class EmailImportance extends ExpandableStringEnum<EmailImportance> {
    /** Static value high for EmailImportance. */
    public static final EmailImportance HIGH = fromString("high");

    /** Static value normal for EmailImportance. */
    public static final EmailImportance NORMAL = fromString("normal");

    /** Static value low for EmailImportance. */
    public static final EmailImportance LOW = fromString("low");

    /**
     * Creates or finds a EmailImportance from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EmailImportance.
     */
    @JsonCreator
    public static EmailImportance fromString(String name) {
        return fromString(name, EmailImportance.class);
    }

    /**
     * Gets known EmailImportance values.
     *
     * @return known EmailImportance values.
     */
    public static Collection<EmailImportance> values() {
        return values(EmailImportance.class);
    }
}