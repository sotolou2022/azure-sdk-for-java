// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.mobilenetwork.fluent.models.AsyncOperationStatusInner;
import com.azure.resourcemanager.mobilenetwork.fluent.models.PacketCoreControlPlaneInner;
import com.azure.resourcemanager.mobilenetwork.models.PacketCoreControlPlaneCollectDiagnosticsPackage;
import com.azure.resourcemanager.mobilenetwork.models.TagsObject;

/** An instance of this class provides access to all the operations defined in PacketCoreControlPlanesClient. */
public interface PacketCoreControlPlanesClient {
    /**
     * Deletes the specified packet core control plane.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String packetCoreControlPlaneName);

    /**
     * Deletes the specified packet core control plane.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String packetCoreControlPlaneName, Context context);

    /**
     * Deletes the specified packet core control plane.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String packetCoreControlPlaneName);

    /**
     * Deletes the specified packet core control plane.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String packetCoreControlPlaneName, Context context);

    /**
     * Gets information about the specified packet core control plane.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified packet core control plane along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PacketCoreControlPlaneInner> getByResourceGroupWithResponse(
        String resourceGroupName, String packetCoreControlPlaneName, Context context);

    /**
     * Gets information about the specified packet core control plane.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified packet core control plane.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PacketCoreControlPlaneInner getByResourceGroup(String resourceGroupName, String packetCoreControlPlaneName);

    /**
     * Creates or updates a packet core control plane.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param parameters Parameters supplied to the create or update packet core control plane operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of packet core control plane resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PacketCoreControlPlaneInner>, PacketCoreControlPlaneInner> beginCreateOrUpdate(
        String resourceGroupName, String packetCoreControlPlaneName, PacketCoreControlPlaneInner parameters);

    /**
     * Creates or updates a packet core control plane.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param parameters Parameters supplied to the create or update packet core control plane operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of packet core control plane resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PacketCoreControlPlaneInner>, PacketCoreControlPlaneInner> beginCreateOrUpdate(
        String resourceGroupName,
        String packetCoreControlPlaneName,
        PacketCoreControlPlaneInner parameters,
        Context context);

    /**
     * Creates or updates a packet core control plane.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param parameters Parameters supplied to the create or update packet core control plane operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return packet core control plane resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PacketCoreControlPlaneInner createOrUpdate(
        String resourceGroupName, String packetCoreControlPlaneName, PacketCoreControlPlaneInner parameters);

    /**
     * Creates or updates a packet core control plane.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param parameters Parameters supplied to the create or update packet core control plane operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return packet core control plane resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PacketCoreControlPlaneInner createOrUpdate(
        String resourceGroupName,
        String packetCoreControlPlaneName,
        PacketCoreControlPlaneInner parameters,
        Context context);

    /**
     * Updates packet core control planes tags.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param parameters Parameters supplied to update packet core control plane tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return packet core control plane resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PacketCoreControlPlaneInner> updateTagsWithResponse(
        String resourceGroupName, String packetCoreControlPlaneName, TagsObject parameters, Context context);

    /**
     * Updates packet core control planes tags.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param parameters Parameters supplied to update packet core control plane tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return packet core control plane resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PacketCoreControlPlaneInner updateTags(
        String resourceGroupName, String packetCoreControlPlaneName, TagsObject parameters);

    /**
     * Lists all the packet core control planes in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for packet core control planes API service call as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PacketCoreControlPlaneInner> list();

    /**
     * Lists all the packet core control planes in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for packet core control planes API service call as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PacketCoreControlPlaneInner> list(Context context);

    /**
     * Lists all the packet core control planes in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for packet core control planes API service call as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PacketCoreControlPlaneInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all the packet core control planes in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for packet core control planes API service call as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PacketCoreControlPlaneInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Roll back the specified packet core control plane to the previous version, "rollbackVersion". Multiple
     * consecutive rollbacks are not possible. This action may cause a service outage.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the current status of an async operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AsyncOperationStatusInner>, AsyncOperationStatusInner> beginRollback(
        String resourceGroupName, String packetCoreControlPlaneName);

    /**
     * Roll back the specified packet core control plane to the previous version, "rollbackVersion". Multiple
     * consecutive rollbacks are not possible. This action may cause a service outage.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the current status of an async operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AsyncOperationStatusInner>, AsyncOperationStatusInner> beginRollback(
        String resourceGroupName, String packetCoreControlPlaneName, Context context);

    /**
     * Roll back the specified packet core control plane to the previous version, "rollbackVersion". Multiple
     * consecutive rollbacks are not possible. This action may cause a service outage.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AsyncOperationStatusInner rollback(String resourceGroupName, String packetCoreControlPlaneName);

    /**
     * Roll back the specified packet core control plane to the previous version, "rollbackVersion". Multiple
     * consecutive rollbacks are not possible. This action may cause a service outage.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AsyncOperationStatusInner rollback(String resourceGroupName, String packetCoreControlPlaneName, Context context);

    /**
     * Reinstall the specified packet core control plane. This action will remove any transaction state from the packet
     * core to return it to a known state. This action will cause a service outage.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the current status of an async operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AsyncOperationStatusInner>, AsyncOperationStatusInner> beginReinstall(
        String resourceGroupName, String packetCoreControlPlaneName);

    /**
     * Reinstall the specified packet core control plane. This action will remove any transaction state from the packet
     * core to return it to a known state. This action will cause a service outage.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the current status of an async operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AsyncOperationStatusInner>, AsyncOperationStatusInner> beginReinstall(
        String resourceGroupName, String packetCoreControlPlaneName, Context context);

    /**
     * Reinstall the specified packet core control plane. This action will remove any transaction state from the packet
     * core to return it to a known state. This action will cause a service outage.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AsyncOperationStatusInner reinstall(String resourceGroupName, String packetCoreControlPlaneName);

    /**
     * Reinstall the specified packet core control plane. This action will remove any transaction state from the packet
     * core to return it to a known state. This action will cause a service outage.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AsyncOperationStatusInner reinstall(String resourceGroupName, String packetCoreControlPlaneName, Context context);

    /**
     * Collect a diagnostics package for the specified packet core control plane. This action will upload the
     * diagnostics to a storage account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param parameters Parameters supplied to the packet core control plane collect diagnostics package operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the current status of an async operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AsyncOperationStatusInner>, AsyncOperationStatusInner> beginCollectDiagnosticsPackage(
        String resourceGroupName,
        String packetCoreControlPlaneName,
        PacketCoreControlPlaneCollectDiagnosticsPackage parameters);

    /**
     * Collect a diagnostics package for the specified packet core control plane. This action will upload the
     * diagnostics to a storage account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param parameters Parameters supplied to the packet core control plane collect diagnostics package operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the current status of an async operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AsyncOperationStatusInner>, AsyncOperationStatusInner> beginCollectDiagnosticsPackage(
        String resourceGroupName,
        String packetCoreControlPlaneName,
        PacketCoreControlPlaneCollectDiagnosticsPackage parameters,
        Context context);

    /**
     * Collect a diagnostics package for the specified packet core control plane. This action will upload the
     * diagnostics to a storage account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param parameters Parameters supplied to the packet core control plane collect diagnostics package operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AsyncOperationStatusInner collectDiagnosticsPackage(
        String resourceGroupName,
        String packetCoreControlPlaneName,
        PacketCoreControlPlaneCollectDiagnosticsPackage parameters);

    /**
     * Collect a diagnostics package for the specified packet core control plane. This action will upload the
     * diagnostics to a storage account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param parameters Parameters supplied to the packet core control plane collect diagnostics package operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AsyncOperationStatusInner collectDiagnosticsPackage(
        String resourceGroupName,
        String packetCoreControlPlaneName,
        PacketCoreControlPlaneCollectDiagnosticsPackage parameters,
        Context context);
}
