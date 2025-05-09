package com.mobile.auth;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import com.cmic.sso.sdk.a;
import com.huawei.hms.android.SystemUtils;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O0OO0Oo {
    private static final boolean O00000o;
    private static boolean O00000oO;
    private static long O00000oo;
    private static final String O000000o = Build.BRAND;
    private static final String O00000Oo = Build.MODEL;
    private static final String O00000o0 = "android" + Build.VERSION.RELEASE;

    static {
        boolean z;
        if (Build.VERSION.SDK_INT <= 28) {
            z = true;
        } else {
            z = false;
        }
        O00000o = z;
        O00000oO = true;
        O00000oo = 0L;
    }

    public static int O000000o(Context context, boolean z, a aVar) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        try {
            connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
            int type = activeNetworkInfo.getType();
            if (type == 1) {
                O0O0O.O00000Oo("TelephonyUtils", "WIFI");
                boolean O000000o2 = O0O0o00.O000000o(context, "android.permission.CHANGE_NETWORK_STATE");
                O0O0O.O000000o("TelephonyUtils", "CHANGE_NETWORK_STATE=" + O000000o2);
                if (!O000000o2 || !z || !O000000o(connectivityManager, context, aVar)) {
                    return 2;
                }
                O0O0O.O00000Oo("TelephonyUtils", "流量数据 WIFI 同开");
                return 3;
            }
            if (type == 0) {
                O0O0O.O00000Oo("TelephonyUtils", "流量");
                return 1;
            }
            return 0;
        }
        return 0;
    }

    public static String O00000Oo() {
        return O00000Oo;
    }

    public static boolean O00000o() {
        return O00000o;
    }

    public static String O00000o0() {
        return O00000o0;
    }

    public static boolean O00000oO() {
        String str = O000000o;
        O0O0O.O000000o("brand", str);
        return SystemUtils.PRODUCT_HUAWEI.equalsIgnoreCase(str);
    }

    public static boolean O00000oo() {
        String str = O000000o;
        O0O0O.O000000o("brand", str);
        return SystemUtils.PRODUCT_HONOR.equalsIgnoreCase(str);
    }

    public static String O000000o() {
        return O000000o;
    }

    public static boolean O000000o(Context context) {
        if (SystemClock.elapsedRealtime() - O00000oo > 3000) {
            O00000oo = SystemClock.elapsedRealtime();
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                boolean z = true;
                if (1 == telephonyManager.getSimState()) {
                    z = false;
                }
                O00000oO = z;
                return z;
            }
        }
        return O00000oO;
    }

    private static boolean O000000o(ConnectivityManager connectivityManager, Context context, a aVar) {
        String str;
        int defaultSubscriptionId;
        TelephonyManager createForSubscriptionId;
        boolean isDataEnabled;
        boolean z = false;
        try {
            Method declaredMethod = ConnectivityManager.class.getDeclaredMethod("getMobileDataEnabled", new Class[0]);
            declaredMethod.setAccessible(true);
            z = ((Boolean) declaredMethod.invoke(connectivityManager, new Object[0])).booleanValue();
            O0O0O.O00000Oo("TelephonyUtils", "data is on ---------" + z);
            if (Build.VERSION.SDK_INT >= 26) {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null && O0O0o00.O000000o(context, "android.permission.ACCESS_NETWORK_STATE")) {
                    defaultSubscriptionId = SubscriptionManager.getDefaultSubscriptionId();
                    createForSubscriptionId = telephonyManager.createForSubscriptionId(defaultSubscriptionId);
                    isDataEnabled = createForSubscriptionId.isDataEnabled();
                    str = isDataEnabled ? "1" : "0";
                }
                return z;
            }
            str = "-1";
            aVar.a("networkTypeByAPI", str);
            return z;
        } catch (Exception unused) {
            O0O0O.O000000o("TelephonyUtils", "isMobileEnabled ----反射出错-----");
            return z;
        }
    }
}
