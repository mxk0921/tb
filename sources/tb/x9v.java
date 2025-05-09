package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class x9v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(153092153);
    }

    public static List<gsb> a(JSONArray jSONArray, JSONObject jSONObject, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fec60897", new Object[]{jSONArray, jSONObject, list});
        }
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArray.size());
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                twf.g(next, jSONObject, "", "triggerData");
                gsb b = b((JSONObject) next, list);
                if (b != null) {
                    arrayList.add(b);
                }
            }
        }
        return arrayList;
    }

    public static gsb b(JSONObject jSONObject, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gsb) ipChange.ipc$dispatch("1a1ac3fa", new Object[]{jSONObject, list});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        return new DMEvent(jSONObject.getString("type"), jSONObject.getJSONObject("fields"), list);
    }
}
