package com.unionpay.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.security.MessageDigest;
import tb.qtx;
import tb.z3y;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class UPUtils {
    public static String a(int i) {
        boolean z;
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                z = true;
            } else {
                z = false;
            }
            return f(forUrl(i, z));
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String b(int i, String str) {
        try {
            return f(forConfig(i, str));
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String c(Context context, String str) {
        if (context == null) {
            return null;
        }
        String i = i(context.getSharedPreferences("UnionPayPluginEx.pref", 0).getString(str, ""), "0000000023456789abcdef1212345678");
        if (i != null && i.endsWith("00000000")) {
            return i.substring(0, i.length() - 8);
        }
        return "";
    }

    public static String d(String str) {
        try {
            byte[] bytes = str.getBytes();
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.reset();
            instance.update(bytes);
            return qtx.a(instance.digest());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String e(String str, String str2) {
        try {
            return qtx.a(z3y.b(qtx.b(str2), str.getBytes("utf-8")));
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String f(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        try {
            return new String(bArr, "utf-8");
        } catch (Throwable unused) {
            return "";
        }
    }

    public static native synchronized byte[] forCallingAppUrl(int i, boolean z);

    public static native synchronized byte[] forConfig(int i, String str);

    public static native synchronized byte[] forDirectAppsUrl(int i, boolean z);

    public static native synchronized byte[] forScanUrl(int i, boolean z);

    public static native synchronized byte[] forUrl(int i, boolean z);

    public static native synchronized byte[] forWap(int i, String str);

    public static void g(Context context, String str, String str2) {
        if (context != null) {
            String e = e(str + "00000000", "0000000023456789abcdef1212345678");
            if (e == null) {
                e = "";
            }
            SharedPreferences.Editor edit = context.getSharedPreferences("UnionPayPluginEx.pref", 0).edit();
            edit.putString(str2, e);
            edit.commit();
        }
    }

    public static native synchronized String getIssuer(int i);

    public static native synchronized String getSubject(int i);

    public static native synchronized String getTalkingDataIdForAssist(int i);

    public static String h(int i, String str) {
        try {
            return f(forWap(i, str));
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String i(String str, String str2) {
        try {
            return new String(z3y.c(qtx.b(str2), qtx.b(str)), "utf-8").trim();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void j(Context context, String str) {
        if (context != null) {
            SharedPreferences.Editor edit = context.getSharedPreferences("UnionPayPluginEx.pref", 0).edit();
            edit.remove(str);
            edit.commit();
        }
    }

    public static String k(int i) {
        boolean z;
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                z = true;
            } else {
                z = false;
            }
            return f(forCallingAppUrl(i, z));
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String l(int i) {
        boolean z;
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                z = true;
            } else {
                z = false;
            }
            return f(forDirectAppsUrl(i, z));
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
