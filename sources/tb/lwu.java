package tb;

import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class lwu implements Iterable<kwu>, rzf {
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final long f23617a;
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

    public /* synthetic */ lwu(long j, long j2, long j3, a07 a07Var) {
        this(j, j2, j3);
    }

    public long a() {
        return e();
    }

    public long b() {
        return d();
    }

    public final long d() {
        return this.f23617a;
    }

    public final long e() {
        return this.b;
    }

    @Override // java.lang.Iterable
    public final Iterator<kwu> iterator() {
        return new mwu(this.f23617a, this.b, this.c, null);
    }

    public lwu(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (j3 != Long.MIN_VALUE) {
            this.f23617a = j;
            this.b = iyu.c(j, j2, j3);
            this.c = j3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
    }
}
