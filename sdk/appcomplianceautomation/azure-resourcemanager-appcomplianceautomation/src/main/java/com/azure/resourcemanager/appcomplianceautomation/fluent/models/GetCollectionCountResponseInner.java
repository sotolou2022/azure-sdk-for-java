// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The get collection count response.
 */
@Immutable
public final class GetCollectionCountResponseInner implements JsonSerializable<GetCollectionCountResponseInner> {
    /*
     * The count of the specified resource.
     */
    private Integer count;

    /**
     * Creates an instance of GetCollectionCountResponseInner class.
     */
    private GetCollectionCountResponseInner() {
    }

    /**
     * Get the count property: The count of the specified resource.
     * 
     * @return the count value.
     */
    public Integer count() {
        return this.count;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("count", this.count);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GetCollectionCountResponseInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GetCollectionCountResponseInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GetCollectionCountResponseInner.
     */
    public static GetCollectionCountResponseInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GetCollectionCountResponseInner deserializedGetCollectionCountResponseInner
                = new GetCollectionCountResponseInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("count".equals(fieldName)) {
                    deserializedGetCollectionCountResponseInner.count = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGetCollectionCountResponseInner;
        });
    }
}
