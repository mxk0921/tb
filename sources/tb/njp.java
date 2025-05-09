package tb;

import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.utils.PopConst;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class njp implements t3i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(786432049);
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("636f48f0", new Object[]{this, jSONObject});
        }
        if (jSONObject != null) {
            d(jSONObject, "businessId", PopConst.BRIDGE_KEY_BUSINESS_ID);
            d(jSONObject, "imageUrl", "imageURL");
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
            return;
        }
        jSONObject.put((JSONObject) str2, (String) jSONObject.get(str));
        jSONObject.remove(str);
    }
}
