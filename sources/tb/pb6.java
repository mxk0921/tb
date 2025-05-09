package tb;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.g;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class pb6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUFFIX_DXP = "dxp";
    public static final int WIDTH_REFER = 375;

    /* renamed from: a  reason: collision with root package name */
    public static int f25994a;
    public static boolean e;
    public static int f;
    public static final int DEFAULT_HEIGHT_SPEC = DXWidgetNode.DXMeasureSpec.c(8388607, 0);
    public static int b = -1;
    public static float c = -1.0f;
    public static final Map<String, Integer> d = new ConcurrentHashMap();

    static {
        t2o.a(444597697);
    }

    public static int A(DinamicXEngine dinamicXEngine, Context context, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1a075bbc", new Object[]{dinamicXEngine, context, new Float(f2)})).intValue();
        }
        Activity x = context == null ? DinamicXEngine.x() : context;
        if (!DinamicXEngine.j0() || dinamicXEngine != null) {
            Activity y = dinamicXEngine == null ? null : dinamicXEngine.y();
            if (y != null) {
                x = y;
            }
            if (nb6.j()) {
                return z(context, f2);
            }
            return B(dinamicXEngine, x, f2);
        }
        h36.g("DXScreenTool", "px2ap 获取像素单位 engine 为空，请处理");
        throw new RuntimeException("获取像素单位 engine 为空，请处理");
    }

    public static int B(DinamicXEngine dinamicXEngine, Context context, float f2) {
        float f3;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66bd4559", new Object[]{dinamicXEngine, context, new Float(f2)})).intValue();
        }
        nb6 d2 = nb6.d(dinamicXEngine);
        if (d2 != null && d2.c() != null) {
            return d2.c().px2Ap(dinamicXEngine, context, f2);
        }
        boolean b2 = nb6.b(d2);
        if (d2 != null) {
            i = d2.e();
        }
        if (b2) {
            mub p = g.p();
            if ((context instanceof Activity) && p != null) {
                f3 = p.g((Activity) context);
            } else if (nb6.j()) {
                return z(context, f2);
            } else {
                f3 = 1.0f;
            }
            return Math.round((f2 / f3) / l(context));
        }
        float f4 = f2 * 375.0f;
        if (i <= 0) {
            i = u(context);
        }
        return Math.round(f4 / i);
    }

    public static float C(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64b9d353", new Object[]{context, new Integer(i)})).floatValue();
        }
        return (i / context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static float D(Context context, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6ba8776", new Object[]{context, new Float(f2)})).floatValue();
        }
        return f2 / context.getResources().getDisplayMetrics().scaledDensity;
    }

    public static void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("951138d2", new Object[]{new Integer(i)});
        } else if (!e) {
            f = i;
            e = true;
        }
    }

    public static int b(Activity activity, float f2) {
        float f3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("44050b69", new Object[]{activity, new Float(f2)})).intValue();
        }
        mub p = g.p();
        if (p == null) {
            f3 = 1.0f;
        } else {
            f3 = p.g(activity);
        }
        return Math.round(f2 * f3 * l(activity));
    }

    @Deprecated
    public static int c(Context context, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5beac9d", new Object[]{context, new Float(f2)})).intValue();
        }
        return Math.round(s(context) * (f2 / 375.0f));
    }

    public static int d(DinamicXEngine dinamicXEngine, Context context, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63648b8e", new Object[]{dinamicXEngine, context, new Float(f2)})).intValue();
        }
        Activity x = context == null ? DinamicXEngine.x() : context;
        if (nb6.j()) {
            return c(context, f2);
        }
        if (!DinamicXEngine.j0() || dinamicXEngine != null) {
            Activity y = dinamicXEngine == null ? null : dinamicXEngine.y();
            if (y != null) {
                x = y;
            }
            return e(dinamicXEngine, x, f2);
        }
        h36.g("DXScreenTool", "ap2px 获取像素单位 engine 为空，请处理");
        throw new RuntimeException("获取像素单位 engine 为空，请处理");
    }

    public static int e(DinamicXEngine dinamicXEngine, Context context, float f2) {
        float f3;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("339e832b", new Object[]{dinamicXEngine, context, new Float(f2)})).intValue();
        }
        nb6 d2 = nb6.d(dinamicXEngine);
        if (d2 != null && d2.c() != null) {
            return d2.c().ap2Px(dinamicXEngine, context, f2);
        }
        boolean b2 = nb6.b(d2);
        if (d2 != null) {
            i = d2.e();
        }
        if (b2) {
            mub p = g.p();
            if ((context instanceof Activity) && p != null) {
                f3 = p.g((Activity) context);
            } else if (nb6.j()) {
                return c(context, f2);
            } else {
                f3 = 1.0f;
            }
            return Math.round(f2 * f3 * l(context));
        }
        float f4 = f2 / 375.0f;
        if (i <= 0) {
            i = u(context);
        }
        return Math.round(i * f4);
    }

    public static int f(Context context, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8536afc1", new Object[]{context, new Float(f2)})).intValue();
        }
        return Math.round(f2 * l(context));
    }

    public static void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7205efc", new Object[]{new Boolean(z)});
        } else {
            h(z, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.content.Context] */
    public static void h(boolean z, Activity activity) {
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d789314e", new Object[]{new Boolean(z), activity});
            return;
        }
        int i = b;
        Activity activity2 = activity;
        if (DinamicXEngine.x() != null) {
            if (activity == null) {
                activity2 = DinamicXEngine.x();
            }
            if (nb6.i() || z) {
                z2 = true;
            }
            if (i != t(activity2, z2) || z) {
                k(true);
                m(DinamicXEngine.x(), true);
                ((ConcurrentHashMap) d).clear();
                gi6.clearStaticField();
            }
        }
    }

    public static int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("276ff3e7", new Object[0])).intValue();
        }
        return DEFAULT_HEIGHT_SPEC;
    }

    public static int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("59df9a50", new Object[0])).intValue();
        }
        return k(false);
    }

    public static int k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e214640a", new Object[]{new Boolean(z)})).intValue();
        }
        if ((f25994a == 0 || z) && DinamicXEngine.x() != null) {
            f25994a = DXWidgetNode.DXMeasureSpec.c(s(DinamicXEngine.x()), 1073741824);
        }
        return f25994a;
    }

    public static float l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7077e19f", new Object[]{context})).floatValue();
        }
        return m(context, false);
    }

    public static float m(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e8506f5", new Object[]{context, new Boolean(z)})).floatValue();
        }
        if (c < 0.0f || z) {
            c = context.getResources().getDisplayMetrics().density;
        }
        return c;
    }

    @Deprecated
    public static DinamicXEngine n(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("a896e430", new Object[]{view});
        }
        if (view == null) {
            return null;
        }
        DXWidgetNode b2 = kl6.b(view);
        if (b2 instanceof DXWidgetNode) {
            return b2.getEngine();
        }
        return null;
    }

    public static int o(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d38d8fa9", new Object[]{context, str, new Integer(i)})).intValue();
        }
        return p(null, context, str, i);
    }

    public static int p(DinamicXEngine dinamicXEngine, Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c73143da", new Object[]{dinamicXEngine, context, str, new Integer(i)})).intValue();
        }
        return q(dinamicXEngine, context, str, i, true);
    }

    public static int q(DinamicXEngine dinamicXEngine, Context context, String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ef7ebc0", new Object[]{dinamicXEngine, context, str, new Integer(i), new Boolean(z)})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            if (DinamicXEngine.j0()) {
                h36.b(h36.TAG, "size属性为空字符串");
            }
            return i;
        }
        Map<String, Integer> map = d;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) map;
        if (concurrentHashMap.containsKey(str)) {
            return ((Integer) concurrentHashMap.get(str)).intValue();
        }
        try {
            if (str.contains("np")) {
                i = f(context, Float.parseFloat(str.replace("np", "")));
            } else if (str.contains("ap")) {
                float parseFloat = Float.parseFloat(str.replace("ap", ""));
                if (!z || dinamicXEngine == null) {
                    i = c(context, parseFloat);
                } else {
                    i = d(dinamicXEngine, context, parseFloat);
                }
            } else {
                float parseFloat2 = Float.parseFloat(str);
                if (!z || dinamicXEngine == null) {
                    i = c(context, parseFloat2);
                } else {
                    i = d(dinamicXEngine, context, parseFloat2);
                }
            }
            if (nb6.i()) {
                ((ConcurrentHashMap) map).put(str, Integer.valueOf(i));
            }
        } catch (NumberFormatException unused) {
            if (DinamicXEngine.j0()) {
                h36.w(h36.TAG, str, "写法错误，解析出错");
            }
        }
        return i;
    }

    public static int r(Context context) {
        DisplayMetrics displayMetrics;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb976a8b", new Object[]{context})).intValue();
        }
        if (context == null || (displayMetrics = context.getResources().getDisplayMetrics()) == null) {
            return 0;
        }
        return displayMetrics.heightPixels;
    }

    public static int s(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b36f1410", new Object[]{context})).intValue();
        }
        return t(context, false);
    }

    public static int t(Context context, boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ba74224a", new Object[]{context, new Boolean(z)})).intValue();
        }
        if (g.p() != null && !nb6.i()) {
            return g.p().f(context, z);
        }
        if (b < 0 || z) {
            if (context == null || context.getResources() == null) {
                return 0;
            }
            Configuration configuration = context.getResources().getConfiguration();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            if (displayMetrics == null) {
                return 0;
            }
            if (!e || (i = f) == 3) {
                if (configuration != null && configuration.orientation == 1) {
                    b = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
                } else if (configuration == null || configuration.orientation != 2) {
                    b = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
                } else {
                    b = Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
            } else if (i == 1) {
                b = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
            } else if (i == 2) {
                b = Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
        }
        return b;
    }

    public static int u(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b9549653", new Object[]{context})).intValue();
        }
        mub p = g.p();
        if ((context instanceof Activity) && p != null) {
            return p.h((Activity) context);
        }
        if (context == null) {
            context = DinamicXEngine.x();
        }
        return t(context, false);
    }

    public static int v(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fbf34b0c", new Object[]{activity})).intValue();
        }
        mub p = g.p();
        if (p != null) {
            return p.h(activity);
        }
        return s(activity);
    }

    public static int w(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("da510b27", new Object[]{activity})).intValue();
        }
        mub p = g.p();
        if (p != null) {
            return DXWidgetNode.DXMeasureSpec.c(p.h(activity), 1073741824);
        }
        return j();
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("158d7f7a", new Object[0])).booleanValue();
        }
        mub p = g.p();
        if (p == null || p.c(DinamicXEngine.x())) {
            return true;
        }
        return false;
    }

    public static int y(Activity activity, float f2) {
        float f3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fbcd9329", new Object[]{activity, new Float(f2)})).intValue();
        }
        mub p = g.p();
        if (p == null) {
            f3 = 1.0f;
        } else {
            f3 = p.g(activity);
        }
        return Math.round((f2 / f3) / l(activity));
    }

    public static int z(Context context, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("335609cb", new Object[]{context, new Float(f2)})).intValue();
        }
        return Math.round((f2 * 375.0f) / s(context));
    }
}
