package com.loc;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ga {
    static final Charset c = Charset.forName("UTF-8");
    static final /* synthetic */ boolean p = true;

    /* renamed from: a  reason: collision with root package name */
    ByteBuffer f5718a;
    int b;
    int d;
    int[] e;
    int f;
    boolean g;
    boolean h;
    int i;
    int[] j;
    int k;
    int l;
    boolean m;
    CharsetEncoder n;
    ByteBuffer o;

    private ga() {
        this.d = 1;
        this.e = null;
        this.f = 0;
        this.g = false;
        this.h = false;
        this.j = new int[16];
        this.k = 0;
        this.l = 0;
        this.m = false;
        this.n = c.newEncoder();
        this.b = 1024;
        this.f5718a = d(1024);
    }

    private int c(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        a((byte) 0);
        a(1, remaining, 1);
        ByteBuffer byteBuffer2 = this.f5718a;
        int i = this.b - remaining;
        this.b = i;
        byteBuffer2.position(i);
        this.f5718a.put(byteBuffer);
        return a();
    }

    private int d() {
        return this.f5718a.capacity() - this.b;
    }

    private void e() {
        if (!this.h) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    private void f() {
        if (this.g) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    private void g(int i) {
        c(4, 0);
        f(i);
    }

    private void h(int i) {
        this.e[i] = d();
    }

    public final int a() {
        if (this.g) {
            this.g = false;
            f(this.l);
            return d();
        }
        throw new AssertionError("FlatBuffers: endVector called without startVector");
    }

    public final int b() {
        int i;
        if (this.e == null || !this.g) {
            throw new AssertionError("FlatBuffers: endObject called without startObject");
        }
        g(0);
        int d = d();
        for (int i2 = this.f - 1; i2 >= 0; i2--) {
            int i3 = this.e[i2];
            b((short) (i3 != 0 ? d - i3 : 0));
        }
        b((short) (d - this.i));
        b((short) ((this.f + 2) * 2));
        int i4 = 0;
        loop1: while (true) {
            if (i4 >= this.k) {
                i = 0;
                break;
            }
            int capacity = this.f5718a.capacity() - this.j[i4];
            int i5 = this.b;
            short s = this.f5718a.getShort(capacity);
            if (s == this.f5718a.getShort(i5)) {
                for (int i6 = 2; i6 < s; i6 += 2) {
                    if (this.f5718a.getShort(capacity + i6) == this.f5718a.getShort(i5 + i6)) {
                    }
                }
                i = this.j[i4];
                break loop1;
            }
            i4++;
        }
        if (i != 0) {
            int capacity2 = this.f5718a.capacity() - d;
            this.b = capacity2;
            this.f5718a.putInt(capacity2, i - d);
        } else {
            int i7 = this.k;
            int[] iArr = this.j;
            if (i7 == iArr.length) {
                this.j = Arrays.copyOf(iArr, i7 * 2);
            }
            int[] iArr2 = this.j;
            int i8 = this.k;
            this.k = i8 + 1;
            iArr2[i8] = d();
            ByteBuffer byteBuffer = this.f5718a;
            byteBuffer.putInt(byteBuffer.capacity() - d, d() - d);
        }
        this.g = false;
        return d;
    }

    public ga(ByteBuffer byteBuffer) {
        this.d = 1;
        this.e = null;
        this.f = 0;
        this.g = false;
        this.h = false;
        this.j = new int[16];
        this.k = 0;
        this.l = 0;
        this.m = false;
        this.n = c.newEncoder();
        a(byteBuffer);
    }

    private static ByteBuffer b(ByteBuffer byteBuffer) {
        int capacity = byteBuffer.capacity();
        if (((-1073741824) & capacity) == 0) {
            int i = capacity << 1;
            byteBuffer.position(0);
            ByteBuffer d = d(i);
            d.position(i - capacity);
            d.put(byteBuffer);
            return d;
        }
        throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
    }

    private static ByteBuffer d(int i) {
        ByteBuffer allocate = ByteBuffer.allocate(i);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        return allocate;
    }

    private void e(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            ByteBuffer byteBuffer = this.f5718a;
            int i3 = this.b - 1;
            this.b = i3;
            byteBuffer.put(i3, (byte) 0);
        }
    }

    private void f(int i) {
        ByteBuffer byteBuffer = this.f5718a;
        int i2 = this.b - 4;
        this.b = i2;
        byteBuffer.putInt(i2, i);
    }

    public int a(CharSequence charSequence) {
        int length = (int) (charSequence.length() * this.n.maxBytesPerChar());
        ByteBuffer byteBuffer = this.o;
        if (byteBuffer == null || byteBuffer.capacity() < length) {
            this.o = ByteBuffer.allocate(Math.max(128, length));
        }
        this.o.clear();
        CoderResult encode = this.n.encode(charSequence instanceof CharBuffer ? (CharBuffer) charSequence : CharBuffer.wrap(charSequence), this.o, true);
        if (encode.isError()) {
            try {
                encode.throwException();
            } catch (CharacterCodingException e) {
                throw new Error(e);
            }
        }
        this.o.flip();
        return c(this.o);
    }

    public final void c(int i) {
        c(this.d, 4);
        a(i);
        this.f5718a.position(this.b);
        this.h = true;
    }

    private void b(byte b) {
        ByteBuffer byteBuffer = this.f5718a;
        int i = this.b - 1;
        this.b = i;
        byteBuffer.put(i, b);
    }

    private void c(int i, int i2) {
        if (i > this.d) {
            this.d = i;
        }
        int i3 = ((~((this.f5718a.capacity() - this.b) + i2)) + 1) & (i - 1);
        while (this.b < i3 + i + i2) {
            int capacity = this.f5718a.capacity();
            ByteBuffer b = b(this.f5718a);
            this.f5718a = b;
            this.b += b.capacity() - capacity;
        }
        e(i3);
    }

    private byte[] d(int i, int i2) {
        e();
        byte[] bArr = new byte[i2];
        this.f5718a.position(i);
        this.f5718a.get(bArr);
        return bArr;
    }

    public final ga a(ByteBuffer byteBuffer) {
        this.f5718a = byteBuffer;
        byteBuffer.clear();
        this.f5718a.order(ByteOrder.LITTLE_ENDIAN);
        this.d = 1;
        this.b = this.f5718a.capacity();
        this.f = 0;
        this.g = false;
        this.h = false;
        this.i = 0;
        this.k = 0;
        this.l = 0;
        return this;
    }

    private void c(boolean z) {
        c(1, 0);
        b(z);
    }

    public final void a(byte b) {
        c(1, 0);
        b(b);
    }

    public final void b(int i) {
        f();
        int[] iArr = this.e;
        if (iArr == null || iArr.length < i) {
            this.e = new int[i];
        }
        this.f = i;
        Arrays.fill(this.e, 0, i, 0);
        this.g = true;
        this.i = d();
    }

    public final void a(int i) {
        c(4, 0);
        if (p || i <= d()) {
            f((d() - i) + 4);
            return;
        }
        throw new AssertionError();
    }

    public final void b(int i, int i2) {
        if (this.m || i2 != 0) {
            a(i2);
            h(i);
        }
    }

    public final byte[] c() {
        return d(this.b, this.f5718a.capacity() - this.b);
    }

    private void b(long j) {
        c(8, 0);
        a(j);
    }

    public final void a(int i, byte b) {
        if (this.m || b != 0) {
            a(b);
            h(i);
        }
    }

    private void b(short s) {
        c(2, 0);
        a(s);
    }

    public final void a(int i, int i2) {
        if (this.m || i2 != 0) {
            g(i2);
            h(i);
        }
    }

    private void b(boolean z) {
        ByteBuffer byteBuffer = this.f5718a;
        int i = this.b - 1;
        this.b = i;
        byteBuffer.put(i, z ? (byte) 1 : (byte) 0);
    }

    public final void a(int i, int i2, int i3) {
        f();
        this.l = i2;
        int i4 = i * i2;
        c(4, i4);
        c(i3, i4);
        this.g = true;
    }

    public final void a(int i, long j) {
        if (this.m || j != 0) {
            b(j);
            h(i);
        }
    }

    public final void a(int i, short s) {
        if (this.m || s != 0) {
            b(s);
            h(i);
        }
    }

    private void a(long j) {
        ByteBuffer byteBuffer = this.f5718a;
        int i = this.b - 8;
        this.b = i;
        byteBuffer.putLong(i, j);
    }

    private void a(short s) {
        ByteBuffer byteBuffer = this.f5718a;
        int i = this.b - 2;
        this.b = i;
        byteBuffer.putShort(i, s);
    }

    public final void a(boolean z) {
        if (this.m || z) {
            c(z);
            h(0);
        }
    }
}
