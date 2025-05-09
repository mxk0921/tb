package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ej3 implements Iterable<Character>, rzf {
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final char f18610a;
    public final char b;
    public final int c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a {
        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    public ej3(char c, char c2, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i != Integer.MIN_VALUE) {
            this.f18610a = c;
            this.b = (char) o0n.c(c, c2, i);
            this.c = i;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public final char c() {
        return this.f18610a;
    }

    public final char d() {
        return this.b;
    }

    /* renamed from: e */
    public dj3 iterator() {
        return new fj3(this.f18610a, this.b, this.c);
    }
}
