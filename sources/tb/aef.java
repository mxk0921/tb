package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class aef extends ydf implements rw3<Integer> {
    public static final a Companion = new a(null);
    public static final aef d = new aef(1, 0);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a {
        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final aef a() {
            return aef.d;
        }

        public a() {
        }
    }

    public aef(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // tb.ydf
    public boolean equals(Object obj) {
        if (obj instanceof aef) {
            if (!isEmpty() || !((aef) obj).isEmpty()) {
                aef aefVar = (aef) obj;
                if (!(c() == aefVar.c() && d() == aefVar.d())) {
                }
            }
            return true;
        }
        return false;
    }

    public boolean h(int i) {
        if (c() > i || i > d()) {
            return false;
        }
        return true;
    }

    @Override // tb.ydf
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (c() * 31) + d();
    }

    /* renamed from: i */
    public Integer getEndInclusive() {
        return Integer.valueOf(d());
    }

    @Override // tb.ydf, tb.rw3
    public boolean isEmpty() {
        if (c() > d()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public Integer getStart() {
        return Integer.valueOf(c());
    }

    @Override // tb.ydf
    public String toString() {
        return c() + ".." + d();
    }
}
