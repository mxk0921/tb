package tb;

import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class dla extends l02 {
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
        t2o.a(80740643);
    }

    public static /* synthetic */ Object ipc$super(dla dlaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/rule/impl/GroupSelectRule");
    }

    @Override // tb.l02
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49e58cad", new Object[]{this});
        }
        return RuleType.GROUP_SELECT;
    }

    @Override // tb.l02
    public Map<String, Component> f(rxu rxuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("49a1baac", new Object[]{this, rxuVar});
        }
        Map<String, Object> map = rxuVar.c.fields;
        Map<String, Object> map2 = rxuVar.d.fields;
        String str = (String) fk.b(map, "clickId", String.class, null);
        JSONObject jSONObject = (JSONObject) fk.b(map2, "group", JSONObject.class, null);
        if (jSONObject == null || str == null) {
            ck.b b = ck.b.b();
            ck.b g = b.l("GroupSelectRule").g("errorCode", "-3000_EMPTY_GROUP_OR_ID");
            if (map == null) {
                map = "";
            }
            ck.b f = g.f("inputFields", map);
            if (map2 == null) {
                map2 = "";
            }
            f.f("originFields", map2);
            ck.g().f("GroupSelectRule规则不合法，group或者id是空", b.a());
            return null;
        }
        JSONArray i = i(jSONObject, str);
        if (i == null) {
            ck.b b2 = ck.b.b();
            b2.l("GroupSelectRule").g("errorCode", "-3001_EMPTY_IDS");
            ck.g().f("GroupSelectRule规则生成的ids为空", b2.a());
            return null;
        }
        jSONObject.put("selectedId", (Object) i);
        Component component = new Component();
        component.fields = map2;
        HashMap hashMap = new HashMap();
        hashMap.put(rxuVar.b, component);
        return hashMap;
    }

    public final void g(JSONArray jSONArray, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c30d3362", new Object[]{this, jSONArray, str, new Integer(i)});
        } else if (jSONArray.size() < i) {
            jSONArray.add(str);
        } else if (i == 1) {
            jSONArray.clear();
            jSONArray.add(str);
        }
    }

    public final void h(JSONArray jSONArray, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d01df650", new Object[]{this, jSONArray, str, new Integer(i)});
        } else if (jSONArray.size() > i) {
            jSONArray.remove(str);
        }
    }

    public final JSONArray i(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("cc16c97d", new Object[]{this, jSONObject, str});
        }
        JSONArray jSONArray = jSONObject.getJSONArray("selectedId");
        if (jSONArray == null) {
            jSONArray = new JSONArray();
        }
        int intValue = jSONObject.getInteger("min").intValue();
        int intValue2 = jSONObject.getInteger("max").intValue();
        if (jSONArray.contains(str)) {
            h(jSONArray, str, intValue);
        } else {
            g(jSONArray, str, intValue2);
        }
        return jSONArray;
    }
}
