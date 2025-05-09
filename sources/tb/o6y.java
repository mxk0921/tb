package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class o6y {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static synchronized Map<String, String> a(Context context, Map<String, String> map) {
        synchronized (o6y.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("f5f4589a", new Object[]{context, map});
            }
            String b = vux.b(map, "appchannel", "");
            HashMap hashMap = new HashMap();
            hashMap.put("AA1", context.getPackageName());
            cvx.b();
            hashMap.put("AA2", cvx.a(context));
            hashMap.put("AA3", "APPSecuritySDK-TAOBAO");
            hashMap.put("AA4", "3.5.0.20240702");
            hashMap.put("AA6", b);
            return hashMap;
        }
    }
}
