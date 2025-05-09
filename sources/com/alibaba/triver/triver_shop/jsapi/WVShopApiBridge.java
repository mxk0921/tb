package com.alibaba.triver.triver_shop.jsapi;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.view.embed.SwipeBigCardComponent;
import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.alibaba.triver.triver_shop.preload.ShopRouterMiniDataPreload;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import tb.a1v;
import tb.brf;
import tb.ckf;
import tb.d1a;
import tb.f4w;
import tb.g1a;
import tb.iop;
import tb.jpu;
import tb.kew;
import tb.kht;
import tb.kpw;
import tb.mpp;
import tb.npp;
import tb.qop;
import tb.r54;
import tb.rsq;
import tb.ssq;
import tb.t2o;
import tb.tui;
import tb.vxm;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class WVShopApiBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f3046a;

        public a(View view) {
            this.f3046a = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                kew.h(this.f3046a);
            }
        }
    }

    static {
        t2o.a(766509338);
    }

    public static final /* synthetic */ ShopDataParser access$getShopData(WVShopApiBridge wVShopApiBridge, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDataParser) ipChange.ipc$dispatch("266bf401", new Object[]{wVShopApiBridge, wVCallBackContext});
        }
        return wVShopApiBridge.getShopData(wVCallBackContext);
    }

    public static final /* synthetic */ ShopWrapWebView access$getShopWrapWebView(WVShopApiBridge wVShopApiBridge, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopWrapWebView) ipChange.ipc$dispatch("14ac8c2a", new Object[]{wVShopApiBridge, wVCallBackContext});
        }
        return wVShopApiBridge.getShopWrapWebView(wVCallBackContext);
    }

    private final void currentPageLoadFailed(WVCallBackContext wVCallBackContext, String str) {
        ShopWrapWebView shopWrapWebView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebc9f7d9", new Object[]{this, wVCallBackContext, str});
            return;
        }
        JSONObject k = brf.k(str);
        if (k != null) {
            String string = k.getString("errorMsg");
            String string2 = k.getString("area");
            npp.a aVar = npp.Companion;
            aVar.b("currentPageLoadFailed " + ((Object) string2) + " , " + ((Object) string));
        }
        if (wVCallBackContext != null) {
            wVCallBackContext.success();
        }
        Runnable runnable = null;
        if (!(wVCallBackContext == null || (shopWrapWebView = getShopWrapWebView(wVCallBackContext)) == null)) {
            runnable = shopWrapWebView.getLoadFailedProcessor();
        }
        r54.B(runnable);
    }

    private final void currentPageStartScroll(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ff3aa4b", new Object[]{this, wVCallBackContext});
        } else {
            r54.C(new WVShopApiBridge$currentPageStartScroll$1(wVCallBackContext, this));
        }
    }

    private final void currentPageStopScroll(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9243607b", new Object[]{this, wVCallBackContext});
        } else {
            r54.C(new WVShopApiBridge$currentPageStopScroll$1(wVCallBackContext, this));
        }
    }

    private final void foldBigCard(WVCallBackContext wVCallBackContext) {
        ShopWrapWebView shopWrapWebView;
        ShopDataParser.ShopViewContext m1;
        d1a<xhv> E;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46961233", new Object[]{this, wVCallBackContext});
            return;
        }
        ShopDataParser shopData = getShopData(wVCallBackContext);
        if (shopData == null || (m1 = shopData.m1()) == null || (E = m1.E()) == null) {
            SwipeBigCardComponent swipeBigCardComponent = null;
            if (!(wVCallBackContext == null || (shopWrapWebView = getShopWrapWebView(wVCallBackContext)) == null)) {
                swipeBigCardComponent = shopWrapWebView.getSwipeBigCardComponent();
            }
            if (swipeBigCardComponent != null) {
                r54.C(new WVShopApiBridge$foldBigCard$2(swipeBigCardComponent));
                return;
            }
            return;
        }
        E.invoke();
    }

    private final void getBigCardModuleData(WVCallBackContext wVCallBackContext) {
        ShopDataParser shopData;
        ShopDataParser shopData2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4ab9e14", new Object[]{this, wVCallBackContext});
        } else if (wVCallBackContext != null) {
            ShopWrapWebView shopWrapWebView = getShopWrapWebView(wVCallBackContext);
            JSONObject jSONObject = null;
            JSONObject R0 = (shopWrapWebView == null || (shopData2 = shopWrapWebView.getShopData()) == null) ? null : shopData2.R0();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put((JSONObject) "shopCarouselCardVO", (String) R0);
            ShopWrapWebView shopWrapWebView2 = getShopWrapWebView(wVCallBackContext);
            if (!(shopWrapWebView2 == null || (shopData = shopWrapWebView2.getShopData()) == null)) {
                jSONObject = shopData.r1();
            }
            jSONObject2.put((JSONObject) "prefetchBizData", (String) jSONObject);
            wVCallBackContext.success(jSONObject2.toJSONString());
        }
    }

    private final void getBottomTabPositionInfo(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caad3399", new Object[]{this, wVCallBackContext, str});
        } else {
            r54.C(new WVShopApiBridge$getBottomTabPositionInfo$1(str, wVCallBackContext, this));
        }
    }

    private final void getCurrentShopLoftCardData(WVCallBackContext wVCallBackContext) {
        ShopWrapWebView shopWrapWebView;
        mpp shopLoftWebViewBizAdapter;
        JSONObject d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6e44f48", new Object[]{this, wVCallBackContext});
        } else if (wVCallBackContext != null && (shopWrapWebView = getShopWrapWebView(wVCallBackContext)) != null && (shopLoftWebViewBizAdapter = shopWrapWebView.getShopLoftWebViewBizAdapter()) != null && (d = shopLoftWebViewBizAdapter.d()) != null) {
            wVCallBackContext.success(d.toString());
        } else if (wVCallBackContext != null) {
            wVCallBackContext.error("shopLoftDataError", f4w.LOAD_DATA_NULL);
        }
    }

    private final ShopDataParser getShopData(WVCallBackContext wVCallBackContext) {
        IWVWebView webview;
        Context context;
        ShopWrapWebView shopWrapWebView;
        ShopDataParser shopData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDataParser) ipChange.ipc$dispatch("c2fa8ec8", new Object[]{this, wVCallBackContext});
        }
        if (wVCallBackContext != null && (shopWrapWebView = getShopWrapWebView(wVCallBackContext)) != null && (shopData = shopWrapWebView.getShopData()) != null) {
            return shopData;
        }
        if (wVCallBackContext == null || (webview = wVCallBackContext.getWebview()) == null || (context = webview.getContext()) == null) {
            return null;
        }
        if (context instanceof MutableContextWrapper) {
            context = ((MutableContextWrapper) context).getBaseContext();
            ckf.f(context, "targetContext.baseContext");
        }
        if (context instanceof iop) {
            return ((iop) context).d0();
        }
        return null;
    }

    private final void getShopFirstIndexNavData(WVCallBackContext wVCallBackContext, String str) {
        JSONArray w;
        JSONObject g;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509f4d", new Object[]{this, wVCallBackContext, str});
            return;
        }
        ShopDataParser shopData = getShopData(wVCallBackContext);
        if (shopData != null && (w = shopData.w()) != null && (g = brf.g(w, 0)) != null && (jSONArray = g.getJSONArray("childrens")) != null && wVCallBackContext != null) {
            wVCallBackContext.success(brf.a(jpu.a("data", jSONArray)).toJSONString());
        }
    }

    private final void getShopLoftVideoCardVideoPlayerInfo(WVCallBackContext wVCallBackContext) {
        mpp shopLoftWebViewBizAdapter;
        d1a<JSONObject> g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7fba2e0", new Object[]{this, wVCallBackContext});
        } else if (wVCallBackContext != null) {
            ShopWrapWebView shopWrapWebView = getShopWrapWebView(wVCallBackContext);
            JSONObject jSONObject = null;
            if (!(shopWrapWebView == null || (shopLoftWebViewBizAdapter = shopWrapWebView.getShopLoftWebViewBizAdapter()) == null || (g = shopLoftWebViewBizAdapter.g()) == null)) {
                jSONObject = g.invoke();
            }
            if (jSONObject != null) {
                wVCallBackContext.success(jSONObject.toString());
            } else {
                wVCallBackContext.error("can not get player info");
            }
        }
    }

    private final void getShopPIParams(String str, WVCallBackContext wVCallBackContext) {
        ShopWrapWebView shopWrapWebView;
        ShopDataParser shopData;
        JSONObject X0;
        String a2;
        ShopDataParser shopData2;
        ShopDataParser shopData3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20ca99d9", new Object[]{this, str, wVCallBackContext});
        } else if (wVCallBackContext != null && (shopWrapWebView = getShopWrapWebView(wVCallBackContext)) != null && (shopData = shopWrapWebView.getShopData()) != null && (X0 = shopData.X0()) != null) {
            tui d = ShopRouterMiniDataPreload.INSTANCE.d();
            if (d != null) {
                if (System.currentTimeMillis() - d.b() >= 10000) {
                    npp.Companion.b("shop route mini data cache expire");
                } else {
                    ShopWrapWebView shopWrapWebView2 = getShopWrapWebView(wVCallBackContext);
                    String str2 = null;
                    if (!(shopWrapWebView2 == null || (shopData3 = shopWrapWebView2.getShopData()) == null)) {
                        str2 = shopData3.W0();
                    }
                    if (ckf.b(str2, d.c()) && (a2 = d.a()) != null) {
                        X0.put((JSONObject) "minidata", a2);
                        npp.Companion.b("shop route mini data cache hit");
                        ShopWrapWebView shopWrapWebView3 = getShopWrapWebView(wVCallBackContext);
                        if (!(shopWrapWebView3 == null || (shopData2 = shopWrapWebView3.getShopData()) == null)) {
                            shopData2.Y2("miniDataCacheHit", "true");
                        }
                    }
                }
            }
            wVCallBackContext.success(X0.toJSONString());
        } else if (wVCallBackContext != null) {
            wVCallBackContext.error();
        }
    }

    private final ShopWrapWebView getShopWrapWebView(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopWrapWebView) ipChange.ipc$dispatch("144aeab1", new Object[]{this, wVCallBackContext});
        }
        IWVWebView webview = wVCallBackContext.getWebview();
        if (webview != null && (webview instanceof ShopWrapWebView)) {
            return (ShopWrapWebView) webview;
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(WVShopApiBridge wVShopApiBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/jsapi/WVShopApiBridge");
    }

    private final void markPerformance(String str, WVCallBackContext wVCallBackContext) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16e8a2b1", new Object[]{this, str, wVCallBackContext});
            return;
        }
        ShopWrapWebView shopWrapWebView = wVCallBackContext == null ? null : getShopWrapWebView(wVCallBackContext);
        ShopDataParser shopData = getShopData(wVCallBackContext);
        if (shopData != null) {
            JSONObject k = brf.k(str);
            if (k != null) {
                JSONArray jSONArray = new JSONArray();
                Object obj = k.get("data");
                if (obj instanceof JSONArray) {
                    jSONArray = obj;
                }
                for (Object obj2 : jSONArray) {
                    if (obj2 instanceof JSONObject) {
                        JSONObject jSONObject = (JSONObject) obj2;
                        String string = jSONObject.getString("name");
                        String string2 = jSONObject.getString("time");
                        ckf.f(string2, "apiParam.getString(\"time\")");
                        Long o = ssq.o(string2);
                        if (o == null) {
                            j = System.currentTimeMillis();
                        } else {
                            j = o.longValue();
                        }
                        if (ckf.b(string, "shopModuleRenderEnd")) {
                            vxm.b.e().j("moduleRenderCompleteTime", r54.j(j));
                        }
                        if (ckf.b(string, "shopIndexRenderEnd")) {
                            shopData.Y2(ckf.p(shopWrapWebView == null ? null : shopWrapWebView.getCurrentPageName(), "_appEnd"), Long.valueOf(j));
                            updateStageData(shopWrapWebView, shopData, "uc_t2_time", Long.valueOf(j));
                        }
                        ckf.f(string, "name");
                        updateStageData(shopWrapWebView, shopData, string, Long.valueOf(j));
                    }
                }
            }
            if (wVCallBackContext != null) {
                wVCallBackContext.success();
            }
        } else if (wVCallBackContext != null) {
            wVCallBackContext.error();
        }
    }

    private final void remoteLog(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d791f2ec", new Object[]{this, str, wVCallBackContext});
        } else {
            npp.Companion.b(str);
        }
    }

    private final void removeRelationWebLoadingPic(WVCallBackContext wVCallBackContext) {
        ShopWrapWebView shopWrapWebView;
        qop shopFrameworkBizAdapter;
        View a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45c866a6", new Object[]{this, wVCallBackContext});
        } else if (wVCallBackContext != null && (shopWrapWebView = getShopWrapWebView(wVCallBackContext)) != null && (shopFrameworkBizAdapter = shopWrapWebView.getShopFrameworkBizAdapter()) != null && (a2 = shopFrameworkBizAdapter.a()) != null) {
            a2.post(new a(a2));
        }
    }

    private final void setCrossStoreHeaderStatus(WVCallBackContext wVCallBackContext, String str) {
        JSONObject k;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d30c390", new Object[]{this, wVCallBackContext, str});
            return;
        }
        npp.Companion.f(ckf.p("WVShopApiBridge setCrossStoreHeaderStatus ", str));
        ShopDataParser shopData = getShopData(wVCallBackContext);
        if (shopData != null && (k = brf.k(str)) != null && (string = k.getString("showCrossStoreHeader")) != null) {
            r54.C(new WVShopApiBridge$setCrossStoreHeaderStatus$1(shopData, ckf.b(string, "true"), wVCallBackContext));
        }
    }

    private final void shopLoftMarkPerformance(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("132f6aca", new Object[]{this, str, wVCallBackContext});
            return;
        }
        ShopWrapWebView shopWrapWebView = wVCallBackContext == null ? null : getShopWrapWebView(wVCallBackContext);
        if (shopWrapWebView != null) {
            JSONObject k = brf.k(str);
            if (k != null) {
                JSONArray jSONArray = new JSONArray();
                Object obj = k.get("data");
                if (obj instanceof JSONArray) {
                    jSONArray = obj;
                }
                for (Object obj2 : jSONArray) {
                    if (obj2 instanceof JSONObject) {
                        JSONObject jSONObject = (JSONObject) obj2;
                        shopWrapWebView.getShopLoftWebViewBizAdapter().f().put((JSONObject) jSONObject.getString("name"), (String) jSONObject.get("time"));
                    }
                }
            }
            wVCallBackContext.success();
        }
    }

    private final void shopLoftVideoAutoPlayNext(WVCallBackContext wVCallBackContext, String str) {
        String string;
        ShopWrapWebView shopWrapWebView;
        mpp shopLoftWebViewBizAdapter;
        g1a<Boolean, xhv> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49336d8", new Object[]{this, wVCallBackContext, str});
            return;
        }
        JSONObject k = brf.k(str);
        if (k != null && (string = k.getString("autoPlayNext")) != null) {
            if (!(wVCallBackContext == null || (shopWrapWebView = getShopWrapWebView(wVCallBackContext)) == null || (shopLoftWebViewBizAdapter = shopWrapWebView.getShopLoftWebViewBizAdapter()) == null || (a2 = shopLoftWebViewBizAdapter.a()) == null)) {
                a2.invoke(Boolean.valueOf(ckf.b(string, "true")));
            }
            if (wVCallBackContext != null) {
                wVCallBackContext.success();
            }
        } else if (wVCallBackContext != null) {
            wVCallBackContext.error();
        }
    }

    private final void shopLoftVideoPlayRate(WVCallBackContext wVCallBackContext, String str) {
        String string;
        Float l;
        ShopWrapWebView shopWrapWebView;
        mpp shopLoftWebViewBizAdapter;
        g1a<Float, xhv> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d505276", new Object[]{this, wVCallBackContext, str});
            return;
        }
        JSONObject k = brf.k(str);
        if (k != null && (string = k.getString("rate")) != null && (l = rsq.l(string)) != null) {
            float floatValue = l.floatValue();
            if (!(wVCallBackContext == null || (shopWrapWebView = getShopWrapWebView(wVCallBackContext)) == null || (shopLoftWebViewBizAdapter = shopWrapWebView.getShopLoftWebViewBizAdapter()) == null || (b = shopLoftWebViewBizAdapter.b()) == null)) {
                b.invoke(Float.valueOf(floatValue));
            }
            if (wVCallBackContext != null) {
                wVCallBackContext.success();
            }
        } else if (wVCallBackContext != null) {
            wVCallBackContext.error();
        }
    }

    private final void shopLoftVideoSeekTo(WVCallBackContext wVCallBackContext, String str) {
        ShopWrapWebView shopWrapWebView;
        JSONObject k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13fc1595", new Object[]{this, wVCallBackContext, str});
        } else if (wVCallBackContext != null && str != null && (shopWrapWebView = getShopWrapWebView(wVCallBackContext)) != null && (k = brf.k(str)) != null) {
            String string = k.getString("position");
            Integer m = string == null ? null : ssq.m(string);
            if (m == null) {
                npp.Companion.b("shopLoftVideoSeekTo position is null");
                return;
            }
            g1a<Integer, xhv> j = shopWrapWebView.getShopLoftWebViewBizAdapter().j();
            if (j != null) {
                j.invoke(m);
            }
        }
    }

    private final void shopLoftVideoSkip(WVCallBackContext wVCallBackContext) {
        ShopWrapWebView shopWrapWebView;
        mpp shopLoftWebViewBizAdapter;
        d1a<xhv> h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75eebf7", new Object[]{this, wVCallBackContext});
            return;
        }
        if (!(wVCallBackContext == null || (shopWrapWebView = getShopWrapWebView(wVCallBackContext)) == null || (shopLoftWebViewBizAdapter = shopWrapWebView.getShopLoftWebViewBizAdapter()) == null || (h = shopLoftWebViewBizAdapter.h()) == null)) {
            h.invoke();
        }
        if (wVCallBackContext != null) {
            wVCallBackContext.success();
        }
    }

    private final void showAllItemCountIcon(WVCallBackContext wVCallBackContext, String str) {
        JSONObject k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f9d631f", new Object[]{this, wVCallBackContext, str});
        } else if (wVCallBackContext != null && str != null && (k = brf.k(str)) != null) {
            String string = k.getString("iconBottomPadding");
            Float f = null;
            Float l = string == null ? null : rsq.l(string);
            if (l != null) {
                float floatValue = l.floatValue();
                String string2 = k.getString("iconRightPadding");
                if (string2 != null) {
                    f = rsq.l(string2);
                }
                if (f != null) {
                    float floatValue2 = f.floatValue();
                    String string3 = k.getString("visible");
                    if (string3 != null) {
                        r54.C(new WVShopApiBridge$showAllItemCountIcon$1$1$1(this, wVCallBackContext, string3, floatValue, floatValue2));
                    }
                }
            }
        }
    }

    private final void switchTabTo(WVCallBackContext wVCallBackContext, String str) {
        JSONObject k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ae462a", new Object[]{this, wVCallBackContext, str});
            return;
        }
        ShopDataParser shopData = getShopData(wVCallBackContext);
        if (shopData != null && (k = brf.k(str)) != null) {
            r54.C(new WVShopApiBridge$switchTabTo$1$1$1(k.getString("direction"), shopData, k.getString("tabName")));
        }
    }

    private final void updateBigCardModuleIndex(String str, WVCallBackContext wVCallBackContext) {
        JSONObject k;
        ShopWrapWebView shopWrapWebView;
        ShopDataParser.ShopViewContext m1;
        g1a<Integer, xhv> F;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db400ad", new Object[]{this, str, wVCallBackContext});
        } else if (str != null && (k = brf.k(str)) != null) {
            String string = k.getString("index");
            ckf.f(string, "data.getString(\"index\")");
            Integer m = ssq.m(string);
            if (m != null) {
                int intValue = m.intValue();
                ShopDataParser shopData = getShopData(wVCallBackContext);
                if (shopData == null || (m1 = shopData.m1()) == null || (F = m1.F()) == null) {
                    SwipeBigCardComponent swipeBigCardComponent = null;
                    if (!(wVCallBackContext == null || (shopWrapWebView = getShopWrapWebView(wVCallBackContext)) == null)) {
                        swipeBigCardComponent = shopWrapWebView.getSwipeBigCardComponent();
                    }
                    r54.C(new WVShopApiBridge$updateBigCardModuleIndex$2(swipeBigCardComponent, intValue));
                    npp.Companion.b(ckf.p("updateBigCardModuleIndex : ", m));
                    return;
                }
                r54.C(new WVShopApiBridge$updateBigCardModuleIndex$1$1(F, intValue));
            }
        }
    }

    private final void updateNextPageProperties(WVCallBackContext wVCallBackContext, String str) {
        JSONObject k;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a719552c", new Object[]{this, wVCallBackContext, str});
        } else if (str != null && (k = brf.k(str)) != null && (jSONObject = k.getJSONObject("nextPageProperty")) != null) {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(r54.T(jSONObject));
            if (wVCallBackContext != null) {
                wVCallBackContext.success();
            }
        }
    }

    private final void updateShopLoftWebDialogStatus(WVCallBackContext wVCallBackContext, String str) {
        ShopWrapWebView shopWrapWebView;
        JSONObject k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e701c6ac", new Object[]{this, wVCallBackContext, str});
        } else if (wVCallBackContext != null && (shopWrapWebView = getShopWrapWebView(wVCallBackContext)) != null && (k = brf.k(str)) != null) {
            boolean b = ckf.b(k.getString("isWebDialogOpen"), "true");
            npp.Companion.b(ckf.p("updateShopLoftWebDialogStatus : ", Boolean.valueOf(b)));
            r54.C(new WVShopApiBridge$updateShopLoftWebDialogStatus$1(shopWrapWebView, b));
        }
    }

    private final void updateShopLoftWebLayerSafeAreaHeight(WVCallBackContext wVCallBackContext, String str) {
        ShopWrapWebView shopWrapWebView;
        JSONObject k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("705ea67c", new Object[]{this, wVCallBackContext, str});
        } else if (wVCallBackContext != null && (shopWrapWebView = getShopWrapWebView(wVCallBackContext)) != null && (k = brf.k(str)) != null) {
            String string = k.getString("safeAreaHeight");
            Integer m = string == null ? null : ssq.m(string);
            if (m != null) {
                int P = kew.P(m);
                shopWrapWebView.getShopLoftWebViewBizAdapter().s(P);
                npp.Companion.b(ckf.p("updateShopLoftWebLayerSafeAreaHeight : ", Integer.valueOf(P)));
            }
        }
    }

    private final void updateStageData(ShopWrapWebView shopWrapWebView, ShopDataParser shopDataParser, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("240fb1ba", new Object[]{this, shopWrapWebView, shopDataParser, str, obj});
            return;
        }
        if ((shopWrapWebView == null ? null : shopWrapWebView.getCurrentPageName()) != null) {
            shopDataParser.Z2("js_" + ((Object) shopWrapWebView.getCurrentPageName()) + '_' + str, obj);
            return;
        }
        shopDataParser.Z2(ckf.p("js_", str), obj);
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -2144925060:
                    if (str.equals("shopLoftMarkPerformance")) {
                        shopLoftMarkPerformance(str2, wVCallBackContext);
                        break;
                    }
                    break;
                case -1931746041:
                    if (str.equals("currentPageStartScroll")) {
                        currentPageStartScroll(wVCallBackContext);
                        break;
                    }
                    break;
                case -1851982861:
                    if (str.equals("getHeadCollapsedStatus")) {
                        getHeadCollapsedStatus(wVCallBackContext, str2);
                        break;
                    }
                    break;
                case -1762387277:
                    if (str.equals("shopLoftVideoSkip")) {
                        shopLoftVideoSkip(wVCallBackContext);
                        break;
                    }
                    break;
                case -1489259446:
                    if (str.equals("shopLoftVideoAutoPlayNext")) {
                        shopLoftVideoAutoPlayNext(wVCallBackContext, str2);
                        break;
                    }
                    break;
                case -1442720953:
                    if (str.equals("shopLoftVideoSeekTo")) {
                        shopLoftVideoSeekTo(wVCallBackContext, str2);
                        break;
                    }
                    break;
                case -1354341633:
                    if (str.equals("getShopFirstIndexNavData")) {
                        getShopFirstIndexNavData(wVCallBackContext, str2);
                        break;
                    }
                    break;
                case -1293849918:
                    if (str.equals("notifyCurrentPageLoadFailed")) {
                        currentPageLoadFailed(wVCallBackContext, str2);
                        break;
                    }
                    break;
                case -1169818678:
                    if (str.equals("allItemCategoryTips")) {
                        allItemCategoryTips(wVCallBackContext, str2);
                        break;
                    }
                    break;
                case -1097746105:
                    if (str.equals("getShopCurrentPageName")) {
                        getShopCurrentPageName(wVCallBackContext, str2);
                        break;
                    }
                    break;
                case -908605110:
                    if (str.equals("checkBigCardVisible")) {
                        checkBigCardVisible(wVCallBackContext);
                        break;
                    }
                    break;
                case -851576320:
                    if (str.equals("contentContainerBrowser")) {
                        contentContainerBrowser(wVCallBackContext, str2);
                        break;
                    }
                    break;
                case -693635759:
                    if (str.equals("showAllItemCountIcon")) {
                        showAllItemCountIcon(wVCallBackContext, str2);
                        break;
                    }
                    break;
                case -520037090:
                    if (str.equals("updateShopLoftWebDialogStatus")) {
                        updateShopLoftWebDialogStatus(wVCallBackContext, str2);
                        break;
                    }
                    break;
                case -516356350:
                    if (str.equals("setCrossStoreHeaderStatus")) {
                        setCrossStoreHeaderStatus(wVCallBackContext, str2);
                        break;
                    }
                    break;
                case -11622369:
                    if (str.equals("updateBigCardModuleIndex")) {
                        updateBigCardModuleIndex(str2, wVCallBackContext);
                        break;
                    }
                    break;
                case 7734859:
                    if (str.equals("getBottomTabPositionInfo")) {
                        getBottomTabPositionInfo(wVCallBackContext, str2);
                        break;
                    }
                    break;
                case 238207214:
                    if (str.equals("updateShopLoftWebLayerSafeAreaHeight")) {
                        updateShopLoftWebLayerSafeAreaHeight(wVCallBackContext, str2);
                        break;
                    }
                    break;
                case 835233028:
                    if (str.equals("getCurrentShopLoftCardData")) {
                        getCurrentShopLoftCardData(wVCallBackContext);
                        break;
                    }
                    break;
                case 912705488:
                    if (str.equals("getBigCardModuleData")) {
                        getBigCardModuleData(wVCallBackContext);
                        break;
                    }
                    break;
                case 914745419:
                    if (str.equals("getShopPIParams")) {
                        getShopPIParams(str2, wVCallBackContext);
                        break;
                    }
                    break;
                case 1127476023:
                    if (str.equals("currentPageStopScroll")) {
                        currentPageStopScroll(wVCallBackContext);
                        break;
                    }
                    break;
                case 1152682910:
                    if (str.equals(a1v.UPDATE_NEXT_PAGE_PROPERTIES)) {
                        updateNextPageProperties(wVCallBackContext, str2);
                        break;
                    }
                    break;
                case 1280509214:
                    if (str.equals("remoteLog")) {
                        remoteLog(str2, wVCallBackContext);
                        break;
                    }
                    break;
                case 1346068259:
                    if (str.equals("markPerformance")) {
                        markPerformance(str2, wVCallBackContext);
                        break;
                    }
                    break;
                case 1702038888:
                    if (str.equals("shopLoftVideoPlayRate")) {
                        shopLoftVideoPlayRate(wVCallBackContext, str2);
                        break;
                    }
                    break;
                case 1881645212:
                    if (str.equals("getShopLoftVideoCardVideoPlayerInfo")) {
                        getShopLoftVideoCardVideoPlayerInfo(wVCallBackContext);
                        break;
                    }
                    break;
                case 1887343007:
                    if (str.equals("foldIndexBigCard")) {
                        foldBigCard(wVCallBackContext);
                        break;
                    }
                    break;
                case 2051042914:
                    if (str.equals("removeRelationWebLoadingPic")) {
                        removeRelationWebLoadingPic(wVCallBackContext);
                        break;
                    }
                    break;
                case 2118644252:
                    if (str.equals(kht.actionSwitchTabTo)) {
                        switchTabTo(wVCallBackContext, str2);
                        break;
                    }
                    break;
            }
        }
        return true;
    }

    private final void allItemCategoryTips(WVCallBackContext wVCallBackContext, String str) {
        String string;
        ShopDataParser shopData;
        g1a<Boolean, Boolean> j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("280e1e58", new Object[]{this, wVCallBackContext, str});
            return;
        }
        JSONObject k = brf.k(str);
        if (k != null && (string = k.getString("visible")) != null && (shopData = getShopData(wVCallBackContext)) != null && (j = shopData.m1().j()) != null) {
            r54.C(new WVShopApiBridge$allItemCategoryTips$1$1$1$1$1(j, string, wVCallBackContext));
        } else if (wVCallBackContext != null) {
            wVCallBackContext.error(brf.a(jpu.a("success", Boolean.FALSE)).toString());
        }
    }

    private final void checkBigCardVisible(WVCallBackContext wVCallBackContext) {
        boolean z;
        String str;
        d1a<Boolean> b;
        Boolean invoke;
        ShopDataParser.ShopViewContext m1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdb1e98e", new Object[]{this, wVCallBackContext});
        } else if (wVCallBackContext != null) {
            ShopDataParser shopData = getShopData(wVCallBackContext);
            Boolean bool = null;
            d1a<Boolean> D = (shopData == null || (m1 = shopData.m1()) == null) ? null : m1.D();
            ShopWrapWebView shopWrapWebView = getShopWrapWebView(wVCallBackContext);
            SwipeBigCardComponent swipeBigCardComponent = shopWrapWebView == null ? null : shopWrapWebView.getSwipeBigCardComponent();
            if (D != null) {
                bool = D.invoke();
            }
            if (bool == null) {
                z = (swipeBigCardComponent == null || (b = swipeBigCardComponent.b()) == null || (invoke = b.invoke()) == null) ? false : invoke.booleanValue();
            } else {
                z = bool.booleanValue();
            }
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            wVCallBackContext.success(brf.a(jpu.a("visible", str)).toString());
        }
    }

    private final void contentContainerBrowser(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af6da10e", new Object[]{this, wVCallBackContext, str});
        } else if (str != null) {
            r54.C(new WVShopApiBridge$contentContainerBrowser$1$1(this, wVCallBackContext, str));
        } else if (wVCallBackContext != null) {
            wVCallBackContext.error(brf.a(jpu.a("success", Boolean.FALSE)).toString());
        }
    }

    private final void getHeadCollapsedStatus(WVCallBackContext wVCallBackContext, String str) {
        ShopDataParser.ShopViewContext m1;
        d1a<Boolean> d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d89f741", new Object[]{this, wVCallBackContext, str});
            return;
        }
        ShopDataParser shopData = getShopData(wVCallBackContext);
        Boolean bool = null;
        if (!(shopData == null || (m1 = shopData.m1()) == null || (d = m1.d()) == null)) {
            bool = d.invoke();
        }
        if (wVCallBackContext != null) {
            wVCallBackContext.success(brf.a(jpu.a("isCollapsed", bool)).toJSONString());
        }
    }

    private final void getShopCurrentPageName(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84347b95", new Object[]{this, wVCallBackContext, str});
        } else if (wVCallBackContext != null) {
            ShopDataParser shopData = getShopData(wVCallBackContext);
            if (shopData == null) {
                wVCallBackContext.error();
            } else {
                wVCallBackContext.success(brf.a(jpu.a("name", shopData.R())).toJSONString());
            }
        }
    }
}
