/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2020_03_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ContentStoragePolicy.
 */
public final class ContentStoragePolicy extends ExpandableStringEnum<ContentStoragePolicy> {
    /** Static value SystemAccount for ContentStoragePolicy. */
    public static final ContentStoragePolicy SYSTEM_ACCOUNT = fromString("SystemAccount");

    /** Static value JobStorageAccount for ContentStoragePolicy. */
    public static final ContentStoragePolicy JOB_STORAGE_ACCOUNT = fromString("JobStorageAccount");

    /**
     * Creates or finds a ContentStoragePolicy from its string representation.
     * @param name a name to look for
     * @return the corresponding ContentStoragePolicy
     */
    @JsonCreator
    public static ContentStoragePolicy fromString(String name) {
        return fromString(name, ContentStoragePolicy.class);
    }

    /**
     * @return known ContentStoragePolicy values
     */
    public static Collection<ContentStoragePolicy> values() {
        return values(ContentStoragePolicy.class);
    }
}