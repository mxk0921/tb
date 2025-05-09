package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.TurboEngineConfig;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class rpu implements qpu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final AtomicInteger d = new AtomicInteger(0);

    /* renamed from: a  reason: collision with root package name */
    public final String f27543a = "TurboEngine-" + d.getAndIncrement();
    public final qdp b;
    public TurboEngineConfig c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(919601230);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(919601229);
        t2o.a(919601228);
    }

    public rpu(TurboEngineConfig turboEngineConfig) {
        ckf.g(turboEngineConfig, "config");
        this.c = turboEngineConfig;
        qdp qdpVar = new qdp(this, this.c.j());
        this.b = qdpVar;
        qdpVar.a();
    }

    @Override // tb.qpu
    public TurboEngineConfig a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TurboEngineConfig) ipChange.ipc$dispatch("9bcea9d4", new Object[]{this});
        }
        return this.c;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.b.b();
        }
    }

    public final void c(TurboEngineConfig turboEngineConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b19333b1", new Object[]{this, turboEngineConfig});
            return;
        }
        ckf.g(turboEngineConfig, "newConfig");
        this.c = turboEngineConfig;
    }

    @Override // tb.qpu
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.c.d();
    }

    @Override // tb.qpu
    public String getInstanceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c00da33", new Object[]{this});
        }
        return this.f27543a;
    }

    @Override // tb.qpu
    public <T extends sod> T getService(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((sod) ipChange.ipc$dispatch("10f4299c", new Object[]{this, cls}));
        }
        ckf.g(cls, "serviceClass");
        T t = (T) this.b.c(cls);
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null cannot be cast to non-null type T");
    }
}
