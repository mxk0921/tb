package com.taobao.themis.open.ability;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.asp.d;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.bbs;
import tb.boq;
import tb.ckf;
import tb.j8s;
import tb.jr;
import tb.o9s;
import tb.q9s;
import tb.t2o;
import tb.uq;
import tb.vu3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u0010\u001a\u00020\r2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J9\u0010\u0012\u001a\u00020\r2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0012\u0010\u0011J-\u0010\u0013\u001a\u00020\r2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0015\u001a\u00020\r2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0003¨\u0006\u001a"}, d2 = {"Lcom/taobao/themis/open/ability/TMSStorageBridge;", "Ltb/j8s;", "<init>", "()V", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "apiContext", "", "key", "", "data", "appXDomain", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "bridgeCallback", "Ltb/xhv;", "setTinyLocalStorage", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "getTinyLocalStorage", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;Ljava/lang/String;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "removeTinyLocalStorage", "clearTinyLocalStorage", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "getTinyLocalStorageInfo", "onInitialized", "onFinalized", "Companion", "a", "themis_open_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSStorageBridge implements j8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.themis.open.ability.TMSStorageBridge$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class C0776a implements uq {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public static final C0776a INSTANCE = new C0776a();

            @Override // tb.uq
            public final void a(jr jrVar, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
                }
            }
        }

        static {
            t2o.a(843055117);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public static final /* synthetic */ SharedPreferences a(a aVar, Context context, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences) ipChange.ipc$dispatch("5ec47700", new Object[]{aVar, context, str});
            }
            return aVar.c(context, str);
        }

        public a() {
        }

        public final SharedPreferences c(Context context, String str) {
            Context applicationContext;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences) ipChange.ipc$dispatch("3950a1b1", new Object[]{this, context, str});
            }
            if (context == null || (applicationContext = context.getApplicationContext()) == null) {
                return null;
            }
            return applicationContext.getSharedPreferences(ckf.p("rv_local_storage_", str), 0);
        }

        public final JSONObject d(Context context, String str) {
            int i;
            UnsupportedEncodingException e;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("91c71ae7", new Object[]{this, context, str});
            }
            ckf.g(context, "context");
            ckf.g(str, "appId");
            SharedPreferences c = c(context, str);
            if (c == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            Map<String, ?> all = c.getAll();
            if (all != null) {
                double d = vu3.b.GEO_NOT_SUPPORT;
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    String key = entry.getKey();
                    String str2 = (String) entry.getValue();
                    try {
                        ckf.d(str2);
                        Charset forName = Charset.forName("utf-8");
                        ckf.f(forName, "forName(charsetName)");
                        byte[] bytes = str2.getBytes(forName);
                        ckf.f(bytes, "this as java.lang.String).getBytes(charset)");
                        i = bytes.length;
                        try {
                            Charset forName2 = Charset.forName("utf-8");
                            ckf.f(forName2, "forName(charsetName)");
                            byte[] bytes2 = key.getBytes(forName2);
                            ckf.f(bytes2, "this as java.lang.String).getBytes(charset)");
                            i += bytes2.length;
                        } catch (UnsupportedEncodingException e2) {
                            e = e2;
                            TMSLogger.c("TMSStorageBridge", e.getMessage(), e);
                            d += i;
                        }
                    } catch (UnsupportedEncodingException e3) {
                        e = e3;
                        i = 0;
                    }
                    d += i;
                }
                jSONObject.put((JSONObject) "keys", (String) all.keySet());
                jSONObject.put((JSONObject) "currentSize", (String) Double.valueOf(d / 1024));
                jSONObject.put((JSONObject) "limitSize", (String) Long.valueOf((long) d.c.ALARM_SIZE));
                return jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
        }

        public final void b(bbs bbsVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29f644cc", new Object[]{this, bbsVar, str});
                return;
            }
            ckf.g(bbsVar, "instance");
            ckf.g(str, "appId");
            SharedPreferences c = c(bbsVar.I(), ckf.p("themis_", str));
            if (c != null && !ckf.b(c.getString("Themis_COPY_SP_TO_MEGA", "false"), "true")) {
                TMSLogger.b("TMSStorageBridge", "copySpToMega start");
                Map<String, ?> all = c.getAll();
                ckf.f(all, "sp.all");
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    TMSLogger.a("TMSStorageBridge", "copySpToMega key: " + ((Object) entry.getKey()) + ", value: " + entry.getValue());
                    boq boqVar = boq.INSTANCE;
                    String key = entry.getKey();
                    ckf.f(key, "entry.key");
                    String str2 = key;
                    Object value = entry.getValue();
                    boqVar.e(bbsVar, null, str, str2, value == null ? null : value.toString(), C0776a.INSTANCE);
                }
                c.edit().putString("Themis_COPY_SP_TO_MEGA", "true").apply();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f13612a;
        public final /* synthetic */ TMSStorageBridge b;

        public b(BridgeCallback bridgeCallback, TMSStorageBridge tMSStorageBridge) {
            this.f13612a = bridgeCallback;
            this.b = tMSStorageBridge;
        }

        @Override // tb.uq
        public void a(jr jrVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
            } else if (jrVar == null) {
                TMSLogger.b("TMSStorageBridge", "clearTinyLocalStorage error,mega callback data is null");
                this.f13612a.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            } else {
                if (!jrVar.d()) {
                    TMSStorageBridge.access$handleMegaFail(this.b, jrVar, this.f13612a);
                }
                this.f13612a.sendBridgeResponse(BridgeResponse.SUCCESS);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f13613a;
        public final /* synthetic */ TMSStorageBridge b;

        public c(BridgeCallback bridgeCallback, TMSStorageBridge tMSStorageBridge) {
            this.f13613a = bridgeCallback;
            this.b = tMSStorageBridge;
        }

        @Override // tb.uq
        public void a(jr jrVar, boolean z) {
            Object obj;
            Map<String, Object> innerMap;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
            } else if (jrVar == null) {
                TMSLogger.b("TMSStorageBridge", "getTinyLocalStorage error,mega callback data is null");
                this.f13613a.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            } else {
                if (!jrVar.d()) {
                    TMSStorageBridge.access$handleMegaFail(this.b, jrVar, this.f13613a);
                }
                BridgeCallback bridgeCallback = this.f13613a;
                JSONObject jSONObject = new JSONObject();
                JSONObject a2 = jrVar.a();
                String str = null;
                Object obj2 = (a2 == null || (innerMap = a2.getInnerMap()) == null) ? null : innerMap.get("data");
                Map map = obj2 instanceof Map ? (Map) obj2 : null;
                if (!(map == null || (obj = map.get("result")) == null)) {
                    str = obj.toString();
                }
                jSONObject.put((JSONObject) "data", str);
                bridgeCallback.sendJSONResponse(jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f13614a;
        public final /* synthetic */ TMSStorageBridge b;

        public d(BridgeCallback bridgeCallback, TMSStorageBridge tMSStorageBridge) {
            this.f13614a = bridgeCallback;
            this.b = tMSStorageBridge;
        }

        @Override // tb.uq
        public void a(jr jrVar, boolean z) {
            Map<String, Object> innerMap;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
            } else if (jrVar == null) {
                TMSLogger.b("TMSStorageBridge", "getTinyLocalStorageInfo error,mega callback data is null");
                this.f13614a.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            } else if (!jrVar.d()) {
                TMSStorageBridge.access$handleMegaFail(this.b, jrVar, this.f13614a);
            } else {
                JSONObject a2 = jrVar.a();
                Long l = null;
                Object obj = (a2 == null || (innerMap = a2.getInnerMap()) == null) ? null : innerMap.get("data");
                Map map = obj instanceof Map ? (Map) obj : null;
                if (map == null) {
                    this.f13614a.sendBridgeResponse(new BridgeResponse.Error(1, "get sharedPreferences info error."));
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "keys", (String) map.get("keys"));
                Object obj2 = map.get("totalSize");
                Long l2 = obj2 instanceof Long ? (Long) obj2 : null;
                long j = 0;
                long j2 = 1024;
                long longValue = (l2 == null ? 0L : l2.longValue()) / j2;
                Object obj3 = map.get("freeSize");
                if (obj3 instanceof Long) {
                    l = (Long) obj3;
                }
                if (l != null) {
                    j = l.longValue();
                }
                jSONObject.put((JSONObject) "currentSize", (String) Long.valueOf(longValue - (j / j2)));
                jSONObject.put((JSONObject) "limitSize", (String) Long.valueOf(longValue));
                TMSLogger.b("TMSStorageBridge", ckf.p("getTinyLocalStorageInfo: ", jSONObject));
                this.f13614a.sendJSONResponse(jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class e implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f13615a;
        public final /* synthetic */ TMSStorageBridge b;

        public e(BridgeCallback bridgeCallback, TMSStorageBridge tMSStorageBridge) {
            this.f13615a = bridgeCallback;
            this.b = tMSStorageBridge;
        }

        @Override // tb.uq
        public void a(jr jrVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
            } else if (jrVar == null) {
                TMSLogger.b("TMSStorageBridge", "removeTinyLocalStorage error,mega callback data is null");
                this.f13615a.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            } else {
                if (!jrVar.d()) {
                    TMSStorageBridge.access$handleMegaFail(this.b, jrVar, this.f13615a);
                }
                this.f13615a.sendBridgeResponse(BridgeResponse.SUCCESS);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class f implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f13616a;
        public final /* synthetic */ TMSStorageBridge b;

        public f(BridgeCallback bridgeCallback, TMSStorageBridge tMSStorageBridge) {
            this.f13616a = bridgeCallback;
            this.b = tMSStorageBridge;
        }

        @Override // tb.uq
        public void a(jr jrVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
            } else if (jrVar == null) {
                TMSLogger.b("TMSStorageBridge", "setTinyLocalStorage error,mega callback data is null");
                this.f13616a.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            } else {
                if (!jrVar.d()) {
                    TMSStorageBridge.access$handleMegaFail(this.b, jrVar, this.f13616a);
                }
                this.f13616a.sendBridgeResponse(BridgeResponse.SUCCESS);
            }
        }
    }

    static {
        t2o.a(843055116);
        t2o.a(839909427);
    }

    public static final /* synthetic */ void access$handleMegaFail(TMSStorageBridge tMSStorageBridge, jr jrVar, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d83dc1", new Object[]{tMSStorageBridge, jrVar, bridgeCallback});
        } else {
            tMSStorageBridge.b(jrVar, bridgeCallback);
        }
    }

    public final String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd37c9a5", new Object[]{this, str, str2});
        }
        if (!o9s.k(str)) {
            return str2;
        }
        return str2 + "_plugin_" + str;
    }

    public final void b(jr jrVar, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c33de77c", new Object[]{this, jrVar, bridgeCallback});
            return;
        }
        try {
            JSONObject a2 = jrVar.a();
            JSONObject jSONObject = a2 == null ? null : a2.getJSONObject("errorMessage");
            if (jSONObject == null) {
                TMSLogger.b("TMSStorageBridge", "mega fail! no error message");
                bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                return;
            }
            int intValue = jSONObject.getIntValue("statusCode");
            String string = jSONObject.getString("code");
            String string2 = jSONObject.getString("msg");
            if (string2 == null) {
                string2 = "";
            }
            bridgeCallback.sendBridgeResponse(BridgeResponse.newError(intValue, ((Object) string) + " ," + string2));
            TMSLogger.b("TMSStorageBridge", "mega fail! statusCode:" + intValue + ", code:" + ((Object) string) + " msg:" + string2);
        } catch (Throwable th) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            TMSLogger.c("TMSStorageBridge", th.getMessage(), th);
        }
    }

    @ThreadType(ExecutorType.IO)
    @APIMethod
    public final void clearTinyLocalStorage(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"__appxDomain"}) String str, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22be69b1", new Object[]{this, apiContext, str, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(str, "appXDomain");
        ckf.g(bridgeCallback, "bridgeCallback");
        bbs b2 = apiContext.b();
        if (b2 == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b("TMSStorageBridge", "clearTinyLocalStorage error, instance is not a TMSInstance");
            return;
        }
        Activity I = b2.I();
        ckf.f(I, "instance.activity");
        String f2 = TMSInstanceExtKt.f(b2);
        if (f2.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b("TMSStorageBridge", "setTinyLocalStorage error, user id is null or empty");
            return;
        }
        String a2 = a(str, f2);
        if (q9s.b1()) {
            boq.INSTANCE.a(b2, apiContext.e(), f2, new b(bridgeCallback, this));
            return;
        }
        SharedPreferences a3 = a.a(Companion, I, a2);
        if (a3 != null) {
            a3.edit().clear().commit();
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
            return;
        }
        bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(11, "未找到该数据"));
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
    public final void getTinyLocalStorage(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"key"}) String str, @BindingParam(name = {"__appxDomain"}) String str2, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5878107e", new Object[]{this, apiContext, str, str2, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(str2, "appXDomain");
        ckf.g(bridgeCallback, "bridgeCallback");
        bbs b2 = apiContext.b();
        if (b2 == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b("TMSStorageBridge", "getTinyLocalStorage error, instance is not a TMSInstance");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        Activity I = b2.I();
        ckf.f(I, "instance.activity");
        String f2 = TMSInstanceExtKt.f(b2);
        if (f2.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b("TMSStorageBridge", "setTinyLocalStorage error, user id is null or empty");
        } else if (str == null || str.length() == 0) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(2, "Key不能为空"));
        } else {
            String a2 = a(str2, f2);
            if (q9s.b1()) {
                boq.INSTANCE.c(b2, apiContext.e(), f2, str, new c(bridgeCallback, this));
                return;
            }
            SharedPreferences a3 = a.a(Companion, I, a2);
            if (a3 == null) {
                bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(11, "未找到该数据"));
            } else if (a3.contains(str)) {
                jSONObject.put((JSONObject) "data", a3.getString(str, ""));
                bridgeCallback.sendJSONResponse(jSONObject);
            } else {
                jSONObject.put((JSONObject) "data", "");
                bridgeCallback.sendJSONResponse(jSONObject);
            }
        }
    }

    @ThreadType(ExecutorType.IO)
    @APIMethod
    public final void getTinyLocalStorageInfo(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"__appxDomain"}) String str, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67ea8cfa", new Object[]{this, apiContext, str, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(str, "appXDomain");
        ckf.g(bridgeCallback, "bridgeCallback");
        bbs b2 = apiContext.b();
        if (b2 == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b("TMSStorageBridge", "getTinyLocalStorageInfo error, instance is not a TMSInstance");
            return;
        }
        Activity I = b2.I();
        ckf.f(I, "instance.activity");
        String f2 = TMSInstanceExtKt.f(b2);
        if (f2.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b("TMSStorageBridge", "setTinyLocalStorage error, user id is null or empty");
            return;
        }
        String a2 = a(str, f2);
        if (q9s.b1()) {
            boq.INSTANCE.b(b2, apiContext.e(), f2, new d(bridgeCallback, this));
            return;
        }
        JSONObject d2 = Companion.d(I, a2);
        if (d2 != null) {
            bridgeCallback.sendJSONResponse(d2);
        } else {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(1, "get sharedPreferences info error."));
        }
    }

    @ThreadType(ExecutorType.IO)
    @APIMethod
    public final void removeTinyLocalStorage(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"key"}) String str, @BindingParam(name = {"__appxDomain"}) String str2, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0d3310", new Object[]{this, apiContext, str, str2, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(str2, "appXDomain");
        ckf.g(bridgeCallback, "bridgeCallback");
        bbs b2 = apiContext.b();
        if (b2 == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b("TMSStorageBridge", "removeTinyLocalStorage error, instance is not a TMSInstance");
            return;
        }
        Activity I = b2.I();
        ckf.f(I, "instance.activity");
        String f2 = TMSInstanceExtKt.f(b2);
        if (f2.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b("TMSStorageBridge", "setTinyLocalStorage error, user id is null or empty");
            return;
        }
        String a2 = a(str2, f2);
        if (str == null || str.length() == 0) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(2, "Key不能为空"));
        } else if (q9s.b1()) {
            boq.INSTANCE.d(b2, apiContext.e(), f2, str, new e(bridgeCallback, this));
        } else {
            SharedPreferences a3 = a.a(Companion, I, a2);
            if (a3 == null) {
                bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(11, "未找到该数据"));
                return;
            }
            a3.edit().remove(str).commit();
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
        }
    }

    @ThreadType(ExecutorType.IO)
    @APIMethod
    public final void setTinyLocalStorage(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"key"}) String str, @BindingParam(name = {"data"}) Object obj, @BindingParam(name = {"__appxDomain"}) String str2, @BindingCallback BridgeCallback bridgeCallback) {
        String jSONString;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2be33496", new Object[]{this, apiContext, str, obj, str2, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(str2, "appXDomain");
        ckf.g(bridgeCallback, "bridgeCallback");
        bbs b2 = apiContext.b();
        if (b2 == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b("TMSStorageBridge", "setTinyLocalStorage error, instance is not a TMSInstance");
        } else if (str == null || str.length() == 0) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(2, "Key不能为空"));
        } else {
            if (obj instanceof String) {
                jSONString = (String) obj;
            } else {
                jSONString = obj instanceof JSONObject ? ((JSONObject) obj).toJSONString() : null;
            }
            if (jSONString == null || jSONString.length() == 0) {
                bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(11, "未找到该数据"));
                return;
            }
            Activity I = b2.I();
            ckf.f(I, "instance.activity");
            String f2 = TMSInstanceExtKt.f(b2);
            if (f2.length() == 0) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                TMSLogger.b("TMSStorageBridge", "setTinyLocalStorage error, user id is null or empty");
                return;
            }
            String a2 = a(str2, f2);
            if (q9s.b1()) {
                boq.INSTANCE.e(b2, apiContext.e(), f2, str, jSONString, new f(bridgeCallback, this));
                return;
            }
            SharedPreferences a3 = a.a(Companion, I, a2);
            if (a3 == null) {
                bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(11, "未找到该数据"));
                return;
            }
            a3.edit().putString(str, jSONString).commit();
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
        }
    }
}
