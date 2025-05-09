package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class p91 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile Application b;
    public static String c;
    public static final JSONObject processMap = new JSONObject();

    /* renamed from: a  reason: collision with root package name */
    public static int f25955a = -1;

    static {
        t2o.a(468713749);
    }

    public static Application a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[0]);
        }
        if (b == null) {
            synchronized (p91.class) {
                try {
                    if (b == null) {
                        b = h();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public static int b(Context context, boolean z, FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f68d712", new Object[]{context, new Boolean(z), fluidContext})).intValue();
        }
        int e = e();
        ir9.b("AppUtils", "getAvailableHeight PickPreloadControllerNew,测量组件宽高时适配底部虚拟导航栏，tabBarParentHeight：" + e);
        if (e <= 0) {
            e = s6o.t(context);
        }
        boolean d = f2k.d(fluidContext);
        int b2 = f2k.b(context, d);
        int i = e - b2;
        ir9.b("AppUtils", "减去topGap， topGap=" + b2);
        if (d) {
            if (pto.i(fluidContext) || !pto.p(context, z)) {
                return i;
            }
            int i2 = i - i();
            ir9.b("AppUtils", "减去手淘底bar高度 bottomTabBarHeight：" + i() + ";availableHeight=" + i2);
            return i2;
        } else if (!b93.n(fluidContext) || !pto.p(context, z)) {
            return i;
        } else {
            int i3 = i();
            int i4 = i - i3;
            ir9.b("AppUtils", "减去手淘底bar高度 bottomTabBarHeight：" + i3 + ";availableHeight=" + i4);
            return i4;
        }
    }

    public static ViewGroup c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("6b0a418f", new Object[0]);
        }
        return od0.D().f().Q();
    }

    public static ViewGroup d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("83c171c5", new Object[0]);
        }
        ViewGroup Q = od0.D().f().Q();
        if (Q != null && (Q.getParent() instanceof ViewGroup)) {
            return (ViewGroup) Q.getParent();
        }
        return null;
    }

    public static int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be89d54a", new Object[0])).intValue();
        }
        try {
            ViewGroup d = d();
            if (d == null) {
                return 0;
            }
            return d.getHeight();
        } catch (Throwable th) {
            ir9.b("AppUtils", "获取底部TabBar父节点的高度，" + th.getMessage());
            return 0;
        }
    }

    public static long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89e961db", new Object[0])).longValue();
        }
        chb g = c21.g();
        if (g != null) {
            long j = g.getLong("startProcessSystemTime", -1L);
            if (j != -1) {
                return System.currentTimeMillis() - j;
            }
        }
        return -1L;
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4fb6b1e", new Object[0]);
        }
        if (TextUtils.isEmpty(c) && a() != null) {
            c = a().getPackageName();
        }
        return c;
    }

    public static Application h() {
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Method declaredMethod = cls.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            Field declaredField = cls.getDeclaredField("mInitialApplication");
            declaredField.setAccessible(true);
            return (Application) declaredField.get(declaredMethod.invoke(null, new Object[0]));
        } catch (Exception e) {
            ir9.c("AppUtils", "getSystemApp error", e);
            return null;
        }
    }

    public static int i() {
        View childAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ce096ae", new Object[0])).intValue();
        }
        int c2 = pr9.c(a(), 48);
        try {
            ViewGroup d = d();
            if (d == null || (childAt = d.getChildAt(0)) == null) {
                return c2;
            }
            int[] iArr = new int[2];
            d.getLocationOnScreen(iArr);
            int height = iArr[1] + d.getHeight();
            int[] iArr2 = new int[2];
            childAt.getLocationOnScreen(iArr2);
            int height2 = height - (iArr2[1] + childAt.getHeight());
            return height2 > 0 ? height2 : c2;
        } catch (Throwable th) {
            ir9.b("AppUtils", "获取底部TabBar的高度，" + th.getMessage());
            return c2;
        }
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a49c51c7", new Object[0])).booleanValue();
        }
        return k(a());
    }

    public static boolean k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3169ab69", new Object[]{context})).booleanValue();
        }
        if (f25955a == -1) {
            try {
                if ((context.getApplicationInfo().flags & 2) != 0) {
                    f25955a = 1;
                } else {
                    f25955a = 0;
                }
            } catch (Exception unused) {
                f25955a = 0;
            }
        }
        if (f25955a == 1) {
            return true;
        }
        return false;
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("522b454b", new Object[0])).booleanValue();
        }
        return gbr.b();
    }

    public static boolean m(Context context) {
        ViewGroup Q;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("526df805", new Object[]{context})).booleanValue();
        }
        if ((context instanceof Activity) && (Q = od0.D().f().Q()) != null && Q.getContext() == context) {
            return true;
        }
        return false;
    }
}
