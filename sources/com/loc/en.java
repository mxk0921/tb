package com.loc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class en {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f5669a = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public byte[] f5670a;
        public int b;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b extends a {
        private static final int[] c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private static final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private final int[] g = c;
        private int e = 0;
        private int f = 0;

        public b(byte[] bArr) {
            this.f5670a = bArr;
        }

        public final boolean a(byte[] bArr, int i) {
            int i2 = this.e;
            if (i2 == 6) {
                return false;
            }
            int i3 = this.f;
            byte[] bArr2 = this.f5670a;
            int[] iArr = this.g;
            int i4 = 0;
            int i5 = 0;
            while (i4 < i) {
                if (i2 == 0) {
                    while (true) {
                        int i6 = i4 + 4;
                        if (i6 > i || (i3 = (iArr[bArr[i4] & 255] << 18) | (iArr[bArr[i4 + 1] & 255] << 12) | (iArr[bArr[i4 + 2] & 255] << 6) | iArr[bArr[i4 + 3] & 255]) < 0) {
                            break;
                        }
                        bArr2[i5 + 2] = (byte) i3;
                        bArr2[i5 + 1] = (byte) (i3 >> 8);
                        bArr2[i5] = (byte) (i3 >> 16);
                        i5 += 3;
                        i4 = i6;
                    }
                    if (i4 >= i) {
                        break;
                    }
                }
                int i7 = i4 + 1;
                int i8 = iArr[bArr[i4] & 255];
                if (i2 != 0) {
                    if (i2 == 1) {
                        if (i8 < 0) {
                            if (i8 != -1) {
                                this.e = 6;
                                return false;
                            }
                        }
                        i3 = (i3 << 6) | i8;
                        i2++;
                    } else if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4) {
                                if (i8 != -2) {
                                    if (i8 != -1) {
                                        this.e = 6;
                                        return false;
                                    }
                                }
                                i2++;
                            } else if (i2 == 5 && i8 != -1) {
                                this.e = 6;
                                return false;
                            }
                        } else if (i8 >= 0) {
                            i3 = (i3 << 6) | i8;
                            bArr2[i5 + 2] = (byte) i3;
                            bArr2[i5 + 1] = (byte) (i3 >> 8);
                            bArr2[i5] = (byte) (i3 >> 16);
                            i5 += 3;
                            i4 = i7;
                            i2 = 0;
                        } else if (i8 == -2) {
                            bArr2[i5 + 1] = (byte) (i3 >> 2);
                            bArr2[i5] = (byte) (i3 >> 10);
                            i5 += 2;
                            i4 = i7;
                            i2 = 5;
                        } else if (i8 != -1) {
                            this.e = 6;
                            return false;
                        }
                    } else if (i8 >= 0) {
                        i3 = (i3 << 6) | i8;
                        i2++;
                    } else if (i8 == -2) {
                        bArr2[i5] = (byte) (i3 >> 4);
                        i5++;
                        i4 = i7;
                        i2 = 4;
                    } else if (i8 != -1) {
                        this.e = 6;
                        return false;
                    }
                } else if (i8 >= 0) {
                    i2++;
                    i3 = i8;
                } else if (i8 != -1) {
                    this.e = 6;
                    return false;
                }
                i4 = i7;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    bArr2[i5] = (byte) (i3 >> 4);
                    i5++;
                } else if (i2 == 3) {
                    int i9 = i5 + 1;
                    bArr2[i5] = (byte) (i3 >> 10);
                    i5 += 2;
                    bArr2[i9] = (byte) (i3 >> 2);
                } else if (i2 == 4) {
                    this.e = 6;
                    return false;
                }
                this.e = i2;
                this.b = i5;
                return true;
            }
            this.e = 6;
            return false;
        }
    }

    private en() {
    }

    public static byte[] a(byte[] bArr) {
        return a(bArr, bArr.length);
    }

    private static byte[] a(byte[] bArr, int i) {
        b bVar = new b(new byte[(i * 3) / 4]);
        if (bVar.a(bArr, i)) {
            int i2 = bVar.b;
            byte[] bArr2 = bVar.f5670a;
            if (i2 == bArr2.length) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i2];
            System.arraycopy(bArr2, 0, bArr3, 0, i2);
            return bArr3;
        }
        throw new IllegalArgumentException("bad base-64");
    }
}
