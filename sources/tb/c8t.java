package tb;

import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;
import com.taobao.android.launcher.bootstrap.tao.ability.dispatch.Dispatchers;
import com.taobao.android.launcher.bootstrap.tao.ability.ipc.a;
import com.taobao.android.launcher.bootstrap.tao.f;
import com.taobao.android.launcher.common.LauncherRuntime;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class c8t implements r41, igg, yhq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Application f16914a;
    public b8l b;
    public r41 c;
    public boolean d = false;
    public Pair<sgg, com.taobao.android.launcher.bootstrap.tao.a> e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements rij {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.rij
        public String getName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
            }
            return "app#attachBaseContext";
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                c8t.c(c8t.this).e(c8t.a(c8t.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements rij {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.rij
        public String getName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
            }
            return "app#onCreate";
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            c8t.c(c8t.this).onCreate();
            com.taobao.android.launcher.bootstrap.tao.ability.ipc.a.b();
            whh.a("TaoNGNextAppDelegate", "lifeCycle#launched");
        }
    }

    public static /* synthetic */ Application a(c8t c8tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("c2b00e33", new Object[]{c8tVar});
        }
        return c8tVar.f16914a;
    }

    public static /* synthetic */ r41 c(c8t c8tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r41) ipChange.ipc$dispatch("abdd10f3", new Object[]{c8tVar});
        }
        return c8tVar.c;
    }

    @Override // tb.igg
    public b8l b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8l) ipChange.ipc$dispatch("e4aa763f", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.q41
    public void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        whh.a("TaoNGNextAppDelegate", "lifeCycle#attachBaseContext");
        if (context instanceof a.c) {
            com.taobao.android.launcher.bootstrap.tao.ability.ipc.a.a((a.c) context, this.b);
        }
        i();
        long uptimeMillis = SystemClock.uptimeMillis();
        Dispatchers.a("AttachTime", String.valueOf(uptimeMillis));
        t5r.b("ngNextAppAttach", Long.valueOf(uptimeMillis));
    }

    @Override // tb.r41
    public void f(Application application, b8l b8lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2236238c", new Object[]{this, application, b8lVar});
            return;
        }
        whh.a("TaoNGNextAppDelegate", "lifeCycle#bindApp");
        d(application, b8lVar);
    }

    public final void g(xq7 xq7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fa9de67", new Object[]{this, xq7Var});
            return;
        }
        xq7Var.a(new a());
        xq7Var.a(new b());
    }

    @Override // tb.igg
    public void h(xhq xhqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("444c2ad9", new Object[]{this, xhqVar});
        } else {
            l(xhqVar, null);
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1910e973", new Object[]{this});
        } else if (ppo.b().c() == null) {
            whh.a("TaoNGNextAppDelegate", "lifeCycle#createInitialContext");
            ppo.b().h(xhq.a("<CONTENT_PROVIDER>"));
        }
    }

    @Override // tb.igg
    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("601e7b1d", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    @Override // tb.q41
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        whh.a("TaoNGNextAppDelegate", "lifeCycle#onCreate");
        long uptimeMillis = SystemClock.uptimeMillis();
        t5r.b("ngNextAppCreate", Long.valueOf(uptimeMillis));
        Dispatchers.a("CreateTime", String.valueOf(uptimeMillis));
        jc.k();
    }

    public final void d(Application application, b8l b8lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5a99ee9", new Object[]{this, application, b8lVar});
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        Dispatchers.a("BindTime", String.valueOf(uptimeMillis));
        fhj.m(application, this, false);
        this.f16914a = application;
        this.b = b8lVar;
        int b2 = BootstrapMode.b() | 512;
        if (BootstrapMode.d(4096)) {
            this.e = f.k(application, b8lVar);
        } else {
            BootstrapMode.h(application, b2);
            LauncherRuntime.g(application, b8lVar);
        }
        t5r.b("ngNextApp", Boolean.TRUE);
        t5r.b("ngNextAppBind", Long.valueOf(uptimeMillis));
    }

    @Override // tb.igg
    public void l(xhq xhqVar, xq7 xq7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bac715fb", new Object[]{this, xhqVar, xq7Var});
            return;
        }
        whh.a("TaoNGNextAppDelegate", "lifeCycle#launch");
        this.d = true;
        w35.a("TaoNGNextAppDelegate#launch");
        long uptimeMillis = SystemClock.uptimeMillis();
        t5r.b("ngNextAppLaunch", Long.valueOf(uptimeMillis));
        Dispatchers.a("LaunchTime", String.valueOf(uptimeMillis));
        int b2 = BootstrapMode.b();
        ppo.b().h(xhqVar);
        BootstrapMode.h(this.f16914a, b2);
        r41 d = va7.d(this.f16914a);
        this.c = d;
        if (this.e != null && (d instanceof zg1)) {
            whh.a("TaoNGNextAppDelegate", "attach ng runtime");
            Pair<sgg, com.taobao.android.launcher.bootstrap.tao.a> pair = this.e;
            ((zg1) this.c).a((sgg) pair.first, (com.taobao.android.launcher.bootstrap.tao.a) pair.second);
        }
        this.c.f(this.f16914a, this.b);
        if (xq7Var == null || !xq7Var.c()) {
            this.c.e(this.f16914a);
            this.c.onCreate();
            com.taobao.android.launcher.bootstrap.tao.ability.ipc.a.b();
            whh.a("TaoNGNextAppDelegate", "lifeCycle#launched");
        } else {
            g(xq7Var);
        }
        w35.c();
    }
}
