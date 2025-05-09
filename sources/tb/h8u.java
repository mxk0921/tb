package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSAppMonitor;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class h8u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(623902813);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bde90e8f", new Object[]{str});
            return;
        }
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("Windvane");
        uTHitBuilders$UTCustomHitBuilder.setEventPage("TaoPaiSDK");
        uTHitBuilders$UTCustomHitBuilder.setProperty(g1v.FIELD_ARG2, gl4.CONFIG_ENTRY);
        uTHitBuilders$UTCustomHitBuilder.setProperty(g1v.FIELD_ARG3, str);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f90cfad", new Object[]{str, str2});
            return;
        }
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("Windvane");
        uTHitBuilders$UTCustomHitBuilder.setEventPage("TaoPaiSDK");
        uTHitBuilders$UTCustomHitBuilder.setProperty(g1v.FIELD_ARG2, "fail");
        uTHitBuilders$UTCustomHitBuilder.setProperty(g1v.FIELD_ARG3, str);
        uTHitBuilders$UTCustomHitBuilder.setProperty(MUSAppMonitor.ERROR_MSG, str2);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54f0c060", new Object[]{str});
            return;
        }
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("Windvane");
        uTHitBuilders$UTCustomHitBuilder.setEventPage("TaoPaiSDK");
        uTHitBuilders$UTCustomHitBuilder.setProperty(g1v.FIELD_ARG2, "success");
        uTHitBuilders$UTCustomHitBuilder.setProperty(g1v.FIELD_ARG3, str);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
    }
}
