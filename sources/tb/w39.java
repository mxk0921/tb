package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class w39 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(404750521);
    }

    public static ru1 a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ru1) ipChange.ipc$dispatch("d2a804b3", new Object[]{str, jSONObject});
        }
        return null;
    }
}
