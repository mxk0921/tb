package tb;

import com.alibaba.fastjson2.time.DateTimeException;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class p7h {

    /* renamed from: a  reason: collision with root package name */
    public final int f25919a;
    public final short b;
    public final short c;

    public p7h(int i, int i2, int i3) {
        this.f25919a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    public static p7h c(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
                    i4 = 30;
                } else {
                    i4 = 31;
                }
            } else if (d(i)) {
                i4 = 29;
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new DateTimeException("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new DateTimeException("Invalid date month-" + i3 + "'");
            }
        }
        return new p7h(i, i2, i3);
    }

    public static boolean d(int i) {
        if ((i & 3) != 0 || (i % 100 == 0 && i % 400 != 0)) {
            return false;
        }
        return true;
    }

    public static p7h e(int i, int i2, int i3) {
        if (i2 <= 0 || i2 > 12) {
            throw new DateTimeException("Invalid value for month (valid values [1,12]): " + i2);
        } else if (i3 > 0 && i3 <= 31) {
            return c(i, i2, i3);
        } else {
            throw new DateTimeException("Invalid value for month (valid values [1,31]): " + i3);
        }
    }

    public static p7h f(long j) {
        long j2;
        long j3 = j + 719468;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((((j5 * 365) + (j5 / 4)) - (j5 / 100)) + (j5 / 400));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((((365 * j5) + (j5 / 4)) - (j5 / 100)) + (j5 / 400));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        return new p7h(q7h.c(j5 + j2 + (i2 / 10)), ((i2 + 2) % 12) + 1, (i - (((i2 * 306) + 5) / 10)) + 1);
    }

    public q7h a() {
        return q7h.f(this, x9h.MIN);
    }

    public xqx b(wqx wqxVar) {
        return xqx.c(q7h.f(this, x9h.MIN), wqxVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p7h.class != obj.getClass()) {
            return false;
        }
        p7h p7hVar = (p7h) obj;
        if (this.f25919a == p7hVar.f25919a && this.b == p7hVar.b && this.c == p7hVar.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f25919a), Short.valueOf(this.b), Short.valueOf(this.c)});
    }
}
