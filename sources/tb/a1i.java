package tb;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import tb.fuk;
import tb.i35;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a1i extends sgg implements uhe, jqk, iqk, fuk<String>, i35.a, Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final int n = jrt.a(vu3.b.GEO_NOT_SUPPORT);
    private volatile boolean m = false;
    private final Runnable l = new whe(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements xgq<String, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f15481a;

        public a(a1i a1iVar, String str) {
            this.f15481a = str;
        }

        @Override // tb.xgq
        public void a(q35<String, Void> q35Var, fn8 fn8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fda77ec5", new Object[]{this, q35Var, fn8Var});
                return;
            }
            cts.a(this.f15481a);
            cn8.a(LauncherRuntime.g, q35Var, fn8Var);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements xgq<String, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(a1i a1iVar) {
        }

        @Override // tb.xgq
        public void a(q35<String, Void> q35Var, fn8 fn8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fda77ec5", new Object[]{this, q35Var, fn8Var});
                return;
            }
            cts.a("m-u-d");
            cn8.a(LauncherRuntime.g, q35Var, fn8Var);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements xgq<String, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(a1i a1iVar) {
        }

        @Override // tb.xgq
        public void a(q35<String, Void> q35Var, fn8 fn8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fda77ec5", new Object[]{this, q35Var, fn8Var});
                return;
            }
            cts.a("m-f-a");
            cn8.a(LauncherRuntime.g, q35Var, fn8Var);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements xgq<String, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(a1i a1iVar) {
        }

        @Override // tb.xgq
        public void a(q35<String, Void> q35Var, fn8 fn8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fda77ec5", new Object[]{this, q35Var, fn8Var});
                return;
            }
            cts.a("m-s-w");
            cn8.a(LauncherRuntime.g, q35Var, fn8Var);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements xgq<String, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(a1i a1iVar) {
        }

        @Override // tb.xgq
        public void a(q35<String, Void> q35Var, fn8 fn8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fda77ec5", new Object[]{this, q35Var, fn8Var});
                return;
            }
            cts.a("m-f");
            cn8.a(LauncherRuntime.g, q35Var, fn8Var);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements xgq<String, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f(a1i a1iVar) {
        }

        @Override // tb.xgq
        public void a(q35<String, Void> q35Var, fn8 fn8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fda77ec5", new Object[]{this, q35Var, fn8Var});
                return;
            }
            cts.a("m-b");
            cn8.a(LauncherRuntime.g, q35Var, fn8Var);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements xgq<String, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g(a1i a1iVar) {
        }

        @Override // tb.xgq
        public void a(q35<String, Void> q35Var, fn8 fn8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fda77ec5", new Object[]{this, q35Var, fn8Var});
                return;
            }
            cts.a("m-b-d-i");
            cn8.a(LauncherRuntime.g, q35Var, fn8Var);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    a1i.V(a1i.this);
                }
            }
        }

        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                a1i.W(a1i.this, new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class i implements xgq<String, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f15484a;

        public i(a1i a1iVar, Runnable runnable) {
            this.f15484a = runnable;
        }

        @Override // tb.xgq
        public void a(q35<String, Void> q35Var, fn8 fn8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fda77ec5", new Object[]{this, q35Var, fn8Var});
                return;
            }
            jdh.a("Sche-LifeCycle", "onAppLaunched", new Object[0]);
            cts.a("m-launched");
            cn8.a(LauncherRuntime.g, q35Var, fn8Var);
            this.f15484a.run();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class j implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

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
                jdh.a("Sche-LifeCycle", "onBootFinishIdle", new Object[0]);
                cts.a("m-b-f");
                mhe.a("bootFinish", a1i.this);
                cn8.a(LauncherRuntime.g, q35Var, fn8Var);
            }
        }

        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            cts.b("m-b-f");
            q35 X = a1i.X(a1i.this, "m-b-f");
            a1i.Y(a1i.this).y(v35.f(X));
            a1i.Z(a1i.this, X, 200L, TimeUnit.MILLISECONDS, new a());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class k implements xgq<String, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k(a1i a1iVar) {
        }

        @Override // tb.xgq
        public void a(q35<String, Void> q35Var, fn8 fn8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fda77ec5", new Object[]{this, q35Var, fn8Var});
                return;
            }
            cts.a("m-launch");
            cn8.a(LauncherRuntime.g, q35Var, fn8Var);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class l implements xgq<String, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public l(a1i a1iVar) {
        }

        @Override // tb.xgq
        public void a(q35<String, Void> q35Var, fn8 fn8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fda77ec5", new Object[]{this, q35Var, fn8Var});
                return;
            }
            cts.a("m-c-l");
            cn8.a(LauncherRuntime.g, q35Var, fn8Var);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class m implements xgq<String, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public m(a1i a1iVar) {
        }

        @Override // tb.xgq
        public void a(q35<String, Void> q35Var, fn8 fn8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fda77ec5", new Object[]{this, q35Var, fn8Var});
                return;
            }
            cts.a("m-l-i");
            cn8.a(LauncherRuntime.g, q35Var, fn8Var);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class n implements xgq<String, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public n(a1i a1iVar) {
        }

        @Override // tb.xgq
        public void a(q35<String, Void> q35Var, fn8 fn8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fda77ec5", new Object[]{this, q35Var, fn8Var});
                return;
            }
            cts.a("m-l-o");
            cn8.a(LauncherRuntime.g, q35Var, fn8Var);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class o implements xgq<String, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public o(a1i a1iVar) {
        }

        @Override // tb.xgq
        public void a(q35<String, Void> q35Var, fn8 fn8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fda77ec5", new Object[]{this, q35Var, fn8Var});
            } else {
                cn8.a(LauncherRuntime.g, q35Var, fn8Var);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class p implements xgq<String, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public p(a1i a1iVar) {
        }

        @Override // tb.xgq
        public void a(q35<String, Void> q35Var, fn8 fn8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fda77ec5", new Object[]{this, q35Var, fn8Var});
                return;
            }
            cts.a("m-a-head");
            cn8.a(LauncherRuntime.g, q35Var, fn8Var);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class q implements xgq<String, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public q(a1i a1iVar) {
        }

        @Override // tb.xgq
        public void a(q35<String, Void> q35Var, fn8 fn8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fda77ec5", new Object[]{this, q35Var, fn8Var});
                return;
            }
            cts.a("m-a-tail");
            cn8.a(LauncherRuntime.g, q35Var, fn8Var);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class r implements xgq<String, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public r(a1i a1iVar) {
        }

        @Override // tb.xgq
        public void a(q35<String, Void> q35Var, fn8 fn8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fda77ec5", new Object[]{this, q35Var, fn8Var});
                return;
            }
            cts.a("m-a-c");
            cn8.a(LauncherRuntime.g, q35Var, fn8Var);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class s implements xgq<String, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public s(a1i a1iVar) {
        }

        @Override // tb.xgq
        public void a(q35<String, Void> q35Var, fn8 fn8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fda77ec5", new Object[]{this, q35Var, fn8Var});
                return;
            }
            cts.a("m-privacy-kernel");
            cn8.a(LauncherRuntime.g, q35Var, fn8Var);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class t implements xgq<String, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public t(a1i a1iVar) {
        }

        @Override // tb.xgq
        public void a(q35<String, Void> q35Var, fn8 fn8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fda77ec5", new Object[]{this, q35Var, fn8Var});
                return;
            }
            cts.a("m-launch-resume");
            cn8.a(LauncherRuntime.g, q35Var, fn8Var);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class u implements xgq<String, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public u(a1i a1iVar) {
        }

        @Override // tb.xgq
        public void a(q35<String, Void> q35Var, fn8 fn8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fda77ec5", new Object[]{this, q35Var, fn8Var});
                return;
            }
            cts.a("m-b-a-d");
            cn8.a(LauncherRuntime.g, q35Var, fn8Var);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class v implements xgq<String, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f15487a;

        public v(a1i a1iVar, String str) {
            this.f15487a = str;
        }

        @Override // tb.xgq
        public void a(q35<String, Void> q35Var, fn8 fn8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fda77ec5", new Object[]{this, q35Var, fn8Var});
                return;
            }
            cts.a(this.f15487a);
            cn8.a(LauncherRuntime.g, q35Var, fn8Var);
        }
    }

    public a1i(vh4 vh4Var) {
        super(vh4Var);
    }

    public static /* synthetic */ void V(a1i a1iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f551eff", new Object[]{a1iVar});
        } else {
            a1iVar.h0();
        }
    }

    public static /* synthetic */ void W(a1i a1iVar, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42dee9fe", new Object[]{a1iVar, runnable});
        } else {
            a1iVar.j0(runnable);
        }
    }

    public static /* synthetic */ q35 X(a1i a1iVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q35) ipChange.ipc$dispatch("49ba605b", new Object[]{a1iVar, str});
        }
        return a1iVar.G(str);
    }

    public static /* synthetic */ j6a Y(a1i a1iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j6a) ipChange.ipc$dispatch("d192cfc1", new Object[]{a1iVar});
        }
        return a1iVar.b;
    }

    public static /* synthetic */ Future Z(a1i a1iVar, q35 q35Var, long j2, TimeUnit timeUnit, xgq xgqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("d32d7471", new Object[]{a1iVar, q35Var, new Long(j2), timeUnit, xgqVar});
        }
        return a1iVar.U(q35Var, j2, timeUnit, xgqVar);
    }

    private void f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8c3ceb7", new Object[]{this});
            return;
        }
        this.m = true;
        this.l.run();
    }

    private void g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("147619e9", new Object[]{this});
            return;
        }
        q35<String, Void> H = H("m-a-d");
        this.b.a(v35.f(H));
        P(H, new o(this));
    }

    private void h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5116a667", new Object[]{this});
        } else {
            mhe.a("bfn", new j());
        }
    }

    public static /* synthetic */ Object ipc$super(a1i a1iVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/schedulers/MainScheduler");
    }

    private void j0(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f910c417", new Object[]{this, runnable});
            return;
        }
        cts.b("m-launched");
        q35<String, Void> G = G("m-launched");
        this.b.b(v35.f(G));
        U(G, 200L, TimeUnit.MILLISECONDS, new i(this, runnable));
    }

    @Override // tb.sgg
    public n35<String, Void> A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n35) ipChange.ipc$dispatch("a31b7fde", new Object[]{this});
        }
        int i2 = n;
        return new n35<>(k35.a("launcher-async", i2, i2, 0));
    }

    @Override // tb.sgg
    public n35<String, Void> B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n35) ipChange.ipc$dispatch("de4e5542", new Object[]{this});
        }
        int i2 = n;
        return new n35<>(k35.b(wzi.LAUNCHER, i2, i2, 0, this), this.c);
    }

    @Override // tb.sgg
    public n35<String, Void> D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n35) ipChange.ipc$dispatch("bd24f637", new Object[]{this});
        }
        return new n35<>(k35.a("launcher-demand", 1, n, 10));
    }

    @Override // tb.sgg
    public n35<String, Void> F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n35) ipChange.ipc$dispatch("7f7429ce", new Object[]{this});
        }
        return new n35<>(k35.a("launcher-idle", 1, n, 10));
    }

    @Override // tb.sgg
    public void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4532f39e", new Object[]{this});
            return;
        }
        if (LauncherRuntime.l) {
            g0();
        }
        cts.b("m-launch");
        q35<String, Void> H = H("m-launch");
        this.b.t(v35.f(H));
        P(H, new k(this));
    }

    @Override // tb.sgg
    public iqk d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iqk) ipChange.ipc$dispatch("19a33ee2", new Object[]{this}) : this;
    }

    @Override // tb.uhe
    public q35<String, Void> g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q35) ipChange.ipc$dispatch("99ec8088", new Object[]{this, str});
        }
        return G(str);
    }

    @Override // tb.uhe
    public j6a<String> m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j6a) ipChange.ipc$dispatch("9768d55f", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.uhe
    public Future<fn8> n(q35<String, Void> q35Var, long j2, TimeUnit timeUnit, xgq<String, Void> xgqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("ca82d51a", new Object[]{this, q35Var, new Long(j2), timeUnit, xgqVar});
        }
        return U(q35Var, j2, timeUnit, xgqVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            f0();
        }
    }

    @Override // tb.i35.a
    public boolean v(j35 j35Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54f22aac", new Object[]{this, j35Var})).booleanValue();
        }
        if (!this.m) {
            return false;
        }
        j35Var.f21733a = 1;
        j35Var.b = n;
        j35Var.c = 10;
        return true;
    }

    @Override // tb.sgg
    public jqk y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jqk) ipChange.ipc$dispatch("5a18ef58", new Object[]{this});
        }
        return this;
    }

    @Override // tb.jqk
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9512450", new Object[]{this});
            return;
        }
        jdh.a("Sche-LifeCycle", "onLogout", new Object[0]);
        cts.b("m-l-o");
        q35<String, Void> E = E("m-l-o");
        this.b.m(v35.f(E));
        T(E, 200L, TimeUnit.MILLISECONDS, new n(this));
    }

    public void a0(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66c48712", new Object[]{this, activity});
        } else {
            jdh.a("Sche-LifeCycle", "onFirstActivityDestroyed", new Object[0]);
        }
    }

    public void b0(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98a6677a", new Object[]{this, activity});
        } else {
            jdh.a("Sche-LifeCycle", "onFirstActivityStarted", new Object[0]);
        }
    }

    @Override // tb.jqk
    public void c(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7633f59", new Object[]{this, activity});
            return;
        }
        jdh.a("Sche-LifeCycle", "onSchemaWaked", new Object[0]);
        cts.b("m-s-w");
        q35<String, Void> H = H("m-s-w");
        this.b.p(v35.f(H));
        P(H, new d(this));
    }

    @Override // tb.jqk
    public void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a4f161b", new Object[]{this, context});
            return;
        }
        jdh.a("Sche-LifeCycle", "onAppCreated", new Object[0]);
        cts.b("m-a-c");
        q35<String, Void> H = H("m-a-c");
        this.b.e(v35.f(H));
        P(H, new r(this));
    }

    public void d0(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16c871c6", new Object[]{this, activity});
        } else {
            jdh.a("Sche-LifeCycle", "onFirstActivityStopped", new Object[0]);
        }
    }

    @Override // tb.fuk
    public void e(String str, fuk.a<String> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ed9b17", new Object[]{this, str, aVar});
        } else if (aVar != null) {
            String str2 = "m-custom-" + str + "-async";
            jdh.a("Sche-LifeCycle", "onScheduleCustomizedStageAsync: " + str, new Object[0]);
            cts.b(str2);
            R(str2, aVar, new a(this, str2));
        }
    }

    public void e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a854dd5a", new Object[]{this});
        } else {
            jdh.a("Sche-LifeCycle", "onIdle from external", new Object[0]);
        }
    }

    @Override // tb.jqk
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13d26d4d", new Object[]{this});
            return;
        }
        jdh.a("Sche-LifeCycle", "onColdLogin", new Object[0]);
        cts.b("m-c-l");
        q35<String, Void> E = E("m-c-l");
        this.b.o(v35.f(E));
        T(E, 200L, TimeUnit.MILLISECONDS, new l(this));
    }

    @Override // tb.jqk
    public void h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77c71dda", new Object[]{this, context});
            return;
        }
        jdh.a("Sche-LifeCycle", "onAppAttach", new Object[0]);
        cts.b("m-a-head");
        q35<String, Void> H = H("m-a-head");
        this.b.v(v35.f(H));
        P(H, new p(this));
        cts.b("m-a-tail");
        q35<String, Void> H2 = H("m-a-tail");
        this.b.k(v35.f(H2));
        P(H2, new q(this));
    }

    @Override // tb.iqk
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6bfce9c", new Object[]{this});
            return;
        }
        jdh.a("Sche-LifeCycle", "onBeforeActivityDisplay", new Object[0]);
        cts.b("m-b-a-d");
        q35<String, Void> H = H("m-b-a-d");
        this.b.D(v35.f(H));
        P(H, new u(this));
    }

    @Override // tb.jqk
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d226240a", new Object[]{this});
            return;
        }
        jdh.a("Sche-LifeCycle", "onBootFinished", new Object[0]);
        if (!mhg.c("m-b-f")) {
            mhe.b("appLaunched", new h(), 500L);
        }
    }

    @Override // tb.jqk
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("979dd451", new Object[]{this});
            return;
        }
        jdh.a("Sche-LifeCycle", "onLogin", new Object[0]);
        cts.b("m-l-i");
        q35<String, Void> E = E("m-l-i");
        this.b.r(v35.f(E));
        T(E, 200L, TimeUnit.MILLISECONDS, new m(this));
    }

    @Override // tb.iqk
    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e887110c", new Object[]{this});
            return;
        }
        jdh.a("Sche-LifeCycle", "onLaunchResumed", new Object[0]);
        cts.b("m-launch-resume");
        q35<String, Void> H = H("m-launch-resume");
        this.b.E(v35.f(H));
        P(H, new t(this));
    }

    @Override // tb.iqk
    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("561f9ed3", new Object[]{this});
            return;
        }
        jdh.a("Sche-LifeCycle", "onPrivacyKernelLoad", new Object[0]);
        cts.b("m-privacy-kernel");
        q35<String, Void> H = H("m-privacy-kernel");
        this.b.s(v35.f(H));
        P(H, new s(this));
    }

    @Override // tb.iqk
    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f889c9c", new Object[]{this});
            return;
        }
        jdh.a("Sche-LifeCycle", "onUIDemandStageExecute", new Object[0]);
        cts.b("m-u-d");
        q35<String, Void> G = G("m-u-d");
        this.b.q(v35.f(G));
        U(G, 0L, TimeUnit.MILLISECONDS, new b(this));
    }

    @Override // tb.iqk
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dfb3c74", new Object[]{this});
            return;
        }
        jdh.a("Sche-LifeCycle", "onBackgroundDeepIdle", new Object[0]);
        q35<String, Void> G = G("m-b-d-i");
        this.b.d(v35.f(G));
        cts.b("m-b-d-i");
        U(G, 200L, TimeUnit.MILLISECONDS, new g(this));
    }

    @Override // tb.jqk
    public void s(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2f5e321", new Object[]{this, activity});
            return;
        }
        jdh.a("Sche-LifeCycle", "onFirstActivityCreated", new Object[0]);
        cts.b("m-f-a");
        q35<String, Void> H = H("m-f-a");
        this.b.j(v35.f(H));
        P(H, new c(this));
    }

    @Override // tb.fuk
    public void t(String str, fuk.a<String> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3c87969", new Object[]{this, str, aVar});
        } else if (aVar != null) {
            String str2 = "m-custom-" + str;
            jdh.a("Sche-LifeCycle", "onScheduleCustomizedStage: " + str, new Object[0]);
            cts.b(str2);
            q35<String, Void> H = H(str2);
            aVar.a(v35.f(H));
            P(H, new v(this, str2));
        }
    }

    @Override // tb.jqk
    public void u(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4593a2c6", new Object[]{this, activity});
            return;
        }
        jdh.a("Sche-LifeCycle", "onBackground", new Object[0]);
        cts.b("m-b");
        q35<String, Void> E = E("m-b");
        this.b.A(v35.f(E));
        T(E, 200L, TimeUnit.MILLISECONDS, new f(this));
    }

    @Override // tb.jqk
    public void j(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5839169b", new Object[]{this, activity});
            return;
        }
        this.m = true;
        jdh.a("Sche-LifeCycle", "onForeground", new Object[0]);
        cts.b("m-f");
        q35<String, Void> E = E("m-f");
        this.b.n(v35.f(E));
        T(E, 200L, TimeUnit.MILLISECONDS, new e(this));
    }
}
