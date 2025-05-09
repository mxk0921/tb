package tb;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xkq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f31447a = xkq.class.getSimpleName();

    static {
        t2o.a(310378909);
    }

    public static boolean a(Activity activity, boolean z) {
        Window window = activity.getWindow();
        if (window != null) {
            try {
                WindowManager.LayoutParams attributes = window.getAttributes();
                Field declaredField = WindowManager.LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
                Field declaredField2 = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
                declaredField.setAccessible(true);
                declaredField2.setAccessible(true);
                int i = declaredField.getInt(null);
                int i2 = declaredField2.getInt(attributes);
                declaredField2.setInt(attributes, z ? i2 | i : (~i) & i2);
                window.setAttributes(attributes);
                return true;
            } catch (Throwable th) {
                r0h.c(f31447a, "setFlymeStatusBarTextMode exp.", th);
            }
        }
        return false;
    }

    public static void c(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cead4e6", new Object[]{activity, new Integer(i)});
        } else {
            activity.getWindow().setStatusBarColor(activity.getResources().getColor(i));
        }
    }

    public static void d(Activity activity, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1914acca", new Object[]{activity, new Boolean(z), new Integer(i)});
        } else if (activity != null) {
            if (!z) {
                c(activity, i);
                return;
            }
            c(activity, i);
            int i2 = Build.VERSION.SDK_INT;
            if (vbk.b(activity.getApplicationContext())) {
                b(activity, z);
            } else if (vbk.a(activity.getApplicationContext())) {
                a(activity, z);
            } else if (i2 >= 23) {
                Window window = activity.getWindow();
                window.addFlags(Integer.MIN_VALUE);
                window.clearFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
                window.getDecorView().setSystemUiVisibility(9472);
            } else {
                r0h.b(f31447a, "setStatusBarMode: system is 4.4 ~ 6.0.");
            }
        }
    }

    public static void e(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c13953c2", new Object[]{activity});
            return;
        }
        Window window = activity.getWindow();
        window.clearFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        window.getDecorView().setSystemUiVisibility(1280);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
    }

    public static boolean b(Activity activity, boolean z) {
        Throwable th;
        boolean z2 = true;
        Window window = activity.getWindow();
        if (window == null) {
            return false;
        }
        Class<?> cls = window.getClass();
        try {
            Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            Class<?> cls3 = Integer.TYPE;
            Method method = cls.getMethod("setExtraFlags", cls3, cls3);
            if (z) {
                method.invoke(window, Integer.valueOf(i), Integer.valueOf(i));
            } else {
                method.invoke(window, 0, Integer.valueOf(i));
            }
        } catch (Throwable th2) {
            th = th2;
            z2 = false;
        }
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                if (z) {
                    activity.getWindow().getDecorView().setSystemUiVisibility(9216);
                } else {
                    activity.getWindow().getDecorView().setSystemUiVisibility(0);
                }
            }
            return true;
        } catch (Throwable th3) {
            th = th3;
            r0h.c(f31447a, "setMIUIStatusBarTextMode isDark=" + z, th);
            return z2;
        }
    }
}
