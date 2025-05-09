package com.taobao.tao.messagekit.base.monitor.monitorthread;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.monitor.monitorthread.MonitorTaskExecutor;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import tb.lwp;
import tb.t2o;
import tb.zzi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a extends Thread {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String d = "MonitorThreadPool";

    /* renamed from: a  reason: collision with root package name */
    public MonitorTaskExecutor f12532a;
    private volatile boolean b;
    private volatile boolean c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final a f12533a = new a(a.d);

        static {
            t2o.a(628097109);
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("dfb38c2b", new Object[0]);
            }
            return f12533a;
        }
    }

    static {
        t2o.a(628097107);
    }

    public a(Object obj) {
        this.f12532a = null;
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("3a3622f4", new Object[0]);
        }
        return b.a();
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/messagekit/base/monitor/monitorthread/MonitorThreadPool");
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d97450f8", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public void c(zzi zziVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72676f8e", new Object[]{this, zziVar, new Boolean(z)});
        } else {
            d(zziVar, z, false);
        }
    }

    public void e(MonitorTaskExecutor.MonitorProcessExecuteMode monitorProcessExecuteMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3d7e5b", new Object[]{this, monitorProcessExecuteMode});
            return;
        }
        MonitorTaskExecutor monitorTaskExecutor = this.f12532a;
        if (monitorTaskExecutor != null) {
            monitorTaskExecutor.f(monitorProcessExecuteMode);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f20d3fd", new Object[]{this});
            return;
        }
        this.b = true;
        this.f12532a.d(new lwp(zzi.SHUTDOWN_REQ));
    }

    private a(String str) {
        this.f12532a = null;
        setName(str);
        this.f12532a = new MonitorTaskExecutor();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        MsgLog.i(d, "run start");
        try {
            try {
                this.f12532a.e();
                MsgLog.i(d, "arriveMonitor is terminated");
            } catch (InterruptedException unused) {
                MsgLog.g(d, "tasksToExecute take error");
                MsgLog.i(d, "arriveMonitor is terminated");
            }
            this.c = true;
        } catch (Throwable th) {
            MsgLog.i(d, "arriveMonitor is terminated");
            this.c = true;
            throw th;
        }
    }

    public void d(zzi zziVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da873506", new Object[]{this, zziVar, new Boolean(z), new Boolean(z2)});
            return;
        }
        MsgLog.e(d, "putMessageTask, type=", zziVar == null ? null : Integer.valueOf(zziVar.h()));
        if (zziVar == null) {
            return;
        }
        if (z2 || (!this.b && !b())) {
            try {
                if (z) {
                    this.f12532a.c(zziVar);
                } else {
                    this.f12532a.d(zziVar);
                }
            } catch (InterruptedException e) {
                MsgLog.f(d, e, "putMessageTask error: ");
            }
        }
    }
}
