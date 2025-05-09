package com.taobao.message.kit.util;

import android.os.Build;
import android.os.Trace;
import com.android.alibaba.ip.runtime.IpChange;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TraceUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean ENABLE_TRACE = false;
    private static Class cTrace;

    static {
        t2o.a(529531018);
    }

    public static void asyncTraceBegin(String str, int i) {
        if (!ENABLE_TRACE) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.beginAsyncSection(str, i);
            return;
        }
        try {
            Class cls = cTrace;
            if (cls != null) {
                cls.getDeclaredMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE).invoke(null, Long.valueOf((long) ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF), str, Integer.valueOf(i));
            }
        } catch (Throwable unused) {
        }
    }

    public static void asyncTraceEnd(String str, String str2, int i) {
        if (!ENABLE_TRACE) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.endAsyncSection(str + str2, i);
            return;
        }
        try {
            Class cls = cTrace;
            if (cls != null) {
                cls.getDeclaredMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE).invoke(null, Long.valueOf((long) ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF), str2, Integer.valueOf(i));
            }
        } catch (Throwable unused) {
        }
    }

    public static void beginSection(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeb3d417", new Object[]{str, str2});
        } else if (ENABLE_TRACE) {
            Trace.beginSection(str + str2);
        }
    }

    public static void endTrace() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1296a8b1", new Object[0]);
        } else if (ENABLE_TRACE) {
            Trace.endSection();
        }
    }

    public static boolean isEnableTrace() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d54a3a83", new Object[0])).booleanValue();
        }
        return ENABLE_TRACE;
    }

    public static void setEnableTrace(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75ea076d", new Object[]{new Boolean(z)});
            return;
        }
        ENABLE_TRACE = z;
        try {
            cTrace = Class.forName("android.os.Trace");
        } catch (Throwable unused) {
        }
    }

    public static void beginSection(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5235938d", new Object[]{str});
        } else if (ENABLE_TRACE) {
            Trace.beginSection(str);
        }
    }

    public static void asyncTraceBegin(String str, String str2, int i) {
        if (!ENABLE_TRACE) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.beginAsyncSection(str + str2, i);
            return;
        }
        try {
            Class cls = cTrace;
            if (cls != null) {
                cls.getDeclaredMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE).invoke(null, Long.valueOf((long) ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF), str2, Integer.valueOf(i));
            }
        } catch (Throwable unused) {
        }
    }

    public static void asyncTraceEnd(String str, int i) {
        if (!ENABLE_TRACE) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.endAsyncSection(str, i);
            return;
        }
        try {
            Class cls = cTrace;
            if (cls != null) {
                cls.getDeclaredMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE).invoke(null, Long.valueOf((long) ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF), str, Integer.valueOf(i));
            }
        } catch (Throwable unused) {
        }
    }
}
