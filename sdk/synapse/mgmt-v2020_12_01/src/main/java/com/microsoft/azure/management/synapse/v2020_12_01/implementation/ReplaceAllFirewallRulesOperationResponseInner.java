/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An existing operation for replacing the firewall rules.
 */
public class ReplaceAllFirewallRulesOperationResponseInner {
    /**
     * The operation ID.
     */
    @JsonProperty(value = "operationId")
    private String operationId;

    /**
     * Get the operation ID.
     *
     * @return the operationId value
     */
    public String operationId() {
        return this.operationId;
    }

    /**
     * Set the operation ID.
     *
     * @param operationId the operationId value to set
     * @return the ReplaceAllFirewallRulesOperationResponseInner object itself.
     */
    public ReplaceAllFirewallRulesOperationResponseInner withOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

}