package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ydf implements Iterable<Integer>, rzf {
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final int f32001a;
    public final int b;
    public final int c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a {
        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final ydf a(int i, int i2, int i3) {
            return new ydf(i, i2, i3);
        }

        public a() {
        }
    }

    public ydf(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.f32001a = i;
            this.b = o0n.c(i, i2, i3);
            this.c = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public final int c() {
        return this.f32001a;
    }

    public final int d() {
        return this.b;
    }

    public final int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ydf) {
            if (!isEmpty() || !((ydf) obj).isEmpty()) {
                ydf ydfVar = (ydf) obj;
                if (!(this.f32001a == ydfVar.f32001a && this.b == ydfVar.b && this.c == ydfVar.c)) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public tdf iterator() {
        return new zdf(this.f32001a, this.b, this.c);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f32001a * 31) + this.b) * 31) + this.c;
    }

    public boolean isEmpty() {
        int i = this.c;
        int i2 = this.b;
        int i3 = this.f32001a;
        if (i > 0) {
            if (i3 <= i2) {
                return false;
            }
        } else if (i3 >= i2) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb;
        int i = this.b;
        int i2 = this.f32001a;
        int i3 = this.c;
        if (i3 > 0) {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i3);
        } else {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i3);
        }
        return sb.toString();
    }
}
