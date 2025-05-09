package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class sr6 implements fsl<JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(614465589);
        t2o.a(614465599);
    }

    /* renamed from: b */
    public Object a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("366ce3b2", new Object[]{this, str, jSONObject});
        }
        return ur6.e(str, jSONObject);
    }
}
