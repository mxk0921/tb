package com.alipay.mobile.common.amnet.api;

import com.alipay.mobile.common.amnet.biz.AmnetManagerImpl;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class AmnetManagerBeanFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static AmnetManager f3884a;

    public static final AmnetManager createAmnetManager() {
        try {
            return (AmnetManager) AmnetManagerImpl.class.newInstance();
        } catch (ClassNotFoundException e) {
            LogCatUtil.error("AmnetManagerBeanFactory", e);
            return null;
        } catch (IllegalAccessException e2) {
            LogCatUtil.error("AmnetManagerBeanFactory", e2);
            return null;
        } catch (InstantiationException e3) {
            LogCatUtil.error("AmnetManagerBeanFactory", e3);
            return null;
        }
    }

    public static final AmnetManager getSingletonAmnetManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AmnetManager) ipChange.ipc$dispatch("f2066e6c", new Object[0]);
        }
        AmnetManager amnetManager = f3884a;
        if (amnetManager != null) {
            return amnetManager;
        }
        synchronized (AmnetManager.class) {
            try {
                AmnetManager amnetManager2 = f3884a;
                if (amnetManager2 != null) {
                    return amnetManager2;
                }
                AmnetManager createAmnetManager = createAmnetManager();
                f3884a = createAmnetManager;
                return createAmnetManager;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
