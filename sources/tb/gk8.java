package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.nativerender.dsl.EventActionModel;
import com.taobao.tbpoplayer.nativerender.dsl.EventModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateBaseModel;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class gk8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(790626384);
    }

    public static void a(oe8 oe8Var, StateBaseModel stateBaseModel, JSONObject jSONObject) {
        EventActionModel eventActionModel;
        EventActionModel eventActionModel2;
        EventModel eventModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0c6594f", new Object[]{oe8Var, stateBaseModel, jSONObject});
        } else if (oe8Var != null && stateBaseModel != null && jSONObject != null) {
            try {
                String string = jSONObject.getString("sourceName");
                String string2 = jSONObject.getString("event");
                JSONObject jSONObject2 = jSONObject.getJSONObject("content");
                if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && jSONObject2 != null) {
                    EventModel eventModel2 = stateBaseModel.event;
                    if (eventModel2 != null && eventModel2.isValid()) {
                        Iterator<EventActionModel> it = eventModel2.action.iterator();
                        while (it.hasNext()) {
                            eventActionModel = it.next();
                            if (eventActionModel != null && eventActionModel.isValid() && eventActionModel.sourceName.equals(string) && eventActionModel.eventName.equals(string2)) {
                                break;
                            }
                        }
                    }
                    eventActionModel = null;
                    if (eventActionModel == null && (eventModel = oe8Var.j().p().event) != null && eventModel.isValid()) {
                        for (EventActionModel eventActionModel3 : eventModel.action) {
                            if (eventActionModel3 != null && eventActionModel3.isValid() && eventActionModel3.sourceName.equals(string) && eventActionModel3.eventName.equals(string2)) {
                                eventActionModel2 = eventActionModel3;
                                break;
                            }
                        }
                    }
                    eventActionModel2 = eventActionModel;
                    if (eventActionModel2 != null) {
                        b(oe8Var, stateBaseModel, eventActionModel2, string, string2, jSONObject2);
                        wdm.d("EventHandler.eventInfo=%s.handleEvent=%s.", jSONObject, eventActionModel2);
                    }
                }
            } catch (Throwable th) {
                wdm.h("EventHandler.handleEvent.error", th);
            }
        }
    }

    public static void b(oe8 oe8Var, StateBaseModel stateBaseModel, EventActionModel eventActionModel, String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("308233bf", new Object[]{oe8Var, stateBaseModel, eventActionModel, str, str2, jSONObject});
            return;
        }
        try {
            long j = eventActionModel.listenTimes;
            if (j <= 0 || eventActionModel.costTimes < j) {
                List<EventActionModel.ConditionHandleModel> list = eventActionModel.onEvent;
                oe8Var.A(str, str2, jSONObject);
                if (list != null && !list.isEmpty()) {
                    for (EventActionModel.ConditionHandleModel conditionHandleModel : list) {
                        if (conditionHandleModel != null && conditionHandleModel.isValid()) {
                            boolean a2 = af4.a(conditionHandleModel.condition, oe8Var, false);
                            wdm.d("EventHandler.handleSceneEvent.conditionHandleModel=%s.checkResult=%s", conditionHandleModel, Boolean.valueOf(a2));
                            if (a2) {
                                eventActionModel.costTimes++;
                                if ("click".equals(conditionHandleModel.action.type)) {
                                    conditionHandleModel.action.type = "scene";
                                }
                                oe8Var.l(stateBaseModel, "scene", conditionHandleModel.action, conditionHandleModel.actions);
                                return;
                            }
                        }
                    }
                    return;
                }
                eventActionModel.costTimes++;
                if ("click".equals(eventActionModel.action.type)) {
                    eventActionModel.action.type = "scene";
                }
                oe8Var.l(stateBaseModel, "scene", eventActionModel.action, eventActionModel.actions);
                wdm.d("EventHandler.handleSceneEvent.conditionHandle.IsEmpty.sceneEventModel=%s.", eventActionModel);
                return;
            }
            wdm.d("EventHandler.handleSceneEvent.listenTimes.IsMax.return.listenTimes=%s.costTimes=%s", Long.valueOf(j), Integer.valueOf(eventActionModel.costTimes));
        } catch (Throwable th) {
            wdm.h("EventHandler.handleSceneEvent.error", th);
        }
    }
}
