package tb;

import com.alibaba.ut.abtest.UTABMethod;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class hrv implements mk8<fjh> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(961544303);
        t2o.a(961544297);
    }

    @Override // tb.mk8
    public void onEvent(bj8<fjh> bj8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("148a3e67", new Object[]{this, bj8Var});
            return;
        }
        n.j().e().syncExperiments(true, "user");
        if (n.j().c() == UTABMethod.Push) {
            n.j().m().syncExperiments(true, "user");
        }
    }
}
