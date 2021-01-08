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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Represents an Azure Active Directory object. The directoryObject type is the base type for many other directory
 * entity types.
 */
@Fluent
public final class MicrosoftGraphOrgContactInner extends MicrosoftGraphDirectoryObjectInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphOrgContactInner.class);

    /*
     * The addresses property.
     */
    @JsonProperty(value = "addresses")
    private List<MicrosoftGraphPhysicalOfficeAddress> addresses;

    /*
     * The companyName property.
     */
    @JsonProperty(value = "companyName")
    private String companyName;

    /*
     * The department property.
     */
    @JsonProperty(value = "department")
    private String department;

    /*
     * The displayName property.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The givenName property.
     */
    @JsonProperty(value = "givenName")
    private String givenName;

    /*
     * The jobTitle property.
     */
    @JsonProperty(value = "jobTitle")
    private String jobTitle;

    /*
     * The mail property.
     */
    @JsonProperty(value = "mail")
    private String mail;

    /*
     * The mailNickname property.
     */
    @JsonProperty(value = "mailNickname")
    private String mailNickname;

    /*
     * The onPremisesLastSyncDateTime property.
     */
    @JsonProperty(value = "onPremisesLastSyncDateTime")
    private OffsetDateTime onPremisesLastSyncDateTime;

    /*
     * The onPremisesProvisioningErrors property.
     */
    @JsonProperty(value = "onPremisesProvisioningErrors")
    private List<MicrosoftGraphOnPremisesProvisioningError> onPremisesProvisioningErrors;

    /*
     * The onPremisesSyncEnabled property.
     */
    @JsonProperty(value = "onPremisesSyncEnabled")
    private Boolean onPremisesSyncEnabled;

    /*
     * The phones property.
     */
    @JsonProperty(value = "phones")
    private List<MicrosoftGraphPhone> phones;

    /*
     * The proxyAddresses property.
     */
    @JsonProperty(value = "proxyAddresses")
    private List<String> proxyAddresses;

    /*
     * The surname property.
     */
    @JsonProperty(value = "surname")
    private String surname;

    /*
     * The directReports property.
     */
    @JsonProperty(value = "directReports")
    private List<MicrosoftGraphDirectoryObjectInner> directReports;

    /*
     * Represents an Azure Active Directory object. The directoryObject type is
     * the base type for many other directory entity types.
     */
    @JsonProperty(value = "manager")
    private MicrosoftGraphDirectoryObjectInner manager;

    /*
     * The memberOf property.
     */
    @JsonProperty(value = "memberOf")
    private List<MicrosoftGraphDirectoryObjectInner> memberOf;

    /*
     * The transitiveMemberOf property.
     */
    @JsonProperty(value = "transitiveMemberOf")
    private List<MicrosoftGraphDirectoryObjectInner> transitiveMemberOf;

    /*
     * Represents an Azure Active Directory object. The directoryObject type is
     * the base type for many other directory entity types.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the addresses property: The addresses property.
     *
     * @return the addresses value.
     */
    public List<MicrosoftGraphPhysicalOfficeAddress> addresses() {
        return this.addresses;
    }

    /**
     * Set the addresses property: The addresses property.
     *
     * @param addresses the addresses value to set.
     * @return the MicrosoftGraphOrgContactInner object itself.
     */
    public MicrosoftGraphOrgContactInner withAddresses(List<MicrosoftGraphPhysicalOfficeAddress> addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     * Get the companyName property: The companyName property.
     *
     * @return the companyName value.
     */
    public String companyName() {
        return this.companyName;
    }

    /**
     * Set the companyName property: The companyName property.
     *
     * @param companyName the companyName value to set.
     * @return the MicrosoftGraphOrgContactInner object itself.
     */
    public MicrosoftGraphOrgContactInner withCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    /**
     * Get the department property: The department property.
     *
     * @return the department value.
     */
    public String department() {
        return this.department;
    }

    /**
     * Set the department property: The department property.
     *
     * @param department the department value to set.
     * @return the MicrosoftGraphOrgContactInner object itself.
     */
    public MicrosoftGraphOrgContactInner withDepartment(String department) {
        this.department = department;
        return this;
    }

    /**
     * Get the displayName property: The displayName property.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The displayName property.
     *
     * @param displayName the displayName value to set.
     * @return the MicrosoftGraphOrgContactInner object itself.
     */
    public MicrosoftGraphOrgContactInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the givenName property: The givenName property.
     *
     * @return the givenName value.
     */
    public String givenName() {
        return this.givenName;
    }

    /**
     * Set the givenName property: The givenName property.
     *
     * @param givenName the givenName value to set.
     * @return the MicrosoftGraphOrgContactInner object itself.
     */
    public MicrosoftGraphOrgContactInner withGivenName(String givenName) {
        this.givenName = givenName;
        return this;
    }

    /**
     * Get the jobTitle property: The jobTitle property.
     *
     * @return the jobTitle value.
     */
    public String jobTitle() {
        return this.jobTitle;
    }

    /**
     * Set the jobTitle property: The jobTitle property.
     *
     * @param jobTitle the jobTitle value to set.
     * @return the MicrosoftGraphOrgContactInner object itself.
     */
    public MicrosoftGraphOrgContactInner withJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    /**
     * Get the mail property: The mail property.
     *
     * @return the mail value.
     */
    public String mail() {
        return this.mail;
    }

    /**
     * Set the mail property: The mail property.
     *
     * @param mail the mail value to set.
     * @return the MicrosoftGraphOrgContactInner object itself.
     */
    public MicrosoftGraphOrgContactInner withMail(String mail) {
        this.mail = mail;
        return this;
    }

    /**
     * Get the mailNickname property: The mailNickname property.
     *
     * @return the mailNickname value.
     */
    public String mailNickname() {
        return this.mailNickname;
    }

    /**
     * Set the mailNickname property: The mailNickname property.
     *
     * @param mailNickname the mailNickname value to set.
     * @return the MicrosoftGraphOrgContactInner object itself.
     */
    public MicrosoftGraphOrgContactInner withMailNickname(String mailNickname) {
        this.mailNickname = mailNickname;
        return this;
    }

    /**
     * Get the onPremisesLastSyncDateTime property: The onPremisesLastSyncDateTime property.
     *
     * @return the onPremisesLastSyncDateTime value.
     */
    public OffsetDateTime onPremisesLastSyncDateTime() {
        return this.onPremisesLastSyncDateTime;
    }

    /**
     * Set the onPremisesLastSyncDateTime property: The onPremisesLastSyncDateTime property.
     *
     * @param onPremisesLastSyncDateTime the onPremisesLastSyncDateTime value to set.
     * @return the MicrosoftGraphOrgContactInner object itself.
     */
    public MicrosoftGraphOrgContactInner withOnPremisesLastSyncDateTime(OffsetDateTime onPremisesLastSyncDateTime) {
        this.onPremisesLastSyncDateTime = onPremisesLastSyncDateTime;
        return this;
    }

    /**
     * Get the onPremisesProvisioningErrors property: The onPremisesProvisioningErrors property.
     *
     * @return the onPremisesProvisioningErrors value.
     */
    public List<MicrosoftGraphOnPremisesProvisioningError> onPremisesProvisioningErrors() {
        return this.onPremisesProvisioningErrors;
    }

    /**
     * Set the onPremisesProvisioningErrors property: The onPremisesProvisioningErrors property.
     *
     * @param onPremisesProvisioningErrors the onPremisesProvisioningErrors value to set.
     * @return the MicrosoftGraphOrgContactInner object itself.
     */
    public MicrosoftGraphOrgContactInner withOnPremisesProvisioningErrors(
        List<MicrosoftGraphOnPremisesProvisioningError> onPremisesProvisioningErrors) {
        this.onPremisesProvisioningErrors = onPremisesProvisioningErrors;
        return this;
    }

    /**
     * Get the onPremisesSyncEnabled property: The onPremisesSyncEnabled property.
     *
     * @return the onPremisesSyncEnabled value.
     */
    public Boolean onPremisesSyncEnabled() {
        return this.onPremisesSyncEnabled;
    }

    /**
     * Set the onPremisesSyncEnabled property: The onPremisesSyncEnabled property.
     *
     * @param onPremisesSyncEnabled the onPremisesSyncEnabled value to set.
     * @return the MicrosoftGraphOrgContactInner object itself.
     */
    public MicrosoftGraphOrgContactInner withOnPremisesSyncEnabled(Boolean onPremisesSyncEnabled) {
        this.onPremisesSyncEnabled = onPremisesSyncEnabled;
        return this;
    }

    /**
     * Get the phones property: The phones property.
     *
     * @return the phones value.
     */
    public List<MicrosoftGraphPhone> phones() {
        return this.phones;
    }

    /**
     * Set the phones property: The phones property.
     *
     * @param phones the phones value to set.
     * @return the MicrosoftGraphOrgContactInner object itself.
     */
    public MicrosoftGraphOrgContactInner withPhones(List<MicrosoftGraphPhone> phones) {
        this.phones = phones;
        return this;
    }

    /**
     * Get the proxyAddresses property: The proxyAddresses property.
     *
     * @return the proxyAddresses value.
     */
    public List<String> proxyAddresses() {
        return this.proxyAddresses;
    }

    /**
     * Set the proxyAddresses property: The proxyAddresses property.
     *
     * @param proxyAddresses the proxyAddresses value to set.
     * @return the MicrosoftGraphOrgContactInner object itself.
     */
    public MicrosoftGraphOrgContactInner withProxyAddresses(List<String> proxyAddresses) {
        this.proxyAddresses = proxyAddresses;
        return this;
    }

    /**
     * Get the surname property: The surname property.
     *
     * @return the surname value.
     */
    public String surname() {
        return this.surname;
    }

    /**
     * Set the surname property: The surname property.
     *
     * @param surname the surname value to set.
     * @return the MicrosoftGraphOrgContactInner object itself.
     */
    public MicrosoftGraphOrgContactInner withSurname(String surname) {
        this.surname = surname;
        return this;
    }

    /**
     * Get the directReports property: The directReports property.
     *
     * @return the directReports value.
     */
    public List<MicrosoftGraphDirectoryObjectInner> directReports() {
        return this.directReports;
    }

    /**
     * Set the directReports property: The directReports property.
     *
     * @param directReports the directReports value to set.
     * @return the MicrosoftGraphOrgContactInner object itself.
     */
    public MicrosoftGraphOrgContactInner withDirectReports(List<MicrosoftGraphDirectoryObjectInner> directReports) {
        this.directReports = directReports;
        return this;
    }

    /**
     * Get the manager property: Represents an Azure Active Directory object. The directoryObject type is the base type
     * for many other directory entity types.
     *
     * @return the manager value.
     */
    public MicrosoftGraphDirectoryObjectInner manager() {
        return this.manager;
    }

    /**
     * Set the manager property: Represents an Azure Active Directory object. The directoryObject type is the base type
     * for many other directory entity types.
     *
     * @param manager the manager value to set.
     * @return the MicrosoftGraphOrgContactInner object itself.
     */
    public MicrosoftGraphOrgContactInner withManager(MicrosoftGraphDirectoryObjectInner manager) {
        this.manager = manager;
        return this;
    }

    /**
     * Get the memberOf property: The memberOf property.
     *
     * @return the memberOf value.
     */
    public List<MicrosoftGraphDirectoryObjectInner> memberOf() {
        return this.memberOf;
    }

    /**
     * Set the memberOf property: The memberOf property.
     *
     * @param memberOf the memberOf value to set.
     * @return the MicrosoftGraphOrgContactInner object itself.
     */
    public MicrosoftGraphOrgContactInner withMemberOf(List<MicrosoftGraphDirectoryObjectInner> memberOf) {
        this.memberOf = memberOf;
        return this;
    }

    /**
     * Get the transitiveMemberOf property: The transitiveMemberOf property.
     *
     * @return the transitiveMemberOf value.
     */
    public List<MicrosoftGraphDirectoryObjectInner> transitiveMemberOf() {
        return this.transitiveMemberOf;
    }

    /**
     * Set the transitiveMemberOf property: The transitiveMemberOf property.
     *
     * @param transitiveMemberOf the transitiveMemberOf value to set.
     * @return the MicrosoftGraphOrgContactInner object itself.
     */
    public MicrosoftGraphOrgContactInner withTransitiveMemberOf(
        List<MicrosoftGraphDirectoryObjectInner> transitiveMemberOf) {
        this.transitiveMemberOf = transitiveMemberOf;
        return this;
    }

    /**
     * Get the additionalProperties property: Represents an Azure Active Directory object. The directoryObject type is
     * the base type for many other directory entity types.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Represents an Azure Active Directory object. The directoryObject type is
     * the base type for many other directory entity types.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphOrgContactInner object itself.
     */
    public MicrosoftGraphOrgContactInner withAdditionalProperties(Map<String, Object> additionalProperties) {
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

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphOrgContactInner withDeletedDateTime(OffsetDateTime deletedDateTime) {
        super.withDeletedDateTime(deletedDateTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphOrgContactInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (addresses() != null) {
            addresses().forEach(e -> e.validate());
        }
        if (onPremisesProvisioningErrors() != null) {
            onPremisesProvisioningErrors().forEach(e -> e.validate());
        }
        if (phones() != null) {
            phones().forEach(e -> e.validate());
        }
        if (directReports() != null) {
            directReports().forEach(e -> e.validate());
        }
        if (manager() != null) {
            manager().validate();
        }
        if (memberOf() != null) {
            memberOf().forEach(e -> e.validate());
        }
        if (transitiveMemberOf() != null) {
            transitiveMemberOf().forEach(e -> e.validate());
        }
    }
}