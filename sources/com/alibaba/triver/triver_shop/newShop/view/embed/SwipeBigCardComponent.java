package com.alibaba.triver.triver_shop.newShop.view.embed;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopDXEngine;
import com.alibaba.triver.triver_shop.newShop.view.ShopStandardFragment;
import com.alibaba.triver.triver_shop.newShop.view.SwipeBigCardWrapLayout;
import com.alibaba.triver.triver_shop.newShop.view.adapter.ShopContainerPageAdapter;
import com.alibaba.triver.triver_shop.newShop.view.extend.EnhancedViewPager;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.badge.BadgeDrawable;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.taobao.R;
import tb.a07;
import tb.brf;
import tb.c8c;
import tb.ckf;
import tb.d1a;
import tb.g1a;
import tb.kew;
import tb.kte;
import tb.nzq;
import tb.r54;
import tb.sk9;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class SwipeBigCardComponent implements ViewPager.OnPageChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a FrameType = new a(null);
    public static final String IMMERSE_TYPE = "immerseType";
    public static final String LIVE_TYPE = "liveType";
    public static final String SECOND_MARKET = "secondMarketing";
    public static final String SECOND_VIDEO = "secondVideo";

    /* renamed from: a  reason: collision with root package name */
    public FrameLayout f3262a;
    public EnhancedViewPager b;
    public ShopDataParser c;
    public FragmentActivity d;
    public EmbedShopLoftComponent e;
    public kte f;
    public d1a<Boolean> g;
    public d1a<xhv> h;
    public g1a<? super String, xhv> i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(766510079);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(766510078);
    }

    public final d1a<Boolean> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("4b5834a", new Object[]{this});
        }
        return this.g;
    }

    public final EmbedShopLoftComponent c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EmbedShopLoftComponent) ipChange.ipc$dispatch("b7ca2f0f", new Object[]{this});
        }
        EmbedShopLoftComponent embedShopLoftComponent = this.e;
        if (embedShopLoftComponent != null) {
            return embedShopLoftComponent;
        }
        ckf.y("embedShopLoftComponent");
        throw null;
    }

    public final d1a<xhv> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("ce1e8885", new Object[]{this});
        }
        return this.h;
    }

    public final FragmentActivity e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentActivity) ipChange.ipc$dispatch("69a6b743", new Object[]{this});
        }
        FragmentActivity fragmentActivity = this.d;
        if (fragmentActivity != null) {
            return fragmentActivity;
        }
        ckf.y("fragmentActivity");
        throw null;
    }

    public final kte f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kte) ipChange.ipc$dispatch("57f304ed", new Object[]{this});
        }
        kte kteVar = this.f;
        if (kteVar != null) {
            return kteVar;
        }
        ckf.y("indicatorComponent");
        throw null;
    }

    public final int g() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ee47ee85", new Object[]{this})).intValue();
        }
        JSONArray J = i().J();
        if (J == null) {
            i = 0;
        } else {
            i = J.size();
        }
        if (i == 1) {
            return 1;
        }
        if (i <= 1) {
            return 0;
        }
        if (a()) {
            return 2;
        }
        return 1;
    }

    public final FrameLayout h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("30af2510", new Object[]{this});
        }
        FrameLayout frameLayout = this.f3262a;
        if (frameLayout != null) {
            return frameLayout;
        }
        ckf.y("rootLayout");
        throw null;
    }

    public final ShopDataParser i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDataParser) ipChange.ipc$dispatch("16b01ba5", new Object[]{this});
        }
        ShopDataParser shopDataParser = this.c;
        if (shopDataParser != null) {
            return shopDataParser;
        }
        ckf.y("shopData");
        throw null;
    }

    public final EnhancedViewPager j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EnhancedViewPager) ipChange.ipc$dispatch("edcf4da", new Object[]{this});
        }
        EnhancedViewPager enhancedViewPager = this.b;
        if (enhancedViewPager != null) {
            return enhancedViewPager;
        }
        ckf.y(OrderConfigs.VIEWPAGER);
        throw null;
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6646603e", new Object[]{this});
            return;
        }
        g1a<? super String, xhv> g1aVar = this.i;
        if (g1aVar != null) {
            g1aVar.invoke("NShop.Event.IndexCardAppear");
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdddeec8", new Object[]{this});
            return;
        }
        g1a<? super String, xhv> g1aVar = this.i;
        if (g1aVar != null) {
            g1aVar.invoke("NShop.Event.IndexCardDisappear");
        }
    }

    public final void n(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf1f6cd8", new Object[]{this, new Integer(i)});
            return;
        }
        PagerAdapter adapter = j().getAdapter();
        if (adapter != null) {
            c8c v2 = ((ShopStandardFragment) ((ShopContainerPageAdapter) adapter).getItem(i)).v2();
            if (v2 != null) {
                ((nzq) v2).e();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.alibaba.triver.triver_shop.newShop.view.provider.SwipeBigCardFragmentViewProvider");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.alibaba.triver.triver_shop.newShop.view.adapter.ShopContainerPageAdapter");
    }

    public final void o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d251dcff", new Object[]{this, new Integer(i)});
            return;
        }
        PagerAdapter adapter = j().getAdapter();
        if (adapter != null) {
            c8c v2 = ((ShopStandardFragment) ((ShopContainerPageAdapter) adapter).getItem(i)).v2();
            if (v2 != null) {
                ((nzq) v2).a();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.alibaba.triver.triver_shop.newShop.view.provider.SwipeBigCardFragmentViewProvider");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.alibaba.triver.triver_shop.newShop.view.adapter.ShopContainerPageAdapter");
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            return;
        }
        if (i != 0) {
            o(0);
            n(i);
        } else {
            if (g() > 1) {
                o(1);
            }
            n(0);
        }
        f().d(i);
    }

    public final void p(d1a<Boolean> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("419e776e", new Object[]{this, d1aVar});
        } else {
            this.g = d1aVar;
        }
    }

    public final void q(EmbedShopLoftComponent embedShopLoftComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e1e96b9", new Object[]{this, embedShopLoftComponent});
            return;
        }
        ckf.g(embedShopLoftComponent, "<set-?>");
        this.e = embedShopLoftComponent;
    }

    public final void r(d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4638cd93", new Object[]{this, d1aVar});
        } else {
            this.h = d1aVar;
        }
    }

    public final void s(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7b07d71", new Object[]{this, fragmentActivity});
            return;
        }
        ckf.g(fragmentActivity, "<set-?>");
        this.d = fragmentActivity;
    }

    public final void t(kte kteVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c530fbd9", new Object[]{this, kteVar});
            return;
        }
        ckf.g(kteVar, "<set-?>");
        this.f = kteVar;
    }

    public final void u(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c522c38", new Object[]{this, frameLayout});
            return;
        }
        ckf.g(frameLayout, "<set-?>");
        this.f3262a = frameLayout;
    }

    public final void v(g1a<? super String, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156e1f15", new Object[]{this, g1aVar});
        } else {
            this.i = g1aVar;
        }
    }

    public final void w(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37976b35", new Object[]{this, shopDataParser});
            return;
        }
        ckf.g(shopDataParser, "<set-?>");
        this.c = shopDataParser;
    }

    public final void x(ShopDXEngine shopDXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acd89311", new Object[]{this, shopDXEngine});
        } else {
            ckf.g(shopDXEngine, "<set-?>");
        }
    }

    public final void y(EnhancedViewPager enhancedViewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47ae85f6", new Object[]{this, enhancedViewPager});
            return;
        }
        ckf.g(enhancedViewPager, "<set-?>");
        this.b = enhancedViewPager;
    }

    public final void z(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e583e7b", new Object[]{this, new Integer(i)});
        } else if (!f().a()) {
            f().d(i);
        } else if (i == -1) {
            r54.C(new SwipeBigCardComponent$updateIndexFromWeb$1(this));
        } else {
            f().d(i + 1);
        }
    }

    public final boolean a() {
        JSONObject g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7187cd42", new Object[]{this})).booleanValue();
        }
        JSONArray J = i().J();
        String str = null;
        if (!(J == null || (g = brf.g(J, 0)) == null)) {
            str = g.getString("type");
        }
        return ckf.b(str, "liveType");
    }

    public final void m(ShopDataParser shopDataParser, ShopDXEngine shopDXEngine, FragmentActivity fragmentActivity) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c30c14c", new Object[]{this, shopDataParser, shopDXEngine, fragmentActivity});
            return;
        }
        ckf.g(shopDataParser, "shopData");
        ckf.g(shopDXEngine, "shopDXEngine");
        ckf.g(fragmentActivity, "fragmentActivity");
        w(shopDataParser);
        s(fragmentActivity);
        x(shopDXEngine);
        u(new SwipeBigCardWrapLayout(fragmentActivity));
        View K = kew.K(fragmentActivity, R.layout.view_empty_supoort_no_scroll_view_pager);
        if (K != null) {
            y((EnhancedViewPager) K);
            kew.a(h(), j());
            j().setOffscreenPageLimit(2);
            j().addOnPageChangeListener(this);
            q(new EmbedShopLoftComponent(fragmentActivity, shopDataParser, shopDXEngine));
            r54.C(new SwipeBigCardComponent$init$1(this, fragmentActivity));
            t(new kte(shopDataParser));
            LinearLayout b = f().b();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            b.setLayoutParams(layoutParams);
            sk9.a aVar = sk9.Companion;
            kew.U(b, aVar.g() + ((shopDataParser.L1() || shopDataParser.K1()) ? kew.p(45) : 0));
            kew.X(b, kew.p(Double.valueOf(18.5d)));
            kew.b0(b, kew.p(126));
            View c = f().c();
            if (c != null) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, kew.p(Double.valueOf(16.5d)));
                layoutParams2.gravity = BadgeDrawable.BOTTOM_END;
                c.setLayoutParams(layoutParams2);
                int g = aVar.g();
                if (shopDataParser.L1() || shopDataParser.K1()) {
                    i = kew.p(45) - kew.p(Double.valueOf(8.25d));
                }
                kew.U(c, g + i);
                kew.b0(c, kew.p(12));
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.alibaba.triver.triver_shop.newShop.view.extend.EnhancedViewPager");
    }
}
