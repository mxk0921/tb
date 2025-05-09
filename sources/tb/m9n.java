package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class m9n {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f23866a;
        public int b;
        public int c;

        static {
            t2o.a(813695046);
        }

        public b() {
            this.f23866a = new int[256];
        }
    }

    static {
        t2o.a(813695044);
    }

    public static byte[] a(byte[] bArr, b bVar) {
        if (bArr == null || bVar == null) {
            return null;
        }
        int i = bVar.b;
        int i2 = bVar.c;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) % 256;
            int[] iArr = bVar.f23866a;
            int i4 = iArr[i];
            i2 = (i2 + i4) % 256;
            iArr[i] = iArr[i2];
            iArr[i2] = i4;
            bArr[i3] = (byte) (iArr[(iArr[i] + i4) % 256] ^ bArr[i3]);
        }
        bVar.b = i;
        bVar.c = i2;
        return bArr;
    }

    public static b b(String str) {
        if (str == null) {
            return null;
        }
        b bVar = new b();
        for (int i = 0; i < 256; i++) {
            bVar.f23866a[i] = i;
        }
        bVar.b = 0;
        bVar.c = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 256; i4++) {
            try {
                char charAt = str.charAt(i2);
                int[] iArr = bVar.f23866a;
                int i5 = iArr[i4];
                i3 = ((charAt + i5) + i3) % 256;
                iArr[i4] = iArr[i3];
                iArr[i3] = i5;
                i2 = (i2 + 1) % str.length();
            } catch (Exception unused) {
                return null;
            }
        }
        return bVar;
    }

    public static byte[] c(byte[] bArr) {
        return d(bArr, "QrMgt8GGYI6T52ZY5AnhtxkLzb8egpFn3j5JELI8H6wtACbUnZ5cc3aYTsTRbmkAkRJeYbtx92LPBWm7nBO9UIl7y5i5MQNmUZNf5QENurR5tGyo7yJ2G0MBjWvy6iAtlAbacKP0SwOUeUWx5dsBdyhxa7Id1APtybSdDgicBDuNjI0mlZFUzZSS9dmN8lBD0WTVOMz0pRZbR3cysomRXOO1ghqjJdTcyDIxzpNAEszN8RMGjrzyU7Hjbmwi6YNK");
    }

    public static byte[] d(byte[] bArr, String str) {
        b b2;
        if (bArr == null || str == null || (b2 = b(str)) == null) {
            return null;
        }
        return a(bArr, b2);
    }
}
