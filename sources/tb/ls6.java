package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.hs6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ls6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(463470656);
    }

    public static hs6 a(qzo qzoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hs6) ipChange.ipc$dispatch("1882b81e", new Object[]{qzoVar});
        }
        return b(qzoVar, null);
    }

    public static hs6 b(qzo qzoVar, hs6.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hs6) ipChange.ipc$dispatch("3b1690ce", new Object[]{qzoVar, aVar});
        }
        return c(qzoVar, aVar, null);
    }

    public static hs6 c(qzo qzoVar, hs6.a aVar, js6 js6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hs6) ipChange.ipc$dispatch("bb9a0b47", new Object[]{qzoVar, aVar, js6Var});
        }
        hs6 hs6Var = new hs6();
        hs6Var.h(qzoVar);
        hs6Var.g(aVar);
        hs6Var.e(js6Var);
        return hs6Var;
    }
}
