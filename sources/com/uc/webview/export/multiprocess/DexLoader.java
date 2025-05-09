package com.uc.webview.export.multiprocess;

import android.os.Build;
import com.uc.webview.export.multiprocess.helper.c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
class DexLoader {
    private static final String TAG = "DexLoader";
    private static final int sLibLoadResult;

    static {
        int i;
        Object th;
        try {
            System.loadLibrary("dexloaderuc");
            th = null;
            i = 0;
        } catch (NullPointerException e) {
            th = e;
            i = -1004;
        } catch (SecurityException e2) {
            th = e2;
            i = -1002;
        } catch (UnsatisfiedLinkError e3) {
            th = e3;
            i = -1003;
        } catch (Throwable th2) {
            th = th2;
            i = -1001;
        }
        if (th != null) {
            c.c(TAG, "load libdexloaderuc.so exception: ".concat(String.valueOf(th)));
        }
        sLibLoadResult = i;
    }

    public static Object loadDexByFd(int i) {
        if (sLibLoadResult != 0) {
            throw new RuntimeException("load library libdexloaderuc.so failed!");
        } else if (Build.VERSION.SDK_INT < 23) {
            return Long.valueOf(loadDexByFdOnL(i));
        } else {
            return loadDexByFdOnLAbove(i);
        }
    }

    private static long loadDexByFdOnL(int i) {
        return nativeLoadDexByFdOnL(i);
    }

    private static Object loadDexByFdOnLAbove(int i) {
        return nativeLoadDexByFdOnLAbove(i);
    }

    private static native long nativeLoadDexByFdOnL(int i);

    private static native Object nativeLoadDexByFdOnLAbove(int i);
}
