package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.charset.Charset;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class qva {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_CHARSET_NAME = "UTF-8";
    public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f26951a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', ohh.LEVEL_D, ohh.LEVEL_E, 'F'};

    static {
        t2o.a(849346590);
    }

    public static String a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("33bf8aac", new Object[]{bArr});
        }
        return new String(b(bArr));
    }

    public static char[] b(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (char[]) ipChange.ipc$dispatch("cdfe3e4b", new Object[]{bArr});
        }
        return c(bArr, true);
    }

    public static char[] c(byte[] bArr, boolean z) {
        char[] cArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (char[]) ipChange.ipc$dispatch("f1df18bd", new Object[]{bArr, new Boolean(z)});
        }
        if (z) {
            cArr = f26951a;
        } else {
            cArr = b;
        }
        return d(bArr, cArr);
    }

    public static char[] d(byte[] bArr, char[] cArr) {
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
}
