package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.globalinteraction.IInteractionService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.list.render.RecyclerViewHolder;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ihf extends gr9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String g = "InteractiveLayer";
    private static final String h = "InteractiveLayer";
    private wlb e;
    private long f;

    static {
        t2o.a(468713904);
    }

    public ihf(FluidContext fluidContext, uq9 uq9Var) {
        super(fluidContext, uq9Var);
    }

    private boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff52d128", new Object[]{this})).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableFixSendPageAppearAndDisappearMessage", true);
    }

    private long Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d54caf6a", new Object[]{this})).longValue();
        }
        long nanoTime = System.nanoTime();
        long j = this.f;
        long j2 = nanoTime - j;
        if (j <= 0) {
            return 0L;
        }
        return j2;
    }

    public static /* synthetic */ Object ipc$super(ihf ihfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/base/layer/interactive/InteractiveLayer");
    }

    @Override // tb.ojc
    public String H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("17e2e1f3", new Object[]{this});
        }
        return "InteractiveLayer";
    }

    public mhf R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mhf) ipChange.ipc$dispatch("bd99a1a7", new Object[]{this});
        }
        return (mhf) this.e;
    }

    public void S(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6c7421b", new Object[]{this, new Boolean(z)});
            return;
        }
        if (R() != null) {
            R().v(z);
        }
        ((IInteractionService) this.b.getService(IInteractionService.class)).setGlobalLayerVisibility(z);
    }

    @Override // tb.gr9, tb.ojc, tb.wlb
    public void onActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f731d69d", new Object[]{this, uq9Var});
        } else {
            this.e.onActive(uq9Var);
        }
    }

    @Override // tb.gr9, tb.ojc, tb.wlb
    public void onAppear(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6fc56c", new Object[]{this, uq9Var});
        } else {
            this.e.onAppear(uq9Var);
        }
    }

    @Override // tb.gr9, tb.ojc, tb.wlb
    public void onBindData(uq9 uq9Var, a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24609e2a", new Object[]{this, uq9Var, aVar, new Integer(i)});
        } else {
            this.e.onBindData(uq9Var, aVar, i);
        }
    }

    @Override // tb.gr9, tb.ojc, tb.wlb
    public void onCreateView(uq9 uq9Var, RecyclerViewHolder recyclerViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b05e008", new Object[]{this, uq9Var, recyclerViewHolder});
        } else {
            this.e = new mhf(this.c, recyclerViewHolder);
        }
    }

    @Override // tb.gr9, tb.ojc, tb.wlb
    public void onDisActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b58936ed", new Object[]{this, uq9Var});
        } else {
            this.e.onDisActive(uq9Var);
        }
    }

    @Override // tb.gr9, tb.ojc, tb.wlb
    public void onDisAppear(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9c725bc", new Object[]{this, uq9Var});
        } else {
            this.e.onDisAppear(uq9Var);
        }
    }

    @Override // tb.gr9, tb.ojc, tb.o6d
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        ir9.b("InteractiveLayer", "onPauseMedia");
        if (P() || this.c.h0()) {
            ir9.b("InteractiveLayer", "页面disappear，卡片处于active状态且tab被选中，position: " + this.c.M());
            ((mhf) this.e).onPause();
        }
    }

    @Override // tb.gr9, tb.ojc, tb.o6d
    public void onRealStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e496e44c", new Object[]{this});
        } else {
            ((mhf) this.e).onRealStart();
        }
    }

    @Override // tb.gr9, tb.ojc, tb.o6d
    public void onRealStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274986c6", new Object[]{this});
        } else {
            ((mhf) this.e).onRealStop();
        }
    }

    @Override // tb.gr9, tb.ojc, tb.wlb
    public void onRecycle(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa63ccc", new Object[]{this, uq9Var});
        } else {
            this.e.onRecycle(uq9Var);
        }
    }

    @Override // tb.gr9, tb.ojc, tb.o6d
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        ir9.b("InteractiveLayer", "onResume");
        if (P() || this.c.h0()) {
            ir9.b("InteractiveLayer", "页面appear，卡片处于active状态且tab被选中，position: " + this.c.M());
            ((mhf) this.e).onResume();
        }
    }

    @Override // tb.gr9, tb.ojc, tb.wlb
    public void onBindData(uq9 uq9Var, a aVar, int i, List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2231971b", new Object[]{this, uq9Var, aVar, new Integer(i), list});
        } else {
            this.e.onBindData(uq9Var, aVar, i, list);
        }
    }
}
