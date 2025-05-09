package com.taobao.android.dinamicx;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import tb.fl6;
import tb.pb6;
import tb.t2o;
import tb.t56;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DXRenderOptions {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int NORMAL = 0;
    public static final int PRE_FETCH = 1;
    public static final int PRE_RENDER = 2;
    public static final int PRE_RENDER_X = 4;
    public static final int SIMPLE = 3;

    /* renamed from: a  reason: collision with root package name */
    public final int f7288a;
    public final int b;
    public final fl6 c;
    @Deprecated
    public final Object d;
    public final boolean e;
    public boolean f;
    public final int g;
    public final int h;
    public final int i;
    public final boolean j;
    public final Map<String, String> k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final t56 p;
    public static final DXRenderOptions DEFAULT_RENDER_OPTIONS = new b().q();
    public static final DXRenderOptions DEFAULT_PRERENDER_OPTIONS = new b().A(2).B(9).q();
    public static final DXRenderOptions DEFAULT_PRERENDER_X_OPTIONS = new b().A(4).B(9).q();

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface DXRenderType {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public fl6 c;
        public Object d;
        public boolean e;
        public boolean f;
        public int g;
        public Map<String, String> j;
        public boolean o;
        public t56 p;
        public boolean k = true;
        public boolean l = true;
        public boolean m = true;
        public boolean n = true;

        /* renamed from: a  reason: collision with root package name */
        public int f7289a = pb6.j();
        public int b = pb6.i();
        public int h = 0;
        public int i = 9;

        static {
            t2o.a(444596539);
        }

        public static /* synthetic */ int a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3fa5ed85", new Object[]{bVar})).intValue();
            }
            return bVar.f7289a;
        }

        public static /* synthetic */ int b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("45a9b8e4", new Object[]{bVar})).intValue();
            }
            return bVar.b;
        }

        public static /* synthetic */ boolean c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7a575fc7", new Object[]{bVar})).booleanValue();
            }
            return bVar.k;
        }

        public static /* synthetic */ boolean d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("805b2b26", new Object[]{bVar})).booleanValue();
            }
            return bVar.l;
        }

        public static /* synthetic */ boolean e(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("865ef685", new Object[]{bVar})).booleanValue();
            }
            return bVar.m;
        }

        public static /* synthetic */ boolean f(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8c62c1e4", new Object[]{bVar})).booleanValue();
            }
            return bVar.n;
        }

        public static /* synthetic */ boolean g(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("92668d43", new Object[]{bVar})).booleanValue();
            }
            bVar.getClass();
            return false;
        }

        public static /* synthetic */ t56 h(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (t56) ipChange.ipc$dispatch("d3bb3ad3", new Object[]{bVar});
            }
            return bVar.p;
        }

        public static /* synthetic */ fl6 i(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fl6) ipChange.ipc$dispatch("77121764", new Object[]{bVar});
            }
            return bVar.c;
        }

        public static /* synthetic */ Object j(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("e1673b63", new Object[]{bVar});
            }
            return bVar.d;
        }

        public static /* synthetic */ boolean k(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57b51b12", new Object[]{bVar})).booleanValue();
            }
            return bVar.e;
        }

        public static /* synthetic */ boolean l(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5db8e671", new Object[]{bVar})).booleanValue();
            }
            return bVar.f;
        }

        public static /* synthetic */ int m(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("63bcb1bf", new Object[]{bVar})).intValue();
            }
            return bVar.h;
        }

        public static /* synthetic */ int n(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("69c07d1e", new Object[]{bVar})).intValue();
            }
            return bVar.i;
        }

        public static /* synthetic */ int o(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6fc4487d", new Object[]{bVar})).intValue();
            }
            return bVar.g;
        }

        public static /* synthetic */ Map p(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("3f109a5e", new Object[]{bVar});
            }
            return bVar.j;
        }

        public b A(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("21a16efe", new Object[]{this, new Integer(i)});
            }
            this.g = i;
            return this;
        }

        public b B(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("fc07e4f8", new Object[]{this, new Integer(i)});
            }
            this.i = i;
            return this;
        }

        public b C(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f8d96187", new Object[]{this, new Boolean(z)});
            }
            this.k = z;
            return this;
        }

        public b D(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("644d7744", new Object[]{this, new Boolean(z)});
            }
            this.l = z;
            return this;
        }

        public b E(fl6 fl6Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("54a03dd8", new Object[]{this, fl6Var});
            }
            this.c = fl6Var;
            return this;
        }

        @Deprecated
        public b F(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("3fd455c9", new Object[]{this, new Boolean(z)});
            }
            this.n = z;
            return this;
        }

        public b G(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("e2e0b3da", new Object[]{this, new Integer(i)});
            }
            this.f7289a = i;
            return this;
        }

        public DXRenderOptions q() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXRenderOptions) ipChange.ipc$dispatch("b921ac05", new Object[]{this});
            }
            return new DXRenderOptions(this);
        }

        @Deprecated
        public b r(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("85c3f9ff", new Object[]{this, new Boolean(z)});
            }
            this.o = z;
            return this;
        }

        public b s(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("17c9d467", new Object[]{this, new Integer(i)});
            }
            this.h = i;
            return this;
        }

        public b t(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c305220d", new Object[]{this, new Integer(i)});
            }
            this.b = i;
            return this;
        }

        public b u(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("19a2b41d", new Object[]{this, new Boolean(z)});
            }
            this.f = z;
            return this;
        }

        public b v(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("481231f9", new Object[]{this, new Boolean(z)});
            }
            this.e = z;
            return this;
        }

        public b w(t56 t56Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("89cf846e", new Object[]{this, t56Var});
            }
            this.p = t56Var;
            return this;
        }

        public b x(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("b31922dd", new Object[]{this, new Boolean(z)});
            }
            this.m = z;
            return this;
        }

        public b y(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("6a589f7b", new Object[]{this, obj});
            }
            this.d = obj;
            return this;
        }

        public b z(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("5947f17d", new Object[]{this, map});
            }
            this.j = map;
            return this;
        }
    }

    static {
        t2o.a(444596537);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9fb5c38", new Object[]{this})).intValue();
        }
        return this.h;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cbb9d1f2", new Object[]{this})).intValue();
        }
        int i = this.b;
        if (i == 0) {
            return pb6.i();
        }
        return i;
    }

    public t56 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t56) ipChange.ipc$dispatch("53d68627", new Object[]{this});
        }
        return this.p;
    }

    public Object d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ba9236fc", new Object[]{this});
        }
        return this.d;
    }

    public Map<String, String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e79d2786", new Object[]{this});
        }
        return this.k;
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a36360", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("222c0b07", new Object[]{this})).intValue();
        }
        return this.i;
    }

    public fl6 h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fl6) ipChange.ipc$dispatch("bed6a089", new Object[]{this});
        }
        return this.c;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f2c4ee5", new Object[]{this})).intValue();
        }
        int i = this.f7288a;
        if (i == 0) {
            return pb6.j();
        }
        return i;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83e706ee", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80a04a92", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9edc71f8", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e8f500e", new Object[]{this})).booleanValue();
        }
        return this.l;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b6ec131", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d6e59af", new Object[]{this})).booleanValue();
        }
        return this.o;
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e46ed365", new Object[]{this})).booleanValue();
        }
        return this.n;
    }

    public void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f154f2", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public DXRenderOptions(b bVar) {
        this.j = true;
        this.l = true;
        this.m = true;
        this.n = true;
        this.f7288a = b.a(bVar);
        this.b = b.b(bVar);
        this.c = b.i(bVar);
        this.d = b.j(bVar);
        this.e = b.k(bVar);
        this.f = b.l(bVar);
        this.h = b.m(bVar);
        this.i = b.n(bVar);
        this.g = b.o(bVar);
        this.k = b.p(bVar);
        this.l = b.c(bVar);
        this.m = b.d(bVar);
        this.j = b.e(bVar);
        this.o = bVar.o;
        this.n = b.f(bVar);
        b.g(bVar);
        this.p = b.h(bVar);
    }
}
