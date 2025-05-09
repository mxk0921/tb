package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Collections;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qvv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(437256350);
    }

    public static void a(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b053ce02", new Object[]{str, str2, str3, map});
            return;
        }
        if (map == null) {
            map = Collections.emptyMap();
        }
        Map<String, String> build = new UTOriginalCustomHitBuilder(ah0.PAGE_FLOWCUSTOMS, 19999, str, str2, str3, map).build();
        hgh.b("arg1: " + str + "  arg2: " + str2 + "  arg3: " + str3 + " args = " + build);
        UTAnalytics.getInstance().getDefaultTracker().send(build);
    }
}
