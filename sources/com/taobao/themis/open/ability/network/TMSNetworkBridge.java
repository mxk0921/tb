package com.taobao.themis.open.ability.network;

import android.util.Base64;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.page.TMSPage;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import com.taobao.themis.open.permission.check.TMSPermissionManager;
import com.taobao.themis.open.utils.ApPathType;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import tb.a07;
import tb.bbs;
import tb.ckf;
import tb.e0d;
import tb.f0d;
import tb.gcn;
import tb.h11;
import tb.h1p;
import tb.j8s;
import tb.jr;
import tb.nc9;
import tb.o9s;
import tb.t2o;
import tb.tsq;
import tb.uq;
import tb.v4s;
import tb.wc9;
import tb.ws4;
import tb.xbs;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 &2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJw\u0010\u0015\u001a\u00020\r2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u007f\u0010!\u001a\u00020\r2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u001c\u001a\u00020\u001b2\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010 \u001a\u00020\u001f2\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b!\u0010\"J\u007f\u0010#\u001a\u00020\r2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u001c\u001a\u00020\u001b2\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010 \u001a\u00020\u001f2\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b#\u0010\"J\u000f\u0010$\u001a\u00020\rH\u0016¢\u0006\u0004\b$\u0010\u0003J\u000f\u0010%\u001a\u00020\rH\u0016¢\u0006\u0004\b%\u0010\u0003¨\u0006("}, d2 = {"Lcom/taobao/themis/open/ability/network/TMSNetworkBridge;", "Ltb/j8s;", "<init>", "()V", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "apiContext", "", "url", "Lcom/alibaba/fastjson/JSONObject;", "header", "appXDomain", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "bridgeCallback", "Ltb/xhv;", "downloadFile", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;Lcom/alibaba/fastjson/JSONObject;Ljava/lang/String;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "filePath", "localId", "fileName", v4s.PARAM_UPLOAD_FILE_TYPE, "formData", h11.UPLOAD_FILE, "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/alibaba/fastjson/JSONObject;Lcom/alibaba/fastjson/JSONObject;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "", "headers", "method", "data", "", "timeout", "dataType", gcn.PLUGIN_ID, "", "isPrefetch", h11.HTTPREQUET, "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;ZLcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "request", "onInitialized", "onFinalized", "Companion", "a", "themis_open_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSNetworkBridge implements j8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public volatile AtomicInteger f13635a = new AtomicInteger(0);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(843055241);
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
        public final /* synthetic */ bbs f13636a;
        public final /* synthetic */ File b;
        public final /* synthetic */ BridgeCallback c;

        public b(bbs bbsVar, File file, BridgeCallback bridgeCallback) {
            this.f13636a = bbsVar;
            this.b = file;
            this.c = bridgeCallback;
        }

        @Override // tb.uq
        public final void a(jr jrVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
            } else if (jrVar.d()) {
                JSONObject jSONObject = new JSONObject();
                String f = TMSInstanceExtKt.f(this.f13636a);
                String path = this.b.getPath();
                ckf.f(path, "dest.path");
                jSONObject.put((JSONObject) "apFilePath", ws4.f(f, path, ApPathType.AP_PATH_TYPE_TEMP));
                jSONObject.put((JSONObject) "fileSize", (String) Long.valueOf(nc9.c(this.b)));
                this.c.sendJSONResponse(jSONObject);
            } else {
                this.c.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                StringBuilder sb = new StringBuilder("mega fail! code:");
                JSONObject a2 = jrVar.a();
                Object obj = null;
                sb.append((Object) (a2 == null ? null : a2.getString("code")));
                sb.append(" msg:");
                JSONObject a3 = jrVar.a();
                if (a3 != null) {
                    obj = a3.get("msg");
                }
                sb.append(obj);
                TMSLogger.b("TMSNetworkBridge", sb.toString());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements xbs.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ BridgeCallback c;
        public final /* synthetic */ String d;
        public final /* synthetic */ long e;
        public final /* synthetic */ int f;
        public final /* synthetic */ String g;

        public c(String str, BridgeCallback bridgeCallback, String str2, long j, int i, String str3) {
            this.b = str;
            this.c = bridgeCallback;
            this.d = str2;
            this.e = j;
            this.f = i;
            this.g = str3;
        }

        @Override // tb.xbs.e
        public void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb7d2ebb", new Object[]{this, obj});
            } else {
                TMSNetworkBridge.access$submitHttpResponse(TMSNetworkBridge.this, this.b, obj, this.c, this.d, this.e, this.f, this.g);
            }
        }
    }

    static {
        t2o.a(843055240);
        t2o.a(839909427);
    }

    public static final /* synthetic */ void access$submitHttpResponse(TMSNetworkBridge tMSNetworkBridge, String str, Object obj, BridgeCallback bridgeCallback, String str2, long j, int i, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3c50582", new Object[]{tMSNetworkBridge, str, obj, bridgeCallback, str2, new Long(j), new Integer(i), str3});
        } else {
            tMSNetworkBridge.b(str, obj, bridgeCallback, str2, j, i, str3);
        }
    }

    public final void a(TMSPage tMSPage, String str, String str2, Object obj, String str3, String str4, float f, String str5, e0d e0dVar, BridgeCallback bridgeCallback) {
        JSONObject jSONObject = obj;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cb10bc1", new Object[]{this, tMSPage, str, str2, jSONObject, str3, str4, new Float(f), str5, e0dVar, bridgeCallback});
            return;
        }
        String str6 = " url = [" + str2 + "], headers = [" + jSONObject + "], method = [" + ((Object) str3) + "], data = [" + ((Object) str4) + "], timeout = [" + f + "], dataType = [" + ((Object) str5) + ']';
        long currentTimeMillis = System.currentTimeMillis();
        if (!(jSONObject instanceof JSONObject)) {
            if (jSONObject instanceof JSONArray) {
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray = (JSONArray) jSONObject;
                int size = jSONArray.size();
                while (i < size) {
                    i++;
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    ckf.f(jSONObject3, "temp");
                    for (Map.Entry<String, Object> entry : jSONObject3.entrySet()) {
                        jSONObject2.put((JSONObject) entry.getKey(), (String) entry.getValue());
                    }
                }
                jSONObject = jSONObject2;
            } else {
                jSONObject = null;
            }
        }
        bbs instance = tMSPage.getInstance();
        String L = instance.L();
        ckf.f(L, "instance.appId");
        if (o9s.h(instance.I())) {
            synchronized (TMSNetworkBridge.class) {
                try {
                    HashMap hashMap = new HashMap();
                    if (jSONObject != null) {
                        for (String str7 : ((JSONObject) jSONObject).keySet()) {
                            Object obj2 = ((JSONObject) jSONObject).get(str7);
                            String str8 = "";
                            if (obj2 != null) {
                                if (obj2 instanceof String) {
                                    str8 = (String) obj2;
                                } else {
                                    str8 = obj2.toString();
                                }
                            }
                            ckf.f(str7, "key");
                            hashMap.put(str7, str8);
                        }
                    }
                    xhv xhvVar = xhv.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        xbs.INSTANCE.e(L, str, str2, (JSONObject) jSONObject, str3, str4, f, str5, new c(str2, bridgeCallback, str6, currentTimeMillis, this.f13635a.get(), str), tMSPage, e0dVar);
    }

    @ThreadType(ExecutorType.NETWORK)
    @APIMethod
    public final void httpRequest(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"url"}) String str, @BindingParam(name = {"headers"}) Object obj, @BindingParam(name = {"method"}) String str2, @BindingParam(name = {"data"}) String str3, @BindingParam(name = {"timeout"}) float f, @BindingParam(name = {"dataType"}) String str4, @BindingParam(name = {"__appxDomain"}) String str5, @BindingParam({"isPrefetch"}) boolean z, @BindingCallback BridgeCallback bridgeCallback) {
        f0d f0dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ef315b7", new Object[]{this, apiContext, str, obj, str2, str3, new Float(f), str4, str5, new Boolean(z), bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(bridgeCallback, "bridgeCallback");
        ITMSPage c2 = apiContext.c();
        if (!(c2 instanceof TMSPage)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b("TMSNetworkBridge", "httpRequest, page is not a TMSPage");
            return;
        }
        e0d e0dVar = null;
        if (!(apiContext.d() == ApiContext.Source.FRAMEWORK || (f0dVar = (f0d) ((TMSPage) c2).getExtension(f0d.class)) == null)) {
            e0dVar = f0dVar.x();
        }
        ckf.d(str5);
        ckf.d(str);
        ckf.d(str2);
        a((TMSPage) c2, str5, str, obj, str2, str3, f, str4, e0dVar, bridgeCallback);
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
    public final void request(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"url"}) String str, @BindingParam(name = {"headers"}) Object obj, @BindingParam(name = {"method"}) String str2, @BindingParam(name = {"data"}) String str3, @BindingParam(name = {"timeout"}) float f, @BindingParam(name = {"dataType"}) String str4, @BindingParam(name = {"__appxDomain"}) String str5, @BindingParam(name = {"isPrefetch"}) boolean z, @BindingCallback BridgeCallback bridgeCallback) {
        f0d f0dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57eb9b0f", new Object[]{this, apiContext, str, obj, str2, str3, new Float(f), str4, str5, new Boolean(z), bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(bridgeCallback, "bridgeCallback");
        ITMSPage c2 = apiContext.c();
        if (!(c2 instanceof TMSPage)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b("TMSNetworkBridge", "request, page is not a TMSPage");
            return;
        }
        e0d e0dVar = null;
        if (!(apiContext.d() == ApiContext.Source.FRAMEWORK || (f0dVar = (f0d) ((TMSPage) c2).getExtension(f0d.class)) == null)) {
            e0dVar = f0dVar.x();
        }
        ckf.d(str5);
        ckf.d(str);
        ckf.d(str2);
        a((TMSPage) c2, str5, str, obj, str2, str3, f, str4, e0dVar, bridgeCallback);
    }

    public final void b(String str, Object obj, BridgeCallback bridgeCallback, String str2, long j, int i, String str3) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aed50c41", new Object[]{this, str, obj, bridgeCallback, str2, new Long(j), new Integer(i), str3});
        } else if (obj instanceof Map) {
            Map map = (Map) obj;
            if (map.containsKey("ok")) {
                Boolean bool = (Boolean) map.get("ok");
                ckf.d(bool);
                z = bool.booleanValue();
            }
            if (!z) {
                String valueOf = String.valueOf(map.get("status"));
                String.valueOf(map.get("statusText"));
                bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(12, ckf.p("Error", valueOf)));
                return;
            }
            JSONObject jSONObject = new JSONObject();
            Object obj2 = map.get("data");
            if (obj2 instanceof JSONObject) {
                obj2 = ((JSONObject) obj2).toJSONString();
            } else if (obj2 instanceof JSONArray) {
                obj2 = ((JSONArray) obj2).toJSONString();
            } else if (!(obj2 instanceof String) && !(obj2 instanceof byte[])) {
                obj2 = obj2 != null ? obj2.toString() : null;
            }
            jSONObject.put((JSONObject) "data", (String) obj2);
            jSONObject.put((JSONObject) "headers", (String) map.get("headers"));
            jSONObject.put((JSONObject) "status", (String) map.get("status"));
            if (map.containsKey(xbs.REQUEST_FROM_MINI_APP_CACHE)) {
                jSONObject.put((JSONObject) xbs.REQUEST_FROM_MINI_APP_CACHE, (String) map.get(xbs.REQUEST_FROM_MINI_APP_CACHE));
            }
            bridgeCallback.sendJSONResponse(jSONObject);
        } else {
            new HashMap().put("status", "PARSE_RESPONSE_FAILED");
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(12, "Error"));
        }
    }

    @ThreadType(ExecutorType.NETWORK)
    @APIMethod
    public final void downloadFile(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"url"}) String str, @BindingParam(name = {"header"}) JSONObject jSONObject, @BindingParam(name = {"__appxDomain"}) String str2, @BindingCallback BridgeCallback bridgeCallback) {
        f0d f0dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("110cfdf4", new Object[]{this, apiContext, str, jSONObject, str2, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(bridgeCallback, "bridgeCallback");
        bbs b2 = apiContext.b();
        ITMSPage c2 = apiContext.c();
        if (b2 == null || !(c2 instanceof TMSPage)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b("TMSNetworkBridge", "downloadFile, instance is not a TMSInstance");
            return;
        }
        ckf.f(b2.I(), "instance.activity");
        if (str == null || str.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSNetworkBridge", "downloadFile, url is null");
            return;
        }
        e0d e0dVar = null;
        if (!tsq.I(str, h1p.HTTP_PREFIX, false, 2, null) && !tsq.I(str, h1p.HTTPS_PREFIX, false, 2, null)) {
            try {
                byte[] decode = Base64.decode(str, 0);
                String a2 = ws4.a(TMSInstanceExtKt.f(b2), "https://tmp/download/", ApPathType.AP_PATH_TYPE_TEMP);
                if (!(a2 == null || a2.length() == 0)) {
                    File file = new File(a2);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    File file2 = new File(file, String.valueOf(System.currentTimeMillis()));
                    if (file2.exists()) {
                        file2.delete();
                    }
                    wc9 wc9Var = wc9.INSTANCE;
                    String absolutePath = file2.getAbsolutePath();
                    ckf.f(absolutePath, "dest.absolutePath");
                    ByteBuffer wrap = ByteBuffer.wrap(decode);
                    ckf.f(wrap, "wrap(buffer)");
                    wc9Var.n(b2, absolutePath, wrap, "ArrayBuffer", new b(b2, file2, bridgeCallback));
                    return;
                }
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                TMSLogger.b("TMSNetworkBridge", "downloadFile, local save path is null");
            } catch (Exception e) {
                TMSLogger.c("TMSNetworkBridge", e.getMessage(), e);
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            }
        } else if (!TMSPermissionManager.INSTANCE.d(b2, str, TMSPermissionManager.SpecialConfigType.RESOURCE)) {
            TMSLogger.b("TMSNetworkBridge", "domain is invalid");
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
        } else {
            if (!(apiContext.d() == ApiContext.Source.FRAMEWORK || (f0dVar = (f0d) ((TMSPage) c2).getExtension(f0d.class)) == null)) {
                e0dVar = f0dVar.x();
            }
            xbs.INSTANCE.c(b2, str, jSONObject, e0dVar, bridgeCallback);
        }
    }

    @ThreadType(ExecutorType.NETWORK)
    @APIMethod
    public final void uploadFile(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"url"}) String str, @BindingParam(name = {"filePath"}) String str2, @BindingParam(name = {"localId"}) String str3, @BindingParam(name = {"name"}) String str4, @BindingParam(name = {"type"}) String str5, @BindingParam(name = {"header"}) JSONObject jSONObject, @BindingParam(name = {"formData"}) JSONObject jSONObject2, @BindingCallback BridgeCallback bridgeCallback) {
        ITMSPage c2;
        f0d f0dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb8e1749", new Object[]{this, apiContext, str, str2, str3, str4, str5, jSONObject, jSONObject2, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(bridgeCallback, "bridgeCallback");
        String str6 = (str2 == null || str2.length() == 0) ? str3 : str2;
        if (str6 == null || str6.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.newError(11, "filePath is null"));
            TMSLogger.b("TMSNetworkBridge", "UploadFile filePath null or error");
        } else if (str4 == null || str4.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.newError(12, "fileName is null"));
            TMSLogger.b("TMSNetworkBridge", "UploadFile fileName null");
        } else {
            bbs b2 = apiContext.b();
            if (b2 == null) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                TMSLogger.b("TMSNetworkBridge", "uploadFile, instance is not a TMSInstance");
                return;
            }
            e0d e0dVar = null;
            String b3 = ws4.b(TMSInstanceExtKt.f(b2), str6, null, 4, null);
            if (b3 == null || b3.length() == 0 || str5 == null || str5.length() == 0 || str == null || str.length() == 0) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.newError(12, "arguments error"));
                TMSLogger.b("TMSNetworkBridge", "UploadFile arguments error");
                return;
            }
            ckf.f(b2.I(), "instance.activity");
            if (!(apiContext.d() == ApiContext.Source.FRAMEWORK || (c2 = apiContext.c()) == null || (f0dVar = (f0d) c2.getExtension(f0d.class)) == null)) {
                e0dVar = f0dVar.x();
            }
            xbs.INSTANCE.k(jSONObject2, b3, str4, str5, str, jSONObject, e0dVar, bridgeCallback);
        }
    }
}
