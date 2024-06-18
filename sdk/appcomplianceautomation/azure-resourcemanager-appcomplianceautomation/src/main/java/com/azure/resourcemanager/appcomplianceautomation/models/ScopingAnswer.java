// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Scoping answer.
 */
@Fluent
public final class ScopingAnswer implements JsonSerializable<ScopingAnswer> {
    /*
     * Question id.
     */
    private String questionId;

    /*
     * Question answer value list.
     */
    private List<String> answers;

    /**
     * Creates an instance of ScopingAnswer class.
     */
    public ScopingAnswer() {
    }

    /**
     * Get the questionId property: Question id.
     * 
     * @return the questionId value.
     */
    public String questionId() {
        return this.questionId;
    }

    /**
     * Set the questionId property: Question id.
     * 
     * @param questionId the questionId value to set.
     * @return the ScopingAnswer object itself.
     */
    public ScopingAnswer withQuestionId(String questionId) {
        this.questionId = questionId;
        return this;
    }

    /**
     * Get the answers property: Question answer value list.
     * 
     * @return the answers value.
     */
    public List<String> answers() {
        return this.answers;
    }

    /**
     * Set the answers property: Question answer value list.
     * 
     * @param answers the answers value to set.
     * @return the ScopingAnswer object itself.
     */
    public ScopingAnswer withAnswers(List<String> answers) {
        this.answers = answers;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (questionId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property questionId in model ScopingAnswer"));
        }
        if (answers() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property answers in model ScopingAnswer"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ScopingAnswer.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("questionId", this.questionId);
        jsonWriter.writeArrayField("answers", this.answers, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ScopingAnswer from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ScopingAnswer if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ScopingAnswer.
     */
    public static ScopingAnswer fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ScopingAnswer deserializedScopingAnswer = new ScopingAnswer();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("questionId".equals(fieldName)) {
                    deserializedScopingAnswer.questionId = reader.getString();
                } else if ("answers".equals(fieldName)) {
                    List<String> answers = reader.readArray(reader1 -> reader1.getString());
                    deserializedScopingAnswer.answers = answers;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedScopingAnswer;
        });
    }
}
