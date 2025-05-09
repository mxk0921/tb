package com.taobao.themis.widget.kernal;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.container.ui.splash.ISplashView;
import com.taobao.themis.kernel.solution.TMSBaseSolution;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.open.packages.PackageManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import tb.a9s;
import tb.acs;
import tb.afs;
import tb.bbs;
import tb.ckf;
import tb.lwd;
import tb.mm4;
import tb.q8o;
import tb.s8s;
import tb.t2o;
import tb.t4c;
import tb.twd;
import tb.ubx;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/taobao/themis/widget/kernal/WidgetFrameworkSolution;", "Lcom/taobao/themis/kernel/solution/TMSBaseSolution;", "Ltb/bbs;", "instance", "<init>", "(Ltb/bbs;)V", "Ltb/twd;", "createRenderFactory", "()Ltb/twd;", "Ltb/a9s;", "createLauncher", "()Ltb/a9s;", "", "Ltb/t4c;", "getInstanceExtension", "()Ljava/util/List;", "Ltb/bbs$c;", "createLaunchListener", "()Ltb/bbs$c;", "Landroid/view/ViewGroup;", "splashViewContainer", "Lcom/taobao/themis/kernel/container/ui/splash/ISplashView;", "generateSplashView", "(Landroid/view/ViewGroup;)Lcom/taobao/themis/kernel/container/ui/splash/ISplashView;", "Lcom/taobao/themis/kernel/solution/TMSSolutionType;", "getSolutionType", "()Lcom/taobao/themis/kernel/solution/TMSSolutionType;", "Ltb/mm4;", "generateContainerModel", "()Ltb/mm4;", "Ltb/bbs;", "getInstance", "()Ltb/bbs;", "themis_widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class WidgetFrameworkSolution extends TMSBaseSolution {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final bbs instance;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements bbs.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/widget/kernal/WidgetFrameworkSolution$createLauncher$1");
        }

        @Override // tb.a9s, tb.owd
        public void a(lwd lwdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("87cc952d", new Object[]{this, lwdVar});
                return;
            }
            super.a(lwdVar);
            s8s s8sVar = new s8s(WidgetFrameworkSolution.this.getInstance(), this);
            s8sVar.j(new acs(WidgetFrameworkSolution.this.getInstance(), this));
            s8sVar.a();
        }
    }

    static {
        t2o.a(852492375);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetFrameworkSolution(bbs bbsVar) {
        super(bbsVar);
        ckf.g(bbsVar, "instance");
        this.instance = bbsVar;
    }

    public static /* synthetic */ Object ipc$super(WidgetFrameworkSolution widgetFrameworkSolution, String str, Object... objArr) {
        if (str.hashCode() == 1316793324) {
            return super.getInstanceExtension();
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/widget/kernal/WidgetFrameworkSolution");
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
        return new b(this.instance);
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public twd createRenderFactory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (twd) ipChange.ipc$dispatch("70e7c2ff", new Object[]{this});
        }
        return null;
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
        ckf.g(viewGroup, "splashViewContainer");
        return null;
    }

    public final bbs getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("57ded820", new Object[]{this});
        }
        return this.instance;
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
        instanceExtension.add(new ubx(this.mInstance));
        return instanceExtension;
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution, tb.uwd
    public TMSSolutionType getSolutionType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSSolutionType) ipChange.ipc$dispatch("888fb64e", new Object[]{this});
        }
        return TMSSolutionType.CLUSTER_WIDGET;
    }
}
