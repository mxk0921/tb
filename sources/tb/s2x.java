package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.nanocompose.megability.annotation.MegabilityExtParams;
import java.util.Map;

/* compiled from: Taobao */
@MegabilityExtParams
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class s2x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public g1a<? super t2x, xhv> f27770a;
    public d1a<xhv> b;
    public g1a<? super r2x, xhv> c;
    public g1a<? super bi8, xhv> d;

    static {
        t2o.a(1022361987);
    }

    public final Map<String, Object> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("516a2e9c", new Object[]{this});
        }
        return null;
    }

    public final Map<String, Object> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cf4415cc", new Object[]{this});
        }
        return null;
    }

    public final g1a<r2x, xhv> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("8990aef2", new Object[]{this});
        }
        return this.c;
    }

    public final g1a<bi8, xhv> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("aa60c0e2", new Object[]{this});
        }
        return this.d;
    }

    public final g1a<t2x, xhv> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("4a06b143", new Object[]{this});
        }
        return this.f27770a;
    }

    public final d1a<xhv> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("b56ab4b7", new Object[]{this});
        }
        return this.b;
    }

    public final void g(g1a<? super r2x, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f897364", new Object[]{this, g1aVar});
        } else {
            this.c = g1aVar;
        }
    }

    public final void h(g1a<? super bi8, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb9f74", new Object[]{this, g1aVar});
        } else {
            this.d = g1aVar;
        }
    }

    public final void i(g1a<? super t2x, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b8ae33", new Object[]{this, g1aVar});
        } else {
            this.f27770a = g1aVar;
        }
    }

    public final void j(d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecde3039", new Object[]{this, d1aVar});
        } else {
            this.b = d1aVar;
        }
    }
}
