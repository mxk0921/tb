package com.ali.adapt.api;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AliAdaptServiceManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile AliAdaptServiceManager b;

    /* renamed from: a  reason: collision with root package name */
    public AliServiceFinder f1866a;

    public static AliAdaptServiceManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliAdaptServiceManager) ipChange.ipc$dispatch("5f623e76", new Object[0]);
        }
        if (b == null) {
            synchronized (AliAdaptServiceManager.class) {
                try {
                    if (b == null) {
                        b = new AliAdaptServiceManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public <T> T findAliAdaptService(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("ef199154", new Object[]{this, cls}) : (T) this.f1866a.findServiceImpl(cls);
    }

    public void registerServiceImplStub(AliServiceFinder aliServiceFinder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9ce338", new Object[]{this, aliServiceFinder});
        } else {
            this.f1866a = aliServiceFinder;
        }
    }

    public <T> void findAliAdaptService(Class<T> cls, AliServiceFindedCallback<T> aliServiceFindedCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bb4b478", new Object[]{this, cls, aliServiceFindedCallback});
        } else {
            this.f1866a.findServiceImpl(cls, aliServiceFindedCallback);
        }
    }
}
