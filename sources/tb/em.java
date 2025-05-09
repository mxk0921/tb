package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.service.render.AURARecyclerViewProvider;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class em {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final pcb f18668a;
    public AURAGlobalData b;
    public final AURARecyclerViewProvider c = new AURARecyclerViewProvider();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                em.a(em.this);
            }
        }
    }

    static {
        t2o.a(80740532);
    }

    public em(pcb pcbVar) {
        this.f18668a = pcbVar;
    }

    public static /* synthetic */ void a(em emVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d28468f4", new Object[]{emVar});
        } else {
            emVar.f();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54838a8e", new Object[]{this});
            return;
        }
        this.c.b();
        dn.f(new a(), 0L);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.c.f();
        this.f18668a.destroy();
    }

    public final String d(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc7cfde5", new Object[]{this, aURARenderComponent});
        }
        try {
            return aURARenderComponent.data.container.name;
        } catch (Throwable unused) {
            return "分隔条";
        }
    }

    public List<AURARenderComponent> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4b00ba6e", new Object[]{this});
        }
        return this.f18668a.a();
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e79171eb", new Object[]{this});
            return;
        }
        List<AURARenderComponent> a2 = this.f18668a.a();
        List<com.alibaba.android.ultron.ext.vlayout.a> d = this.f18668a.d();
        this.c.j(a2, d);
        k(a2);
        j(a2, d);
        i(a2, d);
    }

    public void g(yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b867b103", new Object[]{this, yiVar});
            return;
        }
        this.c.i(yiVar);
        this.f18668a.b(yiVar);
    }

    public void h(AURARenderComponent aURARenderComponent, AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aade934", new Object[]{this, aURARenderComponent, aURAFlowData, aURAGlobalData});
            return;
        }
        rbb g = ck.g();
        g.c("AURARenderContainerEngine", "渲染引擎", "根节点组件key：" + aURARenderComponent.key);
        this.b = aURAGlobalData;
        this.f18668a.c(aURAGlobalData, aURAFlowData, null);
        this.c.k(aURARenderComponent, aURAGlobalData);
        this.f18668a.e(aURARenderComponent);
        aURAGlobalData.update("render_view_item_models", this.f18668a.a());
        aURAFlowData.update("AURARenderViewLayoutHelpers", this.f18668a.d());
    }

    public final void k(List<AURARenderComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a487b8b", new Object[]{this, list});
        } else if (th.c()) {
            rbb g = ck.g();
            g.c("AURARenderContainerEngine", "渲染引擎", "组件数量：" + list.size());
            StringBuilder sb = new StringBuilder();
            for (AURARenderComponent aURARenderComponent : list) {
                sb.append("\n组件key：");
                sb.append(aURARenderComponent.key);
            }
            rbb g2 = ck.g();
            StringBuilder sb2 = new StringBuilder("组件列表：[");
            sb.append("]");
            sb2.append(sb.toString());
            g2.c("AURARenderContainerEngine", "渲染引擎", sb2.toString());
        }
    }

    public View l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f4e4e426", new Object[]{this, context});
        }
        return this.c.m(context, (RecyclerView) this.b.get("render_view", RecyclerView.class));
    }

    public void m(yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59d8b3da", new Object[]{this, yiVar});
            return;
        }
        HashMap hashMap = new HashMap();
        List<jcb> f = yiVar.f(jcb.class);
        if (!f.isEmpty()) {
            for (jcb jcbVar : f) {
                String a2 = jcbVar.a();
                if (TextUtils.isEmpty(a2)) {
                    rbb g = ck.g();
                    g.b("AURARenderContainerEngine", "", "componentType of " + jcbVar + " is empty!!!");
                } else {
                    hashMap.put(a2, jcbVar);
                }
            }
            if (!hashMap.isEmpty()) {
                for (mt mtVar : yiVar.f(mt.class)) {
                    mtVar.L(hashMap);
                }
            }
        }
    }

    public void n(hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c400e61", new Object[]{this, hbbVar});
        } else {
            this.c.q(hbbVar);
        }
    }

    public final void i(List<AURARenderComponent> list, List<com.alibaba.android.ultron.ext.vlayout.a> list2) {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad3d4402", new Object[]{this, list, list2});
        } else if (th.c()) {
            StringBuilder sb = new StringBuilder();
            for (com.alibaba.android.ultron.ext.vlayout.a aVar : list2) {
                int m = aVar.m();
                sb.append("\n布局类型：");
                sb.append(aVar.getClass().getSimpleName());
                sb.append("|布局数量:");
                sb.append(m);
                sb.append("|包含组件：(");
                int i3 = i2;
                while (true) {
                    i = i2 + m;
                    if (i3 < i && list.size() > i3) {
                        sb.append(d(list.get(i3)));
                        sb.append(",");
                        i3++;
                    }
                }
                sb.append(f7l.BRACKET_END_STR);
                i2 = i;
            }
            rbb g = ck.g();
            StringBuilder sb2 = new StringBuilder("布局信息：[");
            sb.append("]");
            sb2.append(sb.toString());
            g.c("AURARenderContainerEngine", "渲染引擎", sb2.toString());
        }
    }

    public final void j(List<AURARenderComponent> list, List<com.alibaba.android.ultron.ext.vlayout.a> list2) {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f002468", new Object[]{this, list, list2});
        } else if (th.c()) {
            StringBuilder sb = new StringBuilder();
            for (com.alibaba.android.ultron.ext.vlayout.a aVar : list2) {
                int m = aVar.m();
                sb.append("\n布局类型：");
                sb.append(aVar.getClass().getSimpleName());
                sb.append("|布局数量:");
                sb.append(m);
                sb.append("|包含组件：(");
                int i3 = i2;
                while (true) {
                    i = i2 + m;
                    if (i3 < i && list.size() > i3) {
                        sb.append(list.get(i3).key);
                        sb.append(",");
                        i3++;
                    }
                }
                sb.append(f7l.BRACKET_END_STR);
                i2 = i;
            }
            rbb g = ck.g();
            StringBuilder sb2 = new StringBuilder("布局信息：[");
            sb.append("]");
            sb2.append(sb.toString());
            g.c("AURARenderContainerEngine", "渲染引擎", sb2.toString());
        }
    }
}
