package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class n2g<T> implements jic {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public q2g f24465a;
    public T b;

    static {
        t2o.a(1002438676);
        t2o.a(1002438710);
    }

    public n2g() {
        this(null, null, null, 7, null);
    }

    public final T a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("4ca84d6b", new Object[]{this});
        }
        return this.b;
    }

    public final q2g b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q2g) ipChange.ipc$dispatch("59c55f0f", new Object[]{this});
        }
        return this.f24465a;
    }

    @Override // tb.jic
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a483ed", new Object[]{this});
            return;
        }
        this.b = null;
        this.f24465a = q2g.Companion.c();
        o2g.Companion.a();
    }

    public n2g(o2g o2gVar, q2g q2gVar, T t) {
        ckf.g(o2gVar, "category");
        ckf.g(q2gVar, "identifier");
        this.f24465a = q2gVar;
        this.b = t;
    }

    public /* synthetic */ n2g(o2g o2gVar, q2g q2gVar, Object obj, int i, a07 a07Var) {
        this((i & 1) != 0 ? o2g.Companion.a() : o2gVar, (i & 2) != 0 ? q2g.Companion.c() : q2gVar, (i & 4) != 0 ? null : obj);
    }
}
