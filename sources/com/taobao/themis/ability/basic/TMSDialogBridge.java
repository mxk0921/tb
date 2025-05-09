package com.taobao.themis.ability.basic;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.executor.ExecutorType;
import tb.j8s;
import tb.t2o;
import tb.u9s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMSDialogBridge implements j8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(830472197);
        t2o.a(839909427);
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public void alert(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"title"}) String str, @BindingParam(name = {"message"}) String str2, @BindingParam(name = {"button"}) String str3, @BindingParam(name = {"align"}) String str4, @BindingParam(name = {"confirmColor"}) String str5, @BindingParam(name = {"cancelColor"}) String str6, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7c5d9e0", new Object[]{this, apiContext, str, str2, str3, str4, str5, str6, bridgeCallback});
        } else if (apiContext == null || apiContext.a() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else {
            u9s.b(apiContext.a(), str, str2, str3, str4, str5, str6, bridgeCallback);
        }
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public void confirm(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"title"}) String str, @BindingParam(name = {"message"}) String str2, @BindingParam(name = {"okButton"}) String str3, @BindingParam(name = {"cancelButton"}) String str4, @BindingParam(name = {"align"}) String str5, @BindingParam(name = {"confirmColor"}) String str6, @BindingParam(name = {"cancelColor"}) String str7, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1d5edf2", new Object[]{this, apiContext, str, str2, str3, str4, str5, str6, str7, bridgeCallback});
        } else if (apiContext == null || apiContext.a() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else {
            u9s.c(apiContext.a(), str, str2, str3, str4, str5, str6, str7, bridgeCallback);
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

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public void prompt(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"title"}) String str, @BindingParam(name = {"message"}) String str2, @BindingParam(name = {"okButton"}) String str3, @BindingParam(name = {"cancelButton"}) String str4, @BindingParam(name = {"placeholder"}) String str5, @BindingParam(name = {"confirmColor"}) String str6, @BindingParam(name = {"cancelColor"}) String str7, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de6080ce", new Object[]{this, apiContext, str, str2, str3, str4, str5, str6, str7, bridgeCallback});
        } else if (apiContext == null || apiContext.a() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else {
            u9s.f(apiContext.a(), str, str2, str3, str4, str5, str6, str7, bridgeCallback);
        }
    }
}
