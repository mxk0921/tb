package tb;

import kotlin.time.DurationUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class w08 {
    public static final long MAX_MILLIS = 4611686018427387903L;
    public static final long MAX_NANOS = 4611686018426999999L;
    public static final int NANOS_IN_MILLIS = 1000000;

    public static final /* synthetic */ long a(long j, int i) {
        return h(j, i);
    }

    public static final /* synthetic */ long b(long j) {
        return i(j);
    }

    public static final /* synthetic */ long c(long j) {
        return j(j);
    }

    public static final /* synthetic */ long d(long j) {
        return k(j);
    }

    public static final /* synthetic */ long e(long j) {
        return l(j);
    }

    public static final /* synthetic */ long f(long j) {
        return m(j);
    }

    public static final /* synthetic */ long g(long j) {
        return n(j);
    }

    public static final long h(long j, int i) {
        long j2 = (j << 1) + i;
        s08.j(j2);
        return j2;
    }

    public static final long i(long j) {
        long j2 = (j << 1) + 1;
        s08.j(j2);
        return j2;
    }

    public static final long j(long j) {
        if (-4611686018426L > j || j >= 4611686018427L) {
            return i(hfn.i(j, -4611686018427387903L, MAX_MILLIS));
        }
        return k(m(j));
    }

    public static final long k(long j) {
        long j2 = j << 1;
        s08.j(j2);
        return j2;
    }

    public static final long l(long j) {
        if (-4611686018426999999L > j || j >= 4611686018427000000L) {
            return i(n(j));
        }
        return k(j);
    }

    public static final long m(long j) {
        return j * 1000000;
    }

    public static final long n(long j) {
        return j / 1000000;
    }

    public static final long o(double d, DurationUnit durationUnit) {
        ckf.g(durationUnit, mh1.PRICE_UNIT);
        double a2 = x08.a(d, durationUnit, DurationUnit.NANOSECONDS);
        if (!Double.isNaN(a2)) {
            long e = iai.e(a2);
            if (-4611686018426999999L > e || e >= 4611686018427000000L) {
                return j(iai.e(x08.a(d, durationUnit, DurationUnit.MILLISECONDS)));
            }
            return k(e);
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.");
    }

    public static final long p(long j, DurationUnit durationUnit) {
        ckf.g(durationUnit, mh1.PRICE_UNIT);
        DurationUnit durationUnit2 = DurationUnit.NANOSECONDS;
        long c = x08.c(MAX_NANOS, durationUnit2, durationUnit);
        if ((-c) > j || j > c) {
            return i(hfn.i(x08.b(j, durationUnit, DurationUnit.MILLISECONDS), -4611686018427387903L, MAX_MILLIS));
        }
        return k(x08.c(j, durationUnit, durationUnit2));
    }
}
