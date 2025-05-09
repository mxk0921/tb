package com.huawei.hms.android;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.support.log.HMSLog;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class SystemUtils {
    public static final String PRODUCT_BRAND = "ro.product.brand";
    public static final String PRODUCT_HONOR = "HONOR";
    public static final String PRODUCT_HUAWEI = "HUAWEI";
    public static final String UNKNOWN = "unknown";

    private static String a() {
        return getSystemProperties("ro.product.locale", "");
    }

    private static String b() {
        return getSystemProperties("ro.product.locale.region", "");
    }

    public static String getAndoridVersion() {
        return getSystemProperties("ro.build.version.release", "unknown");
    }

    public static String getLocalCountry() {
        Locale locale = Locale.getDefault();
        if (locale != null) {
            return locale.getCountry();
        }
        return "";
    }

    public static String getManufacturer() {
        return getSystemProperties("ro.product.manufacturer", "unknown");
    }

    public static long getMegabyte(double d) {
        double d2;
        if (Build.VERSION.SDK_INT > 25) {
            d2 = 1000.0d;
        } else {
            d2 = 1024.0d;
        }
        return (long) (d * d2 * d2);
    }

    public static String getNetType(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable()) {
            return "";
        }
        return activeNetworkInfo.getTypeName();
    }

    public static String getPhoneModel() {
        return getSystemProperties("ro.product.model", "unknown");
    }

    public static String getSystemProperties(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            HMSLog.e("SystemUtils", "An exception occurred while reading: getSystemProperties:" + str);
            return str2;
        }
    }

    @Deprecated
    public static boolean isChinaROM() {
        String b = b();
        if (!TextUtils.isEmpty(b)) {
            return AdvanceSetting.CLEAR_NOTIFICATION.equalsIgnoreCase(b);
        }
        String a2 = a();
        if (!TextUtils.isEmpty(a2)) {
            return a2.toLowerCase(Locale.US).contains(AdvanceSetting.CLEAR_NOTIFICATION);
        }
        String localCountry = getLocalCountry();
        if (!TextUtils.isEmpty(localCountry)) {
            return AdvanceSetting.CLEAR_NOTIFICATION.equalsIgnoreCase(localCountry);
        }
        return false;
    }

    public static boolean isEMUI() {
        StringBuilder sb = new StringBuilder("is Emui :");
        int i = HwBuildEx.VERSION.EMUI_SDK_INT;
        sb.append(i);
        HMSLog.i("SystemUtils", sb.toString());
        if (i > 0) {
            return true;
        }
        return false;
    }

    public static boolean isHuawei() {
        String systemProperties = getSystemProperties(PRODUCT_BRAND, "unknown");
        return PRODUCT_HUAWEI.equalsIgnoreCase(systemProperties) || PRODUCT_HONOR.equalsIgnoreCase(systemProperties);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isSystemApp(android.content.Context r3, java.lang.String r4) {
        /*
            r0 = 0
            java.lang.String r1 = "SystemUtils"
            if (r3 != 0) goto L_0x000b
            java.lang.String r3 = "isSystemApp context is null"
            com.huawei.hms.support.log.HMSLog.w(r1, r3)
            return r0
        L_0x000b:
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: RuntimeException -> 0x0016, AndroidException -> 0x0018
            r2 = 16384(0x4000, float:2.2959E-41)
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r4, r2)     // Catch: RuntimeException -> 0x0016, AndroidException -> 0x0018
            goto L_0x003e
        L_0x0016:
            r3 = move-exception
            goto L_0x001a
        L_0x0018:
            r3 = move-exception
            goto L_0x002c
        L_0x001a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r2 = "isSystemApp RuntimeException:"
            r4.<init>(r2)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.huawei.hms.support.log.HMSLog.e(r1, r3)
            goto L_0x003d
        L_0x002c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r2 = "isSystemApp Exception: "
            r4.<init>(r2)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.huawei.hms.support.log.HMSLog.e(r1, r3)
        L_0x003d:
            r3 = 0
        L_0x003e:
            if (r3 == 0) goto L_0x0049
            android.content.pm.ApplicationInfo r3 = r3.applicationInfo
            int r3 = r3.flags
            r4 = 1
            r3 = r3 & r4
            if (r3 <= 0) goto L_0x0049
            r0 = 1
        L_0x0049:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.android.SystemUtils.isSystemApp(android.content.Context, java.lang.String):boolean");
    }

    public static boolean isTVDevice() {
        return getSystemProperties("ro.build.characteristics", "default").equalsIgnoreCase("tv");
    }
}
