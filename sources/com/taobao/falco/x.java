package com.taobao.falco;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.StatFs;
import anet.channel.util.ALog;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.falco.FalcoEnvironmentImpl;
import com.taobao.metrickit.event.EventCenter;
import com.taobao.monitor.impl.trace.c;
import java.io.File;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import tb.bjo;
import tb.c21;
import tb.crt;
import tb.ic;
import tb.m09;
import tb.n3c;
import tb.uz8;
import tb.v11;
import tb.yy8;
import tb.z61;
import tb.zzb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class x implements n3c, c.AbstractC0626c, v11, Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String g = "falco_sysload";

    /* renamed from: a  reason: collision with root package name */
    private final FalcoEnvironmentImpl f10493a;
    private volatile g b;
    private volatile boolean c;
    private volatile boolean d;
    private volatile boolean e;
    private boolean f;

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
                x.a(x.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f10495a;

        public b(Map map) {
            this.f10495a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            x.b(x.this, true);
            x.c(x.this, this.f10495a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f10496a;

        public c(Map map) {
            this.f10496a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                x.e(x.this, this.f10496a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                x.f(x.this, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                x.f(x.this, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f10499a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        public f(float f, int i, int i2) {
            this.f10499a = f;
            this.b = i;
            this.c = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                x.g(x.this, this.f10499a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final String f10500a = uz8.a();
        public final com.taobao.falco.d b;
        public final o c;
        public final r d;
        public final com.taobao.falco.c e;

        public g(com.taobao.falco.d dVar, o oVar, r rVar, com.taobao.falco.c cVar) {
            this.b = dVar;
            this.c = oVar;
            this.d = rVar;
            this.e = cVar;
        }
    }

    public x(FalcoEnvironmentImpl falcoEnvironmentImpl) {
        com.taobao.falco.d dVar = new com.taobao.falco.d();
        dVar.f10461a = Runtime.getRuntime().availableProcessors();
        this.f10493a = falcoEnvironmentImpl;
        this.b = new g(dVar, new o(), new r(), new com.taobao.falco.c());
    }

    private void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8cb61d3", new Object[]{this});
            return;
        }
        g gVar = new g(this.b.b, v(), w(), t());
        FalcoEnvironmentImpl falcoEnvironmentImpl = this.f10493a;
        falcoEnvironmentImpl.p("CpuInfo Init|falcoId=" + gVar.f10500a + ", " + gVar.b);
        FalcoEnvironmentImpl falcoEnvironmentImpl2 = this.f10493a;
        falcoEnvironmentImpl2.p("MemoryInfo Init|falcoId=" + gVar.f10500a + ", " + gVar.c);
        FalcoEnvironmentImpl falcoEnvironmentImpl3 = this.f10493a;
        falcoEnvironmentImpl3.p("StorageInfo Init|falcoId=" + gVar.f10500a + ", " + gVar.d);
        FalcoEnvironmentImpl falcoEnvironmentImpl4 = this.f10493a;
        falcoEnvironmentImpl4.p("BatteryInfo Init|falcoId=" + gVar.f10500a + ", " + gVar.e);
        D(gVar, "");
        this.f10493a.r(gVar.b, gVar.c, gVar.d, gVar.e);
        crt.e(this, 10000L, TimeUnit.MILLISECONDS);
    }

    private static void B(com.taobao.falco.c cVar, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b3bc5e2", new Object[]{cVar, intent});
        } else if (intent != null) {
            int intExtra = intent.getIntExtra(m09.TASK_TYPE_LEVEL, -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            int intExtra3 = intent.getIntExtra("temperature", -1);
            int intExtra4 = intent.getIntExtra("plugged", -1);
            if (!(intExtra == -1 || intExtra2 == -1)) {
                cVar.b = (int) ((intExtra / intExtra2) * 100.0f);
            }
            if (intExtra3 != -1) {
                cVar.d = intExtra3;
            }
            cVar.f10460a = u(intExtra4, cVar.b);
        }
    }

    public static /* synthetic */ void a(x xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b55fb01f", new Object[]{xVar});
        } else {
            xVar.A();
        }
    }

    public static /* synthetic */ boolean b(x xVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5bbaa69c", new Object[]{xVar, new Boolean(z)})).booleanValue();
        }
        xVar.f = z;
        return z;
    }

    public static /* synthetic */ void c(x xVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3b1a308", new Object[]{xVar, map});
        } else {
            xVar.m(map);
        }
    }

    public static /* synthetic */ void e(x xVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4676fc9", new Object[]{xVar, map});
        } else {
            xVar.l(map);
        }
    }

    public static /* synthetic */ void f(x xVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("611a1099", new Object[]{xVar, new Boolean(z)});
        } else {
            xVar.n(z);
        }
    }

    public static /* synthetic */ void g(x xVar, float f2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f746fee6", new Object[]{xVar, new Float(f2), new Integer(i), new Integer(i2)});
        } else {
            xVar.k(f2, i, i2);
        }
    }

    private void k(float f2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6521d2", new Object[]{this, new Float(f2), new Integer(i), new Integer(i2)});
            return;
        }
        g gVar = this.b;
        com.taobao.falco.c cVar = gVar.e;
        int u = u(i, i2);
        int i3 = (int) (f2 * 10.0f);
        int q = q();
        if (u != cVar.f10460a || i2 != cVar.b || i3 != cVar.d || q != cVar.c) {
            com.taobao.falco.c cVar2 = new com.taobao.falco.c();
            cVar2.f10460a = u;
            cVar2.b = i2;
            cVar2.c = q;
            cVar2.d = i3;
            g gVar2 = new g(gVar.b, gVar.c, gVar.d, cVar2);
            D(gVar2, "BatteryInfo Update|falcoId=" + gVar2.f10500a + ", " + cVar2);
            this.f10493a.r(cVar2);
        }
    }

    private void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b028b599", new Object[]{this, new Boolean(z)});
            return;
        }
        g gVar = this.b;
        com.taobao.falco.c cVar = gVar.e;
        com.taobao.falco.c cVar2 = new com.taobao.falco.c();
        cVar2.f10460a = cVar.f10460a;
        cVar2.b = cVar.b;
        cVar2.c = z ? 1 : 0;
        cVar2.d = cVar.d;
        g gVar2 = new g(gVar.b, gVar.c, gVar.d, cVar2);
        D(gVar2, "BatteryInfo Update|falcoId=" + gVar2.f10500a + ", lowPowerMode=" + cVar2.c);
        this.f10493a.r(cVar2);
    }

    private static int q() {
        PowerManager powerManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a488f6d5", new Object[0])).intValue();
        }
        Context a2 = yy8.a();
        if (a2 == null || (powerManager = (PowerManager) a2.getSystemService("power")) == null) {
            return -1;
        }
        return powerManager.isPowerSaveMode() ? 1 : 0;
    }

    private static com.taobao.falco.c t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.falco.c) ipChange.ipc$dispatch("4d6d084b", new Object[0]);
        }
        com.taobao.falco.c cVar = new com.taobao.falco.c();
        cVar.c = q();
        Context a2 = yy8.a();
        if (a2 != null) {
            try {
                B(cVar, a2.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")));
            } catch (Exception e2) {
                ALog.e(FalcoEnvironmentImpl.TAG, "[obtainBatteryInfo] error", null, e2, new Object[0]);
            }
        }
        return cVar;
    }

    private static int u(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f2ab023", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        if (i <= 0) {
            return i;
        }
        if (i2 == 100) {
            return 2;
        }
        return 1;
    }

    private static o v() {
        ActivityManager activityManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o) ipChange.ipc$dispatch("65d613c3", new Object[0]);
        }
        o oVar = new o();
        Context a2 = yy8.a();
        if (!(a2 == null || (activityManager = (ActivityManager) a2.getSystemService("activity")) == null)) {
            try {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                oVar.f10474a = memoryInfo.totalMem >> 20;
                oVar.b = memoryInfo.availMem >> 20;
                oVar.h = memoryInfo.lowMemory ? 1 : 0;
            } catch (Exception e2) {
                ALog.e(FalcoEnvironmentImpl.TAG, "[obtainMemoryInfo] error", null, e2, new Object[0]);
            }
            Runtime runtime = Runtime.getRuntime();
            long j = runtime.totalMemory();
            oVar.f = j >> 20;
            oVar.e = (j - runtime.freeMemory()) >> 20;
            oVar.g = runtime.maxMemory() >> 20;
        }
        return oVar;
    }

    private static r w() {
        File parentFile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r) ipChange.ipc$dispatch("b7c3338b", new Object[0]);
        }
        r rVar = new r();
        Context a2 = yy8.a();
        if (!(a2 == null || (parentFile = a2.getCacheDir().getParentFile()) == null)) {
            try {
                StatFs statFs = new StatFs(parentFile.getAbsolutePath());
                rVar.f10477a = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) >> 20;
                rVar.b = (statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) >> 20;
            } catch (Exception e2) {
                ALog.e(FalcoEnvironmentImpl.TAG, "[obtainStorageInfo] error", null, e2, new Object[0]);
            }
        }
        return rVar;
    }

    private static Float x(Object obj, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("65f20c8d", new Object[]{obj, new Float(f2)});
        }
        if (obj instanceof Float) {
            return (Float) obj;
        }
        return Float.valueOf(f2);
    }

    private static Long y(Object obj, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("66012927", new Object[]{obj, new Long(j)});
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        return Long.valueOf(j);
    }

    @Override // com.taobao.monitor.impl.trace.c.AbstractC0626c
    public void F(float f2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d77c72", new Object[]{this, new Float(f2), new Integer(i), new Integer(i2)});
        } else {
            crt.d(new f(f2, i, i2));
        }
    }

    @Override // com.taobao.monitor.impl.trace.c.AbstractC0626c
    public void J(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbfef539", new Object[]{this, str});
        }
    }

    @Override // com.taobao.application.common.IAppLaunchListener
    public void d(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60cba989", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i == 0) {
            if (i2 == 1) {
                zzb<?> a2 = ic.a(ic.BATTERY_DISPATCHER);
                if (a2 != null) {
                    a2.addListener(this);
                } else {
                    ALog.e(FalcoEnvironmentImpl.TAG, "[init] register battery listener error", null, new Object[0]);
                }
            } else if (i2 != 4) {
            } else {
                if (this.e) {
                    try {
                        EventCenter f2 = EventCenter.f();
                        if (f2 != null) {
                            f2.b(15, this);
                            f2.b(81, this);
                            f2.b(92, this);
                            f2.b(93, this);
                        } else {
                            ALog.e(FalcoEnvironmentImpl.TAG, "[onLaunchChanged] register cpu/power listener error: EventCenter is null", null, new Object[0]);
                        }
                    } catch (Exception e2) {
                        ALog.e(FalcoEnvironmentImpl.TAG, "[onLaunchChanged] register cpu/power listener error", null, e2, new Object[0]);
                    }
                } else {
                    ALog.e(FalcoEnvironmentImpl.TAG, "[onLaunchChanged] cpu listener not enabled", null, new Object[0]);
                }
            }
        }
    }

    public com.taobao.falco.c h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.falco.c) ipChange.ipc$dispatch("6be95670", new Object[]{this});
        }
        return this.b.e;
    }

    @Override // com.taobao.monitor.impl.trace.c.AbstractC0626c
    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50fe35c7", new Object[]{this, str});
        }
    }

    public com.taobao.falco.d j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.falco.d) ipChange.ipc$dispatch("bf26f10", new Object[]{this});
        }
        return this.b.b;
    }

    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41b6dcc1", new Object[]{this});
        }
        if (this.d) {
            return this.b.f10500a;
        }
        return "";
    }

    @Override // tb.n3c
    public void onEvent(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f16fb524", new Object[]{this, new Integer(i), map});
        } else if (i == 15) {
            crt.d(new b(map));
        } else if (i == 81) {
            crt.d(new c(map));
        } else if (i == 92) {
            crt.d(new d());
        } else if (i == 93) {
            crt.d(new e());
        }
    }

    public void p(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc123257", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.d = z;
        this.e = z2;
        crt.d(new a());
        c21.d(this);
    }

    public o r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o) ipChange.ipc$dispatch("7ae9a728", new Object[]{this});
        }
        return this.b.c;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (!this.f) {
            m(null);
            crt.e(this, 10000L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.taobao.monitor.impl.trace.c.AbstractC0626c
    public void s(String str, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2363ef", new Object[]{this, str, new Integer(i), new Long(j)});
        }
    }

    public r z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r) ipChange.ipc$dispatch("d63f81b0", new Object[]{this});
        }
        return this.b.d;
    }

    private void l(Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24c64704", new Object[]{this, map});
            return;
        }
        g gVar = this.b;
        com.taobao.falco.d dVar = gVar.b;
        com.taobao.falco.d dVar2 = new com.taobao.falco.d();
        dVar2.f10461a = dVar.f10461a;
        if (map != null) {
            dVar2.b = x(map.get("wholeCpuLoadRate"), -1.0f).floatValue();
            dVar2.c = x(map.get("processLoadRate"), -1.0f).floatValue();
        }
        g gVar2 = new g(dVar2, gVar.c, gVar.d, gVar.e);
        FalcoEnvironmentImpl falcoEnvironmentImpl = this.f10493a;
        falcoEnvironmentImpl.p("CpuInfo Update|falcoId=" + gVar2.f10500a + ", " + gVar2.b);
        D(gVar2, "");
        this.f10493a.r(gVar2.b);
    }

    private void m(Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1723c19b", new Object[]{this, map});
            return;
        }
        g gVar = this.b;
        o v = v();
        if (map != null) {
            long j = -1;
            long longValue = y(map.get("pss"), -1L).longValue();
            long longValue2 = y(map.get("nativeHeapSize"), -1L).longValue();
            v.c = longValue > 0 ? longValue >> 20 : -1L;
            if (longValue2 > 0) {
                j = longValue2 >> 20;
            }
            v.d = j;
        }
        g gVar2 = new g(gVar.b, v, gVar.d, gVar.e);
        FalcoEnvironmentImpl falcoEnvironmentImpl = this.f10493a;
        falcoEnvironmentImpl.p("MemoryInfo Update|falcoId=" + gVar2.f10500a + ", " + gVar2.c);
        D(gVar2, "");
        this.f10493a.r(gVar2.c);
    }

    private void D(g gVar, String str) {
        g gVar2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab0b9fb0", new Object[]{this, gVar, str});
            return;
        }
        this.b = gVar;
        if (this.d) {
            if (!this.c) {
                this.c = true;
                MeasureSet create = MeasureSet.create();
                create.addMeasure("cpuCores");
                create.addMeasure("deviceCpuUsage");
                create.addMeasure("appCpuUsage");
                create.addMeasure("memTotal");
                create.addMeasure("memFree");
                create.addMeasure("javaMemUsage");
                create.addMeasure("isLowMemory");
                create.addMeasure("diskTotal");
                create.addMeasure("diskFree");
                create.addMeasure("batteryState");
                create.addMeasure(bjo.BATTERY_CAPACITY);
                create.addMeasure("lowPowerMode");
                create.addMeasure("temperature");
                str2 = "appCpuUsage";
                DimensionSet create2 = DimensionSet.create();
                create2.addDimension("falcoId");
                str4 = "falcoId";
                str6 = g;
                str5 = FalcoEnvironmentImpl.MONITOR_MODULE;
                str3 = "temperature";
                z61.i(str5, str6, create, create2, true);
            } else {
                str2 = "appCpuUsage";
                str4 = "falcoId";
                str6 = g;
                str5 = FalcoEnvironmentImpl.MONITOR_MODULE;
                str3 = "temperature";
            }
            MeasureValueSet create3 = MeasureValueSet.create();
            gVar2 = gVar;
            create3.setValue("cpuCores", gVar2.b.f10461a);
            create3.setValue("deviceCpuUsage", gVar2.b.b);
            create3.setValue(str2, gVar2.b.c);
            create3.setValue("memTotal", gVar2.c.f10474a);
            create3.setValue("memFree", gVar2.c.b);
            create3.setValue("javaMemUsage", gVar2.c.e);
            create3.setValue("isLowMemory", gVar2.c.h);
            create3.setValue("diskTotal", gVar2.d.f10477a);
            create3.setValue("diskFree", gVar2.d.b);
            create3.setValue("batteryState", gVar2.e.f10460a);
            create3.setValue(bjo.BATTERY_CAPACITY, gVar2.e.b);
            create3.setValue("lowPowerMode", gVar2.e.c);
            create3.setValue(str3, gVar2.e.d);
            DimensionValueSet create4 = DimensionValueSet.create();
            create4.setValue(str4, gVar2.f10500a);
            z61.f(str5, str6, create4, create3);
        } else {
            gVar2 = gVar;
        }
        this.f10493a.p(str);
        this.f10493a.u(FalcoEnvironmentImpl.Category.SYSTEM_LOAD, gVar2.f10500a);
    }
}
