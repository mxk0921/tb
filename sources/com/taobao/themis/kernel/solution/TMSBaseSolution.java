package com.taobao.themis.kernel.solution;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.container.ui.splash.ISplashView;
import java.io.Serializable;
import java.util.List;
import kotlin.a;
import tb.a9s;
import tb.b9s;
import tb.bbs;
import tb.ckf;
import tb.mm4;
import tb.njg;
import tb.pcs;
import tb.pwd;
import tb.rwd;
import tb.t2o;
import tb.t4c;
import tb.twd;
import tb.uwd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class TMSBaseSolution implements uwd, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private mm4 mContainerModel;
    public final bbs mInstance;
    private final njg mPageFactory$delegate;
    public ISplashView mSplashView;
    private final njg mLauncher$delegate = a.b(new TMSBaseSolution$mLauncher$2(this));
    private final njg mLauncherNG$delegate = a.b(new TMSBaseSolution$mLauncherNG$2(this));
    private final njg mRenderFactory$delegate = a.b(new TMSBaseSolution$mRenderFactory$2(this));
    private final njg mLaunchListener$delegate = a.b(new TMSBaseSolution$mLaunchListener$2(this));

    static {
        t2o.a(839909935);
        t2o.a(839909934);
    }

    public TMSBaseSolution(bbs bbsVar) {
        ckf.g(bbsVar, "instance");
        this.mInstance = bbsVar;
        this.mPageFactory$delegate = a.b(new TMSBaseSolution$mPageFactory$2(this, bbsVar));
    }

    private final bbs.c getMLaunchListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs.c) ipChange.ipc$dispatch("8ea0e61", new Object[]{this});
        }
        return (bbs.c) this.mLaunchListener$delegate.getValue();
    }

    private final a9s getMLauncher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a9s) ipChange.ipc$dispatch("7669fcb7", new Object[]{this});
        }
        return (a9s) this.mLauncher$delegate.getValue();
    }

    private final pwd getMLauncherNG() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pwd) ipChange.ipc$dispatch("71586dda", new Object[]{this});
        }
        return (pwd) this.mLauncherNG$delegate.getValue();
    }

    private final rwd getMPageFactory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rwd) ipChange.ipc$dispatch("91836c16", new Object[]{this});
        }
        return (rwd) this.mPageFactory$delegate.getValue();
    }

    private final twd getMRenderFactory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (twd) ipChange.ipc$dispatch("bc2ed64", new Object[]{this});
        }
        return (twd) this.mRenderFactory$delegate.getValue();
    }

    public abstract bbs.c createLaunchListener();

    public abstract a9s createLauncher();

    public pwd createLauncherNG() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pwd) ipChange.ipc$dispatch("d67d4375", new Object[]{this});
        }
        return null;
    }

    public rwd createPageFactory(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rwd) ipChange.ipc$dispatch("3a3b758d", new Object[]{this, bbsVar});
        }
        ckf.g(bbsVar, "instance");
        return new b9s(bbsVar);
    }

    public abstract twd createRenderFactory();

    @Override // tb.uwd
    public void createSplashView(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0d18f8e", new Object[]{this, viewGroup});
            return;
        }
        ckf.g(viewGroup, "splashViewContainer");
        this.mSplashView = generateSplashView(viewGroup);
    }

    @Override // tb.uwd
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        getMLauncher().destroy();
        twd mRenderFactory = getMRenderFactory();
        if (mRenderFactory != null) {
            mRenderFactory.onDestroy();
        }
        ISplashView iSplashView = this.mSplashView;
        if (iSplashView != null) {
            iSplashView.exit();
        }
    }

    public abstract mm4 generateContainerModel();

    public abstract ISplashView generateSplashView(ViewGroup viewGroup);

    @Override // tb.uwd
    public mm4 getContainerModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mm4) ipChange.ipc$dispatch("6dea3104", new Object[]{this});
        }
        mm4 mm4Var = this.mContainerModel;
        if (mm4Var != null) {
            return mm4Var;
        }
        mm4 generateContainerModel = generateContainerModel();
        this.mContainerModel = generateContainerModel;
        return generateContainerModel;
    }

    @Override // tb.uwd
    public List<t4c> getInstanceExtension() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4e7cabec", new Object[]{this});
        }
        return null;
    }

    public bbs.c getLaunchListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs.c) ipChange.ipc$dispatch("a267d1e2", new Object[]{this});
        }
        return getMLaunchListener();
    }

    @Override // tb.uwd
    public a9s getLauncher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a9s) ipChange.ipc$dispatch("bf71416", new Object[]{this});
        }
        return getMLauncher();
    }

    @Override // tb.uwd
    public pwd getLauncherNG() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pwd) ipChange.ipc$dispatch("c75688db", new Object[]{this});
        }
        return getMLauncherNG();
    }

    @Override // tb.uwd
    public rwd getPageFactory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rwd) ipChange.ipc$dispatch("96566cd7", new Object[]{this});
        }
        return getMPageFactory();
    }

    @Override // tb.uwd
    public twd getRenderFactory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (twd) ipChange.ipc$dispatch("61c10865", new Object[]{this});
        }
        return getMRenderFactory();
    }

    @Override // tb.uwd
    public abstract /* synthetic */ TMSSolutionType getSolutionType();

    @Override // tb.uwd
    public ISplashView getSplashView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISplashView) ipChange.ipc$dispatch("ccf1f37e", new Object[]{this});
        }
        return this.mSplashView;
    }

    @Override // tb.uwd
    public boolean reload(pcs pcsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("961bd7e4", new Object[]{this, pcsVar})).booleanValue();
        }
        return false;
    }
}
