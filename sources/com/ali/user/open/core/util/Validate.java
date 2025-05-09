package com.ali.user.open.core.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Validate {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(71303257);
    }

    public static void notNull(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b07aa8a7", new Object[]{obj, str});
        } else if (obj == null) {
            throw new NullPointerException("Argument '" + str + "' cannot be null");
        }
    }
}
