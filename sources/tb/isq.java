package tb;

import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class isq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(775946337);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c7a3d9b7", new Object[]{str, str2});
        }
        try {
            return new String(b(Base64.decode(str, 0), str2.getBytes()));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("e91e058a", new Object[]{bArr, bArr2});
        }
        byte[] bArr3 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i % bArr2.length]);
        }
        return bArr3;
    }
}
