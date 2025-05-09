package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.Event;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class fk8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, g3c> f19352a = new HashMap<>();
    public final List<g3c> b = new ArrayList();

    static {
        t2o.a(352321890);
    }

    public List<Event> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6d430705", new Object[]{this, jSONObject});
        }
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            List<Event> a2 = ((g3c) it.next()).a(jSONObject);
            if (a2 != null && a2.size() > 0) {
                return a2;
            }
        }
        return null;
    }

    public List<Event> b(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8ea2e54f", new Object[]{this, str, jSONObject});
        }
        g3c g3cVar = this.f19352a.get(str);
        if (g3cVar != null) {
            return g3cVar.a(jSONObject);
        }
        return null;
    }

    public void c(String str, g3c g3cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a835988c", new Object[]{this, str, g3cVar});
            return;
        }
        this.f19352a.put(str, g3cVar);
        ((ArrayList) this.b).add(g3cVar);
    }
}
