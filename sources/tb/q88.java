package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class q88 implements qx8<prb> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705342);
    }

    public static prb a(k88 k88Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (prb) ipChange.ipc$dispatch("9477fde6", new Object[]{k88Var});
        }
        prb d = k88Var.d();
        gpm.c(d, "Cannot return null from a non-@Nullable @Provides method");
        return d;
    }
}
