package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class dn8<T, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final T f17960a;
    public final R b;
    public final int c;
    public final String d;
    public final fn8 e;

    public dn8(T t, R r, int i, String str, fn8 fn8Var) {
        this.f17960a = t;
        this.b = r;
        this.c = i;
        this.d = str;
        this.e = fn8Var;
    }

    public static <T, R> dn8<T, R> a(T t, R r, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dn8) ipChange.ipc$dispatch("1cc88369", new Object[]{t, r, str});
        }
        return new dn8<>(t, r, 0, str, fn8.b(-1L, -1L));
    }

    public static <T, R> dn8<T, R> h(T t, R r, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dn8) ipChange.ipc$dispatch("bcd18fed", new Object[]{t, r, new Long(j), new Long(j2)});
        }
        return new dn8<>(t, r, 2, "", fn8.b(j, j2));
    }

    public T b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("8f1d7b1a", new Object[]{this});
        }
        return this.f17960a;
    }

    public R c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (R) ipChange.ipc$dispatch("5be12058", new Object[]{this});
        }
        return this.b;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fcf6c362", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public fn8 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fn8) ipChange.ipc$dispatch("5a578fb", new Object[]{this});
        }
        return this.e;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || dn8.class != obj.getClass()) {
            return false;
        }
        dn8 dn8Var = (dn8) obj;
        T t = this.f17960a;
        if (t == null) {
            if (dn8Var.f17960a != null) {
                return false;
            }
        } else if (!t.equals(dn8Var.f17960a)) {
            return false;
        }
        return true;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a308af12", new Object[]{this})).booleanValue();
        }
        if (this.c == 0) {
            return true;
        }
        return false;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        if (2 == this.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        T t = this.f17960a;
        if (t != null) {
            i = t.hashCode();
        }
        return 31 + i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ExecutionResult [id=" + this.f17960a + ", result=" + this.b + ", status=" + this.c + ", message=" + this.d + "]";
    }
}
