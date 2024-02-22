// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.SupportedOperatingSystemsOperationsClient;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.SupportedOperatingSystemsInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.SupportedOperatingSystems;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.SupportedOperatingSystemsOperations;

public final class SupportedOperatingSystemsOperationsImpl implements SupportedOperatingSystemsOperations {
    private static final ClientLogger LOGGER = new ClientLogger(SupportedOperatingSystemsOperationsImpl.class);

    private final SupportedOperatingSystemsOperationsClient innerClient;

    private final com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager;

    public SupportedOperatingSystemsOperationsImpl(SupportedOperatingSystemsOperationsClient innerClient,
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<SupportedOperatingSystems> getWithResponse(String resourceName, String resourceGroupName,
        String instanceType, Context context) {
        Response<SupportedOperatingSystemsInner> inner
            = this.serviceClient().getWithResponse(resourceName, resourceGroupName, instanceType, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new SupportedOperatingSystemsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SupportedOperatingSystems get(String resourceName, String resourceGroupName) {
        SupportedOperatingSystemsInner inner = this.serviceClient().get(resourceName, resourceGroupName);
        if (inner != null) {
            return new SupportedOperatingSystemsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private SupportedOperatingSystemsOperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager() {
        return this.serviceManager;
    }
}
