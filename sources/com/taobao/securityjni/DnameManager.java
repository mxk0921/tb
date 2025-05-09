package com.taobao.securityjni;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class DnameManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(421527562);
    }

    public static void RegisterName(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f4bd98a", new Object[]{strArr});
        }
    }

    public static void StartDsAHick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a961d340", new Object[0]);
        }
    }
}
