// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Indicates the customer responsibility type.
 */
public final class ResponsibilityType extends ExpandableStringEnum<ResponsibilityType> {
    /**
     * Static value Automated for ResponsibilityType.
     */
    public static final ResponsibilityType AUTOMATED = fromString("Automated");

    /**
     * Static value ScopedManual for ResponsibilityType.
     */
    public static final ResponsibilityType SCOPED_MANUAL = fromString("ScopedManual");

    /**
     * Static value Manual for ResponsibilityType.
     */
    public static final ResponsibilityType MANUAL = fromString("Manual");

    /**
     * Creates a new instance of ResponsibilityType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ResponsibilityType() {
    }

    /**
     * Creates or finds a ResponsibilityType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ResponsibilityType.
     */
    public static ResponsibilityType fromString(String name) {
        return fromString(name, ResponsibilityType.class);
    }

    /**
     * Gets known ResponsibilityType values.
     * 
     * @return known ResponsibilityType values.
     */
    public static Collection<ResponsibilityType> values() {
        return values(ResponsibilityType.class);
    }
}
