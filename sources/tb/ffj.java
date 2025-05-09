package tb;

import androidx.core.util.Pair;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ffj<T> {

    /* renamed from: a  reason: collision with root package name */
    public T f19253a;
    public T b;

    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    public void b(T t, T t2) {
        this.f19253a = t;
        this.b = t2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        if (!a(pair.first, this.f19253a) || !a(pair.second, this.b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        T t = this.f19253a;
        int i2 = 0;
        if (t == null) {
            i = 0;
        } else {
            i = t.hashCode();
        }
        T t2 = this.b;
        if (t2 != null) {
            i2 = t2.hashCode();
        }
        return i ^ i2;
    }

    public String toString() {
        return "Pair{" + this.f19253a + " " + this.b + "}";
    }
}
