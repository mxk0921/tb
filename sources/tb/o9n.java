package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class o9n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f25230a = false;
    public static int[] b;

    static {
        t2o.a(962593001);
    }

    public static byte[] a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("b09e077", new Object[]{bArr});
        }
        if (bArr == null) {
            return null;
        }
        int[] copyOf = Arrays.copyOf(b, 256);
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) % 256;
            int i4 = copyOf[i];
            i2 = (i2 + i4) % 256;
            copyOf[i] = copyOf[i2];
            copyOf[i2] = i4;
            bArr[i3] = (byte) (bArr[i3] ^ copyOf[(copyOf[i] + i4) % 256]);
        }
        return bArr;
    }

    public static synchronized void b() {
        synchronized (o9n.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f935005f", new Object[0]);
            } else if (!f25230a) {
                b = new int[256];
                for (int i = 0; i < 256; i++) {
                    b[i] = i;
                }
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < 256; i4++) {
                    try {
                        char charAt = "QrMgt8GGYI6T52ZY5AnhtxkLzb8egpFn3j5JELI8H6wtACbUnZ5cc3aYTsTRbmkAkRJeYbtx92LPBWm7nBO9UIl7y5i5MQNmUZNf5QENurR5tGyo7yJ2G0MBjWvy6iAtlAbacKP0SwOUeUWx5dsBdyhxa7Id1APtybSdDgicBDuNjI0mlZFUzZSS9dmN8lBD0WTVOMz0pRZbR3cysomRXOO1ghqjJdTcyDIxzpNAEszN8RMGjrzyU7Hjbmwi6YNK".charAt(i2);
                        int[] iArr = b;
                        int i5 = iArr[i4];
                        i3 = ((charAt + i5) + i3) % 256;
                        iArr[i4] = iArr[i3];
                        iArr[i3] = i5;
                        i2 = (i2 + 1) % 256;
                    } catch (Exception unused) {
                    }
                }
                f25230a = true;
            }
        }
    }

    public static byte[] c(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("3a9e98c", new Object[]{bArr});
        }
        if (bArr == null) {
            return null;
        }
        b();
        if (b != null) {
            return a(bArr);
        }
        return null;
    }
}
