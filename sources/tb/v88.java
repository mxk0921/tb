package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class v88 implements qx8<x7d> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705347);
    }

    public static x7d a(k88 k88Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x7d) ipChange.ipc$dispatch("1ec9a406", new Object[]{k88Var});
        }
        x7d i = k88Var.i();
        gpm.c(i, "Cannot return null from a non-@Nullable @Provides method");
        return i;
    }
}
