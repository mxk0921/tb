package tb;

import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class wsr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(790626550);
    }

    public static /* synthetic */ void d(ExecuteResult executeResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cb90603", new Object[]{executeResult});
        } else {
            wdm.d("Broadcast.removeEventListener.receiveEvent", new Object[0]);
        }
    }

    public static void e(AbilityHubAdapter abilityHubAdapter, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8c0a5b7", new Object[]{abilityHubAdapter, str});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bizId", (Object) ("PopHub." + str));
            jSONObject.put("eventName", (Object) "common");
            jSONObject.put("once", (Object) Boolean.FALSE);
            abilityHubAdapter.j("broadcast", "addEventListener", new xq(), jSONObject, new s2d() { // from class: tb.vsr
                @Override // tb.s2d
                public final void onCallback(ExecuteResult executeResult) {
                    wsr.c(executeResult);
                }
            });
        } catch (Throwable th) {
            wdm.h("TBPopHubAbility.broadcast.addEventListener.error", th);
        }
    }

    public static void f(AbilityHubAdapter abilityHubAdapter, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cbd0e17", new Object[]{abilityHubAdapter, str});
        } else if (abilityHubAdapter != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("bizId", (Object) ("PopHub." + str));
                jSONObject.put("eventName", (Object) "common");
                abilityHubAdapter.j("broadcast", "removeEventListener", new xq(), jSONObject, new s2d() { // from class: tb.usr
                    @Override // tb.s2d
                    public final void onCallback(ExecuteResult executeResult) {
                        wsr.d(executeResult);
                    }
                });
            } catch (Throwable th) {
                wdm.h("TBPopHubAbility.broadcast.removeEventListener.error", th);
            }
        }
    }

    public static /* synthetic */ void c(ExecuteResult executeResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8671ac48", new Object[]{executeResult});
            return;
        }
        try {
            wdm.d("Broadcast.addEventListener.receiveEvent", new Object[0]);
            if (executeResult.getStatusCode() == 1) {
                Map<String, Object> data = executeResult.getData();
                if (data == null) {
                    wdm.d("TBPopHubEventListener.addEventListener.data=null.return", new Object[0]);
                    return;
                }
                Object obj = data.get("detail");
                if (obj instanceof JSONObject) {
                    String string = ((JSONObject) obj).getString("event");
                    JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                    JSONObject jSONObject2 = new JSONObject();
                    if (rgm.PAGE_EVENT_SCROLL_STATE_CHANGED.equals(string)) {
                        String string2 = jSONObject.getString("newState");
                        if ("idle".equals(string2)) {
                            jSONObject2.put("newState", (Object) 0);
                        } else if (fzo.SCROLLING.equals(string2)) {
                            jSONObject2.put("newState", (Object) 1);
                        }
                    } else {
                        jSONObject2.putAll(jSONObject);
                    }
                    rgm.h().p("PopHub", string, jSONObject2, new JSONObject());
                }
            }
        } catch (Throwable th) {
            wdm.h("TBPopHubAbility.broadcast.addEventListener.executeResult.error", th);
        }
    }
}
