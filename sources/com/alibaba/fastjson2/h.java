package com.alibaba.fastjson2;

import anet.channel.util.ErrorConstant;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.function.Supplier;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import sun.misc.Unsafe;
import tb.afk;
import tb.b2d;
import tb.jdk;
import tb.ls9;
import tb.opf;
import tb.p7h;
import tb.q7h;
import tb.rgk;
import tb.tiv;
import tb.vcf;
import tb.vu3;
import tb.wek;
import tb.wh6;
import tb.wqf;
import tb.wqx;
import tb.x9h;
import tb.xek;
import tb.xqx;
import tb.yqf;
import tb.zek;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class h extends JSONReader {
    public static Charset M;
    public int A;
    public byte B;
    public int C;
    public char[] D;
    public final JSONFactory.CacheItem E;
    public long F;
    public int G;
    public int H;
    public byte I;
    public long[] J;
    public final byte[] x;
    public final int y;
    public byte z;
    public static final long K = opf.UNSAFE.arrayBaseOffset(byte[].class);
    public static final byte[] L = yqf.a(wqx.SHANGHAI_ZONE_ID_NAME);
    public static final byte[] N = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 3, 3, 3, 3, 3, 3, 3, 0, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 0, -1, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 5, 0, 0, 1, 1, 1, 0, 0, 0, 9, 0, 5, 0, 0, 0, 0, 3, 2, 9, 5, 3, 3, 3, 3, 3, 3, 3, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

    public h(JSONReader.c cVar, byte[] bArr, int i, int i2) {
        super(cVar, true);
        this.x = bArr;
        this.c = i;
        this.y = i + i2;
        cVar.getClass();
        JSONFactory.CacheItem[] cacheItemArr = JSONFactory.q;
        this.E = cacheItemArr[System.identityHashCode(Thread.currentThread()) & (cacheItemArr.length - 1)];
    }

    public static JSONException R3(int i) {
        throw new JSONException("type ref not found : " + i);
    }

    public static int r3(byte[] bArr, int i, int i2) {
        return ((i2 - 68) << 16) + ((bArr[i] & 255) << 8) + (bArr[i + 1] & 255);
    }

    public static JSONException w3(byte b) {
        return new JSONException("name not support input : " + yqf.b(b));
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean A1(char c, char c2, char c3, char c4, char c5) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final q7h A2() {
        q7h J;
        int i = this.c;
        byte[] bArr = this.x;
        if (bArr[i] != 89 || (J = DateUtils.J(bArr, i + 1)) == null) {
            throw new JSONException("date only support string input");
        }
        this.c += 17;
        return J;
    }

    public final double A3() {
        BigDecimal bigDecimal;
        int i;
        int i2 = this.c;
        int i3 = i2 + 1;
        this.c = i3;
        byte[] bArr = this.x;
        byte b = bArr[i2];
        if (b == -74) {
            return p2();
        }
        if (b == -73) {
            int i4 = opf.UNSAFE.getInt(bArr, opf.ARRAY_BYTE_BASE_OFFSET + i3);
            this.c += 4;
            if (!opf.BIG_ENDIAN) {
                i4 = Integer.reverseBytes(i4);
            }
            return Float.intBitsToFloat(i4);
        } else if (b != -71) {
            if (b != 72) {
                if (b == 124) {
                    int p2 = p2();
                    String str = new String(bArr, this.c, p2, StandardCharsets.UTF_16LE);
                    this.c += p2;
                    if (str.indexOf(46) == -1) {
                        return new BigInteger(str).intValue();
                    }
                    return TypeUtils.E(str).intValue();
                } else if (b == 121) {
                    int p22 = p2();
                    String str2 = new String(bArr, this.c, p22, StandardCharsets.ISO_8859_1);
                    this.c += p22;
                    if (str2.indexOf(46) == -1) {
                        return new BigInteger(str2).intValue();
                    }
                    return TypeUtils.E(str2).intValue();
                } else if (b != 122) {
                    switch (b) {
                        case -81:
                            if ((this.f2453a.c & JSONReader.Feature.ErrorOnNullForPrimitives.mask) == 0) {
                                this.h = true;
                                return vu3.b.GEO_NOT_SUPPORT;
                            }
                            throw new JSONException(a1("long value not support input null"));
                        case -80:
                        case -78:
                            return vu3.b.GEO_NOT_SUPPORT;
                        case -79:
                        case -77:
                            return 1.0d;
                        case -76:
                            return r2();
                        default:
                            switch (b) {
                                case -68:
                                    this.c = i2 + 3;
                                    return (bArr[i2 + 2] & 255) + (bArr[i3] << 8);
                                case -67:
                                    this.c = i2 + 2;
                                    return bArr[i3];
                                case -66:
                                    long j = opf.UNSAFE.getLong(bArr, opf.ARRAY_BYTE_BASE_OFFSET + i3);
                                    this.c += 8;
                                    if (!opf.BIG_ENDIAN) {
                                        j = Long.reverseBytes(j);
                                    }
                                    return j;
                                case -65:
                                    break;
                                default:
                                    if (b >= -16 && b <= 47) {
                                        return b;
                                    }
                                    if (b >= 48 && b <= 63) {
                                        this.c = i2 + 2;
                                        return ((b - 56) << 8) + (bArr[i3] & 255);
                                    } else if (b >= 64 && b <= 71) {
                                        int r3 = r3(bArr, i3, b);
                                        this.c += 2;
                                        return r3;
                                    } else if (b >= -40 && b <= -17) {
                                        return (b - (-40)) - 8;
                                    } else {
                                        if (b >= -56 && b <= -41) {
                                            this.c = i2 + 2;
                                            return ((b + 48) << 8) + (bArr[i3] & 255);
                                        } else if (b >= -64 && b <= -57) {
                                            this.c = i2 + 2;
                                            this.c = i2 + 3;
                                            return ((b + 60) << 16) + ((bArr[i3] & 255) << 8) + (bArr[i] & 255);
                                        } else if (b < 73 || b > 120) {
                                            throw w3(b);
                                        } else {
                                            int i5 = b - 73;
                                            String s3 = s3(i3, i5);
                                            this.c += i5;
                                            if (s3.indexOf(46) == -1) {
                                                return new BigInteger(s3).intValue();
                                            }
                                            return TypeUtils.E(s3).intValue();
                                        }
                                    }
                            }
                    }
                } else {
                    int p23 = p2();
                    String str3 = new String(bArr, this.c, p23, StandardCharsets.UTF_8);
                    this.c += p23;
                    if (str3.indexOf(46) == -1) {
                        return new BigInteger(str3).intValue();
                    }
                    return TypeUtils.E(str3).intValue();
                }
            }
            int i6 = opf.UNSAFE.getInt(bArr, opf.ARRAY_BYTE_BASE_OFFSET + i3);
            this.c += 4;
            if (!opf.BIG_ENDIAN) {
                i6 = Integer.reverseBytes(i6);
            }
            return i6;
        } else {
            int p24 = p2();
            BigInteger X1 = X1();
            if (p24 == 0) {
                bigDecimal = new BigDecimal(X1);
            } else {
                bigDecimal = new BigDecimal(X1, p24);
            }
            return bigDecimal.intValue();
        }
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean B1() {
        int i = this.c;
        if (this.x[i] != -110) {
            return false;
        }
        this.c = i + 1;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final q7h B2() {
        q7h L2;
        int i = this.c;
        byte[] bArr = this.x;
        if (bArr[i] != 90 || (L2 = DateUtils.L(bArr, i + 1)) == null) {
            throw new JSONException("date only support string input");
        }
        this.c += 18;
        return L2;
    }

    public JSONException B3() {
        StringBuilder sb = new StringBuilder("fieldName not support input type ");
        sb.append(yqf.b(this.B));
        if (this.B == -109) {
            sb.append(" ");
            sb.append(Q2());
        }
        sb.append(", offset ");
        sb.append(this.c);
        return new JSONException(sb.toString());
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean C1() {
        int i = this.c;
        if (this.x[i] != -81) {
            return false;
        }
        this.c = i + 1;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final q7h C2() {
        int i = this.c;
        byte[] bArr = this.x;
        if (bArr[i] == 91) {
            q7h N2 = DateUtils.N(bArr, i + 1);
            this.c += 19;
            return N2;
        }
        throw new JSONException("date only support string input");
    }

    public final float C3() {
        BigDecimal bigDecimal;
        int i;
        int i2 = this.c;
        int i3 = i2 + 1;
        this.c = i3;
        byte[] bArr = this.x;
        byte b = bArr[i2];
        if (b != -71) {
            if (b != 72) {
                if (b == 124) {
                    int p2 = p2();
                    String str = new String(bArr, this.c, p2, StandardCharsets.UTF_16LE);
                    this.c += p2;
                    if (str.indexOf(46) == -1) {
                        return new BigInteger(str).intValue();
                    }
                    return TypeUtils.E(str).intValue();
                } else if (b == 121) {
                    int p22 = p2();
                    String str2 = new String(bArr, this.c, p22, StandardCharsets.ISO_8859_1);
                    this.c += p22;
                    if (str2.indexOf(46) == -1) {
                        return new BigInteger(str2).intValue();
                    }
                    return TypeUtils.E(str2).intValue();
                } else if (b != 122) {
                    switch (b) {
                        case -81:
                            if ((this.f2453a.c & JSONReader.Feature.ErrorOnNullForPrimitives.mask) == 0) {
                                this.h = true;
                                return 0.0f;
                            }
                            throw new JSONException(a1("long value not support input null"));
                        case -80:
                        case -78:
                            return 0.0f;
                        case -79:
                        case -77:
                            return 1.0f;
                        case -76:
                            return (float) r2();
                        case -75:
                            long j = opf.UNSAFE.getLong(bArr, opf.ARRAY_BYTE_BASE_OFFSET + i3);
                            this.c += 8;
                            if (!opf.BIG_ENDIAN) {
                                j = Long.reverseBytes(j);
                            }
                            return (float) Double.longBitsToDouble(j);
                        case -74:
                            return p2();
                        default:
                            switch (b) {
                                case -68:
                                    this.c = i2 + 3;
                                    return (bArr[i2 + 2] & 255) + (bArr[i3] << 8);
                                case -67:
                                    this.c = i2 + 2;
                                    return bArr[i3];
                                case -66:
                                    long j2 = opf.UNSAFE.getLong(bArr, opf.ARRAY_BYTE_BASE_OFFSET + i3);
                                    this.c += 8;
                                    if (!opf.BIG_ENDIAN) {
                                        j2 = Long.reverseBytes(j2);
                                    }
                                    return (float) j2;
                                case -65:
                                    break;
                                default:
                                    if (b >= -16 && b <= 47) {
                                        return b;
                                    }
                                    if (b >= 48 && b <= 63) {
                                        this.c = i2 + 2;
                                        return ((b - 56) << 8) + (bArr[i3] & 255);
                                    } else if (b >= 64 && b <= 71) {
                                        int r3 = r3(bArr, i3, b);
                                        this.c += 2;
                                        return r3;
                                    } else if (b >= -40 && b <= -17) {
                                        return b + 32;
                                    } else {
                                        if (b >= -56 && b <= -41) {
                                            this.c = i2 + 2;
                                            return ((b + 48) << 8) + (bArr[i3] & 255);
                                        } else if (b >= -64 && b <= -57) {
                                            this.c = i2 + 2;
                                            this.c = i2 + 3;
                                            return ((b + 60) << 16) + ((bArr[i3] & 255) << 8) + (bArr[i] & 255);
                                        } else if (b < 73 || b > 120) {
                                            throw w3(b);
                                        } else {
                                            int i4 = b - 73;
                                            String s3 = s3(i3, i4);
                                            this.c += i4;
                                            if (s3.indexOf(46) == -1) {
                                                return new BigInteger(s3).intValue();
                                            }
                                            return TypeUtils.E(s3).intValue();
                                        }
                                    }
                            }
                    }
                } else {
                    int p23 = p2();
                    String str3 = new String(bArr, this.c, p23, StandardCharsets.UTF_8);
                    this.c += p23;
                    if (str3.indexOf(46) == -1) {
                        return new BigInteger(str3).intValue();
                    }
                    return TypeUtils.E(str3).intValue();
                }
            }
            int g = b2d.g(bArr, i3);
            this.c += 4;
            return g;
        }
        int p24 = p2();
        BigInteger X1 = X1();
        if (p24 == 0) {
            bigDecimal = new BigDecimal(X1);
        } else {
            bigDecimal = new BigDecimal(X1, p24);
        }
        return bigDecimal.intValue();
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean D1() {
        int i = this.c;
        byte b = this.x[i];
        if (b == -81) {
            this.c = i + 1;
            return true;
        } else if (b != 73) {
            return false;
        } else {
            this.c = i + 1;
            return true;
        }
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final q7h D2() {
        int i = this.c;
        byte[] bArr = this.x;
        byte b = bArr[i];
        this.z = b;
        if (b == 92) {
            q7h P = DateUtils.P(bArr, i + 1);
            if (P != null) {
                this.c += 20;
                return P;
            }
            throw new JSONException("date only support string input");
        }
        throw new JSONException("date only support string input");
    }

    public final String D3() {
        this.A = I3();
        this.C = this.c;
        if (M != null) {
            return null;
        }
        M = Charset.forName("GB18030");
        return null;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean E1() {
        int i = this.c;
        if (this.x[i] != -91) {
            return false;
        }
        this.c = i + 1;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final q7h E2() {
        q7h R;
        int i = this.c;
        byte[] bArr = this.x;
        if (bArr[i] != 93 || (R = DateUtils.R(bArr, i + 1)) == null) {
            throw new JSONException("date only support string input");
        }
        this.c += 21;
        return R;
    }

    public final int E3(byte[] bArr, byte b) {
        BigDecimal bigDecimal;
        if (b >= -40 && b <= -17) {
            return b + 32;
        }
        if (b >= -56 && b <= -41) {
            int i = this.c;
            this.c = i + 1;
            return ((b + 48) << 8) + (bArr[i] & 255);
        } else if (b < -64 || b > -57) {
            if (!(b == -84 || b == -83)) {
                if (b == -71) {
                    int p2 = p2();
                    BigInteger X1 = X1();
                    if (p2 == 0) {
                        bigDecimal = new BigDecimal(X1);
                    } else {
                        bigDecimal = new BigDecimal(X1, p2);
                    }
                    return bigDecimal.intValue();
                } else if (b == 124) {
                    int p22 = p2();
                    String str = new String(bArr, this.c, p22, StandardCharsets.UTF_16LE);
                    this.c += p22;
                    if (str.indexOf(46) == -1) {
                        return new BigInteger(str).intValue();
                    }
                    return TypeUtils.E(str).intValue();
                } else if (b == 121) {
                    int p23 = p2();
                    String s3 = s3(this.c, p23);
                    this.c += p23;
                    if (s3.indexOf(46) == -1) {
                        return new BigInteger(s3).intValue();
                    }
                    return TypeUtils.E(s3).intValue();
                } else if (b != 122) {
                    switch (b) {
                        case -81:
                            if ((this.f2453a.c & JSONReader.Feature.ErrorOnNullForPrimitives.mask) == 0) {
                                this.h = true;
                                return 0;
                            }
                            throw new JSONException(a1("int value not support input null"));
                        case -80:
                        case -78:
                            return 0;
                        case -79:
                        case -77:
                            return 1;
                        case -76:
                            return (int) r2();
                        case -75:
                            this.c--;
                            return (int) f2();
                        case -74:
                            return p2();
                        case -73:
                            int g = b2d.g(bArr, this.c);
                            this.c += 4;
                            return (int) Float.intBitsToFloat(g);
                        default:
                            switch (b) {
                                case -68:
                                    int i2 = this.c;
                                    int i3 = (bArr[i2 + 1] & 255) + (bArr[i2] << 8);
                                    this.c = i2 + 2;
                                    return i3;
                                case -67:
                                    int i4 = this.c;
                                    this.c = i4 + 1;
                                    return bArr[i4];
                                case -66:
                                    long j = opf.UNSAFE.getLong(bArr, opf.ARRAY_BYTE_BASE_OFFSET + this.c);
                                    this.c += 8;
                                    if (!opf.BIG_ENDIAN) {
                                        j = Long.reverseBytes(j);
                                    }
                                    return (int) j;
                                case -65:
                                    break;
                                default:
                                    if (b < 73 || b > 120) {
                                        F3(b);
                                        throw null;
                                    }
                                    int i5 = b - 73;
                                    String s32 = s3(this.c, i5);
                                    this.c += i5;
                                    if (s32.indexOf(46) == -1) {
                                        return new BigInteger(s32).intValue();
                                    }
                                    return TypeUtils.E(s32).intValue();
                            }
                    }
                } else {
                    int p24 = p2();
                    String str2 = new String(bArr, this.c, p24, StandardCharsets.UTF_8);
                    this.c += p24;
                    if (str2.indexOf(46) == -1) {
                        return new BigInteger(str2).intValue();
                    }
                    return TypeUtils.E(str2).intValue();
                }
            }
            int g2 = b2d.g(bArr, this.c);
            this.c += 4;
            return g2;
        } else {
            int i6 = this.c;
            int i7 = i6 + 1;
            this.c = i7;
            this.c = i6 + 2;
            return ((b + 60) << 16) + ((bArr[i6] & 255) << 8) + (bArr[i7] & 255);
        }
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean F1() {
        int i = this.c;
        if (this.x[i] != -90) {
            return false;
        }
        this.c = i + 1;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final q7h F2(int i) {
        q7h b0;
        int i2 = this.c;
        byte[] bArr = this.x;
        byte b = bArr[i2];
        this.z = b;
        if (b < 73 || b > 120) {
            throw new JSONException("date only support string input");
        } else if (i < 21 || i > 29 || (b0 = DateUtils.b0(bArr, i2 + 1, i)) == null) {
            throw new JSONException("illegal LocalDateTime string : " + Q2());
        } else {
            this.c += i + 1;
            return b0;
        }
    }

    public final JSONException F3(byte b) {
        throw new JSONException("readInt32Value not support " + yqf.b(b) + ", offset " + this.c + "/" + this.x.length);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean G1() {
        return false;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long G2() {
        int i = this.c;
        byte[] bArr = this.x;
        if (bArr[i] == 92) {
            long k0 = DateUtils.k0(bArr, i + 1, this.f2453a.b);
            this.c += 20;
            return k0;
        }
        throw new JSONException("date only support string input");
    }

    public final long G3(byte[] bArr, byte b) {
        BigDecimal bigDecimal;
        int i;
        int i2;
        int i3;
        if (b >= 48 && b <= 63) {
            this.c = this.c + 1;
            return ((b - 56) << 8) + (bArr[i3] & 255);
        } else if (b >= -16 && b <= 47) {
            return b;
        } else {
            if (b >= 64 && b <= 71) {
                int r3 = r3(bArr, this.c, b);
                this.c += 2;
                return r3;
            } else if (b == -71) {
                int p2 = p2();
                BigInteger X1 = X1();
                if (p2 == 0) {
                    bigDecimal = new BigDecimal(X1);
                } else {
                    bigDecimal = new BigDecimal(X1, p2);
                }
                return bigDecimal.longValue();
            } else if (b == 72) {
                int g = b2d.g(bArr, this.c);
                this.c += 4;
                return g;
            } else if (b == 124) {
                int p22 = p2();
                String str = new String(bArr, this.c, p22, StandardCharsets.UTF_16LE);
                this.c += p22;
                if (str.indexOf(46) == -1) {
                    return new BigInteger(str).intValue();
                }
                return TypeUtils.E(str).intValue();
            } else if (b == -68) {
                this.c = this.c + 2;
                return (bArr[i + 1] & 255) + (bArr[i] << 8);
            } else if (b == -67) {
                this.c = this.c + 1;
                return bArr[i2];
            } else if (b == 121) {
                int p23 = p2();
                String s3 = s3(this.c, p23);
                this.c += p23;
                if (s3.indexOf(46) == -1) {
                    return new BigInteger(s3).intValue();
                }
                return TypeUtils.E(s3).intValue();
            } else if (b != 122) {
                switch (b) {
                    case -85:
                        long j = opf.UNSAFE.getLong(bArr, opf.ARRAY_BYTE_BASE_OFFSET + this.c);
                        this.c += 8;
                        if (opf.BIG_ENDIAN) {
                            return j;
                        }
                        return Long.reverseBytes(j);
                    case -84:
                        this.c += 4;
                        return b2d.g(bArr, this.c) * 1000;
                    case -83:
                        this.c += 4;
                        return b2d.g(bArr, this.c) * 60000;
                    default:
                        switch (b) {
                            case -81:
                                if ((this.f2453a.c & JSONReader.Feature.ErrorOnNullForPrimitives.mask) == 0) {
                                    this.h = true;
                                    return 0L;
                                }
                                throw new JSONException(a1("long value not support input null"));
                            case -80:
                            case -78:
                                return 0L;
                            case -79:
                            case -77:
                                return 1L;
                            case -76:
                                return r2();
                            case -75:
                                this.c--;
                                return (long) f2();
                            case -74:
                                return p2();
                            case -73:
                                int g2 = b2d.g(bArr, this.c);
                                this.c += 4;
                                return Float.intBitsToFloat(g2);
                            default:
                                if (b < 73 || b > 120) {
                                    H3(b);
                                    throw null;
                                }
                                int i4 = b - 73;
                                String s32 = s3(this.c, i4);
                                this.c += i4;
                                if (s32.indexOf(46) == -1) {
                                    return new BigInteger(s32).longValue();
                                }
                                return TypeUtils.E(s32).longValue();
                        }
                }
            } else {
                int p24 = p2();
                String str2 = new String(bArr, this.c, p24, StandardCharsets.UTF_8);
                this.c += p24;
                if (str2.indexOf(46) == -1) {
                    return new BigInteger(str2).intValue();
                }
                return TypeUtils.E(str2).intValue();
            }
        }
    }

    public final JSONException H3(byte b) {
        throw new JSONException("readInt64Value not support " + yqf.b(b) + ", offset " + this.c + "/" + this.x.length);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public void I2() {
        int i = this.c;
        this.c = i + 1;
        byte b = this.x[i];
        this.z = b;
        if (b != -81) {
            throw new JSONException("null not match, " + ((int) this.z));
        }
    }

    public int I3() {
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        byte[] bArr = this.x;
        byte b = bArr[i];
        if (b >= -16 && b <= 47) {
            return b;
        }
        if (b >= 48 && b <= 63) {
            this.c = i + 2;
            return ((b - 56) << 8) + (bArr[i2] & 255);
        } else if (b >= 64 && b <= 71) {
            int r3 = r3(bArr, i2, b);
            this.c += 2;
            return r3;
        } else if (b == 72) {
            int g = b2d.g(bArr, i2);
            this.c += 4;
            if (g <= 268435456) {
                return g;
            }
            throw new JSONException("input length overflow");
        } else {
            throw w3(b);
        }
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public Date J2() {
        throw new JSONException("UnsupportedOperation");
    }

    public final q7h J3(int i) {
        if (i < 73 || i > 120) {
            throw w3((byte) i);
        }
        int V0 = V0();
        switch (V0) {
            case 8:
                return q7h.f(v2(), x9h.MIN);
            case 9:
                return q7h.f(w2(), x9h.MIN);
            case 10:
                p7h t2 = t2();
                if (t2 == null) {
                    return null;
                }
                return q7h.f(t2, x9h.MIN);
            case 11:
                p7h u2 = u2();
                if (u2 == null) {
                    return null;
                }
                return q7h.f(u2, x9h.MIN);
            case 12:
            case 13:
            case 14:
            case 15:
            default:
                throw new JSONException("TODO : " + V0 + ", " + Q2());
            case 16:
                return A2();
            case 17:
                return B2();
            case 18:
                return C2();
            case 19:
                return D2();
            case 20:
                return E2();
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                return F2(V0);
        }
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public Number K2() {
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        byte[] bArr = this.x;
        byte b = bArr[i];
        if (b >= -16 && b <= 47) {
            return Integer.valueOf(b);
        }
        if (b >= 48 && b <= 63) {
            this.c = i + 2;
            return Integer.valueOf(((b - 56) << 8) + (bArr[i2] & 255));
        } else if (b >= 64 && b <= 71) {
            int r3 = r3(bArr, i2, b);
            this.c += 2;
            return Integer.valueOf(r3);
        } else if (b >= -40 && b <= -17) {
            return Long.valueOf((b - (-40)) - 8);
        } else {
            if (b >= -56 && b <= -41) {
                this.c = i + 2;
                return Integer.valueOf(((b + 48) << 8) + (bArr[i2] & 255));
            } else if (b >= -64 && b <= -57) {
                int i3 = i + 2;
                this.c = i3;
                this.c = i + 3;
                return Integer.valueOf(((b + 60) << 16) + ((bArr[i2] & 255) << 8) + (bArr[i3] & 255));
            } else if (b == -110) {
                throw new JSONException("not support input type : ".concat(Q2()));
            } else if (b == 72) {
                int g = b2d.g(bArr, i2);
                this.c += 4;
                return Integer.valueOf(g);
            } else if (b == 121) {
                int p2 = p2();
                String s3 = s3(this.c, p2);
                this.c += p2;
                return TypeUtils.E(s3);
            } else if (b != 122) {
                switch (b) {
                    case -81:
                        return null;
                    case -80:
                    case -78:
                        return Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT);
                    case -79:
                    case -77:
                        return Double.valueOf(1.0d);
                    case -76:
                        return Double.valueOf(r2());
                    case -75:
                        long j = opf.UNSAFE.getLong(bArr, opf.ARRAY_BYTE_BASE_OFFSET + i2);
                        this.c += 8;
                        if (!opf.BIG_ENDIAN) {
                            j = Long.reverseBytes(j);
                        }
                        return Double.valueOf(Double.longBitsToDouble(j));
                    case -74:
                        return Float.valueOf(p2());
                    case -73:
                        int g2 = b2d.g(bArr, i2);
                        this.c += 4;
                        return Float.valueOf(Float.intBitsToFloat(g2));
                    case -72:
                        return BigDecimal.valueOf(r2());
                    case -71:
                        int p22 = p2();
                        BigInteger X1 = X1();
                        if (p22 == 0) {
                            return new BigDecimal(X1);
                        }
                        return new BigDecimal(X1, p22);
                    case -70:
                        return BigInteger.valueOf(r2());
                    case -69:
                        int p23 = p2();
                        byte[] bArr2 = new byte[p23];
                        System.arraycopy(bArr, this.c, bArr2, 0, p23);
                        this.c += p23;
                        return new BigInteger(bArr2);
                    case -68:
                        this.c = i + 3;
                        return Short.valueOf((short) ((bArr[i + 2] & 255) + (bArr[i2] << 8)));
                    case -67:
                        this.c = i + 2;
                        return Byte.valueOf(bArr[i2]);
                    case -66:
                        long j2 = opf.UNSAFE.getLong(bArr, opf.ARRAY_BYTE_BASE_OFFSET + i2);
                        this.c += 8;
                        if (!opf.BIG_ENDIAN) {
                            j2 = Long.reverseBytes(j2);
                        }
                        return Long.valueOf(j2);
                    case -65:
                        int g3 = b2d.g(bArr, i2);
                        this.c += 4;
                        return Long.valueOf(g3);
                    default:
                        if (b < 73 || b > 120) {
                            throw w3(b);
                        }
                        int i4 = b - 73;
                        String s32 = s3(i2, i4);
                        this.c += i4;
                        return TypeUtils.E(s32);
                }
            } else {
                int p24 = p2();
                String str = new String(bArr, this.c, p24, StandardCharsets.UTF_8);
                this.c += p24;
                return TypeUtils.E(str);
            }
        }
    }

    public final JSONException K3() {
        throw new JSONException("string value not support input " + yqf.b(this.z) + " offset " + this.c + "/" + this.x.length);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public String L0() {
        return U0();
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public void L2() {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String L3() {
        /*
            r8 = this;
            byte r0 = r8.B
            r1 = 122(0x7a, float:1.71E-43)
            byte[] r2 = r8.x
            r3 = 0
            if (r0 != r1) goto L_0x0045
            int r0 = r8.c
            r1 = r2[r0]
            r4 = -16
            if (r1 < r4) goto L_0x001c
            r4 = 47
            if (r1 > r4) goto L_0x001c
            r8.A = r1
            int r0 = r0 + 1
            r8.c = r0
            goto L_0x003c
        L_0x001c:
            r4 = 48
            if (r1 < r4) goto L_0x0036
            r4 = 63
            if (r1 > r4) goto L_0x0036
            int r1 = r1 + (-56)
            int r1 = r1 << 8
            int r4 = r0 + 1
            r4 = r2[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r1 = r1 + r4
            r8.A = r1
            int r0 = r0 + 2
            r8.c = r0
            goto L_0x003c
        L_0x0036:
            int r0 = r8.I3()
            r8.A = r0
        L_0x003c:
            int r0 = r8.c
            r8.C = r0
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
        L_0x0042:
            r1 = r0
            r0 = r3
            goto L_0x0075
        L_0x0045:
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 != r1) goto L_0x0056
            int r0 = r8.I3()
            r8.A = r0
            int r0 = r8.c
            r8.C = r0
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16
            goto L_0x0042
        L_0x0056:
            r1 = 124(0x7c, float:1.74E-43)
            if (r0 != r1) goto L_0x0061
            java.lang.String r0 = r8.P3()
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16LE
            goto L_0x0075
        L_0x0061:
            r1 = 125(0x7d, float:1.75E-43)
            if (r0 != r1) goto L_0x006b
            r8.O3()
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16BE
            goto L_0x0042
        L_0x006b:
            r1 = 126(0x7e, float:1.77E-43)
            if (r0 != r1) goto L_0x00ae
            r8.D3()
            java.nio.charset.Charset r0 = com.alibaba.fastjson2.h.M
            goto L_0x0042
        L_0x0075:
            r4 = 0
            com.alibaba.fastjson2.JSONReader$c r6 = r8.f2453a
            if (r0 == 0) goto L_0x008b
            long r1 = r6.c
            com.alibaba.fastjson2.JSONReader$Feature r3 = com.alibaba.fastjson2.JSONReader.Feature.TrimString
            long r6 = r3.mask
            long r1 = r1 & r6
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x008a
            java.lang.String r0 = r0.trim()
        L_0x008a:
            return r0
        L_0x008b:
            int r0 = r8.A
            if (r0 < 0) goto L_0x00ad
            java.lang.String r3 = new java.lang.String
            int r7 = r8.c
            r3.<init>(r2, r7, r0, r1)
            int r0 = r8.c
            int r1 = r8.A
            int r0 = r0 + r1
            r8.c = r0
            long r0 = r6.c
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.TrimString
            long r6 = r2.mask
            long r0 = r0 & r6
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x00ac
            java.lang.String r3 = r3.trim()
        L_0x00ac:
            return r3
        L_0x00ad:
            throw r3
        L_0x00ae:
            java.lang.String r0 = r8.M3()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.h.L3():java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0206  */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v35, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v36, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v37, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v38, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v40, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Map<java.lang.String, java.lang.Object> M2() {
        /*
            Method dump skipped, instructions count: 561
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.h.M2():java.util.Map");
    }

    public final String M3() {
        BigDecimal bigDecimal;
        byte b = this.B;
        if (b >= -16 && b <= 47) {
            return Byte.toString(b);
        }
        byte[] bArr = this.x;
        if (b >= 48 && b <= 63) {
            int i = (b - 56) << 8;
            int i2 = this.c;
            this.c = 1 + i2;
            return Integer.toString(i + (bArr[i2] & 255));
        } else if (b >= 64 && b <= 71) {
            int r3 = r3(bArr, this.c, b);
            this.c += 2;
            return Integer.toString(r3);
        } else if (b >= -40 && b <= -17) {
            return Integer.toString(b + 32);
        } else {
            if (b >= -56 && b <= -41) {
                int i3 = (b + 48) << 8;
                int i4 = this.c;
                this.c = 1 + i4;
                return Integer.toString(i3 + (bArr[i4] & 255));
            } else if (b >= -64 && b <= -57) {
                int i5 = (b + 60) << 16;
                int i6 = this.c;
                int i7 = 1 + i6;
                this.c = i7;
                this.c = i6 + 2;
                return Integer.toString(i5 + ((bArr[i6] & 255) << 8) + (bArr[i7] & 255));
            } else if (b == -110) {
                this.c--;
                Object T1 = T1();
                if (T1 == null) {
                    return null;
                }
                return wqf.r(T1, JSONWriter.Feature.WriteThrowableClassName);
            } else if (b == -81) {
                return null;
            } else {
                if (b != 72) {
                    if (b == -66) {
                        long j = opf.UNSAFE.getLong(bArr, opf.ARRAY_BYTE_BASE_OFFSET + this.c);
                        if (!opf.BIG_ENDIAN) {
                            j = Long.reverseBytes(j);
                        }
                        this.c += 8;
                        return Long.toString(j);
                    } else if (b != -65) {
                        switch (b) {
                            case -85:
                                long j2 = opf.UNSAFE.getLong(bArr, opf.ARRAY_BYTE_BASE_OFFSET + this.c);
                                this.c += 8;
                                if (!opf.BIG_ENDIAN) {
                                    j2 = Long.reverseBytes(j2);
                                }
                                return DateUtils.v0(j2, false, wqx.d);
                            case -84:
                                this.c += 4;
                                return DateUtils.v0(b2d.g(bArr, this.c) * 1000, false, wqx.d);
                            case -83:
                                this.c += 4;
                                return DateUtils.v0(b2d.g(bArr, this.c) * 60000, false, wqx.d);
                            default:
                                switch (b) {
                                    case -78:
                                        return "0.0";
                                    case -77:
                                        return "1.0";
                                    case -76:
                                        return Double.toString(r2());
                                    case -75:
                                        long j3 = opf.UNSAFE.getLong(bArr, opf.ARRAY_BYTE_BASE_OFFSET + this.c);
                                        this.c += 8;
                                        if (!opf.BIG_ENDIAN) {
                                            j3 = Long.reverseBytes(j3);
                                        }
                                        return Double.toString(Double.longBitsToDouble(j3));
                                    case -74:
                                        return Float.toString(p2());
                                    case -73:
                                        int g = b2d.g(bArr, this.c);
                                        this.c += 4;
                                        return Float.toString(Float.intBitsToFloat(g));
                                    case -72:
                                    case -70:
                                        return Long.toString(r2());
                                    case -71:
                                        int p2 = p2();
                                        BigInteger X1 = X1();
                                        if (p2 == 0) {
                                            bigDecimal = new BigDecimal(X1);
                                        } else {
                                            bigDecimal = new BigDecimal(X1, p2);
                                        }
                                        return bigDecimal.toString();
                                    case -69:
                                        int p22 = p2();
                                        byte[] bArr2 = new byte[p22];
                                        System.arraycopy(bArr, this.c, bArr2, 0, p22);
                                        this.c += p22;
                                        return new BigInteger(bArr2).toString();
                                    default:
                                        v3();
                                        throw null;
                                }
                        }
                    }
                }
                this.c += 4;
                return Long.toString(b2d.g(bArr, this.c));
            }
        }
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public <T> T O1(Class<T> cls) {
        boolean z;
        JSONReader.c cVar = this.f2453a;
        if ((cVar.c & JSONReader.Feature.FieldBased.mask) != 0) {
            z = true;
        } else {
            z = false;
        }
        return (T) cVar.i.J(cls, z).q(this, null, null, 0L);
    }

    public final String O3() {
        this.A = I3();
        this.C = this.c;
        return null;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long P0() {
        byte[] bArr;
        long j;
        long j2;
        int i = this.C;
        int i2 = 0;
        long j3 = 0;
        int i3 = 0;
        while (true) {
            int i4 = this.A;
            bArr = this.x;
            if (i3 < i4) {
                byte b = bArr[i];
                if (b >= 0 && i3 < 8 && (i3 != 0 || bArr[this.C] != 0)) {
                    if ((b != 95 && b != 45 && b != 32) || bArr[i + 1] == b) {
                        if (b >= 65 && b <= 90) {
                            b = (byte) (b + 32);
                        }
                        switch (i3) {
                            case 0:
                                j3 = b;
                                break;
                            case 1:
                                j = b << 8;
                                j2 = 255;
                                j3 = (j3 & j2) + j;
                                break;
                            case 2:
                                j = b << 16;
                                j2 = 65535;
                                j3 = (j3 & j2) + j;
                                break;
                            case 3:
                                j = b << 24;
                                j2 = 16777215;
                                j3 = (j3 & j2) + j;
                                break;
                            case 4:
                                j = b << 32;
                                j2 = tiv.INT_MASK;
                                j3 = (j3 & j2) + j;
                                break;
                            case 5:
                                j = b << 40;
                                j2 = 1099511627775L;
                                j3 = (j3 & j2) + j;
                                break;
                            case 6:
                                j = b << 48;
                                j2 = 281474976710655L;
                                j3 = (j3 & j2) + j;
                                break;
                            case 7:
                                j = b << 56;
                                j2 = 72057594037927935L;
                                j3 = (j3 & j2) + j;
                                break;
                        }
                        i3++;
                    }
                    i++;
                }
            }
        }
        i = this.C;
        j3 = 0;
        if (j3 != 0) {
            return j3;
        }
        long j4 = ls9.MAGIC_HASH_CODE;
        while (i2 < this.A) {
            int i5 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 65 && b2 <= 90) {
                b2 = (byte) (b2 + 32);
            }
            if (!(b2 == 95 || b2 == 45 || b2 == 32)) {
                j4 = (j4 ^ b2) * ls9.MAGIC_PRIME;
            }
            i2++;
            i = i5;
        }
        return j4;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public <T> T P1(Type type) {
        boolean z;
        JSONReader.c cVar = this.f2453a;
        if ((cVar.c & JSONReader.Feature.FieldBased.mask) != 0) {
            z = true;
        } else {
            z = false;
        }
        return (T) cVar.i.J(type, z).q(this, null, null, 0L);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public String P2() {
        int i = this.c;
        if (this.x[i] != -109) {
            return null;
        }
        this.c = i + 1;
        if (l1()) {
            return Q2();
        }
        throw new JSONException("reference not support input " + q3(this.z));
    }

    public final String P3() {
        int i = this.c;
        byte[] bArr = this.x;
        byte b = bArr[i];
        if (b >= -16 && b <= 47) {
            this.c = i + 1;
            this.A = b;
        } else if (b < 48 || b > 63) {
            this.A = I3();
        } else {
            this.c = i + 2;
            this.A = ((b - 56) << 8) + (bArr[i + 1] & 255);
        }
        this.C = this.c;
        if (this.A == 0) {
            return "";
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public String Q2() {
        int i;
        String str;
        int i2 = this.c;
        int i3 = i2 + 1;
        this.c = i3;
        byte[] bArr = this.x;
        byte b = bArr[i2];
        this.B = b;
        if (b == -81) {
            return null;
        }
        this.C = i3;
        if (b < 73 || b > 121) {
            return L3();
        }
        if (b == 121) {
            i = bArr[i3];
            if (i >= -16 && i <= 47) {
                this.c = i2 + 2;
            } else if (i >= 48 && i <= 63) {
                i = ((i - 56) << 8) + (bArr[i2 + 2] & 255);
                this.c = i2 + 3;
            } else if (i < 64 || i > 71) {
                i = I3();
            } else {
                i = r3(bArr, i2 + 2, i);
                this.c += 3;
            }
            this.C = this.c;
        } else {
            i = b - 73;
        }
        if (i >= 0) {
            this.A = i;
            if (opf.ANDROID_SDK_INT < 34) {
                char[] cArr = this.D;
                if (cArr == null) {
                    cArr = JSONFactory.r.getAndSet(this.E, null);
                    this.D = cArr;
                }
                if (cArr == null || cArr.length < i) {
                    cArr = new char[i];
                    this.D = cArr;
                }
                for (int i4 = 0; i4 < i; i4++) {
                    cArr[i4] = (char) (bArr[this.c + i4] & 255);
                }
                str = new String(cArr, 0, i);
            } else {
                str = new String(bArr, this.c, i, StandardCharsets.ISO_8859_1);
            }
            this.c += i;
            if ((this.f2453a.c & JSONReader.Feature.TrimString.mask) != 0) {
                return str.trim();
            }
            return str;
        }
        throw null;
    }

    public boolean Q3() {
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        byte[] bArr = this.x;
        byte b = bArr[i];
        this.B = b;
        if (b >= 73 && b <= 120) {
            this.c = i2 + (b - 73);
            return true;
        } else if (b == 121 || b == 122 || b == 123 || b == 124 || b == 125) {
            int I3 = I3();
            this.A = I3;
            this.c += I3;
            return true;
        } else if (b == Byte.MAX_VALUE) {
            byte b2 = bArr[i2];
            if (b2 < -16 || b2 > 72) {
                Q2();
                p2();
                return true;
            }
            p2();
            return true;
        } else {
            throw w3(b);
        }
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public void S1(Map map, long j) {
        Object obj;
        Object obj2;
        int i = this.c;
        byte[] bArr = this.x;
        if (bArr[i] == -90) {
            this.c = i + 1;
            while (true) {
                int i2 = this.c;
                byte b = bArr[i2];
                if (b == -91) {
                    this.c = i2 + 1;
                    return;
                }
                if (b >= 73) {
                    obj = g2();
                } else {
                    obj = T1();
                }
                if (k1()) {
                    String P2 = P2();
                    if ("..".equals(P2)) {
                        map.put(obj, map);
                    } else {
                        c(map, obj, c.b(P2));
                        map.put(obj, null);
                    }
                } else {
                    int i3 = this.c;
                    byte b2 = bArr[i3];
                    if (b2 >= 73 && b2 <= 126) {
                        obj2 = Q2();
                    } else if (b2 >= -16 && b2 <= 47) {
                        this.c = i3 + 1;
                        obj2 = Integer.valueOf(b2);
                    } else if (b2 == -79) {
                        this.c = i3 + 1;
                        obj2 = Boolean.TRUE;
                    } else if (b2 == -80) {
                        this.c = i3 + 1;
                        obj2 = Boolean.FALSE;
                    } else if (b2 == -90) {
                        obj2 = M2();
                    } else {
                        obj2 = T1();
                    }
                    if (obj2 != null || (this.f2453a.c & JSONReader.Feature.IgnoreNullPropertyValue.mask) == 0) {
                        map.put(obj, obj2);
                    }
                }
            }
        } else {
            throw new JSONException("object not support input " + q3(this.z));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.alibaba.fastjson2.JSONReader
    public long T2() {
        int i;
        int i2;
        int i3 = this.c;
        byte[] bArr = this.x;
        byte b = bArr[i3];
        this.B = b;
        if (b == 121 && (i = bArr[i3 + 1]) > 8 && i <= 63) {
            if (i <= 47) {
                i2 = i3 + 2;
            } else {
                i = ((i - 56) << 8) + (bArr[i3 + 2] & 255);
                i2 = i3 + 3;
            }
            long j = ls9.MAGIC_HASH_CODE;
            int i4 = 0;
            int i5 = i2;
            while (i4 < i) {
                j = (j ^ bArr[i5]) * ls9.MAGIC_PRIME;
                i4++;
                i5++;
            }
            int i6 = bArr[i5];
            if (i6 >= 0 && i6 <= 47) {
                int i7 = i5 + 1;
                if (i6 == 0) {
                    this.G = i2;
                    this.H = i;
                    this.I = b;
                    this.F = j;
                } else {
                    int i8 = i6 * 2;
                    int i9 = i8 + 2;
                    long[] jArr = this.J;
                    if (jArr == null) {
                        this.J = new long[Math.max(i9, 32)];
                    } else if (jArr.length < i9) {
                        this.J = Arrays.copyOf(jArr, i8 + 18);
                    }
                    this.J[i8 + 1] = (i2 << 32) + (i << 8) + b;
                }
                this.C = i2;
                this.A = i;
                this.c = i7;
                return j;
            }
        }
        return N3();
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public String U0() {
        Charset charset;
        byte b = this.B;
        int i = this.A;
        if (b == -81) {
            return null;
        }
        if (i >= 0) {
            byte[] bArr = this.x;
            if (b == 121 || (b >= 73 && b <= 120)) {
                charset = StandardCharsets.ISO_8859_1;
                if (opf.ANDROID_SDK_INT < 34) {
                    int i2 = this.C;
                    char[] cArr = this.D;
                    if (cArr == null) {
                        cArr = JSONFactory.r.getAndSet(this.E, null);
                        this.D = cArr;
                    }
                    if (cArr == null || cArr.length < i) {
                        cArr = new char[i];
                        this.D = cArr;
                    }
                    for (int i3 = 0; i3 < i; i3++) {
                        cArr[i3] = (char) (bArr[i2 + i3] & 255);
                    }
                    return new String(cArr, 0, i);
                }
            } else if (b == 122) {
                charset = StandardCharsets.UTF_8;
            } else if (b == 123) {
                charset = StandardCharsets.UTF_16;
            } else if (b == 124) {
                charset = StandardCharsets.UTF_16LE;
            } else if (b == 125) {
                charset = StandardCharsets.UTF_16BE;
            } else {
                throw w3(b);
            }
            return new String(bArr, this.C, i, charset);
        }
        throw null;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public List U1() {
        Object obj;
        int i;
        int i2;
        List list;
        Object obj2;
        int c3 = c3();
        JSONArray jSONArray = new JSONArray(c3);
        int i3 = 0;
        while (i3 < c3) {
            int i4 = this.c;
            byte[] bArr = this.x;
            int i5 = bArr[i4];
            if (i5 >= 73 && i5 <= 126) {
                obj = Q2();
            } else if (i5 >= -16 && i5 <= 47) {
                this.c = i4 + 1;
                obj = Integer.valueOf(i5);
            } else if (i5 == -79) {
                this.c = i4 + 1;
                obj = Boolean.TRUE;
            } else if (i5 == -80) {
                this.c = i4 + 1;
                obj = Boolean.FALSE;
            } else if (i5 == -90) {
                obj = M2();
            } else if (i5 == -66) {
                int i6 = i4 + 1;
                this.c = i6;
                long j = opf.UNSAFE.getLong(bArr, opf.ARRAY_BYTE_BASE_OFFSET + i6);
                this.c += 8;
                if (!opf.BIG_ENDIAN) {
                    j = Long.reverseBytes(j);
                }
                obj = Long.valueOf(j);
            } else {
                if (i5 < -108 || i5 > -92) {
                    i = i3;
                    if (i5 >= 48 && i5 <= 63) {
                        obj = Integer.valueOf(((i5 - 56) << 8) + (bArr[i4 + 1] & 255));
                        this.c += 2;
                    } else if (i5 >= 64 && i5 <= 71) {
                        int r3 = r3(bArr, i4 + 1, i5);
                        this.c += 3;
                        obj = new Integer(r3);
                    } else if (i5 == 72) {
                        int g = b2d.g(bArr, i4 + 1);
                        this.c += 5;
                        obj = new Integer(g);
                    } else if (i5 == -109) {
                        String P2 = P2();
                        if ("..".equals(P2)) {
                            obj = jSONArray;
                        } else {
                            i3 = i;
                            b(jSONArray, i3, c.b(P2));
                            i3++;
                        }
                    } else {
                        i3 = i;
                        obj = T1();
                    }
                } else {
                    this.c = i4 + 1;
                    if (i5 == -92) {
                        i2 = I3();
                    } else {
                        i2 = i5 + 108;
                    }
                    JSONReader.c cVar = this.f2453a;
                    if (i2 == 0) {
                        if ((cVar.c & JSONReader.Feature.UseNativeObject.mask) != 0) {
                            obj = new ArrayList();
                        } else {
                            Supplier<List> supplier = cVar.f;
                            if (supplier != null) {
                                obj = supplier.get();
                            } else {
                                obj = new JSONArray();
                            }
                        }
                        i = i3;
                    } else {
                        i = i3;
                        if ((JSONReader.Feature.UseNativeObject.mask & cVar.c) != 0) {
                            list = new ArrayList(i2);
                        } else {
                            list = new JSONArray(i2);
                        }
                        for (int i7 = 0; i7 < i2; i7++) {
                            if (k1()) {
                                String P22 = P2();
                                if ("..".equals(P22)) {
                                    list.add(list);
                                } else {
                                    list.add(null);
                                    b(list, i7, c.b(P22));
                                }
                            } else {
                                byte b = bArr[this.c];
                                if (b >= 73 && b <= 126) {
                                    obj2 = Q2();
                                } else if (b == -90) {
                                    obj2 = M2();
                                } else {
                                    obj2 = T1();
                                }
                                list.add(obj2);
                            }
                        }
                        obj = list;
                    }
                }
                i3 = i;
            }
            jSONArray.add(obj);
            i3++;
        }
        return jSONArray;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final int V0() {
        byte b = this.x[this.c];
        this.z = b;
        if (b >= 73 && b < 120) {
            return b - 73;
        }
        throw new UnsupportedOperationException(yqf.b(this.z));
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public List V1(Type type) {
        if (C1()) {
            return null;
        }
        if (this.x[this.c] == -110) {
            Object T1 = T1();
            if (T1 instanceof List) {
                return (List) T1;
            }
            if (T1 instanceof Collection) {
                return new JSONArray((Collection) T1);
            }
            throw new JSONException("not support class " + T1.getClass());
        }
        int c3 = c3();
        JSONArray jSONArray = new JSONArray(c3);
        for (int i = 0; i < c3; i++) {
            jSONArray.add(P1(type));
        }
        return jSONArray;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public byte W0() {
        return this.x[this.c];
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public BigDecimal W1() {
        int i = this.c;
        this.c = i + 1;
        byte[] bArr = this.x;
        byte b = bArr[i];
        if (b == -71) {
            int p2 = p2();
            int i2 = this.c;
            byte b2 = bArr[i2];
            if (b2 == -70) {
                this.c = i2 + 1;
                return BigDecimal.valueOf(r2(), p2);
            } else if (b2 == 72) {
                BigDecimal valueOf = BigDecimal.valueOf(b2d.g(bArr, i2 + 1), p2);
                this.c += 5;
                return valueOf;
            } else if (b2 == -66) {
                long j = opf.UNSAFE.getLong(bArr, opf.ARRAY_BYTE_BASE_OFFSET + i2 + 1);
                if (!opf.BIG_ENDIAN) {
                    j = Long.reverseBytes(j);
                }
                BigDecimal valueOf2 = BigDecimal.valueOf(j, p2);
                this.c += 9;
                return valueOf2;
            } else {
                BigInteger X1 = X1();
                if (p2 == 0) {
                    return new BigDecimal(X1);
                }
                return new BigDecimal(X1, p2);
            }
        } else if (b == -72) {
            return BigDecimal.valueOf(r2());
        } else {
            return z3(b);
        }
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public xqx W2() {
        wqx wqxVar;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        byte[] bArr = this.x;
        byte b = bArr[i];
        if (b != -66) {
            switch (b) {
                case -86:
                    int i3 = i + 2;
                    this.c = i3;
                    int i4 = i + 3;
                    this.c = i4;
                    int i5 = (bArr[i2] << 8) + (bArr[i3] & 255);
                    int i6 = i + 4;
                    this.c = i6;
                    byte b2 = bArr[i4];
                    int i7 = i + 5;
                    this.c = i7;
                    byte b3 = bArr[i6];
                    int i8 = i + 6;
                    this.c = i8;
                    byte b4 = bArr[i7];
                    int i9 = i + 7;
                    this.c = i9;
                    byte b5 = bArr[i8];
                    this.c = i + 8;
                    q7h e = q7h.e(i5, b2, b3, b4, b5, bArr[i9], p2());
                    if (V2() == -4800907791268808639L) {
                        wqxVar = wqx.SHANGHAI_ZONE_ID;
                    } else {
                        String U0 = U0();
                        wqx m = this.f2453a.m();
                        if (m.b.equals(U0)) {
                            wqxVar = m;
                        } else {
                            wqxVar = DateUtils.n(U0, wqx.SHANGHAI_ZONE_ID);
                        }
                    }
                    return xqx.e(e, wqxVar);
                case -85:
                    break;
                case -84:
                    this.c += 4;
                    return xqx.d(vcf.e(b2d.g(bArr, i2), 0L), wqx.d);
                case -83:
                    this.c += 4;
                    return xqx.d(vcf.e(b2d.g(bArr, i2) * 60, 0L), wqx.d);
                case -82:
                    return xqx.d(vcf.e(r2(), p2()), wqx.d);
                default:
                    if (b < 73 || b > 120) {
                        throw new UnsupportedOperationException();
                    }
                    this.c = i;
                    return X2(b - 73);
            }
        }
        long j = opf.UNSAFE.getLong(bArr, opf.ARRAY_BYTE_BASE_OFFSET + i2);
        this.c += 8;
        if (!opf.BIG_ENDIAN) {
            j = Long.reverseBytes(j);
        }
        return xqx.d(vcf.d(j), wqx.d);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public BigInteger X1() {
        int i = this.c;
        this.c = i + 1;
        byte[] bArr = this.x;
        byte b = bArr[i];
        if (b == -70) {
            return BigInteger.valueOf(r2());
        }
        if (b != -69) {
            return x3(b);
        }
        int p2 = p2();
        byte[] bArr2 = new byte[p2];
        System.arraycopy(bArr, this.c, bArr2, 0, p2);
        this.c += p2;
        return new BigInteger(bArr2);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final xqx X2(int i) {
        xqx q0;
        int i2 = this.c;
        byte[] bArr = this.x;
        byte b = bArr[i2];
        this.z = b;
        if (b < 73 || b > 120) {
            throw new JSONException("date only support string input");
        } else if (i < 19 || (q0 = DateUtils.q0(bArr, i2 + 1, i, this.f2453a.b)) == null) {
            throw new JSONException("illegal LocalDateTime string : " + Q2());
        } else {
            this.c += i + 1;
            return q0;
        }
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public byte[] Y1() {
        int i = this.c;
        this.c = i + 1;
        byte[] bArr = this.x;
        byte b = bArr[i];
        if (b == -111) {
            int I3 = I3();
            byte[] bArr2 = new byte[I3];
            System.arraycopy(bArr, this.c, bArr2, 0, I3);
            this.c += I3;
            return bArr2;
        }
        throw w3(b);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public void Y2(JSONReader.e eVar) {
        this.c = eVar.f2457a;
        this.z = (byte) eVar.b;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public Boolean Z1() {
        int i = this.c;
        this.c = i + 1;
        byte b = this.x[i];
        if (b == -81) {
            return null;
        }
        if (b == -79) {
            return Boolean.TRUE;
        }
        if (b == -80) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(y3(b));
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean a2() {
        this.h = false;
        int i = this.c;
        this.c = i + 1;
        byte b = this.x[i];
        if (b == -79) {
            return true;
        }
        if (b == -80) {
            return false;
        }
        return y3(b);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public void a3() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean b1() {
        byte b;
        int i = this.c;
        byte[] bArr = this.x;
        if (i < bArr.length && (b = bArr[i]) >= -108 && b <= -92) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x00e0  */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b3() {
        /*
            Method dump skipped, instructions count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.h.b3():void");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public jdk c0(Class cls, long j, long j2) {
        jdk jdkVar;
        Class b;
        ClassLoader classLoader;
        ClassLoader contextClassLoader;
        jdk g;
        jdk g2;
        Class b2;
        int i = this.c;
        byte[] bArr = this.x;
        if (bArr[i] != -110) {
            return null;
        }
        this.c = i + 1;
        long T2 = T2();
        JSONReader.c cVar = this.f2453a;
        ObjectReaderProvider objectReaderProvider = cVar.i;
        if (j == T2 && (b2 = (g2 = cVar.g(cls)).b()) != null && b2 == cls) {
            objectReaderProvider.i0(T2, g2);
            return g2;
        }
        JSONReader.a aVar = cVar.g;
        if (aVar != null) {
            Class<?> c = aVar.c(T2, cls, j2);
            if (c == null) {
                c = aVar.b(U0(), cls, j2);
            }
            if (!(c == null || (g = cVar.g(c)) == null)) {
                return g;
            }
        }
        long j3 = cVar.c | j2;
        if ((JSONReader.Feature.SupportAutoType.mask & j3) != 0) {
            jdk G = objectReaderProvider.G(T2);
            if (!(G == null || (b = G.b()) == null || (classLoader = b.getClassLoader()) == null || classLoader == (contextClassLoader = Thread.currentThread().getContextClassLoader()))) {
                G = u3(G, b, contextClassLoader);
            }
            if (G == null) {
                jdk H = objectReaderProvider.H(U0(), cls, j3);
                if (H != null) {
                    jdkVar = H;
                } else {
                    p3();
                    throw null;
                }
            } else {
                jdkVar = G;
            }
            this.z = bArr[this.c];
            return jdkVar;
        } else if ((j3 & JSONReader.Feature.ErrorOnNotSupportAutoType.mask) == 0) {
            return null;
        } else {
            p3();
            throw null;
        }
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean c1() {
        if (this.x[this.c] == -111) {
            return true;
        }
        return false;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public char c2() {
        int i;
        int i2 = this.c;
        byte[] bArr = this.x;
        byte b = bArr[i2];
        if (b == -112) {
            this.c = i2 + 1;
            i = p2();
        } else if (b == 73) {
            this.c = i2 + 1;
            return (char) 0;
        } else if (b <= 73 || b >= 120) {
            String Q2 = Q2();
            if (Q2 == null || Q2.isEmpty()) {
                return (char) 0;
            }
            return Q2.charAt(0);
        } else {
            this.c = i2 + 2;
            i = bArr[i2 + 1] & 255;
        }
        return (char) i;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public int c3() {
        int i = this.c;
        this.c = i + 1;
        byte b = this.x[i];
        this.z = b;
        if (b == -81) {
            return -1;
        }
        if (b >= -108 && b <= -93) {
            this.d = (char) (-b);
            return b - ErrorConstant.ERROR_GET_PROCESS_NULL;
        } else if (b == -111) {
            return p2();
        } else {
            if (b == -92) {
                return p2();
            }
            throw new JSONException("array not support input " + q3(b));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        char[] cArr = this.D;
        if (cArr != null && cArr.length < 1048576) {
            JSONFactory.r.lazySet(this.E, cArr);
        }
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public Date d2() {
        q7h q7hVar;
        int i = this.c;
        byte[] bArr = this.x;
        byte b = bArr[i];
        if (b == -87) {
            int i2 = i + 2;
            this.c = i2;
            int i3 = i + 3;
            this.c = i3;
            int i4 = (bArr[i + 1] << 8) + (bArr[i2] & 255);
            int i5 = i + 4;
            this.c = i5;
            byte b2 = bArr[i3];
            this.c = i + 5;
            q7hVar = p7h.e(i4, b2, bArr[i5]).a();
        } else if (b == -88) {
            int i6 = i + 2;
            this.c = i6;
            int i7 = i + 3;
            this.c = i7;
            int i8 = (bArr[i + 1] << 8) + (bArr[i6] & 255);
            int i9 = i + 4;
            this.c = i9;
            byte b3 = bArr[i7];
            int i10 = i + 5;
            this.c = i10;
            byte b4 = bArr[i9];
            int i11 = i + 6;
            this.c = i11;
            byte b5 = bArr[i10];
            int i12 = i + 7;
            this.c = i12;
            byte b6 = bArr[i11];
            this.c = i + 8;
            q7hVar = q7h.e(i8, b3, b4, b5, b6, bArr[i12], p2());
        } else {
            q7hVar = null;
        }
        if (q7hVar != null) {
            return q7hVar.i(this.f2453a.m()).f();
        }
        long f0 = DateUtils.f0(Q2(), wqx.d);
        if (f0 == 0) {
            return null;
        }
        return new Date(f0);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean e1() {
        if (this.c >= this.y) {
            return true;
        }
        return false;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public double f2() {
        int i = this.c;
        byte[] bArr = this.x;
        if (bArr[i] != -75) {
            return A3();
        }
        this.c = i + 9;
        return Double.longBitsToDouble((bArr[i + 8] & 255) + ((bArr[i + 7] & 255) << 8) + ((bArr[i + 6] & 255) << 16) + ((bArr[i + 5] & 255) << 24) + ((bArr[i + 4] & 255) << 32) + ((bArr[i + 3] & 255) << 40) + ((255 & bArr[i + 2]) << 48) + (bArr[i + 1] << 56));
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0722  */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String g2() {
        /*
            Method dump skipped, instructions count: 2262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.h.g2():java.lang.String");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean h1() {
        byte b = this.x[this.c];
        if ((b >= -70 && b <= 72) || b == -84 || b == -83 || b == -85) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017f  */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long h2() {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.h.h2():long");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean i1() {
        byte b = this.x[this.c];
        if (b < -78 || b > 72) {
            return false;
        }
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long i2() {
        return h2();
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean j1() {
        int i = this.c;
        if (i >= this.y || this.x[i] != -90) {
            return false;
        }
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean k1() {
        int i = this.c;
        byte[] bArr = this.x;
        if (i >= bArr.length || bArr[i] != -109) {
            return false;
        }
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean l1() {
        int i = this.c;
        byte[] bArr = this.x;
        if (i < bArr.length) {
            byte b = bArr[i];
            this.z = b;
            if (b >= 73) {
                return true;
            }
        }
        return false;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public float l2() {
        int i = this.c;
        byte[] bArr = this.x;
        if (bArr[i] != -73) {
            return C3();
        }
        int i2 = opf.UNSAFE.getInt(bArr, opf.ARRAY_BYTE_BASE_OFFSET + i + 1);
        this.c = i + 5;
        if (!opf.BIG_ENDIAN) {
            i2 = Integer.reverseBytes(i2);
        }
        return Float.intBitsToFloat(i2);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public byte[] m2() {
        char c;
        String Q2 = Q2();
        int length = Q2.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            char charAt = Q2.charAt(i2);
            char charAt2 = Q2.charAt(i2 + 1);
            char c2 = '7';
            if (charAt <= '9') {
                c = '0';
            } else {
                c = '7';
            }
            int i3 = charAt - c;
            if (charAt2 <= '9') {
                c2 = '0';
            }
            bArr[i] = (byte) ((charAt2 - c2) | (i3 << 4));
        }
        return bArr;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean n2() {
        int i = this.c;
        if (this.x[i] != -81) {
            return false;
        }
        this.c = i + 1;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r3 <= 47) goto L_0x0063;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Integer o2() {
        /*
            r8 = this;
            int r0 = r8.c
            int r1 = r0 + 1
            byte[] r2 = r8.x
            r3 = r2[r0]
            r4 = -81
            if (r3 != r4) goto L_0x0010
            r8.c = r1
            r0 = 0
            return r0
        L_0x0010:
            r4 = -16
            if (r3 < r4) goto L_0x0019
            r4 = 47
            if (r3 > r4) goto L_0x0019
            goto L_0x0063
        L_0x0019:
            r4 = 48
            if (r3 < r4) goto L_0x002d
            r4 = 63
            if (r3 > r4) goto L_0x002d
            int r3 = r3 + (-56)
            int r3 = r3 << 8
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r1
            int r1 = r0 + 2
            goto L_0x0063
        L_0x002d:
            r4 = 64
            if (r3 < r4) goto L_0x004a
            r4 = 71
            if (r3 > r4) goto L_0x004a
            int r3 = r3 + (-68)
            int r3 = r3 << 16
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            int r3 = r3 + r1
            int r1 = r0 + 2
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r1
            int r1 = r0 + 3
            goto L_0x0063
        L_0x004a:
            r4 = 72
            if (r3 != r4) goto L_0x006a
            sun.misc.Unsafe r3 = tb.opf.UNSAFE
            long r4 = tb.opf.ARRAY_BYTE_BASE_OFFSET
            long r6 = (long) r1
            long r4 = r4 + r6
            int r1 = r3.getInt(r2, r4)
            boolean r2 = tb.opf.BIG_ENDIAN
            if (r2 != 0) goto L_0x0060
            int r1 = java.lang.Integer.reverseBytes(r1)
        L_0x0060:
            r3 = r1
            int r1 = r0 + 5
        L_0x0063:
            r8.c = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            return r0
        L_0x006a:
            r8.c = r1
            int r0 = r8.E3(r2, r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.h.o2():java.lang.Integer");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r3 <= 47) goto L_0x003e;
     */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int p2() {
        /*
            r5 = this;
            int r0 = r5.c
            int r1 = r0 + 1
            byte[] r2 = r5.x
            r3 = r2[r0]
            r4 = -16
            if (r3 < r4) goto L_0x0011
            r4 = 47
            if (r3 > r4) goto L_0x0011
            goto L_0x003e
        L_0x0011:
            r4 = 48
            if (r3 < r4) goto L_0x0025
            r4 = 63
            if (r3 > r4) goto L_0x0025
            int r3 = r3 + (-56)
            int r3 = r3 << 8
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r1
            int r1 = r0 + 2
            goto L_0x003e
        L_0x0025:
            r4 = 64
            if (r3 < r4) goto L_0x0034
            r4 = 71
            if (r3 > r4) goto L_0x0034
            int r3 = r3(r2, r1, r3)
            int r1 = r0 + 3
            goto L_0x003e
        L_0x0034:
            r4 = 72
            if (r3 != r4) goto L_0x0041
            int r3 = tb.b2d.g(r2, r1)
            int r1 = r0 + 5
        L_0x003e:
            r5.c = r1
            return r3
        L_0x0041:
            r5.c = r1
            int r0 = r5.E3(r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.h.p2():int");
    }

    public final void p3() {
        throw new JSONException("auotype not support : " + U0());
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public Long q2() {
        long j;
        int i = this.c;
        int i2 = i + 1;
        byte[] bArr = this.x;
        byte b = bArr[i];
        if (b == -81) {
            this.c = i2;
            return null;
        }
        if (b >= -40 && b <= -17) {
            j = b + 32;
        } else if (b >= -56 && b <= -41) {
            j = ((b + 48) << 8) + (bArr[i2] & 255);
            i2 = i + 2;
        } else if (b >= -64 && b <= -57) {
            j = ((b + 60) << 16) + ((bArr[i2] & 255) << 8) + (bArr[i + 2] & 255);
            i2 = i + 3;
        } else if (b == -65) {
            int i3 = opf.UNSAFE.getInt(bArr, opf.ARRAY_BYTE_BASE_OFFSET + i2);
            if (!opf.BIG_ENDIAN) {
                i3 = Integer.reverseBytes(i3);
            }
            j = i3;
            i2 = i + 5;
        } else if (b == -66) {
            long j2 = opf.UNSAFE.getLong(bArr, opf.ARRAY_BYTE_BASE_OFFSET + i2);
            if (!opf.BIG_ENDIAN) {
                j2 = Long.reverseBytes(j2);
            }
            j = j2;
            i2 = i + 9;
        } else {
            this.c = i2;
            return Long.valueOf(G3(bArr, b));
        }
        this.c = i2;
        return Long.valueOf(j);
    }

    public String q3(byte b) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(yqf.b(b));
        if (l1()) {
            int i = this.c;
            this.c = i - 1;
            try {
                str = Q2();
            } catch (Throwable unused) {
                str = null;
            }
            if (str != null) {
                sb.append(' ');
                sb.append(str);
            }
            this.c = i;
        }
        sb.append(", offset ");
        sb.append(this.c);
        sb.append(wh6.DIR);
        sb.append(this.x.length);
        return sb.toString();
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long r2() {
        long j;
        this.h = false;
        int i = this.c;
        int i2 = i + 1;
        byte[] bArr = this.x;
        byte b = bArr[i];
        if (b >= -40 && b <= -17) {
            j = b + 32;
        } else if (b >= -56 && b <= -41) {
            j = ((b + 48) << 8) + (bArr[i2] & 255);
            i2 = i + 2;
        } else if (b >= -64 && b <= -57) {
            j = ((b + 60) << 16) + ((bArr[i2] & 255) << 8) + (bArr[i + 2] & 255);
            i2 = i + 3;
        } else if (b == -65) {
            j = b2d.g(bArr, i2);
            i2 = i + 5;
        } else if (b == -66) {
            long j2 = opf.UNSAFE.getLong(bArr, opf.ARRAY_BYTE_BASE_OFFSET + i2);
            if (!opf.BIG_ENDIAN) {
                j2 = Long.reverseBytes(j2);
            }
            j = j2;
            i2 = i + 9;
        } else {
            this.c = i2;
            return G3(bArr, b);
        }
        this.c = i2;
        return j;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public JSONReader.e s1() {
        return new JSONReader.e(this.c, this.z);
    }

    public String s3(int i, int i2) {
        int i3 = opf.ANDROID_SDK_INT;
        byte[] bArr = this.x;
        if (i3 >= 34) {
            return new String(bArr, i, i2, StandardCharsets.ISO_8859_1);
        }
        char[] cArr = this.D;
        if (cArr == null) {
            cArr = JSONFactory.r.getAndSet(this.E, null);
            this.D = cArr;
        }
        if (cArr == null || cArr.length < i2) {
            cArr = new char[i2];
            this.D = cArr;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (bArr[i + i4] & 255);
        }
        return new String(cArr, 0, i2);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public void t1() {
        this.c++;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final p7h t2() {
        p7h p7hVar;
        byte b = this.B;
        byte[] bArr = this.x;
        if ((b == 121 || b == 122) && this.A == 10) {
            p7hVar = DateUtils.v(bArr, this.c);
        } else {
            int i = this.c;
            if (bArr[i] != 83 || (p7hVar = DateUtils.v(bArr, i + 1)) == null) {
                throw new JSONException("date only support string input");
            }
        }
        this.c += 11;
        return p7hVar;
    }

    public final long t3() {
        byte[] bArr;
        long j;
        long j2;
        int i = this.C;
        int i2 = 0;
        long j3 = 0;
        int i3 = 0;
        while (true) {
            int i4 = this.A;
            bArr = this.x;
            if (i3 < i4) {
                byte b = bArr[i];
                if (b >= 0 && i3 < 8 && (i3 != 0 || bArr[this.C] != 0)) {
                    switch (i3) {
                        case 0:
                            j3 = b;
                            continue;
                            i3++;
                            i++;
                        case 1:
                            j = b << 8;
                            j2 = 255;
                            break;
                        case 2:
                            j = b << 16;
                            j2 = 65535;
                            break;
                        case 3:
                            j = b << 24;
                            j2 = 16777215;
                            break;
                        case 4:
                            j = b << 32;
                            j2 = tiv.INT_MASK;
                            break;
                        case 5:
                            j = b << 40;
                            j2 = 1099511627775L;
                            break;
                        case 6:
                            j = b << 48;
                            j2 = 281474976710655L;
                            break;
                        case 7:
                            j = b << 56;
                            j2 = 72057594037927935L;
                            break;
                        default:
                            i3++;
                            i++;
                    }
                    j3 = (j3 & j2) + j;
                    i3++;
                    i++;
                }
            }
        }
        i = this.C;
        j3 = 0;
        if (j3 != 0) {
            return j3;
        }
        long j4 = ls9.MAGIC_HASH_CODE;
        while (i2 < this.A) {
            j4 = (j4 ^ bArr[i]) * ls9.MAGIC_PRIME;
            i2++;
            i++;
        }
        return j4;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean u1() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final p7h u2() {
        p7h p7hVar;
        byte b = this.B;
        byte[] bArr = this.x;
        if ((b == 121 || b == 122) && this.A == 11) {
            p7hVar = DateUtils.x(bArr, this.c);
        } else {
            int i = this.c;
            if (bArr[i] != 84 || (p7hVar = DateUtils.x(bArr, i + 1)) == null) {
                throw new JSONException("date only support string input");
            }
        }
        this.c += 12;
        return p7hVar;
    }

    public final jdk u3(jdk jdkVar, Class cls, ClassLoader classLoader) {
        String U0 = U0();
        Class<?> l = TypeUtils.l(U0);
        if (l == null) {
            if (classLoader == null) {
                try {
                    classLoader = b.class.getClassLoader();
                } catch (ClassNotFoundException unused) {
                }
            }
            l = classLoader.loadClass(U0);
        }
        if (l == null || cls.equals(l)) {
            return jdkVar;
        }
        return R0(l);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean v1() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public p7h v2() {
        p7h z;
        int i = this.c;
        byte[] bArr = this.x;
        if (bArr[i] != 81 || (z = DateUtils.z(bArr, i + 1)) == null) {
            throw new JSONException("date only support string input");
        }
        this.c += 9;
        return z;
    }

    public final JSONException v3() {
        throw new JSONException("readString not support type " + yqf.b(this.B) + ", offset " + this.c + "/" + this.x.length);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean w1() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public p7h w2() {
        p7h B;
        int i = this.c;
        byte[] bArr = this.x;
        if (bArr[i] != 82 || (B = DateUtils.B(bArr, i + 1)) == null) {
            throw new JSONException("date only support string input");
        }
        this.c += 10;
        return B;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean x1() {
        return false;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public q7h x2() {
        int i = this.c;
        byte[] bArr = this.x;
        byte b = bArr[i];
        if (b == -88) {
            int i2 = i + 2;
            this.c = i2;
            int i3 = i + 3;
            this.c = i3;
            int i4 = (bArr[i + 1] << 8) + (bArr[i2] & 255);
            int i5 = i + 4;
            this.c = i5;
            byte b2 = bArr[i3];
            int i6 = i + 5;
            this.c = i6;
            byte b3 = bArr[i5];
            int i7 = i + 6;
            this.c = i7;
            byte b4 = bArr[i6];
            int i8 = i + 7;
            this.c = i8;
            byte b5 = bArr[i7];
            this.c = i + 8;
            return q7h.e(i4, b2, b3, b4, b5, bArr[i8], p2());
        } else if (b != -81) {
            return J3(b);
        } else {
            this.c = i + 1;
            return null;
        }
    }

    public final BigInteger x3(byte b) {
        BigDecimal bigDecimal;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        byte[] bArr = this.x;
        if (b == -111) {
            int p2 = p2();
            byte[] bArr2 = new byte[p2];
            System.arraycopy(bArr, this.c, bArr2, 0, p2);
            this.c += p2;
            return new BigInteger(bArr2);
        } else if (b != -71) {
            if (b != 72) {
                if (b == 124) {
                    int p22 = p2();
                    String str = new String(bArr, this.c, p22, StandardCharsets.UTF_16LE);
                    this.c += p22;
                    if (str.indexOf(46) == -1) {
                        return new BigInteger(str);
                    }
                    return TypeUtils.E(str).toBigInteger();
                } else if (b == 121) {
                    int p23 = p2();
                    String str2 = new String(bArr, this.c, p23, StandardCharsets.ISO_8859_1);
                    this.c += p23;
                    if (str2.indexOf(46) == -1) {
                        return new BigInteger(str2);
                    }
                    return TypeUtils.E(str2).toBigInteger();
                } else if (b != 122) {
                    switch (b) {
                        case -81:
                            return null;
                        case -80:
                        case -78:
                            return BigInteger.ZERO;
                        case -79:
                        case -77:
                            return BigInteger.ONE;
                        case -76:
                            return BigInteger.valueOf(r2());
                        case -75:
                            long j = opf.UNSAFE.getLong(bArr, opf.ARRAY_BYTE_BASE_OFFSET + this.c);
                            this.c += 8;
                            if (!opf.BIG_ENDIAN) {
                                j = Long.reverseBytes(j);
                            }
                            return BigInteger.valueOf((long) Double.longBitsToDouble(j));
                        case -74:
                            return BigInteger.valueOf(p2());
                        case -73:
                            int g = b2d.g(bArr, this.c);
                            this.c += 4;
                            return BigInteger.valueOf(Float.intBitsToFloat(g));
                        default:
                            switch (b) {
                                case -68:
                                    this.c = this.c + 2;
                                    return BigInteger.valueOf((bArr[i + 1] & 255) + (bArr[i] << 8));
                                case -67:
                                    this.c = this.c + 1;
                                    return BigInteger.valueOf(bArr[i2]);
                                case -66:
                                    long j2 = opf.UNSAFE.getLong(bArr, opf.ARRAY_BYTE_BASE_OFFSET + this.c);
                                    this.c += 8;
                                    if (!opf.BIG_ENDIAN) {
                                        j2 = Long.reverseBytes(j2);
                                    }
                                    return BigInteger.valueOf(j2);
                                case -65:
                                    break;
                                default:
                                    if (b >= -16 && b <= 47) {
                                        return BigInteger.valueOf(b);
                                    }
                                    if (b >= 48 && b <= 63) {
                                        this.c = this.c + 1;
                                        return BigInteger.valueOf(((b - 56) << 8) + (bArr[i5] & 255));
                                    } else if (b >= 64 && b <= 71) {
                                        int r3 = r3(bArr, this.c, b);
                                        this.c += 2;
                                        return BigInteger.valueOf(r3);
                                    } else if (b >= -40 && b <= -17) {
                                        return BigInteger.valueOf(b + 32);
                                    } else {
                                        if (b >= -56 && b <= -41) {
                                            this.c = this.c + 1;
                                            return BigInteger.valueOf(((b + 48) << 8) + (bArr[i4] & 255));
                                        } else if (b >= -64 && b <= -57) {
                                            int i6 = this.c;
                                            this.c = i6 + 1;
                                            this.c = i6 + 2;
                                            return BigInteger.valueOf(((b + 60) << 16) + ((bArr[i6] & 255) << 8) + (bArr[i3] & 255));
                                        } else if (b < 73 || b > 120) {
                                            throw w3(b);
                                        } else {
                                            int i7 = b - 73;
                                            String s3 = s3(this.c, i7);
                                            this.c += i7;
                                            return new BigInteger(s3);
                                        }
                                    }
                            }
                    }
                } else {
                    int p24 = p2();
                    String str3 = new String(bArr, this.c, p24, StandardCharsets.UTF_8);
                    this.c += p24;
                    if (str3.indexOf(46) == -1) {
                        return new BigInteger(str3);
                    }
                    return TypeUtils.E(str3).toBigInteger();
                }
            }
            int g2 = b2d.g(bArr, this.c);
            this.c += 4;
            return BigInteger.valueOf(g2);
        } else {
            int p25 = p2();
            BigInteger X1 = X1();
            if (p25 == 0) {
                bigDecimal = new BigDecimal(X1);
            } else {
                bigDecimal = new BigDecimal(X1, p25);
            }
            return bigDecimal.toBigInteger();
        }
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean y1(byte b) {
        int i = this.c;
        if (this.x[i] != b) {
            return false;
        }
        this.c = i + 1;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public q7h y2() {
        q7h F;
        int i = this.c;
        byte[] bArr = this.x;
        if (bArr[i] != 85 || (F = DateUtils.F(bArr, i + 1)) == null) {
            throw new JSONException("date only support string input");
        }
        this.c += 13;
        return F;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean z1(char c) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final q7h z2() {
        q7h H;
        int i = this.c;
        byte[] bArr = this.x;
        if (bArr[i] != 87 || (H = DateUtils.H(bArr, i + 1)) == null) {
            throw new JSONException("date only support string input");
        }
        this.c += 15;
        return H;
    }

    public final BigDecimal z3(byte b) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        byte[] bArr = this.x;
        if (b != 72) {
            if (b == 124) {
                int p2 = p2();
                String str = new String(bArr, this.c, p2, StandardCharsets.UTF_16LE);
                this.c += p2;
                return TypeUtils.E(str);
            } else if (b == 121) {
                int p22 = p2();
                String str2 = new String(bArr, this.c, p22, StandardCharsets.ISO_8859_1);
                this.c += p22;
                return TypeUtils.E(str2);
            } else if (b != 122) {
                switch (b) {
                    case -81:
                        return null;
                    case -80:
                    case -78:
                        return BigDecimal.ZERO;
                    case -79:
                    case -77:
                        return BigDecimal.ONE;
                    case -76:
                        return BigDecimal.valueOf(r2());
                    case -75:
                        long j = opf.UNSAFE.getLong(bArr, opf.ARRAY_BYTE_BASE_OFFSET + this.c);
                        this.c += 8;
                        if (!opf.BIG_ENDIAN) {
                            j = Long.reverseBytes(j);
                        }
                        return BigDecimal.valueOf((long) Double.longBitsToDouble(j));
                    case -74:
                        return BigDecimal.valueOf(p2());
                    case -73:
                        int g = b2d.g(bArr, this.c);
                        this.c += 4;
                        return BigDecimal.valueOf(Float.intBitsToFloat(g));
                    default:
                        switch (b) {
                            case -69:
                                return new BigDecimal(X1());
                            case -68:
                                this.c = this.c + 2;
                                return BigDecimal.valueOf((bArr[i + 1] & 255) + (bArr[i] << 8));
                            case -67:
                                this.c = this.c + 1;
                                return BigDecimal.valueOf(bArr[i2]);
                            case -66:
                                long j2 = opf.UNSAFE.getLong(bArr, opf.ARRAY_BYTE_BASE_OFFSET + this.c);
                                this.c += 8;
                                if (!opf.BIG_ENDIAN) {
                                    j2 = Long.reverseBytes(j2);
                                }
                                return BigDecimal.valueOf(j2);
                            case -65:
                                break;
                            default:
                                if (b >= -16 && b <= 47) {
                                    return BigDecimal.valueOf(b);
                                }
                                if (b >= 48 && b <= 63) {
                                    this.c = this.c + 1;
                                    return BigDecimal.valueOf(((b - 56) << 8) + (bArr[i5] & 255));
                                } else if (b >= 64 && b <= 71) {
                                    int r3 = r3(bArr, this.c, b);
                                    this.c += 2;
                                    return BigDecimal.valueOf(r3);
                                } else if (b >= -40 && b <= -17) {
                                    return BigDecimal.valueOf(b + 32);
                                } else {
                                    if (b >= -56 && b <= -41) {
                                        this.c = this.c + 1;
                                        return BigDecimal.valueOf(((b + 48) << 8) + (bArr[i4] & 255));
                                    } else if (b >= -64 && b <= -57) {
                                        int i6 = this.c;
                                        this.c = i6 + 1;
                                        this.c = i6 + 2;
                                        return BigDecimal.valueOf(((b + 60) << 16) + ((bArr[i6] & 255) << 8) + (bArr[i3] & 255));
                                    } else if (b < 73 || b > 120) {
                                        throw w3(b);
                                    } else {
                                        int i7 = b - 73;
                                        String s3 = s3(this.c, i7);
                                        this.c += i7;
                                        return TypeUtils.E(s3);
                                    }
                                }
                        }
                }
            } else {
                int p23 = p2();
                String str3 = new String(bArr, this.c, p23, StandardCharsets.UTF_8);
                this.c += p23;
                return TypeUtils.E(str3);
            }
        }
        int g2 = b2d.g(bArr, this.c);
        this.c += 4;
        return BigDecimal.valueOf(g2);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0256 A[LOOP:3: B:121:0x0256->B:123:0x025a, LOOP_START, PHI: r9 r18 
      PHI: (r9v4 int) = (r9v1 int), (r9v5 int) binds: [B:119:0x0251, B:123:0x025a] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r18v3 long) = (r18v0 long), (r18v4 long) binds: [B:119:0x0251, B:123:0x025a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long N3() {
        /*
            Method dump skipped, instructions count: 770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.h.N3():long");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public String[] R2() {
        if (!y1((byte) -110) || T2() == rgk.HASH_TYPE) {
            int c3 = c3();
            if (c3 == -1) {
                return null;
            }
            String[] strArr = new String[c3];
            for (int i = 0; i < c3; i++) {
                strArr[i] = Q2();
            }
            return strArr;
        }
        throw new JSONException(a1("not support type " + U0()));
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public Object T1() {
        jdk jdkVar;
        Object obj;
        int i;
        Object obj2;
        wqx wqxVar;
        List list;
        int i2;
        int i3 = this.c;
        byte[] bArr = this.x;
        String str = "/";
        if (i3 < bArr.length) {
            int i4 = i3 + 1;
            this.c = i4;
            byte b = bArr[i3];
            this.z = b;
            if (b != 72) {
                long j = 0;
                Class cls = null;
                JSONReader.c cVar = this.f2453a;
                switch (b) {
                    case -112:
                        return Character.valueOf((char) p2());
                    case -111:
                        int I3 = I3();
                        int i5 = this.c;
                        byte[] copyOfRange = Arrays.copyOfRange(bArr, i5, i5 + I3);
                        this.c += I3;
                        return copyOfRange;
                    case -110:
                        long T2 = T2();
                        JSONReader.a aVar = cVar.g;
                        if (aVar != null) {
                            Class<?> c = aVar.c(T2, null, cVar.c);
                            if (c == null) {
                                c = cVar.g.b(U0(), null, cVar.c);
                            }
                            if (c != null) {
                                return cVar.g(c).q(this, null, null, 0L);
                            }
                        }
                        if ((cVar.c & JSONReader.Feature.SupportAutoType.mask) != 0) {
                            jdk h = cVar.h(T2);
                            if (h == null) {
                                String U0 = U0();
                                jdk i6 = cVar.i(U0, null);
                                if (i6 != null) {
                                    jdkVar = i6;
                                } else {
                                    throw new JSONException("auoType not support : " + U0 + ", offset " + this.c + str + bArr.length);
                                }
                            } else {
                                jdkVar = h;
                            }
                            return jdkVar.q(this, null, null, 0L);
                        } else if (j1()) {
                            return M2();
                        } else {
                            if (b1()) {
                                return U1();
                            }
                            throw new JSONException("auoType not support , offset " + this.c + str + bArr.length);
                        }
                    default:
                        byte b2 = 73;
                        int i7 = 0;
                        switch (b) {
                            case -90:
                                String str2 = ", offset ";
                                boolean z = true;
                                boolean z2 = (JSONReader.Feature.SupportAutoType.mask & cVar.c) != 0;
                                Map map = null;
                                while (true) {
                                    int i8 = this.c;
                                    byte b3 = bArr[i8];
                                    if (b3 == -91) {
                                        int i9 = z ? 1 : 0;
                                        int i10 = z ? 1 : 0;
                                        this.c = i8 + i9;
                                        if (map != null) {
                                            return map;
                                        }
                                        if ((cVar.c & JSONReader.Feature.UseNativeObject.mask) != j) {
                                            return new HashMap();
                                        }
                                        return new JSONObject();
                                    }
                                    if (!z2 || i7 != 0 || b3 < b2) {
                                        str2 = str2;
                                        if (b3 >= b2) {
                                            obj = g2();
                                        } else {
                                            obj = T1();
                                        }
                                    } else if (h2() == jdk.HASH_TYPE) {
                                        jdk h2 = cVar.h(V2());
                                        if (h2 == null) {
                                            String U02 = U0();
                                            jdk i11 = cVar.i(U02, cls);
                                            if (i11 != null) {
                                                h2 = i11;
                                            } else {
                                                throw new JSONException("auotype not support : " + U02 + str2 + this.c + str + bArr.length);
                                            }
                                        }
                                        this.u = z;
                                        return h2.q(this, null, null, 0L);
                                    } else {
                                        str2 = str2;
                                        obj = U0();
                                    }
                                    if (map == null) {
                                        i = i7;
                                        if ((cVar.c & JSONReader.Feature.UseNativeObject.mask) != j) {
                                            map = new HashMap();
                                        } else {
                                            Supplier<Map> supplier = cVar.e;
                                            if (supplier != null) {
                                                map = supplier.get();
                                            } else {
                                                map = new JSONObject();
                                            }
                                        }
                                    } else {
                                        i = i7;
                                    }
                                    if (k1()) {
                                        String P2 = P2();
                                        if ("..".equals(P2)) {
                                            map.put(obj, map);
                                        } else {
                                            c(map, obj, c.b(P2));
                                            map.put(obj, cls);
                                        }
                                        cVar = cVar;
                                    } else {
                                        int i12 = this.c;
                                        byte b4 = bArr[i12];
                                        if (b4 >= 73 && b4 <= 126) {
                                            obj2 = Q2();
                                        } else if (b4 >= -16 && b4 <= 47) {
                                            this.c = i12 + 1;
                                            obj2 = Integer.valueOf(b4);
                                        } else if (b4 == -79) {
                                            this.c = i12 + 1;
                                            obj2 = Boolean.TRUE;
                                        } else if (b4 == -80) {
                                            this.c = i12 + 1;
                                            obj2 = Boolean.FALSE;
                                        } else if (b4 == -90) {
                                            obj2 = M2();
                                        } else {
                                            obj2 = T1();
                                        }
                                        if (obj2 == null) {
                                            cVar = cVar;
                                            if ((cVar.c & JSONReader.Feature.IgnoreNullPropertyValue.mask) != 0) {
                                            }
                                        } else {
                                            cVar = cVar;
                                        }
                                        map.put(obj, obj2);
                                    }
                                    i7 = i + 1;
                                    str = str;
                                    z = true;
                                    j = 0;
                                    cls = null;
                                    b2 = 73;
                                }
                                break;
                            case -89:
                                int i13 = i3 + 2;
                                this.c = i13;
                                byte b5 = bArr[i4];
                                int i14 = i3 + 3;
                                this.c = i14;
                                byte b6 = bArr[i13];
                                this.c = i3 + 4;
                                return x9h.c(b5, b6, bArr[i14], p2());
                            case -88:
                                int i15 = i3 + 2;
                                this.c = i15;
                                int i16 = i3 + 3;
                                this.c = i16;
                                int i17 = (bArr[i4] << 8) + (bArr[i15] & 255);
                                int i18 = i3 + 4;
                                this.c = i18;
                                byte b7 = bArr[i16];
                                int i19 = i3 + 5;
                                this.c = i19;
                                byte b8 = bArr[i18];
                                int i20 = i3 + 6;
                                this.c = i20;
                                byte b9 = bArr[i19];
                                int i21 = i3 + 7;
                                this.c = i21;
                                byte b10 = bArr[i20];
                                this.c = i3 + 8;
                                return q7h.e(i17, b7, b8, b9, b10, bArr[i21], p2());
                            case -87:
                                int i22 = i3 + 2;
                                this.c = i22;
                                int i23 = i3 + 3;
                                this.c = i23;
                                int i24 = (bArr[i4] << 8) + (bArr[i22] & 255);
                                int i25 = i3 + 4;
                                this.c = i25;
                                byte b11 = bArr[i23];
                                this.c = i3 + 5;
                                return p7h.e(i24, b11, bArr[i25]);
                            case -86:
                                int i26 = i3 + 2;
                                this.c = i26;
                                int i27 = i3 + 3;
                                this.c = i27;
                                int i28 = (bArr[i4] << 8) + (bArr[i26] & 255);
                                int i29 = i3 + 4;
                                this.c = i29;
                                byte b12 = bArr[i27];
                                int i30 = i3 + 5;
                                this.c = i30;
                                byte b13 = bArr[i29];
                                int i31 = i3 + 6;
                                this.c = i31;
                                byte b14 = bArr[i30];
                                int i32 = i3 + 7;
                                this.c = i32;
                                byte b15 = bArr[i31];
                                this.c = i3 + 8;
                                byte b16 = bArr[i32];
                                int p2 = p2();
                                int i33 = this.c;
                                byte[] bArr2 = L;
                                if (i33 + bArr2.length < bArr.length) {
                                    while (i7 < bArr2.length) {
                                        if (bArr[this.c + i7] == bArr2[i7]) {
                                            i7++;
                                        }
                                    }
                                    this.c += bArr2.length;
                                    wqxVar = wqx.SHANGHAI_ZONE_ID;
                                    return xqx.c(q7h.e(i28, b12, b13, b14, b15, b16, p2), wqxVar);
                                }
                                wqxVar = DateUtils.n(Q2(), wqx.SHANGHAI_ZONE_ID);
                                return xqx.c(q7h.e(i28, b12, b13, b14, b15, b16, p2), wqxVar);
                            case -85:
                                long j2 = opf.UNSAFE.getLong(bArr, opf.ARRAY_BYTE_BASE_OFFSET + i4);
                                this.c += 8;
                                if (!opf.BIG_ENDIAN) {
                                    j2 = Long.reverseBytes(j2);
                                }
                                return new Date(j2);
                            case -84:
                                this.c += 4;
                                return new Date(b2d.g(bArr, i4) * 1000);
                            case -83:
                                this.c += 4;
                                return new Date(b2d.g(bArr, i4) * 60000);
                            case -82:
                                return vcf.e(r2(), p2());
                            case -81:
                                return null;
                            case -80:
                                return Boolean.FALSE;
                            case -79:
                                return Boolean.TRUE;
                            case -78:
                                return Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT);
                            case -77:
                                return Double.valueOf(1.0d);
                            case -76:
                                return Double.valueOf(r2());
                            case -75:
                                long j3 = opf.UNSAFE.getLong(bArr, opf.ARRAY_BYTE_BASE_OFFSET + i4);
                                this.c += 8;
                                if (!opf.BIG_ENDIAN) {
                                    j3 = Long.reverseBytes(j3);
                                }
                                return Double.valueOf(Double.longBitsToDouble(j3));
                            case -74:
                                return Float.valueOf(p2());
                            case -73:
                                int g = b2d.g(bArr, i4);
                                this.c += 4;
                                return Float.valueOf(Float.intBitsToFloat(g));
                            case -72:
                                return BigDecimal.valueOf(r2());
                            case -71:
                                int p22 = p2();
                                BigInteger X1 = X1();
                                if (p22 == 0) {
                                    return new BigDecimal(X1);
                                }
                                return new BigDecimal(X1, p22);
                            case -70:
                                return BigInteger.valueOf(r2());
                            case -69:
                                int p23 = p2();
                                byte[] bArr3 = new byte[p23];
                                System.arraycopy(bArr, this.c, bArr3, 0, p23);
                                this.c += p23;
                                return new BigInteger(bArr3);
                            case -68:
                                int i34 = i3 + 2;
                                this.c = i34;
                                this.c = i3 + 3;
                                return Short.valueOf((short) ((bArr[i4] << 8) + (bArr[i34] & 255)));
                            case -67:
                                this.c = i3 + 2;
                                return Byte.valueOf(bArr[i4]);
                            case -66:
                                long j4 = opf.UNSAFE.getLong(bArr, opf.ARRAY_BYTE_BASE_OFFSET + i4);
                                this.c += 8;
                                if (!opf.BIG_ENDIAN) {
                                    j4 = Long.reverseBytes(j4);
                                }
                                return Long.valueOf(j4);
                            case -65:
                                int g2 = b2d.g(bArr, i4);
                                this.c += 4;
                                return new Long(g2);
                            default:
                                switch (b) {
                                    case 122:
                                        int I32 = I3();
                                        String str3 = new String(bArr, this.c, I32, StandardCharsets.UTF_8);
                                        this.c += I32;
                                        return str3;
                                    case 123:
                                        int I33 = I3();
                                        String str4 = new String(bArr, this.c, I33, StandardCharsets.UTF_16);
                                        this.c += I33;
                                        return str4;
                                    case 124:
                                        int I34 = I3();
                                        String str5 = new String(bArr, this.c, I34, StandardCharsets.UTF_16LE);
                                        this.c += I34;
                                        return str5;
                                    case 125:
                                        int I35 = I3();
                                        String str6 = new String(bArr, this.c, I35, StandardCharsets.UTF_16BE);
                                        this.c += I35;
                                        return str6;
                                    case 126:
                                        if (M == null) {
                                            M = Charset.forName("GB18030");
                                        }
                                        int I36 = I3();
                                        String str7 = new String(bArr, this.c, I36, M);
                                        this.c += I36;
                                        return str7;
                                    default:
                                        if (b >= -16 && b <= 47) {
                                            return Integer.valueOf(b);
                                        }
                                        if (b >= 48 && b <= 63) {
                                            this.c = i3 + 2;
                                            return Integer.valueOf(((b - 56) << 8) + (bArr[i4] & 255));
                                        } else if (b >= 64 && b <= 71) {
                                            int r3 = r3(bArr, i4, b);
                                            this.c += 2;
                                            return Integer.valueOf(r3);
                                        } else if (b >= -40 && b <= -17) {
                                            return Long.valueOf((b - (-40)) - 8);
                                        } else {
                                            if (b >= -56 && b <= -41) {
                                                this.c = i3 + 2;
                                                return Long.valueOf(((b + 48) << 8) + (bArr[i4] & 255));
                                            } else if (b >= -64 && b <= -57) {
                                                int i35 = (b + 60) << 16;
                                                this.c = i3 + 2;
                                                this.c = i3 + 3;
                                                return Long.valueOf(i35 + ((bArr[i4] & 255) << 8) + (bArr[i2] & 255));
                                            } else if (b >= -108 && b <= -92) {
                                                int I37 = b == -92 ? I3() : b + 108;
                                                if (I37 != 0) {
                                                    if ((cVar.c & JSONReader.Feature.UseNativeObject.mask) != 0) {
                                                        list = new ArrayList(I37);
                                                    } else {
                                                        list = new JSONArray(I37);
                                                    }
                                                    while (i7 < I37) {
                                                        if (k1()) {
                                                            String P22 = P2();
                                                            if ("..".equals(P22)) {
                                                                list.add(list);
                                                            } else {
                                                                list.add(null);
                                                                b(list, i7, c.b(P22));
                                                            }
                                                        } else {
                                                            list.add(T1());
                                                        }
                                                        i7++;
                                                    }
                                                    return list;
                                                } else if ((cVar.c & JSONReader.Feature.UseNativeObject.mask) != 0) {
                                                    return new ArrayList();
                                                } else {
                                                    Supplier<List> supplier2 = cVar.f;
                                                    if (supplier2 != null) {
                                                        return supplier2.get();
                                                    }
                                                    return new JSONArray();
                                                }
                                            } else if (b >= 73 && b <= 121) {
                                                int I38 = b == 121 ? I3() : b - 73;
                                                this.A = I38;
                                                if (I38 >= 0) {
                                                    String s3 = s3(this.c, I38);
                                                    this.c += this.A;
                                                    return (cVar.c & JSONReader.Feature.TrimString.mask) != 0 ? s3.trim() : s3;
                                                }
                                                throw null;
                                            } else if (b == Byte.MAX_VALUE) {
                                                int I39 = I3();
                                                this.A = I39;
                                                if (I39 >= 0) {
                                                    throw new JSONException("not support symbol : " + this.A);
                                                }
                                                throw null;
                                            } else {
                                                throw new JSONException("not support type : " + q3(this.z));
                                            }
                                        }
                                }
                        }
                }
            } else {
                int g3 = b2d.g(bArr, i4);
                this.c += 4;
                return new Integer(g3);
            }
        } else {
            throw new JSONException("readAny overflow : " + this.c + str + bArr.length);
        }
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public UUID U2() {
        long j;
        long j2;
        int i = this.c;
        this.c = i + 1;
        byte[] bArr = this.x;
        byte b = bArr[i];
        int i2 = 16;
        if (b == -111) {
            int I3 = I3();
            if (I3 == 16) {
                Unsafe unsafe = opf.UNSAFE;
                long j3 = opf.ARRAY_BYTE_BASE_OFFSET;
                long j4 = unsafe.getLong(bArr, this.c + j3);
                j = unsafe.getLong(bArr, j3 + this.c + 8);
                this.c += 16;
                boolean z = opf.BIG_ENDIAN;
                j2 = z ? j4 : Long.reverseBytes(j4);
                if (!z) {
                    j = Long.reverseBytes(j);
                }
            } else {
                throw new JSONException("uuid not support " + I3);
            }
        } else if (b == -81) {
            return null;
        } else {
            if (b != 105) {
                if (b == 109) {
                    byte b2 = bArr[i + 9];
                    byte b3 = bArr[i + 14];
                    byte b4 = bArr[i + 19];
                    byte b5 = bArr[i + 24];
                    if (b2 == 45 && b3 == 45 && b4 == 45 && b5 == 45) {
                        long j5 = 0;
                        for (int i3 = 0; i3 < 8; i3++) {
                            j5 = (j5 << 4) + JSONFactory.w[bArr[this.c + i3] - 48];
                        }
                        for (int i4 = 9; i4 < 13; i4++) {
                            j5 = (j5 << 4) + JSONFactory.w[bArr[this.c + i4] - 48];
                        }
                        j2 = j5;
                        for (int i5 = 14; i5 < 18; i5++) {
                            j2 = (j2 << 4) + JSONFactory.w[bArr[this.c + i5] - 48];
                        }
                        j = 0;
                        for (int i6 = 19; i6 < 23; i6++) {
                            j = (j << 4) + JSONFactory.w[bArr[this.c + i6] - 48];
                        }
                        for (int i7 = 24; i7 < 36; i7++) {
                            j = JSONFactory.w[bArr[this.c + i7] - 48] + (j << 4);
                        }
                        this.c += 36;
                    } else {
                        throw new JSONException("Invalid UUID string:  ".concat(new String(bArr, this.c, 36, StandardCharsets.ISO_8859_1)));
                    }
                } else if (b == 121 || b == 122) {
                    int I32 = I3();
                    if (I32 == 32) {
                        j2 = 0;
                        for (int i8 = 0; i8 < 16; i8++) {
                            j2 = (j2 << 4) + JSONFactory.w[bArr[this.c + i8] - 48];
                        }
                        j = 0;
                        while (i2 < 32) {
                            j = (j << 4) + JSONFactory.w[bArr[this.c + i2] - 48];
                            i2++;
                        }
                        this.c += 32;
                    } else if (I32 == 36) {
                        int i9 = this.c;
                        byte b6 = bArr[i9 + 8];
                        byte b7 = bArr[i9 + 13];
                        byte b8 = bArr[i9 + 18];
                        byte b9 = bArr[i9 + 23];
                        if (b6 == 45 && b7 == 45 && b8 == 45 && b9 == 45) {
                            int i10 = 0;
                            long j6 = 0;
                            for (int i11 = 8; i10 < i11; i11 = 8) {
                                j6 = (j6 << 4) + JSONFactory.w[bArr[this.c + i10] - 48];
                                i10++;
                            }
                            for (int i12 = 9; i12 < 13; i12++) {
                                j6 = (j6 << 4) + JSONFactory.w[bArr[this.c + i12] - 48];
                            }
                            for (int i13 = 14; i13 < 18; i13++) {
                                j6 = (j6 << 4) + JSONFactory.w[bArr[this.c + i13] - 48];
                            }
                            long j7 = 0;
                            for (int i14 = 19; i14 < 23; i14++) {
                                j7 = (j7 << 4) + JSONFactory.w[bArr[this.c + i14] - 48];
                            }
                            for (int i15 = 24; i15 < 36; i15++) {
                                j7 = JSONFactory.w[bArr[this.c + i15] - 48] + (j7 << 4);
                            }
                            this.c += 36;
                            j = j7;
                            j2 = j6;
                        } else {
                            j2 = 0;
                            j = 0;
                        }
                    } else {
                        String str = new String(bArr, this.c, I32, StandardCharsets.UTF_8);
                        this.c += I32;
                        throw new JSONException("Invalid UUID string:  ".concat(str));
                    }
                } else {
                    throw w3(b);
                }
            } else {
                j2 = 0;
                for (int i16 = 0; i16 < 16; i16++) {
                    j2 = (j2 << 4) + JSONFactory.w[bArr[this.c + i16] - 48];
                }
                j = 0;
                while (i2 < 32) {
                    j = (j << 4) + JSONFactory.w[bArr[this.c + i2] - 48];
                    i2++;
                }
                this.c += 32;
            }
        }
        return new UUID(j2, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0229 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x032d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014e A[RETURN] */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long V2() {
        /*
            Method dump skipped, instructions count: 938
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.h.V2():long");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long[] s2() {
        if (y1((byte) -110)) {
            long T2 = T2();
            if (!(T2 == afk.HASH_TYPE || T2 == zek.HASH_TYPE || T2 == wek.HASH_TYPE || T2 == xek.HASH_TYPE)) {
                throw new JSONException(a1("not support " + U0()));
            }
        }
        int c3 = c3();
        if (c3 == -1) {
            return null;
        }
        long[] jArr = new long[c3];
        for (int i = 0; i < c3; i++) {
            jArr[i] = r2();
        }
        return jArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean y3(byte r17) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.h.y3(byte):boolean");
    }
}
