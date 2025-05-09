package tb;

import com.squareup.wire.WireType;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class jix {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f22020a;
    public final int b;
    public int c;

    public jix(byte[] bArr, int i, int i2) {
        this.f22020a = bArr;
        this.c = i;
        this.b = i + i2;
    }

    public static int a(int i) {
        if (i >= 0) {
            return e(i);
        }
        return 10;
    }

    public static int b(int i, WireType wireType) {
        return (i << 3) | wireType.value();
    }

    public static jix c(byte[] bArr) {
        return d(bArr, 0, bArr.length);
    }

    public static jix d(byte[] bArr, int i, int i2) {
        return new jix(bArr, i, i2);
    }

    public static int e(int i) {
        if ((i & cq1.SIGN) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        if ((i & (-268435456)) == 0) {
            return 4;
        }
        return 5;
    }

    public static int f(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        if ((j & Long.MIN_VALUE) == 0) {
            return 9;
        }
        return 10;
    }

    public static int g(int i) {
        return e(b(i, WireType.VARINT));
    }

    public static int r(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long s(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public void h(int i) throws IOException {
        k(i & 255);
        k((i >> 8) & 255);
        k((i >> 16) & 255);
        k((i >> 24) & 255);
    }

    public void i(long j) throws IOException {
        k(((int) j) & 255);
        k(((int) (j >> 8)) & 255);
        k(((int) (j >> 16)) & 255);
        k(((int) (j >> 24)) & 255);
        k(((int) (j >> 32)) & 255);
        k(((int) (j >> 40)) & 255);
        k(((int) (j >> 48)) & 255);
        k(((int) (j >> 56)) & 255);
    }

    public void j(byte b) throws IOException {
        int i = this.c;
        int i2 = this.b;
        if (i != i2) {
            this.c = i + 1;
            this.f22020a[i] = b;
            return;
        }
        throw new IOException("Out of space: position=" + this.c + ", limit=" + i2);
    }

    public void k(int i) throws IOException {
        j((byte) i);
    }

    public void l(byte[] bArr) throws IOException {
        m(bArr, 0, bArr.length);
    }

    public void m(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.c;
        int i4 = this.b;
        if (i4 - i3 >= i2) {
            System.arraycopy(bArr, i, this.f22020a, i3, i2);
            this.c += i2;
            return;
        }
        throw new IOException("Out of space: position=" + this.c + ", limit=" + i4);
    }

    public void n(int i) throws IOException {
        if (i >= 0) {
            p(i);
        } else {
            q(i);
        }
    }

    public void o(int i, WireType wireType) throws IOException {
        p(b(i, wireType));
    }

    public void p(int i) throws IOException {
        while ((i & cq1.SIGN) != 0) {
            k((i & 127) | 128);
            i >>>= 7;
        }
        k(i);
    }

    public void q(long j) throws IOException {
        while (((-128) & j) != 0) {
            k((((int) j) & 127) | 128);
            j >>>= 7;
        }
        k((int) j);
    }
}
