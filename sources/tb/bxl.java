package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class bxl implements h8d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DETAIL_AFTER_PLAYING_URL = "detailAfterPlayingUrl";
    public static final String DETAIL_AFTER_STREAM_MISTAKE = "detailAfterStreamMistake";
    public static final String DETAIL_BEFORE_PLAYING_URL = "detailBeforePlayingUrl";
    public static final String DETAIL_BEFORE_STREAM_MISTAKE = "detailBeforeStreamMistake";
    public static final String DETAIL_END_TS = "detailEndTS";
    public static final String DETAIL_MODEL_TS = "detailModelTS";
    public static final String DETAIL_MTOP_END_TS = "detailMtopEndTS";
    public static final String DETAIL_RECEIVE_TS = "detailReceiveTS";
    public static final String DETAIL_START_TS = "detailStartTS";
    public static final String DETAIL_SUCCESS = "detailSuccess";
    public static final String IS_OFFICIAL_LIVE = "isOfficialLive";
    public static final String h = bxl.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public final byl f16705a;
    public String b;
    public final boolean c = qvs.R();
    public String d;
    public String e;
    public String f;
    public air g;

    static {
        t2o.a(779093069);
        t2o.a(806356451);
    }

    public bxl(boolean z) {
        byl bylVar = new byl();
        this.f16705a = bylVar;
        bylVar.J("liveRoom");
    }

    public void A(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91572e64", new Object[]{this, str});
        } else {
            this.f16705a.I(str);
        }
    }

    public void B(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71c0654e", new Object[]{this, str});
        } else if (this.c && str != null && str.equals(this.b)) {
            this.f16705a.M();
        }
    }

    public void C(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("164b5626", new Object[]{this, str});
        } else if (this.c && str != null && str.equals(this.b)) {
            this.f16705a.N();
        }
    }

    public void D(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bece4f3", new Object[]{this, str, str2, str3, str4});
        } else if (this.c) {
            this.b = str;
            this.e = str2;
            this.f16705a.w(str);
            this.f16705a.z(str2);
            this.f16705a.v(String.valueOf(xj7.a()));
        }
    }

    @Override // tb.h8d
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b12ba90", new Object[]{this, str, str2});
            return;
        }
        byl bylVar = this.f16705a;
        if (bylVar != null) {
            bylVar.p(str, str2);
        }
    }

    @Override // tb.h8d
    public void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a303bb", new Object[]{this, map});
        } else {
            this.f16705a.q(map);
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("570dc107", new Object[]{this});
        }
        return this.d;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("83057969", new Object[]{this});
        }
        return this.b;
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5e10f49", new Object[]{this, str});
        } else if (this.c && str != null && str.equals(this.b)) {
            this.f16705a.g();
        }
    }

    public void f(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("973f724b", new Object[]{this, str, str2, new Long(j)});
        } else if (this.c && str != null && str.equals(this.b)) {
            this.f16705a.h(str2, j);
        }
    }

    public void g(String str, String str2, int i, boolean z, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e46e3782", new Object[]{this, str, str2, new Integer(i), new Boolean(z), str3});
        } else if (this.c && str != null && str.equals(this.b)) {
            this.f16705a.i(str2, i, z, str3);
        }
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40541b92", new Object[]{this, str});
        } else if (this.c) {
            if (str != null && str.equals(this.b)) {
                this.f16705a.k();
            }
            k6m b = l6m.c().b(this.d);
            if (b != null) {
                b.i = str;
                b.h = this.e;
                b.e = this.f;
                b.f22433a = System.currentTimeMillis();
            }
            l6m.c().g(this.d);
        }
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("474c684c", new Object[]{this, str});
        } else if (this.c && str != null && str.equals(this.b)) {
            this.f16705a.l();
        }
    }

    public void j(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffc141b3", new Object[]{this, new Long(j)});
        } else if (this.c) {
            this.f16705a.m(j);
            igq.n().r(h, "pageInitBegin");
        }
    }

    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70ca72c3", new Object[]{this, str});
        } else if (this.c && str != null && str.equals(this.b)) {
            this.f16705a.n();
        }
    }

    public void l(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb6c9aa2", new Object[]{this, str, new Long(j)});
        } else if (this.c && str != null && str.equals(this.b)) {
            if (qvs.h0()) {
                this.f16705a.x();
            }
            this.f16705a.o(j);
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else if (this.c) {
            this.f16705a.r();
            this.d = null;
        }
    }

    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16953419", new Object[]{this, str});
        } else if (this.c && str != null && str.equals(this.b)) {
            if (qvs.h0()) {
                this.f16705a.b();
            }
            if (qvs.S()) {
                this.f16705a.a();
            }
            this.f16705a.s();
        }
    }

    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("757aec24", new Object[]{this, str});
        } else {
            this.f16705a.y(str);
        }
    }

    public void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b76814f", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f254cf", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22f4074a", new Object[]{this, str});
        } else if (this.c) {
            this.f16705a.A(str);
        }
    }

    public void s(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d953ce0", new Object[]{this, str, new Integer(i)});
        } else if (qvs.S() && str != null && str.equals(this.b)) {
            this.f16705a.B(i);
        }
    }

    public void t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4d23e7", new Object[]{this, str});
        } else {
            this.f16705a.C(str);
        }
    }

    public void u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd2df61d", new Object[]{this, str});
        } else if (this.c && str != null && str.equals(this.b)) {
            this.f16705a.D();
        }
    }

    public void v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7092889c", new Object[]{this, str});
        } else if (qvs.h0() && str != null && str.equals(this.b)) {
            this.f16705a.E();
        }
    }

    public void w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b08c74a3", new Object[]{this, str});
        } else if (qvs.h0() && str != null && str.equals(this.b)) {
            this.f16705a.F();
        }
    }

    public void x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4b8ce43", new Object[]{this, str});
        } else if (qvs.h0() && str != null && str.equals(this.b)) {
            this.f16705a.G();
        }
    }

    public void y(air airVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("897bd0d1", new Object[]{this, airVar});
        } else {
            this.g = airVar;
        }
    }

    public void z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2527d355", new Object[]{this, str});
        } else if (this.c) {
            this.f16705a.H(str);
            k6m b = l6m.c().b(this.d);
            if (b != null) {
                b.f = str;
            }
            air airVar = this.g;
            if (airVar != null && airVar.I0() != null) {
                this.g.I0().F(str);
            }
        }
    }
}
