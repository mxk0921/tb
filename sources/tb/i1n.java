package tb;

import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class i1n extends k02 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(80740695);
    }

    public static /* synthetic */ Object ipc$super(i1n i1nVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/node/service/data/rule/impl/PropsWriteBackRule");
    }

    @Override // tb.k02
    public Map<String, Component> d(rxu rxuVar, k4e k4eVar) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("66f336e2", new Object[]{this, rxuVar, k4eVar});
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
            e(component.getEvents(), ymVar2.events);
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

    public final void e(Map<String, List<Event>> map, Map<String, List<Event>> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d9653e9", new Object[]{this, map, map2});
            return;
        }
        for (String str : map2.keySet()) {
            List<Event> list = map2.get(str);
            if (list != null) {
                List<Event> list2 = map.get(str);
                if (list2 != null) {
                    list2.addAll(list);
                } else {
                    map.put(str, list);
                }
            }
        }
    }
}
