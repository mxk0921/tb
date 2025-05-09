package com.alibaba.ability.impl.mtop;

import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.stream.IMtopStreamListener;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.MtopAccountSiteUtils;
import mtopsdk.mtop.intf.MtopPrefetch;
import mtopsdk.mtop.util.MtopStatistics;
import tb.a07;
import tb.ckf;
import tb.cu;
import tb.eji;
import tb.h4j;
import tb.hbl;
import tb.jpu;
import tb.k7j;
import tb.kdb;
import tb.kqu;
import tb.l7j;
import tb.m7j;
import tb.njg;
import tb.p4j;
import tb.r4j;
import tb.rb;
import tb.s2d;
import tb.t2o;
import tb.txq;
import tb.uj3;
import tb.v5j;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class MtopAbility extends cu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_ACCOUNT_SITE = "isSupportAccountSite";
    public static final String API_PREFETCH_DATA = "prefetchData";
    public static final String API_REQUEST_DATA = "requestData";
    public static final String API_REQUEST_STREAM = "requestStream";
    public static final String API_SEND = "send";
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static final eji f1976a = new eji("mega-mtop-parse", 3);
    public static final njg b = kotlin.a.b(MtopAbility$Companion$streamScheduler$2.INSTANCE);
    public static final eji c = new eji("mega-mtop-call", 3);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(119537667);
        }

        public a() {
        }

        public static final /* synthetic */ void a(a aVar, Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dad66566", new Object[]{aVar, runnable});
            } else {
                aVar.d(runnable);
            }
        }

        public final eji b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (eji) ipChange.ipc$dispatch("794f1307", new Object[]{this});
            }
            return MtopAbility.access$getSParseScheduler$cp();
        }

        public final eji c() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("82d36887", new Object[]{this});
            } else {
                value = MtopAbility.access$getStreamScheduler$cp().getValue();
            }
            return (eji) value;
        }

        public final void d(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("944a242b", new Object[]{this, runnable});
            } else if (!hbl.b()) {
                runnable.run();
            } else {
                Thread currentThread = Thread.currentThread();
                Looper mainLooper = Looper.getMainLooper();
                ckf.f(mainLooper, "Looper.getMainLooper()");
                if (ckf.b(currentThread, mainLooper.getThread())) {
                    runnable.run();
                } else {
                    eji.j(MtopAbility.access$getApiScheduler$cp(), runnable, 0L, null, 6, null);
                }
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Map b;
        public final /* synthetic */ vq c;
        public final /* synthetic */ kdb d;

        public b(Map map, vq vqVar, kdb kdbVar) {
            this.b = map;
            this.c = vqVar;
            this.d = kdbVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                MtopAbility.access$requestData(MtopAbility.this, new v5j(this.b), this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Map b;
        public final /* synthetic */ vq c;
        public final /* synthetic */ kdb d;

        public c(Map map, vq vqVar, kdb kdbVar) {
            this.b = map;
            this.c = vqVar;
            this.d = kdbVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                MtopAbility.this.prefetchData(new v5j(this.b), this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Map b;
        public final /* synthetic */ vq c;
        public final /* synthetic */ kdb d;

        public d(Map map, vq vqVar, kdb kdbVar) {
            this.b = map;
            this.c = vqVar;
            this.d = kdbVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                MtopAbility.access$requestStream(MtopAbility.this, new v5j(this.b), this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MtopListener f1986a;

        public e(MtopListener mtopListener) {
            this.f1986a = mtopListener;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f1986a.onTimeOut();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class f implements MtopPrefetch.IPrefetchCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final f INSTANCE = new f();

        @Override // mtopsdk.mtop.intf.MtopPrefetch.IPrefetchCallback
        public final void onPrefetch(String str, HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("58e86b4c", new Object[]{this, str, hashMap});
            }
        }
    }

    public static final /* synthetic */ eji access$getApiScheduler$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eji) ipChange.ipc$dispatch("e7ccf592", new Object[0]);
        }
        return c;
    }

    public static final /* synthetic */ eji access$getSParseScheduler$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eji) ipChange.ipc$dispatch("fc1df6c0", new Object[0]);
        }
        return f1976a;
    }

    public static final /* synthetic */ njg access$getStreamScheduler$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("c2ce88e2", new Object[0]);
        }
        return b;
    }

    public static final /* synthetic */ ExecuteResult access$requestData(MtopAbility mtopAbility, v5j v5jVar, vq vqVar, kdb kdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("60875e25", new Object[]{mtopAbility, v5jVar, vqVar, kdbVar});
        }
        return mtopAbility.d(v5jVar, vqVar, kdbVar);
    }

    public static final /* synthetic */ ExecuteResult access$requestStream(MtopAbility mtopAbility, v5j v5jVar, vq vqVar, kdb kdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("43ff0c3b", new Object[]{mtopAbility, v5jVar, vqVar, kdbVar});
        }
        return mtopAbility.f(v5jVar, vqVar, kdbVar);
    }

    public static /* synthetic */ Object ipc$super(MtopAbility mtopAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/mtop/MtopAbility");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
        if (r5 != null) goto L_0x004b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.taobao.tao.remotebusiness.MtopBusiness a(mtopsdk.mtop.domain.MtopRequest r18, tb.v5j r19, tb.kdb r20) {
        /*
            Method dump skipped, instructions count: 1702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.mtop.MtopAbility.a(mtopsdk.mtop.domain.MtopRequest, tb.v5j, tb.kdb):com.taobao.tao.remotebusiness.MtopBusiness");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final MtopRequest b(v5j v5jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("5200cb85", new Object[]{this, v5jVar});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(v5jVar.f29793a);
        mtopRequest.setVersion(v5jVar.b);
        mtopRequest.setNeedEcode(ckf.b(v5jVar.c, Boolean.TRUE));
        Map map = v5jVar.e;
        if (map != null) {
            mtopRequest.setData(new JSONObject(map).toString());
            boolean m = kqu.m(map);
            Map map2 = map;
            if (!m) {
                map2 = null;
            }
            mtopRequest.dataParams = map2;
        }
        return mtopRequest;
    }

    public final ExecuteResult c(h4j h4jVar, vq vqVar, kdb kdbVar) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("154f94e", new Object[]{this, h4jVar, vqVar, kdbVar});
        }
        if (TextUtils.isEmpty(h4jVar.f20405a)) {
            return new ErrorResult("400", "account参数为空", (Map) null, 4, (a07) null);
        }
        if (MtopAccountSiteUtils.getInstanceId(h4jVar.f20405a) != null) {
            z = true;
        } else {
            z = false;
        }
        return new FinishResult(new JSONObject(kotlin.collections.a.k(jpu.a(txq.IS_SUPPORT_KEY, Boolean.valueOf(z)))), null, 2, null);
    }

    public final ExecuteResult d(v5j v5jVar, vq vqVar, kdb kdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("2c8d6942", new Object[]{this, v5jVar, vqVar, kdbVar});
        }
        if (ckf.b(v5jVar.t, Boolean.TRUE)) {
            return prefetchData(v5jVar, vqVar, kdbVar);
        }
        return e(v5jVar, vqVar, kdbVar, false);
    }

    public final ExecuteResult e(v5j v5jVar, vq vqVar, kdb kdbVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b84770c8", new Object[]{this, v5jVar, vqVar, kdbVar, new Boolean(z)});
        }
        MtopRequest b2 = b(v5jVar);
        MtopBusiness a2 = a(b2, v5jVar, kdbVar);
        if (z) {
            a2.prefetchComparator((MtopPrefetch.IPrefetchComparator) new r4j()).prefetch(v5jVar.p, (MtopPrefetch.IPrefetchCallback) f.INSTANCE);
            a2.startRequest();
            return null;
        }
        MtopListener mtopListener = new MtopListener(a2, b2, vqVar, v5jVar, kdbVar);
        a2.registerListener((IRemoteListener) mtopListener);
        a2.startRequest();
        int i = v5jVar.i;
        if (i < 0) {
            v5jVar.i = 30000;
        } else if (i > 60000) {
            v5jVar.i = 60000;
        }
        MegaUtils.z(new e(mtopListener), v5jVar.i);
        return null;
    }

    @Override // tb.hdb
    public ExecuteResult execute(String str, kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b2cd7d0b", new Object[]{this, str, kdbVar, map, vqVar});
        }
        ckf.g(str, "api");
        ckf.g(kdbVar, "context");
        ckf.g(map, "params");
        ckf.g(vqVar, "callback");
        try {
            switch (str.hashCode()) {
                case -1027534271:
                    if (str.equals(API_PREFETCH_DATA)) {
                        a.a(Companion, new c(map, vqVar, kdbVar));
                        return null;
                    }
                    break;
                case 3526536:
                    if (str.equals("send")) {
                        return d(new v5j(map), vqVar, kdbVar);
                    }
                    break;
                case 917836431:
                    if (str.equals(API_ACCOUNT_SITE)) {
                        return c(new h4j(map), vqVar, kdbVar);
                    }
                    break;
                case 1149597401:
                    if (str.equals(API_REQUEST_DATA)) {
                        a.a(Companion, new b(map, vqVar, kdbVar));
                        return null;
                    }
                    break;
                case 1403438831:
                    if (str.equals(API_REQUEST_STREAM)) {
                        a.a(Companion, new d(map, vqVar, kdbVar));
                        return null;
                    }
                    break;
            }
            ErrorResult.a.C0055a aVar = ErrorResult.a.Companion;
            return aVar.a("api " + str + " not found");
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            return new ErrorResult("500", message, (Map) null, 4, (a07) null);
        }
    }

    public final ExecuteResult f(v5j v5jVar, vq vqVar, kdb kdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("3fafa4ec", new Object[]{this, v5jVar, vqVar, kdbVar});
        }
        MtopRequest b2 = b(v5jVar);
        MtopBusiness a2 = a(b2, v5jVar, kdbVar);
        MtopStreamListener mtopStreamListener = new MtopStreamListener(b2, vqVar);
        a2.streamMode(true);
        a2.registerListener((IMtopStreamListener) mtopStreamListener);
        a2.startRequest();
        return null;
    }

    public final ExecuteResult prefetchData(v5j v5jVar, vq vqVar, kdb kdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("9d11b6da", new Object[]{this, v5jVar, vqVar, kdbVar});
        }
        ckf.g(v5jVar, "param");
        ckf.g(vqVar, "callback");
        ckf.g(kdbVar, "abilityContext");
        return e(v5jVar, vqVar, kdbVar, true);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class MtopListener implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final kdb abilityContext;
        private MtopResponse cachedResponse;
        private final vq callback;
        private final AtomicBoolean isFinish = new AtomicBoolean(false);
        private final MtopBusiness mtopBusiness;
        private final MtopRequest mtopRequest;
        private final v5j param;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ MtopResponse b;

            /* compiled from: Taobao */
            /* renamed from: com.alibaba.ability.impl.mtop.MtopAbility$MtopListener$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
            public static final class RunnableC0047a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ JSONObject f1978a;
                public final /* synthetic */ a b;

                public RunnableC0047a(JSONObject jSONObject, a aVar) {
                    this.f1978a = jSONObject;
                    this.b = aVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MtopListener.access$getCallback$p(MtopListener.this).a(new FinishResult(this.f1978a, "onReceiveData"));
                    }
                }
            }

            public a(MtopResponse mtopResponse) {
                this.b = mtopResponse;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                MtopResponse mtopResponse = this.b;
                if (mtopResponse != null) {
                    byte[] bytedata = mtopResponse.getBytedata();
                    ckf.f(bytedata, "response.bytedata");
                    JSONObject parseObject = JSON.parseObject(new String(bytedata, uj3.UTF_8));
                    MtopListener.access$addHeaderForResult(MtopListener.this, this.b, parseObject);
                    MtopListener.access$addStatInfo(MtopListener.this, this.b, parseObject);
                    MegaUtils.A(new RunnableC0047a(parseObject, this), 0L, 2, null);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class b implements s2d {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.s2d
            public void onCallback(ExecuteResult executeResult) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                } else {
                    ckf.g(executeResult, "result");
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class c implements s2d {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.s2d
            public void onCallback(ExecuteResult executeResult) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                } else {
                    ckf.g(executeResult, "result");
                }
            }
        }

        static {
            t2o.a(119537669);
            t2o.a(589299719);
        }

        public MtopListener(MtopBusiness mtopBusiness, MtopRequest mtopRequest, vq vqVar, v5j v5jVar, kdb kdbVar) {
            ckf.g(mtopBusiness, "mtopBusiness");
            ckf.g(mtopRequest, "mtopRequest");
            ckf.g(vqVar, "callback");
            ckf.g(v5jVar, "param");
            ckf.g(kdbVar, "abilityContext");
            this.mtopBusiness = mtopBusiness;
            this.mtopRequest = mtopRequest;
            this.callback = vqVar;
            this.param = v5jVar;
            this.abilityContext = kdbVar;
            showLoading();
        }

        public static final /* synthetic */ void access$addHeaderForResult(MtopListener mtopListener, MtopResponse mtopResponse, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5c4e7d9", new Object[]{mtopListener, mtopResponse, jSONObject});
            } else {
                mtopListener.addHeaderForResult(mtopResponse, jSONObject);
            }
        }

        public static final /* synthetic */ void access$addStatInfo(MtopListener mtopListener, MtopResponse mtopResponse, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a834cb6e", new Object[]{mtopListener, mtopResponse, jSONObject});
            } else {
                mtopListener.addStatInfo(mtopResponse, jSONObject);
            }
        }

        public static final /* synthetic */ vq access$getCallback$p(MtopListener mtopListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (vq) ipChange.ipc$dispatch("e0ca2d9", new Object[]{mtopListener});
            }
            return mtopListener.callback;
        }

        private final void addHeaderForResult(MtopResponse mtopResponse, JSONObject jSONObject) {
            Map<String, List<String>> headerFields;
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9e78f8c", new Object[]{this, mtopResponse, jSONObject});
            } else if (mtopResponse != null && jSONObject != null && (headerFields = mtopResponse.getHeaderFields()) != null) {
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
                    String key = entry.getKey();
                    List<String> value = entry.getValue();
                    if (value != null) {
                        str = TextUtils.join(",", value);
                    } else {
                        str = "";
                    }
                    if (key != null) {
                        jSONObject2.put((JSONObject) key, str);
                    }
                }
                jSONObject.put((JSONObject) "responseHeader", (String) jSONObject2);
            }
        }

        private final void addStatInfo(MtopResponse mtopResponse, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("288e3fa1", new Object[]{this, mtopResponse, jSONObject});
            } else if (mtopResponse != null && jSONObject != null) {
                JSONObject jSONObject2 = new JSONObject();
                MtopStatistics mtopStat = mtopResponse.getMtopStat();
                if (mtopStat != null) {
                    jSONObject2.put((JSONObject) "falcoId", mtopStat.falcoId);
                    jSONObject2.put((JSONObject) "eagleEyeTraceId", mtopStat.eagleEyeTraceId);
                    jSONObject2.put((JSONObject) "isPrefetch", (String) Boolean.valueOf(mtopStat.isPrefetch));
                }
                jSONObject.put((JSONObject) "statInfo", (String) jSONObject2);
            }
        }

        private final void handleErrorResult(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("216aa9c9", new Object[]{this, mtopResponse});
                return;
            }
            hideLoading();
            JSONObject produceErrorResponseJson = produceErrorResponseJson(mtopResponse, this.mtopRequest);
            addHeaderForResult(mtopResponse, produceErrorResponseJson);
            addStatInfo(mtopResponse, produceErrorResponseJson);
            this.callback.a(new FinishResult(produceErrorResponseJson, "onFailure"));
        }

        private final void handleSuccessResult(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf637d44", new Object[]{this, mtopResponse});
                return;
            }
            hideLoading();
            if (ckf.b(this.param.B, Boolean.TRUE)) {
                eji.j(MtopAbility.Companion.b(), new a(mtopResponse), 0L, null, 6, null);
            } else if (mtopResponse != null) {
                byte[] bytedata = mtopResponse.getBytedata();
                ckf.f(bytedata, "response.bytedata");
                JSONObject parseObject = JSON.parseObject(new String(bytedata, uj3.UTF_8));
                addHeaderForResult(mtopResponse, parseObject);
                addStatInfo(mtopResponse, parseObject);
                this.callback.a(new FinishResult(parseObject, "onReceiveData"));
            }
        }

        private final void hideLoading() {
            AbilityHubAdapter adapter;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aee4b521", new Object[]{this});
                return;
            }
            Map<String, ? extends Object> map = this.param.u;
            if (map != null && (adapter = this.abilityContext.l().getAdapter()) != null) {
                adapter.z("loading", "hide", this.abilityContext, map, new b());
            }
        }

        private final void showLoading() {
            AbilityHubAdapter adapter;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73936486", new Object[]{this});
                return;
            }
            Map<String, ? extends Object> map = this.param.u;
            if (map != null && (adapter = this.abilityContext.l().getAdapter()) != null) {
                adapter.z("loading", "show", this.abilityContext, map, new c());
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else if (this.isFinish.compareAndSet(false, true)) {
                handleErrorResult(mtopResponse);
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            } else if (this.isFinish.compareAndSet(false, true)) {
                handleSuccessResult(mtopResponse);
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else if (this.isFinish.compareAndSet(false, true)) {
                handleErrorResult(mtopResponse);
            }
        }

        public final void onTimeOut() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("47459e9", new Object[]{this});
            } else if (this.isFinish.compareAndSet(false, true)) {
                this.mtopBusiness.cancelRequest();
                try {
                    MtopResponse mtopResponse = this.cachedResponse;
                    if (mtopResponse != null) {
                        handleSuccessResult(mtopResponse);
                    } else {
                        handleErrorResult(null);
                    }
                } catch (Exception unused) {
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final com.alibaba.fastjson.JSONObject produceErrorResponseJson(mtopsdk.mtop.domain.MtopResponse r8, mtopsdk.mtop.domain.MtopRequest r9) {
            /*
                r7 = this;
                r0 = 1
                r1 = 0
                r2 = 2
                com.android.alibaba.ip.runtime.IpChange r3 = com.alibaba.ability.impl.mtop.MtopAbility.MtopListener.$ipChange
                boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r4 == 0) goto L_0x001b
                java.lang.String r4 = "7efc243e"
                r5 = 3
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r5[r1] = r7
                r5[r0] = r8
                r5[r2] = r9
                java.lang.Object r8 = r3.ipc$dispatch(r4, r5)
                com.alibaba.fastjson.JSONObject r8 = (com.alibaba.fastjson.JSONObject) r8
                return r8
            L_0x001b:
                if (r8 == 0) goto L_0x0039
                byte[] r3 = r8.getBytedata()
                if (r3 == 0) goto L_0x0039
                byte[] r3 = r8.getBytedata()     // Catch: all -> 0x0039
                java.lang.String r4 = "mtopResponse.bytedata"
                tb.ckf.f(r3, r4)     // Catch: all -> 0x0039
                java.lang.String r4 = new java.lang.String     // Catch: all -> 0x0039
                java.nio.charset.Charset r5 = tb.uj3.UTF_8     // Catch: all -> 0x0039
                r4.<init>(r3, r5)     // Catch: all -> 0x0039
                com.alibaba.fastjson.JSONObject r3 = com.alibaba.fastjson.JSON.parseObject(r4)     // Catch: all -> 0x0039
                goto L_0x003a
            L_0x0039:
                r3 = 0
            L_0x003a:
                if (r3 != 0) goto L_0x00a0
                com.alibaba.fastjson.JSONObject r3 = new com.alibaba.fastjson.JSONObject
                r3.<init>()
                java.lang.String r4 = ""
                if (r9 == 0) goto L_0x004a
                java.lang.String r5 = r9.getApiName()
                goto L_0x004b
            L_0x004a:
                r5 = r4
            L_0x004b:
                java.lang.String r6 = "api"
                r3.put(r6, r5)
                if (r9 == 0) goto L_0x0056
                java.lang.String r4 = r9.getVersion()
            L_0x0056:
                java.lang.String r9 = "v"
                r3.put(r9, r4)
                com.alibaba.fastjson.JSONObject r9 = new com.alibaba.fastjson.JSONObject
                r9.<init>()
                java.lang.String r4 = "data"
                r3.put(r4, r9)
                com.alibaba.fastjson.JSONArray r9 = new com.alibaba.fastjson.JSONArray
                r9.<init>()
                java.lang.String r4 = "ret"
                r3.put(r4, r9)
                if (r8 != 0) goto L_0x0079
                java.lang.String r4 = "FAIL_TIME_OUT"
                java.lang.String r5 = "请求超时"
                goto L_0x008d
            L_0x0079:
                java.lang.String r4 = r8.getRetCode()
                if (r4 == 0) goto L_0x0088
                java.lang.String r4 = r8.getRetCode()
                java.lang.String r5 = r8.getRetMsg()
                goto L_0x008d
            L_0x0088:
                java.lang.String r4 = "FAIL_SYS_REQUEST_EXPIRED"
                java.lang.String r5 = "请求失效"
            L_0x008d:
                java.lang.Object[] r6 = new java.lang.Object[r2]
                r6[r1] = r4
                r6[r0] = r5
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r6, r2)
                java.lang.String r1 = "%s::%s"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                r9.add(r0)
            L_0x00a0:
                if (r8 == 0) goto L_0x00e2
                com.alibaba.fastjson.JSONObject r9 = new com.alibaba.fastjson.JSONObject
                r9.<init>()
                int r0 = r8.getResponseCode()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.String r1 = "responseCode"
                r9.put(r1, r0)
                java.lang.String r0 = "mappingCode"
                java.lang.String r1 = r8.getMappingCode()
                r9.put(r0, r1)
                java.lang.String r0 = "errorMsg"
                java.lang.String r1 = r8.getRetMsg()
                r9.put(r0, r1)
                java.lang.String r0 = "retCode"
                java.lang.String r1 = r8.getRetCode()
                r9.put(r0, r1)
                java.lang.String r0 = "apiName"
                java.lang.String r8 = r8.getApi()
                r9.put(r0, r8)
                java.lang.String r8 = "errorInfo"
                r3.put(r8, r9)
            L_0x00e2:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.mtop.MtopAbility.MtopListener.produceErrorResponseJson(mtopsdk.mtop.domain.MtopResponse, mtopsdk.mtop.domain.MtopRequest):com.alibaba.fastjson.JSONObject");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class MtopStreamListener implements IMtopStreamListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final vq callback;
        private final MtopRequest mtopRequest;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ l7j b;

            /* compiled from: Taobao */
            /* renamed from: com.alibaba.ability.impl.mtop.MtopAbility$MtopStreamListener$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
            public static final class RunnableC0048a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;
                public final /* synthetic */ JSONObject b;

                public RunnableC0048a(JSONObject jSONObject) {
                    this.b = jSONObject;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MtopStreamListener.access$getCallback$p(MtopStreamListener.this).a(new FinishResult(this.b, "onFinish"));
                    }
                }
            }

            public a(l7j l7jVar) {
                this.b = l7jVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Map<String, List<String>> map;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                MtopStreamListener mtopStreamListener = MtopStreamListener.this;
                JSONObject access$produceErrorResponseJson = MtopStreamListener.access$produceErrorResponseJson(mtopStreamListener, MtopStreamListener.access$getMtopRequest$p(mtopStreamListener), this.b);
                MtopStreamListener mtopStreamListener2 = MtopStreamListener.this;
                l7j l7jVar = this.b;
                if (l7jVar != null) {
                    map = l7jVar.f25875a;
                } else {
                    map = null;
                }
                MtopStreamListener.access$addHeaderForResult(mtopStreamListener2, map, access$produceErrorResponseJson);
                MegaUtils.A(new RunnableC0048a(access$produceErrorResponseJson), 0L, 2, null);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ m7j b;

            /* compiled from: Taobao */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
            public static final class a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ JSONObject f1982a;
                public final /* synthetic */ b b;

                public a(JSONObject jSONObject, b bVar) {
                    this.f1982a = jSONObject;
                    this.b = bVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MtopStreamListener.access$getCallback$p(MtopStreamListener.this).a(new FinishResult(this.f1982a, "onReceiveData"));
                    }
                }
            }

            public b(m7j m7jVar) {
                this.b = m7jVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                m7j m7jVar = this.b;
                if (m7jVar != null) {
                    byte[] bArr = m7jVar.e;
                    ckf.f(bArr, "response.bytedata");
                    JSONObject parseObject = JSON.parseObject(new String(bArr, uj3.UTF_8));
                    MtopStreamListener.access$addHeaderForResult(MtopStreamListener.this, this.b.g, parseObject);
                    ckf.f(parseObject, "result");
                    parseObject.put((JSONObject) "currentId", this.b.f);
                    MegaUtils.A(new a(parseObject, this), 0L, 2, null);
                }
            }
        }

        static {
            t2o.a(119537674);
            t2o.a(589299782);
        }

        public MtopStreamListener(MtopRequest mtopRequest, vq vqVar) {
            ckf.g(mtopRequest, "mtopRequest");
            ckf.g(vqVar, "callback");
            this.mtopRequest = mtopRequest;
            this.callback = vqVar;
        }

        public static final /* synthetic */ void access$addHeaderForResult(MtopStreamListener mtopStreamListener, Map map, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b02309d", new Object[]{mtopStreamListener, map, jSONObject});
            } else {
                mtopStreamListener.addHeaderForResult(map, jSONObject);
            }
        }

        public static final /* synthetic */ vq access$getCallback$p(MtopStreamListener mtopStreamListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (vq) ipChange.ipc$dispatch("30049c39", new Object[]{mtopStreamListener});
            }
            return mtopStreamListener.callback;
        }

        public static final /* synthetic */ MtopRequest access$getMtopRequest$p(MtopStreamListener mtopStreamListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MtopRequest) ipChange.ipc$dispatch("d51fb722", new Object[]{mtopStreamListener});
            }
            return mtopStreamListener.mtopRequest;
        }

        public static final /* synthetic */ JSONObject access$produceErrorResponseJson(MtopStreamListener mtopStreamListener, MtopRequest mtopRequest, p4j p4jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("af9cddf", new Object[]{mtopStreamListener, mtopRequest, p4jVar});
            }
            return mtopStreamListener.produceErrorResponseJson(mtopRequest, p4jVar);
        }

        private final void addHeaderForResult(Map<String, ? extends List<String>> map, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88f53dea", new Object[]{this, map, jSONObject});
            } else if (map != null && jSONObject != null) {
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry<String, ? extends List<String>> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String join = TextUtils.join(",", (List) entry.getValue());
                    if (key != null) {
                        jSONObject2.put((JSONObject) key, join);
                    }
                }
                jSONObject.put((JSONObject) "responseHeader", (String) jSONObject2);
            }
        }

        @Override // com.taobao.tao.stream.IMtopStreamListener
        public void onError(k7j k7jVar, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9471629", new Object[]{this, k7jVar, new Integer(i), obj});
                return;
            }
            JSONObject produceErrorResponseJson = produceErrorResponseJson(this.mtopRequest, k7jVar);
            addHeaderForResult(k7jVar != null ? k7jVar.f25875a : null, produceErrorResponseJson);
            this.callback.a(new FinishResult(produceErrorResponseJson, "onFailure"));
        }

        @Override // com.taobao.tao.stream.IMtopStreamListener
        public void onFinish(l7j l7jVar, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad3ac67", new Object[]{this, l7jVar, new Integer(i), obj});
            } else {
                eji.j(MtopAbility.Companion.c(), new a(l7jVar), 0L, null, 6, null);
            }
        }

        @Override // com.taobao.tao.stream.IMtopStreamListener
        public void onReceiveData(m7j m7jVar, BaseOutDo baseOutDo, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99d309f1", new Object[]{this, m7jVar, baseOutDo, new Integer(i), obj});
            } else {
                eji.j(MtopAbility.Companion.c(), new b(m7jVar), 0L, null, 6, null);
            }
        }

        private final JSONObject produceErrorResponseJson(MtopRequest mtopRequest, p4j p4jVar) {
            String str;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("a906076c", new Object[]{this, mtopRequest, p4jVar});
            }
            JSONObject jSONObject = new JSONObject();
            String str3 = "";
            jSONObject.put((JSONObject) "api", mtopRequest != null ? mtopRequest.getApiName() : str3);
            if (mtopRequest != null) {
                str3 = mtopRequest.getVersion();
            }
            jSONObject.put((JSONObject) "v", str3);
            jSONObject.put((JSONObject) "data", (String) new JSONObject());
            JSONArray jSONArray = new JSONArray();
            jSONObject.put((JSONObject) rb.RESULT_KEY, (String) jSONArray);
            if (p4jVar != null) {
                str2 = p4jVar.b;
                str = p4jVar.c;
            } else {
                str2 = "FAIL_SYS_REQUEST_EXPIRED";
                str = "请求失效";
            }
            jSONArray.add(String.format("%s::%s", Arrays.copyOf(new Object[]{str2, str}, 2)));
            return jSONObject;
        }
    }

    static {
        t2o.a(119537666);
    }
}
