package tb;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class fi1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(843055138);
    }

    public static final void a(BridgeCallback bridgeCallback, String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ba1c46b", new Object[]{bridgeCallback, str, str2, obj});
            return;
        }
        ckf.g(bridgeCallback, "<this>");
        ckf.g(str, "playerId");
        ckf.g(str2, "key");
        ckf.g(obj, "value");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "success", (String) Boolean.TRUE);
        jSONObject.put((JSONObject) "audioPlayerID", str);
        jSONObject.put((JSONObject) str2, (String) obj);
        bridgeCallback.sendJSONResponse(jSONObject);
    }

    public static final void b(BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df4b12b6", new Object[]{bridgeCallback});
            return;
        }
        ckf.g(bridgeCallback, "<this>");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "success", (String) Boolean.FALSE);
        jSONObject.put((JSONObject) "errorCode", "INVALID_PARAM");
        jSONObject.put((JSONObject) "errorMessage", "INVALID_PARAM");
        bridgeCallback.sendJSONResponse(jSONObject);
    }

    public static final void c(BridgeCallback bridgeCallback, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aa0f825", new Object[]{bridgeCallback, str});
            return;
        }
        ckf.g(bridgeCallback, "<this>");
        ckf.g(str, "playerId");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "success", (String) Boolean.TRUE);
        jSONObject.put((JSONObject) "audioPlayerID", str);
        bridgeCallback.sendJSONResponse(jSONObject);
    }
}
