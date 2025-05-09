package tb;

import android.text.TextUtils;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class j1n extends l02 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(80740646);
    }

    public static /* synthetic */ Object ipc$super(j1n j1nVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/rule/impl/PropsWriteBackRule");
    }

    @Override // tb.l02
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49e58cad", new Object[]{this});
        }
        return RuleType.PROPS_WRITE_BACK;
    }

    @Override // tb.l02
    public Map<String, Component> f(rxu rxuVar) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("49a1baac", new Object[]{this, rxuVar});
        }
        ym ymVar = rxuVar.d;
        ym ymVar2 = rxuVar.c;
        if (ymVar2 == null || ymVar == null) {
            return null;
        }
        HashMap hashMap4 = new HashMap();
        Component component = new Component();
        if (ymVar2.fields != null) {
            if (ymVar.fields != null) {
                hashMap3 = new HashMap(ymVar.fields);
            } else {
                hashMap3 = new HashMap();
            }
            component.fields = hashMap3;
            component.getFields().putAll(ymVar2.fields);
        }
        if (ymVar2.events != null) {
            if (ymVar.events != null) {
                hashMap2 = new HashMap(ymVar.events);
            } else {
                hashMap2 = new HashMap();
            }
            component.events = hashMap2;
            i(component.getEvents(), ymVar2.events);
        }
        if (ymVar2.f32185a != null) {
            if (ymVar.f32185a != null) {
                hashMap = new HashMap(ymVar.f32185a);
            } else {
                hashMap = new HashMap();
            }
            component.localFields = hashMap;
            component.getLocalFields().putAll(ymVar2.f32185a);
        }
        hashMap4.put(rxuVar.b, component);
        return hashMap4;
    }

    public final Event g(List<Event> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Event) ipChange.ipc$dispatch("d87880d5", new Object[]{this, list, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (Event event : list) {
            if (str.equals(event.getType())) {
                return event;
            }
        }
        return null;
    }

    public final void h(List<Event> list, List<Event> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99ba88ab", new Object[]{this, list, list2});
            return;
        }
        for (Event event : list2) {
            Event g = g(list, event.getType());
            if (g != null) {
                list.remove(g);
            }
            list.add(event);
        }
    }

    public final void i(Map<String, List<Event>> map, Map<String, List<Event>> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d9653e9", new Object[]{this, map, map2});
            return;
        }
        for (String str : map2.keySet()) {
            List<Event> list = map2.get(str);
            if (list != null) {
                List<Event> list2 = map.get(str);
                if (list2 == null) {
                    map.put(str, list);
                } else if (fj.d("enableNewActionParams", true)) {
                    h(list2, list);
                } else {
                    list2.addAll(list);
                }
            }
        }
    }
}
