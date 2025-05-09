package com.taobao.android.launcher.bootstrap.tao;

import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.lifecycle.PanguApplication;
import tb.aft;
import tb.b8l;
import tb.bhg;
import tb.chg;
import tb.dts;
import tb.ets;
import tb.h7n;
import tb.j6a;
import tb.k6a;
import tb.muo;
import tb.r41;
import tb.sgg;
import tb.va7;
import tb.vh4;
import tb.wrg;
import tb.xet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class e implements r41 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public b f8161a;
    public LoginBroadcastRegister b;
    public sgg c;
    public Application d;
    public b8l e;
    public boolean f;

    public static /* synthetic */ sgg a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sgg) ipChange.ipc$dispatch("6826c4bd", new Object[]{eVar});
        }
        return eVar.c;
    }

    public static /* synthetic */ LoginBroadcastRegister b(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginBroadcastRegister) ipChange.ipc$dispatch("65813e87", new Object[]{eVar});
        }
        return eVar.b;
    }

    public static /* synthetic */ b c(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("e223868e", new Object[]{eVar});
        }
        return eVar.f8161a;
    }

    public static /* synthetic */ boolean d(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74f84f9f", new Object[]{eVar})).booleanValue();
        }
        return eVar.f;
    }

    @Override // tb.q41
    public void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        va7.e();
        xet.a(h7n.q("QoScheduleTask"));
        b8l b8lVar = this.e;
        if (!TextUtils.equals(b8lVar.f16248a, b8lVar.b)) {
            Process.setThreadPriority(5);
        }
        Application application = this.d;
        if (application instanceof PanguApplication) {
            g((PanguApplication) application);
        }
    }

    @Override // tb.r41
    public void f(Application application, b8l b8lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2236238c", new Object[]{this, application, b8lVar});
            return;
        }
        this.d = application;
        this.e = b8lVar;
        chg chgVar = new chg();
        Pair<j6a<String>, aft<String, Void>> a2 = k6a.a(application, b8lVar.b);
        vh4 b = new vh4.b(chgVar, (aft) a2.second, (j6a) a2.first).a("default").d(new bhg()).c(new muo()).b();
        sgg z = sgg.z(b8lVar.b, b);
        this.c = z;
        wrg.n(application, b8lVar, z);
        LauncherRuntime.g(application, b8lVar);
        LauncherRuntime.i = this.c.y();
        LauncherRuntime.j = b;
        b bVar = new b();
        this.f8161a = bVar;
        this.b = new LoginBroadcastRegister(bVar);
    }

    public final void g(PanguApplication panguApplication) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81ae3887", new Object[]{this, panguApplication});
            return;
        }
        this.f8161a.j(panguApplication, this.e, new c(this));
        this.c.Q();
        panguApplication.registerCrossActivityLifecycleCallback(new dts(this, panguApplication));
        panguApplication.registerCrossActivityLifecycleCallback(new ets(this));
        this.b.c = new d(this);
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("531edb4f", new Object[]{this});
            return;
        }
        int i = LauncherRuntime.k;
        if (i != 0 && i != 4) {
            this.c.y().c(null);
            this.f = true;
        }
    }

    @Override // tb.q41
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        this.c.y().h(LauncherRuntime.g);
        h();
        this.c.y().d(LauncherRuntime.g);
        if (BootstrapMode.d(1024)) {
            this.c.d().p();
        }
    }
}
