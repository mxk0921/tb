package tb;

import com.alibaba.android.ultron.vfw.instance.a;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;
import tb.gav;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ozn extends n6v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(614465557);
    }

    public static void J(JSONArray jSONArray, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b168900", new Object[]{jSONArray, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("opType", (Object) "delete");
        jSONObject.put("target", (Object) str);
        jSONArray.add(jSONObject);
    }

    public static /* synthetic */ Object ipc$super(ozn oznVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/ext/RemoveComponentV2Subscriber");
    }

    @Override // tb.n6v
    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4e47c3c", new Object[]{this});
        }
        return "-2945329375793642908";
    }

    @Override // tb.n6v
    public void I(b8v b8vVar) {
        boolean z = true;
        z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
        } else if (b8vVar.n() instanceof a) {
            a aVar = (a) b8vVar.n();
            IDMComponent d = b8vVar.d();
            if (!(E(b8vVar) == null || E(b8vVar).getString("componentKey") == null)) {
                d = b8vVar.n().b().getComponentByName(E(b8vVar).getString("componentKey"));
            }
            if (d != null) {
                if (E(b8vVar) == null || !"true".equals(E(b8vVar).getString("noNeedReload"))) {
                    try {
                        JSONObject parseObject = JSON.parseObject("{\n    \"container\": {\n        \"data\": []\n    },\n    \"endpoint\": {},\n    \"reload\": \"true\",\n    \"data\": {},\n    \"hierarchy\": {\n        \"structure\": {},\n        \"delta\": [\n        ]\n    },\n    \"global\": {},\n    \"linkage\": {}\n}");
                        J(parseObject.getJSONObject("hierarchy").getJSONArray("delta"), d.getKey());
                        et6 N = aVar.G().N();
                        if (N != null) {
                            List<IDMComponent> j = N.j();
                            if (j == null || j.isEmpty()) {
                                z = false;
                            }
                        }
                        aVar.e0(parseObject, new gav.g.a().e(z).c());
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }
}
