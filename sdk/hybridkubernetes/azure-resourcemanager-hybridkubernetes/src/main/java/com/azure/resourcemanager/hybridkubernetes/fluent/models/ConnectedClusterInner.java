// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridkubernetes.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybridkubernetes.models.ConnectedClusterIdentity;
import com.azure.resourcemanager.hybridkubernetes.models.ConnectivityStatus;
import com.azure.resourcemanager.hybridkubernetes.models.ProvisioningState;
import com.azure.resourcemanager.hybridkubernetes.models.SystemData;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** Represents a connected cluster. */
@JsonFlatten
@Fluent
public class ConnectedClusterInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConnectedClusterInner.class);

    /*
     * The identity of the connected cluster.
     */
    @JsonProperty(value = "identity", required = true)
    private ConnectedClusterIdentity identity;

    /*
     * Metadata pertaining to creation and last modification of the resource
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * Base64 encoded public certificate used by the agent to do the initial
     * handshake to the backend services in Azure.
     */
    @JsonProperty(value = "properties.agentPublicKeyCertificate", required = true)
    private String agentPublicKeyCertificate;

    /*
     * The Kubernetes version of the connected cluster resource
     */
    @JsonProperty(value = "properties.kubernetesVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String kubernetesVersion;

    /*
     * Number of nodes present in the connected cluster resource
     */
    @JsonProperty(value = "properties.totalNodeCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer totalNodeCount;

    /*
     * Number of CPU cores present in the connected cluster resource
     */
    @JsonProperty(value = "properties.totalCoreCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer totalCoreCount;

    /*
     * Version of the agent running on the connected cluster resource
     */
    @JsonProperty(value = "properties.agentVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String agentVersion;

    /*
     * Provisioning state of the connected cluster resource.
     */
    @JsonProperty(value = "properties.provisioningState")
    private ProvisioningState provisioningState;

    /*
     * The Kubernetes distribution running on this connected cluster.
     */
    @JsonProperty(value = "properties.distribution")
    private String distribution;

    /*
     * The infrastructure on which the Kubernetes cluster represented by this
     * connected cluster is running on.
     */
    @JsonProperty(value = "properties.infrastructure")
    private String infrastructure;

    /*
     * Connected cluster offering
     */
    @JsonProperty(value = "properties.offering", access = JsonProperty.Access.WRITE_ONLY)
    private String offering;

    /*
     * Expiration time of the managed identity certificate
     */
    @JsonProperty(
        value = "properties.managedIdentityCertificateExpirationTime",
        access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime managedIdentityCertificateExpirationTime;

    /*
     * Time representing the last instance when heart beat was received from
     * the cluster
     */
    @JsonProperty(value = "properties.lastConnectivityTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastConnectivityTime;

    /*
     * Represents the connectivity status of the connected cluster.
     */
    @JsonProperty(value = "properties.connectivityStatus", access = JsonProperty.Access.WRITE_ONLY)
    private ConnectivityStatus connectivityStatus;

    /**
     * Get the identity property: The identity of the connected cluster.
     *
     * @return the identity value.
     */
    public ConnectedClusterIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the connected cluster.
     *
     * @param identity the identity value to set.
     * @return the ConnectedClusterInner object itself.
     */
    public ConnectedClusterInner withIdentity(ConnectedClusterIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the agentPublicKeyCertificate property: Base64 encoded public certificate used by the agent to do the initial
     * handshake to the backend services in Azure.
     *
     * @return the agentPublicKeyCertificate value.
     */
    public String agentPublicKeyCertificate() {
        return this.agentPublicKeyCertificate;
    }

    /**
     * Set the agentPublicKeyCertificate property: Base64 encoded public certificate used by the agent to do the initial
     * handshake to the backend services in Azure.
     *
     * @param agentPublicKeyCertificate the agentPublicKeyCertificate value to set.
     * @return the ConnectedClusterInner object itself.
     */
    public ConnectedClusterInner withAgentPublicKeyCertificate(String agentPublicKeyCertificate) {
        this.agentPublicKeyCertificate = agentPublicKeyCertificate;
        return this;
    }

    /**
     * Get the kubernetesVersion property: The Kubernetes version of the connected cluster resource.
     *
     * @return the kubernetesVersion value.
     */
    public String kubernetesVersion() {
        return this.kubernetesVersion;
    }

    /**
     * Get the totalNodeCount property: Number of nodes present in the connected cluster resource.
     *
     * @return the totalNodeCount value.
     */
    public Integer totalNodeCount() {
        return this.totalNodeCount;
    }

    /**
     * Get the totalCoreCount property: Number of CPU cores present in the connected cluster resource.
     *
     * @return the totalCoreCount value.
     */
    public Integer totalCoreCount() {
        return this.totalCoreCount;
    }

    /**
     * Get the agentVersion property: Version of the agent running on the connected cluster resource.
     *
     * @return the agentVersion value.
     */
    public String agentVersion() {
        return this.agentVersion;
    }

    /**
     * Get the provisioningState property: Provisioning state of the connected cluster resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Provisioning state of the connected cluster resource.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the ConnectedClusterInner object itself.
     */
    public ConnectedClusterInner withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the distribution property: The Kubernetes distribution running on this connected cluster.
     *
     * @return the distribution value.
     */
    public String distribution() {
        return this.distribution;
    }

    /**
     * Set the distribution property: The Kubernetes distribution running on this connected cluster.
     *
     * @param distribution the distribution value to set.
     * @return the ConnectedClusterInner object itself.
     */
    public ConnectedClusterInner withDistribution(String distribution) {
        this.distribution = distribution;
        return this;
    }

    /**
     * Get the infrastructure property: The infrastructure on which the Kubernetes cluster represented by this connected
     * cluster is running on.
     *
     * @return the infrastructure value.
     */
    public String infrastructure() {
        return this.infrastructure;
    }

    /**
     * Set the infrastructure property: The infrastructure on which the Kubernetes cluster represented by this connected
     * cluster is running on.
     *
     * @param infrastructure the infrastructure value to set.
     * @return the ConnectedClusterInner object itself.
     */
    public ConnectedClusterInner withInfrastructure(String infrastructure) {
        this.infrastructure = infrastructure;
        return this;
    }

    /**
     * Get the offering property: Connected cluster offering.
     *
     * @return the offering value.
     */
    public String offering() {
        return this.offering;
    }

    /**
     * Get the managedIdentityCertificateExpirationTime property: Expiration time of the managed identity certificate.
     *
     * @return the managedIdentityCertificateExpirationTime value.
     */
    public OffsetDateTime managedIdentityCertificateExpirationTime() {
        return this.managedIdentityCertificateExpirationTime;
    }

    /**
     * Get the lastConnectivityTime property: Time representing the last instance when heart beat was received from the
     * cluster.
     *
     * @return the lastConnectivityTime value.
     */
    public OffsetDateTime lastConnectivityTime() {
        return this.lastConnectivityTime;
    }

    /**
     * Get the connectivityStatus property: Represents the connectivity status of the connected cluster.
     *
     * @return the connectivityStatus value.
     */
    public ConnectivityStatus connectivityStatus() {
        return this.connectivityStatus;
    }

    /** {@inheritDoc} */
    @Override
    public ConnectedClusterInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ConnectedClusterInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property identity in model ConnectedClusterInner"));
        } else {
            identity().validate();
        }
        if (systemData() != null) {
            systemData().validate();
        }
        if (agentPublicKeyCertificate() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property agentPublicKeyCertificate in model ConnectedClusterInner"));
        }
    }
}