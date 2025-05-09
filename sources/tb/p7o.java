package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class p7o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(jxl jxlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c098fd8b", new Object[]{jxlVar})).booleanValue();
        }
        if (jxlVar != null) {
            return o7o.c().a(jxlVar);
        }
        s9n.a("ResourceGuardianApi", "addPerformanceWarningListener failed. listener is null");
        return false;
    }

    public static Map<String, String> b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e9513237", new Object[]{new Integer(i)});
        }
        return o7o.c().b(i);
    }

    public static eyl c(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eyl) ipChange.ipc$dispatch("36385add", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)});
        }
        return o7o.c().d(i, i2, i3);
    }

    public static boolean d(jxl jxlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b013fc8", new Object[]{jxlVar})).booleanValue();
        }
        if (jxlVar != null) {
            return o7o.c().f(jxlVar);
        }
        s9n.a("ResourceGuardianApi", "removePerformanceWarningListener failed. listener is null");
        return false;
    }
}
