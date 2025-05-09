package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b6l extends jq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String OPERATE_KEY = "merge";

    static {
        t2o.a(83886220);
    }

    public static /* synthetic */ Object ipc$super(b6l b6lVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/datamodel/imp/delta/OperateMerge");
    }

    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6bc1e07", new Object[]{this, jSONObject, jSONObject2});
        } else if (jSONObject2 != null) {
            if (jSONObject == null) {
                JSON.parseObject(jSONObject2.toJSONString());
                return;
            }
            for (String str : jSONObject2.keySet()) {
                if (!TextUtils.isEmpty(str)) {
                    Object obj = jSONObject2.get(str);
                    Object obj2 = jSONObject.get(str);
                    if (!(obj2 instanceof JSONObject) || !(obj instanceof JSONObject)) {
                        jSONObject.put(str, obj);
                    } else {
                        b((JSONObject) obj2, (JSONObject) obj);
                    }
                }
            }
        }
    }

    @Override // tb.jq
    public void a(u55 u55Var, JSONObject jSONObject, List<rb4> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a1d5e0", new Object[]{this, u55Var, jSONObject, list});
        } else if (jSONObject != null && u55Var != null) {
            String string = jSONObject.getString("target");
            if (!TextUtils.isEmpty(string)) {
                JSONObject r = u55Var.r();
                Map<String, DMComponent> p = u55Var.p();
                JSONObject s = u55Var.s();
                if (r != null && s != null) {
                    JSONObject jSONObject2 = r.getJSONObject(string);
                    JSONObject jSONObject3 = s.getJSONObject(string);
                    DMComponent dMComponent = p.get(string);
                    if (jSONObject2 != null) {
                        b(jSONObject2, jSONObject3);
                        if (dMComponent != null) {
                            dMComponent.writeBackDataAndReloadEvent(jSONObject2, t55.g(u55Var, jSONObject2.getJSONObject("events")), false);
                        }
                    }
                }
            }
        }
    }
}
