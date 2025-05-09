package tb;

import android.text.TextUtils;
import com.alibaba.android.umbrella.trace.UmbrellaInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class idv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final double DEFAULT_FAIL_SAMPLE_RATING = 1.0d;
    public static final double DEFAULT_PERFORMANCE_SAMPLE_RATING = 0.001d;
    public static final double DEFAULT_SUCCESS_SAMPLE_RATING = 5.0E-5d;
    public static final String FORCE_CLOSE_FAILURE_KEY = "ForceCloseFailure";
    public static final String FORCE_CLOSE_PERFORMANCE_PAGE_KEY = "ForceClosePerformancePage";
    public static final String FORCE_CLOSE_PERFORMANCE_POINT_KEY = "ForceClosePerformancePoint";
    public static final String FORCE_CLOSE_SUCCESS_KEY = "ForceCloseSuccess";
    public static final String KEY_FORCE_CLOSE_MTOP_INTERCEPTOR = "ForceCloseMtopInterceptor";
    public static final String KEY_FORCE_CLOSE_TRACE_TLOG = "ForceCloseTraceTlog";
    public static final String OPEN_CRASH_REPORT_KEY = "isPointReportToCrash";
    public static final String OPEN_GRAY_REPORT_KEY = "isGrayReport";

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, Double> f21267a = new HashMap<>();
    public static final HashMap<String, Double> b = new HashMap<>();
    public static final HashMap<String, Double> c = new HashMap<>();
    public static boolean d = false;
    public static boolean e = false;
    public static boolean f = false;
    public static boolean g = false;
    public static boolean h = false;
    public static boolean i = true;
    public static boolean j = false;
    public static final String ORANGE_GROUP_NAME = "umbrella_trace";
    public static final f1g<List<String>> sUMUniformErrorReport = new f1g<>(ORANGE_GROUP_NAME, "UMUniformErrorReport", "taobao.buy,buy", new oqq());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements z8l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.z8l
        public void onConfigUpdate(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
            } else if (idv.ORANGE_GROUP_NAME.equals(str)) {
                for (String str2 : idv.a().keySet()) {
                    try {
                        idv.a().put(str2, Double.valueOf(Double.parseDouble(OrangeConfig.getInstance().getConfig(idv.ORANGE_GROUP_NAME, str2, String.valueOf(5.0E-5d)))));
                    } catch (NumberFormatException unused) {
                        idv.a().put(str2, Double.valueOf(5.0E-5d));
                    }
                }
                for (String str3 : idv.b().keySet()) {
                    try {
                        idv.b().put(str3, Double.valueOf(Double.parseDouble(OrangeConfig.getInstance().getConfig(idv.ORANGE_GROUP_NAME, str3, String.valueOf(1.0d)))));
                    } catch (NumberFormatException unused2) {
                        idv.b().put(str3, Double.valueOf(1.0d));
                    }
                }
                for (String str4 : idv.h().keySet()) {
                    try {
                        idv.b().put(str4, Double.valueOf(Double.parseDouble(OrangeConfig.getInstance().getConfig(idv.ORANGE_GROUP_NAME, str4, String.valueOf(0.001d)))));
                    } catch (NumberFormatException unused3) {
                        idv.b().put(str4, Double.valueOf(0.001d));
                    }
                }
                idv.i(idv.j(idv.FORCE_CLOSE_SUCCESS_KEY));
                idv.k(idv.j(idv.FORCE_CLOSE_FAILURE_KEY));
                idv.l(idv.j(idv.FORCE_CLOSE_PERFORMANCE_POINT_KEY));
                idv.m(idv.j(idv.FORCE_CLOSE_PERFORMANCE_PAGE_KEY));
                idv.n(idv.j(idv.KEY_FORCE_CLOSE_TRACE_TLOG));
                idv.o(idv.c(idv.KEY_FORCE_CLOSE_MTOP_INTERCEPTOR, "true"));
                idv.d(idv.e());
                idv.f(idv.g());
                idv.sUMUniformErrorReport.b();
            }
        }
    }

    static {
        A();
    }

    public static void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        d = q(FORCE_CLOSE_SUCCESS_KEY);
        e = q(FORCE_CLOSE_FAILURE_KEY);
        s();
        f = q(FORCE_CLOSE_PERFORMANCE_POINT_KEY);
        g = q(FORCE_CLOSE_PERFORMANCE_PAGE_KEY);
        h = q(KEY_FORCE_CLOSE_TRACE_TLOG);
        I(KEY_FORCE_CLOSE_MTOP_INTERCEPTOR, "true");
        i = t();
        j = G();
        sUMUniformErrorReport.b();
        OrangeConfig.getInstance().registerListener(new String[]{ORANGE_GROUP_NAME}, new a());
    }

    public static boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("186659fe", new Object[0])).booleanValue();
        }
        return e;
    }

    public static boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66d7cbd3", new Object[0])).booleanValue();
        }
        return g;
    }

    public static boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f775502", new Object[0])).booleanValue();
        }
        return f;
    }

    public static boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("515183f7", new Object[0])).booleanValue();
        }
        return d;
    }

    public static boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bfb1f5c9", new Object[0])).booleanValue();
        }
        return h;
    }

    public static boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79d7b876", new Object[0])).booleanValue();
        }
        return false;
    }

    public static boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("236e236", new Object[0])).booleanValue();
        }
        return i;
    }

    public static /* synthetic */ HashMap a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("3d0ed1a", new Object[0]);
        }
        return f21267a;
    }

    public static /* synthetic */ HashMap b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("88013a1b", new Object[0]);
        }
        return b;
    }

    public static /* synthetic */ boolean c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1db74ebe", new Object[]{str, str2})).booleanValue();
        }
        return I(str, str2);
    }

    public static /* synthetic */ boolean d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2bf310f", new Object[]{new Boolean(z)})).booleanValue();
        }
        return z;
    }

    public static /* synthetic */ boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afb76b2c", new Object[0])).booleanValue();
        }
        return s();
    }

    public static /* synthetic */ boolean f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2818acd", new Object[]{new Boolean(z)})).booleanValue();
        }
        i = z;
        return z;
    }

    public static /* synthetic */ boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1983e1ae", new Object[0])).booleanValue();
        }
        return t();
    }

    public static /* synthetic */ HashMap h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("c31871c", new Object[0]);
        }
        return c;
    }

    public static /* synthetic */ boolean i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18f8d21c", new Object[]{new Boolean(z)})).booleanValue();
        }
        d = z;
        return z;
    }

    public static /* synthetic */ boolean j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49bc1589", new Object[]{str})).booleanValue();
        }
        return q(str);
    }

    public static /* synthetic */ boolean k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8bb2bda", new Object[]{new Boolean(z)})).booleanValue();
        }
        e = z;
        return z;
    }

    public static /* synthetic */ boolean l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("509c58b9", new Object[]{new Boolean(z)})).booleanValue();
        }
        f = z;
        return z;
    }

    public static /* synthetic */ boolean m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b87d8598", new Object[]{new Boolean(z)})).booleanValue();
        }
        g = z;
        return z;
    }

    public static /* synthetic */ boolean n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("205eb277", new Object[]{new Boolean(z)})).booleanValue();
        }
        h = z;
        return z;
    }

    public static /* synthetic */ boolean o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("883fdf56", new Object[]{new Boolean(z)})).booleanValue();
        }
        return z;
    }

    public static boolean p(UmbrellaInfo umbrellaInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d974ba7", new Object[]{umbrellaInfo, str})).booleanValue();
        }
        if (umbrellaInfo != null && !TextUtils.isEmpty(umbrellaInfo.mainBizName) && !TextUtils.isEmpty(str)) {
            if (u(umbrellaInfo.mainBizName + '_' + str) > Math.random()) {
                return true;
            }
        }
        return false;
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd0c3fc0", new Object[0])).booleanValue();
        }
        return j;
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98ff0be6", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig(ORANGE_GROUP_NAME, OPEN_CRASH_REPORT_KEY, "true"));
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42e4b162", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig(ORANGE_GROUP_NAME, OPEN_GRAY_REPORT_KEY, "true"));
    }

    public static double u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ea1b528", new Object[]{str})).doubleValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 1.0d;
        }
        HashMap<String, Double> hashMap = b;
        Double d2 = hashMap.get(str);
        if (d2 != null) {
            return d2.doubleValue();
        }
        try {
            double parseDouble = Double.parseDouble(OrangeConfig.getInstance().getConfig(ORANGE_GROUP_NAME, str, String.valueOf(1.0d)));
            hashMap.put(str, Double.valueOf(parseDouble));
            return parseDouble;
        } catch (NumberFormatException unused) {
            b.put(str, Double.valueOf(1.0d));
            return 1.0d;
        }
    }

    public static double v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b196b6a", new Object[]{str})).doubleValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 5.0E-5d;
        }
        HashMap<String, Double> hashMap = f21267a;
        Double d2 = hashMap.get(str);
        if (d2 != null) {
            return d2.doubleValue();
        }
        try {
            double parseDouble = Double.parseDouble(OrangeConfig.getInstance().getConfig(ORANGE_GROUP_NAME, str, String.valueOf(5.0E-5d)));
            hashMap.put(str, Double.valueOf(parseDouble));
            return parseDouble;
        } catch (NumberFormatException unused) {
            f21267a.put(str, Double.valueOf(5.0E-5d));
            return 5.0E-5d;
        }
    }

    public static double w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("81b9bf0e", new Object[]{str})).doubleValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0.001d;
        }
        HashMap<String, Double> hashMap = c;
        Double d2 = hashMap.get(str);
        if (d2 != null) {
            return d2.doubleValue();
        }
        try {
            double parseDouble = Double.parseDouble(OrangeConfig.getInstance().getConfig(ORANGE_GROUP_NAME, str, String.valueOf(0.001d)));
            hashMap.put(str, Double.valueOf(parseDouble));
            return parseDouble;
        } catch (NumberFormatException unused) {
            c.put(str, Double.valueOf(0.001d));
            return 0.001d;
        }
    }

    public static boolean x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56a15845", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (w("Performance_Page_Load_" + str) > Math.random()) {
            return true;
        }
        return false;
    }

    public static boolean y(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3b8b3a0", new Object[]{str, str2})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (w("Performance_" + str + "_" + str2) > Math.random()) {
                return true;
            }
        }
        return false;
    }

    public static boolean z(UmbrellaInfo umbrellaInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("218cce9b", new Object[]{umbrellaInfo})).booleanValue();
        }
        if (umbrellaInfo != null && !TextUtils.isEmpty(umbrellaInfo.mainBizName) && !TextUtils.isEmpty(umbrellaInfo.tagId)) {
            if (v(umbrellaInfo.mainBizName + '_' + umbrellaInfo.tagId) > Math.random()) {
                return true;
            }
        }
        return false;
    }

    public static boolean I(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9c4988a", new Object[]{str, str2})).booleanValue();
        }
        return !TextUtils.isEmpty(str) && "true".equals(OrangeConfig.getInstance().getConfig(ORANGE_GROUP_NAME, str, str2));
    }

    public static boolean q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b82641a6", new Object[]{str})).booleanValue();
        }
        return !TextUtils.isEmpty(str) && "true".equals(OrangeConfig.getInstance().getConfig(ORANGE_GROUP_NAME, str, "false"));
    }
}
