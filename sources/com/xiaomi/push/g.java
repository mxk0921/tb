package com.xiaomi.push;

import android.app.AppOpsManager;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alipay.mobile.common.transportext.amnet.Baggage;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.vivo.push.PushClientConstants;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private static a f14892a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
        Map<String, String> a(Context context, String str);

        /* renamed from: a  reason: collision with other method in class */
        boolean m708a(Context context, String str);

        boolean b(Context context, String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public enum b {
        UNKNOWN(0),
        ALLOWED(1),
        NOT_ALLOWED(2);
        

        /* renamed from: a  reason: collision with other field name */
        private final int f1019a;

        b(int i) {
            this.f1019a = i;
        }

        public int a() {
            return this.f1019a;
        }
    }

    public static int a(Context context) {
        Bundle bundle;
        if (context == null) {
            return 0;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(PushClientConstants.COM_ANDROID_SYSTEMUI, 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                return 0;
            }
            return bundle.getInt("SupportForPushVersionCode");
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    public static int b(Context context, String str) {
        ApplicationInfo a2 = m700a(context, str);
        if (a2 == null) {
            return 0;
        }
        int i = a2.icon;
        return i == 0 ? a2.logo : i;
    }

    public static boolean c(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        if (packageInfo == null) {
            return false;
        }
        return true;
    }

    public static boolean d(Context context, String str) {
        if (context.getPackageManager().checkPermission(str, context.getPackageName()) == 0) {
            return true;
        }
        return false;
    }

    public static boolean e(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (Settings.Secure.getInt(context.getContentResolver(), "freeform_window_state", -1) >= 0) {
                return str.equals(Settings.Secure.getString(context.getContentResolver(), "freeform_package_name"));
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int a(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
        } catch (Exception unused) {
            packageInfo = null;
        }
        if (packageInfo != null) {
            return packageInfo.versionCode;
        }
        return 0;
    }

    /* renamed from: b  reason: collision with other method in class */
    public static String m706b(Context context, String str) {
        ApplicationInfo applicationInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            return (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null) ? str : packageManager.getApplicationLabel(applicationInfo).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            return str;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    private static ApplicationInfo m700a(Context context, String str) {
        if (str.equals(context.getPackageName())) {
            return context.getApplicationInfo();
        }
        try {
            return context.getPackageManager().getApplicationInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            com.xiaomi.channel.commonutils.logger.b.m410a("not found app info ".concat(str));
            return null;
        }
    }

    /* renamed from: b  reason: collision with other method in class */
    public static boolean m707b(Context context, String str) {
        a aVar = f14892a;
        return aVar != null && aVar.b(context, str);
    }

    /* renamed from: a  reason: collision with other method in class */
    public static Drawable m701a(Context context, String str) {
        ApplicationInfo a2 = m700a(context, str);
        Drawable drawable = null;
        if (a2 != null) {
            try {
                drawable = a2.loadIcon(context.getPackageManager());
                if (drawable == null) {
                    drawable = a2.loadLogo(context.getPackageManager());
                }
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.m410a("get app icon drawable failed, " + e);
            }
        }
        return drawable != null ? drawable : new ColorDrawable(0);
    }

    private static b a(Context context, ApplicationInfo applicationInfo) {
        Boolean bool;
        boolean areNotificationsEnabled;
        int i = Build.VERSION.SDK_INT;
        if (applicationInfo == null || i < 24) {
            return b.UNKNOWN;
        }
        try {
            if (applicationInfo.packageName.equals(context.getPackageName())) {
                areNotificationsEnabled = ((NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION)).areNotificationsEnabled();
                bool = Boolean.valueOf(areNotificationsEnabled);
            } else {
                Object a2 = i >= 29 ? bh.a(context.getSystemService(RemoteMessageConst.NOTIFICATION), "getService", new Object[0]) : context.getSystemService(Baggage.Amnet.CFG_SSL);
                bool = a2 != null ? (Boolean) bh.b(a2, "areNotificationsEnabledForPackage", applicationInfo.packageName, Integer.valueOf(applicationInfo.uid)) : null;
            }
            if (bool != null) {
                return bool.booleanValue() ? b.ALLOWED : b.NOT_ALLOWED;
            }
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m410a("are notifications enabled error " + e);
        }
        return b.UNKNOWN;
    }

    public static b a(Context context, String str, boolean z) {
        ApplicationInfo applicationInfo;
        b a2;
        b bVar;
        if (context == null || TextUtils.isEmpty(str)) {
            return b.UNKNOWN;
        }
        try {
            applicationInfo = str.equals(context.getPackageName()) ? context.getApplicationInfo() : context.getPackageManager().getApplicationInfo(str, 0);
            a2 = a(context, applicationInfo);
            bVar = b.UNKNOWN;
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.b.m410a("get app op error " + th);
        }
        if (a2 != bVar) {
            return a2;
        }
        Integer num = (Integer) bh.a((Class<? extends Object>) AppOpsManager.class, "OP_POST_NOTIFICATION");
        if (num == null) {
            return bVar;
        }
        Integer num2 = (Integer) bh.a((Object) ((AppOpsManager) context.getSystemService("appops")), "checkOpNoThrow", num, Integer.valueOf(applicationInfo.uid), str);
        int i = (Integer) bh.a((Class<? extends Object>) AppOpsManager.class, "MODE_ALLOWED");
        int i2 = (Integer) bh.a((Class<? extends Object>) AppOpsManager.class, "MODE_IGNORED");
        com.xiaomi.channel.commonutils.logger.b.b("get app mode " + num2 + "|" + i + "|" + i2);
        if (i == null) {
            i = 0;
        }
        if (i2 == null) {
            i2 = 1;
        }
        if (num2 != null) {
            return z ? !num2.equals(i2) ? b.ALLOWED : b.NOT_ALLOWED : num2.equals(i) ? b.ALLOWED : b.NOT_ALLOWED;
        }
        return b.UNKNOWN;
    }

    public static String a() {
        String processName = Build.VERSION.SDK_INT >= 28 ? Application.getProcessName() : (String) bh.a(ProcessUtils.ACTIVITY_THREAD, "currentProcessName", new Object[0]);
        return !TextUtils.isEmpty(processName) ? processName : "";
    }

    /* renamed from: a  reason: collision with other method in class */
    public static String m702a(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
        } catch (Exception unused) {
            packageInfo = null;
        }
        return packageInfo != null ? packageInfo.versionName : "1.0";
    }

    /* renamed from: a  reason: collision with other method in class */
    public static Map<String, String> m703a(Context context, String str) {
        a aVar = f14892a;
        if (aVar == null) {
            return null;
        }
        return aVar.a(context, str);
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m704a(Context context) {
        String a2 = a();
        if (TextUtils.isEmpty(a2) || context == null) {
            return false;
        }
        return a2.equals(context.getPackageName());
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m705a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (!j.m868a()) {
            return context.getPackageName().equals(str);
        }
        a aVar = f14892a;
        return aVar != null && aVar.m708a(context, str);
    }
}
