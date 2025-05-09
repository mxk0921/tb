package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.list.render.RecyclerViewHolder;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class gr9 implements ojc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String d = "FluidLayer";

    /* renamed from: a  reason: collision with root package name */
    private final ILifecycleService f20177a;
    public final FluidContext b;
    public final uq9 c;

    static {
        t2o.a(468713901);
        t2o.a(468713902);
    }

    public gr9(FluidContext fluidContext, uq9 uq9Var) {
        this.b = fluidContext;
        this.c = uq9Var;
        uq9Var.N().addCardLifecycleListener(this);
        uq9Var.O().b(this);
        this.f20177a = (ILifecycleService) fluidContext.getService(ILifecycleService.class);
        N();
    }

    private String M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f8a94ab", new Object[]{this});
        }
        return H() + "@" + q();
    }

    private void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da50f0e2", new Object[]{this});
        } else {
            this.f20177a.addPageLifecycleListener(this);
        }
    }

    private void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2e634e9", new Object[]{this});
        } else {
            this.f20177a.removePageLifecycleListener(this);
        }
    }

    @Override // tb.ojc, tb.d0c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b73f2e", new Object[]{this});
            return;
        }
        ir9.b(d, M() + " 执行 onLongClickCancel 回调方法");
    }

    @Override // tb.ojc, tb.d0c
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bcd6a37", new Object[]{this});
            return;
        }
        ir9.b(d, M() + " 执行 onPendingClick 回调方法");
    }

    @Override // tb.ojc, tb.d0c
    public boolean e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f358e04", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        ir9.b(d, M() + " 执行 onLongClick 回调方法");
        return false;
    }

    @Override // tb.ojc, tb.d0c
    public void f(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f84119f", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        ir9.b(d, M() + " 执行 onDoubleClick 回调方法");
    }

    @Override // tb.ojc, tb.d0c
    public void g(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52af96f2", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        ir9.b(d, M() + " 执行 onTripleClick 回调方法");
    }

    @Override // tb.ojc, tb.d0c
    public void h(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e461e8c8", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        ir9.b(d, M() + " 执行 onSingleClick 回调方法");
    }

    @Override // tb.ojc, tb.wlb
    public void onActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f731d69d", new Object[]{this, uq9Var});
            return;
        }
        ir9.b(d, M() + " 执行 onActive 回调方法");
    }

    @Override // tb.ojc, tb.wlb
    public void onAppear(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6fc56c", new Object[]{this, uq9Var});
            return;
        }
        ir9.b(d, M() + " 执行 onAppear 回调方法");
    }

    @Override // tb.ojc, tb.wlb
    public void onBindData(uq9 uq9Var, a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24609e2a", new Object[]{this, uq9Var, aVar, new Integer(i)});
            return;
        }
        ir9.b(d, M() + " 执行 onBindData 回调方法");
    }

    @Override // tb.ojc, tb.o6d
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        ir9.b(d, M() + " 执行 onCreate 回调方法");
    }

    @Override // tb.ojc, tb.wlb
    public void onCreateView(uq9 uq9Var, RecyclerViewHolder recyclerViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b05e008", new Object[]{this, uq9Var, recyclerViewHolder});
            return;
        }
        ir9.b(d, M() + " 执行 onCreateView 回调方法");
    }

    @Override // tb.ojc, tb.o6d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        ir9.b(d, M() + " 执行 onDestroy 回调方法");
    }

    @Override // tb.ojc, tb.wlb
    public void onDisActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b58936ed", new Object[]{this, uq9Var});
            return;
        }
        ir9.b(d, M() + " 执行 onDisActive 回调方法");
    }

    @Override // tb.ojc, tb.wlb
    public void onDisAppear(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9c725bc", new Object[]{this, uq9Var});
            return;
        }
        ir9.b(d, M() + " 执行 onDisAppear 回调方法");
    }

    @Override // tb.ojc, tb.o6d
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        ir9.b(d, M() + " 执行 onPause 回调方法");
    }

    @Override // tb.ojc, tb.o6d
    public void onRealStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e496e44c", new Object[]{this});
            return;
        }
        ir9.b(d, M() + " 执行 onRealStart 回调方法");
    }

    @Override // tb.ojc, tb.o6d
    public void onRealStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274986c6", new Object[]{this});
            return;
        }
        ir9.b(d, M() + " 执行 onRealStop 回调方法");
    }

    @Override // tb.ojc, tb.wlb
    public void onRecycle(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa63ccc", new Object[]{this, uq9Var});
            return;
        }
        ir9.b(d, M() + " 执行 onRecyclePlayer 回调方法");
    }

    @Override // tb.ojc, tb.o6d
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        ir9.b(d, M() + " 执行 onResume 回调方法");
    }

    @Override // tb.ojc, tb.o6d
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        ir9.b(d, M() + " 执行 onStart 回调方法");
    }

    @Override // tb.ojc, tb.o6d
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        ir9.b(d, M() + " 执行 onStop 回调方法");
    }

    @Override // tb.ojc, tb.wlb
    public void onWillActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f263d10f", new Object[]{this, uq9Var});
            return;
        }
        ir9.b(d, M() + " 执行 onWillActive 回调方法");
    }

    @Override // tb.ojc, tb.wlb
    public void onWillDisActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9290cf3b", new Object[]{this, uq9Var});
            return;
        }
        ir9.b(d, M() + " 执行 onWillDisActive 回调方法");
    }

    @Override // tb.ojc
    public int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b039390", new Object[]{this})).intValue();
        }
        return hashCode();
    }

    @Override // tb.ojc, tb.wlb
    public void onBindData(uq9 uq9Var, a aVar, int i, List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2231971b", new Object[]{this, uq9Var, aVar, new Integer(i), list});
            return;
        }
        ir9.b(d, M() + " 执行 onBindData 回调方法");
    }
}
