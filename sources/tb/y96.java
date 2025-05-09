package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;
import tb.h1p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class y96 extends x96 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597573);
    }

    public static /* synthetic */ Object ipc$super(y96 y96Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/recycler/manager/operator/DXRecyclerOperatorCommon");
    }

    @Override // tb.x96
    public boolean n(DXRecyclerLayout dXRecyclerLayout, JSONObject jSONObject, oz8 oz8Var) {
        JSONArray jSONArray;
        xt5 f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0825901", new Object[]{this, dXRecyclerLayout, jSONObject, oz8Var})).booleanValue();
        }
        try {
            jSONArray = jSONObject.getJSONArray("actions");
        } catch (Exception e) {
            e.printStackTrace();
            jSONArray = null;
        }
        if (jSONArray != null && !jSONArray.isEmpty() && (f = f(dXRecyclerLayout)) != null && !f.p() && !f.o()) {
            x9n a2 = x9n.a(jSONObject);
            boolean z = false;
            for (int i = 0; i < e(dXRecyclerLayout).size(); i++) {
                if (B(dXRecyclerLayout, jSONArray, a2, i, false, oz8Var)) {
                    z = true;
                }
            }
            if (!zg5.r5()) {
                if (z) {
                    k(dXRecyclerLayout);
                    return true;
                }
            } else if (a2.b() == 0 && z) {
                k(dXRecyclerLayout);
                return true;
            }
        }
        return false;
    }

    @Override // tb.x96
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

    public final List<Object> t(DXRuntimeContext dXRuntimeContext, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a4be2a6c", new Object[]{this, dXRuntimeContext, jSONObject});
        }
        try {
            return jSONObject.getJSONArray("data");
        } catch (Exception e) {
            e.printStackTrace();
            if (dXRuntimeContext != null) {
                try {
                    if (dXRuntimeContext.w0()) {
                        return (List) jSONObject.get("data");
                    }
                } catch (Exception e2) {
                    xv5.b(e2);
                }
            }
            return null;
        }
    }

    public final int u(DXRecyclerLayout dXRecyclerLayout, boolean z, int i, int i2, Object obj) {
        xt5 f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("db6f96fc", new Object[]{this, dXRecyclerLayout, new Boolean(z), new Integer(i), new Integer(i2), obj})).intValue();
        }
        if (!z) {
            return i2;
        }
        if (i > 0) {
            return i2 + i;
        }
        if (!(obj instanceof DXWidgetNode) || (f = f(dXRecyclerLayout)) == null) {
            return -1;
        }
        return f.n(h((DXWidgetNode) obj)) + i2;
    }

    public final boolean w(DXRecyclerLayout dXRecyclerLayout, List<Object> list, DXWidgetNode dXWidgetNode, int i, boolean z, boolean z2, oz8 oz8Var) {
        xt5 f;
        int i2;
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad2c4807", new Object[]{this, dXRecyclerLayout, list, dXWidgetNode, new Integer(i), new Boolean(z), new Boolean(z2), oz8Var})).booleanValue();
        }
        if (list == null || dXWidgetNode == null || (f = f(dXRecyclerLayout)) == null) {
            return false;
        }
        bi6 h = h(dXWidgetNode);
        if (h != null) {
            i2 = f.n(h);
        } else {
            i2 = -1;
        }
        int i5 = 0;
        while (i5 < list.size()) {
            Object obj = list.get(i5);
            if (obj == null) {
                i4 = i5;
                i3 = i2;
            } else {
                int i6 = i + i5;
                if (z) {
                    if (z2) {
                        if (i2 == -1) {
                            return false;
                        }
                        i6 = i2 + i + i5;
                    } else if (h == null) {
                        return false;
                    } else {
                        i6 = f.n(h) + i;
                    }
                }
                if (e(dXRecyclerLayout) != null && i6 >= 0 && i6 < e(dXRecyclerLayout).size()) {
                    e(dXRecyclerLayout).add(i6, obj);
                }
                i4 = i5;
                i3 = i2;
                DXWidgetNode c = c(dXRecyclerLayout, obj, g(dXRecyclerLayout), i6, oz8Var);
                if (i6 >= 0 && i6 < f.l()) {
                    f.b(i6, c);
                }
            }
            i5 = i4 + 1;
            i2 = i3;
        }
        k(dXRecyclerLayout);
        return true;
    }

    public final void y(String str, Queue<String> queue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20013ae5", new Object[]{this, str, queue});
            return;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, " .[]", false);
        while (stringTokenizer.hasMoreTokens()) {
            queue.offer(stringTokenizer.nextToken());
        }
    }

    public final void z(String str, DXRecyclerLayout dXRecyclerLayout, int i, x9n x9nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6aca81", new Object[]{this, str, dXRecyclerLayout, new Integer(i), x9nVar});
        } else if (x(str)) {
            if (!zg5.r5()) {
                if ("part".equals(str)) {
                    l(dXRecyclerLayout, "part", i, 1, DXRecyclerLayout.MSG_METHOD_UPDATE_ITEMS, false);
                }
            } else if (x9nVar.b() == 0 && "part".equals(str)) {
                l(dXRecyclerLayout, "part", i, 1, DXRecyclerLayout.MSG_METHOD_UPDATE_ITEMS, false);
            }
        }
    }

    @Override // tb.x96
    public boolean b(DXRecyclerLayout dXRecyclerLayout, JSONObject jSONObject) {
        xt5 f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2a4ce64", new Object[]{this, dXRecyclerLayout, jSONObject})).booleanValue();
        }
        List<Object> t = t(dXRecyclerLayout.getDXRuntimeContext(), jSONObject);
        if (t == null || t.isEmpty() || (f = f(dXRecyclerLayout)) == null || f.p() || f.o()) {
            return false;
        }
        return s(dXRecyclerLayout, t, jSONObject.get("current"), jSONObject.getString(x96.REFRESH_TYPE));
    }

    @Override // tb.x96
    public boolean i(DXRecyclerLayout dXRecyclerLayout, JSONObject jSONObject, oz8 oz8Var) {
        xt5 f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("218ad0f0", new Object[]{this, dXRecyclerLayout, jSONObject, oz8Var})).booleanValue();
        }
        List<Object> t = t(dXRecyclerLayout.getDXRuntimeContext(), jSONObject);
        if (t == null || t.isEmpty() || (f = f(dXRecyclerLayout)) == null || f.p()) {
            return false;
        }
        return v(dXRecyclerLayout, t, jSONObject.get("current"), oz8Var, (String) srf.b(x96.REFRESH_TYPE, jSONObject, "all"), jSONObject.getIntValue(h1p.a.PARAM_KEY_LIST_START_INDEX), jSONObject.getIntValue("count"));
    }

    @Override // tb.x96
    public boolean j(DXRecyclerLayout dXRecyclerLayout, JSONObject jSONObject, oz8 oz8Var) {
        List<Object> t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2d3a2da", new Object[]{this, dXRecyclerLayout, jSONObject, oz8Var})).booleanValue();
        }
        xt5 f = f(dXRecyclerLayout);
        if (f == null || f.p() || f.o() || (t = t(dXRecyclerLayout.getDXRuntimeContext(), jSONObject)) == null || t.isEmpty()) {
            return false;
        }
        int e = srf.e("offset", jSONObject, -1);
        Boolean bool = Boolean.FALSE;
        return w(dXRecyclerLayout, t, (DXWidgetNode) srf.b("current", jSONObject, null), e, srf.c("isRelative", jSONObject, bool).booleanValue(), srf.c("isRelativeOrder", jSONObject, bool).booleanValue(), oz8Var);
    }

    public boolean A(DXRecyclerLayout dXRecyclerLayout, DXWidgetNode dXWidgetNode, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de4ec7c2", new Object[]{this, dXRecyclerLayout, dXWidgetNode, obj, new Boolean(z)})).booleanValue();
        }
        bi6 h = h(dXWidgetNode);
        xt5 f = f(dXRecyclerLayout);
        if (h == null || f == null) {
            return false;
        }
        int n = f.n(h);
        if (n < 0) {
            m(dXRecyclerLayout, f.DX_ERROR_CODE_RECYCLER_LAYOUT_230005, "index: " + n);
            return false;
        }
        la6.e(" updateCurrent 获取到的index 为" + n);
        p(dXRecyclerLayout, obj, x9n.a(null), n, null);
        if (!z) {
            if (zg5.B4()) {
                l(dXRecyclerLayout, "part", n, 1, DXRecyclerLayout.MSG_METHOD_UPDATE_CURRENT, false);
            } else {
                l(dXRecyclerLayout, "part", n, 1, DXRecyclerLayout.MSG_METHOD_UPDATE_CURRENT, true);
            }
        }
        return true;
    }

    @Override // tb.x96
    public boolean a(DXRecyclerLayout dXRecyclerLayout, JSONObject jSONObject, oz8 oz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("521d60af", new Object[]{this, dXRecyclerLayout, jSONObject, oz8Var})).booleanValue();
        }
        List<Object> t = t(dXRecyclerLayout.getDXRuntimeContext(), jSONObject);
        if (t == null || t.isEmpty()) {
            return false;
        }
        r(dXRecyclerLayout, t, g(dXRecyclerLayout), oz8Var, jSONObject.getString(x96.REFRESH_TYPE));
        return true;
    }

    public final boolean x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("479ea38e", new Object[]{this, str})).booleanValue();
        }
        return zg5.T4() && "part".equals(str);
    }

    public void r(DXRecyclerLayout dXRecyclerLayout, List<Object> list, List<DXWidgetNode> list2, oz8 oz8Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bc0d895", new Object[]{this, dXRecyclerLayout, list, list2, oz8Var, str});
            return;
        }
        int i = -1;
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            Object obj = list.get(i3);
            if (obj instanceof JSONObject) {
                xt5 f = f(dXRecyclerLayout);
                if (f != null && !f.p()) {
                    if (e(dXRecyclerLayout) != null) {
                        if (i < 0) {
                            i = e(dXRecyclerLayout).size();
                        }
                        e(dXRecyclerLayout).add(obj);
                        i2++;
                    }
                    int i4 = i + i3;
                    f.b(i4, c(dXRecyclerLayout, obj, list2, i4, oz8Var));
                }
            } else {
                h36.g("DXRecyclerOperatorCommon", "no setData for append!!!");
            }
        }
        if (i >= 0 && i2 > 0) {
            if (zg5.B4()) {
                l(dXRecyclerLayout, "part", i, i2, DXRecyclerLayout.MSG_METHOD_APPEND_ITEMS, false);
            } else {
                l(dXRecyclerLayout, "part", i, i2, DXRecyclerLayout.MSG_METHOD_APPEND_ITEMS, true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    @Override // tb.x96
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean q(com.taobao.android.dinamicx.widget.DXRecyclerLayout r21, com.alibaba.fastjson.JSONObject r22) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.y96.q(com.taobao.android.dinamicx.widget.DXRecyclerLayout, com.alibaba.fastjson.JSONObject):boolean");
    }

    @Override // tb.x96
    public boolean o(DXRecyclerLayout dXRecyclerLayout, JSONObject jSONObject, boolean z, oz8 oz8Var) {
        JSONArray jSONArray;
        Object obj;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dcfea397", new Object[]{this, dXRecyclerLayout, jSONObject, new Boolean(z), oz8Var})).booleanValue();
        }
        Object obj2 = jSONObject.get("current");
        if (obj2 == null) {
            return false;
        }
        try {
            jSONArray = jSONObject.getJSONArray("actions");
        } catch (Exception e) {
            e.printStackTrace();
            jSONArray = null;
        }
        if (dXRecyclerLayout.getDXRuntimeContext().j() != null) {
            obj = jSONObject.get("item_data");
        } else {
            obj = jSONObject.getJSONObject("item_data");
        }
        if (jSONArray == null || jSONArray.isEmpty()) {
            if (obj != null && (obj2 instanceof DXWidgetNode)) {
                return A(dXRecyclerLayout, (DXWidgetNode) obj2, obj, false);
            }
        } else if (obj2 instanceof DXWidgetNode) {
            bi6 h = h((DXWidgetNode) obj2);
            xt5 f = f(dXRecyclerLayout);
            if (h == null || f == null) {
                return false;
            }
            int n = f.n(h);
            x9n a2 = x9n.a(jSONObject);
            boolean B = B(dXRecyclerLayout, jSONArray, a2, n, z, oz8Var);
            if (z) {
                return B;
            }
            if ((!zg5.r5() || (a2 != null && a2.b() == 0)) && B) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                if (jSONObject2 != null) {
                    z2 = jSONObject2.getBooleanValue("refreshPart");
                }
                if (!z2) {
                    k(dXRecyclerLayout);
                } else if (zg5.B4()) {
                    l(dXRecyclerLayout, "part", n, 1, DXRecyclerLayout.MSG_METHOD_UPDATE_CURRENT, false);
                } else {
                    l(dXRecyclerLayout, "part", n, 1, DXRecyclerLayout.MSG_METHOD_UPDATE_CURRENT, true);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean B(DXRecyclerLayout dXRecyclerLayout, JSONArray jSONArray, x9n x9nVar, int i, boolean z, oz8 oz8Var) {
        char c;
        char c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ab051d8", new Object[]{this, dXRecyclerLayout, jSONArray, x9nVar, new Integer(i), new Boolean(z), oz8Var})).booleanValue();
        }
        if (i < 0 || i >= e(dXRecyclerLayout).size()) {
            m(dXRecyclerLayout, f.DX_ERROR_CODE_RECYCLER_LAYOUT_230004, "index: " + i + " dataSource.size() " + e(dXRecyclerLayout).size());
            return false;
        }
        xt5 f = f(dXRecyclerLayout);
        if (f == null || f.p() || f.o()) {
            return false;
        }
        Object obj = e(dXRecyclerLayout).get(i);
        if (dXRecyclerLayout.getDXRuntimeContext().j() == null || !bu5.b(obj)) {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (!(next instanceof JSONObject)) {
                    return false;
                }
                JSONObject jSONObject = (JSONObject) next;
                String string = jSONObject.getString(x96.PATH_OPERATOR);
                if (TextUtils.isEmpty(string)) {
                    return false;
                }
                String string2 = jSONObject.getString("key");
                if (TextUtils.isEmpty(string2)) {
                    return false;
                }
                Object obj2 = jSONObject.get("value");
                ArrayDeque arrayDeque = new ArrayDeque();
                y(string2, arrayDeque);
                Object obj3 = obj;
                while (!arrayDeque.isEmpty()) {
                    String str = (String) arrayDeque.poll();
                    if (!arrayDeque.isEmpty()) {
                        arrayDeque = arrayDeque;
                        obj2 = obj2;
                        string = string;
                        obj = obj;
                        if (obj3 instanceof JSONObject) {
                            obj3 = ((JSONObject) obj3).get(str);
                        } else {
                            if (obj3 instanceof JSONArray) {
                                JSONArray jSONArray2 = (JSONArray) obj3;
                                if (TextUtils.isDigitsOnly(str)) {
                                    obj3 = jSONArray2.get(Integer.parseInt(str));
                                }
                            }
                            return false;
                        }
                    } else if (obj3 instanceof JSONObject) {
                        string.hashCode();
                        switch (string.hashCode()) {
                            case -1068795718:
                                if (string.equals("modify")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -934610812:
                                if (string.equals("remove")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 103785528:
                                if (string.equals("merge")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                                obj3 = obj3;
                                arrayDeque = arrayDeque;
                                obj2 = obj2;
                                string = string;
                                obj = obj;
                                ((JSONObject) obj3).put(str, obj2);
                                if (!zg5.l5() && !z) {
                                    p(dXRecyclerLayout, (JSONObject) obj, x9nVar, i, oz8Var);
                                    break;
                                }
                                break;
                            case 1:
                                obj3 = obj3;
                                arrayDeque = arrayDeque;
                                obj2 = obj2;
                                string = string;
                                obj = obj;
                                ((JSONObject) obj3).remove(str);
                                if (!zg5.l5() && !z) {
                                    p(dXRecyclerLayout, (JSONObject) obj, x9nVar, i, oz8Var);
                                    break;
                                }
                                break;
                            case 2:
                                Object obj4 = ((JSONObject) obj3).get(str);
                                if ((obj4 instanceof JSONObject) && (obj2 instanceof JSONObject)) {
                                    ((JSONObject) obj4).putAll((JSONObject) obj2);
                                    if (!zg5.l5() && !z) {
                                        obj3 = obj3;
                                        arrayDeque = arrayDeque;
                                        obj2 = obj2;
                                        string = string;
                                        obj = obj;
                                        p(dXRecyclerLayout, (JSONObject) obj, x9nVar, i, oz8Var);
                                        break;
                                    } else {
                                        obj3 = obj3;
                                        arrayDeque = arrayDeque;
                                        obj2 = obj2;
                                        string = string;
                                        obj = obj;
                                        break;
                                    }
                                } else {
                                    return false;
                                }
                                break;
                            default:
                                return false;
                        }
                    } else {
                        obj3 = obj3;
                        arrayDeque = arrayDeque;
                        obj2 = obj2;
                        obj = obj;
                        if (obj3 instanceof JSONArray) {
                            try {
                                int parseInt = Integer.parseInt(str);
                                string.hashCode();
                                switch (string.hashCode()) {
                                    case -1068795718:
                                        if (string.equals("modify")) {
                                            c = 0;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -934610812:
                                        if (string.equals("remove")) {
                                            c = 1;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 103785528:
                                        if (string.equals("merge")) {
                                            c = 2;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    default:
                                        c = 65535;
                                        break;
                                }
                                switch (c) {
                                    case 0:
                                        string = string;
                                        ((JSONArray) obj3).set(parseInt, obj2);
                                        if (!zg5.l5() && (obj instanceof JSONObject)) {
                                            p(dXRecyclerLayout, (JSONObject) obj, x9nVar, i, oz8Var);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        string = string;
                                        ((JSONArray) obj3).remove(parseInt);
                                        if (!zg5.l5() && (obj instanceof JSONObject)) {
                                            p(dXRecyclerLayout, (JSONObject) obj, x9nVar, i, oz8Var);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        Object obj5 = ((JSONArray) obj3).get(parseInt);
                                        if ((obj5 instanceof JSONObject) && (obj2 instanceof JSONObject)) {
                                            ((JSONObject) obj5).putAll((JSONObject) obj2);
                                            if (!zg5.l5() && (obj instanceof JSONObject)) {
                                                string = string;
                                                p(dXRecyclerLayout, (JSONObject) obj, x9nVar, i, oz8Var);
                                                break;
                                            } else {
                                                string = string;
                                                break;
                                            }
                                        } else {
                                            return false;
                                        }
                                        break;
                                    default:
                                        return false;
                                }
                            } catch (Exception unused) {
                            }
                        }
                        return false;
                    }
                }
            }
            if (!zg5.l5() || z || !(obj instanceof JSONObject)) {
                return true;
            }
            p(dXRecyclerLayout, obj, x9nVar, i, oz8Var);
            return true;
        }
        dXRecyclerLayout.getDXRuntimeContext().j().updateValueWithActions(obj, jSONArray);
        if (!z) {
            p(dXRecyclerLayout, obj, x9nVar, i, oz8Var);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x008e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v(com.taobao.android.dinamicx.widget.DXRecyclerLayout r20, java.util.List<java.lang.Object> r21, java.lang.Object r22, tb.oz8 r23, java.lang.String r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.y96.v(com.taobao.android.dinamicx.widget.DXRecyclerLayout, java.util.List, java.lang.Object, tb.oz8, java.lang.String, int, int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean s(com.taobao.android.dinamicx.widget.DXRecyclerLayout r17, java.util.List<java.lang.Object> r18, java.lang.Object r19, java.lang.String r20) {
        /*
            r16 = this;
            r8 = r16
            r9 = r17
            r10 = r18
            r11 = r19
            r12 = r20
            r13 = 0
            r14 = 1
            com.android.alibaba.ip.runtime.IpChange r0 = tb.y96.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x002f
            java.lang.String r1 = "1a5036fb"
            r2 = 5
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r13] = r8
            r2[r14] = r9
            r3 = 2
            r2[r3] = r10
            r3 = 3
            r2[r3] = r11
            r3 = 4
            r2[r3] = r12
            java.lang.Object r0 = r0.ipc$dispatch(r1, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x002f:
            r15 = 0
        L_0x0030:
            int r0 = r18.size()
            if (r15 >= r0) goto L_0x00c5
            java.lang.Object r0 = r10.get(r15)
            boolean r1 = r0 instanceof com.alibaba.fastjson.JSONObject
            if (r1 == 0) goto L_0x00c2
            r1 = -1
            r2 = r0
            com.alibaba.fastjson.JSONObject r2 = (com.alibaba.fastjson.JSONObject) r2     // Catch: Exception -> 0x0059
            java.lang.String r3 = "isRelative"
            java.lang.Boolean r2 = r2.getBoolean(r3)     // Catch: Exception -> 0x0059
            boolean r2 = r2.booleanValue()     // Catch: Exception -> 0x0059
            com.alibaba.fastjson.JSONObject r0 = (com.alibaba.fastjson.JSONObject) r0     // Catch: Exception -> 0x0057
            java.lang.String r3 = "offset"
            int r0 = r0.getIntValue(r3)     // Catch: Exception -> 0x0057
            goto L_0x005f
        L_0x0057:
            r0 = move-exception
            goto L_0x005b
        L_0x0059:
            r0 = move-exception
            r2 = 0
        L_0x005b:
            r0.printStackTrace()
            r0 = -1
        L_0x005f:
            tb.xt5 r3 = r16.f(r17)
            if (r0 == r1) goto L_0x00c2
            if (r3 == 0) goto L_0x00c2
            boolean r1 = r3.p()
            if (r1 != 0) goto L_0x00c2
            if (r2 == 0) goto L_0x008c
            boolean r1 = r11 instanceof com.taobao.android.dinamicx.widget.DXWidgetNode
            if (r1 == 0) goto L_0x008c
            r1 = r11
            com.taobao.android.dinamicx.widget.DXWidgetNode r1 = (com.taobao.android.dinamicx.widget.DXWidgetNode) r1
            tb.bi6 r1 = r8.h(r1)
            if (r1 != 0) goto L_0x0085
            r0 = 230003(0x38273, float:3.22303E-40)
            java.lang.String r1 = ""
            r8.m(r9, r0, r1)
            return r13
        L_0x0085:
            int r1 = r3.n(r1)
            int r1 = r1 + r0
            r4 = r1
            goto L_0x008d
        L_0x008c:
            r4 = r0
        L_0x008d:
            if (r4 < 0) goto L_0x0098
            int r0 = r3.l()
            if (r4 >= r0) goto L_0x0098
            r3.r(r4)
        L_0x0098:
            if (r4 < 0) goto L_0x00ab
            java.util.List r0 = r16.e(r17)
            int r0 = r0.size()
            if (r4 >= r0) goto L_0x00ab
            java.util.List r0 = r16.e(r17)
            r0.remove(r4)
        L_0x00ab:
            java.lang.String r0 = "part"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x00c2
            java.lang.String r6 = "DXRecyclerLayout#deleteItems"
            r7 = 1
            java.lang.String r3 = "part"
            r5 = 1
            r1 = r16
            r2 = r17
            r1.l(r2, r3, r4, r5, r6, r7)
        L_0x00c2:
            int r15 = r15 + r14
            goto L_0x0030
        L_0x00c5:
            boolean r0 = android.text.TextUtils.isEmpty(r20)
            if (r0 != 0) goto L_0x00d3
            java.lang.String r0 = "all"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x00d6
        L_0x00d3:
            r16.k(r17)
        L_0x00d6:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.y96.s(com.taobao.android.dinamicx.widget.DXRecyclerLayout, java.util.List, java.lang.Object, java.lang.String):boolean");
    }
}
