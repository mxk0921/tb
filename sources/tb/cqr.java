package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class cqr implements vvc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092357);
        t2o.a(806355921);
    }

    @Override // tb.vvc
    public bwd a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bwd) ipChange.ipc$dispatch("34c31396", new Object[]{this});
        }
        return new n1h();
    }
}
