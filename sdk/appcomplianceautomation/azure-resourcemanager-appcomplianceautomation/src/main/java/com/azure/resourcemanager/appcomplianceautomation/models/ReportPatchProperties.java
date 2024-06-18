// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Patch Report's properties.
 */
@Fluent
public final class ReportPatchProperties implements JsonSerializable<ReportPatchProperties> {
    /*
     * Report collection trigger time.
     */
    private OffsetDateTime triggerTime;

    /*
     * Report collection trigger time's time zone, the available list can be obtained by executing
     * "Get-TimeZone -ListAvailable" in PowerShell.
     * An example of valid timezone id is "Pacific Standard Time".
     */
    private String timeZone;

    /*
     * List of resource data.
     */
    private List<ResourceMetadata> resources;

    /*
     * Report status.
     */
    private ReportStatus status;

    /*
     * List of report error codes.
     */
    private List<String> errors;

    /*
     * Report's tenant id.
     */
    private String tenantId;

    /*
     * A list of comma-separated offerGuids indicates a series of offerGuids that map to the report. For example,
     * "00000000-0000-0000-0000-000000000001,00000000-0000-0000-0000-000000000002" and
     * "00000000-0000-0000-0000-000000000003".
     */
    private String offerGuid;

    /*
     * Report next collection trigger time.
     */
    private OffsetDateTime nextTriggerTime;

    /*
     * Report last collection trigger time.
     */
    private OffsetDateTime lastTriggerTime;

    /*
     * List of subscription Ids.
     */
    private List<String> subscriptions;

    /*
     * Report compliance status.
     */
    private ReportComplianceStatus complianceStatus;

    /*
     * The information of 'bring your own storage' binding to the report
     */
    private StorageInfo storageInfo;

    /*
     * List of synchronized certification records.
     */
    private List<CertSyncRecord> certRecords;

    /*
     * Azure lifecycle management
     */
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of ReportPatchProperties class.
     */
    public ReportPatchProperties() {
    }

    /**
     * Get the triggerTime property: Report collection trigger time.
     * 
     * @return the triggerTime value.
     */
    public OffsetDateTime triggerTime() {
        return this.triggerTime;
    }

    /**
     * Set the triggerTime property: Report collection trigger time.
     * 
     * @param triggerTime the triggerTime value to set.
     * @return the ReportPatchProperties object itself.
     */
    public ReportPatchProperties withTriggerTime(OffsetDateTime triggerTime) {
        this.triggerTime = triggerTime;
        return this;
    }

    /**
     * Get the timeZone property: Report collection trigger time's time zone, the available list can be obtained by
     * executing "Get-TimeZone -ListAvailable" in PowerShell.
     * An example of valid timezone id is "Pacific Standard Time".
     * 
     * @return the timeZone value.
     */
    public String timeZone() {
        return this.timeZone;
    }

    /**
     * Set the timeZone property: Report collection trigger time's time zone, the available list can be obtained by
     * executing "Get-TimeZone -ListAvailable" in PowerShell.
     * An example of valid timezone id is "Pacific Standard Time".
     * 
     * @param timeZone the timeZone value to set.
     * @return the ReportPatchProperties object itself.
     */
    public ReportPatchProperties withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * Get the resources property: List of resource data.
     * 
     * @return the resources value.
     */
    public List<ResourceMetadata> resources() {
        return this.resources;
    }

    /**
     * Set the resources property: List of resource data.
     * 
     * @param resources the resources value to set.
     * @return the ReportPatchProperties object itself.
     */
    public ReportPatchProperties withResources(List<ResourceMetadata> resources) {
        this.resources = resources;
        return this;
    }

    /**
     * Get the status property: Report status.
     * 
     * @return the status value.
     */
    public ReportStatus status() {
        return this.status;
    }

    /**
     * Get the errors property: List of report error codes.
     * 
     * @return the errors value.
     */
    public List<String> errors() {
        return this.errors;
    }

    /**
     * Get the tenantId property: Report's tenant id.
     * 
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the offerGuid property: A list of comma-separated offerGuids indicates a series of offerGuids that map to the
     * report. For example, "00000000-0000-0000-0000-000000000001,00000000-0000-0000-0000-000000000002" and
     * "00000000-0000-0000-0000-000000000003".
     * 
     * @return the offerGuid value.
     */
    public String offerGuid() {
        return this.offerGuid;
    }

    /**
     * Set the offerGuid property: A list of comma-separated offerGuids indicates a series of offerGuids that map to the
     * report. For example, "00000000-0000-0000-0000-000000000001,00000000-0000-0000-0000-000000000002" and
     * "00000000-0000-0000-0000-000000000003".
     * 
     * @param offerGuid the offerGuid value to set.
     * @return the ReportPatchProperties object itself.
     */
    public ReportPatchProperties withOfferGuid(String offerGuid) {
        this.offerGuid = offerGuid;
        return this;
    }

    /**
     * Get the nextTriggerTime property: Report next collection trigger time.
     * 
     * @return the nextTriggerTime value.
     */
    public OffsetDateTime nextTriggerTime() {
        return this.nextTriggerTime;
    }

    /**
     * Get the lastTriggerTime property: Report last collection trigger time.
     * 
     * @return the lastTriggerTime value.
     */
    public OffsetDateTime lastTriggerTime() {
        return this.lastTriggerTime;
    }

    /**
     * Get the subscriptions property: List of subscription Ids.
     * 
     * @return the subscriptions value.
     */
    public List<String> subscriptions() {
        return this.subscriptions;
    }

    /**
     * Get the complianceStatus property: Report compliance status.
     * 
     * @return the complianceStatus value.
     */
    public ReportComplianceStatus complianceStatus() {
        return this.complianceStatus;
    }

    /**
     * Get the storageInfo property: The information of 'bring your own storage' binding to the report.
     * 
     * @return the storageInfo value.
     */
    public StorageInfo storageInfo() {
        return this.storageInfo;
    }

    /**
     * Set the storageInfo property: The information of 'bring your own storage' binding to the report.
     * 
     * @param storageInfo the storageInfo value to set.
     * @return the ReportPatchProperties object itself.
     */
    public ReportPatchProperties withStorageInfo(StorageInfo storageInfo) {
        this.storageInfo = storageInfo;
        return this;
    }

    /**
     * Get the certRecords property: List of synchronized certification records.
     * 
     * @return the certRecords value.
     */
    public List<CertSyncRecord> certRecords() {
        return this.certRecords;
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
        if (resources() != null) {
            resources().forEach(e -> e.validate());
        }
        if (complianceStatus() != null) {
            complianceStatus().validate();
        }
        if (storageInfo() != null) {
            storageInfo().validate();
        }
        if (certRecords() != null) {
            certRecords().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("triggerTime",
            this.triggerTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.triggerTime));
        jsonWriter.writeStringField("timeZone", this.timeZone);
        jsonWriter.writeArrayField("resources", this.resources, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("offerGuid", this.offerGuid);
        jsonWriter.writeJsonField("storageInfo", this.storageInfo);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ReportPatchProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ReportPatchProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ReportPatchProperties.
     */
    public static ReportPatchProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ReportPatchProperties deserializedReportPatchProperties = new ReportPatchProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("triggerTime".equals(fieldName)) {
                    deserializedReportPatchProperties.triggerTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("timeZone".equals(fieldName)) {
                    deserializedReportPatchProperties.timeZone = reader.getString();
                } else if ("resources".equals(fieldName)) {
                    List<ResourceMetadata> resources = reader.readArray(reader1 -> ResourceMetadata.fromJson(reader1));
                    deserializedReportPatchProperties.resources = resources;
                } else if ("status".equals(fieldName)) {
                    deserializedReportPatchProperties.status = ReportStatus.fromString(reader.getString());
                } else if ("errors".equals(fieldName)) {
                    List<String> errors = reader.readArray(reader1 -> reader1.getString());
                    deserializedReportPatchProperties.errors = errors;
                } else if ("tenantId".equals(fieldName)) {
                    deserializedReportPatchProperties.tenantId = reader.getString();
                } else if ("offerGuid".equals(fieldName)) {
                    deserializedReportPatchProperties.offerGuid = reader.getString();
                } else if ("nextTriggerTime".equals(fieldName)) {
                    deserializedReportPatchProperties.nextTriggerTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("lastTriggerTime".equals(fieldName)) {
                    deserializedReportPatchProperties.lastTriggerTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("subscriptions".equals(fieldName)) {
                    List<String> subscriptions = reader.readArray(reader1 -> reader1.getString());
                    deserializedReportPatchProperties.subscriptions = subscriptions;
                } else if ("complianceStatus".equals(fieldName)) {
                    deserializedReportPatchProperties.complianceStatus = ReportComplianceStatus.fromJson(reader);
                } else if ("storageInfo".equals(fieldName)) {
                    deserializedReportPatchProperties.storageInfo = StorageInfo.fromJson(reader);
                } else if ("certRecords".equals(fieldName)) {
                    List<CertSyncRecord> certRecords = reader.readArray(reader1 -> CertSyncRecord.fromJson(reader1));
                    deserializedReportPatchProperties.certRecords = certRecords;
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedReportPatchProperties.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedReportPatchProperties;
        });
    }
}
