package tb;

import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.message.lab.comfrm.StdActions;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.inner2.Command;
import com.taobao.message.lab.comfrm.inner2.Source;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import java.util.Map;
import tb.gl6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class hdx implements Source<JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ActionDispatcher f20567a;
    public final JSONArray b = new JSONArray();
    public j9t c;

    static {
        t2o.a(745537873);
        t2o.a(537919645);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        this.f20567a = null;
        this.c = null;
    }

    /* renamed from: e */
    public JSONObject updateOriginalData(Action action, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f961e72e", new Object[]{this, action, jSONObject});
        }
        ckf.h(action, "updateAction");
        return null;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public void subscribe(ActionDispatcher actionDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c519475", new Object[]{this, actionDispatcher});
            return;
        }
        ckf.h(actionDispatcher, "actionDispatcher");
        this.f20567a = actionDispatcher;
        this.c = j9t.e(Globals.getApplication(), "mytaobao");
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public void use(Command command, Map<String, Object> map, ActionDispatcher actionDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1c59d34", new Object[]{this, command, map, actionDispatcher});
            return;
        }
        ckf.h(command, "command");
        ckf.h(map, "props");
        ckf.h(actionDispatcher, "actionDispatcher");
        String name = command.getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != -106319668) {
                if (hashCode == 254455115 && name.equals(StdActions.COMMAND_INIT_SOURCE)) {
                    b();
                }
            } else if (name.equals("changeSelect")) {
                Object data = command.getData();
                if (!(data instanceof String)) {
                    data = null;
                }
                String str = (String) data;
                if (str != null) {
                    d(str);
                    c(str);
                }
            }
        }
    }

    public final void b() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
            return;
        }
        j9t j9tVar = this.c;
        if (j9tVar != null) {
            if (ulp.c(Globals.getApplication()).a("Global_App_Video_Play_Network_Type")) {
                i = j9tVar.b().e(0);
            } else {
                i = j9tVar.b().e(1);
            }
            j9tVar.c().b(i);
            r0k.P("video", Integer.valueOf(i));
            this.b.clear();
            JSONObject jSONObject = new JSONObject();
            this.b.add(jSONObject);
            JSONArray jSONArray = new JSONArray();
            jSONObject.put((JSONObject) "items", (String) jSONArray);
            String q = Localization.q(R.string.mt_videoPlay4GAndWiFi_v1);
            ckf.c(q, "Localization.localizedSt…mt_videoPlay4GAndWiFi_v1)");
            jSONArray.add(a(1, q, i));
            String q2 = Localization.q(R.string.mt_videoPlayWiFiOnly_v1);
            ckf.c(q2, "Localization.localizedSt….mt_videoPlayWiFiOnly_v1)");
            jSONArray.add(a(0, q2, i));
            String q3 = Localization.q(R.string.mt_videoPlayClose);
            ckf.c(q3, "Localization.localizedSt…string.mt_videoPlayClose)");
            jSONArray.add(a(2, q3, i));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put((JSONObject) "settingItems", (String) this.b);
            ActionDispatcher actionDispatcher = this.f20567a;
            if (actionDispatcher != null) {
                actionDispatcher.dispatch(new Action.Build(StdActions.UPDATE_ORIGINAL_DATA).data(jSONObject2).build());
            }
        }
    }

    public final void c(String str) {
        ehb c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("903e3c8b", new Object[]{this, str});
            return;
        }
        Integer m = ssq.m(String.valueOf(str.charAt(str.length() - 1)));
        if (m != null) {
            int intValue = m.intValue();
            if (intValue == 1 || intValue == 0 || intValue == 2) {
                j9t j9tVar = this.c;
                if (!(j9tVar == null || (c = j9tVar.c()) == null)) {
                    c.b(intValue);
                }
                r0k.P("video", m);
            }
        }
    }

    public final void d(String str) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7823085f", new Object[]{this, str});
            return;
        }
        Object c0 = i04.c0(this.b);
        if (!(c0 instanceof JSONObject)) {
            c0 = null;
        }
        JSONObject jSONObject = (JSONObject) c0;
        if (!(jSONObject == null || (jSONArray = jSONObject.getJSONArray("items")) == null)) {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                JSONObject jSONObject3 = jSONObject2.getJSONObject("selectStyle");
                if (jSONObject3 != null) {
                    jSONObject3.put("selectStatus", (Object) Boolean.valueOf(ckf.b(str, jSONObject2.getString("key"))));
                }
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put((JSONObject) "settingItems", (String) this.b);
            ActionDispatcher actionDispatcher = this.f20567a;
            if (actionDispatcher != null) {
                actionDispatcher.dispatch(new Action.Build(StdActions.UPDATE_ORIGINAL_DATA).data(jSONObject4).build());
            }
        }
    }

    public final JSONObject a(int i, String str, int i2) {
        String str2;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("29521c5e", new Object[]{this, new Integer(i), str, new Integer(i2)});
        }
        if (i2 == i) {
            z = true;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) hpl.IS_CLICK, "true");
        if (i == 1) {
            str2 = "VideoPlay-allon";
        } else if (i != 2) {
            str2 = "VideoPlay-WIFI";
        } else {
            str2 = "VideoPlay-alloff";
        }
        JSONObject jSONObject2 = new JSONObject();
        gl6.a aVar = gl6.Companion;
        JSONObject a2 = aVar.a("Page_TBGeneralSettingVC", "Page_TBGeneralSettingVC_Button-".concat(str2), jSONObject);
        jSONObject2.put((JSONObject) "click", (String) a2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put((JSONObject) "key", "video_" + i);
        jSONObject3.put((JSONObject) "title", str);
        jSONObject3.put((JSONObject) "style", "selectStyle");
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put((JSONObject) "selectStatus", (String) Boolean.valueOf(z));
        jSONObject4.put((JSONObject) "eventName", rm6.EVENT_HANDLER_SETTING_VIDEO);
        jSONObject3.put((JSONObject) "selectStyle", (String) jSONObject4);
        jSONObject3.put((JSONObject) BHRTaskConfigBase.TYPE_CONFIG_UT, (String) jSONObject2);
        if (z) {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put((JSONObject) hpl.IS_CLICK, "false");
            a2.put((JSONObject) "args", (String) jSONObject5);
            aVar.b(a2, 2101);
            a2.put((JSONObject) "args", (String) jSONObject);
        }
        return jSONObject3;
    }
}
