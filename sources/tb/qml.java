package tb;

import android.app.Application;
import android.graphics.Color;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.external.embed.StartParams;
import com.taobao.themis.kernel.TMSContainerType;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class qml {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            t2o.a(839909875);
            int[] iArr = new int[Window.WindowRatioConfig.values().length];
            iArr[Window.WindowRatioConfig.ALL.ordinal()] = 1;
            iArr[Window.WindowRatioConfig.LANDSCAPE.ordinal()] = 2;
            iArr[Window.WindowRatioConfig.PORTRAIT.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TMSSolutionType.values().length];
            iArr2[TMSSolutionType.UNIAPP.ordinal()] = 1;
            iArr2[TMSSolutionType.MINIGAME.ordinal()] = 2;
            iArr2[TMSSolutionType.CLUSTER_WIDGET.ordinal()] = 3;
            iArr2[TMSSolutionType.WIDGET.ordinal()] = 4;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        t2o.a(839909874);
    }

    public static final String A(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2522bc33", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        return "'" + ((Object) str) + '\'';
    }

    public static final void B(ITMSPage iTMSPage, boolean z, qcs qcsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eabc95e9", new Object[]{iTMSPage, new Boolean(z), qcsVar});
            return;
        }
        ckf.g(iTMSPage, "<this>");
        ckf.g(qcsVar, "render");
        int w = w(iTMSPage);
        String a2 = q(iTMSPage).a();
        if (z) {
            qcsVar.i0("tabBarHeight", Integer.valueOf(w));
        } else {
            qcsVar.i0("--tabbar-height", w + "px");
        }
        qcsVar.n(msq.i("\n        if (window.themis && window.themis.pageContext) {\n            window.themis.pageContext.tabBarHeight = " + w + ";\n            window.themis.pageContext.fromURL = " + ((Object) A(a2)) + ";\n        }\n    "), "updatePageContextVariable");
    }

    public static final boolean b(ITMSPage iTMSPage) {
        Boolean b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c00844e", new Object[]{iTMSPage})).booleanValue();
        }
        ckf.g(iTMSPage, "<this>");
        Window m = iTMSPage.getPageParams().e().m();
        if (m == null || (b = m.b()) == null) {
            return false;
        }
        return b.booleanValue();
    }

    public static final boolean c(ITMSPage iTMSPage) {
        Boolean g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e88fefe", new Object[]{iTMSPage})).booleanValue();
        }
        ckf.g(iTMSPage, "<this>");
        Window m = iTMSPage.getPageParams().e().m();
        if (m == null || (g = m.g()) == null) {
            return false;
        }
        return g.booleanValue();
    }

    public static final boolean d(ITMSPage iTMSPage) {
        Boolean d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("130d06e", new Object[]{iTMSPage})).booleanValue();
        }
        ckf.g(iTMSPage, "<this>");
        Window m = iTMSPage.getPageParams().e().m();
        if (m == null || (d = m.d()) == null) {
            return false;
        }
        return d.booleanValue();
    }

    public static final String e(ITMSPage iTMSPage, boolean z) {
        AppManifest r;
        AppManifest.AppInfo appInfo;
        AppManifest r2;
        AppManifest.Container container;
        AppManifest.Solution solution;
        AppManifest r3;
        AppManifest.AppInfo appInfo2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce6767c5", new Object[]{iTMSPage, new Boolean(z)});
        }
        ckf.g(iTMSPage, "<this>");
        int w = w(iTMSPage);
        TMSMetaInfoWrapper U = iTMSPage.getInstance().U();
        String str = null;
        String appId = (U == null || (r3 = U.r()) == null || (appInfo2 = r3.getAppInfo()) == null) ? null : appInfo2.getAppId();
        String name = iTMSPage.getInstance().a0().name();
        TMSMetaInfoWrapper U2 = iTMSPage.getInstance().U();
        String type = (U2 == null || (r2 = U2.r()) == null || (container = r2.getContainer()) == null || (solution = container.getSolution()) == null) ? null : solution.getType();
        TMSMetaInfoWrapper U3 = iTMSPage.getInstance().U();
        JSONObject bizInfo = (U3 == null || (r = U3.r()) == null || (appInfo = r.getAppInfo()) == null) ? null : appInfo.getBizInfo();
        aol q = q(iTMSPage);
        String b = q.b();
        String a2 = q.a();
        Application M = iTMSPage.getInstance().M();
        String str2 = "document.documentElement.style.setProperty('--safe-area-inset-top', '" + u(iTMSPage) + "px');\n            document.documentElement.style.setProperty('--safe-area-inset-left', '" + s(iTMSPage) + "px');\n            document.documentElement.style.setProperty('--safe-area-inset-right', '" + t(iTMSPage) + "px');\n            document.documentElement.style.setProperty('--safe-area-inset-bottom', '" + r(iTMSPage) + "px');\n            document.documentElement.style.setProperty('--tabbar-height', '" + w + "px');\n            document.documentElement.style.setProperty('--navbar-height', '" + i(iTMSPage) + "px');\n            document.documentElement.style.setProperty('--statusbar-height', '" + xcs.f(M, xcs.d(M)) + "px');";
        StringBuilder sb = new StringBuilder("javascript:(function() {\n            var appContext = {\n                appId: ");
        sb.append((Object) A(appId));
        sb.append(",\n                solution: ");
        sb.append((Object) A(name));
        sb.append(",\n                UIMode: ");
        sb.append((Object) A(type));
        sb.append(",\n                bizInfo: ");
        if (bizInfo != null) {
            str = bizInfo.toJSONString();
        }
        sb.append((Object) str);
        sb.append("\n            };\n            \n            var pageContext = {\n                id: ");
        sb.append((Object) A(b));
        sb.append(",\n                fromURL: ");
        sb.append((Object) A(a2));
        sb.append(",\n                tabBarHeight: ");
        sb.append(w);
        sb.append(",\n                preRender: ");
        sb.append(q.c());
        sb.append("\n            };\n\n            window.themis = {\n                appContext: appContext,\n                pageContext: pageContext\n            };\n            \n            ");
        if (z) {
            str2 = "!(function(){var style=document.createElement(\"style\");style.setAttribute(\"type\",\"text/css\");style.textContent=\":root{--safe-area-inset-top:env(safe-area-inset-top);--safe-area-inset-left:env(safe-area-inset-left);--safe-area-inset-right:env(safe-area-inset-right);--safe-area-inset-bottom:env(safe-area-inset-bottom);--tabbar-height:env(tabbar-height);--navbar-height:env(navbar-height);--statusbar-height:env(statusbar-height)}\";document.head.appendChild(style)})();";
        }
        sb.append(str2);
        sb.append("\n        })();");
        return sb.toString();
    }

    public static final String f(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a469733b", new Object[]{iTMSPage});
        }
        ckf.g(iTMSPage, "<this>");
        TMSSolutionType a0 = iTMSPage.getInstance().a0();
        int i = a0 == null ? -1 : a.$EnumSwitchMapping$1[a0.ordinal()];
        if (i == 2) {
            return "canvas";
        }
        if (i == 3 || i == 4) {
            return "widget";
        }
        return null;
    }

    public static final Window.c g(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Window.c) ipChange.ipc$dispatch("f4f68e93", new Object[]{iTMSPage});
        }
        ckf.g(iTMSPage, "<this>");
        Window m = iTMSPage.getPageParams().e().m();
        if (m == null) {
            return null;
        }
        return m.e();
    }

    public static final int h(ITMSPage iTMSPage) {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c66337d", new Object[]{iTMSPage})).intValue();
        }
        ckf.g(iTMSPage, "<this>");
        Window m = iTMSPage.getPageParams().e().m();
        if (m == null) {
            num = null;
        } else {
            num = m.f();
        }
        if (num != null) {
            return num.intValue();
        }
        if (j(iTMSPage)) {
            return Color.parseColor("#00FFFFFF");
        }
        if (!q9s.q0() && k(iTMSPage) != Window.Theme.LIGHT) {
            return Color.parseColor("#333333");
        }
        return -1;
    }

    public static final int i(ITMSPage iTMSPage) {
        y0e y0eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d52fcf52", new Object[]{iTMSPage})).intValue();
        }
        ckf.g(iTMSPage, "<this>");
        tll pageContext = iTMSPage.getPageContext();
        if (pageContext == null) {
            y0eVar = null;
        } else {
            y0eVar = pageContext.getTitleBar();
        }
        if (y0eVar == null) {
            return 0;
        }
        return 44;
    }

    public static final boolean j(ITMSPage iTMSPage) {
        Boolean h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10642a2b", new Object[]{iTMSPage})).booleanValue();
        }
        ckf.g(iTMSPage, "<this>");
        Window m = iTMSPage.getPageParams().e().m();
        if (m == null || (h = m.h()) == null) {
            return false;
        }
        return h.booleanValue();
    }

    public static final Window.Theme k(ITMSPage iTMSPage) {
        Window.Theme theme;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Window.Theme) ipChange.ipc$dispatch("2592c1a7", new Object[]{iTMSPage});
        }
        ckf.g(iTMSPage, "<this>");
        Window m = iTMSPage.getPageParams().e().m();
        if (m == null) {
            theme = null;
        } else {
            theme = m.i();
        }
        if (theme == null) {
            return Window.Theme.LIGHT;
        }
        return theme;
    }

    public static final String l(ITMSPage iTMSPage) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c710ddc", new Object[]{iTMSPage});
        }
        ckf.g(iTMSPage, "<this>");
        Window m = iTMSPage.getPageParams().e().m();
        if (m == null) {
            str = null;
        } else {
            str = m.o();
        }
        if (!q9s.f0()) {
            if (str == null || str.length() == 0) {
                str = r8s.f(iTMSPage.getInstance());
            }
            if (str == null) {
                return "";
            }
            return str;
        } else if (str != null) {
            return str;
        } else {
            String f = r8s.f(iTMSPage.getInstance());
            if (f == null) {
                return "";
            }
            return f;
        }
    }

    public static final Integer m(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("5df7858a", new Object[]{iTMSPage});
        }
        ckf.g(iTMSPage, "<this>");
        Window m = iTMSPage.getPageParams().e().m();
        if (m == null) {
            return null;
        }
        return m.p();
    }

    public static final String n(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa577ee5", new Object[]{iTMSPage});
        }
        ckf.g(iTMSPage, "<this>");
        Window m = iTMSPage.getPageParams().e().m();
        if (m == null) {
            return null;
        }
        return m.q();
    }

    public static final Window.Orientation o(ITMSPage iTMSPage) {
        Window.Orientation orientation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Window.Orientation) ipChange.ipc$dispatch("20df3f17", new Object[]{iTMSPage});
        }
        ckf.g(iTMSPage, "<this>");
        Window m = iTMSPage.getPageParams().e().m();
        if (m == null) {
            orientation = null;
        } else {
            orientation = m.j();
        }
        if (orientation == null) {
            return Window.Orientation.PORTRAIT;
        }
        return orientation;
    }

    public static final Integer p(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("2cfdf372", new Object[]{iTMSPage});
        }
        ckf.g(iTMSPage, "<this>");
        Window m = iTMSPage.getPageParams().e().m();
        if (m == null) {
            return null;
        }
        return m.k();
    }

    public static final aol q(ITMSPage iTMSPage) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aol) ipChange.ipc$dispatch("1c983035", new Object[]{iTMSPage});
        }
        ckf.g(iTMSPage, "<this>");
        String g = iTMSPage.getPageParams().e().g();
        k8c k8cVar = (k8c) iTMSPage.getExtension(k8c.class);
        if (k8cVar == null) {
            str = null;
        } else {
            str = k8cVar.u();
        }
        return new aol(g, str, iTMSPage.getPageParams().k());
    }

    public static final int r(ITMSPage iTMSPage) {
        woo safeArea;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("da2e820", new Object[]{iTMSPage})).intValue();
        }
        ckf.g(iTMSPage, "<this>");
        StartParams startParams = (StartParams) iTMSPage.getInstance().g(StartParams.class);
        if (startParams == null) {
            startParams = null;
        }
        if (startParams == null || (safeArea = startParams.getSafeArea()) == null) {
            return 0;
        }
        return safeArea.a();
    }

    public static final int s(ITMSPage iTMSPage) {
        woo safeArea;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("45b427fc", new Object[]{iTMSPage})).intValue();
        }
        ckf.g(iTMSPage, "<this>");
        StartParams startParams = (StartParams) iTMSPage.getInstance().g(StartParams.class);
        if (startParams == null) {
            startParams = null;
        }
        if (startParams == null || (safeArea = startParams.getSafeArea()) == null) {
            return 0;
        }
        return safeArea.b();
    }

    public static final int t(ITMSPage iTMSPage) {
        woo safeArea;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("656679f1", new Object[]{iTMSPage})).intValue();
        }
        ckf.g(iTMSPage, "<this>");
        StartParams startParams = (StartParams) iTMSPage.getInstance().g(StartParams.class);
        if (startParams == null) {
            startParams = null;
        }
        if (startParams == null || (safeArea = startParams.getSafeArea()) == null) {
            return 0;
        }
        return safeArea.c();
    }

    public static final int u(ITMSPage iTMSPage) {
        woo safeArea;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("369e33aa", new Object[]{iTMSPage})).intValue();
        }
        ckf.g(iTMSPage, "<this>");
        boolean i = iTMSPage.getPageParams().i();
        Application M = iTMSPage.getInstance().M();
        if (iTMSPage.getInstance().O() == TMSContainerType.EMBEDDED) {
            StartParams startParams = (StartParams) iTMSPage.getInstance().g(StartParams.class);
            if (startParams == null) {
                startParams = null;
            }
            if (startParams == null || (safeArea = startParams.getSafeArea()) == null) {
                return 0;
            }
            return safeArea.d();
        } else if (i) {
            return xcs.f(M, xcs.d(M));
        } else {
            return 0;
        }
    }

    public static final boolean v(ITMSPage iTMSPage) {
        Boolean m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ae40ba3", new Object[]{iTMSPage})).booleanValue();
        }
        ckf.g(iTMSPage, "<this>");
        Window m2 = iTMSPage.getPageParams().e().m();
        if (m2 == null || (m = m2.m()) == null) {
            return false;
        }
        return m.booleanValue();
    }

    public static final int w(ITMSPage iTMSPage) {
        dyd x;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d24fdc20", new Object[]{iTMSPage})).intValue();
        }
        ckf.g(iTMSPage, "<this>");
        if (!iTMSPage.getPageParams().m() || (x = x(iTMSPage)) == null) {
            return 0;
        }
        return x.d();
    }

    public static final dyd x(ITMSPage iTMSPage) {
        ITMSPage L;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dyd) ipChange.ipc$dispatch("cb37f5de", new Object[]{iTMSPage});
        }
        ckf.g(iTMSPage, "<this>");
        yxd yxdVar = (yxd) iTMSPage.getExtension(yxd.class);
        if (yxdVar == null || (L = yxdVar.L()) == null) {
            return null;
        }
        return (dyd) L.getExtension(dyd.class);
    }

    public static final boolean y(ITMSPage iTMSPage) {
        Application application;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ade1a390", new Object[]{iTMSPage})).booleanValue();
        }
        ckf.g(iTMSPage, "<this>");
        IEnvironmentService iEnvironmentService = (IEnvironmentService) p8s.b(IEnvironmentService.class);
        Window.WindowRatioConfig windowRatioConfig = null;
        if (iEnvironmentService == null) {
            application = null;
        } else {
            application = iEnvironmentService.getApplicationContext();
        }
        if (!o9s.j(application)) {
            return false;
        }
        Window m = iTMSPage.getPageParams().e().m();
        if (m != null) {
            windowRatioConfig = m.r();
        }
        if (windowRatioConfig == null) {
            i = -1;
        } else {
            i = a.$EnumSwitchMapping$0[windowRatioConfig.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3 || o(iTMSPage) != Window.Orientation.PORTRAIT) {
                    return false;
                }
            } else if (o(iTMSPage) != Window.Orientation.LANDSCAPE) {
                return false;
            }
        }
        return true;
    }

    public static final boolean z(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2f4268e", new Object[]{iTMSPage})).booleanValue();
        }
        ckf.g(iTMSPage, "<this>");
        return iTMSPage.getPageParams().c();
    }

    public static final String a(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cbf6455e", new Object[]{iTMSPage});
        }
        ckf.g(iTMSPage, "<this>");
        TMSSolutionType a0 = iTMSPage.getInstance().a0();
        int i = a0 == null ? -1 : a.$EnumSwitchMapping$1[a0.ordinal()];
        if (i == 1) {
            return iTMSPage.getInstance().d0();
        }
        if (i == 2) {
            return ckf.p("canvas_", iTMSPage.getInstance().L());
        }
        if (i == 3 || i == 4) {
            return ckf.p("widget_", iTMSPage.getInstance().L());
        }
        return null;
    }
}
