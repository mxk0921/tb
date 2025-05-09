package com.meizu.cloud.pushsdk.f.g;

import android.content.Context;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;
import tb.pg1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final String f5883a = "e";

    public static long a(String str) {
        long j;
        long j2 = 0;
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt <= 127) {
                j = 1;
            } else if (charAt <= 2047) {
                j = 2;
            } else {
                if (charAt >= 55296 && charAt <= 57343) {
                    j2 += 4;
                    i++;
                } else if (charAt < 65535) {
                    j = 3;
                } else {
                    j2 += 4;
                }
                i++;
            }
            j2 += j;
            i++;
        }
        return j2;
    }

    public static Point b(Context context) {
        WindowManager windowManager;
        Point point = new Point();
        Display display = null;
        try {
            windowManager = (WindowManager) context.getSystemService(pg1.ATOM_EXT_window);
        } catch (Exception unused) {
            String str = f5883a;
            c.b(str, "Display.getSize isn't available on older devices.", new Object[0]);
            if (display != null) {
                point.x = display.getWidth();
                point.y = display.getHeight();
            } else {
                c.b(str, "error get display", new Object[0]);
            }
        }
        if (windowManager == null) {
            return null;
        }
        display = windowManager.getDefaultDisplay();
        Display.class.getMethod("getSize", Point.class);
        display.getSize(point);
        return point;
    }

    public static String c(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                return telephonyManager.getSimOperator();
            }
        } catch (Exception e) {
            String str = f5883a;
            c.b(str, "getOperator error " + e.getMessage(), new Object[0]);
        }
        return null;
    }

    public static boolean d(Context context) {
        boolean z;
        try {
            String str = f5883a;
            c.c(str, "Checking tracker internet connectivity.", new Object[0]);
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return false;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                z = false;
            } else {
                z = true;
            }
            c.a(str, "Tracker connection online: %s", Boolean.valueOf(z));
            return z;
        } catch (Exception e) {
            c.b(f5883a, "Security exception checking connection: %s", e.toString());
            return true;
        }
    }

    private static Object a(Object obj) {
        return obj;
    }

    public static String b() {
        return Long.toString(System.currentTimeMillis());
    }

    public static String a() {
        return UUID.randomUUID().toString();
    }

    public static String a(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                return telephonyManager.getNetworkOperatorName();
            }
            return null;
        } catch (Exception e) {
            c.b(f5883a, "getCarrier: %s", e.toString());
            return null;
        }
    }

    public static JSONObject a(Map map) {
        return new JSONObject(map);
    }

    public static boolean a(long j, long j2, long j3) {
        return j > j2 - j3;
    }
}
