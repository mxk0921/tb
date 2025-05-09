package com.taobao.themis.weex.solution;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.container.splash.DefaultSplashView;
import com.taobao.themis.kernel.TMSContainerType;
import com.taobao.themis.kernel.container.ui.splash.ISplashView;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSBaseSolution;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import java.util.ArrayList;
import java.util.List;
import tb.a07;
import tb.a9s;
import tb.bbs;
import tb.ckf;
import tb.ies;
import tb.nbs;
import tb.obs;
import tb.oxr;
import tb.pcs;
import tb.pwd;
import tb.q9s;
import tb.t2o;
import tb.t4c;
import tb.tes;
import tb.twd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSLegacyWeexSolution extends TMSBaseSolution {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    private static final String NAV_HIDDEN = "wx_navbar_hidden";
    private static final String WX_DISABLE_KEYBOARD_TRANSFORM = "wx_disable_keyboard_transform";
    private static final String WX_NAVBAR_TRANSPARENT = "wx_navbar_transparent";
    private static final String WX_STATUSBAR_HIDDEN = "_wx_statusbar_hidden";
    private static final String WX_STATUSBAR_HIDDEN2 = "wx_statusbar_hidden";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(851443746);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements bbs.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.bbs.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edfb8375", new Object[]{this});
            }
        }

        @Override // tb.bbs.c
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a16c1d38", new Object[]{this});
            }
        }

        @Override // tb.bbs.c
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4667d5a", new Object[]{this});
            }
        }

        @Override // tb.bbs.c
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f93d9f99", new Object[]{this});
                return;
            }
            bbs access$getMInstance$p = TMSLegacyWeexSolution.access$getMInstance$p(TMSLegacyWeexSolution.this);
            String e0 = access$getMInstance$p.e0();
            if (!TextUtils.isEmpty(e0)) {
                Uri g = ies.g(e0);
                if (g.isHierarchical()) {
                    if (TMSLegacyWeexSolution.access$getMInstance$p(TMSLegacyWeexSolution.this).O() != TMSContainerType.EMBEDDED) {
                        if (ckf.b("true", g.getQueryParameter(TMSLegacyWeexSolution.WX_STATUSBAR_HIDDEN))) {
                            Activity I = access$getMInstance$p.I();
                            ckf.f(I, "instance.activity");
                            oxr.c(I, false);
                        }
                        if (ckf.b("true", g.getQueryParameter(TMSLegacyWeexSolution.WX_STATUSBAR_HIDDEN2))) {
                            Activity I2 = access$getMInstance$p.I();
                            ckf.f(I2, "instance.activity");
                            oxr.c(I2, false);
                        }
                    }
                    if (q9s.F2() && ckf.b("true", g.getQueryParameter(TMSLegacyWeexSolution.WX_DISABLE_KEYBOARD_TRANSFORM))) {
                        access$getMInstance$p.I().getWindow().setSoftInputMode(48);
                    }
                }
            }
        }
    }

    static {
        t2o.a(851443745);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSLegacyWeexSolution(bbs bbsVar) {
        super(bbsVar);
        ckf.g(bbsVar, "instance");
    }

    public static final /* synthetic */ bbs access$getMInstance$p(TMSLegacyWeexSolution tMSLegacyWeexSolution) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("1a98258f", new Object[]{tMSLegacyWeexSolution});
        }
        return tMSLegacyWeexSolution.mInstance;
    }

    public static /* synthetic */ Object ipc$super(TMSLegacyWeexSolution tMSLegacyWeexSolution, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1776560156) {
            return new Boolean(super.reload((pcs) objArr[0]));
        }
        if (hashCode == 1316793324) {
            return super.getInstanceExtension();
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/themis/weex/solution/TMSLegacyWeexSolution");
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public bbs.c createLaunchListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs.c) ipChange.ipc$dispatch("2cf7e97c", new Object[]{this});
        }
        return new b();
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public a9s createLauncher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a9s) ipChange.ipc$dispatch("9b33273c", new Object[]{this});
        }
        return new nbs(this.mInstance);
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public pwd createLauncherNG() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pwd) ipChange.ipc$dispatch("d67d4375", new Object[]{this});
        }
        return new obs();
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public twd createRenderFactory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (twd) ipChange.ipc$dispatch("70e7c2ff", new Object[]{this});
        }
        return new TMSLegacyWeexRenderFactory(this.mInstance);
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public ISplashView generateSplashView(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISplashView) ipChange.ipc$dispatch("6eefb120", new Object[]{this, viewGroup});
        }
        ckf.g(viewGroup, "splashViewContainer");
        return new DefaultSplashView(this.mInstance, viewGroup);
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution, tb.uwd
    public List<t4c> getInstanceExtension() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4e7cabec", new Object[]{this});
        }
        List<t4c> instanceExtension = super.getInstanceExtension();
        if (instanceExtension == null) {
            instanceExtension = new ArrayList<>();
        }
        instanceExtension.add(new tes(this.mInstance));
        return instanceExtension;
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution, tb.uwd
    public TMSSolutionType getSolutionType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSSolutionType) ipChange.ipc$dispatch("888fb64e", new Object[]{this});
        }
        return TMSSolutionType.WEEX;
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution, tb.uwd
    public boolean reload(pcs pcsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("961bd7e4", new Object[]{this, pcsVar})).booleanValue();
        }
        if (pcsVar != null) {
            this.mInstance.w0(pcsVar.f26018a);
        }
        if (this.mInstance.W().getTopPage() != null) {
            ITMSPage topPage = this.mInstance.W().getTopPage();
            ckf.d(topPage);
            topPage.reload(pcsVar);
        }
        return super.reload(pcsVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
        if (tb.ckf.b("true", r2.getQueryParameter("wx_navbar_transparent")) != false) goto L_0x005c;
     */
    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.mm4 generateContainerModel() {
        /*
            r7 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.themis.weex.solution.TMSLegacyWeexSolution.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "30ce17a3"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r7
            java.lang.Object r0 = r2.ipc$dispatch(r3, r1)
            tb.mm4 r0 = (tb.mm4) r0
            return r0
        L_0x0015:
            tb.bbs r2 = r7.mInstance
            java.lang.String r2 = r2.e0()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r3 = 0
            if (r2 == 0) goto L_0x0023
            return r3
        L_0x0023:
            tb.bbs r2 = r7.mInstance
            java.lang.String r2 = r2.e0()
            android.net.Uri r2 = tb.ies.g(r2)
            tb.ckf.d(r2)
            boolean r4 = r2.isHierarchical()
            if (r4 == 0) goto L_0x005b
            java.lang.String r4 = "wx_navbar_hidden"
            java.lang.String r5 = r2.getQueryParameter(r4)
            java.lang.String r6 = "true"
            if (r5 == 0) goto L_0x004b
            java.lang.String r4 = r2.getQueryParameter(r4)
            boolean r4 = tb.ckf.b(r6, r4)
            goto L_0x004c
        L_0x004b:
            r4 = 0
        L_0x004c:
            java.lang.String r5 = "wx_navbar_transparent"
            java.lang.String r2 = r2.getQueryParameter(r5)
            boolean r2 = tb.ckf.b(r6, r2)
            r0 = r4
            if (r2 == 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r1 = 0
        L_0x005c:
            com.taobao.themis.kernel.container.Window$a r2 = new com.taobao.themis.kernel.container.Window$a
            r2.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.d(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r2.e(r0)
            com.taobao.themis.kernel.container.Window r0 = r2.a()
            tb.mm4 r1 = new tb.mm4
            r1.<init>(r3, r3, r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.weex.solution.TMSLegacyWeexSolution.generateContainerModel():tb.mm4");
    }
}
