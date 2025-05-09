package tb;

import androidx.core.app.NotificationCompat;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class pt4 implements t3i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(336592967);
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
        if (jSONObject == null) {
            return null;
        }
        if (vwf.f(jSONObject, NotificationCompat.GROUP_KEY_SILENT, null) == null) {
            jSONObject.put((JSONObject) NotificationCompat.GROUP_KEY_SILENT, (String) Boolean.FALSE);
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
}
