// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.resourcemanager.eventgrid.fluent.models.PartnerTopicInner;
import java.time.OffsetDateTime;
import java.util.Map;

/** An immutable client-side representation of PartnerTopic. */
public interface PartnerTopic {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the identity property: Identity information for the resource.
     *
     * @return the identity value.
     */
    IdentityInfo identity();

    /**
     * Gets the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the source property: Source associated with this partner topic. This represents a unique partner resource.
     *
     * @return the source value.
     */
    String source();

    /**
     * Gets the expirationTimeIfNotActivatedUtc property: Expiration time of the partner topic. If this timer expires
     * while the partner topic is still never activated, the partner topic and corresponding event channel are deleted.
     *
     * @return the expirationTimeIfNotActivatedUtc value.
     */
    OffsetDateTime expirationTimeIfNotActivatedUtc();

    /**
     * Gets the provisioningState property: Provisioning state of the partner topic.
     *
     * @return the provisioningState value.
     */
    PartnerTopicProvisioningState provisioningState();

    /**
     * Gets the activationState property: Activation state of the partner topic.
     *
     * @return the activationState value.
     */
    PartnerTopicActivationState activationState();

    /**
     * Gets the partnerTopicFriendlyDescription property: Friendly description about the topic. This can be set by the
     * publisher/partner to show custom description for the customer partner topic. This will be helpful to remove any
     * ambiguity of the origin of creation of the partner topic for the customer.
     *
     * @return the partnerTopicFriendlyDescription value.
     */
    String partnerTopicFriendlyDescription();

    /**
     * Gets the inner com.azure.resourcemanager.eventgrid.fluent.models.PartnerTopicInner object.
     *
     * @return the inner object.
     */
    PartnerTopicInner innerModel();
}