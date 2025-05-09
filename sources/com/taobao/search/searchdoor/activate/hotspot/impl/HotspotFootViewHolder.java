package com.taobao.search.searchdoor.activate.hotspot.impl;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.nav.Nav;
import com.taobao.schedule.ViewProxy;
import com.taobao.search.searchdoor.activate.hotspot.HotSpots;
import com.taobao.search.searchdoor.activate.hotspot.impl.HotspotFootViewHolder;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.ckf;
import tb.k6b;
import tb.o1p;
import tb.sda;
import tb.t2o;
import tb.x6b;
import tb.xho;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class HotspotFootViewHolder extends BaseHotSpotViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final boolean b;
    public TextView c;
    public View d;
    public TextView e;
    public HotSpots f;

    static {
        t2o.a(815793033);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotspotFootViewHolder(View view, boolean z) {
        super(view);
        ckf.g(view, "itemView");
        this.b = z;
        g0();
    }

    public static final void d(HotspotFootViewHolder hotspotFootViewHolder, HotSpots hotSpots, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2be17f83", new Object[]{hotspotFootViewHolder, hotSpots, view});
            return;
        }
        ckf.g(hotspotFootViewHolder, "this$0");
        ckf.g(hotSpots, "$tab");
        Context context = hotspotFootViewHolder.itemView.getContext();
        ckf.e(context, "null cannot be cast to non-null type android.app.Activity");
        new sda((Activity) context).b("/trend_guide.jihuoye.rule", "CLK", "");
        Context context2 = hotspotFootViewHolder.itemView.getContext();
        ckf.e(context2, "null cannot be cast to non-null type android.app.Activity");
        Nav.from((Activity) context2).toUri(hotSpots.getTrendRuleUrl());
    }

    public static final void e(k6b k6bVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5977f17c", new Object[]{k6bVar, view});
            return;
        }
        ckf.g(k6bVar, "$listener");
        k6bVar.R(true);
    }

    public static /* synthetic */ Object ipc$super(HotspotFootViewHolder hotspotFootViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/activate/hotspot/impl/HotspotFootViewHolder");
    }

    @Override // com.taobao.search.searchdoor.activate.hotspot.impl.BaseHotSpotViewHolder
    public boolean f0(Rect rect, int i, x6b x6bVar, k6b k6bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("288f152e", new Object[]{this, rect, new Integer(i), x6bVar, k6bVar})).booleanValue();
        }
        ckf.g(rect, "parentRect");
        ckf.g(x6bVar, "tabItem");
        ckf.g(k6bVar, DataReceiveMonitor.CB_LISTENER);
        HotSpots hotSpots = this.f;
        if (hotSpots == null || hotSpots.getPreload()) {
            return true;
        }
        this.itemView.getGlobalVisibleRect(b0());
        b0().top = this.itemView.getTop();
        b0().bottom = this.itemView.getBottom();
        if (!hotSpots.getTrendExposed() && e0(b0(), rect) && d0(b0(), rect)) {
            k6bVar.L1();
        }
        return true;
    }

    public final void g0() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        View view = this.itemView;
        int i = R.id.btn_trend_rule;
        this.d = view.findViewById(i);
        View view2 = this.itemView;
        int i2 = R.id.tv_trend_text;
        this.e = (TextView) view2.findViewById(i2);
        TextView textView = (TextView) this.itemView.findViewById(R.id.tv_hide_trend);
        this.c = textView;
        if (textView != null) {
            xho.a(textView);
            if (this.b) {
                ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
                ckf.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = o1p.a(10.0f);
            }
            TUrlImageView tUrlImageView = (TUrlImageView) this.itemView.findViewById(R.id.iv_hide_trend);
            if (this.b) {
                str = HotSpotsViewHolder.openEyeUrl2024;
            } else {
                str = HotSpotsViewHolder.openEyeUrl;
            }
            tUrlImageView.setImageUrl(str);
            View findViewById = this.itemView.findViewById(i);
            TextView textView2 = (TextView) findViewById.findViewById(i2);
            ckf.d(textView2);
            xho.a(textView2);
            TUrlImageView tUrlImageView2 = (TUrlImageView) findViewById.findViewById(R.id.iv_trend_rule_left);
            TUrlImageView tUrlImageView3 = (TUrlImageView) findViewById.findViewById(R.id.iv_trend_rule_right);
            if (this.b) {
                findViewById.setBackgroundResource(R.drawable.tbsearch_searchdoor_hide_trend_2024);
                tUrlImageView2.setVisibility(0);
                tUrlImageView2.setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01WMmJM41IH8NmUkvPv_!!6000000000867-2-tps-80-80.png");
                textView2.setTextColor(ResourcesCompat.getColor(this.itemView.getContext().getResources(), R.color.gray_66, null));
                return;
            }
            findViewById.setPadding(0, 0, 0, 0);
            tUrlImageView3.setVisibility(0);
            tUrlImageView3.setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01x0Pg8E1q4wcv13xAt_!!6000000005443-2-tps-18-34.png");
            return;
        }
        ckf.y("tvHideHotSpot");
        throw null;
    }

    public final void h0(final HotSpots hotSpots, final k6b k6bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4470aaca", new Object[]{this, hotSpots, k6bVar});
            return;
        }
        ckf.g(hotSpots, "tab");
        ckf.g(k6bVar, DataReceiveMonitor.CB_LISTENER);
        this.f = hotSpots;
        TextView textView = this.c;
        if (textView != null) {
            textView.setText("隐藏" + hotSpots.getName());
            if (TextUtils.isEmpty(hotSpots.getTrendRuleText()) || TextUtils.isEmpty(hotSpots.getTrendRuleUrl())) {
                View view = this.d;
                if (view != null) {
                    view.setVisibility(8);
                } else {
                    ckf.y("btnTrendRule");
                    throw null;
                }
            } else {
                View view2 = this.d;
                if (view2 != null) {
                    view2.setVisibility(0);
                    View view3 = this.d;
                    if (view3 != null) {
                        ViewProxy.setOnClickListener(view3, new View.OnClickListener() { // from class: tb.d9z
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view4) {
                                HotspotFootViewHolder.d(HotspotFootViewHolder.this, hotSpots, view4);
                            }
                        });
                        TextView textView2 = this.e;
                        if (textView2 != null) {
                            textView2.setText(hotSpots.getTrendRuleText());
                        } else {
                            ckf.y("tvTrendRule");
                            throw null;
                        }
                    } else {
                        ckf.y("btnTrendRule");
                        throw null;
                    }
                } else {
                    ckf.y("btnTrendRule");
                    throw null;
                }
            }
            ViewProxy.setOnClickListener(this.itemView, new View.OnClickListener() { // from class: tb.e9z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    HotspotFootViewHolder.e(k6b.this, view4);
                }
            });
            return;
        }
        ckf.y("tvHideHotSpot");
        throw null;
    }
}
