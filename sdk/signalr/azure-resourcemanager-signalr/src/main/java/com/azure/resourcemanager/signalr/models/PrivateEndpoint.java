// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Private endpoint. */
@Fluent
public final class PrivateEndpoint {
    /*
     * Full qualified Id of the private endpoint
     */
    @JsonProperty(value = "id")
    private String id;

    /** Creates an instance of PrivateEndpoint class. */
    public PrivateEndpoint() {
    }

    /**
     * Get the id property: Full qualified Id of the private endpoint.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Full qualified Id of the private endpoint.
     *
     * @param id the id value to set.
     * @return the PrivateEndpoint object itself.
     */
    public PrivateEndpoint withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
