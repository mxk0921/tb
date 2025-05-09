package tb;

import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class l2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1017118869);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9be3a42a", new Object[]{str});
        }
        try {
            byte[] bytes = "munion_key".getBytes("UTF-8");
            byte[] bArr = new byte[32];
            for (int i = 0; i < 32; i++) {
                if (i < bytes.length) {
                    bArr[i] = bytes[i];
                } else {
                    bArr[i] = 0;
                }
            }
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher instance = Cipher.getInstance("AES/ECB/PKCS7Padding");
            instance.init(1, secretKeySpec);
            return Base64.encodeToString(instance.doFinal(str.getBytes("UTF-8")), 2);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
