package com.google.protobuf.nano;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import tb.cq1;
import tb.f7l;
import tb.hix;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class CodedOutputByteBufferNano {
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    public static final int LITTLE_ENDIAN_64_SIZE = 8;

    /* renamed from: a  reason: collision with root package name */
    public final ByteBuffer f5208a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException(int i, int i2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + i + " limit " + i2 + ").");
        }
    }

    public CodedOutputByteBufferNano(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    public static int A(long j) {
        return u(M(j));
    }

    public static int B(int i, String str) {
        return D(i) + C(str);
    }

    public static int C(String str) {
        int N = N(str);
        return t(N) + N;
    }

    public static int D(int i) {
        return t(hix.d(i, 0));
    }

    public static int E(int i, int i2) {
        return D(i) + F(i2);
    }

    public static int F(int i) {
        return t(i);
    }

    public static int G(int i, long j) {
        return D(i) + H(j);
    }

    public static int H(long j) {
        return u(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int I(java.lang.CharSequence r7, byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.nano.CodedOutputByteBufferNano.I(java.lang.CharSequence, byte[], int, int):int");
    }

    public static void J(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        } else if (byteBuffer.hasArray()) {
            try {
                byteBuffer.position(I(charSequence, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()) - byteBuffer.arrayOffset());
            } catch (ArrayIndexOutOfBoundsException e) {
                BufferOverflowException bufferOverflowException = new BufferOverflowException();
                bufferOverflowException.initCause(e);
                throw bufferOverflowException;
            }
        } else {
            K(charSequence, byteBuffer);
        }
    }

    public static void K(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < 128) {
                byteBuffer.put((byte) charAt);
            } else if (charAt < 2048) {
                byteBuffer.put((byte) ((charAt >>> 6) | 960));
                byteBuffer.put((byte) ((charAt & f7l.CONDITION_IF) | 128));
            } else if (charAt < 55296 || 57343 < charAt) {
                byteBuffer.put((byte) ((charAt >>> '\f') | 480));
                byteBuffer.put((byte) (((charAt >>> 6) & 63) | 128));
                byteBuffer.put((byte) ((charAt & f7l.CONDITION_IF) | 128));
            } else {
                int i2 = i + 1;
                if (i2 != charSequence.length()) {
                    char charAt2 = charSequence.charAt(i2);
                    if (Character.isSurrogatePair(charAt, charAt2)) {
                        int codePoint = Character.toCodePoint(charAt, charAt2);
                        byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                        byteBuffer.put((byte) (((codePoint >>> 12) & 63) | 128));
                        byteBuffer.put((byte) (((codePoint >>> 6) & 63) | 128));
                        byteBuffer.put((byte) ((codePoint & 63) | 128));
                        i = i2;
                    } else {
                        i = i2;
                    }
                }
                StringBuilder sb = new StringBuilder("Unpaired surrogate at index ");
                sb.append(i - 1);
                throw new IllegalArgumentException(sb.toString());
            }
            i++;
        }
    }

    public static int L(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long M(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int N(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (true) {
            if (i < length) {
                char charAt = charSequence.charAt(i);
                if (charAt >= 2048) {
                    i2 += O(charSequence, i);
                    break;
                }
                i2 += (127 - charAt) >>> 31;
                i++;
            } else {
                break;
            }
        }
        if (i2 >= length) {
            return i2;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i2 + 4294967296L));
    }

    public static int O(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i) >= 65536) {
                        i++;
                    } else {
                        throw new IllegalArgumentException("Unpaired surrogate at index " + i);
                    }
                }
            }
            i++;
        }
        return i2;
    }

    public static CodedOutputByteBufferNano P(byte[] bArr, int i, int i2) {
        return new CodedOutputByteBufferNano(bArr, i, i2);
    }

    public static int b(int i, boolean z) {
        return D(i) + 1;
    }

    public static int c(int i, byte[] bArr) {
        return D(i) + d(bArr);
    }

    public static int d(byte[] bArr) {
        return t(bArr.length) + bArr.length;
    }

    public static int e(int i, double d) {
        return D(i) + 8;
    }

    public static int f(int i, int i2) {
        return D(i) + g(i2);
    }

    public static int g(int i) {
        return t(i);
    }

    public static int h(int i, int i2, Object obj) {
        switch (i2) {
            case 1:
                return e(i, ((Double) obj).doubleValue());
            case 2:
                return k(i, ((Float) obj).floatValue());
            case 3:
                return p(i, ((Long) obj).longValue());
            case 4:
                return G(i, ((Long) obj).longValue());
            case 5:
                return n(i, ((Integer) obj).intValue());
            case 6:
                return j(i, ((Long) obj).longValue());
            case 7:
                return i(i, ((Integer) obj).intValue());
            case 8:
                return b(i, ((Boolean) obj).booleanValue());
            case 9:
                return B(i, (String) obj);
            case 10:
                return l(i, (MessageNano) obj);
            case 11:
                return r(i, (MessageNano) obj);
            case 12:
                return c(i, (byte[]) obj);
            case 13:
                return E(i, ((Integer) obj).intValue());
            case 14:
                return f(i, ((Integer) obj).intValue());
            case 15:
                return v(i, ((Integer) obj).intValue());
            case 16:
                return w(i, ((Long) obj).longValue());
            case 17:
                return x(i, ((Integer) obj).intValue());
            case 18:
                return z(i, ((Long) obj).longValue());
            default:
                throw new IllegalArgumentException("Unknown type: " + i2);
        }
    }

    public static int i(int i, int i2) {
        return D(i) + 4;
    }

    public static int j(int i, long j) {
        return D(i) + 8;
    }

    public static int k(int i, float f) {
        return D(i) + 4;
    }

    public static int l(int i, MessageNano messageNano) {
        return (D(i) * 2) + m(messageNano);
    }

    public static int m(MessageNano messageNano) {
        return messageNano.getSerializedSize();
    }

    public static int n(int i, int i2) {
        return D(i) + o(i2);
    }

    public static int o(int i) {
        if (i >= 0) {
            return t(i);
        }
        return 10;
    }

    public static int p(int i, long j) {
        return D(i) + q(j);
    }

    public static int q(long j) {
        return u(j);
    }

    public static int r(int i, MessageNano messageNano) {
        return D(i) + s(messageNano);
    }

    public static int s(MessageNano messageNano) {
        int serializedSize = messageNano.getSerializedSize();
        return t(serializedSize) + serializedSize;
    }

    public static int t(int i) {
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

    public static int u(long j) {
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

    public static int v(int i, int i2) {
        return D(i) + 4;
    }

    public static int w(int i, long j) {
        return D(i) + 8;
    }

    public static int x(int i, int i2) {
        return D(i) + y(i2);
    }

    public static int y(int i) {
        return t(L(i));
    }

    public static int z(int i, long j) {
        return D(i) + A(j);
    }

    public void A0(int i, int i2) throws IOException {
        G0(i, 0);
        B0(i2);
    }

    public void B0(int i) throws IOException {
        u0(L(i));
    }

    public void C0(int i, long j) throws IOException {
        G0(i, 0);
        D0(j);
    }

    public void D0(long j) throws IOException {
        v0(M(j));
    }

    public void E0(int i, String str) throws IOException {
        G0(i, 2);
        F0(str);
    }

    public void F0(String str) throws IOException {
        ByteBuffer byteBuffer = this.f5208a;
        try {
            int t = t(str.length());
            if (t == t(str.length() * 3)) {
                int position = byteBuffer.position();
                if (byteBuffer.remaining() >= t) {
                    byteBuffer.position(position + t);
                    J(str, byteBuffer);
                    int position2 = byteBuffer.position();
                    byteBuffer.position(position);
                    u0((position2 - position) - t);
                    byteBuffer.position(position2);
                    return;
                }
                throw new OutOfSpaceException(position + t, byteBuffer.limit());
            }
            u0(N(str));
            J(str, byteBuffer);
        } catch (BufferOverflowException e) {
            OutOfSpaceException outOfSpaceException = new OutOfSpaceException(byteBuffer.position(), byteBuffer.limit());
            outOfSpaceException.initCause(e);
            throw outOfSpaceException;
        }
    }

    public void G0(int i, int i2) throws IOException {
        u0(hix.d(i, i2));
    }

    public void H0(int i, int i2) throws IOException {
        G0(i, 0);
        I0(i2);
    }

    public void I0(int i) throws IOException {
        u0(i);
    }

    public void J0(int i, long j) throws IOException {
        G0(i, 0);
        K0(j);
    }

    public void K0(long j) throws IOException {
        v0(j);
    }

    public int Q() {
        return this.f5208a.remaining();
    }

    public void R(int i, boolean z) throws IOException {
        G0(i, 0);
        S(z);
    }

    public void S(boolean z) throws IOException {
        p0(z ? 1 : 0);
    }

    public void T(int i, byte[] bArr) throws IOException {
        G0(i, 2);
        U(bArr);
    }

    public void U(byte[] bArr) throws IOException {
        u0(bArr.length);
        q0(bArr);
    }

    public void V(int i, double d) throws IOException {
        G0(i, 1);
        W(d);
    }

    public void W(double d) throws IOException {
        t0(Double.doubleToLongBits(d));
    }

    public void X(int i, int i2) throws IOException {
        G0(i, 0);
        Y(i2);
    }

    public void Y(int i) throws IOException {
        u0(i);
    }

    public void Z(int i, int i2, Object obj) throws IOException {
        switch (i2) {
            case 1:
                V(i, ((Double) obj).doubleValue());
                return;
            case 2:
                e0(i, ((Float) obj).floatValue());
                return;
            case 3:
                k0(i, ((Long) obj).longValue());
                return;
            case 4:
                J0(i, ((Long) obj).longValue());
                return;
            case 5:
                i0(i, ((Integer) obj).intValue());
                return;
            case 6:
                c0(i, ((Long) obj).longValue());
                return;
            case 7:
                a0(i, ((Integer) obj).intValue());
                return;
            case 8:
                R(i, ((Boolean) obj).booleanValue());
                return;
            case 9:
                E0(i, (String) obj);
                return;
            case 10:
                g0(i, (MessageNano) obj);
                return;
            case 11:
                m0(i, (MessageNano) obj);
                return;
            case 12:
                T(i, (byte[]) obj);
                return;
            case 13:
                H0(i, ((Integer) obj).intValue());
                return;
            case 14:
                X(i, ((Integer) obj).intValue());
                return;
            case 15:
                w0(i, ((Integer) obj).intValue());
                return;
            case 16:
                y0(i, ((Long) obj).longValue());
                return;
            case 17:
                A0(i, ((Integer) obj).intValue());
                return;
            case 18:
                C0(i, ((Long) obj).longValue());
                return;
            default:
                throw new IOException("Unknown type: " + i2);
        }
    }

    public void a() {
        if (Q() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public void a0(int i, int i2) throws IOException {
        G0(i, 5);
        b0(i2);
    }

    public void b0(int i) throws IOException {
        s0(i);
    }

    public void c0(int i, long j) throws IOException {
        G0(i, 1);
        d0(j);
    }

    public void d0(long j) throws IOException {
        t0(j);
    }

    public void e0(int i, float f) throws IOException {
        G0(i, 5);
        f0(f);
    }

    public void f0(float f) throws IOException {
        s0(Float.floatToIntBits(f));
    }

    public void g0(int i, MessageNano messageNano) throws IOException {
        G0(i, 3);
        h0(messageNano);
        G0(i, 4);
    }

    public void h0(MessageNano messageNano) throws IOException {
        messageNano.writeTo(this);
    }

    public void i0(int i, int i2) throws IOException {
        G0(i, 0);
        j0(i2);
    }

    public void j0(int i) throws IOException {
        if (i >= 0) {
            u0(i);
        } else {
            v0(i);
        }
    }

    public void k0(int i, long j) throws IOException {
        G0(i, 0);
        l0(j);
    }

    public void l0(long j) throws IOException {
        v0(j);
    }

    public void m0(int i, MessageNano messageNano) throws IOException {
        G0(i, 2);
        n0(messageNano);
    }

    public void n0(MessageNano messageNano) throws IOException {
        u0(messageNano.getCachedSize());
        messageNano.writeTo(this);
    }

    public void o0(byte b) throws IOException {
        ByteBuffer byteBuffer = this.f5208a;
        if (byteBuffer.hasRemaining()) {
            byteBuffer.put(b);
            return;
        }
        throw new OutOfSpaceException(byteBuffer.position(), byteBuffer.limit());
    }

    public void p0(int i) throws IOException {
        o0((byte) i);
    }

    public void q0(byte[] bArr) throws IOException {
        r0(bArr, 0, bArr.length);
    }

    public void r0(byte[] bArr, int i, int i2) throws IOException {
        ByteBuffer byteBuffer = this.f5208a;
        if (byteBuffer.remaining() >= i2) {
            byteBuffer.put(bArr, i, i2);
            return;
        }
        throw new OutOfSpaceException(byteBuffer.position(), byteBuffer.limit());
    }

    public void s0(int i) throws IOException {
        ByteBuffer byteBuffer = this.f5208a;
        if (byteBuffer.remaining() >= 4) {
            byteBuffer.putInt(i);
            return;
        }
        throw new OutOfSpaceException(byteBuffer.position(), byteBuffer.limit());
    }

    public void t0(long j) throws IOException {
        ByteBuffer byteBuffer = this.f5208a;
        if (byteBuffer.remaining() >= 8) {
            byteBuffer.putLong(j);
            return;
        }
        throw new OutOfSpaceException(byteBuffer.position(), byteBuffer.limit());
    }

    public void u0(int i) throws IOException {
        while ((i & cq1.SIGN) != 0) {
            p0((i & 127) | 128);
            i >>>= 7;
        }
        p0(i);
    }

    public void v0(long j) throws IOException {
        while (((-128) & j) != 0) {
            p0((((int) j) & 127) | 128);
            j >>>= 7;
        }
        p0((int) j);
    }

    public void w0(int i, int i2) throws IOException {
        G0(i, 5);
        x0(i2);
    }

    public void x0(int i) throws IOException {
        s0(i);
    }

    public void y0(int i, long j) throws IOException {
        G0(i, 1);
        z0(j);
    }

    public void z0(long j) throws IOException {
        t0(j);
    }

    public CodedOutputByteBufferNano(ByteBuffer byteBuffer) {
        this.f5208a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }
}
