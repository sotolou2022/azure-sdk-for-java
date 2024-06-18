// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appcomplianceautomation.fluent.WebhooksClient;
import com.azure.resourcemanager.appcomplianceautomation.fluent.models.WebhookResourceInner;
import com.azure.resourcemanager.appcomplianceautomation.models.WebhookResource;
import com.azure.resourcemanager.appcomplianceautomation.models.WebhookResourcePatch;
import com.azure.resourcemanager.appcomplianceautomation.models.Webhooks;

public final class WebhooksImpl implements Webhooks {
    private static final ClientLogger LOGGER = new ClientLogger(WebhooksImpl.class);

    private final WebhooksClient innerClient;

    private final com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager serviceManager;

    public WebhooksImpl(WebhooksClient innerClient,
        com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<WebhookResource> getWithResponse(String reportName, String webhookName, Context context) {
        Response<WebhookResourceInner> inner = this.serviceClient().getWithResponse(reportName, webhookName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new WebhookResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public WebhookResource get(String reportName, String webhookName) {
        WebhookResourceInner inner = this.serviceClient().get(reportName, webhookName);
        if (inner != null) {
            return new WebhookResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<WebhookResource> createOrUpdateWithResponse(String reportName, String webhookName,
        WebhookResourceInner parameters, Context context) {
        Response<WebhookResourceInner> inner
            = this.serviceClient().createOrUpdateWithResponse(reportName, webhookName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new WebhookResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public WebhookResource createOrUpdate(String reportName, String webhookName, WebhookResourceInner parameters) {
        WebhookResourceInner inner = this.serviceClient().createOrUpdate(reportName, webhookName, parameters);
        if (inner != null) {
            return new WebhookResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<WebhookResource> updateWithResponse(String reportName, String webhookName,
        WebhookResourcePatch properties, Context context) {
        Response<WebhookResourceInner> inner
            = this.serviceClient().updateWithResponse(reportName, webhookName, properties, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new WebhookResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public WebhookResource update(String reportName, String webhookName, WebhookResourcePatch properties) {
        WebhookResourceInner inner = this.serviceClient().update(reportName, webhookName, properties);
        if (inner != null) {
            return new WebhookResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteByResourceGroupWithResponse(String reportName, String webhookName, Context context) {
        return this.serviceClient().deleteWithResponse(reportName, webhookName, context);
    }

    public void deleteByResourceGroup(String reportName, String webhookName) {
        this.serviceClient().delete(reportName, webhookName);
    }

    public PagedIterable<WebhookResource> listByReportResource(String reportName) {
        PagedIterable<WebhookResourceInner> inner = this.serviceClient().listByReportResource(reportName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new WebhookResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<WebhookResource> listByReportResource(String reportName, String skipToken, Integer top,
        String select, String filter, String orderby, String offerGuid, String reportCreatorTenantId, Context context) {
        PagedIterable<WebhookResourceInner> inner = this.serviceClient()
            .listByReportResource(reportName, skipToken, top, select, filter, orderby, offerGuid, reportCreatorTenantId,
                context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new WebhookResourceImpl(inner1, this.manager()));
    }

    private WebhooksClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager() {
        return this.serviceManager;
    }
}
