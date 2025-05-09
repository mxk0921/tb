package tb;

import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zd7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f32693a = "";
    public static int b = 0;
    public static int c = 0;

    static {
        t2o.a(435159099);
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0ea9f0d", new Object[]{context})).intValue();
        }
        if (context != null) {
            Cursor cursor = null;
            try {
                Cursor query = context.getContentResolver().query(Uri.parse("content://com.iqoo.secure.provider.secureprovider/allowfloatwindowapp"), null, "pkgname = ?", new String[]{context.getPackageName()}, null);
                if (query == null) {
                    return c(context);
                }
                query.getColumnNames();
                if (query.moveToFirst()) {
                    int i = query.getInt(query.getColumnIndex("currentlmode"));
                    query.close();
                    return i;
                }
                query.close();
                return c(context);
            } catch (Throwable th) {
                yv8.b("TableUtils.getFloatPermissionStatus.error.", th);
                if (0 == 0 || cursor.isClosed()) {
                    return -1;
                }
                cursor.close();
                return -1;
            }
        } else {
            throw new IllegalArgumentException("context is null");
        }
    }

    public static float d(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6885ccb4", new Object[]{context, new Float(f)})).floatValue();
        }
        if (Float.isNaN(f)) {
            return f;
        }
        float intValue = (f * ((Integer) e(context).first).intValue()) / 750.0f;
        double d = intValue;
        if (d <= 0.005d || intValue >= 1.0f) {
            return (float) Math.rint(d);
        }
        return 1.0f;
    }

    public static Pair<Integer, Integer> e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("a41e0848", new Object[]{context});
        }
        if (b > 0 && c > 0) {
            return new Pair<>(Integer.valueOf(b), Integer.valueOf(c));
        }
        if (context != null) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            b = displayMetrics.widthPixels;
            c = displayMetrics.heightPixels;
        }
        return new Pair<>(Integer.valueOf(b), Integer.valueOf(c));
    }

    public static boolean f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b036e38", new Object[]{context})).booleanValue();
        }
        try {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.startsWith(context.getPackageName())) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static int c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c177df49", new Object[]{context})).intValue();
        }
        Cursor cursor = null;
        try {
            Cursor query = context.getContentResolver().query(Uri.parse("content://com.vivo.permissionmanager.provider.permission/float_window_apps"), null, "pkgname = ?", new String[]{context.getPackageName()}, null);
            if (query != null) {
                if (query.moveToFirst()) {
                    int i = query.getInt(query.getColumnIndex("currentmode"));
                    query.close();
                    return i;
                }
                query.close();
            }
            return 1;
        } catch (Throwable th) {
            yv8.b("TableUtils.getFloatPermissionStatus2.error.", th);
            if (0 == 0 || cursor.isClosed()) {
                return -1;
            }
            cursor.close();
            return -1;
        }
    }

    public static boolean a(Context context) {
        boolean canDrawOverlays;
        boolean canDrawOverlays2;
        boolean z = true;
        int i = Build.VERSION.SDK_INT;
        try {
            if (i < 23) {
                Class<?> cls = Class.forName("android.content.Context");
                Field declaredField = cls.getDeclaredField("APP_OPS_SERVICE");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(cls);
                if (!(obj instanceof String)) {
                    return false;
                }
                Object invoke = cls.getMethod("getSystemService", String.class).invoke(context, (String) obj);
                Class<?> cls2 = Class.forName("android.app.AppOpsManager");
                Field declaredField2 = cls2.getDeclaredField("MODE_ALLOWED");
                declaredField2.setAccessible(true);
                Class<?> cls3 = Integer.TYPE;
                int intValue = ((Integer) cls2.getMethod("checkOp", cls3, cls3, String.class).invoke(invoke, 24, Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue();
                yv8.a("TableUtils.checkFloatPermission.小于23版本.b = " + declaredField2.getInt(cls2), new Object[0]);
                return intValue == declaredField2.getInt(cls2);
            } else if (i >= 26) {
                AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
                if (appOpsManager == null) {
                    return false;
                }
                int checkOpNoThrow = appOpsManager.checkOpNoThrow("android:system_alert_window", Process.myUid(), context.getPackageName());
                canDrawOverlays2 = Settings.canDrawOverlays(context);
                if (!canDrawOverlays2 && checkOpNoThrow != 0) {
                    z = false;
                }
                yv8.a("TableUtils.checkFloatPermission.大于26.b=" + z, new Object[0]);
                return z;
            } else {
                canDrawOverlays = Settings.canDrawOverlays(context);
                yv8.a("TableUtils.checkFloatPermission.大于23.小于26，b=" + canDrawOverlays, new Object[0]);
                String str = Build.BRAND;
                if (!canDrawOverlays || TextUtils.isEmpty(str) || !str.toLowerCase().contains("vivo")) {
                    return canDrawOverlays;
                }
                if (b(context) != 0) {
                    z = false;
                }
                yv8.a("TableUtils.checkFloatPermission.isVivo.结果为" + z, new Object[0]);
                return z;
            }
        } catch (Throwable th) {
            yv8.b("TableUtils.checkFloatPermission.error.", th);
            return false;
        }
    }

    public static String g(Context context) {
        String valueOf;
        boolean areNotificationsEnabled;
        boolean z = true;
        if (!TextUtils.isEmpty(f32693a)) {
            return f32693a;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                areNotificationsEnabled = ((NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION)).areNotificationsEnabled();
                valueOf = String.valueOf(areNotificationsEnabled);
            } catch (Throwable th) {
                yv8.b("Android above 7.0 isNotificationEnabled.error.", th);
                valueOf = "unknown";
                f32693a = valueOf;
                return valueOf;
            }
        } else {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                String packageName = context.getApplicationContext().getPackageName();
                int i = applicationInfo.uid;
                Class<?> cls = Class.forName(AppOpsManager.class.getName());
                Class<?> cls2 = Integer.TYPE;
                Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
                Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(appOpsManager);
                num.intValue();
                if (((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i), packageName)).intValue() != 0) {
                    z = false;
                }
                valueOf = String.valueOf(z);
            } catch (Throwable th2) {
                yv8.b("Android below 7.0 isNotificationEnabled.error.", th2);
                valueOf = "unknown";
                f32693a = valueOf;
                return valueOf;
            }
        }
        f32693a = valueOf;
        return valueOf;
    }
}
