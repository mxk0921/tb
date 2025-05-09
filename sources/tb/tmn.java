package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class tmn implements s4a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809620);
        t2o.a(475004944);
    }

    @Override // tb.s4a
    public void a(JSONObject jSONObject, d90 d90Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b68a946", new Object[]{this, jSONObject, d90Var});
            return;
        }
        bqa.d("RecmdPrefetchDataProcessAction", "executeActionWithParam");
        ael.i((AwesomeGetData) jSONObject.get("dataModel"));
    }
}
