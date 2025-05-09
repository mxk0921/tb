package com.taobao.android.dinamicx.widget.recycler;

import android.content.Context;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.recycler.RecyclerAdapter;
import com.taobao.weex.ui.component.WXBasicComponentType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.bi6;
import tb.eb5;
import tb.h36;
import tb.ic5;
import tb.s96;
import tb.t2o;
import tb.tc5;
import tb.vc5;
import tb.vy8;
import tb.xt5;
import tb.xv5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class PrefetchRecyclerAdapter extends RecyclerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int DEFAULT_BATCH_SIZE = Runtime.getRuntime().availableProcessors();
    public int E = DEFAULT_BATCH_SIZE;
    public final Map<Integer, b> F = new LinkedHashMap();
    public int G = 0;
    public int H = 0;
    public boolean I = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements tc5<DXRuntimeContext> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f7464a;

        public a(b bVar) {
            this.f7464a = bVar;
        }

        @Override // tb.tc5
        public void a(DXRuntimeContext dXRuntimeContext, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6de1e0b", new Object[]{this, dXRuntimeContext, th});
            } else {
                PrefetchRecyclerAdapter.this.H0(this.f7464a, true, dXRuntimeContext);
            }
        }

        /* renamed from: c */
        public void b(DXRuntimeContext dXRuntimeContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f6f9e26", new Object[]{this, dXRuntimeContext});
            } else {
                PrefetchRecyclerAdapter.this.H0(this.f7464a, false, dXRuntimeContext);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f7465a;
        public boolean b;
        public boolean c;
        public final DXWidgetNode d;

        static {
            t2o.a(444597521);
        }

        public b(int i, DXWidgetNode dXWidgetNode, DXRuntimeContext dXRuntimeContext, int i2, int i3) {
            this.f7465a = i;
            this.d = dXWidgetNode;
        }
    }

    static {
        t2o.a(444597518);
    }

    public PrefetchRecyclerAdapter(Context context, boolean z, boolean z2) {
        super(context, z, z2);
    }

    public static /* synthetic */ int A0(PrefetchRecyclerAdapter prefetchRecyclerAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed06db7b", new Object[]{prefetchRecyclerAdapter})).intValue();
        }
        return prefetchRecyclerAdapter.G;
    }

    public static /* synthetic */ int B0(PrefetchRecyclerAdapter prefetchRecyclerAdapter, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1b315df0", new Object[]{prefetchRecyclerAdapter, new Integer(i)})).intValue();
        }
        prefetchRecyclerAdapter.G = i;
        return i;
    }

    public static /* synthetic */ void C0(PrefetchRecyclerAdapter prefetchRecyclerAdapter, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b49a516e", new Object[]{prefetchRecyclerAdapter, th});
        } else {
            prefetchRecyclerAdapter.S0(th);
        }
    }

    public static /* synthetic */ Object ipc$super(PrefetchRecyclerAdapter prefetchRecyclerAdapter, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2097393924:
                super.setDataSource((ArrayList) objArr[0]);
                return null;
            case 453399741:
                prefetchRecyclerAdapter.g0((RecyclerView.ViewHolder) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 640885924:
                super.S();
                return null;
            case 1032960361:
                super.m0((xt5) objArr[0]);
                return null;
            case 1918916234:
                super.f0(((Number) objArr[0]).intValue(), (DXWidgetNode) objArr[1], (vy8) objArr[2], (String) objArr[3], (RecyclerAdapter.ItemViewHolder) objArr[4]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/recycler/PrefetchRecyclerAdapter");
        }
    }

    public static /* synthetic */ boolean z0(PrefetchRecyclerAdapter prefetchRecyclerAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aaefae2d", new Object[]{prefetchRecyclerAdapter})).booleanValue();
        }
        return prefetchRecyclerAdapter.N0();
    }

    public void D0(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce13909b", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        for (int i3 = i; i3 < i + i2; i3++) {
            try {
                E0(i3, true);
            } catch (Throwable th) {
                S0(th);
                return;
            }
        }
    }

    public void E0(int i, boolean z) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce13d06c", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        try {
            if (z) {
                obj = this.F.remove(Integer.valueOf(i));
            } else {
                obj = ((LinkedHashMap) this.F).get(Integer.valueOf(i));
            }
            F0((b) obj);
        } catch (Throwable th) {
            S0(th);
        }
    }

    public void F0(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dd144db", new Object[]{this, bVar});
        } else if (bVar != null) {
            bVar.c = true;
            if (!bVar.b) {
                DXRuntimeContext dXRuntimeContext = bVar.d.getDXRuntimeContext();
                vc5 A = dXRuntimeContext.s().f().A();
                if (A != null) {
                    A.n(dXRuntimeContext);
                }
            }
        }
    }

    public int[] G0(DXWidgetNode dXWidgetNode) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("6c14ffde", new Object[]{this, dXWidgetNode});
        }
        if (dXWidgetNode instanceof bi6) {
            z = ((bi6) dXWidgetNode).J();
        } else {
            z = false;
        }
        DXRecyclerLayout dXRecyclerLayout = this.k;
        if (dXRecyclerLayout == null) {
            return null;
        }
        int measuredWidth = dXRecyclerLayout.getMeasuredWidth();
        if (!z) {
            measuredWidth = (((measuredWidth - ((this.k.X() - 1) * this.k.Y())) - this.k.f0()) - this.k.k0()) / this.k.X();
        } else if (this.k.x0()) {
            measuredWidth = (measuredWidth - this.k.f0()) - this.k.k0();
        }
        return new int[]{DXWidgetNode.DXMeasureSpec.c(measuredWidth, 1073741824), DXWidgetNode.DXMeasureSpec.c(8388607, 0)};
    }

    public void H0(b bVar, boolean z, DXRuntimeContext dXRuntimeContext) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17d39627", new Object[]{this, bVar, new Boolean(z), dXRuntimeContext});
            return;
        }
        if (eb5.B()) {
            Log.e("RecyclerPrefetch", bVar.f7465a + " 主线程回调回来: " + dXRuntimeContext.e());
        }
        try {
            bVar.b = true;
            this.F.remove(Integer.valueOf(bVar.f7465a));
            if (bVar.c) {
                if (eb5.B()) {
                    Log.e("RecyclerPrefetch", bVar.f7465a + " 主线程已渲染，跳过: " + dXRuntimeContext.e());
                }
            } else if (dXRuntimeContext != null && (i = bVar.f7465a) >= 0 && i < V()) {
                DXWidgetNode item = getItem(bVar.f7465a);
                if (!(dXRuntimeContext.W() == null || item == null)) {
                    dXRuntimeContext.W().setParentWidget(item.getParentWidget());
                    if (eb5.B() && dXRuntimeContext.W() != null) {
                        Log.e("RecyclerPrefetch", item.hashCode() + "  替换 index: " + dXRuntimeContext.W().hashCode());
                    }
                    n0(bVar.f7465a, dXRuntimeContext.W());
                }
            }
        } catch (Throwable th) {
            S0(th);
        }
    }

    public void I0(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbfbf8fe", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        try {
            if (V() > 0) {
                int max = Math.max(0, Math.min(V(), i2));
                for (int max2 = Math.max(0, i); max2 < max; max2++) {
                    b bVar = (b) ((LinkedHashMap) this.F).get(Integer.valueOf(max2));
                    if (bVar != null) {
                        E0(max2, true);
                        if (bVar.d == getItem(max2)) {
                        }
                    }
                    DXWidgetNode item = getItem(max2);
                    if (item != null) {
                        if (!item.getStatInPrivateFlags(32)) {
                            DXRuntimeContext cloneDxRuntimeContextResetError = cloneDxRuntimeContextResetError(item);
                            DinamicXEngine f = cloneDxRuntimeContextResetError.s().f();
                            int[] G0 = G0(item);
                            if (G0 == null) {
                                R0();
                                return;
                            }
                            item.setLayoutWidth(-1);
                            item.setLayoutHeight(-2);
                            DXRenderOptions q = new DXRenderOptions.b().A(1).s(2).B(4).G(G0[0]).x(this.I).t(G0[1]).q();
                            if (!(item instanceof s96)) {
                                b bVar2 = new b(max2, item, cloneDxRuntimeContextResetError, G0[0], G0[1]);
                                this.F.put(Integer.valueOf(max2), bVar2);
                                f.F0(cloneDxRuntimeContextResetError, q, null, new a(bVar2));
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            S0(th);
        }
    }

    public void J0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1653e23e", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.G - this.E;
        if (eb5.B()) {
            Log.e("RecyclerPrefetch", "preLoadNextBatch " + i);
        }
        if (i2 == i) {
            int i3 = this.G;
            int min = Math.min(this.E + i3, V());
            if (min > i3) {
                this.G += this.E;
                this.G = Math.min(V(), this.G);
                if (eb5.B()) {
                    Log.e("RecyclerPrefetch", i + "开始预加载下一批: " + i3 + "-" + min + "/ nextBatchStart: " + this.G);
                }
                I0(i3, min);
            } else if (eb5.B()) {
                Log.e("RecyclerPrefetch", i + "加载不了下一批emm: " + i3 + "-" + min + "/ nextBatchStart: " + this.G);
            }
        }
    }

    public void L0() {
        int min;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8616b37", new Object[]{this});
        } else if (N0()) {
            M0();
        } else {
            R0();
            this.G = this.E;
            if (V() > 0 && (min = Math.min(this.E, V())) > 1) {
                I0(1, min);
            }
        }
    }

    public void M0() {
        int max;
        int max2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe75b127", new Object[]{this});
            return;
        }
        R0();
        this.G = Math.max(V() - 1, 0);
        if (V() > 0 && (max2 = Math.max(0, V() - this.E)) < (max = Math.max(V() - 1, 0))) {
            I0(max, max2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.recycler.RecyclerAdapter, com.taobao.android.dinamicx.widget.recycler.BaseStickyAdapter
    public void N(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd798fba", new Object[]{this, viewHolder, new Integer(i)});
        } else {
            g0(viewHolder, i);
        }
    }

    public final boolean N0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc98265b", new Object[]{this})).booleanValue();
        }
        if (this.H == 1) {
            return true;
        }
        return false;
    }

    public void O0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e1976e3", new Object[]{this, new Integer(i)});
            return;
        }
        if (i <= 0) {
            i = DEFAULT_BATCH_SIZE;
        }
        this.E = i;
    }

    public void P0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5d50d28", new Object[]{this, new Boolean(z)});
        } else {
            this.I = z;
        }
    }

    public void Q0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a08dbe9", new Object[]{this, new Integer(i)});
        } else {
            this.H = i;
        }
    }

    public void R0() {
        vc5 A;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("230211c2", new Object[]{this});
            return;
        }
        for (Integer num : ((LinkedHashMap) this.F).keySet()) {
            E0(num.intValue(), false);
        }
        ((LinkedHashMap) this.F).clear();
        DXRecyclerLayout dXRecyclerLayout = this.k;
        if (!(dXRecyclerLayout == null || (A = dXRecyclerLayout.getDXRuntimeContext().s().f().A()) == null)) {
            A.J();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.recycler.BaseStickyAdapter
    public void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("263324a4", new Object[]{this});
            return;
        }
        super.S();
        registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: com.taobao.android.dinamicx.widget.recycler.PrefetchRecyclerAdapter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/recycler/PrefetchRecyclerAdapter$1");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeChanged(int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("70303dd0", new Object[]{this, new Integer(i), new Integer(i2)});
                } else {
                    PrefetchRecyclerAdapter.this.D0(i, i2);
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeInserted(int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8e983dea", new Object[]{this, new Integer(i), new Integer(i2)});
                    return;
                }
                try {
                    if (PrefetchRecyclerAdapter.z0(PrefetchRecyclerAdapter.this)) {
                        PrefetchRecyclerAdapter prefetchRecyclerAdapter = PrefetchRecyclerAdapter.this;
                        PrefetchRecyclerAdapter.B0(prefetchRecyclerAdapter, PrefetchRecyclerAdapter.A0(prefetchRecyclerAdapter) + i2);
                        h36.g("RecyclerPrefetch", "更新 nextBatchStart" + PrefetchRecyclerAdapter.A0(PrefetchRecyclerAdapter.this));
                    } else if (PrefetchRecyclerAdapter.this.V() - i2 == i) {
                        int A0 = PrefetchRecyclerAdapter.A0(PrefetchRecyclerAdapter.this);
                        int A02 = PrefetchRecyclerAdapter.A0(PrefetchRecyclerAdapter.this);
                        PrefetchRecyclerAdapter prefetchRecyclerAdapter2 = PrefetchRecyclerAdapter.this;
                        int min = Math.min(A02 + prefetchRecyclerAdapter2.E, prefetchRecyclerAdapter2.V());
                        if (min > A0) {
                            PrefetchRecyclerAdapter prefetchRecyclerAdapter3 = PrefetchRecyclerAdapter.this;
                            PrefetchRecyclerAdapter.B0(prefetchRecyclerAdapter3, PrefetchRecyclerAdapter.A0(prefetchRecyclerAdapter3) + PrefetchRecyclerAdapter.this.E);
                            PrefetchRecyclerAdapter prefetchRecyclerAdapter4 = PrefetchRecyclerAdapter.this;
                            PrefetchRecyclerAdapter.B0(prefetchRecyclerAdapter4, Math.min(prefetchRecyclerAdapter4.V(), PrefetchRecyclerAdapter.A0(PrefetchRecyclerAdapter.this)));
                            PrefetchRecyclerAdapter.this.I0(A0, min);
                        }
                    }
                } catch (Throwable th) {
                    PrefetchRecyclerAdapter.C0(PrefetchRecyclerAdapter.this, th);
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeRemoved(int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f1cd027c", new Object[]{this, new Integer(i), new Integer(i2)});
                    return;
                }
                PrefetchRecyclerAdapter.this.D0(i, i2);
                if (i <= PrefetchRecyclerAdapter.A0(PrefetchRecyclerAdapter.this)) {
                    PrefetchRecyclerAdapter prefetchRecyclerAdapter = PrefetchRecyclerAdapter.this;
                    PrefetchRecyclerAdapter.B0(prefetchRecyclerAdapter, Math.max(0, Math.min(PrefetchRecyclerAdapter.A0(prefetchRecyclerAdapter) - i, i2)));
                }
            }
        });
    }

    public final void S0(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54fefdf5", new Object[]{this, th});
            return;
        }
        xv5.b(th);
        f fVar = new f(WXBasicComponentType.RECYCLER);
        f.a aVar = new f.a("Engine", "Engine_Render", f.DX_RECYCLER_PREFETCH_CRASH);
        aVar.e = xv5.a(th);
        fVar.c.add(aVar);
        ic5.p(fVar);
    }

    @Override // com.taobao.android.dinamicx.widget.recycler.RecyclerAdapter
    public void f0(int i, DXWidgetNode dXWidgetNode, vy8 vy8Var, String str, RecyclerAdapter.ItemViewHolder itemViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7260568a", new Object[]{this, new Integer(i), dXWidgetNode, vy8Var, str, itemViewHolder});
            return;
        }
        super.f0(i, dXWidgetNode, vy8Var, str, itemViewHolder);
        if (N0()) {
            K0(i);
        } else {
            J0(i);
        }
        E0(i, true);
    }

    @Override // com.taobao.android.dinamicx.widget.recycler.RecyclerAdapter
    public void m0(xt5 xt5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d91b969", new Object[]{this, xt5Var});
            return;
        }
        super.m0(xt5Var);
        L0();
    }

    public void K0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8aca84e", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.G;
        DinamicXEngine.j0();
        if (i2 == i) {
            int i3 = this.G;
            int max = Math.max(i3 - this.E, 0);
            if (max < i3) {
                int i4 = this.G - this.E;
                this.G = i4;
                this.G = Math.max(0, i4);
                if (eb5.B()) {
                    Log.e("RecyclerPrefetch", i + "preLoadNextBatchReverser 开始预加载下一批: " + i3 + "-" + max + "/ nextBatchStart: " + this.G);
                }
                I0(max, i3);
            } else if (eb5.B()) {
                Log.e("RecyclerPrefetch", i + "preLoadNextBatchReverser 加载不了下一批emm: " + i3 + "-" + max + "/ nextBatchStart: " + this.G);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.recycler.RecyclerAdapter
    public void setDataSource(ArrayList<DXWidgetNode> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82fc4efc", new Object[]{this, arrayList});
            return;
        }
        try {
            super.setDataSource(arrayList);
            L0();
            if (arrayList != null && eb5.B()) {
                h36.g("RecyclerPrefetch", "调用 setDataSource reloadPrefetch " + arrayList.size() + "  nextBatchStart " + this.G);
            }
            if (arrayList != null && arrayList.size() > 0) {
                if (N0()) {
                    K0(Math.max(V() - 1, 0));
                } else {
                    J0(0);
                }
            }
        } catch (Throwable th) {
            S0(th);
        }
    }
}
