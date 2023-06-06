// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Representation of the response data from a chat completions request. Completions support a wide variety of tasks and
 * generate text that continues from or "completes" provided prompt data.
 */
@Immutable
public final class ChatCompletions {
    /*
     * A unique identifier associated with this chat completions response.
     */
    @Generated
    @JsonProperty(value = "id")
    private String id;

    /*
     * The first timestamp associated with generation activity for this completions response,
     * represented as seconds since the beginning of the Unix epoch of 00:00 on 1 Jan 1970.
     */
    @Generated
    @JsonProperty(value = "created")
    private int created;

    /*
     * The collection of completions choices associated with this completions response.
     * Generally, `n` choices are generated per provided prompt with a default value of 1.
     * Token limits and other settings may limit the number of choices generated.
     */
    @Generated
    @JsonProperty(value = "choices")
    private List<ChatChoice> choices;

    /*
     * Usage information for tokens processed and generated as part of this completions operation.
     */
    @Generated
    @JsonProperty(value = "usage")
    private CompletionsUsage usage;

    /**
     * Creates an instance of ChatCompletions class.
     *
     * @param id the id value to set.
     * @param created the created value to set.
     * @param choices the choices value to set.
     * @param usage the usage value to set.
     */
    @Generated
    @JsonCreator
    private ChatCompletions(
            @JsonProperty(value = "id") String id,
            @JsonProperty(value = "created") int created,
            @JsonProperty(value = "choices") List<ChatChoice> choices,
            @JsonProperty(value = "usage") CompletionsUsage usage) {
        this.id = id;
        this.created = created;
        this.choices = choices;
        this.usage = usage;
    }

    /**
     * Get the id property: A unique identifier associated with this chat completions response.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the created property: The first timestamp associated with generation activity for this completions response,
     * represented as seconds since the beginning of the Unix epoch of 00:00 on 1 Jan 1970.
     *
     * @return the created value.
     */
    @Generated
    public int getCreated() {
        return this.created;
    }

    /**
     * Get the choices property: The collection of completions choices associated with this completions response.
     * Generally, `n` choices are generated per provided prompt with a default value of 1. Token limits and other
     * settings may limit the number of choices generated.
     *
     * @return the choices value.
     */
    @Generated
    public List<ChatChoice> getChoices() {
        return this.choices;
    }

    /**
     * Get the usage property: Usage information for tokens processed and generated as part of this completions
     * operation.
     *
     * @return the usage value.
     */
    @Generated
    public CompletionsUsage getUsage() {
        return this.usage;
    }
}
