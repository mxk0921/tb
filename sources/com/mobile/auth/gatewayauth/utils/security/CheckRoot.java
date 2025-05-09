package com.mobile.auth.gatewayauth.utils.security;

import android.os.Build;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.utils.O0000Oo0;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class CheckRoot {
    private static String LOG_TAG = "CheckRoot";

    private static boolean checkDeviceDebuggable() {
        try {
            String str = Build.TAGS;
            if (str == null || !str.contains("test-keys")) {
                return false;
            }
            O0000Oo0.O00000o("LOG_TAG, buildTags=" + str + ", Device is Debuggable");
            return true;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    private static boolean checkSuperuserApk() {
        try {
            if (new File("/system/app/Superuser.apk").exists()) {
                O0000Oo0.O00000o("LOG_TAG, /system/app/Superuser.apk exist");
                return true;
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
        return false;
    }

    public static String isDeviceRooted() {
        try {
            String str = "";
            if (checkDeviceDebuggable()) {
                str = "Device is debuggable";
            }
            if (checkSuperuserApk()) {
                str = "Device has super user!";
            }
            if (checkRootPathSU()) {
                return "Device has su!";
            }
            return str;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    private static boolean checkRootPathSU() {
        try {
            String[] strArr = {"/system/bin/", "/system/xbin/", "/system/sbin/", "/sbin/", "/vendor/bin/"};
            for (int i = 0; i < 5; i++) {
                try {
                    if (new File(strArr[i] + "su").exists()) {
                        O0000Oo0.O00000o("LOG_TAG, find su in : " + strArr[i]);
                        return true;
                    }
                } catch (Exception unused) {
                }
            }
            return false;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }
}
