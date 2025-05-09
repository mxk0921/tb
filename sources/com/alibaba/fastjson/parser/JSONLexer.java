package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import tb.ls9;
import tb.ohh;
import tb.pg1;
import tb.vu3;
import tb.wh6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class JSONLexer {
    public static final char[] CA;
    public static final int END = 4;
    public static final char EOI = 26;
    static final int[] IA;
    public static final int NOT_MATCH = -1;
    public static final int NOT_MATCH_NAME = -2;
    public static final int UNKNOWN = 0;
    private static boolean V6 = false;
    public static final int VALUE = 3;
    protected static final int[] digits;
    public static final boolean[] firstIdentifierFlags;
    public static final boolean[] identifierFlags;
    private static final ThreadLocal<char[]> sbufLocal;
    protected int bp;
    public Calendar calendar;
    protected char ch;
    public boolean disableCircularReferenceDetect;
    protected int eofPos;
    protected boolean exp;
    public int features;
    protected long fieldHash;
    protected boolean hasSpecial;
    protected boolean isDouble;
    protected final int len;
    public Locale locale;
    public int matchStat;
    protected int np;
    protected int pos;
    protected char[] sbuf;
    protected int sp;
    protected String stringDefaultValue;
    protected final String text;
    public TimeZone timeZone;
    protected int token;

    static {
        int i;
        boolean z;
        try {
            i = Class.forName("android.os.Build$VERSION").getField("SDK_INT").getInt(null);
        } catch (Exception unused) {
            i = -1;
        }
        char c = 0;
        if (i >= 23) {
            z = true;
        } else {
            z = false;
        }
        V6 = z;
        sbufLocal = new ThreadLocal<>();
        digits = new int[103];
        for (int i2 = 48; i2 <= 57; i2++) {
            digits[i2] = i2 - 48;
        }
        for (int i3 = 97; i3 <= 102; i3++) {
            digits[i3] = i3 - 87;
        }
        for (int i4 = 65; i4 <= 70; i4++) {
            digits[i4] = i4 - 55;
        }
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        CA = charArray;
        int[] iArr = new int[256];
        IA = iArr;
        Arrays.fill(iArr, -1);
        int length = charArray.length;
        for (int i5 = 0; i5 < length; i5++) {
            IA[CA[i5]] = i5;
        }
        IA[61] = 0;
        firstIdentifierFlags = new boolean[256];
        char c2 = 0;
        while (true) {
            boolean[] zArr = firstIdentifierFlags;
            if (c2 >= zArr.length) {
                break;
            }
            if (c2 >= 'A' && c2 <= 'Z') {
                zArr[c2] = true;
            } else if (c2 >= 'a' && c2 <= 'z') {
                zArr[c2] = true;
            } else if (c2 == '_') {
                zArr[c2] = true;
            }
            c2 = (char) (c2 + 1);
        }
        identifierFlags = new boolean[256];
        while (true) {
            boolean[] zArr2 = identifierFlags;
            if (c < zArr2.length) {
                if (c >= 'A' && c <= 'Z') {
                    zArr2[c] = true;
                } else if (c >= 'a' && c <= 'z') {
                    zArr2[c] = true;
                } else if (c == '_') {
                    zArr2[c] = true;
                } else if (c >= '0' && c <= '9') {
                    zArr2[c] = true;
                }
                c = (char) (c + 1);
            } else {
                return;
            }
        }
    }

    public JSONLexer(String str) {
        this(str, JSON.DEFAULT_PARSER_FEATURE);
    }

    public static boolean checkDate(char c, char c2, char c3, char c4, char c5, char c6, int i, int i2) {
        if (c >= '1' && c <= '3' && c2 >= '0' && c2 <= '9' && c3 >= '0' && c3 <= '9' && c4 >= '0' && c4 <= '9') {
            if (c5 == '0') {
                if (c6 < '1' || c6 > '9') {
                    return false;
                }
            } else if (!(c5 == '1' && (c6 == '0' || c6 == '1' || c6 == '2'))) {
                return false;
            }
            if (i == 48) {
                if (i2 < 49 || i2 > 57) {
                    return false;
                }
                return true;
            } else if (i == 49 || i == 50) {
                if (i2 >= 48 && i2 <= 57) {
                    return true;
                }
            } else if (i == 51 && (i2 == 48 || i2 == 49)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
        if (r5 <= '4') goto L_0x0020;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean checkTime(char r4, char r5, char r6, char r7, char r8, char r9) {
        /*
            r0 = 57
            r1 = 0
            r2 = 48
            if (r4 != r2) goto L_0x000c
            if (r5 < r2) goto L_0x000b
            if (r5 <= r0) goto L_0x0020
        L_0x000b:
            return r1
        L_0x000c:
            r3 = 49
            if (r4 != r3) goto L_0x0015
            if (r5 < r2) goto L_0x0014
            if (r5 <= r0) goto L_0x0020
        L_0x0014:
            return r1
        L_0x0015:
            r3 = 50
            if (r4 != r3) goto L_0x0042
            if (r5 < r2) goto L_0x0042
            r4 = 52
            if (r5 <= r4) goto L_0x0020
            goto L_0x0042
        L_0x0020:
            r4 = 54
            r5 = 53
            if (r6 < r2) goto L_0x002d
            if (r6 > r5) goto L_0x002d
            if (r7 < r2) goto L_0x002c
            if (r7 <= r0) goto L_0x0032
        L_0x002c:
            return r1
        L_0x002d:
            if (r6 != r4) goto L_0x0042
            if (r7 == r2) goto L_0x0032
            return r1
        L_0x0032:
            if (r8 < r2) goto L_0x003b
            if (r8 > r5) goto L_0x003b
            if (r9 < r2) goto L_0x003a
            if (r9 <= r0) goto L_0x0040
        L_0x003a:
            return r1
        L_0x003b:
            if (r8 != r4) goto L_0x0042
            if (r9 == r2) goto L_0x0040
            return r1
        L_0x0040:
            r4 = 1
            return r4
        L_0x0042:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.checkTime(char, char, char, char, char, char):boolean");
    }

    public static final byte[] decodeFast(String str, int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (i2 == 0) {
            return new byte[0];
        }
        int i6 = (i + i2) - 1;
        int i7 = i;
        while (i7 < i6 && IA[str.charAt(i7)] < 0) {
            i7++;
        }
        while (i6 > 0 && IA[str.charAt(i6)] < 0) {
            i6--;
        }
        if (str.charAt(i6) != '=') {
            i3 = 0;
        } else if (str.charAt(i6 - 1) == '=') {
            i3 = 2;
        } else {
            i3 = 1;
        }
        int i8 = (i6 - i7) + 1;
        if (i2 > 76) {
            if (str.charAt(76) == '\r') {
                i5 = i8 / 78;
            } else {
                i5 = 0;
            }
            i4 = i5 << 1;
        } else {
            i4 = 0;
        }
        int i9 = (((i8 - i4) * 6) >> 3) - i3;
        byte[] bArr = new byte[i9];
        int i10 = (i9 / 3) * 3;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            int[] iArr = IA;
            int i13 = i7 + 4;
            int i14 = iArr[str.charAt(i7 + 3)] | (iArr[str.charAt(i7 + 1)] << 12) | (iArr[str.charAt(i7)] << 18) | (iArr[str.charAt(i7 + 2)] << 6);
            bArr[i11] = (byte) (i14 >> 16);
            int i15 = i11 + 2;
            bArr[i11 + 1] = (byte) (i14 >> 8);
            i11 += 3;
            bArr[i15] = (byte) i14;
            if (i4 <= 0 || (i12 = i12 + 1) != 19) {
                i7 = i13;
            } else {
                i7 += 6;
                i12 = 0;
            }
        }
        if (i11 < i9) {
            int i16 = 0;
            int i17 = 0;
            while (i7 <= i6 - i3) {
                i16 |= IA[str.charAt(i7)] << (18 - (i17 * 6));
                i17++;
                i7++;
            }
            int i18 = 16;
            while (i11 < i9) {
                bArr[i11] = (byte) (i16 >> i18);
                i18 -= 8;
                i11++;
            }
        }
        return bArr;
    }

    private void scanIdent() {
        this.np = this.bp - 1;
        this.hasSpecial = false;
        do {
            this.sp++;
            next();
        } while (Character.isLetterOrDigit(this.ch));
        String stringVal = stringVal();
        if (stringVal.equals("null")) {
            this.token = 8;
        } else if (stringVal.equals("true")) {
            this.token = 6;
        } else if (stringVal.equals("false")) {
            this.token = 7;
        } else if (stringVal.equals("new")) {
            this.token = 9;
        } else if (stringVal.equals("undefined")) {
            this.token = 23;
        } else if (stringVal.equals(pg1.ATOM_Set)) {
            this.token = 21;
        } else if (stringVal.equals("TreeSet")) {
            this.token = 22;
        } else {
            this.token = 18;
        }
    }

    private void setCalendar(char c, char c2, char c3, char c4, char c5, char c6, char c7, char c8) {
        Calendar instance = Calendar.getInstance(this.timeZone, this.locale);
        this.calendar = instance;
        instance.set(1, ((c - '0') * 1000) + ((c2 - '0') * 100) + ((c3 - '0') * 10) + (c4 - '0'));
        this.calendar.set(2, (((c5 - '0') * 10) + (c6 - '0')) - 1);
        this.calendar.set(5, ((c7 - '0') * 10) + (c8 - '0'));
    }

    private final String subString(int i, int i2) {
        char[] cArr = this.sbuf;
        if (i2 < cArr.length) {
            this.text.getChars(i, i + i2, cArr, 0);
            return new String(this.sbuf, 0, i2);
        }
        char[] cArr2 = new char[i2];
        this.text.getChars(i, i2 + i, cArr2, 0);
        return new String(cArr2);
    }

    public byte[] bytesValue() {
        return decodeFast(this.text, this.np + 1, this.sp);
    }

    public char charAt(int i) {
        if (i >= this.len) {
            return EOI;
        }
        return this.text.charAt(i);
    }

    public void close() {
        char[] cArr = this.sbuf;
        if (cArr.length <= 8196) {
            sbufLocal.set(cArr);
        }
        this.sbuf = null;
    }

    public final void config(Feature feature, boolean z) {
        boolean z2;
        String str;
        if (z) {
            this.features |= feature.mask;
        } else {
            this.features &= ~feature.mask;
        }
        if (feature == Feature.InitStringFieldAsEmpty) {
            if (z) {
                str = "";
            } else {
                str = null;
            }
            this.stringDefaultValue = str;
        }
        if ((this.features & Feature.DisableCircularReferenceDetect.mask) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.disableCircularReferenceDetect = z2;
    }

    public final Number decimalValue(boolean z) {
        char[] cArr;
        boolean z2;
        int i = (this.np + this.sp) - 1;
        char charAt = i >= this.len ? EOI : this.text.charAt(i);
        try {
            if (charAt == 'F') {
                return Float.valueOf(Float.parseFloat(numberString()));
            }
            if (charAt == 'D') {
                return Double.valueOf(Double.parseDouble(numberString()));
            }
            if (z) {
                return decimalValue();
            }
            char charAt2 = this.text.charAt((this.np + this.sp) - 1);
            int i2 = this.sp;
            if (charAt2 == 'L' || charAt2 == 'S' || charAt2 == 'B' || charAt2 == 'F' || charAt2 == 'D') {
                i2--;
            }
            int i3 = this.np;
            char[] cArr2 = this.sbuf;
            int i4 = 0;
            if (i2 < cArr2.length) {
                this.text.getChars(i3, i3 + i2, cArr2, 0);
                cArr = this.sbuf;
            } else {
                char[] cArr3 = new char[i2];
                this.text.getChars(i3, i3 + i2, cArr3, 0);
                cArr = cArr3;
            }
            if (i2 > 9 || this.exp) {
                return Double.valueOf(Double.parseDouble(new String(cArr, 0, i2)));
            }
            char c = cArr[0];
            int i5 = 2;
            if (c == '-') {
                c = cArr[1];
                z2 = true;
            } else if (c == '+') {
                c = cArr[1];
                z2 = false;
            } else {
                z2 = false;
                i5 = 1;
            }
            int i6 = c - '0';
            while (i5 < i2) {
                char c2 = cArr[i5];
                if (c2 == '.') {
                    i4 = 1;
                } else {
                    i6 = (i6 * 10) + (c2 - '0');
                    if (i4 != 0) {
                        i4 *= 10;
                    }
                }
                i5++;
            }
            double d = i6 / i4;
            if (z2) {
                d = -d;
            }
            return Double.valueOf(d);
        } catch (NumberFormatException e) {
            throw new JSONException(e.getMessage() + ", " + info());
        }
    }

    public String info() {
        String str;
        StringBuilder sb = new StringBuilder("pos ");
        sb.append(this.bp);
        sb.append(", json : ");
        if (this.len < 65536) {
            str = this.text;
        } else {
            str = this.text.substring(0, 65536);
        }
        sb.append(str);
        return sb.toString();
    }

    public final int intValue() {
        char c;
        boolean z;
        int i;
        char c2;
        char c3;
        int i2 = this.np;
        int i3 = this.sp + i2;
        if (i2 >= this.len) {
            c = EOI;
        } else {
            c = this.text.charAt(i2);
        }
        int i4 = 0;
        if (c == '-') {
            i2++;
            i = Integer.MIN_VALUE;
            z = true;
        } else {
            i = -2147483647;
            z = false;
        }
        if (i2 < i3) {
            int i5 = i2 + 1;
            if (i2 >= this.len) {
                c3 = EOI;
            } else {
                c3 = this.text.charAt(i2);
            }
            i4 = -(c3 - '0');
            i2 = i5;
        }
        while (i2 < i3) {
            int i6 = i2 + 1;
            if (i2 >= this.len) {
                c2 = EOI;
            } else {
                c2 = this.text.charAt(i2);
            }
            if (c2 == 'L' || c2 == 'S' || c2 == 'B') {
                i2 = i6;
                break;
            }
            int i7 = c2 - '0';
            if (i4 >= -214748364) {
                int i8 = i4 * 10;
                if (i8 >= i + i7) {
                    i4 = i8 - i7;
                    i2 = i6;
                } else {
                    throw new NumberFormatException(numberString());
                }
            } else {
                throw new NumberFormatException(numberString());
            }
        }
        if (!z) {
            return -i4;
        }
        if (i2 > this.np + 1) {
            return i4;
        }
        throw new NumberFormatException(numberString());
    }

    public final Number integerValue() throws NumberFormatException {
        char c;
        char c2;
        char c3;
        long j;
        boolean z;
        long j2;
        char c4;
        char c5;
        int i = this.np;
        int i2 = this.sp + i;
        int i3 = i2 - 1;
        if (i3 >= this.len) {
            c = EOI;
        } else {
            c = this.text.charAt(i3);
        }
        if (c == 'B') {
            i2--;
            c2 = 'B';
        } else if (c == 'L') {
            i2--;
            c2 = ohh.LEVEL_L;
        } else if (c != 'S') {
            c2 = ' ';
        } else {
            i2--;
            c2 = 'S';
        }
        int i4 = this.np;
        if (i4 >= this.len) {
            c3 = EOI;
        } else {
            c3 = this.text.charAt(i4);
        }
        if (c3 == '-') {
            i++;
            j = Long.MIN_VALUE;
            z = true;
        } else {
            z = false;
            j = -9223372036854775807L;
        }
        if (i < i2) {
            int i5 = i + 1;
            if (i >= this.len) {
                c5 = EOI;
            } else {
                c5 = this.text.charAt(i);
            }
            j2 = -(c5 - '0');
            i = i5;
        } else {
            j2 = 0;
        }
        while (i < i2) {
            int i6 = i + 1;
            if (i >= this.len) {
                c4 = EOI;
            } else {
                c4 = this.text.charAt(i);
            }
            int i7 = c4 - '0';
            if (j2 < -922337203685477580L) {
                return new BigInteger(numberString());
            }
            long j3 = j2 * 10;
            long j4 = i7;
            if (j3 < j + j4) {
                return new BigInteger(numberString());
            }
            j2 = j3 - j4;
            i = i6;
        }
        if (!z) {
            long j5 = -j2;
            if (j5 > 2147483647L || c2 == 'L') {
                return Long.valueOf(j5);
            }
            if (c2 == 'S') {
                return Short.valueOf((short) j5);
            }
            if (c2 == 'B') {
                return Byte.valueOf((byte) j5);
            }
            return Integer.valueOf((int) j5);
        } else if (i <= this.np + 1) {
            throw new NumberFormatException(numberString());
        } else if (j2 < -2147483648L || c2 == 'L') {
            return Long.valueOf(j2);
        } else {
            if (c2 == 'S') {
                return Short.valueOf((short) j2);
            }
            if (c2 == 'B') {
                return Byte.valueOf((byte) j2);
            }
            return Integer.valueOf((int) j2);
        }
    }

    public final boolean isBlankInput() {
        int i = 0;
        while (true) {
            char charAt = charAt(i);
            if (charAt == 26) {
                return true;
            }
            if (charAt > ' ' || !(charAt == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t' || charAt == '\f' || charAt == '\b')) {
                break;
            }
            i++;
        }
        return false;
    }

    public final boolean isEnabled(Feature feature) {
        if ((feature.mask & this.features) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x005f -> B:8:0x0027). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long longValue() throws java.lang.NumberFormatException {
        /*
            r13 = this;
            int r0 = r13.np
            int r1 = r13.sp
            int r1 = r1 + r0
            char r2 = r13.charAt(r0)
            r3 = 45
            r4 = 1
            if (r2 != r3) goto L_0x0015
            int r0 = r0 + 1
            r2 = -9223372036854775808
            r5 = r2
            r2 = 1
            goto L_0x001b
        L_0x0015:
            r2 = 0
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x001b:
            if (r0 >= r1) goto L_0x0029
            int r3 = r0 + 1
            char r0 = r13.charAt(r0)
            int r0 = r0 + (-48)
            int r0 = -r0
            long r7 = (long) r0
        L_0x0027:
            r0 = r3
            goto L_0x002b
        L_0x0029:
            r7 = 0
        L_0x002b:
            if (r0 >= r1) goto L_0x0076
            int r3 = r0 + 1
            int r9 = r13.len
            if (r0 < r9) goto L_0x0036
            r0 = 26
            goto L_0x003c
        L_0x0036:
            java.lang.String r9 = r13.text
            char r0 = r9.charAt(r0)
        L_0x003c:
            r9 = 76
            if (r0 == r9) goto L_0x0075
            r9 = 83
            if (r0 == r9) goto L_0x0075
            r9 = 66
            if (r0 != r9) goto L_0x0049
            goto L_0x0075
        L_0x0049:
            int r0 = r0 + (-48)
            r9 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x006b
            r9 = 10
            long r7 = r7 * r9
            long r9 = (long) r0
            long r11 = r5 + r9
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x0061
            long r7 = r7 - r9
            goto L_0x0027
        L_0x0061:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = r13.numberString()
            r0.<init>(r1)
            throw r0
        L_0x006b:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = r13.numberString()
            r0.<init>(r1)
            throw r0
        L_0x0075:
            r0 = r3
        L_0x0076:
            if (r2 == 0) goto L_0x0088
            int r1 = r13.np
            int r1 = r1 + r4
            if (r0 <= r1) goto L_0x007e
            return r7
        L_0x007e:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = r13.numberString()
            r0.<init>(r1)
            throw r0
        L_0x0088:
            long r0 = -r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.longValue():long");
    }

    public char next() {
        char c;
        int i = this.bp + 1;
        this.bp = i;
        if (i >= this.len) {
            c = EOI;
        } else {
            c = this.text.charAt(i);
        }
        this.ch = c;
        return c;
    }

    public final void nextIdent() {
        char c;
        while (true) {
            c = this.ch;
            if (c > ' ' || !(c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == '\f' || c == '\b')) {
                break;
            }
            next();
        }
        if (c == '_' || Character.isLetter(c)) {
            scanIdent();
        } else {
            nextToken();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
        scanNumber();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002a, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a1, code lost:
        if (r16.token == 20) goto L_0x00ac;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a3, code lost:
        r16.token = 20;
        r1 = r16.eofPos;
        r16.bp = r1;
        r16.pos = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ab, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b3, code lost:
        throw new com.alibaba.fastjson.JSONException("EOF error");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0100, code lost:
        scanIdent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0103, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void nextToken() {
        /*
            Method dump skipped, instructions count: 504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.nextToken():void");
    }

    public final String numberString() {
        char charAt = this.text.charAt((this.np + this.sp) - 1);
        int i = this.sp;
        if (charAt == 'L' || charAt == 'S' || charAt == 'B' || charAt == 'F' || charAt == 'D') {
            i--;
        }
        return subString(this.np, i);
    }

    public boolean scanBoolean() {
        int i;
        boolean z = false;
        if (this.text.startsWith("false", this.bp)) {
            i = 5;
        } else {
            if (this.text.startsWith("true", this.bp)) {
                i = 4;
            } else {
                char c = this.ch;
                if (c == '1') {
                    i = 1;
                } else if (c == '0') {
                    i = 1;
                } else {
                    this.matchStat = -1;
                    return false;
                }
            }
            z = true;
        }
        int i2 = this.bp + i;
        this.bp = i2;
        this.ch = charAt(i2);
        return z;
    }

    public final double scanFieldDouble(long j) {
        boolean z;
        int i;
        char charAt;
        int i2;
        boolean z2;
        double d;
        int i3;
        char charAt2;
        this.matchStat = 0;
        int matchFieldHash = matchFieldHash(j);
        if (matchFieldHash == 0) {
            return vu3.b.GEO_NOT_SUPPORT;
        }
        int i4 = matchFieldHash + 1;
        char charAt3 = charAt(this.bp + matchFieldHash);
        int i5 = this.bp;
        int i6 = (i5 + i4) - 1;
        if (charAt3 == '-') {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            charAt3 = charAt(i5 + i4);
            i4 = matchFieldHash + 2;
        }
        if (charAt3 < '0' || charAt3 > '9') {
            this.matchStat = -1;
            return vu3.b.GEO_NOT_SUPPORT;
        }
        int i7 = charAt3 - '0';
        while (true) {
            i = i4 + 1;
            charAt = charAt(this.bp + i4);
            if (charAt < '0' || charAt > '9') {
                break;
            }
            i7 = (i7 * 10) + (charAt - '0');
            i4 = i;
        }
        if (charAt == '.') {
            int i8 = i4 + 2;
            char charAt4 = charAt(this.bp + i);
            if (charAt4 < '0' || charAt4 > '9') {
                this.matchStat = -1;
                return vu3.b.GEO_NOT_SUPPORT;
            }
            i7 = (i7 * 10) + (charAt4 - '0');
            int i9 = 10;
            while (true) {
                i3 = i8 + 1;
                charAt2 = charAt(this.bp + i8);
                if (charAt2 < '0' || charAt2 > '9') {
                    break;
                }
                i7 = (i7 * 10) + (charAt2 - '0');
                i9 *= 10;
                i8 = i3;
            }
            i = i3;
            charAt = charAt2;
            i2 = i9;
        } else {
            i2 = 1;
        }
        if (charAt == 'e' || charAt == 'E') {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            int i10 = i + 1;
            charAt = charAt(this.bp + i);
            if (charAt == '+' || charAt == '-') {
                i += 2;
                charAt = charAt(this.bp + i10);
            } else {
                i = i10;
            }
            while (charAt >= '0' && charAt <= '9') {
                charAt = charAt(this.bp + i);
                i++;
            }
        }
        int i11 = ((this.bp + i) - i6) - 1;
        if (z2 || i11 >= 10) {
            d = Double.parseDouble(subString(i6, i11));
        } else {
            d = i7 / i2;
            if (z) {
                d = -d;
            }
        }
        if (charAt == ',') {
            this.bp += i - 1;
            next();
            this.matchStat = 3;
            this.token = 16;
            return d;
        } else if (charAt == '}') {
            char charAt5 = charAt(this.bp + i);
            if (charAt5 == ',') {
                this.token = 16;
                this.bp += i;
                next();
            } else if (charAt5 == ']') {
                this.token = 15;
                this.bp += i;
                next();
            } else if (charAt5 == '}') {
                this.token = 13;
                this.bp += i;
                next();
            } else if (charAt5 == 26) {
                this.bp += i;
                this.token = 20;
                this.ch = EOI;
            } else {
                this.matchStat = -1;
                return vu3.b.GEO_NOT_SUPPORT;
            }
            this.matchStat = 4;
            return d;
        } else {
            this.matchStat = -1;
            return vu3.b.GEO_NOT_SUPPORT;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x0232, code lost:
        r19.matchStat = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0234, code lost:
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0121 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0130  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x011e -> B:84:0x011f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final double[] scanFieldDoubleArray(long r20) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.scanFieldDoubleArray(long):double[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x029e, code lost:
        r20.matchStat = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02a1, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ef, code lost:
        r20.matchStat = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f1, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final double[][] scanFieldDoubleArray2(long r21) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.scanFieldDoubleArray2(long):double[][]");
    }

    public final float scanFieldFloat(long j) {
        boolean z;
        int i;
        char charAt;
        int i2;
        float f;
        int i3;
        char charAt2;
        boolean z2 = false;
        this.matchStat = 0;
        int matchFieldHash = matchFieldHash(j);
        if (matchFieldHash == 0) {
            return 0.0f;
        }
        int i4 = matchFieldHash + 1;
        char charAt3 = charAt(this.bp + matchFieldHash);
        int i5 = this.bp;
        int i6 = (i5 + i4) - 1;
        if (charAt3 == '-') {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            charAt3 = charAt(i5 + i4);
            i4 = matchFieldHash + 2;
        }
        if (charAt3 < '0' || charAt3 > '9') {
            this.matchStat = -1;
            return 0.0f;
        }
        int i7 = charAt3 - '0';
        while (true) {
            i = i4 + 1;
            charAt = charAt(this.bp + i4);
            if (charAt < '0' || charAt > '9') {
                break;
            }
            i7 = (i7 * 10) + (charAt - '0');
            i4 = i;
        }
        if (charAt == '.') {
            int i8 = i4 + 2;
            char charAt4 = charAt(this.bp + i);
            if (charAt4 < '0' || charAt4 > '9') {
                this.matchStat = -1;
                return 0.0f;
            }
            i7 = (i7 * 10) + (charAt4 - '0');
            int i9 = 10;
            while (true) {
                i3 = i8 + 1;
                charAt2 = charAt(this.bp + i8);
                if (charAt2 < '0' || charAt2 > '9') {
                    break;
                }
                i7 = (i7 * 10) + (charAt2 - '0');
                i9 *= 10;
                i8 = i3;
            }
            i = i3;
            charAt = charAt2;
            i2 = i9;
        } else {
            i2 = 1;
        }
        if (charAt == 'e' || charAt == 'E') {
            z2 = true;
        }
        if (z2) {
            int i10 = i + 1;
            charAt = charAt(this.bp + i);
            if (charAt == '+' || charAt == '-') {
                i += 2;
                charAt = charAt(this.bp + i10);
            } else {
                i = i10;
            }
            while (charAt >= '0' && charAt <= '9') {
                charAt = charAt(this.bp + i);
                i++;
            }
        }
        int i11 = ((this.bp + i) - i6) - 1;
        if (z2 || i11 >= 10) {
            f = Float.parseFloat(subString(i6, i11));
        } else {
            f = i7 / i2;
            if (z) {
                f = -f;
            }
        }
        if (charAt == ',') {
            this.bp += i - 1;
            next();
            this.matchStat = 3;
            this.token = 16;
            return f;
        } else if (charAt == '}') {
            char charAt5 = charAt(this.bp + i);
            if (charAt5 == ',') {
                this.token = 16;
                this.bp += i;
                next();
            } else if (charAt5 == ']') {
                this.token = 15;
                this.bp += i;
                next();
            } else if (charAt5 == '}') {
                this.token = 13;
                this.bp += i;
                next();
            } else if (charAt5 == 26) {
                this.bp += i;
                this.token = 20;
                this.ch = EOI;
            } else {
                this.matchStat = -1;
                return 0.0f;
            }
            this.matchStat = 4;
            return f;
        } else {
            this.matchStat = -1;
            return 0.0f;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00db, code lost:
        r19.matchStat = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00dd, code lost:
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0121 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0130  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x011e -> B:84:0x011f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float[] scanFieldFloatArray(long r20) {
        /*
            Method dump skipped, instructions count: 559
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.scanFieldFloatArray(long):float[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x029a, code lost:
        r20.matchStat = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x029d, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ef, code lost:
        r20.matchStat = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f1, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float[][] scanFieldFloatArray2(long r21) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.scanFieldFloatArray2(long):float[][]");
    }

    public int scanFieldInt(long j) {
        char c;
        boolean z;
        boolean z2;
        int i;
        char c2;
        this.matchStat = 0;
        int matchFieldHash = matchFieldHash(j);
        if (matchFieldHash == 0) {
            return 0;
        }
        int i2 = matchFieldHash + 1;
        int i3 = this.bp + matchFieldHash;
        int i4 = this.len;
        char c3 = EOI;
        if (i3 >= i4) {
            c = EOI;
        } else {
            c = this.text.charAt(i3);
        }
        if (c == '\"') {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i5 = matchFieldHash + 2;
            int i6 = this.bp + i2;
            if (i6 >= this.len) {
                c = EOI;
            } else {
                c = this.text.charAt(i6);
            }
            i2 = i5;
            z = true;
        }
        if (c == '-') {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            int i7 = i2 + 1;
            int i8 = this.bp + i2;
            if (i8 >= this.len) {
                c = EOI;
            } else {
                c = this.text.charAt(i8);
            }
            i2 = i7;
        }
        if (c < '0' || c > '9') {
            this.matchStat = -1;
            return 0;
        }
        int i9 = c - '0';
        while (true) {
            i = i2 + 1;
            int i10 = this.bp + i2;
            if (i10 >= this.len) {
                c2 = EOI;
            } else {
                c2 = this.text.charAt(i10);
            }
            if (c2 < '0' || c2 > '9') {
                break;
            }
            i9 = (i9 * 10) + (c2 - '0');
            i2 = i;
        }
        if (c2 == '.') {
            this.matchStat = -1;
            return 0;
        }
        if (c2 == '\"') {
            if (!z) {
                this.matchStat = -1;
                return 0;
            }
            int i11 = i2 + 2;
            int i12 = this.bp + i;
            if (i12 >= this.len) {
                c2 = EOI;
            } else {
                c2 = this.text.charAt(i12);
            }
            i = i11;
        }
        if (i9 < 0) {
            this.matchStat = -1;
            return 0;
        }
        while (c2 != ',') {
            if (c2 <= ' ' && (c2 == ' ' || c2 == '\n' || c2 == '\r' || c2 == '\t' || c2 == '\f' || c2 == '\b')) {
                int i13 = i + 1;
                int i14 = this.bp + i;
                if (i14 >= this.len) {
                    c2 = EOI;
                } else {
                    c2 = this.text.charAt(i14);
                }
                i = i13;
            } else if (c2 == '}') {
                char charAt = charAt(this.bp + i);
                if (charAt == ',') {
                    this.token = 16;
                    int i15 = this.bp + i + 1;
                    this.bp = i15;
                    if (i15 < this.len) {
                        c3 = this.text.charAt(i15);
                    }
                    this.ch = c3;
                } else if (charAt == ']') {
                    this.token = 15;
                    int i16 = this.bp + i + 1;
                    this.bp = i16;
                    if (i16 < this.len) {
                        c3 = this.text.charAt(i16);
                    }
                    this.ch = c3;
                } else if (charAt == '}') {
                    this.token = 13;
                    int i17 = this.bp + i + 1;
                    this.bp = i17;
                    if (i17 < this.len) {
                        c3 = this.text.charAt(i17);
                    }
                    this.ch = c3;
                } else if (charAt == 26) {
                    this.token = 20;
                    this.bp += i;
                    this.ch = EOI;
                } else {
                    this.matchStat = -1;
                    return 0;
                }
                this.matchStat = 4;
                if (z2) {
                    return -i9;
                }
                return i9;
            } else {
                this.matchStat = -1;
                return 0;
            }
        }
        int i18 = this.bp + (i - 1) + 1;
        this.bp = i18;
        if (i18 < this.len) {
            c3 = this.text.charAt(i18);
        }
        this.ch = c3;
        this.matchStat = 3;
        this.token = 16;
        if (z2) {
            return -i9;
        }
        return i9;
    }

    public final int[] scanFieldIntArray(long j) {
        char c;
        char c2;
        char c3;
        int i;
        int i2;
        boolean z;
        int[] iArr;
        int i3;
        int i4;
        char c4;
        char c5;
        char c6;
        this.matchStat = 0;
        int matchFieldHash = matchFieldHash(j);
        int[] iArr2 = null;
        if (matchFieldHash == 0) {
            return null;
        }
        int i5 = matchFieldHash + 1;
        int i6 = this.bp + matchFieldHash;
        if (i6 >= this.len) {
            c = EOI;
        } else {
            c = this.text.charAt(i6);
        }
        if (c != '[') {
            this.matchStat = -1;
            return null;
        }
        int i7 = matchFieldHash + 2;
        int i8 = this.bp + i5;
        if (i8 >= this.len) {
            c2 = EOI;
        } else {
            c2 = this.text.charAt(i8);
        }
        int[] iArr3 = new int[16];
        if (c2 == ']') {
            i2 = matchFieldHash + 3;
            int i9 = this.bp + i7;
            if (i9 >= this.len) {
                c3 = EOI;
            } else {
                c3 = this.text.charAt(i9);
            }
            i = 0;
        } else {
            int i10 = 0;
            while (true) {
                if (c2 == '-') {
                    int i11 = i7 + 1;
                    int i12 = this.bp + i7;
                    if (i12 >= this.len) {
                        c2 = EOI;
                    } else {
                        c2 = this.text.charAt(i12);
                    }
                    i7 = i11;
                    z = true;
                } else {
                    z = false;
                }
                if (c2 >= '0') {
                    if (c2 > '9') {
                        i3 = -1;
                        iArr = null;
                        break;
                    }
                    int i13 = c2 - '0';
                    while (true) {
                        i4 = i7 + 1;
                        int i14 = this.bp + i7;
                        if (i14 >= this.len) {
                            c4 = EOI;
                        } else {
                            c4 = this.text.charAt(i14);
                        }
                        if (c4 < '0' || c4 > '9') {
                            break;
                        }
                        i13 = (i13 * 10) + (c4 - '0');
                        i7 = i4;
                    }
                    if (i10 >= iArr3.length) {
                        int[] iArr4 = new int[(iArr3.length * 3) / 2];
                        System.arraycopy(iArr3, 0, iArr4, 0, i10);
                        iArr3 = iArr4;
                    }
                    i = i10 + 1;
                    if (z) {
                        i13 = -i13;
                    }
                    iArr3[i10] = i13;
                    if (c4 == ',') {
                        int i15 = i7 + 2;
                        int i16 = this.bp + i4;
                        if (i16 >= this.len) {
                            c6 = EOI;
                        } else {
                            c6 = this.text.charAt(i16);
                        }
                        c4 = c6;
                        i4 = i15;
                    } else if (c4 == ']') {
                        int i17 = i7 + 2;
                        int i18 = this.bp + i4;
                        if (i18 >= this.len) {
                            c5 = EOI;
                        } else {
                            c5 = this.text.charAt(i18);
                        }
                        c3 = c5;
                        i2 = i17;
                    }
                    i10 = i;
                    iArr2 = null;
                    c2 = c4;
                    i7 = i4;
                } else {
                    iArr = iArr2;
                    i3 = -1;
                    break;
                }
            }
            this.matchStat = i3;
            return iArr;
        }
        if (i != iArr3.length) {
            int[] iArr5 = new int[i];
            System.arraycopy(iArr3, 0, iArr5, 0, i);
            iArr3 = iArr5;
        }
        if (c3 == ',') {
            this.bp += i2 - 1;
            next();
            this.matchStat = 3;
            this.token = 16;
            return iArr3;
        } else if (c3 == '}') {
            char charAt = charAt(this.bp + i2);
            if (charAt == ',') {
                this.token = 16;
                this.bp += i2;
                next();
            } else if (charAt == ']') {
                this.token = 15;
                this.bp += i2;
                next();
            } else if (charAt == '}') {
                this.token = 13;
                this.bp += i2;
                next();
            } else if (charAt == 26) {
                this.bp += i2;
                this.token = 20;
                this.ch = EOI;
            } else {
                this.matchStat = -1;
                return null;
            }
            this.matchStat = 4;
            return iArr3;
        } else {
            this.matchStat = -1;
            return null;
        }
    }

    public long scanFieldLong(long j) {
        char c;
        boolean z;
        int i;
        char c2;
        char c3;
        char c4;
        char c5;
        char c6;
        char c7;
        boolean z2 = false;
        this.matchStat = 0;
        int matchFieldHash = matchFieldHash(j);
        if (matchFieldHash == 0) {
            return 0L;
        }
        int i2 = matchFieldHash + 1;
        int i3 = this.bp + matchFieldHash;
        if (i3 >= this.len) {
            c = EOI;
        } else {
            c = this.text.charAt(i3);
        }
        if (c == '\"') {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i4 = matchFieldHash + 2;
            int i5 = this.bp + i2;
            if (i5 >= this.len) {
                c = EOI;
            } else {
                c = this.text.charAt(i5);
            }
            i2 = i4;
        }
        if (c == '-') {
            z2 = true;
        }
        if (z2) {
            int i6 = i2 + 1;
            int i7 = this.bp + i2;
            if (i7 >= this.len) {
                c7 = EOI;
            } else {
                c7 = this.text.charAt(i7);
            }
            i2 = i6;
            c = c7;
        }
        if (c < '0' || c > '9') {
            this.matchStat = -1;
            return 0L;
        }
        long j2 = c - '0';
        while (true) {
            i = i2 + 1;
            int i8 = this.bp + i2;
            if (i8 >= this.len) {
                c2 = EOI;
            } else {
                c2 = this.text.charAt(i8);
            }
            if (c2 < '0' || c2 > '9') {
                break;
            }
            j2 = (j2 * 10) + (c2 - '0');
            i2 = i;
        }
        if (c2 == '.') {
            this.matchStat = -1;
            return 0L;
        }
        if (c2 == '\"') {
            if (!z) {
                this.matchStat = -1;
                return 0L;
            }
            int i9 = i2 + 2;
            int i10 = this.bp + i;
            if (i10 >= this.len) {
                c2 = EOI;
            } else {
                c2 = this.text.charAt(i10);
            }
            i = i9;
        }
        if (j2 < 0) {
            this.matchStat = -1;
            return 0L;
        } else if (c2 == ',') {
            int i11 = this.bp + (i - 1) + 1;
            this.bp = i11;
            if (i11 >= this.len) {
                c6 = EOI;
            } else {
                c6 = this.text.charAt(i11);
            }
            this.ch = c6;
            this.matchStat = 3;
            this.token = 16;
            if (z2) {
                return -j2;
            }
            return j2;
        } else if (c2 == '}') {
            char charAt = charAt(this.bp + i);
            if (charAt == ',') {
                this.token = 16;
                int i12 = this.bp + i + 1;
                this.bp = i12;
                if (i12 >= this.len) {
                    c5 = EOI;
                } else {
                    c5 = this.text.charAt(i12);
                }
                this.ch = c5;
            } else if (charAt == ']') {
                this.token = 15;
                int i13 = this.bp + i + 1;
                this.bp = i13;
                if (i13 >= this.len) {
                    c4 = EOI;
                } else {
                    c4 = this.text.charAt(i13);
                }
                this.ch = c4;
            } else if (charAt == '}') {
                this.token = 13;
                int i14 = this.bp + i + 1;
                this.bp = i14;
                if (i14 >= this.len) {
                    c3 = EOI;
                } else {
                    c3 = this.text.charAt(i14);
                }
                this.ch = c3;
            } else if (charAt == 26) {
                this.token = 20;
                this.bp += i;
                this.ch = EOI;
            } else {
                this.matchStat = -1;
                return 0L;
            }
            this.matchStat = 4;
            if (z2) {
                return -j2;
            }
            return j2;
        } else {
            this.matchStat = -1;
            return 0L;
        }
    }

    public long scanFieldSymbol(long j) {
        char c;
        char c2;
        char c3;
        char c4;
        this.matchStat = 0;
        int matchFieldHash = matchFieldHash(j);
        if (matchFieldHash == 0) {
            return 0L;
        }
        int i = matchFieldHash + 1;
        int i2 = this.bp + matchFieldHash;
        int i3 = this.len;
        char c5 = EOI;
        if (i2 >= i3) {
            c = EOI;
        } else {
            c = this.text.charAt(i2);
        }
        if (c != '\"') {
            this.matchStat = -1;
            return 0L;
        }
        long j2 = ls9.MAGIC_HASH_CODE;
        while (true) {
            int i4 = i + 1;
            int i5 = this.bp + i;
            if (i5 >= this.len) {
                c2 = EOI;
            } else {
                c2 = this.text.charAt(i5);
            }
            if (c2 == '\"') {
                int i6 = i + 2;
                int i7 = this.bp + i4;
                if (i7 >= this.len) {
                    c3 = EOI;
                } else {
                    c3 = this.text.charAt(i7);
                }
                if (c3 == ',') {
                    int i8 = this.bp + i + 1 + 1;
                    this.bp = i8;
                    if (i8 < this.len) {
                        c5 = this.text.charAt(i8);
                    }
                    this.ch = c5;
                    this.matchStat = 3;
                    return j2;
                } else if (c3 == '}') {
                    int i9 = this.bp + i6;
                    if (i9 >= this.len) {
                        c4 = EOI;
                    } else {
                        c4 = this.text.charAt(i9);
                    }
                    if (c4 == ',') {
                        this.token = 16;
                        this.bp += i + 2;
                        next();
                    } else if (c4 == ']') {
                        this.token = 15;
                        this.bp += i + 2;
                        next();
                    } else if (c4 == '}') {
                        this.token = 13;
                        this.bp += i + 2;
                        next();
                    } else if (c4 == 26) {
                        this.token = 20;
                        this.bp += i + 2;
                        this.ch = EOI;
                    } else {
                        this.matchStat = -1;
                        return 0L;
                    }
                    this.matchStat = 4;
                    return j2;
                } else {
                    this.matchStat = -1;
                    return 0L;
                }
            } else {
                j2 = (j2 ^ c2) * ls9.MAGIC_PRIME;
                if (c2 == '\\') {
                    this.matchStat = -1;
                    return 0L;
                }
                i = i4;
            }
        }
    }

    public boolean scanISO8601DateIfMatch(boolean z) {
        return scanISO8601DateIfMatch(z, this.len - this.bp);
    }

    public final void scanNumber() {
        char c;
        char c2;
        char c3;
        char c4;
        char c5;
        char c6;
        char c7;
        char c8;
        char c9;
        int i = this.bp;
        this.np = i;
        this.exp = false;
        if (this.ch == '-') {
            this.sp++;
            int i2 = i + 1;
            this.bp = i2;
            if (i2 >= this.len) {
                c9 = EOI;
            } else {
                c9 = this.text.charAt(i2);
            }
            this.ch = c9;
        }
        while (true) {
            c = this.ch;
            if (c < '0' || c > '9') {
                break;
            }
            this.sp++;
            int i3 = this.bp + 1;
            this.bp = i3;
            if (i3 >= this.len) {
                c8 = EOI;
            } else {
                c8 = this.text.charAt(i3);
            }
            this.ch = c8;
        }
        this.isDouble = false;
        if (c == '.') {
            this.sp++;
            int i4 = this.bp + 1;
            this.bp = i4;
            if (i4 >= this.len) {
                c6 = EOI;
            } else {
                c6 = this.text.charAt(i4);
            }
            this.ch = c6;
            this.isDouble = true;
            while (true) {
                char c10 = this.ch;
                if (c10 < '0' || c10 > '9') {
                    break;
                }
                this.sp++;
                int i5 = this.bp + 1;
                this.bp = i5;
                if (i5 >= this.len) {
                    c7 = EOI;
                } else {
                    c7 = this.text.charAt(i5);
                }
                this.ch = c7;
            }
        }
        char c11 = this.ch;
        if (c11 == 'L') {
            this.sp++;
            next();
        } else if (c11 == 'S') {
            this.sp++;
            next();
        } else if (c11 == 'B') {
            this.sp++;
            next();
        } else if (c11 == 'F') {
            this.sp++;
            next();
            this.isDouble = true;
        } else if (c11 == 'D') {
            this.sp++;
            next();
            this.isDouble = true;
        } else if (c11 == 'e' || c11 == 'E') {
            this.sp++;
            int i6 = this.bp + 1;
            this.bp = i6;
            if (i6 >= this.len) {
                c2 = EOI;
            } else {
                c2 = this.text.charAt(i6);
            }
            this.ch = c2;
            if (c2 == '+' || c2 == '-') {
                this.sp++;
                int i7 = this.bp + 1;
                this.bp = i7;
                if (i7 >= this.len) {
                    c5 = EOI;
                } else {
                    c5 = this.text.charAt(i7);
                }
                this.ch = c5;
            }
            while (true) {
                c3 = this.ch;
                if (c3 < '0' || c3 > '9') {
                    break;
                }
                this.sp++;
                int i8 = this.bp + 1;
                this.bp = i8;
                if (i8 >= this.len) {
                    c4 = EOI;
                } else {
                    c4 = this.text.charAt(i8);
                }
                this.ch = c4;
            }
            if (c3 == 'D' || c3 == 'F') {
                this.sp++;
                next();
            }
            this.exp = true;
            this.isDouble = true;
        }
        if (this.isDouble) {
            this.token = 3;
        } else {
            this.token = 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x020b A[Catch: NumberFormatException -> 0x021f, TryCatch #0 {NumberFormatException -> 0x021f, blocks: (B:116:0x01fb, B:121:0x0204, B:122:0x0207, B:124:0x020b, B:127:0x0213, B:129:0x021a, B:130:0x021c, B:135:0x0225, B:138:0x022b, B:140:0x0230, B:143:0x0236, B:145:0x023b, B:147:0x0245, B:149:0x024b), top: B:153:0x01f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0225 A[Catch: NumberFormatException -> 0x021f, TryCatch #0 {NumberFormatException -> 0x021f, blocks: (B:116:0x01fb, B:121:0x0204, B:122:0x0207, B:124:0x020b, B:127:0x0213, B:129:0x021a, B:130:0x021c, B:135:0x0225, B:138:0x022b, B:140:0x0230, B:143:0x0236, B:145:0x023b, B:147:0x0245, B:149:0x024b), top: B:153:0x01f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0230 A[Catch: NumberFormatException -> 0x021f, TryCatch #0 {NumberFormatException -> 0x021f, blocks: (B:116:0x01fb, B:121:0x0204, B:122:0x0207, B:124:0x020b, B:127:0x0213, B:129:0x021a, B:130:0x021c, B:135:0x0225, B:138:0x022b, B:140:0x0230, B:143:0x0236, B:145:0x023b, B:147:0x0245, B:149:0x024b), top: B:153:0x01f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0245 A[Catch: NumberFormatException -> 0x021f, TryCatch #0 {NumberFormatException -> 0x021f, blocks: (B:116:0x01fb, B:121:0x0204, B:122:0x0207, B:124:0x020b, B:127:0x0213, B:129:0x021a, B:130:0x021c, B:135:0x0225, B:138:0x022b, B:140:0x0230, B:143:0x0236, B:145:0x023b, B:147:0x0245, B:149:0x024b), top: B:153:0x01f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x024b A[Catch: NumberFormatException -> 0x021f, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x021f, blocks: (B:116:0x01fb, B:121:0x0204, B:122:0x0207, B:124:0x020b, B:127:0x0213, B:129:0x021a, B:130:0x021c, B:135:0x0225, B:138:0x022b, B:140:0x0230, B:143:0x0236, B:145:0x023b, B:147:0x0245, B:149:0x024b), top: B:153:0x01f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Number scanNumberValue() {
        /*
            Method dump skipped, instructions count: 631
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.scanNumberValue():java.lang.Number");
    }

    public final void scanString() {
        char c = this.ch;
        int i = this.bp + 1;
        int indexOf = this.text.indexOf(c, i);
        if (indexOf != -1) {
            int i2 = indexOf - i;
            char[] sub_chars = sub_chars(this.bp + 1, i2);
            boolean z = false;
            while (i2 > 0 && sub_chars[i2 - 1] == '\\') {
                int i3 = 1;
                for (int i4 = i2 - 2; i4 >= 0 && sub_chars[i4] == '\\'; i4--) {
                    i3++;
                }
                if (i3 % 2 == 0) {
                    break;
                }
                int indexOf2 = this.text.indexOf(c, indexOf + 1);
                int i5 = (indexOf2 - indexOf) + i2;
                if (i5 >= sub_chars.length) {
                    int length = (sub_chars.length * 3) / 2;
                    if (length < i5) {
                        length = i5;
                    }
                    char[] cArr = new char[length];
                    System.arraycopy(sub_chars, 0, cArr, 0, sub_chars.length);
                    sub_chars = cArr;
                }
                this.text.getChars(indexOf, indexOf2, sub_chars, i2);
                indexOf = indexOf2;
                i2 = i5;
                z = true;
            }
            if (!z) {
                for (int i6 = 0; i6 < i2; i6++) {
                    if (sub_chars[i6] == '\\') {
                        z = true;
                    }
                }
            }
            this.sbuf = sub_chars;
            this.sp = i2;
            this.np = this.bp;
            this.hasSpecial = z;
            int i7 = indexOf + 1;
            this.bp = i7;
            this.ch = i7 >= this.len ? EOI : this.text.charAt(i7);
            this.token = 4;
            return;
        }
        throw new JSONException("unclosed str, " + info());
    }

    public String scanStringValue(char c) {
        String str;
        int i = this.bp + 1;
        int indexOf = this.text.indexOf(c, i);
        if (indexOf != -1) {
            if (V6) {
                str = this.text.substring(i, indexOf);
            } else {
                int i2 = indexOf - i;
                str = new String(sub_chars(this.bp + 1, i2), 0, i2);
            }
            if (str.indexOf(92) != -1) {
                while (true) {
                    int i3 = 0;
                    for (int i4 = indexOf - 1; i4 >= 0 && this.text.charAt(i4) == '\\'; i4--) {
                        i3++;
                    }
                    if (i3 % 2 == 0) {
                        break;
                    }
                    indexOf = this.text.indexOf(c, indexOf + 1);
                }
                int i5 = indexOf - i;
                str = readString(sub_chars(this.bp + 1, i5), i5);
            }
            int i6 = indexOf + 1;
            this.bp = i6;
            this.ch = i6 >= this.len ? EOI : this.text.charAt(i6);
            return str;
        }
        throw new JSONException("unclosed str, " + info());
    }

    public final String scanSymbol(SymbolTable symbolTable) {
        char c;
        while (true) {
            c = this.ch;
            if (c != ' ' && c != '\n' && c != '\r' && c != '\t' && c != '\f' && c != '\b') {
                break;
            }
            next();
        }
        if (c == '\"') {
            return scanSymbol(symbolTable, '\"');
        }
        if (c == '\'') {
            return scanSymbol(symbolTable, '\'');
        }
        if (c == '}') {
            next();
            this.token = 13;
            return null;
        } else if (c == ',') {
            next();
            this.token = 16;
            return null;
        } else if (c != 26) {
            return scanSymbolUnQuoted(symbolTable);
        } else {
            this.token = 20;
            return null;
        }
    }

    public final String scanSymbolUnQuoted(SymbolTable symbolTable) {
        int i = this.ch;
        boolean[] zArr = firstIdentifierFlags;
        if (i >= zArr.length || zArr[i]) {
            this.np = this.bp;
            this.sp = 1;
            while (true) {
                char next = next();
                boolean[] zArr2 = identifierFlags;
                if (next < zArr2.length && !zArr2[next]) {
                    break;
                }
                i = (i * 31) + next;
                this.sp++;
            }
            this.ch = charAt(this.bp);
            this.token = 18;
            if (this.sp != 4 || !this.text.startsWith("null", this.np)) {
                return symbolTable.addSymbol(this.text, this.np, this.sp, i);
            }
            return null;
        }
        throw new JSONException("illegal identifier : " + this.ch + ", " + info());
    }

    public void setTime(char c, char c2, char c3, char c4, char c5, char c6) {
        this.calendar.set(11, ((c - '0') * 10) + (c2 - '0'));
        this.calendar.set(12, ((c3 - '0') * 10) + (c4 - '0'));
        this.calendar.set(13, ((c5 - '0') * 10) + (c6 - '0'));
    }

    public void setTimeZone(char c, char c2, char c3) {
        int i = (((c2 - '0') * 10) + (c3 - '0')) * 3600000;
        if (c == '-') {
            i = -i;
        }
        if (this.calendar.getTimeZone().getRawOffset() != i) {
            String[] availableIDs = TimeZone.getAvailableIDs(i);
            if (availableIDs.length > 0) {
                this.calendar.setTimeZone(TimeZone.getTimeZone(availableIDs[0]));
            }
        }
    }

    public void skipComment() {
        next();
        char c = this.ch;
        if (c == '/') {
            do {
                next();
            } while (this.ch != '\n');
            next();
        } else if (c == '*') {
            next();
            while (true) {
                char c2 = this.ch;
                if (c2 == 26) {
                    return;
                }
                if (c2 == '*') {
                    next();
                    if (this.ch == '/') {
                        next();
                        return;
                    }
                } else {
                    next();
                }
            }
        } else {
            throw new JSONException("invalid comment");
        }
    }

    public final void skipWhitespace() {
        while (true) {
            char c = this.ch;
            if (c > '/') {
                return;
            }
            if (c == ' ' || c == '\r' || c == '\n' || c == '\t' || c == '\f' || c == '\b') {
                next();
            } else if (c == '/') {
                skipComment();
            } else {
                return;
            }
        }
    }

    public final String stringVal() {
        if (this.hasSpecial) {
            return readString(this.sbuf, this.sp);
        }
        return subString(this.np + 1, this.sp);
    }

    public final char[] sub_chars(int i, int i2) {
        char[] cArr = this.sbuf;
        if (i2 < cArr.length) {
            this.text.getChars(i, i2 + i, cArr, 0);
            return this.sbuf;
        }
        char[] cArr2 = new char[i2];
        this.sbuf = cArr2;
        this.text.getChars(i, i2 + i, cArr2, 0);
        return cArr2;
    }

    public final int token() {
        return this.token;
    }

    public JSONLexer(char[] cArr, int i) {
        this(cArr, i, JSON.DEFAULT_PARSER_FEATURE);
    }

    public final void nextTokenWithChar(char c) {
        this.sp = 0;
        while (true) {
            char c2 = this.ch;
            if (c2 == c) {
                int i = this.bp + 1;
                this.bp = i;
                this.ch = i >= this.len ? EOI : this.text.charAt(i);
                nextToken();
                return;
            } else if (c2 == ' ' || c2 == '\n' || c2 == '\r' || c2 == '\t' || c2 == '\f' || c2 == '\b') {
                next();
            } else {
                throw new JSONException("not match " + c + " - " + this.ch);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean scanFieldBoolean(long r13) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.scanFieldBoolean(long):boolean");
    }

    public Date scanFieldDate(long j) {
        char c;
        int i;
        Date date;
        int i2;
        char charAt;
        this.matchStat = 0;
        int matchFieldHash = matchFieldHash(j);
        if (matchFieldHash == 0) {
            return null;
        }
        int i3 = this.bp;
        char c2 = this.ch;
        int i4 = matchFieldHash + 1;
        int i5 = i3 + matchFieldHash;
        int i6 = this.len;
        char c3 = EOI;
        char charAt2 = i5 >= i6 ? EOI : this.text.charAt(i5);
        if (charAt2 == '\"') {
            int i7 = this.bp;
            int i8 = i7 + i4;
            int i9 = matchFieldHash + 2;
            int i10 = i7 + i4;
            if (i10 < this.len) {
                this.text.charAt(i10);
            }
            int indexOf = this.text.indexOf(34, this.bp + i9);
            if (indexOf != -1) {
                int i11 = indexOf - i8;
                this.bp = i8;
                if (scanISO8601DateIfMatch(false, i11)) {
                    date = this.calendar.getTime();
                    int i12 = i9 + i11;
                    i = i12 + 1;
                    c = charAt(i12 + i3);
                    this.bp = i3;
                } else {
                    this.bp = i3;
                    this.matchStat = -1;
                    return null;
                }
            } else {
                throw new JSONException("unclosed str");
            }
        } else if (charAt2 < '0' || charAt2 > '9') {
            this.matchStat = -1;
            return null;
        } else {
            long j2 = charAt2 - '0';
            while (true) {
                i2 = i4 + 1;
                int i13 = this.bp + i4;
                charAt = i13 >= this.len ? EOI : this.text.charAt(i13);
                if (charAt < '0' || charAt > '9') {
                    break;
                }
                j2 = (j2 * 10) + (charAt - '0');
                i4 = i2;
            }
            if (charAt == '.') {
                this.matchStat = -1;
                return null;
            }
            if (charAt == '\"') {
                i = i4 + 2;
                int i14 = this.bp + i2;
                c = i14 >= this.len ? EOI : this.text.charAt(i14);
            } else {
                c = charAt;
                i = i2;
            }
            if (j2 < 0) {
                this.matchStat = -1;
                return null;
            }
            date = new Date(j2);
        }
        if (c == ',') {
            int i15 = this.bp + (i - 1) + 1;
            this.bp = i15;
            if (i15 < this.len) {
                c3 = this.text.charAt(i15);
            }
            this.ch = c3;
            this.matchStat = 3;
            this.token = 16;
            return date;
        } else if (c == '}') {
            char charAt3 = charAt(this.bp + i);
            if (charAt3 == ',') {
                this.token = 16;
                int i16 = this.bp + i + 1;
                this.bp = i16;
                if (i16 < this.len) {
                    c3 = this.text.charAt(i16);
                }
                this.ch = c3;
            } else if (charAt3 == ']') {
                this.token = 15;
                int i17 = this.bp + i + 1;
                this.bp = i17;
                if (i17 < this.len) {
                    c3 = this.text.charAt(i17);
                }
                this.ch = c3;
            } else if (charAt3 == '}') {
                this.token = 13;
                int i18 = this.bp + i + 1;
                this.bp = i18;
                if (i18 < this.len) {
                    c3 = this.text.charAt(i18);
                }
                this.ch = c3;
            } else if (charAt3 == 26) {
                this.token = 20;
                this.bp += i;
                this.ch = EOI;
            } else {
                this.bp = i3;
                this.ch = c2;
                this.matchStat = -1;
                return null;
            }
            this.matchStat = 4;
            return date;
        } else {
            this.bp = i3;
            this.ch = c2;
            this.matchStat = -1;
            return null;
        }
    }

    public String scanFieldString(long j) {
        String str;
        this.matchStat = 0;
        int matchFieldHash = matchFieldHash(j);
        if (matchFieldHash == 0) {
            return null;
        }
        int i = matchFieldHash + 1;
        int i2 = this.bp + matchFieldHash;
        if (i2 >= this.len) {
            throw new JSONException("unclosed str, " + info());
        } else if (this.text.charAt(i2) != '\"') {
            this.matchStat = -1;
            return this.stringDefaultValue;
        } else {
            int i3 = this.bp + i;
            int indexOf = this.text.indexOf(34, i3);
            if (indexOf != -1) {
                if (V6) {
                    str = this.text.substring(i3, indexOf);
                } else {
                    int i4 = indexOf - i3;
                    str = new String(sub_chars(this.bp + i, i4), 0, i4);
                }
                if (str.indexOf(92) != -1) {
                    boolean z = false;
                    while (true) {
                        int i5 = indexOf - 1;
                        int i6 = 0;
                        while (i5 >= 0 && this.text.charAt(i5) == '\\') {
                            i6++;
                            i5--;
                            z = true;
                        }
                        if (i6 % 2 == 0) {
                            break;
                        }
                        indexOf = this.text.indexOf(34, indexOf + 1);
                    }
                    int i7 = indexOf - i3;
                    char[] sub_chars = sub_chars(this.bp + i, i7);
                    if (z) {
                        str = readString(sub_chars, i7);
                    } else {
                        str = new String(sub_chars, 0, i7);
                        if (str.indexOf(92) != -1) {
                            str = readString(sub_chars, i7);
                        }
                    }
                }
                int i8 = indexOf + 1;
                int i9 = this.len;
                char c = EOI;
                char charAt = i8 >= i9 ? EOI : this.text.charAt(i8);
                if (charAt == ',') {
                    int i10 = indexOf + 2;
                    this.bp = i10;
                    if (i10 < this.len) {
                        c = this.text.charAt(i10);
                    }
                    this.ch = c;
                    this.matchStat = 3;
                    this.token = 16;
                    return str;
                } else if (charAt == '}') {
                    int i11 = indexOf + 2;
                    char charAt2 = i11 >= this.len ? EOI : this.text.charAt(i11);
                    if (charAt2 == ',') {
                        this.token = 16;
                        this.bp = i11;
                        next();
                    } else if (charAt2 == ']') {
                        this.token = 15;
                        this.bp = i11;
                        next();
                    } else if (charAt2 == '}') {
                        this.token = 13;
                        this.bp = i11;
                        next();
                    } else if (charAt2 == 26) {
                        this.token = 20;
                        this.bp = i11;
                        this.ch = EOI;
                    } else {
                        this.matchStat = -1;
                        return this.stringDefaultValue;
                    }
                    this.matchStat = 4;
                    return str;
                } else {
                    this.matchStat = -1;
                    return this.stringDefaultValue;
                }
            } else {
                throw new JSONException("unclosed str, " + info());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0208 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean scanISO8601DateIfMatch(boolean r37, int r38) {
        /*
            Method dump skipped, instructions count: 1591
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.scanISO8601DateIfMatch(boolean, int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ba, code lost:
        if (r0 != false) goto L_?;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bd, code lost:
        return -r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long scanLongValue() {
        /*
            r13 = this;
            r0 = 0
            r13.np = r0
            char r1 = r13.ch
            r2 = 45
            r3 = 1
            if (r1 != r2) goto L_0x003b
            r13.np = r3
            int r0 = r13.bp
            int r0 = r0 + r3
            r13.bp = r0
            int r1 = r13.len
            if (r0 >= r1) goto L_0x0022
            java.lang.String r1 = r13.text
            char r0 = r1.charAt(r0)
            r13.ch = r0
            r0 = -9223372036854775808
            r1 = r0
            r0 = 1
            goto L_0x0040
        L_0x0022:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "syntax error, "
            r1.<init>(r2)
            java.lang.String r2 = r13.info()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x003b:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0040:
            r4 = 0
        L_0x0042:
            char r6 = r13.ch
            r7 = 48
            if (r6 < r7) goto L_0x00ba
            r7 = 57
            if (r6 > r7) goto L_0x00ba
            int r6 = r6 + (-48)
            r7 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            java.lang.String r9 = ", "
            java.lang.String r10 = "error long value, "
            int r11 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r11 < 0) goto L_0x009e
            r7 = 10
            long r4 = r4 * r7
            long r6 = (long) r6
            long r11 = r1 + r6
            int r8 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r8 < 0) goto L_0x0082
            long r4 = r4 - r6
            int r6 = r13.np
            int r6 = r6 + r3
            r13.np = r6
            int r6 = r13.bp
            int r6 = r6 + r3
            r13.bp = r6
            int r7 = r13.len
            if (r6 < r7) goto L_0x0079
            r6 = 26
            goto L_0x007f
        L_0x0079:
            java.lang.String r7 = r13.text
            char r6 = r7.charAt(r6)
        L_0x007f:
            r13.ch = r6
            goto L_0x0042
        L_0x0082:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r10)
            r1.append(r4)
            r1.append(r9)
            java.lang.String r2 = r13.info()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x009e:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r10)
            r1.append(r4)
            r1.append(r9)
            java.lang.String r2 = r13.info()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00ba:
            if (r0 != 0) goto L_0x00bd
            long r4 = -r4
        L_0x00bd:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.scanLongValue():long");
    }

    public JSONLexer(char[] cArr, int i, int i2) {
        this(new String(cArr, 0, i), i2);
    }

    private int matchFieldHash(long j) {
        char c = this.ch;
        int i = 1;
        while (c != '\"' && c != '\'') {
            if (c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == '\f' || c == '\b') {
                i++;
                int i2 = this.bp + i;
                c = i2 >= this.len ? EOI : this.text.charAt(i2);
            } else {
                this.fieldHash = 0L;
                this.matchStat = -2;
                return 0;
            }
        }
        int i3 = this.bp + i;
        long j2 = ls9.MAGIC_HASH_CODE;
        while (true) {
            if (i3 >= this.len) {
                break;
            }
            char charAt = this.text.charAt(i3);
            if (charAt == c) {
                i += (i3 - this.bp) - i;
                break;
            }
            j2 = (charAt ^ j2) * ls9.MAGIC_PRIME;
            i3++;
        }
        if (j2 != j) {
            this.fieldHash = j2;
            this.matchStat = -2;
            return 0;
        }
        int i4 = i + 1;
        int i5 = this.bp + i4;
        char charAt2 = i5 >= this.len ? EOI : this.text.charAt(i5);
        while (charAt2 != ':') {
            if (charAt2 > ' ' || !(charAt2 == ' ' || charAt2 == '\n' || charAt2 == '\r' || charAt2 == '\t' || charAt2 == '\f' || charAt2 == '\b')) {
                throw new JSONException("match feild error expect ':'");
            }
            i4++;
            int i6 = this.bp + i4;
            charAt2 = i6 >= this.len ? EOI : this.text.charAt(i6);
        }
        return i4 + 1;
    }

    public boolean matchField(long j) {
        char c = this.ch;
        int i = this.bp + 1;
        int i2 = 1;
        while (c != '\"' && c != '\'') {
            if (c > ' ' || !(c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == '\f' || c == '\b')) {
                this.fieldHash = 0L;
                this.matchStat = -2;
                return false;
            }
            i2++;
            int i3 = this.bp + i2;
            c = i3 >= this.len ? EOI : this.text.charAt(i3);
        }
        long j2 = ls9.MAGIC_HASH_CODE;
        int i4 = i;
        while (true) {
            if (i4 >= this.len) {
                break;
            }
            char charAt = this.text.charAt(i4);
            if (charAt == c) {
                i2 += (i4 - i) + 1;
                break;
            }
            j2 = ls9.MAGIC_PRIME * (j2 ^ charAt);
            i4++;
        }
        if (j2 != j) {
            this.matchStat = -2;
            this.fieldHash = j2;
            return false;
        }
        int i5 = i2 + 1;
        int i6 = this.bp + i2;
        char charAt2 = i6 >= this.len ? EOI : this.text.charAt(i6);
        while (charAt2 != ':') {
            if (charAt2 > ' ' || !(charAt2 == ' ' || charAt2 == '\n' || charAt2 == '\r' || charAt2 == '\t' || charAt2 == '\f' || charAt2 == '\b')) {
                throw new JSONException("match feild error expect ':'");
            }
            i5++;
            int i7 = this.bp + i5;
            charAt2 = i7 >= this.len ? EOI : this.text.charAt(i7);
        }
        int i8 = this.bp + i5;
        char charAt3 = i8 >= this.len ? EOI : this.text.charAt(i8);
        if (charAt3 == '{') {
            int i9 = i8 + 1;
            this.bp = i9;
            this.ch = i9 >= this.len ? EOI : this.text.charAt(i9);
            this.token = 12;
        } else if (charAt3 == '[') {
            int i10 = i8 + 1;
            this.bp = i10;
            this.ch = i10 >= this.len ? EOI : this.text.charAt(i10);
            this.token = 14;
        } else {
            this.bp = i8;
            this.ch = i8 >= this.len ? EOI : this.text.charAt(i8);
            nextToken();
        }
        return true;
    }

    public JSONLexer(String str, int i) {
        this.features = JSON.DEFAULT_PARSER_FEATURE;
        boolean z = false;
        this.exp = false;
        this.isDouble = false;
        this.timeZone = JSON.defaultTimeZone;
        this.locale = JSON.defaultLocale;
        String str2 = null;
        this.calendar = null;
        this.matchStat = 0;
        char[] cArr = sbufLocal.get();
        this.sbuf = cArr;
        if (cArr == null) {
            this.sbuf = new char[512];
        }
        this.features = i;
        this.text = str;
        int length = str.length();
        this.len = length;
        int i2 = (-1) + 1;
        this.bp = i2;
        char charAt = i2 >= length ? EOI : str.charAt(i2);
        this.ch = charAt;
        if (charAt == 65279) {
            next();
        }
        this.stringDefaultValue = (Feature.InitStringFieldAsEmpty.mask & i) != 0 ? "" : str2;
        this.disableCircularReferenceDetect = (Feature.DisableCircularReferenceDetect.mask & i) != 0 ? true : z;
    }

    private static String readString(char[] cArr, int i) {
        int i2 = 5;
        char[] cArr2 = new char[i];
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            char c = cArr[i3];
            if (c != '\\') {
                i4++;
                cArr2[i4] = c;
            } else {
                int i5 = i3 + 1;
                char c2 = cArr[i5];
                if (c2 == '\"') {
                    i4++;
                    cArr2[i4] = '\"';
                } else if (c2 != '\'') {
                    if (c2 != 'F') {
                        if (c2 == '\\') {
                            i4++;
                            cArr2[i4] = '\\';
                        } else if (c2 == 'b') {
                            i4++;
                            cArr2[i4] = '\b';
                        } else if (c2 != 'f') {
                            if (c2 == 'n') {
                                i4++;
                                cArr2[i4] = '\n';
                            } else if (c2 == 'r') {
                                i4++;
                                cArr2[i4] = '\r';
                            } else if (c2 != 'x') {
                                switch (c2) {
                                    case '/':
                                        i4++;
                                        cArr2[i4] = wh6.DIR;
                                        break;
                                    case '0':
                                        i4++;
                                        cArr2[i4] = 0;
                                        break;
                                    case '1':
                                        i4++;
                                        cArr2[i4] = 1;
                                        break;
                                    case '2':
                                        i4++;
                                        cArr2[i4] = 2;
                                        break;
                                    case '3':
                                        i4++;
                                        cArr2[i4] = 3;
                                        break;
                                    case '4':
                                        i4++;
                                        cArr2[i4] = 4;
                                        break;
                                    case '5':
                                        i4++;
                                        cArr2[i4] = 5;
                                        break;
                                    case '6':
                                        i4++;
                                        cArr2[i4] = 6;
                                        i3 = i5;
                                        break;
                                    case '7':
                                        i4++;
                                        cArr2[i4] = 7;
                                        i3 = i5;
                                        break;
                                    default:
                                        switch (c2) {
                                            case 't':
                                                i4++;
                                                cArr2[i4] = '\t';
                                                i3 = i5;
                                                break;
                                            case 'u':
                                                i4++;
                                                char c3 = cArr[i3 + 2];
                                                char c4 = cArr[i3 + 3];
                                                char c5 = cArr[i3 + 4];
                                                i3 += i2;
                                                cArr2[i4] = (char) Integer.parseInt(new String(new char[]{c3, c4, c5, cArr[i3]}), 16);
                                                break;
                                            case 'v':
                                                i4++;
                                                cArr2[i4] = 11;
                                                i3 = i5;
                                                break;
                                            default:
                                                throw new JSONException("unclosed.str.lit");
                                        }
                                }
                            } else {
                                i4++;
                                int[] iArr = digits;
                                i3 += 3;
                                cArr2[i4] = (char) ((iArr[cArr[i3 + 2]] * 16) + iArr[cArr[i3]]);
                                i3++;
                                i2 = 5;
                            }
                        }
                    }
                    i4++;
                    cArr2[i4] = '\f';
                } else {
                    i4++;
                    cArr2[i4] = '\'';
                }
                i3 = i5;
                i3++;
                i2 = 5;
            }
            i3++;
            i2 = 5;
        }
        return new String(cArr2, 0, i4);
    }

    public String scanSymbol(SymbolTable symbolTable, char c) {
        String str;
        int i = this.bp + 1;
        int indexOf = this.text.indexOf(c, i);
        if (indexOf != -1) {
            int i2 = indexOf - i;
            char[] sub_chars = sub_chars(this.bp + 1, i2);
            boolean z = false;
            while (i2 > 0 && sub_chars[i2 - 1] == '\\') {
                int i3 = 1;
                for (int i4 = i2 - 2; i4 >= 0 && sub_chars[i4] == '\\'; i4--) {
                    i3++;
                }
                if (i3 % 2 == 0) {
                    break;
                }
                int indexOf2 = this.text.indexOf(c, indexOf + 1);
                int i5 = (indexOf2 - indexOf) + i2;
                if (i5 >= sub_chars.length) {
                    int length = (sub_chars.length * 3) / 2;
                    if (length < i5) {
                        length = i5;
                    }
                    char[] cArr = new char[length];
                    System.arraycopy(sub_chars, 0, cArr, 0, sub_chars.length);
                    sub_chars = cArr;
                }
                this.text.getChars(indexOf, indexOf2, sub_chars, i2);
                indexOf = indexOf2;
                i2 = i5;
                z = true;
            }
            if (!z) {
                int i6 = 0;
                for (int i7 = 0; i7 < i2; i7++) {
                    char c2 = sub_chars[i7];
                    i6 = (i6 * 31) + c2;
                    if (c2 == '\\') {
                        z = true;
                    }
                }
                if (z) {
                    str = readString(sub_chars, i2);
                } else {
                    str = i2 < 20 ? symbolTable.addSymbol(sub_chars, 0, i2, i6) : new String(sub_chars, 0, i2);
                }
            } else {
                str = readString(sub_chars, i2);
            }
            int i8 = indexOf + 1;
            this.bp = i8;
            this.ch = i8 >= this.len ? EOI : this.text.charAt(i8);
            return str;
        }
        throw new JSONException("unclosed str, " + info());
    }

    public final BigDecimal decimalValue() {
        char charAt = this.text.charAt((this.np + this.sp) - 1);
        int i = this.sp;
        if (charAt == 'L' || charAt == 'S' || charAt == 'B' || charAt == 'F' || charAt == 'D') {
            i--;
        }
        int i2 = this.np;
        char[] cArr = this.sbuf;
        if (i < cArr.length) {
            this.text.getChars(i2, i2 + i, cArr, 0);
            return new BigDecimal(this.sbuf, 0, i);
        }
        char[] cArr2 = new char[i];
        this.text.getChars(i2, i + i2, cArr2, 0);
        return new BigDecimal(cArr2);
    }

    public final void nextToken(int i) {
        this.sp = 0;
        while (true) {
            if (i != 2) {
                char c = EOI;
                if (i == 4) {
                    char c2 = this.ch;
                    if (c2 == '\"') {
                        this.pos = this.bp;
                        scanString();
                        return;
                    } else if (c2 >= '0' && c2 <= '9') {
                        this.pos = this.bp;
                        scanNumber();
                        return;
                    } else if (c2 == '{') {
                        this.token = 12;
                        int i2 = this.bp + 1;
                        this.bp = i2;
                        if (i2 < this.len) {
                            c = this.text.charAt(i2);
                        }
                        this.ch = c;
                        return;
                    }
                } else if (i == 12) {
                    char c3 = this.ch;
                    if (c3 == '{') {
                        this.token = 12;
                        int i3 = this.bp + 1;
                        this.bp = i3;
                        if (i3 < this.len) {
                            c = this.text.charAt(i3);
                        }
                        this.ch = c;
                        return;
                    } else if (c3 == '[') {
                        this.token = 14;
                        int i4 = this.bp + 1;
                        this.bp = i4;
                        if (i4 < this.len) {
                            c = this.text.charAt(i4);
                        }
                        this.ch = c;
                        return;
                    }
                } else if (i != 18) {
                    if (i != 20) {
                        switch (i) {
                            case 14:
                                char c4 = this.ch;
                                if (c4 == '[') {
                                    this.token = 14;
                                    next();
                                    return;
                                } else if (c4 == '{') {
                                    this.token = 12;
                                    next();
                                    return;
                                }
                                break;
                            case 15:
                                if (this.ch == ']') {
                                    this.token = 15;
                                    next();
                                    return;
                                }
                                break;
                            case 16:
                                char c5 = this.ch;
                                if (c5 == ',') {
                                    this.token = 16;
                                    int i5 = this.bp + 1;
                                    this.bp = i5;
                                    if (i5 < this.len) {
                                        c = this.text.charAt(i5);
                                    }
                                    this.ch = c;
                                    return;
                                } else if (c5 == '}') {
                                    this.token = 13;
                                    int i6 = this.bp + 1;
                                    this.bp = i6;
                                    if (i6 < this.len) {
                                        c = this.text.charAt(i6);
                                    }
                                    this.ch = c;
                                    return;
                                } else if (c5 == ']') {
                                    this.token = 15;
                                    int i7 = this.bp + 1;
                                    this.bp = i7;
                                    if (i7 < this.len) {
                                        c = this.text.charAt(i7);
                                    }
                                    this.ch = c;
                                    return;
                                } else if (c5 == 26) {
                                    this.token = 20;
                                    return;
                                }
                                break;
                        }
                    }
                    if (this.ch == 26) {
                        this.token = 20;
                        return;
                    }
                } else {
                    nextIdent();
                    return;
                }
            } else {
                char c6 = this.ch;
                if (c6 >= '0' && c6 <= '9') {
                    this.pos = this.bp;
                    scanNumber();
                    return;
                } else if (c6 == '\"') {
                    this.pos = this.bp;
                    scanString();
                    return;
                } else if (c6 == '[') {
                    this.token = 14;
                    next();
                    return;
                } else if (c6 == '{') {
                    this.token = 12;
                    next();
                    return;
                }
            }
            char c7 = this.ch;
            if (c7 == ' ' || c7 == '\n' || c7 == '\r' || c7 == '\t' || c7 == '\f' || c7 == '\b') {
                next();
            } else {
                nextToken();
                return;
            }
        }
    }
}
