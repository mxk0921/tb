package com.taobao.adaemon;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.PersistableBundle;
import android.os.Process;
import android.text.TextUtils;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.DaemonWorker;
import com.taobao.adaemon.ProcessController;
import com.taobao.adaemon.b;
import com.taobao.adaemon.e;
import java.util.List;
import java.util.concurrent.TimeUnit;
import tb.m09;
import tb.mf;
import tb.oxn;
import tb.s55;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DaemonWorker {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_SCREEN_OFF_DELAY = 60000;
    public static final int DEFAULT_WORK_BACKGROUND_DELAY = 480000;
    public static final int MAX_WORK_TIMES_DAY = 30;
    public static final int MIN_WORK_INTERVAL = 120000;
    public static final String TRIGGER_TYPE = "triggerType";

    /* renamed from: a  reason: collision with root package name */
    public long f6108a;
    public int b;
    public long c;
    public Context d;
    public boolean e;
    public ProcessController.c f;
    public com.taobao.adaemon.b g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public final BroadcastReceiver m;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final DaemonWorker f6110a = new DaemonWorker(null);

        static {
            t2o.a(349175830);
        }

        public static /* synthetic */ DaemonWorker a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DaemonWorker) ipChange.ipc$dispatch("3b7149e9", new Object[0]);
            }
            return f6110a;
        }
    }

    static {
        t2o.a(349175825);
    }

    public /* synthetic */ DaemonWorker(com.taobao.adaemon.c cVar) {
        this();
    }

    public static /* synthetic */ boolean c(DaemonWorker daemonWorker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4187d60e", new Object[]{daemonWorker})).booleanValue();
        }
        return daemonWorker.e;
    }

    public static /* synthetic */ void d(DaemonWorker daemonWorker, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("323814a7", new Object[]{daemonWorker, new Integer(i)});
        } else {
            daemonWorker.I(i);
        }
    }

    public static /* synthetic */ boolean e(DaemonWorker daemonWorker, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81758c90", new Object[]{daemonWorker, new Boolean(z)})).booleanValue();
        }
        daemonWorker.e = z;
        return z;
    }

    public static /* synthetic */ int f(DaemonWorker daemonWorker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc598aae", new Object[]{daemonWorker})).intValue();
        }
        return daemonWorker.q();
    }

    public static /* synthetic */ int g(DaemonWorker daemonWorker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("23777b8d", new Object[]{daemonWorker})).intValue();
        }
        return daemonWorker.b;
    }

    public static /* synthetic */ com.taobao.adaemon.b h(DaemonWorker daemonWorker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.adaemon.b) ipChange.ipc$dispatch("f23500f3", new Object[]{daemonWorker});
        }
        return daemonWorker.g;
    }

    public static /* synthetic */ void i(DaemonWorker daemonWorker, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64b8c0ab", new Object[]{daemonWorker, new Integer(i)});
        } else {
            daemonWorker.H(i);
        }
    }

    public static /* synthetic */ ProcessController.c j(DaemonWorker daemonWorker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProcessController.c) ipChange.ipc$dispatch("51a4d5cf", new Object[]{daemonWorker});
        }
        return daemonWorker.f;
    }

    public static /* synthetic */ long k(DaemonWorker daemonWorker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("efc3b7bc", new Object[]{daemonWorker})).longValue();
        }
        return daemonWorker.i;
    }

    public static /* synthetic */ BroadcastReceiver l(DaemonWorker daemonWorker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BroadcastReceiver) ipChange.ipc$dispatch("5f72b2de", new Object[]{daemonWorker});
        }
        return daemonWorker.m;
    }

    public static /* synthetic */ Context m(DaemonWorker daemonWorker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("4059467e", new Object[]{daemonWorker});
        }
        return daemonWorker.d;
    }

    public static /* synthetic */ long n(DaemonWorker daemonWorker, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cd365276", new Object[]{daemonWorker, new Long(j)})).longValue();
        }
        daemonWorker.c = j;
        return j;
    }

    public static /* synthetic */ long o(DaemonWorker daemonWorker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3596c17", new Object[]{daemonWorker})).longValue();
        }
        return daemonWorker.h;
    }

    public static /* synthetic */ void p(DaemonWorker daemonWorker, long j, TimeUnit timeUnit, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96bacfcd", new Object[]{daemonWorker, new Long(j), timeUnit, new Integer(i)});
        } else {
            daemonWorker.G(j, timeUnit, i);
        }
    }

    public static DaemonWorker u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DaemonWorker) ipChange.ipc$dispatch("5f9e6f84", new Object[0]);
        }
        return b.a();
    }

    public void A(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd6f4d54", new Object[]{this, new Long(j)});
        } else if (j >= 0) {
            this.k = j;
        }
    }

    public void B(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15aeb137", new Object[]{this, new Long(j)});
        } else if (j > 0) {
            this.j = j;
        }
    }

    public void C(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc32767b", new Object[]{this, new Long(j)});
        } else if (j > 0) {
            this.h = j;
        }
    }

    public void D(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe5cbff", new Object[]{this, context});
        } else {
            E(context, null);
        }
    }

    public final void H(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("481ef5e8", new Object[]{this, new Integer(i)});
        } else {
            mf.k(new Runnable() { // from class: tb.do6
                @Override // java.lang.Runnable
                public final void run() {
                    DaemonWorker.this.w(i);
                }
            }, 100L, TimeUnit.MILLISECONDS);
        }
    }

    public long t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e151e8e7", new Object[]{this})).longValue();
        }
        return this.l;
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31f15985", new Object[]{this});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.d.registerReceiver(this.m, intentFilter);
    }

    public DaemonWorker() {
        this.f6108a = 0L;
        this.b = 0;
        this.c = -1L;
        this.e = false;
        this.h = 480000L;
        this.i = 60000L;
        this.j = 120000L;
        this.k = 30L;
        this.m = new BroadcastReceiver(this) { // from class: com.taobao.adaemon.DaemonWorker.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/adaemon/DaemonWorker$4");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                String action = intent.getAction();
                if ("android.intent.action.SCREEN_ON".equals(action)) {
                    s55.i("Worker", "ACTION_SCREEN_ON", new Object[0]);
                } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    s55.i("Worker", "ACTION_SCREEN_OFF", new Object[0]);
                    DaemonWorker.i(DaemonWorker.u(), 7);
                } else if ("android.intent.action.USER_PRESENT".equals(action)) {
                    s55.i("Worker", "ACTION_USER_PRESENT", new Object[0]);
                    LocalProcessMonitor.h0().R0(0L, true);
                }
                if (oxn.s().G()) {
                    LocalProcessMonitor.h0().V0();
                }
            }
        };
    }

    public final void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("693ba0e3", new Object[]{this});
            return;
        }
        s55.i("Worker", "startTargetProcess()", new Object[0]);
        if (!TextUtils.isEmpty(oxn.s().v())) {
            LocalProcessMonitor.h0().R0(500L, false);
        }
    }

    public final void I(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc3b22b8", new Object[]{this, new Integer(i)});
        } else if (this.c == -1) {
            s55.i("Worker", "triggerByTrimMem not trigger, TO_BG_TIME_INVALID", new Object[0]);
        } else {
            long currentTimeMillis = System.currentTimeMillis() - this.c;
            long j = currentTimeMillis / 60000;
            if (currentTimeMillis < 120000 || g.N(this.d)) {
                s55.i("Worker", "triggerByTrimMem not trigger, interval(min):" + j, new Object[0]);
                return;
            }
            s55.g("Worker", "triggerByTrimMem trigger interval(min):" + j, new Object[0]);
            G(0L, TimeUnit.MILLISECONDS, i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f6109a;
        public final /* synthetic */ long b;

        public a(int i, long j) {
            this.f6109a = i;
            this.b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                int f = DaemonWorker.f(DaemonWorker.this);
                if (f != 1) {
                    s55.g("Worker", "trigger can't work", "reason", Integer.valueOf(f));
                    e.C0317e eVar = new e.C0317e();
                    eVar.b = false;
                    eVar.c = f;
                    eVar.f6152a = this.f6109a;
                    eVar.d = DaemonWorker.g(DaemonWorker.this);
                    eVar.b();
                    return;
                }
                DaemonWorker.h(DaemonWorker.this).e = true;
                DaemonWorker.h(DaemonWorker.this).d = g.z(DaemonWorker.m(DaemonWorker.this));
                s55.g("Worker", "trigger start delay", "delay", Long.valueOf(this.b), MspDBHelper.BizEntry.COLUMN_NAME_PID, Integer.valueOf(DaemonWorker.h(DaemonWorker.this).d));
            } catch (Throwable th) {
                s55.h("Worker", "collect trigger info", th, new Object[0]);
            }
        }
    }

    public final void E(Context context, com.taobao.adaemon.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22272ff5", new Object[]{this, context, bVar});
        } else if (this.e) {
            s55.g("Worker", "already started", new Object[0]);
        } else {
            this.l = System.currentTimeMillis();
            s55.g("Worker", "start", new Object[0]);
            this.e = true;
            this.d = context.getApplicationContext();
            if (bVar == null) {
                this.g = new b.C0316b().a();
            }
            this.f = new c(this.d.getPackageName(), this);
            ProcessController.getInstance().registerProcessListener(this.f);
            A(oxn.s().l(this.d, oxn.WORK_MAX_TIME, 30));
            B(oxn.s().l(this.d, oxn.WORK_INTERVAL, MIN_WORK_INTERVAL));
            C(oxn.s().l(this.d, oxn.WORK_BACKGROUND_DELAY, DEFAULT_WORK_BACKGROUND_DELAY));
            this.i = oxn.s().l(this.d, oxn.SCREEN_OFF_DELAY, 60000);
            x();
        }
    }

    public final void G(final long j, TimeUnit timeUnit, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dacca30", new Object[]{this, new Long(j), timeUnit, new Integer(i)});
            return;
        }
        try {
            mf.l(new a(i, j));
            mf.l(new Runnable() { // from class: tb.eo6
                @Override // java.lang.Runnable
                public final void run() {
                    DaemonWorker.this.v(i, j);
                }
            });
        } catch (Throwable th) {
            s55.h("Worker", "trigger", null, th);
        }
    }

    public final int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("df886efb", new Object[]{this})).intValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences p = g.p(this.d);
        if (this.b == 0) {
            this.b = p.getInt("adaemon_work_times", 0);
        }
        long j = p.getLong("adaemon_first_work_timestamp", currentTimeMillis);
        if (this.b != 0 && currentTimeMillis - j > 86400000) {
            this.b = 0;
            p.edit().putInt("adaemon_work_times", 0).putLong("adaemon_first_work_timestamp", currentTimeMillis).apply();
        }
        long j2 = currentTimeMillis - this.f6108a;
        s55.g("Worker", "work times:" + this.b + " interval:" + j2, new Object[0]);
        if (j2 <= this.j) {
            return -2;
        }
        return (((long) this.b) < this.k || currentTimeMillis - j >= 86400000) ? 1 : -1;
    }

    public final int r(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("962a6401", new Object[]{this, new Integer(i)})).intValue();
        }
        if (this.g == null) {
            s55.i("Worker", "checkConstraints null", new Object[0]);
            return -3;
        }
        s55.g("Worker", "checkConstraints:" + this.g.toString(), new Object[0]);
        if (this.g.f6144a && g.N(this.d)) {
            s55.i("Worker", "foreground, cancel", new Object[0]);
            return -4;
        } else if (i == 80) {
            s55.i("Worker", "checkConstraints true " + i, new Object[0]);
            return 1;
        } else if (g.I(this.d)) {
            s55.i("Worker", "has notifications, cancel", new Object[0]);
            return -5;
        } else if (g.H(this.d, this.g.d)) {
            s55.i("Worker", "has foreground service, cancel", new Object[0]);
            return -6;
        } else {
            s55.i("Worker", "checkConstraints true " + i, new Object[0]);
            return 1;
        }
    }

    public final /* synthetic */ void v(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52e6854f", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        try {
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("triggerType", i);
            ((JobScheduler) this.d.getSystemService("jobscheduler")).schedule(new JobInfo.Builder(2040, new ComponentName(this.d.getPackageName(), DaemonJobService.class.getName())).setMinimumLatency(j).setOverrideDeadline(j).setExtras(persistableBundle).build());
            s55.i("Worker", "JobScheduler trigger", "delay", Long.valueOf(j));
        } catch (Throwable th) {
            s55.h("Worker", "JobScheduler trigger", th, new Object[0]);
        }
    }

    public final /* synthetic */ void w(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fb097de", new Object[]{this, new Integer(i)});
        } else if (z(i)) {
            long currentTimeMillis = System.currentTimeMillis() - this.c;
            long j = this.i;
            if (currentTimeMillis - j > 0) {
                j = 0;
            }
            s55.i("Worker", "trigger by ScreenOff", "delay", Long.valueOf(j));
            G(j, TimeUnit.MILLISECONDS, i);
        }
    }

    public final int y(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af2086c3", new Object[]{this, new Integer(i)})).intValue();
        }
        if (this.g.d < 0) {
            s55.i("Worker", "restart pid invalid", new Object[0]);
            F();
            return -7;
        }
        oxn s = oxn.s();
        boolean clearActivityStack = ProcessController.getInstance().clearActivityStack(ProcessController.CLEAR_STACK_ALL);
        s55.i("Worker", "clear stack ret:" + clearActivityStack, new Object[0]);
        if (!clearActivityStack) {
            s55.i("Worker", "clear stack fail, return", new Object[0]);
            return -8;
        }
        LocalProcessMonitor.h0().M0(2, false);
        if (!g.P() || !ProcessController.getInstance().isTinyProcess(this.d.getPackageName())) {
            List<Integer> i2 = g.i(this.d);
            if (i2 == null) {
                return -7;
            }
            for (Integer num : i2) {
                int intValue = num.intValue();
                s55.i("Worker", "killed Process " + intValue, new Object[0]);
                Process.killProcess(intValue);
            }
            com.taobao.adaemon.b bVar = this.g;
            bVar.d = -1;
            bVar.e = false;
            if (i != 7) {
                F();
            }
            if (s.t() && (i == 3 || i == 4 || i == 5)) {
                s55.i("Worker", "killed Self", new Object[0]);
                Process.killProcess(Process.myPid());
            }
            return 1;
        }
        s55.i("Worker", "Don't clear tiny process", new Object[0]);
        return -13;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements ProcessController.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final DaemonWorker f6111a;
        public final String b;

        static {
            t2o.a(349175831);
            t2o.a(349175863);
        }

        public c(String str, DaemonWorker daemonWorker) {
            this.f6111a = daemonWorker;
            this.b = str;
        }

        @Override // com.taobao.adaemon.ProcessController.c
        public void a(String str, boolean z) {
            long j;
            long j2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5dbdd2ef", new Object[]{this, str, new Boolean(z)});
                return;
            }
            s55.i("Worker", "onLifecycleUpdate", "name", str, "bg", Boolean.valueOf(z));
            DaemonWorker daemonWorker = this.f6111a;
            if (z) {
                j = System.currentTimeMillis();
            } else {
                j = -1;
            }
            DaemonWorker.n(daemonWorker, j);
            if (z && !g.N(DaemonWorker.m(DaemonWorker.this))) {
                DaemonWorker.p(this.f6111a, DaemonWorker.o(DaemonWorker.this), TimeUnit.MILLISECONDS, 2);
                if ("OPPO".equalsIgnoreCase(Build.BRAND)) {
                    j2 = 120000;
                } else {
                    j2 = 10000;
                }
                LocalProcessMonitor.h0().I0(j2);
                if (g.K(DaemonWorker.m(DaemonWorker.this)) && oxn.s().i()) {
                    try {
                        MemArt.a(DaemonWorker.m(DaemonWorker.this), 20000L);
                    } catch (Exception e) {
                        s55.i("Worker", e.getMessage(), new Object[0]);
                    }
                }
            }
        }

        @Override // com.taobao.adaemon.ProcessController.c
        public void b(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4bf0ed50", new Object[]{this, str, new Integer(i)});
                return;
            }
            if (oxn.s().G()) {
                LocalProcessMonitor.h0().V0();
            }
            if (this.b.equals(str)) {
                s55.g("Worker", "onTrimMemory", m09.TASK_TYPE_LEVEL, Integer.valueOf(i), "name", str);
                if (i == 40) {
                    DaemonWorker.d(this.f6111a, 3);
                } else if (i == 60) {
                    DaemonWorker.d(this.f6111a, 4);
                } else if (i == 80) {
                    DaemonWorker.d(this.f6111a, 5);
                }
                if (str.endsWith(":channel")) {
                    LocalProcessMonitor.h0().R0(0L, false);
                }
            }
        }
    }

    public final boolean z(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4c6e96e", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (!this.e) {
            s55.i("Worker", "triggerByScreenOff not init", new Object[0]);
            e.C0317e eVar = new e.C0317e();
            eVar.b = false;
            eVar.c = -9;
            eVar.f6152a = i;
            eVar.d = this.b;
            eVar.b();
            return false;
        } else if (this.i <= 0) {
            s55.g("Worker", "triggerByScreenOff disable", new Object[0]);
            return false;
        } else if (g.N(this.d)) {
            s55.g("Worker", "triggerByScreenOff trigger fail, isForeground", new Object[0]);
            e.C0317e eVar2 = new e.C0317e();
            eVar2.b = false;
            eVar2.c = -4;
            eVar2.f6152a = i;
            eVar2.d = this.b;
            eVar2.b();
            return false;
        } else {
            boolean isBgFromHomePage = ProcessController.getInstance().isBgFromHomePage(this.d.getPackageName());
            if (this.c == -1) {
                s55.i("Worker", "triggerByScreenOff fail", new Object[0]);
                e.C0317e eVar3 = new e.C0317e();
                eVar3.b = false;
                eVar3.c = -11;
                eVar3.f6152a = i;
                eVar3.d = this.b;
                eVar3.b();
                return false;
            } else if (isBgFromHomePage || System.currentTimeMillis() - this.c >= this.h) {
                com.taobao.adaemon.b bVar = this.g;
                boolean z = bVar.e;
                if (!z || bVar.d >= 0) {
                    return true;
                }
                s55.g("Worker", "triggerByScreenOff trigger fail", "canWork", Boolean.valueOf(z), MspDBHelper.BizEntry.COLUMN_NAME_PID, Integer.valueOf(this.g.d));
                return false;
            } else {
                s55.i("Worker", "triggerByScreenOff fail", "isHome", Boolean.valueOf(isBgFromHomePage), "time", Long.valueOf(System.currentTimeMillis() - this.c));
                e.C0317e eVar4 = new e.C0317e();
                eVar4.b = false;
                eVar4.c = -12;
                eVar4.f6152a = i;
                eVar4.d = this.b;
                eVar4.b();
                return false;
            }
        }
    }

    public void s(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79fa3ad8", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            s55.i("Worker", "doWork start", "type", Integer.valueOf(i));
            e.C0317e eVar = new e.C0317e();
            int r = r(i);
            if (r == 1) {
                r = y(i);
                long currentTimeMillis2 = System.currentTimeMillis();
                long j = this.f6108a;
                if (j != 0) {
                    eVar.e = currentTimeMillis2 - j;
                }
                this.f6108a = currentTimeMillis2;
                this.b++;
                SharedPreferences.Editor edit = g.p(this.d).edit();
                edit.putInt("adaemon_work_times", this.b);
                if (this.b == 1) {
                    edit.putLong("adaemon_first_work_timestamp", this.f6108a);
                }
                edit.apply();
            }
            eVar.f6152a = i;
            eVar.b = r == 1;
            eVar.c = r;
            eVar.d = this.b;
            eVar.b();
            s55.g("Worker", "doWork end. ", "result", Integer.valueOf(r), "cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        } catch (Throwable th) {
            s55.h("Worker", "doRestart", null, th);
        }
    }
}
