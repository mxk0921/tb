package com.taobao.android.weex.bridge;

import android.app.Application;
import android.content.SharedPreferences;
import com.alibaba.security.realidentity.g4;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.WeexValueImpl;
import com.taobao.android.weex.b;
import java.io.Serializable;
import tb.dwh;
import tb.ede;
import tb.f5x;
import tb.h5x;
import tb.ivu;
import tb.o8x;
import tb.p9x;
import tb.pg1;
import tb.r5x;
import tb.t2o;
import tb.u8x;
import tb.vvh;
import tb.w4x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WeexPlatformCommonBridge implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int ACTION_MASK = 65535;
    private static final int SIZE_SHIFT = 16;

    static {
        t2o.a(982515832);
    }

    public static Object CreateJavaValueByArrayBuffer(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("453d9555", new Object[]{bArr});
        }
        return WeexValueImpl.ofArrayBuffer(bArr);
    }

    public static Object CreateJavaValueByAtomString(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("68749522", new Object[]{new Integer(i)});
        }
        return WeexValueImpl.ofString(pg1.a(i));
    }

    public static Object CreateJavaValueByBool(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("48ee8919", new Object[]{new Boolean(z)});
        }
        return WeexValueImpl.ofBool(z);
    }

    public static Object CreateJavaValueByCppPack(byte[] bArr, String[] strArr, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("cd225f20", new Object[]{bArr, strArr, objArr});
        }
        return p9x.r(bArr, strArr, objArr);
    }

    public static Object CreateJavaValueByDouble(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("86384c16", new Object[]{new Double(d)});
        }
        return WeexValueImpl.ofDouble(d);
    }

    public static Object CreateJavaValueByFunction(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("370eea38", new Object[]{new Integer(i)});
        }
        return WeexValueImpl.ofFunction(i);
    }

    public static Object CreateJavaValueByInt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f909fabb", new Object[]{new Integer(i)});
        }
        return WeexValueImpl.ofInt(i);
    }

    public static Object CreateJavaValueByLong(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7254d53b", new Object[]{new Long(j)});
        }
        return WeexValueImpl.ofLong(j);
    }

    public static Object CreateJavaValueByNull() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2495eb1a", new Object[0]);
        }
        return WeexValueImpl.ofNull();
    }

    public static Object CreateJavaValueByString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("65ff2d46", new Object[]{str});
        }
        return WeexValueImpl.ofString(str);
    }

    public static Object CreateJavaValueByUndefined() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("48c18f45", new Object[0]);
        }
        return WeexValueImpl.ofNull();
    }

    public static String GetABTest(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("adab5cfc", new Object[]{str, str2});
        }
        u8x.i("WeexGetABTest");
        try {
            return w4x.j(str, str2);
        } catch (Throwable th) {
            try {
                dwh.g(dwh.TAG, "bridge error", th);
                u8x.j();
                return null;
            } finally {
                u8x.j();
            }
        }
    }

    public static int GetDeviceLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aab00e32", new Object[0])).intValue();
        }
        u8x.i("WeexGetDeviceLevel");
        try {
            return f5x.b();
        } catch (Throwable th) {
            try {
                dwh.i(th);
                return 0;
            } finally {
                u8x.j();
            }
        }
    }

    public static String GetOrangeConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d4b6209", new Object[]{str});
        }
        try {
            return w4x.u(str, "", null);
        } catch (Throwable th) {
            dwh.g(dwh.TAG, "bridge error", th);
            return null;
        }
    }

    public static WeexValue GetStorage(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("9f25e5fc", new Object[]{str, str2});
        }
        u8x.i("WeexGetStorage");
        try {
            Object load = o8x.a(str).load(str2);
            if (load == null) {
                return WeexValueImpl.ofUndefined();
            }
            return b.e().a(load);
        } catch (Throwable th) {
            try {
                dwh.g(dwh.TAG, "bridge error", th);
                u8x.j();
                return null;
            } finally {
                u8x.j();
            }
        }
    }

    public static void MakeDebugToast(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2116553", new Object[]{str});
            return;
        }
        try {
            dwh.s(str);
        } catch (Throwable th) {
            dwh.g(dwh.TAG, "bridge error", th);
        }
    }

    public static void RequireUINode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1d7208c", new Object[]{str});
            return;
        }
        try {
            ivu.j(str);
        } catch (Throwable th) {
            dwh.g(dwh.TAG, "bridge error", th);
        }
    }

    public static void SetNetworkCacheDisabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5e7267b", new Object[]{new Boolean(z)});
        } else {
            r5x.d(z);
        }
    }

    public static void SetStorage(String str, String str2, WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa50a518", new Object[]{str, str2, weexValue});
            return;
        }
        u8x.i("WeexSetStorage");
        try {
            ede a2 = o8x.a(str);
            if (weexValue != null && !weexValue.isUndefinedOrNull()) {
                a2.a(str2, weexValue.getValue());
            }
            a2.b(str2);
        } catch (Throwable th) {
            try {
                dwh.g(dwh.TAG, "bridge error", th);
            } finally {
                u8x.j();
            }
        }
    }

    public static boolean WXPlayBackEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("888139ea", new Object[0])).booleanValue();
        }
        return false;
    }

    private static native boolean WXPlayBackEnableNative();

    public static void addEngineInfoTag(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4cbd7bd", new Object[]{new Integer(i), str});
            return;
        }
        try {
            addEngineInfoTagNative(i, str);
        } catch (Throwable th) {
            dwh.g(dwh.TAG, "bridge error", th);
        }
    }

    private static native void addEngineInfoTagNative(int i, String str);

    public static void createCppArrayBuffer(byte[] bArr, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b60ce44", new Object[]{bArr, new Long(j)});
            return;
        }
        try {
            nativeCreateCppArrayBuffer(bArr, j);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void createCppBoolean(boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a9f6798", new Object[]{new Boolean(z), new Long(j)});
            return;
        }
        try {
            nativeCreateCppBoolean(z, j);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void createCppDouble(double d, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3c830c5", new Object[]{new Double(d), new Long(j)});
            return;
        }
        try {
            nativeCreateCppDouble(d, j);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void createCppLong(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ad4472a", new Object[]{new Long(j), new Long(j2)});
            return;
        }
        try {
            nativeCreateCppLong(j, j2);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void createCppNull(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27693aaf", new Object[]{new Long(j)});
            return;
        }
        try {
            nativeCreateCppNull(j);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void createCppString(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a90f355b", new Object[]{str, new Long(j)});
            return;
        }
        try {
            nativeCreateCppString(str, j);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void createCppUndefined(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf28deb4", new Object[]{new Long(j)});
            return;
        }
        try {
            nativeCreateCppUndefined(j);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void createCppValuePack(byte[] bArr, Object[] objArr, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a1af464", new Object[]{bArr, objArr, new Long(j)});
            return;
        }
        try {
            nativeCreateCppValuePack(bArr, objArr, j);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static boolean executeInstruction(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed673431", new Object[]{new Integer(i), str})).booleanValue();
        }
        return false;
    }

    private static native boolean executeInstructionNative(int i, String str);

    public static void initAfterSDKLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ba5d27b", new Object[0]);
            return;
        }
        try {
            nativeInitAfterSDKLoad();
        } catch (Throwable th) {
            dwh.g(dwh.TAG, "bridge error", th);
        }
    }

    private static native void nativeCreateCppArrayBuffer(byte[] bArr, long j);

    private static native void nativeCreateCppBoolean(boolean z, long j);

    private static native void nativeCreateCppDouble(double d, long j);

    private static native void nativeCreateCppLong(long j, long j2);

    private static native void nativeCreateCppNull(long j);

    private static native void nativeCreateCppString(String str, long j);

    private static native void nativeCreateCppUndefined(long j);

    private static native void nativeCreateCppValuePack(byte[] bArr, Object[] objArr, long j);

    private static native void nativeInitAfterSDKLoad();

    private static native void nativeRegisterUINode(String str, String str2, String str3, String str4);

    public static void recordSnapShot(int i, WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6203aa05", new Object[]{new Integer(i), weexValue});
        }
    }

    private static native void recordSnapShotNative(int i, WeexValue weexValue);

    public static void recordViewFrame(int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a75385", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
        }
    }

    private static native void recordViewFrameNative(int i, int i2, int i3, int i4, int i5);

    public static void registerUINode(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71ddcb48", new Object[]{str, str2, str3, str4});
            return;
        }
        try {
            nativeRegisterUINode(str, str2, str3, str4);
        } catch (Throwable th) {
            dwh.g(dwh.TAG, "bridge error", th);
        }
    }

    public static void registerZCacheAPI(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0cea60e", new Object[]{new Long(j)});
            return;
        }
        try {
            registerZCacheAPINative(j);
        } catch (Throwable th) {
            dwh.g(dwh.TAG, "bridge error", th);
        }
    }

    private static native void registerZCacheAPINative(long j);

    public static void reportException(boolean z, int i, int i2, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8a82686", new Object[]{new Boolean(z), new Integer(i), new Integer(i2), str, str2});
            return;
        }
        try {
            reportExceptionNative(z, i, i2, str, str2);
        } catch (Throwable th) {
            dwh.g(dwh.TAG, "bridge error", th);
        }
    }

    public static void reportExceptionInnerInfo(int i, int i2, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b618a64", new Object[]{new Integer(i), new Integer(i2), str, str2});
            return;
        }
        try {
            reportExceptionInnerInfoNative(i, i2, str, str2);
        } catch (Throwable th) {
            dwh.g(dwh.TAG, "bridge error", th);
        }
    }

    private static native void reportExceptionInnerInfoNative(int i, int i2, String str, String str2);

    private static native void reportExceptionNative(boolean z, int i, int i2, String str, String str2);

    public static void setExceptionArg(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcdd8b87", new Object[]{new Integer(i), str, str2});
            return;
        }
        try {
            setExceptionArgNative(i, str, str2);
        } catch (Throwable th) {
            dwh.g(dwh.TAG, "bridge error", th);
        }
    }

    private static native void setExceptionArgNative(int i, String str, String str2);

    public static void updateGlobalSystemEnv(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e31a4e3", new Object[]{str});
            return;
        }
        try {
            updateGlobalSystemEnvNative(str);
        } catch (Throwable th) {
            dwh.g(dwh.TAG, "bridge error", th);
        }
    }

    private static native void updateGlobalSystemEnvNative(String str);

    public static String GetPreference(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eb41745e", new Object[]{str});
        }
        u8x.i("WeexGetPreference");
        try {
            Application c = vvh.c();
            if (c == null) {
                dwh.e("GetPreference without application");
                c = h5x.l();
            }
            if (c != null) {
                return c.getSharedPreferences("weex_2_preference", 0).getString(str, null);
            }
            dwh.e("GetPreference application is null, wxf not init");
            return null;
        } catch (Throwable th) {
            try {
                dwh.g(dwh.TAG, "bridge error", th);
                return null;
            } finally {
                u8x.j();
            }
        }
    }

    public static void SetPreference(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c06df3d8", new Object[]{str, str2});
            return;
        }
        u8x.i("WeexSetPreference");
        try {
            SharedPreferences.Editor edit = vvh.c().getSharedPreferences("weex_2_preference", 0).edit();
            if (str2 == null) {
                edit.remove(str);
            } else {
                edit.putString(str, str2);
            }
            edit.apply();
        } catch (Throwable th) {
            try {
                dwh.g(dwh.TAG, "bridge error", th);
            } finally {
                u8x.j();
            }
        }
    }

    public static WeexValue GetEnvironment(int i, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("847f48c5", new Object[]{new Integer(i), str});
        }
        try {
            if (i == 0) {
                str2 = "system";
            } else if (i == 1) {
                str2 = "app";
            } else if (i != 2) {
                return WeexValueImpl.ofUndefined();
            } else {
                str2 = g4.a.f2721a;
            }
            return vvh.f(str2, str);
        } catch (Throwable th) {
            dwh.g(dwh.TAG, "bridge error", th);
            return null;
        }
    }
}
