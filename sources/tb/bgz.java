package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class bgz<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public T f16380a;
    public final jhz b;

    static {
        t2o.a(598737463);
    }

    public bgz(T t, jhz jhzVar) {
        ckf.g(jhzVar, "funcContext");
        this.f16380a = t;
        this.b = jhzVar;
    }

    public final T a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("6045ccb0", new Object[]{this});
        }
        g1a<bgz<hhz>, xhv> k = this.b.k();
        if (k != null) {
            k.invoke(this);
        }
        return this.f16380a;
    }

    public final void b(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d63f592", new Object[]{this, t});
            return;
        }
        this.f16380a = t;
        g1a<bgz<hhz>, xhv> l = this.b.l();
        if (l != null) {
            l.invoke(this);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return String.valueOf(this.f16380a);
    }
}
