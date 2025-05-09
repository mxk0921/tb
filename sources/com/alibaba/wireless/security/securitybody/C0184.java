package com.alibaba.wireless.security.securitybody;

import android.content.Context;
import android.telephony.TelephonyManager;

/* renamed from: com.alibaba.wireless.security.securitybody.б  reason: contains not printable characters */
/* loaded from: classes.dex */
class C0184 {

    /* renamed from: а  reason: contains not printable characters */
    private static TelephonyManager f451 = null;

    /* renamed from: б  reason: contains not printable characters */
    private static volatile String f452 = null;

    /* renamed from: в  reason: contains not printable characters */
    private static volatile String f453 = null;

    /* renamed from: г  reason: contains not printable characters */
    private static final int f454 = 2;

    /* renamed from: д  reason: contains not printable characters */
    private static int f455;

    /* renamed from: е  reason: contains not printable characters */
    private static int f456;

    /* renamed from: ё  reason: contains not printable characters */
    private static Context f457;

    C0184() {
    }

    /* renamed from: а  reason: contains not printable characters */
    public static void m266(Context context) {
        if (context != null && f457 == null) {
            f457 = context;
        }
        if (context != null && f451 == null) {
            try {
                f451 = (TelephonyManager) context.getSystemService("phone");
            } catch (Throwable unused) {
            }
        }
    }
}
