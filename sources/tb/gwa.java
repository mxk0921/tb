package tb;

import com.alibaba.android.ultron.engine.protocol.Hierarchy;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class gwa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(157286479);
    }

    public static void a(JSONObject jSONObject, knm knmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87120c2", new Object[]{jSONObject, knmVar});
            return;
        }
        List<knm> d = knmVar.d();
        if (!(d == null || d.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            for (knm knmVar2 : d) {
                arrayList.add(knmVar2.e());
                a(jSONObject, knmVar2);
            }
            jSONObject.put(knmVar.e(), (Object) arrayList);
        }
    }

    public static Hierarchy b(u1n u1nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Hierarchy) ipChange.ipc$dispatch("b8ad769a", new Object[]{u1nVar});
        }
        Hierarchy hierarchy = new Hierarchy();
        if (u1nVar.e()) {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<String, ol7> entry : u1nVar.a().n().entrySet()) {
                jSONArray.add(entry.getValue().e());
            }
            hierarchy.delta = jSONArray;
            return hierarchy;
        }
        knm b = u1nVar.b();
        hierarchy.root = b.e();
        JSONObject jSONObject = new JSONObject();
        a(jSONObject, b);
        hierarchy.structure = jSONObject;
        return hierarchy;
    }
}
