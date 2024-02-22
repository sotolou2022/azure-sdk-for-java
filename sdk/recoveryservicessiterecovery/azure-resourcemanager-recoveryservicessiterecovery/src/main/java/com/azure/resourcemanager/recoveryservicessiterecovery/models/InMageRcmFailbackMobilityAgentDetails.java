// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * InMageRcmFailback mobility agent details.
 */
@Immutable
public final class InMageRcmFailbackMobilityAgentDetails {
    /*
     * The agent version.
     */
    @JsonProperty(value = "version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /*
     * The latest agent version available.
     */
    @JsonProperty(value = "latestVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String latestVersion;

    /*
     * The driver version.
     */
    @JsonProperty(value = "driverVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String driverVersion;

    /*
     * The latest upgradeable version available without reboot.
     */
    @JsonProperty(value = "latestUpgradableVersionWithoutReboot", access = JsonProperty.Access.WRITE_ONLY)
    private String latestUpgradableVersionWithoutReboot;

    /*
     * The agent version expiry date.
     */
    @JsonProperty(value = "agentVersionExpiryDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime agentVersionExpiryDate;

    /*
     * The driver version expiry date.
     */
    @JsonProperty(value = "driverVersionExpiryDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime driverVersionExpiryDate;

    /*
     * The time of the last heartbeat received from the agent.
     */
    @JsonProperty(value = "lastHeartbeatUtc", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastHeartbeatUtc;

    /*
     * The whether update is possible or not.
     */
    @JsonProperty(value = "reasonsBlockingUpgrade", access = JsonProperty.Access.WRITE_ONLY)
    private List<AgentUpgradeBlockedReason> reasonsBlockingUpgrade;

    /*
     * A value indicating whether agent is upgradeable or not.
     */
    @JsonProperty(value = "isUpgradeable", access = JsonProperty.Access.WRITE_ONLY)
    private String isUpgradeable;

    /**
     * Creates an instance of InMageRcmFailbackMobilityAgentDetails class.
     */
    public InMageRcmFailbackMobilityAgentDetails() {
    }

    /**
     * Get the version property: The agent version.
     * 
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Get the latestVersion property: The latest agent version available.
     * 
     * @return the latestVersion value.
     */
    public String latestVersion() {
        return this.latestVersion;
    }

    /**
     * Get the driverVersion property: The driver version.
     * 
     * @return the driverVersion value.
     */
    public String driverVersion() {
        return this.driverVersion;
    }

    /**
     * Get the latestUpgradableVersionWithoutReboot property: The latest upgradeable version available without reboot.
     * 
     * @return the latestUpgradableVersionWithoutReboot value.
     */
    public String latestUpgradableVersionWithoutReboot() {
        return this.latestUpgradableVersionWithoutReboot;
    }

    /**
     * Get the agentVersionExpiryDate property: The agent version expiry date.
     * 
     * @return the agentVersionExpiryDate value.
     */
    public OffsetDateTime agentVersionExpiryDate() {
        return this.agentVersionExpiryDate;
    }

    /**
     * Get the driverVersionExpiryDate property: The driver version expiry date.
     * 
     * @return the driverVersionExpiryDate value.
     */
    public OffsetDateTime driverVersionExpiryDate() {
        return this.driverVersionExpiryDate;
    }

    /**
     * Get the lastHeartbeatUtc property: The time of the last heartbeat received from the agent.
     * 
     * @return the lastHeartbeatUtc value.
     */
    public OffsetDateTime lastHeartbeatUtc() {
        return this.lastHeartbeatUtc;
    }

    /**
     * Get the reasonsBlockingUpgrade property: The whether update is possible or not.
     * 
     * @return the reasonsBlockingUpgrade value.
     */
    public List<AgentUpgradeBlockedReason> reasonsBlockingUpgrade() {
        return this.reasonsBlockingUpgrade;
    }

    /**
     * Get the isUpgradeable property: A value indicating whether agent is upgradeable or not.
     * 
     * @return the isUpgradeable value.
     */
    public String isUpgradeable() {
        return this.isUpgradeable;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
