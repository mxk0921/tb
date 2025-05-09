package tb;

import com.android.alibaba.ip.runtime.IpChange;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class g55 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ISO88591 = "ISO-8859-1";

    static {
        t2o.a(775946258);
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("96c14fd8", new Object[]{bArr, bArr2});
        }
        try {
            byte[] bArr3 = new byte[24];
            if (bArr.length >= 24) {
                System.arraycopy(bArr, 0, bArr3, 0, 24);
            } else {
                System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            }
            SecretKey generateSecret = SecretKeyFactory.getInstance("DESede").generateSecret(new DESedeKeySpec(bArr3));
            Cipher instance = Cipher.getInstance("DESede");
            instance.init(2, generateSecret);
            return instance.doFinal(bArr2);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("b9609600", new Object[]{bArr, bArr2});
        }
        try {
            byte[] bArr3 = new byte[24];
            if (bArr.length >= 24) {
                System.arraycopy(bArr, 0, bArr3, 0, 24);
            } else {
                System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            }
            SecretKey generateSecret = SecretKeyFactory.getInstance("DESede").generateSecret(new DESedeKeySpec(bArr3));
            Cipher instance = Cipher.getInstance("DESede");
            instance.init(1, generateSecret);
            return instance.doFinal(bArr2);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
