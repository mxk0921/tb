package com.alibaba.android.umf.node.service.render.layout;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutAdapter;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.b4e;
import tb.cm;
import tb.d4e;
import tb.dm;
import tb.dxu;
import tb.e4e;
import tb.gxu;
import tb.oxu;
import tb.t2o;
import tb.th;
import tb.w60;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UMFRenderContainerAdapter extends VirtualLayoutAdapter<UMFContainerViewHolder> implements e4e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<AURARenderComponent> b;
    public final oxu c = new oxu();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class UMFContainerViewHolder extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public AURARenderComponent f2407a;

        static {
            t2o.a(80740770);
        }

        public UMFContainerViewHolder(View view) {
            super(view);
        }

        public static /* synthetic */ AURARenderComponent b0(UMFContainerViewHolder uMFContainerViewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AURARenderComponent) ipChange.ipc$dispatch("fb19b2ae", new Object[]{uMFContainerViewHolder});
            }
            return uMFContainerViewHolder.f2407a;
        }

        public static /* synthetic */ AURARenderComponent c0(UMFContainerViewHolder uMFContainerViewHolder, AURARenderComponent aURARenderComponent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AURARenderComponent) ipChange.ipc$dispatch("73c41e45", new Object[]{uMFContainerViewHolder, aURARenderComponent});
            }
            uMFContainerViewHolder.f2407a = aURARenderComponent;
            return aURARenderComponent;
        }

        public static /* synthetic */ Object ipc$super(UMFContainerViewHolder uMFContainerViewHolder, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/node/service/render/layout/UMFRenderContainerAdapter$UMFContainerViewHolder");
        }
    }

    static {
        t2o.a(80740769);
        t2o.a(80740732);
    }

    public UMFRenderContainerAdapter(VirtualLayoutManager virtualLayoutManager) {
        super(virtualLayoutManager);
    }

    public static /* synthetic */ Object ipc$super(UMFRenderContainerAdapter uMFRenderContainerAdapter, String str, Object... objArr) {
        if (str.hashCode() == 143764512) {
            super.onViewRecycled((RecyclerView.ViewHolder) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/node/service/render/layout/UMFRenderContainerAdapter");
    }

    public final void O(AURARenderComponent aURARenderComponent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aabac9f", new Object[]{this, aURARenderComponent, view});
        } else if (th.c() && w60.f30480a) {
            view.setImportantForAccessibility(1);
            view.setContentDescription(aURARenderComponent.key);
        }
    }

    public final AURARenderComponent P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("217d0e01", new Object[]{this});
        }
        AURARenderComponent aURARenderComponent = new AURARenderComponent();
        aURARenderComponent.data = new AURARenderComponentData(null, null, null, null, new AURARenderComponentContainer(dm.d, cm.f17147a, null, null, null, ""), null, null, null);
        return aURARenderComponent;
    }

    /* renamed from: Q */
    public void onBindViewHolder(UMFContainerViewHolder uMFContainerViewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c96c63d", new Object[]{this, uMFContainerViewHolder, new Integer(i)});
            return;
        }
        d4e d = this.c.d(i);
        if (d != null) {
            List<AURARenderComponent> list = this.b;
            if (list == null || i < 0 || i >= ((ArrayList) list).size()) {
                UMFContainerViewHolder.c0(uMFContainerViewHolder, P());
            } else {
                UMFContainerViewHolder.c0(uMFContainerViewHolder, (AURARenderComponent) ((ArrayList) this.b).get(i));
            }
            O(UMFContainerViewHolder.b0(uMFContainerViewHolder), uMFContainerViewHolder.itemView);
            d.g(UMFContainerViewHolder.b0(uMFContainerViewHolder), uMFContainerViewHolder.itemView, i);
        }
    }

    /* renamed from: S */
    public UMFContainerViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UMFContainerViewHolder) ipChange.ipc$dispatch("dd0e5bfb", new Object[]{this, viewGroup, new Integer(i)});
        }
        d4e e = this.c.e(i);
        if (e == null) {
            e = this.c.l();
            String str = "onCreateViewHolder#cannot find componentCreator, use default, viewType=" + i;
            dxu.a().e("UMFRenderContainerAdapter", str);
            gxu.a("UMFFramework", "TAG_RENDER_ADAPTER_ERROR", "UMF_RENDER_ADAPTER", str);
        }
        AURARenderComponentContainer g = this.c.g(i);
        if (g == null) {
            dxu.a().e("UMFRenderContainerAdapter", "onCreateViewHolder#containerInfo is null, viewType=" + i);
        }
        return new UMFContainerViewHolder(e.f(viewGroup, g));
    }

    /* renamed from: T */
    public void onViewRecycled(UMFContainerViewHolder uMFContainerViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7b1119e", new Object[]{this, uMFContainerViewHolder});
            return;
        }
        super.onViewRecycled(uMFContainerViewHolder);
        d4e d = this.c.d(uMFContainerViewHolder.getAdapterPosition());
        if (d != null) {
            d.b(uMFContainerViewHolder.itemView);
        }
    }

    public void U(d4e d4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65cf78f1", new Object[]{this, d4eVar});
        } else {
            this.c.k(d4eVar);
        }
    }

    @Override // tb.e4e
    public AURARenderComponent a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("30a4d5a7", new Object[]{this, new Integer(i)});
        }
        List<AURARenderComponent> list = this.b;
        if (list == null) {
            return null;
        }
        int size = ((ArrayList) list).size();
        if (i < 0 || i >= size) {
            return null;
        }
        return (AURARenderComponent) ((ArrayList) this.b).get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        List<AURARenderComponent> list = this.b;
        if (list == null) {
            return 0;
        }
        return ((ArrayList) list).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        AURARenderComponent aURARenderComponent;
        AURARenderComponentData aURARenderComponentData;
        AURARenderComponentContainer aURARenderComponentContainer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        int h = this.c.h(i, Integer.MIN_VALUE);
        List<AURARenderComponent> list = this.b;
        if (list != null) {
            aURARenderComponent = (AURARenderComponent) ((ArrayList) list).get(i);
        } else {
            aURARenderComponent = null;
        }
        if (h < 0) {
            b4e a2 = dxu.a();
            a2.e("UMFRenderContainerAdapter", "getItemViewType#find type error, position=" + i + ",viewType=" + h + ",data=" + aURARenderComponent);
        }
        b4e a3 = dxu.a();
        a3.d("UMFRenderContainerAdapter", "getItemViewType#viewtype=" + h);
        if (aURARenderComponent == null || (aURARenderComponentData = aURARenderComponent.data) == null || (aURARenderComponentContainer = aURARenderComponentData.container) == null || !aURARenderComponentContainer.isPreset) {
            return h;
        }
        return -h;
    }

    public void setData(List<AURARenderComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ddf4a4", new Object[]{this, list});
            return;
        }
        this.c.n(list);
        if (this.b == null) {
            this.b = new ArrayList();
        }
        ((ArrayList) this.b).clear();
        ((ArrayList) this.b).addAll(list);
    }
}
