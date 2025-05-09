package com.taobao.themis.uniapp.solution;

import android.app.Activity;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.themis.container.splash.DefaultSplashView;
import com.taobao.themis.kernel.TMSContainerType;
import com.taobao.themis.kernel.adapter.IBizLaunchAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.container.ui.splash.ISplashView;
import com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;
import com.taobao.themis.kernel.metaInfo.manifest.QueryPass;
import com.taobao.themis.kernel.metaInfo.manifest.TabBar;
import com.taobao.themis.kernel.solution.TMSBaseSolution;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.web.solution.TMSWaitUCReadyStep;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import tb.a9s;
import tb.bbs;
import tb.ckf;
import tb.ees;
import tb.f8d;
import tb.h8s;
import tb.hes;
import tb.lwd;
import tb.lwy;
import tb.mm4;
import tb.nnm;
import tb.oxr;
import tb.p8s;
import tb.pcs;
import tb.q9s;
import tb.rwd;
import tb.t2o;
import tb.t4c;
import tb.t9s;
import tb.unl;
import tb.xzq;
import tb.yds;
import tb.zds;
import tb.zz3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/taobao/themis/uniapp/solution/TMSBaseUniAppSolution;", "Lcom/taobao/themis/kernel/solution/TMSBaseSolution;", "Ltb/bbs;", "instance", "<init>", "(Ltb/bbs;)V", "Ltb/a9s;", "createLauncher", "()Ltb/a9s;", "Ltb/bbs$c;", "createLaunchListener", "()Ltb/bbs$c;", "", "Ltb/t4c;", "getInstanceExtension", "()Ljava/util/List;", "Ltb/mm4;", "generateContainerModel", "()Ltb/mm4;", "Landroid/view/ViewGroup;", "splashViewContainer", "Lcom/taobao/themis/kernel/container/ui/splash/ISplashView;", "generateSplashView", "(Landroid/view/ViewGroup;)Lcom/taobao/themis/kernel/container/ui/splash/ISplashView;", "Ltb/pcs;", "renderOptions", "", "reload", "(Ltb/pcs;)Z", "Lcom/taobao/themis/kernel/solution/TMSSolutionType;", "getSolutionType", "()Lcom/taobao/themis/kernel/solution/TMSSolutionType;", "Ltb/rwd;", "createPageFactory", "(Ltb/bbs;)Ltb/rwd;", "themis_uniapp_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class TMSBaseUniAppSolution extends TMSBaseSolution {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements bbs.c {
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
            if (TMSBaseUniAppSolution.access$getMInstance$p(TMSBaseUniAppSolution.this).O() != TMSContainerType.EMBEDDED) {
                Activity I = TMSBaseUniAppSolution.access$getMInstance$p(TMSBaseUniAppSolution.this).I();
                ckf.f(I, "mInstance.activity");
                oxr.c(I, false);
            }
            ISplashView access$getMSplashView$p = TMSBaseUniAppSolution.access$getMSplashView$p(TMSBaseUniAppSolution.this);
            if (access$getMSplashView$p != null) {
                access$getMSplashView$p.exit();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b extends a9s {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(bbs bbsVar) {
            super(bbsVar);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -2016635603) {
                super.a((lwd) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/uniapp/solution/TMSBaseUniAppSolution$createLauncher$1");
        }

        @Override // tb.a9s, tb.owd
        public void a(lwd lwdVar) {
            TMSWaitUCReadyStep tMSWaitUCReadyStep;
            f8d X;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("87cc952d", new Object[]{this, lwdVar});
                return;
            }
            ckf.g(lwdVar, DataReceiveMonitor.CB_LISTENER);
            super.a(lwdVar);
            bbs bbsVar = this.c;
            ckf.f(bbsVar, "mInstance");
            TMSResourceStepGroup tMSResourceStepGroup = new TMSResourceStepGroup(bbsVar, this, lwdVar);
            IBizLaunchAdapter iBizLaunchAdapter = (IBizLaunchAdapter) p8s.b(IBizLaunchAdapter.class);
            if (iBizLaunchAdapter == null) {
                tMSWaitUCReadyStep = null;
            } else {
                bbs bbsVar2 = this.c;
                ckf.f(bbsVar2, "mInstance");
                tMSWaitUCReadyStep = iBizLaunchAdapter.createBizLaunchStep(bbsVar2, this);
            }
            if (tMSWaitUCReadyStep != null) {
                tMSResourceStepGroup.j(tMSWaitUCReadyStep);
            } else {
                tMSWaitUCReadyStep = tMSResourceStepGroup;
            }
            boolean G2 = q9s.G2();
            if (G2) {
                TMSWaitUCReadyStep tMSWaitUCReadyStep2 = new TMSWaitUCReadyStep(this.c, this);
                tMSWaitUCReadyStep.j(tMSWaitUCReadyStep2);
                tMSWaitUCReadyStep = tMSWaitUCReadyStep2;
            }
            TMSLogger.f("TMSLauncher", ckf.p("enableWaitWebReady: ", Boolean.valueOf(G2)));
            bbs bbsVar3 = this.c;
            ckf.f(bbsVar3, "mInstance");
            TMSBaseLaunchStep j = tMSWaitUCReadyStep.j(new zds(bbsVar3, this));
            bbs bbsVar4 = this.c;
            ckf.f(bbsVar4, "mInstance");
            TMSBaseLaunchStep j2 = j.j(new lwy(bbsVar4, this));
            bbs bbsVar5 = this.c;
            ckf.f(bbsVar5, "mInstance");
            j2.j(new hes(bbsVar5, this));
            tMSResourceStepGroup.a();
            bbs bbsVar6 = this.c;
            if (bbsVar6 != null && (X = bbsVar6.X()) != null) {
                X.onProperty("enableUniAppNavPrefetchAB", h8s.l(this.c.I(), "enableUniAppNavPrefetchABV1", "[0,49],[50,99]").b());
            }
        }
    }

    static {
        t2o.a(848297992);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSBaseUniAppSolution(bbs bbsVar) {
        super(bbsVar);
        ckf.g(bbsVar, "instance");
    }

    public static final /* synthetic */ bbs access$getMInstance$p(TMSBaseUniAppSolution tMSBaseUniAppSolution) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("51ea1a37", new Object[]{tMSBaseUniAppSolution});
        }
        return tMSBaseUniAppSolution.mInstance;
    }

    public static final /* synthetic */ ISplashView access$getMSplashView$p(TMSBaseUniAppSolution tMSBaseUniAppSolution) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISplashView) ipChange.ipc$dispatch("fd0da6a3", new Object[]{tMSBaseUniAppSolution});
        }
        return tMSBaseUniAppSolution.mSplashView;
    }

    public static /* synthetic */ Object ipc$super(TMSBaseUniAppSolution tMSBaseUniAppSolution, String str, Object... objArr) {
        if (str.hashCode() == 1316793324) {
            return super.getInstanceExtension();
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/uniapp/solution/TMSBaseUniAppSolution");
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
        return new b(this.mInstance);
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public rwd createPageFactory(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rwd) ipChange.ipc$dispatch("3a3b758d", new Object[]{this, bbsVar});
        }
        ckf.g(bbsVar, "instance");
        return new ees(bbsVar);
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public mm4 generateContainerModel() {
        AppManifest appManifest;
        AppManifest.Performance performance;
        Window window;
        ArrayList arrayList;
        List<AppManifest.Page> pages;
        Window window2;
        AppManifest.PageFallbackStrategy pageFallbackStrategy;
        boolean z;
        JSONObject window3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mm4) ipChange.ipc$dispatch("30ce17a3", new Object[]{this});
        }
        TMSMetaInfoWrapper U = this.mInstance.U();
        TabBar tabBar = null;
        if (U == null) {
            appManifest = null;
        } else {
            appManifest = U.r();
        }
        if (appManifest == null) {
            return null;
        }
        AppManifest.Container container = appManifest.getContainer();
        if (container == null) {
            performance = null;
        } else {
            performance = container.getPerformance();
        }
        AppManifest.Container container2 = appManifest.getContainer();
        if (container2 == null || (window3 = container2.getWindow()) == null) {
            window = null;
        } else {
            window = new Window.a().b(window3, TMSMetaInfoWrapper.Type.Manifest);
        }
        AppManifest.Container container3 = appManifest.getContainer();
        if (container3 == null || (pages = container3.getPages()) == null) {
            arrayList = null;
        } else {
            List<AppManifest.Page> list = pages;
            arrayList = new ArrayList(zz3.q(list, 10));
            for (AppManifest.Page page : list) {
                String id = page.getId();
                String url = page.getUrl();
                String version = page.getVersion();
                String renderer = page.getRenderer();
                boolean external = page.getExternal();
                boolean autofocus = page.getAutofocus();
                JSONObject window4 = page.getWindow();
                if (window4 == null) {
                    window2 = null;
                } else {
                    window2 = new Window.a().b(window4, TMSMetaInfoWrapper.Type.Manifest);
                }
                String pageType = page.getPageType();
                List<String> children = page.getChildren();
                JSONObject groupConfig = page.getGroupConfig();
                QueryPass queryPass = page.getQueryPass();
                AppManifest.PageFallbackStrategy.a aVar = AppManifest.PageFallbackStrategy.Companion;
                JSONObject fallbackStrategy = page.getFallbackStrategy();
                AppManifest.Container container4 = appManifest.getContainer();
                if (container4 == null) {
                    pageFallbackStrategy = null;
                } else {
                    pageFallbackStrategy = container4.getFallbackStrategy();
                }
                if (pageFallbackStrategy == null) {
                    pageFallbackStrategy = aVar.b();
                }
                AppManifest.PageFallbackStrategy a2 = aVar.a(fallbackStrategy, pageFallbackStrategy);
                AppManifest.Container container5 = appManifest.getContainer();
                if (container5 == null) {
                    z = false;
                } else {
                    z = container5.getEnableFallback();
                }
                arrayList.add(new unl(id, url, version, renderer, external, window2, queryPass, autofocus, pageType, children, groupConfig, a2, z));
            }
        }
        AppManifest.Container container6 = appManifest.getContainer();
        if (container6 != null) {
            tabBar = container6.getTabBar();
        }
        return new mm4(arrayList, performance, window, tabBar);
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
        instanceExtension.add(new nnm(this.mInstance));
        instanceExtension.add(new xzq(this.mInstance));
        instanceExtension.add(new yds(this.mInstance));
        return instanceExtension;
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution, tb.uwd
    public TMSSolutionType getSolutionType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSSolutionType) ipChange.ipc$dispatch("888fb64e", new Object[]{this});
        }
        return TMSSolutionType.UNIAPP;
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution, tb.uwd
    public boolean reload(pcs pcsVar) {
        t9s t9sVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("961bd7e4", new Object[]{this, pcsVar})).booleanValue();
        }
        bbs bbsVar = this.mInstance;
        if (bbsVar == null) {
            return false;
        }
        String str = pcsVar == null ? null : pcsVar.f26018a;
        if (str == null) {
            str = bbsVar.e0();
        }
        bbs bbsVar2 = this.mInstance;
        if (!(bbsVar2 == null || (t9sVar = (t9s) bbsVar2.g(t9s.class)) == null)) {
            ckf.f(str, "url");
            t9sVar.l(str, new JSONObject());
        }
        return true;
    }
}
