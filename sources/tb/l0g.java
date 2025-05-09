package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class l0g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<String> f23037a;
    public Map<String, ? extends Object> b;
    public Map<String, ? extends Object> c;
    public m0g d;
    public j0g e;
    public k0g f;

    static {
        t2o.a(1002438885);
    }

    public final Map<String, Object> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("516a2e9c", new Object[]{this});
        }
        return this.b;
    }

    public final j0g b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j0g) ipChange.ipc$dispatch("a74dc8c5", new Object[]{this});
        }
        return this.e;
    }

    public final k0g c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k0g) ipChange.ipc$dispatch("407030bd", new Object[]{this});
        }
        return this.f;
    }

    public final List<String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("dd2d5f95", new Object[]{this});
        }
        return this.f23037a;
    }

    public final m0g e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m0g) ipChange.ipc$dispatch("917e1b31", new Object[]{this});
        }
        return this.d;
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b780bae9", new Object[]{this, str});
        }
    }

    public final void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38ac2743", new Object[]{this, str});
        }
    }

    public final void h(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9cd3172", new Object[]{this, map});
        } else {
            this.b = map;
        }
    }

    public final void i(j0g j0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("217a17d1", new Object[]{this, j0gVar});
        } else {
            this.e = j0gVar;
        }
    }

    public final void j(k0g k0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("749d2ac9", new Object[]{this, k0gVar});
        } else {
            this.f = k0gVar;
        }
    }

    public final void k(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc206ee", new Object[]{this, map});
        } else {
            this.c = map;
        }
    }

    public final void l(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9688ed7", new Object[]{this, list});
        } else {
            this.f23037a = list;
        }
    }

    public final void m(m0g m0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("278559d7", new Object[]{this, m0gVar});
        } else {
            this.d = m0gVar;
        }
    }

    public final void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe82bc5", new Object[]{this, str});
        }
    }
}
