package tb;

import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import mtopsdk.mtop.intf.MtopPrefetch;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class un0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String l;
    public int m;
    public MtopPrefetch.IPrefetchComparator n;
    public int o;

    /* renamed from: a  reason: collision with root package name */
    public String f29507a = "";
    public String b = "1.0";
    public final boolean c = true;
    public final boolean d = true;
    public Map<String, String> e = null;
    public boolean f = true;
    public String g = "";
    public String h = "";
    public int i = -1;
    public boolean j = false;
    public Map<String, String> k = null;
    public int p = 1;

    static {
        t2o.a(301990034);
    }

    public AURANextRPCEndpoint a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURANextRPCEndpoint) ipChange.ipc$dispatch("9b626ba1", new Object[]{this});
        }
        return b(null, false);
    }

    public AURANextRPCEndpoint b(rk rkVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURANextRPCEndpoint) ipChange.ipc$dispatch("a6f04347", new Object[]{this, rkVar, new Boolean(z)});
        }
        return c(rkVar, z, false);
    }

    public AURANextRPCEndpoint c(rk rkVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURANextRPCEndpoint) ipChange.ipc$dispatch("9d79d597", new Object[]{this, rkVar, new Boolean(z), new Boolean(z2)});
        }
        return new AURANextRPCEndpoint.a().D(this.g).z(this.f29507a).U(this.j).S(null).H(null).F(this.d).G(this.c).V(this.b).I(this.e).A(this.i).R(this.l).P(this.o).y(i0r.f()).J(this.f).N(this.k).T(this.h).O(this.p).E(!z).K(rkVar).Q(z2).M(this.m).L(this.n).B();
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b780bae9", new Object[]{this, str});
        } else {
            this.f29507a = str;
        }
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4ca4090", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public void f(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f76df0c", new Object[]{this, map});
        } else {
            this.e = map;
        }
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2735add7", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2510296a", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public void i(MtopPrefetch.IPrefetchComparator iPrefetchComparator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db699066", new Object[]{this, iPrefetchComparator});
        } else {
            this.n = iPrefetchComparator;
        }
    }

    public void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2934b20", new Object[]{this, new Integer(i)});
        } else {
            this.m = i;
        }
    }

    public void k(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbec0085", new Object[]{this, map});
        } else {
            this.k = map;
        }
    }

    public void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cdc93e9", new Object[]{this, new Integer(i)});
        } else {
            this.p = i;
        }
    }

    public void m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a6c2ec7", new Object[]{this, new Integer(i)});
        } else {
            this.o = i;
        }
    }

    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70e8be", new Object[]{this, str});
        } else {
            this.l = str;
        }
    }

    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e80fc6a", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dba030af", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public void q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e718c27", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }
}
