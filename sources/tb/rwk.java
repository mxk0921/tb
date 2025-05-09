package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.channel.desktoplinktask.floatwindow.model.WindowStyleModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class rwk extends z12 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(435159120);
    }

    public static /* synthetic */ Object ipc$super(rwk rwkVar, String str, Object... objArr) {
        if (str.hashCode() == -115521698) {
            rwkVar.o((agu) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/desktop/channel/desktoplinktask/widgetservice/processor/OnceEventTaskProcessor");
    }

    @Override // tb.z12
    public void b(shx shxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff2bc05e", new Object[]{this, shxVar});
        }
    }

    @Override // tb.z12
    public JSONObject c(shx shxVar) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d054c057", new Object[]{this, shxVar});
        }
        agu aguVar = shxVar.f28064a;
        if (aguVar == null || (jSONObject = aguVar.d) == null) {
            return null;
        }
        try {
            jSONObject2 = JSON.parseObject(jSONObject.getString("config"));
        } catch (Throwable th) {
            th.printStackTrace();
            jSONObject2 = null;
        }
        if (jSONObject2 == null) {
            l(shxVar, abu.FUNNEL_STEP_LAUNCH_WIDGET, "paramContentEmpty", "");
            return null;
        } else if (jSONObject2.getLongValue("validTimestamp") < System.currentTimeMillis() / 1000) {
            l(shxVar, abu.FUNNEL_STEP_LAUNCH_WIDGET, "validTimestampCheckFail", "");
            return null;
        } else if (!f(aguVar)) {
            return null;
        } else {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("context");
            JSONObject jSONObject4 = new JSONObject();
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
            }
            jSONObject4.put("context", (Object) jSONObject3);
            jSONObject4.put("notifyEnable", (Object) zd7.g(sd7.d().a()));
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("androidFloatWindow", (Object) jSONObject4.toJSONString());
            return jSONObject5;
        }
    }

    @Override // tb.z12
    public boolean e(shx shxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb1e3315", new Object[]{this, shxVar})).booleanValue();
        }
        return false;
    }

    @Override // tb.z12
    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return "application";
    }

    @Override // tb.z12
    public void i(shx shxVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a13f061", new Object[]{this, shxVar, str});
        } else {
            l(shxVar, abu.FUNNEL_STEP_AFTER_REQUEST, "mtopFailed.APIFailed", str);
        }
    }

    @Override // tb.z12
    public void j(shx shxVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a7d665e", new Object[]{this, shxVar, jSONObject});
            return;
        }
        agu aguVar = shxVar.f28064a;
        JSONObject jSONObject2 = jSONObject.getJSONObject(e9.TAK_ABILITY_MATCH_CONTENT);
        if (jSONObject2 == null) {
            l(shxVar, abu.FUNNEL_STEP_AFTER_REQUEST, "mtopFailed.NoMatchContent", "");
            return;
        }
        String string = jSONObject2.getString("bizCode");
        String string2 = jSONObject2.getString("dslContent");
        String string3 = jSONObject2.getString("dataContent");
        aguVar.c = string;
        if (!ep9.h().c(shxVar)) {
            yv8.a("OnceEventTaskProcessor.onDataFetchSuccess.addNewRequestFailed.sameBizCode.alreadyPopping.cancel.bizCode=%s", string);
            k(aguVar, abu.FUNNEL_STEP_LAUNCH_WIDGET, "OnceEventTaskProcessor.triggerFailed.onDataFetchSuccess.AlreadyPopping", "");
            return;
        }
        this.f32455a.j(shxVar, string2, string3, (WindowStyleModel) jSONObject2.getObject("style", WindowStyleModel.class), null);
    }
}
