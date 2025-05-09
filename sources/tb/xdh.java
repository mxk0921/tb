package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xdh implements uqh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(577765395);
        t2o.a(577765385);
    }

    @Override // tb.uqh
    public Map<String, Object> a(String str, Map<String, Object> map) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("36d6b146", new Object[]{this, str, map});
        }
        if ("log".equalsIgnoreCase(str)) {
            if (map != null) {
                str2 = map.get("task_name") + "";
            } else {
                str2 = null;
            }
            kgh.m(str2, map);
        }
        return null;
    }
}
