package tb;

import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class z7p {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final byte[] HEX_CHAR_TABLE = {48, 49, 50, 51, 52, 53, 54, 55, c0z.MAP32, 57, 97, 98, 99, 100, 101, 102};

    static {
        t2o.a(374341763);
    }

    public static String a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("17683862", new Object[]{bArr});
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(bArr, 0, bArr.length);
            return Base64.encodeToString(instance.digest(), 11);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
