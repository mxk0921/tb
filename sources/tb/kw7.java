package tb;

import android.text.TextUtils;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.vfw.adapter.RecyclerViewAdapter;
import com.alibaba.android.ultron.vfw.viewholder.BundleLineComponent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.ptr.views.recycler.accessories.FixedViewAdapter;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class kw7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(478151163);
    }

    public static boolean A(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cdb90b8f", new Object[]{iDMComponent})).booleanValue();
        }
        return cb4.U(iDMComponent);
    }

    public static boolean B(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a4797e4", new Object[]{iDMComponent})).booleanValue();
        }
        return cb4.V(iDMComponent);
    }

    public static boolean a(IDMComponent iDMComponent, IDMComponent iDMComponent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("280f026b", new Object[]{iDMComponent, iDMComponent2})).booleanValue();
        }
        if (iDMComponent == iDMComponent2) {
            return true;
        }
        if (iDMComponent == null || iDMComponent2 == null || iDMComponent.getKey() == null || !iDMComponent.getKey().equals(iDMComponent2.getKey())) {
            return false;
        }
        return true;
    }

    public static int b(List<IDMComponent> list, IDMComponent iDMComponent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68293fb5", new Object[]{list, iDMComponent, new Integer(i)})).intValue();
        }
        List<IDMComponent> g = g(iDMComponent);
        int i2 = -1;
        if (g != null) {
            while (true) {
                i++;
                if (i >= list.size()) {
                    break;
                }
                IDMComponent iDMComponent2 = list.get(i);
                if (o(g, iDMComponent, iDMComponent2) && x(iDMComponent2)) {
                    i2 = i;
                }
            }
        }
        return i2;
    }

    public static Pair<Integer, Integer> c(List<IDMComponent> list, IDMComponent iDMComponent, int i) {
        int i2;
        int i3 = -1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("4ce74af8", new Object[]{list, iDMComponent, new Integer(i)});
        }
        List<IDMComponent> n = n(iDMComponent);
        if (n != null) {
            int i4 = -1;
            for (int i5 = i - 1; i5 >= 0; i5--) {
                IDMComponent iDMComponent2 = list.get(i5);
                if (n.contains(iDMComponent2) && x(iDMComponent2)) {
                    i4 = i5;
                }
            }
            while (true) {
                i++;
                if (i >= list.size()) {
                    break;
                }
                IDMComponent iDMComponent3 = list.get(i);
                if (n.contains(iDMComponent3) && x(iDMComponent3)) {
                    i3 = i;
                }
            }
            i2 = i3;
            i3 = i4;
        } else {
            i2 = -1;
        }
        return new Pair<>(Integer.valueOf(i3), Integer.valueOf(i2));
    }

    public static IDMComponent d(List<IDMComponent> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("135580b2", new Object[]{list, new Integer(i)});
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            IDMComponent iDMComponent = list.get(i2);
            if (iDMComponent != null && (x(iDMComponent) || q(iDMComponent))) {
                return iDMComponent;
            }
        }
        return null;
    }

    public static void e(RecyclerView recyclerView, IDMComponent iDMComponent, IDMComponent iDMComponent2, List<IDMComponent> list, List<IDMComponent> list2) {
        IDMComponent iDMComponent3;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1aeaac7", new Object[]{recyclerView, iDMComponent, iDMComponent2, list, list2});
            return;
        }
        List<IDMComponent> j = j(recyclerView);
        while (true) {
            if (i >= j.size() - 1) {
                iDMComponent3 = null;
                break;
            }
            int i2 = i + 1;
            IDMComponent iDMComponent4 = j.get(i2);
            if (r(j.get(i)) && r(iDMComponent4)) {
                iDMComponent3 = j.remove(i);
                recyclerView.getAdapter().notifyItemRemoved(i);
                break;
            }
            i = i2;
        }
        if (iDMComponent3 != null) {
            int p = p(j, iDMComponent);
            int size = p - list.size();
            int size2 = p + list2.size();
            int i3 = size - 1;
            if (i3 >= 0) {
                IDMComponent iDMComponent5 = j.get(i3);
                if (x(iDMComponent5) && !v(iDMComponent5, iDMComponent)) {
                    j.add(size, iDMComponent3);
                    recyclerView.getAdapter().notifyItemInserted(size);
                    return;
                }
            }
            int i4 = size2 + 1;
            if (i4 < j.size()) {
                IDMComponent iDMComponent6 = j.get(i4);
                if (x(iDMComponent6) && !v(iDMComponent6, iDMComponent2)) {
                    j.add(i4, iDMComponent3);
                    recyclerView.getAdapter().notifyItemInserted(i4);
                }
            }
        }
    }

    public static String f(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab577206", new Object[]{iDMComponent});
        }
        return cb4.p(iDMComponent);
    }

    public static List<IDMComponent> g(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6dd0c4ca", new Object[]{iDMComponent});
        }
        return cb4.q(iDMComponent);
    }

    public static String h(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("88b9d524", new Object[]{iDMComponent});
        }
        return cb4.r(iDMComponent);
    }

    public static List<IDMComponent> j(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("82e0ed7", new Object[]{recyclerView});
        }
        return ((RecyclerViewAdapter) ((FixedViewAdapter) recyclerView.getAdapter()).N()).getData();
    }

    public static int k(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("62140e9d", new Object[]{recyclerView, new Integer(i)})).intValue();
        }
        if (recyclerView.getAdapter() instanceof FixedViewAdapter) {
            return i - ((FixedViewAdapter) recyclerView.getAdapter()).P();
        }
        return i;
    }

    public static int l(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4a2871bd", new Object[]{recyclerView})).intValue();
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (!(adapter instanceof FixedViewAdapter)) {
            return 0;
        }
        FixedViewAdapter fixedViewAdapter = (FixedViewAdapter) adapter;
        return (fixedViewAdapter.getItemCount() - fixedViewAdapter.P()) - fixedViewAdapter.O();
    }

    public static String m(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c02e7b7", new Object[]{iDMComponent});
        }
        return iDMComponent.getFields().getString("originalBundleId");
    }

    public static List<IDMComponent> n(IDMComponent iDMComponent) {
        IDMComponent parent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("975966e8", new Object[]{iDMComponent});
        }
        if (iDMComponent == null || (parent = iDMComponent.getParent()) == null) {
            return null;
        }
        return parent.getChildren();
    }

    public static boolean o(List<IDMComponent> list, IDMComponent iDMComponent, IDMComponent iDMComponent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c58459c3", new Object[]{list, iDMComponent, iDMComponent2})).booleanValue();
        }
        return list.contains(iDMComponent2);
    }

    public static int p(List<IDMComponent> list, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cdf7ea6", new Object[]{list, iDMComponent})).intValue();
        }
        for (int i = 0; i < list.size(); i++) {
            if (a(iDMComponent, list.get(i))) {
                return i;
            }
        }
        return -1;
    }

    public static boolean q(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6aefb58", new Object[]{iDMComponent})).booleanValue();
        }
        return cb4.O(iDMComponent);
    }

    public static boolean r(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d8210d1", new Object[]{iDMComponent})).booleanValue();
        }
        return BundleLineComponent.COMPONENT_TAG.equals(iDMComponent.getTag());
    }

    public static boolean s(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0049556", new Object[]{iDMComponent})).booleanValue();
        }
        return cb4.R(iDMComponent);
    }

    public static boolean t(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5787234", new Object[]{iDMComponent})).booleanValue();
        }
        return cb4.Q(iDMComponent);
    }

    public static boolean u(List<IDMComponent> list, IDMComponent iDMComponent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fdaf957", new Object[]{list, iDMComponent, new Integer(i)})).booleanValue();
        }
        if (i != list.size() - 1 && !a(d(list, list.size() - 1), iDMComponent)) {
            return false;
        }
        return true;
    }

    public static boolean v(IDMComponent iDMComponent, IDMComponent iDMComponent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3966bb1", new Object[]{iDMComponent, iDMComponent2})).booleanValue();
        }
        if (f(iDMComponent) == null || !f(iDMComponent).equals(f(iDMComponent2))) {
            return false;
        }
        return true;
    }

    public static boolean w(IDMComponent iDMComponent, IDMComponent iDMComponent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4fc1c54", new Object[]{iDMComponent, iDMComponent2})).booleanValue();
        }
        if (iDMComponent == null || iDMComponent2 == null || iDMComponent.getParent() == null || iDMComponent2.getParent() == null || !s(iDMComponent2) || !s(iDMComponent2) || iDMComponent.getParent().getKey() == null || !iDMComponent.getParent().getKey().equals(iDMComponent2.getParent().getKey())) {
            return false;
        }
        return true;
    }

    public static boolean x(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c689474", new Object[]{iDMComponent})).booleanValue();
        }
        return "item".equals(iDMComponent.getTag());
    }

    public static boolean y(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9aa37937", new Object[]{iDMComponent})).booleanValue();
        }
        List<IDMComponent> g = g(iDMComponent);
        if (g == null || g.indexOf(iDMComponent) != g.size() - 1) {
            return false;
        }
        return true;
    }

    public static boolean z(IDMComponent iDMComponent, IDMComponent iDMComponent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4432d991", new Object[]{iDMComponent, iDMComponent2})).booleanValue();
        }
        if (iDMComponent == null || iDMComponent2 == null) {
            return false;
        }
        if (TextUtils.equals(f(iDMComponent), f(iDMComponent2))) {
            return true;
        }
        String m = m(iDMComponent);
        String m2 = m(iDMComponent2);
        if (m != null && m.equals(f(iDMComponent2))) {
            return true;
        }
        if (m2 == null || !m2.equals(f(iDMComponent))) {
            return false;
        }
        return true;
    }

    public static IDMComponent i(List<IDMComponent> list, int i, int i2) {
        IDMComponent iDMComponent;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("8367556a", new Object[]{list, new Integer(i), new Integer(i2)});
        }
        if (i2 > i && (i3 = i2 + 1) < list.size()) {
            iDMComponent = list.get(i3);
        } else if (i2 >= i || i2 - 1 < 0) {
            iDMComponent = null;
            i3 = -1;
        } else {
            iDMComponent = list.get(i3);
        }
        return (iDMComponent == null || iDMComponent.getData() == null || !"hidden".equals(iDMComponent.getData().getString("status"))) ? iDMComponent : i(list, i, i3);
    }
}
