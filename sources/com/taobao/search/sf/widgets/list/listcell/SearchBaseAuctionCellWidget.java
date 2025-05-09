package com.taobao.search.sf.widgets.list.listcell;

import android.app.Activity;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.list.WidgetViewHolder;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.widgets.list.listcell.baseauction.SFAuctionBaseCellBean;
import com.taobao.uikit.feature.view.TRecyclerView;
import java.util.Map;
import tb.b64;
import tb.h6p;
import tb.kp8;
import tb.og3;
import tb.t2o;
import tb.ude;
import tb.yw1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class SearchBaseAuctionCellWidget<BEAN extends SFAuctionBaseCellBean> extends WidgetViewHolder<BEAN, b64> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public long l;

    static {
        t2o.a(815793623);
    }

    public SearchBaseAuctionCellWidget(View view, Activity activity, ude udeVar, ListStyle listStyle, int i, b64 b64Var) {
        super(view, activity, udeVar, listStyle, i, b64Var);
    }

    public static /* synthetic */ Object ipc$super(SearchBaseAuctionCellWidget searchBaseAuctionCellWidget, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.x0();
            return null;
        } else if (hashCode == 1626033557) {
            super.t0();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/sf/widgets/list/listcell/SearchBaseAuctionCellWidget");
        }
    }

    public Map<String, String> G0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a7a04a77", new Object[]{this});
        }
        return null;
    }

    public Map<String, String> H0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6ea683ad", new Object[]{this});
        }
        return null;
    }

    public final int I0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c923e81e", new Object[]{this})).intValue();
        }
        try {
            return getLayoutPosition() - ((TRecyclerView) ((yw1) getParent()).A2()).getHeaderViewsCount();
        } catch (Throwable unused) {
            return getLayoutPosition();
        }
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void t0() {
        CommonBaseDatasource commonBaseDatasource;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.t0();
        if (getData() != 0) {
            this.l = System.currentTimeMillis();
            if (l0() != null) {
                commonBaseDatasource = l0().e();
            } else {
                commonBaseDatasource = null;
            }
            kp8.b((BaseCellBean) getData(), ((SFAuctionBaseCellBean) getData()).auctionBaseBean, ((SFAuctionBaseCellBean) getData()).pageInfo, commonBaseDatasource, i0(), G0(), H0());
            h6p.b(((SFAuctionBaseCellBean) getData()).auctionBaseBean, i0(), commonBaseDatasource, this.itemView);
            if (commonBaseDatasource != null && (getParent() instanceof og3)) {
                ((og3) getParent()).n1(i0(), (BaseTypedBean) getData(), (CommonSearchResult) commonBaseDatasource.getTotalSearchResult(), commonBaseDatasource);
            }
        }
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void x0() {
        CommonBaseDatasource commonBaseDatasource;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.x0();
        if (getData() != 0) {
            h6p.e(((SFAuctionBaseCellBean) getData()).auctionBaseBean, this.itemView);
            if (l0() != null) {
                commonBaseDatasource = l0().e();
            } else {
                commonBaseDatasource = null;
            }
            if (commonBaseDatasource != null && (getParent() instanceof og3)) {
                ((og3) getParent()).u0(i0(), (BaseTypedBean) getData(), System.currentTimeMillis() - this.l, (CommonSearchResult) commonBaseDatasource.getTotalSearchResult(), commonBaseDatasource);
            }
        }
    }
}
