// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * class to define the health summary of the Vault.
 */
@Fluent
public final class VaultHealthProperties {
    /*
     * The list of errors on the vault.
     */
    @JsonProperty(value = "vaultErrors")
    private List<HealthError> vaultErrors;

    /*
     * The list of the health detail of the protected items in the vault.
     */
    @JsonProperty(value = "protectedItemsHealth")
    private ResourceHealthSummary protectedItemsHealth;

    /*
     * The list of the health detail of the fabrics in the vault.
     */
    @JsonProperty(value = "fabricsHealth")
    private ResourceHealthSummary fabricsHealth;

    /*
     * The list of the health detail of the containers in the vault.
     */
    @JsonProperty(value = "containersHealth")
    private ResourceHealthSummary containersHealth;

    /**
     * Creates an instance of VaultHealthProperties class.
     */
    public VaultHealthProperties() {
    }

    /**
     * Get the vaultErrors property: The list of errors on the vault.
     * 
     * @return the vaultErrors value.
     */
    public List<HealthError> vaultErrors() {
        return this.vaultErrors;
    }

    /**
     * Set the vaultErrors property: The list of errors on the vault.
     * 
     * @param vaultErrors the vaultErrors value to set.
     * @return the VaultHealthProperties object itself.
     */
    public VaultHealthProperties withVaultErrors(List<HealthError> vaultErrors) {
        this.vaultErrors = vaultErrors;
        return this;
    }

    /**
     * Get the protectedItemsHealth property: The list of the health detail of the protected items in the vault.
     * 
     * @return the protectedItemsHealth value.
     */
    public ResourceHealthSummary protectedItemsHealth() {
        return this.protectedItemsHealth;
    }

    /**
     * Set the protectedItemsHealth property: The list of the health detail of the protected items in the vault.
     * 
     * @param protectedItemsHealth the protectedItemsHealth value to set.
     * @return the VaultHealthProperties object itself.
     */
    public VaultHealthProperties withProtectedItemsHealth(ResourceHealthSummary protectedItemsHealth) {
        this.protectedItemsHealth = protectedItemsHealth;
        return this;
    }

    /**
     * Get the fabricsHealth property: The list of the health detail of the fabrics in the vault.
     * 
     * @return the fabricsHealth value.
     */
    public ResourceHealthSummary fabricsHealth() {
        return this.fabricsHealth;
    }

    /**
     * Set the fabricsHealth property: The list of the health detail of the fabrics in the vault.
     * 
     * @param fabricsHealth the fabricsHealth value to set.
     * @return the VaultHealthProperties object itself.
     */
    public VaultHealthProperties withFabricsHealth(ResourceHealthSummary fabricsHealth) {
        this.fabricsHealth = fabricsHealth;
        return this;
    }

    /**
     * Get the containersHealth property: The list of the health detail of the containers in the vault.
     * 
     * @return the containersHealth value.
     */
    public ResourceHealthSummary containersHealth() {
        return this.containersHealth;
    }

    /**
     * Set the containersHealth property: The list of the health detail of the containers in the vault.
     * 
     * @param containersHealth the containersHealth value to set.
     * @return the VaultHealthProperties object itself.
     */
    public VaultHealthProperties withContainersHealth(ResourceHealthSummary containersHealth) {
        this.containersHealth = containersHealth;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (vaultErrors() != null) {
            vaultErrors().forEach(e -> e.validate());
        }
        if (protectedItemsHealth() != null) {
            protectedItemsHealth().validate();
        }
        if (fabricsHealth() != null) {
            fabricsHealth().validate();
        }
        if (containersHealth() != null) {
            containersHealth().validate();
        }
    }
}
