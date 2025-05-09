package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.common.ShopConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ppp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(764412001);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10919e9d", new Object[]{str});
        } else {
            AppMonitor.Alarm.commitFail(ShopConstants.PAGE_SHOP, "shopRuleSet", str, "55006", "店铺url拦截异常");
        }
    }
}
