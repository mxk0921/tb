package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class w2p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001821);
    }

    public w2p(gy<?, ?, ?> gyVar, Set<String> set) {
    }

    public static w2p a(gy<?, ?, ?> gyVar, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w2p) ipChange.ipc$dispatch("e1381c05", new Object[]{gyVar, set});
        }
        return new w2p(gyVar, set);
    }
}
