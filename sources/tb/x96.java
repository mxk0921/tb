package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class x96 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DELIMITER = " .[]";
    public static final String ITEM_DATA = "item_data";
    public static final String OPERATOR_ACTION_MERGE = "merge";
    public static final String OPERATOR_ACTION_MODIFY = "modify";
    public static final String OPERATOR_ACTION_REMOVE = "remove";
    public static final String PATH_ACTIONS = "actions";
    public static final String PATH_KEY = "key";
    public static final String PATH_OPERATOR = "operator";
    public static final String PATH_VALUE = "value";
    public static final String REFRESH_TYPE = "refreshType";
    public static final String REFRESH_TYPE_ALL = "all";
    public static final String REFRESH_TYPE_PART = "part";
    public static final String REFRESH_TYPE_RANGE = "range";

    static {
        t2o.a(444597572);
    }

    public abstract boolean a(DXRecyclerLayout dXRecyclerLayout, JSONObject jSONObject, oz8 oz8Var);

    public abstract boolean b(DXRecyclerLayout dXRecyclerLayout, JSONObject jSONObject);

    public DXWidgetNode c(DXRecyclerLayout dXRecyclerLayout, Object obj, List<DXWidgetNode> list, int i, oz8 oz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("a2f63e82", new Object[]{this, dXRecyclerLayout, obj, list, new Integer(i), oz8Var});
        }
        return dXRecyclerLayout.T(obj, list, i, oz8Var);
    }

    public ArrayList<DXWidgetNode> d(DXRecyclerLayout dXRecyclerLayout, List<Object> list, List<DXWidgetNode> list2, int i, int i2, oz8 oz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("a5ac4aff", new Object[]{this, dXRecyclerLayout, list, list2, new Integer(i), new Integer(i2), oz8Var});
        }
        return dXRecyclerLayout.w(list, list2, i, i2, oz8Var);
    }

    public List<Object> e(DXRecyclerLayout dXRecyclerLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d1c81b3d", new Object[]{this, dXRecyclerLayout});
        }
        return dXRecyclerLayout.x();
    }

    public xt5 f(DXRecyclerLayout dXRecyclerLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xt5) ipChange.ipc$dispatch("d297741f", new Object[]{this, dXRecyclerLayout});
        }
        return dXRecyclerLayout.b0();
    }

    public ArrayList<DXWidgetNode> g(DXRecyclerLayout dXRecyclerLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("c979e1ae", new Object[]{this, dXRecyclerLayout});
        }
        return dXRecyclerLayout.g0();
    }

    public bi6 h(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bi6) ipChange.ipc$dispatch("d08558d", new Object[]{this, dXWidgetNode});
        }
        return z96.b(dXWidgetNode);
    }

    public abstract boolean i(DXRecyclerLayout dXRecyclerLayout, JSONObject jSONObject, oz8 oz8Var);

    public abstract boolean j(DXRecyclerLayout dXRecyclerLayout, JSONObject jSONObject, oz8 oz8Var);

    public void k(DXRecyclerLayout dXRecyclerLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ee37b4a", new Object[]{this, dXRecyclerLayout});
        } else {
            dXRecyclerLayout.T0(false, "all", -1, 0, null, true);
        }
    }

    public void l(DXRecyclerLayout dXRecyclerLayout, String str, int i, int i2, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("300a43d6", new Object[]{this, dXRecyclerLayout, str, new Integer(i), new Integer(i2), str2, new Boolean(z)});
        } else {
            dXRecyclerLayout.T0(false, str, i, i2, str2, z);
        }
    }

    public void m(DXRecyclerLayout dXRecyclerLayout, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a322025", new Object[]{this, dXRecyclerLayout, new Integer(i), str});
        } else {
            dXRecyclerLayout.j1(i, str);
        }
    }

    public boolean n(DXRecyclerLayout dXRecyclerLayout, JSONObject jSONObject, oz8 oz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0825901", new Object[]{this, dXRecyclerLayout, jSONObject, oz8Var})).booleanValue();
        }
        return false;
    }

    public abstract boolean o(DXRecyclerLayout dXRecyclerLayout, JSONObject jSONObject, boolean z, oz8 oz8Var);

    public void p(DXRecyclerLayout dXRecyclerLayout, Object obj, x9n x9nVar, int i, oz8 oz8Var) {
        DXWidgetNode i2;
        int i3 = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f985de", new Object[]{this, dXRecyclerLayout, obj, x9nVar, new Integer(i), oz8Var});
        } else if (!zg5.r5()) {
            dXRecyclerLayout.s1(obj, i, oz8Var);
        } else {
            List<Object> x = dXRecyclerLayout.x();
            if (x != null && i >= 0 && i < x.size()) {
                x.set(i, obj);
            }
            xt5 f = f(dXRecyclerLayout);
            if (f == null || f.p() || i < 0 || i >= f.l()) {
                return;
            }
            if (x9nVar == null || x9nVar.b() == 0) {
                DXWidgetNode c = c(dXRecyclerLayout, obj, dXRecyclerLayout.g0(), i, oz8Var);
                if (c != null) {
                    f.t(i, c);
                }
            } else if ((x9nVar.b() == 1 || x9nVar.b() == 2) && (i2 = f.i(i)) != null) {
                DXWidgetRefreshOption.a g = new DXWidgetRefreshOption.a().d(true).g(true);
                if (x9nVar.b() == 1) {
                    i3 = 1;
                }
                DXWidgetRefreshOption a2 = g.c(i3).a();
                if (x9nVar.c() == 0) {
                    i2.setNeedParse(a2);
                } else if (x9nVar.c() == 1) {
                    i2.setNeedLayout(a2);
                }
            }
        }
    }

    public abstract boolean q(DXRecyclerLayout dXRecyclerLayout, JSONObject jSONObject);
}
