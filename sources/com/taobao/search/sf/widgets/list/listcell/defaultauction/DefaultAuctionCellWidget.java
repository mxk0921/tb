package com.taobao.search.sf.widgets.list.listcell.defaultauction;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.searchbaseframe.list.WidgetViewHolder;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.schedule.ViewProxy;
import com.taobao.search.common.uikit.SearchUrlImageView;
import com.taobao.search.mmd.uikit.PriceView;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;
import tb.b64;
import tb.c2v;
import tb.ckf;
import tb.ngj;
import tb.t2o;
import tb.ude;
import tb.zzo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class DefaultAuctionCellWidget extends WidgetViewHolder<DefaultAuctionCellBean, b64> implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final TextView l;
    public final PriceView m;
    public final SearchUrlImageView n;
    public DefaultAuctionCellBean o;
    public int p = -1;

    static {
        t2o.a(815793634);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultAuctionCellWidget(View view, Activity activity, ude udeVar, ListStyle listStyle, int i) {
        super(view, activity, udeVar, listStyle, i, null);
        ckf.g(activity, "activity");
        ckf.g(udeVar, a.MSG_SOURCE_PARENT);
        ckf.g(listStyle, "style");
        this.l = (TextView) view.findViewById(R.id.tv_title);
        PriceView priceView = (PriceView) view.findViewById(R.id.view_price);
        this.m = priceView;
        if (priceView != null) {
            priceView.setOriginPriceSize(12);
        }
        this.n = (SearchUrlImageView) view.findViewById(R.id.iv_auction_pic);
        ViewProxy.setOnClickListener(view, this);
    }

    public static /* synthetic */ Object ipc$super(DefaultAuctionCellWidget defaultAuctionCellWidget, String str, Object... objArr) {
        if (str.hashCode() == 1626033557) {
            super.t0();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/list/listcell/defaultauction/DefaultAuctionCellWidget");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bf, code lost:
        if (r8 != null) goto L_0x00c2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c2, code lost:
        r3 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ce, code lost:
        if (r8 != null) goto L_0x00c2;
     */
    /* renamed from: G0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void u0(int r7, com.taobao.search.sf.widgets.list.listcell.defaultauction.DefaultAuctionCellBean r8) {
        /*
            r6 = this;
            r0 = 0
            r1 = 3
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.search.sf.widgets.list.listcell.defaultauction.DefaultAuctionCellWidget.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001d
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r7)
            java.lang.Object[] r7 = new java.lang.Object[r1]
            r7[r0] = r6
            r0 = 1
            r7[r0] = r3
            r0 = 2
            r7[r0] = r8
            java.lang.String r8 = "cc432c94"
            r2.ipc$dispatch(r8, r7)
            return
        L_0x001d:
            r6.p = r7
            r6.o = r8
            android.widget.TextView r7 = r6.l
            r2 = 0
            if (r7 == 0) goto L_0x0031
            if (r8 == 0) goto L_0x002d
            java.lang.String r3 = r8.getTitle()
            goto L_0x002e
        L_0x002d:
            r3 = r2
        L_0x002e:
            r7.setText(r3)
        L_0x0031:
            com.taobao.search.mmd.uikit.PriceView r7 = r6.m
            java.lang.String r3 = ""
            if (r7 == 0) goto L_0x0065
            if (r8 == 0) goto L_0x003e
            java.lang.String r4 = r8.getPrice()
            goto L_0x003f
        L_0x003e:
            r4 = r2
        L_0x003f:
            if (r4 == 0) goto L_0x0047
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0049
        L_0x0047:
            r0 = 8
        L_0x0049:
            r7.setVisibility(r0)
            if (r8 == 0) goto L_0x0053
            java.lang.String r0 = r8.getPriceUnit()
            goto L_0x0054
        L_0x0053:
            r0 = r2
        L_0x0054:
            r7.setUnitText(r0)
            r7.setPrefixText(r3)
            if (r8 == 0) goto L_0x0061
            java.lang.String r0 = r8.getPrice()
            goto L_0x0062
        L_0x0061:
            r0 = r2
        L_0x0062:
            tb.oh1.c(r0, r7)
        L_0x0065:
            com.taobao.search.common.uikit.SearchUrlImageView r7 = r6.n
            if (r7 == 0) goto L_0x00d6
            int r0 = com.taobao.taobao.R.drawable.tbsearch_android_list_img_placeholder
            r7.setPlaceHoldImageResId(r0)
            com.taobao.android.searchbaseframe.util.ListStyle r0 = r6.j0()
            com.taobao.android.searchbaseframe.util.ListStyle r4 = com.taobao.android.searchbaseframe.util.ListStyle.LIST
            if (r0 != r4) goto L_0x0080
            if (r8 == 0) goto L_0x007c
            java.lang.String r2 = r8.getImg()
        L_0x007c:
            r7.setImageUrl(r2)
            goto L_0x00d6
        L_0x0080:
            java.lang.Object r0 = r6.getData()
            com.taobao.search.sf.widgets.list.listcell.defaultauction.DefaultAuctionCellBean r0 = (com.taobao.search.sf.widgets.list.listcell.defaultauction.DefaultAuctionCellBean) r0
            java.lang.String r0 = r0.getUprightImgAspectRatio()
            r4 = 1059760811(0x3f2aaaab, float:0.6666667)
            float r0 = tb.qrl.d(r0, r4)
            android.view.ViewGroup$LayoutParams r4 = r7.getLayoutParams()
            java.lang.String r5 = "getLayoutParams(...)"
            tb.ckf.f(r4, r5)
            int r5 = com.taobao.search.sf.DecorationProvider.Tb2021Decoration.REM12
            int r5 = r5 * 3
            int r1 = tb.nh1.a(r4, r5)
            r4.width = r1
            if (r8 == 0) goto L_0x00ab
            java.lang.String r2 = r8.getUprightImg()
        L_0x00ab:
            if (r2 == 0) goto L_0x00c4
            int r2 = r2.length()
            if (r2 != 0) goto L_0x00b4
            goto L_0x00c4
        L_0x00b4:
            float r1 = (float) r1
            float r1 = r1 / r0
            int r0 = (int) r1
            r4.height = r0
            if (r8 == 0) goto L_0x00d0
            java.lang.String r8 = r8.getUprightImg()
            if (r8 != 0) goto L_0x00c2
            goto L_0x00d0
        L_0x00c2:
            r3 = r8
            goto L_0x00d0
        L_0x00c4:
            int r0 = r4.width
            r4.height = r0
            if (r8 == 0) goto L_0x00d0
            java.lang.String r8 = r8.getImg()
            if (r8 != 0) goto L_0x00c2
        L_0x00d0:
            r7.setLayoutParams(r4)
            r7.setImageUrl(r3)
        L_0x00d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.sf.widgets.list.listcell.defaultauction.DefaultAuctionCellWidget.u0(int, com.taobao.search.sf.widgets.list.listcell.defaultauction.DefaultAuctionCellBean):void");
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public String k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return DefaultAuctionCellWidget.class.getSimpleName();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        DefaultAuctionCellBean defaultAuctionCellBean = this.o;
        if (defaultAuctionCellBean != null) {
            str = defaultAuctionCellBean.getAuctionUrl();
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            Nav.from(this.f9341a).toUri(str);
        }
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.t0();
        DefaultAuctionCellBean defaultAuctionCellBean = this.o;
        if (defaultAuctionCellBean != null && !defaultAuctionCellBean.isExposed) {
            if (defaultAuctionCellBean != null) {
                defaultAuctionCellBean.isExposed = true;
            }
            String currentPageName = c2v.getInstance().getCurrentPageName();
            DefaultAuctionCellBean defaultAuctionCellBean2 = this.o;
            String str = null;
            Map<String, String> uTParams = defaultAuctionCellBean2 != null ? defaultAuctionCellBean2.getUTParams(this.p) : null;
            HashMap hashMap = new HashMap();
            hashMap.put("utLogMap", ngj.a(JSON.toJSONString(uTParams), "utf-8"));
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(currentPageName, 2201, "Search-ItemExposure", "", "", hashMap).build());
            zzo.e a2 = zzo.e.a();
            DefaultAuctionCellBean defaultAuctionCellBean3 = this.o;
            String str2 = defaultAuctionCellBean3 != null ? defaultAuctionCellBean3.type : null;
            if (defaultAuctionCellBean3 != null) {
                str = defaultAuctionCellBean3.getOriginTItemType();
            }
            a2.b(currentPageName, str2, str);
        }
    }
}
