package com.alibaba.security.realidentity;

import android.app.Activity;
import android.content.Context;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.runtimepermission.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(Context context, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("579fc4c3", new Object[]{context, strArr})).booleanValue();
        }
        for (String str : strArr) {
            if (!a(context, str)) {
                return false;
            }
        }
        return true;
    }

    public static void a(Activity activity, String[] strArr, int i, String str, Runnable runnable, Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("519cdec4", new Object[]{activity, strArr, new Integer(i), str, runnable, runnable2});
        } else if (!a()) {
            ActivityCompat.requestPermissions(activity, strArr, i);
        } else {
            a(activity, strArr, str, runnable, runnable2);
        }
    }

    public static void a(Activity activity, String[] strArr, String str, Runnable runnable, Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ff1daab", new Object[]{activity, strArr, str, runnable, runnable2});
            return;
        }
        a.C0649a c = a.c(activity, strArr);
        c.w(str);
        c.x(true);
        c.t(f2.f2699a);
        c.z(runnable2);
        c.A(runnable);
        c.m();
    }

    public static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue() : ContextCompat.checkSelfPermission(context, str) == 0;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        try {
            IpChange ipChange2 = a.$ipChange;
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
