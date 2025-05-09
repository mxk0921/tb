package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class o9l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(713031750);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6dbefd42", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("order", CoreConstants.ORDER_LIST_RECOMMEND, "true"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5a0cfcb", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("order", CoreConstants.LIST_DOWNGRADE_OPEN, "true"));
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d7e1cc9", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("order", CoreConstants.DETAIL_DOWNGRADE_OPEN, "true"));
    }
}
