package com.tmall.android.dai.internal.config;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ConfigServiceNative {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1034944629);
    }

    public static void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8b1f61", new Object[]{str, new Integer(i)});
        } else {
            nativeAddExtraConfig(str, i);
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eaff569", new Object[]{str});
        } else {
            nativeParseSceneV3Config(str);
        }
    }

    private static native void nativeAddExtraConfig(String str, int i);

    private static native void nativeParseSceneV3Config(String str);
}
