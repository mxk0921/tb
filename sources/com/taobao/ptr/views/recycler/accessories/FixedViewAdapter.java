package com.taobao.ptr.views.recycler.accessories;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import tb.jk9;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class FixedViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<jk9> f11489a;
    public final ArrayList<jk9> b;
    public boolean c;
    public final RecyclerView.Adapter d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class FixedViewHolder extends RecyclerView.ViewHolder {
        static {
            t2o.a(632291383);
        }

        public FixedViewHolder(View view) {
            super(view);
        }
    }

    static {
        t2o.a(632291382);
    }

    public FixedViewAdapter(ArrayList<jk9> arrayList, ArrayList<jk9> arrayList2, RecyclerView.Adapter adapter) {
        this.f11489a = new ArrayList<>();
        this.b = new ArrayList<>();
        this.d = adapter;
        if (adapter != null) {
            setHasStableIds(adapter.hasStableIds());
        }
        if (arrayList != null) {
            this.f11489a = arrayList;
        }
        if (arrayList2 != null) {
            this.b = arrayList2;
        }
    }

    public static /* synthetic */ Object ipc$super(FixedViewAdapter fixedViewAdapter, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1835299728:
                return new Boolean(super.onFailedToRecycleView((RecyclerView.ViewHolder) objArr[0]));
            case 143764512:
                super.onViewRecycled((RecyclerView.ViewHolder) objArr[0]);
                return null;
            case 430758011:
                super.onViewDetachedFromWindow((RecyclerView.ViewHolder) objArr[0]);
                return null;
            case 1036956242:
                super.unregisterAdapterDataObserver((RecyclerView.AdapterDataObserver) objArr[0]);
                return null;
            case 1156665041:
                super.onDetachedFromRecyclerView((RecyclerView) objArr[0]);
                return null;
            case 1414446457:
                super.registerAdapterDataObserver((RecyclerView.AdapterDataObserver) objArr[0]);
                return null;
            case 1995301502:
                super.onViewAttachedToWindow((RecyclerView.ViewHolder) objArr[0]);
                return null;
            case 2130396206:
                super.onAttachedToRecyclerView((RecyclerView) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/ptr/views/recycler/accessories/FixedViewAdapter");
        }
    }

    public final View M(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8504e21e", new Object[]{this, new Integer(i)});
        }
        Iterator<jk9> it = this.f11489a.iterator();
        while (it.hasNext()) {
            jk9 next = it.next();
            if (next.a() == i) {
                return next.b();
            }
        }
        Iterator<jk9> it2 = this.b.iterator();
        while (it2.hasNext()) {
            jk9 next2 = it2.next();
            if (next2.a() == i) {
                return next2.b();
            }
        }
        return null;
    }

    public RecyclerView.Adapter N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.Adapter) ipChange.ipc$dispatch("95b4241c", new Object[]{this});
        }
        return this.d;
    }

    public int O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a5305840", new Object[]{this})).intValue();
        }
        return this.b.size();
    }

    public int P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("126b107", new Object[]{this})).intValue();
        }
        return this.f11489a.size();
    }

    public final boolean Q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55d20691", new Object[]{this, new Integer(i)})).booleanValue();
        }
        Iterator<jk9> it = this.f11489a.iterator();
        while (it.hasNext()) {
            if (it.next().a() == i) {
                return true;
            }
        }
        Iterator<jk9> it2 = this.b.iterator();
        while (it2.hasNext()) {
            if (it2.next().a() == i) {
                return true;
            }
        }
        return false;
    }

    public boolean S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eadc7d20", new Object[]{this})).booleanValue();
        }
        if (this.b.size() <= 0) {
            return false;
        }
        this.b.clear();
        return true;
    }

    public boolean T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a5c6ab9", new Object[]{this})).booleanValue();
        }
        if (this.f11489a.size() <= 0) {
            return false;
        }
        this.f11489a.clear();
        return true;
    }

    public boolean U(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b2ca958", new Object[]{this, view})).booleanValue();
        }
        for (int i = 0; i < this.b.size(); i++) {
            if (this.b.get(i).a() == view.hashCode()) {
                this.b.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean V(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e540cf1", new Object[]{this, view})).booleanValue();
        }
        for (int i = 0; i < this.f11489a.size(); i++) {
            if (this.f11489a.get(i).a() == view.hashCode()) {
                this.f11489a.remove(i);
                return true;
            }
        }
        return false;
    }

    public FixedViewAdapter W(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FixedViewAdapter) ipChange.ipc$dispatch("af2d5dfc", new Object[]{this, new Boolean(z)});
        }
        this.c = z;
        return this;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        int P = P() + O();
        RecyclerView.Adapter adapter = this.d;
        if (adapter != null) {
            return P + adapter.getItemCount();
        }
        return P;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
        }
        int P = P();
        if (i < P) {
            return -1L;
        }
        int i2 = i - P;
        RecyclerView.Adapter adapter = this.d;
        if (adapter == null || i < P || i2 >= adapter.getItemCount()) {
            return -1L;
        }
        return this.d.getItemId(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        int P = P();
        if (i < P) {
            return this.f11489a.get(i).a();
        }
        int i3 = i - P;
        RecyclerView.Adapter adapter = this.d;
        if (adapter == null || i < P || i3 >= (i2 = adapter.getItemCount())) {
            return this.b.get(i3 - i2).a();
        }
        return this.d.getItemViewType(i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7efb442e", new Object[]{this, recyclerView});
            return;
        }
        RecyclerView.Adapter adapter = this.d;
        if (adapter != null) {
            adapter.onAttachedToRecyclerView(recyclerView);
        }
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        int P = P();
        if (i >= P) {
            int i2 = i - P;
            RecyclerView.Adapter adapter = this.d;
            if (adapter != null && i2 < adapter.getItemCount()) {
                this.d.onBindViewHolder(viewHolder, i2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
        }
        if (!Q(i)) {
            return this.d.onCreateViewHolder(viewGroup, i);
        }
        View M = M(i);
        ViewParent parent = M.getParent();
        if (this.c && (parent instanceof ViewGroup)) {
            ((ViewGroup) parent).removeView(M);
        }
        return new FixedViewHolder(M);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44f14ed1", new Object[]{this, recyclerView});
            return;
        }
        RecyclerView.Adapter adapter = this.d;
        if (adapter != null) {
            adapter.onDetachedFromRecyclerView(recyclerView);
        }
        super.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("929b8c70", new Object[]{this, viewHolder})).booleanValue();
        }
        if (viewHolder instanceof FixedViewHolder) {
            return super.onFailedToRecycleView(viewHolder);
        }
        RecyclerView.Adapter adapter = this.d;
        if (adapter != null) {
            return adapter.onFailedToRecycleView(viewHolder);
        }
        return super.onFailedToRecycleView(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76ede27e", new Object[]{this, viewHolder});
        } else if (viewHolder instanceof FixedViewHolder) {
            super.onViewAttachedToWindow(viewHolder);
        } else {
            RecyclerView.Adapter adapter = this.d;
            if (adapter != null) {
                adapter.onViewAttachedToWindow(viewHolder);
            } else {
                super.onViewAttachedToWindow(viewHolder);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19acd87b", new Object[]{this, viewHolder});
        } else if (viewHolder instanceof FixedViewHolder) {
            super.onViewDetachedFromWindow(viewHolder);
        } else {
            RecyclerView.Adapter adapter = this.d;
            if (adapter != null) {
                adapter.onViewDetachedFromWindow(viewHolder);
            } else {
                super.onViewDetachedFromWindow(viewHolder);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("891ac20", new Object[]{this, viewHolder});
        } else if (viewHolder instanceof FixedViewHolder) {
            super.onViewRecycled(viewHolder);
        } else {
            RecyclerView.Adapter adapter = this.d;
            if (adapter != null) {
                adapter.onViewRecycled(viewHolder);
            } else {
                super.onViewRecycled(viewHolder);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void registerAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("544ebd79", new Object[]{this, adapterDataObserver});
            return;
        }
        RecyclerView.Adapter adapter = this.d;
        if (adapter != null) {
            adapter.registerAdapterDataObserver(adapterDataObserver);
        }
        super.registerAdapterDataObserver(adapterDataObserver);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void unregisterAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dceb252", new Object[]{this, adapterDataObserver});
            return;
        }
        RecyclerView.Adapter adapter = this.d;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(adapterDataObserver);
        }
        super.unregisterAdapterDataObserver(adapterDataObserver);
    }
}
