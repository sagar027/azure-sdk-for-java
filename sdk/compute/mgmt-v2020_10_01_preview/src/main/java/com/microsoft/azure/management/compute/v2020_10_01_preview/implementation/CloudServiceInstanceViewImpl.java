/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview.implementation;

import com.microsoft.azure.management.compute.v2020_10_01_preview.CloudServiceInstanceView;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.compute.v2020_10_01_preview.InstanceViewStatusesSummary;
import java.util.List;
import com.microsoft.azure.management.compute.v2020_10_01_preview.ResourceInstanceViewStatus;

class CloudServiceInstanceViewImpl extends WrapperImpl<CloudServiceInstanceViewInner> implements CloudServiceInstanceView {
    private final ComputeManager manager;
    CloudServiceInstanceViewImpl(CloudServiceInstanceViewInner inner, ComputeManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public InstanceViewStatusesSummary roleInstance() {
        return this.inner().roleInstance();
    }

    @Override
    public String sdkVersion() {
        return this.inner().sdkVersion();
    }

    @Override
    public List<ResourceInstanceViewStatus> statuses() {
        return this.inner().statuses();
    }

}