// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity Salesforce source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", defaultImpl = SalesforceSource.class, visible = true)
@JsonTypeName("SalesforceSource")
@Fluent
public final class SalesforceSource extends TabularSource {
    /*
     * Copy source type.
     */
    @JsonTypeId
    @JsonProperty(value = "type", required = true)
    private String type = "SalesforceSource";

    /*
     * Database query. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "query")
    private Object query;

    /*
     * The read behavior for the operation. Default is Query. Allowed values: Query/QueryAll. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "readBehavior")
    private Object readBehavior;

    /**
     * Creates an instance of SalesforceSource class.
     */
    public SalesforceSource() {
    }

    /**
     * Get the type property: Copy source type.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the query property: Database query. Type: string (or Expression with resultType string).
     * 
     * @return the query value.
     */
    public Object query() {
        return this.query;
    }

    /**
     * Set the query property: Database query. Type: string (or Expression with resultType string).
     * 
     * @param query the query value to set.
     * @return the SalesforceSource object itself.
     */
    public SalesforceSource withQuery(Object query) {
        this.query = query;
        return this;
    }

    /**
     * Get the readBehavior property: The read behavior for the operation. Default is Query. Allowed values:
     * Query/QueryAll. Type: string (or Expression with resultType string).
     * 
     * @return the readBehavior value.
     */
    public Object readBehavior() {
        return this.readBehavior;
    }

    /**
     * Set the readBehavior property: The read behavior for the operation. Default is Query. Allowed values:
     * Query/QueryAll. Type: string (or Expression with resultType string).
     * 
     * @param readBehavior the readBehavior value to set.
     * @return the SalesforceSource object itself.
     */
    public SalesforceSource withReadBehavior(Object readBehavior) {
        this.readBehavior = readBehavior;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceSource withQueryTimeout(Object queryTimeout) {
        super.withQueryTimeout(queryTimeout);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceSource withAdditionalColumns(Object additionalColumns) {
        super.withAdditionalColumns(additionalColumns);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceSource withSourceRetryCount(Object sourceRetryCount) {
        super.withSourceRetryCount(sourceRetryCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceSource withSourceRetryWait(Object sourceRetryWait) {
        super.withSourceRetryWait(sourceRetryWait);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceSource withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceSource withDisableMetricsCollection(Object disableMetricsCollection) {
        super.withDisableMetricsCollection(disableMetricsCollection);
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
    }
}
