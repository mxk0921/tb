package com.taobao.android.ab.api;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kva;
import tb.r1r;
import tb.r2w;
import tb.s1r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ABGlobal {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static final r1r ABSwitches = s1r.b();
    }

    public static r2w a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r2w) ipChange.ipc$dispatch("3cb9ab1b", new Object[]{context});
        }
        return a.ABSwitches.f(kva.h(context));
    }

    public static boolean b(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f4f982e", new Object[]{context, str, str2, str3})).booleanValue();
        }
        return isFeatureOpened(context, str3);
    }

    public static boolean isFeatureOpened(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d63361a", new Object[]{context, str})).booleanValue();
        }
        Boolean e = a.ABSwitches.e(kva.h(context), str);
        if (e == null || !e.booleanValue()) {
            return false;
        }
        return true;
    }
}
