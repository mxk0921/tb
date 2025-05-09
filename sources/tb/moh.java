package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class moh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806355500);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9be3a42a", new Object[]{str});
        }
        return new BigInteger(b(str.getBytes())).abs().toString(36);
    }

    public static byte[] b(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a01327a7", new Object[]{bArr});
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            return instance.digest();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}
