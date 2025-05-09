package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class x2p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001822);
    }

    public x2p(gy<?, ?, ?> gyVar, Set<String> set) {
    }

    public static x2p a(gy<?, ?, ?> gyVar, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x2p) ipChange.ipc$dispatch("783c0f36", new Object[]{gyVar, set});
        }
        return new x2p(gyVar, set);
    }
}
