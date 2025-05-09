package com.taobao.android.searchbaseframe.business.common.list;

import android.app.Activity;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.list.AbsListAdapter;
import com.taobao.android.searchbaseframe.list.WidgetViewHolder;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.weex_framework.MUSAppMonitor;
import tb.acx;
import tb.o02;
import tb.t2o;
import tb.ude;
import tb.w02;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class BaseListAdapter<MODEL extends acx<? extends o02<? extends BaseSearchResult, ?>>> extends AbsListAdapter<MODEL> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001632);
    }

    public BaseListAdapter(ListStyle listStyle, Activity activity, ude udeVar, MODEL model, int i) {
        super(udeVar.getCore().a(), listStyle, activity, udeVar, i, model);
        udeVar.getCore();
    }

    public static /* synthetic */ Object ipc$super(BaseListAdapter baseListAdapter, String str, Object... objArr) {
        if (str.hashCode() == -1524124872) {
            super.onBindViewHolder((WidgetViewHolder) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/business/common/list/BaseListAdapter");
    }

    @Override // com.taobao.android.searchbaseframe.list.AbsListAdapter
    public WidgetViewHolder P(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetViewHolder) ipChange.ipc$dispatch("771e3c5f", new Object[]{this, viewGroup});
        }
        w02 w02Var = new w02(S(), X(), (acx) W(), g(), T());
        w02Var.a(viewGroup);
        return l0(w02Var);
    }

    @Override // com.taobao.android.searchbaseframe.list.AbsListAdapter
    public WidgetViewHolder Q(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetViewHolder) ipChange.ipc$dispatch("15e56eb9", new Object[]{this, viewGroup});
        }
        w02 w02Var = new w02(S(), X(), (acx) W(), g(), T());
        w02Var.a(viewGroup);
        return m0(w02Var);
    }

    @Override // com.taobao.android.searchbaseframe.list.AbsListAdapter
    public Object U(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8c1ae5e9", new Object[]{this, new Integer(i)});
        }
        BaseSearchResult baseSearchResult = (BaseSearchResult) ((acx) W()).e().getTotalSearchResult();
        if (baseSearchResult == null) {
            return null;
        }
        return baseSearchResult.getCell(i);
    }

    @Override // com.taobao.android.searchbaseframe.list.AbsListAdapter
    public BaseTypedBean Y(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseTypedBean) ipChange.ipc$dispatch("68efbf7", new Object[]{this, new Integer(i)});
        }
        return (BaseTypedBean) U(i);
    }

    @Override // com.taobao.android.searchbaseframe.list.AbsListAdapter
    public boolean a0(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("467bc20a", new Object[]{this, obj})).booleanValue();
        }
        return obj instanceof MuiseCellBean;
    }

    @Override // com.taobao.android.searchbaseframe.list.AbsListAdapter
    public boolean b0(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cdc5090c", new Object[]{this, obj})).booleanValue();
        }
        return obj instanceof WeexCellBean;
    }

    @Override // com.taobao.android.searchbaseframe.list.AbsListAdapter
    /* renamed from: c0 */
    public void onBindViewHolder(WidgetViewHolder widgetViewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a527b338", new Object[]{this, widgetViewHolder, new Integer(i)});
            return;
        }
        super.onBindViewHolder(widgetViewHolder, i);
        BaseTypedBean Y = Y(i);
        if (Y.xsearchIsDowngrade) {
            MUSAppMonitor.b(Y.xsearchDowngradeInfo, Y.type, "");
        }
        ((acx) W()).d().s();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        BaseSearchResult baseSearchResult = (BaseSearchResult) ((acx) W()).e().getTotalSearchResult();
        if (baseSearchResult == null || baseSearchResult.isFailed()) {
            return 0;
        }
        return baseSearchResult.getCellsCount();
    }

    public boolean k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b82ab73", new Object[]{this})).booleanValue();
        }
        BaseSearchResult baseSearchResult = (BaseSearchResult) ((acx) W()).e().getTotalSearchResult();
        if (baseSearchResult == null) {
            return false;
        }
        return baseSearchResult.hasSections();
    }

    public abstract WidgetViewHolder l0(w02 w02Var);

    public abstract WidgetViewHolder m0(w02 w02Var);
}
