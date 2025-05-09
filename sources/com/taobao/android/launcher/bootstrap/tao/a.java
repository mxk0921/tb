package com.taobao.android.launcher.bootstrap.tao;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;
import com.taobao.android.launcher.bootstrap.tao.b;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import tb.b8l;
import tb.erj;
import tb.fd4;
import tb.ry3;
import tb.sgg;
import tb.sto;
import tb.t5r;
import tb.w35;
import tb.whh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a extends b implements ScheduleComposer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ScheduleComposer e;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.launcher.bootstrap.tao.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class C0431a implements b.a, fd4 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final b.a f8151a;
        public final ScheduleComposer b;
        public final Queue<Runnable> c = new LinkedBlockingQueue();
        public final Queue<Runnable> d = new LinkedBlockingQueue();

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.launcher.bootstrap.tao.a$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class RunnableC0432a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ b.a f8152a;

            public RunnableC0432a(b.a aVar) {
                this.f8152a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    this.f8152a.b();
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.launcher.bootstrap.tao.a$a$b */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ b.a f8153a;

            public b(b.a aVar) {
                this.f8153a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    this.f8153a.a();
                }
            }
        }

        public C0431a(ScheduleComposer scheduleComposer, b.a aVar) {
            this.b = scheduleComposer;
            this.f8151a = aVar;
        }

        public static <T extends Runnable> void c(Queue<T> queue) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d371f893", new Object[]{queue});
                return;
            }
            while (!queue.isEmpty()) {
                T poll = queue.poll();
                if (poll != null) {
                    poll.run();
                }
            }
        }

        @Override // com.taobao.android.launcher.bootstrap.tao.b.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6cb28c7", new Object[]{this});
                return;
            }
            b.a aVar = this.f8151a;
            if (aVar != null) {
                if (this.b.a()) {
                    whh.a("ngSchedule", "composer is finished, fire the onLaunchBackgroundDeepIdle event immediately");
                    aVar.a();
                    return;
                }
                whh.a("ngSchedule", "composer is not finished, stash the onLaunchBackgroundDeepIdle event");
                ((LinkedBlockingQueue) this.c).offer(new b(aVar));
            }
        }

        @Override // com.taobao.android.launcher.bootstrap.tao.b.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec79c00", new Object[]{this});
                return;
            }
            w35.a("onLaunchCompleted");
            w35.c();
            b.a aVar = this.f8151a;
            if (aVar != null) {
                if (this.b.a()) {
                    whh.a("ngSchedule", "composer is finished, fire the onLaunchCompleted event immediately");
                    aVar.b();
                    return;
                }
                whh.a("ngSchedule", "composer is not finished, stash the onLaunchCompleted event");
                ((LinkedBlockingQueue) this.c).offer(new RunnableC0432a(aVar));
            }
        }

        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f53f818", new Object[]{this});
                return;
            }
            t5r.b("ngNextAppComposed", Long.valueOf(SystemClock.uptimeMillis()));
            boolean isEmpty = this.c.isEmpty();
            int b2 = BootstrapMode.b();
            AppMonitor.Counter.commit(erj.MODULE, "ngSchedule", "stashEmpty=" + isEmpty + ",coldUCP=" + BootstrapMode.e(b2, 64) + ",coldBootImage=" + BootstrapMode.e(b2, 32) + ",ngNextLaunch=" + BootstrapMode.e(b2, 8) + ",eraseState=" + BootstrapMode.e(b2, 128) + ",coldAdv=" + BootstrapMode.e(b2, 256) + ",ngNextDelegate=" + BootstrapMode.e(b2, 512) + ",fullyNewInstall=" + BootstrapMode.e(b2, 1024) + ",multiLang=" + BootstrapMode.e(b2, 2048) + ",coldPreload=" + BootstrapMode.e(b2, 4096) + ",qosSchedule=" + BootstrapMode.e(b2, 8192) + ",ngAfcHome=" + BootstrapMode.e(b2, 131072) + ",coldThemis=" + BootstrapMode.e(b2, 4), 1.0d);
            if (!isEmpty) {
                whh.a("ngSchedule", "composer callback arrived, fire the events stashed before");
                c(this.c);
            }
            c(this.d);
        }

        public boolean e(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9d1b0145", new Object[]{this, runnable})).booleanValue();
            }
            return ((LinkedBlockingQueue) this.d).offer(runnable);
        }
    }

    public a(sgg sggVar) {
        this.e = sto.a(sggVar);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == -1020221866) {
            super.j((Application) objArr[0], (b8l) objArr[1], (b.a) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/bootstrap/tao/AppNGStateRegister");
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ScheduleComposer
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea116c9d", new Object[]{this})).booleanValue();
        }
        return this.e.a();
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ScheduleComposer
    public boolean c(String str, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7daf391", new Object[]{this, str, intent})).booleanValue();
        }
        return this.e.c(str, intent);
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ScheduleComposer
    public boolean g(String str, Intent intent, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee91958f", new Object[]{this, str, intent, runnable})).booleanValue();
        }
        return this.e.g(str, intent, runnable);
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.b
    public void j(Application application, b8l b8lVar, b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c330a656", new Object[]{this, application, b8lVar, aVar});
            return;
        }
        C0431a aVar2 = new C0431a(this.e, aVar);
        super.j(application, b8lVar, aVar2);
        boolean b = ry3.b(application);
        boolean c = ry3.c(application);
        whh.a("ngSchedule", "ColdStartAdInfoCache needBootImage ? " + b + ", needUCP ? " + c);
        if (b) {
            BootstrapMode.i(32);
        }
        if (c) {
            BootstrapMode.i(96);
        }
        n(application, aVar2);
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ScheduleComposer
    public void n(Application application, fd4 fd4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dceb26", new Object[]{this, application, fd4Var});
        } else {
            this.e.n(application, fd4Var);
        }
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ScheduleComposer
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1cb46a1", new Object[]{this, activity, bundle});
        } else {
            this.e.onActivityPostCreated(activity, bundle);
        }
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ScheduleComposer
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ebc4708", new Object[]{this, activity, bundle});
        } else {
            this.e.onActivityPreCreated(activity, bundle);
        }
    }
}
