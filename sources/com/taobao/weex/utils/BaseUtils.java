package com.taobao.weex.utils;

import com.android.alibaba.ip.runtime.IpChange;
import tb.c21;
import tb.chb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class BaseUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(773849131);
    }

    public static boolean isLowDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("522b454b", new Object[0])).booleanValue();
        }
        chb g = c21.g();
        if (g != null && g.getInt("deviceLevel", -1) == 2) {
            return true;
        }
        return false;
    }
}
