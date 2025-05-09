package com.alipay.mobile.common.amnet.api;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class AmnetBeanFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final AmnetManager createAmnetManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AmnetManager) ipChange.ipc$dispatch("31c26e13", new Object[0]);
        }
        return AmnetManagerBeanFactory.createAmnetManager();
    }

    @Deprecated
    public static final AmnetManager getAmnetManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AmnetManager) ipChange.ipc$dispatch("813e8c6d", new Object[0]);
        }
        return createAmnetManager();
    }

    public static final AmnetManager getSingletonAmnetManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AmnetManager) ipChange.ipc$dispatch("f2066e6c", new Object[0]);
        }
        return AmnetManagerBeanFactory.getSingletonAmnetManager();
    }
}
