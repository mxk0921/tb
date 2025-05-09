package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.i;
import com.alibaba.fastjson2.time.DateTimeException;
import com.alibaba.fastjson2.time.DateTimeFormatter;
import com.alibaba.wireless.security.SecExceptionCode;
import com.huawei.hms.framework.common.ExceptionCode;
import com.taobao.artc.api.AConstants;
import com.taobao.tao.shop.common.ShopConstants;
import java.util.Calendar;
import java.util.Date;
import tb.b2d;
import tb.f7l;
import tb.fek;
import tb.ohh;
import tb.p7h;
import tb.pg1;
import tb.q7h;
import tb.vcf;
import tb.wh6;
import tb.wqx;
import tb.x9h;
import tb.xqx;
import tb.yh6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class DateUtils {
    public static final int MAX_VALUE = 999999999;
    public static final int MIN_VALUE = -999999999;

    /* renamed from: a  reason: collision with root package name */
    public static DateTimeFormatter f2473a;
    public static DateTimeFormatter b;
    public static DateTimeFormatter c;
    public static DateTimeFormatter d;
    public static final int e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum DateTimeFormatPattern {
        DATE_FORMAT_10_DASH("yyyy-MM-dd", 10),
        DATE_FORMAT_10_SLASH("yyyy/MM/dd", 10),
        DATE_FORMAT_10_DOT("dd.MM.yyyy", 10),
        DATE_TIME_FORMAT_19_DASH("yyyy-MM-dd HH:mm:ss", 19),
        DATE_TIME_FORMAT_19_DASH_T("yyyy-MM-dd'T'HH:mm:ss", 19),
        DATE_TIME_FORMAT_19_SLASH("yyyy/MM/dd HH:mm:ss", 19),
        DATE_TIME_FORMAT_19_DOT("dd.MM.yyyy HH:mm:ss", 19);
        
        public final int length;
        public final String pattern;

        DateTimeFormatPattern(String str, int i) {
            this.pattern = str;
            this.length = i;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2474a;

        static {
            int[] iArr = new int[DateTimeFormatPattern.values().length];
            f2474a = iArr;
            try {
                iArr[DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2474a[DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH_T.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2474a[DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2474a[DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2474a[DateTimeFormatPattern.DATE_FORMAT_10_DASH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2474a[DateTimeFormatPattern.DATE_FORMAT_10_SLASH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final String[] f2475a = new String[1024];
    }

    static {
        int i;
        long currentTimeMillis = System.currentTimeMillis();
        wqx wqxVar = wqx.d;
        long e2 = b2d.e(currentTimeMillis, 1000L);
        if (wqxVar.equals(wqx.SHANGHAI_ZONE_ID)) {
            i = m(e2);
        } else {
            i = wqxVar.a(vcf.d(currentTimeMillis));
        }
        e = (int) b2d.e(e2 + i, 86400L);
    }

    public static p7h A(char[] cArr, int i) {
        int i2;
        int i3;
        int i4;
        if (i + 8 > cArr.length) {
            return null;
        }
        char c2 = cArr[i];
        char c3 = cArr[i + 1];
        char c4 = cArr[i + 2];
        char c5 = cArr[i + 3];
        char c6 = cArr[i + 4];
        char c7 = cArr[i + 5];
        char c8 = cArr[i + 6];
        char c9 = cArr[i + 7];
        if (c6 == '-' && c8 == '-') {
            c6 = '0';
        } else {
            if (c3 == '/' && c5 == '/') {
                c5 = c9;
                c9 = c4;
                c3 = c7;
                c4 = c8;
                c8 = '0';
                c7 = c2;
                c2 = c6;
                c6 = '0';
            } else if (c3 == '-' && c7 == '-') {
                int t = t(c4, c5, c6);
                if (t <= 0) {
                    return null;
                }
                c6 = (char) ((t / 10) + 48);
                c5 = c9;
                c7 = (char) ((t % 10) + 48);
                c9 = c2;
                c4 = c8;
                c2 = '2';
                c3 = '0';
            }
            if (c2 >= '0' && c2 <= '9' && c3 >= '0' && c3 <= '9' && c4 >= '0' && c4 <= '9' && c5 >= '0' && c5 <= '9') {
                i2 = ((c2 - '0') * 1000) + ((c3 - '0') * 100) + ((c4 - '0') * 10) + (c5 - '0');
                if (c6 >= '0' && c6 <= '9' && c7 >= '0' && c7 <= '9') {
                    i3 = ((c6 - '0') * 10) + (c7 - '0');
                    if (c8 >= '0' && c8 <= '9' && c9 >= '0' && c9 <= '9') {
                        i4 = ((c8 - '0') * 10) + (c9 - '0');
                        if (i2 != 0 && i3 == 0 && i4 == 0) {
                            return null;
                        }
                        return p7h.e(i2, i3, i4);
                    }
                }
            }
            return null;
        }
        c8 = '0';
        if (c2 >= '0') {
            i2 = ((c2 - '0') * 1000) + ((c3 - '0') * 100) + ((c4 - '0') * 10) + (c5 - '0');
            if (c6 >= '0') {
                i3 = ((c6 - '0') * 10) + (c7 - '0');
                if (c8 >= '0') {
                    i4 = ((c8 - '0') * 10) + (c9 - '0');
                    if (i2 != 0) {
                    }
                    return p7h.e(i2, i3, i4);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static tb.p7h B(byte[] r12, int r13) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.B(byte[], int):tb.p7h");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static tb.p7h C(char[] r12, int r13) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.C(char[], int):tb.p7h");
    }

    public static q7h E(char[] cArr, int i, int i2) {
        if (cArr == null || i2 == 0) {
            return null;
        }
        switch (i2) {
            case 4:
                if (cArr[i] == 'n' && cArr[i + 1] == 'u' && cArr[i + 2] == 'l' && cArr[i + 3] == 'l') {
                    return null;
                }
                String str = new String(cArr, i, i2);
                throw new DateTimeException("illegal input ".concat(str), str, 0);
            case 5:
            case 6:
            case 7:
            case 13:
            case 15:
            default:
                return c0(cArr, i, i2);
            case 8:
                p7h A = A(cArr, i);
                if (A == null) {
                    return null;
                }
                return q7h.f(A, x9h.MIN);
            case 9:
                p7h C = C(cArr, i);
                if (C == null) {
                    return null;
                }
                return q7h.f(C, x9h.MIN);
            case 10:
                p7h w = w(cArr, i);
                if (w == null) {
                    return null;
                }
                return q7h.f(w, x9h.MIN);
            case 11:
                p7h y = y(cArr, i);
                if (y == null) {
                    return null;
                }
                return q7h.f(y, x9h.MIN);
            case 12:
                return G(cArr, i);
            case 14:
                return I(cArr, i);
            case 16:
                return K(cArr, i);
            case 17:
                return M(cArr, i);
            case 18:
                return O(cArr, i);
            case 19:
                return Q(cArr, i);
            case 20:
                return S(cArr, i);
        }
    }

    public static q7h F(byte[] bArr, int i) {
        byte[] bArr2;
        int i2 = i + 12;
        if (i2 <= bArr.length) {
            char c2 = (char) bArr[i];
            char c3 = (char) bArr[i + 1];
            char c4 = (char) bArr[i + 2];
            char c5 = (char) bArr[i + 3];
            char c6 = (char) bArr[i + 4];
            char c7 = (char) bArr[i + 5];
            char c8 = (char) bArr[i + 6];
            char c9 = (char) bArr[i + 7];
            char c10 = (char) bArr[i + 8];
            char c11 = (char) bArr[i + 9];
            char c12 = (char) bArr[i + 10];
            char c13 = (char) bArr[i + 11];
            if (c2 < '0') {
                bArr2 = bArr;
            } else if (c2 > '9' || c3 < '0' || c3 > '9' || c4 < '0' || c4 > '9' || c5 < '0' || c5 > '9') {
                bArr2 = bArr;
            } else {
                int i3 = ((c2 - '0') * 1000) + ((c3 - '0') * 100) + ((c4 - '0') * 10) + (c5 - '0');
                if (c6 < '0' || c6 > '9' || c7 < '0' || c7 > '9') {
                    String str = new String(bArr, i, i2);
                    throw new DateTimeException("illegal input ".concat(str), str, 0);
                }
                int i4 = ((c6 - '0') * 10) + (c7 - '0');
                if (c8 < '0' || c8 > '9' || c9 < '0' || c9 > '9') {
                    String str2 = new String(bArr, i, i2);
                    throw new DateTimeException("illegal input ".concat(str2), str2, 0);
                }
                int i5 = ((c8 - '0') * 10) + (c9 - '0');
                if (c10 < '0' || c10 > '9' || c11 < '0' || c11 > '9') {
                    String str3 = new String(bArr, i, i2);
                    throw new DateTimeException("illegal input ".concat(str3), str3, 0);
                }
                int i6 = ((c10 - '0') * 10) + (c11 - '0');
                if (c12 < '0' || c12 > '9' || c13 < '0' || c13 > '9') {
                    String str4 = new String(bArr, i, i2);
                    throw new DateTimeException("illegal input ".concat(str4), str4, 0);
                }
                int i7 = ((c12 - '0') * 10) + (c13 - '0');
                if (i3 == 0 && i4 == 0 && i5 == 0 && i6 == 0 && i7 == 0) {
                    return null;
                }
                return q7h.d(i3, i4, i5, i6, i7, 0);
            }
            String str5 = new String(bArr2, i, i2);
            throw new DateTimeException("illegal input ".concat(str5), str5, 0);
        }
        String str6 = new String(bArr, i, bArr.length - i);
        throw new DateTimeException("illegal input ".concat(str6), str6, 0);
    }

    public static q7h G(char[] cArr, int i) {
        char[] cArr2;
        int i2 = i + 12;
        if (i2 <= cArr.length) {
            char c2 = cArr[i];
            char c3 = cArr[i + 1];
            char c4 = cArr[i + 2];
            char c5 = cArr[i + 3];
            char c6 = cArr[i + 4];
            char c7 = cArr[i + 5];
            char c8 = cArr[i + 6];
            char c9 = cArr[i + 7];
            char c10 = cArr[i + 8];
            char c11 = cArr[i + 9];
            char c12 = cArr[i + 10];
            char c13 = cArr[i + 11];
            if (c2 < '0') {
                cArr2 = cArr;
            } else if (c2 > '9' || c3 < '0' || c3 > '9' || c4 < '0' || c4 > '9' || c5 < '0' || c5 > '9') {
                cArr2 = cArr;
            } else {
                int i3 = ((c2 - '0') * 1000) + ((c3 - '0') * 100) + ((c4 - '0') * 10) + (c5 - '0');
                if (c6 < '0' || c6 > '9' || c7 < '0' || c7 > '9') {
                    String str = new String(cArr, i, i2);
                    throw new DateTimeException("illegal input ".concat(str), str, 0);
                }
                int i4 = ((c6 - '0') * 10) + (c7 - '0');
                if (c8 < '0' || c8 > '9' || c9 < '0' || c9 > '9') {
                    String str2 = new String(cArr, i, i2);
                    throw new DateTimeException("illegal input ".concat(str2), str2, 0);
                }
                int i5 = ((c8 - '0') * 10) + (c9 - '0');
                if (c10 < '0' || c10 > '9' || c11 < '0' || c11 > '9') {
                    String str3 = new String(cArr, i, i2);
                    throw new DateTimeException("illegal input ".concat(str3), str3, 0);
                }
                int i6 = ((c10 - '0') * 10) + (c11 - '0');
                if (c12 < '0' || c12 > '9' || c13 < '0' || c13 > '9') {
                    String str4 = new String(cArr, i, i2);
                    throw new DateTimeException("illegal input ".concat(str4), str4, 0);
                }
                int i7 = ((c12 - '0') * 10) + (c13 - '0');
                if (i3 == 0 && i4 == 0 && i5 == 0 && i6 == 0 && i7 == 0) {
                    return null;
                }
                return q7h.d(i3, i4, i5, i6, i7, 0);
            }
            String str5 = new String(cArr2, i, i2);
            throw new DateTimeException("illegal input ".concat(str5), str5, 0);
        }
        String str6 = new String(cArr, i, cArr.length - i);
        throw new DateTimeException("illegal input ".concat(str6), str6, 0);
    }

    public static q7h H(byte[] bArr, int i) {
        if (i + 14 > bArr.length) {
            return null;
        }
        char c2 = (char) bArr[i];
        char c3 = (char) bArr[i + 1];
        char c4 = (char) bArr[i + 2];
        char c5 = (char) bArr[i + 3];
        char c6 = (char) bArr[i + 4];
        char c7 = (char) bArr[i + 5];
        char c8 = (char) bArr[i + 6];
        char c9 = (char) bArr[i + 7];
        char c10 = (char) bArr[i + 8];
        char c11 = (char) bArr[i + 9];
        char c12 = (char) bArr[i + 10];
        char c13 = (char) bArr[i + 11];
        char c14 = (char) bArr[i + 12];
        char c15 = (char) bArr[i + 13];
        if (c2 < '0' || c2 > '9' || c3 < '0' || c3 > '9' || c4 < '0' || c4 > '9' || c5 < '0' || c5 > '9') {
            return null;
        }
        int i2 = ((c2 - '0') * 1000) + ((c3 - '0') * 100) + ((c4 - '0') * 10) + (c5 - '0');
        if (c6 < '0' || c6 > '9' || c7 < '0' || c7 > '9') {
            return null;
        }
        int i3 = ((c6 - '0') * 10) + (c7 - '0');
        if (c8 < '0' || c8 > '9' || c9 < '0' || c9 > '9') {
            return null;
        }
        int i4 = ((c8 - '0') * 10) + (c9 - '0');
        if (c10 < '0' || c10 > '9' || c11 < '0' || c11 > '9') {
            return null;
        }
        int i5 = ((c10 - '0') * 10) + (c11 - '0');
        if (c12 < '0' || c12 > '9' || c13 < '0' || c13 > '9') {
            return null;
        }
        int i6 = ((c12 - '0') * 10) + (c13 - '0');
        if (c14 < '0' || c14 > '9' || c15 < '0' || c15 > '9') {
            return null;
        }
        return q7h.d(i2, i3, i4, i5, i6, ((c14 - '0') * 10) + (c15 - '0'));
    }

    public static q7h I(char[] cArr, int i) {
        if (i + 14 > cArr.length) {
            return null;
        }
        char c2 = cArr[i];
        char c3 = cArr[i + 1];
        char c4 = cArr[i + 2];
        char c5 = cArr[i + 3];
        char c6 = cArr[i + 4];
        char c7 = cArr[i + 5];
        char c8 = cArr[i + 6];
        char c9 = cArr[i + 7];
        char c10 = cArr[i + 8];
        char c11 = cArr[i + 9];
        char c12 = cArr[i + 10];
        char c13 = cArr[i + 11];
        char c14 = cArr[i + 12];
        char c15 = cArr[i + 13];
        if (c2 < '0' || c2 > '9' || c3 < '0' || c3 > '9' || c4 < '0' || c4 > '9' || c5 < '0' || c5 > '9') {
            return null;
        }
        int i2 = ((c2 - '0') * 1000) + ((c3 - '0') * 100) + ((c4 - '0') * 10) + (c5 - '0');
        if (c6 < '0' || c6 > '9' || c7 < '0' || c7 > '9') {
            return null;
        }
        int i3 = ((c6 - '0') * 10) + (c7 - '0');
        if (c8 < '0' || c8 > '9' || c9 < '0' || c9 > '9') {
            return null;
        }
        int i4 = ((c8 - '0') * 10) + (c9 - '0');
        if (c10 < '0' || c10 > '9' || c11 < '0' || c11 > '9') {
            return null;
        }
        int i5 = ((c10 - '0') * 10) + (c11 - '0');
        if (c12 < '0' || c12 > '9' || c13 < '0' || c13 > '9') {
            return null;
        }
        int i6 = ((c12 - '0') * 10) + (c13 - '0');
        if (c14 < '0' || c14 > '9' || c15 < '0' || c15 > '9') {
            return null;
        }
        return q7h.d(i2, i3, i4, i5, i6, ((c14 - '0') * 10) + (c15 - '0'));
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x013a, code lost:
        if (r12 == 32) goto L_0x013c;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0246 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static tb.q7h J(byte[] r25, int r26) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.J(byte[], int):tb.q7h");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
        if (r12 == ' ') goto L_0x0090;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static tb.q7h K(char[] r24, int r25) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.K(char[], int):tb.q7h");
    }

    public static q7h L(byte[] bArr, int i) {
        String str;
        int i2;
        char c2;
        char c3;
        char c4;
        char c5;
        char c6;
        char c7;
        char c8;
        char c9;
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        char c15;
        char c16;
        char c17;
        char c18;
        byte b2;
        String str2;
        byte b3;
        String str3;
        byte b4;
        String str4;
        char c19;
        if (i + 17 <= bArr.length) {
            byte b5 = bArr[i];
            byte b6 = bArr[i + 1];
            byte b7 = bArr[i + 2];
            byte b8 = bArr[i + 3];
            byte b9 = bArr[i + 4];
            byte b10 = bArr[i + 5];
            byte b11 = bArr[i + 6];
            byte b12 = bArr[i + 7];
            byte b13 = bArr[i + 8];
            byte b14 = bArr[i + 9];
            byte b15 = bArr[i + 10];
            byte b16 = bArr[i + 11];
            byte b17 = bArr[i + 12];
            byte b18 = bArr[i + 13];
            byte b19 = bArr[i + 14];
            byte b20 = bArr[i + 15];
            byte b21 = bArr[i + 16];
            if (b9 == 45 && b12 == 45 && ((b15 == 84 || b15 == 32) && b18 == 58 && b21 == 90)) {
                c18 = (char) b5;
                c17 = (char) b6;
                c14 = (char) b7;
                char c20 = (char) b8;
                c12 = (char) b10;
                c10 = (char) b11;
                char c21 = (char) b13;
                c8 = (char) b14;
                c7 = (char) b16;
                char c22 = (char) b17;
                char c23 = (char) b19;
                c11 = (char) b20;
                c3 = c22;
                c2 = c23;
                str = "illegal input ";
                c5 = '0';
                c4 = '0';
                i2 = 0;
                c6 = c21;
                c9 = c20;
            } else {
                if (b9 == 45 && b11 == 45 && ((b13 == 32 || b13 == 84) && b16 == 58 && b19 == 58)) {
                    c15 = (char) b5;
                    char c24 = (char) b6;
                    char c25 = (char) b7;
                    char c26 = (char) b8;
                    c10 = (char) b10;
                    c8 = (char) b12;
                    char c27 = (char) b14;
                    char c28 = (char) b15;
                    c2 = (char) b17;
                    c3 = c28;
                    c4 = (char) b21;
                    str = "illegal input ";
                    c16 = '0';
                    i2 = 0;
                    c7 = c27;
                    c5 = (char) b20;
                    c6 = '0';
                    c9 = c26;
                    c11 = (char) b18;
                    c12 = '0';
                    c13 = c24;
                    c14 = c25;
                } else if (b9 == -27 && b10 == -71 && b11 == -76 && b14 == -26 && b15 == -100 && b16 == -120 && b19 == -26 && b20 == -105 && b21 == -91) {
                    c18 = (char) b5;
                    c17 = (char) b6;
                    c14 = (char) b7;
                    c12 = (char) b12;
                    c10 = (char) b13;
                    c8 = (char) b18;
                    c9 = (char) b8;
                    c6 = (char) b17;
                    str = "illegal input ";
                    c11 = '0';
                    c7 = '0';
                    c5 = '0';
                    c4 = '0';
                    c3 = '0';
                    c2 = '0';
                    i2 = 0;
                } else {
                    byte b22 = 32;
                    if (b7 != 32 || b11 != 32 || b16 != 32) {
                        str2 = "illegal input ";
                        b2 = b21;
                    } else if (b19 == 58) {
                        c15 = (char) b12;
                        char c29 = (char) b13;
                        char c30 = (char) b14;
                        char c31 = (char) b15;
                        int t = t((char) b8, (char) b9, (char) b10);
                        if (t > 0) {
                            c3 = (char) b18;
                            c12 = (char) ((t / 10) + 48);
                            c2 = (char) b20;
                            str = "illegal input ";
                            c4 = '0';
                            i2 = 0;
                            c7 = (char) b17;
                            c8 = (char) b6;
                            c13 = c29;
                            c11 = (char) b21;
                            c16 = '0';
                            c5 = '0';
                            c19 = c31;
                            c6 = (char) b5;
                            c14 = c30;
                            c10 = (char) ((t % 10) + 48);
                            c9 = c19;
                        } else {
                            String str5 = new String(bArr, i, 17);
                            throw new DateTimeException("illegal input ".concat(str5), str5, 0);
                        }
                    } else {
                        str2 = "illegal input ";
                        b2 = b21;
                        b22 = 32;
                    }
                    if (b6 == b22 && b10 == b22 && b15 == b22 && b17 == 58 && b19 == 58) {
                        char c32 = (char) b5;
                        int t2 = t((char) b7, (char) b8, (char) b9);
                        if (t2 > 0) {
                            c10 = (char) ((t2 % 10) + 48);
                            c15 = (char) b11;
                            c13 = (char) b12;
                            char c33 = (char) b13;
                            c9 = (char) b14;
                            char c34 = (char) b18;
                            c3 = (char) b16;
                            c5 = (char) b20;
                            c4 = (char) b2;
                            str = str2;
                            c7 = '0';
                            c6 = '0';
                            c2 = '0';
                            i2 = 0;
                            c8 = c32;
                            c16 = '0';
                            c12 = (char) ((t2 / 10) + 48);
                            c14 = c33;
                            c11 = c34;
                        } else {
                            String str6 = new String(bArr, i, 17);
                            throw new DateTimeException(str2.concat(str6), str6, 0);
                        }
                    } else {
                        byte b23 = 32;
                        if (b6 != 32 || b10 != 32 || b15 != 32) {
                            str3 = str2;
                            b3 = b2;
                        } else if (b17 == 58 && b20 == 58) {
                            char c35 = (char) b5;
                            int t3 = t((char) b7, (char) b8, (char) b9);
                            if (t3 > 0) {
                                c10 = (char) ((t3 % 10) + 48);
                                c15 = (char) b11;
                                c13 = (char) b12;
                                char c36 = (char) b13;
                                c9 = (char) b14;
                                c2 = (char) b18;
                                c3 = (char) b16;
                                c4 = (char) b2;
                                str = str2;
                                c6 = '0';
                                c5 = '0';
                                i2 = 0;
                                c8 = c35;
                                c12 = (char) ((t3 / 10) + 48);
                                c14 = c36;
                                c11 = (char) b19;
                                c16 = '0';
                                c7 = '0';
                            } else {
                                String str7 = new String(bArr, i, 17);
                                throw new DateTimeException(str2.concat(str7), str7, 0);
                            }
                        } else {
                            str3 = str2;
                            b3 = b2;
                            b23 = 32;
                        }
                        if (b6 != b23 || b10 != b23 || b15 != b23) {
                            str4 = str3;
                            b4 = b3;
                        } else if (b18 == 58 && b20 == 58) {
                            char c37 = (char) b5;
                            int t4 = t((char) b7, (char) b8, (char) b9);
                            if (t4 > 0) {
                                c10 = (char) ((t4 % 10) + 48);
                                char c38 = (char) b11;
                                char c39 = (char) b12;
                                char c40 = (char) b13;
                                c9 = (char) b14;
                                c3 = (char) b17;
                                c4 = (char) b3;
                                str = str3;
                                c16 = '0';
                                c6 = '0';
                                c5 = '0';
                                c2 = '0';
                                i2 = 0;
                                c8 = c37;
                                c15 = c38;
                                c14 = c40;
                                c11 = (char) b19;
                                c7 = (char) b16;
                                c12 = (char) ((t4 / 10) + 48);
                                c13 = c39;
                            } else {
                                String str8 = new String(bArr, i, 17);
                                throw new DateTimeException(str3.concat(str8), str8, 0);
                            }
                        } else {
                            str4 = str3;
                            b4 = b3;
                            b23 = 32;
                        }
                        if (b7 == b23 && b11 == b23 && b16 == b23 && b18 == 58 && b20 == 58) {
                            char c41 = (char) b5;
                            char c42 = (char) b6;
                            int t5 = t((char) b8, (char) b9, (char) b10);
                            if (t5 > 0) {
                                c12 = (char) ((t5 / 10) + 48);
                                c10 = (char) ((t5 % 10) + 48);
                                char c43 = (char) b12;
                                char c44 = (char) b13;
                                char c45 = (char) b14;
                                char c46 = (char) b15;
                                c3 = (char) b17;
                                c4 = (char) b4;
                                str = str4;
                                c7 = '0';
                                c5 = '0';
                                c2 = '0';
                                i2 = 0;
                                c6 = c41;
                                c15 = c43;
                                c13 = c44;
                                c11 = (char) b19;
                                c16 = '0';
                                c19 = c46;
                                c8 = c42;
                                c14 = c45;
                                c9 = c19;
                            } else {
                                String str9 = new String(bArr, i, 17);
                                throw new DateTimeException(str4.concat(str9), str9, 0);
                            }
                        } else {
                            str = str4;
                            char c47 = (char) b5;
                            char c48 = (char) b6;
                            char c49 = (char) b7;
                            c9 = (char) b8;
                            char c50 = (char) b9;
                            char c51 = (char) b10;
                            c6 = (char) b11;
                            char c52 = (char) b12;
                            char c53 = (char) b13;
                            c3 = (char) b14;
                            c2 = (char) b15;
                            char c54 = (char) b16;
                            char c55 = (char) b17;
                            char c56 = (char) b18;
                            c16 = '0';
                            if (b19 < 48 || b19 > 57 || b20 < 48 || b20 > 57 || b4 < 48 || b4 > 57) {
                                return null;
                            }
                            i2 = (((b19 - 48) * 100) + ((b20 - 48) * 10) + (b4 - 48)) * 1000000;
                            c14 = c49;
                            c10 = c51;
                            c7 = c53;
                            c11 = c54;
                            c15 = c47;
                            c13 = c48;
                            c4 = c56;
                            c12 = c50;
                            c8 = c52;
                            c5 = c55;
                        }
                    }
                }
                if (c15 >= c16 || c15 > '9' || c13 < c16 || c13 > '9' || c14 < c16 || c14 > '9' || c9 < c16 || c9 > '9') {
                    String str10 = new String(bArr, i, 17);
                    throw new DateTimeException(str.concat(str10), str10, 0);
                }
                int i3 = ((c15 - c16) * 1000) + ((c13 - c16) * 100) + ((c14 - c16) * 10) + (c9 - c16);
                if (c12 < c16 || c12 > '9' || c10 < c16 || c10 > '9') {
                    String str11 = new String(bArr, i, 17);
                    throw new DateTimeException(str.concat(str11), str11, 0);
                }
                int i4 = ((c12 - c16) * 10) + (c10 - c16);
                if (c6 < c16 || c6 > '9' || c8 < c16 || c8 > '9') {
                    String str12 = new String(bArr, i, 17);
                    throw new DateTimeException(str.concat(str12), str12, 0);
                }
                int i5 = ((c6 - c16) * 10) + (c8 - c16);
                if (c7 < c16 || c7 > '9' || c3 < c16 || c3 > '9') {
                    String str13 = new String(bArr, i, 17);
                    throw new DateTimeException(str.concat(str13), str13, 0);
                }
                int i6 = ((c7 - c16) * 10) + (c3 - c16);
                if (c2 < c16 || c2 > '9' || c11 < c16 || c11 > '9') {
                    String str14 = new String(bArr, i, 17);
                    throw new DateTimeException(str.concat(str14), str14, 0);
                }
                int i7 = ((c2 - c16) * 10) + (c11 - c16);
                if (c5 >= c16 && c5 <= '9' && c4 >= c16 && c4 <= '9') {
                    return q7h.e(i3, i4, i5, i6, i7, ((c5 - c16) * 10) + (c4 - c16), i2);
                }
                String str15 = new String(bArr, i, 17);
                throw new DateTimeException(str.concat(str15), str15, 0);
            }
            c13 = c17;
            c15 = c18;
            c16 = '0';
            if (c15 >= c16) {
            }
            String str102 = new String(bArr, i, 17);
            throw new DateTimeException(str.concat(str102), str102, 0);
        }
        String str16 = new String(bArr, i, bArr.length - i);
        throw new DateTimeException("illegal input ".concat(str16), str16, 0);
    }

    public static q7h M(char[] cArr, int i) {
        int i2;
        char c2;
        char c3;
        char c4;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (i + 17 <= cArr.length) {
            char c5 = cArr[i];
            char c6 = cArr[i + 1];
            char c7 = cArr[i + 2];
            char c8 = cArr[i + 3];
            char c9 = cArr[i + 4];
            char c10 = cArr[i + 5];
            char c11 = cArr[i + 6];
            char c12 = cArr[i + 7];
            char c13 = cArr[i + 8];
            char c14 = cArr[i + 9];
            char c15 = cArr[i + 10];
            char c16 = cArr[i + 11];
            char c17 = cArr[i + 12];
            char c18 = cArr[i + 13];
            char c19 = cArr[i + 14];
            char c20 = cArr[i + 15];
            char c21 = cArr[i + 16];
            char c22 = '-';
            if (c9 == '-' && c12 == '-') {
                if ((c15 == 'T' || c15 == ' ') && c18 == ':' && c21 == 'Z') {
                    c15 = c19;
                    c12 = c6;
                    c9 = c10;
                    c10 = c11;
                    c11 = c13;
                    c13 = c16;
                    c3 = c5;
                    c6 = c14;
                    c4 = '0';
                    c18 = '0';
                    i2 = 0;
                    c16 = c20;
                    c2 = c17;
                    c17 = '0';
                    if (c3 >= c4 && c3 <= '9' && c12 >= c4 && c12 <= '9' && c7 >= c4 && c7 <= '9' && c8 >= c4 && c8 <= '9') {
                        i3 = ((c3 - c4) * 1000) + ((c12 - c4) * 100) + ((c7 - c4) * 10) + (c8 - c4);
                        if (c9 >= c4 && c9 <= '9' && c10 >= c4 && c10 <= '9') {
                            i4 = ((c9 - c4) * 10) + (c10 - c4);
                            if (c11 >= c4 && c11 <= '9' && c6 >= c4 && c6 <= '9') {
                                i5 = ((c11 - c4) * 10) + (c6 - c4);
                                if (c13 >= c4 && c13 <= '9' && c2 >= c4 && c2 <= '9') {
                                    i6 = ((c13 - c4) * 10) + (c2 - c4);
                                    if (c15 >= c4 && c15 <= '9' && c16 >= c4 && c16 <= '9') {
                                        i7 = ((c15 - c4) * 10) + (c16 - c4);
                                        if (c17 >= c4 && c17 <= '9' && c18 >= c4 && c18 <= '9') {
                                            return q7h.e(i3, i4, i5, i6, i7, ((c17 - c4) * 10) + (c18 - c4), i2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return null;
                }
                c22 = '-';
            }
            if (c9 == c22 && c11 == c22 && ((c13 == ' ' || c13 == 'T') && c16 == ':' && c19 == ':')) {
                c16 = c18;
                c3 = c5;
                c13 = c14;
                c9 = '0';
                c11 = '0';
                i2 = 0;
                c18 = c21;
                c4 = '0';
                c12 = c6;
                c6 = c12;
                c17 = c20;
                c2 = c15;
                c15 = c17;
            } else {
                char c23 = ' ';
                if (c7 == ' ' && c11 == ' ' && c16 == ' ') {
                    if (c19 == ':') {
                        int t = t(c8, c9, c10);
                        if (t <= 0) {
                            return null;
                        }
                        c9 = (char) ((t / 10) + 48);
                        c10 = (char) ((t % 10) + 48);
                        c16 = c21;
                        c3 = c12;
                        c12 = c13;
                        c8 = c15;
                        c13 = c17;
                        c11 = c5;
                        c7 = c14;
                        c4 = '0';
                        c17 = '0';
                        i2 = 0;
                        c15 = c20;
                        c2 = c18;
                        c18 = '0';
                    } else {
                        c23 = ' ';
                    }
                }
                if (c6 == c23 && c10 == c23 && c15 == c23) {
                    if (c17 == ':' && c19 == ':') {
                        int t2 = t(c7, c8, c9);
                        if (t2 <= 0) {
                            return null;
                        }
                        c9 = (char) ((t2 / 10) + 48);
                        c10 = (char) ((t2 % 10) + 48);
                        c3 = c11;
                        c7 = c13;
                        c17 = c20;
                        c2 = c16;
                        c6 = c5;
                        c8 = c14;
                        c11 = '0';
                        c13 = '0';
                        c15 = '0';
                        i2 = 0;
                        c16 = c18;
                        c18 = c21;
                        c4 = '0';
                    } else {
                        c23 = ' ';
                    }
                }
                if (c6 == c23 && c10 == c23 && c15 == c23) {
                    if (c17 == ':' && c20 == ':') {
                        int t3 = t(c7, c8, c9);
                        if (t3 <= 0) {
                            return null;
                        }
                        c9 = (char) ((t3 / 10) + 48);
                        c10 = (char) ((t3 % 10) + 48);
                        c15 = c18;
                        c7 = c13;
                        c2 = c16;
                        c6 = c5;
                        c8 = c14;
                        c13 = '0';
                        c17 = '0';
                        i2 = 0;
                        c18 = c21;
                        c16 = c19;
                        c3 = c11;
                        c4 = '0';
                        c11 = '0';
                    } else {
                        c23 = ' ';
                    }
                }
                if (c6 == c23 && c10 == c23 && c15 == c23) {
                    if (c18 == ':' && c20 == ':') {
                        int t4 = t(c7, c8, c9);
                        if (t4 <= 0) {
                            return null;
                        }
                        c9 = (char) ((t4 / 10) + 48);
                        c10 = (char) ((t4 % 10) + 48);
                        c18 = c21;
                        c7 = c13;
                        c13 = c16;
                        c2 = c17;
                        c6 = c5;
                        c8 = c14;
                        c4 = '0';
                        c15 = '0';
                        c17 = '0';
                        i2 = 0;
                        c16 = c19;
                        c3 = c11;
                        c11 = '0';
                    } else {
                        c23 = ' ';
                    }
                }
                if (c7 == c23 && c11 == c23 && c16 == c23 && c18 == ':' && c20 == ':') {
                    int t5 = t(c8, c9, c10);
                    if (t5 <= 0) {
                        return null;
                    }
                    c9 = (char) ((t5 / 10) + 48);
                    c10 = (char) ((t5 % 10) + 48);
                    c18 = c21;
                    c16 = c19;
                    c3 = c12;
                    c12 = c13;
                    c8 = c15;
                    c2 = c17;
                    c11 = c5;
                    c7 = c14;
                    c4 = '0';
                    c13 = '0';
                    c15 = '0';
                    c17 = '0';
                    i2 = 0;
                } else {
                    if (c19 >= '0' && c19 <= '9' && c20 >= '0' && c20 <= '9' && c21 >= '0' && c21 <= '9') {
                        i2 = 1000000 * (((c19 - '0') * 100) + ((c20 - '0') * 10) + (c21 - '0'));
                        c6 = c12;
                        c3 = c5;
                        c2 = c14;
                        c12 = c6;
                        c4 = '0';
                    }
                    return null;
                }
            }
            if (c3 >= c4) {
                i3 = ((c3 - c4) * 1000) + ((c12 - c4) * 100) + ((c7 - c4) * 10) + (c8 - c4);
                if (c9 >= c4) {
                    i4 = ((c9 - c4) * 10) + (c10 - c4);
                    if (c11 >= c4) {
                        i5 = ((c11 - c4) * 10) + (c6 - c4);
                        if (c13 >= c4) {
                            i6 = ((c13 - c4) * 10) + (c2 - c4);
                            if (c15 >= c4) {
                                i7 = ((c15 - c4) * 10) + (c16 - c4);
                                if (c17 >= c4) {
                                    return q7h.e(i3, i4, i5, i6, i7, ((c17 - c4) * 10) + (c18 - c4), i2);
                                }
                            }
                        }
                    }
                }
            }
            return null;
        }
        String str = new String(cArr, i, cArr.length - i);
        throw new DateTimeException("illegal input ".concat(str), str, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static tb.q7h N(byte[] r31, int r32) {
        /*
            Method dump skipped, instructions count: 1041
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.N(byte[], int):tb.q7h");
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static tb.q7h O(char[] r31, int r32) {
        /*
            Method dump skipped, instructions count: 1023
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.O(char[], int):tb.q7h");
    }

    public static q7h P(byte[] bArr, int i) {
        char c2;
        char c3;
        char c4;
        char c5;
        char c6;
        char c7;
        char c8;
        if (i + 19 > bArr.length) {
            return null;
        }
        char c9 = (char) bArr[i];
        char c10 = (char) bArr[i + 1];
        char c11 = (char) bArr[i + 2];
        char c12 = (char) bArr[i + 3];
        char c13 = (char) bArr[i + 4];
        char c14 = (char) bArr[i + 5];
        char c15 = (char) bArr[i + 7];
        char c16 = (char) bArr[i + 9];
        char c17 = (char) bArr[i + 10];
        char c18 = (char) bArr[i + 11];
        char c19 = (char) bArr[i + 12];
        char c20 = (char) bArr[i + 13];
        char c21 = (char) bArr[i + 14];
        char c22 = (char) bArr[i + 15];
        char c23 = (char) bArr[i + 6];
        char c24 = (char) bArr[i + 16];
        char c25 = (char) bArr[i + 8];
        char c26 = (char) bArr[i + 17];
        char c27 = (char) bArr[i + 18];
        if (!(c13 == '-' && c15 == '-' && ((c17 == ' ' || c17 == 'T') && c20 == ':' && c24 == ':'))) {
            char c28 = wh6.DIR;
            if (c13 == '/' && c15 == '/') {
                if (!((c17 == ' ' || c17 == 'T') && c20 == ':' && c24 == ':')) {
                    c28 = wh6.DIR;
                }
            }
            if (c11 == c28 && c14 == c28 && ((c17 == ' ' || c17 == 'T') && c20 == ':' && c24 == ':')) {
                c2 = c10;
                c4 = c16;
                c6 = c23;
                c5 = c25;
                c23 = c13;
                c25 = c9;
                c3 = c12;
            } else if (c10 != ' ' || c14 != ' ' || c17 != ' ' || c20 != ':' || c24 != ':') {
                return null;
            } else {
                int t = t(c11, c12, c13);
                if (t > 0) {
                    c8 = (char) ((t / 10) + 48);
                    c7 = (char) ((t % 10) + 48);
                } else {
                    c8 = '0';
                    c7 = '0';
                }
                c4 = c16;
                c2 = c9;
                c6 = c23;
                c5 = c25;
                c25 = '0';
                c3 = c8;
                c23 = c7;
            }
            return p(c6, c15, c5, c4, c3, c23, c25, c2, c18, c19, c21, c22, c26, c27);
        }
        c15 = c10;
        c4 = c12;
        c2 = c16;
        c6 = c9;
        c5 = c11;
        c3 = c14;
        return p(c6, c15, c5, c4, c3, c23, c25, c2, c18, c19, c21, c22, c26, c27);
    }

    public static q7h Q(char[] cArr, int i) {
        char c2;
        char c3;
        char c4;
        char c5;
        char c6;
        char c7;
        char c8;
        char c9;
        char c10;
        char c11;
        if (i + 19 > cArr.length) {
            return null;
        }
        char c12 = cArr[i];
        char c13 = cArr[i + 1];
        char c14 = cArr[i + 2];
        char c15 = cArr[i + 3];
        char c16 = cArr[i + 4];
        char c17 = cArr[i + 5];
        char c18 = cArr[i + 6];
        char c19 = cArr[i + 7];
        char c20 = cArr[i + 8];
        char c21 = cArr[i + 9];
        char c22 = cArr[i + 10];
        char c23 = cArr[i + 11];
        char c24 = cArr[i + 12];
        char c25 = cArr[i + 13];
        char c26 = cArr[i + 14];
        char c27 = cArr[i + 15];
        char c28 = cArr[i + 16];
        char c29 = cArr[i + 17];
        char c30 = cArr[i + 18];
        if ((c16 == '-' && c19 == '-' && ((c22 == ' ' || c22 == 'T') && c25 == ':' && c28 == ':')) || (c16 == '/' && c19 == '/' && ((c22 == ' ' || c22 == 'T') && c25 == ':' && c28 == ':'))) {
            c9 = c12;
            c8 = c13;
            c7 = c14;
            c6 = c15;
            c5 = c17;
            c4 = c18;
            c3 = c20;
            c2 = c21;
        } else if (c14 == '/' && c17 == '/' && ((c22 == ' ' || c22 == 'T') && c25 == ':' && c28 == ':')) {
            c3 = c12;
            c2 = c13;
            c5 = c15;
            c4 = c16;
            c9 = c18;
            c8 = c19;
            c7 = c20;
            c6 = c21;
        } else if (c13 != ' ' || c17 != ' ' || c22 != ' ' || c25 != ':' || c28 != ':') {
            return null;
        } else {
            int t = t(c14, c15, c16);
            if (t > 0) {
                c10 = (char) ((t % 10) + 48);
                c11 = (char) ((t / 10) + 48);
            } else {
                c11 = '0';
                c10 = '0';
            }
            c2 = c12;
            c5 = c11;
            c4 = c10;
            c9 = c18;
            c8 = c19;
            c7 = c20;
            c6 = c21;
            c3 = '0';
        }
        return p(c9, c8, c7, c6, c5, c4, c3, c2, c23, c24, c26, c27, c29, c30);
    }

    public static q7h R(byte[] bArr, int i) {
        char c2;
        int i2 = i + 19;
        if (i2 > bArr.length) {
            return null;
        }
        char c3 = (char) bArr[i];
        char c4 = (char) bArr[i + 1];
        char c5 = (char) bArr[i + 2];
        char c6 = (char) bArr[i + 3];
        char c7 = (char) bArr[i + 4];
        char c8 = (char) bArr[i + 5];
        char c9 = (char) bArr[i + 6];
        char c10 = (char) bArr[i + 7];
        char c11 = (char) bArr[i + 8];
        char c12 = (char) bArr[i + 9];
        char c13 = (char) bArr[i + 10];
        char c14 = (char) bArr[i + 11];
        char c15 = (char) bArr[i + 12];
        char c16 = (char) bArr[i + 13];
        char c17 = (char) bArr[i + 14];
        char c18 = (char) bArr[i + 15];
        char c19 = (char) bArr[i + 16];
        char c20 = (char) bArr[i + 17];
        char c21 = (char) bArr[i + 18];
        char c22 = (char) bArr[i2];
        if (c5 != ' ' || c9 != ' ' || c14 != ' ' || c17 != ':' || c20 != ':') {
            return null;
        }
        int t = t(c6, c7, c8);
        char c23 = '0';
        if (t > 0) {
            c2 = (char) ((t % 10) + 48);
            c23 = (char) ((t / 10) + 48);
        } else {
            c2 = '0';
        }
        return p(c10, c11, c12, c13, c23, c2, c3, c4, c15, c16, c18, c19, c21, c22);
    }

    public static q7h S(char[] cArr, int i) {
        char c2;
        int i2 = i + 19;
        if (i2 > cArr.length) {
            return null;
        }
        char c3 = cArr[i];
        char c4 = cArr[i + 1];
        char c5 = cArr[i + 2];
        char c6 = cArr[i + 3];
        char c7 = cArr[i + 4];
        char c8 = cArr[i + 5];
        char c9 = cArr[i + 6];
        char c10 = cArr[i + 7];
        char c11 = cArr[i + 8];
        char c12 = cArr[i + 9];
        char c13 = cArr[i + 10];
        char c14 = cArr[i + 11];
        char c15 = cArr[i + 12];
        char c16 = cArr[i + 13];
        char c17 = cArr[i + 14];
        char c18 = cArr[i + 15];
        char c19 = cArr[i + 16];
        char c20 = cArr[i + 17];
        char c21 = cArr[i + 18];
        char c22 = cArr[i2];
        if (c5 != ' ' || c9 != ' ' || c14 != ' ' || c17 != ':' || c20 != ':') {
            return null;
        }
        int t = t(c6, c7, c8);
        char c23 = '0';
        if (t > 0) {
            c2 = (char) ((t % 10) + 48);
            c23 = (char) ((t / 10) + 48);
        } else {
            c2 = '0';
        }
        return p(c10, c11, c12, c13, c23, c2, c3, c4, c15, c16, c18, c19, c21, c22);
    }

    public static q7h T(byte[] bArr, int i) {
        if (i + 26 > bArr.length) {
            return null;
        }
        char c2 = (char) bArr[i];
        char c3 = (char) bArr[i + 1];
        char c4 = (char) bArr[i + 2];
        char c5 = (char) bArr[i + 3];
        char c6 = (char) bArr[i + 4];
        char c7 = (char) bArr[i + 5];
        char c8 = (char) bArr[i + 6];
        char c9 = (char) bArr[i + 7];
        char c10 = (char) bArr[i + 8];
        char c11 = (char) bArr[i + 9];
        char c12 = (char) bArr[i + 10];
        char c13 = (char) bArr[i + 11];
        char c14 = (char) bArr[i + 12];
        char c15 = (char) bArr[i + 13];
        char c16 = (char) bArr[i + 14];
        char c17 = (char) bArr[i + 15];
        char c18 = (char) bArr[i + 16];
        char c19 = (char) bArr[i + 17];
        char c20 = (char) bArr[i + 18];
        char c21 = (char) bArr[i + 19];
        char c22 = (char) bArr[i + 20];
        char c23 = (char) bArr[i + 21];
        char c24 = (char) bArr[i + 22];
        char c25 = (char) bArr[i + 23];
        char c26 = (char) bArr[i + 24];
        char c27 = (char) bArr[i + 25];
        if (c6 == '-' && c9 == '-' && ((c12 == ' ' || c12 == 'T') && c15 == ':' && c18 == ':' && c21 == '.')) {
            return q(c2, c3, c4, c5, c7, c8, c10, c11, c13, c14, c16, c17, c19, c20, c22, c23, c24, c25, c26, c27, '0', '0', '0');
        }
        return null;
    }

    public static q7h U(char[] cArr, int i) {
        if (i + 26 > cArr.length) {
            return null;
        }
        char c2 = cArr[i];
        char c3 = cArr[i + 1];
        char c4 = cArr[i + 2];
        char c5 = cArr[i + 3];
        char c6 = cArr[i + 4];
        char c7 = cArr[i + 5];
        char c8 = cArr[i + 6];
        char c9 = cArr[i + 7];
        char c10 = cArr[i + 8];
        char c11 = cArr[i + 9];
        char c12 = cArr[i + 10];
        char c13 = cArr[i + 11];
        char c14 = cArr[i + 12];
        char c15 = cArr[i + 13];
        char c16 = cArr[i + 14];
        char c17 = cArr[i + 15];
        char c18 = cArr[i + 16];
        char c19 = cArr[i + 17];
        char c20 = cArr[i + 18];
        char c21 = cArr[i + 19];
        char c22 = cArr[i + 20];
        char c23 = cArr[i + 21];
        char c24 = cArr[i + 22];
        char c25 = cArr[i + 23];
        char c26 = cArr[i + 24];
        char c27 = cArr[i + 25];
        if (c6 == '-' && c9 == '-' && ((c12 == ' ' || c12 == 'T') && c15 == ':' && c18 == ':' && c21 == '.')) {
            return q(c2, c3, c4, c5, c7, c8, c10, c11, c13, c14, c16, c17, c19, c20, c22, c23, c24, c25, c26, c27, '0', '0', '0');
        }
        return null;
    }

    public static q7h V(byte[] bArr, int i) {
        if (i + 27 > bArr.length) {
            return null;
        }
        char c2 = (char) bArr[i];
        char c3 = (char) bArr[i + 1];
        char c4 = (char) bArr[i + 2];
        char c5 = (char) bArr[i + 3];
        char c6 = (char) bArr[i + 4];
        char c7 = (char) bArr[i + 5];
        char c8 = (char) bArr[i + 6];
        char c9 = (char) bArr[i + 7];
        char c10 = (char) bArr[i + 8];
        char c11 = (char) bArr[i + 9];
        char c12 = (char) bArr[i + 10];
        char c13 = (char) bArr[i + 11];
        char c14 = (char) bArr[i + 12];
        char c15 = (char) bArr[i + 13];
        char c16 = (char) bArr[i + 14];
        char c17 = (char) bArr[i + 15];
        char c18 = (char) bArr[i + 16];
        char c19 = (char) bArr[i + 17];
        char c20 = (char) bArr[i + 18];
        char c21 = (char) bArr[i + 19];
        char c22 = (char) bArr[i + 20];
        char c23 = (char) bArr[i + 21];
        char c24 = (char) bArr[i + 22];
        char c25 = (char) bArr[i + 23];
        char c26 = (char) bArr[i + 24];
        char c27 = (char) bArr[i + 25];
        char c28 = (char) bArr[i + 26];
        if (c6 == '-' && c9 == '-' && ((c12 == ' ' || c12 == 'T') && c15 == ':' && c18 == ':' && c21 == '.')) {
            return q(c2, c3, c4, c5, c7, c8, c10, c11, c13, c14, c16, c17, c19, c20, c22, c23, c24, c25, c26, c27, c28, '0', '0');
        }
        return null;
    }

    public static q7h W(char[] cArr, int i) {
        if (i + 27 > cArr.length) {
            return null;
        }
        char c2 = cArr[i];
        char c3 = cArr[i + 1];
        char c4 = cArr[i + 2];
        char c5 = cArr[i + 3];
        char c6 = cArr[i + 4];
        char c7 = cArr[i + 5];
        char c8 = cArr[i + 6];
        char c9 = cArr[i + 7];
        char c10 = cArr[i + 8];
        char c11 = cArr[i + 9];
        char c12 = cArr[i + 10];
        char c13 = cArr[i + 11];
        char c14 = cArr[i + 12];
        char c15 = cArr[i + 13];
        char c16 = cArr[i + 14];
        char c17 = cArr[i + 15];
        char c18 = cArr[i + 16];
        char c19 = cArr[i + 17];
        char c20 = cArr[i + 18];
        char c21 = cArr[i + 19];
        char c22 = cArr[i + 20];
        char c23 = cArr[i + 21];
        char c24 = cArr[i + 22];
        char c25 = cArr[i + 23];
        char c26 = cArr[i + 24];
        char c27 = cArr[i + 25];
        char c28 = cArr[i + 26];
        if (c6 == '-' && c9 == '-' && ((c12 == ' ' || c12 == 'T') && c15 == ':' && c18 == ':' && c21 == '.')) {
            return q(c2, c3, c4, c5, c7, c8, c10, c11, c13, c14, c16, c17, c19, c20, c22, c23, c24, c25, c26, c27, c28, '0', '0');
        }
        return null;
    }

    public static q7h X(byte[] bArr, int i) {
        if (i + 28 > bArr.length) {
            return null;
        }
        char c2 = (char) bArr[i];
        char c3 = (char) bArr[i + 1];
        char c4 = (char) bArr[i + 2];
        char c5 = (char) bArr[i + 3];
        char c6 = (char) bArr[i + 4];
        char c7 = (char) bArr[i + 5];
        char c8 = (char) bArr[i + 6];
        char c9 = (char) bArr[i + 7];
        char c10 = (char) bArr[i + 8];
        char c11 = (char) bArr[i + 9];
        char c12 = (char) bArr[i + 10];
        char c13 = (char) bArr[i + 11];
        char c14 = (char) bArr[i + 12];
        char c15 = (char) bArr[i + 13];
        char c16 = (char) bArr[i + 14];
        char c17 = (char) bArr[i + 15];
        char c18 = (char) bArr[i + 16];
        char c19 = (char) bArr[i + 17];
        char c20 = (char) bArr[i + 18];
        char c21 = (char) bArr[i + 19];
        char c22 = (char) bArr[i + 20];
        char c23 = (char) bArr[i + 21];
        char c24 = (char) bArr[i + 22];
        char c25 = (char) bArr[i + 23];
        char c26 = (char) bArr[i + 24];
        char c27 = (char) bArr[i + 25];
        char c28 = (char) bArr[i + 26];
        char c29 = (char) bArr[i + 27];
        if (c6 == '-' && c9 == '-' && ((c12 == ' ' || c12 == 'T') && c15 == ':' && c18 == ':' && c21 == '.')) {
            return q(c2, c3, c4, c5, c7, c8, c10, c11, c13, c14, c16, c17, c19, c20, c22, c23, c24, c25, c26, c27, c28, c29, '0');
        }
        return null;
    }

    public static q7h Y(char[] cArr, int i) {
        if (i + 28 > cArr.length) {
            return null;
        }
        char c2 = cArr[i];
        char c3 = cArr[i + 1];
        char c4 = cArr[i + 2];
        char c5 = cArr[i + 3];
        char c6 = cArr[i + 4];
        char c7 = cArr[i + 5];
        char c8 = cArr[i + 6];
        char c9 = cArr[i + 7];
        char c10 = cArr[i + 8];
        char c11 = cArr[i + 9];
        char c12 = cArr[i + 10];
        char c13 = cArr[i + 11];
        char c14 = cArr[i + 12];
        char c15 = cArr[i + 13];
        char c16 = cArr[i + 14];
        char c17 = cArr[i + 15];
        char c18 = cArr[i + 16];
        char c19 = cArr[i + 17];
        char c20 = cArr[i + 18];
        char c21 = cArr[i + 19];
        char c22 = cArr[i + 20];
        char c23 = cArr[i + 21];
        char c24 = cArr[i + 22];
        char c25 = cArr[i + 23];
        char c26 = cArr[i + 24];
        char c27 = cArr[i + 25];
        char c28 = cArr[i + 26];
        char c29 = cArr[i + 27];
        if (c6 == '-' && c9 == '-' && ((c12 == ' ' || c12 == 'T') && c15 == ':' && c18 == ':' && c21 == '.')) {
            return q(c2, c3, c4, c5, c7, c8, c10, c11, c13, c14, c16, c17, c19, c20, c22, c23, c24, c25, c26, c27, c28, c29, '0');
        }
        return null;
    }

    public static q7h Z(byte[] bArr, int i) {
        if (i + 29 > bArr.length) {
            return null;
        }
        char c2 = (char) bArr[i];
        char c3 = (char) bArr[i + 1];
        char c4 = (char) bArr[i + 2];
        char c5 = (char) bArr[i + 3];
        char c6 = (char) bArr[i + 4];
        char c7 = (char) bArr[i + 5];
        char c8 = (char) bArr[i + 6];
        char c9 = (char) bArr[i + 7];
        char c10 = (char) bArr[i + 8];
        char c11 = (char) bArr[i + 9];
        char c12 = (char) bArr[i + 10];
        char c13 = (char) bArr[i + 11];
        char c14 = (char) bArr[i + 12];
        char c15 = (char) bArr[i + 13];
        char c16 = (char) bArr[i + 14];
        char c17 = (char) bArr[i + 15];
        char c18 = (char) bArr[i + 16];
        char c19 = (char) bArr[i + 17];
        char c20 = (char) bArr[i + 18];
        char c21 = (char) bArr[i + 19];
        char c22 = (char) bArr[i + 20];
        char c23 = (char) bArr[i + 21];
        char c24 = (char) bArr[i + 22];
        char c25 = (char) bArr[i + 23];
        char c26 = (char) bArr[i + 24];
        char c27 = (char) bArr[i + 25];
        char c28 = (char) bArr[i + 26];
        char c29 = (char) bArr[i + 27];
        char c30 = (char) bArr[i + 28];
        if (c6 == '-' && c9 == '-' && ((c12 == ' ' || c12 == 'T') && c15 == ':' && c18 == ':' && c21 == '.')) {
            return q(c2, c3, c4, c5, c7, c8, c10, c11, c13, c14, c16, c17, c19, c20, c22, c23, c24, c25, c26, c27, c28, c29, c30);
        }
        return null;
    }

    public static String a(int i, int i2, int i3, int i4, int i5, int i6, DateTimeFormatPattern dateTimeFormatPattern) {
        char c2;
        int i7 = (i / 1000) + 48;
        int i8 = ((i / 100) % 10) + 48;
        int i9 = ((i / 10) % 10) + 48;
        int i10 = (i % 10) + 48;
        int i11 = (i2 / 10) + 48;
        int i12 = (i2 % 10) + 48;
        int i13 = (i3 / 10) + 48;
        int i14 = (i3 % 10) + 48;
        int i15 = (i4 / 10) + 48;
        int i16 = (i4 % 10) + 48;
        int i17 = (i5 / 10) + 48;
        int i18 = (i5 % 10) + 48;
        int i19 = (i6 / 10) + 48;
        int i20 = (i6 % 10) + 48;
        char[] cArr = new char[19];
        char c3 = ' ';
        if (dateTimeFormatPattern == DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT) {
            cArr[0] = (char) i13;
            cArr[1] = (char) i14;
            cArr[2] = '.';
            cArr[3] = (char) i11;
            cArr[4] = (char) i12;
            cArr[5] = '.';
            cArr[6] = (char) i7;
            cArr[7] = (char) i8;
            cArr[8] = (char) i9;
            cArr[9] = (char) i10;
            cArr[10] = ' ';
        } else {
            if (dateTimeFormatPattern != DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH) {
                c3 = 'T';
            }
            if (dateTimeFormatPattern == DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH) {
                c2 = wh6.DIR;
            } else {
                c2 = '-';
            }
            cArr[0] = (char) i7;
            cArr[1] = (char) i8;
            cArr[2] = (char) i9;
            cArr[3] = (char) i10;
            cArr[4] = c2;
            cArr[5] = (char) i11;
            cArr[6] = (char) i12;
            cArr[7] = c2;
            cArr[8] = (char) i13;
            cArr[9] = (char) i14;
            cArr[10] = c3;
        }
        cArr[11] = (char) i15;
        cArr[12] = (char) i16;
        cArr[13] = f7l.CONDITION_IF_MIDDLE;
        cArr[14] = (char) i17;
        cArr[15] = (char) i18;
        cArr[16] = f7l.CONDITION_IF_MIDDLE;
        cArr[17] = (char) i19;
        cArr[18] = (char) i20;
        return new String(cArr);
    }

    public static q7h a0(char[] cArr, int i) {
        if (i + 29 > cArr.length) {
            return null;
        }
        char c2 = cArr[i];
        char c3 = cArr[i + 1];
        char c4 = cArr[i + 2];
        char c5 = cArr[i + 3];
        char c6 = cArr[i + 4];
        char c7 = cArr[i + 5];
        char c8 = cArr[i + 6];
        char c9 = cArr[i + 7];
        char c10 = cArr[i + 8];
        char c11 = cArr[i + 9];
        char c12 = cArr[i + 10];
        char c13 = cArr[i + 11];
        char c14 = cArr[i + 12];
        char c15 = cArr[i + 13];
        char c16 = cArr[i + 14];
        char c17 = cArr[i + 15];
        char c18 = cArr[i + 16];
        char c19 = cArr[i + 17];
        char c20 = cArr[i + 18];
        char c21 = cArr[i + 19];
        char c22 = cArr[i + 20];
        char c23 = cArr[i + 21];
        char c24 = cArr[i + 22];
        char c25 = cArr[i + 23];
        char c26 = cArr[i + 24];
        char c27 = cArr[i + 25];
        char c28 = cArr[i + 26];
        char c29 = cArr[i + 27];
        char c30 = cArr[i + 28];
        if (c6 == '-' && c9 == '-' && ((c12 == ' ' || c12 == 'T') && c15 == ':' && c18 == ':' && c21 == '.')) {
            return q(c2, c3, c4, c5, c7, c8, c10, c11, c13, c14, c16, c17, c19, c20, c22, c23, c24, c25, c26, c27, c28, c29, c30);
        }
        return null;
    }

    public static String b(int i, int i2, int i3, DateTimeFormatPattern dateTimeFormatPattern) {
        char c2;
        int i4 = (i / 1000) + 48;
        int i5 = ((i / 100) % 10) + 48;
        int i6 = ((i / 10) % 10) + 48;
        int i7 = (i % 10) + 48;
        int i8 = (i2 / 10) + 48;
        int i9 = (i2 % 10) + 48;
        int i10 = (i3 / 10) + 48;
        int i11 = (i3 % 10) + 48;
        char[] cArr = new char[10];
        if (dateTimeFormatPattern == DateTimeFormatPattern.DATE_FORMAT_10_DOT) {
            cArr[0] = (char) i10;
            cArr[1] = (char) i11;
            cArr[2] = '.';
            cArr[3] = (char) i8;
            cArr[4] = (char) i9;
            cArr[5] = '.';
            cArr[6] = (char) i4;
            cArr[7] = (char) i5;
            cArr[8] = (char) i6;
            cArr[9] = (char) i7;
        } else {
            if (dateTimeFormatPattern == DateTimeFormatPattern.DATE_FORMAT_10_DASH) {
                c2 = '-';
            } else {
                c2 = wh6.DIR;
            }
            cArr[0] = (char) i4;
            cArr[1] = (char) i5;
            cArr[2] = (char) i6;
            cArr[3] = (char) i7;
            cArr[4] = c2;
            cArr[5] = (char) i8;
            cArr[6] = (char) i9;
            cArr[7] = c2;
            cArr[8] = (char) i10;
            cArr[9] = (char) i11;
        }
        return new String(cArr);
    }

    public static q7h b0(byte[] bArr, int i, int i2) {
        char c2;
        char c3;
        char c4;
        char c5;
        char c6;
        char c7;
        char c8;
        char c9;
        char c10;
        if (bArr == null || i2 == 0 || i2 < 21 || i2 > 29) {
            return null;
        }
        char c11 = (char) bArr[i];
        char c12 = (char) bArr[i + 1];
        char c13 = (char) bArr[i + 2];
        char c14 = (char) bArr[i + 3];
        char c15 = (char) bArr[i + 4];
        char c16 = (char) bArr[i + 5];
        char c17 = (char) bArr[i + 6];
        char c18 = (char) bArr[i + 7];
        char c19 = (char) bArr[i + 8];
        char c20 = (char) bArr[i + 9];
        char c21 = (char) bArr[i + 10];
        char c22 = (char) bArr[i + 11];
        char c23 = (char) bArr[i + 12];
        char c24 = (char) bArr[i + 13];
        char c25 = (char) bArr[i + 14];
        char c26 = (char) bArr[i + 15];
        char c27 = (char) bArr[i + 16];
        char c28 = (char) bArr[i + 17];
        char c29 = (char) bArr[i + 18];
        char c30 = (char) bArr[i + 19];
        switch (i2) {
            case 21:
                c10 = (char) bArr[i + 20];
                c2 = '0';
                c9 = '0';
                c8 = '0';
                c7 = '0';
                c6 = '0';
                c5 = '0';
                c4 = '0';
                c3 = '0';
                break;
            case 22:
                char c31 = (char) bArr[i + 20];
                c8 = (char) bArr[i + 21];
                c10 = c31;
                c2 = '0';
                c9 = '0';
                c7 = '0';
                c6 = '0';
                c5 = '0';
                c4 = '0';
                c3 = '0';
                break;
            case 23:
                char c32 = (char) bArr[i + 20];
                c8 = (char) bArr[i + 21];
                c7 = (char) bArr[i + 22];
                c10 = c32;
                c2 = '0';
                c9 = '0';
                c6 = '0';
                c5 = '0';
                c4 = '0';
                c3 = '0';
                break;
            case 24:
                char c33 = (char) bArr[i + 20];
                c8 = (char) bArr[i + 21];
                c7 = (char) bArr[i + 22];
                c6 = (char) bArr[i + 23];
                c10 = c33;
                c2 = '0';
                c9 = '0';
                c5 = '0';
                c4 = '0';
                c3 = '0';
                break;
            case 25:
                char c34 = (char) bArr[i + 20];
                c8 = (char) bArr[i + 21];
                c7 = (char) bArr[i + 22];
                c6 = (char) bArr[i + 23];
                c5 = (char) bArr[i + 24];
                c10 = c34;
                c2 = '0';
                c9 = '0';
                c4 = '0';
                c3 = '0';
                break;
            case 26:
                char c35 = (char) bArr[i + 20];
                c8 = (char) bArr[i + 21];
                c7 = (char) bArr[i + 22];
                c6 = (char) bArr[i + 23];
                c5 = (char) bArr[i + 24];
                c4 = (char) bArr[i + 25];
                c10 = c35;
                c2 = '0';
                c9 = '0';
                c3 = '0';
                break;
            case 27:
                char c36 = (char) bArr[i + 20];
                c8 = (char) bArr[i + 21];
                c7 = (char) bArr[i + 22];
                c6 = (char) bArr[i + 23];
                c5 = (char) bArr[i + 24];
                c4 = (char) bArr[i + 25];
                c10 = c36;
                c2 = '0';
                c3 = '0';
                c9 = (char) bArr[i + 26];
                break;
            case 28:
                char c37 = (char) bArr[i + 20];
                c8 = (char) bArr[i + 21];
                c7 = (char) bArr[i + 22];
                c6 = (char) bArr[i + 23];
                c5 = (char) bArr[i + 24];
                c4 = (char) bArr[i + 25];
                char c38 = (char) bArr[i + 26];
                c2 = (char) bArr[i + 27];
                c10 = c37;
                c3 = '0';
                c9 = c38;
                break;
            default:
                c10 = (char) bArr[i + 20];
                char c39 = (char) bArr[i + 21];
                char c40 = (char) bArr[i + 22];
                char c41 = (char) bArr[i + 23];
                char c42 = (char) bArr[i + 24];
                char c43 = (char) bArr[i + 25];
                char c44 = (char) bArr[i + 26];
                char c45 = (char) bArr[i + 27];
                c3 = (char) bArr[i + 28];
                c2 = c45;
                c4 = c43;
                c6 = c41;
                c7 = c40;
                c8 = c39;
                c9 = c44;
                c5 = c42;
                break;
        }
        if (c15 == '-' && c18 == '-' && ((c21 == ' ' || c21 == 'T') && c24 == ':' && c27 == ':' && c30 == '.')) {
            return q(c11, c12, c13, c14, c16, c17, c19, c20, c22, c23, c25, c26, c28, c29, c10, c8, c7, c6, c5, c4, c9, c2, c3);
        }
        return null;
    }

    public static q7h c0(char[] cArr, int i, int i2) {
        char c2;
        char c3;
        char c4;
        char c5;
        char c6;
        char c7;
        char c8;
        char c9;
        if (cArr == null || i2 == 0 || i2 < 21 || i2 > 29) {
            return null;
        }
        char c10 = cArr[i];
        char c11 = cArr[i + 1];
        char c12 = cArr[i + 2];
        char c13 = cArr[i + 3];
        char c14 = cArr[i + 4];
        char c15 = cArr[i + 5];
        char c16 = cArr[i + 6];
        char c17 = cArr[i + 7];
        char c18 = cArr[i + 8];
        char c19 = cArr[i + 9];
        char c20 = cArr[i + 10];
        char c21 = cArr[i + 11];
        char c22 = cArr[i + 12];
        char c23 = cArr[i + 13];
        char c24 = cArr[i + 14];
        char c25 = cArr[i + 15];
        char c26 = cArr[i + 16];
        char c27 = cArr[i + 17];
        char c28 = cArr[i + 18];
        char c29 = cArr[i + 19];
        char c30 = '0';
        switch (i2) {
            case 21:
                c2 = cArr[i + 20];
                c9 = '0';
                c8 = '0';
                c7 = '0';
                c6 = '0';
                c5 = '0';
                c4 = '0';
                c3 = '0';
                break;
            case 22:
                char c31 = cArr[i + 20];
                c9 = cArr[i + 21];
                c2 = c31;
                c8 = '0';
                c7 = '0';
                c6 = '0';
                c5 = '0';
                c4 = '0';
                c3 = '0';
                break;
            case 23:
                char c32 = cArr[i + 20];
                c9 = cArr[i + 21];
                c8 = cArr[i + 22];
                c2 = c32;
                c7 = '0';
                c6 = '0';
                c5 = '0';
                c4 = '0';
                c3 = '0';
                break;
            case 24:
                char c33 = cArr[i + 20];
                c9 = cArr[i + 21];
                c8 = cArr[i + 22];
                c7 = cArr[i + 23];
                c2 = c33;
                c6 = '0';
                c5 = '0';
                c4 = '0';
                c3 = '0';
                break;
            case 25:
                char c34 = cArr[i + 20];
                c9 = cArr[i + 21];
                c8 = cArr[i + 22];
                c7 = cArr[i + 23];
                char c35 = cArr[i + 24];
                c2 = c34;
                c30 = c35;
                c6 = '0';
                c5 = '0';
                c4 = '0';
                c3 = '0';
                break;
            case 26:
                char c36 = cArr[i + 20];
                c9 = cArr[i + 21];
                c8 = cArr[i + 22];
                c7 = cArr[i + 23];
                char c37 = cArr[i + 24];
                c5 = cArr[i + 25];
                c2 = c36;
                c30 = c37;
                c6 = '0';
                c4 = '0';
                c3 = '0';
                break;
            case 27:
                char c38 = cArr[i + 20];
                c9 = cArr[i + 21];
                c8 = cArr[i + 22];
                c7 = cArr[i + 23];
                char c39 = cArr[i + 24];
                c5 = cArr[i + 25];
                c4 = cArr[i + 26];
                c2 = c38;
                c30 = c39;
                c6 = '0';
                c3 = '0';
                break;
            case 28:
                char c40 = cArr[i + 20];
                c9 = cArr[i + 21];
                c8 = cArr[i + 22];
                c7 = cArr[i + 23];
                char c41 = cArr[i + 24];
                c5 = cArr[i + 25];
                c4 = cArr[i + 26];
                c3 = cArr[i + 27];
                c2 = c40;
                c30 = c41;
                c6 = '0';
                break;
            default:
                char c42 = cArr[i + 20];
                c9 = cArr[i + 21];
                char c43 = cArr[i + 22];
                char c44 = cArr[i + 23];
                char c45 = cArr[i + 24];
                char c46 = cArr[i + 25];
                char c47 = cArr[i + 26];
                char c48 = cArr[i + 27];
                char c49 = cArr[i + 28];
                c2 = c42;
                c8 = c43;
                c30 = c45;
                c7 = c44;
                c5 = c46;
                c6 = c49;
                c3 = c48;
                c4 = c47;
                break;
        }
        if (c14 == '-' && c17 == '-' && ((c20 == ' ' || c20 == 'T') && c23 == ':' && c26 == ':' && c29 == '.')) {
            return q(c10, c11, c12, c13, c15, c16, c18, c19, c21, c22, c24, c25, c27, c28, c2, c9, c8, c7, c30, c5, c4, c3, c6);
        }
        return null;
    }

    public static String d(x9h x9hVar) {
        if (x9hVar == null) {
            return null;
        }
        int[] iArr = b2d.DIGITS_K;
        int i = iArr[x9hVar.f31233a];
        int i2 = iArr[x9hVar.b];
        int i3 = iArr[x9hVar.c];
        return new String(new char[]{(char) ((byte) (i >> 8)), (char) ((byte) i), (char) ((byte) (i2 >> 8)), (char) ((byte) i2), (char) ((byte) (i3 >> 8)), (char) ((byte) i3)});
    }

    public static x9h d0(String str, int i) {
        if (i + 6 > str.length()) {
            return null;
        }
        char charAt = str.charAt(i);
        char charAt2 = str.charAt(i + 1);
        char charAt3 = str.charAt(i + 2);
        char charAt4 = str.charAt(i + 3);
        char charAt5 = str.charAt(i + 4);
        char charAt6 = str.charAt(i + 5);
        if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
            int i2 = ((charAt - '0') * 10) + (charAt2 - '0');
            if (charAt3 >= '0' && charAt3 <= '9' && charAt4 >= '0' && charAt4 <= '9') {
                int i3 = ((charAt3 - '0') * 10) + (charAt4 - '0');
                if (charAt5 >= '0' && charAt5 <= '9' && charAt6 >= '0' && charAt6 <= '9') {
                    return x9h.b(i2, i3, ((charAt5 - '0') * 10) + (charAt6 - '0'));
                }
            }
        }
        return null;
    }

    public static String e(x9h x9hVar) {
        if (x9hVar == null) {
            return null;
        }
        int[] iArr = b2d.DIGITS_K;
        int i = iArr[x9hVar.f31233a];
        int i2 = iArr[x9hVar.b];
        int i3 = iArr[x9hVar.c];
        return new String(new char[]{(char) ((byte) (i >> 8)), (char) ((byte) i), f7l.CONDITION_IF_MIDDLE, (char) ((byte) (i2 >> 8)), (char) ((byte) i2), f7l.CONDITION_IF_MIDDLE, (char) ((byte) (i3 >> 8)), (char) ((byte) i3)});
    }

    public static x9h e0(byte[] bArr, int i) {
        if (i + 8 > bArr.length) {
            return null;
        }
        byte b2 = bArr[i];
        byte b3 = bArr[i + 1];
        byte b4 = bArr[i + 2];
        byte b5 = bArr[i + 3];
        byte b6 = bArr[i + 4];
        byte b7 = bArr[i + 5];
        byte b8 = bArr[i + 6];
        byte b9 = bArr[i + 7];
        if (b4 == 58 && b7 == 58 && b2 >= 48 && b2 <= 57 && b3 >= 48 && b3 <= 57) {
            int i2 = ((b2 - 48) * 10) + (b3 - 48);
            if (b5 >= 48 && b5 <= 57 && b6 >= 48 && b6 <= 57) {
                int i3 = ((b5 - 48) * 10) + (b6 - 48);
                if (b8 >= 48 && b8 <= 57 && b9 >= 48 && b9 <= 57) {
                    return x9h.b(i2, i3, ((b8 - 48) * 10) + (b9 - 48));
                }
            }
        }
        return null;
    }

    public static String f(long j, wqx wqxVar) {
        wqx wqxVar2;
        int i;
        long j2;
        String str;
        if (wqxVar == null) {
            wqxVar2 = wqx.d;
        } else {
            wqxVar2 = wqxVar;
        }
        long e2 = b2d.e(j, 1000L);
        if (wqx.SHANGHAI_ZONE_ID.equals(wqxVar2)) {
            i = m(e2);
        } else {
            i = wqxVar2.a(vcf.d(j));
        }
        long e3 = b2d.e(e2 + i, 86400L);
        int i2 = (int) ((e3 - e) + 128);
        String[] strArr = b.f2475a;
        if (i2 >= 0 && i2 < 1024 && (str = strArr[i2]) != null) {
            return str;
        }
        long j3 = 719468 + e3;
        if (j3 < 0) {
            long j4 = ((e3 + 719469) / 146097) - 1;
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
        int i3 = (int) j6;
        int i4 = ((i3 * 5) + 2) / 153;
        int i5 = ((i4 + 2) % 12) + 1;
        int i6 = (i3 - (((i4 * 306) + 5) / 10)) + 1;
        long j7 = j5 + j2 + (i4 / 10);
        if (j7 < -999999999 || j7 > 999999999) {
            throw new DateTimeException("Invalid year " + j7);
        }
        int i7 = (int) j7;
        String str2 = new String(new char[]{(char) ((i7 / 1000) + 48), (char) (((i7 / 100) % 10) + 48), (char) (((i7 / 10) % 10) + 48), (char) ((i7 % 10) + 48), '-', (char) ((i5 / 10) + 48), (char) ((i5 % 10) + 48), '-', (char) ((i6 / 10) + 48), (char) ((i6 % 10) + 48)});
        if (i2 >= 0 && i2 < 1024) {
            strArr[i2] = str2;
        }
        return str2;
    }

    public static long f0(String str, wqx wqxVar) {
        if (str == null) {
            return 0L;
        }
        char[] charArray = str.toCharArray();
        return g0(charArray, 0, charArray.length, wqxVar);
    }

    public static String g(p7h p7hVar) {
        if (p7hVar == null) {
            return null;
        }
        int i = p7hVar.f25919a;
        short s = p7hVar.b;
        short s2 = p7hVar.c;
        return new String(new char[]{(char) ((i / 1000) + 48), (char) (((i / 100) % 10) + 48), (char) (((i / 10) % 10) + 48), (char) ((i % 10) + 48), '-', (char) ((s / 10) + 48), (char) ((s % 10) + 48), '-', (char) ((s2 / 10) + 48), (char) ((s2 % 10) + 48)});
    }

    public static long g0(char[] cArr, int i, int i2, wqx wqxVar) {
        char c2;
        wqx wqxVar2 = wqxVar;
        if (cArr == null || i2 == 0) {
            return 0L;
        }
        if (i2 == 4 && cArr[i] == 'n' && cArr[i + 1] == 'u' && cArr[i + 2] == 'l' && cArr[i + 3] == 'l') {
            return 0L;
        }
        char c3 = cArr[i];
        if (c3 == '\"' && cArr[i2 - 1] == '\"') {
            JSONReader M1 = JSONReader.M1(cArr, i, i2);
            try {
                long time = ((Date) fek.INSTANCE.o(M1, null, null, 0L)).getTime();
                ((i) M1).close();
                return time;
            } catch (Throwable th) {
                try {
                    ((i) M1).close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else if (i2 == 19) {
            return l0(cArr, i, wqxVar2);
        } else {
            if (i2 > 19 || (i2 == 16 && ((c2 = cArr[i + 10]) == '+' || c2 == '-'))) {
                xqx r0 = r0(cArr, i, i2, wqxVar);
                if (r0 != null) {
                    return r0.f();
                }
                String str = new String(cArr, i, i2 - i);
                throw new DateTimeException("illegal input ".concat(str), str, 0);
            } else if ((c3 == '-' || (c3 >= '0' && c3 <= '9')) && b2d.i(cArr, i, i2)) {
                long z = TypeUtils.z(cArr, i, i2);
                if (i2 == 8 && z >= 19700101 && z <= 21000101) {
                    return xqx.e(q7h.f(A(cArr, 0), x9h.MIN), wqxVar2).f();
                }
                if (i2 == 12 && z >= 197001010000L && z <= 210001010000L) {
                    return xqx.e(G(cArr, 0), wqxVar2).f();
                }
                if (i2 != 14 || z < 19700101000000L || z > 21000101000000L) {
                    return z;
                }
                return xqx.e(I(cArr, 0), wqxVar2).f();
            } else {
                if (cArr[i2 - 1] == 'Z') {
                    wqxVar2 = wqx.e;
                }
                q7h E = E(cArr, i, i2);
                if (E == null && cArr[i] == '0' && cArr[i + 1] == '0' && cArr[i + 2] == '0' && cArr[i + 3] == '0' && cArr[i + 4] == '-' && cArr[i + 5] == '0' && cArr[i + 6] == '0' && cArr[i + 7] == '-' && cArr[i + 8] == '0' && cArr[i + 9] == '0') {
                    E = q7h.d(1970, 1, 1, 0, 0, 0);
                }
                if (E != null) {
                    long g = xqx.e(E, wqxVar2).g();
                    int i3 = E.b.d;
                    if (g >= 0 || i3 <= 0) {
                        return (i3 / 1000000) + (g * 1000);
                    }
                    return (((g + 1) * 1000) + (i3 / 1000000)) - 1000;
                }
                String str2 = new String(cArr, i, i2 - i);
                throw new DateTimeException("illegal input ".concat(str2), str2, 0);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String h(int i, int i2, int i3) {
        int i4 = i / 1000;
        int[] iArr = b2d.DIGITS_K;
        int i5 = iArr[i - (i4 * 1000)];
        char c2 = (char) ((byte) (i4 + 48));
        char c3 = (char) ((byte) (i5 >> 16));
        char c4 = (char) ((byte) (i5 >> 8));
        char c5 = (char) ((byte) i5);
        char c6 = 'r';
        char c7 = 'M';
        char c8 = 'p';
        switch (i2) {
            case 1:
                c6 = 'n';
                c7 = 'J';
                c8 = 'a';
                break;
            case 2:
                c7 = 'F';
                c6 = 'b';
                c8 = 'e';
                break;
            case 3:
                c8 = 'a';
                break;
            case 4:
                c7 = 'A';
                break;
            case 5:
                c6 = 'y';
                c8 = 'a';
                break;
            case 6:
                c6 = 'n';
                c7 = 'J';
                c8 = 'u';
                break;
            case 7:
                c6 = 'l';
                c7 = 'J';
                c8 = 'u';
                break;
            case 8:
                c6 = 'g';
                c7 = 'A';
                c8 = 'u';
                break;
            case 9:
                c7 = 'S';
                c6 = 'p';
                c8 = 'e';
                break;
            case 10:
                c7 = 'O';
                c6 = 't';
                c8 = 'c';
                break;
            case 11:
                c7 = 'N';
                c8 = 'o';
                c6 = 'v';
                break;
            case 12:
                c7 = ohh.LEVEL_D;
                c6 = 'c';
                c8 = 'e';
                break;
            default:
                throw new JSONException("illegal month " + i2);
        }
        int i6 = iArr[i3];
        return new String(new char[]{c2, c3, c4, c5, '-', c7, c8, c6, '-', (char) ((byte) (i6 >> 8)), (char) ((byte) i6)});
    }

    public static String i(int i, int i2, int i3) {
        char[] cArr = new char[10];
        int i4 = i / 1000;
        int[] iArr = b2d.DIGITS_K;
        int i5 = iArr[i - (i4 * 1000)];
        cArr[0] = (char) ((byte) (i4 + 48));
        cArr[1] = (char) ((byte) (i5 >> 16));
        cArr[2] = (char) ((byte) (i5 >> 8));
        cArr[3] = (char) ((byte) i5);
        cArr[4] = '-';
        int i6 = 7;
        if (i2 < 10) {
            cArr[5] = (char) (i2 + 48);
            cArr[6] = '-';
        } else {
            int i7 = iArr[i2];
            cArr[5] = (char) ((byte) (i7 >> 8));
            cArr[6] = (char) ((byte) i7);
            cArr[7] = '-';
            i6 = 8;
        }
        int i8 = iArr[i3];
        cArr[i6] = (char) ((byte) (i8 >> 8));
        cArr[i6 + 1] = (char) ((byte) i8);
        return new String(cArr, 0, i6 + 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00df, code lost:
        if (r1 == ':') goto L_0x00e1;
     */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long i0(java.lang.String r22, tb.wqx r23) {
        /*
            Method dump skipped, instructions count: 932
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.i0(java.lang.String, tb.wqx):long");
    }

    public static String j(Date date, wqx wqxVar) {
        wqx wqxVar2;
        int i;
        long j;
        if (date == null) {
            return null;
        }
        long time = date.getTime();
        if (wqxVar == null) {
            wqxVar2 = wqx.d;
        } else {
            wqxVar2 = wqxVar;
        }
        long e2 = b2d.e(time, 1000L);
        if (!wqx.SHANGHAI_ZONE_ID.equals(wqxVar2) || e2 <= 684900000) {
            i = wqxVar2.a(vcf.d(time));
        } else {
            i = 28800;
        }
        long j2 = e2 + i;
        long e3 = b2d.e(j2, 86400L);
        int f = (int) b2d.f(j2, 86400L);
        long j3 = 719468 + e3;
        if (j3 < 0) {
            long j4 = ((e3 + 719469) / 146097) - 1;
            j = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((((j5 * 365) + (j5 / 4)) - (j5 / 100)) + (j5 / 400));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((((365 * j5) + (j5 / 4)) - (j5 / 100)) + (j5 / 400));
        }
        int i2 = (int) j6;
        int i3 = ((i2 * 5) + 2) / 153;
        int i4 = ((i3 + 2) % 12) + 1;
        int i5 = (i2 - (((i3 * 306) + 5) / 10)) + 1;
        long j7 = j5 + j + (i3 / 10);
        if (j7 < -999999999 || j7 > 999999999) {
            throw new JSONException("Invalid year " + j7);
        }
        int i6 = (int) j7;
        long j8 = f;
        if (j8 < 0 || j8 > 86399) {
            throw new JSONException("Invalid secondOfDay " + j8);
        }
        int i7 = (int) (j8 / 3600);
        long j9 = j8 - (i7 * ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT);
        int i8 = (int) (j9 / 60);
        int i9 = (int) (j9 - (i8 * 60));
        return new String(new char[]{(char) ((i6 / 1000) + 48), (char) (((i6 / 100) % 10) + 48), (char) (((i6 / 10) % 10) + 48), (char) ((i6 % 10) + 48), '-', (char) ((i4 / 10) + 48), (char) ((i4 % 10) + 48), '-', (char) ((i5 / 10) + 48), (char) ((i5 % 10) + 48), ' ', (char) ((i7 / 10) + 48), (char) ((i7 % 10) + 48), f7l.CONDITION_IF_MIDDLE, (char) ((i8 / 10) + 48), (char) ((i8 % 10) + 48), f7l.CONDITION_IF_MIDDLE, (char) ((i9 / 10) + 48), (char) ((i9 % 10) + 48)});
    }

    public static String k(q7h q7hVar) {
        if (q7hVar == null) {
            return null;
        }
        p7h p7hVar = q7hVar.f26561a;
        int i = p7hVar.f25919a;
        short s = p7hVar.b;
        short s2 = p7hVar.c;
        x9h x9hVar = q7hVar.b;
        return a(i, s, s2, x9hVar.f31233a, x9hVar.b, x9hVar.c, DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d7, code lost:
        if (r10 == ':') goto L_0x00d9;
     */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long k0(byte[] r23, int r24, tb.wqx r25) {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.k0(byte[], int, tb.wqx):long");
    }

    public static String l(q7h q7hVar) {
        if (q7hVar == null) {
            return null;
        }
        p7h p7hVar = q7hVar.f26561a;
        int i = p7hVar.f25919a;
        short s = p7hVar.b;
        short s2 = p7hVar.c;
        x9h x9hVar = q7hVar.b;
        byte b2 = x9hVar.f31233a;
        byte b3 = x9hVar.b;
        byte b4 = x9hVar.c;
        int i2 = x9hVar.d;
        char c2 = (char) ((b3 / 10) + 48);
        char c3 = (char) ((b3 % 10) + 48);
        char c4 = (char) ((b4 / 10) + 48);
        char c5 = (char) ((b4 % 10) + 48);
        int i3 = i2 / 1000;
        int i4 = i3 / 1000;
        int i5 = i2 - (i3 * 1000);
        int[] iArr = b2d.DIGITS_K;
        int i6 = iArr[i4];
        char c6 = (char) ((byte) (i6 >> 16));
        int i7 = iArr[i3 - (i4 * 1000)];
        char c7 = (char) ((byte) (i7 >> 16));
        int i8 = iArr[i5];
        return new String(new char[]{(char) ((i / 1000) + 48), (char) (((i / 100) % 10) + 48), (char) (((i / 10) % 10) + 48), (char) ((i % 10) + 48), '-', (char) ((s / 10) + 48), (char) ((s % 10) + 48), '-', (char) ((s2 / 10) + 48), (char) ((s2 % 10) + 48), ' ', (char) ((b2 / 10) + 48), (char) ((b2 % 10) + 48), f7l.CONDITION_IF_MIDDLE, c2, c3, f7l.CONDITION_IF_MIDDLE, c4, c5, '.', c6, (char) ((byte) (i6 >> 8)), (char) ((byte) i6), c7, (char) ((byte) (i7 >> 8)), (char) ((byte) i7), (char) ((byte) (i8 >> 16)), (char) ((byte) (i8 >> 8)), (char) ((byte) i8)});
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c5, code lost:
        if (r10 == ':') goto L_0x00c7;
     */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long l0(char[] r31, int r32, tb.wqx r33) {
        /*
            Method dump skipped, instructions count: 1017
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.l0(char[], int, tb.wqx):long");
    }

    public static int m(long j) {
        if (j >= 684900000) {
            return 28800;
        }
        if (j < 671598000) {
            if (j >= 653450400) {
                return 28800;
            }
            if (j < 640148400) {
                if (j >= 622000800) {
                    return 28800;
                }
                if (j < 608698800) {
                    if (j >= 589946400) {
                        return 28800;
                    }
                    if (j < 577249200) {
                        if (j >= 558496800) {
                            return 28800;
                        }
                        if (j < 545194800) {
                            if (j >= 527047200) {
                                return 28800;
                            }
                            if (j < 515559600) {
                                if (j >= -649987200) {
                                    return 28800;
                                }
                                if (j < -652316400) {
                                    if (j >= -670636800) {
                                        return 28800;
                                    }
                                    if (j < -683852400) {
                                        if (j >= -699580800) {
                                            return 28800;
                                        }
                                        if (j < -716857200) {
                                            if (j >= -733795200) {
                                                return 28800;
                                            }
                                            if (j < -745801200) {
                                                if (j >= -767836800) {
                                                    return 28800;
                                                }
                                                if (j < -881017200) {
                                                    if (j >= -888796800) {
                                                        return 28800;
                                                    }
                                                    if (j < -908838000) {
                                                        if (j >= -922060800) {
                                                            return 28800;
                                                        }
                                                        if (j < -933634800) {
                                                            if (j >= -1585872000) {
                                                                return 28800;
                                                            }
                                                            if (j < -1600642800) {
                                                                if (j >= -2177452800L) {
                                                                    return 28800;
                                                                }
                                                                return 29143;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return 32400;
    }

    public static wqx n(String str, wqx wqxVar) {
        int indexOf;
        char charAt;
        if (str != null) {
            char c2 = 65535;
            switch (str.hashCode()) {
                case 47664:
                    if (str.equals("000")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 67044:
                    if (str.equals("CST")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 1277108071:
                    if (str.equals(wqx.OFFSET_8_ZONE_ID_NAME)) {
                        c2 = 2;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    return wqx.e;
                case 1:
                    return wqx.SHANGHAI_ZONE_ID;
                case 2:
                    return wqx.OFFSET_8_ZONE_ID;
                default:
                    if (str.length() > 0 && (((charAt = str.charAt(0)) == '+' || charAt == '-') && str.charAt(str.length() - 1) != ']')) {
                        return wqx.c(str);
                    }
                    int indexOf2 = str.indexOf(91);
                    if (indexOf2 <= 0 || (indexOf = str.indexOf(93, indexOf2)) <= 0) {
                        return wqx.c(str);
                    }
                    return wqx.c(str.substring(indexOf2 + 1, indexOf));
            }
        } else if (wqxVar != null) {
            return wqxVar;
        } else {
            return wqx.d;
        }
    }

    public static long n0(String str, wqx wqxVar) {
        int i;
        wqx wqxVar2;
        int i2;
        if (str == null) {
            return 0L;
        }
        if (str.length() == 19) {
            char charAt = str.charAt(0);
            char charAt2 = str.charAt(1);
            char charAt3 = str.charAt(2);
            char charAt4 = str.charAt(3);
            char charAt5 = str.charAt(4);
            char charAt6 = str.charAt(5);
            char charAt7 = str.charAt(6);
            char charAt8 = str.charAt(7);
            char charAt9 = str.charAt(8);
            char charAt10 = str.charAt(9);
            char charAt11 = str.charAt(10);
            char charAt12 = str.charAt(11);
            char charAt13 = str.charAt(12);
            char charAt14 = str.charAt(13);
            char charAt15 = str.charAt(14);
            char charAt16 = str.charAt(15);
            char charAt17 = str.charAt(16);
            char charAt18 = str.charAt(17);
            char charAt19 = str.charAt(18);
            if (charAt5 != '-' || charAt8 != '-' || charAt11 != ' ' || charAt14 != ':' || charAt17 != ':') {
                throw new DateTimeException("illegal input", str, 0);
            } else if (charAt < '0' || charAt > '9' || charAt2 < '0' || charAt2 > '9' || charAt3 < '0' || charAt3 > '9' || charAt4 < '0' || charAt4 > '9') {
                throw new DateTimeException("illegal input", str, 0);
            } else {
                int i3 = ((charAt - '0') * 1000) + ((charAt2 - '0') * 100) + ((charAt3 - '0') * 10) + (charAt4 - '0');
                if (charAt6 < '0' || charAt6 > '9' || charAt7 < '0' || charAt7 > '9') {
                    throw new DateTimeException("illegal input", str, 0);
                }
                int i4 = ((charAt6 - '0') * 10) + (charAt7 - '0');
                if ((i4 == 0 && i3 != 0) || i4 > 12) {
                    throw new DateTimeException("illegal input", str, 0);
                } else if (charAt9 < '0' || charAt9 > '9' || charAt10 < '0' || charAt10 > '9') {
                    throw new DateTimeException("illegal input", str, 0);
                } else {
                    int i5 = ((charAt9 - '0') * 10) + (charAt10 - '0');
                    if (i4 != 2) {
                        if (i4 == 4 || i4 == 6 || i4 == 9 || i4 == 11) {
                            i = 30;
                        } else {
                            i = 31;
                        }
                    } else if ((i3 & 3) != 0 || (i3 % 100 == 0 && i3 % 400 != 0)) {
                        i = 28;
                    } else {
                        i = 29;
                    }
                    if ((i5 == 0 && i3 != 0) || i5 > i) {
                        throw new DateTimeException("illegal input", str, 0);
                    } else if (charAt12 < '0' || charAt12 > '9' || charAt13 < '0' || charAt13 > '9') {
                        throw new DateTimeException("illegal input", str, 0);
                    } else {
                        int i6 = ((charAt12 - '0') * 10) + (charAt13 - '0');
                        if (charAt15 < '0' || charAt15 > '9' || charAt16 < '0' || charAt16 > '9') {
                            throw new DateTimeException("illegal input", str, 0);
                        }
                        int i7 = ((charAt15 - '0') * 10) + (charAt16 - '0');
                        if (charAt18 < '0' || charAt18 > '9' || charAt19 < '0' || charAt19 > '9') {
                            throw new DateTimeException("illegal input", str, 0);
                        }
                        int i8 = ((charAt18 - '0') * 10) + (charAt19 - '0');
                        if (i3 == 0 && i4 == 0 && i5 == 0) {
                            i3 = 1970;
                            i4 = 1;
                            i5 = 1;
                        }
                        long j = (i3 * yh6.DEFAULT_EXPIRED_TIME) + (((i3 + 3) / 4) - ((i3 + 99) / 100)) + ((i3 + SecExceptionCode.SEC_ERROR_STA_UNKNOWN_ERROR) / 400) + (((i4 * 367) + AConstants.ArtcErrorAudioDeviceStartPlayoutError) / 12) + (i5 - 1);
                        if (i4 > 2) {
                            long j2 = j - 1;
                            if ((i3 & 3) != 0 || (i3 % 100 == 0 && i3 % 400 != 0)) {
                                j -= 2;
                            } else {
                                j = j2;
                            }
                        }
                        long j3 = ((j - 719528) * 86400) + (i6 * ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT) + (i7 * 60) + i8;
                        if (wqxVar == null) {
                            wqxVar2 = wqx.d;
                        } else {
                            wqxVar2 = wqxVar;
                        }
                        if (wqx.SHANGHAI_ZONE_ID.equals(wqxVar2) && j3 >= 684900000) {
                            i2 = 28800;
                        } else if (wqxVar2 == wqx.e || pg1.ATOM_EXT_UTC.equals(wqxVar2.b)) {
                            i2 = 0;
                        } else {
                            i2 = wqxVar2.b(q7h.f(p7h.e(i3, i4, i5), x9h.c(i6, i7, i8, 0)));
                        }
                        return (j3 - i2) * 1000;
                    }
                }
            }
        } else {
            throw new DateTimeException("illegal input ".concat(str), str, 0);
        }
    }

    public static int o(char c2, char c3) {
        if (c2 != '0') {
            if (c2 == '1') {
                switch (c3) {
                    case '0':
                        c2 = '2';
                        c3 = '2';
                        break;
                    case '1':
                        c2 = '2';
                        c3 = '3';
                        break;
                    case '2':
                        c2 = '2';
                        c3 = '4';
                        break;
                }
            }
        } else {
            switch (c3) {
                case '0':
                    c2 = '1';
                    c3 = '2';
                    break;
                case '1':
                    c2 = '1';
                    c3 = '3';
                    break;
                case '2':
                    c2 = '1';
                    c3 = '4';
                    break;
                case '3':
                    c3 = '5';
                    c2 = '1';
                    break;
                case '4':
                    c3 = '6';
                    c2 = '1';
                    break;
                case '5':
                    c3 = '7';
                    c2 = '1';
                    break;
                case '6':
                    c3 = '8';
                    c2 = '1';
                    break;
                case '7':
                    c3 = '9';
                    c2 = '1';
                    break;
                case '8':
                    c2 = '2';
                    c3 = '0';
                    break;
                case '9':
                    c2 = '2';
                    c3 = '1';
                    break;
            }
        }
        return (c2 << 16) | c3;
    }

    public static xqx o0(String str) {
        return p0(str, wqx.d);
    }

    public static q7h p(char c2, char c3, char c4, char c5, char c6, char c7, char c8, char c9, char c10, char c11, char c12, char c13, char c14, char c15) {
        if (c2 < '0' || c2 > '9' || c3 < '0' || c3 > '9' || c4 < '0' || c4 > '9' || c5 < '0' || c5 > '9') {
            return null;
        }
        int i = ((c2 - '0') * 1000) + ((c3 - '0') * 100) + ((c4 - '0') * 10) + (c5 - '0');
        if (c6 < '0' || c6 > '9' || c7 < '0' || c7 > '9') {
            return null;
        }
        int i2 = ((c6 - '0') * 10) + (c7 - '0');
        if (c8 < '0' || c8 > '9' || c9 < '0' || c9 > '9') {
            return null;
        }
        int i3 = ((c8 - '0') * 10) + (c9 - '0');
        if (c10 < '0' || c10 > '9' || c11 < '0' || c11 > '9') {
            return null;
        }
        int i4 = ((c10 - '0') * 10) + (c11 - '0');
        if (c12 < '0' || c12 > '9' || c13 < '0' || c13 > '9') {
            return null;
        }
        int i5 = ((c12 - '0') * 10) + (c13 - '0');
        if (c14 < '0' || c14 > '9' || c15 < '0' || c15 > '9') {
            return null;
        }
        int i6 = ((c14 - '0') * 10) + (c15 - '0');
        if ((i != 0 || i2 != 0 || i3 != 0 || i4 != 0 || i5 != 0 || i6 != 0) && i4 <= 24 && i5 <= 60 && i6 <= 60) {
            return q7h.e(i, i2, i3, i4, i5, i6, 0);
        }
        return null;
    }

    public static q7h q(char c2, char c3, char c4, char c5, char c6, char c7, char c8, char c9, char c10, char c11, char c12, char c13, char c14, char c15, char c16, char c17, char c18, char c19, char c20, char c21, char c22, char c23, char c24) {
        if (c2 >= '0' && c2 <= '9' && c3 >= '0' && c3 <= '9' && c4 >= '0' && c4 <= '9' && c5 >= '0' && c5 <= '9') {
            int i = ((c2 - '0') * 1000) + ((c3 - '0') * 100) + ((c4 - '0') * 10) + (c5 - '0');
            if (c6 >= '0' && c6 <= '9' && c7 >= '0' && c7 <= '9') {
                int i2 = ((c6 - '0') * 10) + (c7 - '0');
                if (c8 >= '0' && c8 <= '9' && c9 >= '0' && c9 <= '9') {
                    int i3 = ((c8 - '0') * 10) + (c9 - '0');
                    if (c10 >= '0' && c10 <= '9' && c11 >= '0' && c11 <= '9') {
                        int i4 = ((c10 - '0') * 10) + (c11 - '0');
                        if (c12 >= '0' && c12 <= '9' && c13 >= '0' && c13 <= '9') {
                            int i5 = ((c12 - '0') * 10) + (c13 - '0');
                            if (c14 >= '0' && c14 <= '9' && c15 >= '0' && c15 <= '9') {
                                int i6 = ((c14 - '0') * 10) + (c15 - '0');
                                if (c16 >= '0' && c16 <= '9' && c17 >= '0' && c17 <= '9' && c18 >= '0' && c18 <= '9' && c19 >= '0' && c19 <= '9' && c20 >= '0' && c20 <= '9' && c21 >= '0' && c21 <= '9' && c22 >= '0' && c22 <= '9' && c23 >= '0' && c23 <= '9' && c24 >= '0' && c24 <= '9') {
                                    return q7h.e(i, i2, i3, i4, i5, i6, (c24 - '0') + ((c16 - '0') * 100000000) + ((c17 - '0') * ExceptionCode.CRASH_EXCEPTION) + ((c18 - '0') * 1000000) + ((c19 - '0') * 100000) + ((c20 - '0') * 10000) + ((c21 - '0') * 1000) + ((c22 - '0') * 100) + ((c23 - '0') * 10));
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x04bc, code lost:
        if (r0 != 'Z') goto L_0x049b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x05f1, code lost:
        if (r4 == 'P') goto L_0x05f3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x089f, code lost:
        if (r12 != 'Z') goto L_0x0879;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x091c, code lost:
        if (r14 != 'Z') goto L_0x08f6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0994, code lost:
        if (r7 != 'Z') goto L_0x096e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x0a0f, code lost:
        if (r14 != 'Z') goto L_0x09e9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0ab8, code lost:
        if (r7 != 'Z') goto L_0x0a92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x0c92, code lost:
        if (r12 != 'Z') goto L_0x0c6c;
     */
    /* JADX WARN: Removed duplicated region for block: B:203:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x07e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0868 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x08e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:406:0x095d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:439:0x09d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0a81 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0af3  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0b70  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0be2  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0c5d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:593:0x0cd3  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x0d19  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x0d29  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x0d33 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:606:0x0d34  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x0da6  */
    /* JADX WARN: Removed duplicated region for block: B:636:0x0da9  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x0db0  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x0db8  */
    /* JADX WARN: Removed duplicated region for block: B:709:0x0e58  */
    /* JADX WARN: Removed duplicated region for block: B:714:0x0e6e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static tb.xqx q0(byte[] r72, int r73, int r74, tb.wqx r75) {
        /*
            Method dump skipped, instructions count: 3754
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.q0(byte[], int, int, tb.wqx):tb.xqx");
    }

    public static long r(q7h q7hVar, wqx wqxVar) {
        p7h p7hVar = q7hVar.f26561a;
        int i = p7hVar.f25919a;
        x9h x9hVar = q7hVar.b;
        return s(wqxVar, i, p7hVar.b, p7hVar.c, x9hVar.f31233a, x9hVar.b, x9hVar.c, x9hVar.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0377, code lost:
        if (r0 != 'Z') goto L_0x0358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x03e0, code lost:
        if (r1 != 'Z') goto L_0x03be;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x052f, code lost:
        if (r12 == 'P') goto L_0x0531;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x07ec, code lost:
        if (r15 != 'Z') goto L_0x07c6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0866, code lost:
        if (r13 != 'Z') goto L_0x0840;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x08e1, code lost:
        if (r7 != 'Z') goto L_0x08bb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x095e, code lost:
        if (r13 != 'Z') goto L_0x0938;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0a0b, code lost:
        if (r7 != 'Z') goto L_0x09e5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x0bee, code lost:
        if (r15 != 'Z') goto L_0x0bc8;
     */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0731 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x07b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:377:0x082f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:408:0x08aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0927 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:475:0x09d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0a48  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0ac7  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0b3b  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x0bb9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:591:0x0bf8  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x0bfa  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x0c30  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x0c7a  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x0c8a  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x0c94 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:608:0x0c95  */
    /* JADX WARN: Removed duplicated region for block: B:636:0x0d04  */
    /* JADX WARN: Removed duplicated region for block: B:638:0x0d07  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x0d0e  */
    /* JADX WARN: Removed duplicated region for block: B:644:0x0d16  */
    /* JADX WARN: Removed duplicated region for block: B:712:0x0db6  */
    /* JADX WARN: Removed duplicated region for block: B:718:0x0dde  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static tb.xqx r0(char[] r70, int r71, int r72, tb.wqx r73) {
        /*
            Method dump skipped, instructions count: 3632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.r0(char[], int, int, tb.wqx):tb.xqx");
    }

    public static long s(wqx wqxVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        wqx wqxVar2;
        int i8;
        if (wqxVar == null) {
            wqxVar2 = wqx.d;
        } else {
            wqxVar2 = wqxVar;
        }
        long j = (i * yh6.DEFAULT_EXPIRED_TIME) + (((i + 3) / 4) - ((i + 99) / 100)) + ((i + SecExceptionCode.SEC_ERROR_STA_UNKNOWN_ERROR) / 400) + (((i2 * 367) + AConstants.ArtcErrorAudioDeviceStartPlayoutError) / 12) + (i3 - 1);
        if (i2 > 2) {
            long j2 = j - 1;
            if ((i & 3) != 0 || (i % 100 == 0 && i % 400 != 0)) {
                j -= 2;
            } else {
                j = j2;
            }
        }
        long j3 = ((j - 719528) * 86400) + (i4 * ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT) + (i5 * 60) + i6;
        if (wqx.SHANGHAI_ZONE_ID.equals(wqxVar2)) {
            if (j3 >= 684900000) {
                i8 = 28800;
            } else {
                i8 = m(j3);
            }
        } else if (wqxVar2 == wqx.e || pg1.ATOM_EXT_UTC.equals(wqxVar2.b)) {
            i8 = 0;
        } else {
            Calendar instance = Calendar.getInstance(wqxVar2.f30862a);
            instance.set(i, i2 - 1, i3, i4, i5, i6);
            instance.set(14, i7 / 1000000);
            return instance.getTimeInMillis();
        }
        long j4 = (j3 - i8) * 1000;
        if (i7 != 0) {
            return j4 + (i7 / 1000000);
        }
        return j4;
    }

    public static xqx s0(byte[] bArr, int i, wqx wqxVar) {
        if (i + 16 <= bArr.length) {
            char c2 = (char) bArr[i];
            char c3 = (char) bArr[i + 1];
            char c4 = (char) bArr[i + 2];
            char c5 = (char) bArr[i + 3];
            char c6 = (char) bArr[i + 4];
            char c7 = (char) bArr[i + 5];
            char c8 = (char) bArr[i + 6];
            char c9 = (char) bArr[i + 7];
            char c10 = (char) bArr[i + 8];
            char c11 = (char) bArr[i + 9];
            int i2 = i + 10;
            char c12 = (char) bArr[i2];
            char c13 = (char) bArr[i + 13];
            if (c6 != '-' || c9 != '-' || ((c12 != '+' && c12 != '-') || c13 != ':')) {
                String str = new String(bArr, i, 16);
                throw new DateTimeException("illegal input ".concat(str), str, 0);
            } else if (c2 < '0' || c2 > '9' || c3 < '0' || c3 > '9' || c4 < '0' || c4 > '9' || c5 < '0' || c5 > '9') {
                String str2 = new String(bArr, i, 16);
                throw new DateTimeException("illegal input ".concat(str2), str2, 0);
            } else {
                int i3 = ((c2 - '0') * 1000) + ((c3 - '0') * 100) + ((c4 - '0') * 10) + (c5 - '0');
                if (c7 < '0' || c7 > '9' || c8 < '0' || c8 > '9') {
                    String str3 = new String(bArr, i, 16);
                    throw new DateTimeException("illegal input ".concat(str3), str3, 0);
                }
                int i4 = ((c7 - '0') * 10) + (c8 - '0');
                if (c10 < '0' || c10 > '9' || c11 < '0' || c11 > '9') {
                    String str4 = new String(bArr, i, 16);
                    throw new DateTimeException("illegal input ".concat(str4), str4, 0);
                }
                return xqx.c(q7h.f(p7h.e(i3, i4, ((c10 - '0') * 10) + (c11 - '0')), x9h.MIN), n(new String(bArr, i2, 6), wqxVar));
            }
        } else {
            String str5 = new String(bArr, i, bArr.length - i);
            throw new DateTimeException("illegal input ".concat(str5), str5, 0);
        }
    }

    public static int t(char c2, char c3, char c4) {
        if (c2 != 'A') {
            if (c2 != 'D') {
                if (c2 != 'F') {
                    if (c2 != 'J') {
                        if (c2 != 'S') {
                            switch (c2) {
                                case 'M':
                                    if (c3 != 'a') {
                                        return 0;
                                    }
                                    if (c4 == 'r') {
                                        return 3;
                                    }
                                    if (c4 == 'y') {
                                        return 5;
                                    }
                                    return 0;
                                case 'N':
                                    if (c3 == 'o' && c4 == 'v') {
                                        return 11;
                                    }
                                    return 0;
                                case 'O':
                                    if (c3 == 'c' && c4 == 't') {
                                        return 10;
                                    }
                                    return 0;
                                default:
                                    return 0;
                            }
                        } else if (c3 == 'e' && c4 == 'p') {
                            return 9;
                        } else {
                            return 0;
                        }
                    } else if (c3 == 'a' && c4 == 'n') {
                        return 1;
                    } else {
                        if (c3 != 'u') {
                            return 0;
                        }
                        if (c4 == 'n') {
                            return 6;
                        }
                        if (c4 == 'l') {
                            return 7;
                        }
                        return 0;
                    }
                } else if (c3 == 'e' && c4 == 'b') {
                    return 2;
                } else {
                    return 0;
                }
            } else if (c3 == 'e' && c4 == 'c') {
                return 12;
            } else {
                return 0;
            }
        } else if (c3 == 'p' && c4 == 'r') {
            return 4;
        } else {
            if (c3 == 'u' && c4 == 'g') {
                return 8;
            }
            return 0;
        }
    }

    public static xqx t0(char[] cArr, int i, wqx wqxVar) {
        if (i + 16 <= cArr.length) {
            char c2 = cArr[i];
            char c3 = cArr[i + 1];
            char c4 = cArr[i + 2];
            char c5 = cArr[i + 3];
            char c6 = cArr[i + 4];
            char c7 = cArr[i + 5];
            char c8 = cArr[i + 6];
            char c9 = cArr[i + 7];
            char c10 = cArr[i + 8];
            char c11 = cArr[i + 9];
            int i2 = i + 10;
            char c12 = cArr[i2];
            char c13 = cArr[i + 13];
            if (c6 != '-' || c9 != '-' || ((c12 != '+' && c12 != '-') || c13 != ':')) {
                String str = new String(cArr, i, 16);
                throw new DateTimeException("illegal input ".concat(str), str, 0);
            } else if (c2 < '0' || c2 > '9' || c3 < '0' || c3 > '9' || c4 < '0' || c4 > '9' || c5 < '0' || c5 > '9') {
                String str2 = new String(cArr, i, 16);
                throw new DateTimeException("illegal input ".concat(str2), str2, 0);
            } else {
                int i3 = ((c2 - '0') * 1000) + ((c3 - '0') * 100) + ((c4 - '0') * 10) + (c5 - '0');
                if (c7 < '0' || c7 > '9' || c8 < '0' || c8 > '9') {
                    String str3 = new String(cArr, i, 16);
                    throw new DateTimeException("illegal input ".concat(str3), str3, 0);
                }
                int i4 = ((c7 - '0') * 10) + (c8 - '0');
                if (c10 < '0' || c10 > '9' || c11 < '0' || c11 > '9') {
                    String str4 = new String(cArr, i, 16);
                    throw new DateTimeException("illegal input ".concat(str4), str4, 0);
                }
                return xqx.c(q7h.f(p7h.e(i3, i4, ((c10 - '0') * 10) + (c11 - '0')), x9h.MIN), n(new String(cArr, i2, 6), wqxVar));
            }
        } else {
            String str5 = new String(cArr, i, cArr.length - i);
            throw new DateTimeException("illegal input ".concat(str5), str5, 0);
        }
    }

    public static xqx u0(String str) {
        if (str.endsWith(" CST")) {
            DateTimeFormatter dateTimeFormatter = c;
            if (dateTimeFormatter == null) {
                dateTimeFormatter = DateTimeFormatter.e("EEEE, dd-MMM-yyyy HH:mm:ss");
                c = dateTimeFormatter;
            }
            return xqx.c(dateTimeFormatter.i(str.substring(0, str.length() - 4)), wqx.SHANGHAI_ZONE_ID);
        }
        DateTimeFormatter dateTimeFormatter2 = b;
        if (dateTimeFormatter2 == null) {
            dateTimeFormatter2 = DateTimeFormatter.e("EEEE, dd-MMM-yyyy HH:mm:ss zzz");
            b = dateTimeFormatter2;
        }
        return dateTimeFormatter2.k(str);
    }

    public static p7h v(byte[] bArr, int i) {
        char c2;
        char c3;
        char c4;
        int t;
        if (i + 10 > bArr.length) {
            return null;
        }
        char c5 = (char) bArr[i];
        char c6 = (char) bArr[i + 1];
        char c7 = (char) bArr[i + 2];
        char c8 = (char) bArr[i + 3];
        char c9 = (char) bArr[i + 4];
        char c10 = (char) bArr[i + 5];
        char c11 = (char) bArr[i + 6];
        char c12 = (char) bArr[i + 7];
        char c13 = (char) bArr[i + 8];
        char c14 = (char) bArr[i + 9];
        if ((c9 == '-' && c12 == '-') || (c9 == '/' && c12 == '/')) {
            c12 = c6;
            c3 = c8;
            c4 = c10;
            c2 = c11;
            c8 = c13;
        } else if ((c7 == '.' && c10 == '.') || (c7 == '-' && c10 == '-')) {
            c2 = c9;
            c7 = c13;
            c3 = c14;
            c14 = c6;
            c4 = c8;
            c8 = c5;
            c5 = c11;
        } else if (c7 == '/' && c10 == '/') {
            c2 = c6;
            c7 = c13;
            c4 = c5;
            c5 = c11;
            c3 = c14;
            c14 = c9;
        } else {
            if (c6 == ' ' && c10 == ' ' && (t = t(c7, c8, c9)) > 0) {
                c4 = (char) ((t / 10) + 48);
                c2 = (char) ((t % 10) + 48);
                c3 = c14;
                c14 = c5;
                c5 = c11;
                c7 = c13;
                c8 = '0';
            }
            return null;
        }
        if (c5 >= '0' && c5 <= '9' && c12 >= '0' && c12 <= '9' && c7 >= '0' && c7 <= '9' && c3 >= '0' && c3 <= '9') {
            int i2 = ((c5 - '0') * 1000) + ((c12 - '0') * 100) + ((c7 - '0') * 10) + (c3 - '0');
            if (c4 >= '0' && c4 <= '9' && c2 >= '0' && c2 <= '9') {
                int i3 = ((c4 - '0') * 10) + (c2 - '0');
                if (c8 >= '0' && c8 <= '9' && c14 >= '0' && c14 <= '9') {
                    int i4 = ((c8 - '0') * 10) + (c14 - '0');
                    if (i2 == 0 && i3 == 0 && i4 == 0) {
                        return null;
                    }
                    return p7h.e(i2, i3, i4);
                }
            }
        }
        return null;
    }

    public static String v0(long j, boolean z, wqx wqxVar) {
        int i;
        long j2;
        int i2;
        int i3;
        long e2 = b2d.e(j, 1000L);
        if (wqx.SHANGHAI_ZONE_ID.equals(wqxVar)) {
            i = m(e2);
        } else {
            i = wqxVar.a(vcf.d(j));
        }
        long j3 = e2 + i;
        long e3 = b2d.e(j3, 86400L);
        int f = (int) b2d.f(j3, 86400L);
        long j4 = 719468 + e3;
        if (j4 < 0) {
            long j5 = ((e3 + 719469) / 146097) - 1;
            j2 = j5 * 400;
            j4 += (-j5) * 146097;
        } else {
            j2 = 0;
        }
        long j6 = ((j4 * 400) + 591) / 146097;
        long j7 = j4 - ((((j6 * 365) + (j6 / 4)) - (j6 / 100)) + (j6 / 400));
        if (j7 < 0) {
            j6--;
            j7 = j4 - ((((365 * j6) + (j6 / 4)) - (j6 / 100)) + (j6 / 400));
        }
        int i4 = (int) j7;
        int i5 = ((i4 * 5) + 2) / 153;
        int i6 = ((i5 + 2) % 12) + 1;
        int i7 = (i4 - (((i5 * 306) + 5) / 10)) + 1;
        long j8 = j6 + j2 + (i5 / 10);
        if (j8 < -999999999 || j8 > 999999999) {
            throw new DateTimeException("Invalid year " + j8);
        }
        int i8 = (int) j8;
        long j9 = f;
        if (j9 < 0 || j9 > 86399) {
            throw new DateTimeException("Invalid secondOfDay " + j9);
        }
        int i9 = (int) (j9 / 3600);
        long j10 = j9 - (i9 * ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT);
        int i10 = (int) (j10 / 60);
        int i11 = (int) (j10 - (i10 * 60));
        int f2 = (int) b2d.f(j, 1000L);
        if (f2 == 0) {
            i2 = 0;
        } else {
            if (f2 >= 10) {
                if (f2 % 100 == 0) {
                    i2 = 2;
                } else if (f2 % 10 == 0) {
                    i2 = 3;
                }
            }
            i2 = 4;
        }
        if (!z) {
            i3 = 0;
        } else if (i == 0) {
            i3 = 1;
        } else {
            i3 = 6;
        }
        int i12 = i2 + 19;
        int i13 = i3 + i12;
        char[] cArr = new char[i13];
        cArr[0] = (char) ((i8 / 1000) + 48);
        cArr[1] = (char) (((i8 / 100) % 10) + 48);
        cArr[2] = (char) (((i8 / 10) % 10) + 48);
        cArr[3] = (char) ((i8 % 10) + 48);
        cArr[4] = '-';
        cArr[5] = (char) ((i6 / 10) + 48);
        cArr[6] = (char) ((i6 % 10) + 48);
        cArr[7] = '-';
        cArr[8] = (char) ((i7 / 10) + 48);
        cArr[9] = (char) ((i7 % 10) + 48);
        cArr[10] = ' ';
        cArr[11] = (char) ((i9 / 10) + 48);
        cArr[12] = (char) ((i9 % 10) + 48);
        cArr[13] = f7l.CONDITION_IF_MIDDLE;
        cArr[14] = (char) ((i10 / 10) + 48);
        cArr[15] = (char) ((i10 % 10) + 48);
        cArr[16] = f7l.CONDITION_IF_MIDDLE;
        cArr[17] = (char) ((i11 / 10) + 48);
        cArr[18] = (char) ((i11 % 10) + 48);
        if (i2 > 0) {
            cArr[19] = '.';
            for (int i14 = 20; i14 < i13; i14++) {
                cArr[i14] = '0';
            }
            if (f2 < 10) {
                b2d.m(cArr, 22, f2);
            } else if (f2 % 100 == 0) {
                b2d.m(cArr, 20, f2 / 100);
            } else if (f2 % 10 == 0) {
                b2d.m(cArr, 20, f2 / 10);
            } else {
                b2d.m(cArr, 20, f2);
            }
        }
        if (z) {
            int i15 = i / ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT;
            if (i == 0) {
                cArr[i12] = 'Z';
            } else {
                int abs = Math.abs(i15);
                if (i15 >= 0) {
                    cArr[i12] = '+';
                } else {
                    cArr[i12] = '-';
                }
                if (abs < 10) {
                    cArr[i2 + 20] = '0';
                    cArr[i2 + 21] = (char) (abs + 48);
                } else {
                    cArr[i2 + 20] = (char) ((abs / 10) + 48);
                    cArr[i2 + 21] = (char) ((abs % 10) + 48);
                }
                cArr[i2 + 22] = f7l.CONDITION_IF_MIDDLE;
                int i16 = (i - (i15 * ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT)) / 60;
                if (i16 < 0) {
                    i16 = -i16;
                }
                if (i16 < 10) {
                    cArr[i2 + 23] = '0';
                    cArr[i2 + 24] = (char) (i16 + 48);
                } else {
                    cArr[i2 + 23] = (char) ((i16 / 10) + 48);
                    cArr[i2 + 24] = (char) ((i16 % 10) + 48);
                }
            }
        }
        return new String(cArr);
    }

    public static p7h w(char[] cArr, int i) {
        char c2;
        char c3;
        int t;
        if (i + 10 > cArr.length) {
            return null;
        }
        char c4 = cArr[i];
        char c5 = cArr[i + 1];
        char c6 = cArr[i + 2];
        char c7 = cArr[i + 3];
        char c8 = cArr[i + 4];
        char c9 = cArr[i + 5];
        char c10 = cArr[i + 6];
        char c11 = cArr[i + 7];
        char c12 = cArr[i + 8];
        char c13 = cArr[i + 9];
        if ((c8 == '-' && c11 == '-') || (c8 == '/' && c11 == '/')) {
            c11 = c12;
            c12 = c13;
            c3 = c6;
            c2 = '0';
        } else if ((c6 == '.' && c9 == '.') || (c6 == '-' && c9 == '-')) {
            c9 = c7;
            c2 = '0';
            c7 = c13;
            c3 = c12;
            c12 = c5;
            c5 = c11;
            c11 = c4;
            c4 = c10;
            c10 = c8;
        } else if (c6 == '/' && c9 == '/') {
            c9 = c4;
            c4 = c10;
            c2 = '0';
            c10 = c5;
            c5 = c11;
            c11 = c7;
            c7 = c13;
            c3 = c12;
            c12 = c8;
        } else if ((c8 == 24180 && c10 == 26376 && c13 == 26085) || (c8 == 45380 && c10 == 50900 && c13 == 51068)) {
            c3 = c6;
            c10 = c9;
            c2 = '0';
            c9 = '0';
        } else {
            if ((c8 == 24180 && c11 == 26376 && c13 == 26085) || (c8 == 45380 && c11 == 50900 && c13 == 51068)) {
                c3 = c6;
                c2 = '0';
            } else if (c5 != ' ' || c9 != ' ' || (t = t(c6, c7, c8)) <= 0) {
                return null;
            } else {
                c2 = '0';
                c7 = c13;
                c9 = (char) ((t / 10) + 48);
                c3 = c12;
                c12 = c4;
                c4 = c10;
                c10 = (char) ((t % 10) + 48);
                c5 = c11;
            }
            c11 = '0';
        }
        if (c4 < c2 || c4 > '9' || c5 < c2 || c5 > '9' || c3 < c2 || c3 > '9' || c7 < c2 || c7 > '9') {
            return null;
        }
        int i2 = ((c4 - c2) * 1000) + ((c5 - c2) * 100) + ((c3 - c2) * 10) + (c7 - c2);
        if (c9 < c2 || c9 > '9' || c10 < c2 || c10 > '9') {
            return null;
        }
        int i3 = ((c9 - c2) * 10) + (c10 - c2);
        if (c11 < c2 || c11 > '9' || c12 < c2 || c12 > '9') {
            return null;
        }
        int i4 = ((c11 - c2) * 10) + (c12 - c2);
        if (i2 == 0 && i3 == 0 && i4 == 0) {
            return null;
        }
        return p7h.e(i2, i3, i4);
    }

    public static long w0(int i, int i2, int i3, int i4, int i5, int i6) {
        long j = (i * yh6.DEFAULT_EXPIRED_TIME) + (((i + 3) / 4) - ((i + 99) / 100)) + ((i + SecExceptionCode.SEC_ERROR_STA_UNKNOWN_ERROR) / 400) + (((i2 * 367) + AConstants.ArtcErrorAudioDeviceStartPlayoutError) / 12) + (i3 - 1);
        if (i2 > 2) {
            long j2 = j - 1;
            if ((i & 3) != 0 || (i % 100 == 0 && i % 400 != 0)) {
                j -= 2;
            } else {
                j = j2;
            }
        }
        return ((j - 719528) * 86400) + (i4 * ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT) + (i5 * 60) + i6;
    }

    public static p7h x(byte[] bArr, int i) {
        int t;
        if (i + 11 > bArr.length) {
            return null;
        }
        char c2 = (char) bArr[i];
        char c3 = (char) bArr[i + 1];
        char c4 = (char) bArr[i + 2];
        char c5 = (char) bArr[i + 3];
        char c6 = (char) bArr[i + 4];
        char c7 = (char) bArr[i + 5];
        char c8 = (char) bArr[i + 6];
        char c9 = (char) bArr[i + 7];
        char c10 = (char) bArr[i + 8];
        char c11 = (char) bArr[i + 9];
        char c12 = (char) bArr[i + 10];
        if (!(c6 == '-' && c9 == '-' && c12 == 'Z')) {
            if (c4 == ' ' && c8 == ' ' && (t = t(c5, c6, c7)) > 0) {
                c7 = (char) ((t / 10) + 48);
                c8 = (char) ((t % 10) + 48);
                c5 = c12;
                c4 = c11;
                c11 = c3;
                c3 = c10;
                c10 = c2;
                c2 = c9;
            }
            return null;
        }
        if (c2 >= '0' && c2 <= '9' && c3 >= '0' && c3 <= '9' && c4 >= '0' && c4 <= '9' && c5 >= '0' && c5 <= '9') {
            int i2 = ((c2 - '0') * 1000) + ((c3 - '0') * 100) + ((c4 - '0') * 10) + (c5 - '0');
            if (c7 >= '0' && c7 <= '9' && c8 >= '0' && c8 <= '9') {
                int i3 = ((c7 - '0') * 10) + (c8 - '0');
                if (c10 >= '0' && c10 <= '9' && c11 >= '0' && c11 <= '9') {
                    int i4 = ((c10 - '0') * 10) + (c11 - '0');
                    if (i2 == 0 && i3 == 0 && i4 == 0) {
                        return null;
                    }
                    return p7h.e(i2, i3, i4);
                }
            }
        }
        return null;
    }

    public static p7h y(char[] cArr, int i) {
        int t;
        if (i + 11 > cArr.length) {
            return null;
        }
        char c2 = cArr[i];
        char c3 = cArr[i + 1];
        char c4 = cArr[i + 2];
        char c5 = cArr[i + 3];
        char c6 = cArr[i + 4];
        char c7 = cArr[i + 5];
        char c8 = cArr[i + 6];
        char c9 = cArr[i + 7];
        char c10 = cArr[i + 8];
        char c11 = cArr[i + 9];
        char c12 = cArr[i + 10];
        if (!((c6 == 24180 && c9 == 26376 && c12 == 26085) || ((c6 == '-' && c9 == '-' && c12 == 'Z') || (c6 == 45380 && c9 == 50900 && c12 == 51068)))) {
            if (c4 == ' ' && c8 == ' ' && (t = t(c5, c6, c7)) > 0) {
                c7 = (char) ((t / 10) + 48);
                c8 = (char) ((t % 10) + 48);
                c5 = c12;
                c4 = c11;
                c11 = c3;
                c3 = c10;
                c10 = c2;
                c2 = c9;
            }
            return null;
        }
        if (c2 >= '0' && c2 <= '9' && c3 >= '0' && c3 <= '9' && c4 >= '0' && c4 <= '9' && c5 >= '0' && c5 <= '9') {
            int i2 = ((c2 - '0') * 1000) + ((c3 - '0') * 100) + ((c4 - '0') * 10) + (c5 - '0');
            if (c7 >= '0' && c7 <= '9' && c8 >= '0' && c8 <= '9') {
                int i3 = ((c7 - '0') * 10) + (c8 - '0');
                if (c10 >= '0' && c10 <= '9' && c11 >= '0' && c11 <= '9') {
                    int i4 = ((c10 - '0') * 10) + (c11 - '0');
                    if (i2 == 0 && i3 == 0 && i4 == 0) {
                        return null;
                    }
                    return p7h.e(i2, i3, i4);
                }
            }
        }
        return null;
    }

    public static p7h z(byte[] bArr, int i) {
        int i2;
        int i3;
        int i4;
        if (i + 8 > bArr.length) {
            return null;
        }
        char c2 = (char) bArr[i];
        char c3 = (char) bArr[i + 1];
        char c4 = (char) bArr[i + 2];
        char c5 = (char) bArr[i + 3];
        char c6 = (char) bArr[i + 4];
        char c7 = (char) bArr[i + 5];
        char c8 = (char) bArr[i + 6];
        char c9 = (char) bArr[i + 7];
        if (c6 == '-' && c8 == '-') {
            c6 = '0';
        } else {
            if (c3 == '/' && c5 == '/') {
                c5 = c9;
                c9 = c4;
                c3 = c7;
                c4 = c8;
                c8 = '0';
                c7 = c2;
                c2 = c6;
                c6 = '0';
            } else if (c3 == '-' && c7 == '-') {
                int t = t(c4, c5, c6);
                if (t <= 0) {
                    return null;
                }
                c6 = (char) ((t / 10) + 48);
                c5 = c9;
                c7 = (char) ((t % 10) + 48);
                c9 = c2;
                c4 = c8;
                c2 = '2';
                c3 = '0';
            }
            if (c2 >= '0' && c2 <= '9' && c3 >= '0' && c3 <= '9' && c4 >= '0' && c4 <= '9' && c5 >= '0' && c5 <= '9') {
                i2 = ((c2 - '0') * 1000) + ((c3 - '0') * 100) + ((c4 - '0') * 10) + (c5 - '0');
                if (c6 >= '0' && c6 <= '9' && c7 >= '0' && c7 <= '9') {
                    i3 = ((c6 - '0') * 10) + (c7 - '0');
                    if (c8 >= '0' && c8 <= '9' && c9 >= '0' && c9 <= '9') {
                        i4 = ((c8 - '0') * 10) + (c9 - '0');
                        if (i2 != 0 && i3 == 0 && i4 == 0) {
                            return null;
                        }
                        return p7h.e(i2, i3, i4);
                    }
                }
            }
            return null;
        }
        c8 = '0';
        if (c2 >= '0') {
            i2 = ((c2 - '0') * 1000) + ((c3 - '0') * 100) + ((c4 - '0') * 10) + (c5 - '0');
            if (c6 >= '0') {
                i3 = ((c6 - '0') * 10) + (c7 - '0');
                if (c8 >= '0') {
                    i4 = ((c8 - '0') * 10) + (c9 - '0');
                    if (i2 != 0) {
                    }
                    return p7h.e(i2, i3, i4);
                }
            }
        }
        return null;
    }

    public static Date u(String str, String str2, wqx wqxVar) {
        if (str == null || str.isEmpty() || "null".equals(str)) {
            return null;
        }
        if (str2 == null || str2.isEmpty()) {
            long f0 = f0(str, wqxVar);
            if (f0 == 0) {
                return null;
            }
            return new Date(f0);
        }
        char c2 = 65535;
        switch (str2.hashCode()) {
            case -1074095546:
                if (str2.equals("millis")) {
                    c2 = 0;
                    break;
                }
                break;
            case -347789785:
                if (str2.equals("yyyyMMddHHmmssSSSZ")) {
                    c2 = 1;
                    break;
                }
                break;
            case -288020395:
                if (str2.equals("unixtime")) {
                    c2 = 2;
                    break;
                }
                break;
            case -276306848:
                if (str2.equals("yyyyMMdd")) {
                    c2 = 3;
                    break;
                }
                break;
            case -159776256:
                if (str2.equals("yyyy-MM-dd")) {
                    c2 = 4;
                    break;
                }
                break;
            case -102516032:
                if (str2.equals("yyyy/MM/dd")) {
                    c2 = 5;
                    break;
                }
                break;
            case 311496928:
                if (str2.equals("yyyy/MM/dd HH:mm:ss")) {
                    c2 = 6;
                    break;
                }
                break;
            case 1333195168:
                if (str2.equals("yyyy-MM-dd HH:mm:ss")) {
                    c2 = 7;
                    break;
                }
                break;
            case 1397504320:
                if (str2.equals("dd.MM.yyyy HH:mm:ss")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 1798231098:
                if (str2.equals("yyyy-MM-dd'T'HH:mm:ss")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 2095190916:
                if (str2.equals("iso8601")) {
                    c2 = '\n';
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return new Date(Long.parseLong(str));
            case 1:
            case '\n':
                long f02 = f0(str, wqx.d);
                if (f02 == 0) {
                    return null;
                }
                return new Date(f02);
            case 2:
                return new Date(Long.parseLong(str) * 1000);
            case 3:
                return new Date(m0(str, wqxVar));
            case 4:
                return new Date(h0(str, wqxVar, DateTimeFormatPattern.DATE_FORMAT_10_DASH));
            case 5:
                return new Date(h0(str, wqxVar, DateTimeFormatPattern.DATE_FORMAT_10_SLASH));
            case 6:
                return new Date(j0(str, wqxVar, DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH));
            case 7:
                return new Date(n0(str, wqxVar));
            case '\b':
                return new Date(j0(str, wqxVar, DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT));
            case '\t':
                return new Date(j0(str, wqxVar, DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH_T));
            default:
                if (wqxVar == null) {
                    wqxVar = wqx.d;
                }
                return new Date(r(DateTimeFormatter.e(str2).i(str), wqxVar));
        }
    }

    public static String c(q7h q7hVar, String str) {
        if (q7hVar == null) {
            return null;
        }
        p7h p7hVar = q7hVar.f26561a;
        int i = p7hVar.f25919a;
        str.hashCode();
        short s = p7hVar.b;
        short s2 = p7hVar.c;
        x9h x9hVar = q7hVar.b;
        char c2 = 65535;
        switch (str.hashCode()) {
            case -657196083:
                if (str.equals("yyyy-MMM-dd")) {
                    c2 = 0;
                    break;
                }
                break;
            case -159776256:
                if (str.equals("yyyy-MM-dd")) {
                    c2 = 1;
                    break;
                }
                break;
            case -102516032:
                if (str.equals("yyyy/MM/dd")) {
                    c2 = 2;
                    break;
                }
                break;
            case -5183123:
                if (str.equals("yyyy-M-dd")) {
                    c2 = 3;
                    break;
                }
                break;
            case 1333195168:
                if (str.equals("yyyy-MM-dd HH:mm:ss")) {
                    c2 = 4;
                    break;
                }
                break;
            case 1798231098:
                if (str.equals("yyyy-MM-dd'T'HH:mm:ss")) {
                    c2 = 5;
                    break;
                }
                break;
            case 1834843604:
                if (str.equals("yyyy-MM-ddTHH:mm:ss")) {
                    c2 = 6;
                    break;
                }
                break;
            case 1900521056:
                if (str.equals("dd.MM.yyyy")) {
                    c2 = 7;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return h(i, s, s2);
            case 1:
                return b(i, s, s2, DateTimeFormatPattern.DATE_FORMAT_10_DASH);
            case 2:
                return b(i, s, s2, DateTimeFormatPattern.DATE_FORMAT_10_SLASH);
            case 3:
                return i(i, s, s2);
            case 4:
                return a(i, s, s2, x9hVar.f31233a, x9hVar.b, x9hVar.c, DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH);
            case 5:
            case 6:
                return a(i, s, s2, x9hVar.f31233a, x9hVar.b, x9hVar.c, DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH_T);
            case 7:
                return b(i, s, s2, DateTimeFormatPattern.DATE_FORMAT_10_DOT);
            default:
                DateTimeFormatter.e(str).b(q7hVar);
                throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long j0(java.lang.String r24, tb.wqx r25, com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern r26) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.j0(java.lang.String, tb.wqx, com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern):long");
    }

    public static xqx p0(String str, wqx wqxVar) {
        if (str == null || str.length() == 0) {
            return null;
        }
        char[] charArray = str.toCharArray();
        xqx r0 = r0(charArray, 0, charArray.length, wqxVar);
        if (r0 != null) {
            return r0;
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    c2 = 0;
                    break;
                }
                break;
            case 3392903:
                if (str.equals("null")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1333954784:
                if (str.equals("0000-00-00")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
            case 1:
            case 2:
                return null;
            default:
                throw new DateTimeException(str, str, 0);
        }
    }

    public static long h0(String str, wqx wqxVar, DateTimeFormatPattern dateTimeFormatPattern) {
        int i;
        int i2;
        if (str == null || "null".equals(str)) {
            return 0L;
        }
        if (dateTimeFormatPattern.length != 10) {
            throw new UnsupportedOperationException();
        } else if (str.length() == 10) {
            char charAt = str.charAt(0);
            char charAt2 = str.charAt(1);
            char charAt3 = str.charAt(2);
            char charAt4 = str.charAt(3);
            char charAt5 = str.charAt(4);
            char charAt6 = str.charAt(5);
            char charAt7 = str.charAt(6);
            char charAt8 = str.charAt(7);
            char charAt9 = str.charAt(8);
            char charAt10 = str.charAt(9);
            int i3 = a.f2474a[dateTimeFormatPattern.ordinal()];
            if (i3 != 5) {
                if (i3 != 6) {
                    throw new DateTimeException("illegal input", str, 0);
                } else if (!(charAt5 == '/' && charAt8 == '/')) {
                    throw new DateTimeException("illegal input", str, 0);
                }
            } else if (!(charAt5 == '-' && charAt8 == '-')) {
                throw new DateTimeException("illegal input", str, 0);
            }
            if (charAt < '0' || charAt > '9' || charAt2 < '0' || charAt2 > '9' || charAt3 < '0' || charAt3 > '9' || charAt4 < '0' || charAt4 > '9') {
                throw new DateTimeException("illegal input", str, 0);
            }
            int i4 = ((charAt - '0') * 1000) + ((charAt2 - '0') * 100) + ((charAt3 - '0') * 10) + (charAt4 - '0');
            if (charAt6 < '0' || charAt6 > '9' || charAt7 < '0' || charAt7 > '9') {
                throw new DateTimeException("illegal input", str, 0);
            }
            int i5 = ((charAt6 - '0') * 10) + (charAt7 - '0');
            if ((i5 == 0 && i4 != 0) || i5 > 12) {
                throw new DateTimeException("illegal input", str, 0);
            } else if (charAt9 < '0' || charAt9 > '9' || charAt10 < '0' || charAt10 > '9') {
                throw new DateTimeException("illegal input", str, 0);
            } else {
                int i6 = ((charAt9 - '0') * 10) + (charAt10 - '0');
                if (i5 != 2) {
                    i = (i5 == 4 || i5 == 6 || i5 == 9 || i5 == 11) ? 30 : 31;
                } else {
                    i = ((i4 & 3) != 0 || (i4 % 100 == 0 && i4 % 400 != 0)) ? 28 : 29;
                }
                if ((i6 != 0 || i4 == 0) && i6 <= i) {
                    if (i4 == 0 && i5 == 0 && i6 == 0) {
                        i4 = 1970;
                        i6 = 1;
                        i5 = 1;
                    }
                    long j = (i4 * yh6.DEFAULT_EXPIRED_TIME) + (((i4 + 3) / 4) - ((i4 + 99) / 100)) + ((i4 + SecExceptionCode.SEC_ERROR_STA_UNKNOWN_ERROR) / 400) + (((i5 * 367) + AConstants.ArtcErrorAudioDeviceStartPlayoutError) / 12) + (i6 - 1);
                    if (i5 > 2) {
                        j--;
                        if ((i4 & 3) != 0 || (i4 % 100 == 0 && i4 % 400 != 0)) {
                            j -= 2;
                        }
                    }
                    long j2 = (j - 719528) * 86400;
                    if (!wqxVar.equals(wqx.SHANGHAI_ZONE_ID) || j2 < 684900000) {
                        i2 = (wqxVar == wqx.e || pg1.ATOM_EXT_UTC.equals(wqxVar.b)) ? 0 : wqxVar.b(q7h.f(p7h.e(i4, i5, i6), x9h.MIN));
                    } else {
                        i2 = 28800;
                    }
                    return (j2 - i2) * 1000;
                }
                throw new DateTimeException("illegal input", str, 0);
            }
        } else {
            throw new DateTimeException("illegal input ".concat(str), str, 0);
        }
    }

    public static long m0(String str, wqx wqxVar) {
        int i;
        int i2;
        int i3;
        if (str == null || "null".equals(str)) {
            return 0L;
        }
        if (str.length() == 8) {
            char charAt = str.charAt(0);
            char charAt2 = str.charAt(1);
            char charAt3 = str.charAt(2);
            char charAt4 = str.charAt(3);
            char charAt5 = str.charAt(4);
            char charAt6 = str.charAt(5);
            char charAt7 = str.charAt(6);
            char charAt8 = str.charAt(7);
            if (charAt < '0' || charAt > '9' || charAt2 < '0' || charAt2 > '9' || charAt3 < '0' || charAt3 > '9' || charAt4 < '0' || charAt4 > '9') {
                throw new DateTimeException("illegal input", str, 0);
            }
            int i4 = ((charAt - '0') * 1000) + ((charAt2 - '0') * 100) + ((charAt3 - '0') * 10) + (charAt4 - '0');
            if (charAt5 < '0' || charAt5 > '9' || charAt6 < '0' || charAt6 > '9') {
                throw new DateTimeException("illegal input", str, 0);
            }
            int i5 = ((charAt5 - '0') * 10) + (charAt6 - '0');
            if ((i5 == 0 && i4 != 0) || i5 > 12) {
                throw new DateTimeException("illegal input", str, 0);
            } else if (charAt7 < '0' || charAt7 > '9' || charAt8 < '0' || charAt8 > '9') {
                throw new DateTimeException("illegal input", str, 0);
            } else {
                int i6 = ((charAt7 - '0') * 10) + (charAt8 - '0');
                if (i5 != 2) {
                    i = (i5 == 4 || i5 == 6 || i5 == 9 || i5 == 11) ? 30 : 31;
                } else {
                    i = ((i4 & 3) != 0 || (i4 % 100 == 0 && i4 % 400 != 0)) ? 28 : 29;
                }
                if ((i6 != 0 || i4 == 0) && i6 <= i) {
                    if (i4 == 0 && i5 == 0 && i6 == 0) {
                        i4 = 1970;
                        i2 = 1;
                        i6 = 1;
                    } else {
                        i2 = i5;
                    }
                    long j = (i4 * yh6.DEFAULT_EXPIRED_TIME) + (((i4 + 3) / 4) - ((i4 + 99) / 100)) + ((i4 + SecExceptionCode.SEC_ERROR_STA_UNKNOWN_ERROR) / 400) + (((i2 * 367) + AConstants.ArtcErrorAudioDeviceStartPlayoutError) / 12) + (i6 - 1);
                    if (i2 > 2) {
                        j--;
                        if ((i4 & 3) != 0 || (i4 % 100 == 0 && i4 % 400 != 0)) {
                            j -= 2;
                        }
                    }
                    long j2 = (j - 719528) * 86400;
                    if (!wqxVar.equals(wqx.SHANGHAI_ZONE_ID) || j2 < 684900000) {
                        i3 = (wqxVar == wqx.e || pg1.ATOM_EXT_UTC.equals(wqxVar.b)) ? 0 : wqxVar.b(q7h.f(p7h.e(i4, i2, i6), x9h.MIN));
                    } else {
                        i3 = 28800;
                    }
                    return (j2 - i3) * 1000;
                }
                throw new DateTimeException("illegal input", str, 0);
            }
        } else {
            throw new DateTimeException("illegal input ".concat(str), str, 0);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
        if (r4.equals("0000-0-00") == false) goto L_0x001d;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static tb.q7h D(java.lang.String r4, int r5, int r6) {
        /*
            r0 = 0
            r1 = 0
            if (r4 == 0) goto L_0x0081
            if (r6 != 0) goto L_0x0008
            goto L_0x0081
        L_0x0008:
            char[] r2 = new char[r6]
            int r3 = r5 + r6
            r4.getChars(r5, r3, r2, r0)
            tb.q7h r6 = E(r2, r5, r6)
            if (r6 != 0) goto L_0x0080
            r6 = -1
            int r2 = r4.hashCode()
            switch(r2) {
                case -2035181974: goto L_0x006d;
                case -2035179184: goto L_0x0062;
                case -1328438272: goto L_0x0057;
                case -1173940224: goto L_0x004c;
                case 0: goto L_0x0041;
                case 3392903: goto L_0x0035;
                case 86814033: goto L_0x002a;
                case 1333954784: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            r0 = -1
            goto L_0x0076
        L_0x001f:
            java.lang.String r0 = "0000-00-00"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0028
            goto L_0x001d
        L_0x0028:
            r0 = 7
            goto L_0x0076
        L_0x002a:
            java.lang.String r0 = "0000年00月00日"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0033
            goto L_0x001d
        L_0x0033:
            r0 = 6
            goto L_0x0076
        L_0x0035:
            java.lang.String r0 = "null"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x003f
            goto L_0x001d
        L_0x003f:
            r0 = 5
            goto L_0x0076
        L_0x0041:
            java.lang.String r0 = ""
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x004a
            goto L_0x001d
        L_0x004a:
            r0 = 4
            goto L_0x0076
        L_0x004c:
            java.lang.String r0 = "00000000"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0055
            goto L_0x001d
        L_0x0055:
            r0 = 3
            goto L_0x0076
        L_0x0057:
            java.lang.String r0 = "000000000000"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0060
            goto L_0x001d
        L_0x0060:
            r0 = 2
            goto L_0x0076
        L_0x0062:
            java.lang.String r0 = "0000-00-0"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x006b
            goto L_0x001d
        L_0x006b:
            r0 = 1
            goto L_0x0076
        L_0x006d:
            java.lang.String r2 = "0000-0-00"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x0076
            goto L_0x001d
        L_0x0076:
            switch(r0) {
                case 0: goto L_0x007f;
                case 1: goto L_0x007f;
                case 2: goto L_0x007f;
                case 3: goto L_0x007f;
                case 4: goto L_0x007f;
                case 5: goto L_0x007f;
                case 6: goto L_0x007f;
                case 7: goto L_0x007f;
                default: goto L_0x0079;
            }
        L_0x0079:
            com.alibaba.fastjson2.time.DateTimeException r6 = new com.alibaba.fastjson2.time.DateTimeException
            r6.<init>(r4, r4, r5)
            throw r6
        L_0x007f:
            return r1
        L_0x0080:
            return r6
        L_0x0081:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.D(java.lang.String, int, int):tb.q7h");
    }
}
