package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.BaseViewHolder;
import com.taobao.live.home.base.FixDataObserver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import tb.p07;
import tb.r0h;
import tb.t2o;
import tb.zj8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class RecyclerArrayAdapter<T> extends RecyclerView.Adapter<BaseViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<T> f8832a;
    public zj8 b;
    public RecyclerView d;
    public Context g;
    public final ArrayList<a> c = new ArrayList<>();
    public final Object e = new Object();
    public final boolean f = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class StateViewHolder extends BaseViewHolder {
        static {
            t2o.a(310378712);
        }

        public StateViewHolder(RecyclerArrayAdapter recyclerArrayAdapter, View view) {
            super(view);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
        void a(View view);

        View b(ViewGroup viewGroup);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface c {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface d {
    }

    static {
        t2o.a(310378700);
    }

    public RecyclerArrayAdapter(Context context) {
        Z(context, new ArrayList());
    }

    public static void a0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{str});
        } else {
            r0h.a("RecyclerArrayAdapter", str);
        }
    }

    public static /* synthetic */ Object ipc$super(RecyclerArrayAdapter recyclerArrayAdapter, String str, Object... objArr) {
        if (str.hashCode() == 2130396206) {
            super.onAttachedToRecyclerView((RecyclerView) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/fragment/main/adapter/RecyclerArrayAdapter");
    }

    public void M(BaseViewHolder baseViewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb4eb7b3", new Object[]{this, baseViewHolder, new Integer(i)});
        } else {
            baseViewHolder.b0(getItem(i));
        }
    }

    public abstract BaseViewHolder N(ViewGroup viewGroup, int i);

    public void O(Collection<? extends T> collection) {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6721cc38", new Object[]{this, collection});
            return;
        }
        zj8 zj8Var = this.b;
        if (zj8Var != null) {
            if (collection == null) {
                i = 0;
            } else {
                i = collection.size();
            }
            ((p07) zj8Var).h(i);
        }
        if (!(collection == null || collection.size() == 0)) {
            synchronized (this.e) {
                ((ArrayList) this.f8832a).addAll(collection);
            }
        }
        if (collection != null) {
            i2 = collection.size();
        }
        if (this.f) {
            notifyItemRangeInserted(V() - i2, i2);
        }
        a0("addAll notifyItemRangeInserted " + (V() - i2) + "," + i2);
    }

    public void P(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa85306", new Object[]{this, aVar});
        } else if (aVar != null) {
            this.c.add(aVar);
            notifyItemInserted((V() + this.c.size()) - 1);
        } else {
            throw new NullPointerException("ItemView can't be null");
        }
    }

    public void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        ((ArrayList) this.f8832a).size();
        zj8 zj8Var = this.b;
        if (zj8Var != null) {
            ((p07) zj8Var).i();
        }
        synchronized (this.e) {
            ((ArrayList) this.f8832a).clear();
        }
        if (this.f) {
            notifyDataSetChanged();
        }
    }

    public final View S(ViewGroup viewGroup, int i) {
        StaggeredGridLayoutManager.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("eb0a6690", new Object[]{this, viewGroup, new Integer(i)});
        }
        Iterator<a> it = this.c.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.hashCode() == i) {
                View b2 = next.b(viewGroup);
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

    public List<T> T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ed2d000b", new Object[]{this});
        }
        return new ArrayList(this.f8832a);
    }

    public Context U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.g;
    }

    public int V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        return ((ArrayList) this.f8832a).size();
    }

    public zj8 W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zj8) ipChange.ipc$dispatch("5d473951", new Object[]{this});
        }
        if (this.b == null) {
            this.b = new p07(this);
        }
        return this.b;
    }

    public int X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d7281078", new Object[]{this})).intValue();
        }
        return this.c.size();
    }

    public int Y(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5912f7a", new Object[]{this, new Integer(i)})).intValue();
        }
        return 0;
    }

    public final void Z(Context context, List<T> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0f21d02", new Object[]{this, context, list});
            return;
        }
        this.g = context;
        this.f8832a = new ArrayList(list);
    }

    /* renamed from: b0 */
    public final void onBindViewHolder(BaseViewHolder baseViewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de2f8b93", new Object[]{this, baseViewHolder, new Integer(i)});
            return;
        }
        baseViewHolder.itemView.setId(i);
        int size = i - ((ArrayList) this.f8832a).size();
        if (this.c.size() == 0 || size < 0) {
            M(baseViewHolder, i);
        } else {
            this.c.get(size).a(baseViewHolder.itemView);
        }
    }

    /* renamed from: c0 */
    public final BaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseViewHolder) ipChange.ipc$dispatch("8e729765", new Object[]{this, viewGroup, new Integer(i)});
        }
        View S = S(viewGroup, i);
        if (S != null) {
            return new StateViewHolder(this, S);
        }
        return N(viewGroup, i);
    }

    public void d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82e14172", new Object[]{this});
            return;
        }
        zj8 zj8Var = this.b;
        if (zj8Var != null) {
            ((p07) zj8Var).q();
            return;
        }
        throw new NullPointerException("You should invoking setLoadMore() first");
    }

    public void e0(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9adede80", new Object[]{this, view});
        } else {
            W().a(view);
        }
    }

    public void f0(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22ea6535", new Object[]{this, view});
        } else {
            W().b(view);
        }
    }

    public void g0(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("442a6f65", new Object[]{this, view});
        } else {
            W().c(view, null);
        }
    }

    public T getItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)});
        }
        return (T) ((ArrayList) this.f8832a).get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @Deprecated
    public final int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return ((ArrayList) this.f8832a).size() + this.c.size();
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
        if (this.c.size() == 0 || (size = i - ((ArrayList) this.f8832a).size()) < 0) {
            return Y(i);
        }
        return this.c.get(size).hashCode();
    }

    public void h0(View view, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53e9b745", new Object[]{this, view, cVar});
        } else {
            W().d(view, cVar);
        }
    }

    public void i0(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29e2c633", new Object[]{this, view});
        } else {
            W().e(view, null);
        }
    }

    public void j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8510ecd7", new Object[]{this});
            return;
        }
        zj8 zj8Var = this.b;
        if (zj8Var != null) {
            ((p07) zj8Var).r();
            return;
        }
        throw new NullPointerException("You should invoking showEmpty() first");
    }

    public void k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3377882", new Object[]{this});
            return;
        }
        zj8 zj8Var = this.b;
        if (zj8Var != null) {
            ((p07) zj8Var).s();
            return;
        }
        throw new NullPointerException("You should invoking showEmpty() first");
    }

    public void l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acf2577e", new Object[]{this});
            return;
        }
        zj8 zj8Var = this.b;
        if (zj8Var != null) {
            ((p07) zj8Var).t();
            return;
        }
        throw new NullPointerException("You should invoking setLoadMore() first");
    }

    public void m0(T t, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48607bd7", new Object[]{this, t, new Integer(i)});
            return;
        }
        synchronized (this.e) {
            ((ArrayList) this.f8832a).set(i, t);
        }
        if (this.f) {
            notifyItemChanged(i);
        }
        a0("insertAll notifyItemChanged " + i);
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
