package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class x88 implements qx8<sae> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final k88 f31206a;

    static {
        t2o.a(511705349);
    }

    public x88(k88 k88Var) {
        this.f31206a = k88Var;
    }

    public static x88 a(k88 k88Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x88) ipChange.ipc$dispatch("a4dc4b82", new Object[]{k88Var});
        }
        return new x88(k88Var);
    }

    public static sae c(k88 k88Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sae) ipChange.ipc$dispatch("99ec17e6", new Object[]{k88Var});
        }
        sae k = k88Var.k();
        gpm.c(k, "Cannot return null from a non-@Nullable @Provides method");
        return k;
    }

    /* renamed from: b */
    public sae get() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sae) ipChange.ipc$dispatch("307300c7", new Object[]{this});
        }
        return c(this.f31206a);
    }
}
