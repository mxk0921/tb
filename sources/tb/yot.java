package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.ultron.navtiveview.UserHeaderBgLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class yot {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f32245a;
    public UserHeaderBgLayout b;

    static {
        t2o.a(745538029);
    }

    public final void a(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbe50cc3", new Object[]{this, new Boolean(z), jSONObject});
            return;
        }
        b(jSONObject);
        UserHeaderBgLayout userHeaderBgLayout = this.b;
        if (userHeaderBgLayout != null) {
            userHeaderBgLayout.considerLazyInitThemeView();
        }
    }

    public final void c(UserHeaderBgLayout userHeaderBgLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22ccb739", new Object[]{this, userHeaderBgLayout});
            return;
        }
        ckf.h(userHeaderBgLayout, "headerBgLayout");
        this.b = userHeaderBgLayout;
    }

    public final void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24de2f80", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            this.f32245a = null;
            cpt.c().i("mytaobao");
        } else {
            JSONObject jSONObject2 = this.f32245a;
            if (jSONObject2 == null || !jSONObject2.equals(jSONObject)) {
                cpt.c().j("mytaobao", jSONObject);
                this.f32245a = jSONObject;
            }
        }
    }
}
