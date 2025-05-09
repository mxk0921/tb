package com.taobao.android.data_highway.jni;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DataHighwayNative {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1034944514);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc3ab60f", new Object[]{str, str2});
            return;
        }
        try {
            nativeRequestCallback(str, str2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static long b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4a6a2d97", new Object[]{str})).longValue();
        }
        try {
            nativeSendBatch(str);
            return 0L;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0L;
        }
    }

    public static long c(String str, JSONObject jSONObject, Boolean bool, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3184eda", new Object[]{str, jSONObject, bool, str2, str3})).longValue();
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("time", System.currentTimeMillis());
                jSONObject2.put("content", jSONObject);
                nativeSendEvent(str, jSONObject2.toString(), bool.booleanValue(), str2, str3);
            } catch (Exception unused) {
                Log.e("DataHighwayNative", "requestMtop: add data params error!");
            }
            return 0L;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0L;
        }
    }

    public static long d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b4835bf3", new Object[]{str, str2})).longValue();
        }
        try {
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            nativeSendScene(str, str2);
            return 0L;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0L;
        }
    }

    public static void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("183c4dc8", new Object[]{new Boolean(z)});
            return;
        }
        try {
            nativeSetEnable(z);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void f(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91b9f910", new Object[]{new Long(j)});
            return;
        }
        try {
            nativeSetMDDuration(j);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f52c69a", new Object[]{str});
            return;
        }
        try {
            nativeUpdate(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("456fe2fc", new Object[]{str});
        }
        try {
            nativeUpdateMap(str);
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static native void nativeRequestCallback(String str, String str2);

    private static native String nativeSceneName(String str);

    private static native void nativeSendBatch(String str);

    private static native void nativeSendEvent(String str, String str2, boolean z, String str3, String str4);

    private static native void nativeSendScene(String str, String str2);

    private static native void nativeSetEnable(boolean z);

    private static native void nativeSetMDDuration(long j);

    private static native void nativeUpdate(String str);

    private static native void nativeUpdateMap(String str);
}
