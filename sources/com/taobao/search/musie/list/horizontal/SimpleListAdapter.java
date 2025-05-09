package com.taobao.search.musie.list.horizontal;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.common.list.BaseListAdapter;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.list.WidgetViewHolder;
import com.taobao.android.searchbaseframe.util.ListStyle;
import java.util.List;
import tb.acx;
import tb.ay4;
import tb.bsi;
import tb.ckf;
import tb.jrh;
import tb.t2o;
import tb.ude;
import tb.w02;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class SimpleListAdapter extends BaseListAdapter<acx<jrh>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<? extends BaseCellBean> i;
    public final bsi j;
    public int k;

    static {
        t2o.a(815792740);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleListAdapter(Activity activity, ude udeVar, acx<jrh> acxVar, List<? extends BaseCellBean> list, bsi bsiVar) {
        super(ListStyle.WATERFALL, activity, udeVar, acxVar, 0);
        ckf.g(activity, "activity");
        ckf.g(udeVar, "widgetHolder");
        ckf.g(acxVar, "model");
        ckf.g(list, "items");
        ckf.g(bsiVar, "metaConfig");
        this.i = list;
        this.j = bsiVar;
    }

    public static /* synthetic */ Object ipc$super(SimpleListAdapter simpleListAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/list/horizontal/SimpleListAdapter");
    }

    @Override // com.taobao.android.searchbaseframe.business.common.list.BaseListAdapter, com.taobao.android.searchbaseframe.list.AbsListAdapter
    public Object U(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8c1ae5e9", new Object[]{this, new Integer(i)});
        }
        return this.i.get(i);
    }

    @Override // com.taobao.android.searchbaseframe.business.common.list.BaseListAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return this.i.size();
    }

    @Override // com.taobao.android.searchbaseframe.business.common.list.BaseListAdapter
    public WidgetViewHolder<?, ?> l0(w02 w02Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetViewHolder) ipChange.ipc$dispatch("dc03348f", new Object[]{this, w02Var});
        }
        ay4<w02, WidgetViewHolder<?, ?>> L = this.j.L();
        ckf.d(L);
        WidgetViewHolder<?, ?> a2 = L.a(w02Var);
        WidgetViewHolder<?, ?> widgetViewHolder = a2;
        if (this.k > 0) {
            widgetViewHolder.itemView.getLayoutParams().width = this.k;
        }
        ckf.f(a2, "also(...)");
        return a2;
    }

    @Override // com.taobao.android.searchbaseframe.business.common.list.BaseListAdapter
    public WidgetViewHolder<?, ?> m0(w02 w02Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetViewHolder) ipChange.ipc$dispatch("184faa8b", new Object[]{this, w02Var});
        }
        ay4<w02, WidgetViewHolder<?, ?>> n0 = this.j.n0();
        ckf.d(n0);
        WidgetViewHolder<?, ?> a2 = n0.a(w02Var);
        ckf.f(a2, "create(...)");
        return a2;
    }

    public final void o0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1be0dcb", new Object[]{this, new Integer(i)});
        } else {
            this.k = i;
        }
    }

    public final void setItems(List<? extends BaseCellBean> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba1ea0f6", new Object[]{this, list});
            return;
        }
        ckf.g(list, "<set-?>");
        this.i = list;
    }
}
