package tb;

import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.async.AsyncProcessor;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class yc4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262757);
    }

    public static void a(int i, List<? extends oa4> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7cc47d6", new Object[]{new Integer(i), list});
        } else if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                oa4 g = g(i2, list);
                if (g != null) {
                    if (i2 == i) {
                        g.willDisAppear();
                        g.disAppear();
                    }
                    g.destroy();
                }
            }
        }
    }

    public static void b(int[] iArr, List<? extends oa4> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e14e5d", new Object[]{iArr, list});
        } else if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                oa4 g = g(i, list);
                if (g != null) {
                    if (u(i, iArr)) {
                        g.willDisAppear();
                        g.disAppear();
                    }
                    g.destroy();
                }
            }
        }
    }

    public static void c(int i, List<? extends oa4> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("670e005c", new Object[]{new Integer(i), list});
            return;
        }
        oa4 g = g(i, list);
        if (g != null) {
            g.didAppear();
        }
    }

    public static void d(int i, List<? extends oa4> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("834d6eed", new Object[]{new Integer(i), list});
            return;
        }
        oa4 g = g(i, list);
        if (g != null) {
            g.willDisAppear();
            g.disAppear();
        }
    }

    public static void e(int i, int i2, List<? extends oa4> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9727bdf", new Object[]{new Integer(i), new Integer(i2), list});
            return;
        }
        oa4 g = g(i, list);
        if (g != null) {
            g.didAppear();
        }
        oa4 g2 = g(i2, list);
        if (g2 != null) {
            g2.willDisAppear();
            g2.disAppear();
        }
    }

    public static JSONObject f(nb4 nb4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2d272a58", new Object[]{nb4Var});
        }
        List<ir> b = nb4Var.b(AsyncProcessor.EVENT_LIST_NAME);
        if (b == null) {
            return null;
        }
        for (ir irVar : b) {
            if (AsyncProcessor.sEventTypes.contains(irVar.b())) {
                return irVar.a();
            }
        }
        return null;
    }

    public static oa4 g(int i, List<? extends oa4> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oa4) ipChange.ipc$dispatch("6ecd2558", new Object[]{new Integer(i), list});
        }
        if (list != null && i >= 0 && i < list.size()) {
            return (oa4) list.get(i);
        }
        return null;
    }

    public static JSONObject h(RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("de26d198", new Object[]{runtimeAbilityParamArr});
        }
        if (runtimeAbilityParamArr == null) {
            return null;
        }
        for (RuntimeAbilityParam runtimeAbilityParam : runtimeAbilityParamArr) {
            if ("_client_ut_args_".equals(runtimeAbilityParam.getKey())) {
                Object value = runtimeAbilityParam.getValue();
                if (value instanceof JSONObject) {
                    return (JSONObject) value;
                }
            }
        }
        return null;
    }

    public static String l(sx9 sx9Var) {
        tx9 tx9Var;
        nb4 t;
        JSONObject f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d95c8c8e", new Object[]{sx9Var});
        }
        if (sx9Var == null || (tx9Var = (tx9) sx9Var.getComponentData()) == null || (t = tx9Var.t()) == null || (f = t.f()) == null) {
            return null;
        }
        return f.getString("propPath");
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [tb.nb4] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m(tb.sx9 r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.yc4.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "bab81e20"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            java.lang.Object r4 = r0.ipc$dispatch(r1, r2)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L_0x0015:
            r0 = 0
            if (r4 != 0) goto L_0x0019
            return r0
        L_0x0019:
            tb.nb4 r4 = r4.getComponentData()
            if (r4 != 0) goto L_0x0020
            return r0
        L_0x0020:
            tb.rql r4 = r4.i()
            if (r4 != 0) goto L_0x0027
            return r0
        L_0x0027:
            java.lang.String r4 = r4.g()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.yc4.m(tb.sx9):java.lang.String");
    }

    public static JSONObject n(nb4 nb4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("264cff75", new Object[]{nb4Var});
        }
        Map<String, List<ir>> c = nb4Var.c();
        if (c != null && !c.isEmpty()) {
            for (Map.Entry<String, List<ir>> entry : c.entrySet()) {
                for (ir irVar : entry.getValue()) {
                    if ("request".equalsIgnoreCase(irVar.b())) {
                        return irVar.a();
                    }
                }
            }
        }
        return null;
    }

    public static boolean p(nb4 nb4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5aa3a81e", new Object[]{nb4Var})).booleanValue();
        }
        JSONObject f = nb4Var.f();
        if (f == null || f.getString("asyncStatus") == null || f(nb4Var) == null) {
            return false;
        }
        return true;
    }

    public static boolean r(nb4 nb4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("292a9421", new Object[]{nb4Var})).booleanValue();
        }
        if (p(nb4Var)) {
            return q(nb4Var);
        }
        return true;
    }

    public static boolean s(tx9 tx9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1ccf95a", new Object[]{tx9Var})).booleanValue();
        }
        return tx9Var.t().j().equals("native$headerbgimage");
    }

    public static boolean t(tx9 tx9Var) {
        nb4 t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3644396f", new Object[]{tx9Var})).booleanValue();
        }
        if (tx9Var == null || (t = tx9Var.t()) == null || !TextUtils.equals("native$headerlivephoto", t.j())) {
            return false;
        }
        return true;
    }

    public static boolean u(int i, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30bf516a", new Object[]{new Integer(i), iArr})).booleanValue();
        }
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean v(tx9 tx9Var) {
        nb4 t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5af7123a", new Object[]{tx9Var})).booleanValue();
        }
        if (tx9Var == null || (t = tx9Var.t()) == null || !TextUtils.equals("native$headervideo", t.j())) {
            return false;
        }
        return true;
    }

    public static boolean q(nb4 nb4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee38ae63", new Object[]{nb4Var})).booleanValue();
        }
        JSONObject f = nb4Var.f();
        if (f != null) {
            return TextUtils.equals("success", f.getString("asyncStatus"));
        }
        return false;
    }

    public static oa4 i(RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oa4) ipChange.ipc$dispatch("b5bdb34c", new Object[]{runtimeAbilityParamArr});
        }
        if (runtimeAbilityParamArr == null) {
            return null;
        }
        for (RuntimeAbilityParam runtimeAbilityParam : runtimeAbilityParamArr) {
            if ("ttTriggerComponent".equals(runtimeAbilityParam.getKey())) {
                Object value = runtimeAbilityParam.getValue();
                if (value instanceof oa4) {
                    return (oa4) value;
                }
            }
        }
        return null;
    }

    public static View j(RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("de4f5a2", new Object[]{runtimeAbilityParamArr});
        }
        if (runtimeAbilityParamArr == null) {
            return null;
        }
        for (RuntimeAbilityParam runtimeAbilityParam : runtimeAbilityParamArr) {
            if ("ttTriggerRootView".equals(runtimeAbilityParam.getKey())) {
                Object value = runtimeAbilityParam.getValue();
                if (value instanceof View) {
                    return (View) value;
                }
            }
        }
        return null;
    }

    public static View k(RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("57de3e64", new Object[]{runtimeAbilityParamArr});
        }
        if (runtimeAbilityParamArr == null) {
            return null;
        }
        for (RuntimeAbilityParam runtimeAbilityParam : runtimeAbilityParamArr) {
            if ("ttTriggerView".equals(runtimeAbilityParam.getKey())) {
                Object value = runtimeAbilityParam.getValue();
                if (value instanceof View) {
                    return (View) value;
                }
            }
        }
        return null;
    }

    public static boolean o(DataEntry... dataEntryArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81bb51c3", new Object[]{dataEntryArr})).booleanValue();
        }
        if (!(dataEntryArr == null || dataEntryArr.length == 0)) {
            DataEntry dataEntry = new DataEntry("isLightOff", "true");
            for (DataEntry dataEntry2 : dataEntryArr) {
                if (dataEntry.equals(dataEntry2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
