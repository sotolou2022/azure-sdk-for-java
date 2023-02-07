// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.workloads.models.SapDiskConfiguration;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The list of disk configuration for vmSku which are part of SAP deployment. */
@Fluent
public final class SapDiskConfigurationsResultInner {
    /*
     * The disk configuration for the db volume. For HANA, Required volumes are: ['hana/data', 'hana/log',
     * hana/shared', 'usr/sap', 'os'], Optional volume : ['backup'].
     */
    @JsonProperty(value = "volumeConfigurations")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, SapDiskConfiguration> volumeConfigurations;

    /** Creates an instance of SapDiskConfigurationsResultInner class. */
    public SapDiskConfigurationsResultInner() {
    }

    /**
     * Get the volumeConfigurations property: The disk configuration for the db volume. For HANA, Required volumes are:
     * ['hana/data', 'hana/log', hana/shared', 'usr/sap', 'os'], Optional volume : ['backup'].
     *
     * @return the volumeConfigurations value.
     */
    public Map<String, SapDiskConfiguration> volumeConfigurations() {
        return this.volumeConfigurations;
    }

    /**
     * Set the volumeConfigurations property: The disk configuration for the db volume. For HANA, Required volumes are:
     * ['hana/data', 'hana/log', hana/shared', 'usr/sap', 'os'], Optional volume : ['backup'].
     *
     * @param volumeConfigurations the volumeConfigurations value to set.
     * @return the SapDiskConfigurationsResultInner object itself.
     */
    public SapDiskConfigurationsResultInner withVolumeConfigurations(
        Map<String, SapDiskConfiguration> volumeConfigurations) {
        this.volumeConfigurations = volumeConfigurations;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (volumeConfigurations() != null) {
            volumeConfigurations()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }
}
