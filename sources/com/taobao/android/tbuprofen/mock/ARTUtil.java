package com.taobao.android.tbuprofen.mock;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.urr;
import tb.zrr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ARTUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ERR_INVALID_LOCK_STATE = -2;
    public static final int ERR_NONE = 0;
    public static final String TAG = "ARTUtil";

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f9625a;

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("361b979", new Object[0]);
        } else if (f9625a) {
            enterGCCriticalSectionNative();
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8c94ef3", new Object[0]);
        } else if (f9625a) {
            exitGCCriticalSectionNative();
        }
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f256c14", new Object[0])).intValue();
        }
        if (!f9625a) {
            return -2;
        }
        return getMutatorLockStateNative();
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("924426da", new Object[0])).booleanValue();
        }
        return f9625a;
    }

    private static native void enterGCCriticalSectionNative();

    private static native void exitGCCriticalSectionNative();

    private static native void exitProcessNative();

    private static native int forkProcessNative(boolean z, String str, int i);

    private static native int getMutatorLockStateNative();

    private static native void resumeAllNative();

    private static native void suspendAllNative();

    private static native void testNative();

    private static native int waitChildProcessNative(int i);

    static {
        t2o.a(822083604);
        f9625a = false;
        try {
            if (TextUtils.isEmpty(zrr.c().loadLibrary("tbuprofen-util"))) {
                f9625a = true;
            }
        } catch (Throwable unused) {
            urr.b("TBUPROF", "Failed to load tbuprofen-util", new Object[0]);
        }
    }
}
