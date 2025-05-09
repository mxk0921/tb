package com.alibaba.wireless.security.framework.utils;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(659554348);
    }

    public static boolean a(Context context, String str) {
        try {
            return ((Boolean) ABGlobal.class.getDeclaredMethod("isFeatureOpened", Context.class, String.class).invoke(ABGlobal.class, context, str)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
