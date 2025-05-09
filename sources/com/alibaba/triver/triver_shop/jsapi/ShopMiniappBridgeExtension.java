package com.alibaba.triver.triver_shop.jsapi;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingApiContext;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.engine.api.bridge.model.ApiContext;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.triver.TriverActivity;
import com.alibaba.triver.kit.api.appmonitor.LaunchMonitorData;
import com.alibaba.triver.kit.api.proxy.ITriverAppMonitorProxy;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.taobao.R;
import com.taobao.weex.RenderContainer;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.WXRenderStrategy;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.gl7;
import tb.mop;
import tb.ogg;
import tb.phu;
import tb.pks;
import tb.pwr;
import tb.qks;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ShopMiniappBridgeExtension implements BridgeExtension {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, WXSDKInstance> f3042a = new ConcurrentHashMap();
    public final Set<gl7> b = Collections.synchronizedSet(new HashSet());
    public d c = null;
    public Activity d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ App f3043a;

        public a(App app) {
            this.f3043a = app;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f3043a.exit();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f3044a = false;
        public final /* synthetic */ ApiContext b;

        public b(ShopMiniappBridgeExtension shopMiniappBridgeExtension, ApiContext apiContext) {
            this.b = apiContext;
        }

        public boolean a(KeyEvent keyEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f35195c3", new Object[]{this, keyEvent})).booleanValue();
            }
            if (this.f3044a && keyEvent.getAction() == 1) {
                b();
            }
            return this.f3044a;
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a23fa652", new Object[]{this});
            } else if (this.b != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("success", (Object) Boolean.TRUE);
                this.b.sendEvent("interceptBackEvent", jSONObject, null);
            }
        }

        public void c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("183c4dc8", new Object[]{this, new Boolean(z)});
            } else {
                this.f3044a = z;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ApiContext f3045a;

        public c(ApiContext apiContext) {
            this.f3045a = apiContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                TriverActivity activity = this.f3045a.getRender().getActivity();
                if (activity instanceof TriverActivity) {
                    activity.w3(ShopMiniappBridgeExtension.access$000(ShopMiniappBridgeExtension.this));
                    ShopMiniappBridgeExtension.access$102(ShopMiniappBridgeExtension.this, activity);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface d extends TriverActivity.b {
    }

    static {
        t2o.a(766509333);
    }

    public static /* synthetic */ d access$000(ShopMiniappBridgeExtension shopMiniappBridgeExtension) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("3104b727", new Object[]{shopMiniappBridgeExtension});
        }
        return shopMiniappBridgeExtension.c;
    }

    public static /* synthetic */ Activity access$102(ShopMiniappBridgeExtension shopMiniappBridgeExtension, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("1d475617", new Object[]{shopMiniappBridgeExtension, activity});
        }
        shopMiniappBridgeExtension.d = activity;
        return activity;
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void addMonitorPoint(@BindingNode(Page.class) Page page, @BindingParam(name = {"pointName"}) String str, @BindingParam(name = {"timeStep"}) String str2, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31789a5a", new Object[]{this, page, str, str2, bridgeCallback});
            return;
        }
        try {
            LaunchMonitorData r = ogg.r(page);
            if (r != null && !r.containsKey(str)) {
                r.addPoint(str, Long.valueOf(Long.parseLong(str2)));
            }
            bridgeCallback.sendJSONResponse(new JSONObject());
        } catch (Throwable th) {
            RVLogger.e("addMonitorPoint", th);
        }
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void closeWeexFloatLayer(@BindingCallback BridgeCallback bridgeCallback, @BindingNode(Page.class) Page page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10f4a885", new Object[]{this, bridgeCallback, page});
            return;
        }
        for (gl7 gl7Var : this.b) {
            try {
                gl7Var.dismiss();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.b.clear();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) Boolean.TRUE);
        bridgeCallback.sendJSONResponse(jSONObject);
    }

    @ActionFilter
    public void enableInterceptBack(@BindingCallback BridgeCallback bridgeCallback, @BindingApiContext ApiContext apiContext, @BindingParam(name = {"enable"}) boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f091fc4", new Object[]{this, bridgeCallback, apiContext, new Boolean(z)});
            return;
        }
        if (this.c == null) {
            this.c = new b(this, apiContext);
        }
        ((b) this.c).c(z);
        if (z && apiContext.getRender() != null) {
            new Handler(Looper.getMainLooper()).post(new c(apiContext));
        }
    }

    @ThreadType(ExecutorType.URGENT_DISPLAY)
    @ActionFilter
    public void getShopFrameworkParams(@BindingNode(App.class) App app, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a7a5729", new Object[]{this, app, bridgeCallback});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        Context context = (app == null || app.getAppContext() == null) ? null : app.getAppContext().getContext();
        if (context == null) {
            bridgeCallback.sendJSONResponse(jSONObject);
            return;
        }
        jSONObject.put("fetchData", (Object) app.getStringValue("shopFetchData"));
        jSONObject.put("originalRouteUrl", (Object) pks.j(app));
        jSONObject.put("HAMemoryInfo", (Object) qks.B().toJSONString());
        jSONObject.put("HADeviceInfo", (Object) qks.A().toJSONString());
        jSONObject.put("clientInfo", (Object) qks.u(context).toJSONString());
        bridgeCallback.sendJSONResponse(jSONObject);
    }

    @Override // com.alibaba.ariver.kernel.api.extension.Extension
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
            return;
        }
        for (Map.Entry entry : ((ConcurrentHashMap) this.f3042a).entrySet()) {
            if (entry.getValue() != null) {
                try {
                    ((WXSDKInstance) entry.getValue()).destroy();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        ((ConcurrentHashMap) this.f3042a).clear();
        for (gl7 gl7Var : this.b) {
            try {
                gl7Var.dismiss();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        this.b.clear();
        TriverActivity triverActivity = this.d;
        if (triverActivity instanceof TriverActivity) {
            triverActivity.z3(this.c);
        }
        this.c = null;
        this.d = null;
    }

    @Override // com.alibaba.ariver.kernel.api.extension.Extension
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.kernel.api.security.Guard
    public Permission permit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Permission) ipChange.ipc$dispatch("edbd77f9", new Object[]{this});
        }
        return null;
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void replaceMiniAppContainer(@BindingNode(App.class) App app, @BindingParam(name = {"url"}) String str, @BindingParam(booleanDefault = true, name = {"animation"}) boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("364ddc44", new Object[]{this, app, str, new Boolean(z)});
            return;
        }
        Uri parse = Uri.parse(str);
        Nav from = Nav.from(app.getAppContext().getContext());
        if (!z) {
            parse = parse.buildUpon().appendQueryParameter("nextPageAnimation", "false").build();
        }
        from.toUri(parse.toString());
        new Handler(Looper.getMainLooper()).postDelayed(new a(app), 500L);
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void shopPageRenderFinished(@BindingNode(App.class) App app, @BindingParam(name = {"tabKey"}) String str, @BindingParam(name = {"timestamp"}) long j, @BindingParam(name = {"renderType"}) String str2, @BindingParam(name = {"url"}) String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fe8b006", new Object[]{this, app, str, new Long(j), str2, str3});
        } else if (app != null) {
            try {
                if (!TextUtils.isEmpty(str3)) {
                    phu a2 = phu.a().c(app).n(app.getStartParams()).m("pageRenderFinished").o(Double.valueOf(1.0d)).a();
                    long longValue = app.getLongValue("startContainerTime");
                    if (longValue > 0) {
                        long j2 = j - longValue;
                        if (j2 > 0) {
                            ((ITriverAppMonitorProxy) RVProxy.get(ITriverAppMonitorProxy.class)).commitTriverShopPerf(a2, str, str2, str3, j2);
                            Log.e("ShopPageFinished", j2 + "");
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    @ThreadType(ExecutorType.URGENT_DISPLAY)
    @ActionFilter
    public void getShopPIParams(@BindingNode(App.class) App app, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c19c5216", new Object[]{this, app, bridgeCallback});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (app == null) {
            bridgeCallback.sendJSONResponse(jSONObject);
            return;
        }
        boolean equals = "true".equals(app.getStringValue(mop.KEY_ENABLE_NEW_START_AC_LOGIC));
        JSONObject jsonValue = app.getJsonValue("shopFetchData");
        jSONObject.put("minidata", (Object) app.getStringValue("shopMiniData"));
        jSONObject.put("datacenter", (Object) app.getStringValue("shopDataCenter"));
        jSONObject.put("downgradeConfig", (Object) app.getStringValue("shopDowngradeConfig"));
        String str = null;
        if (equals) {
            if (jsonValue != null) {
                str = JSON.toJSONString(jsonValue, SerializerFeature.DisableCircularReferenceDetect);
            }
            jSONObject.put(mop.KEY_SHOP_FETCH, (Object) str);
        } else {
            if (jsonValue != null) {
                str = jsonValue.toJSONString();
            }
            jSONObject.put(mop.KEY_SHOP_FETCH, (Object) str);
        }
        jSONObject.put("fetchDowngradeConfig", (Object) String.valueOf(pwr.d()));
        bridgeCallback.sendJSONResponse(jSONObject);
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void showWeexFloatLayer(@BindingNode(App.class) App app, @BindingParam(name = {"weexUrl"}) String str, @BindingParam(name = {"title"}) String str2, @BindingParam(name = {"height"}) int i, @BindingParam(name = {"duration"}) int i2, @BindingCallback BridgeCallback bridgeCallback, @BindingApiContext ApiContext apiContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5635c765", new Object[]{this, app, str, str2, new Integer(i), new Integer(i2), bridgeCallback, apiContext});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (app == null || app.getAppContext() == null || app.getAppContext().getContext() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.newError(5, "context is null"));
        } else if (TextUtils.isEmpty(str)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        } else {
            Map<String, WXSDKInstance> map = this.f3042a;
            WXSDKInstance wXSDKInstance = (WXSDKInstance) ((ConcurrentHashMap) map).get(app.getAppId() + "@" + str);
            if (wXSDKInstance == null) {
                WXSDKInstance wXSDKInstance2 = new WXSDKInstance(app.getAppContext().getContext());
                wXSDKInstance2.setUseSandBox(true);
                wXSDKInstance2.y1(true);
                RenderContainer renderContainer = new RenderContainer(app.getAppContext().getContext());
                renderContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                wXSDKInstance2.setRenderContainer(renderContainer);
                wXSDKInstance2.a1(str);
                HashMap hashMap = new HashMap();
                hashMap.put("bundleUrl", str);
                wXSDKInstance2.X0("WeexFloatingWindowInShop", str, hashMap, "", WXRenderStrategy.APPEND_ASYNC);
                Map<String, WXSDKInstance> map2 = this.f3042a;
                ((ConcurrentHashMap) map2).put(app.getAppId() + "@" + str, wXSDKInstance2);
                wXSDKInstance = wXSDKInstance2;
            }
            gl7 gl7Var = new gl7(app.getAppContext().getContext());
            gl7Var.k(str2);
            gl7Var.i(apiContext);
            gl7Var.h(i2);
            gl7Var.j(i);
            gl7Var.l(wXSDKInstance);
            gl7Var.setContentView(R.layout.triver_view_weex_float_window);
            gl7Var.show();
            jSONObject.put("success", (Object) Boolean.TRUE);
            bridgeCallback.sendJSONResponse(jSONObject);
            this.b.add(gl7Var);
        }
    }
}
