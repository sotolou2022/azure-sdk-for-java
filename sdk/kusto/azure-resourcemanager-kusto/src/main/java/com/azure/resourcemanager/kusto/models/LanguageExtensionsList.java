// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.kusto.fluent.models.LanguageExtensionInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list of language extension objects. */
@Fluent
public final class LanguageExtensionsList {
    /*
     * The list of language extensions.
     */
    @JsonProperty(value = "value")
    private List<LanguageExtensionInner> value;

    /** Creates an instance of LanguageExtensionsList class. */
    public LanguageExtensionsList() {
    }

    /**
     * Get the value property: The list of language extensions.
     *
     * @return the value value.
     */
    public List<LanguageExtensionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of language extensions.
     *
     * @param value the value value to set.
     * @return the LanguageExtensionsList object itself.
     */
    public LanguageExtensionsList withValue(List<LanguageExtensionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
