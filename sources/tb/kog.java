package tb;

import android.content.Context;
import android.taobao.mulitenv.EnvironmentSwitcher;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.a;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class kog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(708837413);
    }

    public static a a(Context context, String str) {
        a aVar;
        ybv a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("77d51996", new Object[]{context, str});
        }
        Object m = qbv.j().m(str);
        if (!(m instanceof MUSDKInstance) || (a2 = ybv.a((aVar = (a) m))) == null || !a2.e() || a2.d()) {
            aVar = null;
        }
        String str2 = "未命中实例预热";
        ck.g().f("命中实例预热", ck.b.b().l("LightBuyWeexPrefetch").i("LightBuy/common").g("info", aVar == null ? str2 : "命中实例预热").g("lightbuyUrl", str).a());
        if (aVar != null) {
            str2 = "命中实例预热";
        }
        eog.e(str2, null);
        return aVar;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[0]);
        }
        if (EnvironmentSwitcher.a() == 0) {
            return zng.b();
        }
        return zng.c();
    }
}
