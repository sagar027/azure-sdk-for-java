// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** Collection of extensionProperty. */
@Fluent
public final class CollectionOfExtensionProperty {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CollectionOfExtensionProperty.class);

    /*
     * The value property.
     */
    @JsonProperty(value = "value")
    private List<MicrosoftGraphExtensionPropertyInner> value;

    /*
     * The @odata.nextLink property.
     */
    @JsonProperty(value = "@odata.nextLink")
    private String odataNextLink;

    /*
     * Collection of extensionProperty
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the value property: The value property.
     *
     * @return the value value.
     */
    public List<MicrosoftGraphExtensionPropertyInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     *
     * @param value the value value to set.
     * @return the CollectionOfExtensionProperty object itself.
     */
    public CollectionOfExtensionProperty withValue(List<MicrosoftGraphExtensionPropertyInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the odataNextLink property: The @odata.nextLink property.
     *
     * @return the odataNextLink value.
     */
    public String odataNextLink() {
        return this.odataNextLink;
    }

    /**
     * Set the odataNextLink property: The @odata.nextLink property.
     *
     * @param odataNextLink the odataNextLink value to set.
     * @return the CollectionOfExtensionProperty object itself.
     */
    public CollectionOfExtensionProperty withOdataNextLink(String odataNextLink) {
        this.odataNextLink = odataNextLink;
        return this;
    }

    /**
     * Get the additionalProperties property: Collection of extensionProperty.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Collection of extensionProperty.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the CollectionOfExtensionProperty object itself.
     */
    public CollectionOfExtensionProperty withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}