package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.monitor.a;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bw7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262781);
    }

    public static void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84ccc591", new Object[]{new Integer(i), str});
        } else {
            a.b(i, str);
        }
    }

    public static void b(Map<String, String> map, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("578dea64", new Object[]{map, new Integer(i), str});
        } else {
            a.d(map, i, str);
        }
    }

    public static void c(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de66e988", new Object[]{str, map});
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            if (map == null) {
                map = new HashMap<>();
            }
            map.put("featureType", str);
        }
        a.f(map);
    }
}
