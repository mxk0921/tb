package tb;

import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class p71 implements t3i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(786432039);
        t2o.a(336593068);
    }

    @Override // tb.t3i
    public ExecuteResult a(ExecuteResult executeResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("736d244b", new Object[]{this, executeResult});
        }
        ckf.g(executeResult, "result");
        return executeResult;
    }

    @Override // tb.t3i
    public JSONObject b(JSONObject jSONObject) {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("636f48f0", new Object[]{this, jSONObject});
        }
        Map<String, ? extends Object> r = MegaUtils.r(jSONObject, "data");
        if (!(jSONObject == null || r == null)) {
            d(jSONObject, "point", "monitorPoint");
            e(jSONObject, r, "errorCode", "errorCode");
            e(jSONObject, r, "errorMsg", "errorMessage");
            e(jSONObject, r, "value", "value");
            if (r.containsKey("arg")) {
                Map<String, Object> s = MegaUtils.s(jSONObject, "args");
                if (s != null) {
                    map = a.t(s);
                } else {
                    map = new LinkedHashMap();
                }
                map.put("_dx_arg_", MegaUtils.w(r, "arg", ""));
                jSONObject.put((JSONObject) "args", (String) map);
            }
            jSONObject.remove("data");
        }
        return jSONObject;
    }

    @Override // tb.t3i
    public ExecuteResult c(ExecuteResult executeResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("f14de8a0", new Object[]{this, executeResult});
        }
        ckf.g(executeResult, "result");
        return executeResult;
    }

    public final void d(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ccc3532", new Object[]{this, jSONObject, str, str2});
        } else if (jSONObject.containsKey(str)) {
            jSONObject.put((JSONObject) str2, (String) jSONObject.get(str));
            jSONObject.remove(str);
        }
    }

    public final void e(JSONObject jSONObject, Map<String, ? extends Object> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fe3723b", new Object[]{this, jSONObject, map, str, str2});
        } else if (map.containsKey(str)) {
            jSONObject.put((JSONObject) str2, (String) map.get(str));
        }
    }
}
