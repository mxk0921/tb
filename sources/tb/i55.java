package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class i55 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(440402009);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b32aef", new Object[0])).booleanValue();
        }
        return d("industry_config", "enablePreloadMiniApp", true);
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab3c9e3c", new Object[0]);
        }
        return e("industry_custom_detail_android", "beauty_ar_bizcode", "beautyARTrial");
    }

    public static boolean d(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab1b925e", new Object[]{str, str2, new Boolean(z)})).booleanValue();
        }
        return "true".equals(e(str, str2, String.valueOf(z)));
    }

    public static String e(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e7c07bbd", new Object[]{str, str2, str3});
        }
        return OrangeConfig.getInstance().getConfig(str, str2, str3);
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fc212fc", new Object[0])).booleanValue();
        }
        return d("industry_custom_detail_android", "ar_isv_expend_enable", true);
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5797a652", new Object[0])).booleanValue();
        }
        return d("industry_custom_detail_android", "ar_expend_enable", true);
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d10b1122", new Object[0])).booleanValue();
        }
        return d("industry_custom_detail_android", "ar_camera_preview_set", false);
    }
}
