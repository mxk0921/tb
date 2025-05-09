package tb;

import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class qf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(81789251);
    }

    public static String a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ac74a1f1", new Object[]{str, str2, str3, str4});
        }
        return b(str, str2, null, null, str3, str4);
    }

    public static String b(String str, String str2, Map<String, Object> map, Object obj, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("14ecc146", new Object[]{str, str2, map, obj, str3, str4});
        }
        Variation variation = UTABTest.activate(str, str2, map, obj).getVariation(str3);
        if (variation != null) {
            return variation.getValueAsString(str4);
        }
        return null;
    }
}
