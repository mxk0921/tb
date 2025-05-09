package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class whe implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final uhe f30689a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements xgq<String, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.xgq
        public void a(q35<String, Void> q35Var, fn8 fn8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fda77ec5", new Object[]{this, q35Var, fn8Var});
                return;
            }
            cts.a("m-idle");
            cn8.a(LauncherRuntime.g, q35Var, fn8Var);
            whe.a(whe.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements xgq<String, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.xgq
        public void a(q35<String, Void> q35Var, fn8 fn8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fda77ec5", new Object[]{this, q35Var, fn8Var});
                return;
            }
            cts.a("m-idle-5");
            cn8.a(LauncherRuntime.g, q35Var, fn8Var);
            whe.b(whe.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements xgq<String, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.xgq
        public void a(q35<String, Void> q35Var, fn8 fn8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fda77ec5", new Object[]{this, q35Var, fn8Var});
                return;
            }
            cts.a("m-idle-10");
            cn8.a(LauncherRuntime.g, q35Var, fn8Var);
            whe.c(whe.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements xgq<String, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.xgq
        public void a(q35<String, Void> q35Var, fn8 fn8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fda77ec5", new Object[]{this, q35Var, fn8Var});
                return;
            }
            cts.a("m-idle-15");
            cn8.a(LauncherRuntime.g, q35Var, fn8Var);
            whe.d(whe.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements xgq<String, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(whe wheVar) {
        }

        @Override // tb.xgq
        public void a(q35<String, Void> q35Var, fn8 fn8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fda77ec5", new Object[]{this, q35Var, fn8Var});
                return;
            }
            cts.a("m-idle-30");
            cn8.a(LauncherRuntime.g, q35Var, fn8Var);
        }
    }

    public whe(uhe uheVar) {
        this.f30689a = uheVar;
    }

    public static /* synthetic */ void a(whe wheVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96c2fbd0", new Object[]{wheVar});
        } else {
            wheVar.i();
        }
    }

    public static /* synthetic */ void b(whe wheVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a528011", new Object[]{wheVar});
        } else {
            wheVar.f();
        }
    }

    public static /* synthetic */ void c(whe wheVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7de20452", new Object[]{wheVar});
        } else {
            wheVar.g();
        }
    }

    public static /* synthetic */ void d(whe wheVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71718893", new Object[]{wheVar});
        } else {
            wheVar.h();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            e();
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93272a12", new Object[]{this});
        } else if (mhg.c("m-idle")) {
            jdh.a("Sche-LifeCycle", "onIdled, but ignore because of switch m-idle", new Object[0]);
        } else {
            jdh.a("Sche-LifeCycle", "onIdled", new Object[0]);
            long a2 = mhg.a();
            if (a2 == 0) {
                a2 = 200;
            }
            cts.b("m-idle");
            q35<String, Void> g = this.f30689a.g("m-idle");
            this.f30689a.m().c(v35.f(g));
            this.f30689a.n(g, a2, TimeUnit.MILLISECONDS, new a());
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af37350", new Object[]{this});
            return;
        }
        jdh.a("Sche-LifeCycle", "onIdled10s", new Object[0]);
        cts.b("m-idle-10");
        q35<String, Void> g = this.f30689a.g("m-idle-10");
        this.f30689a.m().f(v35.f(g));
        this.f30689a.n(g, 5L, TimeUnit.SECONDS, new c());
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("137bae6b", new Object[]{this});
            return;
        }
        jdh.a("Sche-LifeCycle", "onIdled15s", new Object[0]);
        cts.b("m-idle-15");
        q35<String, Void> g = this.f30689a.g("m-idle-15");
        this.f30689a.m().z(v35.f(g));
        this.f30689a.n(g, 5L, TimeUnit.SECONDS, new d());
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74bfe9d2", new Object[]{this});
            return;
        }
        jdh.a("Sche-LifeCycle", "onIdled30s", new Object[0]);
        cts.b("m-idle-30");
        q35<String, Void> g = this.f30689a.g("m-idle-30");
        this.f30689a.m().C(v35.f(g));
        this.f30689a.n(g, 15L, TimeUnit.SECONDS, new e(this));
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76195b30", new Object[]{this});
            return;
        }
        jdh.a("Sche-LifeCycle", "onIdled5s", new Object[0]);
        cts.b("m-idle-5");
        q35<String, Void> g = this.f30689a.g("m-idle-5");
        this.f30689a.m().B(v35.f(g));
        this.f30689a.n(g, 5L, TimeUnit.SECONDS, new b());
    }
}
