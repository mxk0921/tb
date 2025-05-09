package com.alibaba.one.sdk;

import android.content.Context;
import android.telephony.TelephonyManager;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static TelephonyManager f2508a;

    public static String a() {
        try {
            return f2508a.getSimOperatorName();
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Context context) {
        if (context != null && f2508a == null) {
            try {
                f2508a = (TelephonyManager) context.getSystemService("phone");
            } catch (Throwable unused) {
            }
        }
    }

    public static String b() {
        String networkOperatorName;
        try {
            TelephonyManager telephonyManager = f2508a;
            if (telephonyManager == null || (networkOperatorName = telephonyManager.getNetworkOperatorName()) == null) {
                return null;
            }
            if (networkOperatorName.length() != 0) {
                return networkOperatorName;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
