// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devcenter.fluent.models.NetworkConnectionInner;
import java.util.Map;

/** An immutable client-side representation of NetworkConnection. */
public interface NetworkConnection {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the healthCheckStatus property: Overall health status of the network connection. Health checks are run on
     * creation, update, and periodically to validate the network connection.
     *
     * @return the healthCheckStatus value.
     */
    HealthCheckStatus healthCheckStatus();

    /**
     * Gets the networkingResourceGroupName property: The name for resource group where NICs will be placed.
     *
     * @return the networkingResourceGroupName value.
     */
    String networkingResourceGroupName();

    /**
     * Gets the domainJoinType property: AAD Join type.
     *
     * @return the domainJoinType value.
     */
    DomainJoinType domainJoinType();

    /**
     * Gets the subnetId property: The subnet to attach Virtual Machines to.
     *
     * @return the subnetId value.
     */
    String subnetId();

    /**
     * Gets the domainName property: Active Directory domain name.
     *
     * @return the domainName value.
     */
    String domainName();

    /**
     * Gets the organizationUnit property: Active Directory domain Organization Unit (OU).
     *
     * @return the organizationUnit value.
     */
    String organizationUnit();

    /**
     * Gets the domainUsername property: The username of an Active Directory account (user or service account) that has
     * permissions to create computer objects in Active Directory. Required format: admin@contoso.com.
     *
     * @return the domainUsername value.
     */
    String domainUsername();

    /**
     * Gets the domainPassword property: The password for the account used to join domain.
     *
     * @return the domainPassword value.
     */
    String domainPassword();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.devcenter.fluent.models.NetworkConnectionInner object.
     *
     * @return the inner object.
     */
    NetworkConnectionInner innerModel();

    /** The entirety of the NetworkConnection definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The NetworkConnection definition stages. */
    interface DefinitionStages {
        /** The first stage of the NetworkConnection definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the NetworkConnection definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the NetworkConnection definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName Name of the resource group within the Azure subscription.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the NetworkConnection definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithNetworkingResourceGroupName,
                DefinitionStages.WithDomainJoinType,
                DefinitionStages.WithSubnetId,
                DefinitionStages.WithDomainName,
                DefinitionStages.WithOrganizationUnit,
                DefinitionStages.WithDomainUsername,
                DefinitionStages.WithDomainPassword {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            NetworkConnection create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            NetworkConnection create(Context context);
        }
        /** The stage of the NetworkConnection definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the NetworkConnection definition allowing to specify networkingResourceGroupName. */
        interface WithNetworkingResourceGroupName {
            /**
             * Specifies the networkingResourceGroupName property: The name for resource group where NICs will be
             * placed..
             *
             * @param networkingResourceGroupName The name for resource group where NICs will be placed.
             * @return the next definition stage.
             */
            WithCreate withNetworkingResourceGroupName(String networkingResourceGroupName);
        }
        /** The stage of the NetworkConnection definition allowing to specify domainJoinType. */
        interface WithDomainJoinType {
            /**
             * Specifies the domainJoinType property: AAD Join type..
             *
             * @param domainJoinType AAD Join type.
             * @return the next definition stage.
             */
            WithCreate withDomainJoinType(DomainJoinType domainJoinType);
        }
        /** The stage of the NetworkConnection definition allowing to specify subnetId. */
        interface WithSubnetId {
            /**
             * Specifies the subnetId property: The subnet to attach Virtual Machines to.
             *
             * @param subnetId The subnet to attach Virtual Machines to.
             * @return the next definition stage.
             */
            WithCreate withSubnetId(String subnetId);
        }
        /** The stage of the NetworkConnection definition allowing to specify domainName. */
        interface WithDomainName {
            /**
             * Specifies the domainName property: Active Directory domain name.
             *
             * @param domainName Active Directory domain name.
             * @return the next definition stage.
             */
            WithCreate withDomainName(String domainName);
        }
        /** The stage of the NetworkConnection definition allowing to specify organizationUnit. */
        interface WithOrganizationUnit {
            /**
             * Specifies the organizationUnit property: Active Directory domain Organization Unit (OU).
             *
             * @param organizationUnit Active Directory domain Organization Unit (OU).
             * @return the next definition stage.
             */
            WithCreate withOrganizationUnit(String organizationUnit);
        }
        /** The stage of the NetworkConnection definition allowing to specify domainUsername. */
        interface WithDomainUsername {
            /**
             * Specifies the domainUsername property: The username of an Active Directory account (user or service
             * account) that has permissions to create computer objects in Active Directory. Required format:
             * admin@contoso.com..
             *
             * @param domainUsername The username of an Active Directory account (user or service account) that has
             *     permissions to create computer objects in Active Directory. Required format: admin@contoso.com.
             * @return the next definition stage.
             */
            WithCreate withDomainUsername(String domainUsername);
        }
        /** The stage of the NetworkConnection definition allowing to specify domainPassword. */
        interface WithDomainPassword {
            /**
             * Specifies the domainPassword property: The password for the account used to join domain.
             *
             * @param domainPassword The password for the account used to join domain.
             * @return the next definition stage.
             */
            WithCreate withDomainPassword(String domainPassword);
        }
    }
    /**
     * Begins update for the NetworkConnection resource.
     *
     * @return the stage of resource update.
     */
    NetworkConnection.Update update();

    /** The template for NetworkConnection update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithSubnetId,
            UpdateStages.WithDomainName,
            UpdateStages.WithOrganizationUnit,
            UpdateStages.WithDomainUsername,
            UpdateStages.WithDomainPassword {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        NetworkConnection apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        NetworkConnection apply(Context context);
    }
    /** The NetworkConnection update stages. */
    interface UpdateStages {
        /** The stage of the NetworkConnection update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the NetworkConnection update allowing to specify subnetId. */
        interface WithSubnetId {
            /**
             * Specifies the subnetId property: The subnet to attach Virtual Machines to.
             *
             * @param subnetId The subnet to attach Virtual Machines to.
             * @return the next definition stage.
             */
            Update withSubnetId(String subnetId);
        }
        /** The stage of the NetworkConnection update allowing to specify domainName. */
        interface WithDomainName {
            /**
             * Specifies the domainName property: Active Directory domain name.
             *
             * @param domainName Active Directory domain name.
             * @return the next definition stage.
             */
            Update withDomainName(String domainName);
        }
        /** The stage of the NetworkConnection update allowing to specify organizationUnit. */
        interface WithOrganizationUnit {
            /**
             * Specifies the organizationUnit property: Active Directory domain Organization Unit (OU).
             *
             * @param organizationUnit Active Directory domain Organization Unit (OU).
             * @return the next definition stage.
             */
            Update withOrganizationUnit(String organizationUnit);
        }
        /** The stage of the NetworkConnection update allowing to specify domainUsername. */
        interface WithDomainUsername {
            /**
             * Specifies the domainUsername property: The username of an Active Directory account (user or service
             * account) that has permissions to create computer objects in Active Directory. Required format:
             * admin@contoso.com..
             *
             * @param domainUsername The username of an Active Directory account (user or service account) that has
             *     permissions to create computer objects in Active Directory. Required format: admin@contoso.com.
             * @return the next definition stage.
             */
            Update withDomainUsername(String domainUsername);
        }
        /** The stage of the NetworkConnection update allowing to specify domainPassword. */
        interface WithDomainPassword {
            /**
             * Specifies the domainPassword property: The password for the account used to join domain.
             *
             * @param domainPassword The password for the account used to join domain.
             * @return the next definition stage.
             */
            Update withDomainPassword(String domainPassword);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    NetworkConnection refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    NetworkConnection refresh(Context context);

    /**
     * Triggers a new health check run. The execution and health check result can be tracked via the network Connection
     * health check details.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void runHealthChecks();

    /**
     * Triggers a new health check run. The execution and health check result can be tracked via the network Connection
     * health check details.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> runHealthChecksWithResponse(Context context);
}