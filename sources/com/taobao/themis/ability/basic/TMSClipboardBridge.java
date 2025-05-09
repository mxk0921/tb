package com.taobao.themis.ability.basic;

import android.app.Application;
import android.text.TextUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.executor.ExecutorType;
import tb.j8s;
import tb.m9s;
import tb.p8s;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMSClipboardBridge implements j8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(830472194);
        t2o.a(839909427);
    }

    @ThreadType(ExecutorType.IO)
    @APIMethod
    public void getClipboard(@BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bf76af5", new Object[]{this, bridgeCallback});
            return;
        }
        Application applicationContext = ((IEnvironmentService) p8s.g(IEnvironmentService.class)).getApplicationContext();
        if (applicationContext == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            return;
        }
        String a2 = m9s.a(applicationContext);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("text", (Object) a2);
        bridgeCallback.sendBridgeResponse(new BridgeResponse(jSONObject));
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

    @ThreadType(ExecutorType.IO)
    @APIMethod
    public void setClipboard(@BindingParam({"text"}) String str, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca3883b7", new Object[]{this, str, bridgeCallback});
        } else if (TextUtils.isEmpty(str)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        } else {
            Application applicationContext = ((IEnvironmentService) p8s.g(IEnvironmentService.class)).getApplicationContext();
            if (applicationContext == null) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                return;
            }
            m9s.b(applicationContext, str);
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
        }
    }
}
