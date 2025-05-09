package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class x9r {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_NAME = "Page_ConfirmOrder";
    public static final int TYPE_APPEAR = 2;
    public static final int TYPE_SKIP = 1;
    public static final int TYPE_UNKNOWN = 0;

    /* renamed from: a  reason: collision with root package name */
    public static int f31239a = 0;

    static {
        t2o.a(708837570);
    }

    public static void a(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea58b748", new Object[]{context, map});
        } else if (context != null) {
            int i = f31239a;
            if (i == 2) {
                UTAnalytics.getInstance().getDefaultTracker().updatePageName(context, "Page_ConfirmOrder");
                UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(context, "Page_ConfirmOrder");
                HashMap hashMap = new HashMap();
                hashMap.put("containerType", "confirmOrderV2");
                if (map != null && map.size() > 0) {
                    hashMap.putAll(map);
                }
                UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(context, hashMap);
            } else if (i == 1) {
                UTAnalytics.getInstance().getDefaultTracker().skipPage(context);
            }
        }
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bb547ad", new Object[]{context});
        } else if (context != null && f31239a == 2) {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(context);
        }
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6b45632", new Object[]{context});
        } else {
            f31239a = 0;
        }
    }

    public static void d(Context context, int i, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c50d902", new Object[]{context, new Integer(i), map});
            return;
        }
        f31239a = i;
        a(context, map);
    }

    public static void e(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9e60a0f", new Object[]{context, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(context, map);
        }
    }
}
