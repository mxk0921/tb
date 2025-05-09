package tb;

import android.content.Context;
import android.util.DisplayMetrics;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class mtq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static float f24299a;
    public static int b;
    public static Context c;
    public static final float d = 640.0f;
    public static boolean e = true;

    static {
        t2o.a(1039138863);
    }

    public static int a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("777b781d", new Object[]{new Float(f)})).intValue();
        }
        float f2 = (f * f24299a) + 0.5f;
        if (f2 <= 0.0f || f2 >= 1.0f) {
            return (int) f2;
        }
        return 0;
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4638814", new Object[0])).intValue();
        }
        int i = c.getResources().getConfiguration().orientation;
        return b;
    }

    public static int c(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1a33ddf5", new Object[]{new Float(f)})).intValue();
        }
        if (e) {
            if (f == -2.0f) {
                return -2;
            }
            if (f < 0.0f) {
                return -1;
            }
            return a(f);
        } else if (f == -2.0f) {
            return -2;
        } else {
            if (f < 0.0f) {
                return -1;
            }
            float f2 = f24299a;
            if (f2 > 0.0f) {
                return a(f / f2);
            }
            return f(f);
        }
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
        } else {
            e(context, true);
        }
    }

    public static void e(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b35b22e3", new Object[]{context, new Boolean(z)});
            return;
        }
        Context applicationContext = context.getApplicationContext();
        c = applicationContext;
        if (applicationContext == null) {
            f24299a = 0.0f;
            e = false;
            return;
        }
        DisplayMetrics displayMetrics = applicationContext.getResources().getDisplayMetrics();
        f24299a = displayMetrics.density;
        e = z;
        b = displayMetrics.widthPixels;
    }

    public static int f(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66384d7e", new Object[]{new Float(f)})).intValue();
        }
        float b2 = (f * b()) / d;
        if (b2 <= 0.0f || b2 >= 1.0f) {
            return (int) b2;
        }
        return 1;
    }
}
