package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class pr9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Integer f26251a;

    static {
        t2o.a(468713752);
    }

    public static int a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("560f7fa5", new Object[]{new Float(f)})).intValue();
        }
        return (int) ((750.0f / f()) * f);
    }

    public static int b(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec7ccd11", new Object[]{context, new Float(f)})).intValue();
        }
        return (int) ((f * s6o.l(context)) + 0.5d);
    }

    public static int c(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec7cd854", new Object[]{context, new Integer(i)})).intValue();
        }
        return s6o.c(context, i);
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e89be20", new Object[0])).intValue();
        }
        if (f26251a == null) {
            f26251a = Integer.valueOf(Math.round(qp0.c()));
        }
        return f26251a.intValue();
    }

    public static int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d9e9723", new Object[0])).intValue();
        }
        return s6o.t(p91.a());
    }

    public static int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43d49fe", new Object[0])).intValue();
        }
        return s6o.B(p91.a());
    }

    public static float g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c6dfc2c", new Object[0])).floatValue();
        }
        return f() / s6o.l(p91.a());
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e76299e6", new Object[0])).booleanValue();
        }
        return TBDeviceUtils.p(p91.a());
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1700b7be", new Object[0])).booleanValue();
        }
        if (i() || m()) {
            return true;
        }
        return false;
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddfc0546", new Object[0])).booleanValue();
        }
        if (!j() || g() <= 480.0f) {
            return false;
        }
        return true;
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4cb91fb8", new Object[0])).booleanValue();
        }
        return j();
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28591831", new Object[0])).booleanValue();
        }
        return TBDeviceUtils.P(p91.a());
    }

    public static int n(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7d56dd42", new Object[]{context, new Integer(i)})).intValue();
        }
        return s6o.H(context, i);
    }

    public static int o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("71cb6b2f", new Object[]{new Integer(i)})).intValue();
        }
        if (l()) {
            return n(p91.a(), i) * 2;
        }
        return a(i);
    }

    public static int p(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2c7bf480", new Object[]{context, new Float(f)})).intValue();
        }
        float B = ((s6o.B(context) / 750.0f) * f) + 0.5f;
        if (B != 0.0f || f <= 0.0f) {
            return (int) B;
        }
        return 1;
    }

    public static int q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ab2f052", new Object[]{new Integer(i)})).intValue();
        }
        if (l()) {
            return c(p91.a(), i / 2);
        }
        return p(p91.a(), i);
    }

    public static int h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{context})).intValue();
        }
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }
}
