package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.v4a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class c0r implements s4a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(475004946);
        t2o.a(475004944);
    }

    @Override // tb.s4a
    public void a(JSONObject jSONObject, d90 d90Var) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b68a946", new Object[]{this, jSONObject, d90Var});
            return;
        }
        Object obj = jSONObject != null ? jSONObject.get("value") : null;
        if (obj == null || !(obj instanceof Boolean)) {
            str = "_default";
        } else if (((Boolean) obj).booleanValue()) {
            str = "true";
        } else {
            str = "false";
        }
        if (d90Var != null) {
            ((v4a.a) d90Var).a(str, jSONObject, null);
        }
    }
}
