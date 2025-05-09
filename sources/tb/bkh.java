package tb;

import kotlin.time.DurationUnit;
import tb.s08;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class bkh {
    public static final long a(long j, long j2, long j3) {
        if (!s08.S(j2) || (j ^ j3) >= 0) {
            return j;
        }
        throw new IllegalArgumentException("Summing infinities of different signs");
    }

    public static final long b(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        s08.a aVar = s08.Companion;
        if (i < 0) {
            return aVar.b();
        }
        return aVar.a();
    }

    public static final long c(long j, DurationUnit durationUnit, long j2) {
        ckf.g(durationUnit, mh1.PRICE_UNIT);
        long g0 = s08.g0(j2, durationUnit);
        if (((j - 1) | 1) == Long.MAX_VALUE) {
            a(j, j2, g0);
            return j;
        } else if ((1 | (g0 - 1)) == Long.MAX_VALUE) {
            return d(j, durationUnit, j2);
        } else {
            long j3 = j + g0;
            if (((j ^ j3) & (g0 ^ j3)) >= 0) {
                return j3;
            }
            if (j < 0) {
                return Long.MIN_VALUE;
            }
            return Long.MAX_VALUE;
        }
    }

    public static final long d(long j, DurationUnit durationUnit, long j2) {
        long m = s08.m(j2, 2);
        long g0 = s08.g0(m, durationUnit);
        if ((1 | (g0 - 1)) == Long.MAX_VALUE) {
            return g0;
        }
        return c(c(j, durationUnit, m), durationUnit, s08.V(j2, m));
    }

    public static final long e(long j, long j2, DurationUnit durationUnit) {
        ckf.g(durationUnit, mh1.PRICE_UNIT);
        if ((1 | (j2 - 1)) == Long.MAX_VALUE) {
            return s08.l0(b(j2));
        }
        return f(j, j2, durationUnit);
    }

    public static final long f(long j, long j2, DurationUnit durationUnit) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) >= 0) {
            return w08.p(j3, durationUnit);
        }
        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
        if (durationUnit.compareTo(durationUnit2) >= 0) {
            return s08.l0(b(j3));
        }
        long b = x08.b(1L, durationUnit2, durationUnit);
        long j4 = (j % b) - (j2 % b);
        s08.a aVar = s08.Companion;
        return s08.W(w08.p((j / b) - (j2 / b), durationUnit2), w08.p(j4, durationUnit));
    }

    public static final long g(long j, long j2, DurationUnit durationUnit) {
        ckf.g(durationUnit, mh1.PRICE_UNIT);
        if (((j2 - 1) | 1) == Long.MAX_VALUE) {
            if (j == j2) {
                return s08.Companion.c();
            }
            return s08.l0(b(j2));
        } else if ((1 | (j - 1)) == Long.MAX_VALUE) {
            return b(j);
        } else {
            return f(j, j2, durationUnit);
        }
    }
}
