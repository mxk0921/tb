package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.JvmStatic;
import tb.y7m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class v7m implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private volatile w7m f29838a;
    private volatile yy1 c;
    private volatile boolean d;
    private volatile AtomicReference<yy1> b = new AtomicReference<>();
    private final AtomicLong e = new AtomicLong(-1);
    private final y7m f = new y7m();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481297326);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        @JvmStatic
        public final yy1 a(yy1 yy1Var, yy1 yy1Var2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (yy1) ipChange.ipc$dispatch("89b7ffe2", new Object[]{this, yy1Var, yy1Var2});
            }
            ckf.g(yy1Var2, "curNode");
            if (yy1Var == null) {
                return yy1Var2;
            }
            yy1Var.l(yy1Var2);
            return yy1Var2;
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ bym f29839a;
        public final /* synthetic */ v7m b;
        public final /* synthetic */ yy1 c;

        public b(bym bymVar, v7m v7mVar, yy1 yy1Var) {
            this.f29839a = bymVar;
            this.b = v7mVar;
            this.c = yy1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            x7m invoke = this.f29839a.g().invoke();
            if (!(invoke instanceof gy8)) {
                v7m.a(this.b).c(invoke);
                this.b.e().set(this.c);
                v7m.b(this.b, false);
                this.b.l(false);
            }
        }
    }

    static {
        t2o.a(481297325);
    }

    public v7m(w7m w7mVar) {
        ckf.g(w7mVar, "pipLineDS");
        this.f29838a = w7mVar;
    }

    public static final /* synthetic */ y7m a(v7m v7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y7m) ipChange.ipc$dispatch("33df0f91", new Object[]{v7mVar});
        }
        return v7mVar.f;
    }

    public static final /* synthetic */ void b(v7m v7mVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("540a76e9", new Object[]{v7mVar, new Boolean(z)});
        } else {
            v7mVar.d = z;
        }
    }

    @JvmStatic
    public static final yy1 c(yy1 yy1Var, yy1 yy1Var2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yy1) ipChange.ipc$dispatch("89b7ffe2", new Object[]{yy1Var, yy1Var2});
        }
        return Companion.a(yy1Var, yy1Var2);
    }

    private final void h(bym bymVar, yy1 yy1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bead2cbe", new Object[]{this, bymVar, yy1Var});
        } else if (yy1Var != null) {
            z7m.c(new b(bymVar, this, yy1Var));
        }
    }

    private final boolean j(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13e2526c", new Object[]{this, new Long(j)})).booleanValue();
        }
        if (j == this.e.get()) {
            return true;
        }
        return false;
    }

    private final boolean k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75cb5f43", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (z) {
            z7m.c(this);
        } else {
            run();
        }
        return true;
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.f.b();
        }
    }

    public final AtomicReference<yy1> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicReference) ipChange.ipc$dispatch("30a838f1", new Object[]{this});
        }
        return this.b;
    }

    public final w7m f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w7m) ipChange.ipc$dispatch("5ba38f81", new Object[]{this});
        }
        return this.f29838a;
    }

    public final yy1 g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yy1) ipChange.ipc$dispatch("28d8ed41", new Object[]{this});
        }
        return this.c;
    }

    public final void i(yy1 yy1Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20a7933f", new Object[]{this, yy1Var, new Boolean(z)});
        } else if (yy1Var != null) {
            this.c = yy1Var;
            if (z) {
                p();
            }
        }
    }

    public final boolean l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9590589", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (this.d) {
            return false;
        }
        if (this.b.get() == null) {
            if (this.c == null) {
                return false;
            }
            this.b.set(this.c);
        }
        return k(z);
    }

    public final void m(AtomicReference<yy1> atomicReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13db0d8d", new Object[]{this, atomicReference});
            return;
        }
        ckf.g(atomicReference, "<set-?>");
        this.b = atomicReference;
    }

    public final void n(w7m w7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe718767", new Object[]{this, w7mVar});
            return;
        }
        ckf.g(w7mVar, "<set-?>");
        this.f29838a = w7mVar;
    }

    public final void o(yy1 yy1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6c20923", new Object[]{this, yy1Var});
        } else {
            this.c = yy1Var;
        }
    }

    public final boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("810347ed", new Object[]{this})).booleanValue();
        }
        if (this.d || this.c == null) {
            return false;
        }
        this.b.set(this.c);
        return k(true);
    }

    public final void q(y7m.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("350e8a8b", new Object[]{this, aVar});
            return;
        }
        ckf.g(aVar, "observable");
        this.f.e(aVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        yy1 yy1Var = this.b.get();
        if (yy1Var != null) {
            long currentTimeMillis = System.currentTimeMillis();
            this.e.set(currentTimeMillis);
            while (yy1Var != null && j(currentTimeMillis)) {
                x7m i = yy1Var.i(this.f29838a);
                if (j(currentTimeMillis)) {
                    this.f.c(i);
                    if (!(i instanceof bym)) {
                        if (!(i instanceof bw2)) {
                            if (!i.d() && i.c()) {
                                break;
                            }
                            yy1Var = yy1Var.g();
                        } else {
                            ((bw2) i).g(this.f);
                            yy1Var = yy1Var.g();
                        }
                    } else {
                        h((bym) i, yy1Var.g());
                        yy1Var = yy1Var.g();
                    }
                } else {
                    break;
                }
            }
            if (j(currentTimeMillis)) {
                this.b.set(yy1Var);
                this.d = false;
            }
        }
    }
}
