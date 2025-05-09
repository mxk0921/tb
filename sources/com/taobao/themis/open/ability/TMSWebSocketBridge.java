package com.taobao.themis.open.ability;

import android.os.Build;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.f2;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.BindingRequest;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.tinct.model.InstantPatchChangeInfo;
import com.taobao.weex.common.WXConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.a1x;
import tb.b1x;
import tb.bbs;
import tb.ckf;
import tb.f4w;
import tb.f7l;
import tb.h11;
import tb.j8s;
import tb.jr;
import tb.t2o;
import tb.tsq;
import tb.u8s;
import tb.uq;
import tb.wsq;
import tb.xhv;
import tb.xpd;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u007f\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\f\u001a\u00020\u000b2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\u0010\u001a\u00020\u000b2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016JQ\u0010\u0018\u001a\u00020\u00142\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\u0017\u001a\u00020\u000b2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J;\u0010\u001a\u001a\u00020\u00142\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u0003¨\u0006 "}, d2 = {"Lcom/taobao/themis/open/ability/TMSWebSocketBridge;", "Ltb/j8s;", "<init>", "()V", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "apiContext", "", "url", "Lcom/alibaba/fastjson/JSONObject;", "data", "socketTaskID", "", "multiple", "Lcom/alibaba/fastjson/JSONArray;", "protocols", "header", "fromRemoteDebug", "originParams", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "bridgeCallback", "Ltb/xhv;", h11.WEBSOCKET, "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;Lcom/alibaba/fastjson/JSONObject;Ljava/lang/String;ZLcom/alibaba/fastjson/JSONArray;Lcom/alibaba/fastjson/JSONObject;ZLcom/alibaba/fastjson/JSONObject;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "isBuffer", "sendSocketMessage", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "closeSocket", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;Ljava/lang/Boolean;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "onInitialized", "onFinalized", "Companion", "a", "themis_open_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSWebSocketBridge implements j8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f13618a = "tms_ws_default_task";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(843055129);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ITMSPage f13619a;
        public final /* synthetic */ TMSWebSocketBridge b;
        public final /* synthetic */ BridgeCallback c;

        public b(ITMSPage iTMSPage, TMSWebSocketBridge tMSWebSocketBridge, BridgeCallback bridgeCallback) {
            this.f13619a = iTMSPage;
            this.b = tMSWebSocketBridge;
            this.c = bridgeCallback;
        }

        @Override // tb.uq
        public final void a(jr jrVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
                return;
            }
            if (ckf.b(jrVar.a().get("type"), "onClose")) {
                this.f13619a.y("socketClose", new JSONObject());
            }
            if (!jrVar.d()) {
                TMSWebSocketBridge.access$handleMegaFail(this.b, jrVar, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13620a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ ITMSPage c;

        public c(String str, boolean z, ITMSPage iTMSPage) {
            this.f13620a = str;
            this.b = z;
            this.c = iTMSPage;
        }

        @Override // tb.uq
        public final void a(jr jrVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
                return;
            }
            String valueOf = String.valueOf(jrVar.a().get("type"));
            switch (valueOf.hashCode()) {
                case -2003762904:
                    if (valueOf.equals(xpd.c.EVENT_ON_MESSAGE)) {
                        if (this.b) {
                            ITMSPage iTMSPage = this.c;
                            JSONObject jSONObject = new JSONObject();
                            String str = this.f13620a;
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put((JSONObject) "data", jrVar.a().getJSONObject("data").getString("data"));
                            jSONObject2.put((JSONObject) "isBuffer", (String) Boolean.valueOf(ckf.b(jrVar.a().getJSONObject("data").getString("isBuffer"), "true")));
                            jSONObject2.put((JSONObject) "socketTaskID", str);
                            xhv xhvVar = xhv.INSTANCE;
                            jSONObject.put((JSONObject) "data", (String) jSONObject2);
                            iTMSPage.y("onSocketTaskMessage", jSONObject);
                            return;
                        }
                        ITMSPage iTMSPage2 = this.c;
                        JSONObject jSONObject3 = new JSONObject();
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put((JSONObject) "data", jrVar.a().getJSONObject("data").getString("data"));
                        jSONObject4.put((JSONObject) "isBuffer", (String) Boolean.valueOf(ckf.b(jrVar.a().getJSONObject("data").getString("isBuffer"), "true")));
                        xhv xhvVar2 = xhv.INSTANCE;
                        jSONObject3.put((JSONObject) "data", (String) jSONObject4);
                        iTMSPage2.y("socketMessage", jSONObject3);
                        return;
                    }
                    break;
                case -1351896231:
                    if (valueOf.equals("onClose")) {
                        TMSLogger.f("TMSWebSocketBridge", "connectSocket,socketId: " + this.f13620a + ' ' + jrVar.a().get("type") + " data: " + jrVar.a());
                        if (this.b) {
                            ITMSPage iTMSPage3 = this.c;
                            JSONObject jSONObject5 = new JSONObject();
                            String str2 = this.f13620a;
                            JSONObject jSONObject6 = new JSONObject();
                            jSONObject6.put((JSONObject) "socketTaskID", str2);
                            xhv xhvVar3 = xhv.INSTANCE;
                            jSONObject5.put((JSONObject) "data", (String) jSONObject6);
                            iTMSPage3.y("onSocketTaskClose", jSONObject5);
                            return;
                        }
                        this.c.y("socketClose", new JSONObject());
                        return;
                    }
                    break;
                case -1013079863:
                    if (valueOf.equals("onOpen")) {
                        TMSLogger.f("TMSWebSocketBridge", "connectSocket,socketId: " + this.f13620a + ' ' + jrVar.a().get("type") + " data: " + jrVar.a());
                        if (this.b) {
                            ITMSPage iTMSPage4 = this.c;
                            JSONObject jSONObject7 = new JSONObject();
                            String str3 = this.f13620a;
                            JSONObject jSONObject8 = new JSONObject();
                            jSONObject8.put((JSONObject) "socketTaskID", str3);
                            xhv xhvVar4 = xhv.INSTANCE;
                            jSONObject7.put((JSONObject) "data", (String) jSONObject8);
                            iTMSPage4.y("onSocketTaskOpen", jSONObject7);
                            return;
                        }
                        this.c.y("socketOpen", new JSONObject());
                        return;
                    }
                    break;
                case 1434516214:
                    if (valueOf.equals("onSocketError")) {
                        if (this.b) {
                            ITMSPage iTMSPage5 = this.c;
                            JSONObject jSONObject9 = new JSONObject();
                            String str4 = this.f13620a;
                            JSONObject jSONObject10 = new JSONObject();
                            jSONObject10.put((JSONObject) "socketTaskID", str4);
                            xhv xhvVar5 = xhv.INSTANCE;
                            jSONObject9.put((JSONObject) "data", (String) jSONObject10);
                            jSONObject9.put((JSONObject) "error", jrVar.a().getString("error"));
                            iTMSPage5.y("onSocketTaskError", jSONObject9);
                        } else {
                            ITMSPage iTMSPage6 = this.c;
                            JSONObject jSONObject11 = new JSONObject();
                            jSONObject11.put((JSONObject) "error", jrVar.a().getString("error"));
                            xhv xhvVar6 = xhv.INSTANCE;
                            iTMSPage6.y("socketError", jSONObject11);
                        }
                        TMSLogger.b("TMSWebSocketBridge", "connectSocket,socketId: " + this.f13620a + ' ' + jrVar.a().get("type") + " data: " + jrVar.a());
                        return;
                    }
                    break;
            }
            TMSLogger.b("TMSWebSocketBridge", "connectSocket,socketId: " + this.f13620a + ' ' + jrVar.a().get("type") + " data: " + jrVar.a());
            if (this.b) {
                ITMSPage iTMSPage7 = this.c;
                JSONObject jSONObject12 = new JSONObject();
                String str5 = this.f13620a;
                JSONObject jSONObject13 = new JSONObject();
                jSONObject13.put((JSONObject) "socketTaskID", str5);
                xhv xhvVar7 = xhv.INSTANCE;
                jSONObject12.put((JSONObject) "data", (String) jSONObject13);
                jSONObject12.put((JSONObject) "error", (String) jrVar.a().get("errorMessage"));
                iTMSPage7.y("onSocketTaskError", jSONObject12);
                return;
            }
            ITMSPage iTMSPage8 = this.c;
            JSONObject jSONObject14 = new JSONObject();
            jSONObject14.put((JSONObject) "error", (String) jrVar.a().get("errorMessage"));
            xhv xhvVar8 = xhv.INSTANCE;
            iTMSPage8.y("socketError", jSONObject14);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f13621a;
        public final /* synthetic */ TMSWebSocketBridge b;

        public d(BridgeCallback bridgeCallback, TMSWebSocketBridge tMSWebSocketBridge) {
            this.f13621a = bridgeCallback;
            this.b = tMSWebSocketBridge;
        }

        @Override // tb.uq
        public final void a(jr jrVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
            } else if (ckf.b(jrVar.a().get("type"), "onSuccess")) {
                this.f13621a.sendBridgeResponse(BridgeResponse.SUCCESS);
            } else if (!jrVar.d()) {
                TMSWebSocketBridge.access$handleMegaFail(this.b, jrVar, this.f13621a);
            }
        }
    }

    static {
        t2o.a(843055128);
        t2o.a(839909427);
    }

    public static final /* synthetic */ void access$handleMegaFail(TMSWebSocketBridge tMSWebSocketBridge, jr jrVar, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f248d5", new Object[]{tMSWebSocketBridge, jrVar, bridgeCallback});
        } else {
            tMSWebSocketBridge.b(jrVar, bridgeCallback);
        }
    }

    public static /* synthetic */ void connectSocket$default(TMSWebSocketBridge tMSWebSocketBridge, ApiContext apiContext, String str, JSONObject jSONObject, String str2, boolean z, JSONArray jSONArray, JSONObject jSONObject2, boolean z2, JSONObject jSONObject3, BridgeCallback bridgeCallback, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("564377d0", new Object[]{tMSWebSocketBridge, apiContext, str, jSONObject, str2, new Boolean(z), jSONArray, jSONObject2, new Boolean(z2), jSONObject3, bridgeCallback, new Integer(i), obj});
        } else {
            tMSWebSocketBridge.connectSocket(apiContext, str, jSONObject, str2, (i & 16) != 0 ? false : z, jSONArray, jSONObject2, (i & 128) != 0 ? false : z2, jSONObject3, bridgeCallback);
        }
    }

    public static /* synthetic */ void sendSocketMessage$default(TMSWebSocketBridge tMSWebSocketBridge, ApiContext apiContext, String str, String str2, boolean z, Boolean bool, BridgeCallback bridgeCallback, int i, Object obj) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caaa7d14", new Object[]{tMSWebSocketBridge, apiContext, str, str2, new Boolean(z), bool, bridgeCallback, new Integer(i), obj});
            return;
        }
        if ((i & 8) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        tMSWebSocketBridge.sendSocketMessage(apiContext, str, str2, z2, bool, bridgeCallback);
    }

    public final String c(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f0528ca", new Object[]{this, jSONArray});
        }
        if (jSONArray == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null) {
                sb.append(next.toString());
                sb.append(",");
            }
        }
        return sb.toString();
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public final void closeSocket(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"socketTaskID"}) String str, @BindingParam(name = {"fromRemoteDebug"}) Boolean bool, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcd067a8", new Object[]{this, apiContext, str, bool, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(bridgeCallback, "bridgeCallback");
        TMSLogger.b("TMSWebSocketBridge", ckf.p("closeSocket ", str));
        ITMSPage c2 = apiContext.c();
        if (c2 == null) {
            TMSLogger.b("TMSWebSocketBridge", "page is null");
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            return;
        }
        if (str == null || str.length() == 0) {
            str = this.f13618a;
        }
        a1x a1xVar = a1x.INSTANCE;
        bbs instance = c2.getInstance();
        String e = apiContext.e();
        ckf.f(e, "apiContext.traceId");
        a1xVar.a(instance, e, str, new b(c2, this, bridgeCallback));
        bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public final void connectSocket(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"url"}) String str, @BindingParam(name = {"data"}) JSONObject jSONObject, @BindingParam(name = {"socketTaskID"}) String str2, @BindingParam(name = {"multiple"}) boolean z, @BindingParam(name = {"protocols"}) JSONArray jSONArray, @BindingParam(name = {"header"}) JSONObject jSONObject2, @BindingParam(name = {"fromRemoteDebug"}) boolean z2, @BindingRequest JSONObject jSONObject3, @BindingCallback BridgeCallback bridgeCallback) {
        String str3;
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50f718fd", new Object[]{this, apiContext, str, jSONObject, str2, new Boolean(z), jSONArray, jSONObject2, new Boolean(z2), jSONObject3, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(bridgeCallback, "bridgeCallback");
        ITMSPage c2 = apiContext.c();
        if (c2 == null) {
            TMSLogger.b("TMSWebSocketBridge", "page is null");
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            return;
        }
        if (!z || str2 == null || str2.length() == 0) {
            z3 = false;
        }
        if (!z3) {
            str3 = this.f13618a;
        } else if (str2 == null) {
            str3 = this.f13618a;
        } else {
            str3 = str2;
            if (str != null || str.length() == 0) {
                TMSLogger.b("TMSWebSocketBridge", "url is null");
                bridgeCallback.sendBridgeResponse(b1x.INSTANCE.i());
            }
            TMSLogger.a("TMSWebSocketBridge", ckf.p("target url: ", a(str, jSONObject)));
            JSONObject jSONObject4 = jSONObject2 == null ? new JSONObject() : jSONObject2;
            HashMap hashMap = new HashMap();
            String str4 = Build.VERSION.RELEASE;
            ckf.f(str4, InstantPatchChangeInfo.TYPE_RELEASE);
            hashMap.put(WXConfig.sysVersion, str4);
            hashMap.put(WXConfig.appGroup, f2.e);
            hashMap.put("appName", RVEnvironmentService.PLATFORM_TB);
            String a2 = u8s.a(c2.getInstance().I());
            ckf.f(a2, "getClientVersion(page.getInstance().activity)");
            hashMap.put("appVersion", a2);
            jSONObject4.put((JSONObject) HttpConstant.USER_AGENT, "(Android/" + ((String) hashMap.get(WXConfig.sysVersion)) + ") " + ((String) hashMap.get(WXConfig.appGroup)) + f7l.BRACKET_START_STR + ((String) hashMap.get("appName")) + "/" + ((String) hashMap.get("appVersion")) + ") Ariver/1.0.13.6");
            jSONObject4.remove("referer");
            String c3 = c(jSONArray);
            if (c3 == null || c3.length() == 0) {
                jSONObject4.put((JSONObject) com.taobao.weex.appfram.websocket.a.HEADER_SEC_WEBSOCKET_PROTOCOL, c3);
            }
            a1x a1xVar = a1x.INSTANCE;
            bbs instance = c2.getInstance();
            String e = apiContext.e();
            ckf.f(e, "apiContext.traceId");
            a1xVar.b(instance, str, e, str3, jSONObject4, jSONObject, new c(str3, z3, c2));
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
            return;
        }
        if (str != null) {
        }
        TMSLogger.b("TMSWebSocketBridge", "url is null");
        bridgeCallback.sendBridgeResponse(b1x.INSTANCE.i());
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
    public final void sendSocketMessage(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"data"}) String str, @BindingParam(name = {"socketTaskID"}) String str2, @BindingParam(name = {"isBuffer"}) boolean z, @BindingParam(name = {"fromRemoteDebug"}) Boolean bool, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("116aa2df", new Object[]{this, apiContext, str, str2, new Boolean(z), bool, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(bridgeCallback, "bridgeCallback");
        ITMSPage c2 = apiContext.c();
        if (c2 == null) {
            TMSLogger.b("TMSWebSocketBridge", "page is null");
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
        } else if (str == null) {
            TMSLogger.b("TMSWebSocketBridge", f4w.LOAD_DATA_NULL);
            bridgeCallback.sendBridgeResponse(b1x.INSTANCE.h());
        } else {
            if (str2 == null || str2.length() == 0) {
                str2 = this.f13618a;
            }
            a1x a1xVar = a1x.INSTANCE;
            bbs instance = c2.getInstance();
            String e = apiContext.e();
            ckf.f(e, "apiContext.traceId");
            a1xVar.c(instance, e, str, z, str2, new d(bridgeCallback, this));
        }
    }

    public final void b(jr jrVar, BridgeCallback bridgeCallback) {
        BridgeResponse.Error error;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c33de77c", new Object[]{this, jrVar, bridgeCallback});
            return;
        }
        try {
            JSONObject a2 = jrVar.a();
            JSONObject jSONObject = a2 == null ? null : a2.getJSONObject("errorMessage");
            if (jSONObject == null) {
                TMSLogger.b("TMSWebSocketBridge", "mega fail! no error message");
                bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                return;
            }
            int intValue = jSONObject.getIntValue("statusCode");
            String string = jSONObject.getString("msg");
            if (string == null) {
                string = "";
            }
            switch (intValue) {
                case 1:
                    error = b1x.INSTANCE.h();
                    break;
                case 2:
                    error = b1x.INSTANCE.l();
                    break;
                case 3:
                    error = b1x.INSTANCE.i();
                    break;
                case 4:
                    error = b1x.INSTANCE.j();
                    break;
                case 5:
                    error = b1x.INSTANCE.k();
                    break;
                case 6:
                    error = b1x.INSTANCE.b();
                    break;
                case 7:
                    error = b1x.INSTANCE.f();
                    break;
                case 8:
                    error = b1x.INSTANCE.d();
                    break;
                case 9:
                    error = b1x.INSTANCE.e();
                    break;
                case 10:
                    error = b1x.INSTANCE.a();
                    break;
                case 11:
                    error = b1x.INSTANCE.c();
                    break;
                case 12:
                    error = b1x.INSTANCE.g();
                    break;
                default:
                    error = BridgeResponse.newError(3, string);
                    break;
            }
            bridgeCallback.sendBridgeResponse(error);
            TMSLogger.b("TMSWebSocketBridge", ckf.p("mega fail! ", jrVar.a()));
        } catch (Throwable th) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            TMSLogger.c("TMSWebSocketBridge", th.getMessage(), th);
        }
    }

    public final String a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a73cc1b4", new Object[]{this, str, jSONObject});
        }
        if (jSONObject != null) {
            try {
                if (!jSONObject.isEmpty()) {
                    StringBuilder sb = new StringBuilder(str);
                    if (wsq.Y(str, "?", 0, false, 6, null) <= 0) {
                        sb.append("?");
                    } else if (!tsq.w(str, "&", false, 2, null)) {
                        sb.append("&");
                    }
                    for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (!TextUtils.isEmpty(key)) {
                            sb.append(key);
                            sb.append("=");
                            sb.append(value);
                            sb.append("&");
                        }
                    }
                    sb.deleteCharAt(sb.length() - 1);
                    String sb2 = sb.toString();
                    ckf.f(sb2, "urlBuilder.toString()");
                    return sb2;
                }
            } catch (Throwable th) {
                TMSLogger.c("TMSWebSocketBridge", "appendQueryJson2Url error.", th);
            }
        }
        return str;
    }
}
