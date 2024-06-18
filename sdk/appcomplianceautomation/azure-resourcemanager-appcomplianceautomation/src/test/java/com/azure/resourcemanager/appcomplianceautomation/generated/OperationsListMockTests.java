// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager;
import com.azure.resourcemanager.appcomplianceautomation.models.ActionType;
import com.azure.resourcemanager.appcomplianceautomation.models.Operation;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class OperationsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"name\":\"xqbawpc\",\"isDataAction\":false,\"display\":{\"provider\":\"cyknapqofyuicd\",\"resource\":\"bd\",\"operation\":\"wwgbdv\",\"description\":\"idmhmwf\"},\"origin\":\"user,system\",\"actionType\":\"Internal\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        AppComplianceAutomationManager manager = AppComplianceAutomationManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Operation> response = manager.operations().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("cyknapqofyuicd", response.iterator().next().display().provider());
        Assertions.assertEquals("bd", response.iterator().next().display().resource());
        Assertions.assertEquals("wwgbdv", response.iterator().next().display().operation());
        Assertions.assertEquals("idmhmwf", response.iterator().next().display().description());
        Assertions.assertEquals(ActionType.INTERNAL, response.iterator().next().actionType());
    }
}
