package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.List;
import java.util.Map;
import tb.sg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ph extends ts {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_UTAP = 38447420286L;

    static {
        t2o.a(81789051);
    }

    public static /* synthetic */ Object ipc$super(ph phVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/event/AURADXUTapEventHandler");
    }

    @Override // tb.ts
    public boolean c(qi qiVar, nbb nbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c89c5f99", new Object[]{this, qiVar, nbbVar})).booleanValue();
        }
        Map<String, List<Event>> h = h(qiVar);
        if (h == null || h.isEmpty()) {
            b4e a2 = dxu.a();
            a2.e("AURADXUTapEventHandler", "handleEvent#there is no events in component," + qiVar.j());
            return false;
        }
        g(qiVar, h, nbbVar);
        return true;
    }

    public final void g(qi qiVar, Map<String, List<Event>> map, nbb nbbVar) {
        List<Event> value;
        qi qiVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dee8440", new Object[]{this, qiVar, map, nbbVar});
            return;
        }
        String d = qiVar.d();
        sg.a(new sg.a(nbbVar, qiVar.j(), null, qiVar.d()));
        for (Map.Entry<String, List<Event>> entry : map.entrySet()) {
            if (entry != null && d.equals(entry.getKey()) && (value = entry.getValue()) != null && !value.isEmpty()) {
                int size = value.size();
                for (Event event : value) {
                    if (size > 1) {
                        qiVar2 = new qi(qiVar);
                    } else {
                        qiVar2 = qiVar;
                    }
                    qiVar2.n(event.getFields());
                    b(event.getType(), qiVar2, nbbVar);
                }
            }
        }
    }

    public final Map<String, List<Event>> h(qi qiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5c768c41", new Object[]{this, qiVar});
        }
        Map<String, List<Event>> j = j(qiVar);
        if (j == null || j.isEmpty()) {
            return i(qiVar);
        }
        return j;
    }

    public final Map<String, List<Event>> i(qi qiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b514611f", new Object[]{this, qiVar});
        }
        AURARenderComponent j = qiVar.j();
        if (j == null) {
            dxu.a().e("AURADXUTapEventHandler", "handleEvent#UMFRenderComponentData is null");
            return null;
        }
        AURARenderComponentData aURARenderComponentData = j.data;
        if (aURARenderComponentData != null) {
            return aURARenderComponentData.events;
        }
        dxu.a().e("AURADXUTapEventHandler", "handleEvent#UMFRenderComponentData is null");
        return null;
    }

    public final Map<String, List<Event>> j(qi qiVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3b79ab35", new Object[]{this, qiVar});
        }
        Object[] a2 = qiVar.a();
        if (a2 == null || a2.length <= 1) {
            return null;
        }
        Object obj = a2[1];
        if (!(obj instanceof JSONObject) || (jSONObject = ((JSONObject) obj).getJSONObject("_eventConfig")) == null) {
            return null;
        }
        return s1n.b(jSONObject);
    }

    @Override // tb.ob5, tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }
}
