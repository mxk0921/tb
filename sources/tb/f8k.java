package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class f8k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Method f19103a;

    public static boolean a(Activity activity, boolean z) {
        Application application;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f489e3c5", new Object[]{activity, new Boolean(z)})).booleanValue();
        }
        if (activity == null || (application = activity.getApplication()) == null) {
            return false;
        }
        boolean z2 = application.getSharedPreferences("AutoSizeNotch", 0).getBoolean("KEY_IS_NOTCH_SCREEN", false);
        if (z2 || !z) {
            return z2;
        }
        if (Build.VERSION.SDK_INT >= 26 && (f(activity) || b(activity) || e(activity) || d(activity) || c())) {
            g(activity, true);
        }
        return false;
    }

    public static boolean b(Context context) {
        boolean z;
        Boolean bool;
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            bool = (Boolean) loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0]);
        } catch (ClassNotFoundException unused) {
            TLog.loge("hasNotchInScreenAtHuawei()-> ClassNotFoundException", new String[0]);
        } catch (NoSuchMethodException unused2) {
            TLog.loge("hasNotchInScreenAtHuawei()-> NoSuchMethodException", new String[0]);
        } catch (Exception unused3) {
            TLog.loge("hasNotchInScreenAtHuawei()-> Exception", new String[0]);
        }
        if (bool != null) {
            z = bool.booleanValue();
            TLog.loge("hasNotchInScreenAtHuawei()-> ClassNotFoundException", new String[0]);
            return z;
        }
        z = false;
        TLog.loge("hasNotchInScreenAtHuawei()-> ClassNotFoundException", new String[0]);
        return z;
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8434903", new Object[]{context})).booleanValue();
        }
        return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    public static boolean e(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("android.util.FtFeature");
            return ((Boolean) loadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(loadClass, 32)).booleanValue();
        } catch (ClassNotFoundException unused) {
            TLog.loge("hasNotchInScreenAtVivo()-> ClassNotFoundException", new String[0]);
            return false;
        } catch (NoSuchMethodException unused2) {
            TLog.loge("hasNotchInScreenAtVivo()-> NoSuchMethodException", new String[0]);
            return false;
        } catch (Exception unused3) {
            TLog.loge("hasNotchInScreenAtVivo()-> Exception", new String[0]);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
        r4 = r4.getRootWindowInsets();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
        r4 = r4.getDisplayCutout();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
        r4 = r4.getBoundingRects();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean f(android.app.Activity r4) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.f8k.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "8aa57c56"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            java.lang.Object r4 = r2.ipc$dispatch(r3, r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L_0x0019:
            android.view.Window r4 = r4.getWindow()
            android.view.View r4 = r4.getDecorView()
            if (r4 == 0) goto L_0x0044
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            if (r2 >= r3) goto L_0x002a
            goto L_0x0044
        L_0x002a:
            android.view.WindowInsets r4 = tb.zop.a(r4)
            if (r4 != 0) goto L_0x0031
            return r0
        L_0x0031:
            android.view.DisplayCutout r4 = tb.sgx.a(r4)
            if (r4 == 0) goto L_0x0044
            java.util.List r4 = tb.e8k.a(r4)
            if (r4 == 0) goto L_0x0044
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0044
            r0 = 1
        L_0x0044:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.f8k.f(android.app.Activity):boolean");
    }

    public static void g(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e1ab05c", new Object[]{context, new Boolean(z)});
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("AutoSizeNotch", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (!sharedPreferences.contains("KEY_IS_NOTCH_SCREEN")) {
            edit.putBoolean("KEY_IS_NOTCH_SCREEN", z);
        } else if (sharedPreferences.contains("KEY_IS_NOTCH_SCREEN") && !sharedPreferences.getBoolean("KEY_IS_NOTCH_SCREEN", false)) {
            edit.putBoolean("KEY_IS_NOTCH_SCREEN", z);
        }
        edit.apply();
    }

    public static boolean c() {
        try {
            if (f19103a == null) {
                f19103a = Class.forName("android.os.SystemProperties").getMethod("getBoolean", String.class, Boolean.TYPE);
            }
            return ((Boolean) f19103a.invoke(null, "ro.miui.notch", Boolean.FALSE)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
