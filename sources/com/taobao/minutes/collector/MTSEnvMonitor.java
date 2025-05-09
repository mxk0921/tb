package com.taobao.minutes.collector;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.TrafficStats;
import android.os.Build;
import android.os.PowerManager;
import android.os.Process;
import anet.channel.status.NetworkStatusHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.power.APower;
import com.taobao.tao.Globals;
import java.io.File;
import java.io.FileFilter;
import tb.bvh;
import tb.cvh;
import tb.euh;
import tb.eyl;
import tb.fvh;
import tb.guh;
import tb.ith;
import tb.jxl;
import tb.luh;
import tb.mp0;
import tb.oth;
import tb.p7o;
import tb.qth;
import tb.ruh;
import tb.tth;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MTSEnvMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile MTSEnvMonitor q;
    public luh b;
    public ruh c;
    public bvh d;
    public Object g;
    public BroadcastReceiver i;
    public jxl k;
    public NetworkStatusHelper.INetworkStatusChangeListener m;
    public NetworkStatusHelper.NetworkStatus n;
    public volatile long o;
    public volatile boolean p;
    public int e = -1;
    public int f = -1;
    public volatile int h = -1;
    public volatile int j = -1;
    public volatile int l = -1;

    /* renamed from: a  reason: collision with root package name */
    public final oth f11042a = new oth();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements NetworkStatusHelper.INetworkStatusChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
        public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4275ba3b", new Object[]{this, networkStatus});
                return;
            }
            if (!(MTSEnvMonitor.a(MTSEnvMonitor.this) == null || networkStatus == MTSEnvMonitor.a(MTSEnvMonitor.this))) {
                guh.a(guh.TAG, "网络有变化:旧:" + MTSEnvMonitor.a(MTSEnvMonitor.this) + " 新:" + networkStatus);
                oth c = MTSEnvMonitor.c(MTSEnvMonitor.this);
                c.b = c.b + 1;
            }
            MTSEnvMonitor.b(MTSEnvMonitor.this, networkStatus);
            MTSEnvMonitor.d(MTSEnvMonitor.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements jxl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.jxl
        public int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("cb1881df", new Object[]{this})).intValue();
            }
            return 2;
        }

        @Override // tb.jxl
        public int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fb96a19b", new Object[]{this})).intValue();
            }
            return 999;
        }

        @Override // tb.jxl
        public boolean c(eyl eylVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f29d0f9", new Object[]{this, eylVar})).booleanValue();
            }
            if (eylVar.f18894a == 2) {
                MTSEnvMonitor.e(MTSEnvMonitor.this, eylVar);
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements PowerManager.OnThermalStatusChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.os.PowerManager.OnThermalStatusChangedListener
        public void onThermalStatusChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6cf60d12", new Object[]{this, new Integer(i)});
                return;
            }
            if (i >= 2 && i > MTSEnvMonitor.f(MTSEnvMonitor.this).f16663a) {
                MTSEnvMonitor.f(MTSEnvMonitor.this).c++;
                guh.a(guh.DETAIL_LOG, "壳温上升:旧:" + MTSEnvMonitor.f(MTSEnvMonitor.this).f16663a + " 新:" + i);
            }
            MTSEnvMonitor.f(MTSEnvMonitor.this).f16663a = i;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements FileFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(MTSEnvMonitor mTSEnvMonitor) {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("50e018ca", new Object[]{this, file})).booleanValue();
            }
            String name = file.getName();
            if (!name.startsWith(APower.TYPE_CPU)) {
                return false;
            }
            for (int i = 3; i < name.length(); i++) {
                if (name.charAt(i) < '0' || name.charAt(i) > '9') {
                    return false;
                }
            }
            return true;
        }
    }

    public static /* synthetic */ NetworkStatusHelper.NetworkStatus a(MTSEnvMonitor mTSEnvMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkStatusHelper.NetworkStatus) ipChange.ipc$dispatch("418dfe17", new Object[]{mTSEnvMonitor});
        }
        return mTSEnvMonitor.n;
    }

    public static /* synthetic */ NetworkStatusHelper.NetworkStatus b(MTSEnvMonitor mTSEnvMonitor, NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkStatusHelper.NetworkStatus) ipChange.ipc$dispatch("bc501806", new Object[]{mTSEnvMonitor, networkStatus});
        }
        mTSEnvMonitor.n = networkStatus;
        return networkStatus;
    }

    public static /* synthetic */ oth c(MTSEnvMonitor mTSEnvMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oth) ipChange.ipc$dispatch("cd34ad84", new Object[]{mTSEnvMonitor});
        }
        return mTSEnvMonitor.f11042a;
    }

    public static /* synthetic */ void d(MTSEnvMonitor mTSEnvMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78c09394", new Object[]{mTSEnvMonitor});
        } else {
            mTSEnvMonitor.j();
        }
    }

    public static /* synthetic */ void e(MTSEnvMonitor mTSEnvMonitor, eyl eylVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72a4e144", new Object[]{mTSEnvMonitor, eylVar});
        } else {
            mTSEnvMonitor.p(eylVar);
        }
    }

    public static /* synthetic */ bvh f(MTSEnvMonitor mTSEnvMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bvh) ipChange.ipc$dispatch("62e82e4f", new Object[]{mTSEnvMonitor});
        }
        return mTSEnvMonitor.d;
    }

    public static MTSEnvMonitor n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MTSEnvMonitor) ipChange.ipc$dispatch("9a389c1f", new Object[0]);
        }
        if (q == null) {
            synchronized (ith.class) {
                try {
                    if (q == null) {
                        q = new MTSEnvMonitor();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return q;
    }

    public final void g(fvh fvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("637ad502", new Object[]{this, fvhVar});
            return;
        }
        if (h(fvhVar, "listener_disable_thermal_status") && this.f != Integer.MIN_VALUE) {
            this.f = Integer.MIN_VALUE;
            guh.a(guh.DOWNGRADE_LOG, "mts-env-abort : hasRegisterThermalListener");
            if (Build.VERSION.SDK_INT >= 30 && qth.a(this.g)) {
                ((PowerManager) Globals.getApplication().getSystemService("power")).removeThermalStatusListener(tth.a(this.g));
            }
        }
        if (h(fvhVar, "listener_disable_batter_changed") && this.h != Integer.MIN_VALUE) {
            this.h = Integer.MIN_VALUE;
            guh.a(guh.DOWNGRADE_LOG, "mts-env-abort : hasRegisterBatteryChanged");
            if (this.i != null) {
                Globals.getApplication().unregisterReceiver(this.i);
            }
        }
        if (h(fvhVar, "listener_disable_guardian_performance_v2") && this.j != Integer.MIN_VALUE) {
            this.j = Integer.MIN_VALUE;
            guh.a(guh.DOWNGRADE_LOG, "mts-env-abort : hasResourceGuardianPerformanceListener");
            jxl jxlVar = this.k;
            if (jxlVar != null) {
                p7o.d(jxlVar);
            }
        }
        if (h(fvhVar, "listener_disable_network_change")) {
            this.l = Integer.MIN_VALUE;
            guh.a(guh.DOWNGRADE_LOG, "mts-env-abort : hasNetworkChangeReceiver");
            NetworkStatusHelper.INetworkStatusChangeListener iNetworkStatusChangeListener = this.m;
            if (iNetworkStatusChangeListener != null) {
                NetworkStatusHelper.removeStatusChangeListener(iNetworkStatusChangeListener);
            }
        }
    }

    public final boolean h(fvh fvhVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66349465", new Object[]{this, fvhVar, str})).booleanValue();
        }
        if (this.p || (fvhVar != null && fvhVar.d(str, false))) {
            return true;
        }
        return false;
    }

    public final void i(fvh fvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a914b90", new Object[]{this, fvhVar});
        } else if (h(fvhVar, "feat_disable_gc_event") && !euh.q()) {
            guh.a(guh.DOWNGRADE_LOG, "mts-env-downgrade: gc downgradeWatcher");
            euh.m();
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a4360aa", new Object[]{this});
        } else if (NetworkStatusHelper.isConnected()) {
            guh.a(guh.DETAIL_LOG, "checkNetworkConnected:网络连接正常。");
        } else {
            this.f11042a.c++;
            guh.a(guh.TAG, "checkNetworkConnected:网络连接不可用 +1。");
        }
    }

    public final FileFilter k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FileFilter) ipChange.ipc$dispatch("26b954ea", new Object[]{this});
        }
        return new d(this);
    }

    public int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fab289f6", new Object[]{this})).intValue();
        }
        return Runtime.getRuntime().availableProcessors();
    }

    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e19dcdc", new Object[]{this})).intValue();
        }
        if (this.e == -1) {
            this.e = o();
        }
        return this.e;
    }

    public final int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1fec0fa6", new Object[]{this})).intValue();
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(k());
            if (listFiles != null) {
                return listFiles.length;
            }
            return 1;
        } catch (Exception unused) {
            return 1;
        }
    }

    public final void p(eyl eylVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("121c7896", new Object[]{this, eylVar});
        } else if (eylVar.b == 201) {
            this.f11042a.f25642a++;
        }
    }

    public void u(fvh fvhVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c59fdd5e", new Object[]{this, fvhVar, new Boolean(z)});
            return;
        }
        if (fvhVar != null) {
            this.o = fvhVar.f("mem_usage_min_update_interval", 100);
        }
        this.p = z;
        g(fvhVar);
        i(fvhVar);
        if (z) {
            guh.a(guh.TAG, "MTS Env 已全部降级。");
        }
    }

    public luh v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (luh) ipChange.ipc$dispatch("134b551", new Object[]{this});
        }
        long g = cvh.g();
        luh luhVar = this.b;
        if (luhVar == null || g - luhVar.d >= this.o) {
            if (this.b == null) {
                this.b = new luh();
            }
            mp0 mp0Var = new mp0();
            luh luhVar2 = this.b;
            luhVar2.c = g;
            luhVar2.d = g;
            luhVar2.e++;
            long[] a2 = mp0Var.a();
            if (a2 != null && a2.length >= 2) {
                long j = a2[0];
                long j2 = a2[1];
                luh luhVar3 = this.b;
                luhVar3.f23573a = j2;
                luhVar3.b = j;
            }
            return this.b;
        }
        luh luhVar4 = this.b;
        luhVar4.c = g;
        return luhVar4;
    }

    public oth w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oth) ipChange.ipc$dispatch("6b63080b", new Object[]{this});
        }
        s();
        r();
        return this.f11042a;
    }

    public ruh x(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ruh) ipChange.ipc$dispatch("7bfb2823", new Object[]{this, new Boolean(z)});
        }
        if (this.c == null) {
            ruh ruhVar = new ruh();
            this.c = ruhVar;
            ruhVar.e = cvh.g();
        }
        Application application = Globals.getApplication();
        long b2 = cvh.b();
        this.c.getClass();
        int myUid = Process.myUid();
        this.c.f = TrafficStats.getTotalTxBytes();
        this.c.g = TrafficStats.getUidTxBytes(myUid);
        if (z) {
            z(application, b2);
        }
        return this.c;
    }

    public bvh y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bvh) ipChange.ipc$dispatch("9f5d4171", new Object[]{this});
        }
        if (this.d == null) {
            this.d = new bvh();
        }
        t();
        q();
        return this.d;
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68dd03c8", new Object[]{this});
        } else if (this.l == -1) {
            this.l = 1;
            if (this.m == null) {
                a aVar = new a();
                NetworkStatusHelper.addStatusChangeListener(aVar);
                this.m = aVar;
            }
            guh.a(guh.DETAIL_LOG, "mts-registerNetworkStatesListener end.");
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c5b4d68", new Object[]{this});
        } else if (this.j == -1) {
            this.j = 1;
            if (this.k == null) {
                b bVar = new b();
                this.k = bVar;
                p7o.a(bVar);
            }
            guh.a(guh.DETAIL_LOG, "mts-registerPerformanceListener end.");
        }
    }

    public final void t() {
        int currentThermalStatus;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed14b2e1", new Object[]{this});
        } else if (this.f == -1) {
            PowerManager powerManager = (PowerManager) Globals.getApplication().getSystemService("power");
            if (Build.VERSION.SDK_INT >= 30) {
                this.f = 1;
                c cVar = new c();
                bvh bvhVar = this.d;
                currentThermalStatus = powerManager.getCurrentThermalStatus();
                bvhVar.f16663a = currentThermalStatus;
                bvh bvhVar2 = this.d;
                if (bvhVar2.f16663a >= 2) {
                    bvhVar2.c++;
                    guh.a(guh.DETAIL_LOG, "壳温告警，值:" + this.d.f16663a);
                }
                powerManager.addThermalStatusListener(cVar);
                this.g = cVar;
            } else {
                this.f = Integer.MIN_VALUE;
                this.d.f16663a = Integer.MIN_VALUE;
            }
            guh.a(guh.DETAIL_LOG, "mts-registerThermalStatusListener end.");
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d0fbedb", new Object[]{this});
            return;
        }
        int i = -1;
        if (this.h == -1) {
            this.h = 1;
            if (this.i == null) {
                this.i = new BroadcastReceiver() { // from class: com.taobao.minutes.collector.MTSEnvMonitor.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/minutes/collector/MTSEnvMonitor$3");
                    }

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                            return;
                        }
                        int intExtra = intent.getIntExtra("temperature", 0);
                        if (MTSEnvMonitor.f(MTSEnvMonitor.this).b > intExtra) {
                            MTSEnvMonitor.f(MTSEnvMonitor.this).d++;
                        }
                        MTSEnvMonitor.f(MTSEnvMonitor.this).b = intExtra;
                    }
                };
                Intent registerReceiver = Globals.getApplication().registerReceiver(this.i, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver != null) {
                    i = registerReceiver.getIntExtra("temperature", 0);
                }
                this.d.b = i;
            }
            guh.a(guh.DETAIL_LOG, "mts-registerBatterChangedReceiver end.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5 A[Catch: all -> 0x00c3, TRY_LEAVE, TryCatch #11 {all -> 0x00c3, blocks: (B:33:0x00af, B:35:0x00b5), top: B:64:0x00af }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c6 A[EDGE_INSN: B:67:0x00c6->B:39:0x00c6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v5, types: [android.app.usage.NetworkStatsManager] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Unknown variable types count: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(android.content.Context r22, long r23) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.minutes.collector.MTSEnvMonitor.z(android.content.Context, long):void");
    }
}
