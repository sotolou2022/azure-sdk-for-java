// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.List;

/**
 * Text analytics entity recognition.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "@odata.type",
    visible = true)
@JsonTypeName("#Microsoft.Skills.Text.EntityRecognitionSkill")
@Fluent
public final class EntityRecognitionSkill extends SearchIndexerSkill {
    /*
     * A list of entity categories that should be extracted.
     */
    @JsonProperty(value = "categories")
    private List<EntityCategory> categories;

    /*
     * A value indicating which language code to use. Default is en.
     */
    @JsonProperty(value = "defaultLanguageCode")
    private EntityRecognitionSkillLanguage defaultLanguageCode;

    /*
     * Determines whether or not to include entities which are well known but
     * don't conform to a pre-defined type. If this configuration is not set
     * (default), set to null or set to false, entities which don't conform to
     * one of the pre-defined types will not be surfaced.
     */
    @JsonProperty(value = "includeTypelessEntities")
    private Boolean includeTypelessEntities;

    /*
     * A value between 0 and 1 that be used to only include entities whose
     * confidence score is greater than the value specified. If not set
     * (default), or if explicitly set to null, all entities will be included.
     */
    @JsonProperty(value = "minimumPrecision")
    private Double minimumPrecision;

    /*
     * The version of the model to use when calling the Text Analytics service.
     * It will default to the latest available when not specified. We recommend
     * you do not specify this value unless absolutely necessary.
     */
    @JsonProperty(value = "modelVersion")
    private String modelVersion;

    @JsonTypeId
    @JsonProperty(value = "@odata.type", access = JsonProperty.Access.WRITE_ONLY)
    private EntityRecognitionSkillVersion version;

    /**
     * Creates an instance of EntityRecognitionSkill class.
     *
     * @param inputs the inputs value to set.
     * @param outputs the outputs value to set.
     */
    @JsonCreator
    public EntityRecognitionSkill(
        @JsonProperty(value = "inputs", required = true) List<InputFieldMappingEntry> inputs,
        @JsonProperty(value = "outputs", required = true) List<OutputFieldMappingEntry> outputs) {
        this(inputs, outputs, EntityRecognitionSkillVersion.V1);
    }

    /**
     * Creates an instance of EntityRecognitionSkill class.
     *
     * @param inputs the inputs value to set.
     * @param outputs the outputs value to set.
     * @param version the EntityRecognitionSkillVersion value to set.
     */
    public EntityRecognitionSkill(List<InputFieldMappingEntry> inputs, List<OutputFieldMappingEntry> outputs,
        EntityRecognitionSkillVersion version) {
        super(inputs, outputs);
        this.version = version;
    }

    /**
     * Gets the version of the {@link EntityRecognitionSkill}.
     *
     * @return The version of the {@link EntityRecognitionSkill}.
     */
    public EntityRecognitionSkillVersion getVersion() {
        return this.version;
    }

    /**
     * Get the categories property: A list of entity categories that should be extracted.
     *
     * @return the categories value.
     */
    public List<EntityCategory> getCategories() {
        return this.categories;
    }

    /**
     * Set the categories property: A list of entity categories that should be extracted.
     *
     * @param categories the categories value to set.
     * @return the EntityRecognitionSkill object itself.
     */
    @JsonSetter
    public EntityRecognitionSkill setCategories(List<EntityCategory> categories) {
        this.categories = categories;
        return this;
    }

    /**
     * Get the defaultLanguageCode property: A value indicating which language code to use. Default is en.
     *
     * @return the defaultLanguageCode value.
     */
    public EntityRecognitionSkillLanguage getDefaultLanguageCode() {
        return this.defaultLanguageCode;
    }

    /**
     * Set the defaultLanguageCode property: A value indicating which language code to use. Default is en.
     *
     * @param defaultLanguageCode the defaultLanguageCode value to set.
     * @return the EntityRecognitionSkill object itself.
     */
    public EntityRecognitionSkill setDefaultLanguageCode(EntityRecognitionSkillLanguage defaultLanguageCode) {
        this.defaultLanguageCode = defaultLanguageCode;
        return this;
    }

    /**
     * Get the includeTypelessEntities property: Determines whether or not to include entities which are well known but
     * don't conform to a pre-defined type. If this configuration is not set (default), set to null or set to false,
     * entities which don't conform to one of the pre-defined types will not be surfaced.
     *
     * @return the includeTypelessEntities value.
     */
    public Boolean areTypelessEntitiesIncluded() {
        return this.includeTypelessEntities;
    }

    /**
     * Set the includeTypelessEntities property: Determines whether or not to include entities which are well known but
     * don't conform to a pre-defined type. If this configuration is not set (default), set to null or set to false,
     * entities which don't conform to one of the pre-defined types will not be surfaced.
     *
     * @param includeTypelessEntities the includeTypelessEntities value to set.
     * @return the EntityRecognitionSkill object itself.
     */
    public EntityRecognitionSkill setTypelessEntitiesIncluded(Boolean includeTypelessEntities) {
        this.includeTypelessEntities = includeTypelessEntities;
        return this;
    }

    /**
     * Get the minimumPrecision property: A value between 0 and 1 that be used to only include entities whose confidence
     * score is greater than the value specified. If not set (default), or if explicitly set to null, all entities will
     * be included.
     *
     * @return the minimumPrecision value.
     */
    public Double getMinimumPrecision() {
        return this.minimumPrecision;
    }

    /**
     * Set the minimumPrecision property: A value between 0 and 1 that be used to only include entities whose confidence
     * score is greater than the value specified. If not set (default), or if explicitly set to null, all entities will
     * be included.
     *
     * @param minimumPrecision the minimumPrecision value to set.
     * @return the EntityRecognitionSkill object itself.
     */
    public EntityRecognitionSkill setMinimumPrecision(Double minimumPrecision) {
        this.minimumPrecision = minimumPrecision;
        return this;
    }

    /**
     * Set the categories property: A list of entity categories that should be extracted.
     *
     * @param categories the categories value to set.
     * @return the EntityRecognitionSkill object itself.
     */
    public EntityRecognitionSkill setCategories(EntityCategory... categories) {
        this.categories = (categories == null) ? null : java.util.Arrays.asList(categories);
        return this;
    }

    /**
     * Get the modelVersion property: The version of the model to use when calling the Text Analytics service. It will
     * default to the latest available when not specified. We recommend you do not specify this value unless absolutely
     * necessary.
     *
     * @return the modelVersion value.
     */
    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * Set the modelVersion property: The version of the model to use when calling the Text Analytics service. It will
     * default to the latest available when not specified. We recommend you do not specify this value unless absolutely
     * necessary.
     *
     * @param modelVersion the modelVersion value to set.
     * @return the EntityRecognitionSkill object itself.
     */
    public EntityRecognitionSkill setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
}
