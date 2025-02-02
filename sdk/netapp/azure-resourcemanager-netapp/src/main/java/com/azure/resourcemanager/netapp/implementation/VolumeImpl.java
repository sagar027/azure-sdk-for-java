// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.netapp.fluent.models.MountTargetProperties;
import com.azure.resourcemanager.netapp.fluent.models.VolumeInner;
import com.azure.resourcemanager.netapp.models.AuthorizeRequest;
import com.azure.resourcemanager.netapp.models.AvsDataStore;
import com.azure.resourcemanager.netapp.models.BreakReplicationRequest;
import com.azure.resourcemanager.netapp.models.PoolChangeRequest;
import com.azure.resourcemanager.netapp.models.SecurityStyle;
import com.azure.resourcemanager.netapp.models.ServiceLevel;
import com.azure.resourcemanager.netapp.models.Volume;
import com.azure.resourcemanager.netapp.models.VolumePatch;
import com.azure.resourcemanager.netapp.models.VolumePatchPropertiesDataProtection;
import com.azure.resourcemanager.netapp.models.VolumePatchPropertiesExportPolicy;
import com.azure.resourcemanager.netapp.models.VolumePropertiesDataProtection;
import com.azure.resourcemanager.netapp.models.VolumePropertiesExportPolicy;
import com.azure.resourcemanager.netapp.models.VolumeRevert;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class VolumeImpl implements Volume, Volume.Definition, Volume.Update {
    private VolumeInner innerObject;

    private final com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String fileSystemId() {
        return this.innerModel().fileSystemId();
    }

    public String creationToken() {
        return this.innerModel().creationToken();
    }

    public ServiceLevel serviceLevel() {
        return this.innerModel().serviceLevel();
    }

    public long usageThreshold() {
        return this.innerModel().usageThreshold();
    }

    public VolumePropertiesExportPolicy exportPolicy() {
        return this.innerModel().exportPolicy();
    }

    public List<String> protocolTypes() {
        List<String> inner = this.innerModel().protocolTypes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String snapshotId() {
        return this.innerModel().snapshotId();
    }

    public String backupId() {
        return this.innerModel().backupId();
    }

    public String baremetalTenantId() {
        return this.innerModel().baremetalTenantId();
    }

    public String subnetId() {
        return this.innerModel().subnetId();
    }

    public List<MountTargetProperties> mountTargets() {
        List<MountTargetProperties> inner = this.innerModel().mountTargets();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String volumeType() {
        return this.innerModel().volumeType();
    }

    public VolumePropertiesDataProtection dataProtection() {
        return this.innerModel().dataProtection();
    }

    public Boolean isRestoring() {
        return this.innerModel().isRestoring();
    }

    public Boolean snapshotDirectoryVisible() {
        return this.innerModel().snapshotDirectoryVisible();
    }

    public Boolean kerberosEnabled() {
        return this.innerModel().kerberosEnabled();
    }

    public SecurityStyle securityStyle() {
        return this.innerModel().securityStyle();
    }

    public Boolean smbEncryption() {
        return this.innerModel().smbEncryption();
    }

    public Boolean smbContinuouslyAvailable() {
        return this.innerModel().smbContinuouslyAvailable();
    }

    public Float throughputMibps() {
        return this.innerModel().throughputMibps();
    }

    public String encryptionKeySource() {
        return this.innerModel().encryptionKeySource();
    }

    public Boolean ldapEnabled() {
        return this.innerModel().ldapEnabled();
    }

    public Boolean coolAccess() {
        return this.innerModel().coolAccess();
    }

    public Integer coolnessPeriod() {
        return this.innerModel().coolnessPeriod();
    }

    public String unixPermissions() {
        return this.innerModel().unixPermissions();
    }

    public Integer cloneProgress() {
        return this.innerModel().cloneProgress();
    }

    public AvsDataStore avsDataStore() {
        return this.innerModel().avsDataStore();
    }

    public Boolean isDefaultQuotaEnabled() {
        return this.innerModel().isDefaultQuotaEnabled();
    }

    public Long defaultUserQuotaInKiBs() {
        return this.innerModel().defaultUserQuotaInKiBs();
    }

    public Long defaultGroupQuotaInKiBs() {
        return this.innerModel().defaultGroupQuotaInKiBs();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public VolumeInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.netapp.NetAppFilesManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String poolName;

    private String volumeName;

    private VolumePatch updateBody;

    public VolumeImpl withExistingCapacityPool(String resourceGroupName, String accountName, String poolName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        this.poolName = poolName;
        return this;
    }

    public Volume create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVolumes()
                .createOrUpdate(resourceGroupName, accountName, poolName, volumeName, this.innerModel(), Context.NONE);
        return this;
    }

    public Volume create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVolumes()
                .createOrUpdate(resourceGroupName, accountName, poolName, volumeName, this.innerModel(), context);
        return this;
    }

    VolumeImpl(String name, com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager) {
        this.innerObject = new VolumeInner();
        this.serviceManager = serviceManager;
        this.volumeName = name;
    }

    public VolumeImpl update() {
        this.updateBody = new VolumePatch();
        return this;
    }

    public Volume apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVolumes()
                .update(resourceGroupName, accountName, poolName, volumeName, updateBody, Context.NONE);
        return this;
    }

    public Volume apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVolumes()
                .update(resourceGroupName, accountName, poolName, volumeName, updateBody, context);
        return this;
    }

    VolumeImpl(VolumeInner innerObject, com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "netAppAccounts");
        this.poolName = Utils.getValueFromIdByName(innerObject.id(), "capacityPools");
        this.volumeName = Utils.getValueFromIdByName(innerObject.id(), "volumes");
    }

    public Volume refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVolumes()
                .getWithResponse(resourceGroupName, accountName, poolName, volumeName, Context.NONE)
                .getValue();
        return this;
    }

    public Volume refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVolumes()
                .getWithResponse(resourceGroupName, accountName, poolName, volumeName, context)
                .getValue();
        return this;
    }

    public void revert(VolumeRevert body) {
        serviceManager.volumes().revert(resourceGroupName, accountName, poolName, volumeName, body);
    }

    public void revert(VolumeRevert body, Context context) {
        serviceManager.volumes().revert(resourceGroupName, accountName, poolName, volumeName, body, context);
    }

    public void breakReplication(BreakReplicationRequest body) {
        serviceManager.volumes().breakReplication(resourceGroupName, accountName, poolName, volumeName, body);
    }

    public void breakReplication() {
        serviceManager.volumes().breakReplication(resourceGroupName, accountName, poolName, volumeName);
    }

    public void breakReplication(BreakReplicationRequest body, Context context) {
        serviceManager.volumes().breakReplication(resourceGroupName, accountName, poolName, volumeName, body, context);
    }

    public void resyncReplication() {
        serviceManager.volumes().resyncReplication(resourceGroupName, accountName, poolName, volumeName);
    }

    public void resyncReplication(Context context) {
        serviceManager.volumes().resyncReplication(resourceGroupName, accountName, poolName, volumeName, context);
    }

    public void deleteReplication() {
        serviceManager.volumes().deleteReplication(resourceGroupName, accountName, poolName, volumeName);
    }

    public void deleteReplication(Context context) {
        serviceManager.volumes().deleteReplication(resourceGroupName, accountName, poolName, volumeName, context);
    }

    public void authorizeReplication(AuthorizeRequest body) {
        serviceManager.volumes().authorizeReplication(resourceGroupName, accountName, poolName, volumeName, body);
    }

    public void authorizeReplication(AuthorizeRequest body, Context context) {
        serviceManager
            .volumes()
            .authorizeReplication(resourceGroupName, accountName, poolName, volumeName, body, context);
    }

    public void reInitializeReplication() {
        serviceManager.volumes().reInitializeReplication(resourceGroupName, accountName, poolName, volumeName);
    }

    public void reInitializeReplication(Context context) {
        serviceManager.volumes().reInitializeReplication(resourceGroupName, accountName, poolName, volumeName, context);
    }

    public void poolChange(PoolChangeRequest body) {
        serviceManager.volumes().poolChange(resourceGroupName, accountName, poolName, volumeName, body);
    }

    public void poolChange(PoolChangeRequest body, Context context) {
        serviceManager.volumes().poolChange(resourceGroupName, accountName, poolName, volumeName, body, context);
    }

    public VolumeImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public VolumeImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public VolumeImpl withCreationToken(String creationToken) {
        this.innerModel().withCreationToken(creationToken);
        return this;
    }

    public VolumeImpl withUsageThreshold(long usageThreshold) {
        this.innerModel().withUsageThreshold(usageThreshold);
        return this;
    }

    public VolumeImpl withSubnetId(String subnetId) {
        this.innerModel().withSubnetId(subnetId);
        return this;
    }

    public VolumeImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateBody.withTags(tags);
            return this;
        }
    }

    public VolumeImpl withServiceLevel(ServiceLevel serviceLevel) {
        if (isInCreateMode()) {
            this.innerModel().withServiceLevel(serviceLevel);
            return this;
        } else {
            this.updateBody.withServiceLevel(serviceLevel);
            return this;
        }
    }

    public VolumeImpl withExportPolicy(VolumePropertiesExportPolicy exportPolicy) {
        this.innerModel().withExportPolicy(exportPolicy);
        return this;
    }

    public VolumeImpl withProtocolTypes(List<String> protocolTypes) {
        this.innerModel().withProtocolTypes(protocolTypes);
        return this;
    }

    public VolumeImpl withSnapshotId(String snapshotId) {
        this.innerModel().withSnapshotId(snapshotId);
        return this;
    }

    public VolumeImpl withBackupId(String backupId) {
        this.innerModel().withBackupId(backupId);
        return this;
    }

    public VolumeImpl withVolumeType(String volumeType) {
        this.innerModel().withVolumeType(volumeType);
        return this;
    }

    public VolumeImpl withDataProtection(VolumePropertiesDataProtection dataProtection) {
        this.innerModel().withDataProtection(dataProtection);
        return this;
    }

    public VolumeImpl withIsRestoring(Boolean isRestoring) {
        this.innerModel().withIsRestoring(isRestoring);
        return this;
    }

    public VolumeImpl withSnapshotDirectoryVisible(Boolean snapshotDirectoryVisible) {
        this.innerModel().withSnapshotDirectoryVisible(snapshotDirectoryVisible);
        return this;
    }

    public VolumeImpl withKerberosEnabled(Boolean kerberosEnabled) {
        this.innerModel().withKerberosEnabled(kerberosEnabled);
        return this;
    }

    public VolumeImpl withSecurityStyle(SecurityStyle securityStyle) {
        this.innerModel().withSecurityStyle(securityStyle);
        return this;
    }

    public VolumeImpl withSmbEncryption(Boolean smbEncryption) {
        this.innerModel().withSmbEncryption(smbEncryption);
        return this;
    }

    public VolumeImpl withSmbContinuouslyAvailable(Boolean smbContinuouslyAvailable) {
        this.innerModel().withSmbContinuouslyAvailable(smbContinuouslyAvailable);
        return this;
    }

    public VolumeImpl withThroughputMibps(Float throughputMibps) {
        if (isInCreateMode()) {
            this.innerModel().withThroughputMibps(throughputMibps);
            return this;
        } else {
            this.updateBody.withThroughputMibps(throughputMibps);
            return this;
        }
    }

    public VolumeImpl withEncryptionKeySource(String encryptionKeySource) {
        this.innerModel().withEncryptionKeySource(encryptionKeySource);
        return this;
    }

    public VolumeImpl withLdapEnabled(Boolean ldapEnabled) {
        this.innerModel().withLdapEnabled(ldapEnabled);
        return this;
    }

    public VolumeImpl withCoolAccess(Boolean coolAccess) {
        this.innerModel().withCoolAccess(coolAccess);
        return this;
    }

    public VolumeImpl withCoolnessPeriod(Integer coolnessPeriod) {
        this.innerModel().withCoolnessPeriod(coolnessPeriod);
        return this;
    }

    public VolumeImpl withUnixPermissions(String unixPermissions) {
        this.innerModel().withUnixPermissions(unixPermissions);
        return this;
    }

    public VolumeImpl withAvsDataStore(AvsDataStore avsDataStore) {
        this.innerModel().withAvsDataStore(avsDataStore);
        return this;
    }

    public VolumeImpl withIsDefaultQuotaEnabled(Boolean isDefaultQuotaEnabled) {
        if (isInCreateMode()) {
            this.innerModel().withIsDefaultQuotaEnabled(isDefaultQuotaEnabled);
            return this;
        } else {
            this.updateBody.withIsDefaultQuotaEnabled(isDefaultQuotaEnabled);
            return this;
        }
    }

    public VolumeImpl withDefaultUserQuotaInKiBs(Long defaultUserQuotaInKiBs) {
        if (isInCreateMode()) {
            this.innerModel().withDefaultUserQuotaInKiBs(defaultUserQuotaInKiBs);
            return this;
        } else {
            this.updateBody.withDefaultUserQuotaInKiBs(defaultUserQuotaInKiBs);
            return this;
        }
    }

    public VolumeImpl withDefaultGroupQuotaInKiBs(Long defaultGroupQuotaInKiBs) {
        if (isInCreateMode()) {
            this.innerModel().withDefaultGroupQuotaInKiBs(defaultGroupQuotaInKiBs);
            return this;
        } else {
            this.updateBody.withDefaultGroupQuotaInKiBs(defaultGroupQuotaInKiBs);
            return this;
        }
    }

    public VolumeImpl withUsageThreshold(Long usageThreshold) {
        this.updateBody.withUsageThreshold(usageThreshold);
        return this;
    }

    public VolumeImpl withExportPolicy(VolumePatchPropertiesExportPolicy exportPolicy) {
        this.updateBody.withExportPolicy(exportPolicy);
        return this;
    }

    public VolumeImpl withDataProtection(VolumePatchPropertiesDataProtection dataProtection) {
        this.updateBody.withDataProtection(dataProtection);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
