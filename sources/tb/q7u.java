package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class q7u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(623902730);
    }

    public static void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e14b385", new Object[]{str, str2, map});
            return;
        }
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder(str);
        uTHitBuilders$UTCustomHitBuilder.setEventPage("Tixel");
        uTHitBuilders$UTCustomHitBuilder.setProperty(g1v.FIELD_ARG2, str2);
        if (map != null) {
            uTHitBuilders$UTCustomHitBuilder.setProperties(map);
        }
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
    }
}
