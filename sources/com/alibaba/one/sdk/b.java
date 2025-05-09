package com.alibaba.one.sdk;

import android.content.Context;
import android.telephony.TelephonyManager;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static TelephonyManager f2503a = null;
    private static Context b = null;
    private static boolean c = false;

    public static void a(Context context) {
        if (context != null && f2503a == null) {
            b = context;
        }
    }
}
