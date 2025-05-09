package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import java.util.HashMap;
import java.util.Map;
import tb.c4o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class nql {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NO_NEED_NETWORK_SPEED = "1";

    static {
        t2o.a(468714314);
    }

    public static c4o.a a(pep pepVar, String str, FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c4o.a) ipChange.ipc$dispatch("f3764d1d", new Object[]{pepVar, str, fluidContext});
        }
        int l = z5r.l();
        HashMap hashMap = new HashMap();
        hashMap.put(c4o.KEY_TAB3COMPONENTSOURCE, str);
        hashMap.put(c4o.KEY_ISAUTOSLIDE, Boolean.valueOf(zk1.e("false")));
        hashMap.put(c4o.KEY_VERTICAL_LAYOUT, Boolean.valueOf(b93.n(fluidContext)));
        return new c4o().a(pepVar).b().i(l).f(hashMap);
    }

    public static tg7 b(pep pepVar, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tg7) ipChange.ipc$dispatch("647d5bd5", new Object[]{pepVar, str, map});
        }
        return new tg7(pepVar).a().g(str).i(map).l(pepVar.b).k("POST");
    }

    public static String c(pep pepVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e729a6d4", new Object[]{pepVar, map});
        }
        if (h()) {
            return d(pepVar, map);
        }
        return e(pepVar, map);
    }

    public static String d(pep pepVar, Map map) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58dd7e86", new Object[]{pepVar, map});
        }
        if (pepVar == null || TextUtils.isEmpty(pepVar.g)) {
            jSONObject = null;
        } else {
            jSONObject = hxf.b(pepVar.g);
        }
        if (!sz3.b(jSONObject)) {
            if (!sz3.b(map)) {
                jSONObject.putAll(map);
            }
            map = jSONObject;
        }
        return hxf.d(map);
    }

    public static String e(pep pepVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de186c9f", new Object[]{pepVar, map});
        }
        if (pepVar == null || TextUtils.isEmpty(pepVar.g)) {
            return null;
        }
        if (map == null || map.isEmpty()) {
            return pepVar.g;
        }
        JSONObject b = hxf.b(pepVar.g);
        if (b != null) {
            b.putAll(map);
            map = b;
        }
        return hxf.d(map);
    }

    public static c4o.a f(pep pepVar, String str, boolean z, boolean z2, String str2, FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c4o.a) ipChange.ipc$dispatch("77af15d2", new Object[]{pepVar, str, new Boolean(z), new Boolean(z2), str2, fluidContext});
        }
        return g(a(pepVar, str, fluidContext), pepVar, z, z2, str2);
    }

    public static c4o.a g(c4o.a aVar, pep pepVar, boolean z, boolean z2, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c4o.a) ipChange.ipc$dispatch("43a299d5", new Object[]{aVar, pepVar, new Boolean(z), new Boolean(z2), str});
        }
        if (aVar == null) {
            aVar = new c4o.a(pepVar);
        }
        if (!z && !z2) {
            try {
                if (i()) {
                    String str3 = null;
                    if (ws6.k()) {
                        str2 = hxf.d(sjg.b());
                    } else {
                        str2 = null;
                    }
                    if (cp2.e(pepVar) && ief.c()) {
                        String c = cp2.c();
                        if (!TextUtils.isEmpty(c)) {
                            str3 = c;
                        }
                    }
                    ir9.b("DetailParams", "buildDetailParams refreshType=" + str + " ;lbsString=" + str2 + " ;bxFeature=" + str3);
                    aVar.g(str2).j(str).d(str3);
                }
            } catch (Throwable unused) {
            }
        }
        aVar.e(z2);
        return aVar;
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2869b4a", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.enableDetailParametersNullable", true);
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f414d558", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.enableDetailRequestBxParams", true);
    }
}
