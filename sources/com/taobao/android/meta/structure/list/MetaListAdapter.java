package com.taobao.android.meta.structure.list;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.data.a;
import com.taobao.android.searchbaseframe.list.WidgetViewHolder;
import com.taobao.android.searchbaseframe.meta.list.BaseMetaListAdapter;
import com.taobao.android.searchbaseframe.util.ListStyle;
import tb.acx;
import tb.asi;
import tb.ay4;
import tb.bsi;
import tb.ckf;
import tb.t2o;
import tb.ude;
import tb.w02;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class MetaListAdapter extends BaseMetaListAdapter<acx<? extends a<? extends asi, MetaResult<? extends asi>>>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final bsi l;

    static {
        t2o.a(993001527);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetaListAdapter(ListStyle listStyle, Activity activity, ude udeVar, acx<? extends a<? extends asi, MetaResult<? extends asi>>> acxVar, int i, bsi bsiVar) {
        super(listStyle, activity, udeVar, acxVar, i);
        ckf.g(listStyle, "listStyle");
        ckf.g(activity, "activity");
        ckf.g(udeVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        ckf.g(acxVar, "model");
        ckf.g(bsiVar, "config");
        this.l = bsiVar;
    }

    public static /* synthetic */ Object ipc$super(MetaListAdapter metaListAdapter, String str, Object... objArr) {
        if (str.hashCode() == 431080268) {
            return new Long(super.getItemId(((Number) objArr[0]).intValue()));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/meta/structure/list/MetaListAdapter");
    }

    @Override // com.taobao.android.searchbaseframe.xsl.list.cell.BaseXslListAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
        }
        return super.getItemId(i);
    }

    @Override // com.taobao.android.searchbaseframe.xsl.list.cell.BaseXslListAdapter, com.taobao.android.searchbaseframe.business.common.list.BaseListAdapter
    public WidgetViewHolder<?, ?> l0(w02 w02Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetViewHolder) ipChange.ipc$dispatch("dc03348f", new Object[]{this, w02Var});
        }
        ay4<w02, WidgetViewHolder<?, ?>> L = this.l.L();
        ckf.d(L);
        WidgetViewHolder<?, ?> a2 = L.a(w02Var);
        ckf.f(a2, "create(...)");
        return a2;
    }

    @Override // com.taobao.android.searchbaseframe.xsl.list.cell.BaseXslListAdapter, com.taobao.android.searchbaseframe.business.common.list.BaseListAdapter
    public WidgetViewHolder<?, ?> m0(w02 w02Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetViewHolder) ipChange.ipc$dispatch("184faa8b", new Object[]{this, w02Var});
        }
        ay4<w02, WidgetViewHolder<?, ?>> n0 = this.l.n0();
        ckf.d(n0);
        WidgetViewHolder<?, ?> a2 = n0.a(w02Var);
        ckf.f(a2, "create(...)");
        return a2;
    }
}
