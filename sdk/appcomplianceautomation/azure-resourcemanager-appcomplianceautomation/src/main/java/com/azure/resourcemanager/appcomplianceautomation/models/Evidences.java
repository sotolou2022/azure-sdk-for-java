// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appcomplianceautomation.fluent.models.EvidenceResourceInner;

/**
 * Resource collection API of Evidences.
 */
public interface Evidences {
    /**
     * Get the evidence metadata.
     * 
     * @param reportName Report Name.
     * @param evidenceName The evidence name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the evidence metadata along with {@link Response}.
     */
    Response<EvidenceResource> getWithResponse(String reportName, String evidenceName, Context context);

    /**
     * Get the evidence metadata.
     * 
     * @param reportName Report Name.
     * @param evidenceName The evidence name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the evidence metadata.
     */
    EvidenceResource get(String reportName, String evidenceName);

    /**
     * Create or Update an evidence a specified report.
     * 
     * @param reportName Report Name.
     * @param evidenceName The evidence name.
     * @param parameters Parameters for the create or update operation.
     * @param offerGuid The offerGuid which mapping to the reports.
     * @param reportCreatorTenantId The tenant id of the report creator.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a class represent an AppComplianceAutomation evidence resource along with {@link Response}.
     */
    Response<EvidenceResource> createOrUpdateWithResponse(String reportName, String evidenceName,
        EvidenceResourceInner parameters, String offerGuid, String reportCreatorTenantId, Context context);

    /**
     * Create or Update an evidence a specified report.
     * 
     * @param reportName Report Name.
     * @param evidenceName The evidence name.
     * @param parameters Parameters for the create or update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a class represent an AppComplianceAutomation evidence resource.
     */
    EvidenceResource createOrUpdate(String reportName, String evidenceName, EvidenceResourceInner parameters);

    /**
     * Delete an existent evidence from a specified report.
     * 
     * @param reportName Report Name.
     * @param evidenceName The evidence name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByResourceGroupWithResponse(String reportName, String evidenceName, Context context);

    /**
     * Delete an existent evidence from a specified report.
     * 
     * @param reportName Report Name.
     * @param evidenceName The evidence name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String reportName, String evidenceName);

    /**
     * Returns a paginated list of evidences for a specified report.
     * 
     * @param reportName Report Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a EvidenceResource list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<EvidenceResource> listByReportResource(String reportName);

    /**
     * Returns a paginated list of evidences for a specified report.
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
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a EvidenceResource list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<EvidenceResource> listByReportResource(String reportName, String skipToken, Integer top,
        String select, String filter, String orderby, String offerGuid, String reportCreatorTenantId, Context context);

    /**
     * Download evidence file.
     * 
     * @param reportName Report Name.
     * @param evidenceName The evidence name.
     * @param body Parameters for the query operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes all the possible response for the evidence file download operation along with
     * {@link Response}.
     */
    Response<EvidenceFileDownloadResponse> downloadWithResponse(String reportName, String evidenceName,
        EvidenceFileDownloadRequest body, Context context);

    /**
     * Download evidence file.
     * 
     * @param reportName Report Name.
     * @param evidenceName The evidence name.
     * @param body Parameters for the query operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes all the possible response for the evidence file download operation.
     */
    EvidenceFileDownloadResponse download(String reportName, String evidenceName, EvidenceFileDownloadRequest body);
}
