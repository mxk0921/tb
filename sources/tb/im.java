package tb;

import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentLayout;
import com.alipay.android.phone.iifaa.did.rpc.model.CredentialRpcData;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.internal.AliBuyPresenterImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class im implements pcb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public AURAGlobalData g;
    public AURAFlowData h;

    /* renamed from: a  reason: collision with root package name */
    public final List<Pair<Integer, com.alibaba.android.ultron.ext.vlayout.a>> f21398a = new ArrayList();
    public final Map<Integer, h4e<?>> b = new HashMap();
    public final Map<String, h4e> e = new HashMap();
    public final boolean f = fj.d("enableNewCornerProcessor", true);
    public final List<AURARenderComponent> c = new ArrayList();
    public final List<com.alibaba.android.ultron.ext.vlayout.a> d = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements mbb<AURARenderComponent, Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* renamed from: b */
        public Boolean a(AURARenderComponent aURARenderComponent) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("5faca3fc", new Object[]{this, aURARenderComponent});
            }
            im imVar = im.this;
            if (im.g(imVar, im.f(imVar).size(), aURARenderComponent) || !aURARenderComponent.isRenderAbleLeaf()) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements Comparator<Pair<Integer, com.alibaba.android.ultron.ext.vlayout.a>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f21400a;

        public b(im imVar, boolean z) {
            this.f21400a = z;
        }

        /* renamed from: a */
        public int compare(Pair<Integer, com.alibaba.android.ultron.ext.vlayout.a> pair, Pair<Integer, com.alibaba.android.ultron.ext.vlayout.a> pair2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8d8bc39f", new Object[]{this, pair, pair2})).intValue();
            }
            if (this.f21400a) {
                return ((Integer) pair2.first).intValue() - ((Integer) pair.first).intValue();
            }
            return ((Integer) pair.first).intValue() - ((Integer) pair2.first).intValue();
        }
    }

    static {
        t2o.a(80740570);
        t2o.a(80740582);
    }

    public im() {
        C();
    }

    public static void F(AURARenderComponent aURARenderComponent, String str) {
        AURARenderComponentData aURARenderComponentData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64d3e0ca", new Object[]{aURARenderComponent, str});
        } else if (aURARenderComponent != null && (aURARenderComponentData = aURARenderComponent.data) != null) {
            if (aURARenderComponentData.fields == null) {
                aURARenderComponentData.fields = new HashMap();
            }
            aURARenderComponentData.fields.put("cornerType", str);
        }
    }

    public static /* synthetic */ List f(im imVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("513ed70e", new Object[]{imVar});
        }
        return imVar.c;
    }

    public static /* synthetic */ boolean g(im imVar, int i, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24fb03b6", new Object[]{imVar, new Integer(i), aURARenderComponent})).booleanValue();
        }
        return imVar.q(i, aURARenderComponent);
    }

    public final int A(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2, SparseIntArray sparseIntArray3, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7508a7d", new Object[]{this, sparseIntArray, sparseIntArray2, sparseIntArray3, new Integer(i), new Integer(i2)})).intValue();
        }
        int i3 = sparseIntArray.get(i2, 0);
        sparseIntArray.put(i2, i3 + 1);
        sparseIntArray2.put(i2, sparseIntArray2.get(i2, 1) + 1);
        sparseIntArray3.put(i, i2);
        return i3;
    }

    public void B(h4e<?> h4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("916acc19", new Object[]{this, h4eVar});
        } else {
            this.e.put(h4eVar.a(), h4eVar);
        }
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("907e0de9", new Object[]{this});
            return;
        }
        B(new mm());
        B(new sm());
        B(new zl());
        B(new om());
    }

    public final void D(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1b89534", new Object[]{this, new Boolean(z)});
        } else if (z) {
            h();
        }
    }

    public final void E(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77380f52", new Object[]{this, new Integer(i), str});
        } else if (i >= 0 && i < ((ArrayList) this.c).size()) {
            F((AURARenderComponent) ((ArrayList) this.c).get(i), str);
        }
    }

    public final void G(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c889a94a", new Object[]{this, new Boolean(z)});
        } else {
            Collections.sort(this.f21398a, new b(this, z));
        }
    }

    public final boolean H(List<AURARenderComponent> list, List<com.alibaba.android.ultron.ext.vlayout.a> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("653d46c9", new Object[]{this, list, list2})).booleanValue();
        }
        if (!((ArrayList) this.f21398a).isEmpty() || ((ArrayList) this.c).isEmpty()) {
            return false;
        }
        list2.add(r().b(list.size(), null));
        return true;
    }

    @Override // tb.pcb
    public List<AURARenderComponent> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d018ef68", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.pcb
    public void b(yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22a6e58e", new Object[]{this, yiVar});
        }
    }

    @Override // tb.pcb
    public void c(AURAGlobalData aURAGlobalData, AURAFlowData aURAFlowData, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f7653e", new Object[]{this, aURAGlobalData, aURAFlowData, map});
            return;
        }
        this.g = aURAGlobalData;
        this.h = aURAFlowData;
    }

    @Override // tb.pcb
    public List<com.alibaba.android.ultron.ext.vlayout.a> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("69480238", new Object[]{this});
        }
        return this.d;
    }

    @Override // tb.pcb
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            h();
        }
    }

    @Override // tb.pcb
    public void e(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19e56dc6", new Object[]{this, aURARenderComponent});
            return;
        }
        D(aURARenderComponent.isRoot());
        bm.b(aURARenderComponent, this.c, new a());
        x();
        p();
        if (aURARenderComponent.isRoot()) {
            G(false);
            y(this.c, this.d);
            o();
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        ((ArrayList) this.c).clear();
        ((ArrayList) this.d).clear();
        ((ArrayList) this.f21398a).clear();
        ((HashMap) this.b).clear();
        i();
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faf586ff", new Object[]{this});
            return;
        }
        for (qcb qcbVar : ((HashMap) this.e).values()) {
            qcbVar.clear();
        }
    }

    public final int j(AURARenderComponent aURARenderComponent) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aee2393c", new Object[]{this, aURARenderComponent})).intValue();
        }
        List<AURARenderComponent> list = aURARenderComponent.children;
        if (list == null) {
            return 0;
        }
        for (AURARenderComponent aURARenderComponent2 : list) {
            if (aURARenderComponent2 != null) {
                if (aURARenderComponent2.isRenderAbleLeaf()) {
                    i++;
                }
                i += j(aURARenderComponent2);
            }
        }
        return i;
    }

    public final int k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c10c2629", new Object[]{this, new Integer(i)})).intValue();
        }
        Iterator it = ((ArrayList) this.f21398a).iterator();
        while (it.hasNext()) {
            Integer num = (Integer) ((Pair) it.next()).first;
            if (i >= num.intValue()) {
                return num.intValue();
            }
        }
        return -1;
    }

    public final int l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a125a7a", new Object[]{this, new Integer(i)})).intValue();
        }
        Iterator it = ((ArrayList) this.f21398a).iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            Integer num = (Integer) pair.first;
            if (i >= num.intValue()) {
                if (i == num.intValue()) {
                    return num.intValue();
                }
                if (((com.alibaba.android.ultron.ext.vlayout.a) pair.second).m() + num.intValue() > i && num.intValue() <= i) {
                    return num.intValue();
                }
            }
        }
        return -1;
    }

    public final Pair<Integer, com.alibaba.android.ultron.ext.vlayout.a> m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("4284066a", new Object[]{this, new Integer(i)});
        }
        int size = ((ArrayList) this.f21398a).size();
        if (i <= 0 || i >= size) {
            return null;
        }
        return (Pair) ((ArrayList) this.f21398a).get(i - 1);
    }

    public final AURARenderComponent n(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("98e797f4", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
        }
        int i3 = i2 + i;
        AURARenderComponent aURARenderComponent = null;
        if (((ArrayList) this.c).size() <= i3) {
            return null;
        }
        while (i < i3 && ((ArrayList) this.c).size() > i) {
            AURARenderComponent aURARenderComponent2 = (AURARenderComponent) ((ArrayList) this.c).get(i);
            boolean isInvisible = aURARenderComponent2.isInvisible();
            if (z) {
                if (!isInvisible) {
                    return aURARenderComponent2;
                }
            } else if (!isInvisible) {
                aURARenderComponent = aURARenderComponent2;
            }
            i++;
        }
        return aURARenderComponent;
    }

    public final void o() {
        Map<String, Object> g0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9e59829", new Object[]{this});
        } else if (!((ArrayList) this.d).isEmpty()) {
            SparseIntArray sparseIntArray = new SparseIntArray();
            SparseArray sparseArray = new SparseArray();
            int i = 0;
            for (int i2 = 0; i2 < ((ArrayList) this.d).size(); i2++) {
                com.alibaba.android.ultron.ext.vlayout.a aVar = (com.alibaba.android.ultron.ext.vlayout.a) ((ArrayList) this.d).get(i2);
                int m = aVar.m();
                i += m;
                if (aVar instanceof cdb) {
                    cdb cdbVar = (cdb) aVar;
                    if ("card".equals(cdbVar.a()) && cdbVar.e() == 0 && (((ArrayList) this.c).size() < i || n(i - m, m, true) != null)) {
                        int size = sparseIntArray.size() + i2;
                        if (i2 != 0 || !v() || !fj.d("ignoreFirstDividerLine", true)) {
                            sparseIntArray.put(size, (i - m) + sparseIntArray.size());
                            if ((cdbVar instanceof zg) && (g0 = ((zg) cdbVar).g0()) != null) {
                                sparseArray.put(size, g0);
                            }
                        }
                    }
                }
            }
            for (int i3 = 0; i3 < sparseIntArray.size(); i3++) {
                AURARenderComponent aURARenderComponent = new AURARenderComponent();
                AURARenderComponentData aURARenderComponentData = new AURARenderComponentData();
                aURARenderComponentData.container = new AURARenderComponentContainer(dm.e, "", "", null, "", "");
                aURARenderComponent.data = aURARenderComponentData;
                aURARenderComponent.key = "dividerLine";
                int keyAt = sparseIntArray.keyAt(i3);
                Map<String, Object> map = (Map) sparseArray.get(keyAt);
                if (map != null) {
                    AURARenderComponentLayout aURARenderComponentLayout = new AURARenderComponentLayout();
                    aURARenderComponentLayout.style = map;
                    aURARenderComponentData.layout = aURARenderComponentLayout;
                }
                ((ArrayList) this.d).add(keyAt, r().b(1, null));
                ((ArrayList) this.c).add(sparseIntArray.valueAt(i3), aURARenderComponent);
            }
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9387f977", new Object[]{this});
            return;
        }
        G(true);
        Iterator it = ((ArrayList) this.f21398a).iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            com.alibaba.android.ultron.ext.vlayout.a aVar = (com.alibaba.android.ultron.ext.vlayout.a) pair.second;
            if (1 != aVar.m()) {
                Object obj = pair.first;
                Integer num = (Integer) obj;
                int intValue = ((Integer) obj).intValue() + aVar.m();
                int i = 0;
                for (int intValue2 = num.intValue(); intValue2 < intValue; intValue2++) {
                    if (num.intValue() == l(intValue2)) {
                        i++;
                    }
                }
                aVar.z(i);
            }
        }
    }

    public final boolean q(int i, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a22ce93", new Object[]{this, new Integer(i), aURARenderComponent})).booleanValue();
        }
        h4e<?> t = t(aURARenderComponent);
        if (t == null) {
            return false;
        }
        List<AURARenderComponent> list = aURARenderComponent.children;
        if (list != null && !list.isEmpty()) {
            int j = j(aURARenderComponent);
            int u = u(aURARenderComponent);
            if (u == 0) {
                int j2 = j(list.get(u));
                if (j == j2) {
                    return true;
                }
                i = Math.max(0, j - j2);
            }
            if (t.c()) {
                for (int i2 = 0; i2 < j; i2++) {
                    int i3 = i + i2;
                    ((ArrayList) this.f21398a).add(Pair.create(Integer.valueOf(i3), t.b(1, s(aURARenderComponent))));
                    ((HashMap) this.b).put(Integer.valueOf(i3), t);
                }
            } else {
                ((ArrayList) this.f21398a).add(Pair.create(Integer.valueOf(i), t.b(j, s(aURARenderComponent))));
                ((HashMap) this.b).put(Integer.valueOf(i), t);
            }
        }
        return true;
    }

    public final h4e<?> r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h4e) ipChange.ipc$dispatch("faead097", new Object[]{this});
        }
        return (h4e) ((HashMap) this.e).get("linear");
    }

    public final Map<String, Object> s(AURARenderComponent aURARenderComponent) {
        AURARenderComponentLayout aURARenderComponentLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("70cda7b8", new Object[]{this, aURARenderComponent});
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData == null || (aURARenderComponentLayout = aURARenderComponentData.layout) == null) {
            return null;
        }
        return aURARenderComponentLayout.style;
    }

    public final h4e<?> t(AURARenderComponent aURARenderComponent) {
        AURARenderComponentData aURARenderComponentData;
        AURARenderComponentLayout aURARenderComponentLayout;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h4e) ipChange.ipc$dispatch("aac66907", new Object[]{this, aURARenderComponent});
        }
        if (!aURARenderComponent.isValidLayout() || (aURARenderComponentData = aURARenderComponent.data) == null || (aURARenderComponentLayout = aURARenderComponentData.layout) == null || (str = aURARenderComponentLayout.type) == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return (h4e) ((HashMap) this.e).get(str);
    }

    public final int u(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("349e7656", new Object[]{this, aURARenderComponent})).intValue();
        }
        List<AURARenderComponent> list = aURARenderComponent.children;
        if (bh.a(list)) {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            if (w(list.get(i))) {
                return i;
            }
        }
        return -1;
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5378c01f", new Object[]{this});
            return;
        }
        G(true);
        ArrayList arrayList = new ArrayList();
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        for (int i = 0; i < ((ArrayList) this.c).size(); i++) {
            int l = l(i);
            if (!(i == l || -1 == l || l == k(i))) {
                h4e h4eVar = (h4e) ((HashMap) this.b).get(Integer.valueOf(l));
                com.alibaba.android.ultron.ext.vlayout.a b2 = h4eVar.b(1, s((AURARenderComponent) ((ArrayList) this.c).get(i)));
                arrayList.add(Pair.create(Integer.valueOf(i), b2));
                ((HashMap) this.b).put(Integer.valueOf(i), h4eVar);
                int A = A(sparseIntArray, sparseIntArray2, sparseIntArray3, i, l);
                if (b2 instanceof cdb) {
                    ((cdb) b2).d(A + 1);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            com.alibaba.android.ultron.ext.vlayout.a aVar = (com.alibaba.android.ultron.ext.vlayout.a) pair.second;
            if (aVar instanceof cdb) {
                int i2 = sparseIntArray3.get(((Integer) pair.first).intValue());
                int i3 = sparseIntArray2.get(i2, 1);
                Iterator it2 = ((ArrayList) this.f21398a).iterator();
                while (it2.hasNext()) {
                    Pair pair2 = (Pair) it2.next();
                    if (i2 == ((Integer) pair2.first).intValue()) {
                        com.alibaba.android.ultron.ext.vlayout.a aVar2 = (com.alibaba.android.ultron.ext.vlayout.a) pair2.second;
                        if (aVar2 instanceof cdb) {
                            ((cdb) aVar2).c(i3);
                        }
                    }
                }
                ((cdb) aVar).c(i3);
            }
        }
        ((ArrayList) this.f21398a).addAll(arrayList);
    }

    public final boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6811acda", new Object[]{this})).booleanValue();
        }
        AURAGlobalData aURAGlobalData = this.g;
        if (aURAGlobalData == null) {
            return false;
        }
        return "1".equals(aURAGlobalData.get("taoBuy3Style1", String.class)) || AliBuyPresenterImpl.PRELOAD_MAIN_PAGE_FLOW.equals(this.h.getFlowCode());
    }

    public final boolean w(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8cf1f39c", new Object[]{this, aURARenderComponent})).booleanValue();
        }
        if (aURARenderComponent != null) {
            return !bh.a(aURARenderComponent.children) && t(aURARenderComponent) != null;
        }
        th.a("when executor function isValidLayout,renderComponent is null!");
        return false;
    }

    public final void y(List<AURARenderComponent> list, List<com.alibaba.android.ultron.ext.vlayout.a> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca7284db", new Object[]{this, list, list2});
        } else if (!H(list, list2)) {
            for (int i = 0; i < ((ArrayList) this.f21398a).size(); i++) {
                Pair pair = (Pair) ((ArrayList) this.f21398a).get(i);
                Integer num = (Integer) pair.first;
                com.alibaba.android.ultron.ext.vlayout.a aVar = (com.alibaba.android.ultron.ext.vlayout.a) pair.second;
                if (aVar.m() != 0) {
                    Pair<Integer, com.alibaba.android.ultron.ext.vlayout.a> m = m(i);
                    if (m == null) {
                        if (num.intValue() > 0) {
                            list2.add(r().b(num.intValue(), null));
                        }
                        list2.add(aVar);
                    } else {
                        int intValue = num.intValue() - (((com.alibaba.android.ultron.ext.vlayout.a) m.second).m() + ((Integer) m.first).intValue());
                        if (intValue > 0) {
                            list2.add(r().b(intValue, null));
                            list2.add(aVar);
                        } else {
                            list2.add(aVar);
                        }
                    }
                    try {
                        z(num.intValue(), aVar);
                    } catch (Throwable th) {
                        ck.g().b(im.class.getSimpleName(), "makeupLayoutHelpers", th.getMessage());
                    }
                }
            }
        }
    }

    public final void z(int i, com.alibaba.android.ultron.ext.vlayout.a aVar) {
        h4e h4eVar;
        AURARenderComponent n;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9323ec5f", new Object[]{this, new Integer(i), aVar});
        } else if ((aVar instanceof cdb) && (h4eVar = (h4e) ((HashMap) this.b).get(Integer.valueOf(i))) != null && "card".equals(h4eVar.a())) {
            cdb cdbVar = (cdb) aVar;
            int max = Math.max(0, cdbVar.e());
            int max2 = Math.max(1, cdbVar.b());
            int m = aVar.m();
            if (1 == max2 && 1 == m) {
                E(i, CredentialRpcData.ACTION_BOTH);
            } else if (this.f) {
                if (1 == max2) {
                    AURARenderComponent n2 = n(i, m, true);
                    if (n2 != null) {
                        F(n2, "top");
                    }
                    AURARenderComponent n3 = n(i, m, false);
                    if (n3 != null) {
                        F(n3, "bottom");
                    }
                    if (n2 == n3 && n2 != null) {
                        F(n2, CredentialRpcData.ACTION_BOTH);
                    }
                } else if (max == 0) {
                    AURARenderComponent n4 = n(i, m, true);
                    if (n4 != null) {
                        F(n4, "top");
                    }
                } else if (max == max2 - 1 && (n = n(i, m, false)) != null) {
                    F(n, "bottom");
                }
            } else if (1 == max2) {
                E(i, "top");
                E((i + m) - 1, "bottom");
            } else if (max == 0) {
                E(i, "top");
            } else if (max == max2 - 1) {
                E((i + m) - 1, "bottom");
            }
        }
    }
}
