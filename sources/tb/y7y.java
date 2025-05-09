package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class y7y {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static synchronized Map<String, String> a(Context context, Map<String, String> map) {
        synchronized (y7y.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("f5f4589a", new Object[]{context, map});
            }
            HashMap hashMap = new HashMap();
            String b = vux.b(map, "tid", "");
            String b2 = vux.b(map, "utdid", "");
            String b3 = vux.b(map, "userId", "");
            String b4 = vux.b(map, "appName", "");
            String b5 = vux.b(map, "appKeyClient", "");
            String b6 = vux.b(map, "tmxSessionId", "");
            String n = yby.n(context);
            String b7 = vux.b(map, "sessionId", "");
            hashMap.put("AC1", b);
            hashMap.put("AC2", b2);
            hashMap.put("AC3", "");
            hashMap.put("AC4", n);
            hashMap.put("AC5", b3);
            hashMap.put("AC6", b6);
            hashMap.put("AC7", "");
            hashMap.put("AC8", b4);
            hashMap.put("AC9", b5);
            if (vux.f(b7)) {
                hashMap.put("AC10", b7);
            }
            return hashMap;
        }
    }
}
