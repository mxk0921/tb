package com.mobile.auth.gatewayauth.utils.security;

import android.content.Context;
import android.os.Build;
import com.alibaba.security.realidentity.g4;
import com.mobile.auth.gatewayauth.ExceptionProcessor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class EmulatorDetector {
    private static final String TAG = "EmulatorDetector";
    private static int rating = -1;

    private static final String getProp(Context context, String str) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
            return (String) loadClass.getMethod("get", String.class).invoke(loadClass, str);
        } catch (Exception unused) {
            return null;
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

    /* JADX WARN: Can't wrap try/catch for region: R(29:8|9|(20:30|34|35|(1:47)|48|49|(1:57)|58|59|(1:77)|78|(1:94)|95|(1:103)|104|(1:120)|136|121|(1:123)|126)|33|34|35|(1:37)|47|48|49|(1:51)|57|58|59|(1:61)|77|78|(1:80)|94|95|(1:97)|103|104|(1:106)|120|136|121|(0)|126) */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01ca, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01cb, code lost:
        com.mobile.auth.gatewayauth.utils.O0000Oo0.O000000o(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isEmulator(android.content.Context r15) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.gatewayauth.utils.security.EmulatorDetector.isEmulator(android.content.Context):boolean");
    }

    private static boolean isEmulatorAbsoluly(Context context) {
        try {
            if (mayOnEmulatorViaQEMU(context)) {
                return true;
            }
            String str = Build.PRODUCT;
            if (!str.contains(g4.a.f2721a) && !str.contains("sdk_x86") && !str.contains("sdk_google") && !str.contains("Andy") && !str.contains("Droid4X") && !str.contains("nox") && !str.contains("vbox86p") && !str.contains("aries")) {
                String str2 = Build.MANUFACTURER;
                if ("Genymotion".equals(str2) || str2.contains("Andy") || str2.contains("nox") || str2.contains("TiantianVM") || Build.BRAND.contains("Andy")) {
                    return true;
                }
                String str3 = Build.DEVICE;
                if (!str3.contains("Andy") && !str3.contains("Droid4X") && !str3.contains("nox") && !str3.contains("vbox86p") && !str3.contains("aries")) {
                    String str4 = Build.MODEL;
                    if (!str4.contains("Emulator") && !"google_sdk".equals(str4) && !str4.contains("Droid4X") && !str4.contains("TiantianVM") && !str4.contains("Andy") && !"Android SDK built for x86_64".equals(str4) && !"Android SDK built for x86".equals(str4)) {
                        String str5 = Build.HARDWARE;
                        if (!"vbox86".equals(str5) && !str5.contains("nox") && !str5.contains("ttVM_x86")) {
                            String str6 = Build.FINGERPRINT;
                            if (!str6.contains("generic/sdk/generic") && !str6.contains("generic_x86/sdk_x86/generic_x86") && !str6.contains("Andy") && !str6.contains("ttVM_Hdragon") && !str6.contains("generic/google_sdk/generic") && !str6.contains("vbox86p")) {
                                if (!str6.contains("generic/vbox86p/vbox86p")) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
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

    private static final boolean mayOnEmulatorViaQEMU(Context context) {
        try {
            return "1".equals(getProp(context, "ro.kernel.qemu"));
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
