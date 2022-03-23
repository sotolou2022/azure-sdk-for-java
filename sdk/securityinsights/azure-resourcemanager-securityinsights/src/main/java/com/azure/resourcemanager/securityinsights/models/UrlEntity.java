// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.securityinsights.fluent.models.EntityInner;
import com.azure.resourcemanager.securityinsights.fluent.models.UrlEntityProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/** Represents a url entity. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("Url")
@Fluent
public final class UrlEntity extends EntityInner {
    /*
     * Url entity properties
     */
    @JsonProperty(value = "properties")
    private UrlEntityProperties innerProperties;

    /**
     * Get the innerProperties property: Url entity properties.
     *
     * @return the innerProperties value.
     */
    private UrlEntityProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the url property: A full URL the entity points to.
     *
     * @return the url value.
     */
    public String url() {
        return this.innerProperties() == null ? null : this.innerProperties().url();
    }

    /**
     * Get the additionalData property: A bag of custom fields that should be part of the entity and will be presented
     * to the user.
     *
     * @return the additionalData value.
     */
    public Map<String, Object> additionalData() {
        return this.innerProperties() == null ? null : this.innerProperties().additionalData();
    }

    /**
     * Get the friendlyName property: The graph item display name which is a short humanly readable description of the
     * graph item instance. This property is optional and might be system generated.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.innerProperties() == null ? null : this.innerProperties().friendlyName();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
