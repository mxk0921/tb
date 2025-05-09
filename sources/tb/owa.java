package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class owa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092714);
    }

    public static wwa a(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wwa) ipChange.ipc$dispatch("92de6cb6", new Object[]{ux9Var});
        }
        if (ux9Var == null || !(ux9Var.l() instanceof wwa)) {
            return null;
        }
        return (wwa) ux9Var.l();
    }

    public static boolean b(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("778254be", new Object[]{ux9Var})).booleanValue();
        }
        if (a(ux9Var) == null || a(ux9Var).a() == null || a(ux9Var).b() == null) {
            return false;
        }
        return true;
    }
}
