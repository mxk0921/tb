package tb;

import com.alibaba.fastjson2.time.DateTimeException;
import com.alibaba.fastjson2.util.DateUtils;
import com.alipay.mobile.common.transportext.amnet.Baggage;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Calendar;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class q7h {

    /* renamed from: a  reason: collision with root package name */
    public final p7h f26561a;
    public final x9h b;

    public q7h(p7h p7hVar, x9h x9hVar) {
        this.f26561a = p7hVar;
        this.b = x9hVar;
    }

    public static void a(long j) {
        if (j < 0 || j > 999999999) {
            throw new DateTimeException("Invalid value for year (valid values [0, 999_999_999]): " + j);
        }
    }

    public static void b(long j) {
        if (j < 0 || j > 86399999999999L) {
            throw new DateTimeException("Invalid value for year (valid values [0, 86399999999999]): " + j);
        }
    }

    public static int c(long j) {
        if (j >= -999999999 && j <= 999999999) {
            return (int) j;
        }
        throw new DateTimeException("Invalid value for year (valid values [-999_999_999, 999_999_999]): " + j);
    }

    public static q7h d(int i, int i2, int i3, int i4, int i5, int i6) {
        return new q7h(p7h.e(i, i2, i3), x9h.b(i4, i5, i6));
    }

    public static q7h e(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return new q7h(p7h.e(i, i2, i3), x9h.c(i4, i5, i6, i7));
    }

    public static q7h g(long j, int i, int i2) {
        long j2;
        long j3 = i;
        a(j3);
        return new q7h(p7h.f(b2d.e(j + i2, 86400L)), x9h.d((((int) b2d.f(j2, 86400L)) * 1000000000) + j3));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q7h.class != obj.getClass()) {
            return false;
        }
        q7h q7hVar = (q7h) obj;
        p7h p7hVar = this.f26561a;
        p7h p7hVar2 = q7hVar.f26561a;
        if (p7hVar == p7hVar2) {
            return true;
        }
        x9h x9hVar = this.b;
        x9h x9hVar2 = q7hVar.b;
        if (p7hVar != null && p7hVar.equals(p7hVar2) && x9hVar == x9hVar2) {
            return true;
        }
        if (x9hVar == null || !x9hVar.equals(x9hVar2)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f26561a, this.b});
    }

    public vcf i(wqx wqxVar) {
        Calendar instance = Calendar.getInstance(wqxVar.f30862a);
        p7h p7hVar = this.f26561a;
        short s = p7hVar.c;
        x9h x9hVar = this.b;
        instance.set(p7hVar.f25919a, p7hVar.b - 1, s, x9hVar.f31233a, x9hVar.b, x9hVar.c);
        return vcf.e(instance.getTime().getTime() / 1000, x9hVar.d);
    }

    public Timestamp j() {
        p7h p7hVar = this.f26561a;
        short s = p7hVar.c;
        x9h x9hVar = this.b;
        return new Timestamp(p7hVar.f25919a - 1900, p7hVar.b - 1, s, x9hVar.f31233a, x9hVar.b, x9hVar.c, x9hVar.d);
    }

    public String toString() {
        return DateUtils.c(this, "yyyy-MM-dd HH:mm:ss");
    }

    public static q7h f(p7h p7hVar, x9h x9hVar) {
        if (p7hVar == null) {
            throw new NullPointerException("date");
        } else if (x9hVar != null) {
            return new q7h(p7hVar, x9hVar);
        } else {
            throw new NullPointerException("time");
        }
    }

    public static q7h h(vcf vcfVar, wqx wqxVar) {
        if (vcfVar == null) {
            throw new NullPointerException(Baggage.Amnet.SECURITY_INSTANT);
        } else if (wqxVar != null) {
            return g(vcfVar.f29921a, vcfVar.b, wqxVar.a(vcfVar));
        } else {
            throw new NullPointerException("zone");
        }
    }
}
