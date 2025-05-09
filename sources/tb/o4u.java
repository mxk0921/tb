package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.engine.invoke.biz.ITopViewService;
import com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import tb.h6c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class o4u implements gsd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ITopViewService f25143a;
    public final IMainFeedsViewService<?> b;
    public final IMainFeedsLoopStartStopService.a c;
    public ITopViewService.a d;
    public h6c.b e;
    public boolean f = false;
    public boolean g = true;

    static {
        t2o.a(486539552);
        t2o.a(486539555);
    }

    public o4u(cfc cfcVar, IMainFeedsLoopStartStopService.a aVar) {
        this.c = aVar;
        this.f25143a = (ITopViewService) cfcVar.a(ITopViewService.class);
        this.b = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
    }

    public static /* synthetic */ boolean c(o4u o4uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5809bb36", new Object[]{o4uVar})).booleanValue();
        }
        return o4uVar.f;
    }

    public static /* synthetic */ boolean d(o4u o4uVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b5c6b24", new Object[]{o4uVar, new Boolean(z)})).booleanValue();
        }
        o4uVar.f = z;
        return z;
    }

    public static /* synthetic */ boolean e(o4u o4uVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9acc4603", new Object[]{o4uVar, new Boolean(z)})).booleanValue();
        }
        o4uVar.g = z;
        return z;
    }

    public static /* synthetic */ IMainFeedsLoopStartStopService.a f(o4u o4uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMainFeedsLoopStartStopService.a) ipChange.ipc$dispatch("358b7efa", new Object[]{o4uVar});
        }
        return o4uVar.c;
    }

    @Override // tb.gsd
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dceb4c", new Object[]{this});
            return;
        }
        l();
        k();
    }

    @Override // tb.gsd
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd39afac", new Object[]{this});
            return;
        }
        h();
        g();
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77c0d919", new Object[]{this});
        } else if (this.b != null) {
            this.e = i();
            this.b.getLifeCycleRegister().M(this.e);
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f4932b1", new Object[]{this});
        } else if (this.f25143a != null && this.d == null) {
            ITopViewService.a j = j();
            this.d = j;
            this.f25143a.addTopViewShowListener(j);
        }
    }

    public final h6c.b i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6c.b) ipChange.ipc$dispatch("67dd6bff", new Object[]{this});
        }
        return new p4u(this);
    }

    @Override // tb.gsd
    public boolean isAllowStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fafee6e", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public final ITopViewService.a j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITopViewService.a) ipChange.ipc$dispatch("e7ae6888", new Object[]{this});
        }
        return new a();
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a89a29d6", new Object[]{this});
            return;
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.b;
        if (iMainFeedsViewService != null && this.e != null) {
            iMainFeedsViewService.getLifeCycleRegister().k(this.e);
        }
    }

    public final void l() {
        ITopViewService.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8022836e", new Object[]{this});
            return;
        }
        ITopViewService iTopViewService = this.f25143a;
        if (iTopViewService != null && (aVar = this.d) != null) {
            iTopViewService.removeTopViewShowListener(aVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements ITopViewService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.protocol.engine.invoke.biz.ITopViewService.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e236a04", new Object[]{this});
                return;
            }
            o4u.d(o4u.this, false);
            o4u.e(o4u.this, true);
            o4u.f(o4u.this).onStart(IMainFeedsLoopStartStopService.a.TOP_VIEW_COLD_START);
        }

        @Override // com.taobao.infoflow.protocol.engine.invoke.biz.ITopViewService.a
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11c720e9", new Object[]{this, str});
                return;
            }
            o4u.d(o4u.this, true);
            o4u.e(o4u.this, false);
            o4u.f(o4u.this).a(IMainFeedsLoopStartStopService.a.TOP_VIEW_COLD_START);
        }
    }
}
