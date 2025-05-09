package tb;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.tao.Globals;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vwo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f30304a;
    public static int b;

    static {
        t2o.a(511705653);
    }

    public static boolean a(Window window, boolean z) {
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
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8b22c66", new Object[]{context})).intValue();
        }
        if (!context.getTheme().resolveAttribute(16843499, new TypedValue(), true)) {
            return 0;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{16843499});
        int dimension = (int) obtainStyledAttributes.getDimension(0, 0.0f);
        obtainStyledAttributes.recycle();
        return dimension;
    }

    public static int d(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e765beb3", new Object[]{activity})).intValue();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static int e(Context context) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb976a8b", new Object[]{context})).intValue();
        }
        if (b == 0) {
            Resources resources = context.getResources();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            int i3 = resources.getConfiguration().orientation;
            if (i3 == 1) {
                i = displayMetrics.widthPixels;
            } else {
                i = displayMetrics.heightPixels;
            }
            f30304a = i;
            if (i3 == 1) {
                i2 = displayMetrics.heightPixels;
            } else {
                i2 = displayMetrics.widthPixels;
            }
            b = i2;
        }
        int i4 = b;
        if (i4 > 0) {
            return i4;
        }
        return 1280;
    }

    public static int f(Context context) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b36f1410", new Object[]{context})).intValue();
        }
        boolean P = TBDeviceUtils.P(Globals.getApplication());
        boolean p = TBDeviceUtils.p(Globals.getApplication());
        if (P || p) {
            return TBAutoSizeConfig.x().H(context);
        }
        if (f30304a == 0) {
            Resources resources = context.getResources();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            int i3 = resources.getConfiguration().orientation;
            if (i3 == 1) {
                i = displayMetrics.widthPixels;
            } else {
                i = displayMetrics.heightPixels;
            }
            f30304a = i;
            if (i3 == 1) {
                i2 = displayMetrics.heightPixels;
            } else {
                i2 = displayMetrics.widthPixels;
            }
            b = i2;
        }
        int i4 = f30304a;
        if (i4 > 0) {
            return i4;
        }
        return 720;
    }

    public static void h(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d57cffb4", new Object[]{activity});
        } else if ((activity instanceof AppCompatActivity) && ((AppCompatActivity) activity).getSupportActionBar() != null) {
            try {
                ((AppCompatActivity) activity).getSupportActionBar().hide();
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean i(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72f9f77d", new Object[]{activity})).booleanValue();
        }
        if ((activity.getWindow().getDecorView().getSystemUiVisibility() & 1024) == 1024 && (activity.getWindow().getDecorView().getSystemUiVisibility() & 256) == 256) {
            return true;
        }
        return false;
    }

    public static void k(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81792cac", new Object[]{activity, new Boolean(z)});
            return;
        }
        Window window = activity.getWindow();
        if (window == null) {
            return;
        }
        if (z) {
            window.addFlags(128);
        } else {
            window.clearFlags(128);
        }
    }

    public static void l(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d4ec884", new Object[]{activity, new Integer(i)});
        } else {
            activity.getWindow().setNavigationBarColor(i);
        }
    }

    public static void m(Activity activity, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e9c16a9", new Object[]{activity, new Integer(i), new Boolean(z)});
            return;
        }
        j(activity.getWindow(), z);
        a(activity.getWindow(), z);
        View decorView = activity.getWindow().getDecorView();
        if (Build.VERSION.SDK_INT >= 23 && z) {
            decorView.setSystemUiVisibility(8192);
        }
        activity.getWindow().setStatusBarColor(i);
    }

    public static void n(Activity activity, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f028cc84", new Object[]{activity, new Integer(i), new Boolean(z)});
            return;
        }
        h(activity);
        j(activity.getWindow(), z);
        a(activity.getWindow(), z);
        activity.getWindow().clearFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        activity.getWindow().setStatusBarColor(i);
        activity.getWindow().addFlags(Integer.MIN_VALUE);
        activity.getWindow().getDecorView().setSystemUiVisibility(1280);
        if (Build.VERSION.SDK_INT >= 23 && z) {
            activity.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility() | 8192);
        }
    }

    public static void o(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62963021", new Object[]{activity, new Boolean(z)});
        } else {
            n(activity, 0, z);
        }
    }

    public static void p(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9e9b3b", new Object[]{activity});
        } else {
            activity.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility() & (-1281));
        }
    }

    public static int c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b91d22e4", new Object[]{context})).intValue();
        }
        try {
            int identifier = context.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
            if (identifier > 0) {
                return context.getResources().getDimensionPixelSize(identifier);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{context})).intValue();
        }
        try {
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                return context.getResources().getDimensionPixelSize(identifier);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static boolean j(Window window, boolean z) {
        if (window != null) {
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
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
