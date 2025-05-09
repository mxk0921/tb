package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class y2p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001823);
    }

    public static y2p a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y2p) ipChange.ipc$dispatch("b04defe", new Object[0]);
        }
        return new y2p();
    }
}
