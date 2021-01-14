/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01;

import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.network.v2020_08_01.implementation.ApplicationGatewayPrivateEndpointConnectionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ApplicationGatewayPrivateEndpointConnections.
 */
public interface ApplicationGatewayPrivateEndpointConnections extends HasInner<ApplicationGatewayPrivateEndpointConnectionsInner> {
    /**
     * Gets the specified private endpoint connection on application gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @param connectionName The name of the application gateway private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ApplicationGatewayPrivateEndpointConnection> getAsync(String resourceGroupName, String applicationGatewayName, String connectionName);

    /**
     * Lists all private endpoint connections on an application gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ApplicationGatewayPrivateEndpointConnection> listAsync(final String resourceGroupName, final String applicationGatewayName);

    /**
     * Deletes the specified private endpoint connection on application gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @param connectionName The name of the application gateway private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String applicationGatewayName, String connectionName);

}