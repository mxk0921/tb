package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class d9j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809442);
        new HashMap();
    }

    public static void a(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f54a59cf", new Object[]{str, str2, str3, map});
            return;
        }
        fve.e("MultiInfoRecord", "commitError -> " + str + ",id:" + str2);
        tve.c(str, "", "1.0", "Page_Home_MultiTab", str3, map);
    }

    public static void b(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a9b023", new Object[]{str, str2, map});
            return;
        }
        if (map != null) {
            map.put("deviceLevel", m0b.d());
        }
        fve.e("MultiInfoRecord", "commitState -> " + str + ",transition:" + str2);
        tve.c(str, "", "1.0", "Page_Home_MultiTab", str2, map);
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
            return;
        }
        fve.e("MultiInfoRecord", str + "->" + str2);
    }

    public static void d(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{str, str2, th});
            return;
        }
        fve.c("MultiInfoRecord", str + "->" + str2, th);
    }
}
