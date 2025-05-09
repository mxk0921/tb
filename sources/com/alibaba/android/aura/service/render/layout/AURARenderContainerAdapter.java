package com.alibaba.android.aura.service.render.layout;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.util.AURATraceUtil;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutAdapter;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.ck;
import tb.cm;
import tb.cn;
import tb.dm;
import tb.fj;
import tb.gm;
import tb.jcb;
import tb.kcb;
import tb.lcb;
import tb.mcb;
import tb.rbb;
import tb.t2o;
import tb.yi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AURARenderContainerAdapter extends VirtualLayoutAdapter<AURAContainerViewHolder> implements mcb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public yi e;
    public final Handler f = new Handler(Looper.getMainLooper());
    public final List<AURARenderComponent> b = new ArrayList();
    public final gm d = new gm();
    public final boolean c = fj.d("callComponentLifeCycleAsync", true);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class AURAContainerViewHolder extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public AURARenderComponent f2136a;

        static {
            t2o.a(80740565);
        }

        public AURAContainerViewHolder(View view) {
            super(view);
        }

        public static /* synthetic */ AURARenderComponent b0(AURAContainerViewHolder aURAContainerViewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AURARenderComponent) ipChange.ipc$dispatch("c3bd5972", new Object[]{aURAContainerViewHolder});
            }
            return aURAContainerViewHolder.f2136a;
        }

        public static /* synthetic */ AURARenderComponent c0(AURAContainerViewHolder aURAContainerViewHolder, AURARenderComponent aURARenderComponent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AURARenderComponent) ipChange.ipc$dispatch("84cc6781", new Object[]{aURAContainerViewHolder, aURARenderComponent});
            }
            aURAContainerViewHolder.f2136a = aURARenderComponent;
            return aURARenderComponent;
        }

        public static /* synthetic */ Object ipc$super(AURAContainerViewHolder aURAContainerViewHolder, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/render/layout/AURARenderContainerAdapter$AURAContainerViewHolder");
        }

        public AURARenderComponent d0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AURARenderComponent) ipChange.ipc$dispatch("75577e39", new Object[]{this});
            }
            return this.f2136a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                AURARenderContainerAdapter.this.notifyDataSetChanged();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AURAContainerViewHolder f2138a;

        public b(AURAContainerViewHolder aURAContainerViewHolder) {
            this.f2138a = aURAContainerViewHolder;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                AURARenderContainerAdapter.O(AURARenderContainerAdapter.this, this.f2138a, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AURAContainerViewHolder f2139a;

        public c(AURAContainerViewHolder aURAContainerViewHolder) {
            this.f2139a = aURAContainerViewHolder;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                AURARenderContainerAdapter.O(AURARenderContainerAdapter.this, this.f2139a, false);
            }
        }
    }

    static {
        t2o.a(80740561);
        t2o.a(80740569);
    }

    public AURARenderContainerAdapter(VirtualLayoutManager virtualLayoutManager) {
        super(virtualLayoutManager);
    }

    public static /* synthetic */ void O(AURARenderContainerAdapter aURARenderContainerAdapter, AURAContainerViewHolder aURAContainerViewHolder, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("735f5847", new Object[]{aURARenderContainerAdapter, aURAContainerViewHolder, new Boolean(z)});
        } else {
            aURARenderContainerAdapter.U(aURAContainerViewHolder, z);
        }
    }

    public static /* synthetic */ Object ipc$super(AURARenderContainerAdapter aURARenderContainerAdapter, String str, Object... objArr) {
        if (str.hashCode() == 1156665041) {
            super.onDetachedFromRecyclerView((RecyclerView) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/render/layout/AURARenderContainerAdapter");
    }

    public final void P(AURARenderComponentContainer aURARenderComponentContainer, ViewGroup viewGroup, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c52be7df", new Object[]{this, aURARenderComponentContainer, viewGroup, view, new Integer(i)});
            return;
        }
        AURATraceUtil.a(4, "afterItemViewCreated");
        for (lcb lcbVar : this.e.f(lcb.class)) {
            lcbVar.l0(aURARenderComponentContainer, viewGroup, view, i);
        }
        AURATraceUtil.b(4);
    }

    public final void Q(AURARenderComponent aURARenderComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("359fa8fc", new Object[]{this, aURARenderComponent, view, new Integer(i)});
            return;
        }
        AURATraceUtil.a(4, "afterItemViewRendered");
        for (lcb lcbVar : this.e.f(lcb.class)) {
            lcbVar.u(aURARenderComponent, view, i);
        }
        AURATraceUtil.b(4);
    }

    public final View S(AURARenderComponentContainer aURARenderComponentContainer, ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("159ea598", new Object[]{this, aURARenderComponentContainer, viewGroup, new Integer(i)});
        }
        AURATraceUtil.a(4, "beforeItemViewCreate");
        View view = null;
        for (lcb lcbVar : this.e.f(lcb.class)) {
            View C0 = lcbVar.C0(aURARenderComponentContainer, viewGroup, i);
            if (view == null) {
                view = C0;
            }
        }
        AURATraceUtil.b(4);
        return view;
    }

    public final boolean T(AURARenderComponent aURARenderComponent, View view, int i) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90bcce3c", new Object[]{this, aURARenderComponent, view, new Integer(i)})).booleanValue();
        }
        AURATraceUtil.a(4, "beforeItemViewRender");
        for (lcb lcbVar : this.e.f(lcb.class)) {
            if (lcbVar.c0(aURARenderComponent, view, i)) {
                z = true;
            }
        }
        AURATraceUtil.b(4);
        return z;
    }

    public final void U(AURAContainerViewHolder aURAContainerViewHolder, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfb8a780", new Object[]{this, aURAContainerViewHolder, new Boolean(z)});
            return;
        }
        AURARenderComponent b0 = AURAContainerViewHolder.b0(aURAContainerViewHolder);
        if (b0 != null) {
            int indexOf = ((ArrayList) this.b).indexOf(b0);
            List<kcb> f = this.e.f(kcb.class);
            if (!f.isEmpty()) {
                AURATraceUtil.a(4, "componentLifeCycle");
                for (kcb kcbVar : f) {
                    if (z) {
                        kcbVar.E(aURAContainerViewHolder, indexOf, b0);
                    } else {
                        kcbVar.N(aURAContainerViewHolder, indexOf, b0);
                    }
                }
                AURATraceUtil.b(4);
            }
        }
    }

    public final AURARenderComponent V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("217d0e01", new Object[]{this});
        }
        AURARenderComponent aURARenderComponent = new AURARenderComponent();
        aURARenderComponent.data = new AURARenderComponentData(null, null, null, null, new AURARenderComponentContainer(dm.d, cm.f17147a, null, null, null, ""), null, null, null);
        return aURARenderComponent;
    }

    /* renamed from: X */
    public AURAContainerViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAContainerViewHolder) ipChange.ipc$dispatch("c9ebafff", new Object[]{this, viewGroup, new Integer(i)});
        }
        jcb e = this.d.e(i);
        if (e == null) {
            e = this.d.h();
            ck.g().b("AURARenderContainerAdapter", "onCreateViewHolder", "cannot find componentCreator, use default, viewType=" + i);
        }
        AURARenderComponentContainer g = this.d.g(i);
        if (g == null) {
            rbb g2 = ck.g();
            g2.b("AURARenderContainerAdapter", "onCreateViewHolder", "containerInfo is null, viewType=" + i);
            view = null;
        } else {
            view = S(g, viewGroup, i);
        }
        if (view == null) {
            view = e.f(viewGroup, g);
        }
        if (g != null) {
            P(g, viewGroup, view, i);
        }
        return new AURAContainerViewHolder(view);
    }

    /* renamed from: Y */
    public void onViewAttachedToWindow(AURAContainerViewHolder aURAContainerViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("814cc84", new Object[]{this, aURAContainerViewHolder});
        } else if (this.c) {
            cn.c(new b(aURAContainerViewHolder));
        } else {
            U(aURAContainerViewHolder, true);
        }
    }

    /* renamed from: Z */
    public void onViewDetachedFromWindow(AURAContainerViewHolder aURAContainerViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77c6eda7", new Object[]{this, aURAContainerViewHolder});
        } else if (this.c) {
            cn.c(new c(aURAContainerViewHolder));
        } else {
            U(aURAContainerViewHolder, false);
        }
    }

    @Override // tb.mcb
    public AURARenderComponent a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("30a4d5a7", new Object[]{this, new Integer(i)});
        }
        if (i < 0 || i >= ((ArrayList) this.b).size()) {
            return null;
        }
        return (AURARenderComponent) ((ArrayList) this.b).get(i);
    }

    public void a0(yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6662bae", new Object[]{this, yiVar});
            return;
        }
        this.e = yiVar;
        this.d.m(yiVar);
    }

    @Override // tb.mcb
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return ((ArrayList) this.b).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        AURARenderComponentData aURARenderComponentData;
        AURARenderComponentContainer aURARenderComponentContainer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        int i2 = this.d.i(i, Integer.MIN_VALUE);
        AURARenderComponent a2 = a(i);
        if (i2 < 0) {
            rbb g = ck.g();
            g.b("AURARenderContainerAdapter", "getItemViewType", "find type error, position=" + i + ",viewType=" + i2 + ",data=" + a2);
        }
        if (a2 == null || (aURARenderComponentData = a2.data) == null || (aURARenderComponentContainer = aURARenderComponentData.container) == null || !aURARenderComponentContainer.isPreset) {
            return i2;
        }
        return -i2;
    }

    @Override // tb.mcb
    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa69bd32", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            setData(new ArrayList(this.b));
        }
        this.f.post(new a());
    }

    @Override // tb.mcb
    public List<AURARenderComponent> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5b95150b", new Object[]{this});
        }
        return new ArrayList(this.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44f14ed1", new Object[]{this, recyclerView});
            return;
        }
        super.onDetachedFromRecyclerView(recyclerView);
        destroy();
    }

    public void setData(List<AURARenderComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ddf4a4", new Object[]{this, list});
            return;
        }
        this.d.o(list);
        ((ArrayList) this.b).clear();
        if (list != null) {
            ((ArrayList) this.b).addAll(list);
        }
    }

    /* renamed from: W */
    public void onBindViewHolder(AURAContainerViewHolder aURAContainerViewHolder, int i) {
        AURARenderComponent aURARenderComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ac0c39", new Object[]{this, aURAContainerViewHolder, new Integer(i)});
            return;
        }
        jcb d = this.d.d(i);
        if (d != null) {
            if (i < 0 || i >= ((ArrayList) this.b).size()) {
                aURARenderComponent = V();
            } else {
                aURARenderComponent = (AURARenderComponent) ((ArrayList) this.b).get(i);
            }
            if (fj.d("enableGoneInvisibleViewV2", true)) {
                if (aURARenderComponent.isInvisible()) {
                    aURAContainerViewHolder.itemView.setVisibility(8);
                    View view = aURAContainerViewHolder.itemView;
                    int i2 = R.id.view_holder_origin_height;
                    if (view.getTag(i2) == null) {
                        if (aURAContainerViewHolder.itemView.getLayoutParams() != null) {
                            View view2 = aURAContainerViewHolder.itemView;
                            view2.setTag(i2, Integer.valueOf(view2.getLayoutParams().height));
                        } else {
                            aURAContainerViewHolder.itemView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                            aURAContainerViewHolder.itemView.setTag(i2, -2);
                        }
                    }
                    aURAContainerViewHolder.itemView.getLayoutParams().height = 0;
                    return;
                }
                aURAContainerViewHolder.itemView.setVisibility(0);
                Object tag = aURAContainerViewHolder.itemView.getTag(R.id.view_holder_origin_height);
                if (aURAContainerViewHolder.itemView.getLayoutParams() != null && (tag instanceof Integer)) {
                    aURAContainerViewHolder.itemView.getLayoutParams().height = ((Integer) tag).intValue();
                }
            }
            AURATraceUtil.a(4, "onBindViewHolder:" + aURARenderComponent.key);
            boolean T = T(aURARenderComponent, aURAContainerViewHolder.itemView, i);
            AURAContainerViewHolder.c0(aURAContainerViewHolder, aURARenderComponent);
            if (!T) {
                d.g(aURARenderComponent, aURAContainerViewHolder.itemView, i);
            }
            Q(aURARenderComponent, aURAContainerViewHolder.itemView, i);
            AURATraceUtil.b(4);
        }
    }
}
