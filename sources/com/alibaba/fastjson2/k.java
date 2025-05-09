package com.alibaba.fastjson2;

import anet.channel.util.ErrorConstant;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import tb.b2d;
import tb.iik;
import tb.ls9;
import tb.o6s;
import tb.p7h;
import tb.q7h;
import tb.vu3;
import tb.w1r;
import tb.x9h;
import tb.yqf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class k extends JSONWriter {
    public static final BigInteger v = BigInteger.valueOf(-2147483648L);
    public static final BigInteger w = BigInteger.valueOf(2147483647L);
    public static final BigInteger x = BigInteger.valueOf(Long.MIN_VALUE);
    public static final BigInteger y = BigInteger.valueOf(Long.MAX_VALUE);
    public final JSONFactory.CacheItem q;
    public byte[] r;
    public o6s s;
    public int t;
    public long u;

    public k(JSONWriter.a aVar, w1r w1rVar) {
        super(aVar, w1rVar, true, StandardCharsets.UTF_8);
        JSONFactory.CacheItem[] cacheItemArr = JSONFactory.q;
        JSONFactory.CacheItem cacheItem = cacheItemArr[System.identityHashCode(Thread.currentThread()) & (cacheItemArr.length - 1)];
        this.q = cacheItem;
        byte[] andSet = JSONFactory.s.getAndSet(cacheItem, null);
        this.r = andSet == null ? new byte[8192] : andSet;
    }

    public static void A2(byte[] bArr, int i, long j) {
        bArr[i] = (byte) (j >>> 56);
        bArr[i + 1] = (byte) (j >>> 48);
        bArr[i + 2] = (byte) (j >>> 40);
        bArr[i + 3] = (byte) (j >>> 32);
        bArr[i + 4] = (byte) (j >>> 24);
        bArr[i + 5] = (byte) (j >>> 16);
        bArr[i + 6] = (byte) (j >>> 8);
        bArr[i + 7] = (byte) j;
    }

    public static void B2(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) ((i2 >> 16) - 60);
        bArr[i + 1] = (byte) (i2 >> 8);
        bArr[i + 2] = (byte) i2;
    }

    public static int C2(byte[] bArr, int i, int i2) {
        if (i2 <= 262143) {
            bArr[i] = 121;
            z2(bArr, i + 1, i2);
            return 4;
        }
        bArr[i] = 121;
        bArr[i + 1] = 72;
        bArr[i + 2] = (byte) (i2 >>> 24);
        bArr[i + 3] = (byte) (i2 >>> 16);
        bArr[i + 4] = (byte) (i2 >>> 8);
        bArr[i + 5] = (byte) i2;
        return 6;
    }

    public static void D2(byte[] bArr, int i, int i2) {
        bArr[i] = 121;
        bArr[i + 1] = (byte) ((i2 >> 8) + 56);
        bArr[i + 2] = (byte) i2;
    }

    public static int E2(int i) {
        if (i >= -16 && i <= 47) {
            return 1;
        }
        if (i >= -2048 && i <= 2047) {
            return 2;
        }
        if (i < -262144 || i > 262143) {
            return 5;
        }
        return 3;
    }

    public static int F2(byte[] bArr, int i, int i2) {
        if (i2 >= -16 && i2 <= 47) {
            bArr[i] = (byte) i2;
            return 1;
        } else if (i2 >= -2048 && i2 <= 2047) {
            bArr[i] = (byte) ((i2 >> 8) + 56);
            bArr[i + 1] = (byte) i2;
            return 2;
        } else if (i2 < -262144 || i2 > 262143) {
            bArr[i] = 72;
            y2(bArr, i + 1, i2);
            return 5;
        } else {
            z2(bArr, i, i2);
            return 3;
        }
    }

    public static boolean w2(BigInteger bigInteger) {
        if (bigInteger.compareTo(v) < 0 || bigInteger.compareTo(w) > 0) {
            return false;
        }
        return true;
    }

    public static boolean x2(BigInteger bigInteger) {
        if (bigInteger.compareTo(x) < 0 || bigInteger.compareTo(y) > 0) {
            return false;
        }
        return true;
    }

    public static void y2(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >>> 24);
        bArr[i + 1] = (byte) (i2 >>> 16);
        bArr[i + 2] = (byte) (i2 >>> 8);
        bArr[i + 3] = (byte) i2;
    }

    public static void z2(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) ((i2 >> 16) + 68);
        bArr[i + 1] = (byte) (i2 >> 8);
        bArr[i + 2] = (byte) i2;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void B1(double[] dArr) {
        if (dArr == null) {
            b2();
            return;
        }
        d1(dArr.length);
        for (double d : dArr) {
            writeDouble(d);
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void D1(Enum r8) {
        if (r8 == null) {
            b2();
            return;
        }
        long j = this.f2458a.c;
        if ((JSONWriter.Feature.WriteEnumUsingToString.mask & j) != 0) {
            k2(r8.toString());
        } else if ((j & JSONWriter.Feature.WriteEnumsUsingName.mask) != 0) {
            k2(r8.name());
        } else {
            int ordinal = r8.ordinal();
            if (ordinal <= 47) {
                int i = this.i;
                if (i == this.r.length) {
                    v2(i + 1);
                }
                byte[] bArr = this.r;
                int i2 = this.i;
                this.i = i2 + 1;
                bArr[i2] = (byte) ordinal;
                return;
            }
            L1(ordinal);
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void F1(float[] fArr) {
        if (fArr == null) {
            b2();
            return;
        }
        d1(fArr.length);
        for (float f : fArr) {
            writeFloat(f);
        }
    }

    public void G2(char[] cArr) {
        boolean z;
        int i;
        int i2;
        int i3;
        boolean z2;
        if (cArr == null) {
            b2();
            return;
        }
        int i4 = this.i;
        int length = cArr.length;
        int i5 = 0;
        if (cArr.length < 47) {
            int i6 = i4 + 1;
            int i7 = i6 + length;
            if (i7 - this.r.length > 0) {
                v2(i7);
            }
            this.r[i4] = (byte) (length + 73);
            int i8 = 0;
            while (true) {
                if (i8 >= cArr.length) {
                    z2 = true;
                    break;
                }
                char c = cArr[i8];
                if (c > 255) {
                    z2 = false;
                    break;
                }
                this.r[i6] = (byte) c;
                i8++;
                i6++;
            }
            if (z2) {
                this.i = i6;
                return;
            } else {
                z = z2;
                i4 = this.i;
            }
        } else {
            z = true;
        }
        int length2 = cArr.length & (-4);
        int i9 = 0;
        while (i9 < length2) {
            char c2 = cArr[i9];
            char c3 = cArr[i9 + 1];
            char c4 = cArr[i9 + 2];
            char c5 = cArr[i9 + 3];
            if (c2 > 255 || c3 > 255 || c4 > 255 || c5 > 255) {
                z = false;
                break;
            }
            i9 += 4;
        }
        if (z) {
            while (true) {
                if (i9 >= cArr.length) {
                    break;
                } else if (cArr[i9] > 255) {
                    z = false;
                    break;
                } else {
                    i9++;
                }
            }
        }
        if (z) {
            i = length;
        } else {
            i = length * 3;
        }
        int i10 = i + i4 + 6;
        if (i10 - this.r.length > 0) {
            v2(i10);
        }
        if (z) {
            if (length <= 47) {
                i2 = i4 + 1;
                this.r[i4] = (byte) (length + 73);
            } else if (length <= 2047) {
                D2(this.r, i4, length);
                i2 = i4 + 3;
            } else {
                i2 = i4 + C2(this.r, i4, length);
            }
            while (i5 < cArr.length) {
                this.r[i2] = (byte) cArr[i5];
                i5++;
                i2++;
            }
        } else {
            int length3 = cArr.length * 3;
            int E2 = E2(length3);
            v2(length3 + i4 + E2 + 1);
            int i11 = i4 + E2 + 1;
            int d = ((b2d.d(cArr, 0, cArr.length, this.r, i11) - i4) - E2) - 1;
            int E22 = E2(d);
            if (E2 != E22) {
                byte[] bArr = this.r;
                System.arraycopy(bArr, i11, bArr, E22 + i4 + 1, d);
            }
            byte[] bArr2 = this.r;
            int i12 = i4 + 1;
            bArr2[i4] = 122;
            if (d >= -16 && d <= 47) {
                i3 = i4 + 2;
                bArr2[i12] = (byte) d;
            } else if (d < -2048 || d > 2047) {
                i3 = F2(bArr2, i12, d) + i12;
            } else {
                bArr2[i12] = (byte) ((d >> 8) + 56);
                bArr2[i4 + 2] = (byte) d;
                i3 = i4 + 3;
            }
            i2 = i3 + d;
        }
        this.i = i2;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void H1(byte[] bArr) {
        n1(bArr);
    }

    public final boolean H2(int i) {
        int i2 = this.i;
        int i3 = i2 + 2;
        if (i3 >= this.r.length) {
            v2(i3);
        }
        this.r[i2] = -110;
        this.i = i2 + 1;
        L1(-i);
        return false;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void I1(long j, int i) {
        v2(this.i + 1);
        byte[] bArr = this.r;
        int i2 = this.i;
        this.i = i2 + 1;
        bArr[i2] = -82;
        O1(j);
        L1(i);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void J1(short s) {
        int i = this.i;
        int i2 = i + 3;
        if (i2 >= this.r.length) {
            v2(i2);
        }
        byte[] bArr = this.r;
        bArr[i] = -68;
        bArr[i + 1] = (byte) (s >>> 8);
        bArr[i + 2] = (byte) s;
        this.i = i2;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void K1(short[] sArr) {
        if (sArr == null) {
            b2();
            return;
        }
        d1(sArr.length);
        for (short s : sArr) {
            L1(s);
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void L1(int i) {
        int i2 = 5;
        int i3 = this.i + 5;
        if (i3 >= this.r.length) {
            v2(i3);
        }
        byte[] bArr = this.r;
        int i4 = this.i;
        if (i >= -16 && i <= 47) {
            bArr[i4] = (byte) i;
            i2 = 1;
        } else if (i >= -2048 && i <= 2047) {
            bArr[i4] = (byte) ((i >> 8) + 56);
            bArr[i4 + 1] = (byte) i;
            i2 = 2;
        } else if (i < -262144 || i > 262143) {
            bArr[i4] = 72;
            y2(bArr, i4 + 1, i);
        } else {
            z2(bArr, i4, i);
            i2 = 3;
        }
        this.i += i2;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void N1(int[] iArr) {
        if (iArr == null) {
            k1();
            return;
        }
        int length = iArr.length;
        int i = this.i;
        if (i == this.r.length) {
            v2(i + 1);
        }
        if (length <= 15) {
            byte[] bArr = this.r;
            int i2 = this.i;
            this.i = i2 + 1;
            bArr[i2] = (byte) (length + ErrorConstant.ERROR_GET_PROCESS_NULL);
        } else {
            byte[] bArr2 = this.r;
            int i3 = this.i;
            this.i = i3 + 1;
            bArr2[i3] = -92;
            L1(length);
        }
        int i4 = this.i;
        int length2 = (iArr.length * 5) + i4;
        if (length2 - this.r.length > 0) {
            v2(length2);
        }
        byte[] bArr3 = this.r;
        for (int i5 : iArr) {
            if (i5 >= -16 && i5 <= 47) {
                bArr3[i4] = (byte) i5;
                i4++;
            } else if (i5 >= -2048 && i5 <= 2047) {
                int i6 = i4 + 1;
                bArr3[i4] = (byte) ((i5 >> 8) + 56);
                i4 += 2;
                bArr3[i6] = (byte) i5;
            } else if (i5 < -262144 || i5 > 262143) {
                bArr3[i4] = 72;
                y2(bArr3, i4 + 1, i5);
                i4 += 5;
            } else {
                z2(bArr3, i4, i5);
                i4 += 3;
            }
        }
        this.i = i4;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void O1(long j) {
        int i = 9;
        int i2 = this.i + 9;
        if (i2 > this.r.length) {
            v2(i2);
        }
        byte[] bArr = this.r;
        int i3 = this.i;
        if (j >= -8 && j <= 15) {
            bArr[i3] = (byte) (j - 32);
            i = 1;
        } else if (j >= -2048 && j <= 2047) {
            bArr[i3] = (byte) ((j >> 8) - 48);
            bArr[i3 + 1] = (byte) j;
            i = 2;
        } else if (j >= -262144 && j <= 262143) {
            B2(bArr, i3, (int) j);
            i = 3;
        } else if (j < -2147483648L || j > 2147483647L) {
            bArr[i3] = -66;
            A2(bArr, i3 + 1, j);
        } else {
            bArr[i3] = -65;
            y2(bArr, i3 + 1, (int) j);
            i = 5;
        }
        this.i = i3 + i;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void P1(long[] jArr) {
        int i;
        if (jArr == null) {
            k1();
            return;
        }
        int length = jArr.length;
        int i2 = this.i;
        int length2 = (jArr.length * 9) + i2 + 5;
        if (length2 >= this.r.length) {
            v2(length2);
        }
        byte[] bArr = this.r;
        if (length <= 15) {
            i = i2 + 1;
            bArr[i2] = (byte) (length + ErrorConstant.ERROR_GET_PROCESS_NULL);
        } else {
            bArr[i2] = -92;
            i = i2 + F2(bArr, i2 + 1, length) + 1;
        }
        for (long j : jArr) {
            if (j >= -16 && j <= 47) {
                bArr[i] = (byte) j;
                i++;
            } else if (j >= -2048 && j <= 2047) {
                bArr[i] = (byte) ((j >> 8) - 48);
                bArr[i + 1] = (byte) j;
                i += 2;
            } else if (j >= -262144 && j <= 262143) {
                B2(bArr, i, (int) j);
                i += 3;
            } else if (j < -2147483648L || j > 2147483647L) {
                bArr[i] = -66;
                A2(bArr, i + 1, j);
                i += 9;
            } else {
                bArr[i] = -65;
                y2(bArr, i + 1, (int) j);
                i += 5;
            }
        }
        this.i = i;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void R1(byte b) {
        int i = this.i;
        int i2 = i + 2;
        if (i2 - this.r.length > 0) {
            v2(i2);
        }
        byte[] bArr = this.r;
        bArr[i] = -67;
        bArr[i + 1] = b;
        this.i = i2;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void S1(q7h q7hVar) {
        if (q7hVar == null) {
            b2();
            return;
        }
        int i = this.i;
        int i2 = i + 8;
        v2(i2);
        byte[] bArr = this.r;
        bArr[i] = -88;
        p7h p7hVar = q7hVar.f26561a;
        int i3 = p7hVar.f25919a;
        bArr[i + 1] = (byte) (i3 >>> 8);
        bArr[i + 2] = (byte) i3;
        bArr[i + 3] = (byte) p7hVar.b;
        bArr[i + 4] = (byte) p7hVar.c;
        x9h x9hVar = q7hVar.b;
        bArr[i + 5] = x9hVar.f31233a;
        bArr[i + 6] = x9hVar.b;
        bArr[i + 7] = x9hVar.c;
        this.i = i2;
        L1(x9hVar.d);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void T1(long j) {
        int i = this.i;
        int i2 = i + 9;
        if (i2 >= this.r.length) {
            v2(i2);
        }
        byte[] bArr = this.r;
        if (j % 1000 == 0) {
            long j2 = j / 1000;
            if (j2 >= -2147483648L && j2 <= 2147483647L) {
                int i3 = (int) j2;
                bArr[i] = -84;
                bArr[i + 1] = (byte) (i3 >>> 24);
                bArr[i + 2] = (byte) (i3 >>> 16);
                bArr[i + 3] = (byte) (i3 >>> 8);
                bArr[i + 4] = (byte) i3;
                this.i = i + 5;
                return;
            } else if (j2 % 60 == 0) {
                long j3 = j2 / 60;
                if (j3 >= -2147483648L && j3 <= 2147483647L) {
                    int i4 = (int) j3;
                    bArr[i] = -83;
                    bArr[i + 1] = (byte) (i4 >>> 24);
                    bArr[i + 2] = (byte) (i4 >>> 16);
                    bArr[i + 3] = (byte) (i4 >>> 8);
                    bArr[i + 4] = (byte) i4;
                    this.i = i + 5;
                    return;
                }
            }
        }
        bArr[i] = -85;
        bArr[i + 1] = (byte) (j >>> 56);
        bArr[i + 2] = (byte) (j >>> 48);
        bArr[i + 3] = (byte) (j >>> 40);
        bArr[i + 4] = (byte) (j >>> 32);
        bArr[i + 5] = (byte) (j >>> 24);
        bArr[i + 6] = (byte) (j >>> 16);
        bArr[i + 7] = (byte) (j >>> 8);
        bArr[i + 8] = (byte) j;
        this.i = i2;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void W1(String str) {
        k2(str);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void Y1(byte[] bArr) {
        g2(bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    @Override // com.alibaba.fastjson2.JSONWriter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Z1(byte[] r9, long r10) {
        /*
            r8 = this;
            int r0 = r8.i
            int r1 = r9.length
            int r1 = r1 + r0
            int r1 = r1 + 2
            byte[] r2 = r8.r
            int r2 = r2.length
            if (r1 < r2) goto L_0x000e
            r8.v2(r1)
        L_0x000e:
            byte[] r1 = r8.r
            com.alibaba.fastjson2.JSONWriter$a r2 = r8.f2458a
            long r2 = r2.c
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNameAsSymbol
            long r4 = r4.mask
            long r2 = r2 & r4
            r4 = 0
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x0029
            int r10 = r9.length
            java.lang.System.arraycopy(r9, r6, r1, r0, r10)
            int r9 = r9.length
            int r0 = r0 + r9
            r8.i = r0
            return
        L_0x0029:
            tb.o6s r2 = r8.s
            if (r2 == 0) goto L_0x003e
            int r3 = r8.t
            int r10 = r2.e(r10, r3)
            int r11 = r8.t
            r2 = 1
            if (r10 == r11) goto L_0x0039
            goto L_0x0050
        L_0x0039:
            int r11 = r11 + r2
            r8.t = r11
        L_0x003c:
            r2 = 0
            goto L_0x0050
        L_0x003e:
            tb.o6s r2 = new tb.o6s
            r2.<init>()
            r8.s = r2
            int r3 = r8.t
            int r4 = r3 + 1
            r8.t = r4
            r2.d(r10, r3)
            r10 = r3
            goto L_0x003c
        L_0x0050:
            r11 = 47
            r3 = -16
            r4 = 127(0x7f, float:1.78E-43)
            if (r2 != 0) goto L_0x0074
            int r2 = r0 + 1
            r1[r0] = r4
            int r0 = r9.length
            java.lang.System.arraycopy(r9, r6, r1, r2, r0)
            int r9 = r9.length
            int r2 = r2 + r9
            r8.i = r2
            if (r10 < r3) goto L_0x0070
            if (r10 > r11) goto L_0x0070
            int r9 = r2 + 1
            r8.i = r9
            byte r9 = (byte) r10
            r1[r2] = r9
            goto L_0x0073
        L_0x0070:
            r8.L1(r10)
        L_0x0073:
            return
        L_0x0074:
            int r9 = -r10
            int r10 = r0 + 1
            r1[r0] = r4
            int r9 = -r9
            if (r9 < r3) goto L_0x0086
            if (r9 > r11) goto L_0x0086
            byte r9 = (byte) r9
            r1[r10] = r9
            int r0 = r0 + 2
            r8.i = r0
            goto L_0x008b
        L_0x0086:
            r8.i = r10
            r8.L1(r9)
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.k.Z1(byte[], long):void");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a2(char[] cArr) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void b2() {
        int i = this.i;
        if (i == this.r.length) {
            v2(i + 1);
        }
        byte[] bArr = this.r;
        int i2 = this.i;
        this.i = i2 + 1;
        bArr[i2] = -81;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void c1() {
        throw new JSONException("unsupported operation");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        byte[] bArr = this.r;
        if (bArr.length < 1048576) {
            JSONFactory.s.lazySet(this.q, bArr);
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void d1(int i) {
        boolean z;
        byte b;
        int i2 = this.i;
        if (i2 == this.r.length) {
            v2(i2 + 1);
        }
        byte[] bArr = this.r;
        if (i <= 15) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            b = (byte) (i + ErrorConstant.ERROR_GET_PROCESS_NULL);
        } else {
            b = -92;
        }
        bArr[i2] = b;
        this.i = i2 + 1;
        if (!z) {
            L1(i);
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void d2(byte b) {
        int i = this.i;
        if (i == this.r.length) {
            v2(i + 1);
        }
        byte[] bArr = this.r;
        int i2 = this.i;
        this.i = i2 + 1;
        bArr[i2] = b;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void e1() {
        int i = this.i;
        if (i == this.r.length) {
            v2(i + 1);
        }
        this.r[i] = -90;
        this.i = i + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void e2(char c) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void f1(JSONObject jSONObject) {
        if (jSONObject == null) {
            b2();
            return;
        }
        e1();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            j1(entry.getKey());
            j1(entry.getValue());
        }
        g();
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void f2(String str) {
        throw new JSONException("unsupported operation");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void g() {
        int i = this.i;
        if (i == this.r.length) {
            v2(i + 1);
        }
        this.r[i] = -91;
        this.i = i + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void g1(List list) {
        if (list == null) {
            k1();
            return;
        }
        int size = list.size();
        d1(size);
        for (int i = 0; i < size; i++) {
            j1(list.get(i));
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void g2(byte[] bArr) {
        int length = this.i + bArr.length;
        if (length - this.r.length > 0) {
            v2(length);
        }
        System.arraycopy(bArr, 0, this.r, this.i, bArr.length);
        this.i += bArr.length;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void h1(Map map) {
        if (map == null) {
            b2();
            return;
        }
        e1();
        for (Map.Entry entry : map.entrySet()) {
            j1(entry.getKey());
            j1(entry.getValue());
        }
        g();
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void i1(char c) {
        throw new JSONException("unsupported operation");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void i2(String str) {
        int i = this.i;
        if (i == this.r.length) {
            v2(i + 1);
        }
        byte[] bArr = this.r;
        int i2 = this.i;
        this.i = i2 + 1;
        bArr[i2] = -109;
        if (str == this.m) {
            k2("#-1");
        } else {
            k2(str);
        }
        this.m = str;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void j1(Object obj) {
        boolean z;
        if (obj == null) {
            b2();
            return;
        }
        JSONWriter.a aVar = this.f2458a;
        if ((aVar.c & JSONWriter.Feature.FieldBased.mask) != 0) {
            z = true;
        } else {
            z = false;
        }
        Class<?> cls = obj.getClass();
        iik k = aVar.f2459a.k(cls, cls, z);
        if (f0()) {
            k.l(this, obj, null, null, 0L);
        } else {
            k.e(this, obj, null, null, 0L);
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void k1() {
        int i = this.i;
        if (i == this.r.length) {
            v2(i + 1);
        }
        if ((this.f2458a.c & (JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullListAsEmpty.mask)) != 0) {
            byte[] bArr = this.r;
            int i2 = this.i;
            this.i = i2 + 1;
            bArr[i2] = -108;
            return;
        }
        byte[] bArr2 = this.r;
        int i3 = this.i;
        this.i = i3 + 1;
        bArr2[i3] = -81;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void k2(String str) {
        if (str == null) {
            b2();
        } else {
            G2(str.toCharArray());
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void l1(byte[] bArr) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void l2(List<String> list) {
        if (list == null) {
            k1();
            return;
        }
        int size = list.size();
        d1(size);
        for (int i = 0; i < size; i++) {
            k2(list.get(i));
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void m1(BigInteger bigInteger, long j) {
        if (bigInteger == null) {
            b2();
        } else if (x2(bigInteger)) {
            int i = this.i;
            if (i == this.r.length) {
                v2(i + 1);
            }
            byte[] bArr = this.r;
            int i2 = this.i;
            this.i = i2 + 1;
            bArr[i2] = -70;
            O1(bigInteger.longValue());
        } else {
            byte[] byteArray = bigInteger.toByteArray();
            v2(this.i + 5 + byteArray.length);
            byte[] bArr2 = this.r;
            int i3 = this.i;
            this.i = i3 + 1;
            bArr2[i3] = -69;
            L1(byteArray.length);
            System.arraycopy(byteArray, 0, this.r, this.i, byteArray.length);
            this.i += byteArray.length;
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void m2(char[] cArr, int i, int i2) {
        boolean z;
        int i3;
        if (cArr == null) {
            b2();
            return;
        }
        if (i2 < 47) {
            int i4 = this.i;
            int i5 = i4 + 1 + i2;
            if (i5 - this.r.length > 0) {
                v2(i5);
            }
            byte[] bArr = this.r;
            int i6 = this.i;
            this.i = i6 + 1;
            bArr[i6] = (byte) (i2 + 73);
            int i7 = i;
            while (true) {
                if (i7 >= i2) {
                    z = true;
                    break;
                }
                char c = cArr[i7];
                if (c > 255) {
                    z = false;
                    break;
                }
                byte[] bArr2 = this.r;
                int i8 = this.i;
                this.i = i8 + 1;
                bArr2[i8] = (byte) c;
                i7++;
            }
            if (!z) {
                this.i = i4;
            } else {
                return;
            }
        } else {
            z = true;
        }
        int length = cArr.length & (-4);
        while (i < length) {
            char c2 = cArr[i];
            char c3 = cArr[i + 1];
            char c4 = cArr[i + 2];
            char c5 = cArr[i + 3];
            if (c2 > 255 || c3 > 255 || c4 > 255 || c5 > 255) {
                z = false;
                break;
            }
            i += 4;
        }
        if (z) {
            while (true) {
                if (i >= cArr.length) {
                    break;
                } else if (cArr[i] > 255) {
                    z = false;
                    break;
                } else {
                    i++;
                }
            }
        }
        if (z) {
            i3 = i2;
        } else {
            i3 = i2 * 3;
        }
        int i9 = i3 + this.i + 6;
        if (i9 - this.r.length > 0) {
            v2(i9);
        }
        if (z) {
            if (i2 <= 47) {
                byte[] bArr3 = this.r;
                int i10 = this.i;
                this.i = i10 + 1;
                bArr3[i10] = (byte) (i2 + 73);
            } else if (i2 <= 2047) {
                byte[] bArr4 = this.r;
                int i11 = this.i;
                int i12 = i11 + 1;
                this.i = i12;
                bArr4[i11] = 121;
                int i13 = i11 + 2;
                this.i = i13;
                bArr4[i12] = (byte) ((i2 >> 8) + 56);
                this.i = i11 + 3;
                bArr4[i13] = (byte) i2;
            } else {
                byte[] bArr5 = this.r;
                int i14 = this.i;
                this.i = i14 + 1;
                bArr5[i14] = 121;
                L1(i2);
            }
            for (char c6 : cArr) {
                byte[] bArr6 = this.r;
                int i15 = this.i;
                this.i = i15 + 1;
                bArr6[i15] = (byte) c6;
            }
            return;
        }
        int length2 = cArr.length * 3;
        int E2 = E2(length2);
        v2(this.i + length2 + E2 + 1);
        int d = ((b2d.d(cArr, 0, cArr.length, this.r, (this.i + E2) + 1) - this.i) - E2) - 1;
        int E22 = E2(d);
        if (E2 != E22) {
            byte[] bArr7 = this.r;
            int i16 = this.i;
            System.arraycopy(bArr7, E2 + i16 + 1, bArr7, i16 + E22 + 1, d);
        }
        byte[] bArr8 = this.r;
        int i17 = this.i;
        int i18 = i17 + 1;
        this.i = i18;
        bArr8[i17] = 122;
        if (d >= -16 && d <= 47) {
            this.i = i17 + 2;
            bArr8[i18] = (byte) d;
        } else if (d < -2048 || d > 2047) {
            L1(d);
        } else {
            int i19 = i17 + 2;
            this.i = i19;
            bArr8[i18] = (byte) ((d >> 8) + 56);
            this.i = i17 + 3;
            bArr8[i19] = (byte) d;
        }
        this.i += d;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void n1(byte[] bArr) {
        if (bArr == null) {
            b2();
            return;
        }
        v2(this.i + 6 + bArr.length);
        byte[] bArr2 = this.r;
        int i = this.i;
        this.i = i + 1;
        bArr2[i] = -111;
        L1(bArr.length);
        System.arraycopy(bArr, 0, this.r, this.i, bArr.length);
        this.i += bArr.length;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void n2(char[] cArr, int i, int i2, boolean z) {
        if (cArr == null) {
            b2();
            return;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (cArr[i3 + i] > 255) {
                k2(new String(cArr, i, i2));
                return;
            }
        }
        if (i2 <= 47) {
            byte[] bArr = this.r;
            int i4 = this.i;
            this.i = i4 + 1;
            bArr[i4] = (byte) (i2 + 73);
        } else {
            byte[] bArr2 = this.r;
            int i5 = this.i;
            this.i = i5 + 1;
            bArr2[i5] = 121;
            L1(i2);
        }
        for (int i6 = 0; i6 < i2; i6++) {
            byte[] bArr3 = this.r;
            int i7 = this.i;
            this.i = i7 + 1;
            bArr3[i7] = (byte) cArr[i + i6];
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void o1(boolean z) {
        byte b;
        int i = this.i;
        if (i == this.r.length) {
            v2(i + 1);
        }
        byte[] bArr = this.r;
        int i2 = this.i;
        this.i = i2 + 1;
        if (z) {
            b = -79;
        } else {
            b = -80;
        }
        bArr[i2] = b;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void o2(String[] strArr) {
        if (strArr == null) {
            k1();
            return;
        }
        d1(strArr.length);
        for (String str : strArr) {
            if (str != null) {
                k2(str);
            } else if (i0(JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullStringAsEmpty.mask)) {
                k2("");
            } else {
                b2();
            }
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void p1(boolean[] zArr) {
        if (zArr == null) {
            b2();
            return;
        }
        d1(zArr.length);
        for (boolean z : zArr) {
            o1(z);
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void p2() {
        int i = this.i;
        if (i == this.r.length) {
            v2(i + 1);
        }
        byte[] bArr = this.r;
        int i2 = this.i;
        this.i = i2 + 1;
        bArr[i2] = -81;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void q2(int i) {
        int i2 = this.i + 3;
        if (i2 >= this.r.length) {
            v2(i2);
        }
        byte[] bArr = this.r;
        int i3 = this.i;
        int i4 = i3 + 1;
        this.i = i4;
        bArr[i3] = Byte.MAX_VALUE;
        if (i >= -16 && i <= 47) {
            this.i = i3 + 2;
            bArr[i4] = (byte) i;
        } else if (i < -2048 || i > 2047) {
            L1(i);
        } else {
            int i5 = i3 + 2;
            this.i = i5;
            bArr[i4] = (byte) ((i >> 8) + 56);
            this.i = i3 + 3;
            bArr[i5] = (byte) i;
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void r1(char c) {
        int i = this.i;
        if (i == this.r.length) {
            v2(i + 1);
        }
        byte[] bArr = this.r;
        int i2 = this.i;
        this.i = i2 + 1;
        bArr[i2] = -112;
        L1(c);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void r2(String str) {
        if (str == null) {
            b2();
        } else {
            k2(str);
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void s1() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void s2(String str) {
        int i;
        int i2 = this.i;
        if (i2 == this.r.length) {
            v2(i2 + 1);
        }
        byte[] bArr = this.r;
        int i3 = this.i;
        this.i = i3 + 1;
        bArr[i3] = -110;
        long a2 = ls9.a(str);
        o6s o6sVar = this.s;
        if (o6sVar != null) {
            i = o6sVar.a(a2);
        } else {
            i = -1;
        }
        if (i == -1) {
            if (this.s == null) {
                this.s = new o6s();
            }
            o6s o6sVar2 = this.s;
            int i4 = this.t;
            this.t = i4 + 1;
            o6sVar2.d(a2, i4);
            k2(str);
            L1(i4);
            return;
        }
        int i5 = this.i;
        if (i5 == this.r.length) {
            v2(i5 + 1);
        }
        L1(i);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void t1() {
        throw new JSONException("unsupported operation");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    @Override // com.alibaba.fastjson2.JSONWriter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean t2(byte[] r9, long r10) {
        /*
            r8 = this;
            long r0 = r8.u
            r2 = 1
            r3 = 0
            int r4 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r4 != 0) goto L_0x000b
            r10 = 0
        L_0x0009:
            r11 = 1
            goto L_0x0043
        L_0x000b:
            tb.o6s r0 = r8.s
            if (r0 == 0) goto L_0x001f
            int r1 = r8.t
            int r10 = r0.e(r10, r1)
            int r11 = r8.t
            if (r10 == r11) goto L_0x001a
            goto L_0x0009
        L_0x001a:
            int r11 = r11 + r2
            r8.t = r11
        L_0x001d:
            r11 = 0
            goto L_0x0043
        L_0x001f:
            int r0 = r8.t
            int r1 = r0 + 1
            r8.t = r1
            if (r0 != 0) goto L_0x0029
            r8.u = r10
        L_0x0029:
            if (r0 != 0) goto L_0x003a
            com.alibaba.fastjson2.JSONWriter$a r1 = r8.f2458a
            long r4 = r1.c
            com.alibaba.fastjson2.JSONWriter$Feature r1 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNameAsSymbol
            long r6 = r1.mask
            long r4 = r4 & r6
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x0041
        L_0x003a:
            tb.o6s r1 = new tb.o6s
            r1.<init>(r10, r0)
            r8.s = r1
        L_0x0041:
            r10 = r0
            goto L_0x001d
        L_0x0043:
            if (r11 == 0) goto L_0x004a
            int r9 = -r10
            r8.H2(r9)
            return r3
        L_0x004a:
            int r11 = r8.i
            int r0 = r11 + 2
            int r1 = r9.length
            int r0 = r0 + r1
            byte[] r1 = r8.r
            int r1 = r1.length
            if (r0 <= r1) goto L_0x0058
            r8.v2(r0)
        L_0x0058:
            byte[] r0 = r8.r
            int r1 = r11 + 1
            r4 = -110(0xffffffffffffff92, float:NaN)
            r0[r11] = r4
            int r11 = r9.length
            java.lang.System.arraycopy(r9, r3, r0, r1, r11)
            int r9 = r9.length
            int r1 = r1 + r9
            r9 = -16
            if (r10 < r9) goto L_0x0075
            r9 = 47
            if (r10 > r9) goto L_0x0075
            byte r9 = (byte) r10
            r0[r1] = r9
            int r1 = r1 + r2
            r8.i = r1
            goto L_0x007a
        L_0x0075:
            r8.i = r1
            r8.L1(r10)
        L_0x007a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.k.t2(byte[], long):boolean");
    }

    public String toString() {
        if (this.r.length == 0) {
            return "<empty>";
        }
        JSONReader N1 = JSONReader.N1(w());
        JSONWriter T0 = JSONWriter.T0();
        try {
            T0.j1(N1.T1());
            return T0.toString();
        } catch (Exception unused) {
            return yqf.b(this.r[0]) + ", bytes length " + this.i;
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void u1(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = this.i;
        int i8 = i7 + 8;
        v2(i8);
        byte[] bArr = this.r;
        bArr[i7] = -88;
        bArr[i7 + 1] = (byte) (i >>> 8);
        bArr[i7 + 2] = (byte) i;
        bArr[i7 + 3] = (byte) i2;
        bArr[i7 + 4] = (byte) i3;
        bArr[i7 + 5] = (byte) i4;
        bArr[i7 + 6] = (byte) i5;
        bArr[i7 + 7] = (byte) i6;
        this.i = i8;
        L1(0);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void u2(UUID uuid) {
        if (uuid == null) {
            b2();
            return;
        }
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        int i = this.i;
        int i2 = i + 18;
        v2(i2);
        byte[] bArr = this.r;
        bArr[i] = -111;
        bArr[i + 1] = 16;
        bArr[i + 2] = (byte) (mostSignificantBits >>> 56);
        bArr[i + 3] = (byte) (mostSignificantBits >>> 48);
        bArr[i + 4] = (byte) (mostSignificantBits >>> 40);
        bArr[i + 5] = (byte) (mostSignificantBits >>> 32);
        bArr[i + 6] = (byte) (mostSignificantBits >>> 24);
        bArr[i + 7] = (byte) (mostSignificantBits >>> 16);
        bArr[i + 8] = (byte) (mostSignificantBits >>> 8);
        bArr[i + 9] = (byte) mostSignificantBits;
        bArr[i + 10] = (byte) (leastSignificantBits >>> 56);
        bArr[i + 11] = (byte) (leastSignificantBits >>> 48);
        bArr[i + 12] = (byte) (leastSignificantBits >>> 40);
        bArr[i + 13] = (byte) (leastSignificantBits >>> 32);
        bArr[i + 14] = (byte) (leastSignificantBits >>> 24);
        bArr[i + 15] = (byte) (leastSignificantBits >>> 16);
        bArr[i + 16] = (byte) (leastSignificantBits >>> 8);
        bArr[i + 17] = (byte) leastSignificantBits;
        this.i = i2;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void v1(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = this.i;
        int i8 = i7 + 8;
        v2(i8);
        byte[] bArr = this.r;
        bArr[i7] = -88;
        bArr[i7 + 1] = (byte) (i >>> 8);
        bArr[i7 + 2] = (byte) i;
        bArr[i7 + 3] = (byte) i2;
        bArr[i7 + 4] = (byte) i3;
        bArr[i7 + 5] = (byte) i4;
        bArr[i7 + 6] = (byte) i5;
        bArr[i7 + 7] = (byte) i6;
        this.i = i8;
        L1(0);
    }

    public void v2(int i) {
        byte[] bArr = this.r;
        if (i >= bArr.length) {
            int length = bArr.length;
            int i2 = length + (length >> 1);
            if (i2 - i >= 0) {
                i = i2;
            }
            if (i <= this.g) {
                this.r = Arrays.copyOf(bArr, i);
                return;
            }
            throw new OutOfMemoryError();
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public byte[] w() {
        return Arrays.copyOf(this.r, this.i);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void w1(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        throw new JSONException("unsupported operation");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDouble(double d) {
        if (d == vu3.b.GEO_NOT_SUPPORT) {
            v2(this.i + 1);
            byte[] bArr = this.r;
            int i = this.i;
            this.i = i + 1;
            bArr[i] = -78;
        } else if (d == 1.0d) {
            v2(this.i + 1);
            byte[] bArr2 = this.r;
            int i2 = this.i;
            this.i = i2 + 1;
            bArr2[i2] = -77;
        } else {
            if (d >= -2.147483648E9d && d <= 2.147483647E9d) {
                long j = (long) d;
                if (j == d) {
                    v2(this.i + 1);
                    byte[] bArr3 = this.r;
                    int i3 = this.i;
                    this.i = i3 + 1;
                    bArr3[i3] = -76;
                    O1(j);
                    return;
                }
            }
            int i4 = this.i;
            int i5 = i4 + 9;
            v2(i5);
            byte[] bArr4 = this.r;
            bArr4[i4] = -75;
            long doubleToLongBits = Double.doubleToLongBits(d);
            bArr4[i4 + 1] = (byte) (doubleToLongBits >>> 56);
            bArr4[i4 + 2] = (byte) (doubleToLongBits >>> 48);
            bArr4[i4 + 3] = (byte) (doubleToLongBits >>> 40);
            bArr4[i4 + 4] = (byte) (doubleToLongBits >>> 32);
            bArr4[i4 + 5] = (byte) (doubleToLongBits >>> 24);
            bArr4[i4 + 6] = (byte) (doubleToLongBits >>> 16);
            bArr4[i4 + 7] = (byte) (doubleToLongBits >>> 8);
            bArr4[i4 + 8] = (byte) doubleToLongBits;
            this.i = i5;
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeFloat(float f) {
        int i = this.i;
        int i2 = i + 5;
        if (i2 >= this.r.length) {
            v2(i2);
        }
        byte[] bArr = this.r;
        int i3 = (int) f;
        if (i3 != f || f < -262144.0f || f > 262143.0f) {
            bArr[i] = -73;
            y2(bArr, i + 1, Float.floatToIntBits(f));
        } else {
            bArr[i] = -74;
            i2 = i + F2(bArr, i + 1, i3) + 1;
        }
        this.i = i2;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void x1(int i, int i2, int i3) {
        throw new JSONException("unsupported operation");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void y1(int i, int i2, int i3) {
        int i4 = this.i;
        int i5 = i4 + 5;
        v2(i5);
        byte[] bArr = this.r;
        bArr[i4] = -87;
        bArr[i4 + 1] = (byte) (i >>> 8);
        bArr[i4 + 2] = (byte) i;
        bArr[i4 + 3] = (byte) i2;
        bArr[i4 + 4] = (byte) i3;
        this.i = i5;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void z1(BigDecimal bigDecimal, long j, DecimalFormat decimalFormat) {
        if (bigDecimal == null) {
            b2();
            return;
        }
        int scale = bigDecimal.scale();
        BigInteger unscaledValue = bigDecimal.unscaledValue();
        if (scale != 0 || !x2(unscaledValue)) {
            v2(this.i + 1);
            byte[] bArr = this.r;
            int i = this.i;
            this.i = i + 1;
            bArr[i] = -71;
            L1(scale);
            if (w2(unscaledValue)) {
                L1(unscaledValue.intValue());
            } else if (x2(unscaledValue)) {
                O1(unscaledValue.longValue());
            } else {
                m1(unscaledValue, 0L);
            }
        } else {
            v2(this.i + 1);
            byte[] bArr2 = this.r;
            int i2 = this.i;
            this.i = i2 + 1;
            bArr2[i2] = -72;
            O1(unscaledValue.longValue());
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void e() {
    }
}
