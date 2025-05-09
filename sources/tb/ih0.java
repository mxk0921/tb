package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ih0 implements oob {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809234);
        t2o.a(487587956);
    }

    @Override // tb.oob
    public String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c494930f", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        return c(jSONObject, jSONObject.getString("containerId"));
    }

    public final fjb b(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fjb) ipChange.ipc$dispatch("58aabc75", new Object[]{this, jSONObject, str});
        }
        ro2 a2 = so2.a(str, jSONObject.getString("requestType"));
        if (a2 == null) {
            return null;
        }
        return new qo2(a2);
    }

    public final String c(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("23297c5f", new Object[]{this, jSONObject, str});
        }
        f54 f54Var = new f54();
        fjb b = b(jSONObject, str);
        if (b != null) {
            f54Var.a(b);
        }
        f54Var.a(new ii7());
        return f54Var.b(null).getString(f54.KEY);
    }
}
