package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class iwu extends gwu implements rw3<fwu> {
    public static final a Companion = new a(null);
    public static final iwu d = new iwu(-1, 0, null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a {
        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final iwu a() {
            return iwu.d;
        }

        public a() {
        }
    }

    public /* synthetic */ iwu(int i, int i2, a07 a07Var) {
        this(i, i2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof iwu) {
            if (!isEmpty() || !((iwu) obj).isEmpty()) {
                iwu iwuVar = (iwu) obj;
                if (!(d() == iwuVar.d() && e() == iwuVar.e())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // tb.rw3
    public /* bridge */ /* synthetic */ fwu getEndInclusive() {
        return fwu.b(a());
    }

    @Override // tb.rw3
    public /* bridge */ /* synthetic */ fwu getStart() {
        return fwu.b(b());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (d() * 31) + e();
    }

    @Override // tb.rw3
    public boolean isEmpty() {
        int compare;
        compare = Integer.compare(d() ^ Integer.MIN_VALUE, e() ^ Integer.MIN_VALUE);
        if (compare > 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return ((Object) fwu.j0(d())) + ".." + ((Object) fwu.j0(e()));
    }

    public iwu(int i, int i2) {
        super(i, i2, 1, null);
    }
}
