package tb;

import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.message_open_api.ICallService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class n5j implements t3i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(786432045);
        t2o.a(336593068);
    }

    @Override // tb.t3i
    public ExecuteResult a(ExecuteResult executeResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("736d244b", new Object[]{this, executeResult});
        }
        ckf.g(executeResult, "result");
        if (!(executeResult instanceof FinishResult)) {
            return executeResult;
        }
        if (ckf.b(executeResult.getType(), "onReceiveData")) {
            JSONObject jSONObject = new JSONObject(executeResult.getData());
            d(jSONObject, "responseHeader", "akResponseHeader");
            return new FinishResult(jSONObject, "success");
        } else if (!ckf.b(executeResult.getType(), "onFailure")) {
            return executeResult;
        } else {
            JSONObject jSONObject2 = new JSONObject(executeResult.getData());
            d(jSONObject2, "errorInfo", "errorViewInfo");
            return new FinishResult(jSONObject2, "failure");
        }
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

    @Override // tb.t3i
    public JSONObject b(JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("636f48f0", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject f = vwf.f(jSONObject, "prefetchConfig", null);
        if (f != null) {
            jSONObject.put((JSONObject) "prefetchTimeout", (String) f.get("productionTimeout"));
            jSONObject.remove("prefetchConfig");
        }
        if (vwf.b(jSONObject, "usePost", false)) {
            str = "POST";
        } else {
            str = "GET";
        }
        jSONObject.put((JSONObject) "method", str);
        jSONObject.put((JSONObject) "responseType", "JSON");
        jSONObject.put((JSONObject) "droidParseAsync", (String) Boolean.valueOf(vwf.b(jSONObject, "droidParseAsync", false)));
        d(jSONObject, "bizParams", "data");
        d(jSONObject, "isNeedWua", "useWua");
        d(jSONObject, ICallService.KEY_NEED_ECODE, ICallService.KEY_NEED_LOGIN);
        d(jSONObject, "unitStrategy", mh1.PRICE_UNIT);
        if (!(jSONObject.get("loadingConfig") instanceof JSONObject)) {
            jSONObject.put((JSONObject) "loadingConfig", (String) null);
        }
        return jSONObject;
    }
}
