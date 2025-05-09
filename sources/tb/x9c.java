package tb;

import android.content.Context;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.business.mess.LiveDetailMessinfoResponseData;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class x9c implements w9c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final haa f31228a = new haa();
    public final jaa b = new jaa();
    public final qca c = new qca();

    static {
        t2o.a(806356074);
        t2o.a(806356073);
    }

    public x9c() {
        o3s.b("IGlobalDataCenterImpl", "init new data");
    }

    @Override // tb.e9c
    public String A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80fe1c8d", new Object[]{this});
        }
        if (q() != null) {
            return q().x();
        }
        return null;
    }

    @Override // tb.u9c
    public void A2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d152ee09", new Object[]{this, str});
        } else if (q() != null) {
            q().b0(str);
        }
    }

    @Override // tb.u9c
    public void B(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5db82b7", new Object[]{this, new Boolean(z)});
        } else if (X0() != null) {
            X0().V(z);
        }
    }

    @Override // tb.u9c
    public void C0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("774a3d5c", new Object[]{this, new Boolean(z)});
        } else if (O1() != null) {
            O1().e(z);
        }
    }

    @Override // tb.e9c
    public String C1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea350117", new Object[]{this});
        }
        if (O1() != null) {
            return O1().b();
        }
        return null;
    }

    @Override // tb.u9c
    public void C2(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31f30be9", new Object[]{this, new Integer(i)});
        } else if (X0() != null) {
            X0().o0(i);
        }
    }

    @Override // tb.e9c
    public String D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbe8d995", new Object[]{this});
        }
        if (q() != null) {
            return q().L();
        }
        return null;
    }

    @Override // tb.e9c
    public int D1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4de96b0a", new Object[]{this})).intValue();
        }
        if (X0() != null) {
            return X0().o();
        }
        return 0;
    }

    @Override // tb.u9c
    public void E(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33d12c61", new Object[]{this, new Long(j)});
        } else if (X0() != null) {
            X0().Z(j);
        }
    }

    @Override // tb.u9c
    public void E0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db3eb3db", new Object[]{this, str});
        } else if (X0() != null) {
            X0().e0(str);
        }
    }

    @Override // tb.e9c
    public String E1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48e5b1d6", new Object[]{this});
        }
        if (q() != null) {
            return q().e();
        }
        return null;
    }

    @Override // tb.e9c
    public String F0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3bbd726", new Object[]{this});
        }
        if (q() != null) {
            return q().z();
        }
        return null;
    }

    @Override // tb.u9c
    public void G0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0cd439c", new Object[]{this, str});
        } else if (X0() != null) {
            X0().a0(str);
        }
    }

    @Override // tb.u9c
    public void G1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb87b7c8", new Object[]{this, str});
        } else if (q() != null) {
            q().W(str);
        }
    }

    @Override // tb.u9c
    public void H(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bed60ca", new Object[]{this, str});
        } else if (q() != null) {
            q().E0(str);
        }
    }

    @Override // tb.u9c
    public void H0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dce5902e", new Object[]{this, str});
        } else if (X0() != null) {
            X0().H(str);
        }
    }

    @Override // tb.u9c
    public void H1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("701a01bc", new Object[]{this, str});
        } else if (q() != null) {
            q().e0(str);
        }
    }

    @Override // tb.u9c
    public void H2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b27b5738", new Object[]{this, str});
        } else if (q() != null) {
            q().u0(str);
        }
    }

    @Override // tb.u9c
    public void I(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d426dc3", new Object[]{this, str});
        } else if (q() != null) {
            q().v0(str);
        }
    }

    @Override // tb.u9c
    public void I0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47bb8598", new Object[]{this, str});
        } else if (q() != null) {
            q().t0(str);
        }
    }

    @Override // tb.u9c
    public void I1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe294ac", new Object[]{this, str});
        } else if (X0() != null) {
            X0().X(str);
        }
    }

    @Override // tb.e9c
    public long I2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9cd0943", new Object[]{this})).longValue();
        }
        if (X0() != null) {
            return X0().h();
        }
        return 0L;
    }

    @Override // tb.u9c
    public void J(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7e2a4d4", new Object[]{this, new Boolean(z)});
        } else if (X0() != null) {
            X0().d0(z);
        }
    }

    @Override // tb.u9c
    public void J1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee119f9e", new Object[]{this, str});
        } else if (q() != null) {
            q().c0(str);
        }
    }

    @Override // tb.e9c
    public int J2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("24308341", new Object[]{this})).intValue();
        }
        if (X0() != null) {
            return X0().p();
        }
        return 0;
    }

    @Override // tb.u9c
    public void K0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bac89ff", new Object[]{this, str});
        } else if (q() != null) {
            q().w0(str);
        }
    }

    @Override // tb.u9c
    public void K1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84be0568", new Object[]{this, new Boolean(z)});
        } else if (X0() != null) {
            X0().R(z);
        }
    }

    @Override // tb.u9c
    public void K2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16b06fcb", new Object[]{this, new Boolean(z)});
        } else if (X0() != null) {
            X0().n0(z);
        }
    }

    @Override // tb.u9c
    public void L(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96fff10b", new Object[]{this, new Boolean(z)});
        } else if (X0() != null) {
            X0().l0(z);
        }
    }

    @Override // tb.u9c
    public void L2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd828168", new Object[]{this, str});
        } else if (q() != null) {
            q().n0(str);
        }
    }

    @Override // tb.e9c
    public boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8e1afec", new Object[]{this})).booleanValue();
        }
        if (X0() != null) {
            return X0().u();
        }
        return false;
    }

    @Override // tb.e9c
    public int M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("71edfcd5", new Object[]{this})).intValue();
        }
        if (q() != null) {
            return q().u();
        }
        return 0;
    }

    @Override // tb.u9c
    public void N(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91ac6859", new Object[]{this, new Boolean(z)});
        } else if (X0() != null) {
            X0().O(z);
        }
    }

    @Override // tb.u9c
    public void N1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38459924", new Object[]{this, new Boolean(z)});
        } else if (X0() != null) {
            X0().M(z);
        }
    }

    @Override // tb.u9c
    public void O(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed18b70b", new Object[]{this, str});
        } else if (q() != null) {
            q().y0(str);
        }
    }

    @Override // tb.u9c
    public void O0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c02984e7", new Object[]{this, new Integer(i)});
        } else if (X0() != null) {
            X0().i0(i);
        }
    }

    @Override // tb.w9c
    public qca O1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qca) ipChange.ipc$dispatch("98a100d0", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.u9c
    public void P0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edc7cb29", new Object[]{this, str});
        } else if (X0() != null) {
            X0().p0(str);
        }
    }

    @Override // tb.u9c
    public void P1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2eaf169", new Object[]{this, str});
        } else if (q() != null) {
            q().T(str);
        }
    }

    @Override // tb.u9c
    public void P2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40227dbb", new Object[]{this, str});
        } else if (q() != null) {
            q().m0(str);
        }
    }

    @Override // tb.e9c
    public boolean Q1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6388b9a", new Object[]{this})).booleanValue();
        }
        if (X0() != null) {
            return X0().s();
        }
        return false;
    }

    @Override // tb.u9c
    public void Q2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdbe767a", new Object[]{this, str});
        } else if (q() != null) {
            q().V(str);
        }
    }

    @Override // tb.e9c
    public String R0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd96e01b", new Object[]{this});
        }
        if (q() != null) {
            return q().v();
        }
        return null;
    }

    @Override // tb.e9c
    public String R2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28dc8f59", new Object[]{this});
        }
        if (q() != null) {
            return q().h();
        }
        return null;
    }

    @Override // tb.u9c
    public void S(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a84e88ec", new Object[]{this, str});
        } else if (q() != null) {
            q().x0(str);
        }
    }

    @Override // tb.u9c
    public void S0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5cdc7c", new Object[]{this, str});
        } else if (q() != null) {
            q().G0(str);
        }
    }

    @Override // tb.u9c
    public void S1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf17394", new Object[]{this, str});
        } else if (q() != null) {
            q().s0(str);
        }
    }

    @Override // tb.u9c
    public void U(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b09bee49", new Object[]{this, new Boolean(z)});
        } else if (X0() != null) {
            X0().m0(z);
        }
    }

    @Override // tb.u9c
    public void U0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a397ffb", new Object[]{this, str});
        } else if (X0() != null) {
            X0().Q(str);
        }
    }

    @Override // tb.e9c
    public String V2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("924b429e", new Object[]{this});
        }
        if (q() != null) {
            return q().B();
        }
        return null;
    }

    @Override // tb.e9c
    public String W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fdb245aa", new Object[]{this});
        }
        if (q() != null) {
            return q().o();
        }
        return null;
    }

    @Override // tb.u9c
    public void W0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48090932", new Object[]{this, new Boolean(z)});
        } else if (X0() != null) {
            X0().j0(z);
        }
    }

    @Override // tb.u9c
    public void X(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631f386a", new Object[]{this, str});
        } else if (X0() != null) {
            X0().f0(str);
        }
    }

    @Override // tb.w9c
    public jaa X0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jaa) ipChange.ipc$dispatch("e43ae09e", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.e9c
    public String X1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24dd2a13", new Object[]{this});
        }
        if (q() != null) {
            return q().D();
        }
        return null;
    }

    @Override // tb.e9c
    public long Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85f69cdc", new Object[]{this})).longValue();
        }
        if (X0() != null) {
            return X0().v();
        }
        return 0L;
    }

    @Override // tb.e9c
    public String Y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65adfd43", new Object[]{this});
        }
        if (X0() != null) {
            return X0().d();
        }
        return null;
    }

    @Override // tb.u9c
    public void Y1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cbe1812", new Object[]{this, str});
        } else if (q() != null) {
            q().X(str);
        }
    }

    @Override // tb.u9c
    public void Z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ade75cd2", new Object[]{this, str});
        } else if (X0() != null) {
            X0().b0(str);
        }
    }

    @Override // tb.u9c
    public void Z0(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7188fda", new Object[]{this, map});
        } else if (q() != null) {
            q().C0(map);
        }
    }

    @Override // tb.u9c
    public void a0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb7b00b9", new Object[]{this, str});
        } else if (X0() != null) {
            X0().q0(str);
        }
    }

    @Override // tb.e9c
    public boolean a2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4255237b", new Object[]{this})).booleanValue();
        }
        if (X0() != null) {
            return X0().x();
        }
        return false;
    }

    @Override // tb.e9c
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df3f1dca", new Object[]{this});
        }
        if (q() != null) {
            return q().F();
        }
        return null;
    }

    @Override // tb.u9c
    public void b0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8e660c9", new Object[]{this, str});
        } else if (q() != null) {
            q().S(str);
        }
    }

    @Override // tb.e9c
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d835ead6", new Object[]{this});
        }
        if (q() != null) {
            return q().g();
        }
        return null;
    }

    @Override // tb.u9c
    public void c0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae088766", new Object[]{this, new Boolean(z)});
        } else if (X0() != null) {
            X0().L(z);
        }
    }

    @Override // tb.e9c
    public String c1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ca85962", new Object[]{this});
        }
        if (q() != null) {
            return q().m();
        }
        return null;
    }

    @Override // tb.e9c
    public boolean c2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a828217", new Object[]{this})).booleanValue();
        }
        if (X0() != null) {
            return X0().w();
        }
        return false;
    }

    @Override // tb.e9c
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8ae70bf", new Object[]{this});
        }
        if (q() != null) {
            return q().E();
        }
        return null;
    }

    @Override // tb.u9c
    public void e0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e72fc4a7", new Object[]{this, str});
        } else if (q() != null) {
            q().d0(str);
        }
    }

    @Override // tb.e9c
    public Map<String, String> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("57a00234", new Object[]{this});
        }
        if (q() != null) {
            return q().K();
        }
        return null;
    }

    @Override // tb.u9c
    public void f0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d23759f", new Object[]{this, new Boolean(z)});
        } else if (X0() != null) {
            X0().k0(z);
        }
    }

    @Override // tb.u9c
    public void f1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30b383d8", new Object[]{this, new Boolean(z)});
        } else if (O1() != null) {
            O1().g(z);
        }
    }

    @Override // tb.u9c
    public void g1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ebbfc81", new Object[]{this, str});
        } else if (q() != null) {
            q().h0(str);
        }
    }

    @Override // tb.e9c
    public JSONArray g2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("61ce8a1", new Object[]{this});
        }
        if (q() != null) {
            return q().t();
        }
        return null;
    }

    @Override // tb.u9c
    public void h0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54dcf007", new Object[]{this, str});
        } else if (q() != null) {
            q().B0(str);
        }
    }

    @Override // tb.u9c
    public void h2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15aefc89", new Object[]{this, str});
        } else if (q() != null) {
            q().o0(str);
        }
    }

    @Override // tb.u9c
    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a23734cf", new Object[]{this, str});
        } else if (X0() != null) {
            X0().I(str);
        }
    }

    @Override // tb.u9c
    public void i0(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fa75a14", new Object[]{this, new Long(j)});
        } else if (X0() != null) {
            X0().N(j);
        }
    }

    @Override // tb.e9c
    public String i1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc6bdf2c", new Object[]{this});
        }
        if (q() != null) {
            return q().M();
        }
        return null;
    }

    @Override // tb.u9c
    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2958effa", new Object[]{this, str});
        } else if (q() != null) {
            q().D0(str);
        }
    }

    @Override // tb.u9c
    public void j0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bfb0806", new Object[]{this, str});
        } else if (q() != null) {
            q().F0(str);
        }
    }

    @Override // tb.e9c
    public boolean j2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67bf84bf", new Object[]{this})).booleanValue();
        }
        if (X0() != null) {
            return X0().E();
        }
        return false;
    }

    @Override // tb.u9c
    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8af44c8", new Object[]{this, str});
        } else if (q() != null) {
            q().Y(str);
        }
    }

    @Override // tb.u9c
    public void k0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b67211db", new Object[]{this, new Boolean(z)});
        } else if (q() != null) {
            q().q0(z);
        }
    }

    @Override // tb.u9c
    public void k1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5fcc978", new Object[]{this, str});
        } else if (q() != null) {
            q().r0(str);
        }
    }

    @Override // tb.u9c
    public void k2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a443dd60", new Object[]{this, str});
        } else if (q() != null) {
            q().H0(str);
        }
    }

    @Override // tb.e9c
    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b843c925", new Object[]{this})).booleanValue();
        }
        if (X0() != null) {
            return X0().C();
        }
        return false;
    }

    @Override // tb.u9c
    public void l0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da4777b5", new Object[]{this, str});
        } else if (q() != null) {
            q().U(str);
        }
    }

    @Override // tb.u9c
    public void l1(LiveDetailMessinfoResponseData.AlimamaInfo2 alimamaInfo2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("407a5625", new Object[]{this, alimamaInfo2});
        } else if (X0() != null) {
            X0().F(alimamaInfo2);
        }
    }

    @Override // tb.e9c
    public boolean l2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc25ea84", new Object[]{this})).booleanValue();
        }
        if (X0() != null) {
            return X0().t();
        }
        return false;
    }

    @Override // tb.u9c
    public void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c202e242", new Object[]{this, new Boolean(z)});
        } else if (X0() != null) {
            X0().W(z);
        }
    }

    @Override // tb.u9c
    public void m0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bff3ef", new Object[]{this, str});
        } else if (q() != null) {
            q().p0(str);
        }
    }

    @Override // tb.u9c
    public void m2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7878ca1c", new Object[]{this, new Boolean(z)});
        } else if (X0() != null) {
            X0().K(z);
        }
    }

    @Override // tb.e9c
    public String n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("649f3e25", new Object[]{this});
        }
        if (q() != null) {
            return q().n();
        }
        return null;
    }

    @Override // tb.u9c
    public void n1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("932d6b3d", new Object[]{this, str});
        } else if (X0() != null) {
            X0().g0(str);
        }
    }

    @Override // tb.u9c
    public void n2(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82175313", new Object[]{this, new Integer(i)});
        } else if (X0() != null) {
            X0().r0(i);
        }
    }

    @Override // tb.u9c
    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74498b6", new Object[]{this, str});
        } else if (q() != null) {
            q().j0(str);
        }
    }

    @Override // tb.u9c
    public void o0(rvd rvdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef9a9a1a", new Object[]{this, rvdVar});
            return;
        }
        qca qcaVar = this.c;
        if (qcaVar != null) {
            qcaVar.f(rvdVar);
        }
    }

    @Override // tb.u9c
    public void o1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60f0025d", new Object[]{this, str});
        } else if (X0() != null) {
            X0().G(str);
        }
    }

    @Override // tb.u9c
    public void o2(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dbeb98f", new Object[]{this, new Long(j)});
        } else if (X0() != null) {
            X0().Y(j);
        }
    }

    @Override // tb.w9c
    public haa q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (haa) ipChange.ipc$dispatch("82254968", new Object[]{this});
        }
        return this.f31228a;
    }

    @Override // tb.u9c
    public void q0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e43af5b4", new Object[]{this, str});
        } else if (q() != null) {
            q().A0(str);
        }
    }

    @Override // tb.e9c
    public String q1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aae5c7d8", new Object[]{this});
        }
        if (q() != null) {
            return q().N();
        }
        return null;
    }

    @Override // tb.u9c
    public void q2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba25e0f1", new Object[]{this, str});
        } else if (q() != null) {
            q().f0(str);
        }
    }

    @Override // tb.e9c
    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da7a7ab8", new Object[]{this})).booleanValue();
        }
        if (O1() != null) {
            return O1().c();
        }
        return false;
    }

    @Override // tb.u9c
    public void s0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c0169d2", new Object[]{this, str});
        } else if (X0() != null) {
            X0().h0(str);
        }
    }

    @Override // tb.u9c
    public void s1(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2825d2d5", new Object[]{this, new Integer(i)});
        } else if (q() != null) {
            q().l0(i);
        }
    }

    @Override // tb.u9c
    public ViewGroup t(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("ad711da", new Object[]{this, context});
        }
        qca qcaVar = this.c;
        if (qcaVar != null) {
            return qcaVar.a(context);
        }
        return null;
    }

    @Override // tb.e9c
    public String t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("396b2cf6", new Object[]{this});
        }
        if (q() != null) {
            return q().H();
        }
        return null;
    }

    @Override // tb.u9c
    public void t2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e104890e", new Object[]{this, new Boolean(z)});
        } else if (X0() != null) {
            X0().P(z);
        }
    }

    @Override // tb.u9c
    public void u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76382da8", new Object[]{this, str});
        } else if (q() != null) {
            q().z0(str);
        }
    }

    @Override // tb.u9c
    public void u0(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6471299", new Object[]{this, jSONArray});
        } else if (q() != null) {
            q().k0(jSONArray);
        }
    }

    @Override // tb.u9c
    public void u1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fe96f10", new Object[]{this, new Boolean(z)});
        } else if (X0() != null) {
            X0().T(z);
        }
    }

    @Override // tb.u9c
    public void v1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3eba605", new Object[]{this, new Boolean(z)});
        } else if (X0() != null) {
            X0().S(z);
        }
    }

    @Override // tb.e9c
    public long w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2540ac55", new Object[]{this})).longValue();
        }
        if (X0() != null) {
            return X0().g();
        }
        return 0L;
    }

    @Override // tb.u9c
    public void w2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e029c45", new Object[]{this, new Boolean(z)});
        } else if (X0() != null) {
            X0().U(z);
        }
    }

    @Override // tb.u9c
    public void x0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c08c536", new Object[]{this, new Boolean(z)});
        } else if (X0() != null) {
            X0().J(z);
        }
    }

    @Override // tb.u9c
    public void x2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5687173d", new Object[]{this, str});
        } else if (q() != null) {
            q().Z(str);
        }
    }

    @Override // tb.u9c
    public void y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69f0ddef", new Object[]{this, str});
        } else if (q() != null) {
            q().i0(str);
        }
    }

    @Override // tb.u9c
    public void y0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fba2fae2", new Object[]{this, str});
        } else if (q() != null) {
            q().a0(str);
        }
    }

    @Override // tb.e9c
    public String y1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c08308c", new Object[]{this});
        }
        if (X0() != null) {
            return X0().n();
        }
        return null;
    }

    @Override // tb.u9c
    public void z0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1692f6a7", new Object[]{this, str});
        } else if (O1() != null) {
            O1().d(str);
        }
    }

    @Override // tb.u9c
    public void z1(LiveDetailMessinfoResponseData.AlimamaInfo alimamaInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd6572f", new Object[]{this, alimamaInfo});
        } else if (X0() != null) {
            X0().c0(alimamaInfo);
        }
    }

    @Override // tb.u9c
    public void z2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04d9e74", new Object[]{this, str});
        } else if (q() != null) {
            q().g0(str);
        }
    }
}
