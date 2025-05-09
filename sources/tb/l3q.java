package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.utils.SkuLogUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class l3q implements lfb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "sku_toast";

    static {
        t2o.a(785383478);
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
            SkuLogUtils.x("SkuToastHandler.handleEvent");
        }
        Context b = v2qVar.b();
        JSONObject c = v2qVar.c();
        if (c != null && !c.isEmpty() && (jSONObject = c.getJSONObject("fields")) != null && !jSONObject.isEmpty()) {
            String string = jSONObject.getString("type");
            String string2 = jSONObject.getString("text");
            String string3 = jSONObject.getString("default");
            String string4 = jSONObject.getString("combText");
            if (TextUtils.isEmpty(string2)) {
                string2 = string3;
            }
            if (TextUtils.isEmpty(string4)) {
                string4 = string2;
            } else if (!TextUtils.isEmpty(string2)) {
                string4 = string2 + "/n" + string4;
            }
            String string5 = jSONObject.getString("iconFont");
            if ("custom".equals(string)) {
                n3q.a(b, 4, string4, string5);
            } else if ("failed".equals(string)) {
                n3q.a(b, 3, string4, null);
            } else if ("success".equals(string)) {
                n3q.a(b, 2, string4, null);
            } else if ("default".equals(string)) {
                n3q.a(b, 1, string4, null);
            } else {
                n3q.a(b, 1, string4, null);
            }
        }
    }
}
