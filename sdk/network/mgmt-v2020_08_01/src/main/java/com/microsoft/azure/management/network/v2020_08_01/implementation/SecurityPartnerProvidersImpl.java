/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.network.v2020_08_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.network.v2020_08_01.SecurityPartnerProviders;
import com.microsoft.azure.management.network.v2020_08_01.SecurityPartnerProvider;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;

class SecurityPartnerProvidersImpl extends GroupableResourcesCoreImpl<SecurityPartnerProvider, SecurityPartnerProviderImpl, SecurityPartnerProviderInner, SecurityPartnerProvidersInner, NetworkManager>  implements SecurityPartnerProviders {
    protected SecurityPartnerProvidersImpl(NetworkManager manager) {
        super(manager.inner().securityPartnerProviders(), manager);
    }

    @Override
    protected Observable<SecurityPartnerProviderInner> getInnerAsync(String resourceGroupName, String name) {
        SecurityPartnerProvidersInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        SecurityPartnerProvidersInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<SecurityPartnerProvider> listByResourceGroup(String resourceGroupName) {
        SecurityPartnerProvidersInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<SecurityPartnerProvider> listByResourceGroupAsync(String resourceGroupName) {
        SecurityPartnerProvidersInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<SecurityPartnerProviderInner>, Iterable<SecurityPartnerProviderInner>>() {
            @Override
            public Iterable<SecurityPartnerProviderInner> call(Page<SecurityPartnerProviderInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SecurityPartnerProviderInner, SecurityPartnerProvider>() {
            @Override
            public SecurityPartnerProvider call(SecurityPartnerProviderInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<SecurityPartnerProvider> list() {
        SecurityPartnerProvidersInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<SecurityPartnerProvider> listAsync() {
        SecurityPartnerProvidersInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<SecurityPartnerProviderInner>, Iterable<SecurityPartnerProviderInner>>() {
            @Override
            public Iterable<SecurityPartnerProviderInner> call(Page<SecurityPartnerProviderInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SecurityPartnerProviderInner, SecurityPartnerProvider>() {
            @Override
            public SecurityPartnerProvider call(SecurityPartnerProviderInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public SecurityPartnerProviderImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected SecurityPartnerProviderImpl wrapModel(SecurityPartnerProviderInner inner) {
        return  new SecurityPartnerProviderImpl(inner.name(), inner, manager());
    }

    @Override
    protected SecurityPartnerProviderImpl wrapModel(String name) {
        return new SecurityPartnerProviderImpl(name, new SecurityPartnerProviderInner(), this.manager());
    }

}