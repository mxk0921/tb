package com.taobao.android.tbuprofen.magic;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class RuntimeUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f9624a;

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29c2a369", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 28 || !f9624a) {
            return false;
        }
        return disableVerifierNative();
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f86aace", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 28 || !f9624a) {
            return false;
        }
        return isVerifierEnableNative();
    }

    private static native boolean disableVerifierNative();

    private static native boolean isVerifierEnableNative();

    static {
        t2o.a(823132161);
        f9624a = false;
        try {
            System.loadLibrary("tbuprofen-magic");
            f9624a = true;
        } catch (Throwable th) {
            f9624a = false;
            th.printStackTrace();
        }
    }
}
