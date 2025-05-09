package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ltf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(995098631);
    }

    public static void a(b12 b12Var, qg3 qg3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21cc3b62", new Object[]{b12Var, qg3Var});
        } else {
            b(b12Var, qg3Var, null);
        }
    }

    public static void b(b12 b12Var, qg3 qg3Var, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcff2fe3", new Object[]{b12Var, qg3Var, map});
            return;
        }
        otf otfVar = new otf(b12Var.getActivity(), b12Var, (acx) b12Var.getModel());
        otfVar.J2(map);
        if (qg3Var != null) {
            qg3Var.R0(otfVar);
        }
        b12Var.subscribeEvent(otfVar);
        b12Var.subscribeScopeEvent(otfVar, "childPageWidget");
        ((acx) b12Var.getModel()).e().subscribe(otfVar);
    }
}
