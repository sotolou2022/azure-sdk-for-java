// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Update migration item provider specific input.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "instanceType",
    defaultImpl = UpdateMigrationItemProviderSpecificInput.class)
@JsonTypeName("UpdateMigrationItemProviderSpecificInput")
@JsonSubTypes({ @JsonSubTypes.Type(name = "VMwareCbt", value = VMwareCbtUpdateMigrationItemInput.class) })
@Immutable
public class UpdateMigrationItemProviderSpecificInput {
    /**
     * Creates an instance of UpdateMigrationItemProviderSpecificInput class.
     */
    public UpdateMigrationItemProviderSpecificInput() {
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
