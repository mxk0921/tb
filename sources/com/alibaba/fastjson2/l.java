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

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class l extends JSONWriter {
    public static final char[] s = "{\"$ref\":".toCharArray();
    public char[] q;
    public final JSONFactory.CacheItem r;

    public l(JSONWriter.a aVar) {
        super(aVar, null, false, StandardCharsets.UTF_16);
        int identityHashCode = System.identityHashCode(Thread.currentThread());
        JSONFactory.CacheItem[] cacheItemArr = JSONFactory.q;
        JSONFactory.CacheItem cacheItem = cacheItemArr[identityHashCode & (cacheItemArr.length - 1)];
        this.r = cacheItem;
        char[] andSet = JSONFactory.r.getAndSet(cacheItem, null);
        this.q = andSet == null ? new char[8192] : andSet;
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
        if (length >= this.q.length) {
            v2(length);
        }
        char[] cArr = this.q;
        int i2 = i + 1;
        cArr[i] = '[';
        for (int i3 = 0; i3 < dArr.length; i3++) {
            if (i3 != 0) {
                cArr[i2] = ',';
                i2++;
            }
            if (z) {
                cArr[i2] = '\"';
                i2++;
            }
            i2 += ot7.c(dArr[i3], cArr, i2, true);
            if (z) {
                cArr[i2] = '\"';
                i2++;
            }
        }
        cArr[i2] = ']';
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
        if (i3 >= this.q.length) {
            v2(i3);
        }
        char[] cArr = this.q;
        int i4 = i2 + 1;
        cArr[i2] = '[';
        for (int i5 = 0; i5 < fArr.length; i5++) {
            if (i5 != 0) {
                cArr[i4] = ',';
                i4++;
            }
            if (z) {
                cArr[i4] = '\"';
                i4++;
            }
            i4 += ot7.e(fArr[i5], cArr, i4, true);
            if (z) {
                cArr[i4] = '\"';
                i4++;
            }
        }
        cArr[i4] = ']';
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
        char[] cArr = this.q;
        cArr[i2] = 'x';
        cArr[i2 + 1] = '\'';
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
            cArr[i3] = (char) (i4 + i);
            int i7 = i3 + 1;
            if (i5 < 10) {
                i6 = 48;
            }
            cArr[i7] = (char) (i5 + i6);
            i3 += 2;
        }
        cArr[i3] = '\'';
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
        if (i2 >= this.q.length) {
            v2(i2);
        }
        char[] cArr = this.q;
        char c = this.f;
        if (z) {
            cArr[i] = c;
            i++;
        }
        int m = b2d.m(cArr, i, s2);
        if (z) {
            cArr[m] = c;
            m++;
        }
        this.i = m;
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
        if (i3 >= this.q.length) {
            v2(i3);
        }
        char[] cArr = this.q;
        char c = this.f;
        if (z) {
            cArr[i2] = c;
            i2++;
        }
        int m = b2d.m(cArr, i2, i);
        if (z) {
            cArr[m] = c;
            m++;
        }
        this.i = m;
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
        if (length >= this.q.length) {
            v2(length);
        }
        char[] cArr = this.q;
        int i2 = i + 1;
        cArr[i] = '[';
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (i3 != 0) {
                cArr[i2] = ',';
                i2++;
            }
            char c = this.f;
            if (z) {
                cArr[i2] = c;
                i2++;
            }
            i2 = b2d.m(cArr, i2, iArr[i3]);
            if (z) {
                cArr[i2] = c;
                i2++;
            }
        }
        cArr[i2] = ']';
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
        if (i3 >= this.q.length) {
            v2(i3);
        }
        char[] cArr = this.q;
        char c = this.f;
        if (z) {
            cArr[i2] = c;
            i2++;
        }
        int o = b2d.o(cArr, i2, j);
        if (z) {
            i = o + 1;
            cArr[o] = c;
        } else {
            if ((JSONWriter.Feature.WriteClassName.mask & j2) != 0 && (j2 & JSONWriter.Feature.NotWriteNumberClassName.mask) == 0 && j >= -2147483648L && j <= 2147483647L) {
                i = o + 1;
                cArr[o] = ohh.LEVEL_L;
            }
            this.i = o;
        }
        o = i;
        this.i = o;
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
        if (length >= this.q.length) {
            v2(length);
        }
        char[] cArr = this.q;
        int i2 = i + 1;
        cArr[i] = '[';
        for (int i3 = 0; i3 < jArr.length; i3++) {
            if (i3 != 0) {
                cArr[i2] = ',';
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
                cArr[i2] = c;
                i2++;
            }
            i2 = b2d.o(cArr, i2, j2);
            if (z3) {
                cArr[i2] = c;
                i2++;
            }
        }
        cArr[i2] = ']';
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
        int i2 = i + 7;
        if (i2 >= this.q.length) {
            v2(i2);
        }
        char[] cArr = this.q;
        char c = this.f;
        if (z) {
            cArr[i] = c;
            i++;
        }
        int m = b2d.m(cArr, i, b);
        if (z) {
            cArr[m] = c;
            m++;
        }
        this.i = m;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void S1(q7h q7hVar) {
        int i = this.i;
        int i2 = i + 38;
        if (i2 >= this.q.length) {
            v2(i2);
        }
        char[] cArr = this.q;
        int i3 = i + 1;
        char c = this.f;
        cArr[i] = c;
        p7h p7hVar = q7hVar.f26561a;
        int q = b2d.q(cArr, i3, p7hVar.f25919a, p7hVar.b, p7hVar.c);
        cArr[q] = ' ';
        int s2 = b2d.s(cArr, q + 1, q7hVar.b);
        cArr[s2] = c;
        this.i = s2 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void Y1(byte[] bArr) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a2(char[] cArr) {
        int i = this.i;
        int length = cArr.length + i + 2 + this.o;
        if (length >= this.q.length) {
            v2(length);
        }
        if (this.h) {
            this.h = false;
        } else {
            char[] cArr2 = this.q;
            int i2 = i + 1;
            cArr2[i] = ',';
            if (this.n) {
                i += 2;
                cArr2[i2] = '\n';
                int i3 = 0;
                while (i3 < this.o) {
                    cArr2[i] = '\t';
                    i3++;
                    i++;
                }
            } else {
                i = i2;
            }
        }
        System.arraycopy(cArr, 0, this.q, i, cArr.length);
        this.i = i + cArr.length;
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
        if (i3 >= this.q.length) {
            v2(i3);
        }
        char[] cArr = this.q;
        int i4 = i2 + 1;
        cArr[i2] = '[';
        if (z) {
            this.o++;
            int i5 = i2 + 2;
            cArr[i4] = '\n';
            int i6 = 0;
            while (true) {
                i4 = i5;
                if (i6 >= this.o) {
                    break;
                }
                i5 = i4 + 1;
                cArr[i4] = '\t';
                i6++;
            }
        }
        this.i = i4;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        char[] cArr = this.q;
        if (cArr.length <= 1048576) {
            JSONFactory.r.lazySet(this.r, cArr);
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
        if (i3 >= this.q.length) {
            v2(i3);
        }
        char[] cArr = this.q;
        if (z) {
            this.o--;
            cArr[i2] = '\n';
            i2++;
            int i4 = 0;
            while (i4 < this.o) {
                cArr[i2] = '\t';
                i4++;
                i2++;
            }
        }
        cArr[i2] = ']';
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
        if (i3 >= this.q.length) {
            v2(i3);
        }
        char[] cArr = this.q;
        int i4 = i2 + 1;
        cArr[i2] = '{';
        if (z) {
            this.o++;
            int i5 = i2 + 2;
            cArr[i4] = '\n';
            int i6 = 0;
            while (true) {
                i4 = i5;
                if (i6 >= this.o) {
                    break;
                }
                i5 = i4 + 1;
                cArr[i4] = '\t';
                i6++;
            }
        }
        this.i = i4;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void e2(char c) {
        int i = this.i;
        if (i == this.q.length) {
            v2(i + 1);
        }
        char[] cArr = this.q;
        int i2 = this.i;
        this.i = i2 + 1;
        cArr[i2] = c;
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
        if (i == this.q.length) {
            v2(i + 1);
        }
        char[] cArr = this.q;
        int i2 = this.i;
        this.i = i2 + 1;
        cArr[i2] = '{';
        boolean z = true;
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            Object value = entry.getValue();
            if (value != null || (aVar.c & JSONWriter.Feature.WriteMapNullValue.mask) != 0) {
                if (!z) {
                    int i3 = this.i;
                    if (i3 == this.q.length) {
                        v2(i3 + 1);
                    }
                    char[] cArr2 = this.q;
                    int i4 = this.i;
                    this.i = i4 + 1;
                    cArr2[i4] = ',';
                }
                String key = entry.getKey();
                if (key instanceof String) {
                    k2(key);
                } else {
                    j1(key);
                }
                int i5 = this.i;
                if (i5 == this.q.length) {
                    v2(i5 + 1);
                }
                char[] cArr3 = this.q;
                int i6 = this.i;
                this.i = i6 + 1;
                cArr3[i6] = f7l.CONDITION_IF_MIDDLE;
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
        if (i7 == this.q.length) {
            v2(i7 + 1);
        }
        char[] cArr4 = this.q;
        int i8 = this.i;
        this.i = i8 + 1;
        cArr4[i8] = '}';
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void f2(String str) {
        v2(this.i + str.length());
        str.getChars(0, str.length(), this.q, this.i);
        this.i += str.length();
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
        if (i3 >= this.q.length) {
            v2(i3);
        }
        char[] cArr = this.q;
        if (z) {
            this.o--;
            cArr[i2] = '\n';
            i2++;
            int i4 = 0;
            while (i4 < this.o) {
                cArr[i2] = '\t';
                i4++;
                i2++;
            }
        }
        cArr[i2] = '}';
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
        if (i == this.q.length) {
            v2(i + 1);
        }
        char[] cArr = this.q;
        int i2 = this.i;
        this.i = i2 + 1;
        cArr[i2] = '[';
        int size = list.size();
        boolean z = true;
        int i3 = 0;
        while (i3 < size) {
            if (!z) {
                int i4 = this.i;
                if (i4 == this.q.length) {
                    v2(i4 + 1);
                }
                char[] cArr2 = this.q;
                int i5 = this.i;
                this.i = i5 + 1;
                cArr2[i5] = ',';
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
        if (i6 == this.q.length) {
            v2(i6 + 1);
        }
        char[] cArr3 = this.q;
        int i7 = this.i;
        this.i = i7 + 1;
        cArr3[i7] = ']';
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void g2(byte[] bArr) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void h2(char[] cArr, int i, int i2) {
        int i3 = this.i + i2;
        if (i3 >= this.q.length) {
            v2(i3);
        }
        System.arraycopy(cArr, i, this.q, this.i, i2);
        this.i += i2;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void i1(char c) {
        int i = this.i;
        if (i == this.q.length) {
            v2(i + 1);
        }
        this.q[i] = c;
        this.i = i + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void i2(String str) {
        this.m = str;
        char[] cArr = s;
        h2(cArr, 0, cArr.length);
        k2(str);
        int i = this.i;
        if (i == this.q.length) {
            v2(i + 1);
        }
        this.q[i] = '}';
        this.i = i + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void k2(String str) {
        boolean z;
        boolean z2;
        if (str == null) {
            p2();
            return;
        }
        long j = this.f2458a.c;
        if ((JSONWriter.Feature.EscapeNoneAscii.mask & j) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((j & JSONWriter.Feature.BrowserSecure.mask) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int length = str.length();
        int i = this.i + length + 2;
        if (i >= this.q.length) {
            v2(i);
        }
        int i2 = 0;
        while (true) {
            char c = this.f;
            if (i2 < length) {
                char charAt = str.charAt(i2);
                if (charAt == '\\' || charAt == c || charAt < ' ' || ((z2 && (charAt == '<' || charAt == '>' || charAt == '(' || charAt == ')')) || (z && charAt > 127))) {
                    break;
                }
                i2++;
            } else {
                int i3 = this.i;
                char[] cArr = this.q;
                int i4 = i3 + 1;
                cArr[i3] = c;
                str.getChars(0, length, cArr, i4);
                int i5 = i4 + length;
                cArr[i5] = c;
                this.i = i5 + 1;
                return;
            }
        }
        w2(str);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void l1(byte[] bArr) {
        char c;
        if (bArr == null) {
            k1();
            return;
        }
        int i = this.i;
        v2(((((bArr.length - 1) / 3) + 1) << 2) + i + 2);
        char[] cArr = this.q;
        int i2 = i + 1;
        char c2 = this.f;
        cArr[i] = c2;
        int length = (bArr.length / 3) * 3;
        int i3 = 0;
        int i4 = 0;
        while (i4 < length) {
            int i5 = i4 + 2;
            int i6 = (bArr[i4 + 1] & 255) << 8;
            i4 += 3;
            int i7 = i6 | ((bArr[i4] & 255) << 16) | (bArr[i5] & 255);
            char[] cArr2 = JSONFactory.l;
            cArr[i2] = cArr2[(i7 >>> 18) & 63];
            cArr[i2 + 1] = cArr2[(i7 >>> 12) & 63];
            cArr[i2 + 2] = cArr2[(i7 >>> 6) & 63];
            cArr[i2 + 3] = cArr2[i7 & 63];
            i2 += 4;
        }
        int length2 = bArr.length - length;
        if (length2 > 0) {
            int i8 = (bArr[length] & 255) << 10;
            if (length2 == 2) {
                i3 = (bArr[bArr.length - 1] & 255) << 2;
            }
            int i9 = i8 | i3;
            char[] cArr3 = JSONFactory.l;
            cArr[i2] = cArr3[i9 >> 12];
            cArr[i2 + 1] = cArr3[(i9 >>> 6) & 63];
            int i10 = i2 + 2;
            if (length2 == 2) {
                c = cArr3[i9 & 63];
            } else {
                c = '=';
            }
            cArr[i10] = c;
            cArr[i2 + 3] = '=';
            i2 += 4;
        }
        cArr[i2] = c2;
        this.i = i2 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void l2(List<String> list) {
        int i = this.i;
        if (i == this.q.length) {
            v2(i + 1);
        }
        char[] cArr = this.q;
        int i2 = this.i;
        this.i = i2 + 1;
        cArr[i2] = '[';
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 != 0) {
                int i4 = this.i;
                if (i4 == this.q.length) {
                    v2(i4 + 1);
                }
                char[] cArr2 = this.q;
                int i5 = this.i;
                this.i = i5 + 1;
                cArr2[i5] = ',';
            }
            k2(list.get(i3));
        }
        int i6 = this.i;
        if (i6 == this.q.length) {
            v2(i6 + 1);
        }
        char[] cArr3 = this.q;
        int i7 = this.i;
        this.i = i7 + 1;
        cArr3[i7] = ']';
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void m1(BigInteger bigInteger, long j) {
        boolean z;
        boolean z2;
        int i;
        if (bigInteger == null) {
            c2();
            return;
        }
        String bigInteger2 = bigInteger.toString(10);
        long j2 = j | this.f2458a.c;
        boolean z3 = true;
        if ((JSONWriter.Feature.BrowserCompatible.mask & j2) == 0 || (bigInteger.compareTo(JSONFactory.j) >= 0 && bigInteger.compareTo(JSONFactory.k) <= 0)) {
            z = false;
        } else {
            z = true;
        }
        if ((j2 & (JSONWriter.Feature.WriteNonStringValueAsString.mask | JSONWriter.Feature.WriteLongAsString.mask)) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            z3 = false;
        }
        int length = bigInteger2.length();
        v2(this.i + length + 2);
        char[] cArr = this.q;
        int i2 = this.i;
        if (z3) {
            int i3 = i2 + 1;
            cArr[i2] = '\"';
            bigInteger2.getChars(0, length, cArr, i3);
            int i4 = i3 + length;
            i = i4 + 1;
            cArr[i4] = '\"';
        } else {
            bigInteger2.getChars(0, length, cArr, i2);
            i = length + i2;
        }
        this.i = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
        r0 = (r6.i + r9) + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
        if (r0 < r6.q.length) goto L_0x003e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
        v2(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
        r0 = r6.q;
        r1 = r6.i;
        r3 = r1 + 1;
        r6.i = r3;
        r0[r1] = r2;
        java.lang.System.arraycopy(r7, r8, r0, r3, r9);
        r7 = r6.i + r9;
        r8 = r6.q;
        r6.i = r7 + 1;
        r8[r7] = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
        return;
     */
    @Override // com.alibaba.fastjson2.JSONWriter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m2(char[] r7, int r8, int r9) {
        /*
            r6 = this;
            if (r7 != 0) goto L_0x0006
            r6.p2()
            return
        L_0x0006:
            com.alibaba.fastjson2.JSONWriter$a r0 = r6.f2458a
            long r0 = r0.c
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.EscapeNoneAscii
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x0018
            r0 = 1
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            r1 = r8
        L_0x001a:
            char r2 = r6.f
            if (r1 >= r9) goto L_0x002e
            char r3 = r7[r1]
            r5 = 92
            if (r3 == r5) goto L_0x002f
            if (r3 == r2) goto L_0x002f
            r5 = 32
            if (r3 >= r5) goto L_0x002b
            goto L_0x002f
        L_0x002b:
            int r1 = r1 + 1
            goto L_0x001a
        L_0x002e:
            r4 = r0
        L_0x002f:
            if (r4 != 0) goto L_0x0057
            int r0 = r6.i
            int r0 = r0 + r9
            int r0 = r0 + 2
            char[] r1 = r6.q
            int r1 = r1.length
            if (r0 < r1) goto L_0x003e
            r6.v2(r0)
        L_0x003e:
            char[] r0 = r6.q
            int r1 = r6.i
            int r3 = r1 + 1
            r6.i = r3
            r0[r1] = r2
            java.lang.System.arraycopy(r7, r8, r0, r3, r9)
            int r7 = r6.i
            int r7 = r7 + r9
            char[] r8 = r6.q
            int r9 = r7 + 1
            r6.i = r9
            r8[r7] = r2
            return
        L_0x0057:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r7, r8, r9)
            r6.w2(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.l.m2(char[], int, int):void");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void n2(char[] cArr, int i, int i2, boolean z) {
        boolean z2;
        int i3;
        int i4;
        int i5;
        if ((this.f2458a.c & JSONWriter.Feature.EscapeNoneAscii.mask) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i6 = this.i;
        if (z) {
            i3 = i6 + 2;
        } else {
            i3 = i6;
        }
        if (z2) {
            i4 = i2 * 6;
        } else {
            i4 = i2 * 2;
        }
        int i7 = i3 + i4;
        if (i7 - this.q.length > 0) {
            v2(i7);
        }
        char[] cArr2 = this.q;
        char c = this.f;
        if (z) {
            cArr2[i6] = c;
            i6++;
        }
        while (i < i2) {
            char c2 = cArr[i];
            if (c2 == '\"' || c2 == '\'') {
                if (c2 == c) {
                    cArr2[i6] = '\\';
                    i6++;
                }
                i5 = i6 + 1;
                cArr2[i6] = c2;
            } else {
                if (c2 != '\\') {
                    switch (c2) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            cArr2[i6] = '\\';
                            cArr2[i6 + 1] = 'u';
                            cArr2[i6 + 2] = '0';
                            cArr2[i6 + 3] = '0';
                            cArr2[i6 + 4] = '0';
                            cArr2[i6 + 5] = (char) (c2 + '0');
                            i6 += 6;
                            break;
                        case '\b':
                            cArr2[i6] = '\\';
                            cArr2[i6 + 1] = 'b';
                            break;
                        case '\t':
                            cArr2[i6] = '\\';
                            cArr2[i6 + 1] = 't';
                            break;
                        case '\n':
                            cArr2[i6] = '\\';
                            cArr2[i6 + 1] = 'n';
                            break;
                        case 11:
                        case 14:
                        case 15:
                            cArr2[i6] = '\\';
                            cArr2[i6 + 1] = 'u';
                            cArr2[i6 + 2] = '0';
                            cArr2[i6 + 3] = '0';
                            cArr2[i6 + 4] = '0';
                            cArr2[i6 + 5] = (char) (c2 + ohh.LEVEL_W);
                            i6 += 6;
                            break;
                        case '\f':
                            cArr2[i6] = '\\';
                            cArr2[i6 + 1] = 'f';
                            break;
                        case '\r':
                            cArr2[i6] = '\\';
                            cArr2[i6 + 1] = 'r';
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
                            cArr2[i6] = '\\';
                            cArr2[i6 + 1] = 'u';
                            cArr2[i6 + 2] = '0';
                            cArr2[i6 + 3] = '0';
                            cArr2[i6 + 4] = '1';
                            cArr2[i6 + 5] = (char) (c2 + ' ');
                            i6 += 6;
                            break;
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                            cArr2[i6] = '\\';
                            cArr2[i6 + 1] = 'u';
                            cArr2[i6 + 2] = '0';
                            cArr2[i6 + 3] = '0';
                            cArr2[i6 + 4] = '1';
                            cArr2[i6 + 5] = (char) (c2 + 'G');
                            i6 += 6;
                            break;
                        default:
                            if (z2 && c2 > 127) {
                                cArr2[i6] = '\\';
                                cArr2[i6 + 1] = 'u';
                                char[] cArr3 = JSONWriter.p;
                                cArr2[i6 + 2] = cArr3[(c2 >>> '\f') & 15];
                                cArr2[i6 + 3] = cArr3[(c2 >>> '\b') & 15];
                                cArr2[i6 + 4] = cArr3[(c2 >>> 4) & 15];
                                cArr2[i6 + 5] = cArr3[c2 & 15];
                                i6 += 6;
                                break;
                            } else {
                                i5 = i6 + 1;
                                cArr2[i6] = c2;
                                break;
                            }
                            break;
                    }
                    i++;
                } else {
                    cArr2[i6] = '\\';
                    cArr2[i6 + 1] = c2;
                }
                i6 += 2;
                i++;
            }
            i6 = i5;
            i++;
        }
        if (z) {
            cArr2[i6] = c;
            i6++;
        }
        this.i = i6;
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
        if (i3 >= this.q.length) {
            v2(i3);
        }
        char[] cArr = this.q;
        int i4 = i2 + 1;
        char c2 = this.f;
        cArr[i2] = c2;
        if (c == '\"' || c == '\'') {
            if (c == c2) {
                cArr[i4] = '\\';
                i4 = i2 + 2;
            }
            i = i4 + 1;
            cArr[i4] = c;
        } else {
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
                        cArr[i4] = '\\';
                        cArr[i2 + 2] = 'u';
                        cArr[i2 + 3] = '0';
                        cArr[i2 + 4] = '0';
                        cArr[i2 + 5] = '0';
                        cArr[i2 + 6] = (char) (c + '0');
                        i = i2 + 7;
                        break;
                    case '\b':
                        cArr[i4] = '\\';
                        cArr[i2 + 2] = 'b';
                        break;
                    case '\t':
                        cArr[i4] = '\\';
                        cArr[i2 + 2] = 't';
                        break;
                    case '\n':
                        cArr[i4] = '\\';
                        cArr[i2 + 2] = 'n';
                        break;
                    case 11:
                    case 14:
                    case 15:
                        cArr[i4] = '\\';
                        cArr[i2 + 2] = 'u';
                        cArr[i2 + 3] = '0';
                        cArr[i2 + 4] = '0';
                        cArr[i2 + 5] = '0';
                        cArr[i2 + 6] = (char) (c + ohh.LEVEL_W);
                        i = i2 + 7;
                        break;
                    case '\f':
                        cArr[i4] = '\\';
                        cArr[i2 + 2] = 'f';
                        break;
                    case '\r':
                        cArr[i4] = '\\';
                        cArr[i2 + 2] = 'r';
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
                        cArr[i4] = '\\';
                        cArr[i2 + 2] = 'u';
                        cArr[i2 + 3] = '0';
                        cArr[i2 + 4] = '0';
                        cArr[i2 + 5] = '1';
                        cArr[i2 + 6] = (char) (c + ' ');
                        i = i2 + 7;
                        break;
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                        cArr[i4] = '\\';
                        cArr[i2 + 2] = 'u';
                        cArr[i2 + 3] = '0';
                        cArr[i2 + 4] = '0';
                        cArr[i2 + 5] = '1';
                        cArr[i2 + 6] = (char) (c + 'G');
                        i = i2 + 7;
                        break;
                    default:
                        i = i2 + 2;
                        cArr[i4] = c;
                        break;
                }
            } else {
                cArr[i4] = '\\';
                cArr[i2 + 2] = c;
            }
            i = i2 + 3;
        }
        cArr[i] = c2;
        this.i = i + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void s1() {
        int i = this.i;
        if (i == this.q.length) {
            v2(i + 1);
        }
        this.q[i] = f7l.CONDITION_IF_MIDDLE;
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
        if (i4 >= this.q.length) {
            v2(i4);
        }
        char[] cArr = this.q;
        int i5 = i3 + 1;
        cArr[i3] = ',';
        if (z) {
            int i6 = i3 + 2;
            cArr[i5] = '\n';
            while (true) {
                i5 = i6;
                if (i2 >= this.o) {
                    break;
                }
                i6 = i5 + 1;
                cArr[i5] = '\t';
                i2++;
            }
        }
        this.i = i5;
    }

    public String toString() {
        return new String(this.q, 0, this.i);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void u1(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = this.i;
        int i8 = i7 + 16;
        if (i8 >= this.q.length) {
            v2(i8);
        }
        char[] cArr = this.q;
        char c = this.f;
        cArr[i7] = c;
        if (i < 0 || i > 9999) {
            throw new IllegalArgumentException("Only 4 digits numbers are supported. Provided: " + i);
        }
        int i9 = i / 1000;
        int[] iArr = b2d.DIGITS_K;
        int i10 = iArr[i - (i9 * 1000)];
        cArr[i7 + 1] = (char) ((byte) (i9 + 48));
        cArr[i7 + 2] = (char) ((byte) (i10 >> 16));
        cArr[i7 + 3] = (char) ((byte) (i10 >> 8));
        cArr[i7 + 4] = (char) ((byte) i10);
        int i11 = iArr[i2];
        cArr[i7 + 5] = (char) ((byte) (i11 >> 8));
        cArr[i7 + 6] = (char) ((byte) i11);
        int i12 = iArr[i3];
        cArr[i7 + 7] = (char) ((byte) (i12 >> 8));
        cArr[i7 + 8] = (char) ((byte) i12);
        int i13 = iArr[i4];
        cArr[i7 + 9] = (char) ((byte) (i13 >> 8));
        cArr[i7 + 10] = (char) ((byte) i13);
        int i14 = iArr[i5];
        cArr[i7 + 11] = (char) ((byte) (i14 >> 8));
        cArr[i7 + 12] = (char) ((byte) i14);
        int i15 = iArr[i6];
        cArr[i7 + 13] = (char) ((byte) (i15 >> 8));
        cArr[i7 + 14] = (char) ((byte) i15);
        cArr[i7 + 15] = c;
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
        if (i >= this.q.length) {
            v2(i);
        }
        char[] cArr = JSONFactory.v;
        char[] cArr2 = this.q;
        int i2 = this.i;
        cArr2[i2] = '\"';
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
        cArr2[i2 + 1] = (char) ((byte) (c >> '\b'));
        cArr2[i2 + 2] = (char) ((byte) c);
        cArr2[i2 + 3] = (char) ((byte) (c2 >> '\b'));
        cArr2[i2 + 4] = (char) ((byte) c2);
        cArr2[i2 + 5] = (char) ((byte) (c3 >> '\b'));
        cArr2[i2 + 6] = (char) ((byte) c3);
        cArr2[i2 + 7] = (char) ((byte) (c4 >> '\b'));
        cArr2[i2 + 8] = (char) ((byte) c4);
        cArr2[i2 + 9] = '-';
        cArr2[i2 + 10] = (char) ((byte) (c5 >> '\b'));
        cArr2[i2 + 11] = (char) ((byte) c5);
        cArr2[i2 + 12] = (char) ((byte) (c6 >> '\b'));
        cArr2[i2 + 13] = (char) ((byte) c6);
        cArr2[i2 + 14] = '-';
        cArr2[i2 + 15] = (char) ((byte) (c7 >> '\b'));
        cArr2[i2 + 16] = (char) ((byte) c7);
        cArr2[i2 + 17] = (char) ((byte) (c8 >> '\b'));
        cArr2[i2 + 18] = (char) ((byte) c8);
        cArr2[i2 + 19] = '-';
        cArr2[i2 + 20] = (char) ((byte) (c9 >> '\b'));
        cArr2[i2 + 21] = (char) ((byte) c9);
        cArr2[i2 + 22] = (char) ((byte) (c10 >> '\b'));
        cArr2[i2 + 23] = (char) ((byte) c10);
        cArr2[i2 + 24] = '-';
        cArr2[i2 + 25] = (char) ((byte) (c11 >> '\b'));
        cArr2[i2 + 26] = (char) ((byte) c11);
        cArr2[i2 + 27] = (char) ((byte) (c12 >> '\b'));
        cArr2[i2 + 28] = (char) ((byte) c12);
        cArr2[i2 + 29] = (char) ((byte) (c13 >> '\b'));
        cArr2[i2 + 30] = (char) ((byte) c13);
        cArr2[i2 + 31] = (char) ((byte) (c14 >> '\b'));
        cArr2[i2 + 32] = (char) ((byte) c14);
        cArr2[i2 + 33] = (char) ((byte) (c15 >> '\b'));
        cArr2[i2 + 34] = (char) ((byte) c15);
        cArr2[i2 + 35] = (char) ((byte) (c16 >> '\b'));
        cArr2[i2 + 36] = (char) ((byte) c16);
        cArr2[i2 + 37] = '\"';
        this.i = i2 + 38;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void v1(int i, int i2, int i3, int i4, int i5, int i6) {
        v2(this.i + 21);
        char[] cArr = this.q;
        int i7 = this.i;
        char c = this.f;
        cArr[i7] = c;
        if (i < 0 || i > 9999) {
            throw new IllegalArgumentException("Only 4 digits numbers are supported. Provided: " + i);
        }
        int i8 = i / 1000;
        int[] iArr = b2d.DIGITS_K;
        int i9 = iArr[i - (i8 * 1000)];
        cArr[i7 + 1] = (char) ((byte) (i8 + 48));
        cArr[i7 + 2] = (char) ((byte) (i9 >> 16));
        cArr[i7 + 3] = (char) ((byte) (i9 >> 8));
        cArr[i7 + 4] = (char) ((byte) i9);
        cArr[i7 + 5] = '-';
        int i10 = iArr[i2];
        cArr[i7 + 6] = (char) ((byte) (i10 >> 8));
        cArr[i7 + 7] = (char) ((byte) i10);
        cArr[i7 + 8] = '-';
        int i11 = iArr[i3];
        cArr[i7 + 9] = (char) ((byte) (i11 >> 8));
        cArr[i7 + 10] = (char) ((byte) i11);
        cArr[i7 + 11] = ' ';
        int i12 = iArr[i4];
        cArr[i7 + 12] = (char) ((byte) (i12 >> 8));
        cArr[i7 + 13] = (char) ((byte) i12);
        cArr[i7 + 14] = f7l.CONDITION_IF_MIDDLE;
        int i13 = iArr[i5];
        cArr[i7 + 15] = (char) ((byte) (i13 >> 8));
        cArr[i7 + 16] = (char) ((byte) i13);
        cArr[i7 + 17] = f7l.CONDITION_IF_MIDDLE;
        int i14 = iArr[i6];
        cArr[i7 + 18] = (char) ((byte) (i14 >> 8));
        cArr[i7 + 19] = (char) ((byte) i14);
        cArr[i7 + 20] = (char) ((byte) c);
        this.i = i7 + 21;
    }

    public final void v2(int i) {
        char[] cArr = this.q;
        if (i - cArr.length > 0) {
            int length = cArr.length;
            int i2 = length + (length >> 1);
            if (i2 - i >= 0) {
                i = i2;
            }
            if (i - this.g <= 0) {
                this.q = Arrays.copyOf(cArr, i);
                return;
            }
            throw new OutOfMemoryError();
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public byte[] w() {
        int i = 0;
        while (true) {
            int i2 = this.i;
            if (i < i2) {
                char[] cArr = this.q;
                if (cArr[i] >= 128) {
                    byte[] bArr = new byte[i2 * 3];
                    return Arrays.copyOf(bArr, b2d.d(cArr, 0, i2, bArr, 0));
                }
                i++;
            } else {
                byte[] bArr2 = new byte[i2];
                for (int i3 = 0; i3 < this.i; i3++) {
                    bArr2[i3] = (byte) this.q[i3];
                }
                return bArr2;
            }
        }
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
        int i11 = this.i;
        int i12 = i11 + 25 + i9;
        if (i11 + i12 >= this.q.length) {
            v2(i12);
        }
        char[] cArr = this.q;
        char c = this.f;
        cArr[i11] = c;
        int m = b2d.m(cArr, i11 + 1, i);
        char c2 = '-';
        cArr[m] = '-';
        int[] iArr = b2d.DIGITS_K;
        int i13 = iArr[i2];
        cArr[m + 1] = (char) ((byte) (i13 >> 8));
        cArr[m + 2] = (char) ((byte) i13);
        cArr[m + 3] = '-';
        int i14 = iArr[i3];
        cArr[m + 4] = (char) ((byte) (i14 >> 8));
        cArr[m + 5] = (char) ((byte) i14);
        int i15 = m + 6;
        if (z) {
            i10 = 84;
        } else {
            i10 = 32;
        }
        cArr[i15] = (char) ((byte) i10);
        int i16 = iArr[i4];
        cArr[m + 7] = (char) ((byte) (i16 >> 8));
        cArr[m + 8] = (char) ((byte) i16);
        cArr[m + 9] = f7l.CONDITION_IF_MIDDLE;
        int i17 = iArr[i5];
        cArr[m + 10] = (char) ((byte) (i17 >> 8));
        cArr[m + 11] = (char) ((byte) i17);
        cArr[m + 12] = f7l.CONDITION_IF_MIDDLE;
        int i18 = iArr[i6];
        cArr[m + 13] = (char) ((byte) (i18 >> 8));
        cArr[m + 14] = (char) ((byte) i18);
        int i19 = m + 15;
        if (i7 > 0) {
            int i20 = m + 16;
            cArr[i19] = '.';
            int i21 = i7 / 10;
            int i22 = i21 / 10;
            if (i7 - (i21 * 10) != 0) {
                int i23 = iArr[i7];
                cArr[i20] = (char) ((byte) (i23 >> 16));
                cArr[m + 17] = (char) ((byte) (i23 >> 8));
                cArr[m + 18] = (char) ((byte) i23);
                i19 = m + 19;
            } else if (i21 - (i22 * 10) != 0) {
                int i24 = iArr[i21];
                cArr[i20] = (char) ((byte) (i24 >> 8));
                cArr[m + 17] = (char) ((byte) i24);
                i19 = m + 18;
            } else {
                i19 = m + 17;
                cArr[i20] = (char) ((byte) (i22 + 48));
            }
        }
        if (z) {
            int i25 = i8 / ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT;
            if (i8 == 0) {
                cArr[i19] = 'Z';
                i19++;
            } else {
                int abs = Math.abs(i25);
                if (i25 >= 0) {
                    c2 = '+';
                }
                cArr[i19] = c2;
                int i26 = iArr[abs];
                cArr[i19 + 1] = (char) ((byte) (i26 >> 8));
                cArr[i19 + 2] = (char) ((byte) i26);
                cArr[i19 + 3] = f7l.CONDITION_IF_MIDDLE;
                int i27 = (i8 - (i25 * ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT)) / 60;
                if (i27 < 0) {
                    i27 = -i27;
                }
                int i28 = iArr[i27];
                cArr[i19 + 4] = (char) ((byte) (i28 >> 8));
                cArr[i19 + 5] = (char) ((byte) i28);
                i19 += 6;
            }
        }
        cArr[i19] = c;
        this.i = i19 + 1;
    }

    public final void w2(String str) {
        boolean z;
        boolean z2;
        int i;
        int length = str.length();
        long j = this.f2458a.c;
        if ((JSONWriter.Feature.EscapeNoneAscii.mask & j) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((j & JSONWriter.Feature.BrowserSecure.mask) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i2 = this.i;
        v2((length * 6) + i2 + 2);
        char[] cArr = this.q;
        int i3 = i2 + 1;
        char c = this.f;
        cArr[i2] = c;
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (charAt != '\"') {
                char[] cArr2 = JSONWriter.p;
                if (!(charAt == '<' || charAt == '>')) {
                    if (charAt != '\\') {
                        switch (charAt) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                cArr[i3] = '\\';
                                cArr[i3 + 1] = 'u';
                                cArr[i3 + 2] = '0';
                                cArr[i3 + 3] = '0';
                                cArr[i3 + 4] = '0';
                                cArr[i3 + 5] = (char) (charAt + '0');
                                i3 += 6;
                            case '\b':
                                cArr[i3] = '\\';
                                cArr[i3 + 1] = 'b';
                                break;
                            case '\t':
                                cArr[i3] = '\\';
                                cArr[i3 + 1] = 't';
                                break;
                            case '\n':
                                cArr[i3] = '\\';
                                cArr[i3 + 1] = 'n';
                                break;
                            case 11:
                            case 14:
                            case 15:
                                cArr[i3] = '\\';
                                cArr[i3 + 1] = 'u';
                                cArr[i3 + 2] = '0';
                                cArr[i3 + 3] = '0';
                                cArr[i3 + 4] = '0';
                                cArr[i3 + 5] = (char) (charAt + ohh.LEVEL_W);
                                i3 += 6;
                            case '\f':
                                cArr[i3] = '\\';
                                cArr[i3 + 1] = 'f';
                                break;
                            case '\r':
                                cArr[i3] = '\\';
                                cArr[i3 + 1] = 'r';
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
                                cArr[i3] = '\\';
                                cArr[i3 + 1] = 'u';
                                cArr[i3 + 2] = '0';
                                cArr[i3 + 3] = '0';
                                cArr[i3 + 4] = '1';
                                cArr[i3 + 5] = (char) (charAt + ' ');
                                i3 += 6;
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                                cArr[i3] = '\\';
                                cArr[i3 + 1] = 'u';
                                cArr[i3 + 2] = '0';
                                cArr[i3 + 3] = '0';
                                cArr[i3 + 4] = '1';
                                cArr[i3 + 5] = (char) (charAt + 'G');
                                i3 += 6;
                            default:
                                switch (charAt) {
                                    case '\'':
                                        break;
                                    case '(':
                                    case ')':
                                        break;
                                    default:
                                        if (!z || charAt <= 127) {
                                            i = i3 + 1;
                                            cArr[i3] = charAt;
                                            i3 = i;
                                        } else {
                                            cArr[i3] = '\\';
                                            cArr[i3 + 1] = 'u';
                                            cArr[i3 + 2] = cArr2[(charAt >>> '\f') & 15];
                                            cArr[i3 + 3] = cArr2[(charAt >>> '\b') & 15];
                                            cArr[i3 + 4] = cArr2[(charAt >>> 4) & 15];
                                            cArr[i3 + 5] = cArr2[charAt & 15];
                                            i3 += 6;
                                        }
                                        break;
                                }
                        }
                    } else {
                        cArr[i3] = '\\';
                        cArr[i3 + 1] = charAt;
                    }
                    i3 += 2;
                }
                if (z2) {
                    cArr[i3] = '\\';
                    cArr[i3 + 1] = 'u';
                    cArr[i3 + 2] = '0';
                    cArr[i3 + 3] = '0';
                    cArr[i3 + 4] = cArr2[(charAt >>> 4) & 15];
                    cArr[i3 + 5] = cArr2[charAt & 15];
                    i3 += 6;
                } else {
                    i = i3 + 1;
                    cArr[i3] = charAt;
                    i3 = i;
                }
            }
            if (charAt == c) {
                cArr[i3] = '\\';
                i3++;
            }
            i = i3 + 1;
            cArr[i3] = charAt;
            i3 = i;
        }
        cArr[i3] = c;
        this.i = i3 + 1;
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
        int i2 = i + 24;
        if (z) {
            i2 = i + 26;
        }
        if (i2 >= this.q.length) {
            v2(i2);
        }
        char[] cArr = this.q;
        if (z) {
            cArr[i] = '\"';
            i++;
        }
        int c = i + ot7.c(d, cArr, i, true);
        if (z) {
            cArr[c] = '\"';
            c++;
        }
        this.i = c;
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
        int i2 = i + 15;
        if (z) {
            i2 = i + 17;
        }
        v2(i2);
        char[] cArr = this.q;
        if (z) {
            cArr[i] = '\"';
            i++;
        }
        int e = i + ot7.e(f, cArr, i, true);
        if (z) {
            cArr[e] = '\"';
            e++;
        }
        this.i = e;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void x1(int i, int i2, int i3) {
        int i4 = this.i;
        int i5 = i4 + 13;
        if (i5 >= this.q.length) {
            v2(i5);
        }
        char[] cArr = this.q;
        char c = this.f;
        cArr[i4] = c;
        int q = b2d.q(cArr, i4 + 1, i, i2, i3);
        cArr[q] = c;
        this.i = q + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void y1(int i, int i2, int i3) {
        int i4 = this.i;
        int i5 = i4 + 10;
        if (i5 >= this.q.length) {
            v2(i5);
        }
        char[] cArr = this.q;
        char c = this.f;
        cArr[i4] = c;
        if (i < 0 || i > 9999) {
            throw new IllegalArgumentException("Only 4 digits numbers are supported. Provided: " + i);
        }
        int i6 = i / 1000;
        int[] iArr = b2d.DIGITS_K;
        int i7 = iArr[i - (i6 * 1000)];
        cArr[i4 + 1] = (char) ((byte) (i6 + 48));
        cArr[i4 + 2] = (char) ((byte) (i7 >> 16));
        cArr[i4 + 3] = (char) ((byte) (i7 >> 8));
        cArr[i4 + 4] = (char) ((byte) i7);
        int i8 = iArr[i2];
        cArr[i4 + 5] = (char) ((byte) (i8 >> 8));
        cArr[i4 + 6] = (char) ((byte) i8);
        int i9 = iArr[i3];
        cArr[i4 + 7] = (char) ((byte) (i9 >> 8));
        cArr[i4 + 8] = (char) ((byte) i9);
        cArr[i4 + 9] = c;
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
            if (scale >= this.q.length) {
                v2(scale);
            }
            char[] cArr = this.q;
            if (z) {
                cArr[i] = '\"';
                i++;
            }
            if ((j2 & JSONWriter.Feature.WriteBigDecimalAsPlain.mask) != 0) {
                str = bigDecimal.toPlainString();
            } else {
                str = bigDecimal.toString();
            }
            str.getChars(0, str.length(), cArr, i);
            int length = i + str.length();
            if (z) {
                cArr[length] = '\"';
                length++;
            }
            this.i = length;
        }
    }
}
