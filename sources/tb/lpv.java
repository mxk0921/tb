package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class lpv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final lpv INSTANCE = new lpv();

    static {
        t2o.a(1022361974);
    }

    public final Boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("9d089d63", new Object[]{this});
        }
        Map<?, ?> a2 = zm8.a(dr.g(dr.INSTANCE, "user", "isLogin", new LinkedHashMap(), null, 8, null));
        if (a2 != null) {
            return ht4.a(a2, "result");
        }
        return null;
    }
}
