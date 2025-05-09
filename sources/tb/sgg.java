package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import tb.fuk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class sgg implements fxq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final vh4 f28042a;
    public final j6a<String> b;
    public final fft<String, Void> c;
    private final m35<String, Void> d;
    private final m35<String, Void> e;
    private final m35<String, Void> f;
    private final AtomicReference<ScheduledExecutorService> g = new AtomicReference<>(null);
    private final AtomicReference<ScheduledExecutorService> h = new AtomicReference<>(null);
    private final AtomicReference<ScheduledExecutorService> i = new AtomicReference<>(null);
    private final List<fxq> j = new CopyOnWriteArrayList();
    private final List<String> k = new CopyOnWriteArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Callable<fn8> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ m35 f28043a;
        public final /* synthetic */ q35 b;
        public final /* synthetic */ xgq c;

        public a(sgg sggVar, m35 m35Var, q35 q35Var, xgq xgqVar) {
            this.f28043a = m35Var;
            this.b = q35Var;
            this.c = xgqVar;
        }

        /* renamed from: a */
        public fn8 call() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fn8) ipChange.ipc$dispatch("f59ad169", new Object[]{this});
            }
            fn8 b = this.f28043a.b(xto.IMMEDIATE_NON_TERMINATING, this.b);
            xgq xgqVar = this.c;
            if (xgqVar != null) {
                xgqVar.a(this.b, b);
            }
            return b;
        }
    }

    public sgg(vh4 vh4Var) {
        this.f28042a = vh4Var;
        this.b = vh4Var.e;
        this.c = vh4Var.d;
        n35<String, Void> B = B();
        if (B != null) {
            this.d = p35.a(B);
        } else {
            this.d = null;
        }
        n35<String, Void> D = D();
        if (D != null) {
            this.e = p35.a(D);
        } else {
            this.e = null;
        }
        n35<String, Void> F = F();
        if (F != null) {
            this.f = p35.a(F);
        } else {
            this.f = null;
        }
    }

    private Future<fn8> J(ScheduledExecutorService scheduledExecutorService, m35<String, Void> m35Var, q35<String, Void> q35Var, long j, TimeUnit timeUnit, xgq<String, Void> xgqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("60bd580b", new Object[]{this, scheduledExecutorService, m35Var, q35Var, new Long(j), timeUnit, xgqVar});
        }
        return scheduledExecutorService.schedule(new a(this, m35Var, q35Var, xgqVar), j, timeUnit);
    }

    public static sgg z(String str, vh4 vh4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sgg) ipChange.ipc$dispatch("bab36dc", new Object[]{str, vh4Var});
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("processName invalid");
        } else if ("com.taobao.taobao".equals(str)) {
            return new a1i(vh4Var);
        } else {
            if ("com.taobao.taobao:channel".equals(str)) {
                return new xi3(vh4Var);
            }
            if (LauncherRuntime.PROCESS_SAFEMODE.equals(str)) {
                return new spo(vh4Var);
            }
            if (str.contains(LauncherRuntime.PROCESS_UC_SUFFIX)) {
                return new rsu(vh4Var);
            }
            if (LauncherRuntime.PROCESS_SUPPORT.equals(str) || LauncherRuntime.PROCESS_TOOL.equals(str)) {
                return new yxq(vh4Var);
            }
            if (str.contains(LauncherRuntime.PROCESS_WIDGET)) {
                return new icx(vh4Var);
            }
            return new bd8(vh4Var);
        }
    }

    public n35<String, Void> A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n35) ipChange.ipc$dispatch("a31b7fde", new Object[]{this});
        }
        return null;
    }

    public abstract n35<String, Void> B();

    public abstract n35<String, Void> D();

    public q35<String, Void> E(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q35) ipChange.ipc$dispatch("652879de", new Object[]{this, str});
        }
        m35<String, Void> m35Var = this.e;
        if (m35Var == null) {
            return null;
        }
        vh4 vh4Var = this.f28042a;
        return m35Var.c(str, vh4Var.b, vh4Var.f30013a);
    }

    public n35<String, Void> F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n35) ipChange.ipc$dispatch("7f7429ce", new Object[]{this});
        }
        return null;
    }

    public q35<String, Void> G(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q35) ipChange.ipc$dispatch("5dbb5e67", new Object[]{this, str});
        }
        m35<String, Void> m35Var = this.f;
        if (m35Var == null) {
            return null;
        }
        vh4 vh4Var = this.f28042a;
        return m35Var.c(str, vh4Var.b, vh4Var.f30013a);
    }

    public q35<String, Void> H(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q35) ipChange.ipc$dispatch("5a332873", new Object[]{this, str});
        }
        m35<String, Void> m35Var = this.d;
        if (m35Var == null) {
            return null;
        }
        vh4 vh4Var = this.f28042a;
        return m35Var.a(str, vh4Var.b, vh4Var.f30013a, vh4Var.c);
    }

    public Future<fn8> K(q35<String, Void> q35Var, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("676d2ed8", new Object[]{this, q35Var, new Long(j), timeUnit});
        }
        return M(q35Var, j, timeUnit, null);
    }

    public Future<fn8> M(q35<String, Void> q35Var, long j, TimeUnit timeUnit, xgq<String, Void> xgqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("97cb25b6", new Object[]{this, q35Var, new Long(j), timeUnit, xgqVar});
        }
        if (this.d == null) {
            return null;
        }
        sng.a(this.g, null, k35.c(wzi.LAUNCHER));
        return J(this.g.get(), this.d, q35Var, j, timeUnit, xgqVar);
    }

    public fn8 N(q35<String, Void> q35Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fn8) ipChange.ipc$dispatch("a2a1f692", new Object[]{this, q35Var});
        }
        return P(q35Var, null);
    }

    public fn8 O(q35<String, Void> q35Var, xto xtoVar, xgq<String, Void> xgqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fn8) ipChange.ipc$dispatch("c9e5383d", new Object[]{this, q35Var, xtoVar, xgqVar});
        }
        if (this.d == null) {
            return null;
        }
        w35.a(q35Var.g());
        if (e()) {
            this.j.add(q35Var);
        }
        fn8 b = this.d.b(xtoVar, q35Var);
        if (xgqVar != null) {
            xgqVar.a(q35Var, b);
        }
        if (e()) {
            this.j.remove(q35Var);
            StringBuilder sb = new StringBuilder();
            ((r35) q35Var).b(sb);
            this.k.add(sb.toString());
        }
        w35.c();
        return b;
    }

    public fn8 P(q35<String, Void> q35Var, xgq<String, Void> xgqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fn8) ipChange.ipc$dispatch("df0ca358", new Object[]{this, q35Var, xgqVar});
        }
        return O(q35Var, xto.IMMEDIATE_NON_TERMINATING, xgqVar);
    }

    public abstract void Q();

    public fn8 R(String str, fuk.a<String> aVar, xgq<String, Void> xgqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fn8) ipChange.ipc$dispatch("174e6e3f", new Object[]{this, str, aVar, xgqVar});
        }
        n35<String, Void> A = A();
        if (A == null) {
            return null;
        }
        m35 a2 = p35.a(A);
        vh4 vh4Var = this.f28042a;
        q35<String, Void> a3 = a2.a(str, vh4Var.b, vh4Var.f30013a, vh4Var.c);
        aVar.a(v35.f(a3));
        w35.a(a3.g());
        fn8 b = a2.b(xto.IMMEDIATE_NON_TERMINATING, a3);
        if (xgqVar != null) {
            xgqVar.a(a3, b);
        }
        w35.c();
        return b;
    }

    public Future<fn8> S(q35<String, Void> q35Var, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("2bfe67c3", new Object[]{this, q35Var, new Long(j), timeUnit});
        }
        return T(q35Var, j, timeUnit, null);
    }

    public Future<fn8> T(q35<String, Void> q35Var, long j, TimeUnit timeUnit, xgq<String, Void> xgqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("a8aba7eb", new Object[]{this, q35Var, new Long(j), timeUnit, xgqVar});
        }
        if (this.e == null) {
            return null;
        }
        sng.a(this.h, null, k35.c("launcher-onDemand"));
        return J(this.h.get(), this.e, q35Var, j, timeUnit, xgqVar);
    }

    public Future<fn8> U(q35<String, Void> q35Var, long j, TimeUnit timeUnit, xgq<String, Void> xgqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("cff14bc2", new Object[]{this, q35Var, new Long(j), timeUnit, xgqVar});
        }
        if (this.f == null) {
            return null;
        }
        sng.a(this.i, null, k35.c("launcher-idle"));
        return J(this.i.get(), this.f, q35Var, j, timeUnit, xgqVar);
    }

    @Override // tb.fxq
    public void b(StringBuilder sb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88482fb2", new Object[]{this, sb});
        } else if (e()) {
            sb.append("scheduler=");
            sb.append(this.d);
            sb.append("|");
            sb.append("executingSummaries=");
            for (fxq fxqVar : this.j) {
                fxqVar.b(sb);
            }
            sb.append("executedSummaries=");
            sb.append(this.k);
        }
    }

    public fxq c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fxq) ipChange.ipc$dispatch("59ce31", new Object[]{this});
        }
        return this;
    }

    public iqk d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iqk) ipChange.ipc$dispatch("19a33ee2", new Object[]{this});
        }
        return null;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4df9f4b8", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public abstract jqk y();
}
