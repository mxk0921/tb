package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.android.order.core.container.UltronListProxy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ocl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(614465616);
    }

    public static wqb a(OrderConfigs orderConfigs) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wqb) ipChange.ipc$dispatch("50b015e7", new Object[]{orderConfigs});
        }
        if (orderConfigs.c() == OrderConfigs.BizNameType.ORDER_DETAIL) {
            return new t7v(orderConfigs);
        }
        if (orderConfigs.c() == OrderConfigs.BizNameType.ORDER_LIST) {
            return new UltronListProxy(orderConfigs);
        }
        return new UltronListProxy(orderConfigs);
    }
}
