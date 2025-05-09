package tb;

import com.alibaba.android.aura.nodemodel.branch.AURABranchOperatorType;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class vg implements abb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(79691832);
        t2o.a(79691833);
    }

    @Override // tb.abb
    public boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0629ade", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        return !z;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return AURABranchOperatorType.not;
    }
}
