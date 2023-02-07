// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Gets or sets the single server configuration. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "deploymentType")
@JsonTypeName("SingleServer")
@Fluent
public final class SingleServerConfiguration extends InfrastructureConfiguration {
    /*
     * Network configuration for the server
     */
    @JsonProperty(value = "networkConfiguration")
    private NetworkConfiguration networkConfiguration;

    /*
     * The database type.
     */
    @JsonProperty(value = "databaseType")
    private SapDatabaseType databaseType;

    /*
     * The subnet id.
     */
    @JsonProperty(value = "subnetId", required = true)
    private String subnetId;

    /*
     * Gets or sets the virtual machine configuration.
     */
    @JsonProperty(value = "virtualMachineConfiguration", required = true)
    private VirtualMachineConfiguration virtualMachineConfiguration;

    /*
     * Gets or sets the disk configuration.
     */
    @JsonProperty(value = "dbDiskConfiguration")
    private DiskConfiguration dbDiskConfiguration;

    /*
     * The set of custom names to be used for underlying azure resources that are part of the SAP system.
     */
    @JsonProperty(value = "customResourceNames")
    private SingleServerCustomResourceNames customResourceNames;

    /** Creates an instance of SingleServerConfiguration class. */
    public SingleServerConfiguration() {
    }

    /**
     * Get the networkConfiguration property: Network configuration for the server.
     *
     * @return the networkConfiguration value.
     */
    public NetworkConfiguration networkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * Set the networkConfiguration property: Network configuration for the server.
     *
     * @param networkConfiguration the networkConfiguration value to set.
     * @return the SingleServerConfiguration object itself.
     */
    public SingleServerConfiguration withNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }

    /**
     * Get the databaseType property: The database type.
     *
     * @return the databaseType value.
     */
    public SapDatabaseType databaseType() {
        return this.databaseType;
    }

    /**
     * Set the databaseType property: The database type.
     *
     * @param databaseType the databaseType value to set.
     * @return the SingleServerConfiguration object itself.
     */
    public SingleServerConfiguration withDatabaseType(SapDatabaseType databaseType) {
        this.databaseType = databaseType;
        return this;
    }

    /**
     * Get the subnetId property: The subnet id.
     *
     * @return the subnetId value.
     */
    public String subnetId() {
        return this.subnetId;
    }

    /**
     * Set the subnetId property: The subnet id.
     *
     * @param subnetId the subnetId value to set.
     * @return the SingleServerConfiguration object itself.
     */
    public SingleServerConfiguration withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * Get the virtualMachineConfiguration property: Gets or sets the virtual machine configuration.
     *
     * @return the virtualMachineConfiguration value.
     */
    public VirtualMachineConfiguration virtualMachineConfiguration() {
        return this.virtualMachineConfiguration;
    }

    /**
     * Set the virtualMachineConfiguration property: Gets or sets the virtual machine configuration.
     *
     * @param virtualMachineConfiguration the virtualMachineConfiguration value to set.
     * @return the SingleServerConfiguration object itself.
     */
    public SingleServerConfiguration withVirtualMachineConfiguration(
        VirtualMachineConfiguration virtualMachineConfiguration) {
        this.virtualMachineConfiguration = virtualMachineConfiguration;
        return this;
    }

    /**
     * Get the dbDiskConfiguration property: Gets or sets the disk configuration.
     *
     * @return the dbDiskConfiguration value.
     */
    public DiskConfiguration dbDiskConfiguration() {
        return this.dbDiskConfiguration;
    }

    /**
     * Set the dbDiskConfiguration property: Gets or sets the disk configuration.
     *
     * @param dbDiskConfiguration the dbDiskConfiguration value to set.
     * @return the SingleServerConfiguration object itself.
     */
    public SingleServerConfiguration withDbDiskConfiguration(DiskConfiguration dbDiskConfiguration) {
        this.dbDiskConfiguration = dbDiskConfiguration;
        return this;
    }

    /**
     * Get the customResourceNames property: The set of custom names to be used for underlying azure resources that are
     * part of the SAP system.
     *
     * @return the customResourceNames value.
     */
    public SingleServerCustomResourceNames customResourceNames() {
        return this.customResourceNames;
    }

    /**
     * Set the customResourceNames property: The set of custom names to be used for underlying azure resources that are
     * part of the SAP system.
     *
     * @param customResourceNames the customResourceNames value to set.
     * @return the SingleServerConfiguration object itself.
     */
    public SingleServerConfiguration withCustomResourceNames(SingleServerCustomResourceNames customResourceNames) {
        this.customResourceNames = customResourceNames;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SingleServerConfiguration withAppResourceGroup(String appResourceGroup) {
        super.withAppResourceGroup(appResourceGroup);
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
        if (networkConfiguration() != null) {
            networkConfiguration().validate();
        }
        if (subnetId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property subnetId in model SingleServerConfiguration"));
        }
        if (virtualMachineConfiguration() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property virtualMachineConfiguration in model SingleServerConfiguration"));
        } else {
            virtualMachineConfiguration().validate();
        }
        if (dbDiskConfiguration() != null) {
            dbDiskConfiguration().validate();
        }
        if (customResourceNames() != null) {
            customResourceNames().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SingleServerConfiguration.class);
}
