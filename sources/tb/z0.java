package tb;

import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class z0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48a79fab", new Object[]{str})).booleanValue();
        }
        return b("AB_", "202305152248_3089", str, false);
    }

    public static boolean b(String str, String str2, String str3, boolean z) {
        Variation variation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b614f61", new Object[]{str, str2, str3, new Boolean(z)})).booleanValue();
        }
        VariationSet activate = UTABTest.activate(str, str2);
        if (activate == null || (variation = activate.getVariation(str3)) == null) {
            return z;
        }
        return variation.getValueAsBoolean(z);
    }
}
