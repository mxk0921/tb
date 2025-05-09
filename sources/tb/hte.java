package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class hte<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f20884a;
    public final T b;

    public hte(int i, T t) {
        this.f20884a = i;
        this.b = t;
    }

    public final int a() {
        return this.f20884a;
    }

    public final T b() {
        return this.b;
    }

    public final int c() {
        return this.f20884a;
    }

    public final T d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hte)) {
            return false;
        }
        hte hteVar = (hte) obj;
        if (this.f20884a == hteVar.f20884a && ckf.b(this.b, hteVar.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = this.f20884a * 31;
        T t = this.b;
        if (t == null) {
            i = 0;
        } else {
            i = t.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "IndexedValue(index=" + this.f20884a + ", value=" + this.b + ')';
    }
}
