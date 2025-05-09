package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class uwt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093543);
    }

    public static void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a32028fc", new Object[]{map});
            return;
        }
        g2e D = v2s.o().D();
        if (D != null) {
            for (Map.Entry<String, String> entry : D.e().entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public static void b(HashMap<String, String> hashMap, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c79e4870", new Object[]{hashMap, str});
            return;
        }
        if (v2s.o().s() != null) {
            v2s.o().s().a(str, "Page_TaobaoLiveWatch", hashMap);
        }
        if (giv.f() != null) {
            a(hashMap);
            giv.f().a(str, hashMap);
        }
    }
}
