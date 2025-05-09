package com.taobao.android.address.miniapp;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingApiContext;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingRequest;
import com.alibaba.ariver.engine.api.bridge.model.ApiContext;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.Remote;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ef0;
import tb.mf0;
import tb.z9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AddressBridgeExtension implements BridgeExtension {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements ef0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f6301a;

        public a(BridgeCallback bridgeCallback) {
            this.f6301a = bridgeCallback;
        }

        @Override // tb.ef0
        public void onFail(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
            } else {
                AddressBridgeExtension.access$100(AddressBridgeExtension.this, this.f6301a, i, str);
            }
        }

        @Override // tb.ef0
        public void onSuccess(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37d948b5", new Object[]{this, str});
            } else {
                AddressBridgeExtension.access$000(AddressBridgeExtension.this, this.f6301a, str);
            }
        }
    }

    public static /* synthetic */ void access$000(AddressBridgeExtension addressBridgeExtension, BridgeCallback bridgeCallback, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66de09b1", new Object[]{addressBridgeExtension, bridgeCallback, str});
        } else {
            addressBridgeExtension.d(bridgeCallback, str);
        }
    }

    public static /* synthetic */ void access$100(AddressBridgeExtension addressBridgeExtension, BridgeCallback bridgeCallback, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce0565", new Object[]{addressBridgeExtension, bridgeCallback, new Integer(i), str});
        } else {
            addressBridgeExtension.c(bridgeCallback, i, str);
        }
    }

    public final void a(int i, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c893479", new Object[]{this, new Integer(i), jSONObject, bridgeCallback});
            return;
        }
        try {
            String string = jSONObject.getString("bizIdentity");
            switch (i) {
                case 11:
                    mf0.b(b(), string, jSONObject.getString("channel"), TextUtils.equals(jSONObject.getString("forceRefresh"), "true"), jSONObject.getString("bizName"), new a(bridgeCallback));
                    break;
                case 12:
                    mf0.m(b(), string, jSONObject.getString("channel"), "frontInvoke", jSONObject.getString("bizName"));
                    if (bridgeCallback != null) {
                        bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
                        break;
                    }
                    break;
                case 13:
                    d(bridgeCallback, mf0.d(b(), string));
                    break;
                case 14:
                    d(bridgeCallback, JSON.toJSONString(mf0.f(b(), string)));
                    break;
            }
        } catch (Exception unused) {
            c(bridgeCallback, -1, "系统异常");
        }
    }

    @Remote
    @ThreadType(ExecutorType.NETWORK)
    @ActionFilter
    public void asyncGetRecommendAddress(@BindingApiContext ApiContext apiContext, @BindingRequest JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d6f7db2", new Object[]{this, apiContext, jSONObject, bridgeCallback});
        } else {
            a(11, jSONObject, bridgeCallback);
        }
    }

    public final Context b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext();
    }

    public final void c(BridgeCallback bridgeCallback, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54cae59a", new Object[]{this, bridgeCallback, new Integer(i), str});
        } else if (bridgeCallback != null) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(i, str));
        }
    }

    @Remote
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void changeRecommendAddress(@BindingApiContext ApiContext apiContext, @BindingRequest JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e338f7c", new Object[]{this, apiContext, jSONObject, bridgeCallback});
            return;
        }
        try {
            AddressTempActivity.b = bridgeCallback;
            Intent intent = new Intent();
            intent.putExtra("bizIdentity", jSONObject.getString("bizIdentity"));
            intent.putExtra("channel", jSONObject.getString("channel"));
            intent.putExtra(z9u.KEY_TAOKE_BIZSCENE, jSONObject.getString(z9u.KEY_TAOKE_BIZSCENE));
            intent.setClass(b(), AddressTempActivity.class);
            intent.setFlags(268435456);
            b().startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void d(BridgeCallback bridgeCallback, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c68b79", new Object[]{this, bridgeCallback, str});
        } else if (bridgeCallback != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", (Object) str);
            bridgeCallback.sendJSONResponse(jSONObject);
        }
    }

    @Remote
    @ThreadType(ExecutorType.IO)
    @ActionFilter
    public void getAllRecommendAddressData(@BindingApiContext ApiContext apiContext, @BindingRequest JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c3f4957", new Object[]{this, apiContext, jSONObject, bridgeCallback});
        } else {
            a(13, jSONObject, bridgeCallback);
        }
    }

    @Remote
    @ThreadType(ExecutorType.IO)
    @ActionFilter
    public void getRecommendAddress(@BindingApiContext ApiContext apiContext, @BindingRequest JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c12e816", new Object[]{this, apiContext, jSONObject, bridgeCallback});
        } else {
            a(14, jSONObject, bridgeCallback);
        }
    }

    @Override // com.alibaba.ariver.kernel.api.extension.Extension
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
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

    @Remote
    @ThreadType(ExecutorType.NETWORK)
    @ActionFilter
    public void syncRecommendAddress(@BindingApiContext ApiContext apiContext, @BindingRequest JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("143933b1", new Object[]{this, apiContext, jSONObject, bridgeCallback});
        } else {
            a(12, jSONObject, bridgeCallback);
        }
    }
}
