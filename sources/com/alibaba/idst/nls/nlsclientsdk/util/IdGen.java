package com.alibaba.idst.nls.nlsclientsdk.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.UUID;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class IdGen {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(199229481);
    }

    public static String genId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99d6ff4e", new Object[0]);
        }
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
