package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class e54 implements oob {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(487587999);
        t2o.a(487587956);
    }

    @Override // tb.oob
    public String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c494930f", new Object[]{this, jSONObject});
        }
        return null;
    }
}
