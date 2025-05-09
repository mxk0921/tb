package com.taobao.message.message_open_api_adapter;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.message_open_api.CallService;
import com.taobao.message.message_open_api.core.CallException;
import com.taobao.message.message_open_api.core.CallResponse;
import com.taobao.message.message_open_api_adapter.Constants;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0003¨\u0006\u0013"}, d2 = {"Lcom/taobao/message/message_open_api_adapter/OpenAPI4Weex;", "Lcom/taobao/weex/common/WXModule;", "<init>", "()V", "", "getUrl", "()Ljava/lang/String;", "api", "", "", "request", "Lcom/taobao/weex/bridge/JSCallback;", "subscriber", "Ltb/xhv;", "call", "(Ljava/lang/String;Ljava/util/Map;Lcom/taobao/weex/bridge/JSCallback;)V", "getVersions", "(Lcom/taobao/weex/bridge/JSCallback;)V", "onActivityDestroy", "message_base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class OpenAPI4Weex extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(529531064);
    }

    private final String getUrl() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
        if (!(wXSDKInstance == null || wXSDKInstance.getBundleUrl() == null)) {
            OpenAPIUtils openAPIUtils = OpenAPIUtils.INSTANCE;
            WXSDKInstance wXSDKInstance2 = this.mWXSDKInstance;
            if (wXSDKInstance2 != null) {
                str = wXSDKInstance2.getBundleUrl();
            } else {
                str = null;
            }
            String urlWithoutParameters = openAPIUtils.getUrlWithoutParameters(str);
            if (urlWithoutParameters != null) {
                return urlWithoutParameters;
            }
        }
        return "default";
    }

    public static /* synthetic */ Object ipc$super(OpenAPI4Weex openAPI4Weex, String str, Object... objArr) {
        if (str.hashCode() == -17468269) {
            super.onActivityDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/message_open_api_adapter/OpenAPI4Weex");
    }

    @JSMethod
    public final void call(String str, Map<String, ? extends Object> map, final JSCallback jSCallback) {
        Map<String, ? extends Object> linkedHashMap;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43291f92", new Object[]{this, str, map, jSCallback});
            return;
        }
        ckf.h(str, "api");
        ckf.h(map, "request");
        ckf.h(jSCallback, "subscriber");
        JSONObject parseObject = JSON.parseObject(JSON.toJSONString(map));
        String url = getUrl();
        if (parseObject == null || (jSONObject2 = parseObject.getJSONObject("ext")) == null || (linkedHashMap = jSONObject2.getInnerMap()) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        if (parseObject == null || (jSONObject = parseObject.getJSONObject("data")) == null) {
            jSONObject = new JSONObject();
        }
        linkedHashMap.put(Constants.KEY_SUBSCRIBE_TAG, url);
        linkedHashMap.put(Constants.KEY_CHANNEL_TAG, Constants.Modules.API_WEEX);
        CallService callService = CallService.INSTANCE;
        WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
        ckf.c(wXSDKInstance, "mWXSDKInstance");
        Context context = wXSDKInstance.getContext();
        ckf.c(context, "mWXSDKInstance.context");
        callService.call(context, str, jSONObject, null, linkedHashMap, new IObserver<Object>() { // from class: com.taobao.message.message_open_api_adapter.OpenAPI4Weex$call$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.kit.core.IObserver
            public void onComplete() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                } else {
                    JSCallback.this.invoke(CallResponse.complete());
                }
            }

            @Override // com.taobao.message.kit.core.IObserver
            public void onError(Throwable th) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, th});
                    return;
                }
                ckf.h(th, "e");
                if (th instanceof CallException) {
                    CallException callException = (CallException) th;
                    JSCallback.this.invoke(CallResponse.error(callException.errCode, callException.errMsg));
                    return;
                }
                JSCallback.this.invoke(CallResponse.error("-1", th.toString()));
            }

            @Override // com.taobao.message.kit.core.IObserver
            public void onNext(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b4b8495", new Object[]{this, obj});
                    return;
                }
                ckf.h(obj, "value");
                JSCallback.this.invokeAndKeepAlive(CallResponse.next(obj));
            }
        });
    }

    @JSMethod
    public final void getVersions(JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f34c2970", new Object[]{this, jSCallback});
            return;
        }
        ckf.h(jSCallback, "subscriber");
        jSCallback.invoke(CallService.INSTANCE.getVersions());
    }

    @Override // com.taobao.weex.common.WXModule
    public void onActivityDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef57493", new Object[]{this});
            return;
        }
        super.onActivityDestroy();
        CallService.INSTANCE.unsubscribe(getUrl());
    }
}
