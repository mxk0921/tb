package com.taobao.search.sf.widgets.list.listcell.tips;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.list.WidgetViewHolder;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.mmd.datasource.bean.AuctionListTipBean;
import com.taobao.taobao.R;
import tb.b64;
import tb.r4p;
import tb.t2o;
import tb.ude;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TipsCellWidget extends WidgetViewHolder<TipsCellBean, b64> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final TextView l = (TextView) this.itemView.findViewById(R.id.tv_tips);

    static {
        t2o.a(815793649);
    }

    public TipsCellWidget(int i, Activity activity, ude udeVar, ViewGroup viewGroup, ListStyle listStyle, int i2, b64 b64Var) {
        super(LayoutInflater.from(activity).inflate(i, viewGroup, false), activity, udeVar, listStyle, i2, b64Var);
    }

    public static /* synthetic */ Object ipc$super(TipsCellWidget tipsCellWidget, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/list/listcell/tips/TipsCellWidget");
    }

    /* renamed from: G0 */
    public void u0(int i, TipsCellBean tipsCellBean) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a108ef4", new Object[]{this, new Integer(i), tipsCellBean});
            return;
        }
        StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) this.itemView.getLayoutParams();
        if (!tipsCellBean.fullSpan && j0() != ListStyle.LIST) {
            z = false;
        }
        layoutParams.setFullSpan(z);
        H0(tipsCellBean.listTipBean, i);
    }

    public void H0(AuctionListTipBean auctionListTipBean, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7d8ce15", new Object[]{this, auctionListTipBean, new Integer(i)});
            return;
        }
        this.l.setText(auctionListTipBean.title);
        l0().e().setParam(r4p.KEY_RCMD_TIPS_SHOWED, "true");
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public String k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "TipsCellWidget";
    }
}
