package com.meizu.cloud.pushsdk.e.h;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import tb.c0z;
import tb.f7l;
import tb.tck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class b implements d, c, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f5839a = {48, 49, 50, 51, 52, 53, 54, 55, c0z.MAP32, 57, 97, 98, 99, 100, 101, 102};
    j b;
    long c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(b.this.c, 2147483647L);
        }

        @Override // java.io.InputStream
        public int read() {
            b bVar = b.this;
            if (bVar.c > 0) {
                return bVar.i() & 255;
            }
            return -1;
        }

        public String toString() {
            return b.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            return b.this.b(bArr, i, i2);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    @Override // com.meizu.cloud.pushsdk.e.h.c
    public long a(m mVar) throws IOException {
        if (mVar != null) {
            long j = 0;
            while (true) {
                long b = mVar.b(this, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX);
                if (b == -1) {
                    return j;
                }
                j += b;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    public int b(byte[] bArr, int i, int i2) {
        o.a(bArr.length, i, i2);
        j jVar = this.b;
        if (jVar == null) {
            return -1;
        }
        int min = Math.min(i2, jVar.c - jVar.b);
        System.arraycopy(jVar.f5849a, jVar.b, bArr, i, min);
        int i3 = jVar.b + min;
        jVar.b = i3;
        this.c -= min;
        if (i3 == jVar.c) {
            this.b = jVar.b();
            k.a(jVar);
        }
        return min;
    }

    @Override // com.meizu.cloud.pushsdk.e.h.c
    public b c() {
        return this;
    }

    /* renamed from: d */
    public b a(long j) {
        boolean z;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return b(48);
        }
        int i2 = 1;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                return a("-9223372036854775808");
            }
            z = true;
        } else {
            z = false;
        }
        if (j >= 100000000) {
            i2 = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i2 = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i2 = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i2 = 2;
        }
        if (z) {
            i2++;
        }
        j a2 = a(i2);
        byte[] bArr = a2.f5849a;
        int i3 = a2.c + i2;
        while (j != 0) {
            i3--;
            bArr[i3] = f5839a[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i3 - 1] = 45;
        }
        a2.c += i2;
        this.c += i2;
        return this;
    }

    public b e(long j) {
        if (j == 0) {
            return b(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        j a2 = a(numberOfTrailingZeros);
        byte[] bArr = a2.f5849a;
        int i = a2.c;
        for (int i2 = (i + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f5839a[(int) (15 & j)];
            j >>>= 4;
        }
        a2.c += numberOfTrailingZeros;
        this.c += numberOfTrailingZeros;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        long j = this.c;
        if (j != bVar.c) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        j jVar = this.b;
        j jVar2 = bVar.b;
        int i = jVar.b;
        int i2 = jVar2.b;
        while (j2 < this.c) {
            long min = Math.min(jVar.c - i, jVar2.c - i2);
            int i3 = 0;
            while (i3 < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (jVar.f5849a[i] != jVar2.f5849a[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == jVar.c) {
                jVar = jVar.f;
                i = jVar.b;
            }
            if (i2 == jVar2.c) {
                jVar2 = jVar2.f;
                i2 = jVar2.b;
            }
            j2 += min;
        }
        return true;
    }

    /* renamed from: f */
    public b clone() {
        b bVar = new b();
        if (this.c == 0) {
            return bVar;
        }
        j jVar = new j(this.b);
        bVar.b = jVar;
        jVar.g = jVar;
        jVar.f = jVar;
        j jVar2 = this.b;
        while (true) {
            jVar2 = jVar2.f;
            if (jVar2 != this.b) {
                bVar.b.g.a(new j(jVar2));
            } else {
                bVar.c = this.c;
                return bVar;
            }
        }
    }

    public long g() {
        long j = this.c;
        if (j == 0) {
            return 0L;
        }
        j jVar = this.b.g;
        int i = jVar.c;
        if (i >= 2048 || !jVar.e) {
            return j;
        }
        return j - (i - jVar.b);
    }

    public boolean h() {
        if (this.c == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        j jVar = this.b;
        if (jVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = jVar.c;
            for (int i3 = jVar.b; i3 < i2; i3++) {
                i = (i * 31) + jVar.f5849a[i3];
            }
            jVar = jVar.f;
        } while (jVar != this.b);
        return i;
    }

    public byte i() {
        long j = this.c;
        if (j != 0) {
            j jVar = this.b;
            int i = jVar.b;
            int i2 = jVar.c;
            int i3 = i + 1;
            byte b = jVar.f5849a[i];
            this.c = j - 1;
            if (i3 == i2) {
                this.b = jVar.b();
                k.a(jVar);
            } else {
                jVar.b = i3;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    public e j() {
        return new e(b());
    }

    public long k() {
        return this.c;
    }

    public String toString() {
        long j = this.c;
        if (j == 0) {
            return "Buffer[size=0]";
        }
        if (j <= 16) {
            e j2 = clone().j();
            long j3 = this.c;
            String a2 = j2.a();
            return "Buffer[size=" + j3 + " data=" + a2 + "]";
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            j jVar = this.b;
            byte[] bArr = jVar.f5849a;
            int i = jVar.b;
            instance.update(bArr, i, jVar.c - i);
            j jVar2 = this.b;
            while (true) {
                jVar2 = jVar2.f;
                if (jVar2 != this.b) {
                    byte[] bArr2 = jVar2.f5849a;
                    int i2 = jVar2.b;
                    instance.update(bArr2, i2, jVar2.c - i2);
                } else {
                    long j4 = this.c;
                    String a3 = e.a(instance.digest()).a();
                    return "Buffer[size=" + j4 + " md5=" + a3 + "]";
                }
            }
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    public b a(String str, int i, int i2) {
        char charAt;
        int i3;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + i);
        } else if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        } else if (i2 <= str.length()) {
            while (i < i2) {
                char charAt2 = str.charAt(i);
                if (charAt2 < 128) {
                    j a2 = a(1);
                    byte[] bArr = a2.f5849a;
                    int i4 = a2.c - i;
                    int min = Math.min(i2, 2048 - i4);
                    i++;
                    bArr[i + i4] = (byte) charAt2;
                    while (i < min && (charAt = str.charAt(i)) < 128) {
                        i++;
                        bArr[i + i4] = (byte) charAt;
                    }
                    int i5 = a2.c;
                    int i6 = (i4 + i) - i5;
                    a2.c = i5 + i6;
                    this.c += i6;
                } else {
                    if (charAt2 < 2048) {
                        i3 = (charAt2 >> 6) | tck.DETECT_WIDTH;
                    } else if (charAt2 < 55296 || charAt2 > 57343) {
                        b((charAt2 >> '\f') | 224);
                        i3 = ((charAt2 >> 6) & 63) | 128;
                    } else {
                        int i7 = i + 1;
                        char charAt3 = i7 < i2 ? str.charAt(i7) : (char) 0;
                        if (charAt2 > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                            b(63);
                            i = i7;
                        } else {
                            int i8 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + 65536;
                            b((i8 >> 18) | 240);
                            b(((i8 >> 12) & 63) | 128);
                            b(((i8 >> 6) & 63) | 128);
                            b((i8 & 63) | 128);
                            i += 2;
                        }
                    }
                    b(i3);
                    b((charAt2 & f7l.CONDITION_IF) | 128);
                    i++;
                }
            }
            return this;
        } else {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
    }

    @Override // com.meizu.cloud.pushsdk.e.h.m
    public long b(b bVar, long j) {
        if (bVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j >= 0) {
            long j2 = this.c;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            bVar.a(this, j);
            return j;
        } else {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
    }

    public b c(int i) {
        int i2;
        int i3;
        if (i >= 128) {
            if (i < 2048) {
                i3 = (i >> 6) | tck.DETECT_WIDTH;
            } else {
                if (i < 65536) {
                    if (i < 55296 || i > 57343) {
                        i2 = (i >> 12) | 224;
                    } else {
                        throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
                    }
                } else if (i <= 1114111) {
                    b((i >> 18) | 240);
                    i2 = ((i >> 12) & 63) | 128;
                } else {
                    throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
                }
                b(i2);
                i3 = ((i >> 6) & 63) | 128;
            }
            b(i3);
            i = (i & 63) | 128;
        }
        b(i);
        return this;
    }

    @Override // com.meizu.cloud.pushsdk.e.h.d
    public InputStream d() {
        return new a();
    }

    public void e() {
        try {
            c(this.c);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public b b(int i) {
        j a2 = a(1);
        byte[] bArr = a2.f5849a;
        int i2 = a2.c;
        a2.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.c++;
        return this;
    }

    /* renamed from: c */
    public b a(byte[] bArr) {
        if (bArr != null) {
            return a(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: b */
    public b a(e eVar) {
        if (eVar != null) {
            eVar.a(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    /* renamed from: c */
    public b a(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = i2;
            o.a(bArr.length, i, j);
            int i3 = i2 + i;
            while (i < i3) {
                j a2 = a(1);
                int min = Math.min(i3 - i, 2048 - a2.c);
                System.arraycopy(bArr, i, a2.f5849a, a2.c, min);
                i += min;
                a2.c += min;
            }
            this.c += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: b */
    public b a(String str) {
        return a(str, 0, str.length());
    }

    public void c(long j) throws EOFException {
        j jVar;
        while (j > 0) {
            if (this.b != null) {
                int min = (int) Math.min(j, jVar.c - jVar.b);
                long j2 = min;
                this.c -= j2;
                j -= j2;
                j jVar2 = this.b;
                int i = jVar2.b + min;
                jVar2.b = i;
                if (i == jVar2.c) {
                    this.b = jVar2.b();
                    k.a(jVar2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public void b(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int b = b(bArr, i, bArr.length - i);
            if (b != -1) {
                i += b;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // com.meizu.cloud.pushsdk.e.h.d
    public byte[] b() {
        try {
            return b(this.c);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public j a(int i) {
        if (i < 1 || i > 2048) {
            throw new IllegalArgumentException();
        }
        j jVar = this.b;
        if (jVar == null) {
            j a2 = k.a();
            this.b = a2;
            a2.g = a2;
            a2.f = a2;
            return a2;
        }
        j jVar2 = jVar.g;
        return (jVar2.c + i > 2048 || !jVar2.e) ? jVar2.a(k.a()) : jVar2;
    }

    public byte[] b(long j) throws EOFException {
        o.a(this.c, 0L, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[(int) j];
            b(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
    }

    @Override // com.meizu.cloud.pushsdk.e.h.d
    public String a() {
        try {
            return a(this.c, o.f5852a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public String a(long j, Charset charset) throws EOFException {
        o.a(this.c, 0L, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        } else if (j == 0) {
            return "";
        } else {
            j jVar = this.b;
            int i = jVar.b;
            if (i + j > jVar.c) {
                return new String(b(j), charset);
            }
            String str = new String(jVar.f5849a, i, (int) j, charset);
            int i2 = (int) (jVar.b + j);
            jVar.b = i2;
            this.c -= j;
            if (i2 == jVar.c) {
                this.b = jVar.b();
                k.a(jVar);
            }
            return str;
        }
    }

    @Override // com.meizu.cloud.pushsdk.e.h.l
    public void a(b bVar, long j) {
        if (bVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (bVar != this) {
            o.a(bVar.c, 0L, j);
            while (j > 0) {
                j jVar = bVar.b;
                if (j < jVar.c - jVar.b) {
                    j jVar2 = this.b;
                    j jVar3 = jVar2 != null ? jVar2.g : null;
                    if (jVar3 != null && jVar3.e) {
                        if ((jVar3.c + j) - (jVar3.d ? 0 : jVar3.b) <= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) {
                            jVar.a(jVar3, (int) j);
                            bVar.c -= j;
                            this.c += j;
                            return;
                        }
                    }
                    bVar.b = jVar.a((int) j);
                }
                j jVar4 = bVar.b;
                long j2 = jVar4.c - jVar4.b;
                bVar.b = jVar4.b();
                j jVar5 = this.b;
                if (jVar5 == null) {
                    this.b = jVar4;
                    jVar4.g = jVar4;
                    jVar4.f = jVar4;
                } else {
                    jVar5.g.a(jVar4).a();
                }
                bVar.c -= j2;
                this.c += j2;
                j -= j2;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    @Override // com.meizu.cloud.pushsdk.e.h.m, java.io.Closeable, java.lang.AutoCloseable, com.meizu.cloud.pushsdk.e.h.l
    public void close() {
    }

    @Override // com.meizu.cloud.pushsdk.e.h.l, java.io.Flushable
    public void flush() {
    }
}
