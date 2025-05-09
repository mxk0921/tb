package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class wmm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321669);
    }

    public static void a(Context context, ue7 ue7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a05835ce", new Object[]{context, ue7Var});
        } else if (b(ue7Var)) {
            dnm.p(null).t(context, ue7Var.A0());
        }
    }

    public static boolean b(ue7 ue7Var) {
        g9e A0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fe04b13", new Object[]{ue7Var})).booleanValue();
        }
        if (ue7Var == null || (A0 = ue7Var.A0()) == null || !A0.k()) {
            return false;
        }
        return true;
    }

    public static void d(dh7 dh7Var, ue7 ue7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("392ee86c", new Object[]{dh7Var, ue7Var});
        } else if (b(ue7Var)) {
            dnm.p(dh7Var).w();
        }
    }
}
