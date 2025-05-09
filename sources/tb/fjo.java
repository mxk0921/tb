package tb;

import android.app.Application;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.StatFs;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.scene.a;
import com.taobao.tao.log.logger.MetricLogger;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class fjo extends ynb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final bjo d;
    public long e;
    public final rki f;

    static {
        t2o.a(615514137);
    }

    public fjo(Application application, qk7 qk7Var) {
        super(application, qk7Var);
        bjo bjoVar = new bjo();
        this.d = bjoVar;
        this.f = new rki(application, qk7Var);
        qk7Var.u(bjoVar);
    }

    public static /* synthetic */ Object ipc$super(fjo fjoVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/diagnose/collector/RuntimeInfoCollector");
    }

    @Override // tb.ynb
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        try {
            idh.a("RuntimeInfoCollector", "init RuntimeInfoCollector");
            final long b = mk7.b() * 60;
            if (b < 0) {
                idh.b("RuntimeInfoCollector", "Schedule collect is disable!");
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            al7.b().e(new Runnable() { // from class: tb.ejo
                @Override // java.lang.Runnable
                public final void run() {
                    fjo.this.h(atomicBoolean, b);
                }
            }, 10L, b, TimeUnit.SECONDS);
            if (mk7.o && Build.VERSION.SDK_INT >= 23) {
                aun.a(Debug.MemoryInfo.class, "getOtherPrivate", Integer.TYPE);
            }
        } catch (Exception e) {
            idh.c("RuntimeInfoCollector", "init failed: ", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
        if (r3.getIntProperty(6) == 2) goto L_0x0033;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
        if (r3.getIntProperty(2) > 0) goto L_0x0033;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c() {
        /*
            r9 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.fjo.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0012
            java.lang.String r3 = "e6ac34d8"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r9
            r2.ipc$dispatch(r3, r1)
            return
        L_0x0012:
            int r2 = android.os.Build.VERSION.SDK_INT
            android.app.Application r3 = r9.f32215a
            java.lang.String r4 = "batterymanager"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.os.BatteryManager r3 = (android.os.BatteryManager) r3
            if (r3 != 0) goto L_0x0021
            return
        L_0x0021:
            r4 = 4
            int r4 = r3.getIntProperty(r4)
            long r4 = (long) r4
            r6 = 26
            r7 = 2
            if (r2 < r6) goto L_0x0035
            r2 = 6
            int r2 = r3.getIntProperty(r2)
            if (r2 != r7) goto L_0x004a
        L_0x0033:
            r0 = 1
            goto L_0x004a
        L_0x0035:
            r6 = 23
            if (r2 < r6) goto L_0x003e
            boolean r0 = tb.djo.a(r3)
            goto L_0x004a
        L_0x003e:
            int r2 = r3.getIntProperty(r7)
            long r2 = (long) r2
            r6 = 0
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x004a
            goto L_0x0033
        L_0x004a:
            tb.bjo r1 = r9.d
            r1.e(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fjo.c():void");
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2612c895", new Object[]{this, new Integer(i)});
            return;
        }
        f();
        g();
        c();
        MetricLogger.builder(1, i).setTime(System.currentTimeMillis()).setData(this.d.c()).log(this.c);
    }

    public void e() {
        Map runtimeStats;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59c227db", new Object[]{this});
        } else if (Build.VERSION.SDK_INT >= 23) {
            try {
                runtimeStats = Debug.getRuntimeStats();
                String str = (String) runtimeStats.get("art.gc.gc-count");
                String str2 = (String) runtimeStats.get("art.gc.gc-time");
                String str3 = (String) runtimeStats.get("art.gc.bytes-allocated");
                String str4 = (String) runtimeStats.get("art.gc.bytes-freed");
                String str5 = (String) runtimeStats.get("art.gc.blocking-gc-count");
                String str6 = (String) runtimeStats.get("art.gc.blocking-gc-time");
                if (str3 != null) {
                    this.d.g(bjo.GC_ALLOC_SIZE, Long.parseLong(str3));
                }
                if (str4 != null) {
                    this.d.g(bjo.GC_FREE_SIZE, Long.parseLong(str4));
                }
                if (str != null) {
                    this.d.g(bjo.GC_COUNT, Long.parseLong(str));
                }
                if (str2 != null) {
                    this.d.g(bjo.GC_TIME, Long.parseLong(str2));
                }
                if (str5 != null) {
                    this.d.g(bjo.GC_BLOCK_COUNT, Long.parseLong(str5));
                }
                if (str6 != null) {
                    this.d.g(bjo.GC_BLOCK_TIME, Long.parseLong(str6));
                }
            } catch (Exception e) {
                idh.c("RuntimeInfoCollector", "collectGCInfo: ", e);
            }
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa2929d2", new Object[]{this});
        } else {
            j();
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81ae7b46", new Object[]{this});
            return;
        }
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        this.d.h(statFs.getTotalBytes(), statFs.getAvailableBytes());
    }

    public final /* synthetic */ void h(AtomicBoolean atomicBoolean, long j) {
        int i = 3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87a5dff5", new Object[]{this, atomicBoolean, new Long(j)});
            return;
        }
        if (atomicBoolean.get()) {
            atomicBoolean.set(false);
            i = 1;
        }
        try {
            if (System.currentTimeMillis() - this.e >= (j - 1) * 1000) {
                d(i);
                this.e = System.currentTimeMillis();
                if (i == 1) {
                    bjo bjoVar = this.d;
                    bjoVar.b = bjoVar.d(bjo.DALVIK_USED);
                }
            }
        } catch (Exception e) {
            idh.c("RuntimeInfoCollector", "init runnable: ", e);
        }
    }

    public void i(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad7a13f7", new Object[]{this, aVar});
        } else {
            this.f.e(aVar);
        }
    }

    public bjo j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bjo) ipChange.ipc$dispatch("636062d1", new Object[]{this});
        }
        e();
        long d = this.d.d(bjo.NATIVE_HEAP_USED);
        long maxMemory = Runtime.getRuntime().maxMemory();
        long freeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long round = Math.round((freeMemory / maxMemory) * 100.0d);
        this.d.f(maxMemory, freeMemory, round);
        this.f.c(freeMemory, round, d, 0L, 0L);
        return this.d;
    }
}
