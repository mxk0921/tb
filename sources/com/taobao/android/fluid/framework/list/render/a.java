package com.taobao.android.fluid.framework.list.render;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.list.render.b;
import tb.bpk;
import tb.ir9;
import tb.p91;
import tb.t2o;
import tb.uq9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final boolean h = p91.k(p91.a());

    /* renamed from: a  reason: collision with root package name */
    public final uq9 f7862a;
    public final C0421a b;
    public boolean c = false;
    public boolean d;
    public boolean e;
    public boolean f;
    public final b g;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.fluid.framework.list.render.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class C0421a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public a f7863a;
        public int b;
        public bpk c;

        static {
            t2o.a(468714458);
        }

        public static /* synthetic */ void a(C0421a aVar, a aVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e3db692e", new Object[]{aVar, aVar2});
            } else {
                aVar.e(aVar2);
            }
        }

        public static /* synthetic */ int b(C0421a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4459960", new Object[]{aVar})).intValue();
            }
            return aVar.b;
        }

        public static /* synthetic */ a c(C0421a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6abce438", new Object[]{aVar});
            }
            return aVar.f7863a;
        }

        public static /* synthetic */ void d(C0421a aVar, a aVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("615f6d31", new Object[]{aVar, aVar2});
            } else {
                aVar.f(aVar2);
            }
        }

        public final void e(a aVar) {
            uq9 uq9Var;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98205a0f", new Object[]{this, aVar});
                return;
            }
            this.b++;
            a aVar2 = this.f7863a;
            if (aVar != aVar2) {
                if (aVar2 != null && aVar2.j()) {
                    a.b(this.f7863a);
                }
                a aVar3 = this.f7863a;
                if (aVar3 != null) {
                    uq9Var = a.c(aVar3);
                } else {
                    uq9Var = null;
                }
                if (aVar != null && !aVar.j()) {
                    bpk bpkVar = this.c;
                    if (bpkVar != null) {
                        bpkVar.k(a.c(aVar), uq9Var);
                    }
                    a.a(aVar);
                    bpk bpkVar2 = this.c;
                    if (bpkVar2 != null) {
                        bpkVar2.m(a.c(aVar), uq9Var);
                    }
                }
                this.f7863a = aVar;
            } else if (aVar != null && !aVar.j()) {
                a.a(aVar);
            }
        }

        public final void f(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("54357321", new Object[]{this, aVar});
            } else if (aVar != null) {
                a.b(aVar);
            }
        }

        public void g(bpk bpkVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c2504e7", new Object[]{this, bpkVar});
            } else {
                this.c = bpkVar;
            }
        }
    }

    static {
        t2o.a(468714457);
    }

    public a(uq9 uq9Var, C0421a aVar, b.a aVar2) {
        this.f7862a = uq9Var;
        this.b = aVar;
        this.g = new b(this, uq9Var, aVar2);
    }

    public static /* synthetic */ void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7ca3e61", new Object[]{aVar});
        } else {
            aVar.l();
        }
    }

    public static /* synthetic */ void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0cb9000", new Object[]{aVar});
        } else {
            aVar.m();
        }
    }

    public static /* synthetic */ uq9 c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uq9) ipChange.ipc$dispatch("7f836ea8", new Object[]{aVar});
        }
        return aVar.f7862a;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79c2108d", new Object[]{this});
        } else if (!this.c) {
            C0421a.a(this.b, this);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aff7f9c", new Object[]{this});
        } else if (!this.c) {
            if (!this.d) {
                if (h) {
                    throw new RuntimeException("appear must after bindData");
                }
            } else if (!this.e) {
                ir9.b("CardLifecyclePerformer", "appear");
                uq9 uq9Var = this.f7862a;
                uq9Var.onAppear(uq9Var);
                this.e = true;
                if (C0421a.b(this.b) == 0 && C0421a.c(this.b) == null) {
                    ir9.b("CardLifecyclePerformer", "appear to active");
                    d();
                }
            }
        }
    }

    public void g(com.taobao.android.fluid.framework.data.datamodel.a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b11c90bd", new Object[]{this, aVar, new Integer(i)});
            return;
        }
        try {
            ir9.b("CardLifecyclePerformer", "bindDataForce");
            uq9 uq9Var = this.f7862a;
            uq9Var.onBindData(uq9Var, aVar, i);
            this.d = true;
        } catch (Throwable th) {
            ir9.b("CardLifecyclePerformer", "bindDataForce Error" + th.getMessage());
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265b97bb", new Object[]{this});
        } else {
            C0421a.d(this.b, this);
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("179906ca", new Object[]{this});
        } else if (this.e) {
            if (this.f) {
                h();
            }
            ir9.b("CardLifecyclePerformer", "disAppear");
            uq9 uq9Var = this.f7862a;
            uq9Var.onDisAppear(uq9Var);
            this.e = false;
        }
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb2d0d5b", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec6a7c6a", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40df6fcc", new Object[]{this});
        } else if (!this.e) {
            if (h) {
                throw new RuntimeException("active must after appear");
            }
        } else if (this.f) {
            ir9.d("CardLifecyclePerformer", "active mIsActive: " + this.f7862a);
        } else {
            o();
            ir9.a("CardLifecyclePerformer", "active: " + this.f7862a);
            uq9 uq9Var = this.f7862a;
            uq9Var.onActive(uq9Var);
            this.f = true;
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596a7c1c", new Object[]{this});
        } else if (this.f) {
            p();
            ir9.a("CardLifecyclePerformer", "disActive: " + this.f7862a);
            uq9 uq9Var = this.f7862a;
            uq9Var.onDisActive(uq9Var);
            this.f = false;
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1d77dff", new Object[]{this});
            return;
        }
        b bVar = this.g;
        if (bVar != null) {
            bVar.h();
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8be6dd09", new Object[]{this});
            return;
        }
        b bVar = this.g;
        if (bVar != null) {
            bVar.i();
        }
    }

    public void f(com.taobao.android.fluid.framework.data.datamodel.a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efda52ba", new Object[]{this, aVar, new Integer(i)});
        } else if (!this.d) {
            ir9.b("CardLifecyclePerformer", "onBindData");
            uq9 uq9Var = this.f7862a;
            uq9Var.onBindData(uq9Var, aVar, i);
            this.d = true;
        } else if (h) {
            throw new RuntimeException("bindData repeated");
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51af759a", new Object[]{this});
        } else if (this.d) {
            if (this.e) {
                i();
            }
            ir9.b("CardLifecyclePerformer", "recycle");
            uq9 uq9Var = this.f7862a;
            uq9Var.onRecycle(uq9Var);
            this.d = false;
        }
    }
}
