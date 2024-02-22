// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Azure VM managed disk input details.
 */
@Fluent
public final class A2AProtectionIntentManagedDiskInputDetails {
    /*
     * The disk Id.
     */
    @JsonProperty(value = "diskId", required = true)
    private String diskId;

    /*
     * The primary staging storage account input.
     */
    @JsonProperty(value = "primaryStagingStorageAccountCustomInput")
    private StorageAccountCustomDetails primaryStagingStorageAccountCustomInput;

    /*
     * The recovery resource group input.
     */
    @JsonProperty(value = "recoveryResourceGroupCustomInput")
    private RecoveryResourceGroupCustomDetails recoveryResourceGroupCustomInput;

    /*
     * The replica disk type. Its an optional value and will be same as source disk type if not user provided.
     */
    @JsonProperty(value = "recoveryReplicaDiskAccountType")
    private String recoveryReplicaDiskAccountType;

    /*
     * The target disk type after failover. Its an optional value and will be same as source disk type if not user
     * provided.
     */
    @JsonProperty(value = "recoveryTargetDiskAccountType")
    private String recoveryTargetDiskAccountType;

    /*
     * The recovery disk encryption set Id.
     */
    @JsonProperty(value = "recoveryDiskEncryptionSetId")
    private String recoveryDiskEncryptionSetId;

    /*
     * The recovery disk encryption information (for one / single pass flows).
     */
    @JsonProperty(value = "diskEncryptionInfo")
    private DiskEncryptionInfo diskEncryptionInfo;

    /**
     * Creates an instance of A2AProtectionIntentManagedDiskInputDetails class.
     */
    public A2AProtectionIntentManagedDiskInputDetails() {
    }

    /**
     * Get the diskId property: The disk Id.
     * 
     * @return the diskId value.
     */
    public String diskId() {
        return this.diskId;
    }

    /**
     * Set the diskId property: The disk Id.
     * 
     * @param diskId the diskId value to set.
     * @return the A2AProtectionIntentManagedDiskInputDetails object itself.
     */
    public A2AProtectionIntentManagedDiskInputDetails withDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }

    /**
     * Get the primaryStagingStorageAccountCustomInput property: The primary staging storage account input.
     * 
     * @return the primaryStagingStorageAccountCustomInput value.
     */
    public StorageAccountCustomDetails primaryStagingStorageAccountCustomInput() {
        return this.primaryStagingStorageAccountCustomInput;
    }

    /**
     * Set the primaryStagingStorageAccountCustomInput property: The primary staging storage account input.
     * 
     * @param primaryStagingStorageAccountCustomInput the primaryStagingStorageAccountCustomInput value to set.
     * @return the A2AProtectionIntentManagedDiskInputDetails object itself.
     */
    public A2AProtectionIntentManagedDiskInputDetails withPrimaryStagingStorageAccountCustomInput(
        StorageAccountCustomDetails primaryStagingStorageAccountCustomInput) {
        this.primaryStagingStorageAccountCustomInput = primaryStagingStorageAccountCustomInput;
        return this;
    }

    /**
     * Get the recoveryResourceGroupCustomInput property: The recovery resource group input.
     * 
     * @return the recoveryResourceGroupCustomInput value.
     */
    public RecoveryResourceGroupCustomDetails recoveryResourceGroupCustomInput() {
        return this.recoveryResourceGroupCustomInput;
    }

    /**
     * Set the recoveryResourceGroupCustomInput property: The recovery resource group input.
     * 
     * @param recoveryResourceGroupCustomInput the recoveryResourceGroupCustomInput value to set.
     * @return the A2AProtectionIntentManagedDiskInputDetails object itself.
     */
    public A2AProtectionIntentManagedDiskInputDetails
        withRecoveryResourceGroupCustomInput(RecoveryResourceGroupCustomDetails recoveryResourceGroupCustomInput) {
        this.recoveryResourceGroupCustomInput = recoveryResourceGroupCustomInput;
        return this;
    }

    /**
     * Get the recoveryReplicaDiskAccountType property: The replica disk type. Its an optional value and will be same
     * as source disk type if not user provided.
     * 
     * @return the recoveryReplicaDiskAccountType value.
     */
    public String recoveryReplicaDiskAccountType() {
        return this.recoveryReplicaDiskAccountType;
    }

    /**
     * Set the recoveryReplicaDiskAccountType property: The replica disk type. Its an optional value and will be same
     * as source disk type if not user provided.
     * 
     * @param recoveryReplicaDiskAccountType the recoveryReplicaDiskAccountType value to set.
     * @return the A2AProtectionIntentManagedDiskInputDetails object itself.
     */
    public A2AProtectionIntentManagedDiskInputDetails
        withRecoveryReplicaDiskAccountType(String recoveryReplicaDiskAccountType) {
        this.recoveryReplicaDiskAccountType = recoveryReplicaDiskAccountType;
        return this;
    }

    /**
     * Get the recoveryTargetDiskAccountType property: The target disk type after failover. Its an optional value and
     * will be same as source disk type if not user provided.
     * 
     * @return the recoveryTargetDiskAccountType value.
     */
    public String recoveryTargetDiskAccountType() {
        return this.recoveryTargetDiskAccountType;
    }

    /**
     * Set the recoveryTargetDiskAccountType property: The target disk type after failover. Its an optional value and
     * will be same as source disk type if not user provided.
     * 
     * @param recoveryTargetDiskAccountType the recoveryTargetDiskAccountType value to set.
     * @return the A2AProtectionIntentManagedDiskInputDetails object itself.
     */
    public A2AProtectionIntentManagedDiskInputDetails
        withRecoveryTargetDiskAccountType(String recoveryTargetDiskAccountType) {
        this.recoveryTargetDiskAccountType = recoveryTargetDiskAccountType;
        return this;
    }

    /**
     * Get the recoveryDiskEncryptionSetId property: The recovery disk encryption set Id.
     * 
     * @return the recoveryDiskEncryptionSetId value.
     */
    public String recoveryDiskEncryptionSetId() {
        return this.recoveryDiskEncryptionSetId;
    }

    /**
     * Set the recoveryDiskEncryptionSetId property: The recovery disk encryption set Id.
     * 
     * @param recoveryDiskEncryptionSetId the recoveryDiskEncryptionSetId value to set.
     * @return the A2AProtectionIntentManagedDiskInputDetails object itself.
     */
    public A2AProtectionIntentManagedDiskInputDetails
        withRecoveryDiskEncryptionSetId(String recoveryDiskEncryptionSetId) {
        this.recoveryDiskEncryptionSetId = recoveryDiskEncryptionSetId;
        return this;
    }

    /**
     * Get the diskEncryptionInfo property: The recovery disk encryption information (for one / single pass flows).
     * 
     * @return the diskEncryptionInfo value.
     */
    public DiskEncryptionInfo diskEncryptionInfo() {
        return this.diskEncryptionInfo;
    }

    /**
     * Set the diskEncryptionInfo property: The recovery disk encryption information (for one / single pass flows).
     * 
     * @param diskEncryptionInfo the diskEncryptionInfo value to set.
     * @return the A2AProtectionIntentManagedDiskInputDetails object itself.
     */
    public A2AProtectionIntentManagedDiskInputDetails withDiskEncryptionInfo(DiskEncryptionInfo diskEncryptionInfo) {
        this.diskEncryptionInfo = diskEncryptionInfo;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (diskId() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property diskId in model A2AProtectionIntentManagedDiskInputDetails"));
        }
        if (primaryStagingStorageAccountCustomInput() != null) {
            primaryStagingStorageAccountCustomInput().validate();
        }
        if (recoveryResourceGroupCustomInput() != null) {
            recoveryResourceGroupCustomInput().validate();
        }
        if (diskEncryptionInfo() != null) {
            diskEncryptionInfo().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(A2AProtectionIntentManagedDiskInputDetails.class);
}
