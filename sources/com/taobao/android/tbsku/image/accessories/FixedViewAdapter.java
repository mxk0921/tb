package com.taobao.android.tbsku.image.accessories;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import tb.kk9;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class FixedViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<kk9> f9593a;
    public final ArrayList<kk9> b;
    public final RecyclerView.Adapter c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class FixedViewHolder extends RecyclerView.ViewHolder {
        static {
            t2o.a(785383543);
        }

        public FixedViewHolder(View view) {
            super(view);
        }
    }

    static {
        t2o.a(785383542);
    }

    public FixedViewAdapter(ArrayList<kk9> arrayList, ArrayList<kk9> arrayList2, RecyclerView.Adapter adapter) {
        this.f9593a = new ArrayList<>();
        this.b = new ArrayList<>();
        this.c = adapter;
        if (adapter != null) {
            setHasStableIds(adapter.hasStableIds());
        }
        if (arrayList != null) {
            this.f9593a = arrayList;
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbsku/image/accessories/FixedViewAdapter");
        }
    }

    public final View M(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8504e21e", new Object[]{this, new Integer(i)});
        }
        Iterator<kk9> it = this.f9593a.iterator();
        while (it.hasNext()) {
            kk9 next = it.next();
            if (next.a() == i) {
                return next.b();
            }
        }
        Iterator<kk9> it2 = this.b.iterator();
        while (it2.hasNext()) {
            kk9 next2 = it2.next();
            if (next2.a() == i) {
                return next2.b();
            }
        }
        return null;
    }

    public int N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a5305840", new Object[]{this})).intValue();
        }
        return this.b.size();
    }

    public int O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("126b107", new Object[]{this})).intValue();
        }
        return this.f9593a.size();
    }

    public final boolean P(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55d20691", new Object[]{this, new Integer(i)})).booleanValue();
        }
        Iterator<kk9> it = this.f9593a.iterator();
        while (it.hasNext()) {
            if (it.next().a() == i) {
                return true;
            }
        }
        Iterator<kk9> it2 = this.b.iterator();
        while (it2.hasNext()) {
            if (it2.next().a() == i) {
                return true;
            }
        }
        return false;
    }

    public boolean Q() {
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

    public boolean S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a5c6ab9", new Object[]{this})).booleanValue();
        }
        if (this.f9593a.size() <= 0) {
            return false;
        }
        this.f9593a.clear();
        return true;
    }

    public boolean T(View view) {
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

    public boolean U(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e540cf1", new Object[]{this, view})).booleanValue();
        }
        for (int i = 0; i < this.f9593a.size(); i++) {
            if (this.f9593a.get(i).a() == view.hashCode()) {
                this.f9593a.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        int O = O() + N();
        RecyclerView.Adapter adapter = this.c;
        if (adapter != null) {
            return O + adapter.getItemCount();
        }
        return O;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
        }
        int O = O();
        if (i < O) {
            return -1L;
        }
        int i2 = i - O;
        RecyclerView.Adapter adapter = this.c;
        if (adapter == null || i < O || i2 >= adapter.getItemCount()) {
            return -1L;
        }
        return this.c.getItemId(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        int O = O();
        if (i < O) {
            return this.f9593a.get(i).a();
        }
        int i3 = i - O;
        RecyclerView.Adapter adapter = this.c;
        if (adapter == null || i < O || i3 >= (i2 = adapter.getItemCount())) {
            return this.b.get(i3 - i2).a();
        }
        return this.c.getItemViewType(i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7efb442e", new Object[]{this, recyclerView});
            return;
        }
        RecyclerView.Adapter adapter = this.c;
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
        int O = O();
        if (i >= O) {
            int i2 = i - O;
            RecyclerView.Adapter adapter = this.c;
            if (adapter != null && i2 < adapter.getItemCount()) {
                this.c.onBindViewHolder(viewHolder, i2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
        }
        if (P(i)) {
            return new FixedViewHolder(M(i));
        }
        return this.c.onCreateViewHolder(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44f14ed1", new Object[]{this, recyclerView});
            return;
        }
        RecyclerView.Adapter adapter = this.c;
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
        RecyclerView.Adapter adapter = this.c;
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
            RecyclerView.Adapter adapter = this.c;
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
            RecyclerView.Adapter adapter = this.c;
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
            RecyclerView.Adapter adapter = this.c;
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
        RecyclerView.Adapter adapter = this.c;
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
        RecyclerView.Adapter adapter = this.c;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(adapterDataObserver);
        }
        super.unregisterAdapterDataObserver(adapterDataObserver);
    }
}
