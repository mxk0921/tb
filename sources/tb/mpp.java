package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.xpd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class mpp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f24216a;
    public final JSONObject b = new JSONObject();
    public int c = kew.P(270);
    public int d;
    public xpd.c e;
    public boolean f;
    public d1a<? extends JSONObject> g;
    public g1a<? super Integer, xhv> h;
    public g1a<? super Float, xhv> i;
    public g1a<? super Boolean, xhv> j;
    public d1a<xhv> k;

    static {
        t2o.a(766510094);
    }

    public final g1a<Boolean, xhv> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("d12c771c", new Object[]{this});
        }
        return this.j;
    }

    public final g1a<Float, xhv> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("31a7c812", new Object[]{this});
        }
        return this.i;
    }

    public final xpd.c c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpd.c) ipChange.ipc$dispatch("aa8d8de1", new Object[]{this});
        }
        return this.e;
    }

    public final JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d026893e", new Object[]{this});
        }
        return this.f24216a;
    }

    public final int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("98c42052", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public final JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3f6bb844", new Object[]{this});
        }
        return this.b;
    }

    public final d1a<JSONObject> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("d4948aaf", new Object[]{this});
        }
        return this.g;
    }

    public final d1a<xhv> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("cecb429a", new Object[]{this});
        }
        return this.k;
    }

    public final int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("911b1bf", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public final g1a<Integer, xhv> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("20dca0c5", new Object[]{this});
        }
        return this.h;
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d372fa7", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public final void l(g1a<? super Boolean, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d251a612", new Object[]{this, g1aVar});
        } else {
            this.j = g1aVar;
        }
    }

    public final void m(g1a<? super Float, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8aed9dc", new Object[]{this, g1aVar});
        } else {
            this.i = g1aVar;
        }
    }

    public final void n(xpd.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60f24dc7", new Object[]{this, cVar});
        } else {
            this.e = cVar;
        }
    }

    public final void o(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a24e0306", new Object[]{this, jSONObject});
        } else {
            this.f24216a = jSONObject;
        }
    }

    public final void p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b9e4890", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public final void q(d1a<? extends JSONObject> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d13e941", new Object[]{this, d1aVar});
        } else {
            this.g = d1aVar;
        }
    }

    public final void r(d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ac073b6", new Object[]{this, d1aVar});
        } else {
            this.k = d1aVar;
        }
    }

    public final void s(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6a22c2b", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public final void t(g1a<? super Integer, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b3e2df1", new Object[]{this, g1aVar});
        } else {
            this.h = g1aVar;
        }
    }

    public final void u(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("188c8c9", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }
}
