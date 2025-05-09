package com.taobao.android.weex_framework.jni;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSValue;
import java.util.Map;
import tb.dwh;
import tb.t2o;
import tb.u8x;
import tb.x6x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MUSCommonNativeBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f9970a = false;
    public static final Object b = new Object();

    static {
        t2o.a(982516088);
    }

    public static void a(byte[] bArr, int i, String str, Map<String, String> map, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ffb3a90", new Object[]{bArr, new Integer(i), str, map, new Long(j)});
            return;
        }
        try {
            callRequestData(bArr, i, str, map, j);
        } catch (UnsatisfiedLinkError e) {
            x6x.a(-1, "Native", "callSafeRequestData").g(1, dwh.m(e)).f();
        }
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2052be7", new Object[]{str})).booleanValue();
        }
        try {
            return nativeHasGlobalJSBindingPlugin(str);
        } catch (UnsatisfiedLinkError e) {
            dwh.h("hasGlobalJSBindingPlugin error", e);
            return false;
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19434706", new Object[0])).booleanValue();
        }
        return f9970a;
    }

    private static native void callRequestData(byte[] bArr, int i, String str, Map<String, String> map, long j);

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bcf169", new Object[0]);
            return;
        }
        synchronized (e()) {
            if (!f9970a) {
                if (0 < 3) {
                    u8x.i("loadCppSo");
                    System.loadLibrary("c++_shared");
                    u8x.j();
                    u8x.i("loadQjsSo");
                    System.loadLibrary("quickjs");
                    u8x.j();
                    u8x.i("loadWxfSo");
                    System.loadLibrary("weex_framework");
                    u8x.j();
                    f9970a = true;
                }
            }
        }
    }

    public static Object e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6b22397e", new Object[0]);
        }
        return b;
    }

    private static native boolean nativeHasGlobalJSBindingPlugin(String str);

    private static native void nativeRegisterUINodeCustomMeasure(MUSValue mUSValue);

    public static native void nativeWx_Trace_End(String str);

    public static native void nativeWx_Trace_Event0(String str);

    public static native void nativeWx_Trace_Event1(String str, String str2, String str3);

    public static native void nativeWx_Trace_Event2(String str, String str2, String str3, String str4, String str5);

    public static native long nativeWx_Trace_Event_AsyncID();

    public static native void nativeWx_Trace_Event_Async_Begin0(String str, long j);

    public static native void nativeWx_Trace_Event_Async_Begin1(String str, long j, String str2, String str3);

    public static native void nativeWx_Trace_Event_Async_End0(String str, long j);

    public static native void nativeWx_Trace_Event_Async_End1(String str, long j, String str2, String str3);

    public static native void nativeWx_Trace_Event_Flow_Begin0(String str, long j);

    public static native void nativeWx_Trace_Event_Flow_End0(String str, long j);

    public static native void nativeWx_Trace_Event_Flow_Step0(String str, long j);

    public static native void nativeWx_Trace_Event_Instant1(String str, String str2, String str3);

    public static native void nativeWx_Trace_startRecord();

    public static native void nativeWx_Trace_stopRecord();

    public static boolean f(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51d12ecc", new Object[]{mUSValue})).booleanValue();
        }
        try {
            nativeRegisterUINodeCustomMeasure(mUSValue);
            return true;
        } catch (UnsatisfiedLinkError e) {
            dwh.h("registerUINodeCustomMeasure error", e);
            return false;
        }
    }
}
