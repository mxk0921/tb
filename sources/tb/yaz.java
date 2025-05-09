package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.zaz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class yaz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final waz f31950a;
    public boolean d;
    public boolean f;
    public long b = eaz.Companion.a();
    public final a c = new a(this, this);
    public long e = v2z.b(0, 0, 0, 0, 15, null);
    public byte g = zaz.Companion.a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public final class a extends qjz implements ldz {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final yaz f;
        public ofz g;
        public final /* synthetic */ yaz h;

        static {
            t2o.a(598737386);
            t2o.a(598737023);
        }

        public a(yaz yazVar, yaz yazVar2) {
            ckf.g(yazVar, "this$0");
            ckf.g(yazVar2, "layoutDelegate");
            this.h = yazVar;
            this.f = yazVar2;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/node/LayoutNodeLayoutDelegate$MeasurePassDelegate");
        }

        public final boolean A() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8fcb2328", new Object[]{this})).booleanValue();
            }
            ofz a2 = this.f.k().a();
            if (a() == null && a2 == null) {
                return false;
            }
            z(a2);
            return true;
        }

        @Override // tb.jaz
        public ofz a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ofz) ipChange.ipc$dispatch("2725aa5f", new Object[]{this});
            }
            return this.g;
        }

        @Override // tb.ldz
        public qjz d(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qjz) ipChange.ipc$dispatch("606f543b", new Object[]{this, new Long(j)});
            }
            x(j);
            return this;
        }

        @Override // tb.qjz
        public void p(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7acd6412", new Object[]{this, new Long(j)});
            } else {
                w(j);
            }
        }

        public final void v() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cda67da5", new Object[]{this});
                return;
            }
            odz z = this.f.c().z();
            if (z != null) {
                z.a();
            }
        }

        public final void w(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("630f9410", new Object[]{this, new Long(j)});
                return;
            }
            yaz yazVar = this.h;
            zaz.a aVar = zaz.Companion;
            yaz.b(yazVar, aVar.b());
            this.f.p(j);
            this.f.k().n(j);
            yaz.b(this.h, aVar.a());
        }

        public final boolean x(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a26acc48", new Object[]{this, new Long(j)})).booleanValue();
            }
            if (this.f.j() || !u2z.g(j(), j)) {
                this.h.o(j);
                u(j);
                viz k = this.f.k();
                long b = k.x().a().b();
                this.f.n(j);
                boolean z = !haz.d(b, k.x().a().b());
                t(iaz.a(k.k(), k.h()));
                return z;
            }
            yaz.a(this.f).l().forceMeasureTheSubtree(yaz.a(this.f));
            return false;
        }

        public final void y() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("18845bc0", new Object[]{this});
            } else {
                w(this.h.e());
            }
        }

        public void z(ofz ofzVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("faeb8797", new Object[]{this, ofzVar});
            } else {
                this.g = ofzVar;
            }
        }
    }

    static {
        t2o.a(598737385);
    }

    public yaz(waz wazVar) {
        ckf.g(wazVar, "layoutNode");
        this.f31950a = wazVar;
        new ArrayList();
    }

    public static final /* synthetic */ waz a(yaz yazVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (waz) ipChange.ipc$dispatch("583f9270", new Object[]{yazVar});
        }
        return yazVar.f31950a;
    }

    public static final /* synthetic */ void b(yaz yazVar, byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9785582", new Object[]{yazVar, new Byte(b)});
        } else {
            yazVar.g = b;
        }
    }

    public final viz c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (viz) ipChange.ipc$dispatch("6be2aa6a", new Object[]{this});
        }
        return this.f31950a.h();
    }

    public final long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76637ba", new Object[]{this})).longValue();
        }
        return this.e;
    }

    public final long e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1be8e0a0", new Object[]{this})).longValue();
        }
        return this.b;
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2b05e7", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public final byte g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e87dfa5", new Object[]{this})).byteValue();
        }
        return this.g;
    }

    public final a h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("79438c63", new Object[]{this});
        }
        return this.c;
    }

    public final a i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("c31a837e", new Object[]{this});
        }
        return this.c;
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e4d25df", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public final viz k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (viz) ipChange.ipc$dispatch("c86a51a5", new Object[]{this});
        }
        return this.f31950a.q();
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2d7204c", new Object[]{this});
        } else {
            this.f = true;
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d245892", new Object[]{this});
        } else {
            this.d = true;
        }
    }

    public final void o(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64bb9fd6", new Object[]{this, new Long(j)});
        } else {
            this.e = j;
        }
    }

    public final void p(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82393ab", new Object[]{this, new Long(j)});
        } else {
            this.b = j;
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fcb2324", new Object[]{this});
        } else {
            this.c.A();
        }
    }

    public final void n(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a760477", new Object[]{this, new Long(j)});
            return;
        }
        byte g = g();
        zaz.a aVar = zaz.Companion;
        if (zaz.e(g, aVar.a())) {
            this.g = aVar.c();
            this.d = false;
            k().d(j);
            l();
            this.g = aVar.a();
            return;
        }
        throw new IllegalStateException("layout state is not idle before measure starts");
    }
}
