package tb;

import com.alibaba.fastjson2.util.DateUtils;
import java.util.TimeZone;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class wqx {
    public static final wqx SHANGHAI_ZONE_ID;
    public static final String SHANGHAI_ZONE_ID_NAME = "Asia/Shanghai";
    public static final TimeZone c;
    public static final wqx d;
    public static final wqx e;

    /* renamed from: a  reason: collision with root package name */
    public final TimeZone f30862a;
    public final String b;
    public static final String OFFSET_8_ZONE_ID_NAME = "+08:00";
    public static final wqx OFFSET_8_ZONE_ID = c(OFFSET_8_ZONE_ID_NAME);

    static {
        TimeZone timeZone = TimeZone.getDefault();
        c = timeZone;
        wqx d2 = d(timeZone);
        d = d2;
        if (!SHANGHAI_ZONE_ID_NAME.equals(d2.b)) {
            d2 = new wqx(TimeZone.getTimeZone(SHANGHAI_ZONE_ID_NAME));
        }
        SHANGHAI_ZONE_ID = d2;
        e = c("Z");
    }

    public wqx(TimeZone timeZone) {
        this.f30862a = timeZone;
        this.b = timeZone.getID();
    }

    public static wqx c(String str) {
        if (str.equals(SHANGHAI_ZONE_ID_NAME)) {
            return SHANGHAI_ZONE_ID;
        }
        char charAt = str.charAt(0);
        if (charAt == '+' || charAt == '-') {
            str = "GMT".concat(str);
        } else if (charAt == 'Z' && str.length() == 1) {
            str = pg1.ATOM_EXT_UTC;
        }
        return d(TimeZone.getTimeZone(str));
    }

    public static wqx d(TimeZone timeZone) {
        return new wqx(timeZone);
    }

    public int a(vcf vcfVar) {
        wqx wqxVar = SHANGHAI_ZONE_ID;
        if (this == wqxVar || this.b.equals(wqxVar.b)) {
            return DateUtils.m(vcfVar.f29921a);
        }
        return this.f30862a.getOffset(vcfVar.f29921a * 1000) / 1000;
    }

    public int b(q7h q7hVar) {
        p7h p7hVar = q7hVar.f26561a;
        return this.f30862a.getOffset(0, p7hVar.f25919a, p7hVar.b - 1, p7hVar.c, 1, q7hVar.b.c * 10000) / 1000;
    }
}
