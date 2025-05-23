package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class i24 extends n6v {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Context j;

    static {
        t2o.a(614465577);
    }

    public static /* synthetic */ Object ipc$super(i24 i24Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/ext/combine/CombineBaseV2Subscriber");
    }

    @Override // tb.n6v
    public boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fa005df", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public JSONObject J(JSONObject jSONObject, String str, String str2, JSONObject jSONObject2) {
        String str3;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9727a619", new Object[]{this, jSONObject, str, str2, jSONObject2});
        }
        uj8.f(getClass().getSimpleName(), "combineEventAddNext", "add下一个事件");
        if (jSONObject == null || TextUtils.isEmpty(str) || !(jSONObject.get("fields") instanceof JSONObject)) {
            if (jSONObject == null) {
                str3 = "addNextEvent 参数校验出错:targetEvent 为空";
            } else if (TextUtils.isEmpty(str)) {
                str3 = "addNextEvent 参数校验出错:nextKey 为空";
            } else {
                str3 = "addNextEvent 参数校验出错:fields 为空";
            }
            uj8.a(getClass().getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", str3);
            return null;
        }
        Object obj = jSONObject.getJSONObject("fields").get("native$next");
        if (obj instanceof JSONObject) {
            JSONObject jSONObject3 = (JSONObject) obj;
            Object obj2 = jSONObject3.get(str);
            if (obj2 instanceof JSONArray) {
                jSONArray = (JSONArray) obj2;
            } else {
                jSONArray = new JSONArray();
                jSONObject3.put(str, (Object) jSONArray);
            }
        } else {
            JSONObject jSONObject4 = new JSONObject();
            JSONArray jSONArray2 = new JSONArray();
            jSONObject4.put(str, (Object) jSONArray2);
            jSONObject.getJSONObject("fields").put("native$next", (Object) jSONObject4);
            jSONArray = jSONArray2;
        }
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("type", (Object) str2);
        jSONObject5.put("fields", (Object) jSONObject2);
        jSONArray.add(jSONObject5);
        return jSONObject5;
    }

    public abstract JSONObject K(JSONObject jSONObject);

    public boolean L(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7636e60b", new Object[]{this, b8vVar})).booleanValue();
        }
        return true;
    }

    @Override // tb.n6v
    public final void I(b8v b8vVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
        } else if (L(b8vVar)) {
            uj8.f(getClass().getSimpleName(), "combineEventStart", "事件开始");
            JSONObject E = E(b8vVar);
            if (E == null || b8vVar == null) {
                StringBuilder sb = new StringBuilder("fields is null :");
                sb.append(E == null);
                sb.append("ultronEvent is null :");
                if (b8vVar != null) {
                    z = false;
                }
                sb.append(z);
                uj8.a(getClass().getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", sb.toString());
                return;
            }
            this.j = b8vVar.e();
            JSONObject jSONObject = E.getJSONObject("native$combineEvent");
            if (jSONObject == null) {
                JSONObject jSONObject2 = new JSONObject();
                axf.c(jSONObject2, E);
                jSONObject = K(jSONObject2);
                E.put("native$combineEvent", (Object) jSONObject);
            }
            uj8.f(getClass().getSimpleName(), "combineEventDispatchEvent", "事件分发");
            y(b8vVar, jSONObject);
        }
    }
}
