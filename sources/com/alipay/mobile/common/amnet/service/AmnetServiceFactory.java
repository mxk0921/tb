package com.alipay.mobile.common.amnet.service;

import android.app.Service;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AmnetServiceFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static AmnetServiceFactory f3906a;

    public static final AmnetServiceFactory getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AmnetServiceFactory) ipChange.ipc$dispatch("43b080b3", new Object[0]);
        }
        AmnetServiceFactory amnetServiceFactory = f3906a;
        if (amnetServiceFactory != null) {
            return amnetServiceFactory;
        }
        synchronized (AmnetServiceFactory.class) {
            try {
                AmnetServiceFactory amnetServiceFactory2 = f3906a;
                if (amnetServiceFactory2 != null) {
                    return amnetServiceFactory2;
                }
                AmnetServiceFactory amnetServiceFactory3 = new AmnetServiceFactory();
                f3906a = amnetServiceFactory3;
                return amnetServiceFactory3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public AmnetService createAmnetService(Service service) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AmnetService) ipChange.ipc$dispatch("def978da", new Object[]{this, service});
        }
        return new AmnetServiceWrapper(service);
    }
}
