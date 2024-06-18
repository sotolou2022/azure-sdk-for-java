// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcomplianceautomation.models.Recommendation;

public final class RecommendationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Recommendation model = BinaryData.fromString(
            "{\"recommendationId\":\"sxtta\",\"recommendationShortName\":\"zxnfaaz\",\"recommendationSolutions\":[{\"recommendationSolutionIndex\":\"n\",\"recommendationSolutionContent\":\"mkqjj\",\"isRecommendSolution\":\"true\"},{\"recommendationSolutionIndex\":\"nvrk\",\"recommendationSolutionContent\":\"ou\",\"isRecommendSolution\":\"true\"}]}")
            .toObject(Recommendation.class);
    }
}
