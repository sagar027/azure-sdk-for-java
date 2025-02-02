// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp;

import com.azure.core.util.Context;

/** Samples for Backups GetStatus. */
public final class BackupsGetStatusSamples {
    /*
     * operationId: Backups_GetStatus
     * api-version: 2021-06-01
     * x-ms-examples: Volumes_BackupStatus
     */
    /**
     * Sample code: Volumes_BackupStatus.
     *
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void volumesBackupStatus(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager.backups().getStatusWithResponse("myRG", "account1", "pool1", "volume1", Context.NONE);
    }
}
