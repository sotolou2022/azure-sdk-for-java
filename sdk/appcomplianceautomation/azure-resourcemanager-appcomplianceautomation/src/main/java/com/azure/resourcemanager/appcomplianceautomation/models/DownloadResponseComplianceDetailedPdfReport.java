// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The detailed compliance pdf report.
 */
@Immutable
public final class DownloadResponseComplianceDetailedPdfReport
    implements JsonSerializable<DownloadResponseComplianceDetailedPdfReport> {
    /*
     * The uri of detailed compliance pdf report
     */
    private String sasUri;

    /**
     * Creates an instance of DownloadResponseComplianceDetailedPdfReport class.
     */
    private DownloadResponseComplianceDetailedPdfReport() {
    }

    /**
     * Get the sasUri property: The uri of detailed compliance pdf report.
     * 
     * @return the sasUri value.
     */
    public String sasUri() {
        return this.sasUri;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DownloadResponseComplianceDetailedPdfReport from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DownloadResponseComplianceDetailedPdfReport if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DownloadResponseComplianceDetailedPdfReport.
     */
    public static DownloadResponseComplianceDetailedPdfReport fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DownloadResponseComplianceDetailedPdfReport deserializedDownloadResponseComplianceDetailedPdfReport
                = new DownloadResponseComplianceDetailedPdfReport();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sasUri".equals(fieldName)) {
                    deserializedDownloadResponseComplianceDetailedPdfReport.sasUri = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDownloadResponseComplianceDetailedPdfReport;
        });
    }
}
