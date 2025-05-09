package com.taobao.search.common;

import com.android.alibaba.ip.runtime.IpChange;
import tb.r4p;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TBSearchApi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792164);
    }

    public static String getCurrentSVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba1c4b1", new Object[0]);
        }
        return r4p.SERVER_VERSION_VALUE;
    }
}
