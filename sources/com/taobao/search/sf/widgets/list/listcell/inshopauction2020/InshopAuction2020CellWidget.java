package com.taobao.search.sf.widgets.list.listcell.inshopauction2020;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import com.taobao.search.mmd.uikit.PriceView;
import com.taobao.search.sf.widgets.list.listcell.inshopauction.InshopAuctionCellBean;
import com.taobao.search.sf.widgets.list.listcell.inshopauction.InshopAuctionCellWidget;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.features.ImageShapeFeature;
import java.util.ArrayList;
import tb.b64;
import tb.ckf;
import tb.lwm;
import tb.o1p;
import tb.srl;
import tb.t2o;
import tb.ude;
import tb.zuo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class InshopAuction2020CellWidget extends InshopAuctionCellWidget {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public LinearLayout C;
    public TUrlImageView D;

    static {
        t2o.a(815793646);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InshopAuction2020CellWidget(int i, Activity activity, ude udeVar, ViewGroup viewGroup, ListStyle listStyle, int i2, b64 b64Var) {
        super(i, activity, udeVar, viewGroup, listStyle, i2, b64Var);
        ckf.g(activity, "activity");
        ckf.g(udeVar, a.MSG_SOURCE_PARENT);
        ckf.g(listStyle, "style");
    }

    public static /* synthetic */ Object ipc$super(InshopAuction2020CellWidget inshopAuction2020CellWidget, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1150075436:
                super.P0((AuctionBaseBean) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            case -248222782:
                super.u0(((Number) objArr[0]).intValue(), (InshopAuctionCellBean) objArr[1]);
                return null;
            case -3136315:
                super.N0();
                return null;
            case 375645545:
                super.K0((AuctionBaseBean) objArr[0], (PriceView) objArr[1]);
                return null;
            case 458514918:
                super.J0((AuctionBaseBean) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/list/listcell/inshopauction2020/InshopAuction2020CellWidget");
        }
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.baseauction.BaseAuctionCellWidget
    public void N0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        super.N0();
        this.C = (LinearLayout) this.itemView.findViewById(R.id.ll_sku_container);
        LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.ll_bottom_line);
        this.D = (TUrlImageView) this.itemView.findViewById(R.id.imv_top_icon);
        this.p.setOriginPriceSize(13);
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.inshopauction.InshopAuctionCellWidget, com.taobao.search.sf.widgets.list.listcell.baseauction.BaseAuctionCellWidget
    public void P0(AuctionBaseBean auctionBaseBean, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb733dd4", new Object[]{this, auctionBaseBean, new Integer(i), new Integer(i2)});
            return;
        }
        super.P0(auctionBaseBean, i, i2);
        View view = this.r;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.inshopauction.InshopAuctionCellWidget, com.taobao.search.sf.widgets.list.listcell.baseauction.BaseAuctionCellWidget
    public void R0(AuctionBaseBean auctionBaseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20c114b6", new Object[]{this, auctionBaseBean});
            return;
        }
        TextView textView = this.q;
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (j0() == ListStyle.LIST) {
            this.p.setAreaText(e1(auctionBaseBean));
        }
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.inshopauction.InshopAuctionCellWidget
    /* renamed from: g1 */
    public void u0(int i, InshopAuctionCellBean inshopAuctionCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1346bc2", new Object[]{this, new Integer(i), inshopAuctionCellBean});
            return;
        }
        super.u0(i, inshopAuctionCellBean);
        r1(inshopAuctionCellBean);
        s1(inshopAuctionCellBean);
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.inshopauction.InshopAuctionCellWidget
    public boolean n1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19bf64cc", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public final int p1(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("51d47844", new Object[]{this, new Integer(i)})).intValue();
        }
        return ((((zuo.e() - f1()) / 2) - (o1p.b(10) * 2)) - (i * 4)) / 5;
    }

    public final TUrlImageView q1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("5da91678", new Object[]{this});
        }
        TUrlImageView tUrlImageView = new TUrlImageView(getActivity());
        int b = o1p.b(10);
        int a2 = o1p.a(3.5f);
        int p1 = p1(a2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(p1, p1);
        layoutParams.setMargins(0, b, a2, 0);
        tUrlImageView.setLayoutParams(layoutParams);
        ImageShapeFeature imageShapeFeature = new ImageShapeFeature();
        imageShapeFeature.setShape(1);
        float b2 = o1p.b(3);
        imageShapeFeature.setCornerRadius(b2, b2, b2, b2);
        tUrlImageView.addFeature(imageShapeFeature);
        return tUrlImageView;
    }

    public final void r1(InshopAuctionCellBean inshopAuctionCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fb01899", new Object[]{this, inshopAuctionCellBean});
        } else if (j0() != ListStyle.LIST && (inshopAuctionCellBean instanceof InshopAuction2020CellBean)) {
            LinearLayout linearLayout = this.C;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
            }
            ArrayList<String> skuPics = ((InshopAuction2020CellBean) inshopAuctionCellBean).getSkuPics();
            if (skuPics != null) {
                for (String str : skuPics) {
                    TUrlImageView q1 = q1();
                    q1.setImageUrl(str);
                    LinearLayout linearLayout2 = this.C;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(q1);
                    }
                }
            }
        }
    }

    public final void s1(InshopAuctionCellBean inshopAuctionCellBean) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc02921", new Object[]{this, inshopAuctionCellBean});
            return;
        }
        TUrlImageView tUrlImageView = this.D;
        if (tUrlImageView != null) {
            tUrlImageView.setVisibility(8);
            if (inshopAuctionCellBean instanceof InshopAuction2020CellBean) {
                InshopAuction2020CellBean inshopAuction2020CellBean = (InshopAuction2020CellBean) inshopAuctionCellBean;
                if (!TextUtils.isEmpty(inshopAuction2020CellBean.getTopIconUrl()) && inshopAuction2020CellBean.getTopIconWidth() > 0 && inshopAuction2020CellBean.getTopIconHeight() > 0) {
                    TUrlImageView tUrlImageView2 = this.D;
                    if (tUrlImageView2 != null) {
                        tUrlImageView2.setImageUrl(inshopAuction2020CellBean.getTopIconUrl());
                        TUrlImageView tUrlImageView3 = this.D;
                        if (tUrlImageView3 != null) {
                            tUrlImageView3.setVisibility(0);
                            TUrlImageView tUrlImageView4 = this.D;
                            if (tUrlImageView4 != null) {
                                ViewGroup.LayoutParams layoutParams = tUrlImageView4.getLayoutParams();
                                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                } else {
                                    marginLayoutParams = null;
                                }
                                if (marginLayoutParams != null) {
                                    marginLayoutParams.width = o1p.b(inshopAuction2020CellBean.getTopIconWidth());
                                    marginLayoutParams.height = o1p.b(inshopAuction2020CellBean.getTopIconHeight());
                                    marginLayoutParams.leftMargin = o1p.b(inshopAuction2020CellBean.getTopIconLeft());
                                    marginLayoutParams.topMargin = o1p.b(inshopAuction2020CellBean.getTopIconTop());
                                    TUrlImageView tUrlImageView5 = this.D;
                                    if (tUrlImageView5 != null) {
                                        tUrlImageView5.requestLayout();
                                    } else {
                                        ckf.y("mImvTopIcon");
                                        throw null;
                                    }
                                }
                            } else {
                                ckf.y("mImvTopIcon");
                                throw null;
                            }
                        } else {
                            ckf.y("mImvTopIcon");
                            throw null;
                        }
                    } else {
                        ckf.y("mImvTopIcon");
                        throw null;
                    }
                }
            }
        } else {
            ckf.y("mImvTopIcon");
            throw null;
        }
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.baseauction.BaseAuctionCellWidget
    public void J0(AuctionBaseBean auctionBaseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b5461e6", new Object[]{this, auctionBaseBean});
            return;
        }
        ckf.g(auctionBaseBean, "dataObject");
        super.J0(auctionBaseBean);
        this.p.setPriceIconSuffix(auctionBaseBean.priceIconSuffixText);
        if (TextUtils.isEmpty(auctionBaseBean.originPrice)) {
            this.p.setOriginPrice("", false);
        } else {
            PriceView priceView = this.p;
            priceView.setOriginPrice(lwm.unit + auctionBaseBean.originPrice, auctionBaseBean.hidePriceUndline);
        }
        if (!TextUtils.isEmpty(auctionBaseBean.priceIconSuffixColor)) {
            this.p.setIconSuffixColor(srl.c(auctionBaseBean.priceIconSuffixColor, -1));
        }
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.baseauction.BaseAuctionCellWidget
    public void K0(AuctionBaseBean auctionBaseBean, PriceView priceView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1663e569", new Object[]{this, auctionBaseBean, priceView});
            return;
        }
        ckf.g(auctionBaseBean, "dataObject");
        super.K0(auctionBaseBean, priceView);
        this.p.setPriceIconSuffix(auctionBaseBean.priceIconSuffixText);
        if (TextUtils.isEmpty(auctionBaseBean.originPrice)) {
            this.p.setOriginPrice("", false);
        } else {
            PriceView priceView2 = this.p;
            priceView2.setOriginPrice(lwm.unit + auctionBaseBean.originPrice, auctionBaseBean.hidePriceUndline);
        }
        if (!TextUtils.isEmpty(auctionBaseBean.priceIconSuffixColor)) {
            this.p.setIconSuffixColor(srl.c(auctionBaseBean.priceIconSuffixColor, -1));
        }
    }
}
