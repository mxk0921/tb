package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gg8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final JSONObject f19970a;

    static {
        t2o.a(689963117);
        JSONObject jSONObject = new JSONObject();
        f19970a = jSONObject;
        jSONObject.put("ci_bucket", (Object) akt.E2());
    }

    public static JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fe975f00", new Object[0]);
        }
        return f19970a;
    }
}
