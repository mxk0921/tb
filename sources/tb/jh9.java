package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.security.MessageDigest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class jh9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final char EXTENSION_SEPARATOR = '.';

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f21994a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', ohh.LEVEL_D, ohh.LEVEL_E, 'F'};

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
            cArr = f21994a;
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

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("257656f1", new Object[]{str});
        }
        try {
            return new String(a(MessageDigest.getInstance("MD5").digest(str.getBytes("utf-8"))));
        } catch (Exception e) {
            Log.e("MD5Util", "md5", e);
            e.printStackTrace();
            return "";
        }
    }
}
