package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class o0n {
    public static final int a(int i, int i2, int i3) {
        return e(e(i, i3) - e(i2, i3), i3);
    }

    public static final long b(long j, long j2, long j3) {
        return f(f(j, j3) - f(j2, j3), j3);
    }

    public static final int c(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i >= i2) {
                return i2;
            }
            return i2 - a(i2, i, i3);
        } else if (i3 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        } else if (i <= i2) {
            return i2;
        } else {
            return i2 + a(i, i2, -i3);
        }
    }

    public static final long d(long j, long j2, long j3) {
        int i = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i > 0) {
            if (j >= j2) {
                return j2;
            }
            return j2 - b(j2, j, j3);
        } else if (i >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        } else if (j <= j2) {
            return j2;
        } else {
            return j2 + b(j, j2, -j3);
        }
    }

    public static final int e(int i, int i2) {
        int i3 = i % i2;
        if (i3 >= 0) {
            return i3;
        }
        return i3 + i2;
    }

    public static final long f(long j, long j2) {
        long j3 = j % j2;
        if (j3 >= 0) {
            return j3;
        }
        return j3 + j2;
    }
}
