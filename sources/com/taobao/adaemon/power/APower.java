package com.taobao.adaemon.power;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.TrafficStats;
import android.os.Build;
import android.os.PowerManager;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.LocalProcessMonitor;
import com.taobao.adaemon.ProcessController;
import com.taobao.adaemon.e;
import com.taobao.adaemon.g;
import com.taobao.adaemon.power.APower;
import com.taobao.adaemon.power.a;
import com.taobao.adaemon.power.b;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.atools.StaticHook;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.android.agoo.common.AgooConstants;
import tb.cp;
import tb.eti;
import tb.hkq;
import tb.m09;
import tb.mf;
import tb.o41;
import tb.oxn;
import tb.pg1;
import tb.qti;
import tb.rti;
import tb.s55;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class APower {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE_ALARM = "alarm";
    public static final String TYPE_CPU = "cpu";
    public static final String TYPE_NET = "net";
    public static final String TYPE_SENSOR = "sensor";
    public static final String TYPE_WAKELOCK = "wlock";
    public static final String TYPE_WIFI = "wifi";
    public double d;
    public double e;
    public int f = -1;

    /* renamed from: a  reason: collision with root package name */
    public final e f6158a = new c();
    public final e b = new d();
    public final e c = new f();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b extends rti {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(APower aPower) {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/adaemon/power/APower$2");
        }

        @Override // tb.rti
        public void c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cdbda4f4", new Object[]{this, new Integer(i)});
                return;
            }
            s55.i("APower", "mi thermal changed", m09.TASK_TYPE_LEVEL, Integer.valueOf(i));
            String str = com.taobao.adaemon.e.b;
            hkq.b(com.taobao.adaemon.e.MODULE_NAME, str, "mi_thermal_" + i, vu3.b.GEO_NOT_SUPPORT);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c extends e {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int c;
        public long d;
        public long e;
        public long f;
        public long g;
        public long h;
        public long i;
        public long j;
        public long k;
        public List<b.a> l = null;
        public long m = 0;
        public long n = 0;
        public long o = 0;

        static {
            t2o.a(349175913);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/adaemon/power/APower$CPUPower");
        }

        @Override // com.taobao.adaemon.power.APower.e
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d199e93d", new Object[]{this});
                return;
            }
            SharedPreferences b = b();
            b.edit().putLong(e.KEY_CPU_USER_MAIN_TOTAL, b.getLong(e.KEY_CPU_USER_MAIN_TOTAL, 0L) + b.getLong(e.KEY_CPU_USER_MAIN, 0L)).putLong(e.KEY_CPU_SYS_MAIN_TOTAL, b.getLong(e.KEY_CPU_SYS_MAIN_TOTAL, 0L) + b.getLong(e.KEY_CPU_SYS_MAIN, 0L)).putLong(e.KEY_CPU_USER_CHANNEL_TOTAL, b.getLong(e.KEY_CPU_USER_CHANNEL_TOTAL, 0L) + b.getLong(e.KEY_CPU_USER_CHANNEL, 0L)).putLong(e.KEY_CPU_SYS_CHANNEL_TOTAL, b.getLong(e.KEY_CPU_SYS_CHANNEL_TOTAL, 0L) + b.getLong(e.KEY_CPU_SYS_CHANNEL, 0L)).remove(e.KEY_CPU_USER_MAIN).remove(e.KEY_CPU_SYS_MAIN).remove(e.KEY_CPU_USER_CHANNEL).remove(e.KEY_CPU_SYS_CHANNEL).commit();
        }

        @Override // com.taobao.adaemon.power.APower.e
        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("398d003b", new Object[]{this});
            }
            return APower.TYPE_CPU;
        }

        public final List<b.a> g(List<b.a> list, List<b.a> list2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("6bb18a99", new Object[]{this, list, list2});
            }
            if (list == null || list.size() == 0 || list2 == null || list2.size() == 0) {
                return null;
            }
            HashMap hashMap = new HashMap();
            for (b.a aVar : list) {
                hashMap.put(Integer.valueOf(aVar.f6165a), aVar);
            }
            for (b.a aVar2 : list2) {
                b.a aVar3 = (b.a) hashMap.get(Integer.valueOf(aVar2.f6165a));
                if (aVar3 == null) {
                    aVar2.e = aVar2.c;
                    aVar2.f = aVar2.d;
                } else {
                    long j = aVar2.c - aVar3.c;
                    aVar2.e = j;
                    long j2 = 0;
                    if (j <= 0) {
                        j = 0;
                    }
                    aVar2.e = j;
                    long j3 = aVar2.d - aVar3.d;
                    aVar2.f = j3;
                    if (j3 > 0) {
                        j2 = j3;
                    }
                    aVar2.f = j2;
                }
            }
            Collections.sort(list2, b.a.COMPARATOR_BY_CPU_DIFF_TIME_DESCENDING);
            return list2;
        }

        @Override // com.taobao.adaemon.power.APower.e
        public a.C0318a f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a.C0318a) ipChange.ipc$dispatch("bf9a125a", new Object[]{this});
            }
            a.C0318a aVar = null;
            try {
                a.b i = i();
                Context l = g.l();
                if (this.f6161a) {
                    long j = i.e;
                    long j2 = i.f;
                    if (j + j2 > 0) {
                        aVar = j(j, j2);
                    }
                }
                if (i.c + i.d > 0) {
                    ProcessController.getInstance().tryDumpMain(l, i.c, i.d);
                }
            } catch (Throwable th) {
                s55.h("APower", "tryDump", th, new Object[0]);
            }
            return aVar;
        }

        public a.b i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a.b) ipChange.ipc$dispatch("9310a63f", new Object[]{this});
            }
            a.b bVar = new a.b(APower.TYPE_CPU, 0);
            bVar.c = this.b.getLong(e.KEY_CPU_USER_MAIN, 0L);
            bVar.d = this.b.getLong(e.KEY_CPU_SYS_MAIN, 0L);
            bVar.e = this.b.getLong(e.KEY_CPU_USER_CHANNEL, 0L);
            bVar.f = this.b.getLong(e.KEY_CPU_SYS_CHANNEL, 0L);
            return bVar;
        }

        @Override // com.taobao.adaemon.power.APower.e
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d34c2212", new Object[]{this});
                return;
            }
            Context l = g.l();
            int z = g.z(l);
            this.c = z;
            Pair<Long, Long> mainProcCpuTime = z > 0 ? ProcessController.getInstance().getMainProcCpuTime(l) : null;
            if (mainProcCpuTime != null) {
                this.d = ((Long) mainProcCpuTime.first).longValue();
                this.e = ((Long) mainProcCpuTime.second).longValue();
            } else {
                this.d = 0L;
                this.e = 0L;
            }
            Pair<Long, Long> n = g.n();
            if (n != null) {
                this.f = ((Long) n.first).longValue();
                this.g = ((Long) n.second).longValue();
            } else {
                this.f = 0L;
                this.g = 0L;
            }
            long j = this.d;
            this.h = j;
            this.i = this.e;
            this.j = this.f;
            this.k = this.g;
            this.l = null;
            this.m = 0L;
            this.n = 0L;
            s55.i("APower", "CPU.reset()", "uTimeMain", Long.valueOf(j), "sTimeMain", Long.valueOf(this.e), "uTimeChannel", Long.valueOf(this.f), "sTimeChannel", Long.valueOf(this.g));
        }

        @Override // com.taobao.adaemon.power.APower.e
        public void d() {
            long j;
            long j2;
            long j3;
            long j4;
            long j5;
            long j6;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2bbb6058", new Object[]{this});
                return;
            }
            Context l = g.l();
            int z = g.z(l);
            int myPid = Process.myPid();
            Pair<Long, Long> mainProcCpuTime = z > 0 ? ProcessController.getInstance().getMainProcCpuTime(l) : null;
            if (mainProcCpuTime != null) {
                j2 = ((Long) mainProcCpuTime.first).longValue();
                j = ((Long) mainProcCpuTime.second).longValue();
            } else {
                j2 = 0;
                j = 0;
            }
            Pair<Long, Long> n = g.n();
            if (n != null) {
                j3 = ((Long) n.first).longValue();
                j4 = ((Long) n.second).longValue();
            } else {
                j4 = 0;
                j3 = 0;
            }
            int i = b().getInt(e.KEY_PID_CHANNEL, 0);
            int i2 = b().getInt(e.KEY_PID_MAIN, 0);
            if (myPid != i) {
                a();
                if (z > 0 && i2 == z && this.c != z) {
                    this.d = j2;
                    this.e = j;
                    this.f = j3;
                    this.g = j4;
                }
            } else if (z > 0 && i2 != z) {
                a();
                long j7 = this.j;
                if (j7 > 0) {
                    this.f = j7;
                    this.g = this.k;
                }
            }
            h();
            int i3 = this.c;
            long j8 = z == i3 ? j2 - this.d : j2;
            if (z == i3) {
                j6 = j - this.e;
                j5 = j;
            } else {
                j6 = j;
                j5 = j6;
            }
            long j9 = j3 - this.f;
            long j10 = j4 - this.g;
            long j11 = 0;
            if (z <= 0) {
                this.d = 0L;
                this.e = 0L;
            }
            this.c = z;
            if (j8 <= 0) {
                j8 = 0;
            }
            long j12 = j6 > 0 ? j6 : 0L;
            if (j9 <= 0) {
                j9 = 0;
            }
            if (j10 > 0) {
                j11 = j10;
            }
            b().edit().putInt(e.KEY_DAY, Calendar.getInstance().get(6)).putInt(e.KEY_PID_MAIN, z).putInt(e.KEY_PID_CHANNEL, myPid).putLong(e.KEY_CPU_USER_MAIN, j8).putLong(e.KEY_CPU_SYS_MAIN, j12).putLong(e.KEY_CPU_USER_CHANNEL, j9).putLong(e.KEY_CPU_SYS_CHANNEL, j11).commit();
            this.h = j2;
            this.i = j5;
            this.j = j3;
            this.k = j4;
            s55.i("APower", "CPU.record()", "uMain", Long.valueOf(j8), "sMain", Long.valueOf(j12), "uChannel", Long.valueOf(j9), "sChannel", Long.valueOf(j11));
        }

        public void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("730c1fbb", new Object[]{this});
                return;
            }
            SharedPreferences b = b();
            int i = b.getInt(e.KEY_DAY, -1);
            int i2 = Calendar.getInstance().get(6);
            if (i > 0 && i2 != i) {
                a.b bVar = new a.b(APower.TYPE_CPU, i2 - i);
                bVar.c = b.getLong(e.KEY_CPU_USER_MAIN_TOTAL, 0L) + b.getLong(e.KEY_CPU_USER_MAIN, 0L);
                bVar.d = b.getLong(e.KEY_CPU_SYS_MAIN_TOTAL, 0L) + b.getLong(e.KEY_CPU_SYS_MAIN, 0L);
                bVar.e = b.getLong(e.KEY_CPU_USER_CHANNEL_TOTAL, 0L) + b.getLong(e.KEY_CPU_USER_CHANNEL, 0L);
                bVar.f = b.getLong(e.KEY_CPU_SYS_CHANNEL_TOTAL, 0L) + b.getLong(e.KEY_CPU_SYS_CHANNEL_TOTAL, 0L);
                bVar.a();
                s55.i("APower", "CPU.report()", "uTimeMain", Long.valueOf(bVar.c), "sTimeMain", Long.valueOf(bVar.d), "uTimeChannel", Long.valueOf(bVar.e), "sTimeChannel", Long.valueOf(bVar.f));
                b.edit().remove(e.KEY_CPU_USER_MAIN_TOTAL).remove(e.KEY_CPU_SYS_MAIN_TOTAL).remove(e.KEY_CPU_USER_CHANNEL_TOTAL).remove(e.KEY_CPU_SYS_CHANNEL_TOTAL).remove(e.KEY_CPU_USER_MAIN).remove(e.KEY_CPU_SYS_MAIN).remove(e.KEY_CPU_USER_CHANNEL).remove(e.KEY_CPU_SYS_CHANNEL).commit();
                long j = this.h;
                if (j > 0) {
                    this.d = j;
                    this.e = this.i;
                }
                long j2 = this.j;
                if (j2 > 0) {
                    this.f = j2;
                    this.g = this.k;
                }
            }
        }

        public a.C0318a j(long j, long j2) {
            String str;
            String str2;
            char c;
            List<b.a> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a.C0318a) ipChange.ipc$dispatch("c66c1922", new Object[]{this, new Long(j), new Long(j2)});
            }
            int myPid = Process.myPid();
            Context l = g.l();
            boolean z = this.f6161a;
            if (z) {
                str = "c_dump_day";
            } else {
                str = "m_dump_day";
            }
            if (z) {
                str2 = "c_dump_times";
            } else {
                str2 = "m_dump_times";
            }
            int p = oxn.s().p();
            if (this.f6161a) {
                p /= 2;
            }
            if (g.F(l, "power", str, str2, null) > 5) {
                s55.i("APower", "isChannel", Boolean.valueOf(this.f6161a), "cpu dump max");
                return null;
            } else if (SystemClock.elapsedRealtime() - this.o <= 120000) {
                s55.i("APower", "isChannel", Boolean.valueOf(this.f6161a), "cpu dump freq");
                return null;
            } else {
                s55.i("APower", "tryDumpCurrProc", "isChannel", Boolean.valueOf(this.f6161a), "uTime", Long.valueOf(j), "sTime", Long.valueOf(j2), MspDBHelper.BizEntry.COLUMN_NAME_PID, Integer.valueOf(myPid));
                if (this.m != 0) {
                    long elapsedRealtime = (((j + j2) - this.n) * 3600000) / (SystemClock.elapsedRealtime() - this.m);
                    s55.i("APower", "tryDumpCurrProc", "isChannel", Boolean.valueOf(this.f6161a), "cpuTimePerHour", Long.valueOf(elapsedRealtime), "cpuDumpLevel", Integer.valueOf(p));
                    if (elapsedRealtime < p) {
                        return null;
                    }
                }
                List<b.a> c2 = com.taobao.adaemon.power.b.c(myPid);
                g.J(l, str, str2, null);
                if (this.l == null) {
                    this.l = c2;
                    this.m = SystemClock.elapsedRealtime();
                    this.n = j + j2;
                    s55.i("APower", "lastProcStats", "isChannel", Boolean.valueOf(this.f6161a), "firstSnapshotTime", Long.valueOf(this.m), "firstCpuTime", Long.valueOf(this.n), "lastProcStats", this.l.toString());
                    return null;
                }
                this.o = SystemClock.elapsedRealtime();
                List<b.a> g = g(this.l, c2);
                if (g != null) {
                    int size = g.size();
                    if (size > 10) {
                        size = 10;
                    }
                    c = 0;
                    list = g.subList(0, size);
                } else {
                    c = 0;
                    list = null;
                }
                if (list == null || list.size() <= 0) {
                    return null;
                }
                Boolean valueOf = Boolean.valueOf(this.f6161a);
                Integer valueOf2 = Integer.valueOf(list.size());
                Object[] objArr = new Object[6];
                objArr[c] = "isChannel";
                objArr[1] = valueOf;
                objArr[2] = "count";
                objArr[3] = valueOf2;
                objArr[4] = "busyThreads";
                objArr[5] = list;
                s55.i("APower", "cpu active", objArr);
                a.C0318a aVar = new a.C0318a();
                aVar.b = j + "|" + j2;
                aVar.c = list.toString();
                aVar.f6163a = APower.TYPE_CPU;
                return aVar;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static abstract class e {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String KEY_CPU_SYS_CHANNEL = "s_c";
        public static final String KEY_CPU_SYS_CHANNEL_TOTAL = "s_c_t";
        public static final String KEY_CPU_SYS_MAIN = "s_m";
        public static final String KEY_CPU_SYS_MAIN_TOTAL = "s_m_t";
        public static final String KEY_CPU_USER_CHANNEL = "u_c";
        public static final String KEY_CPU_USER_CHANNEL_TOTAL = "u_c_t";
        public static final String KEY_CPU_USER_MAIN = "u_m";
        public static final String KEY_CPU_USER_MAIN_TOTAL = "u_m_t";
        public static final String KEY_DAY = "day";
        public static final String KEY_DURATION = "dur";
        public static final String KEY_DURATION_TOTAL = "dur_t";
        public static final String KEY_PID_CHANNEL = "pid_channel";
        public static final String KEY_PID_MAIN = "pid_main";
        public static final String KEY_RX = "rx";
        public static final String KEY_RX_TOTAL = "rx_t";
        public static final String KEY_TX = "tx";
        public static final String KEY_TX_TOTAL = "tx_t";

        /* renamed from: a  reason: collision with root package name */
        public boolean f6161a;
        public SharedPreferences b;

        static {
            t2o.a(349175915);
        }

        public abstract void a();

        public SharedPreferences b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences) ipChange.ipc$dispatch("25a999ae", new Object[]{this});
            }
            if (this.b == null) {
                Context l = g.l();
                this.b = l.getSharedPreferences("adaemon_energy_" + c(), 0);
            }
            return this.b;
        }

        public abstract String c();

        public abstract void d();

        public abstract void e();

        public abstract a.C0318a f();
    }

    static {
        t2o.a(349175909);
    }

    public static /* synthetic */ double c(APower aPower) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("227374d", new Object[]{aPower})).doubleValue();
        }
        return aPower.d;
    }

    public static /* synthetic */ double d(APower aPower, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d4c2032f", new Object[]{aPower, new Double(d2)})).doubleValue();
        }
        aPower.d = d2;
        return d2;
    }

    public static /* synthetic */ double e(APower aPower) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5945282c", new Object[]{aPower})).doubleValue();
        }
        return aPower.e;
    }

    public static /* synthetic */ double f(APower aPower, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("61622e30", new Object[]{aPower, new Double(d2)})).doubleValue();
        }
        aPower.e = d2;
        return d2;
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8eb83aac", new Object[0])).booleanValue();
        }
        if (!oxn.s().G() || !g.O()) {
            return false;
        }
        return true;
    }

    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e073e78", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.b.e();
            this.f6158a.f6161a = true;
        } else {
            this.c.e();
            i();
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4442f16e", new Object[]{this});
        } else if (cp.h(g.l())) {
            mf.g().execute(new Runnable() { // from class: tb.ad
                @Override // java.lang.Runnable
                public final void run() {
                    APower.this.j();
                }
            });
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d extends e {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AtomicBoolean g = new AtomicBoolean();
        public long c;
        public long d;
        public long e;
        public long f;

        static {
            t2o.a(349175914);
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/adaemon/power/APower$NetworkPower");
        }

        @Override // com.taobao.adaemon.power.APower.e
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d199e93d", new Object[]{this});
                return;
            }
            SharedPreferences b = b();
            b.edit().putLong(e.KEY_RX_TOTAL, b.getLong(e.KEY_RX_TOTAL, 0L) + b.getLong(e.KEY_RX, 0L)).putLong(e.KEY_TX_TOTAL, b.getLong(e.KEY_TX_TOTAL, 0L) + b.getLong(e.KEY_TX, 0L)).remove(e.KEY_RX).remove(e.KEY_TX).commit();
        }

        @Override // com.taobao.adaemon.power.APower.e
        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("398d003b", new Object[]{this});
            }
            return "net";
        }

        @Override // com.taobao.adaemon.power.APower.e
        public a.C0318a f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a.C0318a) ipChange.ipc$dispatch("bf9a125a", new Object[]{this});
            }
            return null;
        }

        @Override // com.taobao.adaemon.power.APower.e
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2bbb6058", new Object[]{this});
            } else if (g.get()) {
                int myUid = Process.myUid();
                long uidRxBytes = TrafficStats.getUidRxBytes(myUid);
                long uidTxBytes = TrafficStats.getUidTxBytes(myUid);
                int i = b().getInt(e.KEY_PID_CHANNEL, 0);
                int myPid = Process.myPid();
                if (myPid != i) {
                    a();
                }
                g();
                b().edit().putInt(e.KEY_DAY, Calendar.getInstance().get(6)).putInt(e.KEY_PID_CHANNEL, myPid).putLong(e.KEY_RX, uidRxBytes - this.c).putLong(e.KEY_TX, uidTxBytes - this.d).commit();
                this.e = uidRxBytes;
                this.f = uidTxBytes;
                s55.i("APower", "NetworkPower.record()", "rxBytes", Long.valueOf(uidRxBytes - this.c), "txBytes", Long.valueOf(uidTxBytes - this.d));
            }
        }

        @Override // com.taobao.adaemon.power.APower.e
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d34c2212", new Object[]{this});
                return;
            }
            int myUid = Process.myUid();
            this.c = TrafficStats.getUidRxBytes(myUid);
            long uidTxBytes = TrafficStats.getUidTxBytes(myUid);
            this.d = uidTxBytes;
            long j = this.c;
            this.e = j;
            this.f = uidTxBytes;
            s55.i("APower", "NetworkPower.reset()", "rxBytes", Long.valueOf(j), "txBytes", Long.valueOf(this.d));
            g.set(true);
        }

        public void g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("730c1fbb", new Object[]{this});
                return;
            }
            SharedPreferences b = b();
            int i = b.getInt(e.KEY_DAY, -1);
            int i2 = Calendar.getInstance().get(6);
            if (i > 0 && i2 != i) {
                a.b bVar = new a.b("net", i2 - i);
                bVar.g = b.getLong(e.KEY_RX_TOTAL, 0L) + b.getLong(e.KEY_RX, 0L);
                bVar.h = b.getLong(e.KEY_TX_TOTAL, 0L) + b.getLong(e.KEY_TX, 0L);
                bVar.a();
                s55.i("APower", "NetworkPower.report()", "rxBytes", Long.valueOf(bVar.g), "txBytes", Long.valueOf(bVar.h));
                b.edit().remove(e.KEY_RX_TOTAL).remove(e.KEY_TX_TOTAL).remove(e.KEY_RX).remove(e.KEY_TX).commit();
                long j = this.e;
                if (j > 0) {
                    this.c = j;
                    this.d = this.f;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class f extends e {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int delaySecs = 3;
        public static Field g;
        public static Field h;
        public static boolean i;
        public final AtomicBoolean c = new AtomicBoolean();
        public long d;
        public long e;
        public static final ConcurrentHashMap<Integer, WeakReference<Object>> sysSensorMap = new ConcurrentHashMap<>();
        public static final AtomicBoolean f = new AtomicBoolean();

        static {
            t2o.a(349175916);
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/adaemon/power/APower$SensorPower");
        }

        public static /* synthetic */ Object k(Object obj, Object obj2, Method method, Object[] objArr) throws Throwable {
            if (!"getService".equals(method.getName())) {
                return method.invoke(obj, objArr);
            }
            Object invoke = method.invoke(obj, objArr);
            if (invoke != null) {
                sysSensorMap.put(Integer.valueOf(invoke.hashCode()), new WeakReference<>(invoke));
            }
            return invoke;
        }

        @Override // com.taobao.adaemon.power.APower.e
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d199e93d", new Object[]{this});
            } else if (APower.g()) {
                SharedPreferences b = b();
                long j = b.getLong("dur", 0L);
                if (j > 0) {
                    b.edit().putLong(e.KEY_DURATION_TOTAL, b.getLong(e.KEY_DURATION_TOTAL, 0L) + j).remove("dur").commit();
                }
            }
        }

        @Override // com.taobao.adaemon.power.APower.e
        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("398d003b", new Object[]{this});
            }
            return APower.TYPE_SENSOR;
        }

        @Override // com.taobao.adaemon.power.APower.e
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d34c2212", new Object[]{this});
            } else if (APower.g()) {
                if (!f.getAndSet(true)) {
                    j();
                    this.d = SystemClock.elapsedRealtime();
                } else if (i) {
                    this.c.set(true);
                    mf.g().schedule(new Runnable() { // from class: tb.dd
                        @Override // java.lang.Runnable
                        public final void run() {
                            APower.f.this.l();
                        }
                    }, 3L, TimeUnit.SECONDS);
                }
            }
        }

        @Override // com.taobao.adaemon.power.APower.e
        public a.C0318a f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a.C0318a) ipChange.ipc$dispatch("bf9a125a", new Object[]{this});
            }
            return null;
        }

        public final /* synthetic */ void l() {
            long j;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96d2b102", new Object[]{this});
                return;
            }
            this.c.set(false);
            if (i()) {
                j = SystemClock.elapsedRealtime();
            } else {
                j = 0;
            }
            this.d = j;
            this.e = j;
        }

        @Override // com.taobao.adaemon.power.APower.e
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2bbb6058", new Object[]{this});
            } else if (APower.g() && i && !this.c.get()) {
                int i2 = b().getInt(e.KEY_PID_MAIN, 0);
                int myPid = Process.myPid();
                if (myPid != i2) {
                    a();
                }
                m();
                if (!i()) {
                    this.d = 0L;
                    this.e = 0L;
                    return;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (this.d == 0) {
                    this.d = elapsedRealtime;
                    return;
                }
                b().edit().putInt(e.KEY_DAY, Calendar.getInstance().get(6)).putInt(e.KEY_PID_MAIN, myPid).putLong("dur", elapsedRealtime - this.d).commit();
                this.e = elapsedRealtime;
                s55.i("APower", "SensorPower.record()", "duration", Long.valueOf(elapsedRealtime - this.d));
            }
        }

        public final boolean i() {
            boolean z;
            Throwable th;
            Object obj;
            String str;
            ConcurrentHashMap<Integer, WeakReference<Object>> concurrentHashMap = sysSensorMap;
            if (concurrentHashMap.isEmpty()) {
                return false;
            }
            try {
                if (g == null) {
                    Field i2 = StaticHook.i(Class.forName("android.hardware.SystemSensorManager"), "mSensorListeners");
                    g = i2;
                    if (i2 != null) {
                        i2.setAccessible(true);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                z = false;
            }
            if (g == null) {
                s55.i("APower", "sensorListenerField not found!", new Object[0]);
                return false;
            }
            Iterator<Map.Entry<Integer, WeakReference<Object>>> it = concurrentHashMap.entrySet().iterator();
            z = false;
            while (it.hasNext()) {
                try {
                    Map.Entry<Integer, WeakReference<Object>> next = it.next();
                    if (next.getValue().get() == null) {
                        it.remove();
                    } else {
                        HashMap hashMap = (HashMap) g.get(next.getValue().get());
                        if (hashMap != null && !hashMap.isEmpty()) {
                            try {
                                StringBuilder sb = new StringBuilder();
                                for (Object obj2 : hashMap.keySet()) {
                                    if (obj2 instanceof Proxy) {
                                        try {
                                            if (h == null) {
                                                Field declaredField = Proxy.class.getDeclaredField("h");
                                                h = declaredField;
                                                declaredField.setAccessible(true);
                                            }
                                            obj = h.get(obj2);
                                        } catch (Throwable unused) {
                                            obj = null;
                                        }
                                        if (obj == null) {
                                            str = pg1.ATOM_Proxy;
                                        } else {
                                            str = obj.getClass().getName();
                                        }
                                        sb.append(str);
                                    } else {
                                        sb.append(obj2.getClass().getName());
                                    }
                                    sb.append(",");
                                }
                                s55.i("APower", "hasSensorListener", "listeners", sb.toString());
                                z = true;
                            } catch (Throwable th3) {
                                th = th3;
                                z = true;
                                s55.h("APower", "hasSensorListener err", th, new Object[0]);
                                s55.i("APower", "hasSensorListener", AgooConstants.MESSAGE_FLAG, Boolean.valueOf(z));
                                return z;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            s55.i("APower", "hasSensorListener", AgooConstants.MESSAGE_FLAG, Boolean.valueOf(z));
            return z;
        }

        public final void j() {
            try {
                Field m = StaticHook.m(Class.forName("android.app.SystemServiceRegistry"), "SYSTEM_SERVICE_FETCHERS");
                m.setAccessible(true);
                Map map = (Map) m.get(null);
                final Object obj = map.get(APower.TYPE_SENSOR);
                map.put(APower.TYPE_SENSOR, Proxy.newProxyInstance(Class.class.getClassLoader(), new Class[]{Class.forName("android.app.SystemServiceRegistry$ServiceFetcher")}, new InvocationHandler() { // from class: tb.ed
                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj2, Method method, Object[] objArr) {
                        Object k;
                        k = APower.f.k(obj, obj2, method, objArr);
                        return k;
                    }
                }));
                i = true;
                s55.i("APower", "SensorPower init success", new Object[0]);
            } catch (Throwable th) {
                s55.h("APower", "SensorPower init err", th, new Object[0]);
            }
        }

        public void m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("730c1fbb", new Object[]{this});
                return;
            }
            SharedPreferences b = b();
            int i2 = b.getInt(e.KEY_DAY, -1);
            int i3 = Calendar.getInstance().get(6);
            if (i2 > 0 && i3 != i2) {
                a.b bVar = new a.b(APower.TYPE_SENSOR, i3 - i2);
                bVar.i = b.getLong(e.KEY_DURATION_TOTAL, 0L) + b.getLong("dur", 0L);
                bVar.a();
                s55.i("APower", "SensorPower.report()", "duration", Long.valueOf(bVar.i));
                b.edit().remove(e.KEY_DURATION_TOTAL).remove("dur").commit();
                long j = this.e;
                if (j > 0) {
                    this.d = j;
                }
            }
        }
    }

    public final /* synthetic */ void j() {
        int currentThermalStatus;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2ea8e9d", new Object[]{this});
            return;
        }
        try {
            Context a2 = o41.a();
            PowerManager powerManager = (PowerManager) a2.getSystemService("power");
            if (Build.VERSION.SDK_INT >= 29) {
                currentThermalStatus = powerManager.getCurrentThermalStatus();
                this.f = currentThermalStatus;
                powerManager.addThermalStatusListener(new PowerManager.OnThermalStatusChangedListener() { // from class: tb.bd
                    @Override // android.os.PowerManager.OnThermalStatusChangedListener
                    public final void onThermalStatusChanged(int i) {
                        APower.this.l(i);
                    }
                });
                String str = Build.BRAND;
                if ("honor".equalsIgnoreCase(str)) {
                    eti.a(53, new a());
                    s55.i("APower", "honor addThermalStatusListener success", new Object[0]);
                } else if ("xiaomi".equalsIgnoreCase(str) || TBDeviceUtils.REDMI_MANUFACTURE_LOWER_CASE.equalsIgnoreCase(str)) {
                    qti.b(new b(this));
                }
            }
            a2.registerReceiver(new BroadcastReceiver() { // from class: com.taobao.adaemon.power.APower.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str2, Object... objArr) {
                    str2.hashCode();
                    int hashCode = str2.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/adaemon/power/APower$3");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        return;
                    }
                    intent.getIntExtra("plugged", -1);
                    double intExtra = intent.getIntExtra("temperature", 0) / 10.0d;
                    if (intExtra != APower.c(APower.this)) {
                        APower.d(APower.this, intExtra);
                        APower aPower = APower.this;
                        APower.f(aPower, Math.min(APower.e(aPower), intExtra));
                        s55.i("APower", "temperature changed", "temp", Double.valueOf(intExtra), "curPage", LocalProcessMonitor.h0().e0());
                    }
                }
            }, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (Throwable th) {
            s55.h("APower", "temp err", th, new Object[0]);
        }
    }

    public final /* synthetic */ void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2e51048", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            new e.g(LocalProcessMonitor.h0().e0(), com.taobao.adaemon.power.b.a(10), i, this.d).b();
            s55.i("APower", "onThermalStatusChangedImpl report", new Object[0]);
        } catch (Throwable th) {
            s55.h("APower", "onThermalStatusChangedImpl err", th, new Object[0]);
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("248e5c59", new Object[]{this});
        } else if (g() && g.F(g.l(), "power", "c_dump_day", "c_dump_times", null) + g.F(g.l(), "power", "m_dump_day", "m_dump_times", null) <= 10) {
            s55.i("APower", "start dumpAll", new Object[0]);
            a.C0318a f2 = this.f6158a.f();
            if (f2 != null && !TextUtils.isEmpty(f2.c)) {
                f2.a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements eti.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.eti.a
        public void onEvent(int i, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f16fb524", new Object[]{this, new Integer(i), map});
                return;
            }
            try {
                int parseInt = Integer.parseInt(map.get("status_ordinal").toString());
                s55.i("APower", "honor thermal changed", "status", Integer.valueOf(parseInt));
                APower.this.l(parseInt);
            } catch (Throwable th) {
                s55.h("APower", "honor onEvent err", th, new Object[0]);
            }
        }
    }

    public void l(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc5553d2", new Object[]{this, new Integer(i)});
        } else if (i < 2) {
            s55.i("APower", "onThermalStatusChangedImpl < 2", new Object[0]);
            this.f = i;
        } else {
            int i2 = this.f;
            if (i == i2) {
                s55.i("APower", "Thermal status not changed", "status", Integer.valueOf(i), "lastThermalStatus", Integer.valueOf(this.f));
            } else if (i < i2) {
                s55.i("APower", "onThermalStatusChangedImpl, status < lastThermalStatus", "status", Integer.valueOf(i), "lastThermalStatus", Integer.valueOf(this.f));
                this.f = i;
            } else {
                this.f = i;
                if (LocalProcessMonitor.h0().q0(g.l())) {
                    s55.i("APower", "onThermalStatusChangedImpl, bg now", new Object[0]);
                    return;
                }
                double d2 = this.d;
                double d3 = d2 - this.e;
                if (d3 < 5.0d) {
                    s55.i("APower", "onThermalStatusChangedImpl, temperature inc < 5°", "lastTemp", Double.valueOf(d2), "minTemp", Double.valueOf(this.e));
                } else if (i < 4 || d3 >= 10.0d) {
                    mf.g().execute(new Runnable() { // from class: tb.cd
                        @Override // java.lang.Runnable
                        public final void run() {
                            APower.this.k(i);
                        }
                    });
                } else {
                    s55.i("APower", "onThermalStatusChangedImpl, temperature inc < 10°", "status", Integer.valueOf(i), "lastTemp", Double.valueOf(this.d), "minTemp", Double.valueOf(this.e));
                }
            }
        }
    }
}
