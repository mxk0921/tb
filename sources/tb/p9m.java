package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTControlHitBuilder;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class p9m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(310378908);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d8aebf3", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            c(str, new HashMap());
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2461efd", new Object[]{str, str2});
        } else if (!TextUtils.isEmpty(str)) {
            c(str, xxv.a(str2));
        }
    }

    public static void c(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9a92b32", new Object[]{str, map});
        } else if (!TextUtils.isEmpty(str)) {
            UTHitBuilders$UTControlHitBuilder uTHitBuilders$UTControlHitBuilder = new UTHitBuilders$UTControlHitBuilder("Page_TaobaoLive", "Button-" + str);
            if (map != null && !map.isEmpty()) {
                uTHitBuilders$UTControlHitBuilder.setProperties(map);
            }
            UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTControlHitBuilder.build());
        }
    }

    public static void d(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f54f4384", new Object[]{str, map});
        } else if (!TextUtils.isEmpty(str)) {
            if (map == null) {
                map = new HashMap<>();
            }
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_TaobaoLive", 19999, str, "", "0", map).build());
        }
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("244567de", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            g(str, new HashMap());
        }
    }

    public static void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6df9628", new Object[]{str, str2});
        } else if (!TextUtils.isEmpty(str)) {
            g(str, xxv.a(str2));
        }
    }

    public static void g(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae2ffbe7", new Object[]{str, map});
        } else if (!TextUtils.isEmpty(str)) {
            map.put("deviceLevel", "" + ckr.a());
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_TaobaoLive", 2201, str, "", "0", map).build());
        }
    }
}
