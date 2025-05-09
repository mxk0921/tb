package tb;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.channel.desktoplinktask.floatwindow.a;
import com.taobao.desktop.channel.desktoplinktask.floatwindow.model.WindowStyleModel;
import com.taobao.umipublish.draft.DraftMediaHelper;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ra0 extends z12 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements a.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ shx f27221a;

        public a(shx shxVar) {
            this.f27221a = shxVar;
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
                ra0.this.l(this.f27221a, abu.FUNNEL_STEP_VIEW_LOAD, str, "");
            }
        }

        @Override // com.taobao.desktop.channel.desktoplinktask.floatwindow.a.b
        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4eb0d49", new Object[]{this});
            } else {
                ra0.this.m(this.f27221a);
            }
        }
    }

    static {
        t2o.a(435159114);
    }

    public static /* synthetic */ Object ipc$super(ra0 ra0Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -830997126) {
            super.l((shx) objArr[0], (String) objArr[1], (String) objArr[2], (String) objArr[3]);
            return null;
        } else if (hashCode == -115521698) {
            ra0Var.o((agu) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/desktop/channel/desktoplinktask/widgetservice/processor/ActiveEventTaskProcessor");
        }
    }

    public static /* synthetic */ void v(shx shxVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d15590e8", new Object[]{shxVar, str});
        } else if (!shxVar.d) {
            Toast.makeText(sd7.d().a(), str, 0).show();
            shxVar.d = true;
        }
    }

    @Override // tb.z12
    public void b(shx shxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff2bc05e", new Object[]{this, shxVar});
        }
    }

    @Override // tb.z12
    public JSONObject c(final shx shxVar) {
        agu aguVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d054c057", new Object[]{this, shxVar});
        }
        if (shxVar == null || (aguVar = shxVar.f28064a) == null) {
            return null;
        }
        final JSONObject jSONObject = aguVar.d;
        Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(new Runnable() { // from class: tb.oa0
            @Override // java.lang.Runnable
            public final void run() {
                ra0.t(shx.this, jSONObject);
            }
        }, 1000L);
        handler.postDelayed(new Runnable() { // from class: tb.pa0
            @Override // java.lang.Runnable
            public final void run() {
                ra0.this.u(shxVar, jSONObject);
            }
        }, 5000L);
        Application a2 = sd7.d().a();
        agu aguVar2 = shxVar.f28064a;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("triggerVersion", (Object) "active");
        jSONObject2.put("bizCode", (Object) aguVar2.c);
        jSONObject2.put("triggerEventId", (Object) aguVar2.b);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("context", (Object) jSONObject2);
        jSONObject3.put("notifyEnable", (Object) zd7.g(a2));
        jSONObject3.put("floatWindowEnable", (Object) Boolean.valueOf(zd7.a(a2)));
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("androidFloatWindow", (Object) jSONObject3.toJSONString());
        return jSONObject4;
    }

    @Override // tb.z12
    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return DraftMediaHelper.DraftType.PRODUCT;
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
        if (!zd7.a(sd7.d().a())) {
            s(shxVar, jSONObject.getJSONObject("failbackAction"));
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(e9.TAK_ABILITY_MATCH_CONTENT);
        if (jSONObject2 == null) {
            l(shxVar, abu.FUNNEL_STEP_AFTER_REQUEST, "mtopFailed.noMatchContent", "");
            return;
        }
        String string = jSONObject2.getString("bizCode");
        if (TextUtils.isEmpty(string) || !string.equals(aguVar.c)) {
            l(shxVar, abu.FUNNEL_STEP_AFTER_REQUEST, "mtopFailed.bizCodeNotMatch", "");
            return;
        }
        this.f32455a.j(shxVar, jSONObject2.getString("dslContent"), jSONObject2.getString("dataContent"), (WindowStyleModel) jSONObject2.getObject("style", WindowStyleModel.class), new a(shxVar));
        lo9.d().f(jSONObject);
    }

    @Override // tb.z12
    public void l(shx shxVar, String str, String str2, String str3) {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce77fd7a", new Object[]{this, shxVar, str, str2, str3});
            return;
        }
        super.l(shxVar, str, str2, str3);
        JSONObject jSONObject = shxVar.f28064a.d;
        if (jSONObject == null || (bool = jSONObject.getBoolean("needToast")) == null || bool.booleanValue()) {
            String string = jSONObject != null ? jSONObject.getString(agu.PARAM_KEY_TOAST_LOAD_FAIL) : null;
            if (TextUtils.isEmpty(string)) {
                string = "悬浮窗未加载成功，请再试一次";
            }
            w(shxVar, string);
        }
    }

    public final /* synthetic */ void u(shx shxVar, JSONObject jSONObject) {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("307da121", new Object[]{this, shxVar, jSONObject});
        } else if (!shxVar.b() && !shxVar.a()) {
            if (jSONObject == null || (bool = jSONObject.getBoolean("needToast")) == null || bool.booleanValue()) {
                String string = jSONObject != null ? jSONObject.getString(agu.PARAM_KEY_TOAST_LOAD_TIME_OUT) : null;
                if (TextUtils.isEmpty(string)) {
                    string = "悬浮窗未加载成功，请再试一次";
                }
                w(shxVar, string);
                l(shxVar, abu.FUNNEL_STEP_LAUNCH_WIDGET, "mtopTimeOut", "");
            }
        }
    }

    public final void w(final shx shxVar, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40b00e2d", new Object[]{this, shxVar, str});
        } else {
            lst.b(new Runnable() { // from class: tb.qa0
                @Override // java.lang.Runnable
                public final void run() {
                    ra0.v(shx.this, str);
                }
            });
        }
    }

    public static /* synthetic */ void t(shx shxVar, JSONObject jSONObject) {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b4bafc2", new Object[]{shxVar, jSONObject});
        } else if (!shxVar.b() && !shxVar.a()) {
            if (jSONObject == null || (bool = jSONObject.getBoolean("needToast")) == null || bool.booleanValue()) {
                String string = jSONObject != null ? jSONObject.getString(agu.PARAM_KEY_TOAST_LOADING) : null;
                if (TextUtils.isEmpty(string)) {
                    string = "悬浮窗正在加载中，请稍等";
                }
                Toast.makeText(sd7.d().a(), string, 0).show();
            }
        }
    }

    @Override // tb.z12
    public boolean e(shx shxVar) {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb1e3315", new Object[]{this, shxVar})).booleanValue();
        }
        JSONObject jSONObject = shxVar.f28064a.d;
        if (jSONObject == null || (bool = jSONObject.getBoolean(agu.PARAM_KEY_NEED_LOCAL_REQUEST_CACHE)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final void s(shx shxVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c62d3f11", new Object[]{this, shxVar, jSONObject});
        } else if (jSONObject != null) {
            String string = jSONObject.getString("action");
            String string2 = jSONObject.getString("deepUrl");
            if ("call".equals(string) && !TextUtils.isEmpty(string2)) {
                Intent intent = new Intent();
                intent.setData(Uri.parse(string2));
                intent.setFlags(805339136);
                sd7.d().a().startActivity(intent);
            }
            shxVar.d = true;
            l(shxVar, abu.FUNNEL_STEP_AFTER_REQUEST, "mtop.FailAction", "");
        }
    }
}
