package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.nexus.arch.openArch.service.message.model.PMSubscribeStatus;
import com.taobao.kmp.nexus.arch.openArch.service.message.model.PMSubscribeType;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class tsy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean b;
    public boolean c;
    public Map<String, ? extends Object> d;
    public String h;
    public u1a<? super tsy, ? super epy, xhv> j;
    public g1a<? super List<String>, xhv> k;
    public nky m;
    public g1a<? super Boolean, xhv> n;

    /* renamed from: a  reason: collision with root package name */
    public String f28943a = "0";
    public String e = jvs.Companion.a();
    public final int f = 1;
    public PMSubscribeType g = PMSubscribeType.PMSubscribeTypeBind;
    public boolean i = true;
    public PMSubscribeStatus l = PMSubscribeStatus.PMSubscribeStateWaitBind;

    static {
        t2o.a(1004536592);
    }

    public final void A(g1a<? super Boolean, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10496fcc", new Object[]{this, g1aVar});
        } else {
            this.n = g1aVar;
        }
    }

    public final void B(PMSubscribeStatus pMSubscribeStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b69f0d25", new Object[]{this, pMSubscribeStatus});
            return;
        }
        ckf.g(pMSubscribeStatus, "<set-?>");
        this.l = pMSubscribeStatus;
    }

    public final void C(PMSubscribeType pMSubscribeType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fc7d3b3", new Object[]{this, pMSubscribeType});
            return;
        }
        ckf.g(pMSubscribeType, "<set-?>");
        this.g = pMSubscribeType;
    }

    public final void D(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70e8be", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.f28943a = str;
    }

    public final void E(g1a<? super List<String>, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b1d91f2", new Object[]{this, g1aVar});
        } else {
            this.k = g1aVar;
        }
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("842ad8e4", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public final u1a<tsy, epy, xhv> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u1a) ipChange.ipc$dispatch("90756750", new Object[]{this});
        }
        return this.j;
    }

    public final g1a<Boolean, xhv> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("28865dd", new Object[]{this});
        }
        return null;
    }

    public final g1a<Boolean, xhv> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("f8c5bd16", new Object[]{this});
        }
        return null;
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b658bd7", new Object[]{this});
        }
        return this.h;
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a296f54", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d3b56d1", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c21cdfb", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public final Map<String, Object> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b794d995", new Object[]{this});
        }
        return this.d;
    }

    public final nky j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nky) ipChange.ipc$dispatch("ab65d87f", new Object[]{this});
        }
        return this.m;
    }

    public final String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ed78a5e", new Object[]{this});
        }
        return this.e;
    }

    public final g1a<Boolean, xhv> l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("cbe1e98a", new Object[]{this});
        }
        return this.n;
    }

    public final PMSubscribeStatus m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PMSubscribeStatus) ipChange.ipc$dispatch("e9c0a0c1", new Object[]{this});
        }
        return this.l;
    }

    public final PMSubscribeType n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PMSubscribeType) ipChange.ipc$dispatch("b7da50b", new Object[]{this});
        }
        return this.g;
    }

    public final String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2a1d120", new Object[]{this});
        }
        return this.f28943a;
    }

    public final g1a<List<String>, xhv> p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("39d4763c", new Object[]{this});
        }
        return this.k;
    }

    public final void q(u1a<? super tsy, ? super epy, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("268ecf64", new Object[]{this, u1aVar});
        } else {
            this.j = u1aVar;
        }
    }

    public final void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d8e7d7f", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public final void s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("111acbfa", new Object[]{this, str});
        }
    }

    public final void t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b45767c", new Object[]{this, str});
        }
    }

    public final void u(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db17dff8", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public final void v(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe2ccab3", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public final void w(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f4425c9", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public final void x(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ae00b99", new Object[]{this, map});
        } else {
            this.d = map;
        }
    }

    public final void y(nky nkyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f55175", new Object[]{this, nkyVar});
        } else {
            this.m = nkyVar;
        }
    }

    public final void z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e577d40", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.e = str;
    }
}
