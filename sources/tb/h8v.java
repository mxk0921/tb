package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class h8v implements j8v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, k8v> f20477a = new HashMap();
    public final o5e b;

    static {
        t2o.a(156237872);
        t2o.a(156237871);
        t2o.a(156237874);
    }

    public h8v(o5e o5eVar) {
        this.b = o5eVar;
    }

    @Override // tb.j8v
    public void a(String str, JSONObject jSONObject) {
        List<gsb> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b49094ed", new Object[]{this, str, jSONObject});
            return;
        }
        JSONObject d = d();
        if (!(jSONObject == null || d == null || !d.containsKey(str) || (c = c(d.getJSONArray(str), jSONObject, null)) == null)) {
            this.b.getEventHandler().n(c);
        }
        h(jSONObject);
    }

    public final k8v b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k8v) ipChange.ipc$dispatch("936ff950", new Object[]{this, str});
        }
        return (k8v) ((HashMap) this.f20477a).get(str);
    }

    public final List<gsb> c(JSONArray jSONArray, JSONObject jSONObject, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fec60897", new Object[]{this, jSONArray, jSONObject, list});
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
                gsb e = e((JSONObject) next, list);
                if (e != null) {
                    arrayList.add(e);
                }
            }
        }
        return arrayList;
    }

    public final JSONObject d() {
        JSONObject i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("be0ded25", new Object[]{this});
        }
        fsb b = this.b.b();
        if (b == null || (i = b.i()) == null) {
            return null;
        }
        return i.getJSONObject("pageEvents");
    }

    public final gsb e(JSONObject jSONObject, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gsb) ipChange.ipc$dispatch("1a1ac3fa", new Object[]{this, jSONObject, list});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        return new DMEvent(jSONObject.getString("type"), jSONObject.getJSONObject("fields"), list);
    }

    public j8v f(String str, i8v i8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j8v) ipChange.ipc$dispatch("e9d21e16", new Object[]{this, str, i8vVar});
        }
        k8v k8vVar = new k8v(str, i8vVar);
        synchronized (this) {
            try {
                if (b(str) != null) {
                    return this;
                }
                ((HashMap) this.f20477a).put(str, k8vVar);
                return this;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4097c573", new Object[]{this, str});
            return;
        }
        synchronized (this) {
            try {
                if (b(str) != null) {
                    ((HashMap) this.f20477a).remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(JSONObject jSONObject) {
        List<IDMComponent> components;
        List<gsb> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1a6745e", new Object[]{this, jSONObject});
            return;
        }
        o5e o5eVar = this.b;
        if (!(o5eVar == null || o5eVar.b() == null || (components = this.b.b().getComponents()) == null)) {
            for (IDMComponent iDMComponent : components) {
                if (!(iDMComponent == null || iDMComponent.getEventMap() == null || !iDMComponent.getEventMap().containsKey("pageback") || (list = iDMComponent.getEventMap().get("pageback")) == null)) {
                    for (int i = 0; i < list.size(); i++) {
                        gsb gsbVar = list.get(i);
                        if (gsbVar != null) {
                            String type = gsbVar.getType();
                            if (!TextUtils.isEmpty(type)) {
                                b8v t = this.b.getEventHandler().e().t(type);
                                t.p(iDMComponent);
                                t.A("pageback");
                                t.r(gsbVar);
                                this.b.getEventHandler().k(t);
                            }
                        }
                    }
                }
            }
        }
    }
}
