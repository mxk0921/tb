package tb;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class yyv {
    static {
        t2o.a(612368432);
    }

    public static String a(int[] iArr) {
        StringBuilder sb = new StringBuilder();
        for (int i : iArr) {
            sb.append((char) i);
        }
        return sb.toString();
    }

    public static int b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Exception e) {
            dgh.a("getVersionCode--Exception:" + e.getMessage());
            return 0;
        }
    }

    public static int c(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (Exception e) {
            dgh.a("getVersionCode--Exception:" + e.getMessage());
            return 0;
        }
    }

    public static String d(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e) {
            dgh.a("getVersionName--Exception:" + e.getMessage());
            return "0";
        }
    }

    public static String e(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (Exception e) {
            dgh.a("getVersionName--Exception:" + e.getMessage());
            return null;
        }
    }

    public static boolean f(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            dgh.b("isExistPackage NameNotFoundException:" + e.getMessage());
            return false;
        }
    }

    public static boolean g(Context context, String str, String str2) {
        ApplicationInfo applicationInfo;
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
        } catch (PackageManager.NameNotFoundException e) {
            dgh.b("isSupportPush NameNotFoundException:" + e.getMessage());
            applicationInfo = null;
        }
        if (applicationInfo == null || !applicationInfo.metaData.getBoolean(str2, false)) {
            return false;
        }
        return true;
    }

    public static boolean h(Context context) {
        return b6n.s().K(context);
    }

    public static int i(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException e) {
                dgh.b("parseInt--NumberFormatException" + e.getMessage());
            }
        }
        return -1;
    }
}
