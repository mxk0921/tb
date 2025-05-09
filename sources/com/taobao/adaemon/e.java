package com.taobao.adaemon;

import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.evo.internal.database.ExperimentDO;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.e;
import java.text.SimpleDateFormat;
import java.util.Date;
import mtopsdk.mtop.intf.MtopPrefetch;
import tb.bjo;
import tb.c71;
import tb.h5d;
import tb.mf;
import tb.pg1;
import tb.rb;
import tb.s55;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class e {
    public static final String MODULE_NAME = "Adaemon";
    public static final String POINT_PROC_LAUNCHER = "channel_launcher";

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f6147a;
    public static final String b = "fully_point";
    public static final String c = "start_proc";
    public static final String d = "app_list";
    public static final String e = "mem_art";
    public static final String f = "cpu_perf";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int TYPE_BEFORE_KILL = 2;
        public static final int TYPE_BG = 1;
        public static final int TYPE_DEEP_BG = 3;
        public static final int TYPE_START = 0;
        public static boolean o = false;

        /* renamed from: a  reason: collision with root package name */
        public final String f6149a;
        public int b;
        public boolean c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public float j;
        public int k;
        public int l;
        public int m;
        public int n;

        static {
            t2o.a(349175870);
        }

        public c(String str) {
            this.f6149a = str;
        }

        public static /* synthetic */ boolean a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c67149f8", new Object[]{cVar})).booleanValue();
            }
            return cVar.c();
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
            } else if (e.f6147a) {
                mf.j(new a());
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "[ProcessMemStat]process=" + this.f6149a + ",type=" + this.b + ",restarted=" + this.c + ",useMem=" + this.d + ",privateClean=" + this.f + ",privateDirty=" + this.g + ",javaHeap=" + this.h + ",nativeHeap=" + this.i + ",currentMem=" + this.e + ",javaProportion=" + this.j + ",summaryCode=" + this.k + ",summaryStack=" + this.l + ",summaryPrivateOther=" + this.m + ",summarySystem=" + this.n;
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (c.a(c.this)) {
                    s55.h("StatMonitor", "commit", null, "v", c.this.toString());
                    try {
                        DimensionValueSet create = DimensionValueSet.create();
                        create.setValue("process", c.this.f6149a);
                        create.setValue("type", String.valueOf(c.this.b));
                        create.setValue("restarted", String.valueOf(c.this.c ? 1 : 0));
                        create.setValue("bgType", "0");
                        MeasureValueSet create2 = MeasureValueSet.create();
                        create2.setValue("useMem", c.this.d);
                        create2.setValue("currentMem", c.this.e);
                        create2.setValue("privateClean", c.this.f);
                        create2.setValue("privateDirty", c.this.g);
                        create2.setValue("javaHeap", c.this.h);
                        create2.setValue(bjo.NATIVE_HEAP, c.this.i);
                        create2.setValue("javaProportion", c.this.j);
                        create2.setValue("summaryCode", c.this.k);
                        create2.setValue("summaryStack", c.this.l);
                        create2.setValue("summaryPrivateOther", c.this.m);
                        create2.setValue("summarySystem", c.this.n);
                        AppMonitor.Stat.commit(e.MODULE_NAME, "processMemStat", create, create2);
                    } catch (Exception e) {
                        s55.h("StatMonitor", "[ProcessMemStat]commit fail.", null, e);
                    }
                }
            }
        }

        public final boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9a23a9ae", new Object[]{this})).booleanValue();
            }
            if (!e.f6147a) {
                return false;
            }
            synchronized (c.class) {
                if (o) {
                    return true;
                }
                try {
                    DimensionSet create = DimensionSet.create();
                    create.addDimension("process");
                    create.addDimension("type");
                    create.addDimension("restarted");
                    create.addDimension("bgType");
                    MeasureSet create2 = MeasureSet.create();
                    create2.addMeasure("useMem");
                    create2.addMeasure("currentMem");
                    create2.addMeasure("privateClean");
                    create2.addMeasure("privateDirty");
                    create2.addMeasure("javaHeap");
                    create2.addMeasure(bjo.NATIVE_HEAP);
                    create2.addMeasure("javaProportion");
                    create2.addMeasure("summaryCode");
                    create2.addMeasure("summaryStack");
                    create2.addMeasure("summarySystem");
                    create2.addMeasure("summaryPrivateOther");
                    AppMonitor.register(e.MODULE_NAME, "processMemStat", create2, create, true);
                    o = true;
                } catch (Exception e) {
                    s55.h("StatMonitor", "[ProcessMemStat][register]fail.", null, e);
                }
                return o;
            }
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.adaemon.e$e  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class C0317e {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static boolean f = false;

        /* renamed from: a  reason: collision with root package name */
        public int f6152a;
        public boolean b;
        public int c;
        public int d;
        public long e;

        static {
            t2o.a(349175873);
        }

        public static /* synthetic */ boolean a(C0317e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("efa7522", new Object[]{eVar})).booleanValue();
            }
            return eVar.c();
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
            } else if (e.f6147a) {
                mf.j(new a());
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "[RestartStat]triggerType=" + this.f6152a + ",ret=" + this.b + ",reason=" + this.c + ",workTimes=" + this.d + ",workInterval=" + this.e;
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.adaemon.e$e$a */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (C0317e.a(C0317e.this)) {
                    s55.g("StatMonitor", "[commit]", null, "RestartStat", C0317e.this.toString());
                    try {
                        DimensionValueSet create = DimensionValueSet.create();
                        create.setValue("triggerType", String.valueOf(C0317e.this.f6152a));
                        create.setValue(rb.RESULT_KEY, String.valueOf(C0317e.this.b ? 1 : 0));
                        create.setValue("reason", String.valueOf(C0317e.this.c));
                        MeasureValueSet create2 = MeasureValueSet.create();
                        create2.setValue("workTimes", C0317e.this.d);
                        create2.setValue("workInterval", C0317e.this.e);
                        AppMonitor.Stat.commit(e.MODULE_NAME, "restartStat", create, create2);
                    } catch (Exception e) {
                        s55.h("StatMonitor", "[RestartStat][commit]fail.", null, e);
                    }
                }
            }
        }

        public final boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9a23a9ae", new Object[]{this})).booleanValue();
            }
            if (!e.f6147a) {
                return false;
            }
            synchronized (C0317e.class) {
                if (f) {
                    return true;
                }
                try {
                    DimensionSet create = DimensionSet.create();
                    create.addDimension("triggerType");
                    create.addDimension(rb.RESULT_KEY);
                    create.addDimension("reason");
                    MeasureSet create2 = MeasureSet.create();
                    create2.addMeasure("workTimes");
                    create2.addMeasure("workInterval");
                    AppMonitor.register(e.MODULE_NAME, "restartStat", create2, create, true);
                    f = true;
                } catch (Exception e) {
                    s55.h("StatMonitor", "[RestartStat][register]fail.", null, e);
                }
                return f;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(349175875);
        }

        public static void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b7b6a10", new Object[]{str, str2});
            } else {
                c71.a(e.MODULE_NAME, "switch", str, null, str2);
            }
        }

        public static void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("966f0c5d", new Object[]{str});
            } else {
                c71.b(e.MODULE_NAME, "switch", str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static StringBuilder j;

        /* renamed from: a  reason: collision with root package name */
        public final long f6148a;
        public final long b = System.currentTimeMillis();
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public String h;
        public static boolean i = false;
        public static final SimpleDateFormat k = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

        public a(String str, String str2, long j2, boolean z) {
            String str3;
            this.c = str;
            this.d = str2;
            this.f6148a = j2;
            if (LocalProcessMonitor.h0().q0(com.taobao.adaemon.g.l())) {
                str3 = "bg";
            } else {
                str3 = "fg";
            }
            this.e = str3;
            if (TextUtils.isEmpty(str) || !str.contains("android.app.ActivityThread$H") || !str.endsWith("null: 159")) {
                this.f = LocalProcessMonitor.h0().n0();
                return;
            }
            Pair<String, String> k0 = LocalProcessMonitor.h0().k0();
            this.f = (String) k0.first;
            this.g = (String) k0.second;
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
            } else if (e.f6147a) {
                mf.j(new Runnable() { // from class: tb.niq
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.a.this.c();
                    }
                });
            }
        }

        public void e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("890d6557", new Object[]{this, str});
            } else {
                this.h = str;
            }
        }

        public final /* synthetic */ void c() {
            String str;
            Exception e;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab99b8c7", new Object[]{this});
            } else if (com.taobao.adaemon.g.S()) {
                s55.i("StatMonitor", "HugeMsgStat don't commit in tiny process!", new Object[0]);
            } else if (d()) {
                String f = h5d.f();
                try {
                    StringBuilder sb = j;
                    if (sb == null) {
                        j = new StringBuilder(100);
                    } else {
                        sb.setLength(0);
                    }
                    j.append(this.c);
                    if (this.c.startsWith(">>>>> Dispatching to ")) {
                        j.delete(0, 21);
                    } else if (this.c.startsWith("<<<<< Finished to ")) {
                        j.delete(0, 18);
                    }
                    int indexOf = j.indexOf("{");
                    if (indexOf > 0) {
                        StringBuilder sb2 = j;
                        sb2.delete(indexOf, sb2.indexOf("}") + 1);
                    }
                    int indexOf2 = j.indexOf("@");
                    if (indexOf2 > 0) {
                        StringBuilder sb3 = j;
                        sb3.delete(indexOf2, sb3.length());
                    }
                    if (!TextUtils.isEmpty(this.d)) {
                        StringBuilder sb4 = j;
                        sb4.append(" what=");
                        sb4.append(this.d);
                    } else if (this.c.contains(":")) {
                        StringBuilder sb5 = j;
                        sb5.append(" what=");
                        sb5.append(com.taobao.adaemon.g.C(this.c));
                    }
                    String sb6 = j.toString();
                    Long valueOf = Long.valueOf(this.f6148a);
                    String str2 = this.e;
                    String str3 = this.f;
                    String str4 = this.g;
                    String str5 = this.h;
                    StringBuilder sb7 = new StringBuilder();
                    SimpleDateFormat simpleDateFormat = k;
                    try {
                        sb7.append(simpleDateFormat.format(new Date(this.b - this.f6148a)));
                        sb7.append(" ~ ");
                        sb7.append(simpleDateFormat.format(new Date(this.b)));
                        str = "StatMonitor";
                    } catch (Exception e2) {
                        e = e2;
                        str = "StatMonitor";
                    }
                    try {
                        s55.i(str, "HugeMsgStat[commit]", "result", sb6, "spentMills", valueOf, "state", str2, "activity", str3, "lifecycleType", str4, pg1.ATOM_stack, str5, "time_range", sb7.toString());
                        DimensionValueSet create = DimensionValueSet.create();
                        create.setValue(MtopPrefetch.IPrefetchCallback.DATA_VERSION, com.alipay.sdk.m.f.b.c);
                        create.setValue("process_name", f);
                        create.setValue("message", sb6);
                        create.setValue("state", this.e);
                        create.setValue("activity", this.f);
                        create.setValue("lifecycle_type", this.g);
                        create.setValue(pg1.ATOM_stack, this.h);
                        create.setValue("dev_level", com.taobao.adaemon.g.r());
                        MeasureValueSet create2 = MeasureValueSet.create();
                        create2.setValue("spent", this.f6148a);
                        create2.setValue(ExperimentDO.COLUMN_END_TIME, this.b);
                        AppMonitor.Stat.commit(e.MODULE_NAME, "huge_msg", create, create2);
                    } catch (Exception e3) {
                        e = e3;
                        s55.h(str, "[HugeMsgStat]commit fail.", e, new Object[0]);
                    }
                } catch (Exception e4) {
                    e = e4;
                    str = "StatMonitor";
                }
            }
        }

        public final boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9a23a9ae", new Object[]{this})).booleanValue();
            }
            if (!e.f6147a) {
                return false;
            }
            if (i) {
                return true;
            }
            try {
                DimensionSet create = DimensionSet.create();
                create.addDimension("process_name");
                create.addDimension("message");
                create.addDimension("state");
                create.addDimension(MtopPrefetch.IPrefetchCallback.DATA_VERSION);
                create.addDimension("activity");
                create.addDimension("lifecycle_type");
                create.addDimension(pg1.ATOM_stack);
                create.addDimension("dev_level");
                MeasureSet create2 = MeasureSet.create();
                create2.addMeasure("spent");
                create2.addMeasure(ExperimentDO.COLUMN_END_TIME);
                AppMonitor.register(e.MODULE_NAME, "huge_msg", create2, create, true);
                i = true;
            } catch (Exception e) {
                s55.h("StatMonitor", "[HugeMsgStat][register]fail.", e, new Object[0]);
            }
            return i;
        }

        static {
            t2o.a(349175868);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static boolean g = false;

        /* renamed from: a  reason: collision with root package name */
        public final String f6151a;
        public final int b = com.taobao.adaemon.g.q();
        public long c;
        public String d;
        public boolean e;
        public String f;

        static {
            t2o.a(349175872);
        }

        public d(String str) {
            this.f6151a = str;
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
            } else if (e.f6147a) {
                mf.j(new Runnable() { // from class: tb.oiq
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.d.this.c();
                    }
                });
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "ProcessStat{process='" + this.f6151a + "', deviceLevel=" + this.b + ", liveTime=" + this.c + ", memoryTrace='" + this.d + "', restarted=" + this.e + ", sw=" + this.f + '}';
        }

        public final /* synthetic */ void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab99b8c7", new Object[]{this});
            } else if (d()) {
                s55.g("StatMonitor", "[commit]", null, "ProcessStat", toString());
                try {
                    DimensionValueSet create = DimensionValueSet.create();
                    create.setValue("process", this.f6151a);
                    create.setValue("keepAlive", String.valueOf(com.taobao.adaemon.g.P()));
                    create.setValue("deviceLevel", String.valueOf(this.b));
                    create.setValue("memoryTrace", this.d);
                    create.setValue("restarted", String.valueOf(this.e));
                    create.setValue("switch", this.f);
                    MeasureValueSet create2 = MeasureValueSet.create();
                    create2.setValue("liveTime", this.c);
                    AppMonitor.Stat.commit(e.MODULE_NAME, "processStat", create, create2);
                } catch (Exception e) {
                    s55.h("StatMonitor", "[ProcessStat][commit]fail.", null, e);
                }
            }
        }

        public final boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9a23a9ae", new Object[]{this})).booleanValue();
            }
            if (!e.f6147a) {
                return false;
            }
            synchronized (d.class) {
                if (g) {
                    return true;
                }
                try {
                    DimensionSet create = DimensionSet.create();
                    create.addDimension("process");
                    create.addDimension("deviceLevel");
                    create.addDimension("memoryTrace");
                    create.addDimension("restarted");
                    create.addDimension("switch");
                    create.addDimension("keepAlive");
                    MeasureSet create2 = MeasureSet.create();
                    create2.addMeasure("liveTime");
                    AppMonitor.register(e.MODULE_NAME, "processStat", create2, create, true);
                    g = true;
                } catch (Exception e) {
                    s55.h("StatMonitor", "[ProcessStat][register]fail.", null, e);
                }
                return g;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class g {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static boolean e = false;

        /* renamed from: a  reason: collision with root package name */
        public final String f6154a;
        public final String b;
        public final int c;
        public final double d;

        static {
            t2o.a(349175876);
        }

        public g(String str, String str2, int i, double d) {
            this.f6154a = str;
            this.b = str2;
            this.c = i;
            this.d = d;
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
            } else {
                mf.j(new Runnable() { // from class: tb.piq
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.g.this.c();
                    }
                });
            }
        }

        public final /* synthetic */ void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab99b8c7", new Object[]{this});
            } else if (d()) {
                s55.i("StatMonitor", "[ThermalStat]commit", "page", this.f6154a, "info", this.b, "status", Integer.valueOf(this.c));
                try {
                    DimensionValueSet create = DimensionValueSet.create();
                    create.setValue("page_name", this.f6154a);
                    create.setValue("info", this.b);
                    create.setValue("t_status", String.valueOf(this.c));
                    MeasureValueSet create2 = MeasureValueSet.create();
                    create2.setValue("spent", vu3.b.GEO_NOT_SUPPORT);
                    create2.setValue("temperature", this.d);
                    AppMonitor.Stat.commit(e.MODULE_NAME, "all_thread_cpu", create, create2);
                } catch (Exception e2) {
                    s55.h("StatMonitor", "[ThermalStat]commit fail.", e2, new Object[0]);
                }
            }
        }

        public final boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9a23a9ae", new Object[]{this})).booleanValue();
            }
            if (!e.f6147a) {
                return false;
            }
            if (e) {
                return true;
            }
            try {
                DimensionSet create = DimensionSet.create();
                create.addDimension("page_name");
                create.addDimension("info");
                create.addDimension("t_status");
                MeasureSet create2 = MeasureSet.create();
                create2.addMeasure("spent");
                create2.addMeasure("temperature");
                AppMonitor.register(e.MODULE_NAME, "all_thread_cpu", create2, create, true);
                e = true;
            } catch (Exception e2) {
                s55.h("StatMonitor", "ThermalStat register err", e2, new Object[0]);
            }
            return e;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class h {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static boolean e = false;

        /* renamed from: a  reason: collision with root package name */
        public final String f6155a;
        public String b;
        public final long c;
        public long d;

        static {
            t2o.a(349175877);
        }

        public h(String str, long j) {
            this.f6155a = str;
            this.c = j;
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
            } else if (e.f6147a) {
                mf.j(new Runnable() { // from class: tb.qiq
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.h.this.c();
                    }
                });
            }
        }

        public final /* synthetic */ void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab99b8c7", new Object[]{this});
            } else if (d()) {
                try {
                    s55.i("StatMonitor", "TimeStat[commit]", "arg", this.f6155a, "spentMills", Long.valueOf(this.c), "count", Long.valueOf(this.d), "remark", this.b);
                    DimensionValueSet create = DimensionValueSet.create();
                    create.setValue("arg", this.f6155a);
                    create.setValue("remark", this.b);
                    MeasureValueSet create2 = MeasureValueSet.create();
                    create2.setValue("spent", this.c);
                    create2.setValue("cnt", this.d);
                    AppMonitor.Stat.commit(e.MODULE_NAME, "time", create, create2);
                } catch (Exception e2) {
                    s55.h("StatMonitor", "[TimeStat]commit fail.", e2, new Object[0]);
                }
            }
        }

        public h e(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h) ipChange.ipc$dispatch("c2ebd045", new Object[]{this, new Long(j)});
            }
            this.d = j;
            return this;
        }

        public h f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h) ipChange.ipc$dispatch("aaf1cf68", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public final boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9a23a9ae", new Object[]{this})).booleanValue();
            }
            if (e) {
                return true;
            }
            try {
                DimensionSet create = DimensionSet.create();
                create.addDimension("arg");
                create.addDimension("remark");
                MeasureSet create2 = MeasureSet.create();
                create2.addMeasure("spent");
                create2.addMeasure("cnt");
                AppMonitor.register(e.MODULE_NAME, "time", create2, create, true);
                e = true;
            } catch (Exception e2) {
                s55.h("StatMonitor", "[TimeStat][register]fail.", e2, new Object[0]);
            }
            return e;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class i {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static boolean e = false;

        /* renamed from: a  reason: collision with root package name */
        public final String f6156a;
        public int b;
        public int c;
        public int d;

        static {
            t2o.a(349175878);
        }

        public i(String str) {
            this.f6156a = str;
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
            } else if (!e.f6147a) {
                s55.g("StatMonitor", "monitor valid", new Object[0]);
            } else {
                mf.j(new Runnable() { // from class: tb.riq
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.i.this.c();
                    }
                });
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "TriggerStat{origin='" + this.f6156a + "', channel=" + this.b + ", type=" + this.c + ", state=" + this.d + '}';
        }

        public final /* synthetic */ void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab99b8c7", new Object[]{this});
            } else if (!d()) {
                s55.g("StatMonitor", "register error", new Object[0]);
            } else {
                s55.g("StatMonitor", "[commit]", null, "TriggerStat", toString());
                try {
                    DimensionValueSet create = DimensionValueSet.create();
                    create.setValue(TriggerChannelService.EXTRA_ORIGIN, this.f6156a);
                    create.setValue("type", String.valueOf(this.c));
                    create.setValue("state", String.valueOf(this.d));
                    create.setValue("channel", String.valueOf(this.b));
                    AppMonitor.Stat.commit(e.MODULE_NAME, "TriggerStat", create, MeasureValueSet.create());
                } catch (Exception e2) {
                    s55.h("StatMonitor", "[TriggerStat]commit fail.", null, e2);
                }
            }
        }

        public final boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9a23a9ae", new Object[]{this})).booleanValue();
            }
            if (!e.f6147a) {
                return false;
            }
            if (e) {
                return true;
            }
            try {
                DimensionSet create = DimensionSet.create();
                create.addDimension(TriggerChannelService.EXTRA_ORIGIN);
                create.addDimension("type");
                create.addDimension("state");
                create.addDimension("channel");
                AppMonitor.register(e.MODULE_NAME, "TriggerStat", MeasureSet.create(), create, true);
                e = true;
            } catch (Exception e2) {
                s55.h("StatMonitor", "[TriggerStat][register]fail.", null, e2);
            }
            return e;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(349175869);
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df0d9088", new Object[]{this, str});
                return;
            }
            c71.c(e.MODULE_NAME, "process_died_info", str, com.taobao.adaemon.g.P() ? 1.0d : vu3.b.GEO_NOT_SUPPORT);
            s55.i("StatMonitor", "ProcessDeadStat", "info", str);
        }
    }

    static {
        t2o.a(349175867);
        try {
            IpChange ipChange = AppMonitor.$ipChange;
            f6147a = true;
        } catch (Exception unused) {
            f6147a = false;
        }
    }
}
