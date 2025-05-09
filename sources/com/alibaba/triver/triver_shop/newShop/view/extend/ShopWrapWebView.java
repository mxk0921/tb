package com.alibaba.triver.triver_shop.newShop.view.extend;

import android.content.Context;
import android.graphics.Bitmap;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.util.AttributeSet;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.view.embed.SwipeBigCardComponent;
import com.alibaba.triver.triver_shop.preload.ShopRouterMiniDataPreload;
import com.alibaba.triver.triver_shop.web.ShopBaseWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.WebView;
import com.uc.webview.export.extension.UCExtension;
import tb.aqp;
import tb.ckf;
import tb.d1a;
import tb.mop;
import tb.mpp;
import tb.npp;
import tb.qop;
import tb.t2o;
import tb.tui;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ShopWrapWebView extends ShopBaseWebView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Runnable actionAfterOnPageFinish;
    private boolean alreadyInjectOnNShopPreloadResume;
    private boolean alreadyPreloadPageFinished;
    private String currentPageName;
    private Runnable loadFailedProcessor;
    private boolean realOnPageFinish;
    private ShopDataParser shopData;
    private String shopId;
    private SwipeBigCardComponent swipeBigCardComponent;
    private mpp shopLoftWebViewBizAdapter = new mpp();
    private qop shopFrameworkBizAdapter = new qop();
    private final boolean enableShopIndexPreSetPreloadStatus = aqp.Companion.a0();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a extends WVUCWebViewClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -332805219) {
                super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                return null;
            } else if (hashCode == 534767588) {
                super.onPageStarted((WebView) objArr[0], (String) objArr[1], (Bitmap) objArr[2]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/triver/triver_shop/newShop/view/extend/ShopWrapWebView$startPreloadShopIndexWeb$1");
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fdfe7e4", new Object[]{this, webView, str, bitmap});
                return;
            }
            super.onPageStarted(webView, str, bitmap);
            ShopWrapWebView.this.doOnPageFinishAction();
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                return;
            }
            super.onPageFinished(webView, str);
            ShopWrapWebView.this.setAlreadyPreloadPageFinished(true);
            npp.Companion.b("preload shopIndex pageFinish");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d1a<xhv> f3269a;

        public b(d1a<xhv> d1aVar) {
            this.f3269a = d1aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f3269a.invoke();
            }
        }
    }

    static {
        t2o.a(766510101);
    }

    public ShopWrapWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public static /* synthetic */ Object ipc$super(ShopWrapWebView shopWrapWebView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/extend/ShopWrapWebView");
    }

    public final void doOnPageFinishAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b63849", new Object[]{this});
            return;
        }
        this.realOnPageFinish = true;
        Runnable runnable = this.actionAfterOnPageFinish;
        if (runnable != null) {
            runnable.run();
        }
        this.actionAfterOnPageFinish = null;
    }

    public final boolean getAlreadyInjectOnNShopPreloadResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4398e52f", new Object[]{this})).booleanValue();
        }
        return this.alreadyInjectOnNShopPreloadResume;
    }

    public final boolean getAlreadyPreloadPageFinished() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54f9d3", new Object[]{this})).booleanValue();
        }
        return this.alreadyPreloadPageFinished;
    }

    public final String getCurrentPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f927f6fc", new Object[]{this});
        }
        return this.currentPageName;
    }

    public final Runnable getLoadFailedProcessor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("74e175b4", new Object[]{this});
        }
        return this.loadFailedProcessor;
    }

    public final ShopDataParser getShopData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDataParser) ipChange.ipc$dispatch("16b01ba5", new Object[]{this});
        }
        return this.shopData;
    }

    public final qop getShopFrameworkBizAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qop) ipChange.ipc$dispatch("1bca6c38", new Object[]{this});
        }
        return this.shopFrameworkBizAdapter;
    }

    public final String getShopId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3946bb2", new Object[]{this});
        }
        return this.shopId;
    }

    public final mpp getShopLoftWebViewBizAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mpp) ipChange.ipc$dispatch("12165864", new Object[]{this});
        }
        return this.shopLoftWebViewBizAdapter;
    }

    public final SwipeBigCardComponent getSwipeBigCardComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SwipeBigCardComponent) ipChange.ipc$dispatch("89d5dba1", new Object[]{this});
        }
        return this.swipeBigCardComponent;
    }

    public final void printPreloadStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5279bb35", new Object[]{this});
            return;
        }
        npp.a aVar = npp.Companion;
        aVar.b("preload webView PageFinish : " + this.alreadyPreloadPageFinished + ", alreadyInject : " + this.alreadyInjectOnNShopPreloadResume);
    }

    @Override // com.alibaba.triver.triver_shop.web.ShopBaseWebView
    public void render(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95df87a7", new Object[]{this, str});
            return;
        }
        initRenderSettings();
        UCExtension uCExtension = getUCExtension();
        if (uCExtension != null) {
            uCExtension.setClient(new ShopWebUCClient(this));
        }
        loadUrl(str);
    }

    public final void setAlreadyInjectOnNShopPreloadResume(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7067715", new Object[]{this, new Boolean(z)});
        } else {
            this.alreadyInjectOnNShopPreloadResume = z;
        }
    }

    public final void setAlreadyPreloadPageFinished(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7c82459", new Object[]{this, new Boolean(z)});
        } else {
            this.alreadyPreloadPageFinished = z;
        }
    }

    public final void setCurrentPageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5febd62", new Object[]{this, str});
        } else {
            this.currentPageName = str;
        }
    }

    public final void setLoadFailedProcessor(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd64c1d2", new Object[]{this, runnable});
        } else {
            this.loadFailedProcessor = runnable;
        }
    }

    public final void setShopData(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37976b35", new Object[]{this, shopDataParser});
        } else {
            this.shopData = shopDataParser;
        }
    }

    public final void setShopFrameworkBizAdapter(qop qopVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e639eca0", new Object[]{this, qopVar});
            return;
        }
        ckf.g(qopVar, "<set-?>");
        this.shopFrameworkBizAdapter = qopVar;
    }

    public final void setShopId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea2f804", new Object[]{this, str});
        } else {
            this.shopId = str;
        }
    }

    public final void setShopLoftWebViewBizAdapter(mpp mppVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ba8c360", new Object[]{this, mppVar});
            return;
        }
        ckf.g(mppVar, "<set-?>");
        this.shopLoftWebViewBizAdapter = mppVar;
    }

    public final void setSwipeBigCardComponent(SwipeBigCardComponent swipeBigCardComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6b128d", new Object[]{this, swipeBigCardComponent});
        } else {
            this.swipeBigCardComponent = swipeBigCardComponent;
        }
    }

    public final void startPreloadShopIndexWeb() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b86f826", new Object[]{this});
            return;
        }
        npp.a aVar = npp.Companion;
        aVar.b("start preload shopIndex");
        setWebViewClient(new a(this.context));
        if (aqp.Companion.P0()) {
            aVar.b("use preRelease preRenderUrl");
            str = ckf.p("https://pages.wapa.taobao.com/shop/app/tb-shop-team/shop-isomorphism/home?isNShopPreload=true&firstLaunchShop=", Boolean.valueOf(ShopDataParser.Companion.a()));
        } else {
            aVar.b("use online preRenderUrl");
            str = ckf.p("https://tbshop.m.taobao.com/app/tb-shop-team/shop-isomorphism/home?isNShopPreload=true&firstLaunchShop=", Boolean.valueOf(ShopDataParser.Companion.a()));
        }
        render(str);
        if (this.enableShopIndexPreSetPreloadStatus) {
            this.alreadyPreloadPageFinished = true;
        }
        aVar.b(ckf.p("start preload shop index web use : ", str));
    }

    public final void startRenderByRealUrl(String str) {
        String str2;
        JSONObject T0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2b0a1f3", new Object[]{this, str});
        } else if (!this.alreadyPreloadPageFinished) {
            npp.Companion.b("shopIndex star render by real url failed, not page finished");
        } else if (this.alreadyInjectOnNShopPreloadResume) {
            npp.Companion.b("alreadyInjectOnNShopPreloadResume");
        } else {
            tui d = ShopRouterMiniDataPreload.INSTANCE.d();
            ShopDataParser shopDataParser = this.shopData;
            String str3 = null;
            if (!ckf.b(shopDataParser == null ? null : shopDataParser.W0(), d == null ? null : d.c())) {
                d = null;
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put((JSONObject) "preloadData", (String) jSONObject2);
            jSONObject.put((JSONObject) "url", str);
            ShopDataParser shopDataParser2 = this.shopData;
            boolean z = shopDataParser2 == null || !shopDataParser2.Y() || aqp.Companion.D();
            if (z) {
                ShopDataParser shopDataParser3 = this.shopData;
                if (shopDataParser3 != null && !shopDataParser3.a0()) {
                    ShopDataParser shopDataParser4 = this.shopData;
                    str2 = (shopDataParser4 == null || (T0 = shopDataParser4.T0()) == null) ? null : T0.toJSONString();
                } else {
                    ShopDataParser shopDataParser5 = this.shopData;
                    str2 = JSON.toJSONString(shopDataParser5 == null ? null : shopDataParser5.T0(), SerializerFeature.DisableCircularReferenceDetect);
                }
                jSONObject2.put((JSONObject) mop.KEY_SHOP_FETCH, str2);
                if (d != null) {
                    str3 = d.a();
                }
                jSONObject2.put((JSONObject) "minidata", str3);
            }
            npp.Companion.b(ckf.p("injectShopFetchUseMainThread : ", Boolean.valueOf(z)));
            ShopWrapWebView$startRenderByRealUrl$injectJsBlock$1 shopWrapWebView$startRenderByRealUrl$injectJsBlock$1 = new ShopWrapWebView$startRenderByRealUrl$injectJsBlock$1(this, jSONObject);
            if (!this.enableShopIndexPreSetPreloadStatus) {
                shopWrapWebView$startRenderByRealUrl$injectJsBlock$1.invoke();
            } else if (this.realOnPageFinish) {
                shopWrapWebView$startRenderByRealUrl$injectJsBlock$1.invoke();
            } else {
                this.actionAfterOnPageFinish = new b(shopWrapWebView$startRenderByRealUrl$injectJsBlock$1);
            }
            this.alreadyInjectOnNShopPreloadResume = true;
        }
    }

    public ShopWrapWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ShopWrapWebView(Context context) {
        super(context);
    }
}
