package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.qba;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class kba {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729810183);
    }

    public static z9c a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z9c) ipChange.ipc$dispatch("532d2c9e", new Object[0]);
        }
        JSONObject A = zza.c().A();
        if (A == null) {
            bqa.d("GlobalDataProcessor", "ext == null");
            return null;
        }
        JSONObject jSONObject = A.getJSONObject("realtimePassParams");
        return new qba.a().e(jSONObject).d(A.getJSONObject("clientABTest")).c();
    }
}
