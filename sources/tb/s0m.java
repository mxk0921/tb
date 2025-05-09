package tb;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.cache.memory.LimitedQueue;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.request.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class s0m implements ih3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile s0m R;
    public static boolean S = false;
    public boolean T;
    public ArrayList<String> U;
    public ArrayList<String> V;
    public ArrayList<String> W;
    public ArrayList<String> X;
    public Context k;
    public boolean l;
    public vd8 o;
    public mle p;
    public pyi q;
    public List<l9h> r;
    public cqm s;
    public mke t;
    public boolean u = false;
    public boolean v = false;
    public boolean w = false;
    public boolean x = false;
    public boolean y = false;
    public boolean z = false;
    public boolean A = false;
    public boolean B = false;
    public boolean C = false;
    public boolean D = false;
    public boolean E = false;
    public boolean F = false;
    public boolean G = false;
    public boolean H = false;
    public boolean I = false;
    public boolean J = false;
    public boolean K = false;
    public boolean L = false;
    public boolean M = false;
    public boolean N = false;
    public boolean O = false;
    public boolean P = false;
    public boolean Q = false;

    /* renamed from: a  reason: collision with root package name */
    public final LimitedQueue<String> f27719a = new LimitedQueue<>(1024);
    public boolean m = true;
    public final boolean n = true;
    public final bki b = new bki();
    public final yc2 c = new yc2();
    public final aq7 d = new aq7();
    public final mp2 e = new mp2();
    public final sc9 f = new sc9();
    public final p7b g = new p7b();
    public final kuo h = new kuo();
    public final q6k j = new q6k(this);
    public final bq7 i = new bq7();

    static {
        t2o.a(620757093);
        t2o.a(620757016);
    }

    public static s0m B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s0m) ipChange.ipc$dispatch("4d00b4f1", new Object[0]);
        }
        if (R == null) {
            synchronized (s0m.class) {
                try {
                    if (R == null) {
                        R = new s0m();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return R;
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("628feca", new Object[]{this})).booleanValue();
        }
        return this.A;
    }

    public void A0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6921576", new Object[]{this, new Boolean(z)});
        } else {
            this.w = z;
        }
    }

    public void B0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b594f8", new Object[]{this, new Boolean(z)});
        } else {
            this.J = z;
        }
    }

    public boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96e330f0", new Object[]{this})).booleanValue();
        }
        return this.D;
    }

    public void C0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce050905", new Object[]{this, new Boolean(z)});
        } else {
            this.O = z;
        }
    }

    public boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1da1735", new Object[]{this})).booleanValue();
        }
        return this.E;
    }

    public ArrayList<String> E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("6c0dc057", new Object[]{this});
        }
        return this.W;
    }

    public boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d39edd68", new Object[]{this})).booleanValue();
        }
        return this.u;
    }

    public boolean F0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4e2fb54", new Object[]{this})).booleanValue();
        }
        return this.v;
    }

    public boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99881849", new Object[]{this})).booleanValue();
        }
        return this.L;
    }

    public boolean G0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a27d5a0", new Object[]{this})).booleanValue();
        }
        return this.w;
    }

    public boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5af54729", new Object[]{this})).booleanValue();
        }
        return this.z;
    }

    public boolean H0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e528cb22", new Object[]{this})).booleanValue();
        }
        return this.J;
    }

    public boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63dd0b28", new Object[]{this})).booleanValue();
        }
        return this.N;
    }

    public void I0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55b8c643", new Object[]{this, new Boolean(z)});
        } else {
            this.x = z;
        }
    }

    public boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28408c94", new Object[]{this})).booleanValue();
        }
        return this.K;
    }

    public void J0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f51a4d6b", new Object[]{this, new Boolean(z)});
        } else {
            this.y = z;
        }
    }

    public boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee8de438", new Object[]{this})).booleanValue();
        }
        return this.P;
    }

    public void K0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d951034", new Object[]{this, new Boolean(z)});
        } else {
            this.F = z;
        }
    }

    public boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c90e2af7", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    public void L0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94e2ba60", new Object[]{this, new Boolean(z)});
        } else {
            d17.c(z);
        }
    }

    public boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23dcec31", new Object[]{this})).booleanValue();
        }
        return this.n;
    }

    public void M0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75ac5807", new Object[]{this, new Boolean(z)});
            return;
        }
        this.Q = z;
        q6k q6kVar = this.j;
        if (q6kVar != null) {
            q6kVar.e(z);
        }
    }

    public boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7411aa7b", new Object[]{this})).booleanValue();
        }
        return this.O;
    }

    public synchronized s0m N0(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s0m) ipChange.ipc$dispatch("8aaa7030", new Object[]{this, context});
        }
        fpm.d(context, "Phenix with context must not be null.");
        if (this.k == null) {
            this.k = context.getApplicationContext();
        }
        return this;
    }

    public boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7f415ff", new Object[]{this})).booleanValue();
        }
        return this.x;
    }

    public ArrayList<String> O0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("265af89b", new Object[]{this});
        }
        return this.U;
    }

    public boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca9cfc03", new Object[]{this})).booleanValue();
        }
        return this.y;
    }

    public ArrayList<String> P0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("443d9cfd", new Object[]{this});
        }
        return this.X;
    }

    public boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b065fe6e", new Object[]{this})).booleanValue();
        }
        return this.F;
    }

    public ArrayList<String> Q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("d12cdb41", new Object[]{this});
        }
        return this.V;
    }

    public boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23cd6967", new Object[]{this})).booleanValue();
        }
        return this.Q;
    }

    public boolean R0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41f5516b", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void S(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfa6165", new Object[]{this, new Boolean(z)});
            return;
        }
        q6k q6kVar = this.j;
        if (q6kVar != null) {
            q6kVar.d(z);
        }
    }

    public void S0(ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d512f41", new Object[]{this, arrayList});
        } else if (arrayList != null && arrayList.size() > 0) {
            this.W = arrayList;
        }
    }

    public PhenixCreator T(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("515060be", new Object[]{this, str});
        }
        return V(null, str, B().o());
    }

    public void T0(ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("839eb37d", new Object[]{this, arrayList});
        } else if (arrayList != null && arrayList.size() > 0) {
            this.U = arrayList;
        }
    }

    public PhenixCreator U(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("8f04c4f4", new Object[]{this, str, str2});
        }
        return V(str, str2, B().o());
    }

    public void U0(ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b1ce75b", new Object[]{this, arrayList});
        } else if (arrayList != null && arrayList.size() > 0) {
            this.X = arrayList;
        }
    }

    public PhenixCreator V(String str, String str2, rs2 rs2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("ede8f976", new Object[]{this, str, str2, rs2Var});
        }
        return new PhenixCreator(u(str), str2, rs2Var);
    }

    public void V0(ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33092597", new Object[]{this, arrayList});
        } else if (arrayList != null && arrayList.size() > 0) {
            this.V = arrayList;
        }
    }

    public PhenixCreator W(String str, rs2 rs2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixCreator) ipChange.ipc$dispatch("bd15a36c", new Object[]{this, str, rs2Var});
        }
        return V(null, str, rs2Var);
    }

    public void W0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8815c79", new Object[]{this, new Boolean(z)});
        } else {
            this.T = z;
        }
    }

    public boolean X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df1e0265", new Object[]{this})).booleanValue();
        }
        return this.G;
    }

    public boolean X0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44dcc43d", new Object[]{this})).booleanValue();
        }
        return this.T;
    }

    public boolean Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89ee1616", new Object[]{this})).booleanValue();
        }
        return this.C;
    }

    public bki Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bki) ipChange.ipc$dispatch("a43824d8", new Object[]{this});
        }
        return this.b;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2165e47", new Object[]{this, new Boolean(z)});
        }
    }

    public void a0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("225f4805", new Object[]{this, new Boolean(z)});
        } else {
            this.z = z;
        }
    }

    public Context b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("1c10e83e", new Object[]{this});
        }
        return this.k;
    }

    public boolean b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a474442d", new Object[]{this})).booleanValue();
        }
        return this.I;
    }

    public yc2 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yc2) ipChange.ipc$dispatch("f4f1a258", new Object[]{this});
        }
        return this.c;
    }

    public boolean c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8419027", new Object[]{this})).booleanValue();
        }
        return this.B;
    }

    public synchronized void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac6c63f5", new Object[]{this});
            return;
        }
        fpm.d(this.k, "Phenix.with(Context) hasn't been called before chain producer building");
        this.j.a();
        this.l = true;
        fiv.f("Initialize", "Phenix chain producer build complete", new Object[0]);
    }

    public void d0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c2de4fa", new Object[]{this, new Boolean(z)});
        } else {
            this.K = z;
        }
    }

    public mp2 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mp2) ipChange.ipc$dispatch("6b1d796", new Object[]{this});
        }
        return this.e;
    }

    public gqm e0(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gqm) ipChange.ipc$dispatch("73a0a611", new Object[]{this, str, list});
        }
        return new gqm(w(str), list);
    }

    @Deprecated
    public void f(p1m p1mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("573528d8", new Object[]{this, p1mVar});
        } else if (p1mVar != null) {
            p1mVar.a();
        }
    }

    public s0m f0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s0m) ipChange.ipc$dispatch("6fd1300c", new Object[]{this, new Boolean(z)});
        }
        this.m = z;
        return this;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c823e69b", new Object[]{this});
        } else if (this.l) {
            this.b.a().clear();
            for (zp7 zp7Var : this.d.a().getAll()) {
                if (zp7Var.b(this.k)) {
                    zp7Var.clear();
                }
            }
            fiv.k("UserAction", "clear all phenix cache", new Object[0]);
        }
    }

    public boolean g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec80252d", new Object[]{this})).booleanValue();
        }
        return this.H;
    }

    public aq7 h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aq7) ipChange.ipc$dispatch("eda69892", new Object[]{this});
        }
        return this.d;
    }

    public boolean h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("575a1a67", new Object[]{this})).booleanValue();
        }
        return this.M;
    }

    public bq7 i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bq7) ipChange.ipc$dispatch("bcc3d9a8", new Object[]{this});
        }
        return this.i;
    }

    public boolean i0(l9h l9hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5688bf7", new Object[]{this, l9hVar})).booleanValue();
        }
        synchronized (this) {
            try {
                if (this.r == null) {
                    this.r = new CopyOnWriteArrayList();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.r.add(l9hVar);
    }

    public t9o j(String str, String str2, int i, boolean z) {
        String str3;
        int i2;
        int i3;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t9o) ipChange.ipc$dispatch("3cb73c1d", new Object[]{this, str, str2, new Integer(i), new Boolean(z)});
        }
        fpm.b(!jjo.b(), "fetchDiskCache must be called in non-main thread");
        t9o t9oVar = null;
        if (!this.l) {
            return null;
        }
        if (z) {
            str3 = str2;
            i2 = i;
        } else {
            a aVar = new a(str2, null, false);
            if (aVar.G().q()) {
                return null;
            }
            str3 = aVar.D();
            i2 = aVar.C();
        }
        oyi u = u(str);
        if (u != null) {
            i3 = u.d;
        } else {
            i3 = 17;
        }
        zp7 zp7Var = h().a().get(i3);
        if (zp7Var != null && zp7Var.b(this.k)) {
            t9oVar = zp7Var.get(str3, i2);
        }
        Integer valueOf = Integer.valueOf(i);
        Boolean valueOf2 = Boolean.valueOf(z);
        if (t9oVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        fiv.n("UserAction", str2, "fetch disk cache, module=%s, catalog=%d, direct=%b, result=%B", str, valueOf, valueOf2, Boolean.valueOf(z2));
        return t9oVar;
    }

    public kuo j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kuo) ipChange.ipc$dispatch("ac97cfbe", new Object[]{this});
        }
        return this.h;
    }

    @Deprecated
    public BitmapDrawable k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapDrawable) ipChange.ipc$dispatch("70e503b3", new Object[]{this, str});
        }
        if (!this.l) {
            return null;
        }
        return pki.R(Z().a(), new a(str, null, false).L(), false);
    }

    public void k0(vd8 vd8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d003e5", new Object[]{this, vd8Var});
        } else {
            this.o = vd8Var;
        }
    }

    public sc9 l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sc9) ipChange.ipc$dispatch("61351d8", new Object[]{this});
        }
        return this.f;
    }

    public void l0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf45128", new Object[]{this, new Boolean(z)});
        } else {
            this.u = z;
        }
    }

    public void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ae17769", new Object[]{this, new Boolean(z)});
        } else {
            this.D = z;
        }
    }

    public void m0(mke mkeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c7a0762", new Object[]{this, mkeVar});
        } else {
            this.t = mkeVar;
        }
    }

    public void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ec759c4", new Object[]{this, new Boolean(z)});
        } else {
            this.E = z;
        }
    }

    public rs2 o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rs2) ipChange.ipc$dispatch("8892cadb", new Object[]{this});
        }
        return null;
    }

    public void o0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ab6118c", new Object[]{this, new Boolean(z)});
        } else {
            this.A = z;
        }
    }

    public vd8 p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vd8) ipChange.ipc$dispatch("ee41c699", new Object[]{this});
        }
        return this.o;
    }

    public void p0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab1798d1", new Object[]{this, new Boolean(z)});
        } else {
            this.G = z;
        }
    }

    public List<l9h> q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4ab06403", new Object[]{this});
        }
        return this.r;
    }

    public void q0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf0dca40", new Object[]{this, new Boolean(z)});
        } else {
            this.C = z;
        }
    }

    public mke r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mke) ipChange.ipc$dispatch("d04d2abc", new Object[]{this});
        }
        return this.t;
    }

    public void r0(pyi pyiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de12dc92", new Object[]{this, pyiVar});
        } else {
            this.q = pyiVar;
        }
    }

    public mle s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mle) ipChange.ipc$dispatch("3ac8da5a", new Object[]{this});
        }
        return this.p;
    }

    public void s0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de458667", new Object[]{this, new Boolean(z)});
        } else {
            this.L = z;
        }
    }

    public LimitedQueue<String> t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LimitedQueue) ipChange.ipc$dispatch("f79f36f5", new Object[]{this});
        }
        return this.f27719a;
    }

    public void t0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e8eef68", new Object[]{this, new Boolean(z)});
        } else {
            this.N = z;
        }
    }

    public final oyi u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oyi) ipChange.ipc$dispatch("15291f28", new Object[]{this, str});
        }
        pyi pyiVar = this.q;
        if (pyiVar != null) {
            return ((zpr) pyiVar).a(str);
        }
        return null;
    }

    public void u0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0454109", new Object[]{this, new Boolean(z)});
        } else {
            this.I = z;
        }
    }

    public synchronized cqm v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cqm) ipChange.ipc$dispatch("43328ed5", new Object[]{this});
        }
        if (this.s == null) {
            this.s = new cqm(this);
        }
        if (this.l) {
            this.s.a();
        }
        return this.s;
    }

    public void v0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bc62393", new Object[]{this, new Boolean(z)});
        } else {
            this.B = z;
        }
    }

    public final oyi w(String str) {
        oyi oyiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oyi) ipChange.ipc$dispatch("a2f8f699", new Object[]{this, str});
        }
        if (this.q == null) {
            return new oyi("common", 2, 17, 17, false, true);
        }
        if (H0() || !TextUtils.equals("trade-module", str)) {
            oyiVar = ((zpr) this.q).a(str);
        } else {
            oyiVar = ((zpr) this.q).a("common");
        }
        if (oyiVar != null) {
            return oyiVar;
        }
        throw new RuntimeException("preload module[" + str + "] strategy hasn't been registered, please contact zhaomi.zm@alibaba-inc.com");
    }

    public void w0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f0d4a58", new Object[]{this, new Boolean(z)});
        } else {
            this.P = z;
        }
    }

    public q6k x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q6k) ipChange.ipc$dispatch("55f82d2e", new Object[]{this});
        }
        return this.j;
    }

    public void x0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f43b789", new Object[]{this, new Boolean(z)});
        } else {
            this.H = z;
        }
    }

    public ouo y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ouo) ipChange.ipc$dispatch("c0e7dc93", new Object[]{this});
        }
        return this.j.c();
    }

    public void y0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25aecb8f", new Object[]{this, new Boolean(z)});
        } else {
            this.M = z;
        }
    }

    public p7b z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p7b) ipChange.ipc$dispatch("f4552858", new Object[]{this});
        }
        return this.g;
    }

    public void z0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43521e06", new Object[]{this, new Boolean(z)});
        } else {
            this.v = z;
        }
    }

    public void D0(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c3980c8", new Object[]{this, str, new Integer(i)});
            return;
        }
        fiv.c("Phenix", "startLimit " + str + ", " + i, new Object[0]);
        eko.l(str, i);
    }

    public void E0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a18f5fb", new Object[]{this, str});
            return;
        }
        fiv.c("Phenix", "stopLimit " + str, new Object[0]);
        eko.m(str);
    }

    public void n0(mle mleVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f81dcec", new Object[]{this, mleVar});
            return;
        }
        this.p = mleVar;
        fiv.f("Initialize", "setup image flow monitor=%s", mleVar);
    }
}
