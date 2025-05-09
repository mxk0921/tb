package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class zal {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(967835672);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d62da0", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("android_vessel", "callDestroyInsteadCoreDestroy", "true"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11763fc9", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("android_vessel", "destroyVesselProxyViewBeforeCreate", "true"));
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbf16145", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", OrangeConfig.getInstance().getConfig(byj.DETAIL_TAOBAO_GROUP_NAME, "enable_hybrid_webView", "true"));
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42c51160", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("cart_switch", "vlview_fireViewAppearDisappear", "true"));
    }
}
