package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import tb.bn7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class csb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699209);
    }

    public static boolean a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e792c88", new Object[]{iDMComponent})).booleanValue();
        }
        JSONObject jSONObject = iDMComponent.getData().getJSONObject("fields");
        if (jSONObject == null || !jSONObject.containsKey("dependency")) {
            return true;
        }
        return o66.d(qm7.a(jSONObject.getString("dependency"), "", new bn7.b().j(iDMComponent.getData()).f()));
    }
}
