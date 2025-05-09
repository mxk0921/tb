package tb;

import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.IDXApmManager;
import com.taobao.android.dinamicx.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class lc6 implements IDXApmManager.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int g = 50;

    /* renamed from: a  reason: collision with root package name */
    public final CopyOnWriteArrayList<WeakReference<j66>> f23248a;
    public final CopyOnWriteArrayList<WeakReference<ph5>> b;
    public final CopyOnWriteArrayList<WeakReference<na6>> c;
    public final int d;
    public int e;
    public volatile ScheduledFuture<?> f;

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
                return;
            }
            try {
                lc6.a(lc6.this);
                lc6.b(lc6.this);
                lc6.c(lc6.this);
            } catch (Throwable th) {
                lc6 lc6Var = lc6.this;
                if (lc6Var.e < lc6.d(lc6Var)) {
                    f fVar = new f("dinamicx");
                    f.a aVar = new f.a("Signal", "Signal_Exception", f.DX_ERROR_CODE_SIGNAL_EXCEPTION_CRASH);
                    aVar.e = xv5.a(th);
                    ((ArrayList) fVar.c).add(aVar);
                    ic5.p(fVar);
                    lc6.this.e++;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                lc6.this.i();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                lc6.this.n();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final lc6 f23252a = new lc6(null);

        static {
            t2o.a(444596936);
        }

        public static /* synthetic */ lc6 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (lc6) ipChange.ipc$dispatch("39178abb", new Object[0]);
            }
            return f23252a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface e {
        void a();
    }

    static {
        t2o.a(444596932);
        t2o.a(444596605);
    }

    public /* synthetic */ lc6(a aVar) {
        this();
    }

    public static /* synthetic */ void a(lc6 lc6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("552b06b5", new Object[]{lc6Var});
        } else {
            lc6Var.k();
        }
    }

    public static /* synthetic */ void b(lc6 lc6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ea7eb6", new Object[]{lc6Var});
        } else {
            lc6Var.j();
        }
    }

    public static /* synthetic */ void c(lc6 lc6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0a9f6b7", new Object[]{lc6Var});
        } else {
            lc6Var.l();
        }
    }

    public static /* synthetic */ int d(lc6 lc6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e696eab", new Object[]{lc6Var})).intValue();
        }
        return lc6Var.d;
    }

    public static lc6 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lc6) ipChange.ipc$dispatch("b9235980", new Object[0]);
        }
        return d.a();
    }

    public void f(ph5 ph5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b232a72", new Object[]{this, ph5Var});
        } else if (ph5Var != null) {
            this.b.add(new WeakReference<>(ph5Var));
        }
    }

    public void g(j66 j66Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49f25472", new Object[]{this, j66Var});
        } else if (j66Var != null) {
            this.f23248a.add(new WeakReference<>(j66Var));
        }
    }

    public void h(na6 na6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17d8b632", new Object[]{this, na6Var});
        } else if (na6Var != null) {
            this.c.add(new WeakReference<>(na6Var));
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b96adbd8", new Object[]{this});
        } else if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            jb6.n(new b());
        } else {
            try {
                if (this.f == null || this.f.isDone()) {
                    if (DinamicXEngine.j0()) {
                        h36.g("DXSignalProduce", "restartProduce");
                    }
                    m();
                }
            } catch (Exception e2) {
                o("restartProduce", e2);
            }
        }
    }

    public final void j() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b055fb", new Object[]{this});
            return;
        }
        while (i < this.b.size()) {
            ph5 ph5Var = this.b.get(i).get();
            if (ph5Var != null) {
                ph5Var.a();
                i++;
            } else {
                this.b.remove(i);
            }
        }
    }

    public final void k() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecf468a9", new Object[]{this});
            return;
        }
        while (i < this.f23248a.size()) {
            j66 j66Var = this.f23248a.get(i).get();
            if (j66Var != null) {
                j66Var.a();
                i++;
            } else {
                this.f23248a.remove(i);
            }
        }
    }

    public final void l() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94906369", new Object[]{this});
            return;
        }
        while (i < this.c.size()) {
            na6 na6Var = this.c.get(i).get();
            if (na6Var != null) {
                na6Var.a();
                i++;
            } else {
                this.c.remove(i);
            }
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d6f93a5", new Object[]{this});
        } else {
            this.f = jb6.t().scheduleAtFixedRate(new a(), 0L, g, TimeUnit.MILLISECONDS);
        }
    }

    public void o(String str, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4876441d", new Object[]{this, str, exc});
            return;
        }
        f fVar = new f("dinamicx");
        fVar.c = new ArrayList();
        f.a aVar = new f.a("Signal", "Signal_Exception", f.DX_ERROR_SIGNAL_BACKGROUND_STOP);
        aVar.e = str + ": " + xv5.a(exc);
        fVar.c.add(aVar);
        ic5.p(fVar);
    }

    @Override // com.taobao.android.dinamicx.IDXApmManager.a
    public void onEvent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
        } else if (i == 1) {
            n();
        } else if (i == 2) {
            i();
        }
    }

    public void p(j66 j66Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6a3e079", new Object[]{this, j66Var});
        } else if (j66Var != null) {
            for (int i = 0; i < this.f23248a.size(); i++) {
                if (this.f23248a.get(i).get() == j66Var) {
                    this.f23248a.remove(i);
                    return;
                }
            }
        }
    }

    public void q(na6 na6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("932f81b9", new Object[]{this, na6Var});
        } else if (na6Var != null) {
            for (int i = 0; i < this.c.size(); i++) {
                if (this.c.get(i).get() == na6Var) {
                    this.c.remove(i);
                    return;
                }
            }
        }
    }

    public lc6() {
        this.d = 10;
        this.f23248a = new CopyOnWriteArrayList<>();
        this.b = new CopyOnWriteArrayList<>();
        this.c = new CopyOnWriteArrayList<>();
        m();
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8833cc05", new Object[]{this});
        } else if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            jb6.n(new c());
        } else {
            try {
                if (this.f != null && !this.f.isDone()) {
                    if (DinamicXEngine.j0()) {
                        h36.g("DXSignalProduce", "stopProduce");
                    }
                    this.f.cancel(false);
                    this.f = null;
                }
            } catch (Exception e2) {
                o("stopProduce", e2);
            }
        }
    }
}
