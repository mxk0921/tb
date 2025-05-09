package com.taobao.themis.web.solution;

import android.net.Uri;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.container.splash.DefaultSplashView;
import com.taobao.themis.kernel.TMSContainerType;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.container.ui.splash.ISplashView;
import com.taobao.themis.kernel.solution.TMSBaseSolution;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTPageStatus;
import tb.a9s;
import tb.bbs;
import tb.ies;
import tb.lbs;
import tb.mbs;
import tb.mm4;
import tb.oxr;
import tb.pcs;
import tb.rwd;
import tb.slo;
import tb.t2o;
import tb.twd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMSLegacyWebSolution extends TMSBaseSolution {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements bbs.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
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
            bbs access$000 = TMSLegacyWebSolution.access$000(TMSLegacyWebSolution.this);
            if (access$000 != null) {
                String e0 = access$000.e0();
                if (!TextUtils.isEmpty(e0)) {
                    Uri g = ies.g(e0);
                    if (TMSLegacyWebSolution.access$100(TMSLegacyWebSolution.this).O() != TMSContainerType.EMBEDDED && "true".equals(g.getQueryParameter("status_bar_transparent"))) {
                        oxr.c(access$000.I(), false);
                    }
                }
            }
        }
    }

    static {
        t2o.a(850395190);
    }

    public TMSLegacyWebSolution(bbs bbsVar) {
        super(bbsVar);
        if (bbsVar.O() != TMSContainerType.EMBEDDED) {
            try {
                UTAnalytics.getInstance().getDefaultTracker().updatePageStatus(bbsVar.I(), UTPageStatus.UT_H5_IN_WebView);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static /* synthetic */ bbs access$000(TMSLegacyWebSolution tMSLegacyWebSolution) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("1e22a797", new Object[]{tMSLegacyWebSolution});
        }
        return tMSLegacyWebSolution.mInstance;
    }

    public static /* synthetic */ bbs access$100(TMSLegacyWebSolution tMSLegacyWebSolution) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("4dd9db98", new Object[]{tMSLegacyWebSolution});
        }
        return tMSLegacyWebSolution.mInstance;
    }

    public static /* synthetic */ Object ipc$super(TMSLegacyWebSolution tMSLegacyWebSolution, String str, Object... objArr) {
        if (str.hashCode() == -1776560156) {
            return new Boolean(super.reload((pcs) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/web/solution/TMSLegacyWebSolution");
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public bbs.c createLaunchListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs.c) ipChange.ipc$dispatch("2cf7e97c", new Object[]{this});
        }
        return new a();
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public a9s createLauncher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a9s) ipChange.ipc$dispatch("9b33273c", new Object[]{this});
        }
        return new lbs(this.mInstance);
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public rwd createPageFactory(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rwd) ipChange.ipc$dispatch("3a3b758d", new Object[]{this, bbsVar});
        }
        return new mbs(bbsVar);
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public twd createRenderFactory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (twd) ipChange.ipc$dispatch("70e7c2ff", new Object[]{this});
        }
        if (this.mInstance == null) {
            return null;
        }
        return new TMSLegacyWebRenderFactory(this.mInstance);
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public mm4 generateContainerModel() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mm4) ipChange.ipc$dispatch("30ce17a3", new Object[]{this});
        }
        Window.a aVar = new Window.a();
        aVar.f(Window.Theme.LIGHT);
        String pageBgColor = this.mInstance.c0().getPageBgColor();
        if (!TextUtils.isEmpty(pageBgColor)) {
            aVar.g(pageBgColor);
        }
        Uri g = ies.g(this.mInstance.e0());
        if (g != null && g.isHierarchical()) {
            z = slo.VALUE_YES.equals(g.getQueryParameter("disableNav"));
        }
        aVar.d(Boolean.valueOf(z));
        aVar.c(Boolean.TRUE);
        return new mm4(null, null, aVar.a(), null);
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public ISplashView generateSplashView(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISplashView) ipChange.ipc$dispatch("6eefb120", new Object[]{this, viewGroup});
        }
        return new DefaultSplashView(this.mInstance, viewGroup);
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution, tb.uwd
    public TMSSolutionType getSolutionType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSSolutionType) ipChange.ipc$dispatch("888fb64e", new Object[]{this});
        }
        return TMSSolutionType.WEB_SINGLE_PAGE;
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
            this.mInstance.W().getTopPage().reload(pcsVar);
        }
        return super.reload(pcsVar);
    }
}
