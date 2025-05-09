package com.taobao.phenix.request;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.PexodeOptions;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import tb.ad2;
import tb.dpe;
import tb.n1m;
import tb.p1m;
import tb.rs2;
import tb.t2o;
import tb.uuo;
import tb.v0a;
import tb.w3o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a extends w3o {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public PexodeOptions A;
    public boolean E;
    public ad2[] F;
    public String I;
    public boolean J;
    public boolean K;
    public boolean L;
    public String M;
    public String N;
    public long O;
    public boolean P;
    public boolean Q;
    public String l;
    public dpe m;
    public ImageStatistics o;
    public long p;
    public boolean q;
    public dpe r;
    public String s;
    public int u;
    public int v;
    public int w;
    public Map<String, String> x;
    public Map<String, String> y;
    public Future<?> z;
    public int B = 17;
    public int C = 17;
    public int D = 17;
    public boolean G = false;
    public int H = 0;
    public final p1m k = new p1m(this);
    public long n = System.currentTimeMillis();
    public int t = 1;

    static {
        t2o.a(620757138);
    }

    public a(String str, rs2 rs2Var, boolean z) {
        super(z);
        this.m = new dpe(str, rs2Var);
        this.o = new ImageStatistics(this.m);
        v0a.f(Y());
        this.o.C(this.B);
    }

    public static boolean c0(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("623683f0", new Object[]{new Integer(i), new Integer(i2)})).booleanValue();
        }
        if ((i & i2) > 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == 2022597206) {
            aVar.m();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/phenix/request/ImageRequest");
    }

    public ad2[] A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ad2[]) ipChange.ipc$dispatch("4b879952", new Object[]{this});
        }
        return this.F;
    }

    public void A0(PexodeOptions pexodeOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e0a08e9", new Object[]{this, pexodeOptions});
        } else {
            this.A = pexodeOptions;
        }
    }

    public Future<?> B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("506062eb", new Object[]{this});
        }
        return this.z;
    }

    public void B0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fddadc35", new Object[]{this, new Boolean(z)});
        } else {
            this.G = z;
        }
    }

    public int C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c22f764", new Object[]{this})).intValue();
        }
        return this.m.f();
    }

    public void C0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9e69498", new Object[]{this, new Integer(i)});
        } else {
            this.u = i;
        }
    }

    public String D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8882f649", new Object[]{this});
        }
        return this.m.g();
    }

    public void D0(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fd202ab", new Object[]{this, new Long(j)});
        } else {
            this.O = j;
        }
    }

    public int E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a83baeed", new Object[]{this})).intValue();
        }
        return this.B;
    }

    public void E0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65ec4873", new Object[]{this, str});
        } else {
            this.N = str;
        }
    }

    public String F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18ccf927", new Object[]{this});
        }
        return this.m.h();
    }

    public void F0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e6b77c6", new Object[]{this, str});
        } else {
            this.M = str;
        }
    }

    public dpe G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dpe) ipChange.ipc$dispatch("7f06df7e", new Object[]{this});
        }
        return this.m;
    }

    public void G0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("643289c8", new Object[]{this, str});
        } else {
            this.r = new dpe(str, this.m.e());
        }
    }

    public int H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64ced0f7", new Object[]{this})).intValue();
        }
        return this.C;
    }

    public void H0(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93173cf2", new Object[]{this, new Long(j)});
        } else {
            this.p = j;
        }
    }

    public Map<String, String> I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4d190648", new Object[]{this});
        }
        return this.x;
    }

    public void I0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a46b9c4a", new Object[]{this});
            return;
        }
        this.H = 1 | this.H;
        o0();
    }

    public int J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e0b074", new Object[]{this})).intValue();
        }
        return this.w;
    }

    public void J0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788bb7cb", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            this.H |= 8;
        } else {
            this.H &= -9;
        }
        o0();
    }

    public int K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a79a428d", new Object[]{this})).intValue();
        }
        return this.v;
    }

    public void K0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7454287", new Object[]{this, new Boolean(z)});
            return;
        }
        this.L = z;
        this.m.s(z);
        dpe dpeVar = this.r;
        if (dpeVar != null) {
            dpeVar.s(z);
        }
    }

    public String L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6d3506e5", new Object[]{this});
        }
        return this.m.k();
    }

    public boolean L0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd5f66f3", new Object[]{this})).booleanValue();
        }
        return this.G;
    }

    public int M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e7ecc989", new Object[]{this})).intValue();
        }
        return this.D;
    }

    public void M0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ffd5caa", new Object[]{this, new Boolean(z)});
        } else {
            this.Q = z;
        }
    }

    public String N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8cdd20c", new Object[]{this});
        }
        return this.l;
    }

    public boolean N0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ca80dfa", new Object[]{this})).booleanValue();
        }
        return this.P;
    }

    public String O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f56e13e", new Object[]{this});
        }
        return this.m.l();
    }

    public boolean O0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee4134e4", new Object[]{this})).booleanValue();
        }
        return this.Q;
    }

    public PexodeOptions P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PexodeOptions) ipChange.ipc$dispatch("e3ef0691", new Object[]{this});
        }
        return this.A;
    }

    public void P0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77898215", new Object[]{this, new Boolean(z)});
            return;
        }
        this.P = z;
        if (z) {
            G().a("#FHIGHQUALITY");
            u("#FHIGHQUALITY");
        }
    }

    public synchronized p1m Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p1m) ipChange.ipc$dispatch("92fc9062", new Object[]{this});
        }
        return this.k;
    }

    public Map<String, Long> R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a6c008c7", new Object[]{this});
        }
        if (g() == null) {
            return new HashMap();
        }
        return ((n1m) g()).g();
    }

    public int S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a713bb2", new Object[]{this})).intValue();
        }
        return this.u;
    }

    public long T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a082971", new Object[]{this})).longValue();
        }
        return this.n;
    }

    public long U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff251bb9", new Object[]{this})).longValue();
        }
        return this.O;
    }

    public String V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c14dd8cb", new Object[]{this});
        }
        return this.N;
    }

    public String W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8ab72718", new Object[]{this});
        }
        return this.M;
    }

    public dpe X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dpe) ipChange.ipc$dispatch("bb8b9a57", new Object[]{this});
        }
        return this.r;
    }

    public synchronized ImageStatistics Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageStatistics) ipChange.ipc$dispatch("946a835f", new Object[]{this});
        }
        return this.o;
    }

    public int Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("81af3836", new Object[]{this})).intValue();
        }
        return this.m.n();
    }

    public long a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cee0992", new Object[]{this})).longValue();
        }
        return this.p;
    }

    public boolean b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d17d9f7", new Object[]{this})).booleanValue();
        }
        return this.m.p();
    }

    public boolean d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb1d0fa", new Object[]{this})).booleanValue();
        }
        return this.J;
    }

    @Override // tb.w3o
    public synchronized String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d70ecdcc", new Object[]{this});
        }
        if (this.s == null) {
            String g = this.m.g();
            StringBuilder sb = new StringBuilder(g.length() + 30);
            sb.append("#SLEVEL$");
            sb.append(this.t);
            sb.append("#FLAGS$");
            sb.append(this.H);
            sb.append("#MAXW$");
            sb.append(this.v);
            sb.append("#MAXH$");
            sb.append(this.w);
            sb.append("#SPRIOR$");
            sb.append(h());
            sb.append("#DPRIOR$");
            sb.append(this.B);
            sb.append("#CATALOG$");
            sb.append(g);
            sb.append(this.m.f());
            if (this.r != null) {
                sb.append("#SECOND$");
                sb.append(this.r.g());
                sb.append('$');
                sb.append(this.r.f());
            }
            String str = this.I;
            if (str != null) {
                sb.append(str);
            }
            this.s = sb.substring(0);
        }
        return this.s;
    }

    public boolean e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a961b5e8", new Object[]{this})).booleanValue();
        }
        return this.K;
    }

    public boolean f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("271a0622", new Object[]{this})).booleanValue();
        }
        if ((this.H & 4) > 0) {
            return true;
        }
        return false;
    }

    public boolean g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7f6dbb7", new Object[]{this})).booleanValue();
        }
        if ((this.H & 2) > 0) {
            return true;
        }
        return false;
    }

    public boolean h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e945a81b", new Object[]{this})).booleanValue();
        }
        return this.E;
    }

    public boolean i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43085e0f", new Object[]{this})).booleanValue();
        }
        return this.q;
    }

    public boolean j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25aaf344", new Object[]{this})).booleanValue();
        }
        if ((this.H & 1) > 0) {
            return true;
        }
        return false;
    }

    public boolean k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2be8d21", new Object[]{this})).booleanValue();
        }
        if ((this.H & 8) > 0) {
            return true;
        }
        return false;
    }

    public boolean l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a636363b", new Object[]{this})).booleanValue();
        }
        return this.L;
    }

    public void m0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d61ff00", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            this.H |= 4;
        } else {
            this.H &= -5;
        }
        o0();
    }

    public void n0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8039c5b7", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            this.H |= 2;
        } else {
            this.H &= -3;
        }
        o0();
    }

    public final synchronized void o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f75e15fa", new Object[]{this});
            return;
        }
        if (this.s != null) {
            this.s = null;
        }
    }

    public void p0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab872453", new Object[]{this, new Boolean(z)});
        } else {
            this.E = z;
        }
    }

    @Override // tb.w3o
    public void r(w3o w3oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1e7a65a", new Object[]{this, w3oVar});
            return;
        }
        a aVar = (a) w3oVar;
        ImageStatistics Y = aVar.Y();
        this.o.a(true);
        this.o.b(Y.l());
        this.o.A(Y.k());
        this.o.G(Y.q());
        Map<String, Long> R = R();
        for (Map.Entry<String, Long> entry : aVar.R().entrySet()) {
            if (!R.containsKey(entry.getKey())) {
                R.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public void r0(ad2[] ad2VarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7480c85c", new Object[]{this, ad2VarArr});
            return;
        }
        String str = "";
        for (ad2 ad2Var : ad2VarArr) {
            if (ad2Var != null) {
                str = str + "#PROCESSOR_" + ad2Var.getClass().hashCode();
                String id = ad2Var.getId();
                if (!TextUtils.isEmpty(id)) {
                    str = str + "$" + id;
                }
            }
        }
        this.F = ad2VarArr;
        G().a(str);
        u(str);
    }

    public void s0(Future<?> future) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0e1425", new Object[]{this, future});
        } else {
            this.z = future;
        }
    }

    public synchronized void t(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("369e6e77", new Object[]{this, str, str2});
            return;
        }
        if (this.x == null) {
            HashMap hashMap = new HashMap();
            this.x = hashMap;
            this.o.D(hashMap);
        }
        this.x.put(str, str2);
    }

    public void t0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("917e3f55", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.B;
        if (i2 != i) {
            this.C = i2;
            this.B = i;
            this.o.C(i);
            o0();
        }
    }

    public final synchronized void u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e9ca35a", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            if (this.I == null) {
                this.I = str;
            } else {
                this.I += str;
            }
            o0();
        }
    }

    public void u0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c99f9ca8", new Object[]{this, new Boolean(z)});
        } else {
            this.K = z;
        }
    }

    public void v(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e14e8b0", new Object[]{this, new Boolean(z), new Integer(i)});
            return;
        }
        if (z) {
            this.t |= i;
        } else {
            this.t &= ~i;
        }
        o0();
    }

    public void v0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d6154ae", new Object[]{this, new Integer(i)});
        } else if (this.w != i) {
            this.w = i;
            this.m.r(this.v, i);
            o0();
        }
    }

    public void w(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cddc9052", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        uuo m = G().m();
        m.m = i;
        m.n = z;
        StringBuilder sb = new StringBuilder("#THUMBNAIL$");
        if (z) {
            i *= 10000;
        }
        sb.append(i);
        String sb2 = sb.toString();
        G().a(sb2);
        u(sb2);
    }

    public void w0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2744901d", new Object[]{this, new Integer(i)});
        } else if (this.v != i) {
            this.v = i;
            this.m.r(i, this.w);
            o0();
        }
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea321f3", new Object[]{this});
        } else {
            this.r = null;
        }
    }

    public void x0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c579a539", new Object[]{this, new Integer(i)});
        } else {
            this.D = i;
        }
    }

    public void y(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41b3d2e6", new Object[]{this, new Boolean(z)});
            return;
        }
        this.J = z;
        if (z) {
            G().a("#FSTATIC");
            u("#FSTATIC");
        }
    }

    public void y0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7d5f6ea", new Object[]{this, str});
        } else {
            this.l = str;
        }
    }

    public int z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d2a4aab", new Object[]{this})).intValue();
        }
        return this.t;
    }

    public synchronized void z0(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93a8c7c8", new Object[]{this, map});
            return;
        }
        this.y = map;
        this.o.E(map);
    }

    public synchronized void q0(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e836e8ab", new Object[]{this, str});
            return;
        }
        m();
        this.q = true;
        this.n = System.currentTimeMillis();
        this.r = null;
        this.z = null;
        if (!str.equals(this.m.l())) {
            this.m = new dpe(str, this.m.e());
            this.s = null;
        }
        ImageStatistics imageStatistics = this.o;
        if (imageStatistics != null) {
            str2 = imageStatistics.s;
        } else {
            str2 = "";
        }
        this.o = new ImageStatistics(this.m, true);
        if (!TextUtils.isEmpty(str2)) {
            this.o.s = str2;
        }
        v0a.f(this.o);
        Map<String, String> map = this.x;
        if (map != null) {
            ((HashMap) map).remove("inner_is_async_http");
            ((HashMap) this.x).put("retry_request", "true");
            this.o.D(this.x);
        }
        this.o.C(this.B);
    }
}
