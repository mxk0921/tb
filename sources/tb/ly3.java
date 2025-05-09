package tb;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ly3 {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f23635a;
    public final int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g = Integer.MAX_VALUE;
    public int h;

    public ly3(byte[] bArr, int i, int i2) {
        this.f23635a = bArr;
        this.b = i;
        this.c = i2 + i;
        this.e = i;
    }

    public static int b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static ly3 f(byte[] bArr, int i, int i2) {
        return new ly3(bArr, i, i2);
    }

    public long A() throws IOException {
        return w();
    }

    public int B() throws IOException {
        return b(x());
    }

    public long C() throws IOException {
        return c(y());
    }

    public String D() throws IOException {
        int x = x();
        int i = this.c;
        int i2 = this.e;
        if (x > i - i2 || x <= 0) {
            return new String(u(x), hjf.f20682a);
        }
        String str = new String(this.f23635a, i2, x, hjf.f20682a);
        this.e += x;
        return str;
    }

    public int E() throws IOException {
        if (e()) {
            this.f = 0;
            return 0;
        }
        int x = x();
        this.f = x;
        if (x != 0) {
            return x;
        }
        throw InvalidProtocolBufferNanoException.invalidTag();
    }

    public int F() throws IOException {
        return x();
    }

    public long G() throws IOException {
        return y();
    }

    public final void H() {
        int i = this.c + this.d;
        this.c = i;
        int i2 = this.g;
        if (i > i2) {
            int i3 = i - i2;
            this.d = i3;
            this.c = i - i3;
            return;
        }
        this.d = 0;
    }

    public void I(int i) {
        int i2 = this.e;
        int i3 = this.b;
        if (i > i2 - i3) {
            throw new IllegalArgumentException("Position " + i + " is beyond current " + (this.e - i3));
        } else if (i >= 0) {
            this.e = i3 + i;
        } else {
            throw new IllegalArgumentException("Bad position " + i);
        }
    }

    public boolean J(int i) throws IOException {
        int c = hix.c(i);
        if (c == 0) {
            p();
            return true;
        } else if (c == 1) {
            w();
            return true;
        } else if (c == 2) {
            L(x());
            return true;
        } else if (c == 3) {
            K();
            a(hix.d(hix.b(i), 4));
            return true;
        } else if (c == 4) {
            return false;
        } else {
            if (c == 5) {
                v();
                return true;
            }
            throw InvalidProtocolBufferNanoException.invalidWireType();
        }
    }

    public void K() throws IOException {
        int E;
        do {
            E = E();
            if (E == 0) {
                return;
            }
        } while (J(E));
    }

    public void L(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.e;
            int i3 = i2 + i;
            int i4 = this.g;
            if (i3 > i4) {
                L(i4 - i2);
                throw InvalidProtocolBufferNanoException.truncatedMessage();
            } else if (i <= this.c - i2) {
                this.e = i2 + i;
            } else {
                throw InvalidProtocolBufferNanoException.truncatedMessage();
            }
        } else {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
    }

    public void a(int i) throws InvalidProtocolBufferNanoException {
        if (this.f != i) {
            throw InvalidProtocolBufferNanoException.invalidEndTag();
        }
    }

    public int d() {
        return this.e - this.b;
    }

    public boolean e() {
        if (this.e == this.c) {
            return true;
        }
        return false;
    }

    public void g(int i) {
        this.g = i;
        H();
    }

    public int h(int i) throws InvalidProtocolBufferNanoException {
        if (i >= 0) {
            int i2 = i + this.e;
            int i3 = this.g;
            if (i2 <= i3) {
                this.g = i2;
                H();
                return i3;
            }
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        throw InvalidProtocolBufferNanoException.negativeSize();
    }

    public boolean i() throws IOException {
        if (x() != 0) {
            return true;
        }
        return false;
    }

    public byte[] j() throws IOException {
        int x = x();
        int i = this.c;
        int i2 = this.e;
        if (x <= i - i2 && x > 0) {
            byte[] bArr = new byte[x];
            System.arraycopy(this.f23635a, i2, bArr, 0, x);
            this.e += x;
            return bArr;
        } else if (x == 0) {
            return hix.EMPTY_BYTES;
        } else {
            return u(x);
        }
    }

    public double k() throws IOException {
        return Double.longBitsToDouble(w());
    }

    public int l() throws IOException {
        return x();
    }

    public int m() throws IOException {
        return v();
    }

    public long n() throws IOException {
        return w();
    }

    public float o() throws IOException {
        return Float.intBitsToFloat(v());
    }

    public int p() throws IOException {
        return x();
    }

    public long q() throws IOException {
        return y();
    }

    public void r(MessageNano messageNano) throws IOException {
        int x = x();
        if (this.h < 64) {
            int h = h(x);
            this.h++;
            messageNano.mergeFrom(this);
            a(0);
            this.h--;
            g(h);
            return;
        }
        throw InvalidProtocolBufferNanoException.recursionLimitExceeded();
    }

    public Object s(int i) throws IOException {
        switch (i) {
            case 1:
                return Double.valueOf(k());
            case 2:
                return Float.valueOf(o());
            case 3:
                return Long.valueOf(q());
            case 4:
                return Long.valueOf(G());
            case 5:
                return Integer.valueOf(p());
            case 6:
                return Long.valueOf(n());
            case 7:
                return Integer.valueOf(m());
            case 8:
                return Boolean.valueOf(i());
            case 9:
                return D();
            case 10:
            case 11:
            default:
                throw new IllegalArgumentException("Unknown type " + i);
            case 12:
                return j();
            case 13:
                return Integer.valueOf(F());
            case 14:
                return Integer.valueOf(l());
            case 15:
                return Integer.valueOf(z());
            case 16:
                return Long.valueOf(A());
            case 17:
                return Integer.valueOf(B());
            case 18:
                return Long.valueOf(C());
        }
    }

    public byte t() throws IOException {
        int i = this.e;
        if (i != this.c) {
            this.e = i + 1;
            return this.f23635a[i];
        }
        throw InvalidProtocolBufferNanoException.truncatedMessage();
    }

    public byte[] u(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.e;
            int i3 = i2 + i;
            int i4 = this.g;
            if (i3 > i4) {
                L(i4 - i2);
                throw InvalidProtocolBufferNanoException.truncatedMessage();
            } else if (i <= this.c - i2) {
                byte[] bArr = new byte[i];
                System.arraycopy(this.f23635a, i2, bArr, 0, i);
                this.e += i;
                return bArr;
            } else {
                throw InvalidProtocolBufferNanoException.truncatedMessage();
            }
        } else {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
    }

    public int v() throws IOException {
        return (t() & 255) | ((t() & 255) << 8) | ((t() & 255) << 16) | ((t() & 255) << 24);
    }

    public long w() throws IOException {
        byte t = t();
        byte t2 = t();
        return ((t2 & 255) << 8) | (t & 255) | ((t() & 255) << 16) | ((t() & 255) << 24) | ((t() & 255) << 32) | ((t() & 255) << 40) | ((t() & 255) << 48) | ((t() & 255) << 56);
    }

    public int x() throws IOException {
        int i;
        byte t = t();
        if (t >= 0) {
            return t;
        }
        int i2 = t & Byte.MAX_VALUE;
        byte t2 = t();
        if (t2 >= 0) {
            i = t2 << 7;
        } else {
            i2 |= (t2 & Byte.MAX_VALUE) << 7;
            byte t3 = t();
            if (t3 >= 0) {
                i = t3 << 14;
            } else {
                i2 |= (t3 & Byte.MAX_VALUE) << 14;
                byte t4 = t();
                if (t4 >= 0) {
                    i = t4 << 21;
                } else {
                    int i3 = i2 | ((t4 & Byte.MAX_VALUE) << 21);
                    byte t5 = t();
                    int i4 = i3 | (t5 << 28);
                    if (t5 >= 0) {
                        return i4;
                    }
                    for (int i5 = 0; i5 < 5; i5++) {
                        if (t() >= 0) {
                            return i4;
                        }
                    }
                    throw InvalidProtocolBufferNanoException.malformedVarint();
                }
            }
        }
        return i2 | i;
    }

    public long y() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte t = t();
            j |= (t & Byte.MAX_VALUE) << i;
            if ((t & c0z.STATE) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferNanoException.malformedVarint();
    }

    public int z() throws IOException {
        return v();
    }
}
