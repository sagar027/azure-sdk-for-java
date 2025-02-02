// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory;

import com.azure.core.util.Context;

/** Samples for Datasets Get. */
public final class DatasetsGetSamples {
    /*
     * operationId: Datasets_Get
     * api-version: 2018-06-01
     * x-ms-examples: Datasets_Get
     */
    /**
     * Sample code: Datasets_Get.
     *
     * @param manager Entry point to DataFactoryManager.
     */
    public static void datasetsGet(com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        manager
            .datasets()
            .getWithResponse("exampleResourceGroup", "exampleFactoryName", "exampleDataset", null, Context.NONE);
    }
}
