package tb;

import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.CoreConstants;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class gb0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INTENT_KEY_MY_TAOBAO_NEED_REFRESH = "myTaoBaoNeedRefresh";
    public static final String INTENT_KEY_ORDER_DETAIL_NEED_REFRESH = "orderDetailNeedRefresh";
    public static final String INTENT_KEY_ORDER_LIST_NEED_REFRESH = "orderListNeedRefresh";

    static {
        t2o.a(713031783);
    }

    public static void c(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53b19a37", new Object[]{context, new Boolean(z)});
            return;
        }
        nl2.f(nl2.ORDER_ACTION, context, INTENT_KEY_ORDER_DETAIL_NEED_REFRESH, z);
        lor.c("ActivityHelper", "refreshOrderDetail", "action = orderDetailNeedRefresh");
    }

    public static void d(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d934684", new Object[]{context, new Boolean(z)});
        } else {
            e(context, z, null);
        }
    }

    public static void e(Context context, boolean z, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5048241", new Object[]{context, new Boolean(z), intent});
            return;
        }
        nl2.e(nl2.ORDER_ACTION, context, intent, INTENT_KEY_ORDER_LIST_NEED_REFRESH, z);
        lor.c("ActivityHelper", "refreshOrderList", "action = orderListNeedRefresh");
    }

    public static void a(Context context, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f22ae9b", new Object[]{context, list});
            return;
        }
        Intent intent = new Intent();
        HashMap hashMap = new HashMap();
        hashMap.put(CoreConstants.BATCH_CONFIRM_GOOD_ONLINE_ORDER_IDS, list);
        intent.putExtra(CoreConstants.QUERY_PARAM_KEY_CONDITION, hashMap);
        nl2.e(nl2.ORDER_ACTION, context, intent, INTENT_KEY_ORDER_LIST_NEED_REFRESH, false);
    }

    public static void b(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("300b54e8", new Object[]{context, new Boolean(z)});
            return;
        }
        nl2.f("MyTaobao_Order_Refresh", context, INTENT_KEY_MY_TAOBAO_NEED_REFRESH, false);
        lor.c("ActivityHelper", "refreshMyTaoBao", "action = myTaoBaoNeedRefresh");
    }
}
