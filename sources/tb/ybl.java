package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliConfigInterface;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ybl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(785383560);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42a9a603", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b != null) {
            return Boolean.parseBoolean(b.getConfig("android_sku", "enableHideLightOffOnDowngrade", "true"));
        }
        return true;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db4d9b41", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b != null) {
            return Boolean.parseBoolean(b.getConfig("android_sku", "enableMainMtopApi", "true"));
        }
        return true;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("882cad96", new Object[0])).booleanValue();
        }
        AliConfigInterface b = yo0.b();
        if (b != null) {
            return Boolean.parseBoolean(b.getConfig("android_sku", "enablePrefetchSkuMtop", "true"));
        }
        return true;
    }

    public static List<String> d() {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b2923d2", new Object[0]);
        }
        AliConfigInterface b = yo0.b();
        if (b == null) {
            strArr = "referrer,URL_REFERER_ORIGIN,NAV_START_ACTIVITY_TIME,NAV_TO_URL_START_TIME,WEEX_NAV_PROCESSOR_TIME,NAV_START_ACTIVITY_UPTIME,NAV_TO_URL_START_UPTIME".split(",");
        } else {
            strArr = b.getConfig("android_sku", "sku_request_params_black_list", "referrer,URL_REFERER_ORIGIN,NAV_START_ACTIVITY_TIME,NAV_TO_URL_START_TIME,WEEX_NAV_PROCESSOR_TIME,NAV_START_ACTIVITY_UPTIME,NAV_TO_URL_START_UPTIME").split(",");
        }
        return Arrays.asList(strArr);
    }
}
