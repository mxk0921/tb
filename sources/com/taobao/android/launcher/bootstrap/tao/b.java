package com.taobao.android.launcher.bootstrap.tao;

import android.app.Application;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.aiq;
import tb.b8l;
import tb.c21;
import tb.cts;
import tb.l0r;
import tb.v11;
import tb.whh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class b implements v11, Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f8158a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final Handler d = new Handler(Coordinator.getWorkerLooper(), this);
    public final aiq c = new aiq();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
        void a();

        void b();
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("495b0ad9", new Object[]{this})).booleanValue();
        }
        return this.b.get();
    }

    @Override // com.taobao.application.common.IAppLaunchListener
    public void d(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60cba989", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i == 0 && i2 == 2) {
            whh.a("Sche-LifeCycle", "launch finished, try cancel watchdog settled before");
            this.d.removeMessages(3);
            this.d.removeMessages(4);
            i("callback");
        }
    }

    public void e() {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[]{this});
            return;
        }
        this.d.removeMessages(2);
        c21.d(this);
        int i = c21.g().getInt("deviceLevel", -1);
        if (i == 1) {
            j = 5500;
        } else if (i == 2) {
            j = 6500;
        } else {
            j = TBToast.Duration.LONG;
        }
        this.d.sendEmptyMessageDelayed(1, j);
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a8ce72c", new Object[]{this});
            return;
        }
        whh.a("Sche-LifeCycle", "scheduleBackgroundDeepIdle");
        cts.b("scheduleBackgroundDeepIdle");
        cts.a("scheduleBackgroundDeepIdle");
        a aVar = this.f8158a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16883b6f", new Object[]{this, str});
            return;
        }
        whh.a("Sche-LifeCycle", "scheduleLaunchCompleteTimeout: " + str);
        cts.b(str);
        cts.a(str);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        int i = message.what;
        if (i == 1) {
            i("delay");
            return true;
        } else if (i == 2) {
            f();
            return true;
        } else if (i == 3) {
            h("launchCompleteTimeout6");
            return true;
        } else if (i != 4) {
            return false;
        } else {
            h("launchCompleteTimeout10");
            return true;
        }
    }

    public final void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beda5412", new Object[]{this, str});
        } else if (this.b.compareAndSet(false, true)) {
            whh.a("Sche-LifeCycle", "scheduleLaunchCompleted, reason: " + str);
            this.d.removeMessages(1);
            this.c.a();
            this.c.c();
            a aVar = this.f8158a;
            if (aVar != null) {
                aVar.b();
            }
        }
    }

    public void j(Application application, b8l b8lVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c330a656", new Object[]{this, application, b8lVar, aVar});
            return;
        }
        this.f8158a = aVar;
        if (TextUtils.equals(b8lVar.b, b8lVar.f16248a)) {
            whh.a("Sche-LifeCycle", "startup watchdog setup");
            this.d.sendEmptyMessageDelayed(2, 20000L);
            this.d.sendEmptyMessageDelayed(3, l0r.DEFAULT_TCP_CONNECT_TIMEOUT_MS);
            this.d.sendEmptyMessageDelayed(4, 10000L);
            whh.a("Sche-LifeCycle", "startup watchdog setup finished");
        }
        this.c.b(application, b8lVar);
        this.c.a();
    }
}
