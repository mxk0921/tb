package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class an {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(80740656);
    }

    public static rxu a(String str, AURARenderComponent aURARenderComponent, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rxu) ipChange.ipc$dispatch("70ef0b6a", new Object[]{str, aURARenderComponent, map});
        }
        rxu rxuVar = new rxu();
        rxuVar.f27667a = str;
        rxuVar.b = aURARenderComponent.key;
        rxuVar.c.fields = new HashMap();
        if (map != null) {
            rxuVar.c.fields.putAll(map);
        }
        rxuVar.d.fields = new HashMap();
        rxuVar.d.events = new HashMap();
        rxuVar.d.f32185a = new HashMap();
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData != null) {
            Map<String, Object> map2 = aURARenderComponentData.fields;
            if (map2 != null) {
                rxuVar.d.fields.putAll(map2);
            }
            Map<String, List<Event>> map3 = aURARenderComponent.data.events;
            if (map3 != null) {
                rxuVar.d.events.putAll(map3);
            }
            Map<String, Object> map4 = aURARenderComponent.data.localFields;
            if (map4 != null) {
                rxuVar.d.f32185a.putAll(map4);
            }
        }
        return rxuVar;
    }
}
