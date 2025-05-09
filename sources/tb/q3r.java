package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final /* synthetic */ class q3r {
    public static final int a(String str, int i, int i2, int i3) {
        return (int) o3r.c(str, i, i2, i3);
    }

    public static final long b(String str, long j, long j2, long j3) {
        String d = o3r.d(str);
        if (d == null) {
            return j;
        }
        Long o = ssq.o(d);
        if (o != null) {
            long longValue = o.longValue();
            if (j2 <= longValue && longValue <= j3) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + d + '\'').toString());
    }

    public static final String c(String str, String str2) {
        String d = o3r.d(str);
        if (d == null) {
            return str2;
        }
        return d;
    }

    public static final boolean d(String str, boolean z) {
        String d = o3r.d(str);
        if (d != null) {
            return Boolean.parseBoolean(d);
        }
        return z;
    }

    public static /* synthetic */ int e(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return o3r.b(str, i, i2, i3);
    }

    public static /* synthetic */ long f(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        if ((i & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        return o3r.c(str, j, j2, j3);
    }
}
