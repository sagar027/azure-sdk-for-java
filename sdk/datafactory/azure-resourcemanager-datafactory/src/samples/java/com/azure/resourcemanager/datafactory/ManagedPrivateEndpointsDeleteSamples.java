// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory;

import com.azure.core.util.Context;

/** Samples for ManagedPrivateEndpoints Delete. */
public final class ManagedPrivateEndpointsDeleteSamples {
    /*
     * operationId: ManagedPrivateEndpoints_Delete
     * api-version: 2018-06-01
     * x-ms-examples: ManagedVirtualNetworks_Delete
     */
    /**
     * Sample code: ManagedVirtualNetworks_Delete.
     *
     * @param manager Entry point to DataFactoryManager.
     */
    public static void managedVirtualNetworksDelete(com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        manager
            .managedPrivateEndpoints()
            .deleteWithResponse(
                "exampleResourceGroup",
                "exampleFactoryName",
                "exampleManagedVirtualNetworkName",
                "exampleManagedPrivateEndpointName",
                Context.NONE);
    }
}
