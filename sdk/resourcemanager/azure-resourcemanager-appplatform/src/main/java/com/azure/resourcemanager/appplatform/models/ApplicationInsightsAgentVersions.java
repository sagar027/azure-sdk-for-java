// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Application Insights agent versions properties payload. */
@Immutable
public final class ApplicationInsightsAgentVersions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationInsightsAgentVersions.class);

    /*
     * Indicates the version of application insight java agent
     */
    @JsonProperty(value = "java", access = JsonProperty.Access.WRITE_ONLY)
    private String java;

    /**
     * Get the java property: Indicates the version of application insight java agent.
     *
     * @return the java value.
     */
    public String java() {
        return this.java;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}