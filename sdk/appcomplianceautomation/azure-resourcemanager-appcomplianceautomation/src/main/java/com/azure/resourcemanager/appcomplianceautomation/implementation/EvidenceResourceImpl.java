// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.appcomplianceautomation.fluent.models.EvidenceResourceInner;
import com.azure.resourcemanager.appcomplianceautomation.models.EvidenceProperties;
import com.azure.resourcemanager.appcomplianceautomation.models.EvidenceResource;

public final class EvidenceResourceImpl implements EvidenceResource {
    private EvidenceResourceInner innerObject;

    private final com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager serviceManager;

    EvidenceResourceImpl(EvidenceResourceInner innerObject,
        com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public EvidenceProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public EvidenceResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager() {
        return this.serviceManager;
    }
}
