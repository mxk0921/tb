package tb;

import android.view.ViewGroup;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.monitor.track.spm.merge.MergeUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.runtime.RuntimeParam;
import com.taobao.android.detail.ttdetail.utils.RuntimeUtils;
import com.taobao.android.detail.ttdetail.utils.UtUtils;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import tb.b5m;
import tb.eo7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class hl6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements eo7.r {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.eo7.r
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef4d4afc", new Object[]{this, str});
                return;
            }
            tgh.b("DXUtils", "dinamicXEngine.createView failed:" + str);
        }

        @Override // tb.eo7.r
        public void b(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24eeaeea", new Object[]{this, viewGroup});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements eo7.t {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.eo7.t
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef4d4afc", new Object[]{this, str});
                return;
            }
            tgh.b("DXUtils", "dinamicXEngine.renderView failed:" + str);
        }

        @Override // tb.eo7.t
        public void b(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24eeaeea", new Object[]{this, viewGroup});
            }
        }
    }

    static {
        t2o.a(912262767);
    }

    @Deprecated
    public static void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce4a40b2", new Object[]{jSONObject});
        } else {
            b(jSONObject, null);
        }
    }

    public static void b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c2587e", new Object[]{jSONObject, jSONObject2});
            return;
        }
        try {
            if (!jSONObject.getBooleanValue(MergeUtil.KEY_EXPOSED) && jSONObject.get("events") != null && (jSONArray = jSONObject.getJSONObject("events").getJSONArray("exposureItem")) != null && !jSONArray.isEmpty()) {
                JSONObject b2 = RuntimeUtils.b(jSONObject);
                for (int i = 0; i < jSONArray.size(); i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i).getJSONObject("fields");
                    UtUtils.f(2201, jSONObject3.getString("arg1"), f(jSONObject3.getJSONObject("args"), b2, jSONObject2));
                }
                jSONObject.put(MergeUtil.KEY_EXPOSED, (Object) Boolean.TRUE);
            }
        } catch (Exception e) {
            tgh.b("DXUtils", "exposeItem failed:" + e.getMessage());
        }
    }

    public static String c() {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("edaed266", new Object[0]);
        }
        b5m.h F = b5m.F();
        if (F == null || (a2 = F.a()) == null) {
            return "";
        }
        return a2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
        r4 = r4.getRootWindowInsets();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int d(android.view.View r4) {
        /*
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = tb.hl6.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0019
            java.lang.String r2 = "a81cb103"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r4
            java.lang.Object r4 = r1.ipc$dispatch(r2, r3)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            return r4
        L_0x0019:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L_0x0029
            android.view.WindowInsets r4 = tb.zop.a(r4)
            if (r4 == 0) goto L_0x0029
            int r0 = r4.getSystemWindowInsetBottom()
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.hl6.d(android.view.View):int");
    }

    public static l38 e(eo7 eo7Var, JSONObject jSONObject, eo7.s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l38) ipChange.ipc$dispatch("84f4e4a0", new Object[]{eo7Var, jSONObject, sVar});
        }
        if (eo7Var == null || jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("template");
        if (jSONObject2 == null) {
            tgh.b("DXUtils", "invalid data. no template");
            return null;
        }
        l38 l38Var = new l38(jSONObject2);
        eo7Var.k(l38Var, sVar);
        return l38Var;
    }

    public static JSONObject f(JSONObject... jSONObjectArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("837a9a57", new Object[]{jSONObjectArr});
        }
        JSONObject jSONObject = null;
        if (!(jSONObjectArr == null || jSONObjectArr.length == 0)) {
            for (JSONObject jSONObject2 : jSONObjectArr) {
                if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    jSONObject.putAll(jSONObject2);
                }
            }
        }
        return jSONObject;
    }

    public static DXTemplateItem g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("f559e816", new Object[]{jSONObject});
        }
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        dXTemplateItem.f7343a = jSONObject.getString("name");
        dXTemplateItem.b = jSONObject.getLongValue("version");
        dXTemplateItem.c = jSONObject.getString("url");
        return dXTemplateItem;
    }

    public static ViewGroup h(eo7 eo7Var, JSONObject jSONObject, l38 l38Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("df196b2c", new Object[]{eo7Var, jSONObject, l38Var});
        }
        return i(eo7Var, jSONObject, l38Var, pb6.j(), pb6.i());
    }

    public static ViewGroup i(eo7 eo7Var, JSONObject jSONObject, l38 l38Var, int i, int i2) {
        ViewGroup H;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("2da4b50c", new Object[]{eo7Var, jSONObject, l38Var, new Integer(i), new Integer(i2)});
        }
        ViewGroup i3 = eo7Var.i(l38Var, new a());
        if (i3 == null || (H = eo7Var.H(i3, i, i2, jSONObject, new b())) == null) {
            return null;
        }
        ze7 n = eo7Var.n();
        if (n != null) {
            b(jSONObject, UtUtils.c(n.e()));
        } else {
            a(jSONObject);
        }
        return H;
    }

    public static ViewGroup j(eo7 eo7Var, JSONObject jSONObject, l38 l38Var, int i, int i2, RuntimeParam... runtimeParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("4629d55f", new Object[]{eo7Var, jSONObject, l38Var, new Integer(i), new Integer(i2), runtimeParamArr});
        }
        return i(eo7Var, RuntimeUtils.f(jSONObject, runtimeParamArr), l38Var, i, i2);
    }

    public static DXResult<DXRootView> k(eo7 eo7Var, DXRootView dXRootView, JSONObject jSONObject, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("608c66ec", new Object[]{eo7Var, dXRootView, jSONObject, new Integer(i), new Integer(i2)});
        }
        if (dXRootView == null || jSONObject == null) {
            return null;
        }
        return eo7Var.G(dXRootView, jSONObject, i, i2);
    }

    public static DXResult<DXRootView> l(eo7 eo7Var, DXRootView dXRootView, JSONObject jSONObject, int i, int i2, RuntimeParam... runtimeParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("255028ff", new Object[]{eo7Var, dXRootView, jSONObject, new Integer(i), new Integer(i2), runtimeParamArr});
        }
        return k(eo7Var, dXRootView, RuntimeUtils.f(jSONObject, runtimeParamArr), i, i2);
    }
}
