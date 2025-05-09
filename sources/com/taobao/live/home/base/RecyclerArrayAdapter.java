package com.taobao.live.home.base;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.home.LiveHomeController;
import com.taobao.live.home.dinamic.model.DinamicDataObject;
import com.taobao.live.home.dinamic.model.TemplateObject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import tb.orq;
import tb.r0h;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class RecyclerArrayAdapter<T> extends RecyclerView.Adapter<BaseViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<T> f10940a;
    public com.taobao.live.home.base.b b;
    public RecyclerView e;
    public Context h;
    public final ArrayList<a> c = new ArrayList<>();
    public final ArrayList<a> d = new ArrayList<>();
    public final Object f = new Object();
    public final boolean g = true;
    public final int i = 2;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class GridSpanSizeLookup extends GridLayoutManager.SpanSizeLookup {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(806355344);
        }

        public static /* synthetic */ Object ipc$super(GridSpanSizeLookup gridSpanSizeLookup, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/base/RecyclerArrayAdapter$GridSpanSizeLookup");
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class StateViewHolder extends BaseViewHolder {
        static {
            t2o.a(806355352);
        }

        public StateViewHolder(RecyclerArrayAdapter recyclerArrayAdapter, View view) {
            super(view);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        void a(View view);

        View b(ViewGroup viewGroup);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface b {
        void a();

        void b();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface c {
        void a();

        void b();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface d {
    }

    static {
        t2o.a(806355339);
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
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/base/RecyclerArrayAdapter");
    }

    public void M(BaseViewHolder baseViewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd270280", new Object[]{this, baseViewHolder, new Integer(i)});
            return;
        }
        k0(baseViewHolder, i, this.i);
        baseViewHolder.b0(getItem(i));
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
        com.taobao.live.home.base.b bVar = this.b;
        if (bVar != null) {
            if (collection == null) {
                i = 0;
            } else {
                i = collection.size();
            }
            ((com.taobao.live.home.base.a) bVar).f(i);
        }
        if (!(collection == null || collection.size() == 0)) {
            synchronized (this.f) {
                ((ArrayList) this.f10940a).addAll(collection);
            }
        }
        if (collection != null) {
            i2 = collection.size();
        }
        if (this.g) {
            notifyItemRangeInserted((this.c.size() + U()) - i2, i2);
        }
        a0("addAll notifyItemRangeInserted " + ((this.c.size() + U()) - i2) + "," + i2);
    }

    public void P(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e6db9d5", new Object[]{this, aVar});
        } else if (aVar != null) {
            this.d.add(aVar);
            notifyItemInserted(((this.c.size() + U()) + this.d.size()) - 1);
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
        int size = ((ArrayList) this.f10940a).size();
        com.taobao.live.home.base.b bVar = this.b;
        if (bVar != null) {
            ((com.taobao.live.home.base.a) bVar).g();
        }
        synchronized (this.f) {
            ((ArrayList) this.f10940a).clear();
        }
        if (this.g) {
            notifyDataSetChanged();
        }
        a0("clear notifyItemRangeRemoved " + this.c.size() + "," + size);
    }

    public final View S(ViewGroup viewGroup, int i) {
        StaggeredGridLayoutManager.LayoutParams layoutParams;
        StaggeredGridLayoutManager.LayoutParams layoutParams2;
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
                    layoutParams2 = new StaggeredGridLayoutManager.LayoutParams(b2.getLayoutParams());
                } else {
                    layoutParams2 = new StaggeredGridLayoutManager.LayoutParams(-1, -2);
                }
                layoutParams2.setFullSpan(true);
                b2.setLayoutParams(layoutParams2);
                return b2;
            }
        }
        Iterator<a> it2 = this.d.iterator();
        while (it2.hasNext()) {
            a next2 = it2.next();
            if (next2.hashCode() == i) {
                View b3 = next2.b(viewGroup);
                if (b3.getLayoutParams() != null) {
                    layoutParams = new StaggeredGridLayoutManager.LayoutParams(b3.getLayoutParams());
                } else {
                    layoutParams = new StaggeredGridLayoutManager.LayoutParams(-1, -2);
                }
                layoutParams.setFullSpan(true);
                b3.setLayoutParams(layoutParams);
                return b3;
            }
        }
        return null;
    }

    public Context T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.h;
    }

    public int U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        return ((ArrayList) this.f10940a).size();
    }

    public com.taobao.live.home.base.b V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.live.home.base.b) ipChange.ipc$dispatch("bd526c0", new Object[]{this});
        }
        if (this.b == null) {
            this.b = new com.taobao.live.home.base.a(this);
        }
        return this.b;
    }

    public int W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d7281078", new Object[]{this})).intValue();
        }
        return this.d.size();
    }

    public final int X(int i) {
        TemplateObject j;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4db89341", new Object[]{this, new Integer(i)})).intValue();
        }
        List<T> list = this.f10940a;
        if (list != null && i >= 0 && i < ((ArrayList) list).size()) {
            Object obj = ((ArrayList) this.f10940a).get(i);
            if (obj instanceof DinamicDataObject) {
                DinamicDataObject dinamicDataObject = (DinamicDataObject) obj;
                if (!orq.a(dinamicDataObject.templateName) && LiveHomeController.instance().getTemplateCardListOwner() != null && (j = LiveHomeController.instance().getTemplateCardListOwner().j(dinamicDataObject.templateName)) != null && (i2 = j.span) > 0 && i2 <= 2) {
                    return i2;
                }
            }
        }
        return 2;
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
        this.h = context;
        this.f10940a = new ArrayList(list);
    }

    /* renamed from: b0 */
    public final void onBindViewHolder(BaseViewHolder baseViewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f178aa0", new Object[]{this, baseViewHolder, new Integer(i)});
            return;
        }
        baseViewHolder.itemView.setId(i);
        if (this.c.size() == 0 || i >= this.c.size()) {
            int size = (i - this.c.size()) - ((ArrayList) this.f10940a).size();
            if (this.d.size() == 0 || size < 0) {
                M(baseViewHolder, i - this.c.size());
            } else {
                this.d.get(size).a(baseViewHolder.itemView);
            }
        } else {
            this.c.get(i).a(baseViewHolder.itemView);
        }
    }

    /* renamed from: c0 */
    public final BaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseViewHolder) ipChange.ipc$dispatch("c897a8b4", new Object[]{this, viewGroup, new Integer(i)});
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
        com.taobao.live.home.base.b bVar = this.b;
        if (bVar != null) {
            ((com.taobao.live.home.base.a) bVar).o();
            return;
        }
        throw new NullPointerException("You should invoking setLoadMore() first");
    }

    public void e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf406f1", new Object[]{this});
            return;
        }
        int size = this.c.size();
        this.c.clear();
        notifyItemRangeRemoved(0, size);
    }

    public void f0(int i, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36228899", new Object[]{this, new Integer(i), bVar});
        } else {
            V().b(i, bVar);
        }
    }

    public void g0(int i, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1097f6c3", new Object[]{this, new Integer(i), cVar});
        } else {
            V().c(i, cVar);
        }
    }

    public T getItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)});
        }
        return (T) ((ArrayList) this.f10940a).get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @Deprecated
    public final int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return ((ArrayList) this.f10940a).size() + this.c.size() + this.d.size();
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
        if (this.c.size() != 0 && i < this.c.size()) {
            return this.c.get(i).hashCode();
        }
        if (this.d.size() == 0 || (size = (i - this.c.size()) - ((ArrayList) this.f10940a).size()) < 0) {
            return Y(i - this.c.size());
        }
        return this.d.get(size).hashCode();
    }

    public void h0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("370bc6a4", new Object[]{this, new Integer(i)});
        } else {
            V().a(i, null);
        }
    }

    public void i0(int i, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3597d1e3", new Object[]{this, new Integer(i), dVar});
        } else {
            V().a(i, dVar);
        }
    }

    public void j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acf2577e", new Object[]{this});
            return;
        }
        com.taobao.live.home.base.b bVar = this.b;
        if (bVar != null) {
            ((com.taobao.live.home.base.a) bVar).p();
            return;
        }
        throw new NullPointerException("You should invoking setLoadMore() first");
    }

    public void k0(BaseViewHolder baseViewHolder, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8e07197", new Object[]{this, baseViewHolder, new Integer(i), new Integer(i2)});
            return;
        }
        int X = X(i);
        ViewGroup.LayoutParams layoutParams = baseViewHolder.itemView.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            StaggeredGridLayoutManager.LayoutParams layoutParams2 = (StaggeredGridLayoutManager.LayoutParams) layoutParams;
            if (X == i2) {
                layoutParams2.setFullSpan(true);
            } else {
                layoutParams2.setFullSpan(false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7efb442e", new Object[]{this, recyclerView});
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        this.e = recyclerView;
        registerAdapterDataObserver(new FixDataObserver(this.e));
    }
}
