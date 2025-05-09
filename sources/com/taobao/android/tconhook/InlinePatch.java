package com.taobao.android.tconhook;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class InlinePatch {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOG_TAG = "tconhook";
    private static boolean sInited;

    static {
        try {
            System.loadLibrary("tconscraper");
            sInited = true;
        } catch (Throwable unused) {
            Log.e(LOG_TAG, "Failed to load libtconscraper.so");
        }
    }

    public static synchronized int install(String str) {
        synchronized (InlinePatch.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8c3769df", new Object[]{str})).intValue();
            } else if (!sInited) {
                return -1;
            } else {
                System.load(str);
                return nativeInstall(str, isThreadSafeMode());
            }
        }
    }

    public static synchronized int installWithOriginLibPath(String str, String str2) {
        synchronized (InlinePatch.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7f4b79d1", new Object[]{str, str2})).intValue();
            } else if (!sInited) {
                return -1;
            } else {
                System.load(str);
                System.load(str2);
                return nativeInstall(str2, isThreadSafeMode());
            }
        }
    }

    private static boolean isThreadSafeMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ece3b14f", new Object[0])).booleanValue();
        }
        return ABGlobal.isFeatureOpened(null, "tconscraper_thread_safe");
    }

    private static native int nativeInstall(String str, boolean z);

    private static native int nativeUnInstall(String str, boolean z);

    public static synchronized int uninstall(String str) {
        synchronized (InlinePatch.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("64ccade6", new Object[]{str})).intValue();
            } else if (!sInited) {
                return -1;
            } else {
                return nativeUnInstall(str, isThreadSafeMode());
            }
        }
    }
}
