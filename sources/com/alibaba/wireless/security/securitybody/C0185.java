package com.alibaba.wireless.security.securitybody;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Build;

/* renamed from: com.alibaba.wireless.security.securitybody.в  reason: contains not printable characters */
/* loaded from: classes.dex */
class C0185 {

    /* renamed from: а  reason: contains not printable characters */
    private static Context f458 = null;

    /* renamed from: б  reason: contains not printable characters */
    private static WifiManager f459 = null;

    /* renamed from: в  reason: contains not printable characters */
    private static final String f460 = "02:00:00:00:00:00";

    /* renamed from: г  reason: contains not printable characters */
    private static final String f461 = "00:00:00:00:00:00";

    C0185() {
    }

    /* renamed from: а  reason: contains not printable characters */
    public static boolean m267() {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        Context context = f458;
        return context != null && context.checkSelfPermission("android.permission.INTERNET") == 0;
    }

    /* renamed from: б  reason: contains not printable characters */
    public static void m268(Context context) {
        if (context != null && f458 == null) {
            f458 = context;
        }
        if (context != null && f459 == null) {
            try {
                f459 = (WifiManager) context.getSystemService("wifi");
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: в  reason: contains not printable characters */
    public static boolean m269(String str) {
        return str != null && !str.equalsIgnoreCase(f460) && !str.equalsIgnoreCase(f461);
    }
}
