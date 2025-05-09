package tb;

import com.alibaba.fastjson2.time.DateTimeException;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class vcf {
    public static final vcf c = new vcf(0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final long f29921a;
    public final int b;

    public vcf(long j, int i) {
        this.f29921a = j;
        this.b = i;
    }

    public static vcf a(long j, int i) {
        if ((i | j) == 0) {
            return c;
        }
        if (j >= -31557014167219200L && j <= 31556889864403199L) {
            return new vcf(j, i);
        }
        throw new DateTimeException("Instant exceeds minimum or maximum instant");
    }

    public static vcf b(Timestamp timestamp) {
        return e(timestamp.getTime() / 1000, timestamp.getNanos());
    }

    public static vcf c(Date date) {
        return d(date.getTime());
    }

    public static vcf d(long j) {
        return a(b2d.e(j, 1000L), ((int) b2d.f(j, 1000L)) * 1000000);
    }

    public static vcf e(long j, long j2) {
        return a(b2d.a(j, b2d.e(j2, 1000000000L)), (int) b2d.f(j2, 1000000000L));
    }

    public Date f() {
        return new Date(g());
    }

    public long g() {
        int i = this.b;
        long j = this.f29921a;
        if (j >= 0 || i <= 0) {
            return b2d.a(b2d.j(j, 1000L), i / 1000000);
        }
        return b2d.a(b2d.j(j + 1, 1000L), (i / 1000000) - 1000);
    }

    public String toString() {
        return "Instant(" + this.f29921a + ", " + this.b + f7l.BRACKET_END_STR;
    }
}
