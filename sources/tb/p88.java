package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class p88 implements qx8<xib> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705341);
    }

    public static xib a(k88 k88Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xib) ipChange.ipc$dispatch("a28a3726", new Object[]{k88Var});
        }
        xib c = k88Var.c();
        gpm.c(c, "Cannot return null from a non-@Nullable @Provides method");
        return c;
    }
}
