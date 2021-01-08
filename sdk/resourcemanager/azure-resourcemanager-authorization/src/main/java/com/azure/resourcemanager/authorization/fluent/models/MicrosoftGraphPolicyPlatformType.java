// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MicrosoftGraphPolicyPlatformType. */
public final class MicrosoftGraphPolicyPlatformType extends ExpandableStringEnum<MicrosoftGraphPolicyPlatformType> {
    /** Static value android for MicrosoftGraphPolicyPlatformType. */
    public static final MicrosoftGraphPolicyPlatformType ANDROID = fromString("android");

    /** Static value iOS for MicrosoftGraphPolicyPlatformType. */
    public static final MicrosoftGraphPolicyPlatformType I_OS = fromString("iOS");

    /** Static value macOS for MicrosoftGraphPolicyPlatformType. */
    public static final MicrosoftGraphPolicyPlatformType MAC_OS = fromString("macOS");

    /** Static value windowsPhone81 for MicrosoftGraphPolicyPlatformType. */
    public static final MicrosoftGraphPolicyPlatformType WINDOWS_PHONE81 = fromString("windowsPhone81");

    /** Static value windows81AndLater for MicrosoftGraphPolicyPlatformType. */
    public static final MicrosoftGraphPolicyPlatformType WINDOWS81AND_LATER = fromString("windows81AndLater");

    /** Static value windows10AndLater for MicrosoftGraphPolicyPlatformType. */
    public static final MicrosoftGraphPolicyPlatformType WINDOWS10AND_LATER = fromString("windows10AndLater");

    /** Static value androidWorkProfile for MicrosoftGraphPolicyPlatformType. */
    public static final MicrosoftGraphPolicyPlatformType ANDROID_WORK_PROFILE = fromString("androidWorkProfile");

    /** Static value all for MicrosoftGraphPolicyPlatformType. */
    public static final MicrosoftGraphPolicyPlatformType ALL = fromString("all");

    /**
     * Creates or finds a MicrosoftGraphPolicyPlatformType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphPolicyPlatformType.
     */
    @JsonCreator
    public static MicrosoftGraphPolicyPlatformType fromString(String name) {
        return fromString(name, MicrosoftGraphPolicyPlatformType.class);
    }

    /** @return known MicrosoftGraphPolicyPlatformType values. */
    public static Collection<MicrosoftGraphPolicyPlatformType> values() {
        return values(MicrosoftGraphPolicyPlatformType.class);
    }
}