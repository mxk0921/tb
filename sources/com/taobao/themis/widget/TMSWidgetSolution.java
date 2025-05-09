package com.taobao.themis.widget;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.container.ui.splash.ISplashView;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSBaseSolution;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.open.packages.PackageManager;
import java.util.ArrayList;
import java.util.List;
import tb.a9s;
import tb.afs;
import tb.bbs;
import tb.mm4;
import tb.ocs;
import tb.q8o;
import tb.qcs;
import tb.t2o;
import tb.t4c;
import tb.twd;
import tb.ybx;
import tb.zes;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMSWidgetSolution extends TMSBaseSolution {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements twd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(TMSWidgetSolution tMSWidgetSolution) {
        }

        @Override // tb.twd
        public qcs createRender(ITMSPage iTMSPage, ocs ocsVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qcs) ipChange.ipc$dispatch("2e8fbe8e", new Object[]{this, iTMSPage, ocsVar});
            }
            return new TMSWidgetRender(iTMSPage, ocsVar);
        }

        @Override // tb.twd
        public void onDestroy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6532022", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements bbs.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(TMSWidgetSolution tMSWidgetSolution) {
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
            }
        }
    }

    static {
        t2o.a(852492298);
    }

    public TMSWidgetSolution(bbs bbsVar) {
        super(bbsVar);
    }

    public static /* synthetic */ Object ipc$super(TMSWidgetSolution tMSWidgetSolution, String str, Object... objArr) {
        if (str.hashCode() == 1316793324) {
            return super.getInstanceExtension();
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/widget/TMSWidgetSolution");
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public bbs.c createLaunchListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs.c) ipChange.ipc$dispatch("2cf7e97c", new Object[]{this});
        }
        return new b(this);
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public a9s createLauncher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a9s) ipChange.ipc$dispatch("9b33273c", new Object[]{this});
        }
        return new zes(this.mInstance);
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public twd createRenderFactory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (twd) ipChange.ipc$dispatch("70e7c2ff", new Object[]{this});
        }
        return new a(this);
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public mm4 generateContainerModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mm4) ipChange.ipc$dispatch("30ce17a3", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public ISplashView generateSplashView(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISplashView) ipChange.ipc$dispatch("6eefb120", new Object[]{this, viewGroup});
        }
        return null;
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
        instanceExtension.add(new q8o(this.mInstance));
        instanceExtension.add(new PackageManager(this.mInstance));
        instanceExtension.add(new afs(this.mInstance));
        instanceExtension.add(new ybx(this.mInstance));
        return instanceExtension;
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution, tb.uwd
    public TMSSolutionType getSolutionType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSSolutionType) ipChange.ipc$dispatch("888fb64e", new Object[]{this});
        }
        return TMSSolutionType.WIDGET;
    }
}
