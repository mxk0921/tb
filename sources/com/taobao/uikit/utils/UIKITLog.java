package com.taobao.uikit.utils;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UIKITLog {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean isDebuggable;

    public static void d(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d89652", new Object[]{str, str2, objArr});
        } else if (isDebuggable) {
            formatString(str2, objArr);
        }
    }

    public static void e(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc61b1", new Object[]{str, str2, objArr});
        } else {
            Log.e(str, formatString(str2, objArr));
        }
    }

    private static String formatString(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa38d488", new Object[]{str, objArr});
        }
        return String.format(null, str, objArr);
    }

    public static void i(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25eb8f2d", new Object[]{str, str2, objArr});
        } else if (isDebuggable) {
            formatString(str2, objArr);
        }
    }

    public static boolean isDebuggable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4500e523", new Object[0])).booleanValue();
        }
        return false;
    }

    public static void v(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("741ce300", new Object[]{str, str2, objArr});
        } else if (isDebuggable) {
            formatString(str2, objArr);
        }
    }

    public static void w(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a20ae5f", new Object[]{str, str2, objArr});
        } else if (isDebuggable) {
            formatString(str2, objArr);
        }
    }
}
