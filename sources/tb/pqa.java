package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.nanocompose.megability.ability.HTTPRequestDataType;
import com.taobao.nanocompose.megability.ability.HTTPRequestMethod;
import com.taobao.nanocompose.megability.ability.b;
import com.taobao.nanocompose.megability.annotation.MegabilityExtParams;
import java.util.Map;

/* compiled from: Taobao */
@MegabilityExtParams
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class pqa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, ? extends Object> f26236a;
    public HTTPRequestMethod b;
    public final int c = 30000;
    public g1a<? super oqa, xhv> d;
    public g1a<? super b, xhv> e;
    public g1a<? super bi8, xhv> f;

    static {
        t2o.a(1022361725);
    }

    public final Map<String, Object> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("516a2e9c", new Object[]{this});
        }
        return null;
    }

    public final HTTPRequestDataType b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HTTPRequestDataType) ipChange.ipc$dispatch("74e5e55c", new Object[]{this});
        }
        return null;
    }

    public final Map<String, Object> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cf4415cc", new Object[]{this});
        }
        return this.f26236a;
    }

    public final HTTPRequestMethod d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HTTPRequestMethod) ipChange.ipc$dispatch("c4d023bc", new Object[]{this});
        }
        return this.b;
    }

    public final d1a<xhv> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("8990aed3", new Object[]{this});
        }
        return null;
    }

    public final g1a<bi8, xhv> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("aa60c0e2", new Object[]{this});
        }
        return this.f;
    }

    public final g1a<b, xhv> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("56abb382", new Object[]{this});
        }
        return this.e;
    }

    public final g1a<oqa, xhv> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("b178fc7", new Object[]{this});
        }
        return this.d;
    }

    public final int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e838025", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public final void j(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf00da", new Object[]{this, map});
        } else {
            this.f26236a = map;
        }
    }

    public final void k(HTTPRequestMethod hTTPRequestMethod) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b24cb04", new Object[]{this, hTTPRequestMethod});
        } else {
            this.b = hTTPRequestMethod;
        }
    }

    public final void l(g1a<? super bi8, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb9f74", new Object[]{this, g1aVar});
        } else {
            this.f = g1aVar;
        }
    }

    public final void m(g1a<? super b, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73bd7b6c", new Object[]{this, g1aVar});
        } else {
            this.e = g1aVar;
        }
    }

    public final void n(g1a<? super oqa, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2c3a02f", new Object[]{this, g1aVar});
        } else {
            this.d = g1aVar;
        }
    }
}
