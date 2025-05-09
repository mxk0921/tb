package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.g;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class eb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean C;
    public static boolean D;
    public static boolean E;
    public static boolean F;
    public static boolean G;
    public static boolean H;
    public static boolean I;
    public static gub J;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f18435a;
    public static boolean c;
    public static boolean e;
    public static boolean g;
    public static boolean j;
    public static boolean k;
    public static boolean l;
    public static boolean m;
    public static boolean n;
    public static boolean o;
    public static boolean p;
    public static boolean q;
    public static boolean r;
    public static boolean s;
    public static boolean t;
    public static boolean u;
    public static boolean v;
    public static boolean b = false;
    public static boolean d = false;
    public static boolean f = false;
    public static boolean h = false;
    public static boolean i = false;
    public static boolean w = true;
    public static boolean x = true;
    public static boolean y = true;
    public static boolean z = false;
    public static boolean A = false;
    public static String B = "";
    public static boolean K = false;

    static {
        t2o.a(444596469);
    }

    public static boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3bda545f", new Object[0])).booleanValue();
        }
        return v;
    }

    public static boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c87e2e1b", new Object[0])).booleanValue();
        }
        return r;
    }

    public static boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea4b7c", new Object[0])).booleanValue();
        }
        return m;
    }

    public static boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5bdf43e", new Object[0])).booleanValue();
        }
        if (G()) {
            return true;
        }
        return G;
    }

    public static boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd6f999d", new Object[0])).booleanValue();
        }
        if (G()) {
            return true;
        }
        return H;
    }

    public static void F(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a337dd", new Object[]{new Boolean(z2)});
        } else {
            H = z2;
        }
    }

    public static boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5886c982", new Object[0])).booleanValue();
        }
        if (!K || !H()) {
            return false;
        }
        return true;
    }

    public static boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d218caa7", new Object[0])).booleanValue();
        }
        return zg5.B5();
    }

    public static void I(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9a36de", new Object[]{new Boolean(z2)});
        } else {
            K = z2;
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aeec59df", new Object[0])).booleanValue();
        }
        return q;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f686fef6", new Object[0])).booleanValue();
        }
        if (!C || !zg5.w2()) {
            return false;
        }
        return true;
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb19a302", new Object[0]);
        }
        return B;
    }

    public static void d() {
        boolean z2;
        boolean z3;
        IpChange ipChange = $ipChange;
        boolean z4 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        gub gubVar = J;
        if (gubVar != null) {
            if (!gubVar.isFeatureOpened(DinamicXEngine.x(), "dx_performace_opt_open_on_before_deep_clone") || !zg5.w2()) {
                z2 = false;
            } else {
                z2 = true;
            }
            C = z2;
            String str = "DXABGlobalManage init  isOpenOnBeforeDeepCloneOpt " + y();
            la6.b(str);
            Log.e("DXABGlobalManager", str);
            if (!J.isFeatureOpened(DinamicXEngine.x(), "dx_performace_opt_open_flatten_opt") || !zg5.x3()) {
                z3 = false;
            } else {
                z3 = true;
            }
            D = z3;
            String str2 = "DXABGlobalManage init  openFlattenOptimize " + w();
            la6.b(str2);
            Log.e("DXABGlobalManager", str2);
            I = J.isFeatureOpened(DinamicXEngine.x(), "dx_performace_opt_common");
            String str3 = "DXABGlobalManage init  openCommonOptimize " + w();
            la6.b(str3);
            Log.e("DXABGlobalManager", str3);
            if (!E()) {
                E = J.isFeatureOpened(DinamicXEngine.x(), "dx_performace_open_measure_cache");
                String str4 = "DXABGlobalManage init  openMeasureCache " + x();
                la6.b(str4);
                Log.e("DXABGlobalManager", str4);
            }
            F = J.isFeatureOpened(DinamicXEngine.x(), "dx_performace_open_dataParserExpressionOpt");
            String str5 = "DXABGlobalManage init  openDataParserExpressionOpt " + t();
            la6.b(str5);
            Log.e("DXABGlobalManager", str5);
            G = J.isFeatureOpened(DinamicXEngine.x(), "dx_performace_open_v2_init_opt");
            s = J.isFeatureOpened(DinamicXEngine.x(), "dx_performace_open_async_measure_opt");
            t = J.isFeatureOpened(DinamicXEngine.x(), "dx_performace_open_async_layout_opt");
            u = J.isFeatureOpened(DinamicXEngine.x(), "dx_performace_open_layout_opt");
            if (g.e() != null && g.e().getDeviceLevel() == 2) {
                z4 = true;
            }
            i = z4;
        }
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87de3dd4", new Object[0]);
            return;
        }
        try {
            File[] listFiles = new File("/data/local/tmp/.DXABGlobalManager").listFiles();
            if (DinamicXEngine.j0()) {
                D = true;
                C = true;
                I = true;
            }
            if (listFiles != null) {
                for (File file : listFiles) {
                    if (file.getName().equalsIgnoreCase(".dxScrollHitchRateDinamicX")) {
                        b = true;
                        f18435a = true;
                        Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  dxScrollHitchRateDinamicX " + f18435a);
                    } else if (file.getName().equalsIgnoreCase(".dxScrollHitchRateImage")) {
                        d = true;
                        c = true;
                        Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  dxScrollHitchRateImage " + c);
                    } else if (file.getName().equalsIgnoreCase(".dxScrollHitchRateImagePost")) {
                        f = true;
                        e = true;
                        Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  dxScrollHitchRateImagePost " + e);
                    } else if (file.getName().equalsIgnoreCase(".dxScrollHitchRateViewReuse")) {
                        h = true;
                        g = true;
                        Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  dxScrollHitchRateViewReuse " + g);
                    } else if (".closeAppMonitor".equalsIgnoreCase(file.getName())) {
                        j = true;
                        Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  closeAppMonitor " + j);
                    } else if (".closeTLog".equalsIgnoreCase(file.getName())) {
                        k = true;
                        Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  closeTlog " + k);
                    } else if (".closeOpenTrace".equalsIgnoreCase(file.getName())) {
                        l = true;
                        Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  closeOpenTrace " + l);
                    } else if (".openReleaseLog".equalsIgnoreCase(file.getName())) {
                        m = true;
                        Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  openReleaseLog " + m);
                    } else if (".openConsumeLog".equalsIgnoreCase(file.getName())) {
                        n = true;
                        Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  openConsumeLog " + n);
                    } else if (".openEventChainLog".equalsIgnoreCase(file.getName())) {
                        o = true;
                        Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  openEventChainLog " + o);
                    } else if (".closeDebugException".equalsIgnoreCase(file.getName())) {
                        q = true;
                        Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  closeDebugException " + q);
                    } else if (".openParserSysTrace".equalsIgnoreCase(file.getName())) {
                        DXTraceUtil.i(true);
                        Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  parserTraceEnableSwicth true");
                    } else if (".openRecyclerLayoutPrefetchLog".equalsIgnoreCase(file.getName())) {
                        r = true;
                        Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  openRecyclerLayoutPrefetchLog " + r);
                    } else if (".openOnBeforeDeepCloneOpt".equalsIgnoreCase(file.getName())) {
                        C = true;
                        Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  isOpenOnBeforeDeepCloneOpt " + C);
                    } else if (".closeOnBeforeDeepCloneOpt".equalsIgnoreCase(file.getName())) {
                        C = false;
                        Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  isOpenOnBeforeDeepCloneOpt " + C);
                    } else if (".openFlattenOptimize".equalsIgnoreCase(file.getName())) {
                        D = true;
                        Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  openFlattenOptimize " + D);
                    } else if (".closeFlattenOptimize".equalsIgnoreCase(file.getName())) {
                        D = false;
                        Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  openFlattenOptimize " + D);
                    } else if (".openCommonOptimize".equalsIgnoreCase(file.getName())) {
                        I = true;
                        Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  openCommonOptimize " + I);
                    } else if (".closeCommonOptimize".equalsIgnoreCase(file.getName())) {
                        I = false;
                        Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  openCommonOptimize " + I);
                    } else if (".closeButterPreRender".equalsIgnoreCase(file.getName())) {
                        w = false;
                        Log.e("DXABGlobalManager", "init DXABGlobalManage  openPreRender " + w);
                    } else if (".closeButter".equalsIgnoreCase(file.getName())) {
                        x = false;
                        Log.e("DXABGlobalManager", "init DXABGlobalManage  openButter " + x);
                    } else if (".closeFlat".equalsIgnoreCase(file.getName())) {
                        y = false;
                        Log.e("DXABGlobalManager", "init DXABGlobalManage  openFlat " + y);
                    } else if (".openForceLayout".equalsIgnoreCase(file.getName())) {
                        z = true;
                        Log.e("DXABGlobalManager", "init DXABGlobalManage  openForceLayout " + z);
                    } else if (".openCollectMeasure".equalsIgnoreCase(file.getName())) {
                        A = true;
                        Log.e("DXABGlobalManager", "init DXABGlobalManage  openCollectMeasure " + A);
                    } else if (".butterTemplateWhiteList".equalsIgnoreCase(file.getName())) {
                        B = u06.c(file);
                    } else if (".openMeasureCache".equalsIgnoreCase(file.getName())) {
                        E = true;
                        Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  openMeasureCache " + E);
                    } else if (".closeMeasureCache".equalsIgnoreCase(file.getName())) {
                        E = false;
                        Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  openMeasureCache " + E);
                    } else if (".openDataParserExpressionOpt".equalsIgnoreCase(file.getName())) {
                        F = true;
                        Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  openDataParserExpressionOpt " + F);
                    } else if (".closeDataParserExpressionOpt".equalsIgnoreCase(file.getName())) {
                        F = false;
                        Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  openDataParserExpressionOpt " + F);
                    } else if (".openV2InitOpt".equalsIgnoreCase(file.getName())) {
                        G = true;
                        Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  isOpenV2InitOpt " + G);
                    } else if (".openPreViewButter".equalsIgnoreCase(file.getName())) {
                        v = true;
                        Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  openPreViewButter " + v);
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void f(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac67f275", new Object[]{new Boolean(z2)});
            return;
        }
        try {
            File[] listFiles = new File("/data/local/tmp/.DXABGlobalManager").listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    if (".openV3InitOpt".equalsIgnoreCase(file.getName())) {
                        H = true;
                        Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  isOpenV3InitOpt " + H);
                    } else if (".openSysTrace".equalsIgnoreCase(file.getName())) {
                        p = true;
                        DXTraceUtil.j(true);
                        Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  openSysTrace " + p);
                    }
                }
                if (new File("/data/local/tmp/.trace_dx").exists()) {
                    p = true;
                    DXTraceUtil.j(true);
                    Log.e("DXABGlobalManager", "init DXABGlobalManage  openSysTrace " + p);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("199fc664", new Object[0]);
            return;
        }
        la6.b("DXABGlobalManage  initImageABForLauncher ");
        Log.e("DXABGlobalManager", "DXABGlobalManage  initImageABForLauncher ");
        if (!f) {
            gub gubVar = J;
            if (gubVar != null) {
                e = gubVar.isFeatureOpened(DinamicXEngine.x(), "dx_scroll_hitchrate_image_post_runnable_key_new");
            } else {
                e = false;
            }
            f = true;
            la6.b("DXABGlobalManage initImageABForLauncher dxScrollHitchRateImagePost " + e);
            Log.e("DXABGlobalManager", "DXABGlobalManage initImageABForLauncher  dxScrollHitchRateImagePost " + e);
        }
        if (!d) {
            gub gubVar2 = J;
            if (gubVar2 != null) {
                c = gubVar2.isFeatureOpened(DinamicXEngine.x(), "dx_scroll_hitchrate_image_work_thread_key_new");
            } else {
                c = false;
            }
            d = true;
            la6.b("DXABGlobalManage initImageABForLauncher  dxScrollHitchRateImage " + c);
            Log.e("DXABGlobalManager", "DXABGlobalManage initImageABForLauncher  dxScrollHitchRateImage " + c);
        }
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("105ae4e2", new Object[0])).booleanValue();
        }
        if (G()) {
            return true;
        }
        if (!t || !zg5.k3()) {
            return false;
        }
        return true;
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2203fa92", new Object[0])).booleanValue();
        }
        if (G()) {
            return true;
        }
        if (!s || !zg5.l3()) {
            return false;
        }
        return true;
    }

    public static final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22a9e80d", new Object[0])).booleanValue();
        }
        if (h) {
            return g;
        }
        gub gubVar = J;
        if (gubVar != null) {
            g = gubVar.isFeatureOpened(DinamicXEngine.x(), "dx_scroll_hitchrate_view_reuse_key_new");
        } else {
            g = false;
        }
        h = true;
        la6.b("DXABGlobalManage  dx_scroll_hitchrate_view_reuse_key_new " + g);
        Log.e("DXABGlobalManager", "DXABGlobalManage  dx_scroll_hitchrate_view_reuse_key_new " + g);
        return g;
    }

    public static final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5bd36d41", new Object[0])).booleanValue();
        }
        if (!b) {
            gub gubVar = J;
            if (gubVar != null) {
                f18435a = gubVar.isFeatureOpened(DinamicXEngine.x(), "dx_scroll_hitchrate_dinamicx_key");
            } else {
                f18435a = false;
            }
            b = true;
            la6.b("DXABGlobalManage  dxScrollHitchRateDinamicX " + f18435a);
            Log.e("DXABGlobalManager", "DXABGlobalManage  dxScrollHitchRateDinamicX " + f18435a);
            if (!f18435a || !zg5.w2()) {
                return false;
            }
            return true;
        } else if (!f18435a || !zg5.w2()) {
            return false;
        } else {
            return true;
        }
    }

    public static final boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbe64239", new Object[0])).booleanValue();
        }
        if (!c || !zg5.x2()) {
            return false;
        }
        return true;
    }

    public static final boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5a567f9", new Object[0])).booleanValue();
        }
        if (!e || !zg5.x2()) {
            return false;
        }
        return true;
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44b8922a", new Object[0])).booleanValue();
        }
        if (G()) {
            return true;
        }
        if (!u || !zg5.u4()) {
            return false;
        }
        return true;
    }

    public static final boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8377f562", new Object[0])).booleanValue();
        }
        if (!i || !zg5.t2()) {
            return false;
        }
        return true;
    }

    public static final boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a03899b", new Object[0])).booleanValue();
        }
        if ((!i || !zg5.s2() || !f18435a) && !j) {
            return false;
        }
        return true;
    }

    public static final boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6f0e3af", new Object[0])).booleanValue();
        }
        if (l || (i && f18435a)) {
            return true;
        }
        return false;
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed8c1f1f", new Object[0])).booleanValue();
        }
        if (!I || !zg5.w2()) {
            return false;
        }
        return true;
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e61109e7", new Object[0])).booleanValue();
        }
        return n;
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26bcc369", new Object[0])).booleanValue();
        }
        if (!F || !zg5.J3()) {
            return false;
        }
        return true;
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f727a354", new Object[0])).booleanValue();
        }
        return o;
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7c6b238", new Object[0])).booleanValue();
        }
        return y;
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a29d06ce", new Object[0])).booleanValue();
        }
        return D;
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("114fe603", new Object[0])).booleanValue();
        }
        if (!E || !zg5.G3()) {
            return false;
        }
        return true;
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ef921bf", new Object[0])).booleanValue();
        }
        return C;
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fb8e7f0", new Object[0])).booleanValue();
        }
        return w;
    }
}
