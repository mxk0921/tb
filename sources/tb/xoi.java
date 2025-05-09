package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.bmi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class xoi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final xoi INSTANCE = new xoi();

    static {
        t2o.a(689963233);
    }

    public final void a(jmi jmiVar, vv1 vv1Var, String str, List<String> list, wa waVar, yps ypsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce249a8d", new Object[]{this, jmiVar, vv1Var, str, list, waVar, ypsVar});
            return;
        }
        ckf.g(jmiVar, "messageCenter");
        ckf.g(vv1Var, "baseInfoManager");
        ckf.g(str, "sender");
        ckf.g(list, "names");
        ckf.g(waVar, "messageObserver");
        ckf.g(ypsVar, "tabBaseInfoManager");
        vgh.c(this, "MessageHelper", "注册消息，sender=" + str + "，names=" + list);
        if (ckf.b(str, "Interact")) {
            wff.INSTANCE.a(jmiVar, list, waVar);
        } else if (ckf.b(vv1Var.h(str), "video")) {
            dsp.INSTANCE.a(jmiVar, vv1Var, str, list, waVar, ypsVar);
        } else if (ckf.b(vv1Var.h(str), "live")) {
            d1h.b(jmiVar, vv1Var, str, list, waVar, ypsVar);
        } else if (ckf.b(str, "GG")) {
            b3a.INSTANCE.a(jmiVar, list, waVar);
        }
    }

    public final void b(jmi jmiVar, vv1 vv1Var, JSONObject jSONObject, bmi.a aVar, yps ypsVar, fll fllVar) {
        a3a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94701959", new Object[]{this, jmiVar, vv1Var, jSONObject, aVar, ypsVar, fllVar});
            return;
        }
        ckf.g(jmiVar, "messageCenter");
        ckf.g(vv1Var, "baseInfoManager");
        ckf.g(jSONObject, "messageJSONObject");
        ckf.g(ypsVar, "tabBaseInfoManager");
        ckf.g(fllVar, "pageBaseInfoManager");
        vgh.c(this, "MessageHelper", "发送消息");
        Object obj = jSONObject.get(bmi.KEY_RECEIVER);
        if (!(obj instanceof String)) {
            vgh.c(this, "MessageHelper", "发送消息，receiver无效");
        } else if (ckf.b(obj, "Interact")) {
            vff b = vff.Companion.b(jSONObject);
            if (b != null) {
                b.f(aVar);
                wff.INSTANCE.c(jmiVar, b);
            }
        } else if (ckf.b(vv1Var.h((String) obj), "video")) {
            csp a3 = csp.Companion.a(jSONObject);
            if (a3 != null) {
                a3.f(aVar);
                dsp.INSTANCE.e(vv1Var, a3, ypsVar);
            }
        } else if (ckf.b(obj, "GG") && (a2 = a3a.Companion.a(jSONObject)) != null) {
            a2.f(aVar);
            b3a.INSTANCE.c(a2, fllVar);
        }
    }

    public final void c(jmi jmiVar, vv1 vv1Var, String str, List<String> list, wa waVar, yps ypsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1aafe94", new Object[]{this, jmiVar, vv1Var, str, list, waVar, ypsVar});
            return;
        }
        ckf.g(jmiVar, "messageCenter");
        ckf.g(vv1Var, "baseInfoManager");
        ckf.g(str, "sender");
        ckf.g(list, "names");
        ckf.g(waVar, "messageObserver");
        ckf.g(ypsVar, "tabBaseInfoManager");
        vgh.c(this, "MessageHelper", "解注册消息，sender=" + str + "，names=" + list);
        if (ckf.b(str, "Interact")) {
            wff.INSTANCE.d(jmiVar, list, waVar);
        } else if (ckf.b(vv1Var.h(str), "video")) {
            dsp.INSTANCE.f(jmiVar, vv1Var, str, list, waVar, ypsVar);
        } else if (ckf.b(vv1Var.h(str), "live")) {
            d1h.d(jmiVar, vv1Var, str, list, waVar, ypsVar);
        } else if (ckf.b(str, "GG")) {
            b3a.INSTANCE.e(jmiVar, waVar);
        }
    }
}
