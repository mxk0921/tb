package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson2.util.DateUtils;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.charset.Charset;
import tb.f7l;
import tb.krg;
import tb.ohh;
import tb.wh6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class SerializeWriter extends Writer {
    public static final char[] DIGITS;
    static final byte[] specicalFlags_doubleQuotes;
    static final byte[] specicalFlags_singleQuotes;
    protected char[] buf;
    protected int count;
    protected int features;
    protected final Writer writer;
    private static final ThreadLocal<char[]> bufLocal = new ThreadLocal<>();
    static final int[] sizeTable = {9, 99, 999, krg.LOG_LEVEL_DEBUG, 99999, 999999, 9999999, 99999999, DateUtils.MAX_VALUE, Integer.MAX_VALUE};
    static final char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    static final char[] DigitTens = {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '5', '5', '5', '5', '5', '5', '5', '5', '5', '5', '6', '6', '6', '6', '6', '6', '6', '6', '6', '6', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '8', '8', '8', '8', '8', '8', '8', '8', '8', '8', '9', '9', '9', '9', '9', '9', '9', '9', '9', '9'};
    static final char[] DigitOnes = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    static final char[] ascii_chars = {'0', '0', '0', '1', '0', '2', '0', '3', '0', '4', '0', '5', '0', '6', '0', '7', '0', '8', '0', '9', '0', 'A', '0', 'B', '0', 'C', '0', ohh.LEVEL_D, '0', ohh.LEVEL_E, '0', 'F', '1', '0', '1', '1', '1', '2', '1', '3', '1', '4', '1', '5', '1', '6', '1', '7', '1', '8', '1', '9', '1', 'A', '1', 'B', '1', 'C', '1', ohh.LEVEL_D, '1', ohh.LEVEL_E, '1', 'F', '2', '0', '2', '1', '2', '2', '2', '3', '2', '4', '2', '5', '2', '6', '2', '7', '2', '8', '2', '9', '2', 'A', '2', 'B', '2', 'C', '2', ohh.LEVEL_D, '2', ohh.LEVEL_E, '2', 'F'};
    static final char[] replaceChars = new char[93];

    static {
        byte[] bArr = new byte[161];
        specicalFlags_doubleQuotes = bArr;
        byte[] bArr2 = new byte[161];
        specicalFlags_singleQuotes = bArr2;
        bArr[0] = 4;
        bArr[1] = 4;
        bArr[2] = 4;
        bArr[3] = 4;
        bArr[4] = 4;
        bArr[5] = 4;
        bArr[6] = 4;
        bArr[7] = 4;
        bArr[8] = 1;
        bArr[9] = 1;
        bArr[10] = 1;
        bArr[11] = 4;
        bArr[12] = 1;
        bArr[13] = 1;
        bArr[34] = 1;
        bArr[92] = 1;
        bArr2[0] = 4;
        bArr2[1] = 4;
        bArr2[2] = 4;
        bArr2[3] = 4;
        bArr2[4] = 4;
        bArr2[5] = 4;
        bArr2[6] = 4;
        bArr2[7] = 4;
        bArr2[8] = 1;
        bArr2[9] = 1;
        bArr2[10] = 1;
        bArr2[11] = 4;
        bArr2[12] = 1;
        bArr2[13] = 1;
        bArr2[92] = 1;
        bArr2[39] = 1;
        for (int i = 14; i <= 31; i++) {
            specicalFlags_doubleQuotes[i] = 4;
            specicalFlags_singleQuotes[i] = 4;
        }
        for (int i2 = 127; i2 < 160; i2++) {
            specicalFlags_doubleQuotes[i2] = 4;
            specicalFlags_singleQuotes[i2] = 4;
        }
        char[] cArr = replaceChars;
        cArr[0] = '0';
        cArr[1] = '1';
        cArr[2] = '2';
        cArr[3] = '3';
        cArr[4] = '4';
        cArr[5] = '5';
        cArr[6] = '6';
        cArr[7] = '7';
        cArr[8] = 'b';
        cArr[9] = 't';
        cArr[10] = 'n';
        cArr[11] = 'v';
        cArr[12] = 'f';
        cArr[13] = 'r';
        cArr[34] = '\"';
        cArr[39] = '\'';
        cArr[47] = wh6.DIR;
        cArr[92] = '\\';
        DIGITS = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', ohh.LEVEL_D, ohh.LEVEL_E, 'F'};
    }

    public SerializeWriter() {
        this((Writer) null);
    }

    public static void getChars(long j, int i, char[] cArr) {
        char c;
        if (j < 0) {
            j = -j;
            c = '-';
        } else {
            c = 0;
        }
        while (j > 2147483647L) {
            long j2 = j / 100;
            int i2 = (int) (j - (((j2 << 6) + (j2 << 5)) + (j2 << 2)));
            cArr[i - 1] = DigitOnes[i2];
            i -= 2;
            cArr[i] = DigitTens[i2];
            j = j2;
        }
        int i3 = (int) j;
        while (i3 >= 65536) {
            int i4 = i3 / 100;
            int i5 = i3 - (((i4 << 6) + (i4 << 5)) + (i4 << 2));
            cArr[i - 1] = DigitOnes[i5];
            i -= 2;
            cArr[i] = DigitTens[i5];
            i3 = i4;
        }
        while (true) {
            int i6 = (52429 * i3) >>> 19;
            int i7 = i - 1;
            cArr[i7] = digits[i3 - ((i6 << 3) + (i6 << 1))];
            if (i6 == 0) {
                break;
            }
            i3 = i6;
            i = i7;
        }
        if (c != 0) {
            cArr[i - 2] = c;
        }
    }

    private void writeKeyWithDoubleQuoteIfHasSpecial(String str) {
        int length = str.length();
        boolean z = true;
        int i = this.count + length + 1;
        if (i > this.buf.length) {
            if (this.writer == null) {
                expandCapacity(i);
            } else if (length == 0) {
                write(34);
                write(34);
                write(58);
                return;
            } else {
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z = false;
                        break;
                    }
                    char charAt = str.charAt(i2);
                    byte[] bArr = specicalFlags_doubleQuotes;
                    if (charAt < bArr.length && bArr[charAt] != 0) {
                        break;
                    }
                    i2++;
                }
                if (z) {
                    write(34);
                }
                for (int i3 = 0; i3 < length; i3++) {
                    char charAt2 = str.charAt(i3);
                    byte[] bArr2 = specicalFlags_doubleQuotes;
                    if (charAt2 >= bArr2.length || bArr2[charAt2] == 0) {
                        write(charAt2);
                    } else {
                        write(92);
                        write(replaceChars[charAt2]);
                    }
                }
                if (z) {
                    write(34);
                }
                write(58);
                return;
            }
        }
        if (length == 0) {
            int i4 = this.count;
            if (i4 + 3 > this.buf.length) {
                expandCapacity(i4 + 3);
            }
            char[] cArr = this.buf;
            int i5 = this.count;
            int i6 = i5 + 1;
            this.count = i6;
            cArr[i5] = '\"';
            int i7 = i5 + 2;
            this.count = i7;
            cArr[i6] = '\"';
            this.count = i5 + 3;
            cArr[i7] = f7l.CONDITION_IF_MIDDLE;
            return;
        }
        int i8 = this.count;
        int i9 = i8 + length;
        str.getChars(0, length, this.buf, i8);
        this.count = i;
        int i10 = i8;
        boolean z2 = false;
        while (i10 < i9) {
            char[] cArr2 = this.buf;
            char c = cArr2[i10];
            byte[] bArr3 = specicalFlags_doubleQuotes;
            if (c < bArr3.length && bArr3[c] != 0) {
                if (!z2) {
                    i += 3;
                    if (i > cArr2.length) {
                        expandCapacity(i);
                    }
                    this.count = i;
                    char[] cArr3 = this.buf;
                    int i11 = i10 + 1;
                    System.arraycopy(cArr3, i11, cArr3, i10 + 3, (i9 - i10) - 1);
                    char[] cArr4 = this.buf;
                    System.arraycopy(cArr4, 0, cArr4, 1, i10);
                    char[] cArr5 = this.buf;
                    cArr5[i8] = '\"';
                    cArr5[i11] = '\\';
                    i10 += 2;
                    cArr5[i10] = replaceChars[c];
                    i9 += 2;
                    cArr5[this.count - 2] = '\"';
                    z2 = true;
                } else {
                    i++;
                    if (i > cArr2.length) {
                        expandCapacity(i);
                    }
                    this.count = i;
                    char[] cArr6 = this.buf;
                    int i12 = i10 + 1;
                    System.arraycopy(cArr6, i12, cArr6, i10 + 2, i9 - i10);
                    char[] cArr7 = this.buf;
                    cArr7[i10] = '\\';
                    cArr7[i12] = replaceChars[c];
                    i9++;
                    i10 = i12;
                }
            }
            i10++;
        }
        this.buf[this.count - 1] = f7l.CONDITION_IF_MIDDLE;
    }

    private void writeKeyWithSingleQuoteIfHasSpecial(String str) {
        int length = str.length();
        boolean z = true;
        int i = this.count + length + 1;
        if (i > this.buf.length) {
            if (this.writer == null) {
                expandCapacity(i);
            } else if (length == 0) {
                write(39);
                write(39);
                write(58);
                return;
            } else {
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z = false;
                        break;
                    }
                    char charAt = str.charAt(i2);
                    byte[] bArr = specicalFlags_singleQuotes;
                    if (charAt < bArr.length && bArr[charAt] != 0) {
                        break;
                    }
                    i2++;
                }
                if (z) {
                    write(39);
                }
                for (int i3 = 0; i3 < length; i3++) {
                    char charAt2 = str.charAt(i3);
                    byte[] bArr2 = specicalFlags_singleQuotes;
                    if (charAt2 >= bArr2.length || bArr2[charAt2] == 0) {
                        write(charAt2);
                    } else {
                        write(92);
                        write(replaceChars[charAt2]);
                    }
                }
                if (z) {
                    write(39);
                }
                write(58);
                return;
            }
        }
        if (length == 0) {
            int i4 = this.count;
            if (i4 + 3 > this.buf.length) {
                expandCapacity(i4 + 3);
            }
            char[] cArr = this.buf;
            int i5 = this.count;
            int i6 = i5 + 1;
            this.count = i6;
            cArr[i5] = '\'';
            int i7 = i5 + 2;
            this.count = i7;
            cArr[i6] = '\'';
            this.count = i5 + 3;
            cArr[i7] = f7l.CONDITION_IF_MIDDLE;
            return;
        }
        int i8 = this.count;
        int i9 = i8 + length;
        str.getChars(0, length, this.buf, i8);
        this.count = i;
        int i10 = i8;
        boolean z2 = false;
        while (i10 < i9) {
            char[] cArr2 = this.buf;
            char c = cArr2[i10];
            byte[] bArr3 = specicalFlags_singleQuotes;
            if (c < bArr3.length && bArr3[c] != 0) {
                if (!z2) {
                    i += 3;
                    if (i > cArr2.length) {
                        expandCapacity(i);
                    }
                    this.count = i;
                    char[] cArr3 = this.buf;
                    int i11 = i10 + 1;
                    System.arraycopy(cArr3, i11, cArr3, i10 + 3, (i9 - i10) - 1);
                    char[] cArr4 = this.buf;
                    System.arraycopy(cArr4, 0, cArr4, 1, i10);
                    char[] cArr5 = this.buf;
                    cArr5[i8] = '\'';
                    cArr5[i11] = '\\';
                    i10 += 2;
                    cArr5[i10] = replaceChars[c];
                    i9 += 2;
                    cArr5[this.count - 2] = '\'';
                    z2 = true;
                } else {
                    i++;
                    if (i > cArr2.length) {
                        expandCapacity(i);
                    }
                    this.count = i;
                    char[] cArr6 = this.buf;
                    int i12 = i10 + 1;
                    System.arraycopy(cArr6, i12, cArr6, i10 + 2, i9 - i10);
                    char[] cArr7 = this.buf;
                    cArr7[i10] = '\\';
                    cArr7[i12] = replaceChars[c];
                    i9++;
                    i10 = i12;
                }
            }
            i10++;
        }
        this.buf[i - 1] = f7l.CONDITION_IF_MIDDLE;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.writer != null && this.count > 0) {
            flush();
        }
        char[] cArr = this.buf;
        if (cArr.length <= 8192) {
            bufLocal.set(cArr);
        }
        this.buf = null;
    }

    public void config(SerializerFeature serializerFeature, boolean z) {
        if (z) {
            this.features = serializerFeature.mask | this.features;
            return;
        }
        this.features = (~serializerFeature.mask) & this.features;
    }

    public void expandCapacity(int i) {
        char[] cArr = this.buf;
        int length = ((cArr.length * 3) / 2) + 1;
        if (length >= i) {
            i = length;
        }
        char[] cArr2 = new char[i];
        System.arraycopy(cArr, 0, cArr2, 0, this.count);
        this.buf = cArr2;
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        Writer writer = this.writer;
        if (writer != null) {
            try {
                writer.write(this.buf, 0, this.count);
                this.writer.flush();
                this.count = 0;
            } catch (IOException e) {
                throw new JSONException(e.getMessage(), e);
            }
        }
    }

    public boolean isEnabled(SerializerFeature serializerFeature) {
        if ((serializerFeature.mask & this.features) != 0) {
            return true;
        }
        return false;
    }

    public byte[] toBytes(String str) {
        if (this.writer == null) {
            if (str == null) {
                str = "UTF-8";
            }
            try {
                return new String(this.buf, 0, this.count).getBytes(str);
            } catch (UnsupportedEncodingException e) {
                throw new JSONException("toBytes error", e);
            }
        } else {
            throw new UnsupportedOperationException("writer not null");
        }
    }

    public String toString() {
        return new String(this.buf, 0, this.count);
    }

    @Override // java.io.Writer
    public void write(int i) {
        int i2 = 1;
        int i3 = this.count + 1;
        if (i3 > this.buf.length) {
            if (this.writer == null) {
                expandCapacity(i3);
            } else {
                flush();
                this.buf[this.count] = (char) i;
                this.count = i2;
            }
        }
        i2 = i3;
        this.buf[this.count] = (char) i;
        this.count = i2;
    }

    public void writeByteArray(byte[] bArr) {
        boolean z;
        char c;
        char c2;
        char c3;
        String str;
        int length = bArr.length;
        int i = 0;
        if ((this.features & SerializerFeature.UseSingleQuotes.mask) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c = '\'';
        } else {
            c = '\"';
        }
        if (length == 0) {
            if (z) {
                str = "''";
            } else {
                str = "\"\"";
            }
            write(str);
            return;
        }
        char[] cArr = JSONLexer.CA;
        int i2 = (length / 3) * 3;
        int i3 = length - 1;
        int i4 = this.count;
        int i5 = (((i3 / 3) + 1) << 2) + i4;
        int i6 = i5 + 2;
        if (i6 > this.buf.length) {
            if (this.writer != null) {
                write(c);
                int i7 = 0;
                while (i7 < i2) {
                    int i8 = i7 + 2;
                    int i9 = (bArr[i7 + 1] & 255) << 8;
                    i7 += 3;
                    int i10 = i9 | ((bArr[i7] & 255) << 16) | (bArr[i8] & 255);
                    write(cArr[(i10 >>> 18) & 63]);
                    write(cArr[(i10 >>> 12) & 63]);
                    write(cArr[(i10 >>> 6) & 63]);
                    write(cArr[i10 & 63]);
                }
                int i11 = length - i2;
                if (i11 > 0) {
                    int i12 = (bArr[i2] & 255) << 10;
                    if (i11 == 2) {
                        i = (bArr[i3] & 255) << 2;
                    }
                    int i13 = i12 | i;
                    write(cArr[i13 >> 12]);
                    write(cArr[(i13 >>> 6) & 63]);
                    if (i11 == 2) {
                        c3 = cArr[i13 & 63];
                    } else {
                        c3 = '=';
                    }
                    write(c3);
                    write(61);
                }
                write(c);
                return;
            }
            expandCapacity(i6);
        }
        this.count = i6;
        int i14 = i4 + 1;
        this.buf[i4] = c;
        int i15 = 0;
        while (i15 < i2) {
            int i16 = i15 + 2;
            int i17 = (bArr[i15 + 1] & 255) << 8;
            i15 += 3;
            int i18 = i17 | ((bArr[i15] & 255) << 16) | (bArr[i16] & 255);
            char[] cArr2 = this.buf;
            cArr2[i14] = cArr[(i18 >>> 18) & 63];
            cArr2[i14 + 1] = cArr[(i18 >>> 12) & 63];
            int i19 = i14 + 3;
            cArr2[i14 + 2] = cArr[(i18 >>> 6) & 63];
            i14 += 4;
            cArr2[i19] = cArr[i18 & 63];
        }
        int i20 = length - i2;
        if (i20 > 0) {
            int i21 = (bArr[i2] & 255) << 10;
            if (i20 == 2) {
                i = (bArr[i3] & 255) << 2;
            }
            int i22 = i21 | i;
            char[] cArr3 = this.buf;
            cArr3[i5 - 3] = cArr[i22 >> 12];
            cArr3[i5 - 2] = cArr[(i22 >>> 6) & 63];
            int i23 = i5 - 1;
            if (i20 == 2) {
                c2 = cArr[i22 & 63];
            } else {
                c2 = '=';
            }
            cArr3[i23] = c2;
            cArr3[i5] = '=';
        }
        this.buf[i5 + 1] = c;
    }

    public void writeFieldName(String str, boolean z) {
        int i = this.features;
        if ((SerializerFeature.UseSingleQuotes.mask & i) != 0) {
            if ((SerializerFeature.QuoteFieldNames.mask & i) != 0) {
                writeStringWithSingleQuote(str);
                write(58);
                return;
            }
            writeKeyWithSingleQuoteIfHasSpecial(str);
        } else if ((i & SerializerFeature.QuoteFieldNames.mask) != 0) {
            writeStringWithDoubleQuote(str, f7l.CONDITION_IF_MIDDLE, z);
        } else {
            writeKeyWithDoubleQuoteIfHasSpecial(str);
        }
    }

    public void writeInt(int i) {
        int i2;
        if (i == Integer.MIN_VALUE) {
            write("-2147483648");
            return;
        }
        if (i < 0) {
            i2 = -i;
        } else {
            i2 = i;
        }
        int i3 = 0;
        while (i2 > sizeTable[i3]) {
            i3++;
        }
        int i4 = i3 + 1;
        if (i < 0) {
            i4 = i3 + 2;
        }
        int i5 = this.count + i4;
        if (i5 > this.buf.length) {
            if (this.writer == null) {
                expandCapacity(i5);
            } else {
                char[] cArr = new char[i4];
                getChars(i, i4, cArr);
                write(cArr, 0, i4);
                return;
            }
        }
        getChars(i, i5, this.buf);
        this.count = i5;
    }

    public void writeLong(long j) {
        long j2;
        int i;
        if (j == Long.MIN_VALUE) {
            write("-9223372036854775808");
            return;
        }
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i2 < 0) {
            j2 = -j;
        } else {
            j2 = j;
        }
        int i3 = 1;
        long j3 = 10;
        while (true) {
            i = 19;
            if (i3 >= 19) {
                i3 = 0;
                break;
            } else if (j2 < j3) {
                break;
            } else {
                j3 *= 10;
                i3++;
            }
        }
        if (i3 != 0) {
            i = i3;
        }
        if (i2 < 0) {
            i++;
        }
        int i4 = this.count + i;
        if (i4 > this.buf.length) {
            if (this.writer == null) {
                expandCapacity(i4);
            } else {
                char[] cArr = new char[i];
                getChars(j, i, cArr);
                write(cArr, 0, i);
                return;
            }
        }
        getChars(j, i4, this.buf);
        this.count = i4;
    }

    public void writeNull() {
        write("null");
    }

    public void writeString(String str) {
        if ((this.features & SerializerFeature.UseSingleQuotes.mask) != 0) {
            writeStringWithSingleQuote(str);
        } else {
            writeStringWithDoubleQuote(str, (char) 0, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0090, code lost:
        if (r14 == (-1)) goto L_0x0092;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0092, code lost:
        r12 = r8;
        r14 = r13;
        r15 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00dd, code lost:
        if (r14 == (-1)) goto L_0x0092;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void writeStringWithDoubleQuote(java.lang.String r17, char r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.SerializeWriter.writeStringWithDoubleQuote(java.lang.String, char, boolean):void");
    }

    public void writeTo(Writer writer) throws IOException {
        if (this.writer == null) {
            writer.write(this.buf, 0, this.count);
            return;
        }
        throw new UnsupportedOperationException("writer not null");
    }

    public SerializeWriter(Writer writer) {
        this.writer = writer;
        this.features = JSON.DEFAULT_GENERATE_FEATURE;
        ThreadLocal<char[]> threadLocal = bufLocal;
        this.buf = threadLocal.get();
        if (threadLocal != null) {
            threadLocal.set(null);
        }
        if (this.buf == null) {
            this.buf = new char[1024];
        }
    }

    public void writeStringWithSingleQuote(String str) {
        int i = 0;
        if (str == null) {
            int i2 = this.count + 4;
            if (i2 > this.buf.length) {
                expandCapacity(i2);
            }
            "null".getChars(0, 4, this.buf, this.count);
            this.count = i2;
            return;
        }
        int length = str.length();
        int i3 = this.count + length + 2;
        if (i3 > this.buf.length) {
            if (this.writer != null) {
                write(39);
                while (i < str.length()) {
                    char charAt = str.charAt(i);
                    if (charAt <= '\r' || charAt == '\\' || charAt == '\'' || (charAt == '/' && (this.features & SerializerFeature.WriteSlashAsSpecial.mask) != 0)) {
                        write(92);
                        write(replaceChars[charAt]);
                    } else {
                        write(charAt);
                    }
                    i++;
                }
                write(39);
                return;
            }
            expandCapacity(i3);
        }
        int i4 = this.count;
        int i5 = i4 + 1;
        int i6 = i5 + length;
        char[] cArr = this.buf;
        cArr[i4] = '\'';
        str.getChars(0, length, cArr, i5);
        this.count = i3;
        char c = 0;
        int i7 = -1;
        for (int i8 = i5; i8 < i6; i8++) {
            char c2 = this.buf[i8];
            if (c2 <= '\r' || c2 == '\\' || c2 == '\'' || (c2 == '/' && (this.features & SerializerFeature.WriteSlashAsSpecial.mask) != 0)) {
                i++;
                i7 = i8;
                c = c2;
            }
        }
        int i9 = i3 + i;
        if (i9 > this.buf.length) {
            expandCapacity(i9);
        }
        this.count = i9;
        if (i == 1) {
            char[] cArr2 = this.buf;
            int i10 = i7 + 1;
            System.arraycopy(cArr2, i10, cArr2, i7 + 2, (i6 - i7) - 1);
            char[] cArr3 = this.buf;
            cArr3[i7] = '\\';
            cArr3[i10] = replaceChars[c];
        } else if (i > 1) {
            char[] cArr4 = this.buf;
            int i11 = i7 + 1;
            System.arraycopy(cArr4, i11, cArr4, i7 + 2, (i6 - i7) - 1);
            char[] cArr5 = this.buf;
            cArr5[i7] = '\\';
            cArr5[i11] = replaceChars[c];
            int i12 = i6 + 1;
            for (int i13 = i7 - 1; i13 >= i5; i13--) {
                char[] cArr6 = this.buf;
                char c3 = cArr6[i13];
                if (c3 <= '\r' || c3 == '\\' || c3 == '\'' || (c3 == '/' && (this.features & SerializerFeature.WriteSlashAsSpecial.mask) != 0)) {
                    int i14 = i13 + 1;
                    System.arraycopy(cArr6, i14, cArr6, i13 + 2, (i12 - i13) - 1);
                    char[] cArr7 = this.buf;
                    cArr7[i13] = '\\';
                    cArr7[i14] = replaceChars[c3];
                    i12++;
                }
            }
        }
        this.buf[this.count - 1] = '\'';
    }

    public void writeTo(OutputStream outputStream, String str) throws IOException {
        writeTo(outputStream, Charset.forName(str));
    }

    public void writeTo(OutputStream outputStream, Charset charset) throws IOException {
        if (this.writer == null) {
            outputStream.write(new String(this.buf, 0, this.count).getBytes(charset.name()));
            return;
        }
        throw new UnsupportedOperationException("writer not null");
    }

    @Override // java.io.Writer, java.lang.Appendable
    public SerializeWriter append(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "null" : charSequence.toString();
        write(charSequence2, 0, charSequence2.length());
        return this;
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        int i3;
        if (i < 0 || i > cArr.length || i2 < 0 || (i3 = i + i2) > cArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        } else if (i2 != 0) {
            int i4 = this.count + i2;
            if (i4 > this.buf.length) {
                if (this.writer == null) {
                    expandCapacity(i4);
                } else {
                    do {
                        char[] cArr2 = this.buf;
                        int length = cArr2.length;
                        int i5 = this.count;
                        int i6 = length - i5;
                        System.arraycopy(cArr, i, cArr2, i5, i6);
                        this.count = this.buf.length;
                        flush();
                        i2 -= i6;
                        i += i6;
                    } while (i2 > this.buf.length);
                    i4 = i2;
                }
            }
            System.arraycopy(cArr, i, this.buf, this.count, i2);
            this.count = i4;
        }
    }

    public SerializeWriter(SerializerFeature... serializerFeatureArr) {
        this(null, 0, serializerFeatureArr);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public SerializeWriter append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            charSequence = "null";
        }
        String charSequence2 = charSequence.subSequence(i, i2).toString();
        write(charSequence2, 0, charSequence2.length());
        return this;
    }

    public SerializeWriter(Writer writer, int i, SerializerFeature[] serializerFeatureArr) {
        this.writer = writer;
        ThreadLocal<char[]> threadLocal = bufLocal;
        char[] cArr = threadLocal.get();
        this.buf = cArr;
        if (cArr != null) {
            threadLocal.set(null);
        }
        if (this.buf == null) {
            this.buf = new char[1024];
        }
        for (SerializerFeature serializerFeature : serializerFeatureArr) {
            i |= serializerFeature.mask;
        }
        this.features = i;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public SerializeWriter append(char c) {
        write(c);
        return this;
    }

    public SerializeWriter(int i) {
        this(null, i);
    }

    public SerializeWriter(Writer writer, int i) {
        this.writer = writer;
        if (i > 0) {
            this.buf = new char[i];
            return;
        }
        throw new IllegalArgumentException("Negative initial size: " + i);
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) {
        int i3;
        int i4 = this.count + i2;
        if (i4 > this.buf.length) {
            if (this.writer == null) {
                expandCapacity(i4);
            } else {
                while (true) {
                    char[] cArr = this.buf;
                    int length = cArr.length;
                    int i5 = this.count;
                    int i6 = length - i5;
                    i3 = i + i6;
                    str.getChars(i, i3, cArr, i5);
                    this.count = this.buf.length;
                    flush();
                    i2 -= i6;
                    if (i2 <= this.buf.length) {
                        break;
                    }
                    i = i3;
                }
                i4 = i2;
                i = i3;
            }
        }
        str.getChars(i, i2 + i, this.buf, this.count);
        this.count = i4;
    }

    @Override // java.io.Writer
    public void write(String str) {
        if (str == null) {
            writeNull();
        } else {
            write(str, 0, str.length());
        }
    }

    public void write(boolean z) {
        write(z ? "true" : "false");
    }
}
