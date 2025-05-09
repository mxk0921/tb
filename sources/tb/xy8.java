package tb;

import android.os.Build;
import android.os.Debug;
import android.text.TextUtils;
import anet.channel.util.ALog;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.scene.SceneIdentifier;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.falco.FalcoEnvironmentImpl;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xy8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SIMPLE_TOPIC_IDLE_ACTION = "idle";
    public static final String SIMPLE_TOPIC_LAUNCH_ACTION = "launch";
    public static final String SIMPLE_TOPIC_LOAD_ACTION = "load";
    public static final String SIMPLE_TOPIC_SCROLL_ACTION = "scroll";
    public static final String TOPIC_IDLE_ACTION = "falco.idle_action";
    public static final String TOPIC_LAUNCH_ACTION = "falco.launch_action";
    public static final String TOPIC_LOAD_ACTION = "falco.load_action";
    public static final String TOPIC_SCROLL_ACTION = "falco.scroll_action";
    public static volatile boolean g;
    public static volatile boolean h;
    public static volatile boolean i;
    public static final HashSet<l> j = new HashSet<>();
    public static final l k = new l(null);
    public static volatile zy8 l = null;
    public static boolean m = false;
    public static k n = null;
    public static oz8 o;

    /* renamed from: a  reason: collision with root package name */
    public final j f31680a = new j(null);
    public l b = null;
    public k c = null;
    public boolean d = true;
    public volatile boolean e = false;
    public int f = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                xy8.g(xy8.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                xy8.j(xy8.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f31683a;

        public c(int i) {
            this.f31683a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                xy8.l(xy8.this, this.f31683a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f31684a;

        public d(l lVar) {
            this.f31684a = lVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            xy8.k(xy8.this);
            if (xy8.h(xy8.this) < 0) {
                xy8.i(xy8.this, 0);
            }
            if (xy8.h(xy8.this) == 0) {
                xy8.m(xy8.this, false);
                xy8.n(xy8.this, true);
                l lVar = this.f31684a;
                if (lVar.e > 0) {
                    lVar.f = true;
                } else {
                    xy8.o().remove(this.f31684a);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f31685a;

        public e(int i) {
            this.f31685a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                xy8.p(xy8.this, this.f31685a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j f31686a;

        public f(j jVar) {
            this.f31686a = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                xy8.c(SceneIdentifier.getProcessStartTime(), System.currentTimeMillis(), this.f31686a, xy8.a(), xy8.b());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k f31687a;
        public final /* synthetic */ j b;
        public final /* synthetic */ l c;

        public g(k kVar, j jVar, l lVar) {
            this.f31687a = kVar;
            this.b = jVar;
            this.c = lVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            k a2 = xy8.a();
            xy8.c(this.f31687a.f31691a, a2.f31691a, this.b, xy8.d(this.f31687a, a2), this.c);
            l lVar = this.c;
            int i = lVar.e - 1;
            lVar.e = i;
            if (i <= 0 && lVar.f) {
                xy8.o().remove(this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f31688a;
        public final /* synthetic */ k b;
        public final /* synthetic */ j c;

        public h(l lVar, k kVar, j jVar) {
            this.f31688a = lVar;
            this.b = kVar;
            this.c = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            xy8.o().remove(this.f31688a);
            k a2 = xy8.a();
            xy8.c(this.b.f31691a, a2.f31691a, this.c, xy8.d(this.b, a2), this.f31688a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    xy8.e();
                }
            }
        }

        public i() {
        }

        public void finalize() throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a35321a5", new Object[]{this});
                return;
            }
            super.finalize();
            crt.i(new a());
            xy8.f(new WeakReference(new i()));
        }

        public /* synthetic */ i(a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class j {

        /* renamed from: a  reason: collision with root package name */
        public String f31690a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;

        public j() {
        }

        public /* synthetic */ j(a aVar) {
            this();
        }
    }

    public static k A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("41b79f0", new Object[0]);
        }
        k kVar = n;
        if (kVar != null && System.currentTimeMillis() - kVar.f31691a < 500) {
            return kVar;
        }
        k z = z();
        n = z;
        return z;
    }

    public static void C() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9da1dfab", new Object[0]);
            return;
        }
        HashSet<l> hashSet = j;
        if (!hashSet.isEmpty()) {
            Runtime runtime = Runtime.getRuntime();
            long maxMemory = runtime.maxMemory();
            long freeMemory = runtime.totalMemory() - runtime.freeMemory();
            double d2 = freeMemory / maxMemory;
            if (d2 > 0.75d) {
                z = true;
            }
            Iterator<l> it = hashSet.iterator();
            while (it.hasNext()) {
                l next = it.next();
                if (z) {
                    if (next.b == -1) {
                        next.b = 0L;
                    }
                    next.b++;
                }
                if (d2 > next.f31692a) {
                    next.f31692a = d2;
                    next.d = maxMemory;
                    next.c = freeMemory;
                }
            }
        }
    }

    public static void D(boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b634cb5d", new Object[]{new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        g = z;
        h = z2;
        i = z3;
        if (!g) {
            ALog.e("falco.gc", "[init] monitor not enabled", null, new Object[0]);
            return;
        }
        tz8 tz8Var = FalcoGlobalTracer.get();
        if (tz8Var != null) {
            o = tz8Var.d("falco_gc", "gc").g(System.currentTimeMillis()).a("MobileService");
        } else {
            ALog.e("falco.gc", "[constructor] tracer is null", null, new Object[0]);
            o = null;
        }
        if (i) {
            j.add(k);
            new WeakReference(new i(null));
        }
        if (h) {
            l = new zy8();
            l.b();
        }
    }

    public static long E(String str) {
        String runtimeStat;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7c399f5e", new Object[]{str})).longValue();
        }
        try {
            runtimeStat = Debug.getRuntimeStat(str);
            if (TextUtils.isEmpty(runtimeStat)) {
                return -1L;
            }
            return Long.parseLong(runtimeStat);
        } catch (Exception e2) {
            ALog.e("falco.gc", "[parseRuntimeStat] error", null, e2, new Object[0]);
            return -1L;
        }
    }

    public static void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("209512c0", new Object[0]);
        } else if (!m) {
            m = true;
            DimensionSet create = DimensionSet.create();
            create.addDimension("falcoId");
            create.addDimension("envFalcoId");
            create.addDimension("topic");
            create.addDimension("topicFalcoId");
            create.addDimension("fromPageName");
            create.addDimension("fromPageUrl");
            create.addDimension("pageName");
            create.addDimension("pageUrl");
            MeasureSet create2 = MeasureSet.create();
            create2.addMeasure("gcActionS");
            create2.addMeasure("gcActionE");
            create2.addMeasure("gcExceedCount");
            create2.addMeasure("gcMaxUsed");
            create2.addMeasure("gcMaxTotal");
            create2.addMeasure(bjo.GC_COUNT);
            create2.addMeasure(bjo.GC_TIME);
            create2.addMeasure("bytesAllocated");
            create2.addMeasure("bytesFreed");
            create2.addMeasure("blockingGcCount");
            create2.addMeasure("blockingGcTime");
            z61.h(FalcoEnvironmentImpl.MONITOR_MODULE, "falco_gc", create2, create);
        }
    }

    public static /* synthetic */ k a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("4710f22f", new Object[0]);
        }
        return A();
    }

    public static /* synthetic */ l b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("f210225", new Object[0]);
        }
        return k;
    }

    public static /* synthetic */ void c(long j2, long j3, j jVar, k kVar, l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb4e78f5", new Object[]{new Long(j2), new Long(j3), jVar, kVar, lVar});
        } else {
            r(j2, j3, jVar, kVar, lVar);
        }
    }

    public static /* synthetic */ k d(k kVar, k kVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("12645cce", new Object[]{kVar, kVar2});
        }
        return s(kVar, kVar2);
    }

    public static /* synthetic */ void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e6a1ceb", new Object[0]);
        } else {
            C();
        }
    }

    public static /* synthetic */ WeakReference f(WeakReference weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("2e7f6fe", new Object[]{weakReference});
        }
        return weakReference;
    }

    public static /* synthetic */ void g(xy8 xy8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32b4c697", new Object[]{xy8Var});
        } else {
            xy8Var.w();
        }
    }

    public static /* synthetic */ int h(xy8 xy8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec2c5429", new Object[]{xy8Var})).intValue();
        }
        return xy8Var.f;
    }

    public static /* synthetic */ int i(xy8 xy8Var, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cea02a82", new Object[]{xy8Var, new Integer(i2)})).intValue();
        }
        xy8Var.f = i2;
        return i2;
    }

    public static /* synthetic */ int j(xy8 xy8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7ddf9a5", new Object[]{xy8Var})).intValue();
        }
        int i2 = xy8Var.f + 1;
        xy8Var.f = i2;
        return i2;
    }

    public static /* synthetic */ int k(xy8 xy8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7db6cc63", new Object[]{xy8Var})).intValue();
        }
        int i2 = xy8Var.f - 1;
        xy8Var.f = i2;
        return i2;
    }

    public static /* synthetic */ void l(xy8 xy8Var, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed8cbce", new Object[]{xy8Var, new Integer(i2)});
        } else {
            xy8Var.v(i2);
        }
    }

    public static /* synthetic */ boolean m(xy8 xy8Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b994b6e6", new Object[]{xy8Var, new Boolean(z)})).booleanValue();
        }
        xy8Var.e = z;
        return z;
    }

    public static /* synthetic */ boolean n(xy8 xy8Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f0edd27", new Object[]{xy8Var, new Boolean(z)})).booleanValue();
        }
        xy8Var.d = z;
        return z;
    }

    public static /* synthetic */ HashSet o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashSet) ipChange.ipc$dispatch("25561edc", new Object[0]);
        }
        return j;
    }

    public static /* synthetic */ void p(xy8 xy8Var, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4c164d2", new Object[]{xy8Var, new Integer(i2)});
        } else {
            xy8Var.u(i2);
        }
    }

    public static void r(long j2, long j3, j jVar, k kVar, l lVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2765af8", new Object[]{new Long(j2), new Long(j3), jVar, kVar, lVar});
        } else if (kVar.b <= 0) {
            String str2 = jVar.b + "|no gc happened at " + jVar.f;
            oz8 oz8Var = o;
            if (oz8Var != null) {
                oz8Var.A(str2);
                return;
            }
            ALog.e("falco.gc", "[commitGcRecord] " + str2, null, new Object[0]);
        } else {
            String a2 = uz8.a();
            FalcoEnvironmentImpl m2 = FalcoEnvironmentImpl.m();
            if (m2 != null) {
                str = m2.c();
            } else {
                str = "";
            }
            G();
            DimensionValueSet create = DimensionValueSet.create();
            create.setValue("falcoId", a2);
            create.setValue("envFalcoId", str);
            create.setValue("topic", jVar.f31690a);
            create.setValue("topicFalcoId", jVar.c);
            create.setValue("fromPageName", jVar.d);
            create.setValue("fromPageUrl", zxv.c(jVar.e));
            create.setValue("pageName", jVar.f);
            create.setValue("pageUrl", zxv.c(jVar.g));
            MeasureValueSet create2 = MeasureValueSet.create();
            create2.setValue("gcActionS", j2);
            create2.setValue("gcActionE", j3);
            create2.setValue("gcExceedCount", lVar.b);
            create2.setValue("gcMaxUsed", lVar.c);
            create2.setValue("gcMaxTotal", lVar.d);
            create2.setValue(bjo.GC_COUNT, kVar.b);
            create2.setValue(bjo.GC_TIME, kVar.c);
            create2.setValue("bytesAllocated", kVar.d);
            create2.setValue("bytesFreed", kVar.e);
            create2.setValue("blockingGcCount", kVar.f);
            create2.setValue("blockingGcTime", kVar.g);
            z61.f(FalcoEnvironmentImpl.MONITOR_MODULE, "falco_gc", create, create2);
            StringBuilder sb = new StringBuilder(jVar.b);
            sb.append("|falcoId=");
            sb.append(a2);
            sb.append(",gcTimeInterval=");
            sb.append(j3 - j2);
            sb.append(",gcCount=");
            sb.append(kVar.b);
            sb.append(",gcTime=");
            sb.append(kVar.c);
            sb.append(",");
            if (kVar.f > 0) {
                sb.append("blockingGcCount=");
                sb.append(kVar.f);
                sb.append(",blockingGcTime=");
                sb.append(kVar.g);
                sb.append(",");
            }
            if (lVar.b > 0) {
                sb.append("gcExceedCount=");
                sb.append(lVar.b);
                sb.append(",");
            }
            sb.append("gcMaxUsed=");
            sb.append(lVar.c);
            sb.append(",gcMaxTotal=");
            sb.append(lVar.d);
            sb.append(",bytesAllocated=");
            sb.append(kVar.d);
            sb.append(",bytesFreed=");
            sb.append(kVar.e);
            sb.append(",pageName=");
            sb.append(jVar.f);
            String sb2 = sb.toString();
            oz8 oz8Var2 = o;
            if (oz8Var2 != null) {
                oz8Var2.A(sb2);
            } else {
                ALog.e("falco.gc", sb2, null, new Object[0]);
            }
        }
    }

    public static k s(k kVar, k kVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("47c1ee3e", new Object[]{kVar, kVar2});
        }
        k kVar3 = new k(null);
        kVar3.f31691a = t(kVar.f31691a, kVar2.f31691a);
        kVar3.b = t(kVar.b, kVar2.b);
        kVar3.c = t(kVar.c, kVar2.c);
        kVar3.d = t(kVar.d, kVar2.d);
        kVar3.e = t(kVar.e, kVar2.e);
        kVar3.f = t(kVar.f, kVar2.f);
        kVar3.g = t(kVar.g, kVar2.g);
        return kVar3;
    }

    public static long t(long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1f871056", new Object[]{new Long(j2), new Long(j3)})).longValue();
        }
        if (j2 == -1 || j3 == -1) {
            return -1L;
        }
        return j3 - j2;
    }

    public static k z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("69d8783e", new Object[0]);
        }
        k kVar = new k(null);
        if (Build.VERSION.SDK_INT >= 23) {
            kVar.f31691a = System.currentTimeMillis();
            kVar.b = E("art.gc.gc-count");
            kVar.c = E("art.gc.gc-time");
            kVar.d = E("art.gc.bytes-allocated");
            kVar.e = E("art.gc.bytes-freed");
            kVar.f = E("art.gc.blocking-gc-count");
            kVar.g = E("art.gc.blocking-gc-time");
        }
        return kVar;
    }

    public long B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6d2ef4f6", new Object[]{this})).longValue();
        }
        k kVar = this.c;
        if (kVar != null) {
            return kVar.f31691a;
        }
        return -1L;
    }

    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51af759a", new Object[]{this});
        } else if (g && this.e) {
            crt.i(new d(this.b));
        }
    }

    public final j H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("7e1de407", new Object[]{this});
        }
        j jVar = new j(null);
        j jVar2 = this.f31680a;
        String str = jVar2.f31690a;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        jVar.f31690a = str;
        String str3 = jVar2.b;
        if (str3 != null) {
            str = str3;
        }
        jVar.b = str;
        String str4 = jVar2.c;
        if (str4 == null) {
            str4 = str2;
        }
        jVar.c = str4;
        String str5 = jVar2.d;
        if (str5 == null) {
            str5 = str2;
        }
        jVar.d = str5;
        String str6 = jVar2.e;
        if (str6 == null) {
            str6 = str2;
        }
        jVar.e = str6;
        String str7 = jVar2.f;
        if (str7 == null) {
            str7 = str2;
        }
        jVar.f = str7;
        String str8 = jVar2.g;
        if (str8 != null) {
            str2 = str8;
        }
        jVar.g = str2;
        return jVar;
    }

    public void I(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e424317", new Object[]{this, str});
        } else {
            this.f31680a.d = str;
        }
    }

    public void J(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a466725", new Object[]{this, str});
        } else {
            this.f31680a.e = str;
        }
    }

    public void K(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a5935cd", new Object[]{this, str});
        } else {
            this.f31680a.f = str;
        }
    }

    public void L(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eecb45af", new Object[]{this, str});
        } else {
            this.f31680a.g = str;
        }
    }

    public void M(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f82f92c", new Object[]{this, str});
        } else {
            this.f31680a.b = str;
        }
    }

    public void N(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70e8be", new Object[]{this, str});
        } else {
            this.f31680a.f31690a = str;
        }
    }

    public void O(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5c82adc", new Object[]{this, str});
        } else {
            this.f31680a.c = str;
        }
    }

    public void P(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbea9f79", new Object[]{this, new Integer(i2)});
        } else if (g && this.e) {
            crt.i(new c(i2));
            l.c(this.f31680a.f31690a);
        }
    }

    public void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60d7d085", new Object[]{this});
        } else {
            P(3);
        }
    }

    public void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (g) {
            this.e = true;
            crt.i(new a());
            l.e(this.f31680a.f31690a);
        }
    }

    public void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("774c4345", new Object[]{this});
        } else if (g) {
            crt.i(new f(H()));
            l.f(this.f31680a.f31690a);
        }
    }

    public xy8 q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xy8) ipChange.ipc$dispatch("444adb1c", new Object[]{this});
        }
        if (g && this.e) {
            crt.i(new b());
        }
        return this;
    }

    public final void u(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d081358", new Object[]{this, new Integer(i2)});
            return;
        }
        this.d = true;
        crt.j(new h(this.b, this.c, H()), i2, TimeUnit.SECONDS);
    }

    public final void v(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8827b7ae", new Object[]{this, new Integer(i2)});
            return;
        }
        j H = H();
        l lVar = this.b;
        k kVar = this.c;
        lVar.e++;
        crt.j(new g(kVar, H, lVar), i2, TimeUnit.SECONDS);
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da3479e", new Object[]{this});
            return;
        }
        if (this.d) {
            this.b = new l(null);
        } else {
            l lVar = this.b;
            lVar.f31692a = -1.0d;
            lVar.b = -1L;
            lVar.c = -1L;
            lVar.d = -1L;
        }
        this.d = false;
        this.c = A();
        j.add(this.b);
    }

    public void x(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("372c376d", new Object[]{this, new Integer(i2)});
        } else if (g && this.e) {
            this.e = false;
            crt.i(new e(i2));
            l.c(this.f31680a.f31690a);
        }
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfbca179", new Object[]{this});
        } else {
            x(3);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class l {

        /* renamed from: a  reason: collision with root package name */
        public double f31692a;
        public long b;
        public long c;
        public long d;
        public int e;
        public boolean f;

        public l() {
            this.f31692a = -1.0d;
            this.b = -1L;
            this.c = -1L;
            this.d = -1L;
            this.e = 0;
            this.f = false;
        }

        public /* synthetic */ l(a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class k {

        /* renamed from: a  reason: collision with root package name */
        public long f31691a;
        public long b;
        public long c;
        public long d;
        public long e;
        public long f;
        public long g;

        public k() {
            this.f31691a = -1L;
            this.b = -1L;
            this.c = -1L;
            this.d = -1L;
            this.e = -1L;
            this.f = -1L;
            this.g = -1L;
        }

        public /* synthetic */ k(a aVar) {
            this();
        }
    }
}
