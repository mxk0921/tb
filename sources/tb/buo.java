package tb;

import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class buo implements Runnable, Comparable<buo> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int m = 1;
    private static final int n = 2;
    private static final int o = 3;
    private static final int p = 10;
    public static ThreadLocal<buo> q = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    private kk4<?, ? extends w3o> f16642a;
    private yto b;
    private long c;
    private int d = 1;
    private boolean e;
    private duo f;
    private cuo g;
    private cuo h;
    private Integer i;
    private int j;
    private long k;
    private boolean l;

    public buo(int i, kk4<?, ? extends w3o> kk4Var, yto ytoVar) {
        r(i, kk4Var, ytoVar);
    }

    private synchronized w3o h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w3o) ipChange.ipc$dispatch("b8d38516", new Object[]{this});
        }
        kk4<?, ? extends w3o> kk4Var = this.f16642a;
        if (kk4Var == null || kk4Var.getContext() == null) {
            return null;
        }
        return (w3o) this.f16642a.getContext();
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("488980fc", new Object[]{this})).booleanValue();
        }
        if (jjo.b() || n() || !this.e) {
            return false;
        }
        return true;
    }

    public synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e1f34b1", new Object[]{this});
            return;
        }
        yto ytoVar = this.b;
        if (ytoVar != null) {
            OUT out = ytoVar.c;
            if (out instanceof swn) {
                ((swn) out).release();
            }
        }
        kk4<?, ? extends w3o> kk4Var = this.f16642a;
        if (kk4Var != null) {
            kk4Var.b();
            duo duoVar = this.f;
            if (duoVar != null) {
                duoVar.b(this);
            }
        }
    }

    /* renamed from: d */
    public int compareTo(buo buoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d47f8e87", new Object[]{this, buoVar})).intValue();
        }
        int f = buoVar.f() - f();
        if (f == 0) {
            return (int) (this.c - buoVar.k());
        }
        return f;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6a62aee", new Object[]{this})).intValue();
        }
        w3o h = h();
        if (h != null) {
            return h.d();
        }
        return -1;
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49b31e94", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public Integer g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("82db0cdd", new Object[]{this});
        }
        return this.i;
    }

    public long i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cb9f6e9", new Object[]{this})).longValue();
        }
        return this.k;
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("830709d5", new Object[]{this})).intValue();
        }
        return this.j;
    }

    public long k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aeaa0ebb", new Object[]{this})).longValue();
        }
        return this.c;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91e8f0d3", new Object[]{this})).booleanValue();
        }
        if (!this.l || this.b != null) {
            return true;
        }
        return false;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("202af4b7", new Object[]{this})).booleanValue();
        }
        if (this.b == null) {
            return true;
        }
        return false;
    }

    public boolean n() {
        buo buoVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1c9e340", new Object[]{this})).booleanValue();
        }
        if (this.i == null) {
            if (jjo.b() || (buoVar = q.get()) == null || buoVar.j() != 2 || buoVar.i() != Thread.currentThread().getId()) {
                this.i = 0;
            } else {
                this.i = buoVar.g();
            }
        }
        Integer num = this.i;
        if (num == null || num.intValue() < 10) {
            return false;
        }
        return true;
    }

    public void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5064c14e", new Object[]{this, new Boolean(z)});
        } else {
            this.l = z;
        }
    }

    public void p(p3o p3oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1f5f2e5", new Object[]{this, p3oVar});
            return;
        }
        w3o h = h();
        if (h != null) {
            h.l(p3oVar);
        }
    }

    public buo q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (buo) ipChange.ipc$dispatch("6be3e7c1", new Object[]{this});
        }
        r(1, null, null);
        return this;
    }

    public buo r(int i, kk4<?, ? extends w3o> kk4Var, yto ytoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (buo) ipChange.ipc$dispatch("ac00d4fa", new Object[]{this, new Integer(i), kk4Var, ytoVar});
        }
        return s(i, kk4Var, ytoVar, true);
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        this.k = Thread.currentThread().getId();
        if (!jjo.b()) {
            try {
                Process.setThreadPriority(10);
            } catch (Throwable unused) {
            }
            buo buoVar = q.get();
            if (buoVar != null && buoVar.j() == 2 && buoVar.i() == Thread.currentThread().getId()) {
                Integer num = this.i;
                if (num != null) {
                    i = num.intValue();
                }
                this.i = Integer.valueOf(i + 1);
            } else {
                this.i = 0;
            }
            q.set(this);
        }
        this.j = 2;
        t(this.f16642a, this.b);
        if (!jjo.b()) {
            q.set(this);
        }
        cuo cuoVar = this.g;
        if (cuoVar != null) {
            cuoVar.d(this);
        }
        cuo cuoVar2 = this.h;
        if (cuoVar2 != null) {
            cuoVar2.d(this);
        }
        this.j = 3;
        synchronized (this) {
            try {
                duo duoVar = this.f;
                if (duoVar != null) {
                    duoVar.b(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized buo s(int i, kk4<?, ? extends w3o> kk4Var, yto ytoVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (buo) ipChange.ipc$dispatch("5aa3d290", new Object[]{this, new Integer(i), kk4Var, ytoVar, new Boolean(z)});
        }
        this.c = System.nanoTime();
        this.d = i;
        this.f16642a = kk4Var;
        this.b = ytoVar;
        this.e = z;
        this.i = null;
        this.j = 1;
        this.k = 0L;
        this.g = null;
        this.h = null;
        this.l = false;
        return this;
    }

    public abstract void t(kk4 kk4Var, yto ytoVar);

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(hashCode()));
        sb.append("@(");
        Object obj = this.f16642a;
        if (obj == null) {
            obj = "NullConsumer";
        }
        sb.append(obj);
        sb.append(")[");
        sb.append(this.d);
        sb.append(", ");
        sb.append(this.c);
        sb.append("]");
        return sb.toString();
    }

    public void u(cuo cuoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6fcad72", new Object[]{this, cuoVar});
        } else {
            this.h = cuoVar;
        }
    }

    public void v(cuo cuoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2acd70b2", new Object[]{this, cuoVar});
        } else {
            this.g = cuoVar;
        }
    }

    public synchronized void w(duo duoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14deee7b", new Object[]{this, duoVar});
        } else {
            this.f = duoVar;
        }
    }

    public synchronized void x(p3o p3oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eb5107e", new Object[]{this, p3oVar});
            return;
        }
        w3o h = h();
        if (h != null) {
            h.s(p3oVar);
        }
    }

    public buo(int i, kk4<?, ? extends w3o> kk4Var, yto ytoVar, boolean z) {
        s(i, kk4Var, ytoVar, z);
    }
}
