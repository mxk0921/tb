package tb;

import android.taobao.windvane.connect.HttpConnector;
import android.text.TextUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.taobao.themis.kernel.adapter.ITransportAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.network.http.HttpType;
import com.taobao.themis.kernel.page.TMSPage;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import com.taobao.themis.open.utils.ApPathType;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.text.Regex;
import tb.auj;
import tb.e0d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class xbs {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ERROR_CODE_DOWNLOAD_FAILED = 12;
    public static final int ERROR_CODE_DOWNLOAD_NO_PERMISSION = 13;
    public static final int ERROR_CODE_UPLOAD_FILE_FAILED = 12;
    public static final int ERROR_CODE_UPLOAD_FILE_NOT_EXIT = 11;
    public static final int ERROR_CODE_UPLOAD_FILE_NO_PERMISSION = 13;
    public static final xbs INSTANCE = new xbs();
    public static final String REQUEST_FROM_MINI_APP_CACHE = "fromMiniAppLocalCache";
    public static final String STATUS = "status";
    public static final String STATUS_TEXT = "statusText";

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ v7b f31273a;
        public final /* synthetic */ BridgeCallback b;
        public final /* synthetic */ e0d c;
        public final /* synthetic */ String d;
        public final /* synthetic */ bbs e;

        public a(v7b v7bVar, BridgeCallback bridgeCallback, e0d e0dVar, String str, bbs bbsVar) {
            this.f31273a = v7bVar;
            this.b = bridgeCallback;
            this.c = e0dVar;
            this.d = str;
            this.e = bbsVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                new HttpConnector().f(this.f31273a, new C1098a(this.b, this.c, this.d, this.e));
            }
        }

        /* compiled from: Taobao */
        /* renamed from: tb.xbs$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class C1098a extends h7b<b8b> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ BridgeCallback f31274a;
            public final /* synthetic */ e0d b;
            public final /* synthetic */ String c;
            public final /* synthetic */ bbs d;

            /* compiled from: Taobao */
            /* renamed from: tb.xbs$a$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
            public static final class C1099a implements uq {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ bbs f31275a;
                public final /* synthetic */ String b;
                public final /* synthetic */ File c;
                public final /* synthetic */ BridgeCallback d;

                public C1099a(bbs bbsVar, String str, File file, BridgeCallback bridgeCallback) {
                    this.f31275a = bbsVar;
                    this.b = str;
                    this.c = file;
                    this.d = bridgeCallback;
                }

                @Override // tb.uq
                public final void a(jr jrVar, boolean z) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
                    } else if (jrVar.d()) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put((JSONObject) "apFilePath", ws4.f(TMSInstanceExtKt.f(this.f31275a), this.b, ApPathType.AP_PATH_TYPE_TEMP));
                        jSONObject.put((JSONObject) "fileSize", (String) Long.valueOf(nc9.c(this.c)));
                        this.d.sendJSONResponse(jSONObject);
                    } else {
                        this.d.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                        JSONObject a2 = jrVar.a();
                        JSONObject jSONObject2 = a2 == null ? null : a2.getJSONObject("errorMessage");
                        if (jSONObject2 == null) {
                            TMSLogger.b("TMSNetworkAbility", "mega fail! no error message");
                            this.d.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                            return;
                        }
                        int intValue = jSONObject2.getIntValue("statusCode");
                        String string = jSONObject2.getString("msg");
                        if (string == null) {
                            string = "";
                        }
                        TMSLogger.b("TMSNetworkAbility", "mega fail! code:" + intValue + " msg:" + string);
                    }
                }
            }

            public C1098a(BridgeCallback bridgeCallback, e0d e0dVar, String str, bbs bbsVar) {
                this.f31274a = bridgeCallback;
                this.b = e0dVar;
                this.c = str;
                this.d = bbsVar;
            }

            public static /* synthetic */ Object ipc$super(C1098a aVar, String str, Object... objArr) {
                if (str.hashCode() == 2053577885) {
                    super.a(((Number) objArr[0]).intValue(), (String) objArr[1]);
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/open/ability/network/TMSNetworkAbility$downloadFile$runnable$1$1");
            }

            @Override // tb.h7b
            public void a(int i, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7a671c9d", new Object[]{this, new Integer(i), str});
                    return;
                }
                this.f31274a.sendBridgeResponse(BridgeResponse.newError(12, str));
                super.a(i, str);
            }

            /* renamed from: e */
            public void b(b8b b8bVar, int i) {
                File parentFile;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("696fd54d", new Object[]{this, b8bVar, new Integer(i)});
                } else if (b8bVar == null || b8bVar.b() == null) {
                    this.f31274a.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                    e0d e0dVar = this.b;
                    if (e0dVar != null) {
                        e0dVar.c("data is empty");
                    }
                    TMSLogger.b("TMSNetworkAbility", "downloadFile, data is null");
                } else {
                    e0d e0dVar2 = this.b;
                    if (e0dVar2 != null) {
                        e0dVar2.e(this.c, b8bVar.d(), false, b8bVar.c());
                    }
                    e0d e0dVar3 = this.b;
                    if (e0dVar3 != null) {
                        byte[] b = b8bVar.b();
                        ckf.f(b, "data.data");
                        e0dVar3.d(b);
                    }
                    e0d e0dVar4 = this.b;
                    if (e0dVar4 != null) {
                        e0dVar4.b();
                    }
                    String str = this.c;
                    String substring = str.substring(wsq.e0(str, "/", 0, false, 6, null) + 1);
                    ckf.f(substring, "this as java.lang.String).substring(startIndex)");
                    String f = TMSInstanceExtKt.f(this.d);
                    String a2 = ws4.a(f, "https://tmp/download/" + ((Object) eoh.c(this.c)) + wh6.DIR + substring, ApPathType.AP_PATH_TYPE_TEMP);
                    if (a2 == null || a2.length() == 0) {
                        this.f31274a.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                        TMSLogger.b("TMSNetworkAbility", "downloadFile, path is null");
                        return;
                    }
                    File file = new File(a2);
                    File parentFile2 = file.getParentFile();
                    if ((parentFile2 == null || !parentFile2.exists()) && (parentFile = file.getParentFile()) != null) {
                        parentFile.mkdirs();
                    }
                    wc9 wc9Var = wc9.INSTANCE;
                    bbs bbsVar = this.d;
                    ByteBuffer wrap = ByteBuffer.wrap(b8bVar.b());
                    ckf.f(wrap, "wrap(data.data)");
                    wc9Var.n(bbsVar, a2, wrap, "ArrayBuffer", new C1099a(this.d, a2, file, this.f31274a));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f31276a;
        public final /* synthetic */ auj b;

        public b(e eVar, auj aujVar) {
            this.f31276a = eVar;
            this.b = aujVar;
        }

        @Override // tb.xbs.f
        public void a(int i, InputStream inputStream, Map<String, String> map, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e306dde6", new Object[]{this, new Integer(i), inputStream, map, new Boolean(z)});
                return;
            }
            e eVar = this.f31276a;
            if (eVar != null) {
                eVar.a(xbs.INSTANCE.h(i, inputStream, map, this.b.e(), z));
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ITransportAdapter f31277a;
        public final /* synthetic */ gcn b;
        public final /* synthetic */ f c;
        public final /* synthetic */ e0d d;

        public c(ITransportAdapter iTransportAdapter, gcn gcnVar, f fVar, e0d e0dVar) {
            this.f31277a = iTransportAdapter;
            this.b = gcnVar;
            this.c = fVar;
            this.d = e0dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            try {
                try {
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        try {
                            xbs.b(xbs.INSTANCE, this.f31277a, this.b, this.c, this.d);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    } catch (ExecutionException e3) {
                        e3.printStackTrace();
                    }
                } catch (Throwable unused) {
                    xbs.b(xbs.INSTANCE, this.f31277a, this.b, this.c, this.d);
                }
            } catch (IOException e4) {
                TMSLogger.c("TMSNetworkAbility", e4.getMessage(), e4);
            } catch (InterruptedException e5) {
                TMSLogger.c("TMSNetworkAbility", e5.getMessage(), e5);
            } catch (ExecutionException e6) {
                TMSLogger.c("TMSNetworkAbility", e6.getMessage(), e6);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface e {
        void a(Object obj);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface f {
        void a(int i, InputStream inputStream, Map<String, String> map, boolean z);
    }

    static {
        t2o.a(843055231);
    }

    public static final /* synthetic */ String a(xbs xbsVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ed74ce19", new Object[]{xbsVar, str});
        }
        return xbsVar.f(str);
    }

    public static final /* synthetic */ void b(xbs xbsVar, ITransportAdapter iTransportAdapter, gcn gcnVar, f fVar, e0d e0dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b426cbe", new Object[]{xbsVar, iTransportAdapter, gcnVar, fVar, e0dVar});
        } else {
            xbsVar.i(iTransportAdapter, gcnVar, fVar, e0dVar);
        }
    }

    public final void c(bbs bbsVar, String str, JSONObject jSONObject, e0d e0dVar, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee12ee7f", new Object[]{this, bbsVar, str, jSONObject, e0dVar, bridgeCallback});
            return;
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str, "url");
        ckf.g(bridgeCallback, "bridgeCallback");
        if (str.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSNetworkAbility", "downloadFile, url is empty");
        }
        v7b v7bVar = new v7b(str);
        v7bVar.i(JosStatusCodes.RTN_CODE_COMMON_ERROR);
        try {
            HashMap hashMap = new HashMap();
            if (jSONObject != null) {
                for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                    hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
            }
            v7bVar.j(hashMap);
            if (e0dVar != null) {
                e0d.a aVar = new e0d.a();
                aVar.h(str);
                aVar.f(v7bVar.c());
                aVar.e(v7bVar.b());
                e0dVar.a(aVar);
            }
            new a(v7bVar, bridgeCallback, e0dVar, str, bbsVar).run();
        } catch (Exception unused) {
            TMSLogger.b("TMSNetworkAbility", "downloadFile, header is invalid");
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        }
    }

    public final void d(JSONObject jSONObject, auj.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("417210c1", new Object[]{this, jSONObject, bVar});
        } else if (jSONObject != null) {
            for (String str : jSONObject.keySet()) {
                bVar.b(str, jSONObject.getString(str));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0083 A[Catch: Exception -> 0x007c, TryCatch #1 {Exception -> 0x007c, blocks: (B:8:0x0056, B:16:0x0083, B:17:0x0094, B:19:0x009f, B:21:0x00a7, B:23:0x00af, B:25:0x00b7, B:27:0x00bf, B:31:0x00c9, B:9:0x005c, B:11:0x0064), top: B:34:0x0056 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.lang.String r14, java.lang.String r15, java.lang.String r16, com.alibaba.fastjson.JSONObject r17, java.lang.String r18, java.lang.String r19, float r20, java.lang.String r21, tb.xbs.e r22, com.taobao.themis.kernel.page.TMSPage r23, tb.e0d r24) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.xbs.e(java.lang.String, java.lang.String, java.lang.String, com.alibaba.fastjson.JSONObject, java.lang.String, java.lang.String, float, java.lang.String, tb.xbs$e, com.taobao.themis.kernel.page.TMSPage, tb.e0d):void");
    }

    public final String g(JSONObject jSONObject) {
        String str;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("982c01e4", new Object[]{this, jSONObject});
        }
        String str2 = "";
        try {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                String key = entry.getKey();
                String obj = entry.getValue().toString();
                if (i >= jSONObject.size() - 1) {
                    str = key + '=' + ((Object) URLEncoder.encode(obj, "UTF-8"));
                } else {
                    str = key + '=' + ((Object) URLEncoder.encode(obj, "UTF-8")) + '&';
                }
                str2 = ckf.p(str2, str);
                i++;
            }
        } catch (Exception e2) {
            TMSLogger.c("TMSNetworkAbility", e2.getMessage(), e2);
        }
        return str2;
    }

    public final void i(ITransportAdapter iTransportAdapter, gcn gcnVar, f fVar, e0d e0dVar) throws InterruptedException, ExecutionException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("709ca90c", new Object[]{this, iTransportAdapter, gcnVar, fVar, e0dVar});
            return;
        }
        hcn httpRequest = iTransportAdapter.httpRequest(gcnVar, e0dVar);
        if (httpRequest != null && fVar != null) {
            fVar.a(httpRequest.c(), httpRequest.b(), i8b.INSTANCE.b(httpRequest), false);
        }
    }

    public final void j(String str, String str2, auj aujVar, f fVar, TMSPage tMSPage, e0d e0dVar) {
        byte[] bArr;
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b67fcfe", new Object[]{this, str, str2, aujVar, fVar, tMSPage, e0dVar});
            return;
        }
        ITransportAdapter iTransportAdapter = (ITransportAdapter) p8s.b(ITransportAdapter.class);
        if (iTransportAdapter == null) {
            TMSLogger.b("TMSNetworkAbility", "sendRequest, httpService is null");
            return;
        }
        if (!TextUtils.isEmpty(aujVar.a())) {
            String a2 = aujVar.a();
            ckf.f(a2, "options.body");
            bArr = a2.getBytes(uj3.UTF_8);
            ckf.f(bArr, "this as java.lang.String).getBytes(charset)");
        } else {
            bArr = null;
        }
        gcn a3 = gcn.m().f(aujVar.f()).b(aujVar.b()).c(aujVar.c()).e(aujVar.d()).d(bArr).a();
        ckf.f(a3, "newBuilder()\n           …ata)\n            .build()");
        a3.f("appId", str);
        a3.f(gcn.PLUGIN_ID, str2);
        c cVar = new c(iTransportAdapter, a3, fVar, e0dVar);
        IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
        if (iExecutorService != null && (executor = iExecutorService.getExecutor(ExecutorType.NETWORK)) != null) {
            executor.execute(cVar);
        }
    }

    public final Map<String, Object> h(int i, InputStream inputStream, Map<String, String> map, HttpType httpType, boolean z) {
        String str;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("621c302c", new Object[]{this, new Integer(i), inputStream, map, httpType, new Boolean(z)});
        }
        HashMap hashMap = new HashMap();
        if (-1 == i) {
            hashMap.put("ok", Boolean.FALSE);
            hashMap.put("status", -1);
            hashMap.put("statusText", "ERR_CONNECT_FAILED");
        } else {
            hashMap.put("status", Integer.valueOf(i));
            if (200 > i || i >= 300) {
                z2 = false;
            }
            hashMap.put("ok", Boolean.valueOf(z2));
            if (inputStream == null) {
                hashMap.put("data", null);
            } else {
                try {
                    if (HttpType.arraybuffer == httpType) {
                        hashMap.put("data", i8b.INSTANCE.e(inputStream));
                    } else if (HttpType.base64 == httpType) {
                        hashMap.put("data", i8b.INSTANCE.d(inputStream));
                    } else {
                        i8b i8bVar = i8b.INSTANCE;
                        if (map != null) {
                            str = i8bVar.a(map, "Content-Type");
                        } else {
                            str = "";
                        }
                        hashMap.put("data", i8bVar.c(i8bVar.f(inputStream, str), httpType));
                    }
                } catch (JSONException e2) {
                    TMSLogger.c("TMSNetworkAbility", e2.getMessage(), e2);
                    hashMap.put("ok", Boolean.FALSE);
                    hashMap.put("data", "{'err':'Data parse failed!'}");
                }
            }
            hashMap.put("statusText", pkq.a(String.valueOf(i)));
        }
        hashMap.put("headers", map);
        if (z) {
            hashMap.put(REQUEST_FROM_MINI_APP_CACHE, Boolean.TRUE);
        }
        return hashMap;
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f31278a;
        public final /* synthetic */ Map<String, Object> b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ JSONObject f;
        public final /* synthetic */ e0d g;
        public final /* synthetic */ BridgeCallback h;

        public d(String str, Map<String, ? extends Object> map, String str2, String str3, String str4, JSONObject jSONObject, e0d e0dVar, BridgeCallback bridgeCallback) {
            this.f31278a = str;
            this.b = map;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = jSONObject;
            this.g = e0dVar;
            this.h = bridgeCallback;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:139:0x041a  */
        /* JADX WARN: Removed duplicated region for block: B:142:0x0431 A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r11v1, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r11v24 */
        /* JADX WARN: Type inference failed for: r11v9 */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 1080
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.xbs.d.run():void");
        }
    }

    public final String f(String str) {
        List list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32f608a7", new Object[]{this, str});
        }
        List<String> split = new Regex("\\.").split(str, 0);
        if (!split.isEmpty()) {
            ListIterator<String> listIterator = split.listIterator(split.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous().length() != 0) {
                    list = i04.v0(split, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        list = yz3.i();
        Object[] array = list.toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            int length = strArr.length;
            if (length < 2) {
                return "";
            }
            return strArr[length - 1];
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public final void k(Map<String, ? extends Object> map, String str, String str2, String str3, String str4, JSONObject jSONObject, e0d e0dVar, BridgeCallback bridgeCallback) {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6df013e6", new Object[]{this, map, str, str2, str3, str4, jSONObject, e0dVar, bridgeCallback});
            return;
        }
        ckf.g(str, "filePath");
        ckf.g(str2, "fileName");
        ckf.g(str3, v4s.PARAM_UPLOAD_FILE_TYPE);
        ckf.g(str4, "url");
        ckf.g(bridgeCallback, "bridgeCallback");
        d dVar = new d(str, map, str2, str3, str4, jSONObject, e0dVar, bridgeCallback);
        IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
        if (iExecutorService != null && (executor = iExecutorService.getExecutor(ExecutorType.NETWORK)) != null) {
            executor.execute(dVar);
        }
    }
}
