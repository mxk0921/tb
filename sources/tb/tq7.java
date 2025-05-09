package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class tq7 extends m6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FIELD_DISPATCHER = "dispatch";

    static {
        t2o.a(156237835);
    }

    public static /* synthetic */ Object ipc$super(tq7 tq7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/event/DispatchSubscriber");
    }

    public final String H(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35eaae92", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(str);
        twf.f(jSONArray, this.e.getFields(), "");
        return (String) jSONArray.get(0);
    }

    public final boolean I(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b39d38ff", new Object[]{this, str})).booleanValue();
        }
        if (str.contains("==")) {
            String[] split = str.split("==");
            if (split.length == 2) {
                return split[1].equals(H(split[0]));
            }
            return false;
        }
        twf.f(str, this.e.getFields(), "");
        return !TextUtils.isEmpty(H(str));
    }

    @Override // tb.m6v
    public void F(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
            return;
        }
        JSONObject D = D(b8vVar);
        if (D == null) {
            tj8.a(tq7.class.getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", "获取fields失败");
            return;
        }
        JSONObject b = twf.b(D);
        JSONArray jSONArray = b.getJSONArray("conditions");
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString(DXTraceUtil.TYPE_EXPRESSION_STRING);
                JSONArray jSONArray2 = jSONObject.getJSONArray("next");
                if (I(string)) {
                    G(b8vVar, jSONArray2, b);
                    return;
                }
            }
        }
    }

    public final void G(b8v b8vVar, JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c282bf8", new Object[]{this, b8vVar, jSONArray, jSONObject});
            return;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(jSONArray.getString(i));
            if (jSONObject2 != null) {
                z(b8vVar, jSONObject2.getString("type"), jSONObject2.getJSONObject("fields"));
            }
        }
    }
}
