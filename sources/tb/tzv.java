package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.list.render.RecyclerViewHolder;
import com.taobao.android.fluid.framework.preload.cardwarmup.WarmUpReason;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class tzv implements wlb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String d = "VCard";

    /* renamed from: a  reason: collision with root package name */
    public FluidContext f29053a;
    public a b;
    private boolean c = false;

    static {
        t2o.a(468714129);
        t2o.a(468713934);
    }

    public tzv(FluidContext fluidContext, a aVar) {
        this.f29053a = fluidContext;
        this.b = aVar;
    }

    public abstract void l();

    public abstract void m(int i, int i2, WarmUpReason warmUpReason, mxw mxwVar);

    public final a o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("3ad1816c", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.wlb
    public void onActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f731d69d", new Object[]{this, uq9Var});
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
    public void onBindData(uq9 uq9Var, a aVar, int i, List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2231971b", new Object[]{this, uq9Var, aVar, new Integer(i), list});
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
        }
    }

    @Override // tb.wlb
    public void onDisAppear(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9c725bc", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.wlb
    public void onRecycle(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa63ccc", new Object[]{this, uq9Var});
        } else {
            this.c = false;
        }
    }

    @Override // tb.wlb
    public void onWillActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f263d10f", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.wlb
    public void onWillDisActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9290cf3b", new Object[]{this, uq9Var});
        }
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d43a68f1", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    @Override // tb.wlb
    public void onBindData(uq9 uq9Var, a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24609e2a", new Object[]{this, uq9Var, aVar, new Integer(i)});
        } else {
            this.c = true;
        }
    }
}
