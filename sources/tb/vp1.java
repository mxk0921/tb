package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class vp1 extends iy1 {
    public static final byte[] j = {13, 10};
    public static final byte[] k = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, c0z.MAP32, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};
    public final byte[] f;
    public final int g;
    public final int h;
    public int i;

    static {
        t2o.a(612368391);
    }

    public vp1() {
        this(0);
    }

    public static byte[] k(String str) {
        return new vp1().d(str);
    }

    @Override // tb.iy1
    public void c(byte[] bArr, int i, int i2) {
        int i3;
        byte b;
        if (!this.d) {
            if (i2 < 0) {
                this.d = true;
            }
            int i4 = 0;
            while (true) {
                i3 = this.g;
                if (i4 >= i2) {
                    break;
                }
                f(i3);
                int i5 = i + 1;
                byte b2 = bArr[i];
                if (b2 == 61) {
                    this.d = true;
                    break;
                }
                if (b2 >= 0) {
                    byte[] bArr2 = k;
                    if (b2 < bArr2.length && (b = bArr2[b2]) >= 0) {
                        int i6 = (this.e + 1) % 4;
                        this.e = i6;
                        int i7 = (this.i << 6) + b;
                        this.i = i7;
                        if (i6 == 0) {
                            byte[] bArr3 = this.f21639a;
                            int i8 = this.b;
                            int i9 = i8 + 1;
                            this.b = i9;
                            bArr3[i8] = (byte) ((i7 >> 16) & 255);
                            int i10 = i8 + 2;
                            this.b = i10;
                            bArr3[i9] = (byte) ((i7 >> 8) & 255);
                            this.b = i8 + 3;
                            bArr3[i10] = (byte) (i7 & 255);
                        }
                    }
                }
                i4++;
                i = i5;
            }
            if (this.d && this.e != 0) {
                f(i3);
                int i11 = this.e;
                if (i11 == 2) {
                    int i12 = this.i >> 4;
                    this.i = i12;
                    byte[] bArr4 = this.f21639a;
                    int i13 = this.b;
                    this.b = i13 + 1;
                    bArr4[i13] = (byte) (i12 & 255);
                } else if (i11 == 3) {
                    int i14 = this.i;
                    int i15 = i14 >> 2;
                    this.i = i15;
                    byte[] bArr5 = this.f21639a;
                    int i16 = this.b;
                    int i17 = i16 + 1;
                    this.b = i17;
                    bArr5[i16] = (byte) ((i14 >> 10) & 255);
                    this.b = i16 + 2;
                    bArr5[i17] = (byte) (i15 & 255);
                }
            }
        }
    }

    @Override // tb.iy1
    public boolean g(byte b) {
        if (b >= 0) {
            byte[] bArr = this.f;
            if (b < bArr.length && bArr[b] != -1) {
                return true;
            }
        }
        return false;
    }

    public vp1(int i) {
        this(i, j);
    }

    public vp1(int i, byte[] bArr) {
        this(i, bArr, false);
    }

    public vp1(int i, byte[] bArr, boolean z) {
        super(3, 4, i, bArr == null ? 0 : bArr.length);
        this.f = k;
        if (bArr == null) {
            this.h = 4;
        } else if (b(bArr)) {
            String e = xrq.e(bArr);
            throw new IllegalArgumentException("lineSeparator must not contain base64 characters: [" + e + "]");
        } else if (i > 0) {
            this.h = bArr.length + 4;
            System.arraycopy(bArr, 0, new byte[bArr.length], 0, bArr.length);
        } else {
            this.h = 4;
        }
        this.g = this.h - 1;
    }
}
