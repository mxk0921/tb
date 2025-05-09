package tb;

import tb.ydf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class hfn extends gfn {
    public static float b(float f, float f2) {
        if (f < f2) {
            return f2;
        }
        return f;
    }

    public static int c(int i, int i2) {
        if (i < i2) {
            return i2;
        }
        return i;
    }

    public static long d(long j, long j2) {
        if (j < j2) {
            return j2;
        }
        return j;
    }

    public static float e(float f, float f2) {
        if (f > f2) {
            return f2;
        }
        return f;
    }

    public static int f(int i, int i2) {
        if (i > i2) {
            return i2;
        }
        return i;
    }

    public static long g(long j, long j2) {
        if (j > j2) {
            return j2;
        }
        return j;
    }

    public static int h(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
        } else if (i < i2) {
            return i2;
        } else {
            if (i > i3) {
                return i3;
            }
            return i;
        }
    }

    public static long i(long j, long j2, long j3) {
        if (j2 > j3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
        } else if (j < j2) {
            return j2;
        } else {
            if (j > j3) {
                return j3;
            }
            return j;
        }
    }

    public static long j(long j, rw3<Long> rw3Var) {
        ckf.g(rw3Var, x96.REFRESH_TYPE_RANGE);
        if (rw3Var instanceof qw3) {
            return ((Number) k(Long.valueOf(j), (qw3) rw3Var)).longValue();
        }
        if (rw3Var.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + rw3Var + '.');
        } else if (j < rw3Var.getStart().longValue()) {
            return rw3Var.getStart().longValue();
        } else {
            if (j > rw3Var.getEndInclusive().longValue()) {
                return rw3Var.getEndInclusive().longValue();
            }
            return j;
        }
    }

    public static final <T extends Comparable<? super T>> T k(T t, qw3<T> qw3Var) {
        ckf.g(t, "<this>");
        ckf.g(qw3Var, x96.REFRESH_TYPE_RANGE);
        if (qw3Var.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + qw3Var + '.');
        } else if (qw3Var.a(t, qw3Var.getStart()) && !qw3Var.a(qw3Var.getStart(), t)) {
            return qw3Var.getStart();
        } else {
            if (!qw3Var.a(qw3Var.getEndInclusive(), t) || qw3Var.a(t, qw3Var.getEndInclusive())) {
                return t;
            }
            return qw3Var.getEndInclusive();
        }
    }

    public static ydf l(int i, int i2) {
        return ydf.Companion.a(i, i2, -1);
    }

    public static ydf m(ydf ydfVar, int i) {
        boolean z;
        ckf.g(ydfVar, "<this>");
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        gfn.a(z, Integer.valueOf(i));
        ydf.a aVar = ydf.Companion;
        int c = ydfVar.c();
        int d = ydfVar.d();
        if (ydfVar.e() <= 0) {
            i = -i;
        }
        return aVar.a(c, d, i);
    }

    public static aef n(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return aef.Companion.a();
        }
        return new aef(i, i2 - 1);
    }

    public static float o(float f, float f2, float f3) {
        if (f2 > f3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
        } else if (f < f2) {
            return f2;
        } else {
            if (f > f3) {
                return f3;
            }
            return f;
        }
    }
}
