// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.workloads.WorkloadsManager;
import com.azure.resourcemanager.workloads.models.SapCentralServerInstance;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class SapCentralInstancesListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"instanceNo\":\"actxmwoteyowc\",\"subnet\":\"qovekqvgqou\",\"messageServerProperties\":{\"msPort\":8149113417599660646,\"internalMsPort\":825128842505011666,\"httpPort\":2552849107764611056,\"httpsPort\":2912455516432354405,\"hostname\":\"xcvhrfs\",\"ipAddress\":\"uagrttikteusqc\",\"health\":\"Healthy\"},\"enqueueServerProperties\":{\"hostname\":\"lxubyj\",\"ipAddress\":\"fmmfblcqcu\",\"port\":5812695396560817956,\"health\":\"Unknown\"},\"gatewayServerProperties\":{\"port\":323149241327703760,\"health\":\"Degraded\"},\"enqueueReplicationServerProperties\":{\"ersVersion\":\"EnqueueReplicator1\",\"instanceNo\":\"gdslqxihhrmoo\",\"hostname\":\"qseypxiutcxa\",\"kernelVersion\":\"hyrpetogebjoxs\",\"kernelPatch\":\"vnh\",\"ipAddress\":\"brqnkkzjcjb\",\"health\":\"Degraded\"},\"kernelVersion\":\"ehvvib\",\"kernelPatch\":\"jj\",\"loadBalancerDetails\":{\"id\":\"qbeitpkxztmoob\"},\"vmDetails\":[],\"status\":\"SoftShutdown\",\"health\":\"Degraded\",\"provisioningState\":\"Deleting\",\"errors\":{}},\"location\":\"pimaqxzhemjyh\",\"tags\":{\"lkb\":\"jswtwkozzwc\"},\"id\":\"wpfaj\",\"name\":\"jwltlwtjjgu\",\"type\":\"talhsnvkcdmxzr\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        WorkloadsManager manager =
            WorkloadsManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<SapCentralServerInstance> response =
            manager.sapCentralInstances().list("ihlhzdsqtzb", "rgnowcjhfgm", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("pimaqxzhemjyh", response.iterator().next().location());
        Assertions.assertEquals("jswtwkozzwc", response.iterator().next().tags().get("lkb"));
    }
}
