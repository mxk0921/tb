package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.ParseModule;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class mrl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final arl f24256a = new arl();
    public final ParseModule b = new ParseModule();

    static {
        t2o.a(83886200);
        t2o.a(83886127);
    }

    public void a(u55 u55Var, JSONObject jSONObject, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9d7c1a", new Object[]{this, u55Var, jSONObject, map});
        } else if (jSONObject != null && u55Var != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("hierarchy");
            if (!jSONObject2.containsKey("delta") || jSONObject2.get("delta") == null) {
                this.b.u(u55Var, jSONObject);
            } else {
                this.f24256a.c(u55Var, jSONObject);
            }
        }
    }
}
