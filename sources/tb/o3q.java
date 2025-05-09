package tb;

import android.text.TextUtils;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.utils.SkuLogUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class o3q implements lfb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "umbrellaAlarm";

    static {
        t2o.a(442499144);
        t2o.a(442499194);
    }

    @Override // tb.lfb
    public void a(v2q v2qVar, pr0 pr0Var) {
        JSONObject jSONObject;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91e5704a", new Object[]{this, v2qVar, pr0Var});
            return;
        }
        if (cjz.a()) {
            SkuLogUtils.x("SkuUmbrellaHandler.handleEvent");
        }
        JSONObject c = v2qVar.c();
        if (c != null && !c.isEmpty() && (jSONObject = c.getJSONObject("fields")) != null && !jSONObject.isEmpty()) {
            String string = jSONObject.getString("feature");
            String string2 = jSONObject.getString("mainBiz");
            String string3 = jSONObject.getString("childBiz");
            String string4 = jSONObject.getString("errorCode");
            String string5 = jSONObject.getString("errorMsg");
            JSONObject jSONObject2 = jSONObject.getJSONObject("args");
            UMLinkLogInterface a2 = hdv.a();
            if (a2 != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("errorMsg", string5);
                if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                    for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (!TextUtils.isEmpty(key)) {
                            if (value == null) {
                                str = "null";
                            } else {
                                str = String.valueOf(value);
                            }
                            hashMap.put(key, str);
                        }
                    }
                }
                try {
                    a2.commitFailure(string, "", "", string2, string3, hashMap, string4, string5);
                } catch (Throwable th) {
                    SkuLogUtils.i(th.toString());
                }
            }
        }
    }
}
