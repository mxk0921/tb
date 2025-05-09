package tb;

import android.text.TextUtils;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class g1g extends k02 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_KV_MAPPINGS = "kvmap";
    public static final String KEY_SOURCE_DATA = "data";
    public static final String KEY_SOURCE_PATH = "source";
    public static final String KEY_TARGET_PATH = "target";

    static {
        t2o.a(80740694);
    }

    public static /* synthetic */ Object ipc$super(g1g g1gVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/node/service/data/rule/impl/KVMappingRule");
    }

    public final Component e(ym ymVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Component) ipChange.ipc$dispatch("115b846a", new Object[]{this, ymVar});
        }
        Component component = new Component();
        if (ymVar.fields != null) {
            if (component.getFields() == null) {
                component.fields = new HashMap();
            }
            component.getFields().putAll(ymVar.fields);
        }
        if (ymVar.events != null) {
            if (component.getEvents() == null) {
                component.events = new HashMap();
            }
            component.getEvents().putAll(ymVar.events);
        }
        if (ymVar.f32185a != null) {
            if (component.getLocalFields() == null) {
                component.localFields = new HashMap();
            }
            component.getLocalFields().putAll(ymVar.f32185a);
        }
        return component;
    }

    public final void g(Component component) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3825ab1", new Object[]{this, component});
            return;
        }
        fl.a(component.getFields(), component.getFields());
        if (component.getEvents() != null) {
            for (List<Event> list : component.getEvents().values()) {
                if (list != null) {
                    for (Event event : list) {
                        if (event != null) {
                            fl.a(event.getFields(), component.getFields());
                        }
                    }
                }
            }
        }
    }

    public final void h(List list, Map<String, Object> map, Component component) {
        String string;
        Map b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14e288a7", new Object[]{this, list, map, component});
            return;
        }
        for (Object obj : list) {
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                if (f(jSONObject)) {
                    String string2 = jSONObject.getString("source");
                    Object d = (TextUtils.isEmpty(string2) || TextUtils.equals(string2, "*")) ? map : gl.d(string2.split("\\."), map);
                    if (!(d == null || (b = gl.b((string = jSONObject.getString("target")), component)) == null)) {
                        String[] j = gl.j(string);
                        if (j != null) {
                            gl.m(j, b, d);
                        } else if (d instanceof Map) {
                            b.putAll((Map) d);
                        }
                    }
                }
            }
        }
    }

    @Override // tb.k02
    public Map<String, Component> d(rxu rxuVar, k4e k4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("66f336e2", new Object[]{this, rxuVar, k4eVar});
        }
        ym ymVar = rxuVar.c;
        if (ymVar == null) {
            c(1, "AURARulesServiceDomain", "无效的KVMappingRule输入:ruleInput");
            return null;
        }
        List c = gl.c(ymVar.fields, "kvmap");
        if (c == null) {
            c(1, "AURARulesServiceDomain", "无效的KVMappingRule输入:kvMappings");
            return null;
        }
        Map<String, Object> h = gl.h(ymVar.fields, "data");
        if (h == null) {
            c(1, "AURARulesServiceDomain", "无效的KVMappingRule输入:sourceData");
            return null;
        }
        ym ymVar2 = rxuVar.d;
        if (ymVar2 == null) {
            c(1, "AURARulesServiceDomain", "无效的KVMappingRule输入:ruleOrigin");
            return null;
        }
        Component e = e(ymVar2);
        HashMap hashMap = new HashMap();
        hashMap.put(rxuVar.b, e);
        h(c, h, e);
        g(e);
        return hashMap;
    }

    public final boolean f(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b1e62bf", new Object[]{this, map})).booleanValue();
        }
        if (gl.i(map, "source") == null) {
            return false;
        }
        String i = gl.i(map, "target");
        if (TextUtils.isEmpty(i)) {
            return false;
        }
        return gl.l(i) || gl.k(i);
    }
}
