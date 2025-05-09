package tb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.alibaba.android.ultron.vfw.instance.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.s;
import com.taobao.taobao.R;
import java.util.Iterator;
import kotlin.Pair;
import tb.n9;
import tb.u4r;
import tb.z7v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class v4r<P extends u4r, C extends n9> implements IAKPopRender<P, C> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public C f29779a;
    public Context b;
    public a c;
    public P d;

    static {
        t2o.a(786432138);
        t2o.a(336593036);
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void h(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2962cd0d", new Object[]{this, str, jSONObject});
        } else {
            ckf.g(str, "type");
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public String i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8e8363f", new Object[]{this, str});
        }
        return "ultron";
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void k(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70661375", new Object[]{this, view});
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public boolean l(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21f6b89a", new Object[]{this, view, new Integer(i)})).booleanValue();
        }
        ckf.g(view, "contentView");
        return false;
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void m(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bc9c903", new Object[]{this, view});
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void n(String str, JSONObject jSONObject) {
        DXRuntimeContext p;
        av5 s;
        DinamicXEngine f;
        y7 v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a682cf", new Object[]{this, str, jSONObject});
            return;
        }
        ckf.g(str, "type");
        C c = this.f29779a;
        if (!(c instanceof tk6)) {
            c = null;
        }
        tk6 tk6Var = (tk6) c;
        if (tk6Var != null && (p = tk6Var.p()) != null && (s = p.s()) != null && (f = s.f()) != null && (v = f.v()) != null) {
            v.l(str, jSONObject);
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void onSizeChanged(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb57503b", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.d != null && this.c != null) {
            if (gxv.l(this.b)) {
                a aVar = this.c;
                ckf.d(aVar);
                ViewEngine G = aVar.G();
                ckf.f(G, "mUltronInstance!!.viewEngine");
                G.h1(View.MeasureSpec.makeMeasureSpec(i, 1073741824));
            }
            a aVar2 = this.c;
            ckf.d(aVar2);
            P p = this.d;
            ckf.d(p);
            aVar2.e0(p.f(), null);
        }
    }

    /* renamed from: a */
    public void j(C c, P p, View view, iab iabVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1695870e", new Object[]{this, c, p, view, iabVar});
            return;
        }
        ckf.g(c, "abilityRuntimeContext");
        ckf.g(p, "params");
        ckf.g(iabVar, "callback");
        this.d = p;
        this.f29779a = c;
        Context d = c.d();
        if (d != null) {
            if (gxv.l(d)) {
                p.g().G(new z7v.b().l(new DXEngineConfig.b(p.g().i()).H(true, true)).i());
            }
            a q = a.q(p.g(), d);
            this.c = q;
            String str = p.j;
            if (str != null) {
                Iterator<T> it = g8v.INSTANCE.c(str).iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    ckf.f(q, "ultronInstance");
                    q.getEventHandler().q((String) pair.component1(), (l6v) pair.component2());
                }
                ckf.f(q, "ultronInstance");
                jo7 A = q.A();
                ckf.f(A, "ultronInstance.engineManager");
                s b = A.b();
                ckf.f(b, "ultronInstance.engineManager.dxEngine");
                DinamicXEngine k = b.k();
                ckf.f(k, "ultronInstance.engineManager.dxEngine.engine");
                dht.a(str, k);
            }
            View inflate = LayoutInflater.from(d).inflate(R.layout.tak_ultron_pop, (ViewGroup) null);
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.tak_ultron_pop_body);
            recyclerView.setLayoutManager(new LinearLayoutManager(d));
            xhv xhvVar = xhv.INSTANCE;
            q.O((LinearLayout) inflate.findViewById(R.id.tak_ultron_pop_header), recyclerView, (LinearLayout) inflate.findViewById(R.id.tak_ultron_pop_footer));
            iabVar.onRenderSuccess(inflate);
            q.e0(p.f(), null);
        } else {
            d = null;
        }
        this.b = d;
    }
}
