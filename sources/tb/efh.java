package tb;

import android.text.TextUtils;
import com.alibaba.analytics.core.model.Log;
import com.alibaba.analytics.core.sync.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class efh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(962592811);
    }

    public static void a(Map<String, String> map) {
        String str;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18ded4f", new Object[]{map});
            return;
        }
        nhh.q();
        if (map != null) {
            String str2 = map.get(oeh.EVENTID);
            if (!map.containsKey("_priority") && ("2201".equalsIgnoreCase(str2) || "2202".equalsIgnoreCase(str2))) {
                map.put("_priority", "4");
            }
            if (map.containsKey("_priority")) {
                str = map.remove("_priority");
            } else {
                str = "3";
            }
            String b = cfh.c().b(str2);
            if (!TextUtils.isEmpty(b)) {
                str = b;
            }
            if (map.containsKey("_sls")) {
                map.remove("_sls");
                z = true;
            } else {
                z = false;
            }
            int i = n2v.g().k() ? n2v.g().i(map) : 0;
            Log log = new Log(str, null, str2, map);
            if (i > 0) {
                nhh.f("", "topicId", Integer.valueOf(i));
                log.setTopicId(i);
                a.h().f(log);
            }
            if (z) {
                ofh.l().e(log);
            } else {
                ofh.l().d(log);
            }
        }
    }
}
