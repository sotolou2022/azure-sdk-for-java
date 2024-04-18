// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.SapBWLinkedServiceTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/**
 * SAP Business Warehouse Linked Service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", defaultImpl = SapBWLinkedService.class, visible = true)
@JsonTypeName("SapBW")
@Fluent
public final class SapBWLinkedService extends LinkedService {
    /*
     * Type of linked service.
     */
    @JsonTypeId
    @JsonProperty(value = "type", required = true)
    private String type = "SapBW";

    /*
     * Properties specific to this linked service type.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private SapBWLinkedServiceTypeProperties innerTypeProperties = new SapBWLinkedServiceTypeProperties();

    /**
     * Creates an instance of SapBWLinkedService class.
     */
    public SapBWLinkedService() {
    }

    /**
     * Get the type property: Type of linked service.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the innerTypeProperties property: Properties specific to this linked service type.
     * 
     * @return the innerTypeProperties value.
     */
    private SapBWLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapBWLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapBWLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapBWLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapBWLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the server property: Host name of the SAP BW instance. Type: string (or Expression with resultType string).
     * 
     * @return the server value.
     */
    public Object server() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().server();
    }

    /**
     * Set the server property: Host name of the SAP BW instance. Type: string (or Expression with resultType string).
     * 
     * @param server the server value to set.
     * @return the SapBWLinkedService object itself.
     */
    public SapBWLinkedService withServer(Object server) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapBWLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withServer(server);
        return this;
    }

    /**
     * Get the systemNumber property: System number of the BW system. (Usually a two-digit decimal number represented as
     * a string.) Type: string (or Expression with resultType string).
     * 
     * @return the systemNumber value.
     */
    public Object systemNumber() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().systemNumber();
    }

    /**
     * Set the systemNumber property: System number of the BW system. (Usually a two-digit decimal number represented as
     * a string.) Type: string (or Expression with resultType string).
     * 
     * @param systemNumber the systemNumber value to set.
     * @return the SapBWLinkedService object itself.
     */
    public SapBWLinkedService withSystemNumber(Object systemNumber) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapBWLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withSystemNumber(systemNumber);
        return this;
    }

    /**
     * Get the clientId property: Client ID of the client on the BW system. (Usually a three-digit decimal number
     * represented as a string) Type: string (or Expression with resultType string).
     * 
     * @return the clientId value.
     */
    public Object clientId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().clientId();
    }

    /**
     * Set the clientId property: Client ID of the client on the BW system. (Usually a three-digit decimal number
     * represented as a string) Type: string (or Expression with resultType string).
     * 
     * @param clientId the clientId value to set.
     * @return the SapBWLinkedService object itself.
     */
    public SapBWLinkedService withClientId(Object clientId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapBWLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withClientId(clientId);
        return this;
    }

    /**
     * Get the username property: Username to access the SAP BW server. Type: string (or Expression with resultType
     * string).
     * 
     * @return the username value.
     */
    public Object username() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().username();
    }

    /**
     * Set the username property: Username to access the SAP BW server. Type: string (or Expression with resultType
     * string).
     * 
     * @param username the username value to set.
     * @return the SapBWLinkedService object itself.
     */
    public SapBWLinkedService withUsername(Object username) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapBWLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUsername(username);
        return this;
    }

    /**
     * Get the password property: Password to access the SAP BW server.
     * 
     * @return the password value.
     */
    public SecretBase password() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().password();
    }

    /**
     * Set the password property: Password to access the SAP BW server.
     * 
     * @param password the password value to set.
     * @return the SapBWLinkedService object itself.
     */
    public SapBWLinkedService withPassword(SecretBase password) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapBWLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withPassword(password);
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().encryptedCredential();
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the SapBWLinkedService object itself.
     */
    public SapBWLinkedService withEncryptedCredential(String encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapBWLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEncryptedCredential(encryptedCredential);
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
        if (innerTypeProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerTypeProperties in model SapBWLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SapBWLinkedService.class);
}
