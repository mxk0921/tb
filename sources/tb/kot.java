package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import java.net.URLEncoder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class kot implements wg0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(744489003);
        t2o.a(467664946);
    }

    @Override // tb.wg0
    public int b(qg0 qg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d241b11", new Object[]{this, qg0Var})).intValue();
        }
        return 1;
    }

    @Override // tb.wg0
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e1aa3fd", new Object[]{this})).intValue();
        }
        return 1;
    }

    @Override // tb.wg0
    public void a(qg0 qg0Var, String str, dad dadVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec5725b9", new Object[]{this, qg0Var, str, dadVar});
            return;
        }
        String d = TFCCommonUtils.d(str, "_afc_link", "1");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("_afc_link", (Object) "1");
            d = TFCCommonUtils.d(d, "utparamcnt", URLEncoder.encode(jSONObject.toJSONString()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (dadVar != null) {
            dadVar.a(true, d);
        }
    }
}
