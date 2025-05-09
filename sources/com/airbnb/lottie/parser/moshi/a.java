package com.airbnb.lottie.parser.moshi;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.EOFException;
import java.io.IOException;
import okio.BufferedSource;
import okio.ByteString;
import tb.f7l;
import tb.zhh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class a extends JsonReader {
    public static final ByteString l = ByteString.encodeUtf8("'\\");
    public static final ByteString m = ByteString.encodeUtf8("\"\\");
    public static final ByteString n = ByteString.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");
    public final BufferedSource f;
    public final okio.a g;
    public int h = 0;
    public long i;
    public int j;
    public String k;

    static {
        ByteString.encodeUtf8("\n\r");
        ByteString.encodeUtf8("*/");
    }

    public a(BufferedSource bufferedSource) {
        this.f = bufferedSource;
        if (bufferedSource == null) {
            zhh.b("source == null");
            this.g = null;
            return;
        }
        this.g = bufferedSource.buffer();
        B0(6);
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void A() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = O0();
        }
        if (i == 2) {
            int i2 = this.f1858a;
            int i3 = i2 - 1;
            this.f1858a = i3;
            this.c[i3] = null;
            int[] iArr = this.d;
            int i4 = i2 - 2;
            iArr[i4] = iArr[i4] + 1;
            this.h = 0;
            return;
        }
        zhh.b("Expected END_OBJECT but was " + u0() + " at path " + C());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int C0(JsonReader.a aVar) throws IOException {
        int i = this.h;
        if (i == 0) {
            i = O0();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return P0(this.k, aVar);
        }
        int s0 = this.f.s0(aVar.b);
        if (s0 != -1) {
            this.h = 0;
            this.c[this.f1858a - 1] = aVar.f1859a[s0];
            return s0;
        }
        String str = this.c[this.f1858a - 1];
        String f0 = f0();
        int P0 = P0(f0, aVar);
        if (P0 == -1) {
            this.h = 15;
            this.k = f0;
            this.c[this.f1858a - 1] = str;
        }
        return P0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void D0() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = O0();
        }
        if (i == 14) {
            Y0();
        } else if (i == 13) {
            X0(m);
        } else if (i == 12) {
            X0(l);
        } else if (i != 15) {
            zhh.b("Expected a name but was " + u0() + " at path " + C());
            return;
        }
        this.h = 0;
        this.c[this.f1858a - 1] = "null";
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean F() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = O0();
        }
        if (i == 2 || i == 4 || i == 18) {
            return false;
        }
        return true;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean L() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = O0();
        }
        if (i == 5) {
            this.h = 0;
            int[] iArr = this.d;
            int i2 = this.f1858a - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.h = 0;
            int[] iArr2 = this.d;
            int i3 = this.f1858a - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            zhh.b("Expected a boolean but was " + u0() + " at path " + C());
            return false;
        }
    }

    public final void N0() throws IOException {
        M0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public final int O0() throws IOException {
        int[] iArr = this.b;
        int i = this.f1858a - 1;
        int i2 = iArr[i];
        okio.a aVar = this.g;
        if (i2 == 1) {
            iArr[i] = 2;
        } else if (i2 == 2) {
            int R0 = R0(true);
            aVar.readByte();
            if (R0 != 44) {
                if (R0 == 59) {
                    N0();
                    throw null;
                } else if (R0 == 93) {
                    this.h = 4;
                    return 4;
                } else {
                    M0("Unterminated array");
                    throw null;
                }
            }
        } else if (i2 == 3 || i2 == 5) {
            iArr[i] = 4;
            if (i2 == 5) {
                int R02 = R0(true);
                aVar.readByte();
                if (R02 != 44) {
                    if (R02 == 59) {
                        N0();
                        throw null;
                    } else if (R02 == 125) {
                        this.h = 2;
                        return 2;
                    } else {
                        M0("Unterminated object");
                        throw null;
                    }
                }
            }
            int R03 = R0(true);
            if (R03 == 34) {
                aVar.readByte();
                this.h = 13;
                return 13;
            } else if (R03 == 39) {
                aVar.readByte();
                N0();
                throw null;
            } else if (R03 != 125) {
                N0();
                throw null;
            } else if (i2 != 5) {
                aVar.readByte();
                this.h = 2;
                return 2;
            } else {
                M0("Expected name");
                throw null;
            }
        } else if (i2 == 4) {
            iArr[i] = 5;
            int R04 = R0(true);
            aVar.readByte();
            if (R04 != 58) {
                if (R04 != 61) {
                    M0("Expected ':'");
                    throw null;
                }
                N0();
                throw null;
            }
        } else if (i2 == 6) {
            iArr[i] = 7;
        } else if (i2 == 7) {
            if (R0(false) == -1) {
                this.h = 18;
                return 18;
            }
            N0();
            throw null;
        } else if (i2 == 8) {
            zhh.b("JsonReader is closed");
            this.h = 0;
            return 0;
        }
        int R05 = R0(true);
        if (R05 == 34) {
            aVar.readByte();
            this.h = 9;
            return 9;
        } else if (R05 != 39) {
            if (!(R05 == 44 || R05 == 59)) {
                if (R05 == 91) {
                    aVar.readByte();
                    this.h = 3;
                    return 3;
                } else if (R05 != 93) {
                    if (R05 != 123) {
                        int U0 = U0();
                        if (U0 != 0) {
                            return U0;
                        }
                        int V0 = V0();
                        if (V0 != 0) {
                            return V0;
                        }
                        if (!Q0(aVar.C(0L))) {
                            M0("Expected value");
                            throw null;
                        }
                        N0();
                        throw null;
                    }
                    aVar.readByte();
                    this.h = 1;
                    return 1;
                } else if (i2 == 1) {
                    aVar.readByte();
                    this.h = 4;
                    return 4;
                }
            }
            if (i2 == 1 || i2 == 2) {
                N0();
                throw null;
            }
            M0("Unexpected value");
            throw null;
        } else {
            N0();
            throw null;
        }
    }

    public final int P0(String str, JsonReader.a aVar) {
        int length = aVar.f1859a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.f1859a[i])) {
                this.h = 0;
                this.c[this.f1858a - 1] = str;
                return i;
            }
        }
        return -1;
    }

    public final boolean Q0(int i) throws IOException {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (!(i == 47 || i == 61)) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        N0();
        throw null;
    }

    public final int R0(boolean z) throws IOException {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            BufferedSource bufferedSource = this.f;
            if (bufferedSource.request(i2)) {
                okio.a aVar = this.g;
                byte C = aVar.C(i);
                if (C == 10 || C == 32 || C == 13 || C == 9) {
                    i = i2;
                } else {
                    aVar.skip(i);
                    if (C == 47) {
                        if (!bufferedSource.request(2L)) {
                            return C;
                        }
                        N0();
                        throw null;
                    } else if (C != 35) {
                        return C;
                    } else {
                        N0();
                        throw null;
                    }
                }
            } else if (!z) {
                return -1;
            } else {
                throw new EOFException("End of input");
            }
        }
    }

    public final String S0(ByteString byteString) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long i = this.f.i(byteString);
            if (i != -1) {
                okio.a aVar = this.g;
                if (aVar.C(i) == 92) {
                    if (sb == null) {
                        sb = new StringBuilder();
                    }
                    sb.append(aVar.readUtf8(i));
                    aVar.readByte();
                    sb.append(W0());
                } else if (sb == null) {
                    String readUtf8 = aVar.readUtf8(i);
                    aVar.readByte();
                    return readUtf8;
                } else {
                    sb.append(aVar.readUtf8(i));
                    aVar.readByte();
                    return sb.toString();
                }
            } else {
                M0("Unterminated string");
                throw null;
            }
        }
    }

    public final String T0() throws IOException {
        long i = this.f.i(n);
        okio.a aVar = this.g;
        if (i != -1) {
            return aVar.readUtf8(i);
        }
        return aVar.readUtf8();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0082, code lost:
        if (Q0(r1) != false) goto L_0x00b8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0084, code lost:
        if (r6 != 2) goto L_0x00a7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0086, code lost:
        if (r7 == false) goto L_0x00a7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008c, code lost:
        if (r8 != Long.MIN_VALUE) goto L_0x0090;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008e, code lost:
        if (r10 == false) goto L_0x00a7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0094, code lost:
        if (r8 != 0) goto L_0x0098;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0096, code lost:
        if (r10 != false) goto L_0x00a7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0098, code lost:
        if (r10 == false) goto L_0x009b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009b, code lost:
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009c, code lost:
        r18.i = r8;
        r14.skip(r5);
        r18.h = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a6, code lost:
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a7, code lost:
        if (r6 == 2) goto L_0x00b1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00aa, code lost:
        if (r6 == 4) goto L_0x00b1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ad, code lost:
        if (r6 != 7) goto L_0x00b0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b0, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b1, code lost:
        r18.j = r5;
        r18.h = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b7, code lost:
        return 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b8, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int V0() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.a.V0():int");
    }

    public final char W0() throws IOException {
        int i;
        BufferedSource bufferedSource = this.f;
        if (bufferedSource.request(1L)) {
            okio.a aVar = this.g;
            byte readByte = aVar.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte == 98) {
                return '\b';
            }
            if (readByte == 102) {
                return '\f';
            }
            if (readByte == 110) {
                return '\n';
            }
            if (readByte == 114) {
                return '\r';
            }
            if (readByte == 116) {
                return '\t';
            }
            if (readByte != 117) {
                M0("Invalid escape sequence: \\" + ((char) readByte));
                throw null;
            } else if (bufferedSource.request(4L)) {
                char c = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    byte C = aVar.C(i2);
                    char c2 = (char) (c << 4);
                    if (C >= 48 && C <= 57) {
                        i = C - 48;
                    } else if (C >= 97 && C <= 102) {
                        i = C - 87;
                    } else if (C < 65 || C > 70) {
                        M0("\\u".concat(aVar.readUtf8(4L)));
                        throw null;
                    } else {
                        i = C - 55;
                    }
                    c = (char) (c2 + i);
                }
                aVar.skip(4L);
                return c;
            } else {
                throw new EOFException("Unterminated escape sequence at path " + C());
            }
        } else {
            M0("Unterminated escape sequence");
            throw null;
        }
    }

    public final void X0(ByteString byteString) throws IOException {
        while (true) {
            long i = this.f.i(byteString);
            if (i != -1) {
                okio.a aVar = this.g;
                if (aVar.C(i) == 92) {
                    aVar.skip(i + 1);
                    W0();
                } else {
                    aVar.skip(i + 1);
                    return;
                }
            } else {
                M0("Unterminated string");
                throw null;
            }
        }
    }

    public final void Y0() throws IOException {
        long i = this.f.i(n);
        okio.a aVar = this.g;
        if (i == -1) {
            i = aVar.f0();
        }
        aVar.skip(i);
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public double Z() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = O0();
        }
        if (i == 16) {
            this.h = 0;
            int[] iArr = this.d;
            int i2 = this.f1858a - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.i;
        }
        if (i == 17) {
            this.k = this.g.readUtf8(this.j);
        } else if (i == 9) {
            this.k = S0(m);
        } else if (i == 8) {
            this.k = S0(l);
        } else if (i == 10) {
            this.k = T0();
        } else if (i != 11) {
            zhh.b("Expected a double but was " + u0() + " at path " + C());
            return this.i;
        }
        this.h = 11;
        try {
            double parseDouble = Double.parseDouble(this.k);
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                zhh.b("JSON forbids NaN and infinities: " + parseDouble + " at path " + C());
                return this.i;
            }
            this.k = null;
            this.h = 0;
            int[] iArr2 = this.d;
            int i3 = this.f1858a - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            zhh.b("Expected a double but was " + this.k + " at path " + C());
            return this.i;
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int c0() throws IOException {
        long j;
        String str;
        int i = this.h;
        if (i == 0) {
            i = O0();
        }
        if (i == 16) {
            long j2 = this.i;
            int i2 = (int) j2;
            if (j2 != i2) {
                zhh.b("Expected an int but was " + this.i + " at path " + C());
                j = this.i;
            } else {
                this.h = 0;
                int[] iArr = this.d;
                int i3 = this.f1858a - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
        } else {
            if (i == 17) {
                this.k = this.g.readUtf8(this.j);
            } else if (i == 9 || i == 8) {
                if (i == 9) {
                    str = S0(m);
                } else {
                    str = S0(l);
                }
                this.k = str;
                try {
                    int parseInt = Integer.parseInt(str);
                    this.h = 0;
                    int[] iArr2 = this.d;
                    int i4 = this.f1858a - 1;
                    iArr2[i4] = iArr2[i4] + 1;
                    return parseInt;
                } catch (NumberFormatException unused) {
                }
            } else if (i != 11) {
                zhh.b("Expected an int but was " + u0() + " at path " + C());
                j = this.i;
            }
            this.h = 11;
            try {
                double parseDouble = Double.parseDouble(this.k);
                int i5 = (int) parseDouble;
                if (i5 != parseDouble) {
                    zhh.b("Expected an int but was " + this.k + " at path " + C());
                    j = this.i;
                } else {
                    this.k = null;
                    this.h = 0;
                    int[] iArr3 = this.d;
                    int i6 = this.f1858a - 1;
                    iArr3[i6] = iArr3[i6] + 1;
                    return i5;
                }
            } catch (NumberFormatException unused2) {
                zhh.b("Expected an int but was " + this.k + " at path " + C());
                j = this.i;
            }
        }
        return (int) j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.h = 0;
        this.b[0] = 8;
        this.f1858a = 1;
        this.g.e();
        this.f.close();
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void e() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = O0();
        }
        if (i == 3) {
            B0(1);
            this.d[this.f1858a - 1] = 0;
            this.h = 0;
            return;
        }
        zhh.b("Expected BEGIN_ARRAY but was " + u0() + " at path " + C());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String f0() throws IOException {
        String str;
        int i = this.h;
        if (i == 0) {
            i = O0();
        }
        if (i == 14) {
            str = T0();
        } else if (i == 13) {
            str = S0(m);
        } else if (i == 12) {
            str = S0(l);
        } else if (i == 15) {
            str = this.k;
        } else {
            zhh.b("Expected a name but was " + u0() + " at path " + C());
            return this.k;
        }
        this.h = 0;
        this.c[this.f1858a - 1] = str;
        return str;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void g() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = O0();
        }
        if (i == 1) {
            B0(3);
            this.h = 0;
            return;
        }
        zhh.b("Expected BEGIN_OBJECT but was " + u0() + " at path " + C());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String i0() throws IOException {
        String str;
        int i = this.h;
        if (i == 0) {
            i = O0();
        }
        if (i == 10) {
            str = T0();
        } else if (i == 9) {
            str = S0(m);
        } else if (i == 8) {
            str = S0(l);
        } else if (i == 11) {
            str = this.k;
            this.k = null;
        } else if (i == 16) {
            str = Long.toString(this.i);
        } else if (i == 17) {
            str = this.g.readUtf8(this.j);
        } else {
            zhh.b("Expected a string but was " + u0() + " at path " + C());
            return this.k;
        }
        this.h = 0;
        int[] iArr = this.d;
        int i2 = this.f1858a - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public String toString() {
        return "JsonReader(" + this.f + f7l.BRACKET_END_STR;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public JsonReader.Token u0() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = O0();
        }
        switch (i) {
            case 1:
                return JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return JsonReader.Token.END_OBJECT;
            case 3:
                return JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return JsonReader.Token.END_ARRAY;
            case 5:
            case 6:
                return JsonReader.Token.BOOLEAN;
            case 7:
                return JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader.Token.NAME;
            case 16:
            case 17:
                return JsonReader.Token.NUMBER;
            case 18:
                return JsonReader.Token.END_DOCUMENT;
            default:
                return JsonReader.Token.NULL;
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void w() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = O0();
        }
        if (i == 4) {
            int i2 = this.f1858a;
            this.f1858a = i2 - 1;
            int[] iArr = this.d;
            int i3 = i2 - 2;
            iArr[i3] = iArr[i3] + 1;
            this.h = 0;
            return;
        }
        zhh.b("Expected END_ARRAY but was " + u0() + " at path " + C());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void E0() throws IOException {
        int i = 0;
        do {
            int i2 = this.h;
            if (i2 == 0) {
                i2 = O0();
            }
            if (i2 == 3) {
                B0(1);
            } else if (i2 == 1) {
                B0(3);
            } else {
                if (i2 == 4) {
                    i--;
                    if (i < 0) {
                        zhh.b("Expected a value but was " + u0() + " at path " + C());
                        return;
                    }
                    this.f1858a--;
                } else if (i2 == 2) {
                    i--;
                    if (i < 0) {
                        zhh.b("Expected a value but was " + u0() + " at path " + C());
                        return;
                    }
                    this.f1858a--;
                } else if (i2 == 14 || i2 == 10) {
                    Y0();
                } else if (i2 == 9 || i2 == 13) {
                    X0(m);
                } else if (i2 == 8 || i2 == 12) {
                    X0(l);
                } else if (i2 == 17) {
                    this.g.skip(this.j);
                } else if (i2 == 18) {
                    zhh.b("Expected a value but was " + u0() + " at path " + C());
                    return;
                }
                this.h = 0;
            }
            i++;
            this.h = 0;
        } while (i != 0);
        int[] iArr = this.d;
        int i3 = this.f1858a;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.c[i3 - 1] = "null";
    }

    public final int U0() throws IOException {
        int i;
        String str;
        String str2;
        okio.a aVar = this.g;
        byte C = aVar.C(0L);
        if (C == 116 || C == 84) {
            str2 = "true";
            str = "TRUE";
            i = 5;
        } else if (C == 102 || C == 70) {
            str2 = "false";
            str = "FALSE";
            i = 6;
        } else if (C != 110 && C != 78) {
            return 0;
        } else {
            str2 = "null";
            str = "NULL";
            i = 7;
        }
        int length = str2.length();
        int i2 = 1;
        while (true) {
            BufferedSource bufferedSource = this.f;
            if (i2 < length) {
                int i3 = i2 + 1;
                if (!bufferedSource.request(i3)) {
                    return 0;
                }
                byte C2 = aVar.C(i2);
                if (C2 != str2.charAt(i2) && C2 != str.charAt(i2)) {
                    return 0;
                }
                i2 = i3;
            } else if (bufferedSource.request(length + 1) && Q0(aVar.C(length))) {
                return 0;
            } else {
                aVar.skip(length);
                this.h = i;
                return i;
            }
        }
    }
}
