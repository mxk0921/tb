package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class uel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(297795661);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0e8b78a", new Object[0])).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("babelorder", "order_dowgradeH5_ultrondegrade", "false"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7574e17", new Object[0])).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("babelorder", "order_enable_jstracker", "true"));
    }

    public static float c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ebc0b0e1", new Object[0])).floatValue();
        }
        return f("order_custom_sampling_of_jstracker");
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6217c2", new Object[0]);
        }
        return OrangeConfig.getInstance().getConfig("babelorder", "oList_black_list_brand", "v2133a,");
    }

    public static float e(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("341be674", new Object[]{str, new Float(f)})).floatValue();
        }
        String config = OrangeConfig.getInstance().getConfig("babelorder", str, String.valueOf(f));
        if (TextUtils.isEmpty(config)) {
            return f;
        }
        try {
            return Float.parseFloat(config);
        } catch (Exception unused) {
            return f;
        }
    }

    public static float f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("94f119e9", new Object[]{str})).floatValue();
        }
        try {
            return Math.min(1.0f, Math.max(0.0f, Float.parseFloat(OrangeConfig.getInstance().getConfig("babelorder", str, "-1"))));
        } catch (Exception unused) {
            return -1.0f;
        }
    }

    public static int g(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d64674d", new Object[]{str, new Integer(i)})).intValue();
        }
        String config = OrangeConfig.getInstance().getConfig("babelorder", str, String.valueOf(i));
        if (TextUtils.isEmpty(config)) {
            return i;
        }
        try {
            return Integer.parseInt(config);
        } catch (Exception unused) {
            return i;
        }
    }

    public static long h(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2df331c8", new Object[]{str, new Long(j)})).longValue();
        }
        String config = OrangeConfig.getInstance().getConfig("babelorder", str, String.valueOf(j));
        if (TextUtils.isEmpty(config)) {
            return j;
        }
        try {
            return Long.parseLong(config);
        } catch (Exception unused) {
            return j;
        }
    }

    public static float i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d582c72a", new Object[0])).floatValue();
        }
        return f("order_mtop_sampling_of_jstracker");
    }

    public static float j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce7eefcc", new Object[0])).floatValue();
        }
        return f("order_pv_sampling_of_jstracker");
    }

    public static String k(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d8d7c7b", new Object[]{str, str2});
        }
        String config = OrangeConfig.getInstance().getConfig("babelorder", str, str2);
        if (TextUtils.isEmpty(config)) {
            return str2;
        }
        return config;
    }

    public static boolean l(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1fd8cc7a", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        return "true".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("babelorder", str, String.valueOf(z)));
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f2b0460", new Object[0])).booleanValue();
        }
        return "true".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("babelorder", "isOptimizeRecommend", "true"));
    }
}
