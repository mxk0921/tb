package com.taobao.themis.open.ability;

import android.text.TextUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.message_open_api.ICallService;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.open.permission.auth.AuthUtils;
import com.taobao.themis.open.permission.sendmtop.SendMtopParams;
import com.taobao.themis.open.permission.sendmtop.SendMtopResponse;
import com.taobao.themis.open.permission.sendmtop.SendMtopUtils;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import tb.bbs;
import tb.ckf;
import tb.e0d;
import tb.f0d;
import tb.j8s;
import tb.ov2;
import tb.q9s;
import tb.t2o;
import tb.uj3;
import tb.v3i;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JÓ\u0001\u0010\u001f\u001a\u00020\u001e2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\f2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\b\b\u0001\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0014\u001a\u00020\u00042\b\b\u0001\u0010\u0015\u001a\u00020\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u00042\b\b\u0001\u0010\u0017\u001a\u00020\u00042\b\b\u0001\u0010\u0018\u001a\u00020\u00042\b\b\u0001\u0010\u0019\u001a\u00020\u00072\b\b\u0001\u0010\u001b\u001a\u00020\u001a2\b\b\u0001\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\u0003J\u000f\u0010\"\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\"\u0010\u0003¨\u0006#"}, d2 = {"Lcom/taobao/themis/open/ability/TMSSendMtopBridge;", "Ltb/j8s;", "<init>", "()V", "", "api", "v", "", ICallService.KEY_NEED_LOGIN, "sessionOption", "method", "dataType", "", "secType", "Lcom/alibaba/fastjson/JSONObject;", "data", "ext_headers", "ext_querys", "", "timeout", "ttid", "pageUrl", "xua", "mpHost", ov2.ALIPAY_ACCOUNT_SITE, "useCache", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "apiContext", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "bridgeCallback", "Ltb/xhv;", "sendMtop", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/alibaba/fastjson/JSONObject;Lcom/alibaba/fastjson/JSONObject;Lcom/alibaba/fastjson/JSONObject;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/taobao/themis/kernel/ability/base/ApiContext;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "onInitialized", "onFinalized", "themis_open_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSSendMtopBridge implements j8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f13610a = "TMSSendMtopBridge";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements SendMtopUtils.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ BridgeCallback c;
        public final /* synthetic */ e0d d;

        public a(String str, BridgeCallback bridgeCallback, e0d e0dVar) {
            this.b = str;
            this.c = bridgeCallback;
            this.d = e0dVar;
        }

        @Override // com.taobao.themis.open.permission.sendmtop.SendMtopUtils.a
        public void a(SendMtopResponse sendMtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("53ed6a7f", new Object[]{this, sendMtopResponse});
            } else {
                TMSSendMtopBridge.access$callback(TMSSendMtopBridge.this, this.b, this.c, sendMtopResponse, this.d);
            }
        }
    }

    static {
        t2o.a(843055114);
        t2o.a(839909427);
    }

    public static final /* synthetic */ void access$callback(TMSSendMtopBridge tMSSendMtopBridge, String str, BridgeCallback bridgeCallback, SendMtopResponse sendMtopResponse, e0d e0dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65b5feb0", new Object[]{tMSSendMtopBridge, str, bridgeCallback, sendMtopResponse, e0dVar});
        } else {
            tMSSendMtopBridge.a(str, bridgeCallback, sendMtopResponse, e0dVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(String str, String str2, boolean z, String str3, String str4, String str5, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, long j, String str6, String str7, String str8, String str9, String str10, boolean z2, bbs bbsVar, BridgeCallback bridgeCallback, e0d e0dVar) {
        TMSSendMtopBridge tMSSendMtopBridge;
        LinkedHashMap linkedHashMap;
        TMSMetaInfoWrapper U;
        JSONObject e;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b32fac0e", new Object[]{this, str, str2, new Boolean(z), str3, str4, str5, new Integer(i), jSONObject, jSONObject2, jSONObject3, new Long(j), str6, str7, str8, str9, str10, new Boolean(z2), bbsVar, bridgeCallback, e0dVar});
            return;
        }
        SendMtopParams sendMtopParams = new SendMtopParams();
        sendMtopParams.setApi(str);
        sendMtopParams.setV(str2);
        sendMtopParams.setForceLogin(z);
        sendMtopParams.setNeedLogin(z);
        sendMtopParams.setSessionOption(str3);
        sendMtopParams.setDataType(str5);
        sendMtopParams.setMethod(str4);
        sendMtopParams.setTtid(str6);
        sendMtopParams.setWuaFlag(i);
        sendMtopParams.setTimer(j);
        sendMtopParams.setUserAgent(str8);
        sendMtopParams.setPageUrl(str7);
        sendMtopParams.setAccountSite(str10);
        sendMtopParams.setMpHost(str9);
        sendMtopParams.setUseCache(z2);
        sendMtopParams.setAddISVHeader(AuthUtils.INSTANCE.q(bbsVar, str10, str));
        if (jSONObject != null) {
            Set<String> keySet = jSONObject.keySet();
            ckf.f(keySet, "data.keys");
            for (String str11 : keySet) {
                Object obj = jSONObject.get(str11);
                if (obj != null) {
                    sendMtopParams.addData(str11, obj.toString());
                }
            }
        }
        if (jSONObject2 != null) {
            Set<String> keySet2 = jSONObject2.keySet();
            ckf.f(keySet2, "ext_headers.keys");
            for (String str12 : keySet2) {
                Object obj2 = jSONObject2.get(str12);
                if (obj2 != null) {
                    sendMtopParams.addHeader(str12, obj2.toString());
                }
            }
        }
        if (jSONObject3 != null) {
            Set<String> keySet3 = jSONObject3.keySet();
            ckf.f(keySet3, "ext_querys.keys");
            for (String str13 : keySet3) {
                Object obj3 = jSONObject3.get(str13);
                if (obj3 != null) {
                    sendMtopParams.addParameterMap(str13, obj3.toString());
                }
            }
        }
        sendMtopParams.setHeaders(SendMtopUtils.d(bbsVar));
        try {
            if (!(!q9s.C0() || (U = bbsVar.U()) == null || (e = U.e()) == null || (jSONObject4 = e.getJSONObject("mtopHeaderConfig")) == null)) {
                for (String str14 : jSONObject4.keySet()) {
                    if (ckf.b(str, str14)) {
                        Map<String, Object> innerMap = jSONObject4.getJSONObject(str14).getInnerMap();
                        if (innerMap != null) {
                            sendMtopParams.setHeaders(innerMap);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                        }
                    }
                }
            }
            tMSSendMtopBridge = this;
        } catch (Throwable th) {
            tMSSendMtopBridge = this;
            TMSLogger.c(tMSSendMtopBridge.f13610a, "append header error", th);
        }
        String L = bbsVar.L();
        ckf.f(L, "instance.appId");
        sendMtopParams.addExtraDara("contextId", L);
        if (e0dVar != null) {
            e0d.a aVar = new e0d.a();
            aVar.h(str);
            byte[] bytes = String.valueOf(jSONObject).getBytes(uj3.UTF_8);
            ckf.f(bytes, "this as java.lang.String).getBytes(charset)");
            aVar.g(bytes);
            if (jSONObject2 == null) {
                linkedHashMap = null;
            } else {
                linkedHashMap = new LinkedHashMap(v3i.e(jSONObject2.size()));
                Iterator it = jSONObject2.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                }
            }
            aVar.e(linkedHashMap);
            aVar.f(str4);
            e0dVar.a(aVar);
        }
        SendMtopUtils.l(bbsVar, sendMtopParams, new a(str, bridgeCallback, e0dVar));
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

    @ThreadType(ExecutorType.NETWORK)
    @APIMethod
    public final void sendMtop(@BindingParam(name = {"api", "apiName"}) String str, @BindingParam(name = {"v"}) String str2, @BindingParam(name = {"needLogin"}) boolean z, @BindingParam(name = {"sessionOption"}, stringDefault = "AutoLoginAndManualLogin") String str3, @BindingParam(name = {"method"}, stringDefault = "GET") String str4, @BindingParam(name = {"dataType"}, stringDefault = "originaljson") String str5, @BindingParam(name = {"secType"}) int i, @BindingParam(name = {"data"}) JSONObject jSONObject, @BindingParam(name = {"ext_headers"}) JSONObject jSONObject2, @BindingParam(name = {"ext_querys"}) JSONObject jSONObject3, @BindingParam(intDefault = 20000, name = {"timeout"}) long j, @BindingParam(name = {"ttid"}) String str6, @BindingParam(name = {"pageUrl"}) String str7, @BindingParam(name = {"x-ua"}) String str8, @BindingParam(name = {"mpHost"}) String str9, @BindingParam(name = {"accountSite"}) String str10, @BindingParam(name = {"useCache"}) boolean z2, @BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        f0d f0dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d6fab2d", new Object[]{this, str, str2, new Boolean(z), str3, str4, str5, new Integer(i), jSONObject, jSONObject2, jSONObject3, new Long(j), str6, str7, str8, str9, str10, new Boolean(z2), apiContext, bridgeCallback});
            return;
        }
        ckf.g(str, "api");
        ckf.g(str2, "v");
        ckf.g(str3, "sessionOption");
        ckf.g(str4, "method");
        ckf.g(str5, "dataType");
        ckf.g(str6, "ttid");
        ckf.g(str7, "pageUrl");
        ckf.g(str8, "xua");
        ckf.g(str9, "mpHost");
        ckf.g(str10, ov2.ALIPAY_ACCOUNT_SITE);
        ckf.g(apiContext, "apiContext");
        ckf.g(bridgeCallback, "bridgeCallback");
        bbs b = apiContext.b();
        ITMSPage c = apiContext.c();
        if (b == null || c == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b(this.f13610a, "access failed! instance is null");
            return;
        }
        e0d e0dVar = null;
        if (!(apiContext.d() == ApiContext.Source.FRAMEWORK || (f0dVar = (f0d) c.getExtension(f0d.class)) == null)) {
            e0dVar = f0dVar.x();
        }
        b(str, str2, z, str3, str4, str5, i, jSONObject, jSONObject2, jSONObject3, j, str6, str7, str8, str9, str10, z2, b, bridgeCallback, e0dVar);
    }

    public final void a(String str, BridgeCallback bridgeCallback, SendMtopResponse sendMtopResponse, e0d e0dVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("303e4760", new Object[]{this, str, bridgeCallback, sendMtopResponse, e0dVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (sendMtopResponse != null) {
            if (e0dVar != null) {
                e0dVar.f(str, sendMtopResponse.getSuccess() ? 200 : 400, false, sendMtopResponse.getHeaders());
            }
            try {
                if (!sendMtopResponse.getSuccess()) {
                    if (TextUtils.isDigitsOnly(sendMtopResponse.getErrorCode())) {
                        i = sendMtopResponse.getErrorCode();
                    } else {
                        i = 3;
                    }
                    jSONObject.put((JSONObject) "error", (String) i);
                    jSONObject.put((JSONObject) "errorCode", sendMtopResponse.getErrorCode());
                    jSONObject.put((JSONObject) "message", sendMtopResponse.getErrorMsg());
                    jSONObject.put((JSONObject) "errorMessage", sendMtopResponse.getErrorMsg());
                    if (e0dVar != null) {
                        e0dVar.c(sendMtopResponse.getErrorMsg());
                    }
                }
                byte[] data = sendMtopResponse.getData();
                if (data != null && data.length > 0) {
                    Charset forName = Charset.forName("UTF-8");
                    ckf.f(forName, "forName(\"UTF-8\")");
                    String str2 = new String(data, forName);
                    if (!TextUtils.isEmpty(str2)) {
                        jSONObject.putAll(JSON.parseObject(str2));
                        jSONObject.put((JSONObject) "success", (String) Boolean.valueOf(sendMtopResponse.getSuccess()));
                        if (e0dVar != null) {
                            e0dVar.d(data);
                        }
                        if (e0dVar != null) {
                            e0dVar.b();
                        }
                    }
                }
            } catch (Exception e) {
                jSONObject.put((JSONObject) "message", e.getMessage());
                jSONObject.put((JSONObject) "errorMessage", e.getMessage());
                jSONObject.put((JSONObject) "errorCode", (String) 6);
                jSONObject.put((JSONObject) "error", (String) 6);
            }
        } else {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        }
        bridgeCallback.sendJSONResponse(jSONObject);
    }
}
