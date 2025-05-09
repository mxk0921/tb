package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ab3 extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199377);
    }

    public static /* synthetic */ Object ipc$super(ab3 ab3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartEventQueueSubscriber");
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        JSONArray jSONArray = c().getJSONArray("events");
        if (jSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.size(); i++) {
                Object obj = jSONArray.get(i);
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    arrayList.add(new DMEvent(jSONObject.getString("type"), jSONObject.getJSONObject("fields"), null, jSONObject.getIntValue("option")));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                gsb gsbVar = (gsb) arrayList.get(i2);
                lcu d = this.j.g().d();
                d.q(lcuVar.g());
                d.l(gsbVar.getType());
                d.k(gsbVar);
                d.m("events", arrayList);
                d.i(this.e);
                this.j.g().h(d);
            }
        }
    }
}
