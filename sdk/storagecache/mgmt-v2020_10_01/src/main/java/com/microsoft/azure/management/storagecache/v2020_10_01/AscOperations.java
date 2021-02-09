/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagecache.v2020_10_01;

import rx.Observable;
import com.microsoft.azure.management.storagecache.v2020_10_01.implementation.AscOperationsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing AscOperations.
 */
public interface AscOperations extends HasInner<AscOperationsInner> {
    /**
     * Gets the status of an asynchronous operation for the Azure HPC Cache.
     *
     * @param location The name of the region used to look up the operation.
     * @param operationId The operation id which uniquely identifies the asynchronous operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AscOperation> getAsync(String location, String operationId);

}