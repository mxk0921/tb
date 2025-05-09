package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.time.DateTimeException;
import com.alibaba.fastjson2.time.DateTimeFormatter;
import com.alibaba.fastjson2.util.DateUtils;
import com.taobao.tao.shop.common.ShopConstants;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import tb.b2d;
import tb.hjk;
import tb.iik;
import tb.p7h;
import tb.q7h;
import tb.vcf;
import tb.wqx;
import tb.x9h;
import tb.xqx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
abstract class FieldWriterDate<T> extends FieldWriter<T> {
    static AtomicReferenceFieldUpdater<FieldWriterDate, byte[]> H = AtomicReferenceFieldUpdater.newUpdater(FieldWriterDate.class, byte[].class, "cacheFormat19UTF8");
    static AtomicReferenceFieldUpdater<FieldWriterDate, char[]> I = AtomicReferenceFieldUpdater.newUpdater(FieldWriterDate.class, char[].class, "cacheFormat19UTF16");
    final boolean A;
    final boolean B;
    final boolean C;
    final boolean D;
    final boolean E;
    final boolean F;
    protected iik G;
    volatile char[] cacheFormat19UTF16;
    volatile byte[] cacheFormat19UTF8;
    protected DateTimeFormatter z;

    public DateTimeFormatter S() {
        String str;
        if (this.z == null && (str = this.f) != null && !this.A && !this.B && !this.F) {
            this.z = DateTimeFormatter.e(str);
        }
        return this.z;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public iik g(JSONWriter jSONWriter, Class cls) {
        if (cls != this.c) {
            return jSONWriter.F(cls);
        }
        z1 z1Var = jSONWriter.f2458a.f2459a;
        iik iikVar = this.G;
        if (iikVar != null) {
            return iikVar;
        }
        z1Var.getClass();
        if (this.f == null) {
            hjk hjkVar = hjk.l;
            this.G = hjkVar;
            return hjkVar;
        }
        hjk hjkVar2 = new hjk(this.f, null);
        this.G = hjkVar2;
        return hjkVar2;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean k() {
        return this.B;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean l() {
        return this.A;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void s(JSONWriter jSONWriter, long j) {
        boolean z;
        JSONWriter.a aVar;
        long j2;
        String str;
        p7h p7hVar;
        int i;
        p7h p7hVar2;
        int i2;
        int i3;
        long j3;
        if (jSONWriter.d) {
            A(jSONWriter);
            jSONWriter.T1(j);
            return;
        }
        if (!this.F) {
            String str2 = this.f;
            JSONWriter.a aVar2 = jSONWriter.f2458a;
            if (str2 != null || !aVar2.j()) {
                if (this.A || (this.f == null && aVar2.i())) {
                    A(jSONWriter);
                    jSONWriter.O1(j);
                    return;
                }
                wqx g = aVar2.g();
                String str3 = this.f;
                if (str3 == null) {
                    str3 = aVar2.b();
                }
                if (this.E || (aVar2.m() && this.f == null)) {
                    z = true;
                } else {
                    z = false;
                }
                if (str3 == null || this.D || z) {
                    long e = b2d.e(j, 1000L);
                    if (wqx.SHANGHAI_ZONE_ID.equals(g)) {
                        i3 = DateUtils.m(e);
                    } else {
                        i3 = g.a(vcf.d(j));
                    }
                    long j4 = e + i3;
                    long e2 = b2d.e(j4, 86400L);
                    int f = (int) b2d.f(j4, 86400L);
                    long j5 = e2 + 719468;
                    if (j5 < 0) {
                        long j6 = ((e2 + 719469) / 146097) - 1;
                        j3 = j6 * 400;
                        j5 += (-j6) * 146097;
                    } else {
                        j3 = 0;
                    }
                    long j7 = ((j5 * 400) + 591) / 146097;
                    long j8 = j5 - ((((j7 * 365) + (j7 / 4)) - (j7 / 100)) + (j7 / 400));
                    if (j8 < 0) {
                        j7--;
                        j8 = j5 - ((((365 * j7) + (j7 / 4)) - (j7 / 100)) + (j7 / 400));
                    }
                    int i4 = (int) j8;
                    int i5 = ((i4 * 5) + 2) / 153;
                    int i6 = ((i5 + 2) % 12) + 1;
                    int i7 = 1 + (i4 - (((i5 * 306) + 5) / 10));
                    int c = q7h.c(j7 + j3 + (i5 / 10));
                    long j9 = f;
                    if (j9 < 0 || j9 > 86399) {
                        throw new DateTimeException("Invalid secondOfDay " + j9);
                    }
                    aVar = aVar2;
                    int i8 = (int) (j9 / 3600);
                    long j10 = j9 - (i8 * ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT);
                    int i9 = (int) (j10 / 60);
                    int i10 = (int) (j10 - (i9 * 60));
                    if (c < 0 || c > 9999) {
                        j2 = j;
                    } else if (this.D) {
                        A(jSONWriter);
                        jSONWriter.u1(c, i6, i7, i8, i9, i10);
                        return;
                    } else if (z) {
                        A(jSONWriter);
                        jSONWriter.v1(c, i6, i7, i8, i9, i10);
                        return;
                    } else {
                        int f2 = (int) b2d.f(j, 1000L);
                        if (f2 != 0) {
                            int a2 = aVar.g().a(vcf.d(j));
                            A(jSONWriter);
                            jSONWriter.w1(c, i6, i7, i8, i9, i10, f2, a2, false);
                            return;
                        }
                        A(jSONWriter);
                        jSONWriter.v1(c, i6, i7, i8, i9, i10);
                        return;
                    }
                } else {
                    j2 = j;
                    aVar = aVar2;
                }
                A(jSONWriter);
                xqx d = xqx.d(vcf.d(j), g);
                boolean z2 = this.B;
                q7h q7hVar = d.f31549a;
                if ((z2 || (aVar.h() && this.f == null)) && (i2 = (p7hVar2 = q7hVar.f26561a).f25919a) >= 0 && i2 <= 9999) {
                    x9h x9hVar = q7hVar.b;
                    jSONWriter.w1(i2, p7hVar2.b, p7hVar2.c, x9hVar.f31233a, x9hVar.b, x9hVar.c, x9hVar.d / 1000000, d.b, true);
                    return;
                } else if (!this.C || (i = (p7hVar = q7hVar.f26561a).f25919a) < 0 || i > 9999) {
                    DateTimeFormatter S = S();
                    if (S == null) {
                        S = aVar.c();
                    }
                    Date date = new Date(j2);
                    if (S != null) {
                        str = S.a(date);
                    } else {
                        str = DateUtils.j(date, aVar.g());
                    }
                    jSONWriter.k2(str);
                    return;
                } else {
                    jSONWriter.y1(i, p7hVar.b, p7hVar.c);
                    return;
                }
            }
        }
        A(jSONWriter);
        jSONWriter.O1(j / 1000);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FieldWriterDate(String str, int i, long j, String str2, String str3, Type type, Class cls, Field field, Method method) {
        super(str, i, j, str2, str3, type, cls, field, method);
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        boolean z6 = false;
        if (str2 != null) {
            char c = 65535;
            switch (str2.hashCode()) {
                case -1074095546:
                    if (str2.equals("millis")) {
                        c = 0;
                        break;
                    }
                    break;
                case -288020395:
                    if (str2.equals("unixtime")) {
                        c = 1;
                        break;
                    }
                    break;
                case -276306848:
                    if (str2.equals("yyyyMMdd")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1333195168:
                    if (str2.equals("yyyy-MM-dd HH:mm:ss")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1349114208:
                    if (str2.equals("yyyyMMddHHmmss")) {
                        c = 4;
                        break;
                    }
                    break;
                case 2095190916:
                    if (str2.equals("iso8601")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    z4 = false;
                    z3 = false;
                    z2 = false;
                    z = false;
                    break;
                case 1:
                    z4 = true;
                    z3 = false;
                    z2 = false;
                    z = false;
                    z5 = false;
                    break;
                case 2:
                    z4 = false;
                    z3 = true;
                    z2 = false;
                    z = false;
                    z5 = false;
                    break;
                case 3:
                    z4 = false;
                    z3 = false;
                    z2 = false;
                    z = true;
                    z5 = false;
                    break;
                case 4:
                    z4 = false;
                    z3 = false;
                    z2 = true;
                    z = false;
                    z5 = false;
                    break;
                case 5:
                    z6 = true;
                default:
                    z4 = false;
                    z3 = false;
                    z2 = false;
                    z = false;
                    z5 = false;
                    break;
            }
            this.A = z5;
            this.B = z6;
            this.F = z4;
            this.C = z3;
            this.D = z2;
            this.E = z;
        }
        z4 = false;
        z3 = false;
        z2 = false;
        z = false;
        z5 = false;
        this.A = z5;
        this.B = z6;
        this.F = z4;
        this.C = z3;
        this.D = z2;
        this.E = z;
    }
}
