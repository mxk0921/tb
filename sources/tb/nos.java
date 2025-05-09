package tb;

import android.content.Context;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class nos {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262858);
    }

    public static boolean a(Context context, Window window) {
        if (window == null) {
            return false;
        }
        return true;
    }

    public static boolean b(Context context, Window window, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0d6ba69", new Object[]{context, window, new Boolean(z)})).booleanValue();
        }
        if (window == null) {
            return false;
        }
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        try {
            if (z) {
                window.clearFlags(201326592);
                window.getDecorView().setSystemUiVisibility(systemUiVisibility | 9472);
                window.addFlags(Integer.MIN_VALUE);
            } else {
                window.clearFlags(201334784);
                window.getDecorView().setSystemUiVisibility(systemUiVisibility | 1280);
                window.addFlags(Integer.MIN_VALUE);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        window.setStatusBarColor(0);
        if (ywr.c()) {
            ywr.e(window, z);
        } else if (ywr.d()) {
            ywr.f(context, window, z);
        }
        return true;
    }

    public static void c(Window window, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60f5709", new Object[]{window, new Integer(i)});
        } else if (window != null) {
            window.setNavigationBarColor(i);
        }
    }
}
