package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.Event;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class hxj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CALLBACK = "callback";
    public static final String EVENT_KEY = "eventKey";
    public static final String EVENT_PARAMS = "params";
    public static final String UNIQID = "uniqueId";

    /* renamed from: a  reason: collision with root package name */
    public static final fk8 f20945a;

    static {
        t2o.a(352321628);
        fk8 fk8Var = new fk8();
        f20945a = fk8Var;
        fk8Var.c("item", new mf7());
    }

    public static List<Event> b(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("781b68b1", new Object[]{jSONArray});
        }
        return a(jSONArray, null);
    }

    public static List<Event> a(JSONArray jSONArray, x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6a4bf4a7", new Object[]{jSONArray, x3wVar});
        }
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            jSONObject.put(EVENT_KEY, (Object) jSONObject.getString("type"));
            JSONObject jSONObject2 = jSONObject.getJSONObject("fields");
            if (jSONObject2 != null) {
                jSONObject2.put("VerticalItemNode", (Object) x3wVar);
            }
            jSONObject.put("params", (Object) jSONObject2);
            List<Event> c = c("", jSONObject);
            if (c != null) {
                arrayList.addAll(c);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d9, code lost:
        if (r3.equals(tb.o3w.OPERATE_UPDATE_DATA) == false) goto L_0x003b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<com.taobao.android.trade.event.Event> c(java.lang.String r9, com.alibaba.fastjson.JSONObject r10) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.hxj.c(java.lang.String, com.alibaba.fastjson.JSONObject):java.util.List");
    }
}
