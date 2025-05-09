package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class omg implements emc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093327);
        t2o.a(806354967);
    }

    @Override // tb.emc
    public Map<String, String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5c47784e", new Object[]{this});
        }
        return up6.E(vx9.d());
    }
}
