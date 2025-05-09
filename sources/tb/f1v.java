package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import java.net.URLEncoder;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class f1v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SCAN_SPM = "a2141.b85463733.0.0";

    static {
        t2o.a(481297658);
    }

    public static void a(d32 d32Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("871dbfe3", new Object[]{d32Var, new Boolean(z)});
        } else if (z) {
            jzu.r(d32Var.I(), "Page_PhotoSearchTake_WAI");
            jzu.t(d32Var.I(), "spm-cnt", "a2141.7194053", "rainbow", e0.b(), "pssource", d32Var.p().getPssource(), k7m.KEY_DEVICE_TYPE, k7m.a());
            c(d32Var.I());
            d32Var.p().setPageSpm("a2141.7194053");
            UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(d32Var.I(), "Page_PhotoSearchTake_WAI");
        } else {
            if (!lg4.c4()) {
                jzu.t(d32Var.I(), "rainbow", e0.b());
            }
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(d32Var.I());
        }
    }

    public static void b(d32 d32Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5945f712", new Object[]{d32Var, new Boolean(z)});
        } else if (z) {
            jzu.r(d32Var.I(), "Page_PhotoSearchScan");
            jzu.t(d32Var.I(), "spm-cnt", "a2141.b85463733", "rainbow", e0.b(), "pssource", d32Var.p().getPssource(), k7m.KEY_DEVICE_TYPE, k7m.a());
            c(d32Var.I());
            d32Var.p().setPageSpm(SCAN_SPM);
            UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(d32Var.I(), "Page_PhotoSearchScan");
        } else {
            if (!lg4.c4()) {
                jzu.t(d32Var.I(), "rainbow", e0.b());
            }
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(d32Var.I());
        }
    }

    public static void c(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99d79dce", new Object[]{context});
        } else if (lg4.u1()) {
            JSONObject jSONObject = null;
            try {
                Map<String, String> pageProperties = UTAnalytics.getInstance().getDefaultTracker().getPageProperties(context);
                if (pageProperties != null) {
                    String str2 = pageProperties.get("utLogMap");
                    if (!TextUtils.isEmpty(str2)) {
                        jSONObject = JSON.parseObject(str2);
                    }
                }
            } catch (Exception unused) {
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.put("rainbow", (Object) e0.b());
            try {
                str = URLEncoder.encode(jSONObject.toJSONString(), "utf-8");
            } catch (Exception unused2) {
                str = "";
            }
            jzu.t(context, "utLogMap", str);
        }
    }
}
