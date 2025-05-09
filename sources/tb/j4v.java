package tb;

import com.alibaba.analytics.core.model.Log;
import com.alibaba.appmonitor.event.EventType;
import com.alibaba.appmonitor.model.UTDimensionValueSet;
import com.alibaba.appmonitor.pool.ReuseJSONArray;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class j4v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(962593071);
    }

    public static void a(w0v w0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a75afb", new Object[]{w0vVar});
        } else if (w0vVar != null) {
            ofh.l().d(new Log(null, String.valueOf(w0vVar.f30388a), w0vVar.b, w0vVar.c, null, w0vVar.d));
            to1.a().c(w0vVar);
        }
    }

    public static void c(w0v w0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("534b6f51", new Object[]{w0vVar});
            return;
        }
        w0vVar.getClass();
        ofh.l().d(new Log(null, String.valueOf(w0vVar.f30388a), w0vVar.b, w0vVar.c, null, w0vVar.d));
        to1.a().c(w0vVar);
    }

    public static void b(UTDimensionValueSet uTDimensionValueSet, ej8 ej8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d4c7ca5", new Object[]{uTDimensionValueSet, ej8Var});
            return;
        }
        Integer eventId = uTDimensionValueSet.getEventId();
        if (eventId != null) {
            EventType eventType = EventType.getEventType(eventId.intValue());
            w0v w0vVar = (w0v) to1.a().d(w0v.class, new Object[0]);
            w0vVar.f30388a = 6699;
            w0vVar.b = ej8Var.f18612a;
            w0vVar.c = ej8Var.b;
            ((HashMap) w0vVar.d).putAll(j71.c());
            if (uTDimensionValueSet.getMap() != null) {
                ((HashMap) w0vVar.d).putAll(uTDimensionValueSet.getMap());
                ((HashMap) w0vVar.d).remove("commitDay");
            }
            HashMap hashMap = new HashMap();
            hashMap.put("meta", ozo.b());
            hashMap.put("_event_id", eventId);
            ReuseJSONArray reuseJSONArray = (ReuseJSONArray) to1.a().d(ReuseJSONArray.class, new Object[0]);
            reuseJSONArray.add(ej8Var.b());
            to1.a().c(ej8Var);
            hashMap.put("data", reuseJSONArray);
            ((HashMap) w0vVar.d).put(eventType.getAggregateEventArgsKey(), JSON.toJSONString(hashMap));
            ((HashMap) w0vVar.d).put(oeh.EVENTID, "6699");
            c(w0vVar);
            to1.a().c(reuseJSONArray);
        }
    }

    public static void d(Map<UTDimensionValueSet, List<ej8>> map) {
        Integer eventId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51739a65", new Object[]{map});
            return;
        }
        for (Map.Entry<UTDimensionValueSet, List<ej8>> entry : map.entrySet()) {
            StringBuilder c = iqq.a().c();
            StringBuilder c2 = iqq.a().c();
            UTDimensionValueSet key = entry.getKey();
            List<ej8> value = entry.getValue();
            if (!(value.size() == 0 || (eventId = key.getEventId()) == null)) {
                EventType eventType = EventType.getEventType(eventId.intValue());
                w0v w0vVar = (w0v) to1.a().d(w0v.class, new Object[0]);
                w0vVar.f30388a = eventId.intValue();
                ((HashMap) w0vVar.d).putAll(j71.c());
                if (key.getMap() != null) {
                    ((HashMap) w0vVar.d).putAll(key.getMap());
                    ((HashMap) w0vVar.d).remove("commitDay");
                }
                HashMap hashMap = new HashMap();
                hashMap.put("meta", ozo.b());
                ReuseJSONArray reuseJSONArray = (ReuseJSONArray) to1.a().d(ReuseJSONArray.class, new Object[0]);
                int i = 0;
                for (ej8 ej8Var : value) {
                    reuseJSONArray.add(ej8Var.b());
                    if (i == 0) {
                        c.append(ej8Var.f18612a);
                        c2.append(ej8Var.b);
                    } else {
                        c.append(",");
                        c.append(ej8Var.f18612a);
                        c2.append(",");
                        c2.append(ej8Var.b);
                    }
                    i++;
                    to1.a().c(ej8Var);
                }
                hashMap.put("data", reuseJSONArray);
                ((HashMap) w0vVar.d).put(eventType.getAggregateEventArgsKey(), JSON.toJSONString(hashMap));
                String sb = c.toString();
                iqq.a().b(c);
                String sb2 = c2.toString();
                iqq.a().b(c2);
                ((HashMap) w0vVar.d).put(oeh.ARG1, sb);
                ((HashMap) w0vVar.d).put(oeh.ARG2, sb2);
                w0vVar.b = sb;
                w0vVar.c = sb2;
                c(w0vVar);
                to1.a().c(reuseJSONArray);
            }
            to1.a().c(key);
        }
    }
}
