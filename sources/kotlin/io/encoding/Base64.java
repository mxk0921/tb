package kotlin.io.encoding;

import kotlin.Metadata;
import tb.a07;
import tb.c20;
import tb.ckf;
import tb.eq1;
import tb.fg8;
import tb.uj3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class Base64 {
    public static final int bytesPerGroup = 3;
    public static final int mimeLineLength = 76;
    public static final byte padSymbol = 61;
    public static final int symbolsPerGroup = 4;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f15245a;
    public final boolean b;
    public final PaddingOption c;
    public static final a Default = new a(null);
    public static final byte[] d = {13, 10};

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lkotlin/io/encoding/Base64$PaddingOption;", "", "<init>", "(Ljava/lang/String;I)V", "PRESENT", "ABSENT", "PRESENT_OPTIONAL", "ABSENT_OPTIONAL", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class PaddingOption extends Enum<PaddingOption> {
        private static final /* synthetic */ fg8 $ENTRIES;
        private static final /* synthetic */ PaddingOption[] $VALUES;
        public static final PaddingOption PRESENT = new PaddingOption("PRESENT", 0);
        public static final PaddingOption ABSENT = new PaddingOption("ABSENT", 1);
        public static final PaddingOption PRESENT_OPTIONAL = new PaddingOption("PRESENT_OPTIONAL", 2);
        public static final PaddingOption ABSENT_OPTIONAL = new PaddingOption("ABSENT_OPTIONAL", 3);

        private static final /* synthetic */ PaddingOption[] $values() {
            return new PaddingOption[]{PRESENT, ABSENT, PRESENT_OPTIONAL, ABSENT_OPTIONAL};
        }

        static {
            PaddingOption[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private PaddingOption(String str, int i) {
        }

        public static fg8<PaddingOption> getEntries() {
            return $ENTRIES;
        }

        public static PaddingOption valueOf(String str) {
            return (PaddingOption) Enum.valueOf(PaddingOption.class, str);
        }

        public static PaddingOption[] values() {
            return (PaddingOption[]) $VALUES.clone();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a extends Base64 {
        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
            super(false, false, PaddingOption.PRESENT, null);
        }
    }

    static {
        PaddingOption paddingOption = PaddingOption.PRESENT;
        new Base64(true, false, paddingOption);
        new Base64(false, true, paddingOption);
    }

    public /* synthetic */ Base64(boolean z, boolean z2, PaddingOption paddingOption, a07 a07Var) {
        this(z, z2, paddingOption);
    }

    public static /* synthetic */ byte[] e(Base64 base64, byte[] bArr, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return base64.d(bArr, i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
    }

    public static /* synthetic */ String i(Base64 base64, byte[] bArr, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return base64.h(bArr, i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
    }

    public final void a(int i, int i2, int i3) {
        if (i2 < 0 || i2 > i) {
            throw new IndexOutOfBoundsException("destination offset: " + i2 + ", destination size: " + i);
        }
        int i4 = i2 + i3;
        if (i4 < 0 || i4 > i) {
            throw new IndexOutOfBoundsException("The destination array does not have enough capacity, destination offset: " + i2 + ", destination size: " + i + ", capacity needed: " + i3);
        }
    }

    public final void b(int i) {
        if (this.c == PaddingOption.ABSENT) {
            throw new IllegalArgumentException("The padding option is set to ABSENT, but the input has a pad character at index " + i);
        }
    }

    public final void c(int i, int i2, int i3) {
        c20.Companion.a(i2, i3, i);
    }

    public final byte[] d(byte[] bArr, int i, int i2) {
        ckf.g(bArr, "source");
        c(bArr.length, i, i2);
        int g = g(bArr, i, i2);
        byte[] bArr2 = new byte[g];
        if (f(bArr, bArr2, 0, i, i2) == g) {
            return bArr2;
        }
        throw new IllegalStateException("Check failed.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cb, code lost:
        if (r7 == (-2)) goto L_0x012c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ce, code lost:
        if (r7 == (-8)) goto L_0x00e1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d0, code lost:
        if (r4 != false) goto L_0x00e1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d6, code lost:
        if (r18.c == kotlin.io.encoding.Base64.PaddingOption.PRESENT) goto L_0x00d9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e0, code lost:
        throw new java.lang.IllegalArgumentException("The padding option is set to PRESENT, but the input is not properly padded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e1, code lost:
        if (r8 != 0) goto L_0x0124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e3, code lost:
        r3 = o(r19, r6, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e7, code lost:
        if (r3 < r23) goto L_0x00ec;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00eb, code lost:
        return r9 - r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ec, code lost:
        r1 = r19[r3] & 255;
        r4 = new java.lang.StringBuilder("Symbol '");
        r4.append((char) r1);
        r4.append("'(");
        kotlin.text.a.a(8);
        r1 = java.lang.Integer.toString(r1, 8);
        tb.ckf.f(r1, "toString(...)");
        r4.append(r1);
        r4.append(") at index ");
        r4.append(r3 - 1);
        r4.append(" is prohibited after the pad character");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0123, code lost:
        throw new java.lang.IllegalArgumentException(r4.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x012b, code lost:
        throw new java.lang.IllegalArgumentException("The pad bits must be zeros");
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0133, code lost:
        throw new java.lang.IllegalArgumentException("The last unit of input does not have enough bits");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(byte[] r19, byte[] r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.encoding.Base64.f(byte[], byte[], int, int, int):int");
    }

    public final int g(byte[] bArr, int i, int i2) {
        int[] iArr;
        ckf.g(bArr, "source");
        int i3 = i2 - i;
        if (i3 == 0) {
            return 0;
        }
        if (i3 != 1) {
            if (this.b) {
                while (true) {
                    if (i >= i2) {
                        break;
                    }
                    iArr = eq1.b;
                    int i4 = iArr[bArr[i] & 255];
                    if (i4 < 0) {
                        if (i4 == -2) {
                            i3 -= i2 - i;
                            break;
                        }
                        i3--;
                    }
                    i++;
                }
            } else if (bArr[i2 - 1] == 61) {
                int i5 = i3 - 1;
                if (bArr[i2 - 2] == 61) {
                    i3 -= 2;
                } else {
                    i3 = i5;
                }
            }
            return (int) ((i3 * 6) / 8);
        }
        throw new IllegalArgumentException("Input should have at least 2 symbols for Base64 decoding, startIndex: " + i + ", endIndex: " + i2);
    }

    public final String h(byte[] bArr, int i, int i2) {
        ckf.g(bArr, "source");
        return new String(l(bArr, i, i2), uj3.ISO_8859_1);
    }

    public final int j(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        byte[] bArr3;
        int i4;
        int i5;
        int i6 = i2;
        ckf.g(bArr, "source");
        ckf.g(bArr2, "destination");
        c(bArr.length, i6, i3);
        a(bArr2.length, i, k(i3 - i6));
        if (this.f15245a) {
            bArr3 = eq1.c;
        } else {
            bArr3 = eq1.f18753a;
        }
        if (this.b) {
            i4 = 19;
        } else {
            i4 = Integer.MAX_VALUE;
        }
        int i7 = i;
        while (true) {
            i5 = i6 + 2;
            if (i5 >= i3) {
                break;
            }
            int min = Math.min((i3 - i6) / 3, i4);
            for (int i8 = 0; i8 < min; i8++) {
                int i9 = i6 + 2;
                i6 += 3;
                int i10 = ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6] & 255) << 16) | (bArr[i9] & 255);
                bArr2[i7] = bArr3[i10 >>> 18];
                bArr2[i7 + 1] = bArr3[(i10 >>> 12) & 63];
                int i11 = i7 + 3;
                bArr2[i7 + 2] = bArr3[(i10 >>> 6) & 63];
                i7 += 4;
                bArr2[i11] = bArr3[i10 & 63];
            }
            if (min == i4 && i6 != i3) {
                int i12 = i7 + 1;
                byte[] bArr4 = d;
                bArr2[i7] = bArr4[0];
                i7 += 2;
                bArr2[i12] = bArr4[1];
            }
        }
        int i13 = i3 - i6;
        if (i13 == 1) {
            int i14 = i6 + 1;
            int i15 = (bArr[i6] & 255) << 4;
            bArr2[i7] = bArr3[i15 >>> 6];
            int i16 = i7 + 2;
            bArr2[i7 + 1] = bArr3[i15 & 63];
            if (n()) {
                int i17 = i7 + 3;
                bArr2[i16] = 61;
                i7 += 4;
                bArr2[i17] = 61;
                i6 = i14;
            } else {
                i6 = i14;
                i7 = i16;
            }
        } else if (i13 == 2) {
            int i18 = ((bArr[i6 + 1] & 255) << 2) | ((bArr[i6] & 255) << 10);
            bArr2[i7] = bArr3[i18 >>> 12];
            bArr2[i7 + 1] = bArr3[(i18 >>> 6) & 63];
            int i19 = i7 + 3;
            bArr2[i7 + 2] = bArr3[i18 & 63];
            if (n()) {
                i7 += 4;
                bArr2[i19] = 61;
            } else {
                i7 = i19;
            }
            i6 = i5;
        }
        if (i6 == i3) {
            return i7 - i;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int k(int i) {
        int i2 = i / 3;
        int i3 = i % 3;
        int i4 = 4;
        int i5 = i2 * 4;
        if (i3 != 0) {
            if (!n()) {
                i4 = i3 + 1;
            }
            i5 += i4;
        }
        if (this.b) {
            i5 += ((i5 - 1) / 76) * 2;
        }
        if (i5 >= 0) {
            return i5;
        }
        throw new IllegalArgumentException("Input is too big");
    }

    public final byte[] l(byte[] bArr, int i, int i2) {
        ckf.g(bArr, "source");
        c(bArr.length, i, i2);
        byte[] bArr2 = new byte[k(i2 - i)];
        j(bArr, bArr2, 0, i, i2);
        return bArr2;
    }

    public final int m(byte[] bArr, int i, int i2, int i3) {
        if (i3 != -8) {
            if (i3 == -6) {
                b(i);
            } else if (i3 == -4) {
                b(i);
                i = o(bArr, i + 1, i2);
                if (i == i2 || bArr[i] != 61) {
                    throw new IllegalArgumentException("Missing one pad character at index " + i);
                }
            } else if (i3 != -2) {
                throw new IllegalStateException("Unreachable");
            }
            return i + 1;
        }
        throw new IllegalArgumentException("Redundant pad character at index " + i);
    }

    public final boolean n() {
        PaddingOption paddingOption = PaddingOption.PRESENT;
        PaddingOption paddingOption2 = this.c;
        if (paddingOption2 == paddingOption || paddingOption2 == PaddingOption.PRESENT_OPTIONAL) {
            return true;
        }
        return false;
    }

    public final int o(byte[] bArr, int i, int i2) {
        int[] iArr;
        if (!this.b) {
            return i;
        }
        while (i < i2) {
            iArr = eq1.b;
            if (iArr[bArr[i] & 255] != -1) {
                return i;
            }
            i++;
        }
        return i;
    }

    public Base64(boolean z, boolean z2, PaddingOption paddingOption) {
        this.f15245a = z;
        this.b = z2;
        this.c = paddingOption;
        if (z && z2) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
