package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class se1 extends i24 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FIELD_KEY_ERROR_FIELDS = "errorFields";
    public static final String FIELD_KEY_SUCCESS_FIELDS = "successFields";

    static {
        t2o.a(614465576);
    }

    public static /* synthetic */ Object ipc$super(se1 se1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/ext/combine/AsyncRefreshV2Subscriber");
    }

    @Override // tb.i24
    public JSONObject K(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3d13c9e0", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            uj8.a("AsyncRefreshV2Subscribe", "buildCombineEvent", "fields is none");
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", "refreshMtopV2");
        jSONObject2.put("fields", (Object) axf.b(jSONObject));
        J(jSONObject2, "success", "updateAsyncStatusV2", null);
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject.get(FIELD_KEY_SUCCESS_FIELDS) != null) {
            jSONObject3.put("updateFields", jSONObject.get(FIELD_KEY_SUCCESS_FIELDS));
        } else {
            jSONObject3.put("updateFields", "@data{data}");
        }
        J(jSONObject2, "success", "updateComponentV2", jSONObject3);
        J(jSONObject2, "fail", "updateAsyncStatusV2", null);
        JSONObject jSONObject4 = new JSONObject();
        if (jSONObject.get(FIELD_KEY_ERROR_FIELDS) != null) {
            jSONObject4.put("updateFields", jSONObject.get(FIELD_KEY_ERROR_FIELDS));
            J(jSONObject2, "fail", "updateComponentV2", jSONObject4);
        }
        return jSONObject2;
    }

    @Override // tb.i24
    public boolean L(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7636e60b", new Object[]{this, b8vVar})).booleanValue();
        }
        if (b8vVar.d() == null || b8vVar.d().getFields() == null || b8vVar.d().getFields().containsKey("asyncRefreshExecuted")) {
            return false;
        }
        b8vVar.d().getFields().put("asyncRefreshExecuted", "true");
        return true;
    }
}
