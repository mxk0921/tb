package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class s88 implements qx8<bjc> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705344);
    }

    public static bjc a(k88 k88Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bjc) ipChange.ipc$dispatch("360f1ff0", new Object[]{k88Var});
        }
        bjc f = k88Var.f();
        gpm.c(f, "Cannot return null from a non-@Nullable @Provides method");
        return f;
    }
}
