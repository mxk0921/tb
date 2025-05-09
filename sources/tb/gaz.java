package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class gaz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f19857a;
    public long b;

    static {
        t2o.a(598737520);
    }

    public /* synthetic */ gaz(long j, long j2, a07 a07Var) {
        this(j, j2);
    }

    public final long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("533f90a5", new Object[]{this})).longValue();
        }
        return this.f19857a;
    }

    public final long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c8e2491", new Object[]{this})).longValue();
        }
        return this.b;
    }

    public final void c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9020dde", new Object[]{this, new Long(j)});
        } else {
            this.f19857a = j;
        }
    }

    public final void d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b26cc3e0", new Object[]{this, new Long(j)});
        } else {
            this.b = j;
        }
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gaz)) {
            return false;
        }
        gaz gazVar = (gaz) obj;
        if (eaz.c(this.f19857a, gazVar.f19857a) && haz.d(this.b, gazVar.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (eaz.f(this.f19857a) * 31) + haz.g(this.b);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "IntRect(point=" + ((Object) eaz.g(this.f19857a)) + ", size=" + ((Object) haz.h(this.b)) + ')';
    }

    public gaz(long j, long j2) {
        this.f19857a = j;
        this.b = j2;
    }

    public /* synthetic */ gaz(long j, long j2, int i, a07 a07Var) {
        this((i & 1) != 0 ? faz.a(0, 0) : j, (i & 2) != 0 ? iaz.a(0, 0) : j2, null);
    }
}
