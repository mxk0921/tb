package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;
import com.taobao.metrickit.event.EventCenter;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.c0c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class dli extends gyl<xki, uki> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String s = "MetricKit.MemoryMetric";
    private final c0c g;
    private boolean h = true;
    private boolean i = true;
    private boolean j = true;
    private boolean k = false;
    private boolean l = false;
    private long m = 0;
    private long n = 0;
    private long o = 0;
    private long p = 0;
    private long q = 0;
    private long r = 0;

    public dli(MetricContext metricContext, c0c c0cVar, c0c c0cVar2, xki xkiVar) {
        super(metricContext, c0cVar, xkiVar);
        this.g = c0cVar2;
    }

    public static /* synthetic */ Object ipc$super(dli dliVar, String str, Object... objArr) {
        if (str.hashCode() == 855740395) {
            super.m();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/metrickit/processor/memory/MemoryMetricProcessor");
    }

    private static String o(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c58b3f5", new Object[]{new Long(j)});
        }
        return (j / 1048576) + "M";
    }

    private void p(uki ukiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a9bccea", new Object[]{this, ukiVar});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("dispatchNanos", Long.valueOf(System.nanoTime()));
        hashMap.put("javaUsed", Long.valueOf(ukiVar.j()));
        hashMap.put("nativeHeapSize", Long.valueOf(ukiVar.n()));
        hashMap.put("nativeHeapAllocatedSize", Long.valueOf(ukiVar.m()));
        hashMap.put("pss", Long.valueOf(ukiVar.q()));
        hashMap.put("javaTotal", Long.valueOf(ukiVar.i()));
        hashMap.put("javaMax", Long.valueOf(ukiVar.h()));
        hashMap.put("art.gc.gc-count", Long.valueOf(ukiVar.f()));
        hashMap.put("art.gc.gc-time", Long.valueOf(ukiVar.g()));
        hashMap.put("art.gc.bytes-allocated", Long.valueOf(ukiVar.c()));
        hashMap.put("art.gc.bytes-freed", Long.valueOf(ukiVar.d()));
        hashMap.put("art.gc.blocking-gc-count", Long.valueOf(ukiVar.a()));
        hashMap.put("art.gc.blocking-gc-time", Long.valueOf(ukiVar.b()));
        EventCenter.f().h(this).k(15, hashMap);
    }

    private JSONObject r(long j, long j2, long j3, long j4, long j5, long j6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d945bb8e", new Object[]{this, new Long(j), new Long(j2), new Long(j3), new Long(j4), new Long(j5), new Long(j6)});
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("art.gc.gc-count", j);
            jSONObject.put("art.gc.gc-time", j2);
            jSONObject.put("art.gc.bytes-allocated", j3);
            jSONObject.put("art.gc.bytes-freed", j4);
            jSONObject.put("art.gc.blocking-gc-count", j5);
            jSONObject.put("art.gc.blocking-gc-time", j6);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    private JSONObject s(float f, uki ukiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c73bbf14", new Object[]{this, new Float(f), ukiVar});
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("javaMax", o(ukiVar.h()));
            jSONObject.put("javaTotal", o(ukiVar.i()));
            jSONObject.put("javaUsed", o(ukiVar.j()));
            jSONObject.put("javaProportion", String.valueOf(((int) (f * 100.0f)) / 100.0f));
            jSONObject.put("nativeHeapSize", o(ukiVar.n()));
            jSONObject.put("nativeHeapAllocatedSize", o(ukiVar.m()));
            jSONObject.put("pss", o(ukiVar.q()));
            JSONObject jSONObject2 = new JSONObject();
            Map<String, Long> l = ukiVar.l();
            for (Map.Entry<String, Long> entry : l.entrySet()) {
                jSONObject2.put(entry.getKey(), o(entry.getValue().longValue()));
            }
            if (l.size() > 0) {
                jSONObject2.put(bjo.GL_DEV_MEM, o(ukiVar.k()));
                jSONObject2.put(bjo.GRAPHICS_MEM, o(ukiVar.p()));
                jSONObject2.put(bjo.GL_MEM, o(ukiVar.o()));
            }
            jSONObject.put("memoryInfo", jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    private JSONObject t(uki ukiVar, c0c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c3bc2e95", new Object[]{this, ukiVar, aVar});
        }
        if (this.k) {
            this.k = false;
            z(ukiVar);
            return new JSONObject();
        }
        long f = ukiVar.f() - this.m;
        long g = ukiVar.g() - this.n;
        long c = ukiVar.c() - this.o;
        long d = ukiVar.d() - this.p;
        long a2 = ukiVar.a() - this.q;
        long b = ukiVar.b() - this.r;
        aVar.putLong("gc-count", this.g.getLong("gc-count", 0L) + f).putLong("gc-time", this.g.getLong("gc-time", 0L) + g).putLong("bytes-allocated", this.g.getLong("bytes-allocated", 0L) + c).putLong("bytes-freed", this.g.getLong("bytes-freed", 0L) + d).putLong("blocking-gc-count", this.g.getLong("blocking-gc-count", 0L) + a2).putLong("blocking-gc-time", this.g.getLong("blocking-gc-time", 0L) + b).putLong("gcCollectTimes", this.g.getLong("gcCollectTimes", 0L) + 1);
        aVar.putLong("gc-count-max", Math.max(this.g.getLong("gc-count-max", 0L), f)).putLong("gc-time-max", Math.max(this.g.getLong("gc-time-max", 0L), g)).putLong("bytes-allocated-max", Math.max(this.g.getLong("bytes-allocated-max", 0L), c)).putLong("bytes-freed-max", Math.max(this.g.getLong("bytes-freed-max", 0L), d)).putLong("blocking-gc-count-max", Math.max(this.g.getLong("blocking-gc-count-max", 0L), a2)).putLong("blocking-gc-time-max", Math.max(this.g.getLong("blocking-gc-time-max", 0L), b));
        z(ukiVar);
        return r(f, g, c, d, a2, b);
    }

    private void v(uki ukiVar, c0c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b34fa54", new Object[]{this, ukiVar, aVar});
        } else if (ukiVar.q() > 0 && ukiVar.e() == 17) {
            aVar.putLong("launchInteractivePss", ukiVar.q());
        }
    }

    private void w(uki ukiVar, c0c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e73efce", new Object[]{this, ukiVar, aVar});
            return;
        }
        if (ukiVar.e() == 13) {
            aVar.d("systemOnLowMemoryCount");
        }
        if (ukiVar.e() == 14) {
            aVar.d("systemOnTrimMemoryCount");
            c0c a2 = this.b.a("trimMemory");
            int r = ukiVar.r();
            if (r != -1) {
                a2.c().d(String.valueOf(r));
            }
        }
    }

    private void y(c0c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec4bff0", new Object[]{this, aVar});
            return;
        }
        aVar.d("touchJavaThresholdTimes");
        c0c c0cVar = this.b;
        c0c a2 = c0cVar.a("startup_" + MetricContext.getLaunchSession());
        a2.a("touchJavaThreshold_" + SystemClock.uptimeMillis()).c().putLong("startupDistanceDuration", SystemClock.uptimeMillis() - this.f22911a.getProcessStartTime()).putString("topActivity", this.f22911a.getCurrActivityName()).putString("topFragment", this.f22911a.getCurrFragmentName()).putString("schemaUrl", this.f22911a.getSchemaUrl());
    }

    private void z(uki ukiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7153db83", new Object[]{this, ukiVar});
            return;
        }
        this.m = ukiVar.f();
        this.n = ukiVar.g();
        this.o = ukiVar.c();
        this.p = ukiVar.d();
        this.q = ukiVar.a();
        this.r = ukiVar.b();
    }

    @Override // tb.gyl, tb.kti
    public int[] c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("df81d3cb", new Object[]{this});
        }
        return new int[]{13, 14, 17};
    }

    @Override // tb.gyl
    public long i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1d1e09a", new Object[]{this, new Integer(i)})).longValue();
        }
        return l1r.d(l1r.CONFIG_MEMORY_REPEAT_INTERVAL, 20L);
    }

    @Override // tb.gyl
    public int[] j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("dd6ab5f7", new Object[]{this});
        }
        return new int[]{0};
    }

    @Override // tb.gyl
    public int[] k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("ba5881ab", new Object[]{this});
        }
        return new int[]{1};
    }

    @Override // tb.gyl
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33018feb", new Object[]{this});
            return;
        }
        super.m();
        if (!this.j) {
            this.k = true;
        }
        this.j = false;
        this.l = true;
    }

    private JSONObject u(uki ukiVar, c0c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("895c6d10", new Object[]{this, ukiVar, aVar});
        }
        long h = ukiVar.h();
        long j = ukiVar.j();
        if (this.i) {
            this.i = false;
            aVar.putLong("javaMax", h);
        }
        float f = h > 0 ? ((float) j) / ((float) h) : 0.0f;
        if (f > 0.9d) {
            if (this.h) {
                this.h = false;
                y(aVar);
            }
            this.f22911a.getOuterCallbackScheduler().a(1, j, h);
            TLog.loge(s, "touchJavaThreshold:", String.valueOf(f));
        }
        x(ukiVar, aVar);
        w(ukiVar, aVar);
        v(ukiVar, aVar);
        return s(f, ukiVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006a A[Catch: JSONException -> 0x003b, TRY_LEAVE, TryCatch #0 {JSONException -> 0x003b, blocks: (B:10:0x0025, B:12:0x0029, B:18:0x003d, B:19:0x0045, B:21:0x006a), top: B:25:0x0025 }] */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(tb.uki r7) {
        /*
            r6 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = tb.dli.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = "bfded4c0"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r6
            r0 = 1
            r3[r0] = r7
            r1.ipc$dispatch(r2, r3)
            return
        L_0x0015:
            long r1 = r7.h()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0020
            return
        L_0x0020:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            boolean r2 = r6.l     // Catch: JSONException -> 0x003b
            if (r2 != 0) goto L_0x003d
            int[] r2 = r6.c()     // Catch: JSONException -> 0x003b
            int r3 = r7.e()     // Catch: JSONException -> 0x003b
            boolean r2 = tb.rz3.c(r2, r3)     // Catch: JSONException -> 0x003b
            if (r2 == 0) goto L_0x0038
            goto L_0x003d
        L_0x0038:
            java.lang.String r2 = "Period"
            goto L_0x0045
        L_0x003b:
            r2 = move-exception
            goto L_0x006e
        L_0x003d:
            int r2 = r7.e()     // Catch: JSONException -> 0x003b
            java.lang.String r2 = com.taobao.metrickit.event.EventCenter.e(r2)     // Catch: JSONException -> 0x003b
        L_0x0045:
            java.lang.String r3 = "triggerType"
            r1.put(r3, r2)     // Catch: JSONException -> 0x003b
            tb.c0c r2 = r6.b     // Catch: JSONException -> 0x003b
            tb.c0c$a r2 = r2.c()     // Catch: JSONException -> 0x003b
            java.lang.String r3 = "memory"
            org.json.JSONObject r4 = r6.u(r7, r2)     // Catch: JSONException -> 0x003b
            r1.put(r3, r4)     // Catch: JSONException -> 0x003b
            java.lang.String r3 = "gc"
            org.json.JSONObject r4 = r6.t(r7, r2)     // Catch: JSONException -> 0x003b
            r1.put(r3, r4)     // Catch: JSONException -> 0x003b
            boolean r3 = r2.b()     // Catch: JSONException -> 0x003b
            if (r3 == 0) goto L_0x0071
            r2.commit()     // Catch: JSONException -> 0x003b
            goto L_0x0071
        L_0x006e:
            r2.printStackTrace()
        L_0x0071:
            java.lang.String r2 = "MetricKit.MemoryMetric"
            java.lang.String r1 = r1.toString()
            com.taobao.tao.log.TLog.loge(r2, r1)
            r6.l = r0
            r6.p(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dli.a(tb.uki):void");
    }

    private void x(uki ukiVar, c0c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("268428a2", new Object[]{this, ukiVar, aVar});
            return;
        }
        long j = this.b.getLong("peakJavaMemoryUsage", -1L);
        long j2 = this.b.getLong("peakNativeHeapSize", -1L);
        long j3 = this.b.getLong("peakNativeHeapAllocated", -1L);
        long j4 = this.b.getLong("peakPss", -1L);
        long j5 = ukiVar.j();
        if (j < j5) {
            aVar.putLong("peakJavaMemoryUsage", j5);
        }
        long n = ukiVar.n();
        if (j2 < n) {
            aVar.putLong("peakNativeHeapSize", n);
        }
        long m = ukiVar.m();
        if (j3 < m) {
            aVar.putLong("peakNativeHeapAllocated", m);
        }
        long q = ukiVar.q();
        if (q > 0 && j4 < q) {
            aVar.putLong("peakPss", q);
        }
        if (m > 1073741824) {
            this.f22911a.getOuterCallbackScheduler().a(2, m, -1L);
            TLog.loge(s, "touchNativeThreshold:", o(m));
        }
    }
}
