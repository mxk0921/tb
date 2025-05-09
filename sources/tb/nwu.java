package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class nwu extends lwu implements rw3<kwu> {
    public static final a Companion = new a(null);
    public static final nwu d = new nwu(-1, 0, null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a {
        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final nwu a() {
            return nwu.d;
        }

        public a() {
        }
    }

    public /* synthetic */ nwu(long j, long j2, a07 a07Var) {
        this(j, j2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof nwu) {
            if (!isEmpty() || !((nwu) obj).isEmpty()) {
                nwu nwuVar = (nwu) obj;
                if (!(d() == nwuVar.d() && e() == nwuVar.e())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // tb.rw3
    public /* bridge */ /* synthetic */ kwu getEndInclusive() {
        return kwu.b(a());
    }

    @Override // tb.rw3
    public /* bridge */ /* synthetic */ kwu getStart() {
        return kwu.b(b());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return ((int) (e() ^ (e() >>> 32))) + (((int) (d() ^ (d() >>> 32))) * 31);
    }

    @Override // tb.rw3
    public boolean isEmpty() {
        int compare;
        compare = Long.compare(d() ^ Long.MIN_VALUE, e() ^ Long.MIN_VALUE);
        if (compare > 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return ((Object) kwu.j0(d())) + ".." + ((Object) kwu.j0(e()));
    }

    public nwu(long j, long j2) {
        super(j, j2, 1L, null);
    }
}
