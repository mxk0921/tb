package com.taobao.taolive.room.ui.view.recyclermoreload;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class RecyclerArrayAdapter<T> extends RecyclerView.Adapter<BaseViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<T> f13260a;
    public final ArrayList<a> b = new ArrayList<>();
    public final ArrayList<a> c = new ArrayList<>();
    public RecyclerView d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class GridSpanSizeLookup extends GridLayoutManager.SpanSizeLookup {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(779093314);
        }

        public static /* synthetic */ Object ipc$super(GridSpanSizeLookup gridSpanSizeLookup, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/ui/view/recyclermoreload/RecyclerArrayAdapter$GridSpanSizeLookup");
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3462f00e", new Object[]{this, new Integer(i)})).intValue();
            }
            throw null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class StateViewHolder extends BaseViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(779093322);
        }

        public StateViewHolder(RecyclerArrayAdapter recyclerArrayAdapter, View view) {
            super(view);
        }

        public static /* synthetic */ Object ipc$super(StateViewHolder stateViewHolder, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/ui/view/recyclermoreload/RecyclerArrayAdapter$StateViewHolder");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void a(View view);

        View b(ViewGroup viewGroup);
    }

    static {
        t2o.a(779093309);
    }

    public RecyclerArrayAdapter(Context context) {
        T(context, new ArrayList());
    }

    public static /* synthetic */ Object ipc$super(RecyclerArrayAdapter recyclerArrayAdapter, String str, Object... objArr) {
        if (str.hashCode() == 2130396206) {
            super.onAttachedToRecyclerView((RecyclerView) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/ui/view/recyclermoreload/RecyclerArrayAdapter");
    }

    public void M(BaseViewHolder baseViewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8a830de", new Object[]{this, baseViewHolder, new Integer(i)});
        } else {
            baseViewHolder.b0(getItem(i));
        }
    }

    public abstract BaseViewHolder N(ViewGroup viewGroup, int i);

    public final View O(ViewGroup viewGroup, int i) {
        StaggeredGridLayoutManager.LayoutParams layoutParams;
        StaggeredGridLayoutManager.LayoutParams layoutParams2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("eb0a6690", new Object[]{this, viewGroup, new Integer(i)});
        }
        Iterator<a> it = this.b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.hashCode() == i) {
                View b = next.b(viewGroup);
                if (b.getLayoutParams() != null) {
                    layoutParams2 = new StaggeredGridLayoutManager.LayoutParams(b.getLayoutParams());
                } else {
                    layoutParams2 = new StaggeredGridLayoutManager.LayoutParams(-1, -2);
                }
                layoutParams2.setFullSpan(true);
                b.setLayoutParams(layoutParams2);
                return b;
            }
        }
        Iterator<a> it2 = this.c.iterator();
        while (it2.hasNext()) {
            a next2 = it2.next();
            if (next2.hashCode() == i) {
                View b2 = next2.b(viewGroup);
                if (b2.getLayoutParams() != null) {
                    layoutParams = new StaggeredGridLayoutManager.LayoutParams(b2.getLayoutParams());
                } else {
                    layoutParams = new StaggeredGridLayoutManager.LayoutParams(-1, -2);
                }
                layoutParams.setFullSpan(true);
                b2.setLayoutParams(layoutParams);
                return b2;
            }
        }
        return null;
    }

    public int P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        return ((ArrayList) this.f13260a).size();
    }

    public int Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d7281078", new Object[]{this})).intValue();
        }
        return this.c.size();
    }

    public int S(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5912f7a", new Object[]{this, new Integer(i)})).intValue();
        }
        return 0;
    }

    public final void T(Context context, List<T> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0f21d02", new Object[]{this, context, list});
        } else {
            this.f13260a = new ArrayList(list);
        }
    }

    /* renamed from: U */
    public final void onBindViewHolder(BaseViewHolder baseViewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cd084be", new Object[]{this, baseViewHolder, new Integer(i)});
            return;
        }
        baseViewHolder.itemView.setId(i);
        if (this.b.size() == 0 || i >= this.b.size()) {
            int size = (i - this.b.size()) - ((ArrayList) this.f13260a).size();
            if (this.c.size() == 0 || size < 0) {
                M(baseViewHolder, i - this.b.size());
            } else {
                this.c.get(size).a(baseViewHolder.itemView);
            }
        } else {
            this.b.get(i).a(baseViewHolder.itemView);
        }
    }

    /* renamed from: V */
    public final BaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseViewHolder) ipChange.ipc$dispatch("6bae1a", new Object[]{this, viewGroup, new Integer(i)});
        }
        View O = O(viewGroup, i);
        if (O != null) {
            return new StateViewHolder(this, O);
        }
        return N(viewGroup, i);
    }

    public T getItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)});
        }
        return (T) ((ArrayList) this.f13260a).get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @Deprecated
    public final int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return ((ArrayList) this.f13260a).size() + this.b.size() + this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @Deprecated
    public final int getItemViewType(int i) {
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        if (this.b.size() != 0 && i < this.b.size()) {
            return this.b.get(i).hashCode();
        }
        if (this.c.size() == 0 || (size = (i - this.b.size()) - ((ArrayList) this.f13260a).size()) < 0) {
            return S(i - this.b.size());
        }
        return this.c.get(size).hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7efb442e", new Object[]{this, recyclerView});
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        this.d = recyclerView;
        registerAdapterDataObserver(new FixDataObserver(this.d));
    }
}
