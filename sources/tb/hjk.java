package tb;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.time.DateTimeException;
import com.alibaba.fastjson2.time.DateTimeFormatter;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.writer.FieldWriter;
import com.taobao.tao.shop.common.ShopConstants;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class hjk extends pu6 implements iik {
    public static final byte[] n;
    public static final byte[] p;
    public static final hjk l = new hjk(null, null);
    public static final char[] m = "new Date(".toCharArray();
    public static final char[] o = "{\"@type\":\"java.sql.Date\",\"val\":".toCharArray();

    static {
        Charset charset = StandardCharsets.UTF_8;
        n = "new Date(".getBytes(charset);
        p = "{\"@type\":\"java.sql.Date\",\"val\":".getBytes(charset);
    }

    public hjk(String str, Locale locale) {
        super(str, locale);
    }

    @Override // tb.iik
    public /* synthetic */ void B(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        hik.i(this, jSONWriter, obj, obj2, type, j);
        throw null;
    }

    @Override // tb.iik
    public /* synthetic */ void C(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        hik.e(this, jSONWriter, obj, obj2, type, j);
    }

    @Override // tb.iik
    public /* synthetic */ FieldWriter E(long j) {
        return null;
    }

    @Override // tb.iik
    public void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.b2();
        } else {
            jSONWriter.T1(((Date) obj).getTime());
        }
    }

    @Override // tb.iik
    public /* synthetic */ void k(JSONWriter jSONWriter, Object obj) {
        hik.d(this, jSONWriter, obj);
    }

    @Override // tb.iik
    public /* synthetic */ void l(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        hik.f(this, jSONWriter, obj, obj2, type, j);
    }

    @Override // tb.iik
    public /* synthetic */ boolean n(JSONWriter jSONWriter) {
        return hik.b(this, jSONWriter);
    }

    @Override // tb.iik
    public /* synthetic */ List p() {
        return hik.a(this);
    }

    @Override // tb.iik
    public void y(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        String str;
        int i;
        boolean z;
        String str2;
        String str3;
        JSONWriter.a aVar;
        DateTimeFormatter dateTimeFormatter;
        int i2;
        long j2;
        byte[] bArr;
        char[] cArr;
        JSONWriter jSONWriter2 = jSONWriter;
        if (obj == null) {
            jSONWriter.b2();
            return;
        }
        JSONWriter.a aVar2 = jSONWriter2.f2458a;
        Date date = (Date) obj;
        long time = date.getTime();
        if (jSONWriter2.Q0(obj, type)) {
            char c = '}';
            if (jSONWriter2.c) {
                if ("java.sql.Date".equals(date.getClass().getName())) {
                    cArr = o;
                } else {
                    cArr = m;
                    c = ')';
                }
                jSONWriter2.h2(cArr, 0, cArr.length);
            } else {
                if ("java.sql.Date".equals(date.getClass().getName())) {
                    bArr = p;
                } else {
                    bArr = n;
                    c = ')';
                }
                jSONWriter2.g2(bArr);
            }
            jSONWriter2.O1(time);
            jSONWriter2.e2(c);
        } else if (this.c || ((str = this.f26308a) == null && aVar2.i())) {
            jSONWriter2.O1(time);
        } else if (this.b || (str == null && aVar2.j())) {
            jSONWriter2.O1(time / 1000);
        } else {
            wqx g = aVar2.g();
            wqx wqxVar = wqx.SHANGHAI_ZONE_ID;
            if (wqxVar.equals(g)) {
                i = DateUtils.m(b2d.e(time, 1000L));
            } else if (g == wqx.e || pg1.ATOM_EXT_UTC.equals(g.b)) {
                i = 0;
            } else {
                i = xqx.d(vcf.d(time), g).b;
            }
            if (this.d || aVar2.h()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str2 = null;
            } else if (str == null) {
                str2 = aVar2.b();
            } else {
                str2 = str;
            }
            if (str2 == null) {
                long e = b2d.e(time, 1000L);
                if (wqxVar.equals(g)) {
                    i2 = DateUtils.m(e);
                } else {
                    i2 = g.a(vcf.d(time));
                }
                long j3 = e + i2;
                long e2 = b2d.e(j3, 86400L);
                int f = (int) b2d.f(j3, 86400L);
                long j4 = e2 + 719468;
                if (j4 < 0) {
                    str3 = str;
                    aVar = aVar2;
                    long j5 = ((e2 + 719469) / 146097) - 1;
                    j2 = j5 * 400;
                    j4 += (-j5) * 146097;
                } else {
                    str3 = str;
                    aVar = aVar2;
                    j2 = 0;
                }
                long j6 = ((j4 * 400) + 591) / 146097;
                long j7 = j4 - ((((j6 * 365) + (j6 / 4)) - (j6 / 100)) + (j6 / 400));
                if (j7 < 0) {
                    j6--;
                    j7 = j4 - ((((365 * j6) + (j6 / 4)) - (j6 / 100)) + (j6 / 400));
                }
                int i3 = (int) j7;
                int i4 = ((i3 * 5) + 2) / 153;
                int i5 = ((i4 + 2) % 12) + 1;
                int i6 = (i3 - (((i4 * 306) + 5) / 10)) + 1;
                int c2 = q7h.c(j6 + j2 + (i4 / 10));
                long j8 = f;
                if (j8 < 0 || j8 > 86399) {
                    throw new DateTimeException("Invalid secondOfDay " + j8);
                }
                int i7 = (int) (j8 / 3600);
                long j9 = j8 - (i7 * ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT);
                int i8 = (int) (j9 / 60);
                int i9 = (int) (j9 - (i8 * 60));
                if (c2 < 0 || c2 > 9999) {
                    jSONWriter2 = jSONWriter;
                } else {
                    int f2 = (int) b2d.f(time, 1000L);
                    if (f2 != 0 || z) {
                        jSONWriter.w1(c2, i5, i6, i7, i8, i9, f2, i, z);
                        return;
                    } else if (i7 == 0 && i8 == 0 && i9 == 0 && "java.sql.Date".equals(date.getClass().getName())) {
                        jSONWriter.x1(c2, i5, i6);
                        return;
                    } else {
                        jSONWriter.v1(c2, i5, i6, i7, i8, i9);
                        return;
                    }
                }
            } else {
                str3 = str;
                aVar = aVar2;
            }
            if (str3 != null) {
                dateTimeFormatter = H();
            } else {
                dateTimeFormatter = aVar.c();
            }
            jSONWriter2.k2(dateTimeFormatter.a(date));
        }
    }

    @Override // tb.iik
    public /* synthetic */ void A(e1n e1nVar) {
    }

    @Override // tb.iik
    public /* synthetic */ void c(h1n h1nVar) {
    }

    @Override // tb.iik
    public /* synthetic */ void f(qij qijVar) {
    }

    @Override // tb.iik
    public /* synthetic */ void g(y1w y1wVar) {
    }
}
