package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class q7v extends k5e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, jz> f26568a = null;

    static {
        t2o.a(83886241);
    }

    public static void c(jz jzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2a9a081", new Object[]{jzVar});
            return;
        }
        if (f26568a == null) {
            f26568a = new HashMap();
        }
        ((HashMap) f26568a).put(jzVar.a(), jzVar);
    }

    public static /* synthetic */ Object ipc$super(q7v q7vVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/delta/parser/impl/UltronDeltaMergeParser");
    }

    @Override // tb.k5e
    public void a(u55 u55Var, JSONObject jSONObject, JSONObject jSONObject2, String str, String str2, String str3) {
        JSONObject r;
        JSONObject jSONObject3;
        jz jzVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdd83afa", new Object[]{this, u55Var, jSONObject, jSONObject2, str, str2, str3});
            return;
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("data");
        if (jSONObject4 != null) {
            Object remove = jSONObject4.remove(str);
            if ((remove instanceof JSONObject) && (r = u55Var.r()) != null && (jSONObject3 = r.getJSONObject(str)) != null) {
                JSONObject jSONObject5 = (JSONObject) remove;
                Map<String, jz> map = f26568a;
                if (!(map == null || (jzVar = (jz) ((HashMap) map).get(u55Var.getBizName())) == null)) {
                    jzVar.b(str, jSONObject, jSONObject3, jSONObject5);
                }
                h9v.b(jSONObject5, jSONObject3);
            }
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c481d0a", new Object[]{this});
        }
        return "merge";
    }
}
