// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Recovery plan planned failover input.
 */
@Fluent
public final class RecoveryPlanPlannedFailoverInput {
    /*
     * The recovery plan planned failover input properties.
     */
    @JsonProperty(value = "properties", required = true)
    private RecoveryPlanPlannedFailoverInputProperties properties;

    /**
     * Creates an instance of RecoveryPlanPlannedFailoverInput class.
     */
    public RecoveryPlanPlannedFailoverInput() {
    }

    /**
     * Get the properties property: The recovery plan planned failover input properties.
     * 
     * @return the properties value.
     */
    public RecoveryPlanPlannedFailoverInputProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The recovery plan planned failover input properties.
     * 
     * @param properties the properties value to set.
     * @return the RecoveryPlanPlannedFailoverInput object itself.
     */
    public RecoveryPlanPlannedFailoverInput withProperties(RecoveryPlanPlannedFailoverInputProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property properties in model RecoveryPlanPlannedFailoverInput"));
        } else {
            properties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RecoveryPlanPlannedFailoverInput.class);
}
