package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class xk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME_SPACE = "aura_purchase";

    static {
        t2o.a(81789262);
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3915235", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        return "true".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("aura_purchase", str, String.valueOf(z)));
    }

    public static double b(String str, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("da222914", new Object[]{str, new Double(d)})).doubleValue();
        }
        try {
            return Double.parseDouble(OrangeConfig.getInstance().getConfig("aura_purchase", str, String.valueOf(d)));
        } catch (Exception unused) {
            return d;
        }
    }

    public static String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{str, str2});
        }
        return OrangeConfig.getInstance().getConfig("aura_purchase", str, str2);
    }
}
