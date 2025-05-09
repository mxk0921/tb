package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.nanocompose.megability.ability.MTOPRequestMethod;
import com.taobao.nanocompose.megability.ability.MTOPResponseType;
import com.taobao.nanocompose.megability.ability.MTOPUnit;
import com.taobao.nanocompose.megability.annotation.MegabilityExtParams;
import java.util.Map;

/* compiled from: Taobao */
@MegabilityExtParams
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class fth {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, ? extends Object> f19519a;
    public boolean c;
    public Map<String, ? extends Object> f;
    public String g;
    public Map<String, ? extends Object> j;
    public g1a<? super eth, xhv> k;
    public g1a<? super eth, xhv> l;
    public g1a<? super bi8, xhv> m;
    public MTOPRequestMethod b = MTOPRequestMethod.GET;
    public String d = "AUTO_LOGIN_ONLY";
    public final int e = 30000;
    public final double h = 5000.0d;
    public MTOPResponseType i = MTOPResponseType.ORIGINAL_JSON;

    static {
        t2o.a(1022361751);
    }

    public final void A(MTOPRequestMethod mTOPRequestMethod) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea749044", new Object[]{this, mTOPRequestMethod});
            return;
        }
        ckf.g(mTOPRequestMethod, "<set-?>");
        this.b = mTOPRequestMethod;
    }

    public final void B(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bca5f9c", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public final void C(g1a<? super bi8, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb9f74", new Object[]{this, g1aVar});
        } else {
            this.m = g1aVar;
        }
    }

    public final void D(g1a<? super eth, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e69a36", new Object[]{this, g1aVar});
        } else {
            this.l = g1aVar;
        }
    }

    public final void E(g1a<? super eth, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a878d9", new Object[]{this, g1aVar});
        } else {
            this.k = g1aVar;
        }
    }

    public final void F(MTOPResponseType mTOPResponseType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46e19d3b", new Object[]{this, mTOPResponseType});
            return;
        }
        ckf.g(mTOPResponseType, "<set-?>");
        this.i = mTOPResponseType;
    }

    public final void G(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f23a73a", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.d = str;
    }

    public final void H(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70e8be", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("82d9dfdb", new Object[]{this});
        }
        return null;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ffe2fe41", new Object[]{this});
        }
        return null;
    }

    public final Map<String, Object> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("516a2e9c", new Object[]{this});
        }
        return this.f19519a;
    }

    public final Boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("622cfa3a", new Object[]{this});
        }
        return null;
    }

    public final bth e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bth) ipChange.ipc$dispatch("93c1249f", new Object[]{this});
        }
        return null;
    }

    public final Map<String, Object> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7a812bd7", new Object[]{this});
        }
        return this.f;
    }

    public final Map<String, Object> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2812908d", new Object[]{this});
        }
        return this.j;
    }

    public final Map<String, Object> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cce7f872", new Object[]{this});
        }
        return null;
    }

    public final MTOPRequestMethod i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MTOPRequestMethod) ipChange.ipc$dispatch("33d038fc", new Object[]{this});
        }
        return this.b;
    }

    public final String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2f9a24b8", new Object[]{this});
        }
        return null;
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e9333c8", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public final g1a<bi8, xhv> l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("aa60c0e2", new Object[]{this});
        }
        return this.m;
    }

    public final g1a<eth, xhv> m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("7039b8e0", new Object[]{this});
        }
        return this.l;
    }

    public final g1a<eth, xhv> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("a6745fdd", new Object[]{this});
        }
        return this.k;
    }

    public final double o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9fd22ba9", new Object[]{this})).doubleValue();
        }
        return this.h;
    }

    public final MTOPResponseType p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MTOPResponseType) ipChange.ipc$dispatch("ce133a55", new Object[]{this});
        }
        return this.i;
    }

    public final boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b3c7c32", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("85801f24", new Object[]{this});
        }
        return this.d;
    }

    public final int s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e838025", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public final String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2a1d120", new Object[]{this});
        }
        return this.g;
    }

    public final String u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99fd2f88", new Object[]{this});
        }
        return null;
    }

    public final MTOPUnit v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MTOPUnit) ipChange.ipc$dispatch("2f21bf83", new Object[]{this});
        }
        return null;
    }

    public final boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1b78cbd", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final void x(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9cd3172", new Object[]{this, map});
        } else {
            this.f19519a = map;
        }
    }

    public final void y(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fa8f497", new Object[]{this, map});
        } else {
            this.f = map;
        }
    }

    public final void z(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccea8b39", new Object[]{this, map});
        } else {
            this.j = map;
        }
    }
}
