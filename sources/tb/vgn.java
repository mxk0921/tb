package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.model.RateInfoV2;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class vgn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COLLECTION_URL = "http://taobao.com/jstracker/rateList.html";
    public static final vgn INSTANCE = new vgn();
    public static final String PAGE_NAME = "RateList";
    public static final String PID = "31158-tracker";
    public static final String RATE_LIST_CODE = "20001";
    public static final String RATE_LIST_DX_TEMPLATE_NULL_CODE = "50011";
    public static final String RATE_LIST_PARAMS_CODE = "50001";
    public static final String RATE_LIST_RATE_FEATURE_DOWNLOAD_COD = "50003";
    public static final String RATE_LIST_RATE_FEATURE_REMOTE_FAIL_COD = "50004";
    public static final String RATE_LIST_RATE_INFO_CODE = "50002";
    public static final String RATE_LIST_RECOVERY_WITHOUT_PARAMS = "50012";
    public static final String RATE_PREVIEW_CODE = "30001";

    @JvmStatic
    public static final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3058592", new Object[0]);
            return;
        }
        g15 l = g15.l(PAGE_NAME, RATE_LIST_DX_TEMPLATE_NULL_CODE, PID, COLLECTION_URL);
        ckf.f(l, "CustomModel.create(\n    … COLLECTION_URL\n        )");
        l.x(false);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "source", "native");
        l.m("d1", "dx rootView is null");
        l.v(jSONObject.toJSONString());
        l.w(n9l.INSTANCE.P());
        tcu.o(l);
    }

    public static /* synthetic */ void d(String str, String str2, boolean z, String str3, boolean z2, boolean z3, int i, Object obj) {
        boolean z4;
        boolean z5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daa68ce3", new Object[]{str, str2, new Boolean(z), str3, new Boolean(z2), new Boolean(z3), new Integer(i), obj});
            return;
        }
        if ((i & 16) != 0) {
            z4 = true;
        } else {
            z4 = z2;
        }
        if ((i & 32) != 0) {
            z5 = true;
        } else {
            z5 = z3;
        }
        c(str, str2, z, str3, z4, z5);
    }

    @JvmStatic
    public static final void f(String str, String str2, String str3, boolean z) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2a09db3", new Object[]{str, str2, str3, new Boolean(z)});
            return;
        }
        ckf.g(str, "api");
        o5j j = o5j.j(PAGE_NAME, str, z, PID, COLLECTION_URL);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "source", "native");
        if (z) {
            jSONObject.put((JSONObject) "status", "success");
        } else {
            jSONObject.put((JSONObject) "errorCode", str2);
            jSONObject.put((JSONObject) "errorMsg", str3);
        }
        j.p(jSONObject.toJSONString());
        if (z) {
            f = n9l.INSTANCE.Q();
        } else {
            f = n9l.INSTANCE.O();
        }
        j.r(f);
        tcu.q(j);
    }

    @JvmStatic
    public static final void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6088b854", new Object[]{str});
            return;
        }
        ckf.g(str, "mag");
        g15 l = g15.l(PAGE_NAME, RATE_LIST_RATE_FEATURE_DOWNLOAD_COD, PID, COLLECTION_URL);
        ckf.f(l, "CustomModel.create(\n    … COLLECTION_URL\n        )");
        INSTANCE.h(str, "rateFeature downgrade", l);
    }

    @JvmStatic
    public static final void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd8c5361", new Object[]{str});
            return;
        }
        ckf.g(str, "mag");
        g15 l = g15.l(PAGE_NAME, RATE_LIST_RATE_FEATURE_REMOTE_FAIL_COD, PID, COLLECTION_URL);
        ckf.f(l, "CustomModel.create(\n    … COLLECTION_URL\n        )");
        INSTANCE.h(str, "rateFeature init failed", l);
    }

    public final void h(String str, String str2, g15 g15Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184a1064", new Object[]{this, str, str2, g15Var});
            return;
        }
        g15Var.x(false);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "error", str);
        g15Var.m("d1", str2);
        g15Var.v(jSONObject.toJSONString());
        g15Var.w(n9l.INSTANCE.P());
        tcu.o(g15Var);
    }

    @JvmStatic
    public static final void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3622a0aa", new Object[]{str, str2, str3});
            return;
        }
        ckf.g(str, "code");
        ckf.g(str2, "errorCode");
        ckf.g(str3, "errorMsg");
        g15 l = g15.l(PAGE_NAME, str, PID, COLLECTION_URL);
        ckf.f(l, "CustomModel.create(\n    … COLLECTION_URL\n        )");
        l.x(false);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "source", "native");
        jSONObject.put((JSONObject) "errorCode", str2);
        jSONObject.put((JSONObject) "errorMsg", str3);
        l.v(jSONObject.toJSONString());
        l.w(n9l.INSTANCE.P());
        tcu.o(l);
    }

    @JvmStatic
    public static final void c(String str, String str2, boolean z, String str3, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80dd039", new Object[]{str, str2, new Boolean(z), str3, new Boolean(z2), new Boolean(z3)});
            return;
        }
        ckf.g(str, "code");
        ckf.g(str2, RateInfoV2.KEY_OPEN_MODE);
        ckf.g(str3, "itemId");
        g15 l = g15.l(PAGE_NAME, str, PID, COLLECTION_URL);
        ckf.f(l, "CustomModel.create(\n    … COLLECTION_URL\n        )");
        l.x(false);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "source", "native");
        jSONObject.put((JSONObject) RateInfoV2.KEY_OPEN_MODE, str2);
        jSONObject.put((JSONObject) "isPreRender", (String) Boolean.valueOf(z));
        jSONObject.put((JSONObject) "itemId", str3);
        jSONObject.put((JSONObject) "hasSetRateInfo", (String) Boolean.valueOf(z2));
        jSONObject.put((JSONObject) "isValidRateInfo", (String) Boolean.valueOf(z3));
        l.m("d1", str3);
        l.m("d2", str2);
        l.m("d3", str2);
        l.v(jSONObject.toJSONString());
        l.w(n9l.INSTANCE.P());
        tcu.o(l);
    }

    @JvmStatic
    public static final void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b15fa3a3", new Object[]{str});
            return;
        }
        ckf.g(str, "code");
        g15 l = g15.l(PAGE_NAME, str, PID, COLLECTION_URL);
        ckf.f(l, "CustomModel.create(\n    … COLLECTION_URL\n        )");
        l.x(false);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "source", "native");
        l.m("d1", "rateInfo is null");
        l.v(jSONObject.toJSONString());
        l.w(n9l.INSTANCE.P());
        tcu.o(l);
    }

    @JvmStatic
    public static final void g(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3af1c48", new Object[]{new Boolean(z)});
            return;
        }
        g15 l = g15.l(PAGE_NAME, RATE_LIST_RECOVERY_WITHOUT_PARAMS, PID, COLLECTION_URL);
        ckf.f(l, "CustomModel.create(\n    … COLLECTION_URL\n        )");
        l.x(false);
        JSONObject jSONObject = new JSONObject();
        if (z) {
            str = "weex";
        } else {
            str = "dx";
        }
        jSONObject.put((JSONObject) "source", str);
        l.m("d1", "recovery without params");
        l.v(jSONObject.toJSONString());
        l.w(n9l.INSTANCE.P());
        tcu.o(l);
    }
}
