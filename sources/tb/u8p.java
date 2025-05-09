package tb;

import javax.annotation.Nullable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class u8p {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f29231a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public u8p f;
    public u8p g;

    public u8p() {
        this.f29231a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public final void a() {
        int i;
        u8p u8pVar = this.g;
        if (u8pVar == this) {
            throw new IllegalStateException();
        } else if (u8pVar.e) {
            int i2 = this.c - this.b;
            int i3 = 8192 - u8pVar.c;
            if (u8pVar.d) {
                i = 0;
            } else {
                i = u8pVar.b;
            }
            if (i2 <= i3 + i) {
                f(u8pVar, i2);
                b();
                y8p.a(this);
            }
        }
    }

    @Nullable
    public final u8p b() {
        u8p u8pVar;
        u8p u8pVar2 = this.f;
        if (u8pVar2 != this) {
            u8pVar = u8pVar2;
        } else {
            u8pVar = null;
        }
        u8p u8pVar3 = this.g;
        u8pVar3.f = u8pVar2;
        this.f.g = u8pVar3;
        this.f = null;
        this.g = null;
        return u8pVar;
    }

    public final u8p c(u8p u8pVar) {
        u8pVar.g = this;
        u8pVar.f = this.f;
        this.f.g = u8pVar;
        this.f = u8pVar;
        return u8pVar;
    }

    public final u8p d() {
        this.d = true;
        return new u8p(this.f29231a, this.b, this.c, true, false);
    }

    public final u8p e(int i) {
        u8p u8pVar;
        if (i <= 0 || i > this.c - this.b) {
            throw new IllegalArgumentException();
        }
        if (i >= 1024) {
            u8pVar = d();
        } else {
            u8pVar = y8p.b();
            System.arraycopy(this.f29231a, this.b, u8pVar.f29231a, 0, i);
        }
        u8pVar.c = u8pVar.b + i;
        this.b += i;
        this.g.c(u8pVar);
        return u8pVar;
    }

    public final void f(u8p u8pVar, int i) {
        if (u8pVar.e) {
            int i2 = u8pVar.c;
            int i3 = i2 + i;
            byte[] bArr = u8pVar.f29231a;
            if (i3 > 8192) {
                if (!u8pVar.d) {
                    int i4 = u8pVar.b;
                    if (i3 - i4 <= 8192) {
                        System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
                        u8pVar.c -= u8pVar.b;
                        u8pVar.b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f29231a, this.b, bArr, u8pVar.c, i);
            u8pVar.c += i;
            this.b += i;
            return;
        }
        throw new IllegalArgumentException();
    }

    public u8p(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f29231a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }
}
