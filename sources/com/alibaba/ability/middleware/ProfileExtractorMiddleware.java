package com.alibaba.ability.middleware;

import android.text.TextUtils;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import java.util.Map;
import java.util.Set;
import tb.a07;
import tb.boc;
import tb.cjf;
import tb.ckf;
import tb.dud;
import tb.eji;
import tb.i04;
import tb.jfp;
import tb.jpu;
import tb.kdb;
import tb.kfp;
import tb.ldb;
import tb.ndb;
import tb.njg;
import tb.ovc;
import tb.pdb;
import tb.pl4;
import tb.s2d;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ProfileExtractorMiddleware implements pdb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Set<String> f2074a;
    public static final Set<String> b;
    public static final a Companion = new a(null);
    public static final Set<String> c = jfp.c("status");
    public static final njg d = kotlin.a.b(ProfileExtractorMiddleware$Companion$abilityTraceBetaPoint$2.INSTANCE);
    public static final njg e = kotlin.a.b(ProfileExtractorMiddleware$Companion$abilityTracePoint$2.INSTANCE);
    public static final njg f = kotlin.a.b(ProfileExtractorMiddleware$Companion$abilityTraceExceptionPoint$2.INSTANCE);
    public static final njg g = kotlin.a.b(ProfileExtractorMiddleware$Companion$abilityCallbackExceptionPoint$2.INSTANCE);
    public static final eji h = new eji("profileExtractor", 1);
    public static final njg i = kotlin.a.b(ProfileExtractorMiddleware$Companion$isGrayVersion$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(144703580);
        }

        public a() {
        }

        public static final /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("453fcbd8", new Object[]{aVar});
            }
            return aVar.f();
        }

        public static final /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ec6009ed", new Object[]{aVar});
            }
            return aVar.g();
        }

        public static final /* synthetic */ String c(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b6d1beb0", new Object[]{aVar});
            }
            return aVar.h();
        }

        public static final /* synthetic */ String d(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4947817d", new Object[]{aVar});
            }
            return aVar.i();
        }

        public static final /* synthetic */ boolean e(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d157827b", new Object[]{aVar})).booleanValue();
            }
            return aVar.k();
        }

        public final String f() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("24964aff", new Object[]{this});
            } else {
                value = ProfileExtractorMiddleware.a().getValue();
            }
            return (String) value;
        }

        public final String g() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("b0c9a28a", new Object[]{this});
            } else {
                value = ProfileExtractorMiddleware.b().getValue();
            }
            return (String) value;
        }

        public final String h() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("56904a7", new Object[]{this});
            } else {
                value = ProfileExtractorMiddleware.c().getValue();
            }
            return (String) value;
        }

        public final String i() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("28efacfa", new Object[]{this});
            } else {
                value = ProfileExtractorMiddleware.d().getValue();
            }
            return (String) value;
        }

        public final eji j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (eji) ipChange.ipc$dispatch("9dd5e302", new Object[]{this});
            }
            return ProfileExtractorMiddleware.g();
        }

        public final boolean k() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("79d7b876", new Object[]{this});
            } else {
                value = ProfileExtractorMiddleware.i().getValue();
            }
            return ((Boolean) value).booleanValue();
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final s2d f2075a;
        public final c b;

        static {
            t2o.a(144703586);
            t2o.a(144703517);
        }

        public b(s2d s2dVar, c cVar) {
            ckf.g(s2dVar, "callback");
            ckf.g(cVar, "profileExtractor");
            this.f2075a = s2dVar;
            this.b = cVar;
        }

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                return;
            }
            ckf.g(executeResult, "result");
            this.f2075a.onCallback(executeResult);
            eji j = ProfileExtractorMiddleware.Companion.j();
            c cVar = this.b;
            cVar.f(executeResult);
            cVar.d(true);
            cVar.e(System.currentTimeMillis());
            xhv xhvVar = xhv.INSTANCE;
            eji.j(j, cVar, 0L, null, 6, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private boolean f2076a;
        private ExecuteResult b;
        private final String c;
        private final String d;
        private final kdb e;
        private final Map<String, Object> f;
        private long g;
        private long h;

        static {
            t2o.a(144703587);
        }

        public c(String str, String str2, kdb kdbVar, Map<String, ? extends Object> map, long j, long j2) {
            ckf.g(str, MUSMonitor.MODULE_DIM_ABILITY);
            ckf.g(str2, "api");
            ckf.g(kdbVar, "context");
            ckf.g(map, "params");
            this.c = str;
            this.d = str2;
            this.e = kdbVar;
            this.f = map;
            this.g = j;
            this.h = j2;
        }

        public final long a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("250d18d", new Object[]{this})).longValue();
            }
            return this.h;
        }

        public final ExecuteResult b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ExecuteResult) ipChange.ipc$dispatch("7f02ba25", new Object[]{this});
            }
            return this.b;
        }

        public final boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("512cec9a", new Object[]{this})).booleanValue();
            }
            return this.f2076a;
        }

        public final void d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a36824c6", new Object[]{this, new Boolean(z)});
            } else {
                this.f2076a = z;
            }
        }

        public final void e(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e12d357", new Object[]{this, new Long(j)});
            } else {
                this.h = j;
            }
        }

        public final void f(ExecuteResult executeResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d83f420f", new Object[]{this, executeResult});
            } else {
                this.b = executeResult;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String str = (String) this.e.m(pl4.KEY_PAGE_ID);
            if (str == null) {
                str = "";
            }
            Map<String, Object> f = this.e.f();
            String str2 = "unknown";
            if (f == null || (obj = f.get("url")) == null) {
                obj = str2;
            }
            ldb l = this.e.l();
            String namespace = TextUtils.isEmpty(l.getNamespace()) ? str2 : l.getNamespace();
            if (!TextUtils.isEmpty(l.getBusinessID())) {
                str2 = l.getBusinessID();
            }
            dud j = cjf.INSTANCE.j();
            if (j != null && j.a()) {
                g(str, namespace, str2, obj);
            }
            ExecuteResult executeResult = this.b;
            if (executeResult != null) {
                h(executeResult, namespace, str2, str);
                i(executeResult, namespace, str2, obj.toString());
            }
        }

        private final void i(ExecuteResult executeResult, String str, String str2, String str3) {
            Object obj;
            ovc h;
            ovc h2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("494598d2", new Object[]{this, executeResult, str, str2, str3});
                return;
            }
            Map<String, Object> f = this.e.f();
            if (f == null || (obj = f.get("syncCallForceMain")) == null) {
                obj = Boolean.FALSE;
            }
            Map<String, String> k = kotlin.collections.a.k(jpu.a("namespace", str), jpu.a("businessId", str2), jpu.a(MUSMonitor.MODULE_DIM_ABILITY, this.c), jpu.a("api", this.d), jpu.a("url", str3), jpu.a("syncCallForceMain", obj.toString()));
            int statusCode = executeResult.getStatusCode();
            k.put("statusCode", String.valueOf(statusCode));
            if (executeResult instanceof ErrorResult) {
                ErrorResult errorResult = (ErrorResult) executeResult;
                k.put("errorCode", errorResult.getCode());
                k.put("errorMessage", errorResult.getMsg());
            }
            a aVar = ProfileExtractorMiddleware.Companion;
            k.put("isBetaVersion", String.valueOf(a.e(aVar)));
            Map<String, Double> k2 = kotlin.collections.a.k(jpu.a("status", Double.valueOf(statusCode > 99 ? 0 : 1)));
            if (this.f2076a) {
                if (statusCode > 99 && (h2 = cjf.INSTANCE.h()) != null) {
                    h2.commitStat("Megability", a.a(aVar), k, k2);
                }
            } else if (a.e(aVar)) {
                ovc h3 = cjf.INSTANCE.h();
                if (h3 != null) {
                    h3.commitStat("Megability", a.b(aVar), k, k2);
                }
            } else {
                if (statusCode > 99 && (h = cjf.INSTANCE.h()) != null) {
                    h.commitStat("Megability", a.c(aVar), k, k2);
                }
                ovc h4 = cjf.INSTANCE.h();
                if (h4 != null) {
                    h4.commitStat("Megability", a.d(aVar), k, k2);
                }
            }
        }

        private final void h(ExecuteResult executeResult, String str, String str2, String str3) {
            String str4;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe1a9547", new Object[]{this, executeResult, str, str2, str3});
                return;
            }
            JSONObject jSONObject = new JSONObject(kotlin.collections.a.k(jpu.a("statusCode", Integer.valueOf(executeResult.getStatusCode())), jpu.a("type", executeResult.getType())));
            if (this.f2076a) {
                str4 = "callback";
            } else {
                jSONObject.put((JSONObject) "namespace", str);
                jSONObject.put((JSONObject) "businessId", str2);
                jSONObject.put((JSONObject) "startTime", String.valueOf(this.g));
                jSONObject.put((JSONObject) "name", this.c);
                jSONObject.put((JSONObject) "api", this.d);
                dud j = cjf.INSTANCE.j();
                if (j != null && j.b()) {
                    jSONObject.put((JSONObject) "params", (String) this.f);
                }
                str4 = "invoke";
            }
            if (executeResult instanceof ErrorResult) {
                ErrorResult errorResult = (ErrorResult) executeResult;
                jSONObject.put((JSONObject) "errorCode", errorResult.getCode());
                jSONObject.put((JSONObject) "errorMessage", errorResult.getMsg());
            }
            cjf cjfVar = cjf.INSTANCE;
            dud j2 = cjfVar.j();
            if (j2 != null && j2.a()) {
                jSONObject.put((JSONObject) "result", (String) executeResult.toFormattedData());
            }
            int i = executeResult.getStatusCode() <= 99 ? 3 : 1;
            boc f = cjfVar.f();
            if (f != null) {
                f.a(i, "Megability/Invoke", str4, String.valueOf(this.g), str3, jSONObject);
            }
        }

        private final void g(String str, String str2, String str3, Object obj) {
            Map<String, Object> map;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4d8baa27", new Object[]{this, str, str2, str3, obj});
                return;
            }
            String str4 = this.c + '.' + this.d;
            String str5 = (String) this.e.m("callType");
            if (str5 == null) {
                str5 = "";
            }
            Map k = kotlin.collections.a.k(jpu.a("url", obj), jpu.a(pl4.KEY_PAGE_ID, str), jpu.a("callType", str5), jpu.a("namespace", str2), jpu.a("businessId", str3));
            ExecuteResult executeResult = this.b;
            if (executeResult == null || (map = executeResult.toFormattedData()) == null) {
                map = kotlin.collections.a.h();
            }
            JSONObject jSONObject = new JSONObject(kotlin.collections.a.k(jpu.a("api", str4), jpu.a("startTime", Long.valueOf(this.g)), jpu.a("endTime", Long.valueOf(this.h)), jpu.a("params", this.f), jpu.a("result", map), jpu.a("extraInfo", k)));
            boc f = cjf.INSTANCE.f();
            if (f != null) {
                f.a(5, "AppDevTools/Megability", str4, String.valueOf(this.g), null, jSONObject);
            }
        }
    }

    public static final /* synthetic */ njg a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("d1dced6d", new Object[0]);
        }
        return g;
    }

    public static final /* synthetic */ njg b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("95336bb8", new Object[0]);
        }
        return d;
    }

    public static final /* synthetic */ njg c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("19232795", new Object[0]);
        }
        return f;
    }

    public static final /* synthetic */ njg d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("d657b228", new Object[0]);
        }
        return e;
    }

    public static final /* synthetic */ Set e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("6bf2fd67", new Object[0]);
        }
        return b;
    }

    public static final /* synthetic */ Set f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("500c795c", new Object[0]);
        }
        return c;
    }

    public static final /* synthetic */ eji g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eji) ipChange.ipc$dispatch("2d8ed0e5", new Object[0]);
        }
        return h;
    }

    public static final /* synthetic */ Set h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("79b59f0d", new Object[0]);
        }
        return f2074a;
    }

    public static final /* synthetic */ njg i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("c03e571c", new Object[0]);
        }
        return i;
    }

    static {
        t2o.a(144703579);
        t2o.a(144703573);
        Set<String> h2 = kfp.h("namespace", "businessId", MUSMonitor.MODULE_DIM_ABILITY, "api", "url", "syncCallForceMain", "statusCode", "isBetaVersion");
        f2074a = h2;
        Set<String> F0 = i04.F0(h2);
        F0.add("errorCode");
        F0.add("errorMessage");
        b = F0;
    }

    @Override // tb.pdb
    public ExecuteResult invoke(String str, String str2, kdb kdbVar, Map<String, ? extends Object> map, s2d s2dVar, ndb ndbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("589945a3", new Object[]{this, str, str2, kdbVar, map, s2dVar, ndbVar});
        }
        ckf.g(str, MUSMonitor.MODULE_DIM_ABILITY);
        ckf.g(str2, "api");
        ckf.g(kdbVar, "context");
        ckf.g(map, "params");
        ckf.g(s2dVar, "callback");
        ckf.g(ndbVar, "next");
        long currentTimeMillis = System.currentTimeMillis();
        ExecuteResult a2 = ndbVar.a(str, str2, kdbVar, map, new b(s2dVar, new c(str, str2, kdbVar, map, currentTimeMillis, -1L)));
        long currentTimeMillis2 = System.currentTimeMillis();
        eji ejiVar = h;
        c cVar = new c(str, str2, kdbVar, map, currentTimeMillis, currentTimeMillis2);
        cVar.f(a2);
        xhv xhvVar = xhv.INSTANCE;
        eji.j(ejiVar, cVar, 0L, null, 6, null);
        return a2;
    }
}
