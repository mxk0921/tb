package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONWriter;
import com.taobao.tao.shop.common.ShopConstants;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import tb.b2d;
import tb.f7l;
import tb.ohh;
import tb.ot7;
import tb.p7h;
import tb.q7h;
import tb.tck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class m extends JSONWriter {
    public static final byte[] s = "{\"$ref\":".getBytes(StandardCharsets.ISO_8859_1);
    public final JSONFactory.CacheItem q;
    public byte[] r;

    public m(JSONWriter.a aVar) {
        super(aVar, null, false, StandardCharsets.UTF_8);
        int identityHashCode = System.identityHashCode(Thread.currentThread());
        JSONFactory.CacheItem[] cacheItemArr = JSONFactory.q;
        JSONFactory.CacheItem cacheItem = cacheItemArr[identityHashCode & (cacheItemArr.length - 1)];
        this.q = cacheItem;
        byte[] andSet = JSONFactory.s.getAndSet(cacheItem, null);
        this.r = andSet == null ? new byte[8192] : andSet;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void B1(double[] dArr) {
        boolean z;
        if (dArr == null) {
            b2();
            return;
        }
        if ((this.f2458a.c & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
            z = true;
        } else {
            z = false;
        }
        int i = this.i;
        int length = (dArr.length * 27) + i + 1;
        if (length >= this.r.length) {
            v2(length);
        }
        byte[] bArr = this.r;
        int i2 = i + 1;
        bArr[i] = 91;
        for (int i3 = 0; i3 < dArr.length; i3++) {
            if (i3 != 0) {
                bArr[i2] = 44;
                i2++;
            }
            if (z) {
                bArr[i2] = 34;
                i2++;
            }
            i2 += ot7.b(dArr[i3], bArr, i2, true);
            if (z) {
                bArr[i2] = 34;
                i2++;
            }
        }
        bArr[i2] = 93;
        this.i = i2 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void F1(float[] fArr) {
        boolean z;
        int i;
        if (fArr == null) {
            k1();
            return;
        }
        if ((this.f2458a.c & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
            z = true;
        } else {
            z = false;
        }
        int i2 = this.i;
        int length = fArr.length;
        if (z) {
            i = 16;
        } else {
            i = 18;
        }
        int i3 = (length * i) + i2 + 1;
        if (i3 >= this.r.length) {
            v2(i3);
        }
        byte[] bArr = this.r;
        int i4 = i2 + 1;
        bArr[i2] = 91;
        for (int i5 = 0; i5 < fArr.length; i5++) {
            if (i5 != 0) {
                bArr[i4] = 44;
                i4++;
            }
            if (z) {
                bArr[i4] = 34;
                i4++;
            }
            i4 += ot7.d(fArr[i5], bArr, i4, true);
            if (z) {
                bArr[i4] = 34;
                i4++;
            }
        }
        bArr[i4] = 93;
        this.i = i4 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void H1(byte[] bArr) {
        int i;
        if (bArr == null) {
            b2();
            return;
        }
        int i2 = this.i;
        v2((bArr.length * 2) + 3 + i2 + 2);
        byte[] bArr2 = this.r;
        bArr2[i2] = 120;
        bArr2[i2 + 1] = 39;
        int i3 = i2 + 2;
        for (byte b : bArr) {
            int i4 = (b & 255) >> 4;
            int i5 = b & 15;
            int i6 = 55;
            if (i4 < 10) {
                i = 48;
            } else {
                i = 55;
            }
            bArr2[i3] = (byte) (i4 + i);
            int i7 = i3 + 1;
            if (i5 < 10) {
                i6 = 48;
            }
            bArr2[i7] = (byte) (i5 + i6);
            i3 += 2;
        }
        bArr2[i3] = 39;
        this.i = i3 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void J1(short s2) {
        boolean z;
        if ((this.f2458a.c & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
            z = true;
        } else {
            z = false;
        }
        int i = this.i;
        int i2 = i + 7;
        if (i2 >= this.r.length) {
            v2(i2);
        }
        byte[] bArr = this.r;
        char c = this.f;
        if (z) {
            bArr[i] = (byte) c;
            i++;
        }
        int l = b2d.l(bArr, i, s2);
        if (z) {
            bArr[l] = (byte) c;
            l++;
        }
        this.i = l;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void L1(int i) {
        boolean z;
        if ((this.f2458a.c & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
            z = true;
        } else {
            z = false;
        }
        int i2 = this.i;
        int i3 = i2 + 13;
        if (i3 >= this.r.length) {
            v2(i3);
        }
        byte[] bArr = this.r;
        char c = this.f;
        if (z) {
            bArr[i2] = (byte) c;
            i2++;
        }
        int l = b2d.l(bArr, i2, i);
        if (z) {
            bArr[l] = (byte) c;
            l++;
        }
        this.i = l;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void N1(int[] iArr) {
        boolean z;
        if (iArr == null) {
            b2();
            return;
        }
        if ((this.f2458a.c & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
            z = true;
        } else {
            z = false;
        }
        int i = this.i;
        int length = (iArr.length * 13) + i + 2;
        if (length >= this.r.length) {
            v2(length);
        }
        byte[] bArr = this.r;
        int i2 = i + 1;
        bArr[i] = 91;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (i3 != 0) {
                bArr[i2] = 44;
                i2++;
            }
            char c = this.f;
            if (z) {
                bArr[i2] = (byte) c;
                i2++;
            }
            i2 = b2d.l(bArr, i2, iArr[i3]);
            if (z) {
                bArr[i2] = (byte) c;
                i2++;
            }
        }
        bArr[i2] = 93;
        this.i = i2 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void O1(long j) {
        boolean z;
        int i;
        long j2 = this.f2458a.c;
        if (((JSONWriter.Feature.WriteNonStringValueAsString.mask | JSONWriter.Feature.WriteLongAsString.mask) & j2) != 0 || ((JSONWriter.Feature.BrowserCompatible.mask & j2) != 0 && (j > 9007199254740991L || j < -9007199254740991L))) {
            z = true;
        } else {
            z = false;
        }
        int i2 = this.i;
        int i3 = i2 + 23;
        if (i3 >= this.r.length) {
            v2(i3);
        }
        byte[] bArr = this.r;
        char c = this.f;
        if (z) {
            bArr[i2] = (byte) c;
            i2++;
        }
        int n = b2d.n(bArr, i2, j);
        if (z) {
            i = n + 1;
            bArr[n] = (byte) c;
        } else {
            if ((JSONWriter.Feature.WriteClassName.mask & j2) != 0 && (j2 & JSONWriter.Feature.NotWriteNumberClassName.mask) == 0 && j >= -2147483648L && j <= 2147483647L) {
                i = n + 1;
                bArr[n] = 76;
            }
            this.i = n;
        }
        n = i;
        this.i = n;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void P1(long[] jArr) {
        boolean z;
        boolean z2;
        boolean z3;
        if (jArr == null) {
            b2();
            return;
        }
        long j = this.f2458a.c;
        if ((JSONWriter.Feature.BrowserCompatible.mask & j) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((j & (JSONWriter.Feature.WriteNonStringValueAsString.mask | JSONWriter.Feature.WriteLongAsString.mask)) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i = this.i;
        int length = i + 2 + (jArr.length * 23);
        if (length >= this.r.length) {
            v2(length);
        }
        byte[] bArr = this.r;
        int i2 = i + 1;
        bArr[i] = 91;
        for (int i3 = 0; i3 < jArr.length; i3++) {
            if (i3 != 0) {
                bArr[i2] = 44;
                i2++;
            }
            long j2 = jArr[i3];
            if (z2 || (z && j2 <= 9007199254740991L && j2 >= -9007199254740991L)) {
                z3 = true;
            } else {
                z3 = false;
            }
            char c = this.f;
            if (z3) {
                bArr[i2] = (byte) c;
                i2++;
            }
            i2 = b2d.n(bArr, i2, j2);
            if (z3) {
                bArr[i2] = (byte) c;
                i2++;
            }
        }
        bArr[i2] = 93;
        this.i = i2 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void R1(byte b) {
        boolean z;
        if ((this.f2458a.c & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
            z = true;
        } else {
            z = false;
        }
        int i = this.i;
        int i2 = i + 5;
        if (i2 >= this.r.length) {
            v2(i2);
        }
        byte[] bArr = this.r;
        char c = this.f;
        if (z) {
            bArr[i] = (byte) c;
            i++;
        }
        int l = b2d.l(bArr, i, b);
        if (z) {
            bArr[l] = (byte) c;
            l++;
        }
        this.i = l;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void S1(q7h q7hVar) {
        int i = this.i;
        int i2 = i + 38;
        if (i2 >= this.r.length) {
            v2(i2);
        }
        byte[] bArr = this.r;
        int i3 = i + 1;
        byte b = (byte) this.f;
        bArr[i] = b;
        p7h p7hVar = q7hVar.f26561a;
        int p = b2d.p(bArr, i3, p7hVar.f25919a, p7hVar.b, p7hVar.c);
        bArr[p] = 32;
        int r = b2d.r(bArr, p + 1, q7hVar.b);
        bArr[r] = b;
        this.i = r + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void Y1(byte[] bArr) {
        int i = this.i;
        int length = bArr.length + i + 2 + this.o;
        if (length >= this.r.length) {
            v2(length);
        }
        if (this.h) {
            this.h = false;
        } else {
            byte[] bArr2 = this.r;
            int i2 = i + 1;
            bArr2[i] = 44;
            if (this.n) {
                i += 2;
                bArr2[i2] = 10;
                int i3 = 0;
                while (i3 < this.o) {
                    bArr2[i] = 9;
                    i3++;
                    i++;
                }
            } else {
                i = i2;
            }
        }
        System.arraycopy(bArr, 0, this.r, i, bArr.length);
        this.i = i + bArr.length;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a2(char[] cArr) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void c1() {
        int i;
        int i2 = this.i;
        boolean z = this.n;
        if (z) {
            i = this.o + 3;
        } else {
            i = 1;
        }
        int i3 = i + i2;
        if (i3 >= this.r.length) {
            v2(i3);
        }
        byte[] bArr = this.r;
        int i4 = i2 + 1;
        bArr[i2] = 91;
        if (z) {
            this.o++;
            int i5 = i2 + 2;
            bArr[i4] = 10;
            int i6 = 0;
            while (true) {
                i4 = i5;
                if (i6 >= this.o) {
                    break;
                }
                i5 = i4 + 1;
                bArr[i4] = 9;
                i6++;
            }
        }
        this.i = i4;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        byte[] bArr = this.r;
        if (bArr.length <= 1048576) {
            JSONFactory.s.lazySet(this.q, bArr);
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void e() {
        int i;
        int i2 = this.i;
        boolean z = this.n;
        if (z) {
            i = this.o + 3;
        } else {
            i = 1;
        }
        int i3 = i + i2;
        if (i3 >= this.r.length) {
            v2(i3);
        }
        byte[] bArr = this.r;
        if (z) {
            this.o--;
            bArr[i2] = 10;
            i2++;
            int i4 = 0;
            while (i4 < this.o) {
                bArr[i2] = 9;
                i4++;
                i2++;
            }
        }
        bArr[i2] = 93;
        this.i = i2 + 1;
        this.h = false;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void e1() {
        int i;
        this.h = true;
        int i2 = this.i;
        boolean z = this.n;
        if (z) {
            i = this.o + 3;
        } else {
            i = 1;
        }
        int i3 = i + i2;
        if (i3 >= this.r.length) {
            v2(i3);
        }
        byte[] bArr = this.r;
        int i4 = i2 + 1;
        bArr[i2] = 123;
        if (z) {
            this.o++;
            int i5 = i2 + 2;
            bArr[i4] = 10;
            int i6 = 0;
            while (true) {
                i4 = i5;
                if (i6 >= this.o) {
                    break;
                }
                i5 = i4 + 1;
                bArr[i4] = 9;
                i6++;
            }
        }
        this.i = i4;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void f1(JSONObject jSONObject) {
        if (jSONObject == null) {
            b2();
            return;
        }
        long j = JSONWriter.Feature.ReferenceDetection.mask | JSONWriter.Feature.PrettyFormat.mask | JSONWriter.Feature.NotWriteEmptyArray.mask | JSONWriter.Feature.NotWriteDefaultValue.mask;
        JSONWriter.a aVar = this.f2458a;
        if ((j & aVar.c) != 0) {
            aVar.e(jSONObject.getClass()).y(this, jSONObject, null, null, 0L);
            return;
        }
        int i = this.i;
        if (i == this.r.length) {
            v2(i + 1);
        }
        byte[] bArr = this.r;
        int i2 = this.i;
        this.i = i2 + 1;
        bArr[i2] = 123;
        boolean z = true;
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            Object value = entry.getValue();
            if (!z) {
                int i3 = this.i;
                if (i3 == this.r.length) {
                    v2(i3 + 1);
                }
                if (value != null && (aVar.c & JSONWriter.Feature.WriteMapNullValue.mask) == 0) {
                    byte[] bArr2 = this.r;
                    int i4 = this.i;
                    this.i = i4 + 1;
                    bArr2[i4] = 44;
                }
            }
            if (value != null || (aVar.c & JSONWriter.Feature.WriteMapNullValue.mask) != 0) {
                String key = entry.getKey();
                if (key instanceof String) {
                    k2(key);
                } else {
                    j1(key);
                }
                int i5 = this.i;
                if (i5 == this.r.length) {
                    v2(i5 + 1);
                }
                byte[] bArr3 = this.r;
                int i6 = this.i;
                this.i = i6 + 1;
                bArr3[i6] = 58;
                if (value == null) {
                    b2();
                } else {
                    Class<?> cls = value.getClass();
                    if (cls == String.class) {
                        k2((String) value);
                    } else if (cls == Integer.class) {
                        L1(((Integer) value).intValue());
                    } else if (cls == Long.class) {
                        O1(((Long) value).longValue());
                    } else if (cls == Boolean.class) {
                        o1(((Boolean) value).booleanValue());
                    } else if (cls == BigDecimal.class) {
                        z1((BigDecimal) value, 0L, null);
                    } else if (cls == JSONArray.class) {
                        g1((JSONArray) value);
                    } else if (cls == JSONObject.class) {
                        f1((JSONObject) value);
                    } else {
                        aVar.f(cls, cls).y(this, value, null, null, 0L);
                    }
                }
                z = false;
            }
        }
        int i7 = this.i;
        if (i7 == this.r.length) {
            v2(i7 + 1);
        }
        byte[] bArr4 = this.r;
        int i8 = this.i;
        this.i = i8 + 1;
        bArr4[i8] = 125;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void f2(String str) {
        int i;
        int i2;
        char[] charArray = str.toCharArray();
        int i3 = this.i;
        int length = (charArray.length * 3) + i3;
        if (length >= this.r.length) {
            v2(length);
        }
        byte[] bArr = this.r;
        for (char c : charArray) {
            if (c < 1 || c > 127) {
                if (c > 2047) {
                    bArr[i3] = (byte) (((c >> '\f') & 15) | 224);
                    bArr[i3 + 1] = (byte) (((c >> 6) & 63) | 128);
                    i = i3 + 2;
                } else {
                    bArr[i3] = (byte) (((c >> 6) & 31) | tck.DETECT_WIDTH);
                    i = i3 + 1;
                }
                i2 = i + 1;
                bArr[i] = (byte) ((c & f7l.CONDITION_IF) | 128);
            } else {
                i2 = i3 + 1;
                bArr[i3] = (byte) c;
            }
            i3 = i2;
        }
        this.i = i3;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void g() {
        int i;
        int i2 = this.i;
        boolean z = this.n;
        if (z) {
            i = this.o + 3;
        } else {
            i = 1;
        }
        int i3 = i + i2;
        if (i3 >= this.r.length) {
            v2(i3);
        }
        byte[] bArr = this.r;
        if (z) {
            this.o--;
            bArr[i2] = 10;
            i2++;
            int i4 = 0;
            while (i4 < this.o) {
                bArr[i2] = 9;
                i4++;
                i2++;
            }
        }
        bArr[i2] = 125;
        this.i = i2 + 1;
        this.h = false;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void g1(List list) {
        if (list == null) {
            k1();
            return;
        }
        JSONWriter.a aVar = this.f2458a;
        if (((JSONWriter.Feature.ReferenceDetection.mask | JSONWriter.Feature.PrettyFormat.mask | JSONWriter.Feature.NotWriteEmptyArray.mask | JSONWriter.Feature.NotWriteDefaultValue.mask) & aVar.c) != 0) {
            aVar.e(list.getClass()).y(this, list, null, null, 0L);
            return;
        }
        int i = this.i;
        if (i == this.r.length) {
            v2(i + 1);
        }
        byte[] bArr = this.r;
        int i2 = this.i;
        this.i = i2 + 1;
        bArr[i2] = 91;
        int size = list.size();
        boolean z = true;
        int i3 = 0;
        while (i3 < size) {
            if (!z) {
                int i4 = this.i;
                if (i4 == this.r.length) {
                    v2(i4 + 1);
                }
                byte[] bArr2 = this.r;
                int i5 = this.i;
                this.i = i5 + 1;
                bArr2[i5] = 44;
            }
            Object obj = list.get(i3);
            if (obj == null) {
                b2();
            } else {
                Class<?> cls = obj.getClass();
                if (cls == String.class) {
                    k2((String) obj);
                } else if (cls == Integer.class) {
                    L1(((Integer) obj).intValue());
                } else if (cls == Long.class) {
                    O1(((Long) obj).longValue());
                } else if (cls == Boolean.class) {
                    o1(((Boolean) obj).booleanValue());
                } else if (cls == BigDecimal.class) {
                    z1((BigDecimal) obj, 0L, null);
                } else if (cls == JSONArray.class) {
                    g1((JSONArray) obj);
                } else if (cls == JSONObject.class) {
                    f1((JSONObject) obj);
                } else {
                    aVar.f(cls, cls).y(this, obj, null, null, 0L);
                }
            }
            i3++;
            z = false;
        }
        int i6 = this.i;
        if (i6 == this.r.length) {
            v2(i6 + 1);
        }
        byte[] bArr3 = this.r;
        int i7 = this.i;
        this.i = i7 + 1;
        bArr3[i7] = 93;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void g2(byte[] bArr) {
        int length = this.i + bArr.length;
        if (length >= this.r.length) {
            v2(length);
        }
        System.arraycopy(bArr, 0, this.r, this.i, bArr.length);
        this.i += bArr.length;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void i1(char c) {
        int i = this.i;
        if (i == this.r.length) {
            v2(i + 1);
        }
        this.r[i] = (byte) c;
        this.i = i + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void i2(String str) {
        this.m = str;
        g2(s);
        k2(str);
        int i = this.i;
        if (i == this.r.length) {
            v2(i + 1);
        }
        this.r[i] = 125;
        this.i = i + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void k2(String str) {
        boolean z;
        boolean z2;
        char c;
        if (str == null) {
            p2();
            return;
        }
        char[] charArray = str.toCharArray();
        long j = this.f2458a.c;
        int i = 0;
        if ((JSONWriter.Feature.BrowserSecure.mask & j) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((j & JSONWriter.Feature.EscapeNoneAscii.mask) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i2 = this.i;
        int length = (charArray.length * 3) + i2 + 2;
        if (z2 || z) {
            length += charArray.length * 3;
        }
        if (length >= this.r.length) {
            v2(length);
        }
        byte[] bArr = this.r;
        int i3 = i2 + 1;
        char c2 = this.f;
        bArr[i2] = (byte) c2;
        while (i < charArray.length && (c = charArray[i]) != c2 && c != '\\' && c >= ' ' && c <= 127 && (!z || (c != '<' && c != '>' && c != '(' && c != ')'))) {
            bArr[i3] = (byte) c;
            i++;
            i3++;
        }
        if (i == charArray.length) {
            bArr[i3] = (byte) c2;
            this.i = i3 + 1;
            return;
        }
        this.i = i3;
        if (i < charArray.length) {
            w2(charArray, charArray.length, z, z2, i);
        }
        byte[] bArr2 = this.r;
        int i4 = this.i;
        this.i = i4 + 1;
        bArr2[i4] = (byte) c2;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void l1(byte[] bArr) {
        byte b;
        int i = this.i;
        v2(((((bArr.length - 1) / 3) + 1) << 2) + i + 2);
        byte[] bArr2 = this.r;
        int i2 = i + 1;
        char c = this.f;
        bArr2[i] = (byte) c;
        int length = (bArr.length / 3) * 3;
        int i3 = 0;
        int i4 = 0;
        while (i4 < length) {
            int i5 = i4 + 2;
            int i6 = (bArr[i4 + 1] & 255) << 8;
            i4 += 3;
            int i7 = i6 | ((bArr[i4] & 255) << 16) | (bArr[i5] & 255);
            char[] cArr = JSONFactory.l;
            bArr2[i2] = (byte) cArr[(i7 >>> 18) & 63];
            bArr2[i2 + 1] = (byte) cArr[(i7 >>> 12) & 63];
            bArr2[i2 + 2] = (byte) cArr[(i7 >>> 6) & 63];
            bArr2[i2 + 3] = (byte) cArr[i7 & 63];
            i2 += 4;
        }
        int length2 = bArr.length - length;
        if (length2 > 0) {
            int i8 = (bArr[length] & 255) << 10;
            if (length2 == 2) {
                i3 = (bArr[bArr.length - 1] & 255) << 2;
            }
            int i9 = i8 | i3;
            char[] cArr2 = JSONFactory.l;
            bArr2[i2] = (byte) cArr2[i9 >> 12];
            bArr2[i2 + 1] = (byte) cArr2[(i9 >>> 6) & 63];
            int i10 = i2 + 2;
            if (length2 == 2) {
                b = (byte) cArr2[i9 & 63];
            } else {
                b = 61;
            }
            bArr2[i10] = b;
            bArr2[i2 + 3] = 61;
            i2 += 4;
        }
        bArr2[i2] = (byte) c;
        this.i = i2 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void m1(BigInteger bigInteger, long j) {
        if (bigInteger == null) {
            c2();
            return;
        }
        String bigInteger2 = bigInteger.toString(10);
        if (((j | this.f2458a.c) & JSONWriter.Feature.BrowserCompatible.mask) == 0 || (bigInteger.compareTo(JSONFactory.j) >= 0 && bigInteger.compareTo(JSONFactory.k) <= 0)) {
            int length = bigInteger2.length();
            int i = this.i + length;
            if (i >= this.r.length) {
                v2(i);
            }
            bigInteger2.getBytes(0, length, this.r, this.i);
            this.i += length;
            return;
        }
        k2(bigInteger2);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void m2(char[] cArr, int i, int i2) {
        boolean z;
        boolean z2;
        if (cArr != null) {
            int i3 = i + i2;
            long j = this.f2458a.c;
            if ((JSONWriter.Feature.BrowserSecure.mask & j) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((j & JSONWriter.Feature.EscapeNoneAscii.mask) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i4 = this.i;
            int i5 = i2 * 3;
            int i6 = i4 + i5 + 2;
            if (z2 || z) {
                i6 += i5;
            }
            if (i6 >= this.r.length) {
                v2(i6);
            }
            byte[] bArr = this.r;
            int i7 = i4 + 1;
            char c = this.f;
            bArr[i4] = (byte) c;
            int i8 = i;
            while (i8 < i3) {
                char c2 = cArr[i8];
                if (c2 == c || c2 == '\\' || c2 < ' ' || c2 > 127 || (z && (c2 == '<' || c2 == '>' || c2 == '(' || c2 == ')'))) {
                    break;
                }
                bArr[i7] = (byte) c2;
                i8++;
                i7++;
            }
            this.i = i7;
            int i9 = i7 + ((i3 - i8) * 6) + 2;
            if (i9 >= this.r.length) {
                v2(i9);
            }
            if (i8 < i3) {
                w2(cArr, i3, z, z2, i8);
            }
            byte[] bArr2 = this.r;
            int i10 = this.i;
            this.i = i10 + 1;
            bArr2[i10] = (byte) c;
        } else if (i0(JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullStringAsEmpty.mask)) {
            k2("");
        } else {
            b2();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
        if (r21 == false) goto L_0x0067;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
        r4[r10] = (byte) r8;
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
        r17.i = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
        return;
     */
    @Override // com.alibaba.fastjson2.JSONWriter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void n2(char[] r18, int r19, int r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.m.n2(char[], int, int, boolean):void");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void o2(String[] strArr) {
        if (strArr == null) {
            k1();
            return;
        }
        c1();
        for (int i = 0; i < strArr.length; i++) {
            if (i != 0) {
                t1();
            }
            String str = strArr[i];
            if (str != null) {
                k2(str);
            } else if (i0(JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullStringAsEmpty.mask)) {
                k2("");
            } else {
                b2();
            }
        }
        e();
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void r1(char c) {
        int i;
        int i2 = this.i;
        int i3 = i2 + 8;
        if (i3 >= this.r.length) {
            v2(i3);
        }
        byte[] bArr = this.r;
        int i4 = i2 + 1;
        char c2 = this.f;
        bArr[i2] = (byte) c2;
        if (c <= 127) {
            if (c != '\\') {
                switch (c) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        bArr[i4] = 92;
                        bArr[i2 + 2] = 117;
                        bArr[i2 + 3] = 48;
                        bArr[i2 + 4] = 48;
                        bArr[i2 + 5] = 48;
                        bArr[i2 + 6] = (byte) (c + '0');
                        i = i2 + 7;
                        break;
                    case '\b':
                        bArr[i4] = 92;
                        bArr[i2 + 2] = 98;
                        break;
                    case '\t':
                        bArr[i4] = 92;
                        bArr[i2 + 2] = 116;
                        break;
                    case '\n':
                        bArr[i4] = 92;
                        bArr[i2 + 2] = 110;
                        break;
                    case 11:
                    case 14:
                    case 15:
                        bArr[i4] = 92;
                        bArr[i2 + 2] = 117;
                        bArr[i2 + 3] = 48;
                        bArr[i2 + 4] = 48;
                        bArr[i2 + 5] = 48;
                        bArr[i2 + 6] = (byte) (c + ohh.LEVEL_W);
                        i = i2 + 7;
                        break;
                    case '\f':
                        bArr[i4] = 92;
                        bArr[i2 + 2] = 102;
                        break;
                    case '\r':
                        bArr[i4] = 92;
                        bArr[i2 + 2] = 114;
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                        bArr[i4] = 92;
                        bArr[i2 + 2] = 117;
                        bArr[i2 + 3] = 48;
                        bArr[i2 + 4] = 48;
                        bArr[i2 + 5] = 49;
                        bArr[i2 + 6] = (byte) (c + ' ');
                        i = i2 + 7;
                        break;
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                        bArr[i4] = 92;
                        bArr[i2 + 2] = 117;
                        bArr[i2 + 3] = 48;
                        bArr[i2 + 4] = 48;
                        bArr[i2 + 5] = 49;
                        bArr[i2 + 6] = (byte) (c + 'G');
                        i = i2 + 7;
                        break;
                    default:
                        if (c != c2) {
                            i = i2 + 2;
                            bArr[i4] = (byte) c;
                            break;
                        } else {
                            bArr[i4] = 92;
                            bArr[i2 + 2] = (byte) c2;
                            break;
                        }
                }
                bArr[i] = (byte) c2;
                this.i = i + 1;
            }
            bArr[i4] = 92;
            bArr[i2 + 2] = 92;
            i = i2 + 3;
            bArr[i] = (byte) c2;
            this.i = i + 1;
        } else if (c >= 55296 && c < 57344) {
            throw new JSONException("illegal char " + c);
        } else if (c > 2047) {
            bArr[i4] = (byte) (((c >> '\f') & 15) | 224);
            bArr[i2 + 2] = (byte) (((c >> 6) & 63) | 128);
            bArr[i2 + 3] = (byte) ((c & f7l.CONDITION_IF) | 128);
            i = i2 + 4;
            bArr[i] = (byte) c2;
            this.i = i + 1;
        } else {
            bArr[i4] = (byte) (((c >> 6) & 31) | tck.DETECT_WIDTH);
            bArr[i2 + 2] = (byte) ((c & f7l.CONDITION_IF) | 128);
            i = i2 + 3;
            bArr[i] = (byte) c2;
            this.i = i + 1;
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void s1() {
        int i = this.i;
        if (i == this.r.length) {
            v2(i + 1);
        }
        this.r[i] = 58;
        this.i = i + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void t1() {
        int i;
        int i2 = 0;
        this.h = false;
        int i3 = this.i;
        boolean z = this.n;
        if (z) {
            i = this.o + 3;
        } else {
            i = 1;
        }
        int i4 = i + i3;
        if (i4 >= this.r.length) {
            v2(i4);
        }
        byte[] bArr = this.r;
        int i5 = i3 + 1;
        bArr[i3] = 44;
        if (z) {
            int i6 = i3 + 2;
            bArr[i5] = 10;
            while (true) {
                i5 = i6;
                if (i2 >= this.o) {
                    break;
                }
                i6 = i5 + 1;
                bArr[i5] = 9;
                i2++;
            }
        }
        this.i = i5;
    }

    public String toString() {
        return new String(this.r, 0, this.i, StandardCharsets.UTF_8);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void u1(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = this.i;
        int i8 = i7 + 16;
        if (i8 >= this.r.length) {
            v2(i8);
        }
        byte[] bArr = this.r;
        char c = this.f;
        bArr[i7] = (byte) c;
        if (i < 0 || i > 9999) {
            throw new IllegalArgumentException("Only 4 digits numbers are supported. Provided: " + i);
        }
        int i9 = i / 1000;
        int[] iArr = b2d.DIGITS_K;
        int i10 = iArr[i - (i9 * 1000)];
        bArr[i7 + 1] = (byte) (i9 + 48);
        bArr[i7 + 2] = (byte) (i10 >> 16);
        bArr[i7 + 3] = (byte) (i10 >> 8);
        bArr[i7 + 4] = (byte) i10;
        int i11 = iArr[i2];
        bArr[i7 + 5] = (byte) (i11 >> 8);
        bArr[i7 + 6] = (byte) i11;
        int i12 = iArr[i3];
        bArr[i7 + 7] = (byte) (i12 >> 8);
        bArr[i7 + 8] = (byte) i12;
        int i13 = iArr[i4];
        bArr[i7 + 9] = (byte) (i13 >> 8);
        bArr[i7 + 10] = (byte) i13;
        int i14 = iArr[i5];
        bArr[i7 + 11] = (byte) (i14 >> 8);
        bArr[i7 + 12] = (byte) i14;
        int i15 = iArr[i6];
        bArr[i7 + 13] = (byte) (i15 >> 8);
        bArr[i7 + 14] = (byte) i15;
        bArr[i7 + 15] = (byte) c;
        this.i = i8;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void u2(UUID uuid) {
        if (uuid == null) {
            b2();
            return;
        }
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        int i = this.i + 38;
        if (i >= this.r.length) {
            v2(i);
        }
        char[] cArr = JSONFactory.v;
        byte[] bArr = this.r;
        int i2 = this.i;
        bArr[i2] = 34;
        char c = cArr[((int) (mostSignificantBits >> 56)) & 255];
        char c2 = cArr[((int) (mostSignificantBits >> 48)) & 255];
        char c3 = cArr[((int) (mostSignificantBits >> 40)) & 255];
        char c4 = cArr[((int) (mostSignificantBits >> 32)) & 255];
        int i3 = (int) mostSignificantBits;
        char c5 = cArr[(i3 >> 24) & 255];
        char c6 = cArr[(i3 >> 16) & 255];
        char c7 = cArr[(i3 >> 8) & 255];
        char c8 = cArr[i3 & 255];
        char c9 = cArr[((int) (leastSignificantBits >> 56)) & 255];
        char c10 = cArr[((int) (leastSignificantBits >> 48)) & 255];
        char c11 = cArr[((int) (leastSignificantBits >> 40)) & 255];
        char c12 = cArr[((int) (leastSignificantBits >> 32)) & 255];
        int i4 = (int) leastSignificantBits;
        char c13 = cArr[(i4 >> 24) & 255];
        char c14 = cArr[(i4 >> 16) & 255];
        char c15 = cArr[(i4 >> 8) & 255];
        char c16 = cArr[i4 & 255];
        bArr[i2 + 1] = (byte) (c >> '\b');
        bArr[i2 + 2] = (byte) c;
        bArr[i2 + 3] = (byte) (c2 >> '\b');
        bArr[i2 + 4] = (byte) c2;
        bArr[i2 + 5] = (byte) (c3 >> '\b');
        bArr[i2 + 6] = (byte) c3;
        bArr[i2 + 7] = (byte) (c4 >> '\b');
        bArr[i2 + 8] = (byte) c4;
        bArr[i2 + 9] = 45;
        bArr[i2 + 10] = (byte) (c5 >> '\b');
        bArr[i2 + 11] = (byte) c5;
        bArr[i2 + 12] = (byte) (c6 >> '\b');
        bArr[i2 + 13] = (byte) c6;
        bArr[i2 + 14] = 45;
        bArr[i2 + 15] = (byte) (c7 >> '\b');
        bArr[i2 + 16] = (byte) c7;
        bArr[i2 + 17] = (byte) (c8 >> '\b');
        bArr[i2 + 18] = (byte) c8;
        bArr[i2 + 19] = 45;
        bArr[i2 + 20] = (byte) (c9 >> '\b');
        bArr[i2 + 21] = (byte) c9;
        bArr[i2 + 22] = (byte) (c10 >> '\b');
        bArr[i2 + 23] = (byte) c10;
        bArr[i2 + 24] = 45;
        bArr[i2 + 25] = (byte) (c11 >> '\b');
        bArr[i2 + 26] = (byte) c11;
        bArr[i2 + 27] = (byte) (c12 >> '\b');
        bArr[i2 + 28] = (byte) c12;
        bArr[i2 + 29] = (byte) (c13 >> '\b');
        bArr[i2 + 30] = (byte) c13;
        bArr[i2 + 31] = (byte) (c14 >> '\b');
        bArr[i2 + 32] = (byte) c14;
        bArr[i2 + 33] = (byte) (c15 >> '\b');
        bArr[i2 + 34] = (byte) c15;
        bArr[i2 + 35] = (byte) (c16 >> '\b');
        bArr[i2 + 36] = (byte) c16;
        bArr[i2 + 37] = 34;
        this.i = i2 + 38;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void v1(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = this.i;
        int i8 = i7 + 21;
        if (i8 >= this.r.length) {
            v2(i8);
        }
        byte[] bArr = this.r;
        char c = this.f;
        bArr[i7] = (byte) c;
        if (i < 0 || i > 9999) {
            throw new IllegalArgumentException("Only 4 digits numbers are supported. Provided: " + i);
        }
        int i9 = i / 1000;
        int[] iArr = b2d.DIGITS_K;
        int i10 = iArr[i - (i9 * 1000)];
        bArr[i7 + 1] = (byte) (i9 + 48);
        bArr[i7 + 2] = (byte) (i10 >> 16);
        bArr[i7 + 3] = (byte) (i10 >> 8);
        bArr[i7 + 4] = (byte) i10;
        bArr[i7 + 5] = 45;
        int i11 = iArr[i2];
        bArr[i7 + 6] = (byte) (i11 >> 8);
        bArr[i7 + 7] = (byte) i11;
        bArr[i7 + 8] = 45;
        int i12 = iArr[i3];
        bArr[i7 + 9] = (byte) (i12 >> 8);
        bArr[i7 + 10] = (byte) i12;
        bArr[i7 + 11] = 32;
        int i13 = iArr[i4];
        bArr[i7 + 12] = (byte) (i13 >> 8);
        bArr[i7 + 13] = (byte) i13;
        bArr[i7 + 14] = 58;
        int i14 = iArr[i5];
        bArr[i7 + 15] = (byte) (i14 >> 8);
        bArr[i7 + 16] = (byte) i14;
        bArr[i7 + 17] = 58;
        int i15 = iArr[i6];
        bArr[i7 + 18] = (byte) (i15 >> 8);
        bArr[i7 + 19] = (byte) i15;
        bArr[i7 + 20] = (byte) c;
        this.i = i8;
    }

    public final void v2(int i) {
        byte[] bArr = this.r;
        if (i >= bArr.length) {
            int length = bArr.length;
            int i2 = length + (length >> 1);
            if (i2 - i >= 0) {
                i = i2;
            }
            if (i - this.g <= 0) {
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
        int i9;
        int i10;
        if (!z) {
            i9 = 0;
        } else if (i8 == 0) {
            i9 = 1;
        } else {
            i9 = 6;
        }
        int i11 = this.i + 25 + i9;
        if (i11 >= this.r.length) {
            v2(i11);
        }
        byte[] bArr = this.r;
        int i12 = this.i;
        char c = this.f;
        bArr[i12] = (byte) c;
        int l = b2d.l(bArr, i12 + 1, i);
        byte b = 45;
        bArr[l] = 45;
        int[] iArr = b2d.DIGITS_K;
        int i13 = iArr[i2];
        bArr[l + 1] = (byte) (i13 >> 8);
        bArr[l + 2] = (byte) i13;
        bArr[l + 3] = 45;
        int i14 = iArr[i3];
        bArr[l + 4] = (byte) (i14 >> 8);
        bArr[l + 5] = (byte) i14;
        int i15 = l + 6;
        if (z) {
            i10 = 84;
        } else {
            i10 = 32;
        }
        bArr[i15] = (byte) i10;
        int i16 = iArr[i4];
        bArr[l + 7] = (byte) (i16 >> 8);
        bArr[l + 8] = (byte) i16;
        bArr[l + 9] = 58;
        int i17 = iArr[i5];
        bArr[l + 10] = (byte) (i17 >> 8);
        bArr[l + 11] = (byte) i17;
        bArr[l + 12] = 58;
        int i18 = iArr[i6];
        bArr[l + 13] = (byte) (i18 >> 8);
        bArr[l + 14] = (byte) i18;
        int i19 = l + 15;
        if (i7 > 0) {
            int i20 = l + 16;
            bArr[i19] = 46;
            int i21 = i7 / 10;
            int i22 = i21 / 10;
            if (i7 - (i21 * 10) != 0) {
                int i23 = iArr[i7];
                bArr[i20] = (byte) (i23 >> 16);
                bArr[l + 17] = (byte) (i23 >> 8);
                bArr[l + 18] = (byte) i23;
                i19 = l + 19;
            } else if (i21 - (i22 * 10) != 0) {
                int i24 = iArr[i21];
                bArr[i20] = (byte) (i24 >> 8);
                bArr[l + 17] = (byte) i24;
                i19 = l + 18;
            } else {
                i19 = l + 17;
                bArr[i20] = (byte) (i22 + 48);
            }
        }
        if (z) {
            int i25 = i8 / ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT;
            if (i8 == 0) {
                bArr[i19] = 90;
                i19++;
            } else {
                int abs = Math.abs(i25);
                if (i25 >= 0) {
                    b = 43;
                }
                bArr[i19] = b;
                int i26 = iArr[abs];
                bArr[i19 + 1] = (byte) (i26 >> 8);
                bArr[i19 + 2] = (byte) i26;
                bArr[i19 + 3] = 58;
                int i27 = (i8 - (i25 * ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT)) / 60;
                if (i27 < 0) {
                    i27 = -i27;
                }
                int i28 = iArr[i27];
                bArr[i19 + 4] = (byte) (i28 >> 8);
                bArr[i19 + 5] = (byte) i28;
                i19 += 6;
            }
        }
        bArr[i19] = (byte) c;
        this.i = i19 + 1;
    }

    public final void w2(char[] cArr, int i, boolean z, boolean z2, int i2) {
        int i3;
        int i4;
        int i5;
        int length = this.i + ((cArr.length - i2) * 6) + 2;
        if (length >= this.r.length) {
            v2(length);
        }
        byte[] bArr = this.r;
        int i6 = this.i;
        while (i2 < i) {
            char c = cArr[i2];
            char[] cArr2 = JSONWriter.p;
            if (c <= 127) {
                if (c != '(' && c != ')' && c != '<' && c != '>') {
                    if (c != '\\') {
                        switch (c) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                bArr[i6] = 92;
                                bArr[i6 + 1] = 117;
                                bArr[i6 + 2] = 48;
                                bArr[i6 + 3] = 48;
                                bArr[i6 + 4] = 48;
                                bArr[i6 + 5] = (byte) (c + '0');
                                i6 += 6;
                                break;
                            case '\b':
                                bArr[i6] = 92;
                                bArr[i6 + 1] = 98;
                                break;
                            case '\t':
                                bArr[i6] = 92;
                                bArr[i6 + 1] = 116;
                                break;
                            case '\n':
                                bArr[i6] = 92;
                                bArr[i6 + 1] = 110;
                                break;
                            case 11:
                            case 14:
                            case 15:
                                bArr[i6] = 92;
                                bArr[i6 + 1] = 117;
                                bArr[i6 + 2] = 48;
                                bArr[i6 + 3] = 48;
                                bArr[i6 + 4] = 48;
                                bArr[i6 + 5] = (byte) (c + ohh.LEVEL_W);
                                i6 += 6;
                                break;
                            case '\f':
                                bArr[i6] = 92;
                                bArr[i6 + 1] = 102;
                                break;
                            case '\r':
                                bArr[i6] = 92;
                                bArr[i6 + 1] = 114;
                                break;
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                                bArr[i6] = 92;
                                bArr[i6 + 1] = 117;
                                bArr[i6 + 2] = 48;
                                bArr[i6 + 3] = 48;
                                bArr[i6 + 4] = 49;
                                bArr[i6 + 5] = (byte) (c + ' ');
                                i6 += 6;
                                break;
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                                bArr[i6] = 92;
                                bArr[i6 + 1] = 117;
                                bArr[i6 + 2] = 48;
                                bArr[i6 + 3] = 48;
                                bArr[i6 + 4] = 49;
                                bArr[i6 + 5] = (byte) (c + 'G');
                                i6 += 6;
                                break;
                            default:
                                char c2 = this.f;
                                if (c != c2) {
                                    i5 = i6 + 1;
                                    bArr[i6] = (byte) c;
                                    i6 = i5;
                                    break;
                                } else {
                                    bArr[i6] = 92;
                                    bArr[i6 + 1] = (byte) c2;
                                    break;
                                }
                        }
                    } else {
                        bArr[i6] = 92;
                        bArr[i6 + 1] = 92;
                    }
                    i6 += 2;
                } else if (z) {
                    bArr[i6] = 92;
                    bArr[i6 + 1] = 117;
                    bArr[i6 + 2] = 48;
                    bArr[i6 + 3] = 48;
                    bArr[i6 + 4] = (byte) cArr2[(c >>> 4) & 15];
                    bArr[i6 + 5] = (byte) cArr2[c & 15];
                    i6 += 6;
                } else {
                    i5 = i6 + 1;
                    bArr[i6] = (byte) c;
                    i6 = i5;
                }
                i2++;
            } else if (z2) {
                bArr[i6] = 92;
                bArr[i6 + 1] = 117;
                bArr[i6 + 2] = (byte) cArr2[(c >>> '\f') & 15];
                bArr[i6 + 3] = (byte) cArr2[(c >>> '\b') & 15];
                bArr[i6 + 4] = (byte) cArr2[(c >>> 4) & 15];
                bArr[i6 + 5] = (byte) cArr2[c & 15];
                i6 += 6;
                i2++;
            } else {
                if (c >= 55296 && c < 57344) {
                    if (c < 56320) {
                        if (cArr.length - i2 < 2) {
                            i4 = -1;
                        } else {
                            char c3 = cArr[i2 + 1];
                            if (c3 < 56320 || c3 >= 57344) {
                                i3 = i6 + 1;
                                bArr[i6] = 63;
                            } else {
                                i4 = ((c << '\n') + c3) - 56613888;
                            }
                        }
                        if (i4 < 0) {
                            i3 = i6 + 1;
                            bArr[i6] = 63;
                        } else {
                            bArr[i6] = (byte) ((i4 >> 18) | 240);
                            bArr[i6 + 1] = (byte) (((i4 >> 12) & 63) | 128);
                            bArr[i6 + 2] = (byte) ((63 & (i4 >> 6)) | 128);
                            bArr[i6 + 3] = (byte) ((i4 & 63) | 128);
                            i3 = i6 + 4;
                            i2++;
                        }
                    } else {
                        i3 = i6 + 1;
                        bArr[i6] = 63;
                    }
                    i6 = i3;
                } else if (c > 2047) {
                    bArr[i6] = (byte) (((c >> '\f') & 15) | 224);
                    bArr[i6 + 1] = (byte) ((63 & (c >> 6)) | 128);
                    bArr[i6 + 2] = (byte) ((c & f7l.CONDITION_IF) | 128);
                    i6 += 3;
                } else {
                    bArr[i6] = (byte) (((c >> 6) & 31) | tck.DETECT_WIDTH);
                    bArr[i6 + 1] = (byte) ((c & f7l.CONDITION_IF) | 128);
                    i6 += 2;
                }
                i2++;
            }
        }
        this.i = i6;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDouble(double d) {
        boolean z;
        if ((this.f2458a.c & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
            z = true;
        } else {
            z = false;
        }
        int i = this.i;
        int i2 = i + 26;
        if (i2 >= this.r.length) {
            v2(i2);
        }
        byte[] bArr = this.r;
        if (z) {
            bArr[i] = 34;
            i++;
        }
        int b = i + ot7.b(d, bArr, i, true);
        if (z) {
            bArr[b] = 34;
            b++;
        }
        this.i = b;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeFloat(float f) {
        boolean z;
        if ((this.f2458a.c & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
            z = true;
        } else {
            z = false;
        }
        int i = this.i;
        int i2 = i + 17;
        if (i2 >= this.r.length) {
            v2(i2);
        }
        if (z) {
            this.r[i] = 34;
            i++;
        }
        int d = i + ot7.d(f, this.r, i, true);
        if (z) {
            this.r[d] = 34;
            d++;
        }
        this.i = d;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void x1(int i, int i2, int i3) {
        int i4 = this.i;
        int i5 = i4 + 13;
        if (i5 >= this.r.length) {
            v2(i5);
        }
        byte[] bArr = this.r;
        char c = this.f;
        bArr[i4] = (byte) c;
        int p = b2d.p(bArr, i4 + 1, i, i2, i3);
        bArr[p] = (byte) c;
        this.i = p + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void y1(int i, int i2, int i3) {
        int i4 = this.i;
        int i5 = i4 + 10;
        if (i5 >= this.r.length) {
            v2(i5);
        }
        byte[] bArr = this.r;
        char c = this.f;
        bArr[i4] = (byte) c;
        if (i < 0 || i > 9999) {
            throw new IllegalArgumentException("Only 4 digits numbers are supported. Provided: " + i);
        }
        int i6 = i / 1000;
        int[] iArr = b2d.DIGITS_K;
        int i7 = iArr[i - (i6 * 1000)];
        bArr[i4 + 1] = (byte) (i6 + 48);
        bArr[i4 + 2] = (byte) (i7 >> 16);
        bArr[i4 + 3] = (byte) (i7 >> 8);
        bArr[i4 + 4] = (byte) i7;
        int i8 = iArr[i2];
        bArr[i4 + 5] = (byte) (i8 >> 8);
        bArr[i4 + 6] = (byte) i8;
        int i9 = iArr[i3];
        bArr[i4 + 7] = (byte) (i9 >> 8);
        bArr[i4 + 8] = (byte) i9;
        bArr[i4 + 9] = (byte) c;
        this.i = i5;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void z1(BigDecimal bigDecimal, long j, DecimalFormat decimalFormat) {
        boolean z;
        String str;
        if (bigDecimal == null) {
            c2();
        } else if (decimalFormat != null) {
            f2(decimalFormat.format(bigDecimal));
        } else {
            long j2 = j | this.f2458a.c;
            int precision = bigDecimal.precision();
            if ((JSONWriter.Feature.WriteNonStringValueAsString.mask & j2) == 0 && ((JSONWriter.Feature.BrowserCompatible.mask & j2) == 0 || precision < 16 || (bigDecimal.compareTo(JSONFactory.h) >= 0 && bigDecimal.compareTo(JSONFactory.i) <= 0))) {
                z = false;
            } else {
                z = true;
            }
            int i = this.i;
            int scale = precision + i + bigDecimal.scale() + 7;
            if (scale >= this.r.length) {
                v2(scale);
            }
            byte[] bArr = this.r;
            if (z) {
                bArr[i] = 34;
                i++;
            }
            if ((j2 & JSONWriter.Feature.WriteBigDecimalAsPlain.mask) != 0) {
                str = bigDecimal.toPlainString();
            } else {
                str = bigDecimal.toString();
            }
            str.getBytes(0, str.length(), bArr, i);
            int length = i + str.length();
            if (z) {
                bArr[length] = 34;
                length++;
            }
            this.i = length;
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void e2(char c) {
        if (c <= 128) {
            int i = this.i;
            if (i == this.r.length) {
                v2(i + 1);
            }
            byte[] bArr = this.r;
            int i2 = this.i;
            this.i = i2 + 1;
            bArr[i2] = (byte) c;
            return;
        }
        throw new JSONException("not support " + c);
    }
}
