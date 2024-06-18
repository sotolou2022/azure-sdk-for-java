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

/**
 * Evidence's properties.
 */
@Fluent
public final class EvidenceProperties implements JsonSerializable<EvidenceProperties> {
    /*
     * Evidence type.
     */
    private EvidenceType evidenceType;

    /*
     * The path of the file in storage.
     */
    private String filePath;

    /*
     * Extra data considered as evidence.
     */
    private String extraData;

    /*
     * Control id.
     */
    private String controlId;

    /*
     * Responsibility id.
     */
    private String responsibilityId;

    /*
     * Azure lifecycle management
     */
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of EvidenceProperties class.
     */
    public EvidenceProperties() {
    }

    /**
     * Get the evidenceType property: Evidence type.
     * 
     * @return the evidenceType value.
     */
    public EvidenceType evidenceType() {
        return this.evidenceType;
    }

    /**
     * Set the evidenceType property: Evidence type.
     * 
     * @param evidenceType the evidenceType value to set.
     * @return the EvidenceProperties object itself.
     */
    public EvidenceProperties withEvidenceType(EvidenceType evidenceType) {
        this.evidenceType = evidenceType;
        return this;
    }

    /**
     * Get the filePath property: The path of the file in storage.
     * 
     * @return the filePath value.
     */
    public String filePath() {
        return this.filePath;
    }

    /**
     * Set the filePath property: The path of the file in storage.
     * 
     * @param filePath the filePath value to set.
     * @return the EvidenceProperties object itself.
     */
    public EvidenceProperties withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * Get the extraData property: Extra data considered as evidence.
     * 
     * @return the extraData value.
     */
    public String extraData() {
        return this.extraData;
    }

    /**
     * Set the extraData property: Extra data considered as evidence.
     * 
     * @param extraData the extraData value to set.
     * @return the EvidenceProperties object itself.
     */
    public EvidenceProperties withExtraData(String extraData) {
        this.extraData = extraData;
        return this;
    }

    /**
     * Get the controlId property: Control id.
     * 
     * @return the controlId value.
     */
    public String controlId() {
        return this.controlId;
    }

    /**
     * Set the controlId property: Control id.
     * 
     * @param controlId the controlId value to set.
     * @return the EvidenceProperties object itself.
     */
    public EvidenceProperties withControlId(String controlId) {
        this.controlId = controlId;
        return this;
    }

    /**
     * Get the responsibilityId property: Responsibility id.
     * 
     * @return the responsibilityId value.
     */
    public String responsibilityId() {
        return this.responsibilityId;
    }

    /**
     * Set the responsibilityId property: Responsibility id.
     * 
     * @param responsibilityId the responsibilityId value to set.
     * @return the EvidenceProperties object itself.
     */
    public EvidenceProperties withResponsibilityId(String responsibilityId) {
        this.responsibilityId = responsibilityId;
        return this;
    }

    /**
     * Get the provisioningState property: Azure lifecycle management.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (filePath() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property filePath in model EvidenceProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(EvidenceProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("filePath", this.filePath);
        jsonWriter.writeStringField("evidenceType", this.evidenceType == null ? null : this.evidenceType.toString());
        jsonWriter.writeStringField("extraData", this.extraData);
        jsonWriter.writeStringField("controlId", this.controlId);
        jsonWriter.writeStringField("responsibilityId", this.responsibilityId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EvidenceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EvidenceProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the EvidenceProperties.
     */
    public static EvidenceProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EvidenceProperties deserializedEvidenceProperties = new EvidenceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("filePath".equals(fieldName)) {
                    deserializedEvidenceProperties.filePath = reader.getString();
                } else if ("evidenceType".equals(fieldName)) {
                    deserializedEvidenceProperties.evidenceType = EvidenceType.fromString(reader.getString());
                } else if ("extraData".equals(fieldName)) {
                    deserializedEvidenceProperties.extraData = reader.getString();
                } else if ("controlId".equals(fieldName)) {
                    deserializedEvidenceProperties.controlId = reader.getString();
                } else if ("responsibilityId".equals(fieldName)) {
                    deserializedEvidenceProperties.responsibilityId = reader.getString();
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedEvidenceProperties.provisioningState = ProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEvidenceProperties;
        });
    }
}
