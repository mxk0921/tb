package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.android.ultron.datamodel.imp.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class vd3 extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f29935a = new ArrayList();
    public final kmb b;

    static {
        t2o.a(479199265);
    }

    public vd3(kmb kmbVar) {
        this.b = kmbVar;
    }

    public static /* synthetic */ Object ipc$super(vd3 vd3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/data/CartSubmitModule");
    }

    @Override // com.taobao.android.ultron.datamodel.imp.a, tb.ptd
    public JSONObject a(u55 u55Var, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bdca5e2", new Object[]{this, u55Var, iDMComponent});
        }
        if (u55Var == null) {
            return null;
        }
        try {
            Map<String, DMComponent> p = u55Var.p();
            if (p == null) {
                return null;
            }
            HashSet hashSet = new HashSet();
            if (iDMComponent != null) {
                hashSet.add(iDMComponent);
            }
            JSONArray B = u55Var.B();
            if (B != null && !B.isEmpty()) {
                Iterator<Object> it = B.iterator();
                while (it.hasNext()) {
                    DMComponent dMComponent = p.get((String) it.next());
                    if (dMComponent != null) {
                        hashSet.add(dMComponent);
                    }
                }
                f(p, hashSet);
                JSONObject d = d(u55Var, hashSet, iDMComponent, true);
                h(u55Var, d);
                return d;
            }
            JSONObject d2 = d(u55Var, hashSet, iDMComponent, true);
            h(u55Var, d2);
            return d2;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void f(Map<String, DMComponent> map, Set<IDMComponent> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d79a923c", new Object[]{this, map, set});
            return;
        }
        List<String> list = this.f29935a;
        if (list != null && !((ArrayList) list).isEmpty() && map != null) {
            Iterator it = ((ArrayList) this.f29935a).iterator();
            while (it.hasNext()) {
                DMComponent dMComponent = map.get((String) it.next());
                if (dMComponent != null) {
                    set.add(dMComponent);
                }
            }
            ((ArrayList) this.f29935a).clear();
        }
    }

    public void g(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea8982de", new Object[]{this, list});
        } else if (list != null) {
            ((ArrayList) this.f29935a).addAll(list);
        }
    }

    public final void h(u55 u55Var, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86c4eae9", new Object[]{this, u55Var, jSONObject});
        } else if (this.b.d().B().w() && (jSONObject2 = jSONObject.getJSONObject("linkage")) != null && (jSONObject3 = jSONObject2.getJSONObject("common")) != null) {
            jSONObject3.remove("queryParams");
        }
    }
}
