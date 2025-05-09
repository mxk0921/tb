package tb;

import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class lv8 {
    public static final int[] e = {1, 5, 25, 125, 625, 3125, 15625, 78125, 390625, 1953125, 9765625, 48828125, 244140625, 1220703125};
    public static final lv8[] f = new lv8[340];

    /* renamed from: a  reason: collision with root package name */
    public int[] f23591a;
    public int b;
    public int c;
    public boolean d;

    static {
        int i = 0;
        while (true) {
            int[] iArr = e;
            if (i >= iArr.length) {
                break;
            }
            lv8 lv8Var = new lv8(new int[]{iArr[i]}, 0);
            lv8Var.d = true;
            f[i] = lv8Var;
            i++;
        }
        lv8 lv8Var2 = f[i - 1];
        while (i < 340) {
            lv8[] lv8VarArr = f;
            lv8Var2 = lv8Var2.i(5);
            lv8VarArr[i] = lv8Var2;
            lv8Var2.d = true;
            i++;
        }
    }

    public lv8(int[] iArr, int i) {
        this.f23591a = iArr;
        this.b = i;
        this.c = iArr.length;
        o();
    }

    public static lv8 a(int i) {
        if (i < 340) {
            return f[i];
        }
        return b(i);
    }

    public static lv8 b(int i) {
        if (i < 340) {
            return f[i];
        }
        int i2 = i >> 1;
        int i3 = i - i2;
        lv8 b = b(i2);
        if (i3 < 14) {
            return b.i(e[i3]);
        }
        lv8 b2 = b(i3);
        int i4 = b.c;
        if (i4 == 0) {
            return b;
        }
        if (b.b + i4 == 1) {
            return b2.i(b.f23591a[0]);
        }
        int i5 = b2.c;
        if (i5 == 0) {
            return b2;
        }
        if (b2.b + i5 == 1) {
            return b.i(b2.f23591a[0]);
        }
        int[] iArr = new int[i4 + i5];
        k(b.f23591a, i4, b2.f23591a, i5, iArr);
        return new lv8(iArr, b.b + b2.b);
    }

    public static int c(int[] iArr, int i) {
        while (i > 0) {
            i--;
            if (iArr[i] != 0) {
                return 1;
            }
        }
        return 0;
    }

    public static void h(int[] iArr, int i, int[] iArr2, int i2, int i3, int i4) {
        while (i > 0) {
            int i5 = iArr[i - 1];
            iArr2[i] = (i4 << i2) | (i5 >>> i3);
            i--;
            i4 = i5;
        }
        iArr2[0] = i4 << i2;
    }

    public static void j(int[] iArr, int i, int i2, int[] iArr2) {
        long j = i2 & tiv.INT_MASK;
        long j2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            long j3 = ((iArr[i3] & tiv.INT_MASK) * j) + j2;
            iArr2[i3] = (int) j3;
            j2 = j3 >>> 32;
        }
        iArr2[i] = (int) j2;
    }

    public static void k(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3) {
        for (int i3 = 0; i3 < i; i3++) {
            long j = iArr[i3] & tiv.INT_MASK;
            long j2 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = i3 + i4;
                long j3 = j2 + (iArr3[i5] & tiv.INT_MASK) + ((iArr2[i4] & tiv.INT_MASK) * j);
                iArr3[i5] = (int) j3;
                j2 = j3 >>> 32;
            }
            iArr3[i3 + i2] = (int) j2;
        }
    }

    public static lv8 p(long j, int i, int i2) {
        int[] iArr;
        int i3;
        int i4;
        int i5 = (int) j;
        int i6 = (int) (j >>> 32);
        int i7 = i2 >> 5;
        int i8 = i2 & 31;
        if (i != 0) {
            if (i < 14) {
                long j2 = e[i] & tiv.INT_MASK;
                long j3 = (i5 & tiv.INT_MASK) * j2;
                int i9 = (int) j3;
                long j4 = ((tiv.INT_MASK & i6) * j2) + (j3 >>> 32);
                int i10 = (int) j4;
                int i11 = (int) (j4 >>> 32);
                if (i8 == 0) {
                    return new lv8(new int[]{i9, i10, i11}, i7);
                }
                int i12 = 32 - i8;
                return new lv8(new int[]{i9 << i8, (i9 >>> i12) | (i10 << i8), (i10 >>> i12) | (i11 << i8), i11 >>> i12}, i7);
            }
            lv8 a2 = a(i);
            int[] iArr2 = a2.f23591a;
            int i13 = a2.c;
            long j5 = i5 & tiv.INT_MASK;
            if (i6 == 0) {
                int i14 = i13 + 1;
                if (i2 != 0) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                iArr = new int[i14 + i4];
            } else {
                int i15 = i13 + 2;
                if (i2 != 0) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                iArr = new int[i15 + i3];
            }
            long j6 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                long j7 = ((iArr2[i16] & tiv.INT_MASK) * j5) + j6;
                iArr[i16] = (int) j7;
                j6 = j7 >>> 32;
            }
            iArr[i13] = (int) j6;
            if (i6 != 0) {
                long j8 = i6 & tiv.INT_MASK;
                int i17 = 0;
                long j9 = 0;
                while (i17 < i13) {
                    int i18 = i17 + 1;
                    long j10 = (iArr[i18] & tiv.INT_MASK) + ((iArr2[i17] & tiv.INT_MASK) * j8) + j9;
                    iArr[i18] = (int) j10;
                    j9 = j10 >>> 32;
                    i17 = i18;
                    iArr2 = iArr2;
                }
                iArr[i13 + 1] = (int) j9;
            }
            return new lv8(iArr, a2.b).g(i2);
        } else if (i2 == 0) {
            return new lv8(new int[]{i5, i6}, 0);
        } else {
            if (i8 == 0) {
                return new lv8(new int[]{i5, i6}, i7);
            }
            int i19 = i5 << i8;
            int i20 = i6 << i8;
            int i21 = 32 - i8;
            return new lv8(new int[]{i19, (i5 >>> i21) | i20, i6 >>> i21}, i7);
        }
    }

    public int d(lv8 lv8Var) {
        int i = this.c;
        int i2 = this.b + i;
        int i3 = lv8Var.c;
        int i4 = lv8Var.b + i3;
        if (i2 > i4) {
            return 1;
        }
        if (i2 < i4) {
            return -1;
        }
        while (i > 0 && i3 > 0) {
            i--;
            int i5 = this.f23591a[i];
            i3--;
            int i6 = lv8Var.f23591a[i3];
            if (i5 != i6) {
                if ((i5 & tiv.INT_MASK) < (i6 & tiv.INT_MASK)) {
                    return -1;
                }
                return 1;
            }
        }
        if (i > 0) {
            return c(this.f23591a, i);
        }
        if (i3 > 0) {
            return -c(lv8Var.f23591a, i3);
        }
        return 0;
    }

    public int e(int i, int i2) {
        if (i != 0) {
            return d(a(i).g(i2));
        }
        int i3 = i2 >> 5;
        int i4 = i2 & 31;
        int i5 = this.c;
        int i6 = this.b + i5;
        int i7 = i3 + 1;
        if (i6 > i7) {
            return 1;
        }
        if (i6 < i7) {
            return -1;
        }
        int[] iArr = this.f23591a;
        int i8 = iArr[i5 - 1];
        int i9 = 1 << i4;
        if (i8 == i9) {
            return c(iArr, i5 - 1);
        }
        if ((i8 & tiv.INT_MASK) < (i9 & tiv.INT_MASK)) {
            return -1;
        }
        return 1;
    }

    public lv8 f(lv8 lv8Var) {
        lv8 lv8Var2;
        if (this.d) {
            lv8Var2 = new lv8((int[]) this.f23591a.clone(), this.b);
        } else {
            lv8Var2 = this;
        }
        int i = lv8Var.b - lv8Var2.b;
        int[] iArr = lv8Var.f23591a;
        int[] iArr2 = lv8Var2.f23591a;
        int i2 = lv8Var.c;
        int i3 = lv8Var2.c;
        int i4 = 0;
        if (i < 0) {
            int i5 = i3 - i;
            if (i5 < iArr2.length) {
                int i6 = -i;
                System.arraycopy(iArr2, 0, iArr2, i6, i3);
                Arrays.fill(iArr2, 0, i6, 0);
            } else {
                int[] iArr3 = new int[i5];
                System.arraycopy(iArr2, 0, iArr3, -i, i3);
                lv8Var2.f23591a = iArr3;
                iArr2 = iArr3;
            }
            lv8Var2.b = lv8Var.b;
            lv8Var2.c = i5;
            i3 = i5;
            i = 0;
        }
        long j = 0;
        while (i4 < i2 && i < i3) {
            long j2 = ((iArr2[i] & tiv.INT_MASK) - (iArr[i4] & tiv.INT_MASK)) + j;
            iArr2[i] = (int) j2;
            j = j2 >> 32;
            i4++;
            i++;
            lv8Var2 = lv8Var2;
        }
        while (j != 0 && i < i3) {
            long j3 = (iArr2[i] & tiv.INT_MASK) + j;
            iArr2[i] = (int) j3;
            j = j3 >> 32;
            i++;
        }
        lv8Var2.o();
        return lv8Var2;
    }

    public lv8 g(int i) {
        int i2;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4 = this.f23591a;
        int i3 = this.c;
        int i4 = this.b;
        if (!(i == 0 || i3 == 0)) {
            int i5 = i >> 5;
            int i6 = i & 31;
            if (!this.d) {
                if (i6 != 0) {
                    int i7 = 32 - i6;
                    int i8 = 0;
                    int i9 = iArr4[0];
                    if ((i9 << i6) == 0) {
                        while (i8 < i3 - 1) {
                            int i10 = i8 + 1;
                            int i11 = iArr4[i10];
                            iArr4[i8] = (i9 >>> i7) | (i11 << i6);
                            i8 = i10;
                            i9 = i11;
                        }
                        int i12 = i9 >>> i7;
                        iArr4[i8] = i12;
                        if (i12 == 0) {
                            i3--;
                        }
                        i4++;
                    } else {
                        int i13 = i3 - 1;
                        int i14 = iArr4[i13];
                        int i15 = i14 >>> i7;
                        if (i15 != 0) {
                            if (i3 == iArr4.length) {
                                iArr2 = new int[i3 + 1];
                                this.f23591a = iArr2;
                            } else {
                                iArr2 = iArr4;
                            }
                            i2 = i3 + 1;
                            iArr2[i3] = i15;
                            iArr = iArr2;
                        } else {
                            iArr = iArr4;
                            i2 = i3;
                        }
                        h(iArr4, i13, iArr, i6, i7, i14);
                        i3 = i2;
                    }
                }
                this.c = i3;
                this.b = i4 + i5;
            } else if (i6 == 0) {
                return new lv8(Arrays.copyOf(iArr4, i3), i4 + i5);
            } else {
                int i16 = 32 - i6;
                int i17 = i3 - 1;
                int i18 = iArr4[i17];
                int i19 = i18 >>> i16;
                if (i19 != 0) {
                    iArr3 = new int[i3 + 1];
                    iArr3[i3] = i19;
                } else {
                    iArr3 = new int[i3];
                }
                h(iArr4, i17, iArr3, i6, i16, i18);
                return new lv8(iArr3, i4 + i5);
            }
        }
        return this;
    }

    public final lv8 i(int i) {
        int i2 = this.c;
        if (i2 == 0) {
            return this;
        }
        int[] iArr = new int[i2 + 1];
        j(this.f23591a, i2, i, iArr);
        return new lv8(iArr, this.b);
    }

    public final void l(int i, int i2) {
        int i3;
        long j = i & tiv.INT_MASK;
        int[] iArr = this.f23591a;
        long j2 = ((iArr[0] & tiv.INT_MASK) * j) + (i2 & tiv.INT_MASK);
        iArr[0] = (int) j2;
        long j3 = j2 >>> 32;
        int i4 = 1;
        while (true) {
            i3 = this.c;
            if (i4 >= i3) {
                break;
            }
            int[] iArr2 = this.f23591a;
            long j4 = j3 + ((iArr2[i4] & tiv.INT_MASK) * j);
            iArr2[i4] = (int) j4;
            j3 = j4 >>> 32;
            i4++;
        }
        if (j3 != 0) {
            int[] iArr3 = this.f23591a;
            this.c = i3 + 1;
            iArr3[i3] = (int) j3;
        }
    }

    public lv8 m(int i, int i2) {
        lv8 lv8Var;
        int i3;
        int i4 = this.c;
        if (i4 == 0) {
            return this;
        }
        if (i != 0) {
            if (i2 != 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (i < 14) {
                int[] iArr = new int[i4 + 1 + i3];
                j(this.f23591a, i4, e[i], iArr);
                lv8Var = new lv8(iArr, this.b);
            } else {
                lv8 a2 = a(i);
                int i5 = this.c;
                int i6 = a2.c;
                int[] iArr2 = new int[i5 + i6 + a2.b + i3];
                k(this.f23591a, i5, a2.f23591a, i6, iArr2);
                lv8Var = new lv8(iArr2, this.b + a2.b);
            }
        } else {
            lv8Var = this;
        }
        return lv8Var.g(i2);
    }

    public lv8 n(lv8 lv8Var) {
        lv8 lv8Var2 = lv8Var;
        if (lv8Var2.d) {
            lv8Var2 = new lv8((int[]) lv8Var2.f23591a.clone(), lv8Var2.b);
        }
        int i = this.b - lv8Var2.b;
        int[] iArr = lv8Var2.f23591a;
        int[] iArr2 = this.f23591a;
        int i2 = lv8Var2.c;
        int i3 = this.c;
        int i4 = 0;
        if (i < 0) {
            if (i3 < iArr.length) {
                int i5 = -i;
                System.arraycopy(iArr, 0, iArr, i5, i2);
                Arrays.fill(iArr, 0, i5, 0);
            } else {
                int[] iArr3 = new int[i3];
                System.arraycopy(iArr, 0, iArr3, -i, i2);
                lv8Var2.f23591a = iArr3;
                iArr = iArr3;
            }
            lv8Var2.b = this.b;
            i = 0;
        } else {
            int i6 = i3 + i;
            if (i6 >= iArr.length) {
                iArr = Arrays.copyOf(iArr, i6);
                lv8Var2.f23591a = iArr;
            }
        }
        long j = 0;
        int i7 = 0;
        while (i7 < i) {
            long j2 = (-(tiv.INT_MASK & iArr[i7])) + j;
            iArr[i7] = (int) j2;
            j = j2 >> 32;
            i7++;
        }
        while (i4 < i3) {
            long j3 = ((iArr2[i4] & tiv.INT_MASK) - (iArr[i7] & tiv.INT_MASK)) + j;
            iArr[i7] = (int) j3;
            j = j3 >> 32;
            i7++;
            i4++;
            lv8Var2 = lv8Var2;
        }
        lv8Var2.c = i7;
        lv8Var2.o();
        return lv8Var2;
    }

    public final void o() {
        int i = this.c;
        if (i > 0) {
            int i2 = i - 1;
            if (this.f23591a[i2] == 0) {
                while (i2 > 0 && this.f23591a[i2 - 1] == 0) {
                    i2--;
                }
                this.c = i2;
                if (i2 == 0) {
                    this.b = 0;
                }
            }
        }
    }

    public lv8(long j, char[] cArr, int i, int i2) {
        int[] iArr = new int[Math.max((i2 + 8) / 9, 2)];
        this.f23591a = iArr;
        int i3 = 0;
        iArr[0] = (int) j;
        iArr[1] = (int) (j >>> 32);
        this.b = 0;
        this.c = 2;
        int i4 = i2 - 5;
        while (i < i4) {
            int i5 = i + 5;
            i++;
            int i6 = cArr[i] - '0';
            while (i < i5) {
                i++;
                i6 = ((i6 * 10) + cArr[i]) - 48;
            }
            l(100000, i6);
        }
        int i7 = 1;
        while (i < i2) {
            i++;
            i3 = ((i3 * 10) + cArr[i]) - 48;
            i7 *= 10;
        }
        if (i7 != 1) {
            l(i7, i3);
        }
        o();
    }
}
