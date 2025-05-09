package com.xiaomi.push;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.service.p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class db {

    /* renamed from: a  reason: collision with root package name */
    private static int f14818a = -1;

    /* renamed from: a  reason: collision with other field name */
    private static dh f826a;

    /* renamed from: a  reason: collision with other field name */
    private static String f827a;

    private static int a(Context context) {
        String str;
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                b(null);
                return -1;
            } else if (activeNetworkInfo.getType() == 0) {
                String subtypeName = activeNetworkInfo.getSubtypeName();
                if (TextUtils.isEmpty(subtypeName) || "UNKNOWN".equalsIgnoreCase(subtypeName)) {
                    str = null;
                } else {
                    str = "M-" + subtypeName;
                }
                b(str);
                return 0;
            } else {
                if (!(activeNetworkInfo.getType() == 1 || activeNetworkInfo.getType() == 6)) {
                    b(null);
                    return -1;
                }
                b("WIFI-ID-UNKNOWN");
                return 1;
            }
        } catch (Exception e) {
            b.d("DisconnectStatsHelper getNetType occurred error: " + e.getMessage());
            b(null);
            return -1;
        }
    }

    public static void b(Context context, gq gqVar) {
        dh dhVar = f826a;
        if (dhVar != null) {
            gqVar.b(dhVar);
            f826a = null;
            a("stopStats");
        }
    }

    private static synchronized String a() {
        String str;
        synchronized (db.class) {
            str = f827a;
        }
        return str;
    }

    private static synchronized void b(String str) {
        synchronized (db.class) {
            try {
                if ("WIFI-ID-UNKNOWN".equals(str)) {
                    String str2 = f827a;
                    if (str2 == null || !str2.startsWith("W-")) {
                        f827a = null;
                    }
                } else {
                    f827a = str;
                }
                a("updateNetId new networkId = " + str + ", finally netId = " + f827a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static void m577a(Context context) {
        String str;
        if (!m578a(context)) {
            str = "onReconnection shouldSampling = false";
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            f14818a = a(context);
            de.a(context, currentTimeMillis);
            str = "onReconnection connectedNetworkType = " + f14818a;
        }
        a(str);
    }

    public static void a(Context context, gq gqVar) {
        if (m578a(context)) {
            if (f826a == null) {
                f826a = new dh(context);
            }
            gqVar.a(f826a);
            a("startStats");
        }
    }

    public static void a(Context context, String str) {
        if (!m578a(context)) {
            a("onWifiChanged shouldSampling = false");
            return;
        }
        a("onWifiChanged wifiDigest = " + str);
        if (!TextUtils.isEmpty(str)) {
            b("W-" + str);
        }
    }

    public static void a(Context context, String str, int i) {
        String str2;
        if (!m578a(context)) {
            str2 = "onDisconnection shouldSampling = false";
        } else {
            de.a(context, str, bg.c(context), System.currentTimeMillis(), i, p.a(context).m1082b(), a(context), a(), f14818a);
            str2 = "onDisconnection";
        }
        a(str2);
    }

    public static void a(String str) {
        cy.a("Push-DiscntStats", str);
    }

    /* renamed from: a  reason: collision with other method in class */
    private static boolean m578a(Context context) {
        return cy.a(context);
    }
}
