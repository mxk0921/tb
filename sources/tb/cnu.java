package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class cnu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(481297177);
    }

    public static boolean a(jl0 jl0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9adab99", new Object[]{jl0Var})).booleanValue();
        }
        if (c(jl0Var) || b(jl0Var)) {
            return true;
        }
        return false;
    }

    public static boolean b(jl0 jl0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4b974f6", new Object[]{jl0Var})).booleanValue();
        }
        return "plt_autodetect".equalsIgnoreCase(jl0Var.a()) && jl0Var.b().equalsIgnoreCase("cropImage");
    }

    public static boolean c(jl0 jl0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("301b82c1", new Object[]{jl0Var})).booleanValue();
        }
        return "plt_autodetect".equalsIgnoreCase(jl0Var.a()) && jl0Var.b().equalsIgnoreCase("sourceImage");
    }
}
