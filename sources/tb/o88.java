package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class o88 implements qx8<qeb> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705340);
    }

    public static qeb a(k88 k88Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qeb) ipChange.ipc$dispatch("db320606", new Object[]{k88Var});
        }
        qeb b = k88Var.b();
        gpm.c(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }
}
