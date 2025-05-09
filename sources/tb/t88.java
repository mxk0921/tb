package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class t88 implements qx8<fxc> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final k88 f28566a;

    static {
        t2o.a(511705345);
    }

    public t88(k88 k88Var) {
        this.f28566a = k88Var;
    }

    public static t88 a(k88 k88Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t88) ipChange.ipc$dispatch("8dbe3879", new Object[]{k88Var});
        }
        return new t88(k88Var);
    }

    public static fxc c(k88 k88Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fxc) ipChange.ipc$dispatch("fd304d8e", new Object[]{k88Var});
        }
        fxc g = k88Var.g();
        gpm.c(g, "Cannot return null from a non-@Nullable @Provides method");
        return g;
    }

    /* renamed from: b */
    public fxc get() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fxc) ipChange.ipc$dispatch("d0ad7756", new Object[]{this});
        }
        return c(this.f28566a);
    }
}
