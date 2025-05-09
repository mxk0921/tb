package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.monitor.UmiPublishMonitor;
import java.util.Arrays;
import java.util.Map;
import kotlin.collections.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ehn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(758120569);
    }

    public static final void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1187f6f6", new Object[]{str, str2, str3});
            return;
        }
        ckf.g(str, "errorMsg");
        ckf.g(str2, "errorCode");
        ckf.g(str3, "errorInfo");
        b(str, str2, str3, null);
    }

    public static /* synthetic */ void c(String str, String str2, String str3, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7b81bec", new Object[]{str, str2, str3, new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        a(str, str2, str3);
    }

    public static final void d(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21999d6f", new Object[]{str, map});
            return;
        }
        ckf.g(str, "actionInfo");
        Map k = a.k(jpu.a("umi_pub_session", yep.INSTANCE.a()), jpu.a("umimonitor_info_node", str));
        if (map != null) {
            k.putAll(map);
        }
        String[] e = vhn.e(k);
        pd0.e().a(UmiPublishMonitor.UT_PAGE_NAME, 19999, "RatePublishFullChainMonitor_info", "x_rate", null, (String[]) Arrays.copyOf(e, e.length));
    }

    public static final void b(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f54a59cf", new Object[]{str, str2, str3, map});
            return;
        }
        ckf.g(str, "errorMsg");
        ckf.g(str2, "errorCode");
        ckf.g(str3, "errorInfo");
        Map k = a.k(jpu.a("umi_pub_session", yep.INSTANCE.a()), jpu.a("umimonitor_error_msg", str), jpu.a("umimonitor_error_code", str2), jpu.a("umimonitor_info_node", str3));
        if (map != null) {
            k.putAll(map);
        }
        String[] e = vhn.e(k);
        pd0.e().a(UmiPublishMonitor.UT_PAGE_NAME, 19999, "RatePublishFullChainMonitor_error", "x_rate", null, (String[]) Arrays.copyOf(e, e.length));
    }
}
