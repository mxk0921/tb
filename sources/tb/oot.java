package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.linkmanager.afc.reduction.LoginReductionManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class oot implements wg0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(744489010);
        t2o.a(467664946);
    }

    @Override // tb.wg0
    public void a(qg0 qg0Var, String str, dad dadVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec5725b9", new Object[]{this, qg0Var, str, dadVar});
        } else if (!pg0.i().o()) {
            LoginReductionManager.l().g(qg0Var.C, true);
        }
    }

    @Override // tb.wg0
    public int b(qg0 qg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d241b11", new Object[]{this, qg0Var})).intValue();
        }
        return 0;
    }

    @Override // tb.wg0
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e1aa3fd", new Object[]{this})).intValue();
        }
        return 1;
    }
}
