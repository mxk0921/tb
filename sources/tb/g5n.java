package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService;
import com.taobao.infoflow.protocol.subservice.biz.IPullSecondFloorService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class g5n implements gsd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IMainFeedsLoopStartStopService.a f19738a;
    public final IPullSecondFloorService b;
    public IPullSecondFloorService.a c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IPullSecondFloorService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.biz.IPullSecondFloorService.a
        public void onEnterPullSecondFloor() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11729e81", new Object[]{this});
            } else {
                g5n.c(g5n.this).a(IMainFeedsLoopStartStopService.a.SECOND_FLOOR_SWITCH);
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.biz.IPullSecondFloorService.a
        public void onExitPullSecondFloor() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e74a49d", new Object[]{this});
            } else {
                g5n.c(g5n.this).onStart(IMainFeedsLoopStartStopService.a.SECOND_FLOOR_SWITCH);
            }
        }
    }

    static {
        t2o.a(486539546);
        t2o.a(486539555);
    }

    public g5n(cfc cfcVar, IMainFeedsLoopStartStopService.a aVar) {
        this.f19738a = aVar;
        this.b = (IPullSecondFloorService) cfcVar.a(IPullSecondFloorService.class);
    }

    public static /* synthetic */ IMainFeedsLoopStartStopService.a c(g5n g5nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMainFeedsLoopStartStopService.a) ipChange.ipc$dispatch("2c682c93", new Object[]{g5nVar});
        }
        return g5nVar.f19738a;
    }

    @Override // tb.gsd
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dceb4c", new Object[]{this});
        } else {
            f();
        }
    }

    @Override // tb.gsd
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd39afac", new Object[]{this});
        } else {
            e();
        }
    }

    public final IPullSecondFloorService.a d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPullSecondFloorService.a) ipChange.ipc$dispatch("7f196f8d", new Object[]{this});
        }
        return new a();
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15c31eab", new Object[]{this});
        } else if (this.b == null) {
            fve.e("PullSecondFloorStartStopDetectorImpl", "register pullSecondFloorService is null");
        } else {
            IPullSecondFloorService.a d = d();
            this.c = d;
            this.b.addLifeCycleListener(d);
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29890952", new Object[]{this});
            return;
        }
        IPullSecondFloorService iPullSecondFloorService = this.b;
        if (iPullSecondFloorService == null) {
            fve.e("PullSecondFloorStartStopDetectorImpl", "unRegister pullSecondFloorService is null");
            return;
        }
        IPullSecondFloorService.a aVar = this.c;
        if (aVar != null) {
            iPullSecondFloorService.removeLifeCycleListener(aVar);
        }
        this.c = null;
    }

    @Override // tb.gsd
    public boolean isAllowStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fafee6e", new Object[]{this})).booleanValue();
        }
        IPullSecondFloorService iPullSecondFloorService = this.b;
        if (iPullSecondFloorService != null) {
            return true ^ iPullSecondFloorService.isOnPullSecondFloor();
        }
        return true;
    }
}
