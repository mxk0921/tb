package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class t0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ABTestUtils";

    static {
        t2o.a(806356458);
    }

    public static void a(Map<String, List<String>> map, Object obj) {
        String str = "mtop-mdepyixiu";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a3fc0a", new Object[]{map, obj});
        } else if (map != null) {
            try {
                if (!map.isEmpty()) {
                    if (map.get(str) == null) {
                        str = "MTOP-mdepYixiu";
                    }
                    List<String> list = map.get(str);
                    if (list != null && !list.isEmpty()) {
                        for (String str2 : list) {
                            JSONArray parseArray = JSON.parseArray(str2);
                            if (parseArray != null && !parseArray.isEmpty()) {
                                for (int i = 0; i < parseArray.size(); i++) {
                                    Object obj2 = parseArray.get(i);
                                    u9b c = v2s.o().c();
                                    if (!(c == null || obj2 == null)) {
                                        c.a(obj2.toString(), obj);
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}
