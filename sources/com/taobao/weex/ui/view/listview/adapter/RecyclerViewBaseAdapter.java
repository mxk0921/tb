package com.taobao.weex.ui.view.listview.adapter;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.ui.view.listview.adapter.ListBaseViewHolder;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class RecyclerViewBaseAdapter<T extends ListBaseViewHolder> extends RecyclerView.Adapter<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private IRecyclerAdapterListener iRecyclerAdapterListener;

    static {
        t2o.a(985661766);
    }

    public RecyclerViewBaseAdapter(IRecyclerAdapterListener iRecyclerAdapterListener) {
        this.iRecyclerAdapterListener = iRecyclerAdapterListener;
    }

    public static /* synthetic */ Object ipc$super(RecyclerViewBaseAdapter recyclerViewBaseAdapter, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1835299728:
                return new Boolean(super.onFailedToRecycleView((RecyclerViewBaseAdapter) ((RecyclerView.ViewHolder) objArr[0])));
            case 143764512:
                super.onViewRecycled((RecyclerViewBaseAdapter) ((RecyclerView.ViewHolder) objArr[0]));
                return null;
            case 430758011:
                super.onViewDetachedFromWindow((RecyclerViewBaseAdapter) ((RecyclerView.ViewHolder) objArr[0]));
                return null;
            case 1995301502:
                super.onViewAttachedToWindow((RecyclerViewBaseAdapter) ((RecyclerView.ViewHolder) objArr[0]));
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/ui/view/listview/adapter/RecyclerViewBaseAdapter");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        IRecyclerAdapterListener iRecyclerAdapterListener = this.iRecyclerAdapterListener;
        if (iRecyclerAdapterListener != null) {
            return iRecyclerAdapterListener.getItemCount();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
        }
        return this.iRecyclerAdapterListener.getItemId(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        IRecyclerAdapterListener iRecyclerAdapterListener = this.iRecyclerAdapterListener;
        if (iRecyclerAdapterListener != null) {
            return iRecyclerAdapterListener.getItemViewType(i);
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        onBindViewHolder((RecyclerViewBaseAdapter<T>) ((ListBaseViewHolder) viewHolder), i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        return onFailedToRecycleView((RecyclerViewBaseAdapter<T>) ((ListBaseViewHolder) viewHolder));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        onViewAttachedToWindow((RecyclerViewBaseAdapter<T>) ((ListBaseViewHolder) viewHolder));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        onViewDetachedFromWindow((RecyclerViewBaseAdapter<T>) ((ListBaseViewHolder) viewHolder));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        onViewRecycled((RecyclerViewBaseAdapter<T>) ((ListBaseViewHolder) viewHolder));
    }

    public void onBindViewHolder(T t, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("261f0e18", new Object[]{this, t, new Integer(i)});
            return;
        }
        IRecyclerAdapterListener iRecyclerAdapterListener = this.iRecyclerAdapterListener;
        if (iRecyclerAdapterListener != null) {
            iRecyclerAdapterListener.onBindViewHolder(t, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public T onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((ListBaseViewHolder) ipChange.ipc$dispatch("7d70c400", new Object[]{this, viewGroup, new Integer(i)}));
        }
        IRecyclerAdapterListener iRecyclerAdapterListener = this.iRecyclerAdapterListener;
        if (iRecyclerAdapterListener != null) {
            return (T) ((ListBaseViewHolder) iRecyclerAdapterListener.onCreateViewHolder(viewGroup, i));
        }
        return null;
    }

    public boolean onFailedToRecycleView(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f6e4c9b", new Object[]{this, t})).booleanValue();
        }
        IRecyclerAdapterListener iRecyclerAdapterListener = this.iRecyclerAdapterListener;
        if (iRecyclerAdapterListener != null) {
            return iRecyclerAdapterListener.onFailedToRecycleView(t);
        }
        return super.onFailedToRecycleView((RecyclerViewBaseAdapter<T>) t);
    }

    public void onViewAttachedToWindow(T t) {
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dc45e45", new Object[]{this, t});
            return;
        }
        super.onViewAttachedToWindow((RecyclerViewBaseAdapter<T>) t);
        if (t != null && t.isFullSpan() && (layoutParams = t.itemView.getLayoutParams()) != null && (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
        }
    }

    public void onViewDetachedFromWindow(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2c121a8", new Object[]{this, t});
            return;
        }
        super.onViewDetachedFromWindow((RecyclerViewBaseAdapter<T>) t);
        if (t != null) {
            t.setComponentUsing(false);
        }
    }

    public void onViewRecycled(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c77ada63", new Object[]{this, t});
            return;
        }
        IRecyclerAdapterListener iRecyclerAdapterListener = this.iRecyclerAdapterListener;
        if (iRecyclerAdapterListener != null) {
            iRecyclerAdapterListener.onViewRecycled(t);
        }
        super.onViewRecycled((RecyclerViewBaseAdapter<T>) t);
    }
}
