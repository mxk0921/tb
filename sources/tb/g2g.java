package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class g2g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f19700a;

    static {
        t2o.a(1002438687);
    }

    public g2g() {
        this(false, 1, null);
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("953cd0e2", new Object[]{this})).booleanValue();
        }
        return this.f19700a;
    }

    public g2g(boolean z) {
        this.f19700a = z;
    }

    public /* synthetic */ g2g(boolean z, int i, a07 a07Var) {
        this((i & 1) != 0 ? false : z);
    }
}
