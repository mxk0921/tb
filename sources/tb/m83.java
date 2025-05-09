package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.list.render.RecyclerViewHolder;
import java.util.List;
import tb.wlb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class m83 implements xlb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String c = "CardLifecycleManager";

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f23839a;
    private final olk<wlb> b = new olk<>();

    static {
        t2o.a(468713933);
        t2o.a(468713936);
        t2o.a(468713937);
    }

    public m83(FluidContext fluidContext) {
        this.f23839a = fluidContext;
    }

    public void addCardLifecycleListener(wlb wlbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edf7f2f9", new Object[]{this, wlbVar});
        } else if (wlbVar != null) {
            this.b.a(wlbVar);
        }
    }

    @Override // tb.xlb, tb.wlb
    public void onActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f731d69d", new Object[]{this, uq9Var});
            return;
        }
        for (wlb wlbVar : this.b.b()) {
            try {
                wlbVar.onActive(uq9Var);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f23839a, wlbVar, "onActive", e);
            }
        }
    }

    @Override // tb.xlb, tb.wlb
    public void onAppear(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6fc56c", new Object[]{this, uq9Var});
            return;
        }
        for (wlb wlbVar : this.b.b()) {
            try {
                wlbVar.onAppear(uq9Var);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f23839a, wlbVar, h9z.EVENT_ON_APPEAR, e);
            }
        }
    }

    @Override // tb.xlb, tb.wlb
    public void onBindData(uq9 uq9Var, a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24609e2a", new Object[]{this, uq9Var, aVar, new Integer(i)});
            return;
        }
        for (wlb wlbVar : this.b.b()) {
            try {
                wlbVar.onBindData(uq9Var, aVar, i);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f23839a, wlbVar, "onBindData", e);
            }
        }
    }

    @Override // tb.xlb, tb.wlb
    public void onCreateView(uq9 uq9Var, RecyclerViewHolder recyclerViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b05e008", new Object[]{this, uq9Var, recyclerViewHolder});
            return;
        }
        for (wlb wlbVar : this.b.b()) {
            try {
                wlbVar.onCreateView(uq9Var, recyclerViewHolder);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f23839a, wlbVar, "onCreateView", e);
            }
        }
    }

    @Override // tb.xlb, tb.wlb
    public void onDisActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b58936ed", new Object[]{this, uq9Var});
            return;
        }
        for (wlb wlbVar : this.b.b()) {
            try {
                wlbVar.onDisActive(uq9Var);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f23839a, wlbVar, "onDisActive", e);
            }
        }
    }

    @Override // tb.xlb, tb.wlb
    public void onDisAppear(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9c725bc", new Object[]{this, uq9Var});
            return;
        }
        for (wlb wlbVar : this.b.b()) {
            try {
                wlbVar.onDisAppear(uq9Var);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f23839a, wlbVar, "onDisAppear", e);
            }
        }
    }

    @Override // tb.xlb, tb.wlb
    public void onRecycle(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa63ccc", new Object[]{this, uq9Var});
            return;
        }
        for (wlb wlbVar : this.b.b()) {
            try {
                wlbVar.onRecycle(uq9Var);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f23839a, wlbVar, "onRecycle", e);
            }
        }
    }

    @Override // tb.xlb, tb.wlb
    public void onWillActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f263d10f", new Object[]{this, uq9Var});
            return;
        }
        for (wlb wlbVar : this.b.b()) {
            try {
                wlbVar.onWillActive(uq9Var);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f23839a, wlbVar, "onWillActive", e);
            }
        }
    }

    @Override // tb.xlb, tb.wlb
    public void onWillDisActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9290cf3b", new Object[]{this, uq9Var});
            return;
        }
        for (wlb wlbVar : this.b.b()) {
            try {
                wlbVar.onWillDisActive(uq9Var);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f23839a, wlbVar, "onWillDisActive", e);
            }
        }
    }

    public void removeCardLifecycleListener(wlb wlbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3564859c", new Object[]{this, wlbVar});
        } else if (wlbVar != null) {
            this.b.e(wlbVar);
        }
    }

    public void addCardLifecycleListener(wlb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd4c978e", new Object[]{this, aVar});
        } else if (aVar != null) {
            this.b.a(aVar);
        }
    }

    public void removeCardLifecycleListener(wlb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6799d731", new Object[]{this, aVar});
        } else if (aVar != null) {
            this.b.e(aVar);
        }
    }

    @Override // tb.xlb, tb.wlb
    public void onBindData(uq9 uq9Var, a aVar, int i, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2231971b", new Object[]{this, uq9Var, aVar, new Integer(i), list});
            return;
        }
        for (wlb wlbVar : this.b.b()) {
            try {
                wlbVar.onBindData(uq9Var, aVar, i, list);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f23839a, wlbVar, "onBindDataPayloads", e);
            }
        }
    }
}
