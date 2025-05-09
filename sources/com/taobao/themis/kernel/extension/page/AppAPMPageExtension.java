package com.taobao.themis.kernel.extension.page;

import android.app.Activity;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.ProcedureGlobal;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.extension.page.rum.TMSRumTarget;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.TMSAssertUtils;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.a07;
import tb.bba;
import tb.ckf;
import tb.f8d;
import tb.h8s;
import tb.kd2;
import tb.mab;
import tb.mdd;
import tb.mgg;
import tb.mop;
import tb.njg;
import tb.o9s;
import tb.pgd;
import tb.q9s;
import tb.qml;
import tb.r1w;
import tb.t2o;
import tb.tll;
import tb.ugq;
import tb.vxm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class AppAPMPageExtension implements mab {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final ITMSPage f13571a;
    public final njg b = kotlin.a.b(new AppAPMPageExtension$mPageProcedure$2(this));

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(839909591);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(839909590);
        t2o.a(839909611);
    }

    public AppAPMPageExtension(ITMSPage iTMSPage) {
        ckf.g(iTMSPage, "page");
        this.f13571a = iTMSPage;
    }

    public static final /* synthetic */ void a(AppAPMPageExtension appAPMPageExtension, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1000fd3b", new Object[]{appAPMPageExtension, str, str2});
        } else {
            appAPMPageExtension.g(str, str2);
        }
    }

    public static final /* synthetic */ void f(AppAPMPageExtension appAPMPageExtension, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7de295c", new Object[]{appAPMPageExtension, str, new Long(j)});
        } else {
            appAPMPageExtension.h(str, j);
        }
    }

    @Override // tb.z5d
    public void G(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea6c5d4", new Object[]{this, iTMSPage});
        } else {
            ckf.g(iTMSPage, "page");
        }
    }

    @Override // tb.z5d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        }
    }

    public final void g(String str, String str2) {
        pgd pgdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ce8cacf", new Object[]{this, str, str2});
            return;
        }
        mdd l = l();
        if (l != null) {
            l.a(str, str2);
        }
        if (qml.z(this.f13571a)) {
            mdd e = vxm.b.e();
            ckf.f(e, "PROXY.launcherProcedure");
            e.a(str, str2);
            if (q9s.p1() && (pgdVar = (pgd) this.f13571a.getExtension(pgd.class)) != null) {
                pgdVar.F(str, str2, TMSRumTarget.CUSTOM);
            }
        }
    }

    @Override // tb.mab
    public Map<String, Object> g1(Set<String> set) {
        r1w v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("454b371b", new Object[]{this, set});
        }
        ckf.g(set, "keys");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            mdd e = vxm.b.e();
            ckf.f(e, "PROXY.launcherProcedure");
            v = ProcedureGlobal.PROCEDURE_MANAGER.v(e);
        } catch (Throwable th) {
            TMSLogger.b("APMPageExtension", ckf.p("getApmData error ", th.getMessage()));
        }
        if (v == null) {
            return linkedHashMap;
        }
        List<ugq> r = v.r();
        if (r != null) {
            for (ugq ugqVar : r) {
                if (ugqVar.a() != null && set.contains(ugqVar.a())) {
                    String a2 = ugqVar.a();
                    ckf.f(a2, "it.name()");
                    linkedHashMap.put(a2, Long.valueOf(ugqVar.b()));
                }
            }
        }
        Map<String, Object> n = v.n();
        if (n != null) {
            for (Map.Entry<String, Object> entry : n.entrySet()) {
                if (entry.getKey() != null && set.contains(entry.getKey())) {
                    String key = entry.getKey();
                    ckf.f(key, "it.key");
                    Object value = entry.getValue();
                    ckf.f(value, "it.value");
                    linkedHashMap.put(key, value);
                }
            }
        }
        List<kd2> i = v.i();
        if (i != null) {
            for (kd2 kd2Var : i) {
                if (kd2Var.e() != null && set.contains(kd2Var.e())) {
                    String e2 = kd2Var.e();
                    ckf.f(e2, "it.bizID()");
                    Map<String, Object> f = kd2Var.f();
                    ckf.f(f, "it.properties()");
                    linkedHashMap.put(e2, f);
                }
            }
        }
        return linkedHashMap;
    }

    public final void h(String str, long j) {
        pgd pgdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b34e8ed6", new Object[]{this, str, new Long(j)});
            return;
        }
        mdd l = l();
        if (l != null) {
            l.j(str, j);
        }
        if (qml.z(this.f13571a)) {
            mdd e = vxm.b.e();
            ckf.f(e, "PROXY.launcherProcedure");
            e.j(str, j);
            if (q9s.p1() && (pgdVar = (pgd) this.f13571a.getExtension(pgd.class)) != null) {
                pgdVar.R0(str, j, TMSRumTarget.CUSTOM);
            }
        }
    }

    public final mdd l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("811dd1f7", new Object[]{this});
        }
        return (mdd) this.b.getValue();
    }

    @Override // tb.mab
    public mdd m1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("a4912787", new Object[]{this});
        }
        return l();
    }

    public final ITMSPage n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("b17e45f5", new Object[]{this});
        }
        return this.f13571a;
    }

    @Override // tb.z5d
    public void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc5065a", new Object[]{this});
        } else {
            mab.a.a(this);
        }
    }

    @Override // tb.mab
    public void k0() {
        String name;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73fe285f", new Object[]{this});
            return;
        }
        boolean z = false;
        try {
            tll pageContext = this.f13571a.getPageContext();
            Activity activity = null;
            if ((pageContext == null ? null : pageContext.getCurrentActivity()) != null) {
                g("enableAsyncInitTask", h8s.f(this.f13571a.getInstance().I(), "enableAsyncInitTask").b());
                g("enableAsyncExecuteTask", h8s.f(this.f13571a.getInstance().I(), "enableAsyncExecuteTask").b());
                g("pauseAndRestartInitTask", h8s.f(this.f13571a.getInstance().I(), "pauseAndRestartInitTask").b());
                tll pageContext2 = this.f13571a.getPageContext();
                g("postDelayInitWeexV2", h8s.h(pageContext2 == null ? null : pageContext2.getCurrentActivity(), "postDelayInitWeexV2").b());
                tll pageContext3 = this.f13571a.getPageContext();
                if (pageContext3 != null) {
                    activity = pageContext3.getCurrentActivity();
                }
                g("preloadWeexSoFeature", h8s.o(activity).b());
                g("isWeexCart", String.valueOf(h8s.v()));
                g("enableSkipHandleOnNewIntent", String.valueOf(q9s.b2()));
                g("enablePrefetchWeex", String.valueOf(q9s.E1()));
                g("initTaskExecutorV2", h8s.f(this.f13571a.getInstance().I(), "initTaskExecutorV2").b());
                g("white_skip_pages", q9s.J3("themis_common_config", "white_skip_pages", "[landing_v2_860,landing_v2_859]"));
                Activity I = this.f13571a.getInstance().I();
                ckf.f(I, "page.getInstance().activity");
                g("enablePreCreateWebview", h8s.n(I).b());
                Activity I2 = this.f13571a.getInstance().I();
                ckf.f(I2, "page.getInstance().activity");
                g("DelayPreCreateWebViewToHomeSecondRefreshEnd", h8s.d(I2).b());
                g("TMS_globalContainerOptimization", String.valueOf(bba.a(this.f13571a.getInstance().I())));
            }
            g("isThemis", "true");
            g("tmsSDKVersion", "1.1");
            String L = this.f13571a.getInstance().L();
            ckf.f(L, "page.getInstance().appId");
            g("tmsAppId", L);
            String d0 = this.f13571a.getInstance().d0();
            ckf.f(d0, "page.getInstance().uniAppId");
            g("uniAppId", d0);
            g("tmsHomePage", String.valueOf(qml.z(this.f13571a)));
            g("tmsRenderType", this.f13571a.f());
            if (!TMSInstanceExtKt.r(this.f13571a.getInstance())) {
                g("tmsBizType", "default");
            } else {
                g("tmsBizType", MspGlobalDefine.TINY_APP);
            }
            TMSSolutionType type = TMSSolutionType.getType(this.f13571a.getInstance());
            if (!(type == null || (name = type.name()) == null)) {
                g("tmsSolutionType", name);
            }
            String h = this.f13571a.getInstance().S().h("isTMSTBFragmentContainer");
            if (h != null && h.length() > 0) {
                z = true;
            }
            g("isTMSTBFragmentContainer", String.valueOf(z));
            mgg S = this.f13571a.getInstance().S();
            ckf.f(S, "page.getInstance().launchMonitorData");
            if (S.f("recycledActivity") != null) {
                g("recycledActivity", String.valueOf(o9s.l(S.f("recycledActivity"))));
            }
            if (S.f("isManifestLocal") != null) {
                String f = S.f("isManifestLocal");
                ckf.f(f, "launchMonitorData.getExt…Constants.MANIFEST_LOCAL)");
                g("isManifestLocal", f);
            }
            if (qml.z(this.f13571a)) {
                g("tmsEarlyInitTime", String.valueOf(o9s.c(h8s.sTMSEarlyInitTime.get())));
                g("tmsNecessaryInitTime", String.valueOf(o9s.c(h8s.sTMSNecessaryInitTime.get())));
                g("tmsIDLInitTime", String.valueOf(o9s.c(h8s.sTMSIDLEInitTime.get())));
                g("tmsForegroundTime", String.valueOf(o9s.c(h8s.sTMSFORGROUNDTime.get())));
                g("tmsResumedTime", String.valueOf(o9s.c(h8s.sTMSRESUMEDTime.get())));
                g("TMSTBHomeSecondRefreshEndTime", String.valueOf(o9s.c(h8s.sTMSTBHomeSecondRefreshEndTime.get())));
                g("is_tms_afc_mini_kernel", String.valueOf(h8s.sTMSAfcMiniKernel.get()));
                String f2 = S.f("isLauncherNG");
                if (f2 != null) {
                    g("isLauncherNG", f2);
                }
                Activity I3 = this.f13571a.getInstance().I();
                ckf.f(I3, "page.getInstance().activity");
                g("EnableTMSLaunchNGExperiment", h8s.e(I3).b());
                long j = -1;
                long d = S.e("containerOnCreate") ? o9s.d(S.h("containerOnCreate")) : -1L;
                if (S.e(mop.KEY_CONTAINER_START)) {
                    j = o9s.d(S.h(mop.KEY_CONTAINER_START));
                }
                if (j - d > 10) {
                    g("tmsInitCompleted", "false");
                } else {
                    g("tmsInitCompleted", "true");
                }
                if (S.e(mop.KEY_CONTAINER_START)) {
                    h("TINYAPP_pageStart", j);
                    h("TMS_appStart", j);
                }
                if (S.e("firstPageRenderStart")) {
                    h("TMS_renderStart", o9s.d(S.h("firstPageRenderStart")));
                }
                if (S.e("appInfoStepStart")) {
                    h("TMS_appInfoStart", o9s.d(S.h("appInfoStepStart")));
                }
                if (S.e("appInfoStepFinish")) {
                    h("TMS_appInfoFinish", o9s.d(S.h("appInfoStepFinish")));
                }
                if (S.f("appInfoStrategy") != null) {
                    String f3 = S.f("appInfoStrategy");
                    ckf.f(f3, "launchMonitorData.getExt…nstants.APPINFO_STRATEGY)");
                    g("tmsAppInfoStrategy", f3);
                }
                if (S.e("containerOnCreate")) {
                    h("TINYAPP_containerOnCreate", o9s.d(S.h("containerOnCreate")));
                    h("TMS_containerOnCreate", o9s.d(S.h("containerOnCreate")));
                }
            }
            String h2 = S.h("remoteGfxFromNetwork");
            if (h2 != null) {
                g("TMS_gfxLoadFromNetwork", h2);
            }
            String h3 = S.h("remoteGfxLoadTime");
            if (h3 != null) {
                g("TMS_gfxLoadSpeedTime", h3);
            }
            if (S.e("Canvas_finishLoad")) {
                h("Canvas_finishLoad", o9s.d(S.h("Canvas_finishLoad")));
            }
            if (S.e("Canvas_FirstFrameTime")) {
                h("Canvas_FirstFrameTime", o9s.d(S.h("Canvas_FirstFrameTime")));
            }
            if (q9s.w()) {
                f8d X = this.f13571a.getInstance().X();
                X.a(new AppAPMPageExtension$commitPageAPM$5$1(this));
                X.d(new AppAPMPageExtension$commitPageAPM$5$2(X, this));
            }
        } catch (Exception e) {
            IpChange ipChange2 = TMSAssertUtils.$ipChange;
            TMSLogger.c("APMPageExtension", e.getMessage(), e);
        }
    }
}
