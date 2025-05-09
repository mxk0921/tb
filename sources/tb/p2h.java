package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import tb.wlb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class p2h extends wlb.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final k5h f25829a;

    static {
        t2o.a(468713982);
    }

    public p2h(k5h k5hVar) {
        this.f25829a = k5hVar;
        m();
    }

    public static /* synthetic */ Object ipc$super(p2h p2hVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/live/manager/preload/LivePreloadManager");
    }

    private boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("377108cd", new Object[]{this})).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableHalfLivePreload", true);
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9344b335", new Object[]{this});
        } else {
            this.f25829a.N().addCardLifecycleListener((wlb.a) this);
        }
    }

    public void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c025a5e6", new Object[]{this, new Boolean(z)});
        } else {
            uwg.e(this.f25829a.U(), this.f25829a.k1().getDWInstance(), z);
        }
    }

    @Override // tb.wlb.a, tb.wlb
    public void onAppear(uq9 uq9Var) {
        int pageState;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6fc56c", new Object[]{this, uq9Var});
            return;
        }
        this.f25829a.t1();
        if (!(this.f25829a.U().getService(ILifecycleService.class) == null || (pageState = ((ILifecycleService) this.f25829a.U().getService(ILifecycleService.class)).getPageState()) == 1 || pageState == 2)) {
            z = false;
        }
        uwg.d(this.f25829a.U(), this.f25829a, z);
        o(z);
        this.f25829a.x1();
    }

    @Override // tb.wlb.a, tb.wlb
    public void onDisAppear(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9c725bc", new Object[]{this, uq9Var});
        }
    }
}
