// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.openai.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The configuration information for an embeddings request. Embeddings measure the relatedness of text strings and are
 * commonly used for search, clustering, recommendations, and other similar scenarios.
 */
@Fluent
public final class EmbeddingsOptions {
    /*
     * An identifier for the caller or end user of the operation. This may be used for tracking
     * or rate-limiting purposes.
     */
    @Generated
    @JsonProperty(value = "user")
    private String user;

    /*
     * The model name to provide as part of this embeddings request.
     * Not applicable to Azure OpenAI, where deployment information should be included in the Azure
     * resource URI that's connected to.
     */
    @Generated
    @JsonProperty(value = "model")
    private String model;

    /*
     * Input texts to get embeddings for, encoded as a an array of strings.
     * Each input must not exceed 2048 tokens in length.
     *
     * Unless you are embedding code, we suggest replacing newlines (\n) in your input with a single space,
     * as we have observed inferior results when newlines are present.
     */
    @Generated
    @JsonProperty(value = "input")
    private List<String> input;

    /**
     * Creates an instance of EmbeddingsOptions class.
     *
     * @param input the input value to set.
     */
    @Generated
    @JsonCreator
    public EmbeddingsOptions(@JsonProperty(value = "input") List<String> input) {
        this.input = input;
    }

    /**
     * Get the user property: An identifier for the caller or end user of the operation. This may be used for tracking
     * or rate-limiting purposes.
     *
     * @return the user value.
     */
    @Generated
    public String getUser() {
        return this.user;
    }

    /**
     * Set the user property: An identifier for the caller or end user of the operation. This may be used for tracking
     * or rate-limiting purposes.
     *
     * @param user the user value to set.
     * @return the EmbeddingsOptions object itself.
     */
    @Generated
    public EmbeddingsOptions setUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * Get the model property: The model name to provide as part of this embeddings request. Not applicable to Azure
     * OpenAI, where deployment information should be included in the Azure resource URI that's connected to.
     *
     * @return the model value.
     */
    @Generated
    public String getModel() {
        return this.model;
    }

    /**
     * Set the model property: The model name to provide as part of this embeddings request. Not applicable to Azure
     * OpenAI, where deployment information should be included in the Azure resource URI that's connected to.
     *
     * @param model the model value to set.
     * @return the EmbeddingsOptions object itself.
     */
    @Generated
    public EmbeddingsOptions setModel(String model) {
        this.model = model;
        return this;
    }

    /**
     * Get the input property: Input texts to get embeddings for, encoded as a an array of strings. Each input must not
     * exceed 2048 tokens in length.
     *
     * <p>Unless you are embedding code, we suggest replacing newlines (\n) in your input with a single space, as we
     * have observed inferior results when newlines are present.
     *
     * @return the input value.
     */
    @Generated
    public List<String> getInput() {
        return this.input;
    }
}
