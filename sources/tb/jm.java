package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentLayout;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class jm implements pcb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<ucb> f;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, rcb> f22062a = new HashMap();
    public final Map<AURARenderComponent, nt> d = new HashMap();
    public final List<ocb> g = new ArrayList();
    public final List<AURARenderComponent> b = new ArrayList();
    public final List<com.alibaba.android.ultron.ext.vlayout.a> c = new ArrayList();
    public final List<nt> e = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements mbb<AURARenderComponent, Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* renamed from: b */
        public Boolean a(AURARenderComponent aURARenderComponent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("5faca3fc", new Object[]{this, aURARenderComponent});
            }
            for (ucb ucbVar : jm.f(jm.this)) {
                ucbVar.e0(aURARenderComponent);
            }
            return Boolean.valueOf(aURARenderComponent.isRenderAbleLeaf());
        }
    }

    static {
        t2o.a(80740573);
        t2o.a(80740582);
    }

    public jm() {
        t();
        s();
    }

    public static /* synthetic */ List f(jm jmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a6f20aea", new Object[]{jmVar});
        }
        return jmVar.f;
    }

    @Override // tb.pcb
    public List<AURARenderComponent> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d018ef68", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.pcb
    public void b(yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22a6e58e", new Object[]{this, yiVar});
        } else {
            this.f = yiVar.f(ucb.class);
        }
    }

    @Override // tb.pcb
    public void c(AURAGlobalData aURAGlobalData, AURAFlowData aURAFlowData, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f7653e", new Object[]{this, aURAGlobalData, aURAFlowData, map});
        }
    }

    @Override // tb.pcb
    public List<com.alibaba.android.ultron.ext.vlayout.a> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("69480238", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.pcb
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        j();
        ((HashMap) this.f22062a).clear();
        ((ArrayList) this.g).clear();
    }

    @Override // tb.pcb
    public void e(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19e56dc6", new Object[]{this, aURARenderComponent});
        } else if (aURARenderComponent != null) {
            v(aURARenderComponent.isRoot());
            List<AURARenderComponent> k = k(aURARenderComponent);
            List<nt> n = n(k);
            List<com.alibaba.android.ultron.ext.vlayout.a> o = o(n);
            h(k, n, o);
            ((ArrayList) this.b).addAll(k);
            ((ArrayList) this.c).addAll(o);
            ((ArrayList) this.e).addAll(n);
        }
    }

    public final void g(nt ntVar, int i, AURARenderComponent aURARenderComponent, List<nt> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("727805f9", new Object[]{this, ntVar, new Integer(i), aURARenderComponent, list});
            return;
        }
        if (!ntVar.r()) {
            ntVar.w(i);
            list.add(ntVar);
        }
        ntVar.s(1);
        ntVar.d(aURARenderComponent);
    }

    public final void h(List<AURARenderComponent> list, List<nt> list2, List<com.alibaba.android.ultron.ext.vlayout.a> list3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e47df043", new Object[]{this, list, list2, list3});
            return;
        }
        List<ocb> list4 = this.g;
        if (list4 != null) {
            Iterator it = ((ArrayList) list4).iterator();
            while (it.hasNext()) {
                ((ocb) it.next()).a(list, list2, list3);
            }
        }
    }

    public final void i(List<nt> list, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93c6a80e", new Object[]{this, list, aURARenderComponent});
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (nt ntVar : list) {
            if (aURARenderComponent == ntVar.q()) {
                arrayList.add(ntVar);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            nt ntVar2 = (nt) arrayList.get(i);
            ntVar2.t(i);
            ntVar2.u(size);
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        ((ArrayList) this.b).clear();
        ((ArrayList) this.c).clear();
        ((HashMap) this.d).clear();
        Iterator it = ((ArrayList) this.e).iterator();
        while (it.hasNext()) {
            ((nt) it.next()).clear();
        }
        ((ArrayList) this.e).clear();
    }

    public final List<AURARenderComponent> k(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("25b645f6", new Object[]{this, aURARenderComponent});
        }
        ArrayList arrayList = new ArrayList();
        bm.b(aURARenderComponent, arrayList, new a());
        return arrayList;
    }

    public final nt l(AURARenderComponent aURARenderComponent) {
        AURARenderComponent aURARenderComponent2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nt) ipChange.ipc$dispatch("d1761bbd", new Object[]{this, aURARenderComponent});
        }
        if (aURARenderComponent == null || (aURARenderComponent2 = aURARenderComponent.parent) == null) {
            return null;
        }
        nt q = q(aURARenderComponent2);
        if (q != null) {
            return q;
        }
        if (aURARenderComponent2.parent == null) {
            return null;
        }
        return l(aURARenderComponent2);
    }

    public final nt m(AURARenderComponent aURARenderComponent, AURARenderComponent aURARenderComponent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nt) ipChange.ipc$dispatch("704c0284", new Object[]{this, aURARenderComponent, aURARenderComponent2});
        }
        nt l = l(aURARenderComponent);
        if (l != null) {
            nt l2 = l(aURARenderComponent.parent);
            if (l2 == null) {
                return l;
            }
            if (!l.e(l2)) {
                return l;
            }
            nt m = m(l.q(), aURARenderComponent2);
            if (m == null) {
                return l2;
            }
            return m;
        } else if (aURARenderComponent == aURARenderComponent2) {
            return p(aURARenderComponent2);
        } else {
            return null;
        }
    }

    public final List<com.alibaba.android.ultron.ext.vlayout.a> o(List<nt> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b21e3ee4", new Object[]{this, list});
        }
        ArrayList arrayList = new ArrayList();
        for (nt ntVar : list) {
            com.alibaba.android.ultron.ext.vlayout.a f = ntVar.f();
            if (f != null) {
                arrayList.add(f);
            }
        }
        return arrayList;
    }

    public final nt p(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nt) ipChange.ipc$dispatch("3f2aa259", new Object[]{this, aURARenderComponent});
        }
        return new lm(aURARenderComponent);
    }

    public nt q(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nt) ipChange.ipc$dispatch("59c0f024", new Object[]{this, aURARenderComponent});
        }
        return r(aURARenderComponent, false);
    }

    public nt r(AURARenderComponent aURARenderComponent, boolean z) {
        AURARenderComponentData aURARenderComponentData;
        AURARenderComponentLayout aURARenderComponentLayout;
        String str;
        nt ntVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nt) ipChange.ipc$dispatch("52fb2462", new Object[]{this, aURARenderComponent, new Boolean(z)});
        }
        if (!aURARenderComponent.isValidLayout() || (aURARenderComponentData = aURARenderComponent.data) == null || (aURARenderComponentLayout = aURARenderComponentData.layout) == null || (str = aURARenderComponentLayout.type) == null || TextUtils.isEmpty(str)) {
            return null;
        }
        if (!z && (ntVar = (nt) ((HashMap) this.d).get(aURARenderComponent)) != null) {
            return ntVar;
        }
        rcb rcbVar = (rcb) ((HashMap) this.f22062a).get(str.toLowerCase());
        if (rcbVar == null) {
            ck.g().b("AURARenderLayoutDataProcessorV2", "getRenderLayoutHelper", str.concat("：不存在对应的IAURARenderLayoutHelperRegister"));
            return null;
        }
        nt b = rcbVar.b(aURARenderComponent);
        ((HashMap) this.d).put(aURARenderComponent, b);
        return b;
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0af3b51", new Object[]{this});
        } else {
            u(new hm());
        }
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bded2d0", new Object[]{this});
        } else {
            ((HashMap) this.f22062a).putAll(km.a());
        }
    }

    public void u(ocb ocbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("509d3157", new Object[]{this, ocbVar});
        } else if (ocbVar != null && !this.g.contains(ocbVar)) {
            this.g.add(ocbVar);
        }
    }

    public final void v(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1b89534", new Object[]{this, new Boolean(z)});
        } else if (z) {
            j();
        }
    }

    public final List<nt> n(List<AURARenderComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("af346ff4", new Object[]{this, list});
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            AURARenderComponent aURARenderComponent = list.get(i);
            nt m = m(aURARenderComponent, aURARenderComponent);
            if (i > 0) {
                int size = arrayList.size() - 1;
                if (m == (size >= 0 ? (nt) arrayList.get(size) : null)) {
                    g(m, i, aURARenderComponent, arrayList);
                } else if (arrayList.contains(m)) {
                    AURARenderComponent q = m.q();
                    nt r = r(q, true);
                    if (r != null) {
                        g(r, i, aURARenderComponent, arrayList);
                        i(arrayList, q);
                    } else {
                        rbb g = ck.g();
                        g.b("AURARenderLayoutDataProcessorV2", "generatorRenderLayoutHelpers", "newRenderLayoutDelegate is null, no layout render helper for [" + q.key + "]");
                    }
                } else {
                    g(m, i, aURARenderComponent, arrayList);
                }
            } else {
                g(m, i, aURARenderComponent, arrayList);
            }
        }
        return arrayList;
    }
}
