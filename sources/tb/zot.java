package tb;

import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.ultron.navtiveview.UserHeaderBgLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class zot {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f32914a;
    public UserHeaderBgLayout b;

    static {
        t2o.a(745537995);
    }

    public final void a(boolean z, JSONObject jSONObject) {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3954e5f", new Object[]{this, new Boolean(z), jSONObject});
            return;
        }
        UserHeaderBgLayout userHeaderBgLayout = this.b;
        if (userHeaderBgLayout != null) {
            Integer num2 = null;
            if (jSONObject != null) {
                num = jSONObject.getInteger("bgHeight");
            } else {
                num = null;
            }
            if (jSONObject != null) {
                num2 = jSONObject.getInteger("horizontalBgHeight");
            }
            userHeaderBgLayout.updateThemeHeight(sgj.a(m1q.b(num, num2, 210)));
        }
    }

    public final void b(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbe50cc3", new Object[]{this, new Boolean(z), jSONObject});
            return;
        }
        c(jSONObject);
        UserHeaderBgLayout userHeaderBgLayout = this.b;
        if (userHeaderBgLayout != null) {
            userHeaderBgLayout.considerLazyInitThemeView();
        }
    }

    public final void d(UserHeaderBgLayout userHeaderBgLayout, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c3c239e", new Object[]{this, userHeaderBgLayout, recyclerView});
            return;
        }
        ckf.h(userHeaderBgLayout, "headerBgLayout");
        ckf.h(recyclerView, "rv");
        this.b = userHeaderBgLayout;
        userHeaderBgLayout.setParentListView(recyclerView);
    }

    public final void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c680bccc", new Object[]{this, new Integer(i)});
            return;
        }
        UserHeaderBgLayout userHeaderBgLayout = this.b;
        if (userHeaderBgLayout != null) {
            userHeaderBgLayout.processOnScroll(i);
        }
    }

    public final void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24de2f80", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            this.f32914a = null;
            cpt.c().i("mytaobao");
        } else {
            JSONObject jSONObject2 = this.f32914a;
            if (jSONObject2 == null || !jSONObject2.equals(jSONObject)) {
                cpt.c().j("mytaobao", jSONObject);
                this.f32914a = jSONObject;
            }
        }
    }
}
