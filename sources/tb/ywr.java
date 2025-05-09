package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ywr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262841);
    }

    public static boolean a(WindowManager.LayoutParams layoutParams, String str, boolean z) {
        int i;
        try {
            Field declaredField = layoutParams.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            int i2 = declaredField.getInt(layoutParams);
            Field declaredField2 = layoutParams.getClass().getDeclaredField("meizuFlags");
            declaredField2.setAccessible(true);
            int i3 = declaredField2.getInt(layoutParams);
            if (z) {
                i = i2 | i3;
            } else {
                i = (~i2) & i3;
            }
            if (i3 == i) {
                return false;
            }
            declaredField2.setInt(layoutParams, i);
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c053d360", new Object[0])).booleanValue();
        }
        return true;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7df980db", new Object[0])).booleanValue();
        }
        return "Xiaomi".equals(Build.MANUFACTURER);
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdedcb43", new Object[0])).booleanValue();
        }
        return "Meizu".endsWith(Build.MANUFACTURER);
    }

    public static void f(Context context, Window window, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7b630c0", new Object[]{context, window, new Boolean(z)});
        } else {
            g(context, window, z, true);
        }
    }

    public static void h(View view, boolean z) {
        int i;
        try {
            int i2 = View.class.getField("SYSTEM_UI_FLAG_LIGHT_STATUS_BAR").getInt(null);
            int systemUiVisibility = view.getSystemUiVisibility();
            if (z) {
                i = systemUiVisibility | i2;
            } else {
                i = (~i2) & systemUiVisibility;
            }
            if (i != systemUiVisibility) {
                view.setSystemUiVisibility(i);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void i(Window window, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93934242", new Object[]{window, new Boolean(z)});
        } else if (!b()) {
            a(window.getAttributes(), "MEIZU_FLAG_DARK_STATUS_BAR_ICON", z);
        } else {
            View decorView = window.getDecorView();
            if (decorView != null) {
                h(decorView, z);
            }
        }
    }

    public static void g(Context context, Window window, boolean z, boolean z2) {
        if (context != null) {
            try {
                Method method = Activity.class.getMethod("setStatusBarDarkIcon", Boolean.TYPE);
                if (method != null && (context instanceof Activity)) {
                    method.invoke(context, Boolean.valueOf(z));
                } else if (z2 && window != null) {
                    i(window, z);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static boolean e(Window window, boolean z) {
        if (window == null) {
            return false;
        }
        try {
            Class<?> cls = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i = cls.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls);
            Class<?> cls2 = window.getClass();
            Class<?> cls3 = Integer.TYPE;
            Method method = cls2.getMethod("setExtraFlags", cls3, cls3);
            if (z) {
                method.invoke(window, Integer.valueOf(i), Integer.valueOf(i));
            } else {
                method.invoke(window, 0, Integer.valueOf(i));
            }
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }
}
