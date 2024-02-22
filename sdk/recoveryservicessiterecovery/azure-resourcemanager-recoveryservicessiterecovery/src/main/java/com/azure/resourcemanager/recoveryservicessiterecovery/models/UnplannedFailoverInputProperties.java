// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input definition for unplanned failover input properties.
 */
@Fluent
public final class UnplannedFailoverInputProperties {
    /*
     * Failover direction.
     */
    @JsonProperty(value = "failoverDirection")
    private String failoverDirection;

    /*
     * Source site operations status.
     */
    @JsonProperty(value = "sourceSiteOperations")
    private String sourceSiteOperations;

    /*
     * Provider specific settings.
     */
    @JsonProperty(value = "providerSpecificDetails")
    private UnplannedFailoverProviderSpecificInput providerSpecificDetails;

    /**
     * Creates an instance of UnplannedFailoverInputProperties class.
     */
    public UnplannedFailoverInputProperties() {
    }

    /**
     * Get the failoverDirection property: Failover direction.
     * 
     * @return the failoverDirection value.
     */
    public String failoverDirection() {
        return this.failoverDirection;
    }

    /**
     * Set the failoverDirection property: Failover direction.
     * 
     * @param failoverDirection the failoverDirection value to set.
     * @return the UnplannedFailoverInputProperties object itself.
     */
    public UnplannedFailoverInputProperties withFailoverDirection(String failoverDirection) {
        this.failoverDirection = failoverDirection;
        return this;
    }

    /**
     * Get the sourceSiteOperations property: Source site operations status.
     * 
     * @return the sourceSiteOperations value.
     */
    public String sourceSiteOperations() {
        return this.sourceSiteOperations;
    }

    /**
     * Set the sourceSiteOperations property: Source site operations status.
     * 
     * @param sourceSiteOperations the sourceSiteOperations value to set.
     * @return the UnplannedFailoverInputProperties object itself.
     */
    public UnplannedFailoverInputProperties withSourceSiteOperations(String sourceSiteOperations) {
        this.sourceSiteOperations = sourceSiteOperations;
        return this;
    }

    /**
     * Get the providerSpecificDetails property: Provider specific settings.
     * 
     * @return the providerSpecificDetails value.
     */
    public UnplannedFailoverProviderSpecificInput providerSpecificDetails() {
        return this.providerSpecificDetails;
    }

    /**
     * Set the providerSpecificDetails property: Provider specific settings.
     * 
     * @param providerSpecificDetails the providerSpecificDetails value to set.
     * @return the UnplannedFailoverInputProperties object itself.
     */
    public UnplannedFailoverInputProperties
        withProviderSpecificDetails(UnplannedFailoverProviderSpecificInput providerSpecificDetails) {
        this.providerSpecificDetails = providerSpecificDetails;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (providerSpecificDetails() != null) {
            providerSpecificDetails().validate();
        }
    }
}
