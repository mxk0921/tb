package com.taobao.themis.ability_taobao;

import android.app.Activity;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.executor.ExecutorType;
import tb.ids;
import tb.j8s;
import tb.t2o;
import tb.x2n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMSTBBizBridge implements j8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(832569368);
        t2o.a(839909427);
    }

    public final boolean a(Activity activity, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac60c043", new Object[]{this, activity, str, str2, str3, str4})).booleanValue();
        }
        x2n.a(activity, str, str2, str3, str4);
        return true;
    }

    @ThreadType(ExecutorType.NORMAL)
    @APIMethod
    public void addToDesktop(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback, @BindingParam(name = {"iconName"}) String str, @BindingParam(name = {"iconUrl"}) String str2, @BindingParam(name = {"targetUrl"}) String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d33ecd6", new Object[]{this, apiContext, bridgeCallback, str, str2, str3});
        } else if (apiContext == null || apiContext.a() == null || apiContext.b() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else {
            JSONObject jSONObject = new JSONObject();
            if (a(apiContext.a(), apiContext.b().L(), str, str2, str3)) {
                jSONObject.put("success", (Object) Boolean.TRUE);
            } else {
                jSONObject.put("success", (Object) Boolean.FALSE);
                jSONObject.put("errorMsg", "router proxy null");
            }
            bridgeCallback.sendJSONResponse(jSONObject);
        }
    }

    @ThreadType(ExecutorType.NETWORK)
    @APIMethod
    public void getTBMessageInfo(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59b810a7", new Object[]{this, apiContext, bridgeCallback});
        } else if (apiContext == null || apiContext.a() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else if (bridgeCallback != null) {
            bridgeCallback.sendJSONResponse(ids.a());
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
