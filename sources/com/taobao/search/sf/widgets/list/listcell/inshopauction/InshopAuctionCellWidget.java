package com.taobao.search.sf.widgets.list.listcell.inshopauction;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.collection.ArrayMap;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.schedule.ViewProxy;
import com.taobao.search.common.uikit.SearchUrlImageView;
import com.taobao.search.common.uikit.SummaryTipsView;
import com.taobao.search.jarvis.bean.DynamicCardBean;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import com.taobao.search.mmd.datasource.bean.IconBean;
import com.taobao.search.mmd.datasource.bean.InshopAuctionRadiusBean;
import com.taobao.search.sf.DecorationProvider;
import com.taobao.search.sf.InshopResultActivity;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.widgets.list.listcell.baseauction.BaseAuctionCellWidget;
import com.taobao.search.sf.widgets.list.listcell.baseauction.SFAuctionBaseCellBean;
import com.taobao.tao.util.StringUtil;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.ayf;
import tb.b64;
import tb.f1p;
import tb.g6p;
import tb.h6p;
import tb.jtf;
import tb.lh1;
import tb.oen;
import tb.okn;
import tb.pkn;
import tb.sen;
import tb.t2o;
import tb.tnd;
import tb.ude;
import tb.vlo;
import tb.vyd;
import tb.wg3;
import tb.xjh;
import tb.yj4;
import tb.zuo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class InshopAuctionCellWidget extends BaseAuctionCellWidget<InshopAuctionCellBean> implements View.OnClickListener, View.OnTouchListener, wg3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SHOP_ALL = "SHOPALL";
    public static final String SHOP_CATEGORY = "SHOPCATEGORY";
    public static final String SHOP_SEARCH = "SHOPSEARCH";
    public AuctionBaseBean v;
    public GestureDetector x;
    public final b w = new b();
    public final TextView u = (TextView) this.itemView.findViewById(R.id.shop_coupon);
    public final SummaryTipsView y = (SummaryTipsView) this.itemView.findViewById(R.id.tv_summary_tips);
    public final TextView z = (TextView) this.itemView.findViewById(R.id.tv_recommend_reason);
    public final View A = this.itemView.findViewById(R.id.dynamic_card_2in1_bg);
    public final FrameLayout B = (FrameLayout) this.itemView.findViewById(R.id.dynamic_card_mask_container);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends GestureDetector.SimpleOnGestureListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815793642);
        }

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -2043089436) {
                super.onLongPress((MotionEvent) objArr[0]);
                return null;
            } else if (hashCode == 1575121015) {
                return new Boolean(super.onSingleTapUp((MotionEvent) objArr[0]));
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/sf/widgets/list/listcell/inshopauction/InshopAuctionCellWidget$GestureListener");
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
                return;
            }
            InshopAuctionCellWidget inshopAuctionCellWidget = InshopAuctionCellWidget.this;
            AuctionBaseBean auctionBaseBean = inshopAuctionCellWidget.v;
            if (auctionBaseBean != null) {
                inshopAuctionCellWidget.B0(xjh.a(auctionBaseBean, (ViewGroup) inshopAuctionCellWidget.itemView.findViewById(R.id.layer_container)), "childPageWidget");
                ArrayMap arrayMap = new ArrayMap();
                arrayMap.put("item_id", InshopAuctionCellWidget.this.v.itemId);
                arrayMap.put("keyword", InshopAuctionCellWidget.this.l0().e().getKeyword());
                sen.f("longpress", arrayMap);
                super.onLongPress(motionEvent);
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5de27077", new Object[]{this, motionEvent})).booleanValue();
            }
            InshopAuctionCellWidget inshopAuctionCellWidget = InshopAuctionCellWidget.this;
            if (inshopAuctionCellWidget.v == null) {
                return super.onSingleTapUp(motionEvent);
            }
            InshopAuctionCellWidget.V0(inshopAuctionCellWidget, inshopAuctionCellWidget.getActivity(), InshopAuctionCellWidget.this.v, false);
            InshopAuctionCellWidget.W0(InshopAuctionCellWidget.this);
            InshopAuctionCellWidget inshopAuctionCellWidget2 = InshopAuctionCellWidget.this;
            ayf.f(inshopAuctionCellWidget2.v, InshopAuctionCellWidget.X0(inshopAuctionCellWidget2), InshopAuctionCellWidget.this.l0().a(), InshopAuctionCellWidget.Y0(InshopAuctionCellWidget.this), ayf.e(InshopAuctionCellWidget.a1(InshopAuctionCellWidget.this), InshopAuctionCellWidget.this.l0().e(), InshopAuctionCellWidget.this.i0()));
            InshopAuctionCellWidget inshopAuctionCellWidget3 = InshopAuctionCellWidget.this;
            h6p.g(inshopAuctionCellWidget3.v, inshopAuctionCellWidget3.l0().e().getKeyword(), InshopAuctionCellWidget.this.getActivity(), InshopAuctionCellWidget.this.i0(), null);
            return super.onSingleTapUp(motionEvent);
        }
    }

    static {
        t2o.a(815793640);
        t2o.a(815793651);
        t2o.a(993001706);
    }

    public InshopAuctionCellWidget(int i, Activity activity, ude udeVar, ViewGroup viewGroup, ListStyle listStyle, int i2, b64 b64Var) {
        super(LayoutInflater.from(activity).inflate(i, viewGroup, false), activity, udeVar, listStyle, i2, b64Var);
        FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.auction_layout);
        b1();
        d1();
    }

    public static /* synthetic */ void V0(InshopAuctionCellWidget inshopAuctionCellWidget, Context context, AuctionBaseBean auctionBaseBean, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ddd6e85", new Object[]{inshopAuctionCellWidget, context, auctionBaseBean, new Boolean(z)});
        } else {
            inshopAuctionCellWidget.U0(context, auctionBaseBean, z);
        }
    }

    public static /* synthetic */ void W0(InshopAuctionCellWidget inshopAuctionCellWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de1945c7", new Object[]{inshopAuctionCellWidget});
        } else {
            inshopAuctionCellWidget.m1();
        }
    }

    public static /* synthetic */ Activity X0(InshopAuctionCellWidget inshopAuctionCellWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("3382dce0", new Object[]{inshopAuctionCellWidget});
        }
        return inshopAuctionCellWidget.f9341a;
    }

    public static /* synthetic */ ListStyle Y0(InshopAuctionCellWidget inshopAuctionCellWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListStyle) ipChange.ipc$dispatch("eff53886", new Object[]{inshopAuctionCellWidget});
        }
        return inshopAuctionCellWidget.j0();
    }

    public static /* synthetic */ Activity a1(InshopAuctionCellWidget inshopAuctionCellWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("b479081e", new Object[]{inshopAuctionCellWidget});
        }
        return inshopAuctionCellWidget.f9341a;
    }

    public static /* synthetic */ Object ipc$super(InshopAuctionCellWidget inshopAuctionCellWidget, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1150075436) {
            super.P0((AuctionBaseBean) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
            return null;
        } else if (hashCode == 549524662) {
            super.R0((AuctionBaseBean) objArr[0]);
            return null;
        } else if (hashCode == 949399698) {
            super.x0();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/sf/widgets/list/listcell/inshopauction/InshopAuctionCellWidget");
        }
    }

    @Override // tb.wg3
    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdc6270b", new Object[]{this});
        } else {
            o1();
        }
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.SearchBaseAuctionCellWidget
    public Map<String, String> G0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a7a04a77", new Object[]{this});
        }
        tnd f = l0().f();
        if (f == null) {
            return null;
        }
        String param = f.getParam("sellerId");
        if (TextUtils.isEmpty(param)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sellerId", param);
        hashMap.put("seller_id", param);
        String j = oen.j();
        hashMap.put("rainbow", j);
        hashMap.put("encode_rainbow", g6p.d(j));
        CommonSearchResult commonSearchResult = (CommonSearchResult) l0().e().getTotalSearchResult();
        if (commonSearchResult != null) {
            hashMap.put("pageid", commonSearchResult.getMainInfo().rn);
        }
        hashMap.put("spm", ayf.e(getActivity(), l0().e(), i0()));
        return hashMap;
    }

    @Override // tb.wg3
    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c78bc13d", new Object[]{this});
        } else {
            h1(true);
        }
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.baseauction.BaseAuctionCellWidget
    public void P0(AuctionBaseBean auctionBaseBean, int i, int i2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb733dd4", new Object[]{this, auctionBaseBean, new Integer(i), new Integer(i2)});
            return;
        }
        super.P0(auctionBaseBean, i, i2);
        this.v = auctionBaseBean;
        if (l0().a().z()) {
            this.r.setVisibility(0);
        } else {
            this.r.setVisibility(8);
        }
        ListStyle j0 = j0();
        ListStyle listStyle = ListStyle.WATERFALL;
        if (j0 == listStyle && this.u != null) {
            k1(auctionBaseBean.shopCoupon);
        }
        ViewGroup.LayoutParams layoutParams = L0().getLayoutParams();
        if (j0() == listStyle) {
            layoutParams.width = (zuo.e() - f1()) / 2;
        }
        if (!TextUtils.isEmpty(auctionBaseBean.videoUrl) && j0() == listStyle) {
            SearchUrlImageView L0 = L0();
            layoutParams.height = (int) ((layoutParams.width / auctionBaseBean.videoWidth) * auctionBaseBean.videoHeight);
            if (!TextUtils.isEmpty(auctionBaseBean.videoCover)) {
                str = auctionBaseBean.videoCover;
            } else {
                str = auctionBaseBean.picUrl;
            }
            if (!TextUtils.isEmpty(str)) {
                L0.setImageUrl(str);
            }
        }
        L0().setLayoutParams(layoutParams);
        l1();
        o1();
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.baseauction.BaseAuctionCellWidget
    public void Q0(AuctionBaseBean auctionBaseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78d84d3d", new Object[]{this, auctionBaseBean});
            return;
        }
        this.s.setVisibility(8);
        if (j0() == ListStyle.LIST) {
            List<IconBean> list = auctionBaseBean.listIconArray;
            if (list != null && list.size() != 0) {
                this.s.setVisibility(0);
                this.s.render(auctionBaseBean.listIconArray);
                return;
            }
            return;
        }
        List<IconBean> list2 = auctionBaseBean.waterfallIconArray;
        if (list2 != null && list2.size() != 0) {
            this.s.setVisibility(0);
            this.s.render(auctionBaseBean.waterfallIconArray);
        }
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.baseauction.BaseAuctionCellWidget
    public void R0(AuctionBaseBean auctionBaseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20c114b6", new Object[]{this, auctionBaseBean});
            return;
        }
        super.R0(auctionBaseBean);
        this.q.setVisibility(0);
        if (j0() == ListStyle.LIST) {
            this.q.setText(e1(auctionBaseBean));
        } else {
            this.q.setVisibility(8);
        }
    }

    @Override // tb.wg3
    public boolean Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b6d36ed", new Object[]{this})).booleanValue();
        }
        if (!f1p.e(l0().e())) {
            return false;
        }
        return c1();
    }

    public final void b1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d54d418", new Object[]{this});
            return;
        }
        ViewProxy.setOnClickListener(this.r, this);
        this.x = new GestureDetector(getActivity(), this.w);
        ViewProxy.setOnTouchListener(this.itemView, this);
    }

    public boolean c1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d7069af", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.baseauction.BaseAuctionCellWidget, com.taobao.search.sf.realtimetag.IRealTimeTagContainer
    public void clearTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a22e8814", new Object[]{this});
        } else {
            i1();
        }
    }

    public final void d1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252a7b2f", new Object[]{this});
            return;
        }
        tnd f = l0().f();
        if (f != null) {
            f.getParam("shopId");
            f.getParam("sellerId");
            if (getActivity() instanceof InshopResultActivity) {
                "category".equals(f.getParam("from", ""));
            }
        }
    }

    public String e1(AuctionBaseBean auctionBaseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bf463873", new Object[]{this, auctionBaseBean});
        }
        if (StringUtil.isEmpty(auctionBaseBean.postFee)) {
            return "";
        }
        if (auctionBaseBean.postFee.equals("0.00")) {
            return Localization.q(R.string.app_free_shipping);
        }
        return Localization.q(R.string.taobao_app_1005_1_16671) + auctionBaseBean.postFee.replace(".00", "");
    }

    public int f1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("455fc756", new Object[]{this})).intValue();
        }
        ude parent = o0().getParent();
        if (!(parent instanceof vyd) || !((vyd) parent).Q()) {
            return lh1.b();
        }
        return DecorationProvider.Tb2021Decoration.REM12 * 3;
    }

    /* renamed from: g1 */
    public void u0(int i, InshopAuctionCellBean inshopAuctionCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1346bc2", new Object[]{this, new Integer(i), inshopAuctionCellBean});
            return;
        }
        DynamicCardBean dynamicCardBean = inshopAuctionCellBean.dynamicCardBean;
        if (dynamicCardBean != null) {
            j1(dynamicCardBean, i);
        } else {
            this.t.removeAllViews();
            this.B.removeAllViews();
        }
        P0(inshopAuctionCellBean.auctionBaseBean, i, inshopAuctionCellBean.pagePos);
    }

    public void h1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d421479", new Object[]{this, new Boolean(z)});
        }
    }

    public final void i1() {
        DynamicCardBean dynamicCardBean;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("642c2c23", new Object[]{this});
            return;
        }
        this.B.removeAllViews();
        InshopAuctionCellBean inshopAuctionCellBean = (InshopAuctionCellBean) getData();
        if (inshopAuctionCellBean != null && (dynamicCardBean = inshopAuctionCellBean.dynamicCardBean) != null && "mask".equals(dynamicCardBean.style)) {
            inshopAuctionCellBean.dynamicCardBean = null;
        }
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public String k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return null;
    }

    public final void k1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff906f86", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            this.u.setVisibility(8);
        } else {
            this.u.setText(str);
            this.u.setVisibility(0);
        }
    }

    public final void l1() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("739ed90f", new Object[]{this});
            return;
        }
        this.y.setVisibility(8);
        this.z.setVisibility(8);
        if (n1()) {
            AuctionBaseBean auctionBaseBean = this.v;
            if (auctionBaseBean instanceof InshopAuctionRadiusBean) {
                str = ((InshopAuctionRadiusBean) auctionBaseBean).recommendReason;
            } else {
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
                this.z.setVisibility(0);
                this.z.setText(str);
                return;
            }
            List<String> list = this.v.summaryTipList;
            if (list != null && !list.isEmpty()) {
                this.y.setVisibility(0);
                this.y.setSummaryTips(this.v.summaryTipList);
            }
        }
    }

    public final void m1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("163e33a2", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(yj4.PARAM_SEARCH_KEYWORD_POS, String.valueOf(I0()));
        hashMap.put("page", String.valueOf(this.v.page));
        hashMap.put("trigger_item_id", this.v.itemId);
        hashMap.put("pv_pos", String.valueOf(((InshopAuctionCellBean) getData()).pagePos));
        hashMap.put(yj4.PARAM_SEARCH_KEYWORD_RN, this.v.rn);
        hashMap.put("pv_size", String.valueOf(((InshopAuctionCellBean) getData()).pageSize));
        B0(new jtf(this.v.itemId, hashMap), "childPageWidget");
    }

    public boolean n1() {
        List<IconBean> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19bf64cc", new Object[]{this})).booleanValue();
        }
        if (j0() != ListStyle.WATERFALL || (list = this.v.waterfallIconArray) == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    public void o1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view == this.r && this.v != null) {
            vlo.c().a(this.v.itemId, l0().a(), true, this.v, getActivity());
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        GestureDetector gestureDetector = this.x;
        if (gestureDetector == null) {
            return true;
        }
        gestureDetector.onTouchEvent(motionEvent);
        return true;
    }

    @Override // tb.wg3
    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d2c9ffd", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.SearchBaseAuctionCellWidget, com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.x0();
        i1();
    }

    public final void j1(DynamicCardBean dynamicCardBean, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f07b2598", new Object[]{this, dynamicCardBean, new Integer(i)});
            return;
        }
        View view = pkn.b(this, getActivity(), dynamicCardBean, i).itemView;
        if (TextUtils.equals(dynamicCardBean.style, "mask")) {
            okn u = l0().e().u();
            u.v();
            this.B.addView(view);
            u.t(this, (SFAuctionBaseCellBean) getData());
            return;
        }
        this.t.addView(view);
        if (this.A != null) {
            if (TextUtils.equals(dynamicCardBean.mOriginData.getString("2in1"), "true")) {
                this.A.setVisibility(0);
            } else {
                this.A.setVisibility(8);
            }
        }
        if (dynamicCardBean.firstRender) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.0f, 0.0f, 1.0f);
            scaleAnimation.setDuration(500L);
            view.startAnimation(scaleAnimation);
            dynamicCardBean.firstRender = false;
        }
    }
}
