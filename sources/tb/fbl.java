package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class fbl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1032847452);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("acc389d5", new Object[0]);
        }
        return OrangeConfig.getInstance().getConfig("edlp_business_switch", "tabBarTabClickUpdateInterval", "600");
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61f45e46", new Object[0])).booleanValue();
        }
        return "1".equals(OrangeConfig.getInstance().getConfig("edlp_business_switch", "edlpTabBarChangeEnabled", "1"));
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a99440ad", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("edlp_business_switch", "extractEmbed", "false"));
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48e5c0b4", new Object[0])).booleanValue();
        }
        return "1".equals(OrangeConfig.getInstance().getConfig("edlp_business_switch", "openAlienGifImageOpt", "1"));
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cdc44f64", new Object[0])).booleanValue();
        }
        return "1".equals(OrangeConfig.getInstance().getConfig("edlp_business_switch", "openAlienStaticImageOpt", "1"));
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b3e41dd", new Object[0])).booleanValue();
        }
        return "0".equals(OrangeConfig.getInstance().getConfig("edlp_business_switch", "openUpdateNextPageProperties", "1"));
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fdb1fa4c", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("edlp_business_switch", "urlAppendEmbedId", "true"));
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4234b12b", new Object[0])).booleanValue();
        }
        int parseInt = Integer.parseInt(OrangeConfig.getInstance().getConfig("edlp_business_switch", "enableWebSkeleton", "3"));
        int a2 = s74.a();
        TLog.loge("tab3edlp", "deviceLevel=" + a2 + ", threshold=" + parseInt);
        return a2 >= parseInt;
    }
}
