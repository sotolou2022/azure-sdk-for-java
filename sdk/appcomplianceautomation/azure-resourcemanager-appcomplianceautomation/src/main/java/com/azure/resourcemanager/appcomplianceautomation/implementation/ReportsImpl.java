// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appcomplianceautomation.fluent.ReportsClient;
import com.azure.resourcemanager.appcomplianceautomation.fluent.models.CheckNameAvailabilityResponseInner;
import com.azure.resourcemanager.appcomplianceautomation.fluent.models.ReportFixResultInner;
import com.azure.resourcemanager.appcomplianceautomation.fluent.models.ReportResourceInner;
import com.azure.resourcemanager.appcomplianceautomation.fluent.models.ReportVerificationResultInner;
import com.azure.resourcemanager.appcomplianceautomation.fluent.models.ScopingQuestionsInner;
import com.azure.resourcemanager.appcomplianceautomation.fluent.models.SyncCertRecordResponseInner;
import com.azure.resourcemanager.appcomplianceautomation.models.CheckNameAvailabilityRequest;
import com.azure.resourcemanager.appcomplianceautomation.models.CheckNameAvailabilityResponse;
import com.azure.resourcemanager.appcomplianceautomation.models.ReportFixResult;
import com.azure.resourcemanager.appcomplianceautomation.models.ReportResource;
import com.azure.resourcemanager.appcomplianceautomation.models.ReportResourcePatch;
import com.azure.resourcemanager.appcomplianceautomation.models.Reports;
import com.azure.resourcemanager.appcomplianceautomation.models.ReportVerificationResult;
import com.azure.resourcemanager.appcomplianceautomation.models.ScopingQuestions;
import com.azure.resourcemanager.appcomplianceautomation.models.SyncCertRecordRequest;
import com.azure.resourcemanager.appcomplianceautomation.models.SyncCertRecordResponse;

public final class ReportsImpl implements Reports {
    private static final ClientLogger LOGGER = new ClientLogger(ReportsImpl.class);

    private final ReportsClient innerClient;

    private final com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager serviceManager;

    public ReportsImpl(ReportsClient innerClient,
        com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<ReportResource> getWithResponse(String reportName, Context context) {
        Response<ReportResourceInner> inner = this.serviceClient().getWithResponse(reportName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ReportResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ReportResource get(String reportName) {
        ReportResourceInner inner = this.serviceClient().get(reportName);
        if (inner != null) {
            return new ReportResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ReportResource createOrUpdate(String reportName, ReportResourceInner parameters) {
        ReportResourceInner inner = this.serviceClient().createOrUpdate(reportName, parameters);
        if (inner != null) {
            return new ReportResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ReportResource createOrUpdate(String reportName, ReportResourceInner parameters, Context context) {
        ReportResourceInner inner = this.serviceClient().createOrUpdate(reportName, parameters, context);
        if (inner != null) {
            return new ReportResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ReportResource update(String reportName, ReportResourcePatch properties) {
        ReportResourceInner inner = this.serviceClient().update(reportName, properties);
        if (inner != null) {
            return new ReportResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ReportResource update(String reportName, ReportResourcePatch properties, Context context) {
        ReportResourceInner inner = this.serviceClient().update(reportName, properties, context);
        if (inner != null) {
            return new ReportResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String reportName) {
        this.serviceClient().delete(reportName);
    }

    public void delete(String reportName, Context context) {
        this.serviceClient().delete(reportName, context);
    }

    public PagedIterable<ReportResource> listByTenant() {
        PagedIterable<ReportResourceInner> inner = this.serviceClient().listByTenant();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ReportResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<ReportResource> listByTenant(String skipToken, Integer top, String select, String filter,
        String orderby, String offerGuid, String reportCreatorTenantId, Context context) {
        PagedIterable<ReportResourceInner> inner = this.serviceClient()
            .listByTenant(skipToken, top, select, filter, orderby, offerGuid, reportCreatorTenantId, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ReportResourceImpl(inner1, this.manager()));
    }

    public SyncCertRecordResponse syncCertRecord(String reportName, SyncCertRecordRequest body) {
        SyncCertRecordResponseInner inner = this.serviceClient().syncCertRecord(reportName, body);
        if (inner != null) {
            return new SyncCertRecordResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public SyncCertRecordResponse syncCertRecord(String reportName, SyncCertRecordRequest body, Context context) {
        SyncCertRecordResponseInner inner = this.serviceClient().syncCertRecord(reportName, body, context);
        if (inner != null) {
            return new SyncCertRecordResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CheckNameAvailabilityResponse> checkNameAvailabilityWithResponse(String reportName,
        CheckNameAvailabilityRequest body, Context context) {
        Response<CheckNameAvailabilityResponseInner> inner
            = this.serviceClient().checkNameAvailabilityWithResponse(reportName, body, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new CheckNameAvailabilityResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CheckNameAvailabilityResponse checkNameAvailability(String reportName, CheckNameAvailabilityRequest body) {
        CheckNameAvailabilityResponseInner inner = this.serviceClient().checkNameAvailability(reportName, body);
        if (inner != null) {
            return new CheckNameAvailabilityResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ReportFixResult fix(String reportName) {
        ReportFixResultInner inner = this.serviceClient().fix(reportName);
        if (inner != null) {
            return new ReportFixResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ReportFixResult fix(String reportName, Context context) {
        ReportFixResultInner inner = this.serviceClient().fix(reportName, context);
        if (inner != null) {
            return new ReportFixResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ScopingQuestions> getScopingQuestionsWithResponse(String reportName, Context context) {
        Response<ScopingQuestionsInner> inner
            = this.serviceClient().getScopingQuestionsWithResponse(reportName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ScopingQuestionsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ScopingQuestions getScopingQuestions(String reportName) {
        ScopingQuestionsInner inner = this.serviceClient().getScopingQuestions(reportName);
        if (inner != null) {
            return new ScopingQuestionsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ReportVerificationResult verify(String reportName) {
        ReportVerificationResultInner inner = this.serviceClient().verify(reportName);
        if (inner != null) {
            return new ReportVerificationResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ReportVerificationResult verify(String reportName, Context context) {
        ReportVerificationResultInner inner = this.serviceClient().verify(reportName, context);
        if (inner != null) {
            return new ReportVerificationResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private ReportsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager() {
        return this.serviceManager;
    }
}
