package tb;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.view.DXRootNativeFrameLayout;
import com.taobao.android.dinamicx.widget.DXScrollerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class km6 implements dxb<iew, exb> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, List<Class<? extends DXWidgetNode>>> f22755a;

    static {
        t2o.a(444597105);
        t2o.a(444597087);
    }

    public km6(Map<String, List<Class<? extends DXWidgetNode>>> map) {
        this.f22755a = map;
    }

    public final void a(DXWidgetNode dXWidgetNode, List<exb> list, String str) {
        ArrayList<DXWidgetNode> _getItemWidgetNodes;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d965fa4", new Object[]{this, dXWidgetNode, list, str});
        } else if (zg5.v3() && (dXWidgetNode instanceof DXScrollerLayout) && (_getItemWidgetNodes = ((DXScrollerLayout) dXWidgetNode)._getItemWidgetNodes()) != null) {
            Iterator<DXWidgetNode> it = _getItemWidgetNodes.iterator();
            while (it.hasNext()) {
                list.addAll(c(it.next(), str));
            }
        }
    }

    public final View b(View view, Class<?>[] clsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4e488b75", new Object[]{this, view, clsArr});
        }
        for (Class<?> cls : clsArr) {
            if (cls.isInstance(view)) {
                return view;
            }
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View b = b(viewGroup.getChildAt(i), clsArr);
            if (b != null) {
                return b;
            }
        }
        return null;
    }

    public final List<exb> c(DXWidgetNode dXWidgetNode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7917e912", new Object[]{this, dXWidgetNode, str});
        }
        ArrayList arrayList = new ArrayList();
        if (i(dXWidgetNode, str)) {
            if (!zg5.c5(dXWidgetNode.getDXRuntimeContext().c()) || !dXWidgetNode.isFlatten()) {
                arrayList.add((exb) dXWidgetNode);
            } else {
                DXWidgetNode referenceNode = dXWidgetNode.getReferenceNode();
                if (referenceNode != null) {
                    arrayList.add((exb) referenceNode);
                }
            }
        }
        List<DXWidgetNode> children = dXWidgetNode.getChildren();
        if (children == null || children.size() == 0) {
            a(dXWidgetNode, arrayList, str);
        } else {
            for (DXWidgetNode dXWidgetNode2 : children) {
                arrayList.addAll(c(dXWidgetNode2, str));
            }
        }
        return arrayList;
    }

    public final List<exb> d(ex5 ex5Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("98fb905e", new Object[]{this, ex5Var, str});
        }
        DXWidgetNode B = ex5Var.B();
        ArrayList arrayList = new ArrayList();
        if (i(B, str)) {
            arrayList.add((exb) B);
        }
        List<ex5> i = ex5Var.i();
        if (i == null || i.size() == 0) {
            a(B, arrayList, str);
        } else {
            for (ex5 ex5Var2 : i) {
                arrayList.addAll(d(ex5Var2, str));
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public List<exb> e(iew iewVar, String str) {
        View b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5c25207b", new Object[]{this, iewVar, str});
        }
        View c = iewVar.c();
        if (c == null || (b = b(c, new Class[]{DXRootView.class, DXRootNativeFrameLayout.class})) == null) {
            return null;
        }
        if (eb5.w()) {
            return g(b, str);
        }
        DXWidgetNode h = h(b);
        if (h == null) {
            return null;
        }
        return c(h, str);
    }

    public List<exb> g(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("226b2c21", new Object[]{this, view, str});
        }
        ex5 a2 = kl6.a(view);
        if (a2 == null) {
            return null;
        }
        return d(a2, str);
    }

    public final DXWidgetNode h(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("d8349ab6", new Object[]{this, view});
        }
        if (view instanceof DXRootView) {
            return ((DXRootView) view).getFlattenWidgetNode();
        }
        DXWidgetNode b = kl6.b(view);
        if (b instanceof DXWidgetNode) {
            return b;
        }
        return null;
    }

    public final boolean i(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb682425", new Object[]{this, obj, str})).booleanValue();
        }
        List<Class<? extends DXWidgetNode>> list = this.f22755a.get(str);
        if (!(obj instanceof exb) || list == null) {
            return false;
        }
        for (Class<? extends DXWidgetNode> cls : list) {
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    public Collection<String> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("325f3b19", new Object[]{this});
        }
        return this.f22755a.keySet();
    }
}
