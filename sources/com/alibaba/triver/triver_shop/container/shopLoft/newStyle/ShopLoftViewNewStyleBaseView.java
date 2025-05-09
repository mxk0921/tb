package com.alibaba.triver.triver_shop.container.shopLoft.newStyle;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.ShopMoreUtils;
import com.alibaba.triver.triver_shop.container.ShopLoftActivity;
import com.alibaba.triver.triver_shop.newShop.ext.BizExtKt;
import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.alipay.birdnest.util.UiUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.TriggerChannelService;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.ut.share.business.ShareContent;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.app;
import tb.aqp;
import tb.bau;
import tb.bpp;
import tb.brf;
import tb.ckf;
import tb.jht;
import tb.jpu;
import tb.kew;
import tb.khu;
import tb.mpp;
import tb.npp;
import tb.t2o;
import tb.xpd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class ShopLoftViewNewStyleBaseView extends jht.b implements xpd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public xpd.c f3026a;
    public int c;
    public View d;
    public FrameLayout e;
    public FrameLayout f;
    public TUrlImageView g;
    public ShopLoftDXEngine h;
    public JSONObject i;
    public Map<String, String> j;
    public boolean k;
    public boolean l;
    public View m;
    public ShopWrapWebView n;
    public Context o;
    public final String b = "https://gw.alicdn.com/imgextra/i4/O1CN01fze6V91bZt8qjCFWY_!!6000000003480-2-tps-96-96.png";
    public final JSONObject p = new JSONObject();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class ShopLoftNewStyleWebWrapLayout extends FrameLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean alreadyDetected;
        private boolean needDispatchToWeb;
        private ShopWrapWebView shopWrapWebView;
        public final /* synthetic */ ShopLoftViewNewStyleBaseView this$0;

        static {
            t2o.a(766509281);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShopLoftNewStyleWebWrapLayout(ShopLoftViewNewStyleBaseView shopLoftViewNewStyleBaseView, Context context) {
            super(context);
            ckf.g(shopLoftViewNewStyleBaseView, "this$0");
            ckf.g(context, "context");
            this.this$0 = shopLoftViewNewStyleBaseView;
        }

        public static /* synthetic */ Object ipc$super(ShopLoftNewStyleWebWrapLayout shopLoftNewStyleWebWrapLayout, String str, Object... objArr) {
            if (str.hashCode() == 2075560917) {
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/newStyle/ShopLoftViewNewStyleBaseView$ShopLoftNewStyleWebWrapLayout");
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
            }
            if (motionEvent == null) {
                return false;
            }
            this.this$0.E(true);
            ShopWrapWebView shopWrapWebView = this.shopWrapWebView;
            if (shopWrapWebView == null) {
                return false;
            }
            if (shopWrapWebView.getShopLoftWebViewBizAdapter().k()) {
                super.dispatchTouchEvent(motionEvent);
                return true;
            } else if (kew.E(motionEvent)) {
                this.alreadyDetected = false;
                this.needDispatchToWeb = false;
                float y = motionEvent.getY();
                int height = shopWrapWebView.getHeight() - shopWrapWebView.getShopLoftWebViewBizAdapter().e();
                if (y < height - shopWrapWebView.getShopLoftWebViewBizAdapter().i() || y > height) {
                    z = false;
                } else {
                    z = true;
                }
                this.alreadyDetected = true;
                if (!z) {
                    return false;
                }
                this.needDispatchToWeb = true;
                return super.dispatchTouchEvent(motionEvent);
            } else if (!this.alreadyDetected || !this.needDispatchToWeb) {
                return false;
            } else {
                super.dispatchTouchEvent(motionEvent);
                return true;
            }
        }

        public final ShopWrapWebView getShopWrapWebView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ShopWrapWebView) ipChange.ipc$dispatch("eed26e0e", new Object[]{this});
            }
            return this.shopWrapWebView;
        }

        public final void setShopWrapWebView(ShopWrapWebView shopWrapWebView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("13acc580", new Object[]{this, shopWrapWebView});
            } else {
                this.shopWrapWebView = shopWrapWebView;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Context b;
        public final /* synthetic */ JSONObject c;

        /* compiled from: Taobao */
        /* renamed from: com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftViewNewStyleBaseView$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class View$OnClickListenerC0099a implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ JSONObject f3028a;
            public final /* synthetic */ Context b;

            public View$OnClickListenerC0099a(JSONObject jSONObject, Context context) {
                this.f3028a = jSONObject;
                this.b = context;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String string;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                JSONObject jSONObject = this.f3028a;
                if (jSONObject != null && (string = jSONObject.getString("shopSearchUrl")) != null) {
                    Context context = this.b;
                    if (string.length() > 0) {
                        khu.h(context, string);
                    }
                }
            }
        }

        public a(Context context, JSONObject jSONObject) {
            this.b = context;
            this.c = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            TUrlImageView u;
            TUrlImageView u2;
            View decorView;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ShopLoftViewNewStyleBaseView shopLoftViewNewStyleBaseView = ShopLoftViewNewStyleBaseView.this;
            Context context = this.b;
            if (context != null) {
                Window window = ((Activity) context).getWindow();
                String str = null;
                shopLoftViewNewStyleBaseView.K((window == null || (decorView = window.getDecorView()) == null) ? null : (TUrlImageView) decorView.findViewById(R.id.shop_loft_search_button));
                TUrlImageView u3 = ShopLoftViewNewStyleBaseView.this.u();
                if (u3 != null) {
                    str = u3.getImageUrl();
                }
                if (str == null && (u2 = ShopLoftViewNewStyleBaseView.this.u()) != null) {
                    u2.setImageUrl(ShopLoftViewNewStyleBaseView.g(ShopLoftViewNewStyleBaseView.this));
                }
                TUrlImageView u4 = ShopLoftViewNewStyleBaseView.this.u();
                if (u4 != null) {
                    u4.setOnClickListener(new View$OnClickListenerC0099a(this.c, this.b));
                }
                if (ShopLoftViewNewStyleBaseView.this.j() && (u = ShopLoftViewNewStyleBaseView.this.u()) != null) {
                    kew.g0(u);
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    static {
        t2o.a(766509280);
        t2o.a(766509126);
    }

    public static final /* synthetic */ String g(ShopLoftViewNewStyleBaseView shopLoftViewNewStyleBaseView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad2579b0", new Object[]{shopLoftViewNewStyleBaseView});
        }
        return shopLoftViewNewStyleBaseView.b;
    }

    public static /* synthetic */ Object ipc$super(ShopLoftViewNewStyleBaseView shopLoftViewNewStyleBaseView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1242628837) {
            super.e(objArr[0]);
            return null;
        } else if (hashCode == -1199650815) {
            super.d(objArr[0]);
            return null;
        } else if (hashCode == 1758271112) {
            super.c(objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/triver/triver_shop/container/shopLoft/newStyle/ShopLoftViewNewStyleBaseView");
        }
    }

    public void B(xpd.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa60847e", new Object[]{this, cVar});
            return;
        }
        ShopWrapWebView z = z();
        JSONObject jSONObject = this.i;
        String str = null;
        String string = jSONObject == null ? null : jSONObject.getString("webLayerUrl");
        if (string == null) {
            npp.Companion.b("webLayerUrl is null");
            return;
        }
        Uri.Builder buildUpon = Uri.parse(string).buildUpon();
        Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("paddingTopAndBottom", kew.O(Integer.valueOf(this.c)) + ",114");
        JSONObject jSONObject2 = this.i;
        if (jSONObject2 != null) {
            str = jSONObject2.getString("listInstanceId");
        }
        String uri = appendQueryParameter.appendQueryParameter("listInstanceId", str).build().toString();
        ckf.f(uri, "parse(webUrl).buildUpon().appendQueryParameter(\n            \"paddingTopAndBottom\",\n            \"${statusBarAndHeaderNavHeight.px2rpx()},${114}\"\n        ).appendQueryParameter(ShopLoftKeys.KEY_LIST_INSTANCE_ID, params?.getString(ShopLoftKeys.KEY_LIST_INSTANCE_ID))\n            .build().toString()");
        z.getShopLoftWebViewBizAdapter().o(this.i);
        z.loadUrl(uri);
        kew.T(z);
        z.getShopLoftWebViewBizAdapter().p(kew.P(114));
        z.getShopLoftWebViewBizAdapter().n(cVar);
        ShopLoftNewStyleWebWrapLayout shopLoftNewStyleWebWrapLayout = new ShopLoftNewStyleWebWrapLayout(this, m());
        shopLoftNewStyleWebWrapLayout.setShopWrapWebView(z);
        kew.a(shopLoftNewStyleWebWrapLayout, z);
        kew.a((ViewGroup) t(), shopLoftNewStyleWebWrapLayout);
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("571ffe36", new Object[]{this});
        } else {
            this.p.put((JSONObject) "nativeRenderEnd", (String) Long.valueOf(System.currentTimeMillis()));
        }
    }

    public final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73a5d93d", new Object[]{this});
            return;
        }
        this.p.put((JSONObject) "nativeRenderStart", (String) Long.valueOf(System.currentTimeMillis()));
        JSONObject jSONObject = this.p;
        JSONObject jSONObject2 = this.i;
        String str = null;
        jSONObject.put((JSONObject) "sceneId", jSONObject2 == null ? null : jSONObject2.getString("sceneId"));
        JSONObject jSONObject3 = this.p;
        JSONObject jSONObject4 = this.i;
        jSONObject3.put((JSONObject) "id", jSONObject4 == null ? null : jSONObject4.getString("id"));
        JSONObject jSONObject5 = this.p;
        JSONObject jSONObject6 = this.i;
        if (jSONObject6 != null) {
            str = jSONObject6.getString("nativeIndex");
        }
        jSONObject5.put((JSONObject) UiUtil.INPUT_TYPE_VALUE_NUM, str);
    }

    public final void E(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f7fe685", new Object[]{this, new Boolean(z)});
        } else {
            this.l = z;
        }
    }

    public final void F(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd77ff5", new Object[]{this, frameLayout});
            return;
        }
        ckf.g(frameLayout, "<set-?>");
        this.e = frameLayout;
    }

    public final void G(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2912666e", new Object[]{this, frameLayout});
            return;
        }
        ckf.g(frameLayout, "<set-?>");
        this.f = frameLayout;
    }

    public final void H(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
            return;
        }
        ckf.g(context, "<set-?>");
        this.o = context;
    }

    public final void I(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f95f6ee", new Object[]{this, view});
        } else {
            this.m = view;
        }
    }

    public final void J(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e9a75a2", new Object[]{this, view});
            return;
        }
        ckf.g(view, "<set-?>");
        this.d = view;
    }

    public final void K(TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd3cfe69", new Object[]{this, tUrlImageView});
        } else {
            this.g = tUrlImageView;
        }
    }

    public final void L(ShopLoftDXEngine shopLoftDXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f15a152", new Object[]{this, shopLoftDXEngine});
            return;
        }
        ckf.g(shopLoftDXEngine, "<set-?>");
        this.h = shopLoftDXEngine;
    }

    public final void M(ShopWrapWebView shopWrapWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13acc580", new Object[]{this, shopWrapWebView});
        } else {
            this.n = shopWrapWebView;
        }
    }

    public final void N(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("296cd440", new Object[]{this, map});
            return;
        }
        ckf.g(map, "<set-?>");
        this.j = map;
    }

    public final void O(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3e2bac9", new Object[]{this, frameLayout});
        } else {
            ckf.g(frameLayout, "<set-?>");
        }
    }

    @Override // tb.jht.b
    public void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4f205c6", new Object[]{this, obj});
        } else if (this.k && (obj instanceof String)) {
            khu.h(m(), (String) obj);
        }
    }

    @Override // tb.jht.b
    public void c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68cd1688", new Object[]{this, obj});
        } else if (this.k) {
            super.c(obj);
            JSONObject n = n();
            String str = null;
            String string = n == null ? null : n.getString("id");
            if (string != null) {
                JSONObject n2 = n();
                if (n2 != null) {
                    str = n2.getString("ifCollection");
                }
                boolean b = ckf.b(str, "true");
                ShopLoftViewNewStyleBaseView$shopLoftCollection$collectionCallback$1 shopLoftViewNewStyleBaseView$shopLoftCollection$collectionCallback$1 = new ShopLoftViewNewStyleBaseView$shopLoftCollection$collectionCallback$1(this, b);
                if (b) {
                    ShopMoreUtils.INSTANCE.u(m(), string, r(), shopLoftViewNewStyleBaseView$shopLoftCollection$collectionCallback$1, q());
                } else {
                    ShopMoreUtils.INSTANCE.s(m(), string, r(), shopLoftViewNewStyleBaseView$shopLoftCollection$collectionCallback$1, q());
                }
            }
        }
    }

    @Override // tb.jht.b
    public void d(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b87ec801", new Object[]{this, obj});
        } else if (this.k) {
            super.d(obj);
            JSONObject n = n();
            String str = null;
            String string = n == null ? null : n.getString("id");
            if (string != null) {
                JSONObject n2 = n();
                if (n2 != null) {
                    str = n2.getString("ifLike");
                }
                boolean b = ckf.b(str, "true");
                ShopLoftViewNewStyleBaseView$shopLoftLike$likeCallback$1 shopLoftViewNewStyleBaseView$shopLoftLike$likeCallback$1 = new ShopLoftViewNewStyleBaseView$shopLoftLike$likeCallback$1(this, b);
                if (b) {
                    ShopMoreUtils.INSTANCE.v(m(), string, r(), shopLoftViewNewStyleBaseView$shopLoftLike$likeCallback$1, q());
                } else {
                    ShopMoreUtils.INSTANCE.t(m(), string, r(), shopLoftViewNewStyleBaseView$shopLoftLike$likeCallback$1, q());
                }
            }
        }
    }

    @Override // tb.jht.b
    public void e(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5eefd1b", new Object[]{this, obj});
        } else if (this.k) {
            super.e(obj);
            Context m = m();
            if (m instanceof ShopLoftActivity) {
                ((ShopLoftActivity) m).b4();
            }
        }
    }

    @Override // tb.jht.b
    public void f(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdd6020d", new Object[]{this, obj});
        } else if (this.k) {
            if (!(obj instanceof JSONObject)) {
                npp.Companion.b("showWindVanePop param not json");
            } else {
                BizExtKt.i((Activity) m(), (JSONObject) obj);
            }
        }
    }

    @Override // tb.xpd
    public ShareContent getShareContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("897c4b17", new Object[]{this});
        }
        ShareContent shareContent = new ShareContent();
        JSONObject jSONObject = this.i;
        String str = null;
        shareContent.imageUrl = jSONObject == null ? null : jSONObject.getString("picUrl");
        JSONObject jSONObject2 = this.i;
        shareContent.title = jSONObject2 == null ? null : jSONObject2.getString("title");
        JSONObject jSONObject3 = this.i;
        if (jSONObject3 != null) {
            str = jSONObject3.getString("description");
        }
        shareContent.description = str;
        return shareContent;
    }

    @Override // tb.xpd
    public String getUTPageName() {
        JSONObject jSONObject;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34b6390a", new Object[]{this});
        }
        JSONObject jSONObject2 = this.i;
        return (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("spmParams")) == null || (string = jSONObject.getString("arg1")) == null) ? "" : string;
    }

    @Override // tb.xpd
    public Map<String, String> getUTProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("16970404", new Object[]{this});
        }
        return y();
    }

    @Override // tb.xpd
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return t();
    }

    public final xpd.c h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpd.c) ipChange.ipc$dispatch("6679725a", new Object[]{this});
        }
        return this.f3026a;
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5b79027", new Object[]{this})).booleanValue();
        }
        return this.l;
    }

    public void initWithData(Context context, JSONObject jSONObject, xpd.c cVar, xpd.a aVar) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("419e834f", new Object[]{this, context, jSONObject, cVar, aVar});
            return;
        }
        this.f3026a = cVar;
        ckf.d(context);
        H(context);
        this.i = jSONObject;
        JSONObject jSONObject3 = null;
        if (!(jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("spmParams")) == null)) {
            jSONObject3 = jSONObject2.getJSONObject("args");
        }
        N(new LinkedHashMap());
        if (jSONObject3 != null) {
            for (Map.Entry<String, Object> entry : jSONObject3.entrySet()) {
                if (!(entry.getKey() == null || entry.getValue() == null)) {
                    Map<String, String> y = y();
                    String key = entry.getKey();
                    ckf.f(key, "entry.key");
                    y.put(key, entry.getValue().toString());
                }
            }
        }
        D();
        this.c = kew.p(50) + kew.y(context);
        J(o());
        View K = kew.K(context, R.layout.view_shop_loft_new_style_2023_view);
        ckf.d(K);
        kew.a((ViewGroup) t(), K);
        View findViewById = t().findViewById(R.id.shop_loft_2023_new_style_bottom_nav);
        ckf.f(findViewById, "rootView.findViewById(R.id.shop_loft_2023_new_style_bottom_nav)");
        F((FrameLayout) findViewById);
        View findViewById2 = t().findViewById(R.id.shop_loft_2023_new_style_web_area);
        ckf.f(findViewById2, "rootView.findViewById(R.id.shop_loft_2023_new_style_web_area)");
        O((FrameLayout) findViewById2);
        View findViewById3 = t().findViewById(R.id.shop_loft_2023_new_style_content_area);
        ckf.f(findViewById3, "rootView.findViewById(R.id.shop_loft_2023_new_style_content_area)");
        G((FrameLayout) findViewById3);
        ckf.d(aVar);
        xpd.a.AbstractC1101a a2 = aVar.a("shopLoftDXEngine");
        if (a2 != null) {
            L(((app) a2).e());
            xpd.a.AbstractC1101a a3 = aVar.a("shopLoftPerformanceMonitorObject");
            if (a3 != null) {
                ((xpd.b) a3).d(this.p);
                B(cVar);
                A();
                t().post(new a(context, jSONObject));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.alibaba.triver.triver_shop.container.shopLoft.IShopLoftView.IShopLoftPerformanceMonitor");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftDXEngineLifecycleObject");
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59403796", new Object[]{this})).booleanValue();
        }
        return this.k;
    }

    public final FrameLayout k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("766f99b3", new Object[]{this});
        }
        FrameLayout frameLayout = this.e;
        if (frameLayout != null) {
            return frameLayout;
        }
        ckf.y("bottomNavContainer");
        throw null;
    }

    public final FrameLayout l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("320f9e82", new Object[]{this});
        }
        FrameLayout frameLayout = this.f;
        if (frameLayout != null) {
            return frameLayout;
        }
        ckf.y("contentArea");
        throw null;
    }

    public final Context m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        Context context = this.o;
        if (context != null) {
            return context;
        }
        ckf.y("context");
        throw null;
    }

    public final JSONObject n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1f09b8a2", new Object[]{this});
        }
        View view = this.m;
        if (view instanceof DXRootView) {
            return ((DXRootView) view).getData();
        }
        return null;
    }

    public View o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("417bd825", new Object[]{this});
        }
        return new FrameLayout(m());
    }

    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        ShopWrapWebView shopWrapWebView = this.n;
        if (shopWrapWebView != null) {
            bpp.b(shopWrapWebView);
        }
    }

    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        ShopWrapWebView shopWrapWebView = this.n;
        if (shopWrapWebView != null) {
            bpp.a(shopWrapWebView);
        }
    }

    public void onDestroyed() {
        mpp shopLoftWebViewBizAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf354a81", new Object[]{this});
            return;
        }
        v().g().j(jht.shopLoft2023StyleBottomNavArea, this);
        ShopWrapWebView shopWrapWebView = this.n;
        JSONObject jSONObject = null;
        if (!(shopWrapWebView == null || (shopLoftWebViewBizAdapter = shopWrapWebView.getShopLoftWebViewBizAdapter()) == null)) {
            jSONObject = shopLoftWebViewBizAdapter.f();
        }
        if (jSONObject != null) {
            this.p.putAll(jSONObject);
        }
        ShopWrapWebView shopWrapWebView2 = this.n;
        if (shopWrapWebView2 != null) {
            shopWrapWebView2.destroyWebView();
        }
    }

    public final View p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bfd0299a", new Object[]{this});
        }
        return this.m;
    }

    public JSONObject q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3c773c7a", new Object[]{this});
        }
        return null;
    }

    public final String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bfd872d3", new Object[]{this});
        }
        JSONObject jSONObject = this.i;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getString(TriggerChannelService.EXTRA_ORIGIN);
    }

    public final JSONObject s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cf36e223", new Object[]{this});
        }
        return this.i;
    }

    public final View t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("17b33166", new Object[]{this});
        }
        View view = this.d;
        if (view != null) {
            return view;
        }
        ckf.y("rootView");
        throw null;
    }

    public final TUrlImageView u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("21089ca5", new Object[]{this});
        }
        return this.g;
    }

    public final ShopLoftDXEngine v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopLoftDXEngine) ipChange.ipc$dispatch("56170082", new Object[]{this});
        }
        ShopLoftDXEngine shopLoftDXEngine = this.h;
        if (shopLoftDXEngine != null) {
            return shopLoftDXEngine;
        }
        ckf.y("shopLoftDXEngine");
        throw null;
    }

    public final ShopWrapWebView w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopWrapWebView) ipChange.ipc$dispatch("eed26e0e", new Object[]{this});
        }
        return this.n;
    }

    public final int x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a08abcab", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public final Map<String, String> y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("77acd0e", new Object[]{this});
        }
        Map<String, String> map = this.j;
        if (map != null) {
            return map;
        }
        ckf.y("utArgs");
        throw null;
    }

    public abstract ShopWrapWebView z();

    public void didAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e328d7b", new Object[]{this});
            return;
        }
        this.k = true;
        TUrlImageView tUrlImageView = this.g;
        if (tUrlImageView != null) {
            kew.g0(tUrlImageView);
        }
        WVStandardEventCenter.postNotificationToJS(this.n, "shopContentList.viewAppear", "");
    }

    public void didDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3025c6b", new Object[]{this});
            return;
        }
        this.k = false;
        TUrlImageView tUrlImageView = this.g;
        if (tUrlImageView != null) {
            kew.B(tUrlImageView);
        }
        WVStandardEventCenter.postNotificationToJS(this.n, "shopContentList.viewDisappear", "");
    }

    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fedbbe9", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.i;
        if (jSONObject != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("dxTemplates");
            JSONObject jSONObject3 = jSONObject2 == null ? null : jSONObject2.getJSONObject("bottomNavTemplateData");
            if (jSONObject3 != null) {
                jSONObject.put((JSONObject) bau.EVENT_TYPE_NATIVE_KEY, (String) brf.a(jpu.a("autoScrollText", Boolean.valueOf(aqp.Companion.p()))));
                v().e(jSONObject3, jSONObject, jSONObject.hashCode(), new ShopLoftViewNewStyleBaseView$initBottomNavTemplate$1(this), new ShopLoftViewNewStyleBaseView$initBottomNavTemplate$2(jSONObject3));
            }
        }
    }
}
