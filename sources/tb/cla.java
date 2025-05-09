package tb;

import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class cla extends k02 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CLICK_ID = "clickId";
    public static final String KEY_DISABLE = "disable";
    public static final String KEY_FORCE = "force";
    public static final String KEY_GROUP = "group";
    public static final String KEY_ID = "id";
    public static final String KEY_ITEMS = "items";
    public static final String KEY_NODE = "none";
    public static final String KEY_OPTIONAL = "optional";
    public static final String kEY_MAX = "max";
    public static final String kEY_MIN = "min";
    public static final String kEY_SELECTED_ID = "selectedId";

    static {
        t2o.a(80740693);
    }

    public static /* synthetic */ Object ipc$super(cla claVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/node/service/data/rule/impl/GroupSelectRule");
    }

    public final void e(JSONArray jSONArray, String str, int i, k4e k4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df11e6ab", new Object[]{this, jSONArray, str, new Integer(i), k4eVar});
        } else if (jSONArray.size() < i) {
            jSONArray.add(str);
        } else if (i == 1) {
            jSONArray.clear();
            jSONArray.add(str);
        } else if (k4eVar != null) {
            k4eVar.V(String.valueOf(i));
        }
    }

    public final void f(JSONArray jSONArray, String str, int i, k4e k4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6073e819", new Object[]{this, jSONArray, str, new Integer(i), k4eVar});
        } else if (jSONArray.size() > i) {
            jSONArray.remove(str);
        } else if (k4eVar != null) {
            k4eVar.V(String.valueOf(i));
        }
    }

    public final JSONArray g(JSONObject jSONObject, String str, k4e k4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("15f7ffd4", new Object[]{this, jSONObject, str, k4eVar});
        }
        JSONArray jSONArray = jSONObject.getJSONArray("selectedId");
        if (jSONArray == null) {
            return null;
        }
        int intValue = jSONObject.getInteger("min").intValue();
        int intValue2 = jSONObject.getInteger("max").intValue();
        if (jSONArray.contains(str)) {
            f(jSONArray, str, intValue, k4eVar);
        } else {
            e(jSONArray, str, intValue2, k4eVar);
        }
        return jSONArray;
    }

    @Override // tb.k02
    public Map<String, Component> d(rxu rxuVar, k4e k4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("66f336e2", new Object[]{this, rxuVar, k4eVar});
        }
        Map<String, Object> map = rxuVar.c.fields;
        Map<String, Object> map2 = rxuVar.d.fields;
        String str = (String) fk.b(map, "clickId", String.class, null);
        JSONObject jSONObject = (JSONObject) fk.b(map2, "group", JSONObject.class, null);
        if (jSONObject == null || str == null) {
            c(1, "-3000_EMPTY_GROUP_OR_ID", "GroupSelectRule规则不合法，group或者id是空");
            return null;
        }
        JSONArray g = g(jSONObject, str, k4eVar);
        if (g == null) {
            c(1, "-3001_EMPTY_IDS", "GroupSelectRule规则生成的ids为空");
            return null;
        }
        jSONObject.put("selectedId", (Object) g);
        Component component = new Component();
        component.fields = map2;
        HashMap hashMap = new HashMap();
        hashMap.put(rxuVar.b, component);
        return hashMap;
    }
}
