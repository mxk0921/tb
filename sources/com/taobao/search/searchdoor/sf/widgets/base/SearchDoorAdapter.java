package com.taobao.search.searchdoor.sf.widgets.base;

import android.app.Activity;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.list.AbsListAdapter;
import com.taobao.android.searchbaseframe.list.WidgetViewHolder;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.xsearchplugin.weex.list.AbsWeexViewHolder;
import com.taobao.search.searchdoor.sf.widgets.activate.cells.MuiseActivateCellViewHolder;
import com.taobao.search.searchdoor.sf.widgets.activate.cells.WeexActivateCellViewHolder;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.MuiseActivateCellBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.WeexActivateCellBean;
import java.util.ArrayList;
import java.util.List;
import tb.c2p;
import tb.rg3;
import tb.t2o;
import tb.ude;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class SearchDoorAdapter<MODEL extends c2p, BEAN> extends AbsListAdapter<MODEL> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ArrayList<BEAN> i = new ArrayList<>();

    static {
        t2o.a(815793212);
    }

    public SearchDoorAdapter(rg3 rg3Var, ListStyle listStyle, Activity activity, ude udeVar, MODEL model) {
        super(rg3Var, listStyle, activity, udeVar, 0, model);
    }

    public static /* synthetic */ Object ipc$super(SearchDoorAdapter searchDoorAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/base/SearchDoorAdapter");
    }

    @Override // com.taobao.android.searchbaseframe.list.AbsListAdapter
    public WidgetViewHolder P(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetViewHolder) ipChange.ipc$dispatch("771e3c5f", new Object[]{this, viewGroup});
        }
        return new MuiseActivateCellViewHolder(S(), X(), g(), viewGroup, T(), (c2p) W());
    }

    @Override // com.taobao.android.searchbaseframe.list.AbsListAdapter
    public Object U(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8c1ae5e9", new Object[]{this, new Integer(i)});
        }
        if (i < getItemCount()) {
            return this.i.get(i);
        }
        return null;
    }

    @Override // com.taobao.android.searchbaseframe.list.AbsListAdapter
    public BaseTypedBean Y(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseTypedBean) ipChange.ipc$dispatch("68efbf7", new Object[]{this, new Integer(i)});
        }
        Object U = U(i);
        if (U instanceof WeexActivateCellBean) {
            return ((WeexActivateCellBean) U).weexBean;
        }
        if (U instanceof MuiseActivateCellBean) {
            return ((MuiseActivateCellBean) U).muiseBean;
        }
        return null;
    }

    @Override // com.taobao.android.searchbaseframe.list.AbsListAdapter
    public boolean a0(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("467bc20a", new Object[]{this, obj})).booleanValue();
        }
        return obj instanceof MuiseActivateCellBean;
    }

    @Override // com.taobao.android.searchbaseframe.list.AbsListAdapter
    public boolean b0(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cdc5090c", new Object[]{this, obj})).booleanValue();
        }
        return obj instanceof WeexActivateCellBean;
    }

    public List<? extends BEAN> getDataList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6fd2c942", new Object[]{this});
        }
        return this.i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return this.i.size();
    }

    /* renamed from: k0 */
    public AbsWeexViewHolder Q(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbsWeexViewHolder) ipChange.ipc$dispatch("3f34eb5f", new Object[]{this, viewGroup});
        }
        rg3.c cVar = new rg3.c();
        cVar.f27354a = S();
        cVar.f = W();
        cVar.e = T();
        cVar.d = g();
        cVar.b = X();
        cVar.c = viewGroup;
        return WeexActivateCellViewHolder.CREATOR.a(cVar);
    }

    public void l0(int i, BEAN bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("485cc94c", new Object[]{this, new Integer(i), bean});
        } else if (i >= 0 && i <= this.i.size()) {
            this.i.add(i, bean);
            notifyItemInserted(i);
        }
    }

    public void m0(List<? extends BEAN> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6fb4449", new Object[]{this, list});
        } else if (list != null) {
            this.i.clear();
            this.i.addAll(list);
            notifyDataSetChanged();
        }
    }

    public void n0(int i, BEAN bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38e4093c", new Object[]{this, new Integer(i), bean});
        } else if (this.i.size() <= 0) {
            l0(i, bean);
        } else if (i >= 0 && i < this.i.size()) {
            this.i.set(i, bean);
            notifyItemChanged(i);
        }
    }
}
