package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.DMEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class nml {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(156237891);
    }

    public static gsb a(gsb gsbVar, o5e o5eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gsb) ipChange.ipc$dispatch("971128ed", new Object[]{gsbVar, o5eVar});
        }
        if (!(o5eVar.b() == null || o5eVar.b().i() == null || !(o5eVar.b().i().get("events") instanceof JSONObject))) {
            JSONObject jSONObject = o5eVar.b().i().getJSONObject("events");
            if (gsbVar.getType() != null && jSONObject != null && gsbVar.getType().startsWith("@") && (jSONObject.get(gsbVar.getType().substring(1)) instanceof JSONObject) && (jSONObject.getJSONObject(gsbVar.getType().substring(1)).get("type") instanceof String) && (jSONObject.getJSONObject(gsbVar.getType().substring(1)).get("fields") instanceof JSONObject)) {
                JSONObject jSONObject2 = new JSONObject();
                twf.c(jSONObject2, jSONObject.getJSONObject(gsbVar.getType().substring(1)).getJSONObject("fields"));
                twf.c(jSONObject2, gsbVar.getFields());
                return new DMEvent(jSONObject.getJSONObject(gsbVar.getType().substring(1)).getString("type"), jSONObject2, gsbVar.getComponents());
            }
        }
        return gsbVar;
    }
}
