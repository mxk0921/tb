package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class cct {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(782237721);
    }

    public static void a(String str, String str2, boolean z) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f97f4b0", new Object[]{str, str2, new Boolean(z)});
            return;
        }
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("startup");
        uTHitBuilders$UTCustomHitBuilder.setEventPage("Tixel");
        uTHitBuilders$UTCustomHitBuilder.setProperty(dov.KEY_BIZ_LINE, str);
        uTHitBuilders$UTCustomHitBuilder.setProperty("biz_scene", str2);
        if (z) {
            str3 = "1";
        } else {
            str3 = "0";
        }
        uTHitBuilders$UTCustomHitBuilder.setProperty("is_remote", str3);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
    }
}
