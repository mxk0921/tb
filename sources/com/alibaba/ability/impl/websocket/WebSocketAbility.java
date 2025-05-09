package com.alibaba.ability.impl.websocket;

import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.mobilesdk.socketcraft.api.BasicWebSocketContext;
import com.alipay.android.phone.mobilesdk.socketcraft.api.DefaultWebSocketClient;
import com.alipay.android.phone.mobilesdk.socketcraft.api.WebSocketCallback;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.a07;
import tb.ckf;
import tb.cu;
import tb.hp6;
import tb.jpu;
import tb.kdb;
import tb.t2o;
import tb.tsq;
import tb.uj3;
import tb.vq;
import tb.xpd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class WebSocketAbility extends cu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_CLOSE = "close";
    public static final String API_CONNECT = "connect";
    public static final String API_SEND = "send";
    public static final a Companion = new a(null);
    public static final String DEF_SOCKET_TASK_ID = "SingleSocket";

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, c> f2068a = new LinkedHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(142606339);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final DefaultWebSocketClient f2070a;

        static {
            t2o.a(142606341);
        }

        public c(String str, DefaultWebSocketClient defaultWebSocketClient, b bVar) {
            ckf.g(str, "socketTaskId");
            ckf.g(defaultWebSocketClient, "client");
            ckf.g(bVar, "callback");
            this.f2070a = defaultWebSocketClient;
        }

        public final DefaultWebSocketClient a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DefaultWebSocketClient) ipChange.ipc$dispatch("82c5e7c2", new Object[]{this});
            }
            return this.f2070a;
        }
    }

    static {
        t2o.a(142606338);
    }

    public static /* synthetic */ Object ipc$super(WebSocketAbility webSocketAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/websocket/WebSocketAbility");
    }

    public final ExecuteResult a(kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("321d89b2", new Object[]{this, kdbVar, map, vqVar});
        }
        String e = e(kdbVar);
        ckf.d(e);
        b(e);
        return null;
    }

    public final void b(String str) {
        DefaultWebSocketClient a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9419ce89", new Object[]{this, str});
            return;
        }
        c cVar = (c) ((LinkedHashMap) this.f2068a).get(str);
        if (cVar != null && (a2 = cVar.a()) != null) {
            if (a2.isOpen()) {
                a2.close();
            }
            this.f2068a.remove(str);
        }
    }

    public final Map<String, String> d(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a76a76f1", new Object[]{this, map});
        }
        HashMap hashMap = new HashMap();
        if (map != null && !map.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                if (TextUtils.isEmpty(entry.getKey()) || entry.getValue() != null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                hashMap.put(entry2.getKey(), String.valueOf(entry2.getValue()));
            }
        }
        return hashMap;
    }

    public final String e(kdb kdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e88b50b5", new Object[]{this, kdbVar});
        }
        String n = kdbVar.n();
        if (n == null || n.length() == 0) {
            return DEF_SOCKET_TASK_ID;
        }
        return kdbVar.n();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    @Override // tb.hdb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alibaba.ability.result.ExecuteResult execute(java.lang.String r7, tb.kdb r8, java.util.Map<java.lang.String, ? extends java.lang.Object> r9, tb.vq r10) {
        /*
            r6 = this;
            java.lang.String r0 = "api "
            com.android.alibaba.ip.runtime.IpChange r1 = com.alibaba.ability.impl.websocket.WebSocketAbility.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0023
            java.lang.String r0 = "b2cd7d0b"
            r2 = 5
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r6
            r3 = 1
            r2[r3] = r7
            r7 = 2
            r2[r7] = r8
            r7 = 3
            r2[r7] = r9
            r7 = 4
            r2[r7] = r10
            java.lang.Object r7 = r1.ipc$dispatch(r0, r2)
            com.alibaba.ability.result.ExecuteResult r7 = (com.alibaba.ability.result.ExecuteResult) r7
            return r7
        L_0x0023:
            java.lang.String r1 = "api"
            tb.ckf.g(r7, r1)
            java.lang.String r1 = "context"
            tb.ckf.g(r8, r1)
            java.lang.String r1 = "params"
            tb.ckf.g(r9, r1)
            java.lang.String r1 = "callback"
            tb.ckf.g(r10, r1)
            int r1 = r7.hashCode()     // Catch: all -> 0x0059
            r2 = 3526536(0x35cf88, float:4.94173E-39)
            if (r1 == r2) goto L_0x0068
            r2 = 94756344(0x5a5ddf8, float:1.5598064E-35)
            if (r1 == r2) goto L_0x005b
            r2 = 951351530(0x38b478ea, float:8.605591E-5)
            if (r1 == r2) goto L_0x004c
            goto L_0x0076
        L_0x004c:
            java.lang.String r1 = "connect"
            boolean r1 = r7.equals(r1)     // Catch: all -> 0x0059
            if (r1 == 0) goto L_0x0076
            com.alibaba.ability.result.ExecuteResult r7 = r6.c(r8, r9, r10)     // Catch: all -> 0x0059
            goto L_0x00a5
        L_0x0059:
            r7 = move-exception
            goto L_0x008e
        L_0x005b:
            java.lang.String r1 = "close"
            boolean r1 = r7.equals(r1)     // Catch: all -> 0x0059
            if (r1 == 0) goto L_0x0076
            com.alibaba.ability.result.ExecuteResult r7 = r6.a(r8, r9, r10)     // Catch: all -> 0x0059
            goto L_0x00a5
        L_0x0068:
            java.lang.String r1 = "send"
            boolean r1 = r7.equals(r1)     // Catch: all -> 0x0059
            if (r1 == 0) goto L_0x0076
            com.alibaba.ability.result.ExecuteResult r7 = r6.f(r8, r9, r10)     // Catch: all -> 0x0059
            goto L_0x00a5
        L_0x0076:
            com.alibaba.ability.result.ErrorResult$a$a r8 = com.alibaba.ability.result.ErrorResult.a.Companion     // Catch: all -> 0x0059
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: all -> 0x0059
            r9.<init>(r0)     // Catch: all -> 0x0059
            r9.append(r7)     // Catch: all -> 0x0059
            java.lang.String r7 = " not found"
            r9.append(r7)     // Catch: all -> 0x0059
            java.lang.String r7 = r9.toString()     // Catch: all -> 0x0059
            com.alibaba.ability.result.ErrorResult r7 = r8.a(r7)     // Catch: all -> 0x0059
            goto L_0x00a5
        L_0x008e:
            com.alibaba.ability.result.ErrorResult r8 = new com.alibaba.ability.result.ErrorResult
            java.lang.String r7 = r7.getMessage()
            if (r7 == 0) goto L_0x0098
        L_0x0096:
            r2 = r7
            goto L_0x009b
        L_0x0098:
            java.lang.String r7 = ""
            goto L_0x0096
        L_0x009b:
            java.lang.String r1 = "500"
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r7 = r8
        L_0x00a5:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.websocket.WebSocketAbility.execute(java.lang.String, tb.kdb, java.util.Map, tb.vq):com.alibaba.ability.result.ExecuteResult");
    }

    @Override // tb.cu
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f2068a;
        for (c cVar : linkedHashMap.values()) {
            try {
                if (cVar.a().isOpen()) {
                    cVar.a().close();
                }
            } catch (Throwable unused) {
            }
        }
        linkedHashMap.clear();
    }

    public final ExecuteResult c(kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a6367580", new Object[]{this, kdbVar, map, vqVar});
        }
        String e = e(kdbVar);
        ckf.d(e);
        b(e);
        String w = MegaUtils.w(map, "url", "");
        if (TextUtils.isEmpty(w)) {
            vqVar.b(ErrorResult.a.Companion.g("url为空"));
            return null;
        }
        try {
            URI uri = new URI(hp6.b(w, (JSONObject) MegaUtils.r(map, "data")));
            String scheme = uri.getScheme();
            ckf.f(scheme, "uri.scheme");
            if (TextUtils.isEmpty(scheme)) {
                vqVar.a(ErrorResult.a.Companion.g("scheme 为空"));
                return null;
            } else if (tsq.x("ws", scheme, true) || tsq.x("wss", scheme, true)) {
                Map<String, String> d = d(MegaUtils.r(map, "headers"));
                b bVar = new b(vqVar);
                DefaultWebSocketClient defaultWebSocketClient = new DefaultWebSocketClient(uri, d, bVar, new BasicWebSocketContext());
                this.f2068a.put(e, new c(e, defaultWebSocketClient, bVar));
                if (tsq.x("ws", scheme, true)) {
                    defaultWebSocketClient.connect();
                } else {
                    defaultWebSocketClient.connectWithSSL();
                }
                return null;
            } else {
                vqVar.b(ErrorResult.a.Companion.g("URL必须以ws或者wss开头"));
                return null;
            }
        } catch (URISyntaxException unused) {
            vqVar.b(ErrorResult.a.Companion.g("无法识别的URL格式"));
            return null;
        }
    }

    public final ExecuteResult f(kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("6c4f8e22", new Object[]{this, kdbVar, map, vqVar});
        }
        c cVar = (c) ((LinkedHashMap) this.f2068a).get(e(kdbVar));
        if (cVar == null) {
            vqVar.b(ErrorResult.a.Companion.g("网络连接没有打开，无法发送消息网络连接没有打开，无法发送消息"));
            return null;
        }
        String w = MegaUtils.w(map, "data", "");
        Boolean g = MegaUtils.g(map, "isBuffer", Boolean.FALSE);
        if (w == null || w.length() == 0) {
            vqVar.b(ErrorResult.a.Companion.g("发送数据 data为空"));
            return null;
        } else if (!cVar.a().isOpen()) {
            vqVar.b(new ErrorResult("onSocketError", "没有建连成功之前无法发送消息", (Map) null, 4, (a07) null));
            return null;
        } else {
            if (ckf.b(g, Boolean.TRUE)) {
                ckf.d(w);
                Charset forName = Charset.forName("utf-8");
                ckf.f(forName, "Charset.forName(charsetName)");
                byte[] bytes = w.getBytes(forName);
                ckf.f(bytes, "(this as java.lang.String).getBytes(charset)");
                cVar.a().send(ByteBuffer.wrap(Base64.decode(bytes, 2)));
            } else {
                cVar.a().send(w);
            }
            vqVar.a(new FinishResult(new JSONObject(), "onSuccess"));
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements WebSocketCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final vq f2069a;

        static {
            t2o.a(142606340);
        }

        public b(vq vqVar) {
            ckf.g(vqVar, "callback");
            this.f2069a = vqVar;
        }

        @Override // com.alipay.android.phone.mobilesdk.socketcraft.api.WebSocketCallback
        public void onSocketClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("35ada86d", new Object[]{this});
            } else {
                this.f2069a.a(new FinishResult(new JSONObject(), "onClose"));
            }
        }

        @Override // com.alipay.android.phone.mobilesdk.socketcraft.api.WebSocketCallback
        public void onSocketError(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7adf907", new Object[]{this, str});
                return;
            }
            if (str == null) {
                str = "未知错误";
            }
            this.f2069a.b(new ErrorResult("onSocketError", str, (Map) null, 4, (a07) null));
        }

        @Override // com.alipay.android.phone.mobilesdk.socketcraft.api.WebSocketCallback
        public void onSocketMessage(ByteBuffer byteBuffer) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e2b24355", new Object[]{this, byteBuffer});
                return;
            }
            if (byteBuffer != null) {
                byte[] encode = Base64.encode(byteBuffer.array(), 2);
                ckf.f(encode, "Base64.encode(it.array(), Base64.NO_WRAP)");
                str = new String(encode, uj3.UTF_8);
            } else {
                str = null;
            }
            this.f2069a.a(new FinishResult(new JSONObject(kotlin.collections.a.k(jpu.a("data", str), jpu.a("isBuffer", Boolean.TRUE))), xpd.c.EVENT_ON_MESSAGE));
        }

        @Override // com.alipay.android.phone.mobilesdk.socketcraft.api.WebSocketCallback
        public void onSocketOpen() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb387e23", new Object[]{this});
            } else {
                this.f2069a.a(new FinishResult(new JSONObject(), "onOpen"));
            }
        }

        @Override // com.alipay.android.phone.mobilesdk.socketcraft.api.WebSocketCallback
        public void onSocketMessage(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("118d2a46", new Object[]{this, str});
            } else {
                this.f2069a.a(new FinishResult(new JSONObject(kotlin.collections.a.k(jpu.a("data", str), jpu.a("isBuffer", Boolean.FALSE))), xpd.c.EVENT_ON_MESSAGE));
            }
        }
    }
}
