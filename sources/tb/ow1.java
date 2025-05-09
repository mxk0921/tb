package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ow1 {
    public static int a(int i, int i2, int i3) {
        if (i2 < i) {
            i = i2;
        }
        if (i3 < i) {
            return i3;
        }
        return i;
    }

    public static boolean b(int i) {
        if (i >= 16) {
            return true;
        }
        return false;
    }

    public static boolean c(int i, byte[] bArr) {
        return b(i) & d(bArr);
    }

    public static boolean d(byte[] bArr) {
        if (bArr.length >= 16) {
            return true;
        }
        return false;
    }

    public static byte[] e(String str, String str2, String str3, String str4, int i, boolean z) {
        return g(str, str2, str3, sva.b(str4), i, z);
    }

    public static byte[] f(String str, String str2, String str3, byte[] bArr, int i, int i2, boolean z) {
        byte[] b = sva.b(str);
        byte[] b2 = sva.b(str2);
        byte[] b3 = sva.b(str3);
        int a2 = a(b.length, b2.length, b3.length);
        if (c(a2, bArr)) {
            char[] cArr = new char[a2];
            for (int i3 = 0; i3 < a2; i3++) {
                cArr[i3] = (char) ((b[i3] ^ b2[i3]) ^ b3[i3]);
            }
            if (!z) {
                vwx.c("BaseKeyUtil", "exportRootKey: sha1");
                return phl.b(cArr, bArr, i, i2 * 8);
            }
            vwx.c("BaseKeyUtil", "exportRootKey: sha256");
            return phl.c(cArr, bArr, i, i2 * 8);
        }
        throw new IllegalArgumentException("key length must be more than 128bit.");
    }

    public static byte[] g(String str, String str2, String str3, byte[] bArr, int i, boolean z) {
        return f(str, str2, str3, bArr, 10000, i, z);
    }

    public static byte[] h(String str, String str2, String str3, byte[] bArr, boolean z) {
        return g(str, str2, str3, bArr, 16, z);
    }
}
