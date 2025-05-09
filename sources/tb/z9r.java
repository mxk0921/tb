package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class z9r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(714080282);
    }

    public static void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5829d98", new Object[]{str, map});
        } else {
            d(19999, str, null, null, map);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0dcb6cb", new Object[]{str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errMsg", str2);
        c("Page_ConfirmOrder_Alert", str, hashMap);
    }

    public static void c(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a04190b9", new Object[]{str, str2, map});
        } else {
            d(2201, str, str2, null, map);
        }
    }

    public static void d(int i, String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805248b8", new Object[]{new Integer(i), str, str2, str3, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_ConfirmOrder", i, str, str2, str3, map).build());
        }
    }
}
