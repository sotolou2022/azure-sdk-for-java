// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcomplianceautomation.models.SnapshotProperties;

public final class SnapshotPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SnapshotProperties model = BinaryData.fromString(
            "{\"snapshotName\":\"xzvlvqhjkbegib\",\"createdAt\":\"2021-07-17T08:56:43Z\",\"provisioningState\":\"Updating\",\"reportProperties\":{\"triggerTime\":\"2021-04-16T06:52:16Z\",\"timeZone\":\"wwaloayqcgwrt\",\"resources\":[{\"resourceId\":\"uzgwyzmhtx\",\"resourceType\":\"gmtsavjcbpwxqpsr\",\"resourceKind\":\"ftguv\",\"resourceOrigin\":\"Azure\",\"accountId\":\"prwmdyvxqt\"}],\"status\":\"Failed\",\"errors\":[\"wroyqbexrmcq\"],\"tenantId\":\"ycnojvknmefqsg\",\"offerGuid\":\"ah\",\"nextTriggerTime\":\"2021-04-03T04:06:05Z\",\"lastTriggerTime\":\"2021-03-02T11:20:46Z\",\"subscriptions\":[\"vgqzcjrvxd\",\"zlmwlxkvugfhz\",\"vawjvzunlu\",\"hnnpr\"],\"complianceStatus\":{\"m365\":{\"passedCount\":1099728143,\"failedCount\":609811636,\"manualCount\":2136356878,\"notApplicableCount\":703232115,\"pendingCount\":115468496}},\"storageInfo\":{\"subscriptionId\":\"dultskz\",\"resourceGroup\":\"tdzumveekgpw\",\"accountName\":\"uh\",\"location\":\"p\"},\"certRecords\":[{\"offerGuid\":\"ofd\",\"certificationStatus\":\"uusdttouwa\",\"ingestionStatus\":\"ekqvkeln\",\"controls\":[{\"controlId\":\"xwyjsflhhc\",\"controlStatus\":\"lnjixisxya\"},{\"controlId\":\"oyaqcslyjpkiid\",\"controlStatus\":\"exznelixhnr\"},{\"controlId\":\"folhbnxknal\",\"controlStatus\":\"lp\"}]},{\"offerGuid\":\"gdtpnapnyiro\",\"certificationStatus\":\"hpigv\",\"ingestionStatus\":\"ylgqgitxmedjvcsl\",\"controls\":[{\"controlId\":\"wncwzzhxgktrmg\",\"controlStatus\":\"napkteoellw\"},{\"controlId\":\"fdygpfqbuaceopz\",\"controlStatus\":\"rhhuaopppcqeqx\"}]},{\"offerGuid\":\"z\",\"certificationStatus\":\"hzxct\",\"ingestionStatus\":\"gbkdmoizpos\",\"controls\":[{\"controlId\":\"cfbu\",\"controlStatus\":\"mfqjhhkxbp\"},{\"controlId\":\"ymjhxxjyngudivkr\",\"controlStatus\":\"wbxqzvszjfau\"}]},{\"offerGuid\":\"fdxxivetvtcqaqtd\",\"certificationStatus\":\"mcbxvwvxysl\",\"ingestionStatus\":\"hsfxoblytkb\",\"controls\":[{\"controlId\":\"wwwfbkr\",\"controlStatus\":\"nsvs\"}]}],\"provisioningState\":\"Creating\"},\"complianceResults\":[{\"complianceName\":\"rsbfovasrruvw\",\"categories\":[{\"categoryName\":\"fsubcgjbirxbpy\",\"categoryStatus\":\"Failed\",\"controlFamilies\":[{}]},{\"categoryName\":\"fdtwssotft\",\"categoryStatus\":\"NotApplicable\",\"controlFamilies\":[{},{},{},{}]},{\"categoryName\":\"xilzznf\",\"categoryStatus\":\"PendingApproval\",\"controlFamilies\":[{},{}]},{\"categoryName\":\"mqtaruoujmkcjh\",\"categoryStatus\":\"PendingApproval\",\"controlFamilies\":[{},{},{},{}]}]}]}")
            .toObject(SnapshotProperties.class);
    }
}
