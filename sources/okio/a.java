package okio;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
import tb.a8l;
import tb.c0q;
import tb.cwl;
import tb.f7l;
import tb.fwv;
import tb.kok;
import tb.tck;
import tb.tiv;
import tb.u8p;
import tb.y8p;
import tb.ym2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class a implements BufferedSource, ym2, Cloneable, ByteChannel {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public u8p f15415a;
    public long b;

    public final a A(a aVar, long j, long j2) {
        if (aVar != null) {
            fwv.b(this.b, j, j2);
            if (j2 == 0) {
                return this;
            }
            aVar.b += j2;
            u8p u8pVar = this.f15415a;
            while (true) {
                int i = u8pVar.c;
                int i2 = u8pVar.b;
                if (j >= i - i2) {
                    j -= i - i2;
                    u8pVar = u8pVar.f;
                }
            }
            while (j2 > 0) {
                u8p d = u8pVar.d();
                int i3 = (int) (d.b + j);
                d.b = i3;
                d.c = Math.min(i3 + ((int) j2), d.c);
                u8p u8pVar2 = aVar.f15415a;
                if (u8pVar2 == null) {
                    d.g = d;
                    d.f = d;
                    aVar.f15415a = d;
                } else {
                    u8pVar2.g.c(d);
                }
                j2 -= d.c - d.b;
                u8pVar = u8pVar.f;
                j = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    public a B0(byte[] bArr) {
        if (bArr != null) {
            C0(bArr, 0, bArr.length);
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final byte C(long j) {
        int i;
        fwv.b(this.b, j, 1L);
        long j2 = this.b;
        if (j2 - j > j) {
            u8p u8pVar = this.f15415a;
            while (true) {
                int i2 = u8pVar.c;
                int i3 = u8pVar.b;
                long j3 = i2 - i3;
                if (j < j3) {
                    return u8pVar.f29231a[i3 + ((int) j)];
                }
                j -= j3;
                u8pVar = u8pVar.f;
            }
        } else {
            long j4 = j - j2;
            u8p u8pVar2 = this.f15415a;
            do {
                u8pVar2 = u8pVar2.g;
                int i4 = u8pVar2.c;
                i = u8pVar2.b;
                j4 += i4 - i;
            } while (j4 < 0);
            return u8pVar2.f29231a[i + ((int) j4)];
        }
    }

    public a C0(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = i2;
            fwv.b(bArr.length, i, j);
            int i3 = i2 + i;
            while (i < i3) {
                u8p u0 = u0(1);
                int min = Math.min(i3 - i, 8192 - u0.c);
                System.arraycopy(bArr, i, u0.f29231a, u0.c, min);
                i += min;
                u0.c += min;
            }
            this.b += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public a D0(int i) {
        u8p u0 = u0(1);
        int i2 = u0.c;
        u0.c = i2 + 1;
        u0.f29231a[i2] = (byte) i;
        this.b++;
        return this;
    }

    public a E0(int i) {
        u8p u0 = u0(4);
        int i2 = u0.c;
        byte[] bArr = u0.f29231a;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        u0.c = i2 + 4;
        this.b += 4;
        return this;
    }

    public long F(ByteString byteString, long j) {
        int i;
        int i2;
        long j2 = 0;
        if (j >= 0) {
            u8p u8pVar = this.f15415a;
            if (u8pVar == null) {
                return -1L;
            }
            long j3 = this.b;
            if (j3 - j < j) {
                while (j3 > j) {
                    u8pVar = u8pVar.g;
                    j3 -= u8pVar.c - u8pVar.b;
                }
            } else {
                while (true) {
                    long j4 = (u8pVar.c - u8pVar.b) + j2;
                    if (j4 >= j) {
                        break;
                    }
                    u8pVar = u8pVar.f;
                    j2 = j4;
                }
                j3 = j2;
            }
            if (byteString.size() == 2) {
                byte b = byteString.getByte(0);
                byte b2 = byteString.getByte(1);
                while (j3 < this.b) {
                    byte[] bArr = u8pVar.f29231a;
                    i = (int) ((u8pVar.b + j) - j3);
                    int i3 = u8pVar.c;
                    while (i < i3) {
                        byte b3 = bArr[i];
                        if (b3 == b || b3 == b2) {
                            i2 = u8pVar.b;
                            return (i - i2) + j3;
                        }
                        i++;
                    }
                    j3 += u8pVar.c - u8pVar.b;
                    u8pVar = u8pVar.f;
                    j = j3;
                }
                return -1L;
            }
            byte[] internalArray = byteString.internalArray();
            while (j3 < this.b) {
                byte[] bArr2 = u8pVar.f29231a;
                i = (int) ((u8pVar.b + j) - j3);
                int i4 = u8pVar.c;
                while (i < i4) {
                    byte b4 = bArr2[i];
                    for (byte b5 : internalArray) {
                        if (b4 == b5) {
                            i2 = u8pVar.b;
                            return (i - i2) + j3;
                        }
                    }
                    i++;
                }
                j3 += u8pVar.c - u8pVar.b;
                u8pVar = u8pVar.f;
                j = j3;
            }
            return -1L;
        }
        throw new IllegalArgumentException("fromIndex < 0");
    }

    public ByteString L() {
        return new ByteString(readByteArray());
    }

    public a L0(String str) {
        M0(str, 0, str.length());
        return this;
    }

    public a M0(String str, int i, int i2) {
        char c;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i);
        } else if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        } else if (i2 <= str.length()) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    u8p u0 = u0(1);
                    int i3 = u0.c - i;
                    int min = Math.min(i2, 8192 - i3);
                    int i4 = i + 1;
                    byte[] bArr = u0.f29231a;
                    bArr[i + i3] = (byte) charAt;
                    while (i4 < min) {
                        char charAt2 = str.charAt(i4);
                        if (charAt2 >= 128) {
                            break;
                        }
                        bArr[i4 + i3] = (byte) charAt2;
                        i4++;
                    }
                    int i5 = u0.c;
                    int i6 = (i3 + i4) - i5;
                    u0.c = i5 + i6;
                    this.b += i6;
                    i = i4;
                } else {
                    if (charAt < 2048) {
                        D0((charAt >> 6) | tck.DETECT_WIDTH);
                        D0((charAt & f7l.CONDITION_IF) | 128);
                    } else if (charAt < 55296 || charAt > 57343) {
                        D0((charAt >> '\f') | 224);
                        D0(((charAt >> 6) & 63) | 128);
                        D0((charAt & f7l.CONDITION_IF) | 128);
                    } else {
                        int i7 = i + 1;
                        if (i7 < i2) {
                            c = str.charAt(i7);
                        } else {
                            c = 0;
                        }
                        if (charAt > 56319 || c < 56320 || c > 57343) {
                            D0(63);
                            i = i7;
                        } else {
                            int i8 = (((charAt & 10239) << 10) | (9215 & c)) + 65536;
                            D0((i8 >> 18) | 240);
                            D0(((i8 >> 12) & 63) | 128);
                            D0(((i8 >> 6) & 63) | 128);
                            D0((i8 & 63) | 128);
                            i += 2;
                        }
                    }
                    i++;
                }
            }
            return this;
        } else {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
    }

    @Override // okio.BufferedSource
    public long S(c0q c0qVar) throws IOException {
        long j = this.b;
        if (j > 0) {
            c0qVar.y0(this, j);
        }
        return j;
    }

    @Override // tb.y9q
    public long X(a aVar, long j) {
        if (aVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j >= 0) {
            long j2 = this.b;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            aVar.y0(this, j);
            return j;
        } else {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
    }

    public void Z(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read != -1) {
                i += read;
            } else {
                throw new EOFException();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
        if (r19 == false) goto L_0x0058;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
        return r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int c0(tb.a8l r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 158
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.a.c0(tb.a8l, boolean):int");
    }

    public final void e() {
        try {
            skip(this.b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        long j = this.b;
        if (j != aVar.b) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        u8p u8pVar = this.f15415a;
        u8p u8pVar2 = aVar.f15415a;
        int i = u8pVar.b;
        int i2 = u8pVar2.b;
        while (j2 < this.b) {
            long min = Math.min(u8pVar.c - i, u8pVar2.c - i2);
            int i3 = 0;
            while (i3 < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (u8pVar.f29231a[i] != u8pVar2.f29231a[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == u8pVar.c) {
                u8pVar = u8pVar.f;
                i = u8pVar.b;
            }
            if (i2 == u8pVar2.c) {
                u8pVar2 = u8pVar2.f;
                i2 = u8pVar2.b;
            }
            j2 += min;
        }
        return true;
    }

    @Override // okio.BufferedSource
    public boolean exhausted() {
        if (this.b == 0) {
            return true;
        }
        return false;
    }

    public final long f0() {
        return this.b;
    }

    /* renamed from: g */
    public a clone() {
        a aVar = new a();
        if (this.b == 0) {
            return aVar;
        }
        u8p d = this.f15415a.d();
        aVar.f15415a = d;
        d.g = d;
        d.f = d;
        u8p u8pVar = this.f15415a;
        while (true) {
            u8pVar = u8pVar.f;
            if (u8pVar != this.f15415a) {
                aVar.f15415a.g.c(u8pVar.d());
            } else {
                aVar.b = this.b;
                return aVar;
            }
        }
    }

    public int hashCode() {
        u8p u8pVar = this.f15415a;
        if (u8pVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = u8pVar.c;
            for (int i3 = u8pVar.b; i3 < i2; i3++) {
                i = (i * 31) + u8pVar.f29231a[i3];
            }
            u8pVar = u8pVar.f;
        } while (u8pVar != this.f15415a);
        return i;
    }

    @Override // okio.BufferedSource
    public long i(ByteString byteString) {
        return F(byteString, 0L);
    }

    public final ByteString i0() {
        long j = this.b;
        if (j <= 2147483647L) {
            return n0((int) j);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.b);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // tb.ym2
    public /* bridge */ /* synthetic */ ym2 l(String str, int i, int i2) throws IOException {
        M0(str, i, i2);
        return this;
    }

    public final ByteString n0(int i) {
        if (i == 0) {
            return ByteString.EMPTY;
        }
        return new SegmentedByteString(this, i);
    }

    @Override // okio.BufferedSource
    public BufferedSource peek() {
        return kok.a(new cwl(this));
    }

    public int read(byte[] bArr, int i, int i2) {
        fwv.b(bArr.length, i, i2);
        u8p u8pVar = this.f15415a;
        if (u8pVar == null) {
            return -1;
        }
        int min = Math.min(i2, u8pVar.c - u8pVar.b);
        System.arraycopy(u8pVar.f29231a, u8pVar.b, bArr, i, min);
        int i3 = u8pVar.b + min;
        u8pVar.b = i3;
        this.b -= min;
        if (i3 == u8pVar.c) {
            this.f15415a = u8pVar.b();
            y8p.a(u8pVar);
        }
        return min;
    }

    @Override // okio.BufferedSource
    public byte readByte() {
        long j = this.b;
        if (j != 0) {
            u8p u8pVar = this.f15415a;
            int i = u8pVar.b;
            int i2 = u8pVar.c;
            int i3 = i + 1;
            byte b = u8pVar.f29231a[i];
            this.b = j - 1;
            if (i3 == i2) {
                this.f15415a = u8pVar.b();
                y8p.a(u8pVar);
            } else {
                u8pVar.b = i3;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    public byte[] readByteArray() {
        try {
            return readByteArray(this.b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // okio.BufferedSource
    public ByteString readByteString(long j) throws EOFException {
        return new ByteString(readByteArray(j));
    }

    public int readInt() {
        long j = this.b;
        if (j >= 4) {
            u8p u8pVar = this.f15415a;
            int i = u8pVar.b;
            int i2 = u8pVar.c;
            if (i2 - i < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = u8pVar.f29231a;
            int i3 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24);
            int i4 = i + 3;
            int i5 = i + 4;
            int i6 = i3 | ((bArr[i + 2] & 255) << 8) | (bArr[i4] & 255);
            this.b = j - 4;
            if (i5 == i2) {
                this.f15415a = u8pVar.b();
                y8p.a(u8pVar);
            } else {
                u8pVar.b = i5;
            }
            return i6;
        }
        throw new IllegalStateException("size < 4: " + this.b);
    }

    @Override // okio.BufferedSource
    public int readIntLe() {
        return fwv.c(readInt());
    }

    public long readLong() {
        long j = this.b;
        if (j >= 8) {
            u8p u8pVar = this.f15415a;
            int i = u8pVar.b;
            int i2 = u8pVar.c;
            if (i2 - i < 8) {
                return ((readInt() & tiv.INT_MASK) << 32) | (tiv.INT_MASK & readInt());
            }
            byte[] bArr = u8pVar.f29231a;
            long j2 = ((bArr[i + 1] & 255) << 48) | ((bArr[i] & 255) << 56) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24);
            int i3 = i + 7;
            int i4 = i + 8;
            long j3 = j2 | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8) | (bArr[i3] & 255);
            this.b = j - 8;
            if (i4 == i2) {
                this.f15415a = u8pVar.b();
                y8p.a(u8pVar);
            } else {
                u8pVar.b = i4;
            }
            return j3;
        }
        throw new IllegalStateException("size < 8: " + this.b);
    }

    @Override // okio.BufferedSource
    public long readLongLe() {
        return fwv.d(readLong());
    }

    @Override // okio.BufferedSource
    public String readString(long j, Charset charset) throws EOFException {
        fwv.b(this.b, 0L, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        } else if (j == 0) {
            return "";
        } else {
            u8p u8pVar = this.f15415a;
            int i = u8pVar.b;
            if (i + j > u8pVar.c) {
                return new String(readByteArray(j), charset);
            }
            String str = new String(u8pVar.f29231a, i, (int) j, charset);
            int i2 = (int) (u8pVar.b + j);
            u8pVar.b = i2;
            this.b -= j;
            if (i2 == u8pVar.c) {
                this.f15415a = u8pVar.b();
                y8p.a(u8pVar);
            }
            return str;
        }
    }

    public String readUtf8() {
        try {
            return readString(this.b, fwv.UTF_8);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // okio.BufferedSource
    public boolean request(long j) {
        if (this.b >= j) {
            return true;
        }
        return false;
    }

    @Override // okio.BufferedSource
    public void require(long j) throws EOFException {
        if (this.b < j) {
            throw new EOFException();
        }
    }

    @Override // okio.BufferedSource
    public int s0(a8l a8lVar) {
        int c0 = c0(a8lVar, false);
        if (c0 == -1) {
            return -1;
        }
        try {
            skip(a8lVar.f15597a[c0].size());
            return c0;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    @Override // okio.BufferedSource
    public void skip(long j) throws EOFException {
        u8p u8pVar;
        while (j > 0) {
            if (this.f15415a != null) {
                int min = (int) Math.min(j, u8pVar.c - u8pVar.b);
                long j2 = min;
                this.b -= j2;
                j -= j2;
                u8p u8pVar2 = this.f15415a;
                int i = u8pVar2.b + min;
                u8pVar2.b = i;
                if (i == u8pVar2.c) {
                    this.f15415a = u8pVar2.b();
                    y8p.a(u8pVar2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public String toString() {
        return i0().toString();
    }

    public u8p u0(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        u8p u8pVar = this.f15415a;
        if (u8pVar == null) {
            u8p b = y8p.b();
            this.f15415a = b;
            b.g = b;
            b.f = b;
            return b;
        }
        u8p u8pVar2 = u8pVar.g;
        if (u8pVar2.c + i <= 8192 && u8pVar2.e) {
            return u8pVar2;
        }
        u8p b2 = y8p.b();
        u8pVar2.c(b2);
        return b2;
    }

    public final long w() {
        long j = this.b;
        if (j == 0) {
            return 0L;
        }
        u8p u8pVar = this.f15415a.g;
        int i = u8pVar.c;
        if (i >= 8192 || !u8pVar.e) {
            return j;
        }
        return j - (i - u8pVar.b);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                u8p u0 = u0(1);
                int min = Math.min(i, 8192 - u0.c);
                byteBuffer.get(u0.f29231a, u0.c, min);
                i -= min;
                u0.c += min;
            }
            this.b += remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // tb.ym2
    public /* bridge */ /* synthetic */ ym2 writeByte(int i) throws IOException {
        D0(i);
        return this;
    }

    @Override // tb.ym2
    public /* bridge */ /* synthetic */ ym2 writeUtf8(String str) throws IOException {
        L0(str);
        return this;
    }

    @Override // tb.c0q
    public void y0(a aVar, long j) {
        u8p u8pVar;
        int i;
        if (aVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (aVar != this) {
            fwv.b(aVar.b, 0L, j);
            while (j > 0) {
                u8p u8pVar2 = aVar.f15415a;
                if (j < u8pVar2.c - u8pVar2.b) {
                    u8p u8pVar3 = this.f15415a;
                    if (u8pVar3 != null) {
                        u8pVar = u8pVar3.g;
                    } else {
                        u8pVar = null;
                    }
                    if (u8pVar != null && u8pVar.e) {
                        long j2 = u8pVar.c + j;
                        if (u8pVar.d) {
                            i = 0;
                        } else {
                            i = u8pVar.b;
                        }
                        if (j2 - i <= 8192) {
                            u8pVar2.f(u8pVar, (int) j);
                            aVar.b -= j;
                            this.b += j;
                            return;
                        }
                    }
                    aVar.f15415a = u8pVar2.e((int) j);
                }
                u8p u8pVar4 = aVar.f15415a;
                long j3 = u8pVar4.c - u8pVar4.b;
                aVar.f15415a = u8pVar4.b();
                u8p u8pVar5 = this.f15415a;
                if (u8pVar5 == null) {
                    this.f15415a = u8pVar4;
                    u8pVar4.g = u8pVar4;
                    u8pVar4.f = u8pVar4;
                } else {
                    u8pVar5.g.c(u8pVar4);
                    u8pVar4.a();
                }
                aVar.b -= j3;
                this.b += j3;
                j -= j3;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    public byte[] readByteArray(long j) throws EOFException {
        fwv.b(this.b, 0L, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[(int) j];
            Z(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
    }

    public String readUtf8(long j) throws EOFException {
        return readString(j, fwv.UTF_8);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        u8p u8pVar = this.f15415a;
        if (u8pVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), u8pVar.c - u8pVar.b);
        byteBuffer.put(u8pVar.f29231a, u8pVar.b, min);
        int i = u8pVar.b + min;
        u8pVar.b = i;
        this.b -= min;
        if (i == u8pVar.c) {
            this.f15415a = u8pVar.b();
            y8p.a(u8pVar);
        }
        return min;
    }

    @Override // okio.BufferedSource
    public a buffer() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, tb.c0q
    public void close() {
    }

    @Override // tb.c0q, java.io.Flushable
    public void flush() {
    }
}
