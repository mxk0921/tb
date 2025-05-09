package com.alibaba.one.sdk;

import android.content.Context;
import android.net.Proxy;
import android.net.wifi.WifiManager;
import android.os.Build;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static Context f2513a;
    private static WifiManager b;

    public static void a(Context context) {
        if (context != null && f2513a == null) {
            f2513a = context;
        }
        if (context != null && b == null) {
            try {
                b = (WifiManager) context.getSystemService("wifi");
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean a() {
        if (Build.VERSION.SDK_INT > 14) {
            String property = System.getProperty("http.proxyHost");
            return property != null && property.length() > 0;
        }
        String host = Proxy.getHost(f2513a);
        return host != null && host.length() > 0;
    }
}
