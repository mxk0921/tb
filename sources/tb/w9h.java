package tb;

import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.channel.desktoplinktask.floatwindow.a;
import com.taobao.desktop.channel.desktoplinktask.floatwindow.model.WindowStyleModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class w9h extends z12 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements a.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f30531a;
        public final /* synthetic */ agu b;
        public final /* synthetic */ shx c;

        public a(String str, agu aguVar, shx shxVar) {
            this.f30531a = str;
            this.b = aguVar;
            this.c = shxVar;
        }

        @Override // com.taobao.desktop.channel.desktoplinktask.floatwindow.a.b
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c622f32", new Object[]{this});
            }
        }

        @Override // com.taobao.desktop.channel.desktoplinktask.floatwindow.a.b
        public void e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("826e5e03", new Object[]{this, str});
            } else {
                w9h.this.l(this.c, abu.FUNNEL_STEP_VIEW_LOAD, str, "");
            }
        }

        @Override // com.taobao.desktop.channel.desktoplinktask.floatwindow.a.b
        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4eb0d49", new Object[]{this});
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("bizCode", this.f30531a);
            w9h.this.n(this.b.e, 2, bundle);
            w9h.this.m(this.c);
        }
    }

    static {
        t2o.a(435159118);
    }

    public static /* synthetic */ Object ipc$super(w9h w9hVar, String str, Object... objArr) {
        if (str.hashCode() == -115521698) {
            w9hVar.o((agu) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/desktop/channel/desktoplinktask/widgetservice/processor/LocalTaskProcessor");
    }

    @Override // tb.z12
    public void b(shx shxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff2bc05e", new Object[]{this, shxVar});
        } else {
            n(shxVar.f28064a.e, 3, null);
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
    public JSONObject c(shx shxVar) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d054c057", new Object[]{this, shxVar});
        }
        agu aguVar = shxVar.f28064a;
        JSONObject jSONObject3 = null;
        if (!(aguVar == null || (jSONObject = aguVar.d) == null)) {
            String string = jSONObject.getString("config");
            if (TextUtils.isEmpty(string)) {
                l(shxVar, abu.FUNNEL_STEP_LAUNCH_WIDGET, "paramContentEmpty", "");
                return null;
            }
            try {
                jSONObject2 = JSON.parseObject(string);
            } catch (Throwable th) {
                th.printStackTrace();
                jSONObject2 = null;
            }
            if (jSONObject2 == null) {
                l(shxVar, abu.FUNNEL_STEP_LAUNCH_WIDGET, "contentInvalid", "");
                return null;
            }
            JSONObject jSONObject4 = jSONObject2.getJSONObject("displayCondition");
            if (jSONObject4 != null && jSONObject4.containsKey("notifyEnable")) {
                boolean booleanValue = jSONObject4.getBooleanValue("notifyEnable");
                String g = zd7.g(sd7.d().a());
                if ((booleanValue && !"true".equals(g)) || (!booleanValue && !"false".equals(g))) {
                    l(shxVar, abu.FUNNEL_STEP_LAUNCH_WIDGET, "notifyEnableConditionNotPass", "");
                    return null;
                }
            }
            if (!f(aguVar)) {
                return null;
            }
            try {
                JSONObject parseObject2 = JSON.parseObject(jSONObject2.getString("context"));
                n(aguVar.e, 1, null);
                String string2 = aguVar.d.getString("localRecord");
                if (!TextUtils.isEmpty(string2) && (parseObject = JSON.parseObject(string2)) != null) {
                    jSONObject3 = parseObject.getJSONObject("displayFatigue");
                }
                Application a2 = sd7.d().a();
                JSONObject jSONObject5 = new JSONObject();
                if (parseObject2 == null) {
                    parseObject2 = new JSONObject();
                }
                jSONObject5.put("context", (Object) parseObject2);
                if (jSONObject3 == null) {
                    jSONObject3 = new JSONObject();
                }
                jSONObject5.put("displayFatigue", (Object) jSONObject3);
                jSONObject5.put("notifyEnable", (Object) zd7.g(a2));
                jSONObject5.put("floatWindowEnable", (Object) Boolean.valueOf(zd7.a(a2)));
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("androidFloatWindow", (Object) jSONObject5.toJSONString());
                return jSONObject6;
            } catch (Throwable unused) {
                l(shxVar, abu.FUNNEL_STEP_LAUNCH_WIDGET, "paramContentInvalid", "");
            }
        }
        return null;
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
        String string = jSONObject2.getString("bizCode");
        String string2 = jSONObject2.getString("dslContent");
        String string3 = jSONObject2.getString("dataContent");
        aguVar.c = string;
        if (!ep9.h().c(shxVar)) {
            yv8.a("LocalTaskProcessor.onDataFetchSuccess.addNewRequestFailed.sameBizCode.alreadyPopping.cancel.bizCode=%s", string);
            k(aguVar, abu.FUNNEL_STEP_LAUNCH_WIDGET, "LocalTaskProcessor.triggerFailed.onDataFetchSuccess.AlreadyPopping", "");
            return;
        }
        this.f32455a.j(shxVar, string2, string3, (WindowStyleModel) jSONObject2.getObject("style", WindowStyleModel.class), new a(string, aguVar, shxVar));
        String string4 = jSONObject.getString("triggerConfig");
        if (!TextUtils.isEmpty(string4)) {
            Bundle bundle = new Bundle();
            bundle.putString("newConfig", string4);
            n(aguVar.e, 4, bundle);
        }
    }
}
