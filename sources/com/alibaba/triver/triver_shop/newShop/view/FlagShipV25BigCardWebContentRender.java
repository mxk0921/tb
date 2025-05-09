package com.alibaba.triver.triver_shop.newShop.view;

import android.net.Uri;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.view.embed.WebSwipeBigCardComponent;
import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Result;
import kotlin.b;
import org.android.agoo.common.AgooConstants;
import tb.ckf;
import tb.kew;
import tb.t2o;
import tb.wpd;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class FlagShipV25BigCardWebContentRender implements wpd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WebSwipeBigCardComponent f3116a;
    public boolean b;
    public final FrameLayout c;
    public ShopWrapWebView d;

    static {
        t2o.a(766509621);
        t2o.a(766509633);
    }

    public FlagShipV25BigCardWebContentRender(WebSwipeBigCardComponent webSwipeBigCardComponent) {
        ckf.g(webSwipeBigCardComponent, "swipeBigCardComponent");
        this.f3116a = webSwipeBigCardComponent;
        this.c = new FrameLayout(webSwipeBigCardComponent.b());
        webSwipeBigCardComponent.b().getLifecycle().addObserver(new LifecycleObserver() { // from class: com.alibaba.triver.triver_shop.newShop.view.FlagShipV25BigCardWebContentRender$lifeCycleObserver$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public final void onDestroy() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a6532022", new Object[]{this});
                    return;
                }
                FlagShipV25BigCardWebContentRender flagShipV25BigCardWebContentRender = FlagShipV25BigCardWebContentRender.this;
                try {
                    flagShipV25BigCardWebContentRender.destroyView();
                    FlagShipV25BigCardWebContentRender.b(flagShipV25BigCardWebContentRender).b().getLifecycle().removeObserver(this);
                    Result.m1108constructorimpl(xhv.INSTANCE);
                } catch (Throwable th) {
                    Result.m1108constructorimpl(b.a(th));
                }
            }
        });
    }

    public static final /* synthetic */ WebSwipeBigCardComponent b(FlagShipV25BigCardWebContentRender flagShipV25BigCardWebContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebSwipeBigCardComponent) ipChange.ipc$dispatch("75a22a03", new Object[]{flagShipV25BigCardWebContentRender});
        }
        return flagShipV25BigCardWebContentRender.f3116a;
    }

    public static final /* synthetic */ void c(FlagShipV25BigCardWebContentRender flagShipV25BigCardWebContentRender, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e1812ab", new Object[]{flagShipV25BigCardWebContentRender, str});
        } else {
            flagShipV25BigCardWebContentRender.d(str);
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

    public final void d(String str) {
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f8288af", new Object[]{this});
            return;
        }
        wpd.a.c(this);
        if (this.d == null) {
            JSONObject n = this.f3116a.f().O0().n();
            String str = null;
            if (!(n == null || (jSONObject = n.getJSONObject(AgooConstants.MESSAGE_EXT)) == null)) {
                str = jSONObject.getString("singleModuleRenderUrl");
            }
            if (str != null) {
                Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                StringBuilder sb = new StringBuilder();
                sb.append(this.f3116a.i());
                sb.append(',');
                sb.append(this.f3116a.h());
                String uri = buildUpon.appendQueryParameter("paddingTopAndBottom", sb.toString()).appendQueryParameter("hasNav", String.valueOf(this.f3116a.c())).build().toString();
                ShopWrapWebView shopWrapWebView = new ShopWrapWebView(this.f3116a.b());
                shopWrapWebView.setShopData(this.f3116a.f());
                this.d = shopWrapWebView;
                this.f3116a.s(new FlagShipV25BigCardWebContentRender$onViewSelectedByViewPager$1(this));
                this.f3116a.f().Z2("immersive_webview_load_start", Long.valueOf(System.currentTimeMillis()));
                shopWrapWebView.render(uri);
                shopWrapWebView.setEnableCompatInViewPager(true);
                kew.a(this.c, shopWrapWebView);
            }
        }
    }
}
