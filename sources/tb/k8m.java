package tb;

import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.framework.container.PluginInfo;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class k8m extends e8g implements x9e, q3e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final CopyOnWriteArrayList<PluginInfo> f = new CopyOnWriteArrayList<>();
    public final ConcurrentHashMap<String, r9g> g = new ConcurrentHashMap<>();
    public ViewGroup h;
    public ViewGroup i;

    static {
        t2o.a(511705495);
        t2o.a(511705487);
        t2o.a(511705486);
    }

    public k8m(b8g b8gVar) {
        G(b8gVar);
    }

    public static /* synthetic */ Object ipc$super(k8m k8mVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/framework/container/PluginContainer");
    }

    @Override // tb.e8g
    public void J(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        for (r9g r9gVar : this.g.values()) {
            if (r9gVar != null) {
                r9gVar.J(i, i2, intent);
            }
        }
    }

    public void M(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd0b4cab", new Object[]{this, viewGroup});
            return;
        }
        View inflate = LayoutInflater.from(this.d).inflate(c(), viewGroup, false);
        if (inflate instanceof ViewGroup) {
            ViewGroup viewGroup2 = this.i;
            if (viewGroup2 == null) {
                viewGroup.addView(inflate);
            } else {
                viewGroup.addView(viewGroup2);
                this.i.addView(inflate);
            }
            this.h = (ViewGroup) inflate;
        }
    }

    public void N(h8g h8gVar, y7g y7gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afefcb3e", new Object[]{this, h8gVar, y7gVar});
            return;
        }
        for (r9g r9gVar : this.g.values()) {
            r9gVar.Y(h8gVar, y7gVar);
        }
    }

    public String O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "undefine";
    }

    public void P(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21311f01", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.f.addAll(rg4.a(str));
            Iterator<PluginInfo> it = this.f.iterator();
            while (it.hasNext()) {
                r9g b = v8m.b(this, it.next());
                if (b != null && b.a0()) {
                    X(b);
                }
            }
        }
    }

    public void Q(v8e v8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee0a5fdf", new Object[]{this, v8eVar});
            return;
        }
        for (r9g r9gVar : this.g.values()) {
            r9gVar.k0(v8eVar);
        }
    }

    public void R(v8e v8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96aa3dc5", new Object[]{this, v8eVar});
            return;
        }
        for (r9g r9gVar : this.g.values()) {
            r9gVar.g(v8eVar);
            r9gVar.l0(v8eVar);
        }
    }

    public void S(v8e v8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d64d190", new Object[]{this, v8eVar});
        } else if (i() instanceof rll) {
            for (k8m k8mVar : ((rll) i()).R()) {
                k8mVar.Q(v8eVar);
            }
        }
    }

    public void T(v8e v8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c604af76", new Object[]{this, v8eVar});
        } else if (i() instanceof rll) {
            for (k8m k8mVar : ((rll) i()).R()) {
                k8mVar.g(v8eVar);
                k8mVar.R(v8eVar);
            }
        }
    }

    public void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    public void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        for (r9g r9gVar : this.g.values()) {
            if (r9gVar != null) {
                Y(r9gVar);
            }
        }
    }

    public void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        for (r9g r9gVar : this.g.values()) {
            if (r9gVar != null) {
                r9gVar.j0();
            }
        }
    }

    public final void X(r9g r9gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25287a2", new Object[]{this, r9gVar});
            return;
        }
        pbg.a("PluginContainer->" + r9gVar.getClass().getSimpleName() + ".attachToView");
        r9gVar.N(this.h);
        pbg.c();
        this.g.put(r9gVar.V().name, r9gVar);
        pbg.a("PluginContainer->" + r9gVar.getClass().getSimpleName() + ".onCreate");
        r9gVar.f0();
        pbg.c();
    }

    public final void Y(r9g r9gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25625a94", new Object[]{this, r9gVar});
            return;
        }
        this.g.remove(r9gVar.V().name);
        r9gVar.h0();
    }

    public void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        for (r9g r9gVar : this.g.values()) {
            if (r9gVar != null) {
                r9gVar.m0();
            }
        }
    }

    public void a0(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eef074d4", new Object[]{this, viewGroup});
        } else {
            this.i = viewGroup;
        }
    }

    @Override // tb.q3e
    public <T extends q3e> T d(String str) {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((q3e) ipChange.ipc$dispatch("ff1b39be", new Object[]{this, str}));
        }
        if (TextUtils.equals(str, "undefine")) {
            return null;
        }
        if (TextUtils.equals(str, O())) {
            return this;
        }
        for (r9g r9gVar : this.g.values()) {
            if (!(r9gVar == null || (t = (T) r9gVar.d(str)) == null)) {
                return t;
            }
        }
        return null;
    }

    @Override // tb.q3e
    public View getContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        ViewGroup viewGroup = this.i;
        if (viewGroup != null) {
            return viewGroup;
        }
        return this.h;
    }
}
