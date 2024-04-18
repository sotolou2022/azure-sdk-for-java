// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.MongoDbLinkedServiceTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/**
 * Linked service for MongoDb data source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", defaultImpl = MongoDbLinkedService.class, visible = true)
@JsonTypeName("MongoDb")
@Fluent
public final class MongoDbLinkedService extends LinkedService {
    /*
     * Type of linked service.
     */
    @JsonTypeId
    @JsonProperty(value = "type", required = true)
    private String type = "MongoDb";

    /*
     * MongoDB linked service properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private MongoDbLinkedServiceTypeProperties innerTypeProperties = new MongoDbLinkedServiceTypeProperties();

    /**
     * Creates an instance of MongoDbLinkedService class.
     */
    public MongoDbLinkedService() {
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
     * Get the innerTypeProperties property: MongoDB linked service properties.
     * 
     * @return the innerTypeProperties value.
     */
    private MongoDbLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MongoDbLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MongoDbLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MongoDbLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MongoDbLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the server property: The IP address or server name of the MongoDB server. Type: string (or Expression with
     * resultType string).
     * 
     * @return the server value.
     */
    public Object server() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().server();
    }

    /**
     * Set the server property: The IP address or server name of the MongoDB server. Type: string (or Expression with
     * resultType string).
     * 
     * @param server the server value to set.
     * @return the MongoDbLinkedService object itself.
     */
    public MongoDbLinkedService withServer(Object server) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new MongoDbLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withServer(server);
        return this;
    }

    /**
     * Get the authenticationType property: The authentication type to be used to connect to the MongoDB database.
     * 
     * @return the authenticationType value.
     */
    public MongoDbAuthenticationType authenticationType() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().authenticationType();
    }

    /**
     * Set the authenticationType property: The authentication type to be used to connect to the MongoDB database.
     * 
     * @param authenticationType the authenticationType value to set.
     * @return the MongoDbLinkedService object itself.
     */
    public MongoDbLinkedService withAuthenticationType(MongoDbAuthenticationType authenticationType) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new MongoDbLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAuthenticationType(authenticationType);
        return this;
    }

    /**
     * Get the databaseName property: The name of the MongoDB database that you want to access. Type: string (or
     * Expression with resultType string).
     * 
     * @return the databaseName value.
     */
    public Object databaseName() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().databaseName();
    }

    /**
     * Set the databaseName property: The name of the MongoDB database that you want to access. Type: string (or
     * Expression with resultType string).
     * 
     * @param databaseName the databaseName value to set.
     * @return the MongoDbLinkedService object itself.
     */
    public MongoDbLinkedService withDatabaseName(Object databaseName) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new MongoDbLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withDatabaseName(databaseName);
        return this;
    }

    /**
     * Get the username property: Username for authentication. Type: string (or Expression with resultType string).
     * 
     * @return the username value.
     */
    public Object username() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().username();
    }

    /**
     * Set the username property: Username for authentication. Type: string (or Expression with resultType string).
     * 
     * @param username the username value to set.
     * @return the MongoDbLinkedService object itself.
     */
    public MongoDbLinkedService withUsername(Object username) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new MongoDbLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUsername(username);
        return this;
    }

    /**
     * Get the password property: Password for authentication.
     * 
     * @return the password value.
     */
    public SecretBase password() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().password();
    }

    /**
     * Set the password property: Password for authentication.
     * 
     * @param password the password value to set.
     * @return the MongoDbLinkedService object itself.
     */
    public MongoDbLinkedService withPassword(SecretBase password) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new MongoDbLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withPassword(password);
        return this;
    }

    /**
     * Get the authSource property: Database to verify the username and password. Type: string (or Expression with
     * resultType string).
     * 
     * @return the authSource value.
     */
    public Object authSource() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().authSource();
    }

    /**
     * Set the authSource property: Database to verify the username and password. Type: string (or Expression with
     * resultType string).
     * 
     * @param authSource the authSource value to set.
     * @return the MongoDbLinkedService object itself.
     */
    public MongoDbLinkedService withAuthSource(Object authSource) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new MongoDbLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAuthSource(authSource);
        return this;
    }

    /**
     * Get the port property: The TCP port number that the MongoDB server uses to listen for client connections. The
     * default value is 27017. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     * @return the port value.
     */
    public Object port() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().port();
    }

    /**
     * Set the port property: The TCP port number that the MongoDB server uses to listen for client connections. The
     * default value is 27017. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     * @param port the port value to set.
     * @return the MongoDbLinkedService object itself.
     */
    public MongoDbLinkedService withPort(Object port) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new MongoDbLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withPort(port);
        return this;
    }

    /**
     * Get the enableSsl property: Specifies whether the connections to the server are encrypted using SSL. The default
     * value is false. Type: boolean (or Expression with resultType boolean).
     * 
     * @return the enableSsl value.
     */
    public Object enableSsl() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().enableSsl();
    }

    /**
     * Set the enableSsl property: Specifies whether the connections to the server are encrypted using SSL. The default
     * value is false. Type: boolean (or Expression with resultType boolean).
     * 
     * @param enableSsl the enableSsl value to set.
     * @return the MongoDbLinkedService object itself.
     */
    public MongoDbLinkedService withEnableSsl(Object enableSsl) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new MongoDbLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEnableSsl(enableSsl);
        return this;
    }

    /**
     * Get the allowSelfSignedServerCert property: Specifies whether to allow self-signed certificates from the server.
     * The default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     * @return the allowSelfSignedServerCert value.
     */
    public Object allowSelfSignedServerCert() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().allowSelfSignedServerCert();
    }

    /**
     * Set the allowSelfSignedServerCert property: Specifies whether to allow self-signed certificates from the server.
     * The default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     * @param allowSelfSignedServerCert the allowSelfSignedServerCert value to set.
     * @return the MongoDbLinkedService object itself.
     */
    public MongoDbLinkedService withAllowSelfSignedServerCert(Object allowSelfSignedServerCert) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new MongoDbLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAllowSelfSignedServerCert(allowSelfSignedServerCert);
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
     * @return the MongoDbLinkedService object itself.
     */
    public MongoDbLinkedService withEncryptedCredential(String encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new MongoDbLinkedServiceTypeProperties();
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
                    "Missing required property innerTypeProperties in model MongoDbLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MongoDbLinkedService.class);
}
