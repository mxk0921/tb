package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import kotlin.jvm.JvmInline;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class uiz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b Companion = new b(null);

    /* renamed from: a  reason: collision with root package name */
    public final waz f29410a;
    public final viz b;
    public viz c;
    public final nfz d;
    public nfz e;
    public final nfz f;

    /* compiled from: Taobao */
    @JvmInline
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final C1072a Companion = new C1072a(null);

        /* compiled from: Taobao */
        /* renamed from: tb.uiz$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class C1072a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            static {
                t2o.a(598737405);
            }

            public /* synthetic */ C1072a(a07 a07Var) {
                this();
            }

            public C1072a() {
            }
        }

        static {
            t2o.a(598737404);
        }

        public static byte a(byte b) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f7c3e0ce", new Object[]{new Byte(b)})).byteValue();
            }
            return b;
        }

        public static final boolean b(byte b, byte b2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("16fc974d", new Object[]{new Byte(b), new Byte(b2)})).booleanValue();
            }
            if (b == b2) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737406);
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }

        public static final /* synthetic */ nfz a(b bVar, lfz lfzVar, nfz nfzVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (nfz) ipChange.ipc$dispatch("8c914b79", new Object[]{bVar, lfzVar, nfzVar});
            }
            return bVar.b(lfzVar, nfzVar);
        }

        public final nfz b(lfz lfzVar, nfz nfzVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (nfz) ipChange.ipc$dispatch("c0f81a23", new Object[]{this, lfzVar, nfzVar});
            }
            if (lfzVar instanceof pfz) {
                nfz a2 = ((pfz) lfzVar).a();
                c(a2, nfzVar);
                return a2;
            }
            throw new IllegalArgumentException("Element must be ModifierNodeElement");
        }

        public final void c(nfz nfzVar, nfz nfzVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd3d29b2", new Object[]{this, nfzVar, nfzVar2});
                return;
            }
            nfz d = nfzVar2.d();
            if (d != null) {
                d.l(nfzVar);
                nfzVar.j(d);
            }
            nfzVar2.j(nfzVar);
            nfzVar.l(nfzVar2);
        }

        public b() {
        }
    }

    static {
        t2o.a(598737403);
    }

    public uiz(waz wazVar) {
        ckf.g(wazVar, "layoutNode");
        this.f29410a = wazVar;
        i2z d = wazVar.d();
        xaz b2 = d == null ? null : d.b(wazVar);
        b2 = b2 == null ? new xaz(wazVar) : b2;
        this.b = b2;
        this.c = b2;
        nfz A = b2.A();
        ckf.d(A);
        this.d = A;
        this.e = A;
        nfz nfzVar = new nfz();
        nfzVar.i(-1);
        xhv xhvVar = xhv.INSTANCE;
        this.f = nfzVar;
    }

    public final byte a(lfz lfzVar, lfz lfzVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7616def6", new Object[]{this, lfzVar, lfzVar2})).byteValue();
        }
        if (!ckf.b(dun.b(lfzVar.getClass()), dun.b(lfzVar2.getClass()))) {
            return a.a((byte) 0);
        }
        if (ckf.b(lfzVar, lfzVar2)) {
            return a.a((byte) 2);
        }
        return a.a((byte) 1);
    }

    public final viz b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (viz) ipChange.ipc$dispatch("d4b142d1", new Object[]{this});
        }
        return this.b;
    }

    public final viz c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (viz) ipChange.ipc$dispatch("571ffe8c", new Object[]{this});
        }
        return this.c;
    }

    public final nfz d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nfz) ipChange.ipc$dispatch("45c77728", new Object[]{this});
        }
        return this.d;
    }

    public final boolean e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6dc64ede", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if ((i & this.e.a()) != 0) {
            return true;
        }
        return false;
    }

    public final void f(phz phzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fae8095", new Object[]{this, phzVar});
            return;
        }
        ckf.g(phzVar, "event");
        for (nfz h = this.d.h(); h != null; h = h.h()) {
            if ((h instanceof tjz) && ((tjz) h).o(this.f29410a, phzVar)) {
                return;
            }
        }
    }

    public final nfz g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nfz) ipChange.ipc$dispatch("ece90fe5", new Object[]{this});
        }
        if (!ckf.b(this.e, this.f)) {
            nfz nfzVar = this.e;
            nfzVar.l(this.f);
            this.f.j(nfzVar);
            return this.f;
        }
        throw new IllegalStateException("Head should not be SentinelHead");
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04eb88e", new Object[]{this});
        }
    }

    public final void i() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3001947d", new Object[]{this});
            return;
        }
        for (nfz h = this.d.h(); h != null && h != this.f; h = h.h()) {
            i |= h.g();
            h.i(i);
        }
    }

    public final void j() {
        viz vizVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13ec1f05", new Object[]{this});
            return;
        }
        viz vizVar2 = this.b;
        nfz h = this.d.h();
        while (true) {
            vizVar = null;
            uaz uazVar = null;
            if (h == null) {
                break;
            }
            if (h instanceof uaz) {
                uazVar = (uaz) h;
            }
            if (uazVar != null) {
                vaz vazVar = new vaz(this.f29410a, uazVar);
                h.m(vazVar);
                vizVar2.L(vazVar);
                vazVar.K(vizVar2);
                vizVar2 = vazVar;
            } else {
                h.m(vizVar2);
            }
            h = h.h();
        }
        waz r = this.f29410a.r();
        if (r != null) {
            vizVar = r.h();
        }
        vizVar2.L(vizVar);
        this.c = vizVar2;
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9110a9a2", new Object[]{this});
            return;
        }
        for (nfz h = this.d.h(); h != null; h = h.h()) {
            if (h instanceof tjz) {
                ((tjz) h).n(this.f29410a.s());
            }
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5adec385", new Object[]{this});
            return;
        }
        for (nfz h = this.d.h(); h != null; h = h.h()) {
            if (h instanceof kkz) {
                jkz s = this.f29410a.s();
                if (s != null) {
                    ((kkz) h).n(s);
                } else {
                    throw new IllegalArgumentException("LayoutNode props must not be null");
                }
            }
        }
    }

    public final void n(List<lfz> list, List<lfz> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc07aafc", new Object[]{this, list, list2});
            return;
        }
        ckf.g(list, "oldModifier");
        ckf.g(list2, "modifier");
        nfz g = g();
        boolean o = o(g, list, list2);
        i();
        this.e = m(g);
        if (o) {
            j();
        }
        l();
        k();
    }

    public final boolean o(nfz nfzVar, List<lfz> list, List<lfz> list2) {
        nfz nfzVar2;
        boolean z = false;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da92cfd0", new Object[]{this, nfzVar, list, list2})).booleanValue();
        }
        if (!list.isEmpty() || list2.isEmpty()) {
            nfz nfzVar3 = null;
            viz vizVar = null;
            if (list.isEmpty() || !list2.isEmpty()) {
                nfz d = nfzVar.d();
                int i2 = 0;
                int i3 = 0;
                while (i2 < list.size() && i3 < list2.size()) {
                    lfz lfzVar = list.get(i2);
                    lfz lfzVar2 = list2.get(i3);
                    byte a2 = a(lfzVar, lfzVar2);
                    if (a.b(a2, a.a((byte) 0))) {
                        break;
                    }
                    if (!a.b(a2, a.a((byte) 1))) {
                        a.b(a2, a.a((byte) 2));
                    } else if (d != null) {
                        p(lfzVar, lfzVar2, d);
                    }
                    if (d == null) {
                        d = null;
                    } else {
                        d = d.d();
                    }
                    i2++;
                    i3++;
                }
                if (i2 < list.size()) {
                    if (d == null) {
                        nfzVar2 = null;
                    } else {
                        nfzVar2 = d.h();
                    }
                    if (nfzVar2 != null) {
                        nfzVar2.j(this.d);
                    }
                    nfz nfzVar4 = this.d;
                    if (d != null) {
                        nfzVar3 = d.h();
                    }
                    nfzVar4.l(nfzVar3);
                    z = true;
                }
                if (i3 >= list2.size()) {
                    return z;
                }
                nfz h = this.d.h();
                if (h != null) {
                    nfzVar = h;
                }
                int size = list2.size();
                if (i3 >= size) {
                    return true;
                }
                while (true) {
                    int i4 = i3 + 1;
                    nfzVar = b.a(Companion, list2.get(i3), nfzVar);
                    if (i4 >= size) {
                        return true;
                    }
                    i3 = i4;
                }
            } else {
                this.e = this.d;
                waz r = this.f29410a.r();
                viz vizVar2 = this.b;
                if (r != null) {
                    vizVar = r.h();
                }
                vizVar2.L(vizVar);
                this.c = this.b;
                return false;
            }
        } else {
            int size2 = list2.size() - 1;
            if (size2 >= 0) {
                while (true) {
                    int i5 = i + 1;
                    nfzVar = b.a(Companion, list2.get(i), nfzVar);
                    if (i5 > size2) {
                        break;
                    }
                    i = i5;
                }
            }
            return true;
        }
    }

    public final void p(lfz lfzVar, lfz lfzVar2, nfz nfzVar) {
        pfz pfzVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d436a96", new Object[]{this, lfzVar, lfzVar2, nfzVar});
            return;
        }
        pfz pfzVar2 = null;
        if (lfzVar instanceof pfz) {
            pfzVar = (pfz) lfzVar;
        } else {
            pfzVar = null;
        }
        if (lfzVar2 instanceof pfz) {
            pfzVar2 = (pfz) lfzVar2;
        }
        if (pfzVar != null && pfzVar2 != null) {
            q(pfzVar2, nfzVar);
        }
    }

    public final <T extends nfz> void q(pfz<T> pfzVar, nfz nfzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("326a4f1e", new Object[]{this, pfzVar, nfzVar});
        } else {
            pfzVar.a(nfzVar);
        }
    }

    public final nfz m(nfz nfzVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nfz) ipChange.ipc$dispatch("4d44c450", new Object[]{this, nfzVar});
        }
        nfz nfzVar2 = this.f;
        if (nfzVar == nfzVar2) {
            nfz d = nfzVar2.d();
            if (d == null) {
                d = this.d;
            }
            d.l(null);
            this.f.j(null);
            this.f.i(-1);
            this.f.m(null);
            if (d == this.f) {
                z = false;
            }
            if (z) {
                return d;
            }
            throw new IllegalStateException("trimChain did not update the head");
        }
        throw new IllegalStateException("trimChain called on already trimmed chain");
    }
}
