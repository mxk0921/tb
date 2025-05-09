package com.taobao.search.sf.widgets.list.listcell.baseauction;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.common.uikit.SearchUrlImageView;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import com.taobao.search.mmd.uikit.PriceView;
import com.taobao.search.mmd.uikit.iconlist.IconListView;
import com.taobao.search.sf.DecorationProvider;
import com.taobao.search.sf.realtimetag.IRealTimeTagContainer;
import com.taobao.search.sf.widgets.list.listcell.SearchBaseAuctionCellWidget;
import com.taobao.search.sf.widgets.list.listcell.baseauction.SFAuctionBaseCellBean;
import com.taobao.taobao.R;
import tb.b64;
import tb.lh1;
import tb.nh1;
import tb.oh1;
import tb.ph1;
import tb.qh1;
import tb.t2o;
import tb.tt3;
import tb.ude;
import tb.vyd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class BaseAuctionCellWidget<BEAN extends SFAuctionBaseCellBean> extends SearchBaseAuctionCellWidget<BEAN> implements IRealTimeTagContainer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public SearchUrlImageView m;
    public TextView n;
    public ImageView o;
    public PriceView p;
    public TextView q;
    public View r;
    public IconListView s;
    public ViewGroup t;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f11710a;

        public a(BaseAuctionCellWidget baseAuctionCellWidget, View view) {
            this.f11710a = view;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5acfbc33", new Object[]{this})).booleanValue();
            }
            this.f11710a.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    static {
        t2o.a(815793624);
        t2o.a(815793449);
    }

    public BaseAuctionCellWidget(View view, Activity activity, ude udeVar, ListStyle listStyle, int i, b64 b64Var) {
        super(view, activity, udeVar, listStyle, i, b64Var);
        N0();
    }

    public static /* synthetic */ Object ipc$super(BaseAuctionCellWidget baseAuctionCellWidget, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/list/listcell/baseauction/BaseAuctionCellWidget");
    }

    public void J0(AuctionBaseBean auctionBaseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b5461e6", new Object[]{this, auctionBaseBean});
        } else {
            oh1.a(auctionBaseBean, this.p);
        }
    }

    public void K0(AuctionBaseBean auctionBaseBean, PriceView priceView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1663e569", new Object[]{this, auctionBaseBean, priceView});
            return;
        }
        oh1.a(auctionBaseBean, priceView);
        String str = auctionBaseBean.price;
        if (str != null && str.length() > 11) {
            ph1.b(priceView);
        }
    }

    public SearchUrlImageView L0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchUrlImageView) ipChange.ipc$dispatch("7cc1525d", new Object[]{this});
        }
        return this.m;
    }

    public int M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("942f81fd", new Object[]{this})).intValue();
        }
        return 1;
    }

    public void N0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        this.m = (SearchUrlImageView) this.itemView.findViewById(R.id.goodsimage);
        this.n = (TextView) this.itemView.findViewById(R.id.title);
        this.o = (ImageView) this.itemView.findViewById(R.id.corner_icon);
        this.p = (PriceView) this.itemView.findViewById(R.id.priceBlock);
        this.r = this.itemView.findViewById(R.id.add_cart_btn);
        this.q = (TextView) this.itemView.findViewById(R.id.sales_area);
        this.s = (IconListView) this.itemView.findViewById(R.id.icon_list_row);
        this.t = (ViewGroup) this.itemView.findViewById(R.id.realtime_tag_container);
        if (com.taobao.search.mmd.datasource.bean.ListStyle.convertFromSFStyle(j0()) == com.taobao.search.mmd.datasource.bean.ListStyle.LIST) {
            this.n.setLines(2);
        } else {
            this.n.setMaxLines(M0());
        }
    }

    public final void O0(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72f47fcd", new Object[]{this, view});
        } else {
            view.getViewTreeObserver().addOnPreDrawListener(new a(this, view));
        }
    }

    public void P0(AuctionBaseBean auctionBaseBean, int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb733dd4", new Object[]{this, auctionBaseBean, new Integer(i), new Integer(i2)});
            return;
        }
        ude parent = o0().getParent();
        if (!(parent instanceof vyd) || !((vyd) parent).Q()) {
            i3 = lh1.a();
        } else {
            i3 = DecorationProvider.Tb2021Decoration.REM12 * 3;
        }
        nh1.b(this.m, auctionBaseBean, com.taobao.search.mmd.datasource.bean.ListStyle.convertFromSFStyle(j0()), i3);
        nh1.d(this.o, auctionBaseBean);
        qh1.i(this.n, auctionBaseBean, com.taobao.search.mmd.datasource.bean.ListStyle.convertFromSFStyle(j0()));
        T0(auctionBaseBean);
        R0(auctionBaseBean);
        S0(auctionBaseBean);
        Q0(auctionBaseBean);
        if (i == 0) {
            O0(this.itemView);
        }
    }

    public void Q0(AuctionBaseBean auctionBaseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78d84d3d", new Object[]{this, auctionBaseBean});
        } else {
            this.s.render(auctionBaseBean.listIconArray);
        }
    }

    public void R0(AuctionBaseBean auctionBaseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20c114b6", new Object[]{this, auctionBaseBean});
        } else {
            this.q.setVisibility(0);
        }
    }

    public final void S0(AuctionBaseBean auctionBaseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("647d9a90", new Object[]{this, auctionBaseBean});
        } else if (j0() == ListStyle.LIST) {
            J0(auctionBaseBean);
        } else {
            K0(auctionBaseBean, this.p);
        }
    }

    public void T0(AuctionBaseBean auctionBaseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5497f05", new Object[]{this, auctionBaseBean});
        } else {
            ph1.a(this.p, auctionBaseBean);
        }
    }

    public void U0(Context context, AuctionBaseBean auctionBaseBean, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1aabf3ee", new Object[]{this, context, auctionBaseBean, new Boolean(z)});
            return;
        }
        if (z) {
            tt3.d().f(l0().e().getTab(), auctionBaseBean.itemId, String.valueOf(System.currentTimeMillis()));
        }
        auctionBaseBean.isClicked = true;
        TextView textView = this.n;
        if (textView != null) {
            textView.setTextColor(context.getResources().getColor(R.color.list_item_click_title_color));
        }
    }

    @Override // com.taobao.search.sf.realtimetag.IRealTimeTagContainer
    public void clearTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a22e8814", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.t;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
    }

    @Override // com.taobao.search.sf.realtimetag.IRealTimeTagContainer
    public ListStyle getContainerListStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListStyle) ipChange.ipc$dispatch("1c77b9ec", new Object[]{this});
        }
        return j0();
    }
}
