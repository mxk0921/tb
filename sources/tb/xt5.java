package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.j;
import com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.recycler.manager.datasource.DXDataSourceLruManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xt5 implements j.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<Object> f31593a;
    public Map<Integer, zt5> b;
    public List<DXWidgetNode> c;
    public final DXDataSourceLruManager d;

    static {
        t2o.a(444597562);
        t2o.a(444597570);
        t2o.a(444596511);
    }

    public xt5() {
        this(null);
    }

    public void a(int i, Collection<DXWidgetNode> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("990767ba", new Object[]{this, new Integer(i), collection});
            return;
        }
        DXDataSourceLruManager dXDataSourceLruManager = this.d;
        if (dXDataSourceLruManager != null) {
            dXDataSourceLruManager.a(i, collection);
            return;
        }
        List<DXWidgetNode> list = this.c;
        if (list != null) {
            list.addAll(i, collection);
        }
    }

    public void b(int i, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98655fa7", new Object[]{this, new Integer(i), dXWidgetNode});
            return;
        }
        DXDataSourceLruManager dXDataSourceLruManager = this.d;
        if (dXDataSourceLruManager != null) {
            dXDataSourceLruManager.b(i, dXWidgetNode);
            return;
        }
        List<DXWidgetNode> list = this.c;
        if (list != null) {
            if (i < 0 || i > list.size()) {
                la6.b("DXRecyclerLayout appendItem indexOutOfBounds: " + i + " size: " + this.c.size());
            }
            this.c.add(i, dXWidgetNode);
        }
    }

    public boolean c(int i, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41ccb54a", new Object[]{this, new Integer(i), dXWidgetNode})).booleanValue();
        }
        DXDataSourceLruManager dXDataSourceLruManager = this.d;
        if (dXDataSourceLruManager != null) {
            return dXDataSourceLruManager.c(i, dXWidgetNode);
        }
        List<DXWidgetNode> list = this.c;
        if (list == null || i < 0 || i > list.size()) {
            return false;
        }
        this.c.add(i, dXWidgetNode);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.bi6 d(com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout r6, com.taobao.android.dinamicx.widget.DXWidgetNode r7, java.lang.Object r8, java.util.List<java.lang.Object> r9, int r10, tb.oz8 r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.xt5.d(com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.DXWidgetNode, java.lang.Object, java.util.List, int, tb.oz8, boolean):tb.bi6");
    }

    @Override // com.taobao.android.dinamicx.j.a
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ed9b6d4", new Object[]{this});
        }
        if (!DinamicXEngine.j0() || this.d == null) {
            return null;
        }
        return " RecyclerLayout lruCacheSize: " + this.d.h();
    }

    public DXWidgetNode f(DXAbsContainerBaseLayout dXAbsContainerBaseLayout, Object obj, List<Object> list, List<DXWidgetNode> list2, int i, oz8 oz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("f4151d92", new Object[]{this, dXAbsContainerBaseLayout, obj, list, list2, new Integer(i), oz8Var});
        }
        return null;
    }

    public ArrayList<DXWidgetNode> g(DXAbsContainerBaseLayout dXAbsContainerBaseLayout, List<Object> list, List<DXWidgetNode> list2, int i, int i2, oz8 oz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("95b8f9be", new Object[]{this, dXAbsContainerBaseLayout, list, list2, new Integer(i), new Integer(i2), oz8Var});
        }
        return null;
    }

    public List<Object> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("eb16ea5", new Object[]{this});
        }
        DXDataSourceLruManager dXDataSourceLruManager = this.d;
        if (dXDataSourceLruManager != null) {
            return dXDataSourceLruManager.f();
        }
        return this.f31593a;
    }

    public DXWidgetNode i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("e59e5492", new Object[]{this, new Integer(i)});
        }
        DXDataSourceLruManager dXDataSourceLruManager = this.d;
        if (dXDataSourceLruManager != null) {
            return dXDataSourceLruManager.g(i);
        }
        List<DXWidgetNode> list = this.c;
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        return this.c.get(i);
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8d12aa4", new Object[]{this})).intValue();
        }
        DXDataSourceLruManager dXDataSourceLruManager = this.d;
        if (dXDataSourceLruManager != null) {
            return dXDataSourceLruManager.h();
        }
        List<DXWidgetNode> list = this.c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<DXWidgetNode> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("886500dc", new Object[]{this});
        }
        DXDataSourceLruManager dXDataSourceLruManager = this.d;
        if (dXDataSourceLruManager != null) {
            return dXDataSourceLruManager.i();
        }
        return this.c;
    }

    public int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e642a55", new Object[]{this})).intValue();
        }
        DXDataSourceLruManager dXDataSourceLruManager = this.d;
        if (dXDataSourceLruManager != null) {
            return dXDataSourceLruManager.j();
        }
        List<Object> list = this.f31593a;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return this.f31593a.size();
    }

    public zt5 m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zt5) ipChange.ipc$dispatch("33bc2777", new Object[]{this, new Integer(i)});
        }
        List<Object> h = h();
        if (h == null || this.b == null || i < 0 || i > h.size() - 1) {
            return null;
        }
        if (((zt5) ((HashMap) this.b).get(Integer.valueOf(i))) == null) {
            ((HashMap) this.b).put(Integer.valueOf(i), new zt5());
        }
        return (zt5) ((HashMap) this.b).get(Integer.valueOf(i));
    }

    public int n(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4339b5ff", new Object[]{this, dXWidgetNode})).intValue();
        }
        DXDataSourceLruManager dXDataSourceLruManager = this.d;
        if (dXDataSourceLruManager != null) {
            return dXDataSourceLruManager.k(dXWidgetNode);
        }
        List<DXWidgetNode> list = this.c;
        if (list == null) {
            return -1;
        }
        return list.indexOf(dXWidgetNode);
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac331342", new Object[]{this})).booleanValue();
        }
        DXDataSourceLruManager dXDataSourceLruManager = this.d;
        if (dXDataSourceLruManager != null) {
            return dXDataSourceLruManager.l();
        }
        List<DXWidgetNode> list = this.c;
        if (list == null) {
            return true;
        }
        return list.isEmpty();
    }

    @Override // com.taobao.android.dinamicx.j.a
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            return;
        }
        DXDataSourceLruManager dXDataSourceLruManager = this.d;
        if (dXDataSourceLruManager != null) {
            dXDataSourceLruManager.d();
        }
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bfe11168", new Object[]{this})).booleanValue();
        }
        DXDataSourceLruManager dXDataSourceLruManager = this.d;
        if (dXDataSourceLruManager != null) {
            return dXDataSourceLruManager.m();
        }
        if (this.c == null) {
            return true;
        }
        return false;
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4f4ce6d", new Object[]{this});
        } else {
            DinamicXEngine.Y0(this);
        }
    }

    public DXWidgetNode r(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("468b3324", new Object[]{this, new Integer(i)});
        }
        DXDataSourceLruManager dXDataSourceLruManager = this.d;
        if (dXDataSourceLruManager != null) {
            return dXDataSourceLruManager.o(i);
        }
        List<DXWidgetNode> list = this.c;
        if (list == null) {
            return null;
        }
        return list.remove(i);
    }

    public void s(List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88534c5f", new Object[]{this, list});
            return;
        }
        if (h() != list) {
            this.b = new HashMap();
        }
        DXDataSourceLruManager dXDataSourceLruManager = this.d;
        if (dXDataSourceLruManager != null) {
            dXDataSourceLruManager.p(list);
        } else {
            this.f31593a = list;
        }
    }

    public void t(int i, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c60b4028", new Object[]{this, new Integer(i), dXWidgetNode});
            return;
        }
        DXDataSourceLruManager dXDataSourceLruManager = this.d;
        if (dXDataSourceLruManager != null) {
            dXDataSourceLruManager.q(i, dXWidgetNode);
            return;
        }
        List<DXWidgetNode> list = this.c;
        if (list != null) {
            list.set(i, dXWidgetNode);
        }
    }

    public void u(List<DXWidgetNode> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eed48870", new Object[]{this, list});
            return;
        }
        DXDataSourceLruManager dXDataSourceLruManager = this.d;
        if (dXDataSourceLruManager != null) {
            dXDataSourceLruManager.r(list);
        } else {
            this.c = list;
        }
    }

    public xt5(DXDataSourceLruManager dXDataSourceLruManager) {
        this.d = dXDataSourceLruManager;
        q();
    }
}
