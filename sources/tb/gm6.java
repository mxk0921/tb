package tb;

import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.videoc.DXVideoControlConfig;
import java.util.Comparator;
import java.util.Map;
import java.util.WeakHashMap;
import tb.xsn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class gm6 implements bxb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final DXVideoControlConfig<iew> f20086a;
    public final Map<RecyclerView, Pair<j4c<Integer, ?>, cxb<?, ?>>> b = new WeakHashMap();
    public final String c;

    static {
        t2o.a(444597077);
        t2o.a(444597081);
    }

    public gm6(DXVideoControlConfig<iew> dXVideoControlConfig, String str) {
        this.f20086a = dXVideoControlConfig;
        this.c = str;
    }

    public void a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4639c7ad", new Object[]{this, recyclerView});
        } else {
            b(recyclerView, null);
        }
    }

    public void b(RecyclerView recyclerView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7adf4037", new Object[]{this, recyclerView, str});
            return;
        }
        cxb<?, ?> h = h(recyclerView);
        if (h != null) {
            if (str == null) {
                h.e();
            } else {
                h.c(str);
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        for (Pair pair : ((WeakHashMap) this.b).values()) {
            ((j4c) pair.first).stop();
        }
        ((WeakHashMap) this.b).clear();
    }

    public void d(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f95e656", new Object[]{this, recyclerView});
            return;
        }
        j4c<Integer, ?> g = g(recyclerView);
        if (g != null) {
            g.stop();
        }
        ((WeakHashMap) this.b).remove(recyclerView);
    }

    public void e(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4e9e914", new Object[]{this, recyclerView});
        } else {
            f(recyclerView, null);
        }
    }

    public void f(RecyclerView recyclerView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b675de", new Object[]{this, recyclerView, str});
            return;
        }
        j4c<Integer, ?> g = g(recyclerView);
        if (g != null) {
            if (str == null) {
                g.b();
            } else {
                g.k(str);
            }
        }
    }

    public final j4c<Integer, ?> g(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j4c) ipChange.ipc$dispatch("b83f8f5b", new Object[]{this, recyclerView});
        }
        Pair pair = (Pair) ((WeakHashMap) this.b).get(recyclerView);
        if (pair == null) {
            return null;
        }
        return (j4c) pair.first;
    }

    public final cxb<?, ?> h(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxb) ipChange.ipc$dispatch("ce8cef60", new Object[]{this, recyclerView});
        }
        Pair pair = (Pair) ((WeakHashMap) this.b).get(recyclerView);
        if (pair == null) {
            return null;
        }
        return (cxb) pair.second;
    }

    public void j(RecyclerView recyclerView, DXVideoControlConfig<iew> dXVideoControlConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd995eff", new Object[]{this, recyclerView, dXVideoControlConfig, str});
        } else if (!((WeakHashMap) this.b).containsKey(recyclerView)) {
            if (str != null) {
                if (dXVideoControlConfig == this.f20086a) {
                    dXVideoControlConfig = DXVideoControlConfig.n();
                }
                dXVideoControlConfig.F(str);
            }
            i(recyclerView, dXVideoControlConfig);
        }
    }

    public void k(RecyclerView recyclerView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9c70f38", new Object[]{this, recyclerView, str});
            return;
        }
        j4c<Integer, ?> g = g(recyclerView);
        if (g != null) {
            g.a(str);
        }
    }

    public void l(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad94867a", new Object[]{this, recyclerView});
        } else {
            m(recyclerView, null);
        }
    }

    public void m(RecyclerView recyclerView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5b6c5c4", new Object[]{this, recyclerView, str});
            return;
        }
        j4c<Integer, ?> g = g(recyclerView);
        if (g != null) {
            if (str == null) {
                g.j();
            } else {
                g.e(str);
            }
        }
    }

    public void n(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7873ebf", new Object[]{this, recyclerView});
        } else {
            o(recyclerView, null);
        }
    }

    public void o(RecyclerView recyclerView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac57d6c9", new Object[]{this, recyclerView, str});
            return;
        }
        j4c<Integer, ?> g = g(recyclerView);
        if (g != null) {
            if (str == null) {
                g.g();
            } else {
                g.c(str);
            }
        }
    }

    public final void i(RecyclerView recyclerView, DXVideoControlConfig<iew> dXVideoControlConfig) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70e3077", new Object[]{this, recyclerView, dXVideoControlConfig});
            return;
        }
        km6 km6Var = new km6(dXVideoControlConfig.u());
        Comparator<iew> v = dXVideoControlConfig.v();
        if (v == null) {
            boolean z2 = dXVideoControlConfig.D() && dXVideoControlConfig.r() == 2;
            if (dXVideoControlConfig.r() == 1 || z2) {
                v = new mm6();
            } else {
                v = new lm6();
            }
        }
        if (dXVideoControlConfig.t() == 1) {
            z = true;
        }
        om6 om6Var = new om6(km6Var, v, z, dXVideoControlConfig.C());
        if (dXVideoControlConfig.r() != 3 || dXVideoControlConfig.q() == 1) {
            im6 im6Var = new im6(recyclerView, om6Var, new nm6(dXVideoControlConfig.q()), dXVideoControlConfig, zg5.a4() ? new qm6(dXVideoControlConfig.w()) : null);
            xsn.b bVar = new xsn.b(recyclerView, new aa6(im6Var, dXVideoControlConfig.z(), dXVideoControlConfig.y(), dXVideoControlConfig.E(), dXVideoControlConfig.D(), this.c));
            for (String str : im6Var.A()) {
                bVar.c(new jm6(im6Var, dXVideoControlConfig.w(), dXVideoControlConfig.E()), dXVideoControlConfig.s(), str);
            }
            ((WeakHashMap) this.b).put(recyclerView, new Pair(bVar.a(), im6Var));
            return;
        }
        throw new RuntimeException("使用了 DXPlayControlOrder.LOOP_* 策略，maxPlayingVideo 必须设置为 1; 当前 maxPlayingVideo: " + dXVideoControlConfig.q());
    }
}
