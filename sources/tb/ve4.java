package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class ve4 extends TMSBaseLaunchStep {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final bbs k;
    public final List<a> l = new ArrayList();
    public boolean m;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static abstract class a extends TMSBaseLaunchStep {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final ve4 k;

        static {
            t2o.a(839909745);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(bbs bbsVar, a9s a9sVar, ve4 ve4Var) {
            super(bbsVar, a9sVar);
            ckf.g(bbsVar, "instance");
            ckf.g(a9sVar, wzi.LAUNCHER);
            ckf.g(ve4Var, "group");
            this.k = ve4Var;
            String str = ve4Var.c;
            this.d = str;
            ckf.f(str, "mParentTraceId");
            this.c = mcs.d(str);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/launcher/step/ConcurrentStepGroup$ConcurrentStep");
        }

        @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("54d45dfa", new Object[]{this});
            } else {
                this.k.n(this);
            }
        }

        @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
        public void g(eas easVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4d9c76e7", new Object[]{this, easVar});
                return;
            }
            this.k.g(easVar);
            this.k.n(this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f29954a;

        public b(a aVar) {
            this.f29954a = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f29954a.a();
            }
        }
    }

    static {
        t2o.a(839909744);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve4(bbs bbsVar, a9s a9sVar) {
        super(bbsVar, a9sVar);
        ckf.g(bbsVar, "instance");
        ckf.g(a9sVar, wzi.LAUNCHER);
        this.k = bbsVar;
    }

    public static /* synthetic */ Object ipc$super(ve4 ve4Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/launcher/step/ConcurrentStepGroup");
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void h() {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67daaada", new Object[]{this});
            return;
        }
        this.m = true;
        if (((ArrayList) this.l).isEmpty()) {
            i();
            return;
        }
        for (a aVar : i04.B0(this.l)) {
            IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
            if (!(iExecutorService == null || (executor = iExecutorService.getExecutor(ExecutorType.NORMAL)) == null)) {
                executor.execute(new b(aVar));
            }
        }
    }

    public final void k(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bada4bb", new Object[]{this, aVar});
            return;
        }
        ckf.g(aVar, tl.KEY_STEP);
        if (this.m) {
            TMSLogger.b("ConcurrentStepGroup", "cannot add steps after executing");
            return;
        }
        TMSLogger.b("ConcurrentStepGroup", ckf.p("add step : ", aVar.c()));
        ((ArrayList) this.l).add(aVar);
    }

    public final bbs l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("57ded820", new Object[]{this});
        }
        return this.k;
    }

    public abstract void m(a aVar);

    public final void n(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90452900", new Object[]{this, aVar});
            return;
        }
        ckf.g(aVar, tl.KEY_STEP);
        ((ArrayList) this.l).remove(aVar);
        m(aVar);
        if (((ArrayList) this.l).isEmpty() && this.f == null) {
            i();
        }
    }
}
