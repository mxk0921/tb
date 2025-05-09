package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class j9l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(619708653);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66526bae", new Object[0])).booleanValue();
        }
        return "true".equalsIgnoreCase(c("group_common_browser", m7r.KEY_ORANGE_CONFIG_DISMISS_ON_T1, "true"));
    }

    public static Map<String, String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6165ac1", new Object[]{str});
        }
        try {
            v7t.d("OrangeConfigUtils", "getConfigs main process in");
            return OrangeConfig.getInstance().getConfigs(str);
        } catch (Throwable th) {
            if (th instanceof IllegalStateException) {
                v7t.b("OrangeConfigUtils", "getConfig e", th, new Object[0]);
            } else {
                v7t.e("OrangeConfigUtils", "getConfig e", th, new Object[0]);
            }
            v7t.n("OrangeConfigUtils", "getConfigs:" + str + " return null");
            return null;
        }
    }

    public static String c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5bb195d1", new Object[]{str, str2, str3});
        }
        try {
            return OrangeConfig.getInstance().getConfig(str, str2, str3);
        } catch (Throwable th) {
            if (th instanceof IllegalStateException) {
                v7t.b("OrangeConfigUtils", "getSpecificConfig e", th, new Object[0]);
            } else {
                v7t.e("OrangeConfigUtils", "getSpecificConfig e", th, new Object[0]);
            }
            return str3;
        }
    }
}
