package com.taobao.themis.ability.basic;

import com.alibaba.ability.impl.performance.PerformanceAbility;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import tb.bbs;
import tb.j8s;
import tb.jr;
import tb.k8s;
import tb.p8s;
import tb.rbs;
import tb.t2o;
import tb.uq;
import tb.ybs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMSDeviceBridge implements j8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f13434a;
        public final /* synthetic */ BridgeCallback b;

        public a(TMSDeviceBridge tMSDeviceBridge, JSONObject jSONObject, BridgeCallback bridgeCallback) {
            this.f13434a = jSONObject;
            this.b = bridgeCallback;
        }

        @Override // tb.uq
        public void a(jr jrVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
                return;
            }
            if (!(!jrVar.d() || jrVar.a() == null || jrVar.a().getJSONObject("data") == null)) {
                this.f13434a.put("deviceLevel", (Object) jrVar.a().getJSONObject("data").getString("result"));
            }
            this.b.sendJSONResponse(this.f13434a);
        }
    }

    static {
        t2o.a(830472195);
        t2o.a(839909427);
    }

    @ThreadType(ExecutorType.NORMAL)
    @APIMethod
    public void getAppBaseInfo(@BindingCallback BridgeCallback bridgeCallback, @BindingApiContext ApiContext apiContext, @BindingParam(name = {"requireAppInfo"}) boolean z) {
        TMSMetaInfoWrapper U;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ea226ac", new Object[]{this, bridgeCallback, apiContext, new Boolean(z)});
            return;
        }
        try {
            bbs b = apiContext.b();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appId", (Object) b.L());
            jSONObject.put("version", (Object) ((IEnvironmentService) p8s.g(IEnvironmentService.class)).getAppVersion());
            jSONObject.put("theme", "light");
            jSONObject.put("appName", (Object) ((IEnvironmentService) p8s.g(IEnvironmentService.class)).getAppName());
            if (!(!z || (U = b.U()) == null || U.c() == null)) {
                jSONObject.put(RVConstants.EXTRA_APPINFO, JSON.toJSON(b.U().c()));
            }
            bridgeCallback.sendJSONResponse(jSONObject);
        } catch (Exception unused) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(11, TLogTracker.SCENE_EXCEPTION));
        }
    }

    @ThreadType(ExecutorType.NORMAL)
    @APIMethod
    public void getHADeviceInfo(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48c2a405", new Object[]{this, apiContext, bridgeCallback});
        } else if (apiContext.b() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
        } else {
            k8s.j().d(apiContext.b(), TMSCalendarBridge.namespace, apiContext.e(), null, "performance", PerformanceAbility.API_GET_DEVICE_LEVEL, new JSONObject(), new a(this, new JSONObject(), bridgeCallback));
        }
    }

    @ThreadType(ExecutorType.NORMAL)
    @APIMethod
    public void getHAMemoryInfo(@BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5ef8f97", new Object[]{this, bridgeCallback});
        } else if (bridgeCallback != null) {
            bridgeCallback.sendJSONResponse(rbs.b());
        }
    }

    @ThreadType(ExecutorType.NORMAL)
    @APIMethod
    public void getNetworkType(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62733c66", new Object[]{this, apiContext, bridgeCallback});
        } else if (apiContext == null || apiContext.a() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else if (bridgeCallback != null) {
            bridgeCallback.sendJSONResponse(ybs.b(apiContext.a()));
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
}
