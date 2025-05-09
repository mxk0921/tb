package tb;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ai {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f15754a = -1;
    public static DisplayMetrics b;
    public static Resources c;

    static {
        t2o.a(79691957);
    }

    public static int a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("777b781d", new Object[]{new Float(f)})).intValue();
        }
        return (int) (f * b().density);
    }

    public static DisplayMetrics b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DisplayMetrics) ipChange.ipc$dispatch("7ffda3c1", new Object[0]);
        }
        DisplayMetrics displayMetrics = b;
        if (displayMetrics == null) {
            return Resources.getSystem().getDisplayMetrics();
        }
        return displayMetrics;
    }

    public static Resources c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Resources) ipChange.ipc$dispatch("36fe0307", new Object[0]);
        }
        Resources resources = c;
        if (resources == null) {
            return Resources.getSystem();
        }
        return resources;
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d9e9723", new Object[0])).intValue();
        }
        if (f15754a < 0) {
            DisplayMetrics b2 = b();
            f15754a = Math.max(b2.widthPixels, b2.heightPixels);
        }
        return f15754a;
    }

    public static int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1b6fc8c", new Object[0])).intValue();
        }
        int identifier = c().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return c().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
            return;
        }
        Resources resources = context.getResources();
        c = resources;
        b = resources.getDisplayMetrics();
    }
}
