package tb;

import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.list.render.RecyclerViewHolder;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ha7 implements wlb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MSG_CARD_MISS_DISACTIVE = 1;
    public static final int MSG_CARD_MISS_DISAPPEAR = 2;
    public static final int MSG_CARD_MISS_RECYCLE = 3;
    public static final int MSG_CARD_MISS_WILL_DISACTIVE = 0;
    private static final String c = "DelayPauseManager";

    /* renamed from: a  reason: collision with root package name */
    private final prp f20499a;
    private Handler b;

    static {
        t2o.a(468714041);
        t2o.a(468713934);
    }

    public ha7(prp prpVar) {
        this.f20499a = prpVar;
        prpVar.N().addCardLifecycleListener(this);
    }

    public void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdb3df9", new Object[]{this, new Integer(i)});
            return;
        }
        if (i == 0) {
            this.f20499a.N0();
        } else if (i == 1) {
            this.f20499a.X0();
            this.f20499a.O0(true);
        } else if (i == 2) {
            this.f20499a.N0();
            this.f20499a.O0(true);
            this.f20499a.l1().b(null);
        } else if (i == 3) {
            this.f20499a.O0(true);
            this.f20499a.l1().b(null);
        }
        ir9.b(c, "cardMissDelayDestroyInternal,卡片消失，延迟暂停、" + i);
    }

    @Override // tb.wlb
    public void onActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f731d69d", new Object[]{this, uq9Var});
        } else {
            this.f20499a.j0();
        }
    }

    @Override // tb.wlb
    public void onAppear(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6fc56c", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.wlb
    public void onBindData(uq9 uq9Var, a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24609e2a", new Object[]{this, uq9Var, aVar, new Integer(i)});
        }
    }

    @Override // tb.wlb
    public void onCreateView(uq9 uq9Var, RecyclerViewHolder recyclerViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b05e008", new Object[]{this, uq9Var, recyclerViewHolder});
        }
    }

    @Override // tb.wlb
    public void onDisActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b58936ed", new Object[]{this, uq9Var});
        } else if (this.f20499a.j0()) {
            l(1);
        }
    }

    @Override // tb.wlb
    public void onDisAppear(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9c725bc", new Object[]{this, uq9Var});
        } else if (this.f20499a.j0()) {
            l(2);
        }
    }

    @Override // tb.wlb
    public void onRecycle(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa63ccc", new Object[]{this, uq9Var});
        } else {
            l(3);
        }
    }

    @Override // tb.wlb
    public void onWillActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f263d10f", new Object[]{this, uq9Var});
        } else {
            this.f20499a.j0();
        }
    }

    @Override // tb.wlb
    public void onWillDisActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9290cf3b", new Object[]{this, uq9Var});
        } else {
            l(0);
        }
    }

    @Override // tb.wlb
    public void onBindData(uq9 uq9Var, a aVar, int i, List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2231971b", new Object[]{this, uq9Var, aVar, new Integer(i), list});
        }
    }
}
