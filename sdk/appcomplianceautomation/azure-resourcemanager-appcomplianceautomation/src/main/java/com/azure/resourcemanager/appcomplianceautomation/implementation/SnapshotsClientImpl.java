// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.appcomplianceautomation.fluent.SnapshotsClient;
import com.azure.resourcemanager.appcomplianceautomation.fluent.models.DownloadResponseInner;
import com.azure.resourcemanager.appcomplianceautomation.fluent.models.SnapshotResourceInner;
import com.azure.resourcemanager.appcomplianceautomation.implementation.models.SnapshotResourceListResult;
import com.azure.resourcemanager.appcomplianceautomation.models.SnapshotDownloadRequest;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in SnapshotsClient.
 */
public final class SnapshotsClientImpl implements SnapshotsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final SnapshotsService service;

    /**
     * The service client containing this operation class.
     */
    private final AppComplianceAutomationClientImpl client;

    /**
     * Initializes an instance of SnapshotsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    SnapshotsClientImpl(AppComplianceAutomationClientImpl client) {
        this.service
            = RestProxy.create(SnapshotsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AppComplianceAutomationClientSnapshots to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "AppComplianceAutomat")
    public interface SnapshotsService {
        @Headers({ "Content-Type: application/json" })
        @Get("/providers/Microsoft.AppComplianceAutomation/reports/{reportName}/snapshots/{snapshotName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SnapshotResourceInner>> get(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("reportName") String reportName,
            @PathParam("snapshotName") String snapshotName, @HeaderParam("accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/providers/Microsoft.AppComplianceAutomation/reports/{reportName}/snapshots")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SnapshotResourceListResult>> listByReportResource(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, @QueryParam("$skipToken") String skipToken,
            @QueryParam("$top") Integer top, @QueryParam("$select") String select, @QueryParam("$filter") String filter,
            @QueryParam("$orderby") String orderby, @QueryParam("offerGuid") String offerGuid,
            @QueryParam("reportCreatorTenantId") String reportCreatorTenantId,
            @PathParam("reportName") String reportName, @HeaderParam("accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Post("/providers/Microsoft.AppComplianceAutomation/reports/{reportName}/snapshots/{snapshotName}/download")
        @ExpectedResponses({ 200, 202 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Flux<ByteBuffer>>> download(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("reportName") String reportName,
            @PathParam("snapshotName") String snapshotName, @HeaderParam("accept") String accept,
            @BodyParam("application/json") SnapshotDownloadRequest body, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SnapshotResourceListResult>> listByReportResourceNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, @HostParam("endpoint") String endpoint,
            @HeaderParam("accept") String accept, Context context);
    }

    /**
     * Get the AppComplianceAutomation snapshot and its properties.
     * 
     * @param reportName Report Name.
     * @param snapshotName Snapshot Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the AppComplianceAutomation snapshot and its properties along with {@link Response} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SnapshotResourceInner>> getWithResponseAsync(String reportName, String snapshotName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (reportName == null) {
            return Mono.error(new IllegalArgumentException("Parameter reportName is required and cannot be null."));
        }
        if (snapshotName == null) {
            return Mono.error(new IllegalArgumentException("Parameter snapshotName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), this.client.getApiVersion(), reportName,
                snapshotName, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the AppComplianceAutomation snapshot and its properties.
     * 
     * @param reportName Report Name.
     * @param snapshotName Snapshot Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the AppComplianceAutomation snapshot and its properties along with {@link Response} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SnapshotResourceInner>> getWithResponseAsync(String reportName, String snapshotName,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (reportName == null) {
            return Mono.error(new IllegalArgumentException("Parameter reportName is required and cannot be null."));
        }
        if (snapshotName == null) {
            return Mono.error(new IllegalArgumentException("Parameter snapshotName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), this.client.getApiVersion(), reportName, snapshotName, accept,
            context);
    }

    /**
     * Get the AppComplianceAutomation snapshot and its properties.
     * 
     * @param reportName Report Name.
     * @param snapshotName Snapshot Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the AppComplianceAutomation snapshot and its properties on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SnapshotResourceInner> getAsync(String reportName, String snapshotName) {
        return getWithResponseAsync(reportName, snapshotName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get the AppComplianceAutomation snapshot and its properties.
     * 
     * @param reportName Report Name.
     * @param snapshotName Snapshot Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the AppComplianceAutomation snapshot and its properties along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SnapshotResourceInner> getWithResponse(String reportName, String snapshotName, Context context) {
        return getWithResponseAsync(reportName, snapshotName, context).block();
    }

    /**
     * Get the AppComplianceAutomation snapshot and its properties.
     * 
     * @param reportName Report Name.
     * @param snapshotName Snapshot Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the AppComplianceAutomation snapshot and its properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SnapshotResourceInner get(String reportName, String snapshotName) {
        return getWithResponse(reportName, snapshotName, Context.NONE).getValue();
    }

    /**
     * Get the AppComplianceAutomation snapshot list.
     * 
     * @param reportName Report Name.
     * @param skipToken Skip over when retrieving results.
     * @param top Number of elements to return when retrieving results.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g.
     * ?$select=reportName,id.
     * @param filter The filter to apply on the operation.
     * @param orderby OData order by query option.
     * @param offerGuid The offerGuid which mapping to the reports.
     * @param reportCreatorTenantId The tenant id of the report creator.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the AppComplianceAutomation snapshot list along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SnapshotResourceInner>> listByReportResourceSinglePageAsync(String reportName,
        String skipToken, Integer top, String select, String filter, String orderby, String offerGuid,
        String reportCreatorTenantId) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (reportName == null) {
            return Mono.error(new IllegalArgumentException("Parameter reportName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listByReportResource(this.client.getEndpoint(), this.client.getApiVersion(),
                skipToken, top, select, filter, orderby, offerGuid, reportCreatorTenantId, reportName, accept, context))
            .<PagedResponse<SnapshotResourceInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the AppComplianceAutomation snapshot list.
     * 
     * @param reportName Report Name.
     * @param skipToken Skip over when retrieving results.
     * @param top Number of elements to return when retrieving results.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g.
     * ?$select=reportName,id.
     * @param filter The filter to apply on the operation.
     * @param orderby OData order by query option.
     * @param offerGuid The offerGuid which mapping to the reports.
     * @param reportCreatorTenantId The tenant id of the report creator.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the AppComplianceAutomation snapshot list along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SnapshotResourceInner>> listByReportResourceSinglePageAsync(String reportName,
        String skipToken, Integer top, String select, String filter, String orderby, String offerGuid,
        String reportCreatorTenantId, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (reportName == null) {
            return Mono.error(new IllegalArgumentException("Parameter reportName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByReportResource(this.client.getEndpoint(), this.client.getApiVersion(), skipToken, top, select,
                filter, orderby, offerGuid, reportCreatorTenantId, reportName, accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }

    /**
     * Get the AppComplianceAutomation snapshot list.
     * 
     * @param reportName Report Name.
     * @param skipToken Skip over when retrieving results.
     * @param top Number of elements to return when retrieving results.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g.
     * ?$select=reportName,id.
     * @param filter The filter to apply on the operation.
     * @param orderby OData order by query option.
     * @param offerGuid The offerGuid which mapping to the reports.
     * @param reportCreatorTenantId The tenant id of the report creator.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the AppComplianceAutomation snapshot list as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<SnapshotResourceInner> listByReportResourceAsync(String reportName, String skipToken, Integer top,
        String select, String filter, String orderby, String offerGuid, String reportCreatorTenantId) {
        return new PagedFlux<>(() -> listByReportResourceSinglePageAsync(reportName, skipToken, top, select, filter,
            orderby, offerGuid, reportCreatorTenantId), nextLink -> listByReportResourceNextSinglePageAsync(nextLink));
    }

    /**
     * Get the AppComplianceAutomation snapshot list.
     * 
     * @param reportName Report Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the AppComplianceAutomation snapshot list as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<SnapshotResourceInner> listByReportResourceAsync(String reportName) {
        final String skipToken = null;
        final Integer top = null;
        final String select = null;
        final String filter = null;
        final String orderby = null;
        final String offerGuid = null;
        final String reportCreatorTenantId = null;
        return new PagedFlux<>(() -> listByReportResourceSinglePageAsync(reportName, skipToken, top, select, filter,
            orderby, offerGuid, reportCreatorTenantId), nextLink -> listByReportResourceNextSinglePageAsync(nextLink));
    }

    /**
     * Get the AppComplianceAutomation snapshot list.
     * 
     * @param reportName Report Name.
     * @param skipToken Skip over when retrieving results.
     * @param top Number of elements to return when retrieving results.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g.
     * ?$select=reportName,id.
     * @param filter The filter to apply on the operation.
     * @param orderby OData order by query option.
     * @param offerGuid The offerGuid which mapping to the reports.
     * @param reportCreatorTenantId The tenant id of the report creator.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the AppComplianceAutomation snapshot list as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<SnapshotResourceInner> listByReportResourceAsync(String reportName, String skipToken, Integer top,
        String select, String filter, String orderby, String offerGuid, String reportCreatorTenantId, Context context) {
        return new PagedFlux<>(
            () -> listByReportResourceSinglePageAsync(reportName, skipToken, top, select, filter, orderby, offerGuid,
                reportCreatorTenantId, context),
            nextLink -> listByReportResourceNextSinglePageAsync(nextLink, context));
    }

    /**
     * Get the AppComplianceAutomation snapshot list.
     * 
     * @param reportName Report Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the AppComplianceAutomation snapshot list as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SnapshotResourceInner> listByReportResource(String reportName) {
        final String skipToken = null;
        final Integer top = null;
        final String select = null;
        final String filter = null;
        final String orderby = null;
        final String offerGuid = null;
        final String reportCreatorTenantId = null;
        return new PagedIterable<>(listByReportResourceAsync(reportName, skipToken, top, select, filter, orderby,
            offerGuid, reportCreatorTenantId));
    }

    /**
     * Get the AppComplianceAutomation snapshot list.
     * 
     * @param reportName Report Name.
     * @param skipToken Skip over when retrieving results.
     * @param top Number of elements to return when retrieving results.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g.
     * ?$select=reportName,id.
     * @param filter The filter to apply on the operation.
     * @param orderby OData order by query option.
     * @param offerGuid The offerGuid which mapping to the reports.
     * @param reportCreatorTenantId The tenant id of the report creator.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the AppComplianceAutomation snapshot list as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SnapshotResourceInner> listByReportResource(String reportName, String skipToken, Integer top,
        String select, String filter, String orderby, String offerGuid, String reportCreatorTenantId, Context context) {
        return new PagedIterable<>(listByReportResourceAsync(reportName, skipToken, top, select, filter, orderby,
            offerGuid, reportCreatorTenantId, context));
    }

    /**
     * Download compliance needs from snapshot, like: Compliance Report, Resource List.
     * 
     * @param reportName Report Name.
     * @param snapshotName Snapshot Name.
     * @param body Parameters for the query operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> downloadWithResponseAsync(String reportName, String snapshotName,
        SnapshotDownloadRequest body) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (reportName == null) {
            return Mono.error(new IllegalArgumentException("Parameter reportName is required and cannot be null."));
        }
        if (snapshotName == null) {
            return Mono.error(new IllegalArgumentException("Parameter snapshotName is required and cannot be null."));
        }
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.download(this.client.getEndpoint(), this.client.getApiVersion(), reportName,
                snapshotName, accept, body, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Download compliance needs from snapshot, like: Compliance Report, Resource List.
     * 
     * @param reportName Report Name.
     * @param snapshotName Snapshot Name.
     * @param body Parameters for the query operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> downloadWithResponseAsync(String reportName, String snapshotName,
        SnapshotDownloadRequest body, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (reportName == null) {
            return Mono.error(new IllegalArgumentException("Parameter reportName is required and cannot be null."));
        }
        if (snapshotName == null) {
            return Mono.error(new IllegalArgumentException("Parameter snapshotName is required and cannot be null."));
        }
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.download(this.client.getEndpoint(), this.client.getApiVersion(), reportName, snapshotName,
            accept, body, context);
    }

    /**
     * Download compliance needs from snapshot, like: Compliance Report, Resource List.
     * 
     * @param reportName Report Name.
     * @param snapshotName Snapshot Name.
     * @param body Parameters for the query operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<DownloadResponseInner>, DownloadResponseInner> beginDownloadAsync(String reportName,
        String snapshotName, SnapshotDownloadRequest body) {
        Mono<Response<Flux<ByteBuffer>>> mono = downloadWithResponseAsync(reportName, snapshotName, body);
        return this.client.<DownloadResponseInner, DownloadResponseInner>getLroResult(mono,
            this.client.getHttpPipeline(), DownloadResponseInner.class, DownloadResponseInner.class,
            this.client.getContext());
    }

    /**
     * Download compliance needs from snapshot, like: Compliance Report, Resource List.
     * 
     * @param reportName Report Name.
     * @param snapshotName Snapshot Name.
     * @param body Parameters for the query operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<DownloadResponseInner>, DownloadResponseInner> beginDownloadAsync(String reportName,
        String snapshotName, SnapshotDownloadRequest body, Context context) {
        context = this.client.mergeContext(context);
        Mono<Response<Flux<ByteBuffer>>> mono = downloadWithResponseAsync(reportName, snapshotName, body, context);
        return this.client.<DownloadResponseInner, DownloadResponseInner>getLroResult(mono,
            this.client.getHttpPipeline(), DownloadResponseInner.class, DownloadResponseInner.class, context);
    }

    /**
     * Download compliance needs from snapshot, like: Compliance Report, Resource List.
     * 
     * @param reportName Report Name.
     * @param snapshotName Snapshot Name.
     * @param body Parameters for the query operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<DownloadResponseInner>, DownloadResponseInner> beginDownload(String reportName,
        String snapshotName, SnapshotDownloadRequest body) {
        return this.beginDownloadAsync(reportName, snapshotName, body).getSyncPoller();
    }

    /**
     * Download compliance needs from snapshot, like: Compliance Report, Resource List.
     * 
     * @param reportName Report Name.
     * @param snapshotName Snapshot Name.
     * @param body Parameters for the query operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<DownloadResponseInner>, DownloadResponseInner> beginDownload(String reportName,
        String snapshotName, SnapshotDownloadRequest body, Context context) {
        return this.beginDownloadAsync(reportName, snapshotName, body, context).getSyncPoller();
    }

    /**
     * Download compliance needs from snapshot, like: Compliance Report, Resource List.
     * 
     * @param reportName Report Name.
     * @param snapshotName Snapshot Name.
     * @param body Parameters for the query operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<DownloadResponseInner> downloadAsync(String reportName, String snapshotName,
        SnapshotDownloadRequest body) {
        return beginDownloadAsync(reportName, snapshotName, body).last().flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Download compliance needs from snapshot, like: Compliance Report, Resource List.
     * 
     * @param reportName Report Name.
     * @param snapshotName Snapshot Name.
     * @param body Parameters for the query operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<DownloadResponseInner> downloadAsync(String reportName, String snapshotName,
        SnapshotDownloadRequest body, Context context) {
        return beginDownloadAsync(reportName, snapshotName, body, context).last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Download compliance needs from snapshot, like: Compliance Report, Resource List.
     * 
     * @param reportName Report Name.
     * @param snapshotName Snapshot Name.
     * @param body Parameters for the query operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DownloadResponseInner download(String reportName, String snapshotName, SnapshotDownloadRequest body) {
        return downloadAsync(reportName, snapshotName, body).block();
    }

    /**
     * Download compliance needs from snapshot, like: Compliance Report, Resource List.
     * 
     * @param reportName Report Name.
     * @param snapshotName Snapshot Name.
     * @param body Parameters for the query operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DownloadResponseInner download(String reportName, String snapshotName, SnapshotDownloadRequest body,
        Context context) {
        return downloadAsync(reportName, snapshotName, body, context).block();
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a SnapshotResource list operation along with {@link PagedResponse} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SnapshotResourceInner>> listByReportResourceNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.listByReportResourceNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<SnapshotResourceInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a SnapshotResource list operation along with {@link PagedResponse} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SnapshotResourceInner>> listByReportResourceNextSinglePageAsync(String nextLink,
        Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.listByReportResourceNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }
}
