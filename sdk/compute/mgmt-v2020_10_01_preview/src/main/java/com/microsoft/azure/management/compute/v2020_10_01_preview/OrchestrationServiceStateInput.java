/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The input for OrchestrationServiceState.
 */
public class OrchestrationServiceStateInput {
    /**
     * The name of the service.
     */
    @JsonProperty(value = "serviceName", required = true)
    private String serviceName;

    /**
     * The action to be performed. Possible values include: 'Resume',
     * 'Suspend'.
     */
    @JsonProperty(value = "action", required = true)
    private OrchestrationServiceStateAction action;

    /**
     * Creates an instance of OrchestrationServiceStateInput class.
     * @param action the action to be performed. Possible values include: 'Resume', 'Suspend'.
     */
    public OrchestrationServiceStateInput() {
        serviceName = "AutomaticRepairs";
    }

    /**
     * Get the name of the service.
     *
     * @return the serviceName value
     */
    public String serviceName() {
        return this.serviceName;
    }

    /**
     * Set the name of the service.
     *
     * @param serviceName the serviceName value to set
     * @return the OrchestrationServiceStateInput object itself.
     */
    public OrchestrationServiceStateInput withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Get the action to be performed. Possible values include: 'Resume', 'Suspend'.
     *
     * @return the action value
     */
    public OrchestrationServiceStateAction action() {
        return this.action;
    }

    /**
     * Set the action to be performed. Possible values include: 'Resume', 'Suspend'.
     *
     * @param action the action value to set
     * @return the OrchestrationServiceStateInput object itself.
     */
    public OrchestrationServiceStateInput withAction(OrchestrationServiceStateAction action) {
        this.action = action;
        return this;
    }

}