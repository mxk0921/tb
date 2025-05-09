package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.security.ccrc.service.build.vb;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class u9l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d4377ac4", new Object[]{context});
        }
        String config = OrangeConfig.getInstance().getConfig("aliprivacy_config_switch", "downgrade_without_uid", null);
        if (config == null) {
            return hxm.q(context);
        }
        return config;
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a2f53e36", new Object[]{context});
        }
        String config = OrangeConfig.getInstance().getConfig("aliprivacy_config_switch", "recommend_entrance_name", null);
        return TextUtils.isEmpty(config) ? hxm.g(context) : config;
    }

    public static String c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5a5e995a", new Object[]{context});
        }
        String config = OrangeConfig.getInstance().getConfig("aliprivacy_config_switch", "recommend_gray_scope", null);
        return TextUtils.isEmpty(config) ? hxm.h(context) : config;
    }

    public static String d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7463b714", new Object[]{context});
        }
        String config = OrangeConfig.getInstance().getConfig("aliprivacy_config_switch", "log_cache_count", null);
        return config == null ? hxm.i(context) : config;
    }

    public static String e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cffbdb52", new Object[]{context});
        }
        String config = OrangeConfig.getInstance().getConfig("aliprivacy_config_switch", "log_timeInterval", null);
        return config == null ? hxm.j(context) : config;
    }

    public static String f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4495701", new Object[]{context});
        }
        String config = OrangeConfig.getInstance().getConfig("aliprivacy_config_switch", vb.m, null);
        return config == null ? hxm.k(context) : config;
    }

    public static String g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80060df9", new Object[]{context});
        }
        String customConfig = OrangeConfig.getInstance().getCustomConfig("aliprivacy_config_mtop_api", null);
        if (customConfig == null) {
            return hxm.m(context);
        }
        return customConfig;
    }

    public static String h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f1b3832", new Object[]{context});
        }
        String config = OrangeConfig.getInstance().getConfig("aliprivacy_config_switch", "recommend_display_switch", null);
        return config == null ? hxm.f(context) : config;
    }

    public static String i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ae66579b", new Object[]{context});
        }
        String config = OrangeConfig.getInstance().getConfig("aliprivacy_config_switch", "recommend_linked_h5_url", null);
        return TextUtils.isEmpty(config) ? hxm.o(context) : config;
    }

    public static String j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("940d1a84", new Object[]{context});
        }
        String config = OrangeConfig.getInstance().getConfig("aliprivacy_config_switch", "sync_switch", null);
        return config == null ? hxm.r(context) : config;
    }

    public static String k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5614ae55", new Object[]{context});
        }
        String config = OrangeConfig.getInstance().getConfig("aliprivacy_config_switch", "recommend_ttid_list", null);
        return TextUtils.isEmpty(config) ? hxm.t(context) : config;
    }

    public static boolean l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef88364b", new Object[]{context})).booleanValue();
        }
        String a2 = a(context);
        if (TextUtils.isEmpty(a2)) {
            return false;
        }
        return "1".equals(a2);
    }

    public static String m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9eb8c5b6", new Object[]{context});
        }
        String config = OrangeConfig.getInstance().getConfig("aliprivacy_config_switch", "log_cache_count_global_header", null);
        return TextUtils.isEmpty(config) ? hxm.L(context) : config;
    }

    public static String n(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dc96e5a2", new Object[]{context});
        }
        String config = OrangeConfig.getInstance().getConfig("aliprivacy_config_switch", "log_gray_scope", null);
        return TextUtils.isEmpty(config) ? hxm.M(context) : config;
    }

    public static String o(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ab83b14", new Object[]{context});
        }
        String config = OrangeConfig.getInstance().getConfig("aliprivacy_config_switch", "recommend_global_header_gray_scope", null);
        return TextUtils.isEmpty(config) ? hxm.N(context) : config;
    }

    public static boolean p(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27a264c0", new Object[]{context})).booleanValue();
        }
        String config = OrangeConfig.getInstance().getConfig("aliprivacy_config_switch", "recommend_global_header_switch", null);
        if (config == null) {
            config = hxm.O(context);
        }
        return "1".equals(config);
    }
}
