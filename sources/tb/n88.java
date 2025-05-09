package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class n88 implements qx8<ueb> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705339);
    }

    public static ueb a(k88 k88Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ueb) ipChange.ipc$dispatch("c296b84a", new Object[]{k88Var});
        }
        ueb a2 = k88Var.a();
        gpm.c(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
