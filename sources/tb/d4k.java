package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.turbo.monitor.Monitor;
import com.taobao.tao.navigation.TBFragmentTabHost;
import com.taobao.tao.navigation.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class d4k implements tjb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(916455511);
        t2o.a(916455436);
    }

    @Override // tb.sjb
    public void B(rjb rjbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37e92383", new Object[]{this, rjbVar});
        } else {
            ckf.g(rjbVar, DataReceiveMonitor.CB_LISTENER);
        }
    }

    @Override // tb.sjb
    public void L(rjb rjbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40e57d80", new Object[]{this, rjbVar});
        } else {
            ckf.g(rjbVar, DataReceiveMonitor.CB_LISTENER);
        }
    }

    @Override // tb.tjb
    public void e0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c8cc85a", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.tjb
    public void i1(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e192cd9", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
    }

    @Override // tb.tjb
    public void m1(int i, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30078e0b", new Object[]{this, new Integer(i), str, str2, str3});
            return;
        }
        ckf.g(str, "selectIcon");
        ckf.g(str2, "unSelectIcon");
        ckf.g(str3, "title");
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

    @Override // tb.tjb
    public boolean p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7179ecd5", new Object[]{this})).booleanValue();
        }
        x("isTabBarVisible");
        return a.y();
    }

    public int r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66e38d1a", new Object[]{this})).intValue();
        }
        x("getCurrentTabIndex");
        TBFragmentTabHost o = a.o();
        if (o != null) {
            return o.getCurrentTab();
        }
        return 0;
    }

    @Override // tb.tjb
    public void u0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8d6c90f", new Object[]{this, new Integer(i)});
        }
    }

    public final void x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2533751", new Object[]{this, str});
            return;
        }
        gi8 gi8Var = gi8.INSTANCE;
        gi8.b(gi8Var, str + " should not be called in NoOpBottomBarService", null, Monitor.Type.FRAMEWORK, Monitor.Code.WRONG_SERVICE, false, null, 48, null);
    }

    @Override // tb.tjb
    public boolean B0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99c902cd", new Object[]{this})).booleanValue();
        }
        x("isTab2Selected");
        return M(1);
    }

    public boolean M(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6a6dd5a", new Object[]{this, new Integer(i)})).booleanValue();
        }
        x("isTabSelected");
        return r() == i;
    }
}
