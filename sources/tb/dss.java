package tb;

import android.app.AppOpsManager;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class dss {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(625999966);
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
                wdm.d("TableUtils.checkFloatPermission.小于23版本.b = " + declaredField2.getInt(cls2), new Object[0]);
                if (intValue == declaredField2.getInt(cls2)) {
                    return true;
                }
                return false;
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
                wdm.d("TableUtils.checkFloatPermission.大于26.b=" + z, new Object[0]);
                return z;
            } else {
                canDrawOverlays = Settings.canDrawOverlays(context);
                wdm.d("TableUtils.checkFloatPermission.大于23.小于26，b=" + canDrawOverlays, new Object[0]);
                if (!canDrawOverlays || !d()) {
                    return canDrawOverlays;
                }
                if (b(context) != 0) {
                    z = false;
                }
                wdm.d("TableUtils.checkFloatPermission.isVivo.结果为" + z, new Object[0]);
                return z;
            }
        } catch (Throwable th) {
            wdm.h("TableUtils.checkFloatPermission.error.", th);
            return false;
        }
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
                wdm.h("TableUtils.getFloatPermissionStatus.error.", th);
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

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("347e3281", new Object[0])).booleanValue();
        }
        String str = Build.BRAND;
        return !TextUtils.isEmpty(str) && str.toLowerCase().contains("vivo");
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
            wdm.h("TableUtils.getFloatPermissionStatus2.error.", th);
            if (0 == 0 || cursor.isClosed()) {
                return -1;
            }
            cursor.close();
            return -1;
        }
    }
}
