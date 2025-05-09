package com.alibaba.wireless.security.open.initialize;

import com.alibaba.wireless.security.mainplugin.C0112;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(659554370);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        return C0112.f57;
    }
}
