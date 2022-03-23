// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.securityinsights.models.EntityCommonProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Dns entity property bag. */
@Immutable
public final class DnsEntityProperties extends EntityCommonProperties {
    /*
     * An ip entity id for the dns server resolving the request
     */
    @JsonProperty(value = "dnsServerIpEntityId", access = JsonProperty.Access.WRITE_ONLY)
    private String dnsServerIpEntityId;

    /*
     * The name of the dns record associated with the alert
     */
    @JsonProperty(value = "domainName", access = JsonProperty.Access.WRITE_ONLY)
    private String domainName;

    /*
     * An ip entity id for the dns request client
     */
    @JsonProperty(value = "hostIpAddressEntityId", access = JsonProperty.Access.WRITE_ONLY)
    private String hostIpAddressEntityId;

    /*
     * Ip entity identifiers for the resolved ip address.
     */
    @JsonProperty(value = "ipAddressEntityIds", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> ipAddressEntityIds;

    /**
     * Get the dnsServerIpEntityId property: An ip entity id for the dns server resolving the request.
     *
     * @return the dnsServerIpEntityId value.
     */
    public String dnsServerIpEntityId() {
        return this.dnsServerIpEntityId;
    }

    /**
     * Get the domainName property: The name of the dns record associated with the alert.
     *
     * @return the domainName value.
     */
    public String domainName() {
        return this.domainName;
    }

    /**
     * Get the hostIpAddressEntityId property: An ip entity id for the dns request client.
     *
     * @return the hostIpAddressEntityId value.
     */
    public String hostIpAddressEntityId() {
        return this.hostIpAddressEntityId;
    }

    /**
     * Get the ipAddressEntityIds property: Ip entity identifiers for the resolved ip address.
     *
     * @return the ipAddressEntityIds value.
     */
    public List<String> ipAddressEntityIds() {
        return this.ipAddressEntityIds;
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
