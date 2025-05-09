package com.taobao.wireless.security.adapter.datacollection;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: com.taobao.wireless.security.adapter.datacollection.д  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0817 {

    /* renamed from: а  reason: contains not printable characters */
    private static String f600;

    /* renamed from: б  reason: contains not printable characters */
    private static PackageManager f601;

    /* renamed from: в  reason: contains not printable characters */
    private static Context f602;

    /* renamed from: а  reason: contains not printable characters */
    public static String m384() {
        PackageInfo packageInfo;
        String str;
        try {
            if (f601 == null || f600 == null || (packageInfo = f601.getPackageInfo(f600, 0)) == null || (str = packageInfo.versionName) == null) {
                return null;
            }
            if (str.length() != 0) {
                return str;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: б  reason: contains not printable characters */
    public static String m385() {
        return f600;
    }

    /* renamed from: в  reason: contains not printable characters */
    public static boolean m386(String str) {
        try {
            PackageManager packageManager = f601;
            if (packageManager != null) {
                return packageManager.hasSystemFeature(str);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: г  reason: contains not printable characters */
    public static void m387(Context context) {
        if (context != null && f601 == null) {
            f602 = context;
            try {
                f600 = context.getPackageName();
            } catch (Throwable unused) {
            }
            try {
                f601 = context.getPackageManager();
            } catch (Throwable unused2) {
            }
        }
    }
}
