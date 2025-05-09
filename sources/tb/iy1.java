package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class iy1 {
    public static final int MIME_CHUNK_SIZE = 76;
    public static final int PEM_CHUNK_SIZE = 64;

    /* renamed from: a  reason: collision with root package name */
    public byte[] f21639a;
    public int b;
    public int c;
    public boolean d;
    public int e;

    static {
        t2o.a(612368392);
    }

    public iy1(int i, int i2, int i3, int i4) {
        if (i3 > 0 && i4 > 0) {
            int i5 = i3 / i2;
        }
    }

    public int a() {
        if (this.f21639a != null) {
            return this.b - this.c;
        }
        return 0;
    }

    public boolean b(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b : bArr) {
            if (61 == b || g(b)) {
                return true;
            }
        }
        return false;
    }

    public abstract void c(byte[] bArr, int i, int i2);

    public byte[] d(String str) {
        return e(xrq.b(str));
    }

    public byte[] e(byte[] bArr) {
        i();
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        c(bArr, 0, bArr.length);
        c(bArr, 0, -1);
        int i = this.b;
        byte[] bArr2 = new byte[i];
        h(bArr2, 0, i);
        return bArr2;
    }

    public void f(int i) {
        byte[] bArr = this.f21639a;
        if (bArr == null || bArr.length < this.b + i) {
            j();
        }
    }

    public abstract boolean g(byte b);

    public int h(byte[] bArr, int i, int i2) {
        if (this.f21639a != null) {
            int min = Math.min(a(), i2);
            System.arraycopy(this.f21639a, this.c, bArr, i, min);
            int i3 = this.c + min;
            this.c = i3;
            if (i3 >= this.b) {
                this.f21639a = null;
            }
            return min;
        } else if (this.d) {
            return -1;
        } else {
            return 0;
        }
    }

    public final void i() {
        this.f21639a = null;
        this.b = 0;
        this.c = 0;
        this.e = 0;
        this.d = false;
    }

    public final void j() {
        byte[] bArr = this.f21639a;
        if (bArr == null) {
            this.f21639a = new byte[8192];
            this.b = 0;
            this.c = 0;
            return;
        }
        byte[] bArr2 = new byte[bArr.length * 2];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        this.f21639a = bArr2;
    }
}
