package com.taobao.android.knife.perf;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.bzn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class PerfKnife {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LIB_NAME = "perfKnife";
    private static final String TAG = "PerfKnife";
    private static final AtomicBoolean sLoaded = new AtomicBoolean(false);

    public static int autoBindBigCore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("903b7f8d", new Object[0])).intValue();
        }
        if (sLoaded.get()) {
            return autoBindBigCoreNative();
        }
        return -1;
    }

    private static native int autoBindBigCoreNative();

    public static int bindBigCore(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("754afa0a", new Object[]{iArr})).intValue();
        }
        if (sLoaded.get()) {
            return bindBigCoreNative(iArr);
        }
        return -1;
    }

    private static native int bindBigCoreNative(int[] iArr);

    public static boolean load() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6def6671", new Object[0])).booleanValue();
        }
        if (!ABGlobal.isFeatureOpened(null, "enableBindBigCore")) {
            Log.e(TAG, "the feature of enableBindBigCore is off");
            return false;
        }
        if (bzn.d().load(LIB_NAME).i()) {
            sLoaded.compareAndSet(false, true);
        }
        return sLoaded.get();
    }
}
