package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class nb4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_EVENTS = "events";
    public static final String KEY_EVENTS_EXPOSURE = "exposureItem";
    public static final String KEY_FIELDS = "fields";
    public static final String KEY_ID = "id";
    public static final String KEY_PARENT = "_parent_";
    public static final String KEY_TYPE = "type";
    public static final String KEY_ULTRON_NAME = "_ultron_name_";

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f24614a;
    public String b;
    public String c;
    public String d;
    public String e;
    public JSONObject f;
    public Map<String, List<ir>> g;
    public rql h;

    static {
        t2o.a(912261528);
    }

    public nb4(JSONObject jSONObject) {
        this(jSONObject, null);
    }

    public boolean a(String str, ir... irVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f8fd9ba", new Object[]{this, str, irVarArr})).booleanValue();
        }
        if (str == null || irVarArr == null) {
            return false;
        }
        if (this.g == null) {
            this.g = new HashMap();
        }
        List<ir> list = this.g.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.g.put(str, list);
        }
        list.addAll(uug.a(irVarArr));
        return true;
    }

    public List<ir> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("96298244", new Object[]{this, str});
        }
        Map<String, List<ir>> map = this.g;
        if (map == null || str == null) {
            return null;
        }
        return (List) ((HashMap) map).get(str);
    }

    public Map<String, List<ir>> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("828ab28e", new Object[]{this});
        }
        return this.g;
    }

    public JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this});
        }
        return this.f24614a;
    }

    public List<ir> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c45ab7b5", new Object[]{this});
        }
        Map<String, List<ir>> map = this.g;
        if (map == null) {
            return null;
        }
        return (List) ((HashMap) map).get("exposureItem");
    }

    public JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b4e209d6", new Object[]{this});
        }
        return this.f;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return this.b;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24b68759", new Object[]{this});
        }
        return this.d;
    }

    public <T extends rql> T i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((rql) ipChange.ipc$dispatch("c8ca1054", new Object[]{this}));
        }
        return (T) this.h;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return this.c;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ed306184", new Object[]{this});
        }
        return this.e;
    }

    public final void l(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c97d2839", new Object[]{this, jSONObject});
            return;
        }
        this.f24614a = jSONObject;
        String string = jSONObject.getString("id");
        this.b = string;
        if (TextUtils.isEmpty(string)) {
            this.b = UUID.randomUUID().toString();
        }
        this.c = jSONObject.getString("type");
        this.d = jSONObject.getString(KEY_PARENT);
        this.e = jSONObject.getString(KEY_ULTRON_NAME);
        this.f = jSONObject.getJSONObject("fields");
    }

    public void m(JSONObject jSONObject, qdb qdbVar) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d7882b2", new Object[]{this, jSONObject, qdbVar});
        } else if (qdbVar != null && (jSONObject2 = jSONObject.getJSONObject("events")) != null) {
            for (String str : jSONObject2.keySet()) {
                JSONArray jSONArray = jSONObject2.getJSONArray(str);
                if (jSONArray != null) {
                    int size = jSONArray.size();
                    for (int i = 0; i < size; i++) {
                        JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                        if (jSONObject3 != null) {
                            a(str, qdbVar.a(jSONObject3));
                        }
                    }
                }
            }
        }
    }

    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
            return;
        }
        this.c = str;
        this.f24614a.put("type", (Object) str);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ComponentData{id='" + this.b + "', type='" + this.c + "'}";
    }

    public nb4(JSONObject jSONObject, qdb qdbVar) {
        l(jSONObject);
        m(jSONObject, qdbVar);
    }
}
