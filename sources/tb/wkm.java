package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.nanocompose.megability.annotation.MegabilityExtParams;
import java.util.Map;

/* compiled from: Taobao */
@MegabilityExtParams
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class wkm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Integer f30747a;
    public Boolean b;
    public String c;
    public Map<String, ? extends Object> d;
    public g1a<? super jlm, xhv> e;
    public g1a<? super bi8, xhv> f;

    static {
        t2o.a(1022361864);
    }

    public final Integer a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("828c7dd8", new Object[]{this});
        }
        return this.f30747a;
    }

    public final Boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("c8110e61", new Object[]{this});
        }
        return this.b;
    }

    public final g1a<jlm, xhv> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("8468fe3e", new Object[]{this});
        }
        return this.e;
    }

    public final g1a<bi8, xhv> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("aa60c0e2", new Object[]{this});
        }
        return this.f;
    }

    public final Map<String, Object> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f10013f8", new Object[]{this});
        }
        return this.d;
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2a1d120", new Object[]{this});
        }
        return this.c;
    }

    public final void g(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b8961f2", new Object[]{this, num});
        } else {
            this.f30747a = num;
        }
    }

    public final void h(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6c43ef5", new Object[]{this, bool});
        } else {
            this.b = bool;
        }
    }

    public final void i(g1a<? super jlm, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8a5cf30", new Object[]{this, g1aVar});
        } else {
            this.e = g1aVar;
        }
    }

    public final void j(g1a<? super bi8, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb9f74", new Object[]{this, g1aVar});
        } else {
            this.f = g1aVar;
        }
    }

    public final void k(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70906a96", new Object[]{this, map});
        } else {
            this.d = map;
        }
    }

    public final void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70e8be", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }
}
