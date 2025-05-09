package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.k;
import com.taobao.android.dinamicx.p;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class fd5<T> implements tc5<T>, Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public p f19210a;
    public k b;
    public ph5 c;
    public DXRenderOptions d;
    public List<DXRuntimeContext> e;
    public List<bd5> f;
    public cd5 g;
    public boolean h;

    static {
        t2o.a(444596639);
        t2o.a(444596629);
    }

    public fd5(p pVar, k kVar, ph5 ph5Var, DXRenderOptions dXRenderOptions, List<DXRuntimeContext> list, cd5 cd5Var, boolean z) {
        this.f19210a = pVar;
        this.b = kVar;
        this.c = ph5Var;
        this.d = h(dXRenderOptions);
        this.e = list;
        this.h = z;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7622049", new Object[]{this});
        }
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9bfd5a01", new Object[]{this})).booleanValue();
        }
        if (this.d.f() == 1 || this.d.f() == 2) {
            return true;
        }
        return false;
    }

    public static DXRenderOptions k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRenderOptions) ipChange.ipc$dispatch("e4b61dc", new Object[0]);
        }
        return DXRenderOptions.DEFAULT_PRERENDER_OPTIONS;
    }

    public static DXRenderOptions m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRenderOptions) ipChange.ipc$dispatch("21caf83e", new Object[0]);
        }
        return new DXRenderOptions.b().A(1).B(4).q();
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("860ec564", new Object[]{this});
        } else if (i()) {
            c();
        }
    }

    @Override // tb.tc5
    public void a(DXRuntimeContext dXRuntimeContext, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6de1e0b", new Object[]{this, dXRuntimeContext, th});
        } else {
            p();
        }
    }

    @Override // tb.tc5
    public void b(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9636011", new Object[]{this, t});
        } else {
            p();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else {
            this.d.q(true);
        }
    }

    public List<bd5> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a7a92c64", new Object[]{this});
        }
        return j(this.d);
    }

    public tc5<T> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tc5) ipChange.ipc$dispatch("14ff5cc6", new Object[]{this});
        }
        return null;
    }

    public DXRenderOptions h(DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRenderOptions) ipChange.ipc$dispatch("91477dd1", new Object[]{this, dXRenderOptions});
        }
        DXRenderOptions.b l = l();
        if (dXRenderOptions != null) {
            l.s(dXRenderOptions.a()).B(dXRenderOptions.g()).t(dXRenderOptions.b()).G(dXRenderOptions.i()).y(dXRenderOptions.d()).z(dXRenderOptions.e()).E(dXRenderOptions.h()).v(dXRenderOptions.k()).A(dXRenderOptions.f());
        }
        return l.q();
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15dabe57", new Object[]{this})).booleanValue();
        }
        List<bd5> list = this.f;
        if (list == null) {
            return false;
        }
        for (bd5 bd5Var : list) {
            if (!(bd5Var.h || bd5Var.i || this.d.j())) {
                return false;
            }
        }
        return true;
    }

    public abstract List<bd5> j(DXRenderOptions dXRenderOptions);

    public DXRenderOptions.b l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRenderOptions.b) ipChange.ipc$dispatch("dc4f214f", new Object[]{this});
        }
        return new DXRenderOptions.b().A(1).B(4);
    }

    public void n(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64cca8ab", new Object[]{this, runnable});
        } else if (this.d.f() == 1) {
            jb6.k(new t86(2, runnable));
        } else if (this.d.f() == 2) {
            jb6.j(new t86(2, runnable));
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4639aca", new Object[]{this});
        } else if (e()) {
            List<bd5> f = f();
            this.f = f;
            if (!(f == null || f.isEmpty())) {
                if (this.h) {
                    for (bd5 bd5Var : this.f) {
                        n(bd5Var);
                    }
                    return;
                }
                n(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        for (bd5 bd5Var : this.f) {
            if (this.d.j()) {
                break;
            }
            bd5Var.run();
        }
        c();
    }
}
