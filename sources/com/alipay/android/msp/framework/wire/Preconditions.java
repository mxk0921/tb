package com.alipay.android.msp.framework.wire;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Preconditions {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void checkArgument(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55882632", new Object[]{new Boolean(z), str});
        } else if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void checkNotNull(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e546a7f", new Object[]{obj, str});
        } else if (obj == null) {
            throw new NullPointerException(str + " == null");
        }
    }
}
