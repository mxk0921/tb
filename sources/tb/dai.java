package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTControlHitBuilder;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class dai {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(782237837);
    }

    public static void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5e94224", new Object[]{str, str2, map});
            return;
        }
        UTHitBuilders$UTControlHitBuilder uTHitBuilders$UTControlHitBuilder = new UTHitBuilders$UTControlHitBuilder("Tixel", "Material");
        uTHitBuilders$UTControlHitBuilder.setProperty(g1v.FIELD_ARG2, str);
        uTHitBuilders$UTControlHitBuilder.setProperty(g1v.FIELD_ARG3, str2);
        if (map != null) {
            uTHitBuilders$UTControlHitBuilder.setProperties(map);
        }
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTControlHitBuilder.build());
    }

    public static void b(String str, String str2, String str3, String str4, String str5, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3cc4259", new Object[]{str, str2, str3, str4, str5, new Long(j)});
        } else {
            c(str, str2, str3, str4, str5, j, "");
        }
    }

    public static void c(String str, String str2, String str3, String str4, String str5, long j, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f900e7e3", new Object[]{str, str2, str3, str4, str5, new Long(j), str6});
            return;
        }
        UTHitBuilders$UTControlHitBuilder uTHitBuilders$UTControlHitBuilder = new UTHitBuilders$UTControlHitBuilder("Tixel", "Material");
        uTHitBuilders$UTControlHitBuilder.setProperty(g1v.FIELD_ARG2, "Request");
        uTHitBuilders$UTControlHitBuilder.setProperty("action_result", "Error");
        uTHitBuilders$UTControlHitBuilder.setProperty(dov.KEY_BIZ_LINE, str);
        uTHitBuilders$UTControlHitBuilder.setProperty("param", str3);
        uTHitBuilders$UTControlHitBuilder.setProperty("time", String.valueOf(j));
        uTHitBuilders$UTControlHitBuilder.setProperty("action_event", str2);
        uTHitBuilders$UTControlHitBuilder.setProperty("code", str4);
        uTHitBuilders$UTControlHitBuilder.setProperty("message", str5);
        uTHitBuilders$UTControlHitBuilder.setProperty("tid", str6);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTControlHitBuilder.build());
    }

    public static void d(int i, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecfdd06f", new Object[]{new Integer(i), str, new Long(j)});
            return;
        }
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("Material");
        uTHitBuilders$UTCustomHitBuilder.setEventPage("Tixel");
        uTHitBuilders$UTCustomHitBuilder.setProperty(g1v.FIELD_ARG2, "file_size");
        uTHitBuilders$UTCustomHitBuilder.setProperty(g1v.FIELD_ARG3, String.valueOf(i));
        uTHitBuilders$UTCustomHitBuilder.setProperty("size", String.valueOf(j));
        uTHitBuilders$UTCustomHitBuilder.setProperty("materialId", str);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
    }

    public static void e(String str, String str2, String str3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5daef8a0", new Object[]{str, str2, str3, new Long(j)});
            return;
        }
        UTHitBuilders$UTControlHitBuilder uTHitBuilders$UTControlHitBuilder = new UTHitBuilders$UTControlHitBuilder("Tixel", "Material");
        uTHitBuilders$UTControlHitBuilder.setProperty(g1v.FIELD_ARG2, "resource");
        uTHitBuilders$UTControlHitBuilder.setProperty(g1v.FIELD_ARG3, str);
        uTHitBuilders$UTControlHitBuilder.setProperty("time", String.valueOf(j));
        uTHitBuilders$UTControlHitBuilder.setProperty("errorCode", str2);
        uTHitBuilders$UTControlHitBuilder.setProperty("errorMsg", str3);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTControlHitBuilder.build());
    }

    public static void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b28dcc4", new Object[]{str, str2});
            return;
        }
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("Material");
        uTHitBuilders$UTCustomHitBuilder.setEventPage("Tixel");
        uTHitBuilders$UTCustomHitBuilder.setProperty(dov.KEY_BIZ_LINE, str);
        uTHitBuilders$UTCustomHitBuilder.setProperty("action_event", str2);
        uTHitBuilders$UTCustomHitBuilder.setProperty("from", "cache");
        uTHitBuilders$UTCustomHitBuilder.setProperty("action_result", "success");
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
    }

    public static void g(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e442ad05", new Object[]{str, str2, new Long(j)});
        } else {
            h(str, str2, j, "");
        }
    }

    public static void h(String str, String str2, long j, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2ea7f8f", new Object[]{str, str2, new Long(j), str3});
            return;
        }
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("Material");
        uTHitBuilders$UTCustomHitBuilder.setEventPage("Tixel");
        uTHitBuilders$UTCustomHitBuilder.setProperty(g1v.FIELD_ARG2, "Request");
        uTHitBuilders$UTCustomHitBuilder.setProperty(dov.KEY_BIZ_LINE, str);
        uTHitBuilders$UTCustomHitBuilder.setProperty("action_event", str2);
        uTHitBuilders$UTCustomHitBuilder.setProperty("from", "net");
        uTHitBuilders$UTCustomHitBuilder.setProperty("action_result", "success");
        uTHitBuilders$UTCustomHitBuilder.setProperty("tid", str3);
        uTHitBuilders$UTCustomHitBuilder.setProperty("time", String.valueOf(j));
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
    }

    public static void i(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f269dd7", new Object[]{str, str2, str3});
            return;
        }
        UTHitBuilders$UTControlHitBuilder uTHitBuilders$UTControlHitBuilder = new UTHitBuilders$UTControlHitBuilder("Tixel", "Material");
        uTHitBuilders$UTControlHitBuilder.setProperty(g1v.FIELD_ARG2, "unzip_fail");
        uTHitBuilders$UTControlHitBuilder.setProperty("error", str3);
        uTHitBuilders$UTControlHitBuilder.setProperty(dov.KEY_BIZ_LINE, str);
        uTHitBuilders$UTControlHitBuilder.setProperty("materialId", str2);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTControlHitBuilder.build());
    }
}
