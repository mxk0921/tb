package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class fhz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(598737335);
    }

    public static final /* synthetic */ m9z a(n9z n9zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m9z) ipChange.ipc$dispatch("ac79516", new Object[]{n9zVar});
        }
        return b(n9zVar);
    }

    public static final m9z b(n9z n9zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m9z) ipChange.ipc$dispatch("24efd456", new Object[]{n9zVar});
        }
        return new dgz(n9zVar);
    }
}
