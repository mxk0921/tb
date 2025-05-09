package com.taobao.search.common;

import android.app.Activity;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.searchbaseframe.chitu.TBSearchChiTuJSBridge;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.android.task.Coordinator;
import com.taobao.orange.OrangeConfig;
import com.taobao.search.common.SearchSdk;
import com.taobao.search.common.jsbridge.SearchAddBagBridge;
import com.taobao.search.common.jsbridge.SearchCustomerDataBridge;
import com.taobao.search.common.jsbridge.SearchReviewBridge;
import com.taobao.search.common.jsbridge.SearchScreenShotBridge;
import com.taobao.search.common.jsbridge.SuggestPageBridge;
import com.taobao.search.common.voicesearch.jsbridge.SpeechPermissionPlugin;
import com.taobao.search.jarvis.rcmd.SearchXslSdk;
import com.taobao.search.mmd.onesearch.OnesearchBridge;
import com.taobao.search.sf.weex.module.XSearchEventBridge;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoApplication;
import com.taobao.tao.TaobaoApplication;
import com.taobao.tao.util.Constants;
import com.ut.device.UTDevice;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import tb.a07;
import tb.b4p;
import tb.c4p;
import tb.ckf;
import tb.e9n;
import tb.ej4;
import tb.fsw;
import tb.hlt;
import tb.hwh;
import tb.k3p;
import tb.k6p;
import tb.k8j;
import tb.lzn;
import tb.n1j;
import tb.o4p;
import tb.o7;
import tb.obk;
import tb.oen;
import tb.pen;
import tb.pg1;
import tb.pvu;
import tb.q5j;
import tb.rv6;
import tb.sf3;
import tb.sjt;
import tb.t2o;
import tb.t70;
import tb.wsq;
import tb.x0p;
import tb.x4p;
import tb.xvr;
import tb.y4p;
import tb.y90;
import tb.yak;
import tb.yko;
import tb.zuo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class SearchSdk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    private static final String TAG = "SearchSdk";
    public static volatile boolean sInited;
    private static boolean sIsBeta;
    public static volatile boolean sPartInit;
    public static volatile boolean sRainbowInited;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792163);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public static final void t(String str, Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70395dc1", new Object[]{str, map});
            } else {
                e9n.INSTANCE.c();
            }
        }

        public static final void u(int i, Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f45860d9", new Object[]{new Integer(i), configuration});
                return;
            }
            ckf.g(configuration, "<unused var>");
            SearchSdk.Companion.p();
        }

        public static final void v(yko ykoVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0c58181", new Object[]{ykoVar});
                return;
            }
            ckf.g(ykoVar, "$core");
            try {
                lzn.INSTANCE.i(ykoVar);
                o7.INSTANCE.h();
            } catch (Throwable unused) {
            }
        }

        public final void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("62ea22ff", new Object[]{this});
            } else if (o4p.B0()) {
                x0p.INSTANCE.b();
            }
        }

        public final void e() {
            Display defaultDisplay;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0cf2b8d", new Object[]{this});
                return;
            }
            int i = Constants.screen_height;
            if (ScreenType.IS_PAD || ScreenType.IS_FOLDABLE) {
                i = TBAutoSizeConfig.x().B(Globals.getApplication());
            } else {
                Object systemService = Globals.getApplication().getSystemService(pg1.ATOM_EXT_window);
                WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
                if (!(windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null)) {
                    i = defaultDisplay.getHeight();
                }
            }
            k3p.b(new xvr(), Globals.getApplication(), zuo.c(), zuo.e(), i);
            k3p.e();
            k3p.f();
            l();
        }

        public final void g() {
            try {
                Class.forName("com.taobao.android.xsearchplugin.debugger.AceDebugAbility").getDeclaredMethod("install", new Class[0]).invoke(null, new Object[0]);
            } catch (Throwable unused) {
            }
            t70.c().j("srp.cells.move", new n1j());
        }

        @JvmStatic
        public final boolean h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3f1ec9c5", new Object[]{this})).booleanValue();
            }
            return SearchSdk.access$getSIsBeta$cp();
        }

        public final void i() {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("270a6438", new Object[]{this});
                return;
            }
            String appVersion = TaobaoApplication.getAppVersion();
            if (!TextUtils.isEmpty(appVersion)) {
                ckf.d(appVersion);
                if (wsq.z0(appVersion, new String[]{"."}, false, 0, 6, null).size() > 3) {
                    z = true;
                }
            }
            SearchSdk.access$setSIsBeta$cp(z);
        }

        @JvmStatic
        public final void j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3df06aa", new Object[]{this});
            } else if (y4p.r() && yak.f31939a == null) {
                y90.INSTANCE.l();
                k8j.a(Globals.getApplication());
            }
        }

        public final void k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8c7425a", new Object[]{this});
            } else if (ScreenType.IS_FOLDABLE || ScreenType.IS_PAD) {
                TBAutoSizeConfig.x().d0(new OnScreenChangedListener() { // from class: tb.gnz
                    @Override // com.taobao.android.autosize.OnScreenChangedListener
                    public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
                        guk.a(this, activity, i, configuration);
                    }

                    @Override // com.taobao.android.autosize.OnScreenChangedListener
                    public final void onScreenChanged(int i, Configuration configuration) {
                        SearchSdk.a.u(i, configuration);
                    }
                });
                p();
            }
        }

        public final void l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("172b8a05", new Object[]{this});
                return;
            }
            fsw.i(SearchAddBagBridge.API_NAME, SearchAddBagBridge.class, true);
            fsw.i(SearchCustomerDataBridge.API_NAME, SearchCustomerDataBridge.class, true);
            fsw.i(SpeechPermissionPlugin.API_NAME, SpeechPermissionPlugin.class, true);
            fsw.i(XSearchEventBridge.API_NAME, XSearchEventBridge.class, true);
            fsw.i(SearchReviewBridge.API_NAME, SearchReviewBridge.class, true);
            fsw.i(SuggestPageBridge.API_NAME, SuggestPageBridge.class, true);
            fsw.i(SearchScreenShotBridge.API_NAME, SearchScreenShotBridge.class, true);
            fsw.i("OnesearchBridge", OnesearchBridge.class, true);
        }

        public final void m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30bfc34f", new Object[]{this});
                return;
            }
            final yko ykoVar = yak.f31939a;
            if (ykoVar != null) {
                Coordinator.execute(new Runnable() { // from class: tb.fnz
                    @Override // java.lang.Runnable
                    public final void run() {
                        SearchSdk.a.v(yko.this);
                    }
                });
            }
        }

        public final void n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fffd97da", new Object[]{this});
            } else {
                q5j.b = o4p.C1("mtopStreamParse");
            }
        }

        public final void o() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e0385a69", new Object[]{this});
            } else {
                pvu.h = y4p.n();
            }
        }

        public final void p() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("445f1f55", new Object[]{this});
                return;
            }
            DisplayMetrics displayMetrics = Globals.getApplication().getResources().getDisplayMetrics();
            int H = TBAutoSizeConfig.x().H(Globals.getApplication());
            zuo.g(H, TBAutoSizeConfig.x().B(Globals.getApplication()), displayMetrics.density);
            ej4.f18611a = H;
        }

        public final void q() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3eefe9bf", new Object[]{this});
                return;
            }
            try {
                hlt.e = o4p.z2();
            } catch (Throwable th) {
                c4p.o("updateTextHelperSwitch", "weex_uikit不是最新依赖", th);
            }
        }

        public a() {
        }

        @JvmStatic
        public final synchronized void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fede197", new Object[]{this});
            } else if (SearchSdk.sInited) {
                n();
                m();
                k3p.c();
                o();
                q();
            } else {
                SearchSdk.sPartInit = true;
                SearchSdk.sInited = true;
                i();
                k();
                d();
                k6p.a().b();
                SearchXslSdk.install();
                e();
                y90.INSTANCE.l();
                if (rv6.a()) {
                    g();
                    fsw.i(yak.f31939a.d().d, TBSearchChiTuJSBridge.class, true);
                }
                c();
                f();
                hwh.INSTANCE.c(new sf3());
                n();
                m();
                o();
                o4p.O("test");
                q();
            }
        }

        public final void d() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f09ecc0d", new Object[]{this});
            } else if (!SearchSdk.sRainbowInited) {
                SearchSdk.sRainbowInited = true;
                try {
                    str = UTDevice.getUtdid(Globals.getApplication());
                } catch (Exception e) {
                    b4p.p(SearchSdk.TAG, "获取utdid失败", e);
                    str = "";
                }
                oen.y(new x4p());
                oen.x(new pen());
                oen.p(TaoApplication.getVersion(), str, Globals.getApplication());
                oen.z();
                OrangeConfig.getInstance().registerListener(new String[]{"search_abtest"}, new obk() { // from class: tb.hnz
                    @Override // tb.obk
                    public final void onConfigUpdate(String str2, Map map) {
                        SearchSdk.a.t(str2, map);
                    }
                }, true);
            }
        }

        public final void f() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a680093", new Object[]{this});
            } else if (o4p.y2()) {
                OrangeConfig instance = OrangeConfig.getInstance();
                if (Localization.o()) {
                    str = "search_template_preload_ovs";
                } else {
                    str = sjt.NAMESPACE;
                }
                instance.registerListener(new String[]{str}, new sjt(), true);
            }
        }
    }

    static {
        t2o.a(815792162);
    }

    public static final /* synthetic */ boolean access$getSIsBeta$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8dcde025", new Object[0])).booleanValue();
        }
        return sIsBeta;
    }

    public static final /* synthetic */ void access$setSIsBeta$cp(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62c57047", new Object[]{new Boolean(z)});
        } else {
            sIsBeta = z;
        }
    }

    @JvmStatic
    public static final synchronized void init() {
        synchronized (SearchSdk.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fede197", new Object[0]);
            } else {
                Companion.b();
            }
        }
    }

    @JvmStatic
    public static final boolean isBeta() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f1ec9c5", new Object[0])).booleanValue();
        }
        return Companion.h();
    }

    @JvmStatic
    public static final void partInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3df06aa", new Object[0]);
        } else {
            Companion.j();
        }
    }
}
