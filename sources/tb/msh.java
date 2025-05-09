package tb;

import android.content.SharedPreferences;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.StdActions;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.inner2.Command;
import com.taobao.message.lab.comfrm.inner2.Source;
import com.taobao.utils.Global;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class msh implements Source<JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f24271a = true;
    public final JSONObject b = new JSONObject();

    static {
        t2o.a(745537856);
        t2o.a(537919645);
    }

    /* renamed from: a */
    public JSONObject updateOriginalData(Action action, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f961e72e", new Object[]{this, action, jSONObject});
        }
        return null;
    }

    public final JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1849279e", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) r0k.KEY_FONT_SIZE, (String) Boolean.valueOf(r0k.t()));
        jSONObject.put((JSONObject) r0k.KEY_NETWORK_DIAGNOSE, (String) Boolean.valueOf(r0k.v()));
        jSONObject.put((JSONObject) r0k.KEY_NETWORK_SPEEDUP, (String) Boolean.valueOf(r0k.w()));
        jSONObject.put((JSONObject) r0k.KEY_LIVE_BACKGROUND_PLAY, (String) Boolean.valueOf(r0k.s()));
        jSONObject.put((JSONObject) r0k.KEY_VISIT_OFTEN_SHOP, (String) Boolean.valueOf(r0k.C()));
        jSONObject.put((JSONObject) r0k.KEY_VISIT_OFTEN_LIVE, (String) Boolean.valueOf(r0k.B()));
        jSONObject.put((JSONObject) "ocr", (String) Boolean.valueOf(r0k.x()));
        jSONObject.put((JSONObject) r0k.KEY_ASSISTANT, (String) Boolean.valueOf(r0k.r()));
        jSONObject.put((JSONObject) r0k.KEY_TAOBAO_HELPER, (String) Boolean.valueOf(r0k.z()));
        jSONObject.put((JSONObject) r0k.KEY_TMALL_NOTIFY, (String) Boolean.valueOf(r0k.A()));
        jSONObject.put((JSONObject) r0k.KEY_VOICE_ASSISTANT, (String) Boolean.valueOf(r0k.m()));
        jSONObject.put((JSONObject) r0k.KEY_WIFI_AUTO_DOWNLOAD, (String) Boolean.valueOf(r0k.D()));
        jSONObject.put((JSONObject) "mute", (String) Boolean.valueOf(r0k.u()));
        jSONObject.put((JSONObject) "ocr", (String) Boolean.valueOf(sgj.c(Global.getApplication())));
        return jSONObject;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public void subscribe(ActionDispatcher actionDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c519475", new Object[]{this, actionDispatcher});
        } else {
            ckf.h(actionDispatcher, "actionDispatcher");
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public void use(Command command, Map<String, Object> map, ActionDispatcher actionDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1c59d34", new Object[]{this, command, map, actionDispatcher});
            return;
        }
        ckf.h(command, "command");
        if (ckf.b(command.getName(), "updateStatus")) {
            if (this.f24271a) {
                this.f24271a = false;
                return;
            }
        } else if (ckf.b(command.getName(), "updateRuntimeSwitchState")) {
            Object data = command.getData();
            if (!(data instanceof JSONObject)) {
                data = null;
            }
            JSONObject jSONObject = (JSONObject) data;
            if (jSONObject != null) {
                boolean booleanValue = jSONObject.getBooleanValue("refresh");
                this.b.putAll(jSONObject.getJSONObject("kvs"));
                if (!booleanValue) {
                    return;
                }
            } else {
                return;
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        SharedPreferences c = tfp.c();
        ckf.c(c, "SettingStateUtils.getUserSettingStateTable()");
        jSONObject2.putAll(c.getAll());
        Map<String, Object> a2 = m81.a();
        if (a2 != null) {
            jSONObject2.putAll(a2);
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put((JSONObject) "settingItemStatus", (String) jSONObject2);
        jSONObject3.put((JSONObject) "settingItemShowConfig", (String) b());
        jSONObject3.put((JSONObject) "runtimeSwitchState", (String) this.b);
        if (actionDispatcher != null) {
            actionDispatcher.dispatch(new Action.Build(StdActions.UPDATE_ORIGINAL_DATA).data(jSONObject3).build());
        }
    }
}
