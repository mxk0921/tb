package com.alibaba.triver.triver_shop.newShop.view;

import android.net.Uri;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.view.embed.SwipeBigCardComponent;
import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.android.alibaba.ip.runtime.IpChange;
import org.android.agoo.common.AgooConstants;
import tb.ckf;
import tb.kew;
import tb.t2o;
import tb.wpd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class BigCardWebContentRender implements wpd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SwipeBigCardComponent f3114a;
    public boolean b;
    public final FrameLayout c;
    public ShopWrapWebView d;

    static {
        t2o.a(766509611);
        t2o.a(766509633);
    }

    public BigCardWebContentRender(SwipeBigCardComponent swipeBigCardComponent, int i) {
        ckf.g(swipeBigCardComponent, "swipeBigCardComponent");
        this.f3114a = swipeBigCardComponent;
        this.c = new FrameLayout(swipeBigCardComponent.e());
    }

    public static final /* synthetic */ void b(BigCardWebContentRender bigCardWebContentRender, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5c9e374", new Object[]{bigCardWebContentRender, str});
        } else {
            bigCardWebContentRender.c(str);
        }
    }

    @Override // tb.wpd
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c090532a", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b458835f", new Object[]{this, str});
            return;
        }
        ShopWrapWebView shopWrapWebView = this.d;
        if (shopWrapWebView != null) {
            WVStandardEventCenter.postNotificationToJS(shopWrapWebView, str, "");
        }
    }

    @Override // tb.wpd
    public void destroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a84ec6", new Object[]{this});
            return;
        }
        ShopWrapWebView shopWrapWebView = this.d;
        if (shopWrapWebView != null) {
            shopWrapWebView.destroy();
        }
        this.d = null;
    }

    @Override // tb.wpd
    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f577597a", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    @Override // tb.wpd
    public View getContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.wpd
    public void h(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c682d848", new Object[]{this, new Float(f)});
        } else {
            wpd.a.f(this, f);
        }
    }

    @Override // tb.wpd
    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("975ab1a6", new Object[]{this})).booleanValue();
        }
        return wpd.a.e(this);
    }

    @Override // tb.wpd
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("345056d6", new Object[]{this});
        } else {
            wpd.a.d(this);
        }
    }

    @Override // tb.wpd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        wpd.a.a(this);
        ShopWrapWebView shopWrapWebView = this.d;
        if (shopWrapWebView != null) {
            shopWrapWebView.onPause();
        }
    }

    @Override // tb.wpd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        wpd.a.b(this);
        ShopWrapWebView shopWrapWebView = this.d;
        if (shopWrapWebView != null) {
            shopWrapWebView.onResume();
        }
    }

    @Override // tb.wpd
    public void j() {
        JSONObject jSONObject;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f8288af", new Object[]{this});
            return;
        }
        wpd.a.c(this);
        if (this.d == null) {
            String g0 = this.f3114a.i().g0();
            if (g0 == null) {
                JSONObject n = this.f3114a.i().O0().n();
                g0 = null;
                if (n != null && (jSONObject = n.getJSONObject(AgooConstants.MESSAGE_EXT)) != null) {
                    g0 = jSONObject.getString("singleModuleRenderUrl");
                }
            }
            if (g0 != null) {
                Uri.Builder buildUpon = Uri.parse(g0).buildUpon();
                StringBuilder sb = new StringBuilder();
                sb.append(this.f3114a.i().O());
                sb.append(',');
                sb.append(this.f3114a.i().M());
                Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("paddingTopAndBottom", sb.toString());
                if (this.f3114a.i().L1() || this.f3114a.i().s() > 1) {
                    z = true;
                }
                String uri = appendQueryParameter.appendQueryParameter("hasNav", String.valueOf(z)).build().toString();
                ShopWrapWebView shopWrapWebView = new ShopWrapWebView(this.f3114a.e());
                shopWrapWebView.setShopData(this.f3114a.i());
                shopWrapWebView.setSwipeBigCardComponent(this.f3114a);
                this.d = shopWrapWebView;
                this.f3114a.v(new BigCardWebContentRender$onViewSelectedByViewPager$1(this));
                this.f3114a.i().Z2("immersive_webview_load_start", Long.valueOf(System.currentTimeMillis()));
                shopWrapWebView.render(uri);
                shopWrapWebView.setEnableCompatInViewPager(true);
                kew.a(this.c, shopWrapWebView);
            }
        }
    }
}
