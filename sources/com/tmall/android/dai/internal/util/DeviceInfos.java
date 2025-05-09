package com.tmall.android.dai.internal.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kzo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DeviceInfos {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1034944678);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("afe672b3", new Object[0]);
        }
        return kzo.c().b().getPackageName();
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else {
            nativeStoreAppPackageName(a());
        }
    }

    public static native void nativeStoreAppPackageName(String str);
}
