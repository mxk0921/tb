package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.turbo.model.PrefetchModel;
import com.taobao.android.turbo.model.RedpointModel;
import com.taobao.android.turbo.monitor.Monitor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class i4k implements did {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(916455610);
        t2o.a(916455459);
    }

    @Override // tb.did
    public void A0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e3f4791", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.did
    public String C1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6147350a", new Object[]{this});
        }
        return "";
    }

    @Override // tb.did
    public String F0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e5339ce", new Object[]{this});
        }
        String a2 = wps.Companion.a();
        if (a2 != null) {
            return a2;
        }
        return "guangguang";
    }

    @Override // tb.did
    public void O0(RedpointModel redpointModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bac0de2", new Object[]{this, redpointModel});
        }
    }

    @Override // tb.cid
    public void T0(bid bidVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c752e39e", new Object[]{this, bidVar});
        } else {
            ckf.g(bidVar, DataReceiveMonitor.CB_LISTENER);
        }
    }

    @Override // tb.cid
    public void U0(bid bidVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48b38a9b", new Object[]{this, bidVar});
        } else {
            ckf.g(bidVar, DataReceiveMonitor.CB_LISTENER);
        }
    }

    @Override // tb.did
    public PrefetchModel o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PrefetchModel) ipChange.ipc$dispatch("6fa0d19a", new Object[]{this});
        }
        return null;
    }

    @Override // tb.sod
    public void onCreateService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b2eb95", new Object[]{this, qpuVar});
        } else {
            ckf.g(qpuVar, "context");
        }
    }

    @Override // tb.sod
    public void onDestroyService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673e3e35", new Object[]{this, qpuVar});
        } else {
            ckf.g(qpuVar, "context");
        }
    }

    public final void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2533751", new Object[]{this, str});
            return;
        }
        gi8 gi8Var = gi8.INSTANCE;
        gi8.b(gi8Var, str + " should not be called in NoOpRedpointService", null, Monitor.Type.FRAMEWORK, Monitor.Code.WRONG_SERVICE, false, null, 48, null);
    }

    @Override // tb.did
    public RedpointModel t1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RedpointModel) ipChange.ipc$dispatch("3021c0ea", new Object[]{this});
        }
        return null;
    }

    @Override // tb.did
    public String x1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4558dc56", new Object[]{this});
        }
        r("getClientBottomTabType");
        return "";
    }

    @Override // tb.did
    public boolean s1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("933c7212", new Object[]{this})).booleanValue();
        }
        r("isLTVEnable");
        return false;
    }

    @Override // tb.did
    public boolean u1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9f2fa85", new Object[]{this})).booleanValue();
        }
        r("isClickEnter");
        return false;
    }
}
