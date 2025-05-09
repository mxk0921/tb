package com.huawei.hms.framework.common;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import tb.a2n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class Utils {
    private static final String TAG = "Utils";

    public static long getCurrentTime(boolean z) {
        if (z) {
            return SystemClock.elapsedRealtime();
        }
        return System.currentTimeMillis();
    }

    public static boolean is64Bit(Context context) {
        Context context2;
        boolean is64Bit;
        boolean z = false;
        if (context == null) {
            Logger.e(TAG, "Null context, please check it.");
            return false;
        }
        if (context.getApplicationContext() == null) {
            context2 = context;
        } else {
            context2 = context.getApplicationContext();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            is64Bit = Process.is64Bit();
            return is64Bit;
        }
        try {
            return context2.getPackageManager().getApplicationInfo(context2.getPackageName(), 128).nativeLibraryDir.contains(a2n.ARCH_BIT64);
        } catch (PackageManager.NameNotFoundException unused) {
            Logger.e(TAG, "Get application info failed: name not found, try to get baseContext.");
            if (context instanceof ContextWrapper) {
                Context baseContext = ((ContextWrapper) context).getBaseContext();
                z = true;
                if (baseContext == null) {
                    Logger.w(TAG, "Get baseContext failed: null. Return default: is64-bit.");
                    return true;
                }
                try {
                    z = baseContext.getPackageManager().getApplicationInfo(baseContext.getPackageName(), 128).nativeLibraryDir.contains(a2n.ARCH_BIT64);
                } catch (PackageManager.NameNotFoundException unused2) {
                    Logger.e(TAG, "Get baseContext application info failed: name not found");
                }
            }
            return z;
        }
    }
}
