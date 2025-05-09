package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class a0s {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String WX_V2_CONFIG = "weex_v2_config";

    static {
        t2o.a(773849116);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("635c326", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("android_weex_common_config", "disableInitInUIThread", "false"));
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d1f69b", new Object[0]);
        }
        return OrangeConfig.getInstance().getConfig("android_weex_common_config", "loadingList", "['https://market.m.taobao.com/app/vip/receiver-address/pages/list','https://market.m.taobao.com/app/vip/receiver-address/pages/address','https://market.m.taobao.com/app/vip/receiver-address/pages/lbs-list','https://market.m.taobao.com/app/vip/receiver-address/pages/change','https://market.m.taobao.com/apps/market/shop/weex_v2.html']");
    }
}
