package com.tmall.android.dai.internal.featurecenter;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class FeatureCenterImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1034944643);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b54e68f5", new Object[0]);
        } else {
            nativeSetupFeatureCenter();
        }
    }

    private static native void nativeSetupFeatureCenter();
}
