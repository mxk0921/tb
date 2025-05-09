package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.Comparable;
import java.util.Objects;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class zen<T extends Comparable<? super T>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final T f32709a;
    public final T b;

    static {
        t2o.a(156237952);
    }

    public zen(T t, T t2) {
        if (t == null) {
            throw new IllegalArgumentException("lower must not be null");
        } else if (t2 != null) {
            this.f32709a = t;
            this.b = t2;
            if (t.compareTo(t2) > 0) {
                throw new IllegalArgumentException("lower must be less than or equal to upper");
            }
        } else {
            throw new IllegalArgumentException("upper must not be null");
        }
    }

    public static <T extends Comparable<? super T>> zen<T> c(T t, T t2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zen) ipChange.ipc$dispatch("f6c197a", new Object[]{t, t2});
        }
        return new zen<>(t, t2);
    }

    public T d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((Comparable) ipChange.ipc$dispatch("474f58e5", new Object[]{this}));
        }
        return this.f32709a;
    }

    public T e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((Comparable) ipChange.ipc$dispatch("e0fa1264", new Object[]{this}));
        }
        return this.b;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zen)) {
            return false;
        }
        zen zenVar = (zen) obj;
        if (!this.f32709a.equals(zenVar.f32709a) || !this.b.equals(zenVar.b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return Objects.hash(this.f32709a, this.b);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return String.format("[%s, %s]", this.f32709a, this.b);
    }

    public boolean a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac0ba18b", new Object[]{this, t})).booleanValue();
        }
        if (t != null) {
            return (t.compareTo(this.f32709a) >= 0) && (t.compareTo(this.b) <= 0);
        }
        throw new IllegalArgumentException("value must not be null");
    }

    public boolean b(zen<T> zenVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74b637f3", new Object[]{this, zenVar})).booleanValue();
        }
        if (zenVar != null) {
            return (zenVar.f32709a.compareTo(this.f32709a) >= 0) && (zenVar.b.compareTo(this.b) <= 0);
        }
        throw new IllegalArgumentException("value must not be null");
    }
}
