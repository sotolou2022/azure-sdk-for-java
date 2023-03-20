// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.reservations.fluent.models.PurchaseRequestProperties;
import com.azure.resourcemanager.reservations.models.AppliedScopeProperties;
import com.azure.resourcemanager.reservations.models.AppliedScopeType;
import com.azure.resourcemanager.reservations.models.InstanceFlexibility;
import com.azure.resourcemanager.reservations.models.PurchaseRequestPropertiesReservedResourceProperties;
import com.azure.resourcemanager.reservations.models.ReservationBillingPlan;
import com.azure.resourcemanager.reservations.models.ReservationTerm;
import com.azure.resourcemanager.reservations.models.ReservedResourceType;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PurchaseRequestPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PurchaseRequestProperties model =
            BinaryData
                .fromString(
                    "{\"reservedResourceType\":\"SapHana\",\"billingScopeId\":\"kvwrwjfeu\",\"term\":\"P5Y\",\"billingPlan\":\"Upfront\",\"quantity\":1936335434,\"displayName\":\"tmrldhugjzzdatq\",\"appliedScopeType\":\"ManagementGroup\",\"appliedScopes\":[\"geablgphuticndvk\",\"ozwyiftyhxhuro\",\"ftyxolniw\"],\"appliedScopeProperties\":{\"tenantId\":\"ukjfkgiawxklr\",\"managementGroupId\":\"lwckbasyypnddhs\",\"subscriptionId\":\"bacphejko\",\"resourceGroupId\":\"nqgoulzndli\",\"displayName\":\"yqkgfg\"},\"renew\":true,\"reservedResourceProperties\":{\"instanceFlexibility\":\"On\"},\"reviewDateTime\":\"2021-09-02T02:02:12Z\"}")
                .toObject(PurchaseRequestProperties.class);
        Assertions.assertEquals(ReservedResourceType.SAP_HANA, model.reservedResourceType());
        Assertions.assertEquals("kvwrwjfeu", model.billingScopeId());
        Assertions.assertEquals(ReservationTerm.P5Y, model.term());
        Assertions.assertEquals(ReservationBillingPlan.UPFRONT, model.billingPlan());
        Assertions.assertEquals(1936335434, model.quantity());
        Assertions.assertEquals("tmrldhugjzzdatq", model.displayName());
        Assertions.assertEquals(AppliedScopeType.MANAGEMENT_GROUP, model.appliedScopeType());
        Assertions.assertEquals("geablgphuticndvk", model.appliedScopes().get(0));
        Assertions.assertEquals("ukjfkgiawxklr", model.appliedScopeProperties().tenantId());
        Assertions.assertEquals("lwckbasyypnddhs", model.appliedScopeProperties().managementGroupId());
        Assertions.assertEquals("bacphejko", model.appliedScopeProperties().subscriptionId());
        Assertions.assertEquals("nqgoulzndli", model.appliedScopeProperties().resourceGroupId());
        Assertions.assertEquals("yqkgfg", model.appliedScopeProperties().displayName());
        Assertions.assertEquals(true, model.renew());
        Assertions.assertEquals(InstanceFlexibility.ON, model.reservedResourceProperties().instanceFlexibility());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-02T02:02:12Z"), model.reviewDateTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PurchaseRequestProperties model =
            new PurchaseRequestProperties()
                .withReservedResourceType(ReservedResourceType.SAP_HANA)
                .withBillingScopeId("kvwrwjfeu")
                .withTerm(ReservationTerm.P5Y)
                .withBillingPlan(ReservationBillingPlan.UPFRONT)
                .withQuantity(1936335434)
                .withDisplayName("tmrldhugjzzdatq")
                .withAppliedScopeType(AppliedScopeType.MANAGEMENT_GROUP)
                .withAppliedScopes(Arrays.asList("geablgphuticndvk", "ozwyiftyhxhuro", "ftyxolniw"))
                .withAppliedScopeProperties(
                    new AppliedScopeProperties()
                        .withTenantId("ukjfkgiawxklr")
                        .withManagementGroupId("lwckbasyypnddhs")
                        .withSubscriptionId("bacphejko")
                        .withResourceGroupId("nqgoulzndli")
                        .withDisplayName("yqkgfg"))
                .withRenew(true)
                .withReservedResourceProperties(
                    new PurchaseRequestPropertiesReservedResourceProperties()
                        .withInstanceFlexibility(InstanceFlexibility.ON))
                .withReviewDateTime(OffsetDateTime.parse("2021-09-02T02:02:12Z"));
        model = BinaryData.fromObject(model).toObject(PurchaseRequestProperties.class);
        Assertions.assertEquals(ReservedResourceType.SAP_HANA, model.reservedResourceType());
        Assertions.assertEquals("kvwrwjfeu", model.billingScopeId());
        Assertions.assertEquals(ReservationTerm.P5Y, model.term());
        Assertions.assertEquals(ReservationBillingPlan.UPFRONT, model.billingPlan());
        Assertions.assertEquals(1936335434, model.quantity());
        Assertions.assertEquals("tmrldhugjzzdatq", model.displayName());
        Assertions.assertEquals(AppliedScopeType.MANAGEMENT_GROUP, model.appliedScopeType());
        Assertions.assertEquals("geablgphuticndvk", model.appliedScopes().get(0));
        Assertions.assertEquals("ukjfkgiawxklr", model.appliedScopeProperties().tenantId());
        Assertions.assertEquals("lwckbasyypnddhs", model.appliedScopeProperties().managementGroupId());
        Assertions.assertEquals("bacphejko", model.appliedScopeProperties().subscriptionId());
        Assertions.assertEquals("nqgoulzndli", model.appliedScopeProperties().resourceGroupId());
        Assertions.assertEquals("yqkgfg", model.appliedScopeProperties().displayName());
        Assertions.assertEquals(true, model.renew());
        Assertions.assertEquals(InstanceFlexibility.ON, model.reservedResourceProperties().instanceFlexibility());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-02T02:02:12Z"), model.reviewDateTime());
    }
}
