package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.k;
import com.taobao.android.dinamicx.m;
import com.taobao.android.dinamicx.p;
import java.lang.ref.WeakReference;
import tb.jb6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class m86 extends bd5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final tc5<Void> k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXRuntimeContext f23840a;

        public a(DXRuntimeContext dXRuntimeContext) {
            this.f23840a = dXRuntimeContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                m86.h(m86.this).a(this.f23840a, null);
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
                m86.h(m86.this).b(null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXRuntimeContext f23842a;
        public final /* synthetic */ Throwable b;

        public c(DXRuntimeContext dXRuntimeContext, Throwable th) {
            this.f23842a = dXRuntimeContext;
            this.b = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                m86.h(m86.this).a(this.f23842a, this.b);
            }
        }
    }

    static {
        t2o.a(444596525);
    }

    public m86(DXRuntimeContext dXRuntimeContext, DXRenderOptions dXRenderOptions, p pVar, k kVar, av5 av5Var, ph5 ph5Var) {
        this(dXRuntimeContext, dXRenderOptions, pVar, kVar, av5Var, ph5Var, null);
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89ecce80", new Object[]{this})).booleanValue();
        }
        if (!zg5.O2() || !(Thread.currentThread() instanceof jb6.g)) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ tc5 h(m86 m86Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tc5) ipChange.ipc$dispatch("5bb67601", new Object[]{m86Var});
        }
        return m86Var.k;
    }

    public static /* synthetic */ Object ipc$super(m86 m86Var, String str, Object... objArr) {
        if (str.hashCode() == 1548812690) {
            super.run();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/DXPrefetchTask");
    }

    @Override // tb.bd5
    public m a(av5 av5Var, p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("92a7837d", new Object[]{this, av5Var, pVar});
        }
        if (eb5.w()) {
            return new y66(av5Var, pVar);
        }
        return new m(av5Var, pVar);
    }

    @Override // tb.bd5
    public p b(av5 av5Var, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p) ipChange.ipc$dispatch("a13e0cbc", new Object[]{this, av5Var, context});
        }
        return new p(av5Var, context);
    }

    @Override // tb.bd5, java.lang.Runnable
    public void run() {
        vc5 A;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        DXRuntimeContext d = d();
        if (d != null) {
            super.run();
            try {
                Thread.currentThread();
                av5 f = f();
                DXEngineConfig e = e();
                if (e != null) {
                    m c2 = c(e, f);
                    DinamicXEngine.j0();
                    d.h0(new WeakReference<>(c2));
                    c2.y(null, null, null, d, this.g);
                    this.h = true;
                    if (f != null && f.c() != null && f.c().w()) {
                        vc5 A2 = f.f().A();
                        if (A2 != null) {
                            A2.R(d);
                        }
                    } else if (!(f == null || f.c() == null || (A = f.f().A()) == null)) {
                        A.S(d);
                    }
                    if (this.k == null) {
                        return;
                    }
                    if (d.Y()) {
                        jb6.p(new a(d));
                    } else {
                        jb6.p(new b());
                    }
                }
            } catch (Throwable th) {
                xv5.b(th);
                this.i = true;
                if (this.k != null) {
                    jb6.p(new c(d, th));
                }
            }
        }
    }

    public m86(DXRuntimeContext dXRuntimeContext, DXRenderOptions dXRenderOptions, p pVar, k kVar, av5 av5Var, ph5 ph5Var, tc5<Void> tc5Var) {
        super(dXRuntimeContext, dXRenderOptions, pVar, kVar, av5Var, ph5Var);
        this.k = tc5Var;
    }
}
