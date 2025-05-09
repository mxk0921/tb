package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
@AURAExtensionImpl(code = wm.CODE)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class wm extends ws {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CODE = "aura.impl.event.routerEvent";
    public static final String EVENT_TYPE = "routerEvent";
    public List<AURARenderComponent> e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends pt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(wm wmVar) {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -1339997787) {
                super.b((mi) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/event/routerEvent/AURARouterEvent$1");
        }

        @Override // tb.pt, tb.hbb
        public void b(mi miVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
                return;
            }
            super.b(miVar);
            ck.g().e("AURARouterEventExtension", miVar.e());
        }
    }

    static {
        t2o.a(81789085);
    }

    public static /* synthetic */ Object ipc$super(wm wmVar, String str, Object... objArr) {
        if (str.hashCode() == -1162528052) {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (hbb) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/event/routerEvent/AURARouterEvent");
    }

    @Override // tb.ws
    public void K0(AURAEventIO aURAEventIO) {
        AURARenderComponentData aURARenderComponentData;
        Map<String, List<Event>> map;
        List<Event> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53a1928f", new Object[]{this, aURAEventIO});
            return;
        }
        qi eventModel = aURAEventIO.getEventModel();
        JSONObject c = eventModel.c();
        if (c == null) {
            ck.g().a("AURARouterEventExtension", "innerHandleEvent", "eventsFields is null!");
            return;
        }
        String string = c.getString(hxj.EVENT_KEY);
        String string2 = c.getString("target");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            ck.g().a("AURARouterEventExtension", "innerHandleEvent", "eventKey or target is null!");
            return;
        }
        List<AURARenderComponent> list2 = this.e;
        if (list2 == null) {
            ck.g().a("AURARouterEventExtension", "innerHandleEvent", "globalData auraRenderComponents is null!");
            return;
        }
        for (AURARenderComponent aURARenderComponent : list2) {
            if (!(!string2.equals(aURARenderComponent.key) || (aURARenderComponentData = aURARenderComponent.data) == null || (map = aURARenderComponentData.events) == null || (list = map.get(string)) == null)) {
                Q0(aURARenderComponent, P0(list, c), eventModel.a());
            }
        }
    }

    public final void O0(List<Event> list, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3caec9f3", new Object[]{this, list, jSONArray});
            return;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            Event T0 = T0(jSONArray.get(i));
            if (T0 != null) {
                list.add(T0);
            }
        }
    }

    public final List<Event> P0(List<Event> list, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("98489cdd", new Object[]{this, list, jSONObject});
        }
        JSONArray jSONArray = jSONObject.getJSONArray("prependActions");
        JSONArray jSONArray2 = jSONObject.getJSONArray("appendActions");
        JSONArray jSONArray3 = jSONObject.getJSONArray("replaceActions");
        if (jSONArray3 == null && jSONArray == null && jSONArray2 == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Event event : list) {
            try {
                arrayList.add(event.clone());
            } catch (Throwable th) {
                M0(EVENT_TYPE, "clone exception " + th.getMessage());
                rbb g = ck.g();
                g.d("clone exception " + th.getMessage());
                return list;
            }
        }
        if (jSONArray3 != null) {
            S0(arrayList, new JSONArray(new ArrayList(jSONArray3)));
        }
        if (jSONArray != null) {
            R0(arrayList, jSONArray);
        }
        if (jSONArray2 != null) {
            O0(arrayList, jSONArray2);
        }
        return arrayList;
    }

    public final void Q0(AURARenderComponent aURARenderComponent, List<Event> list, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("192698c5", new Object[]{this, aURARenderComponent, list, objArr});
            return;
        }
        for (Event event : list) {
            qi qiVar = new qi();
            qiVar.p(event.getId());
            qiVar.t(aURARenderComponent);
            qiVar.l(objArr);
            qiVar.o(event.getTag());
            qiVar.n(event.getFields());
            pi.c(J0().c(), event.getType(), qiVar, new a(this));
        }
    }

    public final void R0(List<Event> list, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ae968b6", new Object[]{this, list, jSONArray});
            return;
        }
        ArrayList arrayList = new ArrayList(jSONArray.size());
        for (int i = 0; i < jSONArray.size(); i++) {
            Event T0 = T0(jSONArray.get(i));
            if (T0 != null) {
                arrayList.add(T0);
            }
        }
        if (!arrayList.isEmpty()) {
            list.addAll(0, arrayList);
        }
    }

    public final void S0(List<Event> list, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6932190d", new Object[]{this, list, jSONArray});
            return;
        }
        for (Event event : list) {
            if (event.getType() != null) {
                Iterator<Object> it = jSONArray.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (next instanceof JSONObject) {
                            JSONObject jSONObject = (JSONObject) next;
                            if (event.getType().equals(jSONObject.getString("type"))) {
                                event.setFields(jSONObject.getJSONObject("fields"));
                                it.remove();
                                break;
                            }
                        }
                    }
                }
            }
        }
    }

    public final Event T0(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Event) ipChange.ipc$dispatch("50e9b11d", new Object[]{this, obj});
        }
        if (!(obj instanceof JSONObject)) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        Event event = new Event();
        event.setFields(jSONObject.getJSONObject("fields"));
        event.type = jSONObject.getString("type");
        return event;
    }

    @Override // tb.ws, tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
            return;
        }
        super.onDataChanged(aURAFlowData, aURAGlobalData, hbbVar);
        this.e = (List) aURAGlobalData.get("render_view_item_models", List.class);
    }

    @Override // tb.ibb
    public String t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45cb977b", new Object[]{this});
        }
        return EVENT_TYPE;
    }
}
