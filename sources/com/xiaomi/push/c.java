package com.xiaomi.push;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import tb.cq1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final int f14793a;

    /* renamed from: a  reason: collision with other field name */
    private final OutputStream f784a;

    /* renamed from: a  reason: collision with other field name */
    private final byte[] f785a;
    private int b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a extends IOException {
        public a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private c(OutputStream outputStream, byte[] bArr) {
        this.f784a = outputStream;
        this.f785a = bArr;
        this.b = 0;
        this.f14793a = bArr.length;
    }

    public static int b(int i) {
        return d(i);
    }

    public static int c(int i) {
        return d(f.a(i, 0));
    }

    public static int d(int i) {
        if ((i & cq1.SIGN) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public int a() {
        if (this.f784a == null) {
            return this.f14793a - this.b;
        }
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array.");
    }

    private c(byte[] bArr, int i, int i2) {
        this.f784a = null;
        this.f785a = bArr;
        this.b = i;
        this.f14793a = i + i2;
    }

    public static int a(int i) {
        if (i >= 0) {
            return d(i);
        }
        return 10;
    }

    public static int b(int i, int i2) {
        return c(i) + b(i2);
    }

    public static int c(long j) {
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
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: d  reason: collision with other method in class */
    public void m547d(int i) {
        while ((i & cq1.SIGN) != 0) {
            m545c((i & 127) | 128);
            i >>>= 7;
        }
        m545c(i);
    }

    public static int a(int i, int i2) {
        return c(i) + a(i2);
    }

    public static int b(int i, long j) {
        return c(i) + b(j);
    }

    private void c() {
        OutputStream outputStream = this.f784a;
        if (outputStream != null) {
            outputStream.write(this.f785a, 0, this.b);
            this.b = 0;
            return;
        }
        throw new a();
    }

    public static int a(int i, long j) {
        return c(i) + a(j);
    }

    public static int b(long j) {
        return c(j);
    }

    /* renamed from: c  reason: collision with other method in class */
    public void m545c(int i) {
        a((byte) i);
    }

    public static int a(int i, com.xiaomi.push.a aVar) {
        return c(i) + a(aVar);
    }

    public void b() {
        if (a() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public void c(int i, int i2) {
        m547d(f.a(i, i2));
    }

    public static int a(int i, e eVar) {
        return c(i) + a(eVar);
    }

    /* renamed from: b  reason: collision with other method in class */
    public void m541b(int i) {
        m547d(i);
    }

    /* renamed from: c  reason: collision with other method in class */
    public void m546c(long j) {
        while (((-128) & j) != 0) {
            m545c((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m545c((int) j);
    }

    public static int a(int i, String str) {
        return c(i) + a(str);
    }

    /* renamed from: b  reason: collision with other method in class */
    public void m542b(int i, int i2) {
        c(i, 0);
        m541b(i2);
    }

    public static int a(int i, boolean z) {
        return c(i) + a(z);
    }

    /* renamed from: b  reason: collision with other method in class */
    public void m543b(int i, long j) {
        c(i, 0);
        m544b(j);
    }

    public static int a(long j) {
        return c(j);
    }

    /* renamed from: b  reason: collision with other method in class */
    public void m544b(long j) {
        m546c(j);
    }

    public static int a(com.xiaomi.push.a aVar) {
        return d(aVar.a()) + aVar.a();
    }

    public static int a(e eVar) {
        int b = eVar.mo668b();
        return d(b) + b;
    }

    public static int a(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return d(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 not supported.");
        }
    }

    public static int a(boolean z) {
        return 1;
    }

    public static c a(OutputStream outputStream) {
        return a(outputStream, 4096);
    }

    public static c a(OutputStream outputStream, int i) {
        return new c(outputStream, new byte[i]);
    }

    public static c a(byte[] bArr, int i, int i2) {
        return new c(bArr, i, i2);
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m527a() {
        if (this.f784a != null) {
            c();
        }
    }

    public void a(byte b) {
        if (this.b == this.f14793a) {
            c();
        }
        byte[] bArr = this.f785a;
        int i = this.b;
        this.b = i + 1;
        bArr[i] = b;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m528a(int i) {
        if (i >= 0) {
            m547d(i);
        } else {
            m546c(i);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m529a(int i, int i2) {
        c(i, 0);
        m528a(i2);
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m530a(int i, long j) {
        c(i, 0);
        m535a(j);
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m531a(int i, com.xiaomi.push.a aVar) {
        c(i, 2);
        m536a(aVar);
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m532a(int i, e eVar) {
        c(i, 2);
        m537a(eVar);
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m533a(int i, String str) {
        c(i, 2);
        m538a(str);
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m534a(int i, boolean z) {
        c(i, 0);
        m539a(z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m535a(long j) {
        m546c(j);
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m536a(com.xiaomi.push.a aVar) {
        byte[] a2 = aVar.m480a();
        m547d(a2.length);
        a(a2);
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m537a(e eVar) {
        m547d(eVar.mo666a());
        eVar.a(this);
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m538a(String str) {
        byte[] bytes = str.getBytes("UTF-8");
        m547d(bytes.length);
        a(bytes);
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m539a(boolean z) {
        m545c(z ? 1 : 0);
    }

    public void a(byte[] bArr) {
        m540a(bArr, 0, bArr.length);
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m540a(byte[] bArr, int i, int i2) {
        int i3 = this.f14793a;
        int i4 = this.b;
        if (i3 - i4 >= i2) {
            System.arraycopy(bArr, i, this.f785a, i4, i2);
            this.b += i2;
            return;
        }
        int i5 = i3 - i4;
        System.arraycopy(bArr, i, this.f785a, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.b = this.f14793a;
        c();
        if (i7 <= this.f14793a) {
            System.arraycopy(bArr, i6, this.f785a, 0, i7);
            this.b = i7;
            return;
        }
        this.f784a.write(bArr, i6, i7);
    }
}
