package com.taobao.uikit.actionbar.util;

import android.content.Context;
import android.content.res.Resources;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class Tools {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(927989844);
    }

    public static int dp2Px(Resources resources, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49db5dc7", new Object[]{resources, new Float(f)})).intValue();
        }
        try {
            return (int) ((f * resources.getDisplayMetrics().density) + 0.5f);
        } catch (Throwable unused) {
            return (int) f;
        }
    }

    public static String subTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc4fab37", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        if (str.length() < 2 || !str.contains(":")) {
            return str.trim();
        }
        return str.substring(str.indexOf(":") + 1).trim();
    }

    public static int dp2Px(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1440f000", new Object[]{context, new Float(f)})).intValue() : context == null ? (int) f : dp2Px(context.getResources(), f);
    }
}
