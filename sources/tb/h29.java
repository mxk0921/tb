package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class h29 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1007681556);
    }

    public static final boolean a(g29 g29Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cdecd8a0", new Object[]{g29Var})).booleanValue();
        }
        ckf.g(g29Var, "<this>");
        if (g29Var.b() - bvt.d(ftt.Companion) >= 300000) {
            return true;
        }
        return false;
    }
}
