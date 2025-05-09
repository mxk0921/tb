package tb;

import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.SystemBarDecorator;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class oxr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final oxr INSTANCE = new oxr();

    static {
        t2o.a(849346564);
    }

    @JvmStatic
    public static final int a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff76fc17", new Object[]{new Boolean(z), new Boolean(z2)})).intValue();
        }
        if (z && z2) {
            return 1024;
        }
        if (z && !z2) {
            return 1026;
        }
        if (z || !z2) {
            return yj4.VIEW_TYPE_NEW_HOMEPAGE_ONLOOK;
        }
        return yj4.VIEW_TYPE_NEW_HOMEPAGE_ONLOOK_HEAD;
    }

    @JvmStatic
    public static final void b(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf33009e", new Object[]{activity, new Boolean(z)});
            return;
        }
        ckf.g(activity, "activity");
        e(activity, z);
        f(activity, false, false);
    }

    @JvmStatic
    public static final void c(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39ae535e", new Object[]{activity, new Boolean(z)});
            return;
        }
        ckf.g(activity, "activity");
        new SystemBarDecorator(activity).enableImmersiveStatusBar(z);
    }

    @JvmStatic
    public static final void d(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0fe806", new Object[]{activity, new Boolean(z)});
            return;
        }
        ckf.g(activity, "activity");
        e(activity, z);
        f(activity, true, false);
    }

    @JvmStatic
    public static final void e(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da74b13d", new Object[]{activity, new Boolean(z)});
            return;
        }
        int i = Build.VERSION.SDK_INT;
        activity.getWindow().setStatusBarColor(0);
        activity.getWindow().setNavigationBarColor(0);
        if (i >= 23) {
            if (z) {
                activity.getWindow().addFlags(8192);
            } else {
                activity.getWindow().clearFlags(8192);
            }
        }
        oxr oxrVar = INSTANCE;
        if (oxrVar.g()) {
            oxrVar.h(activity, z);
        } else {
            oxrVar.i(activity, z);
        }
    }

    @JvmStatic
    public static final void f(Activity activity, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16e594e8", new Object[]{activity, new Boolean(z), new Boolean(z2)});
            return;
        }
        activity.getWindow().getDecorView().setSystemUiVisibility(a(z, z2));
        int i = Build.VERSION.SDK_INT;
        activity.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility() | 4096);
        if (i >= 28) {
            activity.getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        }
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7df980db", new Object[]{this})).booleanValue();
        }
        return ckf.b("Xiaomi", Build.MANUFACTURER);
    }

    public final void i(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a040c9ed", new Object[]{this, activity, new Boolean(z)});
        } else {
            j(activity, z, true);
        }
    }

    public final void j(Activity activity, boolean z, boolean z2) {
        if (activity != null) {
            try {
                Method method = Activity.class.getMethod("setStatusBarDarkIcon", Boolean.TYPE);
                ckf.f(method, "Activity::class.java.get…imitiveType\n            )");
                method.invoke(activity, Boolean.valueOf(z));
            } catch (IllegalAccessException e) {
                Log.getStackTraceString(e);
            } catch (NoSuchMethodException e2) {
                Log.getStackTraceString(e2);
            } catch (InvocationTargetException e3) {
                Log.getStackTraceString(e3);
            }
        }
    }

    public final boolean h(Activity activity, boolean z) {
        if (activity == null) {
            return false;
        }
        try {
            Window window = activity.getWindow();
            Class<?> cls = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            Field field = cls.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE");
            ckf.f(field, "layoutParams.getField(\"E…AG_STATUS_BAR_DARK_MODE\")");
            int i = field.getInt(cls);
            Class<?> cls2 = window.getClass();
            Class<?> cls3 = Integer.TYPE;
            Method method = cls2.getMethod("setExtraFlags", cls3, cls3);
            ckf.f(method, "window.javaClass.getMeth…imitiveType\n            )");
            if (z) {
                method.invoke(window, Integer.valueOf(i), Integer.valueOf(i));
            } else {
                method.invoke(window, 0, Integer.valueOf(i));
            }
            return true;
        } catch (Exception e) {
            Log.getStackTraceString(e);
            return false;
        }
    }
}
