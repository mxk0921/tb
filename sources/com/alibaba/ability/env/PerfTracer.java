package com.alibaba.ability.env;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.a07;
import tb.ckf;
import tb.eji;
import tb.iih;
import tb.njg;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class PerfTracer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Companion Companion = new Companion(null);
    public static final njg p = kotlin.a.b(PerfTracer$Companion$performanceTracePoint$2.INSTANCE);
    public static final eji q = new eji("mega_perf_stat", 1);
    public static String r = "";
    public static final long s = System.currentTimeMillis() - (System.nanoTime() / 1000000);
    public static final njg t = kotlin.a.b(PerfTracer$Companion$doubleFormat$2.INSTANCE);

    /* renamed from: a  reason: collision with root package name */
    public String f1875a;
    public Long b;
    public Long c;
    public Long d;
    public Long e;
    public Long f;
    public Long g;
    public Long h;
    public Long i;
    public boolean j;
    public String k;
    public String l;
    public String m;
    public String n;
    public final Map<String, String> o = new LinkedHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class Companion {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ JSONArray f1876a;
            public final /* synthetic */ ConcurrentHashMap b;

            public a(JSONArray jSONArray, ConcurrentHashMap concurrentHashMap) {
                this.f1876a = jSONArray;
                this.b = concurrentHashMap;
            }

            @Override // java.lang.Runnable
            public final void run() {
                JSONObject jSONObject;
                String string;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                for (Object obj : this.f1876a) {
                    if ((obj instanceof JSONObject) && (string = (jSONObject = (JSONObject) obj).getString("traceID")) != null) {
                        PerfTracer perfTracer = (PerfTracer) this.b.remove(string);
                        Long l = jSONObject.getLong("startTime");
                        Long l2 = jSONObject.getLong("endTime");
                        if (!(perfTracer == null || l == null || l2 == null || perfTracer.v())) {
                            perfTracer.D(l);
                            perfTracer.B(l2);
                            Companion.b(PerfTracer.Companion, perfTracer);
                        }
                    }
                }
            }
        }

        static {
            t2o.a(144703529);
        }

        public Companion() {
        }

        public static final /* synthetic */ DecimalFormat a(Companion companion) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DecimalFormat) ipChange.ipc$dispatch("5d90d438", new Object[]{companion});
            }
            return companion.d();
        }

        public static final /* synthetic */ void b(Companion companion, PerfTracer perfTracer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("78c5a322", new Object[]{companion, perfTracer});
            } else {
                companion.f(perfTracer);
            }
        }

        public final void c(JSONArray jSONArray, ConcurrentHashMap<String, PerfTracer> concurrentHashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bfa013da", new Object[]{this, jSONArray, concurrentHashMap});
                return;
            }
            ckf.g(jSONArray, "tracerList");
            ckf.g(concurrentHashMap, "tracerCache");
            eji.j(PerfTracer.f(), new a(jSONArray, concurrentHashMap), 0L, null, 6, null);
        }

        public final DecimalFormat d() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("c7e01e83", new Object[]{this});
            } else {
                value = PerfTracer.d().getValue();
            }
            return (DecimalFormat) value;
        }

        public final String e() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("1cea0634", new Object[]{this});
            } else {
                value = PerfTracer.e().getValue();
            }
            return (String) value;
        }

        public /* synthetic */ Companion(a07 a07Var) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:44:0x01b4  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0200  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0212  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0223  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0249 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:69:0x027e A[LOOP:0: B:67:0x0278->B:69:0x027e, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0308  */
        /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void f(com.alibaba.ability.env.PerfTracer r30) {
            /*
                Method dump skipped, instructions count: 787
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.env.PerfTracer.Companion.f(com.alibaba.ability.env.PerfTracer):void");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                Companion.b(PerfTracer.Companion, PerfTracer.this);
            }
        }
    }

    public static final /* synthetic */ String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e8ec8e0", new Object[0]);
        }
        return r;
    }

    public static final /* synthetic */ njg d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("52a70c09", new Object[0]);
        }
        return t;
    }

    public static final /* synthetic */ njg e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("f28cb1e2", new Object[0]);
        }
        return p;
    }

    public static final /* synthetic */ eji f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eji) ipChange.ipc$dispatch("10757860", new Object[0]);
        }
        return q;
    }

    public static final /* synthetic */ long g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0f31b4c", new Object[0])).longValue();
        }
        return s;
    }

    public static final /* synthetic */ void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4167496", new Object[]{str});
        } else {
            r = str;
        }
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46467277", new Object[]{this});
        } else {
            this.f = Long.valueOf(System.nanoTime());
        }
    }

    public final void B(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98bc8b68", new Object[]{this, l});
        } else {
            this.c = l;
        }
    }

    public final void C(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b201620b", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public final void D(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7da2983d", new Object[]{this, l});
        } else {
            this.b = l;
        }
    }

    public final void E(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d10b21f3", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "key");
        ckf.g(str2, "value");
        this.o.put(str, str2);
    }

    public final PerfTracer F(String str, String str2, Map<String, ? extends Object> map, String str3, String str4, ConcurrentHashMap<String, PerfTracer> concurrentHashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PerfTracer) ipChange.ipc$dispatch("99f406db", new Object[]{this, str, str2, map, str3, str4, concurrentHashMap});
        }
        ckf.g(str, MUSMonitor.MODULE_DIM_ABILITY);
        ckf.g(str2, "api");
        ckf.g(str3, "bizName");
        ckf.g(str4, "callType");
        ckf.g(concurrentHashMap, "logCache");
        this.d = Long.valueOf(System.nanoTime());
        this.k = str;
        this.l = str2;
        this.n = str4;
        this.m = str3;
        if (map != null) {
            try {
                Object obj = map.get("__mega_context__");
                Object obj2 = null;
                if (!(obj instanceof JSONObject)) {
                    obj = null;
                }
                JSONObject jSONObject = (JSONObject) obj;
                Object obj3 = jSONObject != null ? jSONObject.get("trace") : null;
                if (obj3 instanceof JSONObject) {
                    obj2 = obj3;
                }
                JSONObject jSONObject2 = (JSONObject) obj2;
                if (jSONObject2 != null) {
                    String string = jSONObject2.getString("traceID");
                    if (string == null) {
                        string = jSONObject2.getString("traceId");
                    }
                    this.f1875a = string;
                    this.b = jSONObject2.getLong("startTime");
                }
            } catch (Exception unused) {
                iih.INSTANCE.a("Megability/Internal", "PerfTracer traceID parse err: " + map);
            }
        }
        String str5 = this.f1875a;
        if (str5 != null) {
            concurrentHashMap.put(str5, this);
        }
        return this;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a7b3464", new Object[]{this});
        } else {
            this.i = Long.valueOf(System.nanoTime());
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("302be1df", new Object[]{this});
        } else {
            this.h = Long.valueOf(System.nanoTime());
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0327849", new Object[]{this});
            return;
        }
        this.e = Long.valueOf(System.nanoTime());
        if (this.f1875a == null) {
            j(0L);
        }
    }

    public final void j(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aee168c", new Object[]{this, new Long(j)});
            return;
        }
        this.c = Long.valueOf(j);
        if (this.d != null && !this.j) {
            eji.j(q, new a(), 0L, null, 6, null);
        }
    }

    public final String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d275b609", new Object[]{this});
        }
        return this.k;
    }

    public final Long l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("bb01bdde", new Object[]{this});
        }
        return this.i;
    }

    public final Long m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("78639605", new Object[]{this});
        }
        return this.h;
    }

    public final Long n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("52e4943", new Object[]{this});
        }
        return this.e;
    }

    public final Long o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("30758a00", new Object[]{this});
        }
        return this.d;
    }

    public final String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("270a1bf9", new Object[]{this});
        }
        return this.l;
    }

    public final String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df9c941d", new Object[]{this});
        }
        return this.m;
    }

    public final String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3c431c3", new Object[]{this});
        }
        return this.n;
    }

    public final Long s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("dd47cc0", new Object[]{this});
        }
        return this.c;
    }

    public final Long t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("b2a19372", new Object[]{this});
        }
        return this.g;
    }

    public final Long u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("a168bdf1", new Object[]{this});
        }
        return this.f;
    }

    public final boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca2aa5e1", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    public final Long w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("eeac72e3", new Object[]{this});
        }
        return this.b;
    }

    public final Map<String, String> x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("aabddf1", new Object[]{this});
        }
        return this.o;
    }

    public final String y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9afc202f", new Object[]{this});
        }
        return this.f1875a;
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27b2b6cc", new Object[]{this});
        } else {
            this.g = Long.valueOf(System.nanoTime());
        }
    }

    static {
        t2o.a(144703528);
    }
}
