package com.alibaba.fastjson2.time;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.util.DateUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import tb.p7h;
import tb.q7h;
import tb.vcf;
import tb.wqx;
import tb.x9h;
import tb.xqx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class DateTimeFormatter {

    /* renamed from: a  reason: collision with root package name */
    public final String f2470a;
    public final PatternType b;
    public final Locale c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum PatternType {
        P6("HHmmss"),
        P8("yyyyMMdd"),
        P8_1("yyyy-M-d"),
        P8_2("HH:mm:ss"),
        P8_3("d-M-yyyy"),
        P8_4("d.M.yyyy"),
        P8_5("yyyy/M/d"),
        P9("yyyy-M-dd"),
        P9_1("yyyy-MM-d"),
        P10("yyyy-MM-dd"),
        P10_1("yyyy/MM/dd"),
        P11("yyyy-MMM-dd"),
        P12("yyyyMMddHHmm"),
        P14("yyyyMMddHHmmss"),
        P19("yyyy-MM-dd HH:mm:ss"),
        P19_1("yyyy/MM/dd HH:mm:ss"),
        P19_2("yyyy-MM-dd'T'HH:mm:ss"),
        P19_3("dd.MM.yyyy HH:mm:ss"),
        P29("yyyy-MM-dd HH:mm:ss.SSSSSSSSS"),
        OTHER("");
        
        final String pattern;

        PatternType(String str) {
            this.pattern = str;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2471a;

        static {
            int[] iArr = new int[PatternType.values().length];
            f2471a = iArr;
            try {
                iArr[PatternType.P8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2471a[PatternType.P9.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2471a[PatternType.P10.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2471a[PatternType.P19.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2471a[PatternType.P6.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2471a[PatternType.P8_2.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2471a[PatternType.P29.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2471a[PatternType.P8_1.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2471a[PatternType.P8_3.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2471a[PatternType.P8_4.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2471a[PatternType.P8_5.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2471a[PatternType.P9_1.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2471a[PatternType.P10_1.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f2471a[PatternType.P12.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f2471a[PatternType.P14.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f2471a[PatternType.P19_1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f2471a[PatternType.P19_2.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f2471a[PatternType.P19_3.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    public DateTimeFormatter(String str, Locale locale) {
        this(str, locale, null);
    }

    public static DateTimeFormatter e(String str) {
        return new DateTimeFormatter(str, null);
    }

    public static DateTimeFormatter f(String str, Locale locale) {
        return new DateTimeFormatter(str, locale);
    }

    public String a(Date date) {
        SimpleDateFormat simpleDateFormat;
        int i = a.f2471a[this.b.ordinal()];
        if (i == 3) {
            return DateUtils.f(date.getTime(), wqx.d);
        }
        if (i == 4) {
            return DateUtils.j(date, wqx.d);
        }
        String str = this.f2470a;
        Locale locale = this.c;
        if (locale == null) {
            simpleDateFormat = new SimpleDateFormat(str);
        } else {
            simpleDateFormat = new SimpleDateFormat(str, locale);
        }
        return simpleDateFormat.format(date);
    }

    public String b(q7h q7hVar) {
        throw new JSONException("TODO : " + this.f2470a);
    }

    public String c(xqx xqxVar) {
        switch (a.f2471a[this.b.ordinal()]) {
            case 2:
                p7h p7hVar = xqxVar.f31549a.f26561a;
                return DateUtils.i(p7hVar.f25919a, p7hVar.b, p7hVar.c);
            case 3:
                return DateUtils.g(xqxVar.f31549a.f26561a);
            case 4:
                return DateUtils.k(xqxVar.f31549a);
            case 5:
                return DateUtils.d(xqxVar.f31549a.b);
            case 6:
                return DateUtils.e(xqxVar.f31549a.b);
            case 7:
                return DateUtils.l(xqxVar.f31549a);
            default:
                return d(wqx.d).format(new Date(xqxVar.f()));
        }
    }

    public final SimpleDateFormat d(wqx wqxVar) {
        SimpleDateFormat simpleDateFormat;
        String str = this.f2470a;
        Locale locale = this.c;
        if (locale == null) {
            simpleDateFormat = new SimpleDateFormat(str);
        } else {
            simpleDateFormat = new SimpleDateFormat(str, locale);
        }
        simpleDateFormat.setTimeZone(wqxVar.f30862a);
        return simpleDateFormat;
    }

    public Date g(String str, wqx wqxVar) {
        try {
            return d(wqxVar).parse(str);
        } catch (ParseException e) {
            throw new JSONException("parse error, format " + this.f2470a, e);
        }
    }

    public p7h h(String str) {
        byte[] bytes = str.getBytes();
        int i = a.f2471a[this.b.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    switch (i) {
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                            break;
                        case 12:
                            break;
                        case 13:
                            break;
                        default:
                            throw new JSONException("TODO : " + this.f2470a);
                    }
                }
                return DateUtils.v(bytes, 0);
            }
            if (bytes.length == 9) {
                return DateUtils.B(bytes, 0);
            }
            if (bytes.length == 10) {
                return DateUtils.v(bytes, 0);
            }
            throw new JSONException("TODO : " + this.f2470a);
        }
        if (bytes.length == 8) {
            return DateUtils.z(bytes, 0);
        }
        if (bytes.length == 9) {
            return DateUtils.B(bytes, 0);
        }
        if (bytes.length == 10) {
            return DateUtils.v(bytes, 0);
        }
        throw new JSONException("TODO : " + this.f2470a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.q7h i(java.lang.String r5) {
        /*
            r4 = this;
            byte[] r0 = r5.getBytes()
            int[] r1 = com.alibaba.fastjson2.time.DateTimeFormatter.a.f2471a
            com.alibaba.fastjson2.time.DateTimeFormatter$PatternType r2 = r4.b
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 4
            r3 = 0
            if (r1 == r2) goto L_0x0021
            switch(r1) {
                case 14: goto L_0x001c;
                case 15: goto L_0x0017;
                case 16: goto L_0x0021;
                case 17: goto L_0x0021;
                case 18: goto L_0x0021;
                default: goto L_0x0015;
            }
        L_0x0015:
            r0 = 0
            goto L_0x0025
        L_0x0017:
            tb.q7h r0 = com.alibaba.fastjson2.util.DateUtils.H(r0, r3)
            goto L_0x0025
        L_0x001c:
            tb.q7h r0 = com.alibaba.fastjson2.util.DateUtils.F(r0, r3)
            goto L_0x0025
        L_0x0021:
            tb.q7h r0 = com.alibaba.fastjson2.util.DateUtils.P(r0, r3)
        L_0x0025:
            if (r0 != 0) goto L_0x005b
            tb.wqx r0 = tb.wqx.d
            java.text.SimpleDateFormat r1 = r4.d(r0)
            java.util.Date r1 = r1.parse(r5)     // Catch: ParseException -> 0x003c
            tb.vcf r1 = tb.vcf.c(r1)     // Catch: ParseException -> 0x003c
            tb.xqx r0 = tb.xqx.d(r1, r0)     // Catch: ParseException -> 0x003c
            tb.q7h r0 = r0.f31549a     // Catch: ParseException -> 0x003c
            goto L_0x005b
        L_0x003c:
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "parse error, format "
            r1.<init>(r2)
            java.lang.String r2 = r4.f2470a
            r1.append(r2)
            java.lang.String r2 = ", input "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L_0x005b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.time.DateTimeFormatter.i(java.lang.String):tb.q7h");
    }

    public x9h j(String str) {
        int i = a.f2471a[this.b.ordinal()];
        if (i != 1) {
            if (i == 5) {
                return DateUtils.d0(str, 0);
            }
            if (i != 6) {
                throw new JSONException("TODO " + this.f2470a);
            }
        }
        return DateUtils.e0(str.getBytes(), 0);
    }

    public xqx k(String str) {
        try {
            wqx wqxVar = wqx.d;
            return xqx.d(vcf.c(d(wqxVar).parse(str)), wqxVar);
        } catch (ParseException unused) {
            throw new JSONException("parse error, format " + this.f2470a + ", input " + str);
        }
    }

    public DateTimeFormatter(String str, Locale locale, wqx wqxVar) {
        PatternType patternType;
        if (str != null) {
            this.f2470a = str;
            this.c = locale;
            char c = 65535;
            switch (str.hashCode()) {
                case -2126457984:
                    if (str.equals("HH:mm:ss")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1686477813:
                    if (str.equals("d.M.yyyy")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1382984699:
                    if (str.equals("yyyy-MM-dd HH:mm:ss.SSSSSSSSS")) {
                        c = 2;
                        break;
                    }
                    break;
                case -657196083:
                    if (str.equals("yyyy-MMM-dd")) {
                        c = 3;
                        break;
                    }
                    break;
                case -277261865:
                    if (str.equals("yyyy-M-d")) {
                        c = 4;
                        break;
                    }
                    break;
                case -277202221:
                    if (str.equals("yyyy/M/d")) {
                        c = 5;
                        break;
                    }
                    break;
                case -276306848:
                    if (str.equals("yyyyMMdd")) {
                        c = 6;
                        break;
                    }
                    break;
                case -159776256:
                    if (str.equals("yyyy-MM-dd")) {
                        c = 7;
                        break;
                    }
                    break;
                case -102516032:
                    if (str.equals("yyyy/MM/dd")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -5183123:
                    if (str.equals("yyyy-M-dd")) {
                        c = '\t';
                        break;
                    }
                    break;
                case -5154076:
                    if (str.equals("yyyy-MM-d")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 311496928:
                    if (str.equals("yyyy/MM/dd HH:mm:ss")) {
                        c = 11;
                        break;
                    }
                    break;
                case 1333195168:
                    if (str.equals("yyyy-MM-dd HH:mm:ss")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 1349114208:
                    if (str.equals("yyyyMMddHHmmss")) {
                        c = '\r';
                        break;
                    }
                    break;
                case 1397504320:
                    if (str.equals("dd.MM.yyyy HH:mm:ss")) {
                        c = 14;
                        break;
                    }
                    break;
                case 1717603072:
                    if (str.equals("yyyyMMddHHmm")) {
                        c = 15;
                        break;
                    }
                    break;
                case 1720062281:
                    if (str.equals("d-M-yyyy")) {
                        c = 16;
                        break;
                    }
                    break;
                case 1798231098:
                    if (str.equals("yyyy-MM-dd'T'HH:mm:ss")) {
                        c = 17;
                        break;
                    }
                    break;
                case 1834843604:
                    if (str.equals("yyyy-MM-ddTHH:mm:ss")) {
                        c = 18;
                        break;
                    }
                    break;
                case 2131148032:
                    if (str.equals("HHmmss")) {
                        c = 19;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    patternType = PatternType.P8_2;
                    break;
                case 1:
                    patternType = PatternType.P8_4;
                    break;
                case 2:
                    patternType = PatternType.P29;
                    break;
                case 3:
                    patternType = PatternType.P11;
                    break;
                case 4:
                    patternType = PatternType.P8_1;
                    break;
                case 5:
                    patternType = PatternType.P8_5;
                    break;
                case 6:
                    patternType = PatternType.P8;
                    break;
                case 7:
                    patternType = PatternType.P10;
                    break;
                case '\b':
                    patternType = PatternType.P10_1;
                    break;
                case '\t':
                    patternType = PatternType.P9;
                    break;
                case '\n':
                    patternType = PatternType.P9_1;
                    break;
                case 11:
                    patternType = PatternType.P19_1;
                    break;
                case '\f':
                    patternType = PatternType.P19;
                    break;
                case '\r':
                    patternType = PatternType.P14;
                    break;
                case 14:
                    patternType = PatternType.P19_3;
                    break;
                case 15:
                    patternType = PatternType.P12;
                    break;
                case 16:
                    patternType = PatternType.P8_3;
                    break;
                case 17:
                case 18:
                    patternType = PatternType.P19_2;
                    break;
                case 19:
                    patternType = PatternType.P6;
                    break;
                default:
                    patternType = PatternType.OTHER;
                    break;
            }
            this.b = patternType;
            return;
        }
        throw new IllegalArgumentException("pattern is null");
    }
}
