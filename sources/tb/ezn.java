package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSAppMonitor;
import com.taobao.tao.util.NetWorkUtils;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ezn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(623902790);
    }

    public static void a(String str, String str2, String str3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e775e3a", new Object[]{str, str2, str3, new Long(j)});
            return;
        }
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("TpSoRemote");
        uTHitBuilders$UTCustomHitBuilder.setEventPage("Tixel");
        uTHitBuilders$UTCustomHitBuilder.setProperty(g1v.FIELD_ARG2, str);
        uTHitBuilders$UTCustomHitBuilder.setProperty(MUSAppMonitor.ERROR_MSG, str2);
        uTHitBuilders$UTCustomHitBuilder.setProperty("error_detail", str3);
        uTHitBuilders$UTCustomHitBuilder.setProperty("time", String.valueOf(j));
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
    }

    public static void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2a4e66d", new Object[]{context, str});
            return;
        }
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("TpSoRemote");
        uTHitBuilders$UTCustomHitBuilder.setEventPage("Tixel");
        uTHitBuilders$UTCustomHitBuilder.setProperty(g1v.FIELD_ARG2, gl4.CONFIG_ENTRY);
        uTHitBuilders$UTCustomHitBuilder.setProperty(g1v.FIELD_ARG3, str);
        uTHitBuilders$UTCustomHitBuilder.setProperty("network_state", NetWorkUtils.GetNetworkType(context));
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
    }

    public static void c(String str, int i, String str2, String str3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("877ffd70", new Object[]{str, new Integer(i), str2, str3, new Long(j)});
            return;
        }
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("TpSoRemote");
        uTHitBuilders$UTCustomHitBuilder.setEventPage("Tixel");
        uTHitBuilders$UTCustomHitBuilder.setProperty(g1v.FIELD_ARG2, "fail");
        uTHitBuilders$UTCustomHitBuilder.setProperty(z9u.KEY_TAOKE_BIZSCENE, str);
        uTHitBuilders$UTCustomHitBuilder.setProperty("status", String.valueOf(i));
        uTHitBuilders$UTCustomHitBuilder.setProperty("time", String.valueOf(j));
        uTHitBuilders$UTCustomHitBuilder.setProperty("error_code", str2);
        uTHitBuilders$UTCustomHitBuilder.setProperty(MUSAppMonitor.ERROR_MSG, str3);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3328acff", new Object[]{str, str2});
            return;
        }
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("TpSoRemote");
        uTHitBuilders$UTCustomHitBuilder.setEventPage("Tixel");
        uTHitBuilders$UTCustomHitBuilder.setProperty(g1v.FIELD_ARG2, "InitError");
        uTHitBuilders$UTCustomHitBuilder.setProperty("error_detail", str2);
        uTHitBuilders$UTCustomHitBuilder.setProperty(MUSAppMonitor.ERROR_MSG, str);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
    }

    public static void e(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4927c264", new Object[]{str, new Long(j)});
            return;
        }
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("TpSoRemote");
        uTHitBuilders$UTCustomHitBuilder.setEventPage("Tixel");
        uTHitBuilders$UTCustomHitBuilder.setProperty(g1v.FIELD_ARG2, "success");
        uTHitBuilders$UTCustomHitBuilder.setProperty(z9u.KEY_TAOKE_BIZSCENE, str);
        uTHitBuilders$UTCustomHitBuilder.setProperty("time", String.valueOf(j));
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
    }
}
