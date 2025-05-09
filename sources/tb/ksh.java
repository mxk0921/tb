package tb;

import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.StdActions;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.inner2.SharedState;
import com.taobao.message.lab.comfrm.inner2.Transformer;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import java.util.LinkedHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ksh implements Transformer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(745537854);
        t2o.a(537919673);
    }

    public final SharedState a(Action action, SharedState sharedState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedState) ipChange.ipc$dispatch("2fe74bc8", new Object[]{this, action, sharedState});
        }
        if (ckf.b("updateRuntimeSwitchState", action.getName())) {
            Object data = action.getData();
            if (!(data instanceof JSONObject)) {
                data = null;
            }
            JSONObject jSONObject = (JSONObject) data;
            if (jSONObject != null) {
                JSONObject jSONObject2 = (JSONObject) sharedState.getRuntimeData("runtimeSwitchState", JSONObject.class, new JSONObject());
                jSONObject2.putAll(jSONObject);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("runtimeSwitchState", (Object) jSONObject2);
                SharedState updateRuntimeData = sharedState.updateRuntimeData(jSONObject3);
                ckf.c(updateRuntimeData, "oldState.updateRuntimeData(newData)");
                return updateRuntimeData;
            }
        }
        return sharedState;
    }

    public final boolean c(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1d51c0d", new Object[]{this, str, jSONObject})).booleanValue();
        }
        Boolean bool = jSONObject.getBoolean(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final void d(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64a4cbb8", new Object[]{this, str, jSONObject, jSONObject2, jSONObject3});
            return;
        }
        String string = jSONObject.getString("style");
        if (ckf.b(string, "linkStyle")) {
            String b = b(str);
            if (b == null || b.length() == 0) {
                b = jSONObject2.getString(str);
            }
            if (b != null && b.length() != 0) {
                jSONObject.put((JSONObject) "remindTitle", b);
            }
        } else if (ckf.b(string, "switchStyle")) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("switchStyle");
            if (jSONObject4 == null) {
                jSONObject4 = new JSONObject();
                jSONObject.put((JSONObject) "switchStyle", (String) jSONObject4);
            }
            boolean b2 = ckf.b("true", jSONObject4.getString("defaultSwitchState"));
            String string2 = jSONObject4.getString("remoteSwitchState");
            if (string2 == null) {
                Boolean bool = jSONObject2.getBoolean(str);
                if (bool != null) {
                    b2 = bool.booleanValue();
                }
            } else if (jSONObject3.getBoolean(str) != null) {
                b2 = jSONObject3.getBooleanValue(str);
            } else {
                b2 = ckf.b(string2, "true");
            }
            if (ckf.b(r0k.KEY_INLINE_VOLUME, str)) {
                b2 = !b2;
                str2 = ush.EVENT_HANDLER_SWITCH_REVERSE;
            } else {
                str2 = "";
            }
            jSONObject4.put((JSONObject) "switchStatus", (String) Boolean.valueOf(b2));
            if (ckf.b("timeFrameMute", str)) {
                if (b2) {
                    j9t e = j9t.e(Globals.getApplication(), "mytaobao");
                    ckf.c(e, "TaobaoGlobalSettings\n   …MTBConstant.MTB_BIZ_NAME)");
                    jSONObject.put((JSONObject) "remindTitle", x2m.INSTANCE.b((String) e.b().d("mytaobao", str + "Sub", "", null)));
                } else {
                    jSONObject.put((JSONObject) "remindTitle", "");
                }
                JSONObject jSONObject5 = jSONObject.getJSONObject("linkStyle");
                if (jSONObject5 == null) {
                    jSONObject5 = new JSONObject();
                    jSONObject.put((JSONObject) "linkStyle", (String) jSONObject5);
                }
                if (b2) {
                    jSONObject5.put((JSONObject) "eventName", ssh.EVENT_HANDLER_CLICK_PICKER);
                } else {
                    jSONObject5.put((JSONObject) "eventName", "");
                }
                str2 = ssh.EVENT_HANDLER_SWITCH_PICKER;
            }
            jSONObject4.put((JSONObject) "eventName", str2);
        }
    }

    public final String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("90ab2863", new Object[]{this, str});
        }
        if (ckf.b("video", str)) {
            int h = r0k.h();
            if (h == 1) {
                return Localization.q(R.string.mt_videoPlay4GAndWiFi_v1);
            }
            if (h != 2) {
                return Localization.q(R.string.mt_videoPlayWiFiOnly_v1);
            }
            return Localization.q(R.string.mt_videoPlayClose);
        } else if (ckf.b("region", str)) {
            return r0k.f();
        } else {
            if (ckf.b(r0k.KEY_CLEAN_CACHE, str)) {
                return " ";
            }
            return null;
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Transformer
    public SharedState transform(Action action, SharedState sharedState) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedState) ipChange.ipc$dispatch("e602685c", new Object[]{this, action, sharedState});
        }
        ckf.h(action, "action");
        ckf.h(sharedState, "sharedState");
        if (!ckf.b(StdActions.UPDATE_ORIGINAL_DATA, action.getName())) {
            return sharedState;
        }
        SharedState a2 = a(action, sharedState);
        JSONObject jSONObject2 = (JSONObject) a2.getOriginData("settingItemsSource", JSONObject.class, null);
        if (jSONObject2 == null || (jSONObject = (JSONObject) a2.getOriginData("settingStatusSource", JSONObject.class, null)) == null) {
            return a2;
        }
        JSONArray jSONArray = jSONObject2.getJSONArray("settingItems");
        if (jSONArray != null && !jSONArray.isEmpty()) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("settingItemStatus");
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
            }
            JSONObject jSONObject4 = jSONObject.getJSONObject("settingItemShowConfig");
            if (jSONObject4 == null) {
                jSONObject4 = new JSONObject();
            }
            JSONObject jSONObject5 = jSONObject.getJSONObject("runtimeSwitchState");
            if (jSONObject5 == null) {
                jSONObject5 = new JSONObject();
            }
            int i = 0;
            while (i < jSONArray.size()) {
                JSONObject jSONObject6 = jSONArray.getJSONObject(i);
                JSONArray jSONArray2 = jSONObject6 != null ? jSONObject6.getJSONArray("items") : null;
                if (jSONArray2 == null || jSONArray2.isEmpty()) {
                    jSONArray.remove(i);
                } else {
                    int i2 = 0;
                    while (i2 < jSONArray2.size()) {
                        JSONObject jSONObject7 = jSONArray2.getJSONObject(i2);
                        String string = jSONObject7 != null ? jSONObject7.getString("key") : null;
                        if (string == null || string.length() == 0) {
                            jSONArray2.remove(i2);
                        } else if (!c(string, jSONObject4)) {
                            jSONArray2.remove(i2);
                        } else {
                            d(string, jSONObject7, jSONObject3, jSONObject5);
                            i2++;
                        }
                    }
                    if (jSONArray2.isEmpty()) {
                        jSONArray.remove(i);
                    } else {
                        i++;
                    }
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("settingItems", jSONArray);
        return a2.updateRuntimeData(linkedHashMap);
    }
}
