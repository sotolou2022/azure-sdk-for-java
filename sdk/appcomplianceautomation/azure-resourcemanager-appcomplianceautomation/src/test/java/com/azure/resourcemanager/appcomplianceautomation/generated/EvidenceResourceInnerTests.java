// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcomplianceautomation.fluent.models.EvidenceResourceInner;
import com.azure.resourcemanager.appcomplianceautomation.models.EvidenceProperties;
import com.azure.resourcemanager.appcomplianceautomation.models.EvidenceType;
import org.junit.jupiter.api.Assertions;

public final class EvidenceResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EvidenceResourceInner model = BinaryData.fromString(
            "{\"properties\":{\"evidenceType\":\"Data\",\"filePath\":\"zoggculapz\",\"extraData\":\"rpgogtqxep\",\"controlId\":\"lbfu\",\"responsibilityId\":\"lyjt\",\"provisioningState\":\"Succeeded\"},\"id\":\"qzhv\",\"name\":\"cib\",\"type\":\"fmo\"}")
            .toObject(EvidenceResourceInner.class);
        Assertions.assertEquals(EvidenceType.DATA, model.properties().evidenceType());
        Assertions.assertEquals("zoggculapz", model.properties().filePath());
        Assertions.assertEquals("rpgogtqxep", model.properties().extraData());
        Assertions.assertEquals("lbfu", model.properties().controlId());
        Assertions.assertEquals("lyjt", model.properties().responsibilityId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EvidenceResourceInner model
            = new EvidenceResourceInner().withProperties(new EvidenceProperties().withEvidenceType(EvidenceType.DATA)
                .withFilePath("zoggculapz")
                .withExtraData("rpgogtqxep")
                .withControlId("lbfu")
                .withResponsibilityId("lyjt"));
        model = BinaryData.fromObject(model).toObject(EvidenceResourceInner.class);
        Assertions.assertEquals(EvidenceType.DATA, model.properties().evidenceType());
        Assertions.assertEquals("zoggculapz", model.properties().filePath());
        Assertions.assertEquals("rpgogtqxep", model.properties().extraData());
        Assertions.assertEquals("lbfu", model.properties().controlId());
        Assertions.assertEquals("lyjt", model.properties().responsibilityId());
    }
}
