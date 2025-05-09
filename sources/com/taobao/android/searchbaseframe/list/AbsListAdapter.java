package com.taobao.android.searchbaseframe.list;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.uikit.feature.view.TRecyclerView;
import tb.m48;
import tb.rg3;
import tb.t2o;
import tb.ude;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class AbsListAdapter<MODEL> extends RecyclerView.Adapter<WidgetViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ListStyle f9340a;
    public final Activity b;
    public final ude c;
    public int d;
    public final m48 e = new m48(10001);
    public final m48 f = new m48(20001);
    public final rg3 g;
    public final MODEL h;

    static {
        t2o.a(993001828);
    }

    public AbsListAdapter(rg3 rg3Var, ListStyle listStyle, Activity activity, ude udeVar, int i, MODEL model) {
        this.g = rg3Var;
        this.f9340a = listStyle;
        this.b = activity;
        this.c = udeVar;
        this.d = i;
        this.h = model;
    }

    public static /* synthetic */ Object ipc$super(AbsListAdapter absListAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/list/AbsListAdapter");
    }

    public void M(int i, TRecyclerView tRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef07ac56", new Object[]{this, new Integer(i), tRecyclerView});
        } else {
            notifyItemRangeInserted((getItemCount() + tRecyclerView.getHeaderViewsCount()) - i, i);
        }
    }

    public void N(int i, int i2, TRecyclerView tRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11317c92", new Object[]{this, new Integer(i), new Integer(i2), tRecyclerView});
        } else {
            notifyItemRangeChanged(i + tRecyclerView.getHeaderViewsCount(), i2);
        }
    }

    public void O(TRecyclerView tRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4419296f", new Object[]{this, tRecyclerView});
            return;
        }
        int itemCount = getItemCount();
        int headerViewsCount = tRecyclerView.getHeaderViewsCount();
        if (tRecyclerView.getScrollState() != 0) {
            tRecyclerView.stopScroll();
        }
        notifyItemRangeRemoved(headerViewsCount, itemCount);
    }

    public abstract WidgetViewHolder P(ViewGroup viewGroup);

    public abstract WidgetViewHolder Q(ViewGroup viewGroup);

    public Activity S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        return this.b;
    }

    public int T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2fc1e058", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public abstract Object U(int i);

    public int V(BaseCellBean baseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("81353434", new Object[]{this, baseCellBean})).intValue();
        }
        if (baseCellBean == null) {
            return 0;
        }
        if (b0(baseCellBean)) {
            return this.e.a(baseCellBean, this.f9340a);
        }
        if (a0(baseCellBean)) {
            return this.f.a(baseCellBean, this.f9340a);
        }
        return this.g.d(this.f9340a, baseCellBean.getClass());
    }

    public MODEL W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MODEL) ipChange.ipc$dispatch("b4c825f8", new Object[]{this});
        }
        return this.h;
    }

    public ude X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ude) ipChange.ipc$dispatch("65261d7c", new Object[]{this});
        }
        return this.c;
    }

    public abstract BaseTypedBean Y(int i);

    public void Z(int i, int i2, TRecyclerView tRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db7176a9", new Object[]{this, new Integer(i), new Integer(i2), tRecyclerView});
        } else {
            notifyItemRangeInserted(i + tRecyclerView.getHeaderViewsCount(), i2);
        }
    }

    public abstract boolean a0(Object obj);

    public abstract boolean b0(Object obj);

    /* renamed from: c0 */
    public void onBindViewHolder(WidgetViewHolder widgetViewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a527b338", new Object[]{this, widgetViewHolder, new Integer(i)});
            return;
        }
        try {
            widgetViewHolder.b0(i, U(i));
        } catch (Exception e) {
            this.c.getCore().l().e("AbsListAdapter", "bind ViewHolder to data error", e);
        }
    }

    /* renamed from: d0 */
    public WidgetViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetViewHolder) ipChange.ipc$dispatch("25d6cb1c", new Object[]{this, viewGroup, new Integer(i)});
        }
        if (i >= 10001 && i < 20001) {
            WidgetViewHolder Q = Q(viewGroup);
            if (Q == null) {
                return this.g.b(i, this.b, this.c, viewGroup, this.d, this.h);
            }
            return Q;
        } else if (i < 20001) {
            return this.g.a(i, this.b, this.c, viewGroup, this.d, this.h);
        } else {
            WidgetViewHolder P = P(viewGroup);
            if (P == null) {
                return this.g.b(i, this.b, this.c, viewGroup, this.d, this.h);
            }
            return P;
        }
    }

    /* renamed from: e0 */
    public void onViewAttachedToWindow(WidgetViewHolder widgetViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6d4c771", new Object[]{this, widgetViewHolder});
        } else {
            widgetViewHolder.t0();
        }
    }

    /* renamed from: f0 */
    public void onViewDetachedFromWindow(WidgetViewHolder widgetViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74fe76ee", new Object[]{this, widgetViewHolder});
        } else {
            widgetViewHolder.x0();
        }
    }

    public ListStyle g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListStyle) ipChange.ipc$dispatch("fbfbe301", new Object[]{this});
        }
        return this.f9340a;
    }

    /* renamed from: g0 */
    public void onViewRecycled(WidgetViewHolder widgetViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f856f013", new Object[]{this, widgetViewHolder});
        } else {
            widgetViewHolder.C0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        Object U;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i >= getItemCount() || (U = U(i)) == null) {
            return 0;
        }
        if (b0(U)) {
            return this.e.a(Y(i), this.f9340a);
        }
        if (a0(U)) {
            return this.f.a(Y(i), this.f9340a);
        }
        return this.g.d(this.f9340a, U.getClass());
    }

    public void h0(int i, int i2, TRecyclerView tRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82b6d23e", new Object[]{this, new Integer(i), new Integer(i2), tRecyclerView});
        } else {
            notifyItemRangeRemoved(i + tRecyclerView.getHeaderViewsCount(), i2);
        }
    }

    public void i0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff5138b2", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public void j0(ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ee5655", new Object[]{this, listStyle});
        } else {
            this.f9340a = listStyle;
        }
    }
}
