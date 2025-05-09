package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class enn extends rql {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final List<nb4> k = new ArrayList();

    static {
        t2o.a(912261544);
    }

    public enn(JSONObject jSONObject, qdb qdbVar) {
        super(jSONObject, qdbVar);
        t(jSONObject, qdbVar);
    }

    public static /* synthetic */ Object ipc$super(enn ennVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/data/RecommendComponentData");
    }

    public List<nb4> s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("dc1e1c1b", new Object[]{this});
        }
        return this.k;
    }

    public final void t(JSONObject jSONObject, qdb qdbVar) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7a3dead", new Object[]{this, jSONObject, qdbVar});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (!(jSONObject2 == null || (jSONArray = jSONObject2.getJSONArray("DetailItemPit")) == null || jSONArray.isEmpty())) {
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                if (jSONObject3 != null) {
                    this.k.add(new nb4(jSONObject3, qdbVar));
                }
            }
        }
    }
}
