package com.taobao.message.message_open_api_adapter;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.message_open_api.CallService;
import com.taobao.message.message_open_api.core.CallException;
import com.taobao.message.message_open_api.core.CallResponse;
import com.taobao.message.message_open_api_adapter.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import tb.ckf;
import tb.kpw;
import tb.t2o;
import tb.xpc;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0003¨\u0006\u0017"}, d2 = {"Lcom/taobao/message/message_open_api_adapter/OpenAPI4WindVane;", "Ltb/kpw;", "<init>", "()V", "", "getUrl", "()Ljava/lang/String;", "action", "params", "Landroid/taobao/windvane/jsbridge/WVCallBackContext;", "callback", "", xpc.RECORD_EXECUTE, "(Ljava/lang/String;Ljava/lang/String;Landroid/taobao/windvane/jsbridge/WVCallBackContext;)Z", "api", "", "", "request", "subscriber", "Ltb/xhv;", "call", "(Ljava/lang/String;Ljava/util/Map;Landroid/taobao/windvane/jsbridge/WVCallBackContext;)V", "onDestroy", "message_base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class OpenAPI4WindVane extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(529531066);
    }

    private final String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        IWVWebView iWVWebView = this.mWebView;
        if (!(iWVWebView == null || iWVWebView.getUrl() == null)) {
            OpenAPIUtils openAPIUtils = OpenAPIUtils.INSTANCE;
            IWVWebView iWVWebView2 = this.mWebView;
            ckf.c(iWVWebView2, "mWebView");
            String urlWithoutParameters = openAPIUtils.getUrlWithoutParameters(iWVWebView2.getUrl());
            if (urlWithoutParameters != null) {
                return urlWithoutParameters;
            }
        }
        return "default";
    }

    public static /* synthetic */ Object ipc$super(OpenAPI4WindVane openAPI4WindVane, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/message_open_api_adapter/OpenAPI4WindVane");
    }

    public final void call(String str, Map<String, ? extends Object> map, final WVCallBackContext wVCallBackContext) {
        Map<String, ? extends Object> linkedHashMap;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be45ad73", new Object[]{this, str, map, wVCallBackContext});
            return;
        }
        ckf.h(str, "api");
        ckf.h(map, "request");
        JSONObject parseObject = JSON.parseObject(JSON.toJSONString(map));
        String url = getUrl();
        if (parseObject == null || (jSONObject2 = parseObject.getJSONObject("ext")) == null || (linkedHashMap = jSONObject2.getInnerMap()) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        if (parseObject == null || (jSONObject = parseObject.getJSONObject("data")) == null) {
            jSONObject = new JSONObject();
        }
        linkedHashMap.put(Constants.KEY_SUBSCRIBE_TAG, url);
        linkedHashMap.put(Constants.KEY_CHANNEL_TAG, Constants.Modules.API_WINDVANE);
        CallService callService = CallService.INSTANCE;
        Context context = this.mContext;
        ckf.c(context, "mContext");
        callService.call(context, str, jSONObject, null, linkedHashMap, new IObserver<Object>() { // from class: com.taobao.message.message_open_api_adapter.OpenAPI4WindVane$call$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.kit.core.IObserver
            public void onComplete() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                    return;
                }
                WVCallBackContext wVCallBackContext2 = WVCallBackContext.this;
                if (wVCallBackContext2 != null) {
                    wVCallBackContext2.success(JSON.toJSONString(CallResponse.complete()));
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
                    WVCallBackContext wVCallBackContext2 = WVCallBackContext.this;
                    if (wVCallBackContext2 != null) {
                        CallException callException = (CallException) th;
                        wVCallBackContext2.success(JSON.toJSONString(CallResponse.error(callException.errCode, callException.errMsg)));
                        return;
                    }
                    return;
                }
                WVCallBackContext wVCallBackContext3 = WVCallBackContext.this;
                if (wVCallBackContext3 != null) {
                    wVCallBackContext3.success(JSON.toJSONString(CallResponse.error("-1", th.toString())));
                }
            }

            @Override // com.taobao.message.kit.core.IObserver
            public void onNext(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b4b8495", new Object[]{this, obj});
                    return;
                }
                ckf.h(obj, "value");
                WVCallBackContext wVCallBackContext2 = WVCallBackContext.this;
                if (wVCallBackContext2 != null) {
                    wVCallBackContext2.successAndKeepAlive(JSON.toJSONString(CallResponse.next(obj)));
                }
            }
        });
    }

    @Override // tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        CallService.INSTANCE.unsubscribe(getUrl());
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (ckf.b("call", str)) {
            JSONObject parseObject = JSON.parseObject(str2);
            String string = parseObject.getString("api");
            ckf.c(string, "jsonObject.getString(\"api\")");
            JSONObject jSONObject = parseObject.getJSONObject("request");
            ckf.c(jSONObject, "jsonObject.getJSONObject(\"request\")");
            Map<String, ? extends Object> innerMap = jSONObject.getInnerMap();
            ckf.c(innerMap, "jsonObject.getJSONObject(\"request\").innerMap");
            call(string, innerMap, wVCallBackContext);
        } else if (ckf.b("getVersions", str) && wVCallBackContext != null) {
            wVCallBackContext.success(JSON.toJSONString(CallService.INSTANCE.getVersions()));
        }
        return true;
    }
}
