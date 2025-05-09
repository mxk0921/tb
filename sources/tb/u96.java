package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class u96 extends x96 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597571);
    }

    public static /* synthetic */ Object ipc$super(u96 u96Var, String str, Object... objArr) {
        if (str.hashCode() == -1515435265) {
            return super.d((DXRecyclerLayout) objArr[0], (List) objArr[1], (List) objArr[2], ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), (oz8) objArr[5]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/recycler/manager/operator/DXRecyclerJsOperator");
    }

    @Override // tb.x96
    public boolean a(DXRecyclerLayout dXRecyclerLayout, JSONObject jSONObject, oz8 oz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("521d60af", new Object[]{this, dXRecyclerLayout, jSONObject, oz8Var})).booleanValue();
        }
        return false;
    }

    @Override // tb.x96
    public boolean b(DXRecyclerLayout dXRecyclerLayout, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2a4ce64", new Object[]{this, dXRecyclerLayout, jSONObject})).booleanValue();
        }
        return false;
    }

    @Override // tb.x96
    public ArrayList<DXWidgetNode> d(DXRecyclerLayout dXRecyclerLayout, List<Object> list, List<DXWidgetNode> list2, int i, int i2, oz8 oz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("a5ac4aff", new Object[]{this, dXRecyclerLayout, list, list2, new Integer(i), new Integer(i2), oz8Var});
        }
        return super.d(dXRecyclerLayout, list, list2, i, i2, oz8Var);
    }

    @Override // tb.x96
    public boolean i(DXRecyclerLayout dXRecyclerLayout, JSONObject jSONObject, oz8 oz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("218ad0f0", new Object[]{this, dXRecyclerLayout, jSONObject, oz8Var})).booleanValue();
        }
        return false;
    }

    @Override // tb.x96
    public boolean j(DXRecyclerLayout dXRecyclerLayout, JSONObject jSONObject, oz8 oz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2d3a2da", new Object[]{this, dXRecyclerLayout, jSONObject, oz8Var})).booleanValue();
        }
        return false;
    }

    @Override // tb.x96
    public boolean o(DXRecyclerLayout dXRecyclerLayout, JSONObject jSONObject, boolean z, oz8 oz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dcfea397", new Object[]{this, dXRecyclerLayout, jSONObject, new Boolean(z), oz8Var})).booleanValue();
        }
        return false;
    }

    @Override // tb.x96
    public boolean q(DXRecyclerLayout dXRecyclerLayout, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7e22786", new Object[]{this, dXRecyclerLayout, jSONObject})).booleanValue();
        }
        return false;
    }

    public void r(DXRecyclerLayout dXRecyclerLayout, JSONArray jSONArray) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afafc17", new Object[]{this, dXRecyclerLayout, jSONArray});
        } else if (jSONArray != null && jSONArray.size() > 0) {
            Object obj = jSONArray.get(0);
            if (obj instanceof JSONArray) {
                if (e(dXRecyclerLayout) != null) {
                    i = e(dXRecyclerLayout).size();
                    e(dXRecyclerLayout).addAll((JSONArray) obj);
                }
                ArrayList<DXWidgetNode> d = d(dXRecyclerLayout, e(dXRecyclerLayout), g(dXRecyclerLayout), i, e(dXRecyclerLayout).size(), null);
                xt5 f = f(dXRecyclerLayout);
                if (d != null && !d.isEmpty() && f != null && !f.p()) {
                    f.a(i, d);
                    k(dXRecyclerLayout);
                }
            }
        }
    }

    public void s(DXRecyclerLayout dXRecyclerLayout, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b95a418", new Object[]{this, dXRecyclerLayout, jSONArray});
        } else if (jSONArray != null || jSONArray.size() > 0) {
            Object obj = jSONArray.get(0);
            xt5 f = f(dXRecyclerLayout);
            if (obj != null && f != null && !f.p()) {
                int l = f.l();
                if (jSONArray.size() > 1) {
                    try {
                        Integer integer = jSONArray.getInteger(1);
                        if (integer != null) {
                            if (integer.intValue() > f.l()) {
                                integer = Integer.valueOf(f.l());
                            } else if (integer.intValue() < 0) {
                                integer = 0;
                            }
                            l = integer.intValue();
                        }
                    } catch (Exception unused) {
                    }
                }
                if (jSONArray.size() > 2) {
                    try {
                        jSONArray.getBooleanValue(2);
                    } catch (Exception unused2) {
                    }
                }
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (l >= 0 && l <= f.l()) {
                        if (e(dXRecyclerLayout) != null && l >= 0 && l <= e(dXRecyclerLayout).size()) {
                            e(dXRecyclerLayout).add(l, jSONObject);
                        }
                        f.b(l, c(dXRecyclerLayout, jSONObject, g(dXRecyclerLayout), l, null));
                        k(dXRecyclerLayout);
                    }
                } else if ((obj instanceof JSONArray) && l >= 0 && l <= f.l()) {
                    if (e(dXRecyclerLayout) != null && l >= 0 && l <= e(dXRecyclerLayout).size()) {
                        e(dXRecyclerLayout).addAll(l, (JSONArray) obj);
                    }
                    ArrayList<DXWidgetNode> d = d(dXRecyclerLayout, e(dXRecyclerLayout), g(dXRecyclerLayout), l, l + ((JSONArray) obj).size(), null);
                    if (d != null && !d.isEmpty()) {
                        f.a(l, d);
                        k(dXRecyclerLayout);
                    }
                }
            }
        }
    }

    public final boolean t(DXRecyclerLayout dXRecyclerLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("709d69e6", new Object[]{this, dXRecyclerLayout, new Integer(i)})).booleanValue();
        }
        if (e(dXRecyclerLayout) != null && i >= 0 && i < e(dXRecyclerLayout).size()) {
            e(dXRecyclerLayout).remove(i);
        }
        xt5 f = f(dXRecyclerLayout);
        if (f == null || f.p() || i < 0 || i >= f.l()) {
            return false;
        }
        f.r(i);
        return true;
    }

    public void u(DXRecyclerLayout dXRecyclerLayout, JSONArray jSONArray) {
        Object obj;
        boolean z = true;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ebda6d", new Object[]{this, dXRecyclerLayout, jSONArray});
        } else if (jSONArray != null && jSONArray.size() >= 1 && (obj = jSONArray.get(0)) != null) {
            if (obj instanceof JSONArray) {
                Iterator<Object> it = ((JSONArray) obj).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next != null && (next instanceof Integer) && t(dXRecyclerLayout, ((Integer) next).intValue())) {
                        z2 = true;
                    }
                }
                z = z2;
            } else if (!(obj instanceof Integer) || !t(dXRecyclerLayout, ((Integer) obj).intValue())) {
                z = false;
            }
            if (z) {
                k(dXRecyclerLayout);
            }
        }
    }

    public void v(DXRecyclerLayout dXRecyclerLayout, JSONArray jSONArray) {
        Object obj;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d61e7408", new Object[]{this, dXRecyclerLayout, jSONArray});
        } else if (jSONArray != null && jSONArray.size() > 1 && (obj = jSONArray.get(0)) != null) {
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                int i2 = -1;
                try {
                    Integer integer = jSONArray.getInteger(1);
                    if (integer != null) {
                        i2 = integer.intValue();
                    }
                    i = i2;
                } catch (Exception unused) {
                    i = -1;
                }
                p(dXRecyclerLayout, jSONObject, x9n.a(null), i, null);
            } else if (obj instanceof JSONArray) {
                Object obj2 = jSONArray.get(2);
                if (obj2 instanceof JSONArray) {
                    for (int i3 = 0; i3 < ((JSONArray) obj2).size(); i3++) {
                        try {
                            p(dXRecyclerLayout, ((JSONArray) obj).getJSONObject(i3), x9n.a(null), ((JSONArray) obj2).getInteger(i3).intValue(), null);
                        } catch (Exception unused2) {
                        }
                    }
                }
            }
            k(dXRecyclerLayout);
        }
    }
}
