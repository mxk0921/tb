package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class etf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ehc f18804a;
    public final dtf b = new dtf();
    public final wpb c = new u17();
    public Class<? extends z2e> d = null;
    public Class<? extends uv> e = mw1.class;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public final List<a3e> i = new ArrayList();

    static {
        t2o.a(995098629);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73f64497", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("493de84b", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fd80ed4", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public wpb d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wpb) ipChange.ipc$dispatch("38eafef7", new Object[]{this});
        }
        return this.c;
    }

    public ehc e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ehc) ipChange.ipc$dispatch("17988588", new Object[]{this});
        }
        return this.f18804a;
    }

    public Class<? extends z2e> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("c0eab6d9", new Object[]{this});
        }
        return this.d;
    }

    public Class<? extends uv> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("992e77b4", new Object[]{this});
        }
        return this.e;
    }

    public dtf h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dtf) ipChange.ipc$dispatch("3dabc2d8", new Object[]{this});
        }
        return this.b;
    }

    public List<a3e> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("835bc70e", new Object[]{this});
        }
        return this.i;
    }

    public void j(String str, Class<? extends chc> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb9ae0c9", new Object[]{this, str, cls});
        } else {
            this.b.b(str, cls);
        }
    }

    public void k(a3e a3eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41735cd1", new Object[]{this, a3eVar});
        } else {
            ((ArrayList) this.i).add(a3eVar);
        }
    }

    public void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c7d87d", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3325f711", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd0a1a8", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public void o(ehc ehcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6d6e936", new Object[]{this, ehcVar});
        } else {
            this.f18804a = ehcVar;
        }
    }

    public void p(Class<? extends z2e> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1642e09d", new Object[]{this, cls});
        } else {
            this.d = cls;
        }
    }

    public void q(Class<? extends uv> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea78a88a", new Object[]{this, cls});
        } else {
            this.e = cls;
        }
    }
}
