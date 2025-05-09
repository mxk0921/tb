package com.taobao.pexode.common;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.FileDescriptor;
import tb.f8q;
import tb.p0m;
import tb.t2o;
import tb.xv8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NdkCore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f11452a;
    public static String[] b = null;

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6534377f", new Object[0])).booleanValue();
        }
        return f11452a;
    }

    private static native boolean nativeCpuSupportNEON();

    private static native String nativeGetCpuAbi(String str);

    private static native String nativeGetCpuAbiList();

    private static native boolean nativeIsSeekable(FileDescriptor fileDescriptor);

    private static native int nativeLoadedVersionTest();

    public static native void nativePinBitmap(Bitmap bitmap) throws RuntimeException;

    public static native void nativePinBitmapWithAddr(Bitmap bitmap, long[] jArr) throws Exception;

    public static native void nativeUnpinBitmap(Bitmap bitmap) throws RuntimeException;

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0a93f9", new Object[]{str})).booleanValue();
        }
        if (b == null) {
            try {
                String nativeGetCpuAbiList = nativeGetCpuAbiList();
                if (!TextUtils.isEmpty(nativeGetCpuAbiList)) {
                    b = nativeGetCpuAbiList.split(",");
                }
            } catch (UnsatisfiedLinkError e) {
                xv8.c(p0m.TAG, "NdkCore.isCpuAbiSupported error=%s", e);
            }
            if (b == null) {
                b = Build.SUPPORTED_ABIS;
            }
        }
        for (String str2 : b) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    static {
        t2o.a(618659861);
        try {
            System.loadLibrary("pexcore");
            f11452a = nativeLoadedVersionTest() == 2;
            xv8.f(p0m.TAG, "system load lib%s.so success", "pexcore");
        } catch (UnsatisfiedLinkError e) {
            xv8.c(p0m.TAG, "system load lib%s.so error=%s", "pexcore", e);
        }
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eda217a", new Object[]{context});
        } else if (!f11452a) {
            boolean z = f8q.b("pexcore", 2) && nativeLoadedVersionTest() == 2;
            f11452a = z;
            xv8.f(p0m.TAG, "retry load lib%s.so result=%b", "pexcore", Boolean.valueOf(z));
        }
    }
}
