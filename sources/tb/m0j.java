package tb;

import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class m0j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(573571212);
    }

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d03de6", new Object[]{str, str2, str3, str4});
        } else {
            AppMonitor.Alarm.commitFail("MmAdBizSDK", str, str2, str3, str4);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf7e9e5", new Object[]{str, str2});
        } else {
            AppMonitor.Alarm.commitSuccess("MmAdBizSDK", str, str2);
        }
    }

    public static void c(nwi nwiVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2c75d9d", new Object[]{nwiVar, str});
        } else {
            l(nwiVar, "choose_ad", str, null);
        }
    }

    public static void d(nwi nwiVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc15cbe7", new Object[]{nwiVar, str, str2});
        } else {
            l(nwiVar, "choose_ad", str, str2);
        }
    }

    public static void e(nwi nwiVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9f4195e", new Object[]{nwiVar, str});
        } else {
            l(nwiVar, "interact_ad", str, null);
        }
    }

    public static void f(nwi nwiVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f36706", new Object[]{nwiVar, str, str2});
        } else {
            l(nwiVar, "interact_ad", str, str2);
        }
    }

    public static void g(nwi nwiVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("654ee51a", new Object[]{nwiVar, str});
        } else {
            l(nwiVar, "link_animate", str, null);
        }
    }

    public static void h(nwi nwiVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70c927ca", new Object[]{nwiVar, str, str2});
        } else {
            l(nwiVar, "link_animate", str, str2);
        }
    }

    public static void i(nwi nwiVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1cc5628", new Object[]{nwiVar, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("creativeId", str2);
        m(nwiVar, "receive_data", str, null, hashMap);
    }

    public static void j(nwi nwiVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1486437e", new Object[]{nwiVar, str});
        } else {
            l(nwiVar, "render_ad", str, null);
        }
    }

    public static void k(nwi nwiVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96c3d8e6", new Object[]{nwiVar, str, str2});
        } else {
            l(nwiVar, "render_ad", str, str2);
        }
    }

    public static void l(nwi nwiVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8138081", new Object[]{nwiVar, str, str2, str3});
        } else {
            m(nwiVar, str, str2, str3, null);
        }
    }

    public static void m(nwi nwiVar, String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("514f28e4", new Object[]{nwiVar, str, str2, str3, map});
            return;
        }
        n(nwiVar, str, str2, str3, map);
        if (TextUtils.isEmpty(str3)) {
            b(str, str2);
        } else {
            a(str, str2, str2, str3);
        }
    }

    public static void n(nwi nwiVar, String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9353057f", new Object[]{nwiVar, str, str2, str3, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("topshow_stage", str);
        map.put("topshow_stage_status", str2);
        if (!TextUtils.isEmpty(str3)) {
            map.put("topshow_error_msg", str3);
        }
        i4v.m(str, nwiVar, map);
    }
}
