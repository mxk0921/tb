package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class gj3 extends ej3 implements rw3<Character> {
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a {
        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        new gj3((char) 1, (char) 0);
    }

    public gj3(char c, char c2) {
        super(c, c2, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof gj3) {
            if (!isEmpty() || !((gj3) obj).isEmpty()) {
                gj3 gj3Var = (gj3) obj;
                if (!(c() == gj3Var.c() && d() == gj3Var.d())) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public Character getEndInclusive() {
        return Character.valueOf(d());
    }

    /* renamed from: g */
    public Character getStart() {
        return Character.valueOf(c());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (c() * 31) + d();
    }

    @Override // tb.rw3
    public boolean isEmpty() {
        if (ckf.i(c(), d()) > 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return c() + ".." + d();
    }
}
