package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class u88 implements qx8<fyp> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final k88 f29225a;

    static {
        t2o.a(511705346);
    }

    public u88(k88 k88Var) {
        this.f29225a = k88Var;
    }

    public static u88 a(k88 k88Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u88) ipChange.ipc$dispatch("d669fded", new Object[]{k88Var});
        }
        return new u88(k88Var);
    }

    public static fyp c(k88 k88Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fyp) ipChange.ipc$dispatch("b1861a9d", new Object[]{k88Var});
        }
        fyp h = k88Var.h();
        gpm.c(h, "Cannot return null from a non-@Nullable @Provides method");
        return h;
    }

    /* renamed from: b */
    public fyp get() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fyp) ipChange.ipc$dispatch("46d91059", new Object[]{this});
        }
        return c(this.f29225a);
    }
}
