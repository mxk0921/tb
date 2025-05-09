package com.alibaba.security.realidentity;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class c5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabb0489", new Object[]{activity, new Integer(i)});
        } else {
            b5.a(activity, i);
        }
    }

    public static void b(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb8c0be8", new Object[]{activity, new Integer(i)});
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (b(activity, true) || a(activity, true)) {
            activity.getWindow().setStatusBarColor(i);
        }
        if (i2 >= 23) {
            activity.getWindow().setBackgroundDrawableResource(17170445);
            activity.getWindow().getDecorView().setSystemUiVisibility(9216);
            activity.getWindow().setStatusBarColor(i);
            View childAt = ((ViewGroup) activity.getWindow().findViewById(16908290)).getChildAt(0);
            if (childAt != null) {
                childAt.setFitsSystemWindows(true);
                ViewCompat.requestApplyInsets(childAt);
            }
        }
    }

    public static boolean a(Activity activity, boolean z) {
        try {
            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            Field declaredField = WindowManager.LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
            Field declaredField2 = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            int i = declaredField.getInt(null);
            int i2 = declaredField2.getInt(attributes);
            declaredField2.setInt(attributes, z ? i2 | i : (~i) & i2);
            activity.getWindow().setAttributes(attributes);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean b(Activity activity, boolean z) {
        try {
            Class<?> cls = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            Window window = activity.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            window.getDecorView().setSystemUiVisibility(8192);
            Class<?> cls2 = activity.getWindow().getClass();
            int i = cls.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls);
            Class<?> cls3 = Integer.TYPE;
            cls2.getMethod("setExtraFlags", cls3, cls3).invoke(activity.getWindow(), Integer.valueOf(z ? i : 0), Integer.valueOf(i));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
