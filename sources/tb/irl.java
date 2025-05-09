package tb;

import android.util.Log;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.component.data.Component;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class irl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final sb4 f21528a;

    static {
        t2o.a(758120460);
    }

    public irl(sb4 sb4Var) {
        this.f21528a = sb4Var;
    }

    public List<Component> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7c934b11", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            if (jSONObject.getBooleanValue("reload")) {
                sb4 sb4Var = this.f21528a;
                sb4Var.e.d(sb4Var);
                c(jSONObject);
                sb4 sb4Var2 = this.f21528a;
                sb4Var2.e.e(sb4Var2);
            } else {
                sb4 sb4Var3 = this.f21528a;
                sb4Var3.e.c(sb4Var3);
                b(jSONObject);
                sb4 sb4Var4 = this.f21528a;
                sb4Var4.e.b(sb4Var4);
            }
            return this.f21528a.f27925a.f;
        } catch (Throwable th) {
            Log.e("ParseModule", "parse exception: ", th);
            return null;
        }
    }

    public final void b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aca68797", new Object[]{this, jSONObject});
            return;
        }
        HashMap<String, Component> hashMap = this.f21528a.b().g;
        if (!(jSONObject == null || hashMap == null || (jSONObject2 = jSONObject.getJSONObject("data")) == null)) {
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                JSONObject jSONObject3 = (JSONObject) entry.getValue();
                Component component = hashMap.get(entry.getKey());
                if (component != null) {
                    try {
                        component.m(jSONObject3);
                    } catch (Throwable unused) {
                    }
                }
            }
            this.f21528a.f(jSONObject);
        }
    }

    public final void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f475e3", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            this.f21528a.d();
            ne8 b = this.f21528a.b();
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            JSONObject jSONObject3 = jSONObject.getJSONObject("hierarchy");
            JSONObject jSONObject4 = jSONObject.getJSONObject("linkage");
            if (jSONObject2 != null && jSONObject3 != null && jSONObject4 != null) {
                b.getClass();
                b.b = jSONObject2;
                b.c = jSONObject4;
                JSONObject jSONObject5 = jSONObject3.getJSONObject("structure");
                JSONObject jSONObject6 = jSONObject4.getJSONObject("common");
                if (jSONObject5 != null) {
                    b.f24678a = jSONObject5;
                    b.d = jSONObject6;
                    String string = jSONObject3.getString("root");
                    if (string != null && !string.isEmpty()) {
                        try {
                            b.f = d(string, null);
                        } catch (Throwable unused) {
                        }
                        List<Component> list = b.f;
                        if (list != null && !list.isEmpty()) {
                            this.f21528a.g();
                        }
                    }
                }
            }
        }
    }

    public final List<Component> d(String str, Component component) {
        List<Component> h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bd0028cb", new Object[]{this, str, component});
        }
        Component component2 = null;
        if (str == null || str.isEmpty()) {
            return null;
        }
        ne8 b = this.f21528a.b();
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = b.b;
        JSONObject jSONObject2 = b.f24678a;
        HashMap<String, Component> hashMap = b.g;
        JSONObject jSONObject3 = jSONObject.getJSONObject(str);
        try {
            sb4 sb4Var = this.f21528a;
            component2 = sb4Var.e.g(jSONObject3, sb4Var);
        } catch (Throwable unused) {
        }
        if (component2 != null) {
            component2.o(component);
            arrayList.add(component2);
            hashMap.put(str, component2);
        }
        JSONArray jSONArray = jSONObject2.getJSONArray(str);
        if (jSONArray != null) {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                List<Component> d = d((String) it.next(), component2);
                if (d != null) {
                    arrayList.addAll(d);
                }
            }
        }
        if (component2 == null || (h = this.f21528a.e.h(component2, arrayList)) == null) {
            return arrayList;
        }
        return h;
    }
}
