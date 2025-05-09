package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.ConfigCenter;
import com.taobao.orange.OrangeConfig;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class lf4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(573571128);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fe08ac0", new Object[0])).booleanValue();
        }
        return Boolean.parseBoolean(g("disableLinkedTexiuAd", "false"));
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d685b1f", new Object[0])).booleanValue();
        }
        return Boolean.parseBoolean(g("enableBigPop", "true"));
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5e5036f", new Object[0])).booleanValue();
        }
        return Boolean.parseBoolean(g("enableCheckVideoDestroy", "true"));
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a5d5115", new Object[0])).booleanValue();
        }
        return Boolean.parseBoolean(g("enableOnceFetchDX", "true"));
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97589078", new Object[0])).booleanValue();
        }
        return Boolean.parseBoolean(g("enableSmallPop", "true"));
    }

    public static String g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1086f4ad", new Object[]{str, str2});
        }
        return ino.a(str, str2);
    }

    public static int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f080d983", new Object[0])).intValue();
        }
        return Integer.parseInt(g("splashBigPopMaxLottieDuration", String.valueOf(5000)));
    }

    public static void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{"mmAdBiz"}, new obk() { // from class: tb.jf4
                @Override // tb.obk
                public final void onConfigUpdate(String str, Map map) {
                    lf4.k(str, map);
                }
            }, false);
        }
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("898ea5f5", new Object[0])).booleanValue();
        }
        return "true".equals(g("enable_splash_interact", "true"));
    }

    public static /* synthetic */ void k(String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edcb0f5b", new Object[]{str, map});
            return;
        }
        jgh.a(ConfigCenter.TAG, "ConfigCenter#onConfigUpdate: groupName=" + str);
        Map<String, String> configs = OrangeConfig.getInstance().getConfigs("mmAdBiz");
        if (configs != null) {
            try {
                ino.c(configs);
            } catch (Throwable th) {
                jgh.b(ConfigCenter.TAG, "onConfigUpdate error", th);
            }
        }
    }
}
