package tb;

import android.content.Context;
import android.view.View;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class dan {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public transient WeakReference<w9n> f17684a;

    static {
        t2o.a(729809930);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        WeakReference<w9n> weakReference = this.f17684a;
        if (weakReference != null) {
            w9n w9nVar = weakReference.get();
            if (w9nVar != null) {
                w9nVar.j();
            }
            this.f17684a = null;
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81ea7a3", new Object[]{this, new Boolean(z)});
            return;
        }
        a();
        this.f17684a = new WeakReference<>(new w9n(this, z));
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a89baf2d", new Object[]{this});
            return;
        }
        try {
            if (!gon.a("home_guess_tips_shown", true)) {
                gon.d("home_guess_tips_shown", true);
                TBToast makeText = TBToast.makeText(m0b.c(), Localization.q(R.string.taobao_app_1000_1_16143));
                makeText.setTextSize(15);
                makeText.show();
            }
        } catch (Exception e) {
            y9n.d("Something wrong while trying to show the item delete tip.", e);
        }
    }

    public void d(Context context, View view, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, JSONObject jSONObject) {
        w9n w9nVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5611fdf", new Object[]{this, context, view, onClickListener, onClickListener2, jSONObject});
            return;
        }
        WeakReference<w9n> weakReference = this.f17684a;
        if (weakReference != null && (w9nVar = weakReference.get()) != null) {
            w9nVar.p(context, view, onClickListener, onClickListener2, jSONObject);
            w9nVar.o(w9nVar, jSONObject, onClickListener);
        }
    }

    public void e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b2099cf", new Object[]{this, jSONObject});
        } else if (jSONObject != null && jSONObject.getJSONObject("item") != null && jSONObject.getJSONObject("item").getJSONObject("0") != null && jSONObject.getJSONObject("item").getJSONObject("0").getJSONObject("clickParam") != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("item").getJSONObject("0");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("arg1", (Object) "Page_Home_Button-guessitem-del");
            r5a.e(jSONObject, jSONObject2, jSONObject3);
        }
    }

    public void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e155e5e", new Object[]{this, jSONObject});
        } else if (jSONObject != null && jSONObject.getJSONObject(i2b.TRACK_EXPOSURE_PARAM) != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("arg1", (Object) "Page_Home_Show-guessitem_del");
            jSONObject2.put("skipCheck", (Object) Boolean.TRUE);
            r5a.m(jSONObject, jSONObject2);
        }
    }

    public void g(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ba684cc", new Object[]{this, str, jSONObject});
        } else if (jSONObject != null && jSONObject.getJSONObject("item") != null && jSONObject.getJSONObject("item").getJSONObject("0") != null && jSONObject.getJSONObject("item").getJSONObject("0").getJSONObject("clickParam") != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("item").getJSONObject("0");
            jSONObject2.getJSONObject("clickParam").getJSONObject("args").put("reasontype", (Object) str);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("arg1", (Object) "Page_Home_Button-guessitem_delreason");
            r5a.e(jSONObject, jSONObject2, jSONObject3);
        }
    }

    public void h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e441ae5", new Object[]{this, jSONObject});
        } else if (jSONObject != null && jSONObject.getJSONObject(i2b.TRACK_EXPOSURE_PARAM) != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("arg1", (Object) "Page_Home_Show-guessitem_delreason");
            jSONObject2.put("skipCheck", (Object) Boolean.TRUE);
            r5a.m(jSONObject, jSONObject2);
        }
    }
}
