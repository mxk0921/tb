package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class yjh implements Iterable<Long>, rzf {
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final long f32128a;
    public final long b;
    public final long c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a {
        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    public yjh(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (j3 != Long.MIN_VALUE) {
            this.f32128a = j;
            this.b = o0n.d(j, j2, j3);
            this.c = j3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public final long c() {
        return this.f32128a;
    }

    public final long d() {
        return this.b;
    }

    /* renamed from: e */
    public wjh iterator() {
        return new zjh(this.f32128a, this.b, this.c);
    }
}
