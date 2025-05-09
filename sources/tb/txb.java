package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.business.mess.LiveDetailMessinfoResponseData;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.FandomPreLiveInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.VideoStatus;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class txb implements sxb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final iwg f29018a = new iwg(this);
    public final jwg b = new jwg(this);
    public final l2h c = new l2h(this);
    public final utt d = new utt(this);
    public ux9 e;

    static {
        t2o.a(806356070);
        t2o.a(806356069);
    }

    public txb() {
        o3s.b("IDataCenterImpl", "init new data");
    }

    @Override // tb.sxb
    public void A0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91b75a74", new Object[]{this, new Boolean(z)});
            return;
        }
        iwg iwgVar = this.f29018a;
        if (iwgVar != null) {
            iwgVar.h(z);
        }
    }

    @Override // tb.sxb
    public Map<String, String> A1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a3dbecd9", new Object[]{this});
        }
        iwg iwgVar = this.f29018a;
        if (iwgVar != null) {
            return iwgVar.a();
        }
        return null;
    }

    @Override // tb.e9c
    public boolean B0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f04fa69", new Object[]{this})).booleanValue();
        }
        if (W2() != null) {
            return W2().Q();
        }
        return false;
    }

    @Override // tb.e9c
    public String B1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc8d202", new Object[]{this});
        }
        if (W2() != null) {
            return W2().I();
        }
        return null;
    }

    @Override // tb.sxb
    public boolean B2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82c90a1f", new Object[]{this})).booleanValue();
        }
        utt uttVar = this.d;
        if (uttVar != null) {
            return uttVar.j();
        }
        return false;
    }

    @Override // tb.sxb
    public void C(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2494ab85", new Object[]{this, str});
            return;
        }
        utt uttVar = this.d;
        if (uttVar != null) {
            uttVar.o(str);
        }
    }

    @Override // tb.e9c
    public String C1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea350117", new Object[]{this});
        }
        if (Y2() != null) {
            return Y2().b();
        }
        return null;
    }

    @Override // tb.e9c
    public String D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbe8d995", new Object[]{this});
        }
        if (W2() != null) {
            return W2().L();
        }
        return null;
    }

    @Override // tb.sxb
    public void D0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12b18302", new Object[]{this, str});
            return;
        }
        iwg iwgVar = this.f29018a;
        if (iwgVar != null) {
            iwgVar.e(str);
        }
    }

    @Override // tb.e9c
    public int D1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4de96b0a", new Object[]{this})).intValue();
        }
        if (X2() != null) {
            return X2().o();
        }
        return 0;
    }

    @Override // tb.e9c
    public boolean D2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b7b37d4", new Object[]{this})).booleanValue();
        }
        if (W2() != null) {
            return W2().R();
        }
        return false;
    }

    @Override // tb.e9c
    public String E1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48e5b1d6", new Object[]{this});
        }
        if (W2() != null) {
            return W2().e();
        }
        return null;
    }

    @Override // tb.sxb
    public void E2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("731bccd2", new Object[]{this, new Boolean(z)});
            return;
        }
        utt uttVar = this.d;
        if (uttVar != null) {
            uttVar.p(z);
        }
    }

    @Override // tb.sxb
    public boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21a12679", new Object[]{this})).booleanValue();
        }
        jwg jwgVar = this.b;
        if (jwgVar != null) {
            return jwgVar.f();
        }
        return false;
    }

    @Override // tb.e9c
    public String F0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3bbd726", new Object[]{this});
        }
        if (W2() != null) {
            return W2().z();
        }
        return null;
    }

    @Override // tb.sxb
    public FandomInfo F1(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FandomInfo) ipChange.ipc$dispatch("6d047dc0", new Object[]{this, tBLiveDataModel});
        }
        utt uttVar = this.d;
        if (uttVar != null) {
            return uttVar.b(tBLiveDataModel);
        }
        return null;
    }

    @Override // tb.e9c
    public String F2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c9feeb7", new Object[]{this});
        }
        if (W2() != null) {
            return W2().J();
        }
        return null;
    }

    @Override // tb.e9c
    public String G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f717f3a", new Object[]{this});
        }
        if (W2() != null) {
            return W2().O();
        }
        return null;
    }

    @Override // tb.sxb
    public boolean G2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f43477f", new Object[]{this})).booleanValue();
        }
        jwg jwgVar = this.b;
        if (jwgVar != null) {
            return jwgVar.h();
        }
        return false;
    }

    @Override // tb.e9c
    public long I2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9cd0943", new Object[]{this})).longValue();
        }
        if (X2() != null) {
            return X2().h();
        }
        return 0L;
    }

    @Override // tb.e9c
    public boolean J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a148e1e2", new Object[]{this})).booleanValue();
        }
        if (X2() != null) {
            return X2().z();
        }
        return false;
    }

    @Override // tb.e9c
    public int J2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("24308341", new Object[]{this})).intValue();
        }
        if (X2() != null) {
            return X2().p();
        }
        return 0;
    }

    @Override // tb.e9c
    public boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c33e7ccc", new Object[]{this})).booleanValue();
        }
        if (X2() != null) {
            return X2().A();
        }
        return false;
    }

    @Override // tb.e9c
    public String L0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87aa0aef", new Object[]{this});
        }
        if (X2() != null) {
            return X2().c();
        }
        return null;
    }

    @Override // tb.e9c
    public LiveDetailMessinfoResponseData.AlimamaInfo L1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveDetailMessinfoResponseData.AlimamaInfo) ipChange.ipc$dispatch("3fd07085", new Object[]{this});
        }
        if (X2() != null) {
            return X2().j();
        }
        return null;
    }

    @Override // tb.e9c
    public int M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("71edfcd5", new Object[]{this})).intValue();
        }
        if (W2() != null) {
            return W2().u();
        }
        return 0;
    }

    @Override // tb.e9c
    public String M1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b055fb0d", new Object[]{this});
        }
        if (W2() != null) {
            return W2().j();
        }
        return null;
    }

    @Override // tb.sxb
    public void M2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("172ec419", new Object[]{this, str});
            return;
        }
        l2h l2hVar = this.c;
        if (l2hVar != null) {
            l2hVar.f(str);
        }
    }

    @Override // tb.e9c
    public boolean N0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3be4880", new Object[]{this})).booleanValue();
        }
        if (X2() != null) {
            return X2().y();
        }
        return false;
    }

    @Override // tb.sxb
    public iwg N2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iwg) ipChange.ipc$dispatch("831c073a", new Object[]{this});
        }
        return this.f29018a;
    }

    @Override // tb.sxb
    public String O2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c4275211", new Object[]{this});
        }
        utt uttVar = this.d;
        if (uttVar != null) {
            return uttVar.d();
        }
        return null;
    }

    @Override // tb.sxb
    public String P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("943c5482", new Object[]{this});
        }
        if (X2() != null) {
            return X2().i();
        }
        return null;
    }

    @Override // tb.sxb
    public void Q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c97d507a", new Object[]{this, new Integer(i)});
            return;
        }
        utt uttVar = this.d;
        if (uttVar != null) {
            uttVar.s(i);
        }
    }

    @Override // tb.sxb
    public utt Q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (utt) ipChange.ipc$dispatch("7df13fb0", new Object[]{this});
        }
        return this.d;
    }

    @Override // tb.e9c
    public boolean Q1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6388b9a", new Object[]{this})).booleanValue();
        }
        if (X2() != null) {
            return X2().s();
        }
        return false;
    }

    @Override // tb.sxb
    public void R(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eca772c7", new Object[]{this, new Boolean(z)});
            return;
        }
        jwg jwgVar = this.b;
        if (jwgVar != null) {
            jwgVar.m(z);
        }
    }

    @Override // tb.sxb
    public String R1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8af78969", new Object[]{this});
        }
        iwg iwgVar = this.f29018a;
        if (iwgVar != null) {
            return iwgVar.b();
        }
        return null;
    }

    @Override // tb.e9c
    public String R2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28dc8f59", new Object[]{this});
        }
        if (W2() != null) {
            return W2().h();
        }
        return null;
    }

    @Override // tb.sxb
    public String S2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b140f9ed", new Object[]{this});
        }
        if (X2() != null) {
            return X2().q();
        }
        return null;
    }

    @Override // tb.sxb
    public String T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea0f2062", new Object[]{this});
        }
        jwg jwgVar = this.b;
        if (jwgVar != null) {
            return jwgVar.c();
        }
        return null;
    }

    @Override // tb.e9c
    public String T0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a01a75d8", new Object[]{this});
        }
        if (W2() != null) {
            return W2().k();
        }
        return null;
    }

    @Override // tb.sxb
    public int T1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f336528", new Object[]{this})).intValue();
        }
        utt uttVar = this.d;
        if (uttVar != null) {
            return uttVar.h();
        }
        return 0;
    }

    @Override // tb.e9c
    public String T2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1cfae159", new Object[]{this});
        }
        if (X2() != null) {
            return X2().m();
        }
        return null;
    }

    @Override // tb.e9c
    public String U1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d34d07c", new Object[]{this});
        }
        if (W2() != null) {
            return W2().i();
        }
        return null;
    }

    @Override // tb.e9c
    public int U2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a27dde88", new Object[]{this})).intValue();
        }
        if (X2() != null) {
            return X2().r();
        }
        return 0;
    }

    @Override // tb.sxb
    public void V(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c00d31a7", new Object[]{this, str});
            return;
        }
        utt uttVar = this.d;
        if (uttVar != null) {
            uttVar.r(str);
        }
    }

    @Override // tb.sxb
    public boolean V0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9bf4e7e", new Object[]{this})).booleanValue();
        }
        utt uttVar = this.d;
        if (uttVar != null) {
            return uttVar.l();
        }
        return false;
    }

    @Override // tb.e9c
    public LiveDetailMessinfoResponseData.AlimamaInfo2 V1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveDetailMessinfoResponseData.AlimamaInfo2) ipChange.ipc$dispatch("67916ec1", new Object[]{this});
        }
        if (X2() != null) {
            return X2().a();
        }
        return null;
    }

    @Override // tb.e9c
    public String V2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("924b429e", new Object[]{this});
        }
        if (W2() != null) {
            return W2().B();
        }
        return null;
    }

    @Override // tb.e9c
    public String W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fdb245aa", new Object[]{this});
        }
        if (W2() != null) {
            return W2().o();
        }
        return null;
    }

    @Override // tb.sxb
    public l2h W1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l2h) ipChange.ipc$dispatch("5357cb50", new Object[]{this});
        }
        return this.c;
    }

    public final haa W2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (haa) ipChange.ipc$dispatch("82254968", new Object[]{this});
        }
        ux9 ux9Var = this.e;
        if (ux9Var == null || ux9Var.j() == null || this.e.j().k() == null || this.e.j().k().q() == null) {
            return null;
        }
        return this.e.j().k().q();
    }

    public final jaa X2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jaa) ipChange.ipc$dispatch("e43ae09e", new Object[]{this});
        }
        ux9 ux9Var = this.e;
        if (ux9Var == null || ux9Var.j() == null || this.e.j().k() == null || this.e.j().k().X0() == null) {
            return null;
        }
        return this.e.j().k().X0();
    }

    @Override // tb.e9c
    public String Y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65adfd43", new Object[]{this});
        }
        if (X2() != null) {
            return X2().d();
        }
        return null;
    }

    public final qca Y2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qca) ipChange.ipc$dispatch("98a100d0", new Object[]{this});
        }
        ux9 ux9Var = this.e;
        if (ux9Var == null || ux9Var.j() == null || this.e.j().k() == null || this.e.j().k().O1() == null) {
            return null;
        }
        return this.e.j().k().O1();
    }

    @Override // tb.sxb
    public void Z1(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5baf7bbf", new Object[]{this, ux9Var});
            return;
        }
        this.e = ux9Var;
        this.f29018a.g(ux9Var);
        this.b.l(this.e);
        this.c.c(this.e);
        this.d.m(this.e);
    }

    @Override // tb.sxb
    public VideoInfo a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoInfo) ipChange.ipc$dispatch("5c4fa617", new Object[]{this});
        }
        jwg jwgVar = this.b;
        if (jwgVar != null) {
            return jwgVar.d();
        }
        return null;
    }

    @Override // tb.sxb
    public String a1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38993d6c", new Object[]{this});
        }
        l2h l2hVar = this.c;
        if (l2hVar != null) {
            return l2hVar.b();
        }
        return null;
    }

    @Override // tb.e9c
    public boolean a2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4255237b", new Object[]{this})).booleanValue();
        }
        if (X2() != null) {
            return X2().x();
        }
        return false;
    }

    @Override // tb.e9c
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df3f1dca", new Object[]{this});
        }
        if (W2() != null) {
            return W2().F();
        }
        return null;
    }

    @Override // tb.sxb
    public boolean b1(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47d21958", new Object[]{this, tBLiveDataModel})).booleanValue();
        }
        utt uttVar = this.d;
        if (uttVar != null) {
            return uttVar.k(tBLiveDataModel);
        }
        return false;
    }

    @Override // tb.e9c
    public String b2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3b0bf122", new Object[]{this});
        }
        if (W2() != null) {
            return W2().A();
        }
        return null;
    }

    @Override // tb.e9c
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d835ead6", new Object[]{this});
        }
        if (W2() != null) {
            return W2().g();
        }
        return null;
    }

    @Override // tb.e9c
    public String c1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ca85962", new Object[]{this});
        }
        if (W2() != null) {
            return W2().m();
        }
        return null;
    }

    @Override // tb.e9c
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8ae70bf", new Object[]{this});
        }
        if (W2() != null) {
            return W2().E();
        }
        return null;
    }

    @Override // tb.sxb
    public void d0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("110979b9", new Object[]{this, str});
            return;
        }
        utt uttVar = this.d;
        if (uttVar != null) {
            uttVar.q(str);
        }
    }

    @Override // tb.e9c
    public boolean d1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1dd14e92", new Object[]{this})).booleanValue();
        }
        if (X2() != null) {
            return X2().B();
        }
        return false;
    }

    @Override // tb.sxb
    public String d2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6e547faf", new Object[]{this});
        }
        utt uttVar = this.d;
        if (uttVar != null) {
            return uttVar.g();
        }
        return null;
    }

    @Override // tb.sxb
    public Map<String, String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5c47784e", new Object[]{this});
        }
        iwg iwgVar = this.f29018a;
        if (iwgVar != null) {
            return iwgVar.a();
        }
        return null;
    }

    @Override // tb.e9c
    public String e1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("61256763", new Object[]{this});
        }
        if (X2() != null) {
            return X2().k();
        }
        return null;
    }

    @Override // tb.sxb
    public String e2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66facd8d", new Object[]{this});
        }
        jwg jwgVar = this.b;
        if (jwgVar != null) {
            return jwgVar.b();
        }
        return null;
    }

    @Override // tb.e9c
    public Map<String, String> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("57a00234", new Object[]{this});
        }
        if (W2() != null) {
            return W2().K();
        }
        return null;
    }

    @Override // tb.e9c
    public String f2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("587fe66", new Object[]{this});
        }
        if (W2() != null) {
            return W2().C();
        }
        return null;
    }

    @Override // tb.sxb
    public FandomInfo g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FandomInfo) ipChange.ipc$dispatch("6c3d3d9", new Object[]{this});
        }
        utt uttVar = this.d;
        if (uttVar != null) {
            return uttVar.a();
        }
        return null;
    }

    @Override // tb.e9c
    public String g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a43e01cf", new Object[]{this});
        }
        if (W2() != null) {
            return W2().y();
        }
        return null;
    }

    @Override // tb.sxb
    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("800f189c", new Object[]{this})).booleanValue();
        }
        iwg iwgVar = this.f29018a;
        if (iwgVar != null) {
            return iwgVar.d();
        }
        return false;
    }

    @Override // tb.sxb
    public void h1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3a1ba81", new Object[]{this, new Boolean(z)});
            return;
        }
        jwg jwgVar = this.b;
        if (jwgVar != null) {
            jwgVar.n(z);
        }
    }

    @Override // tb.sxb
    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a23734cf", new Object[]{this, str});
            return;
        }
        iwg iwgVar = this.f29018a;
        if (iwgVar != null) {
            iwgVar.f(str);
        }
    }

    @Override // tb.e9c
    public String i1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc6bdf2c", new Object[]{this});
        }
        if (W2() != null) {
            return W2().M();
        }
        return null;
    }

    @Override // tb.sxb
    public String i2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ec7395d", new Object[]{this});
        }
        utt uttVar = this.d;
        if (uttVar != null) {
            return uttVar.f();
        }
        return null;
    }

    @Override // tb.sxb
    public void j1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ae32b2d", new Object[]{this, str});
            return;
        }
        iwg iwgVar = this.f29018a;
        if (iwgVar != null) {
            iwgVar.i(str);
        }
    }

    @Override // tb.sxb
    public String m1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bce135ac", new Object[]{this});
        }
        utt uttVar = this.d;
        if (uttVar != null) {
            return uttVar.i();
        }
        return null;
    }

    @Override // tb.e9c
    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f337a8ca", new Object[]{this})).booleanValue();
        }
        if (X2() != null) {
            return X2().e();
        }
        return false;
    }

    @Override // tb.e9c
    public String n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("649f3e25", new Object[]{this});
        }
        if (W2() != null) {
            return W2().n();
        }
        return null;
    }

    @Override // tb.sxb
    public void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205b416b", new Object[]{this, str});
            return;
        }
        l2h l2hVar = this.c;
        if (l2hVar != null) {
            l2hVar.e(str);
        }
    }

    @Override // tb.sxb
    public jwg p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jwg) ipChange.ipc$dispatch("59cc6bf0", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.sxb
    public boolean p1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("950655d9", new Object[]{this})).booleanValue();
        }
        jwg jwgVar = this.b;
        if (jwgVar != null) {
            return jwgVar.i();
        }
        return false;
    }

    @Override // tb.sxb
    public void p2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12581dba", new Object[]{this, new Boolean(z)});
            return;
        }
        jwg jwgVar = this.b;
        if (jwgVar != null) {
            jwgVar.k(z);
        }
    }

    @Override // tb.sxb
    public VideoStatus r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoStatus) ipChange.ipc$dispatch("d294741", new Object[]{this});
        }
        l2h l2hVar = this.c;
        if (l2hVar != null) {
            return l2hVar.a();
        }
        return null;
    }

    @Override // tb.sxb
    public boolean r1(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("764b7912", new Object[]{this, videoInfo})).booleanValue();
        }
        jwg jwgVar = this.b;
        if (jwgVar != null) {
            return jwgVar.g(videoInfo);
        }
        return false;
    }

    @Override // tb.sxb
    public String r2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("90694151", new Object[]{this});
        }
        utt uttVar = this.d;
        if (uttVar != null) {
            return uttVar.c();
        }
        return null;
    }

    @Override // tb.sxb
    public void s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("453d7a1d", new Object[]{this, str});
            return;
        }
        jwg jwgVar = this.b;
        if (jwgVar != null) {
            jwgVar.j(str);
        }
    }

    @Override // tb.sxb
    public void s2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("996d54b2", new Object[]{this, str});
            return;
        }
        utt uttVar = this.d;
        if (uttVar != null) {
            uttVar.t(str);
        }
    }

    @Override // tb.e9c
    public String t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("396b2cf6", new Object[]{this});
        }
        if (W2() != null) {
            return W2().H();
        }
        return null;
    }

    @Override // tb.e9c
    public String t1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34343a8c", new Object[]{this});
        }
        if (X2() != null) {
            return X2().l();
        }
        return null;
    }

    @Override // tb.sxb
    public boolean u2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d186c8d8", new Object[]{this})).booleanValue();
        }
        jwg jwgVar = this.b;
        if (jwgVar != null) {
            return jwgVar.e();
        }
        return false;
    }

    @Override // tb.sxb
    public void v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61089145", new Object[]{this, str});
        } else {
            this.d.n(str);
        }
    }

    @Override // tb.sxb
    public FandomPreLiveInfo v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FandomPreLiveInfo) ipChange.ipc$dispatch("8325fd92", new Object[]{this});
        }
        utt uttVar = this.d;
        if (uttVar != null) {
            return uttVar.e();
        }
        return null;
    }

    @Override // tb.sxb
    public void v2(VideoStatus videoStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7035b1b", new Object[]{this, videoStatus});
            return;
        }
        l2h l2hVar = this.c;
        if (l2hVar != null) {
            l2hVar.d(videoStatus);
        }
    }

    @Override // tb.e9c
    public String w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ebc2793e", new Object[]{this});
        }
        if (W2() != null) {
            return W2().P();
        }
        return null;
    }

    @Override // tb.e9c
    public String w1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd5bca95", new Object[]{this});
        }
        if (W2() != null) {
            return W2().p();
        }
        return null;
    }

    @Override // tb.e9c
    public String x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b46e0367", new Object[]{this});
        }
        if (W2() != null) {
            return W2().q();
        }
        return null;
    }

    @Override // tb.sxb
    public void x1(TBLiveDataModel tBLiveDataModel, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4226f66", new Object[]{this, tBLiveDataModel, videoInfo});
            return;
        }
        jwg jwgVar = this.b;
        if (jwgVar != null) {
            jwgVar.o(tBLiveDataModel, videoInfo);
        }
    }

    @Override // tb.e9c
    public String y1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c08308c", new Object[]{this});
        }
        if (X2() != null) {
            return X2().n();
        }
        return null;
    }

    @Override // tb.e9c
    public String y2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38bb6da1", new Object[]{this});
        }
        if (X2() != null) {
            return X2().b();
        }
        return null;
    }

    @Override // tb.e9c
    public String z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ccd8cce", new Object[]{this});
        }
        if (W2() != null) {
            return W2().w();
        }
        return null;
    }
}
