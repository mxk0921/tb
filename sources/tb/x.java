package tb;

import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(437256342);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ee13a4c", new Object[0])).booleanValue();
        }
        Variation variation = UTABTest.activate("AB_", "202302211854_2139").getVariation("isShowGuide");
        if (variation == null || variation.getValueAsBoolean(true)) {
            return true;
        }
        hgh.d("ABRouterUtils abRouterWidgetSupport false");
        return false;
    }
}
