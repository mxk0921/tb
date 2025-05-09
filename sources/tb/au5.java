package tb;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.recycler.manager.datasource.DXDataSourceLruManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class au5 extends xt5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<Object> e;
    public final List f = new JSONArray();
    public final Map<Integer, Integer> h = new HashMap();
    public final Map<Integer, List<Integer>> g = new HashMap();

    static {
        t2o.a(444597569);
    }

    public au5(DXDataSourceLruManager dXDataSourceLruManager) {
        super(dXDataSourceLruManager);
    }

    public static /* synthetic */ Object ipc$super(au5 au5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/recycler/manager/datasource/DXDataSourceOneDimManager");
    }

    @Override // tb.xt5
    public ArrayList<DXWidgetNode> g(DXAbsContainerBaseLayout dXAbsContainerBaseLayout, List<Object> list, List<DXWidgetNode> list2, int i, int i2, oz8 oz8Var) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("95b8f9be", new Object[]{this, dXAbsContainerBaseLayout, list, list2, new Integer(i), new Integer(i2), oz8Var});
        }
        this.e = list;
        ArrayList<DXWidgetNode> arrayList = new ArrayList<>();
        if (list2 != null && !list2.isEmpty() && list != null && !list.isEmpty()) {
            int i4 = i;
            while (i4 < i2) {
                Object obj = list.get(i4);
                int size = this.f.size();
                List<bi6> list3 = null;
                int i5 = 0;
                while (true) {
                    if (i5 >= list2.size()) {
                        i3 = i4;
                        break;
                    }
                    i3 = i4;
                    list3 = v(dXAbsContainerBaseLayout, list2.get(i5), obj, list, i4, size, oz8Var);
                    if (list3 != null) {
                        break;
                    }
                    i5++;
                    i4 = i3;
                }
                if (list3 == null || list3.size() == 0) {
                    s96 s96Var = new s96();
                    s96Var.setDXRuntimeContext(dXAbsContainerBaseLayout.getDXRuntimeContext().b(s96Var));
                    s96Var.setVisibility(2);
                    arrayList.add(s96Var);
                    this.f.add(list);
                } else {
                    arrayList.addAll(list3);
                }
                i4 = i3 + 1;
            }
        }
        return arrayList;
    }

    public List<bi6> v(DXAbsContainerBaseLayout dXAbsContainerBaseLayout, DXWidgetNode dXWidgetNode, Object obj, List<Object> list, int i, int i2, oz8 oz8Var) {
        bi6 d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a53a3e5e", new Object[]{this, dXAbsContainerBaseLayout, dXWidgetNode, obj, list, new Integer(i), new Integer(i2), oz8Var});
        }
        if (dXWidgetNode instanceof zb6) {
            DXRuntimeContext b = dXWidgetNode.getDXRuntimeContext().b(dXWidgetNode);
            b.q0(obj);
            b.r0(i);
            HashMap hashMap = new HashMap();
            b.j0(hashMap);
            hashMap.put(bmv.MSGTYPE_INTERVAL, mw5.K(i));
            if (list instanceof JSONArray) {
                hashMap.put(c4o.KEY_DATA_SOURCE, mw5.F((JSONArray) list));
            } else if (b.j() != null && (list instanceof Object)) {
                hashMap.put(c4o.KEY_DATA_SOURCE, mw5.L(list));
            }
            if (!z96.a(dXWidgetNode, b) || dXWidgetNode.getChildrenCount() <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int i3 = i2;
            for (DXWidgetNode dXWidgetNode2 : dXWidgetNode.getChildren()) {
                if ((dXWidgetNode2 instanceof bi6) && (d = d(dXAbsContainerBaseLayout, dXWidgetNode2, obj, list, i3, oz8Var, true)) != null) {
                    this.f.add(obj);
                    w(i, i3);
                    i3++;
                    arrayList.add(d);
                }
            }
            return arrayList;
        }
        return null;
    }

    public final void w(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf8167ea", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        List list = (List) ((HashMap) this.g).get(Integer.valueOf(i));
        if (list == null) {
            list = new ArrayList();
            ((HashMap) this.g).put(Integer.valueOf(i), list);
        }
        if (list.indexOf(Integer.valueOf(i2)) == -1) {
            list.add(Integer.valueOf(i2));
        }
        ((HashMap) this.h).put(Integer.valueOf(i2), Integer.valueOf(i));
    }
}
