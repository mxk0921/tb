package com.taobao.search.sf.widgets.list.listcell.defaultshop;

import android.app.Activity;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.list.WidgetViewHolder;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.schedule.ViewProxy;
import com.taobao.search.common.uikit.SearchUrlImageView;
import com.taobao.search.sf.widgets.list.listcell.defaultshop.DefaultShopCellWidget;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import tb.ayf;
import tb.b64;
import tb.c2v;
import tb.ckf;
import tb.kme;
import tb.mqq;
import tb.ngj;
import tb.p1p;
import tb.t2o;
import tb.ude;
import tb.zzo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class DefaultShopCellWidget extends WidgetViewHolder<DefaultShopCellBean, b64> implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final TextView l;
    public final SearchUrlImageView m;
    public final LinearLayout n;
    public final View o;
    public int p = -1;
    public DefaultShopCellBean q;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/list/listcell/defaultshop/DefaultShopCellWidget$1$1");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                return;
            }
            ckf.g(view, "view");
            ckf.g(outline, "outline");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), p1p.a(12.0f));
        }
    }

    static {
        t2o.a(815793637);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultShopCellWidget(View view, Activity activity, ude udeVar, ListStyle listStyle, int i, b64 b64Var) {
        super(view, activity, udeVar, listStyle, i, b64Var);
        ckf.g(activity, "activity");
        ckf.g(udeVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        ckf.g(listStyle, "style");
        ckf.g(b64Var, "modelAdapter");
        this.l = (TextView) view.findViewById(R.id.tv_title);
        this.m = (SearchUrlImageView) view.findViewById(R.id.iv_logo);
        this.n = (LinearLayout) view.findViewById(R.id.auction_container);
        View findViewById = view.findViewById(R.id.btn_shop_enter);
        this.o = findViewById;
        ckf.d(findViewById);
        ViewProxy.setOnClickListener(findViewById, this);
        ViewProxy.setOnClickListener(view, this);
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) view.findViewById(R.id.hsv_container);
        if (horizontalScrollView != null) {
            horizontalScrollView.setClipToOutline(true);
        }
        if (horizontalScrollView != null) {
            horizontalScrollView.setOutlineProvider(new a());
        }
    }

    public static final void c(DefaultShopCellWidget defaultShopCellWidget, int i, DefaultShopCellBean defaultShopCellBean, JSONObject jSONObject, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d51d908", new Object[]{defaultShopCellWidget, new Integer(i), defaultShopCellBean, jSONObject, view});
            return;
        }
        ckf.g(defaultShopCellWidget, "this$0");
        ckf.g(jSONObject, "$auction");
        ayf.a(defaultShopCellWidget.getActivity(), i, defaultShopCellBean, jSONObject, defaultShopCellWidget.l0().a());
    }

    public static /* synthetic */ Object ipc$super(DefaultShopCellWidget defaultShopCellWidget, String str, Object... objArr) {
        if (str.hashCode() == 1626033557) {
            super.t0();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/list/listcell/defaultshop/DefaultShopCellWidget");
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public String k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return DefaultShopCellWidget.class.getSimpleName();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else {
            ayf.b(getActivity(), this.p, this.q, l0().a());
        }
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void t0() {
        Map<String, String> map;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.t0();
        DefaultShopCellBean defaultShopCellBean = this.q;
        if (defaultShopCellBean != null && !defaultShopCellBean.isExposed) {
            if (defaultShopCellBean != null) {
                defaultShopCellBean.isExposed = true;
            }
            String str2 = null;
            if (defaultShopCellBean != null) {
                b64 l0 = l0();
                map = defaultShopCellBean.getUTParams(l0 != null ? l0.a() : null, this.p);
            } else {
                map = null;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("utLogMap", ngj.a(JSON.toJSONString(map), "utf-8"));
            DefaultShopCellBean defaultShopCellBean2 = this.q;
            if (defaultShopCellBean2 != null) {
                b64 l02 = l0();
                str = defaultShopCellBean2.getCellSpm(l02 != null ? l02.a() : null, this.p);
            } else {
                str = null;
            }
            hashMap.put("spm", str);
            DefaultShopCellBean defaultShopCellBean3 = this.q;
            hashMap.put("seller_id", defaultShopCellBean3 != null ? defaultShopCellBean3.getSellerId() : null);
            String currentPageName = c2v.getInstance().getCurrentPageName();
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(currentPageName, 2201, currentPageName + "_Button-ShopExposure", "", "", hashMap).build());
            zzo.e a2 = zzo.e.a();
            DefaultShopCellBean defaultShopCellBean4 = this.q;
            String str3 = defaultShopCellBean4 != null ? defaultShopCellBean4.type : null;
            if (defaultShopCellBean4 != null) {
                str2 = defaultShopCellBean4.getOriginTItemType();
            }
            a2.b(currentPageName, str3, str2);
        }
    }

    /* renamed from: G0 */
    public void u0(final int i, final DefaultShopCellBean defaultShopCellBean) {
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f422aa4", new Object[]{this, new Integer(i), defaultShopCellBean});
            return;
        }
        this.p = i;
        this.q = defaultShopCellBean;
        if (defaultShopCellBean != null) {
            TextView textView = this.l;
            if (textView != null) {
                textView.setText(defaultShopCellBean.getTitle());
            }
            SearchUrlImageView searchUrlImageView = this.m;
            if (searchUrlImageView != null) {
                searchUrlImageView.setImageUrl(defaultShopCellBean.getLogo());
            }
            LinearLayout linearLayout = this.n;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
            }
            if (defaultShopCellBean.getAuctions().size() > 0 && (size = defaultShopCellBean.getAuctions().size()) >= 0) {
                int i2 = 0;
                while (true) {
                    final JSONObject jSONObject = defaultShopCellBean.getAuctions().get(i2);
                    SearchUrlImageView searchUrlImageView2 = new SearchUrlImageView(getActivity());
                    searchUrlImageView2.setOnClickListener(new View.OnClickListener() { // from class: tb.t4z
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DefaultShopCellWidget.c(DefaultShopCellWidget.this, i, defaultShopCellBean, jSONObject, view);
                        }
                    });
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(p1p.a(110.0f), p1p.a(165.0f));
                    layoutParams.setMargins(0, 0, p1p.a(2.0f), 0);
                    LinearLayout linearLayout2 = this.n;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(searchUrlImageView2, layoutParams);
                    }
                    searchUrlImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    searchUrlImageView2.setImageUrl(kme.a(mqq.c(jSONObject.optString("pic", ""))));
                    if (i2 != size) {
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
