package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class n9n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f24597a;
        public int b;
        public int c;

        static {
            t2o.a(961544426);
        }

        public b() {
            this.f24597a = new int[256];
        }
    }

    static {
        t2o.a(961544424);
    }

    public static byte[] b(byte[] bArr) {
        b a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("3a9e98c", new Object[]{bArr});
        }
        if (bArr == null || (a2 = a("QrMgt8GGYI6T52ZY5AnhtxkLzb8egpFn3j5JELI8H6wtACbUnZ5cc3aYTsTRbmkAkRJeYbtx92LPBWm7nBO9UIl7y5i5MQNmUZNf5QENurR5tGyo7yJ2G0MBjWvy6iAtlAbacKP0SwOUeUWx5dsBdyhxa7Id1APtybSdDgicBDuNjI0mlZFUzZSS9dmN8lBD0WTVOMz0pRZbR3cysomRXOO1ghqjJdTcyDIxzpNAEszN8RMGjrzyU7Hjbmwi6YNK")) == null) {
            return null;
        }
        return c(bArr, a2);
    }

    public static byte[] c(byte[] bArr, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("b7f123bd", new Object[]{bArr, bVar});
        }
        if (bArr == null || bVar == null) {
            return null;
        }
        int i = bVar.b;
        int i2 = bVar.c;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) % 256;
            int[] iArr = bVar.f24597a;
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

    public static b a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("f958dd8a", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        b bVar = new b();
        for (int i = 0; i < 256; i++) {
            bVar.f24597a[i] = i;
        }
        bVar.b = 0;
        bVar.c = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 256; i4++) {
            try {
                char charAt = str.charAt(i2);
                int[] iArr = bVar.f24597a;
                int i5 = iArr[i4];
                i3 = ((charAt + i5) + i3) % 256;
                iArr[i4] = iArr[i3];
                iArr[i3] = i5;
                i2 = (i2 + 1) % str.length();
            } catch (Exception e) {
                ogh.h("RC4", "prepareKey fail", e);
                return null;
            }
        }
        return bVar;
    }
}
