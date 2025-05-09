package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class q8y {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Map<String, String> a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4d84e95", new Object[]{context});
        }
        dvx c = dvx.c();
        HashMap hashMap = new HashMap();
        nby a2 = hby.a(context);
        String a3 = c.a(context);
        String f = c.f(context);
        String z = c.z(context);
        String D = c.D(context);
        if (a2 != null) {
            if (vux.c(a3)) {
                a3 = vux.h(a2.f24625a);
            }
            if (vux.c(f)) {
                f = vux.h(a2.b);
            }
            if (vux.c(z)) {
                z = vux.h(a2.c);
            }
            if (vux.c(D)) {
                D = vux.h(a2.e);
            }
        }
        nby nbyVar = new nby(a3, f, z, "", D);
        if (context != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("imei", vux.h(nbyVar.f24625a));
                jSONObject.put("imsi", vux.h(nbyVar.b));
                jSONObject.put("mac", vux.h(nbyVar.c));
                jSONObject.put("bluetoothmac", vux.h(nbyVar.d));
                jSONObject.put("gsi", vux.h(nbyVar.e));
                fdy.b(context, "device_feature_prefs_name", "device_feature_prefs_key", jSONObject.toString());
            } catch (Exception e) {
                q4y.c(e);
            }
        }
        Map<String, String> x = dvx.x();
        hashMap.put("AD1", a3);
        hashMap.put("AD2", f);
        hashMap.put("AD3", dvx.p(context));
        hashMap.put("AD5", dvx.t(context));
        hashMap.put("AD6", dvx.v(context));
        hashMap.put("AD7", dvx.w(context));
        hashMap.put("AD8", z);
        hashMap.put("AD9", c.B(context));
        hashMap.put("AD10", D);
        hashMap.put("AD11", dvx.i());
        hashMap.put("AD12", c.k());
        String m = dvx.m();
        if (vux.c(m)) {
            m = dvx.o();
        }
        hashMap.put("AD13", m);
        hashMap.put("AD14", dvx.s());
        hashMap.put("AD15", dvx.u());
        hashMap.put("AD16", x.get("sdcard"));
        hashMap.put("AD17", "");
        hashMap.put("AD19", dvx.F(context));
        hashMap.put("AD20", dvx.y());
        hashMap.put("AD22", "");
        hashMap.put("AD23", dvx.J(context));
        hashMap.put("AD24", vux.k(dvx.r(context)));
        hashMap.put("AD26", c.n(context));
        hashMap.put("AD27", dvx.I());
        hashMap.put("AD28", dvx.M());
        hashMap.put("AD29", dvx.Q());
        hashMap.put("AD30", dvx.K());
        hashMap.put("AD31", dvx.O());
        hashMap.put("AD32", dvx.E());
        hashMap.put("AD33", dvx.G());
        hashMap.put("AD34", dvx.N(context));
        hashMap.put("AD35", dvx.P(context));
        hashMap.put("AD36", dvx.L(context));
        hashMap.put("AD37", dvx.C());
        hashMap.put("AD38", dvx.A());
        hashMap.put("AD39", dvx.j(context));
        hashMap.put("AD40", dvx.l(context));
        hashMap.put("AD41", dvx.e());
        hashMap.put("AD42", x.get("sdcardavailable"));
        hashMap.put("AL3", c.H(context));
        return hashMap;
    }
}
