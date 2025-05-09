package com.xiaomi.push;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.io.InputStream;
import java.util.Vector;
import tb.c0z;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private int f14770a;

    /* renamed from: a  reason: collision with other field name */
    private final InputStream f759a;

    /* renamed from: a  reason: collision with other field name */
    private final byte[] f760a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;

    private b(InputStream inputStream) {
        this.f = Integer.MAX_VALUE;
        this.h = 64;
        this.i = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        this.f760a = new byte[4096];
        this.f14770a = 0;
        this.c = 0;
        this.f759a = inputStream;
    }

    public byte a() {
        if (this.c == this.f14770a) {
            a(true);
        }
        byte[] bArr = this.f760a;
        int i = this.c;
        this.c = i + 1;
        return bArr[i];
    }

    /* renamed from: b  reason: collision with other method in class */
    public int m500b() {
        return d();
    }

    public int c() {
        return d();
    }

    public int d() {
        int i;
        byte a2 = a();
        if (a2 >= 0) {
            return a2;
        }
        int i2 = a2 & Byte.MAX_VALUE;
        byte a3 = a();
        if (a3 >= 0) {
            i = a3 << 7;
        } else {
            i2 |= (a3 & Byte.MAX_VALUE) << 7;
            byte a4 = a();
            if (a4 >= 0) {
                i = a4 << 14;
            } else {
                i2 |= (a4 & Byte.MAX_VALUE) << 14;
                byte a5 = a();
                if (a5 >= 0) {
                    i = a5 << 21;
                } else {
                    int i3 = i2 | ((a5 & Byte.MAX_VALUE) << 21);
                    byte a6 = a();
                    int i4 = i3 | (a6 << 28);
                    if (a6 >= 0) {
                        return i4;
                    }
                    for (int i5 = 0; i5 < 5; i5++) {
                        if (a() >= 0) {
                            return i4;
                        }
                    }
                    throw d.c();
                }
            }
        }
        return i2 | i;
    }

    public int e() {
        return (a() & 255) | ((a() & 255) << 8) | ((a() & 255) << 16) | ((a() & 255) << 24);
    }

    private b(byte[] bArr, int i, int i2) {
        this.f = Integer.MAX_VALUE;
        this.h = 64;
        this.i = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        this.f760a = bArr;
        this.f14770a = i2 + i;
        this.c = i;
        this.f759a = null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public int m491a() {
        if (m502b()) {
            this.d = 0;
            return 0;
        }
        int d = d();
        this.d = d;
        if (d != 0) {
            return d;
        }
        throw d.d();
    }

    /* renamed from: b  reason: collision with other method in class */
    public long m501b() {
        return m503c();
    }

    /* renamed from: c  reason: collision with other method in class */
    public long m503c() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte a2 = a();
            j |= (a2 & Byte.MAX_VALUE) << i;
            if ((a2 & c0z.STATE) == 0) {
                return j;
            }
        }
        throw d.c();
    }

    /* renamed from: d  reason: collision with other method in class */
    public long m504d() {
        byte a2 = a();
        byte a3 = a();
        return ((a3 & 255) << 8) | (a2 & 255) | ((a() & 255) << 16) | ((a() & 255) << 24) | ((a() & 255) << 32) | ((a() & 255) << 40) | ((a() & 255) << 48) | ((a() & 255) << 56);
    }

    private void b() {
        int i = this.f14770a + this.b;
        this.f14770a = i;
        int i2 = this.e + i;
        int i3 = this.f;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.b = i4;
            this.f14770a = i - i4;
            return;
        }
        this.b = 0;
    }

    public int a(int i) {
        if (i >= 0) {
            int i2 = i + this.e + this.c;
            int i3 = this.f;
            if (i2 <= i3) {
                this.f = i2;
                b();
                return i3;
            }
            throw d.a();
        }
        throw d.b();
    }

    public void c(int i) {
        if (i >= 0) {
            int i2 = this.e;
            int i3 = this.c;
            int i4 = i2 + i3 + i;
            int i5 = this.f;
            if (i4 <= i5) {
                int i6 = this.f14770a;
                if (i <= i6 - i3) {
                    this.c = i3 + i;
                    return;
                }
                int i7 = i6 - i3;
                this.e = i2 + i6;
                this.c = 0;
                this.f14770a = 0;
                while (i7 < i) {
                    InputStream inputStream = this.f759a;
                    int skip = inputStream == null ? -1 : (int) inputStream.skip(i - i7);
                    if (skip > 0) {
                        i7 += skip;
                        this.e += skip;
                    } else {
                        throw d.a();
                    }
                }
                return;
            }
            c((i5 - i2) - i3);
            throw d.a();
        }
        throw d.b();
    }

    /* renamed from: a  reason: collision with other method in class */
    public long m492a() {
        return m503c();
    }

    public void b(int i) {
        this.f = i;
        b();
    }

    /* renamed from: a  reason: collision with other method in class */
    public a m493a() {
        int d = d();
        int i = this.f14770a;
        int i2 = this.c;
        if (d > i - i2 || d <= 0) {
            return a.a(m499a(d));
        }
        a a2 = a.a(this.f760a, i2, d);
        this.c += d;
        return a2;
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m502b() {
        return this.c == this.f14770a && !a(false);
    }

    public static b a(InputStream inputStream) {
        return new b(inputStream);
    }

    public static b a(byte[] bArr, int i, int i2) {
        return new b(bArr, i, i2);
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m494a() {
        int d = d();
        int i = this.f14770a;
        int i2 = this.c;
        if (d > i - i2 || d <= 0) {
            return new String(m499a(d), "UTF-8");
        }
        String str = new String(this.f760a, i2, d, "UTF-8");
        this.c += d;
        return str;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m495a() {
        int a2;
        do {
            a2 = m491a();
            if (a2 == 0) {
                return;
            }
        } while (m498a(a2));
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m496a(int i) {
        if (this.d != i) {
            throw d.e();
        }
    }

    public void a(e eVar) {
        int d = d();
        if (this.g < this.h) {
            int a2 = a(d);
            this.g++;
            eVar.a(this);
            m496a(0);
            this.g--;
            b(a2);
            return;
        }
        throw d.g();
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m497a() {
        return d() != 0;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m498a(int i) {
        int a2 = f.a(i);
        if (a2 == 0) {
            m500b();
            return true;
        } else if (a2 == 1) {
            m504d();
            return true;
        } else if (a2 == 2) {
            c(d());
            return true;
        } else if (a2 == 3) {
            m495a();
            m496a(f.a(f.b(i), 4));
            return true;
        } else if (a2 == 4) {
            return false;
        } else {
            if (a2 == 5) {
                e();
                return true;
            }
            throw d.f();
        }
    }

    private boolean a(boolean z) {
        int i = this.c;
        int i2 = this.f14770a;
        if (i >= i2) {
            int i3 = this.e;
            if (i3 + i2 != this.f) {
                this.e = i3 + i2;
                this.c = 0;
                InputStream inputStream = this.f759a;
                int read = inputStream == null ? -1 : inputStream.read(this.f760a);
                this.f14770a = read;
                if (read == 0 || read < -1) {
                    throw new IllegalStateException("InputStream#read(byte[]) returned invalid result: " + this.f14770a + "\nThe InputStream implementation is buggy.");
                } else if (read == -1) {
                    this.f14770a = 0;
                    if (!z) {
                        return false;
                    }
                    throw d.a();
                } else {
                    b();
                    int i4 = this.e + this.f14770a + this.b;
                    if (i4 <= this.i && i4 >= 0) {
                        return true;
                    }
                    throw d.h();
                }
            } else if (!z) {
                return false;
            } else {
                throw d.a();
            }
        } else {
            throw new IllegalStateException("refillBuffer() called when buffer wasn't empty.");
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public byte[] m499a(int i) {
        if (i >= 0) {
            int i2 = this.e;
            int i3 = this.c;
            int i4 = i2 + i3 + i;
            int i5 = this.f;
            if (i4 <= i5) {
                int i6 = this.f14770a;
                if (i <= i6 - i3) {
                    byte[] bArr = new byte[i];
                    System.arraycopy(this.f760a, i3, bArr, 0, i);
                    this.c += i;
                    return bArr;
                } else if (i < 4096) {
                    byte[] bArr2 = new byte[i];
                    int i7 = i6 - i3;
                    System.arraycopy(this.f760a, i3, bArr2, 0, i7);
                    this.c = this.f14770a;
                    while (true) {
                        a(true);
                        int i8 = i - i7;
                        int i9 = this.f14770a;
                        if (i8 > i9) {
                            System.arraycopy(this.f760a, 0, bArr2, i7, i9);
                            int i10 = this.f14770a;
                            i7 += i10;
                            this.c = i10;
                        } else {
                            System.arraycopy(this.f760a, 0, bArr2, i7, i8);
                            this.c = i8;
                            return bArr2;
                        }
                    }
                } else {
                    this.e = i2 + i6;
                    this.c = 0;
                    this.f14770a = 0;
                    int i11 = i6 - i3;
                    int i12 = i - i11;
                    Vector vector = new Vector();
                    while (i12 > 0) {
                        int min = Math.min(i12, 4096);
                        byte[] bArr3 = new byte[min];
                        int i13 = 0;
                        while (i13 < min) {
                            InputStream inputStream = this.f759a;
                            int read = inputStream == null ? -1 : inputStream.read(bArr3, i13, min - i13);
                            if (read != -1) {
                                this.e += read;
                                i13 += read;
                            } else {
                                throw d.a();
                            }
                        }
                        i12 -= min;
                        vector.addElement(bArr3);
                    }
                    byte[] bArr4 = new byte[i];
                    System.arraycopy(this.f760a, i3, bArr4, 0, i11);
                    for (int i14 = 0; i14 < vector.size(); i14++) {
                        byte[] bArr5 = (byte[]) vector.elementAt(i14);
                        System.arraycopy(bArr5, 0, bArr4, i11, bArr5.length);
                        i11 += bArr5.length;
                    }
                    return bArr4;
                }
            } else {
                c((i5 - i2) - i3);
                throw d.a();
            }
        } else {
            throw d.b();
        }
    }
}
