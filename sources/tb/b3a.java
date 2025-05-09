package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import java.util.List;
import tb.bmi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class b3a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b3a INSTANCE = new b3a();

    static {
        t2o.a(689963229);
    }

    public final void a(jmi jmiVar, List<String> list, wa waVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51d789c", new Object[]{this, jmiVar, list, waVar});
            return;
        }
        ckf.g(jmiVar, "messageCenter");
        ckf.g(list, "names");
        ckf.g(waVar, "messageObserver");
        vgh.c(this, "GGPageMessageHelper", "注册来自逛逛页面的消息，names=" + list);
        jmiVar.d("GG", list, waVar);
    }

    public final void b(JSONObject jSONObject, fll fllVar, bmi.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f22025", new Object[]{this, jSONObject, fllVar, aVar});
            return;
        }
        ckf.g(jSONObject, "args");
        ckf.g(fllVar, "pageBaseInfoManager");
        vgh.c(this, "GGPageMessageHelper", "向逛逛页面发消息");
        a3a b = a3a.Companion.b(jSONObject, System.currentTimeMillis(), "Interact", "GG", aVar);
        if (b != null) {
            c(b, fllVar);
        }
    }

    public final void c(a3a a3aVar, fll fllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d836f012", new Object[]{this, a3aVar, fllVar});
            return;
        }
        ckf.g(a3aVar, "message");
        ckf.g(fllVar, "pageBaseInfoManager");
        vgh.c(this, "GGPageMessageHelper", "向逛逛页面发消息，message=" + a3aVar);
        if (!ckf.b(a3aVar.d(), "GG")) {
            vgh.c(this, "GGPageMessageHelper", "向逛逛页面发消息，receiver无效");
            return;
        }
        JSONObject a2 = a3aVar.a();
        if (a2 == null) {
            vgh.c(this, "GGPageMessageHelper", "向逛逛页面发消息，args为空");
            return;
        }
        a2.put((JSONObject) "sourceType", BaseOuterComponent.OuterComponentType.INTERACT_CONTAINER.toString());
        a2.put((JSONObject) BaseOuterComponent.b.SOURCE_COMPONENT_ID, BaseOuterComponent.COMPONENT_ID_INTERACT_CONTAINER);
        BaseOuterComponent.b a3 = BaseOuterComponent.b.Companion.a(a2);
        kxd c = fllVar.c();
        if (c != null && a3 != null) {
            c.u(a3);
        }
    }

    public final void d(jmi jmiVar, JSONObject jSONObject, bmi.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e74e319", new Object[]{this, jmiVar, jSONObject, aVar});
            return;
        }
        ckf.g(jmiVar, "messageCenter");
        ckf.g(jSONObject, "args");
        vgh.c(this, "GGPageMessageHelper", "向互动发消息");
        a3a b = a3a.Companion.b(jSONObject, System.currentTimeMillis(), "GG", "Interact", aVar);
        if (b != null) {
            jmiVar.e(b);
        }
    }

    public final void e(jmi jmiVar, wa waVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("998a7684", new Object[]{this, jmiVar, waVar});
            return;
        }
        ckf.g(jmiVar, "messageCenter");
        ckf.g(waVar, "messageObserver");
        vgh.c(this, "GGPageMessageHelper", "解注册来自逛逛页面的消息");
        jmiVar.h("GG", waVar);
    }
}
