package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class iyu {
    public static final int a(int i, int i2, int i3) {
        int compare;
        int a2 = pru.a(i, i3);
        int a3 = pru.a(i2, i3);
        compare = Integer.compare(a2 ^ Integer.MIN_VALUE, a3 ^ Integer.MIN_VALUE);
        int i4 = a2 - a3;
        if (compare >= 0) {
            return i4;
        }
        return i4 + i3;
    }

    public static final long b(long j, long j2, long j3) {
        int compare;
        long a2 = qru.a(j, j3);
        long a3 = qru.a(j2, j3);
        compare = Long.compare(a2 ^ Long.MIN_VALUE, a3 ^ Long.MIN_VALUE);
        long j4 = a2 - a3;
        if (compare >= 0) {
            return j4;
        }
        return j4 + j3;
    }

    public static final long c(long j, long j2, long j3) {
        int compare;
        int compare2;
        int i = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i > 0) {
            compare2 = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
            if (compare2 >= 0) {
                return j2;
            }
            return j2 - b(j2, j, j3);
        } else if (i < 0) {
            compare = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
            if (compare <= 0) {
                return j2;
            }
            return j2 + b(j, j2, -j3);
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    public static final int d(int i, int i2, int i3) {
        int compare;
        int compare2;
        if (i3 > 0) {
            compare2 = Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
            if (compare2 >= 0) {
                return i2;
            }
            return i2 - a(i2, i, i3);
        } else if (i3 < 0) {
            compare = Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
            if (compare <= 0) {
                return i2;
            }
            return i2 + a(i, i2, -i3);
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }
}
