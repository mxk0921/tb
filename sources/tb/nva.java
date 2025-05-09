package tb;

import tb.ova;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class nva {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f24974a;

    static {
        int[] iArr = new int[256];
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            iArr[i2] = "0123456789abcdef".charAt(i2 & 15) | ("0123456789abcdef".charAt(i2 >> 4) << '\b');
        }
        f24974a = iArr;
        int[] iArr2 = new int[256];
        for (int i3 = 0; i3 < 256; i3++) {
            iArr2[i3] = "0123456789ABCDEF".charAt(i3 & 15) | ("0123456789ABCDEF".charAt(i3 >> 4) << '\b');
        }
        int[] iArr3 = new int[256];
        for (int i4 = 0; i4 < 256; i4++) {
            iArr3[i4] = -1;
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i5)] = i6;
            i5++;
            i6++;
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i7)] = i8;
            i7++;
            i8++;
        }
        long[] jArr = new long[256];
        for (int i9 = 0; i9 < 256; i9++) {
            jArr[i9] = -1;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i10)] = i11;
            i10++;
            i11++;
        }
        int i12 = 0;
        while (i < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i)] = i12;
            i++;
            i12++;
        }
    }

    public static final int a(long j) {
        if (0 <= j && j <= 2147483647L) {
            return (int) j;
        }
        throw new IllegalArgumentException("The resulting string length is too big: " + ((Object) kwu.j0(j)));
    }

    public static final int[] b() {
        return f24974a;
    }

    public static final int c(String str, char[] cArr, int i) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                str.getChars(0, str.length(), cArr, i);
            } else {
                cArr[i] = str.charAt(0);
            }
        }
        return i + str.length();
    }

    public static final String d(byte b, ova ovaVar) {
        String str;
        ckf.g(ovaVar, "format");
        if (ovaVar.c()) {
            str = "0123456789ABCDEF";
        } else {
            str = "0123456789abcdef";
        }
        ova.c b2 = ovaVar.b();
        if (b2.c()) {
            return tsq.q(new char[]{str.charAt((b >> 4) & 15), str.charAt(b & 15)});
        }
        return e(b, b2, str, 8);
    }

    public static final String e(long j, ova.c cVar, String str, int i) {
        if ((i & 3) == 0) {
            int i2 = i >> 2;
            cVar.getClass();
            int c = hfn.c(1 - i2, 0);
            long j2 = 0;
            int a2 = a(c + j2 + i2 + j2);
            char[] cArr = new char[a2];
            int c2 = c("", cArr, 0);
            if (c > 0) {
                int i3 = c + c2;
                hc1.n(cArr, str.charAt(0), c2, i3);
                c2 = i3;
            }
            int i4 = 0;
            while (i4 < i2) {
                i -= 4;
                cArr[c2] = str.charAt((int) ((j >> i) & 15));
                i4++;
                c2++;
            }
            int c3 = c("", cArr, c2);
            if (c3 == a2) {
                return tsq.q(cArr);
            }
            return tsq.s(cArr, 0, c3, 1, null);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
