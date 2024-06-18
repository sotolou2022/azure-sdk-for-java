// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.generated;

import com.azure.resourcemanager.appcomplianceautomation.fluent.models.WebhookResourceInner;
import com.azure.resourcemanager.appcomplianceautomation.models.ContentType;
import com.azure.resourcemanager.appcomplianceautomation.models.EnableSslVerification;
import com.azure.resourcemanager.appcomplianceautomation.models.NotificationEvent;
import com.azure.resourcemanager.appcomplianceautomation.models.SendAllEvents;
import com.azure.resourcemanager.appcomplianceautomation.models.UpdateWebhookKey;
import com.azure.resourcemanager.appcomplianceautomation.models.WebhookProperties;
import com.azure.resourcemanager.appcomplianceautomation.models.WebhookStatus;
import java.util.Arrays;

/**
 * Samples for Webhook CreateOrUpdate.
 */
public final class WebhookCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/appcomplianceautomation/AppComplianceAutomation.Management/examples/2024-06-27/
     * Webhook_CreateOrUpdate.json
     */
    /**
     * Sample code: Webhook_CreateOrUpdate.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void webhookCreateOrUpdate(
        com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.webhooks()
            .createOrUpdateWithResponse("testReportName", "testWebhookName",
                new WebhookResourceInner().withProperties(new WebhookProperties().withStatus(WebhookStatus.ENABLED)
                    .withSendAllEvents(SendAllEvents.FALSE)
                    .withEvents(Arrays.asList(NotificationEvent.GENERATE_SNAPSHOT_FAILED))
                    .withPayloadUrl("https://example.com")
                    .withContentType(ContentType.APPLICATION_JSON)
                    .withWebhookKey("fakeTokenPlaceholder")
                    .withUpdateWebhookKey(UpdateWebhookKey.TRUE)
                    .withEnableSslVerification(EnableSslVerification.TRUE)),
                com.azure.core.util.Context.NONE);
    }
}
