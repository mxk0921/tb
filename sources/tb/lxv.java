package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class lxv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(522190857);
    }

    public static void a(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5f426b7", new Object[]{str, hashMap});
            return;
        }
        try {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_MegaAdaptiveKit", 2201, "Page_MegaAdaptiveKit_" + str, null, null, hashMap).build());
        } catch (Throwable unused) {
        }
    }
}
