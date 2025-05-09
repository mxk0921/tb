package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class r88 implements qx8<y6c> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705343);
    }

    public static y6c a(k88 k88Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y6c) ipChange.ipc$dispatch("994850a6", new Object[]{k88Var});
        }
        y6c e = k88Var.e();
        gpm.c(e, "Cannot return null from a non-@Nullable @Provides method");
        return e;
    }
}
