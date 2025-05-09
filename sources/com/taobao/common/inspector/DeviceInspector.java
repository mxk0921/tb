package com.taobao.common.inspector;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Debug;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.utils.ArtcLog;
import com.taobao.common.inspector.DeviceInspector;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import tb.er2;
import tb.pr3;
import tb.qr3;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DeviceInspector {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f10309a;
    public pr3 c;
    public boolean d;
    public ScheduledFuture<?> e;
    public volatile Intent f;
    public volatile Debug.MemoryInfo g;
    public long j;
    public long k;
    public final qr3 m;
    public final BroadcastReceiver b = new ReceiverImpl();
    public volatile double h = vu3.b.GEO_NOT_SUPPORT;
    public volatile int i = 0;
    public boolean n = false;
    public final int l = Runtime.getRuntime().availableProcessors();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class ReceiverImpl extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(395313327);
        }

        public ReceiverImpl() {
        }

        public static /* synthetic */ Object ipc$super(ReceiverImpl receiverImpl, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/common/inspector/DeviceInspector$ReceiverImpl");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            String action = intent.getAction();
            if (action != null && action.equals("android.intent.action.BATTERY_CHANGED")) {
                DeviceInspector.b(DeviceInspector.this, intent);
            }
        }
    }

    static {
        t2o.a(395313326);
    }

    public DeviceInspector(Context context, qr3 qr3Var) {
        this.f10309a = context;
        this.m = qr3Var;
    }

    public static /* synthetic */ void b(DeviceInspector deviceInspector, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6a841cf", new Object[]{deviceInspector, intent});
        } else {
            deviceInspector.i(intent);
        }
    }

    public final pr3 c() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pr3) ipChange.ipc$dispatch("4eb8d4e7", new Object[]{this});
        }
        pr3 pr3Var = new pr3();
        String a2 = SystemProperties.a("ro.board.platform");
        if (a2 != null) {
            pr3Var.platform = new String[]{a2};
        }
        er2.j(pr3Var);
        qr3 qr3Var = this.m;
        if (qr3Var != null) {
            pr3Var.id = qr3Var.b(pr3Var);
        }
        return pr3Var;
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ca643e9", new Object[]{this});
            return;
        }
        if (!this.n) {
            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
            this.g = memoryInfo;
            if (this.g != null) {
                this.i = this.g.getTotalPss();
            }
            this.n = true;
        } else {
            this.n = false;
        }
        long j = this.j;
        long j2 = this.k;
        try {
            this.j = er2.g();
        } catch (Exception unused) {
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.k = elapsedRealtime;
        this.h = (((this.j - j) * 1.0d) / (elapsedRealtime - j2)) / this.l;
    }

    public Intent e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("9a0f4663", new Object[]{this});
        }
        return this.f;
    }

    public double f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a4045b44", new Object[]{this})).doubleValue();
        }
        return this.h;
    }

    public pr3 g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pr3) ipChange.ipc$dispatch("760301e9", new Object[]{this});
        }
        if (this.c == null) {
            try {
                this.c = c();
            } catch (Throwable th) {
                ArtcLog.e("DeviceInspector", "", th, new Object[0]);
            }
        }
        return this.c;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4b090fd", new Object[]{this})).intValue();
        }
        return this.i;
    }

    public final void i(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d274cdea", new Object[]{this, intent});
        } else {
            this.f = intent;
        }
    }

    public synchronized void j(ScheduledExecutorService scheduledExecutorService, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfa82b79", new Object[]{this, scheduledExecutorService, new Long(j)});
        } else if (!this.d) {
            this.f10309a.registerReceiver(this.b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (scheduledExecutorService != null) {
                try {
                    this.j = er2.g();
                } catch (Exception unused) {
                    this.j = 0L;
                }
                this.k = SystemClock.elapsedRealtime();
                this.e = scheduledExecutorService.scheduleAtFixedRate(new Runnable() { // from class: tb.oi7
                    @Override // java.lang.Runnable
                    public final void run() {
                        DeviceInspector.this.d();
                    }
                }, j, j, TimeUnit.MILLISECONDS);
            }
            this.d = true;
        }
    }

    public synchronized void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else if (this.d) {
            this.f10309a.unregisterReceiver(this.b);
            this.f = null;
            ScheduledFuture<?> scheduledFuture = this.e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.e = null;
            }
            this.d = false;
        }
    }
}
