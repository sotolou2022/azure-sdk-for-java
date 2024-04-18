// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.BlobTriggerTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Trigger that runs every time the selected Blob container changes.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", defaultImpl = BlobTrigger.class, visible = true)
@JsonTypeName("BlobTrigger")
@Fluent
public final class BlobTrigger extends MultiplePipelineTrigger {
    /*
     * Trigger type.
     */
    @JsonTypeId
    @JsonProperty(value = "type", required = true)
    private String type = "BlobTrigger";

    /*
     * Blob Trigger properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private BlobTriggerTypeProperties innerTypeProperties = new BlobTriggerTypeProperties();

    /**
     * Creates an instance of BlobTrigger class.
     */
    public BlobTrigger() {
    }

    /**
     * Get the type property: Trigger type.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the innerTypeProperties property: Blob Trigger properties.
     * 
     * @return the innerTypeProperties value.
     */
    private BlobTriggerTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlobTrigger withPipelines(List<TriggerPipelineReference> pipelines) {
        super.withPipelines(pipelines);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlobTrigger withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlobTrigger withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the folderPath property: The path of the container/folder that will trigger the pipeline.
     * 
     * @return the folderPath value.
     */
    public String folderPath() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().folderPath();
    }

    /**
     * Set the folderPath property: The path of the container/folder that will trigger the pipeline.
     * 
     * @param folderPath the folderPath value to set.
     * @return the BlobTrigger object itself.
     */
    public BlobTrigger withFolderPath(String folderPath) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new BlobTriggerTypeProperties();
        }
        this.innerTypeProperties().withFolderPath(folderPath);
        return this;
    }

    /**
     * Get the maxConcurrency property: The max number of parallel files to handle when it is triggered.
     * 
     * @return the maxConcurrency value.
     */
    public int maxConcurrency() {
        return this.innerTypeProperties() == null ? 0 : this.innerTypeProperties().maxConcurrency();
    }

    /**
     * Set the maxConcurrency property: The max number of parallel files to handle when it is triggered.
     * 
     * @param maxConcurrency the maxConcurrency value to set.
     * @return the BlobTrigger object itself.
     */
    public BlobTrigger withMaxConcurrency(int maxConcurrency) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new BlobTriggerTypeProperties();
        }
        this.innerTypeProperties().withMaxConcurrency(maxConcurrency);
        return this;
    }

    /**
     * Get the linkedService property: The Azure Storage linked service reference.
     * 
     * @return the linkedService value.
     */
    public LinkedServiceReference linkedService() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().linkedService();
    }

    /**
     * Set the linkedService property: The Azure Storage linked service reference.
     * 
     * @param linkedService the linkedService value to set.
     * @return the BlobTrigger object itself.
     */
    public BlobTrigger withLinkedService(LinkedServiceReference linkedService) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new BlobTriggerTypeProperties();
        }
        this.innerTypeProperties().withLinkedService(linkedService);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() == null) {
            throw LOGGER.atError()
                .log(
                    new IllegalArgumentException("Missing required property innerTypeProperties in model BlobTrigger"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(BlobTrigger.class);
}
