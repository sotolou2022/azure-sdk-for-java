// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datafactory.models.ScriptActivityScriptBlock;
import com.azure.resourcemanager.datafactory.models.ScriptActivityTypePropertiesLogSettings;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Script activity properties.
 */
@Fluent
public final class ScriptActivityTypeProperties {
    /*
     * ScriptBlock execution timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     */
    @JsonProperty(value = "scriptBlockExecutionTimeout")
    private Object scriptBlockExecutionTimeout;

    /*
     * Array of script blocks. Type: array.
     */
    @JsonProperty(value = "scripts")
    private List<ScriptActivityScriptBlock> scripts;

    /*
     * Log settings of script activity.
     */
    @JsonProperty(value = "logSettings")
    private ScriptActivityTypePropertiesLogSettings logSettings;

    /**
     * Creates an instance of ScriptActivityTypeProperties class.
     */
    public ScriptActivityTypeProperties() {
    }

    /**
     * Get the scriptBlockExecutionTimeout property: ScriptBlock execution timeout. Type: string (or Expression with
     * resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     * @return the scriptBlockExecutionTimeout value.
     */
    public Object scriptBlockExecutionTimeout() {
        return this.scriptBlockExecutionTimeout;
    }

    /**
     * Set the scriptBlockExecutionTimeout property: ScriptBlock execution timeout. Type: string (or Expression with
     * resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     * @param scriptBlockExecutionTimeout the scriptBlockExecutionTimeout value to set.
     * @return the ScriptActivityTypeProperties object itself.
     */
    public ScriptActivityTypeProperties withScriptBlockExecutionTimeout(Object scriptBlockExecutionTimeout) {
        this.scriptBlockExecutionTimeout = scriptBlockExecutionTimeout;
        return this;
    }

    /**
     * Get the scripts property: Array of script blocks. Type: array.
     * 
     * @return the scripts value.
     */
    public List<ScriptActivityScriptBlock> scripts() {
        return this.scripts;
    }

    /**
     * Set the scripts property: Array of script blocks. Type: array.
     * 
     * @param scripts the scripts value to set.
     * @return the ScriptActivityTypeProperties object itself.
     */
    public ScriptActivityTypeProperties withScripts(List<ScriptActivityScriptBlock> scripts) {
        this.scripts = scripts;
        return this;
    }

    /**
     * Get the logSettings property: Log settings of script activity.
     * 
     * @return the logSettings value.
     */
    public ScriptActivityTypePropertiesLogSettings logSettings() {
        return this.logSettings;
    }

    /**
     * Set the logSettings property: Log settings of script activity.
     * 
     * @param logSettings the logSettings value to set.
     * @return the ScriptActivityTypeProperties object itself.
     */
    public ScriptActivityTypeProperties withLogSettings(ScriptActivityTypePropertiesLogSettings logSettings) {
        this.logSettings = logSettings;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (scripts() != null) {
            scripts().forEach(e -> e.validate());
        }
        if (logSettings() != null) {
            logSettings().validate();
        }
    }
}
