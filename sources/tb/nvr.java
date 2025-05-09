package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.security.MessageDigest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class nvr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f24983a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', ohh.LEVEL_D, ohh.LEVEL_E, 'F'};

    static {
        t2o.a(668991610);
    }

    public static char[] a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (char[]) ipChange.ipc$dispatch("cdfe3e4b", new Object[]{bArr});
        }
        return b(bArr, true);
    }

    public static char[] b(byte[] bArr, boolean z) {
        char[] cArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (char[]) ipChange.ipc$dispatch("f1df18bd", new Object[]{bArr, new Boolean(z)});
        }
        if (z) {
            cArr = f24983a;
        } else {
            cArr = b;
        }
        return c(bArr, cArr);
    }

    public static char[] c(byte[] bArr, char[] cArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (char[]) ipChange.ipc$dispatch("4a1d2f83", new Object[]{bArr, cArr});
        }
        char[] cArr2 = new char[bArr.length << 1];
        int i = 0;
        for (byte b2 : bArr) {
            int i2 = i + 1;
            cArr2[i] = cArr[(b2 & 240) >>> 4];
            i += 2;
            cArr2[i2] = cArr[b2 & 15];
        }
        return cArr2;
    }

    public static String d(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6725db94", new Object[]{bArr});
        }
        try {
            return new String(a(MessageDigest.getInstance("MD5").digest(bArr)));
        } catch (Exception e) {
            mvr.b(e, "MD5Util");
            e.printStackTrace();
            return "";
        }
    }
}
