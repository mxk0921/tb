package tb;

import kotlin.text.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class uiv {
    public static final int a(int i, int i2) {
        return ckf.i(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
    }

    public static final int b(int i, int i2) {
        return (int) ((i & tiv.INT_MASK) / (i2 & tiv.INT_MASK));
    }

    public static final int c(int i, int i2) {
        return (int) ((i & tiv.INT_MASK) % (i2 & tiv.INT_MASK));
    }

    public static final double d(int i) {
        return (Integer.MAX_VALUE & i) + (((i >>> 31) << 30) * 2);
    }

    public static final int e(long j, long j2) {
        return ckf.j(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
    }

    public static final long f(long j, long j2) {
        int compare;
        int compare2;
        if (j2 < 0) {
            compare2 = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
            if (compare2 < 0) {
                return 0L;
            }
            return 1L;
        } else if (j >= 0) {
            return j / j2;
        } else {
            int i = 1;
            long j3 = ((j >>> 1) / j2) << 1;
            compare = Long.compare((j - (j3 * j2)) ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
            if (compare < 0) {
                i = 0;
            }
            return j3 + i;
        }
    }

    public static final long g(long j, long j2) {
        int compare;
        int compare2;
        if (j2 < 0) {
            compare2 = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
            if (compare2 < 0) {
                return j;
            }
            return j - j2;
        } else if (j >= 0) {
            return j % j2;
        } else {
            long j3 = j - ((((j >>> 1) / j2) << 1) * j2);
            compare = Long.compare(j3 ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
            if (compare < 0) {
                j2 = 0;
            }
            return j3 - j2;
        }
    }

    public static final double h(long j) {
        return ((j >>> 11) * 2048) + (j & 2047);
    }

    public static final String i(long j, int i) {
        if (j >= 0) {
            a.a(i);
            String l = Long.toString(j, i);
            ckf.f(l, "toString(...)");
            return l;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        a.a(i);
        String l2 = Long.toString(j3, i);
        ckf.f(l2, "toString(...)");
        a.a(i);
        String l3 = Long.toString(j4, i);
        ckf.f(l3, "toString(...)");
        return l2.concat(l3);
    }
}
