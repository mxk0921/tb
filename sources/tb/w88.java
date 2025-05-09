package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class w88 implements qx8<uzd> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705348);
    }

    public static uzd a(k88 k88Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uzd) ipChange.ipc$dispatch("d72e2b26", new Object[]{k88Var});
        }
        uzd j = k88Var.j();
        gpm.c(j, "Cannot return null from a non-@Nullable @Provides method");
        return j;
    }
}
