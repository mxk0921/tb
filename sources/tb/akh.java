package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class akh extends yjh implements rw3<Long> {
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
        new akh(1L, 0L);
    }

    public akh(long j, long j2) {
        super(j, j2, 1L);
    }

    public boolean equals(Object obj) {
        if (obj instanceof akh) {
            if (!isEmpty() || !((akh) obj).isEmpty()) {
                akh akhVar = (akh) obj;
                if (!(c() == akhVar.c() && d() == akhVar.d())) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public Long getEndInclusive() {
        return Long.valueOf(d());
    }

    /* renamed from: g */
    public Long getStart() {
        return Long.valueOf(c());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((31 * (c() ^ (c() >>> 32))) + (d() ^ (d() >>> 32)));
    }

    @Override // tb.rw3
    public boolean isEmpty() {
        if (c() > d()) {
            return true;
        }
        return false;
    }

    public String toString() {
        return c() + ".." + d();
    }
}
