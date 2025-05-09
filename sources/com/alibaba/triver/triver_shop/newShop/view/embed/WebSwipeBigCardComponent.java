package com.alibaba.triver.triver_shop.newShop.view.embed;

import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopDXEngine;
import com.alibaba.triver.triver_shop.newShop.view.FlagShipV25BigCardWebContentRender;
import com.alibaba.triver.triver_shop.newShop.view.SwipeBigCardWrapLayout;
import com.alibaba.triver.triver_shop.newShop.view.embed.IndicatorComponentV25;
import com.android.alibaba.ip.runtime.IpChange;
import tb.a07;
import tb.ckf;
import tb.d1a;
import tb.g1a;
import tb.kew;
import tb.sk9;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class WebSwipeBigCardComponent implements ViewPager.OnPageChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a FrameType = new a(null);
    public static final String IMMERSE_TYPE = "immerseType";
    public static final String LIVE_TYPE = "liveType";
    public static final String SECOND_MARKET = "secondMarketing";
    public static final String SECOND_VIDEO = "secondVideo";

    /* renamed from: a  reason: collision with root package name */
    public FrameLayout f3263a;
    public ShopDataParser b;
    public FragmentActivity c;
    public IndicatorComponentV25 d;
    public d1a<Boolean> e;
    public d1a<xhv> f;
    public g1a<? super String, xhv> g;
    public Integer h;
    public Integer i;
    public int j;
    public int k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(766510086);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(766510085);
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ffdbaa5f", new Object[]{this})).intValue();
        }
        return this.k;
    }

    public final FragmentActivity b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentActivity) ipChange.ipc$dispatch("69a6b743", new Object[]{this});
        }
        FragmentActivity fragmentActivity = this.c;
        if (fragmentActivity != null) {
            return fragmentActivity;
        }
        ckf.y("fragmentActivity");
        throw null;
    }

    public final Boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("e1f7f423", new Object[]{this});
        }
        return null;
    }

    public final IndicatorComponentV25 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IndicatorComponentV25) ipChange.ipc$dispatch("c1774050", new Object[]{this});
        }
        IndicatorComponentV25 indicatorComponentV25 = this.d;
        if (indicatorComponentV25 != null) {
            return indicatorComponentV25;
        }
        ckf.y("indicatorComponent");
        throw null;
    }

    public final FrameLayout e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("30af2510", new Object[]{this});
        }
        FrameLayout frameLayout = this.f3263a;
        if (frameLayout != null) {
            return frameLayout;
        }
        ckf.y("rootLayout");
        throw null;
    }

    public final ShopDataParser f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDataParser) ipChange.ipc$dispatch("16b01ba5", new Object[]{this});
        }
        ShopDataParser shopDataParser = this.b;
        if (shopDataParser != null) {
            return shopDataParser;
        }
        ckf.y("shopData");
        throw null;
    }

    public final int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("290013f8", new Object[]{this})).intValue();
        }
        return this.j;
    }

    public final Integer h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("6e6ace59", new Object[]{this});
        }
        return this.h;
    }

    public final Integer i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("b5f6ce85", new Object[]{this});
        }
        return this.i;
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6646603e", new Object[]{this});
            return;
        }
        g1a<? super String, xhv> g1aVar = this.g;
        if (g1aVar != null) {
            g1aVar.invoke("NShop.Event.IndexCardAppear");
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdddeec8", new Object[]{this});
            return;
        }
        g1a<? super String, xhv> g1aVar = this.g;
        if (g1aVar != null) {
            g1aVar.invoke("NShop.Event.IndexCardDisappear");
        }
    }

    public final void l(ShopDataParser shopDataParser, ShopDXEngine shopDXEngine, FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c30c14c", new Object[]{this, shopDataParser, shopDXEngine, fragmentActivity});
            return;
        }
        ckf.g(shopDataParser, "shopData");
        ckf.g(shopDXEngine, "shopDXEngine");
        ckf.g(fragmentActivity, "fragmentActivity");
        t(shopDataParser);
        p(fragmentActivity);
        u(shopDXEngine);
        r(new SwipeBigCardWrapLayout(fragmentActivity));
        shopDataParser.m1().H(this.f);
        shopDataParser.m1().G(this.e);
        shopDataParser.m1().I(new WebSwipeBigCardComponent$init$1(this));
        FlagShipV25BigCardWebContentRender flagShipV25BigCardWebContentRender = new FlagShipV25BigCardWebContentRender(this);
        flagShipV25BigCardWebContentRender.j();
        kew.a(e(), flagShipV25BigCardWebContentRender.getContentView());
        q(new IndicatorComponentV25(shopDataParser));
        LinearLayout d = d().d();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        d.setLayoutParams(layoutParams);
        sk9.a aVar = sk9.Companion;
        kew.U(d, aVar.g() + kew.v(Integer.valueOf(a())) + kew.v(24) + g());
        kew.X(d, kew.v(32) - kew.v(8));
        kew.b0(d, kew.v(376) - kew.v(8));
        IndicatorComponentV25.IndicatorTipsLayout e = d().e();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 80;
        e.setLayoutParams(layoutParams2);
        kew.U(e, aVar.g() + kew.v(Integer.valueOf(a())) + kew.v(24) + g());
        kew.X(e, kew.v(564));
        kew.b0(e, kew.v(25));
    }

    public final void m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dddb223", new Object[]{this, new Integer(i)});
        } else {
            this.k = i;
        }
    }

    public final void n(d1a<Boolean> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("419e776e", new Object[]{this, d1aVar});
        } else {
            this.e = d1aVar;
        }
    }

    public final void o(d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4638cd93", new Object[]{this, d1aVar});
        } else {
            this.f = d1aVar;
        }
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
        } else {
            d().f(i);
        }
    }

    public final void p(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7b07d71", new Object[]{this, fragmentActivity});
            return;
        }
        ckf.g(fragmentActivity, "<set-?>");
        this.c = fragmentActivity;
    }

    public final void q(IndicatorComponentV25 indicatorComponentV25) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dcf585e", new Object[]{this, indicatorComponentV25});
            return;
        }
        ckf.g(indicatorComponentV25, "<set-?>");
        this.d = indicatorComponentV25;
    }

    public final void r(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c522c38", new Object[]{this, frameLayout});
            return;
        }
        ckf.g(frameLayout, "<set-?>");
        this.f3263a = frameLayout;
    }

    public final void s(g1a<? super String, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156e1f15", new Object[]{this, g1aVar});
        } else {
            this.g = g1aVar;
        }
    }

    public final void t(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37976b35", new Object[]{this, shopDataParser});
            return;
        }
        ckf.g(shopDataParser, "<set-?>");
        this.b = shopDataParser;
    }

    public final void u(ShopDXEngine shopDXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acd89311", new Object[]{this, shopDXEngine});
        } else {
            ckf.g(shopDXEngine, "<set-?>");
        }
    }

    public final void v(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e2e61aa", new Object[]{this, new Integer(i)});
        } else {
            this.j = i;
        }
    }

    public final void w(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcb8991", new Object[]{this, num});
        } else {
            this.h = num;
        }
    }

    public final void x(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70e6fa4d", new Object[]{this, num});
        } else {
            this.i = num;
        }
    }

    public final void y(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e583e7b", new Object[]{this, new Integer(i)});
        } else {
            d().f(i);
        }
    }
}
