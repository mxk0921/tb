package com.alibaba.one.sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import org.android.agoo.common.AgooConstants;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static volatile String f2506a;
    private static volatile PackageManager b;
    private static Context c;

    public static String a() {
        ApplicationInfo applicationInfo;
        try {
            PackageManager packageManager = b;
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(f2506a, 0)) == null) {
                return null;
            }
            return packageManager.getApplicationLabel(applicationInfo).toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Context context) {
        if (context != null && b == null) {
            c = context;
            try {
                f2506a = context.getPackageName();
            } catch (Throwable unused) {
            }
            try {
                b = context.getPackageManager();
            } catch (Throwable unused2) {
            }
        }
    }

    public static boolean b() {
        PackageInfo packageInfo;
        try {
            if (b == null || f2506a == null || (packageInfo = b.getPackageInfo(f2506a, 0)) == null || (packageInfo.applicationInfo.flags & 1) == 0) {
                return false;
            }
            return (packageInfo.applicationInfo.flags & 128) == 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String c() {
        Signature[] signatureArr;
        try {
            if (c == null || (signatureArr = c.getPackageManager().getPackageInfo("android", 64).signatures) == null || signatureArr.length <= 0) {
                return null;
            }
            return d.a(signatureArr[0].toCharsString());
        } catch (Exception unused) {
            return null;
        }
    }

    public static String d() {
        String replace;
        try {
            StringBuilder sb = new StringBuilder();
            for (FeatureInfo featureInfo : c.getPackageManager().getSystemAvailableFeatures()) {
                String str = featureInfo.name;
                if (str != null) {
                    if (str.startsWith("android.hardware")) {
                        replace = str.replace("android.hardware.", "H.");
                    } else if (str.startsWith("android.software")) {
                        replace = str.replace("android.software.", "S.");
                    }
                    sb.append(replace);
                    sb.append(",");
                }
            }
            return sb.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String e() {
        PackageManager packageManager;
        Context context = c;
        if (context == null || (packageManager = context.getPackageManager()) == null) {
            return null;
        }
        String packageName = c.getPackageName();
        JSONObject jSONObject = new JSONObject();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
            if (applicationInfo != null) {
                jSONObject.put(AgooConstants.MESSAGE_FLAG, applicationInfo.flags);
                jSONObject.put("dlp", packageManager.getApplicationLabel(applicationInfo).toString());
            }
        } catch (Exception unused) {
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            if (packageInfo != null) {
                jSONObject.put("fi", packageInfo.firstInstallTime);
                jSONObject.put("lu", packageInfo.lastUpdateTime);
            }
        } catch (Exception unused2) {
        }
        return jSONObject.toString();
    }
}
