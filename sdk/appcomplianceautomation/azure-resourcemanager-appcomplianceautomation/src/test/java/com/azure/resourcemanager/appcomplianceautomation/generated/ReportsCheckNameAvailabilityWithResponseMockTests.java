// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager;
import com.azure.resourcemanager.appcomplianceautomation.models.CheckNameAvailabilityReason;
import com.azure.resourcemanager.appcomplianceautomation.models.CheckNameAvailabilityRequest;
import com.azure.resourcemanager.appcomplianceautomation.models.CheckNameAvailabilityResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ReportsCheckNameAvailabilityWithResponseMockTests {
    @Test
    public void testCheckNameAvailabilityWithResponse() throws Exception {
        String responseStr = "{\"nameAvailable\":true,\"reason\":\"AlreadyExists\",\"message\":\"xynl\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        AppComplianceAutomationManager manager = AppComplianceAutomationManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        CheckNameAvailabilityResponse response = manager.reports()
            .checkNameAvailabilityWithResponse("maxriz",
                new CheckNameAvailabilityRequest().withName("obgop").withType("hsln"), com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals(true, response.nameAvailable());
        Assertions.assertEquals(CheckNameAvailabilityReason.ALREADY_EXISTS, response.reason());
        Assertions.assertEquals("xynl", response.message());
    }
}
