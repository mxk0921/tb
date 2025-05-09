package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class alk<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public T f15824a;

    static {
        t2o.a(1001390091);
    }

    public alk(T t) {
        this.f15824a = t;
    }

    public final T a(by1 by1Var, a0g<?> a0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("337440f7", new Object[]{this, by1Var, a0gVar});
        }
        ckf.g(a0gVar, "property");
        return this.f15824a;
    }

    public final void b(by1 by1Var, a0g<?> a0gVar, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4493ac3", new Object[]{this, by1Var, a0gVar, t});
            return;
        }
        ckf.g(a0gVar, "property");
        T t2 = this.f15824a;
        this.f15824a = t;
        if (by1Var != null) {
            by1Var.update$cmp_foundation_release(a0gVar.getName(), t2, t);
        }
    }
}
