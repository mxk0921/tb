package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class y8r {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BUY_POP_QUERY = "buyPopQuery";
    public static final String CONFIG_USE_SYSTEM_TOAST = "useSystemToast";
    public static final String GROUP_NAME = "aura_purchase";

    static {
        t2o.a(708837568);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38a064b4", new Object[0])).booleanValue();
        }
        return "true".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("aura_purchase", "enableAutoRefresh", "true"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7521fe5", new Object[0])).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("aura_purchase", "enableComponentsUpload", "true"));
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d258dfdc", new Object[0])).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("aura_purchase", "enableNewErrorPopupWindow", "true"));
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("576ffb8a", new Object[0])).booleanValue();
        }
        return "true".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("aura_purchase", "enablePaySuccessAutoFinished", "true"));
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5bcc446e", new Object[0])).booleanValue();
        }
        return "true".equalsIgnoreCase(g("enablePreGetCupDirectApps", "true"));
    }

    public static boolean f(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("221a66e8", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        return Boolean.parseBoolean(g(str, String.valueOf(z)));
    }

    public static String g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1086f4ad", new Object[]{str, str2});
        }
        return OrangeConfig.getInstance().getConfig("aura_purchase", str, str2);
    }
}
