package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTControlHitBuilder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class o9m {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_TAOLIVE = "Page_TaobaoLive";
    public static final String POINT_VIDEOPALY_CTRNAME = "playviewtoken_reuse";

    static {
        t2o.a(806356542);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2461efd", new Object[]{str, str2});
        } else if (!TextUtils.isEmpty(str)) {
            b(str, c(str2));
        }
    }

    public static void b(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9a92b32", new Object[]{str, map});
        } else if (!TextUtils.isEmpty(str)) {
            UTHitBuilders$UTControlHitBuilder uTHitBuilders$UTControlHitBuilder = new UTHitBuilders$UTControlHitBuilder("Button-" + str);
            if (map != null) {
                if (!map.containsKey("deviceLevel")) {
                    map.put("deviceLevel", "" + fkr.b());
                }
                uTHitBuilders$UTControlHitBuilder.setProperties(map);
            }
            UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTControlHitBuilder.build());
        }
    }

    public static Map<String, String> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("40a3ee56", new Object[]{str});
        }
        HashMap hashMap = new HashMap();
        if (!arq.a(str)) {
            try {
                for (String str2 : str.split(",")) {
                    String[] split = str2.split("=");
                    if (2 == split.length) {
                        hashMap.put(split[0], split[1]);
                    }
                }
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }
}
