package com.taobao.themis.ability.basic;

import android.app.Activity;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.AutoCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.entity.InstanceStartParams;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.weex.utils.tools.TimeCalculator;
import mtopsdk.mtop.global.SDKUtils;
import tb.j8s;
import tb.q9s;
import tb.qml;
import tb.r8s;
import tb.t2o;
import tb.u8s;
import tb.vnb;
import tb.vu3;
import tb.x3w;
import tb.xcs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMSSystemInfoBridge implements j8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f13435a;
        public final /* synthetic */ View b;
        public final /* synthetic */ DisplayMetrics c;
        public final /* synthetic */ BridgeCallback d;

        public a(JSONObject jSONObject, View view, DisplayMetrics displayMetrics, BridgeCallback bridgeCallback) {
            this.f13435a = jSONObject;
            this.b = view;
            this.c = displayMetrics;
            this.d = bridgeCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f13435a.put("windowWidth", (Object) Integer.valueOf(Math.round(this.b.getMeasuredWidth() / this.c.density)));
            this.f13435a.put("windowHeight", (Object) Integer.valueOf(Math.round(this.b.getMeasuredHeight() / this.c.density)));
            this.d.sendJSONResponse(this.f13435a);
        }
    }

    static {
        t2o.a(830472199);
        t2o.a(839909427);
    }

    @ThreadType(ExecutorType.NORMAL)
    @AutoCallback
    @APIMethod
    public BridgeResponse getRunScene(@BindingApiContext ApiContext apiContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("fba5f72b", new Object[]{this, apiContext});
        }
        if (apiContext == null || apiContext.a() == null || apiContext.b() == null) {
            return BridgeResponse.FORBIDDEN_ERROR;
        }
        InstanceStartParams c0 = apiContext.b().c0();
        if (c0 == null) {
            return BridgeResponse.FORBIDDEN_ERROR;
        }
        String str = "release";
        if (!q9s.k0() ? !c0.isMiniAppDebug() : c0.isMiniAppDebug()) {
            str = "develop";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("envVersion", (Object) str);
        return new BridgeResponse(jSONObject);
    }

    @ThreadType(ExecutorType.NETWORK)
    @APIMethod
    public void getServerTime(@BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a54776f", new Object[]{this, bridgeCallback});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("time", (Object) Long.valueOf(SDKUtils.getCorrectionTime() * 1000));
            bridgeCallback.sendJSONResponse(jSONObject);
        } catch (Exception e) {
            TMSLogger.b("getServerTime", "getServerTime :" + e);
        }
    }

    @ThreadType(ExecutorType.SYNC)
    @APIMethod
    public void getSystemInfo(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65660e5", new Object[]{this, apiContext, bridgeCallback});
        } else if (apiContext == null || apiContext.a() == null || apiContext.b() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else {
            ITMSPage c = apiContext.c();
            if (c == null) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                TMSLogger.b("getSystemInfo", "page is null");
                return;
            }
            Activity a2 = apiContext.a();
            DisplayMetrics displayMetrics = a2.getResources().getDisplayMetrics();
            float f = displayMetrics.density;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("apiLevel", (Object) Integer.valueOf(Build.VERSION.SDK_INT));
            jSONObject.put("app", RVEnvironmentService.PLATFORM_TB);
            jSONObject.put("brand", (Object) Build.BRAND);
            jSONObject.put("currentBattery", "100%");
            jSONObject.put("fontSizeSetting", (Object) 16);
            jSONObject.put(LoggingSPCache.STORAGE_LANGUAGE, AdvanceSetting.CLEAR_NOTIFICATION);
            jSONObject.put("model", (Object) (Build.MANUFACTURER + " " + Build.MODEL));
            jSONObject.put("performance", "middle");
            jSONObject.put("pixelRatio", (Object) Float.valueOf(f));
            jSONObject.put("platform", TimeCalculator.PLATFORM_ANDROID);
            jSONObject.put("platformType", "tb");
            jSONObject.put("screenHeight", (Object) Integer.valueOf(displayMetrics.heightPixels));
            jSONObject.put(x3w.KEY_NEW_DETAIL_VISIBLE_BLOCK_WIDTH, (Object) Integer.valueOf(displayMetrics.widthPixels));
            jSONObject.put("statusBarHeight", (Object) Float.valueOf(xcs.d(a2) / f));
            jSONObject.put("system", (Object) Build.VERSION.RELEASE);
            jSONObject.put("titleBarHeight", (Object) 44);
            if (qml.j(c)) {
                jSONObject.put(RVStartParams.KEY_TRANSPARENT_TITLE, (Object) Boolean.TRUE);
            } else {
                jSONObject.put(RVStartParams.KEY_TRANSPARENT_TITLE, (Object) Boolean.FALSE);
            }
            jSONObject.put("version", (Object) u8s.a(a2));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", (Object) Integer.valueOf(Math.round(displayMetrics.widthPixels / f)));
            jSONObject2.put("height", (Object) Integer.valueOf(Math.round(displayMetrics.heightPixels / f)));
            jSONObject.put("screen", (Object) jSONObject2);
            jSONObject.put("deviceOrientation", (Object) r8s.m(c.getInstance()));
            jSONObject.put("windowWidth", (Object) Integer.valueOf(Math.round(displayMetrics.widthPixels / displayMetrics.density)));
            jSONObject.put("windowHeight", (Object) Integer.valueOf(Math.round(displayMetrics.heightPixels / displayMetrics.density)));
            vnb vnbVar = (vnb) c.getInstance().getExtension(vnb.class);
            if (vnbVar != null) {
                if (vnbVar.q0() != null) {
                    jSONObject.put("windowWidth", (Object) Integer.valueOf(Math.round(vnbVar.q0().floatValue() / displayMetrics.density)));
                }
                if (vnbVar.b0() != null) {
                    jSONObject.put("windowHeight", (Object) Integer.valueOf(Math.round(vnbVar.b0().floatValue() / displayMetrics.density)));
                }
                bridgeCallback.sendJSONResponse(jSONObject);
                return;
            }
            View view = c.getView();
            if (view == null) {
                bridgeCallback.sendJSONResponse(jSONObject);
            } else if (!q9s.d0() || view.getMeasuredWidth() > 0) {
                jSONObject.put("windowWidth", (Object) Integer.valueOf(Math.round(view.getMeasuredWidth() / displayMetrics.density)));
                jSONObject.put("windowHeight", (Object) Integer.valueOf(Math.round(view.getMeasuredHeight() / displayMetrics.density)));
                bridgeCallback.sendJSONResponse(jSONObject);
            } else {
                view.post(new a(jSONObject, view, displayMetrics, bridgeCallback));
            }
        }
    }

    @Override // tb.j8s
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
    }

    @Override // tb.j8s
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    @ThreadType(ExecutorType.SYNC)
    @APIMethod
    public void getWindowInfo(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        double f;
        double f2;
        double f3;
        double f4;
        double d;
        double d2;
        double d3;
        double d4;
        BridgeCallback bridgeCallback2 = bridgeCallback;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62e70e44", new Object[]{this, apiContext, bridgeCallback2});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            Activity a2 = apiContext.a();
            DisplayMetrics displayMetrics = a2.getResources().getDisplayMetrics();
            double f5 = xcs.f(a2, apiContext.a().getWindow().getDecorView().getWidth());
            double f6 = xcs.f(a2, apiContext.a().getWindow().getDecorView().getHeight());
            ITMSPage c = apiContext.c();
            if (c != null) {
                try {
                    if (c.getView() != null) {
                        f = xcs.f(a2, c.getView().getWidth());
                        f2 = xcs.f(a2, c.getView().getHeight());
                        int[] iArr = new int[2];
                        c.getView().getLocationOnScreen(iArr);
                        f3 = xcs.f(a2, iArr[1]);
                        f4 = xcs.f(a2, iArr[0]);
                        d = f3 + f2;
                        d2 = f4 + f;
                        if (c != null || !qml.j(c)) {
                            d3 = f4;
                            d4 = f3;
                        } else {
                            d4 = f3 + 44.0d;
                            if (qml.v(c)) {
                                d3 = f4;
                                d4 += xcs.f(a2, xcs.d(a2));
                            } else {
                                d3 = f4;
                            }
                        }
                        jSONObject.put("pixelRatio", (Object) Float.valueOf(displayMetrics.density));
                        jSONObject.put(x3w.KEY_NEW_DETAIL_VISIBLE_BLOCK_WIDTH, (Object) Double.valueOf(f5));
                        jSONObject.put("screenHeight", (Object) Double.valueOf(f6));
                        jSONObject.put("windowWidth", (Object) Double.valueOf(f));
                        jSONObject.put("windowHeight", (Object) Double.valueOf(f2));
                        jSONObject.put("screenTop", (Object) Double.valueOf(f3));
                        jSONObject.put("statusBarHeight", (Object) Integer.valueOf(xcs.f(a2, xcs.d(a2))));
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("top", (Object) Double.valueOf(d4));
                        jSONObject2.put("left", (Object) Double.valueOf(d3));
                        jSONObject2.put("bottom", (Object) Double.valueOf(d));
                        jSONObject2.put("right", (Object) Double.valueOf(d2));
                        jSONObject2.put("width", (Object) Double.valueOf(d2 - d3));
                        jSONObject2.put("height", (Object) Double.valueOf(d - d4));
                        jSONObject.put("safeArea", (Object) jSONObject2);
                        bridgeCallback2 = bridgeCallback;
                        bridgeCallback2.sendJSONResponse(jSONObject);
                    }
                } catch (Exception unused) {
                    bridgeCallback2 = bridgeCallback;
                    bridgeCallback2.sendBridgeResponse(new BridgeResponse.Error(11, TLogTracker.SCENE_EXCEPTION));
                    return;
                }
            }
            f = vu3.b.GEO_NOT_SUPPORT;
            f4 = 0.0d;
            f3 = 0.0d;
            f2 = 0.0d;
            d = 0.0d;
            d2 = 0.0d;
            if (c != null) {
            }
            d3 = f4;
            d4 = f3;
            jSONObject.put("pixelRatio", (Object) Float.valueOf(displayMetrics.density));
            jSONObject.put(x3w.KEY_NEW_DETAIL_VISIBLE_BLOCK_WIDTH, (Object) Double.valueOf(f5));
            jSONObject.put("screenHeight", (Object) Double.valueOf(f6));
            jSONObject.put("windowWidth", (Object) Double.valueOf(f));
            jSONObject.put("windowHeight", (Object) Double.valueOf(f2));
            jSONObject.put("screenTop", (Object) Double.valueOf(f3));
            jSONObject.put("statusBarHeight", (Object) Integer.valueOf(xcs.f(a2, xcs.d(a2))));
            JSONObject jSONObject22 = new JSONObject();
            jSONObject22.put("top", (Object) Double.valueOf(d4));
            jSONObject22.put("left", (Object) Double.valueOf(d3));
            jSONObject22.put("bottom", (Object) Double.valueOf(d));
            jSONObject22.put("right", (Object) Double.valueOf(d2));
            jSONObject22.put("width", (Object) Double.valueOf(d2 - d3));
            jSONObject22.put("height", (Object) Double.valueOf(d - d4));
            jSONObject.put("safeArea", (Object) jSONObject22);
            bridgeCallback2 = bridgeCallback;
            bridgeCallback2.sendJSONResponse(jSONObject);
        } catch (Exception unused2) {
        }
    }
}
