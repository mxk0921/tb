package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.utils.SkuLogUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class k2q implements lfb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "sku_callback";

    static {
        t2o.a(442499136);
        t2o.a(442499194);
    }

    @Override // tb.lfb
    public void a(v2q v2qVar, pr0 pr0Var) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91e5704a", new Object[]{this, v2qVar, pr0Var});
            return;
        }
        if (cjz.a()) {
            SkuLogUtils.x("SkuCallbackHandler.handleEvent");
        }
        JSONObject c = v2qVar.c();
        if (c != null && !c.isEmpty() && (jSONObject = c.getJSONObject("fields")) != null && !jSONObject.isEmpty()) {
            pr0Var.h(jSONObject);
        }
    }
}
