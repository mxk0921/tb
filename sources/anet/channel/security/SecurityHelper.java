package anet.channel.security;

import android.util.Base64;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.util.ALog;
import anet.channel.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.charset.Charset;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import tb.aj;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class SecurityHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String AES = "AES";
    private static final String AES_CBC_PKCS5_PADDING = "AES/CBC/PKCS5Padding";
    private static final int IV_SIZE = 16;
    private static final String TAG = "awcn.SecurityHelper";

    static {
        t2o.a(607125706);
    }

    public static String decryptNoDeps(String str, String str2, String str3, String str4) {
        String str5;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66d7547f", new Object[]{str, str2, str3, str4});
        }
        try {
            byte[] keyAndIvBytes = getKeyAndIvBytes(str);
            SecretKeySpec secretKeySpec = new SecretKeySpec(keyAndIvBytes, "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(keyAndIvBytes);
            Cipher instance = Cipher.getInstance(AES_CBC_PKCS5_PADDING);
            instance.init(2, secretKeySpec, ivParameterSpec);
            str5 = new String(instance.doFinal(Base64.decode(str2.getBytes(Charset.forName("UTF-8")), 0)), Charset.forName("UTF-8"));
            try {
                ALog.e(TAG, str4 + " [decryptNoDeps] success! ", str3, aj.KEY_DECRYPT, str5);
            } catch (Throwable th2) {
                th = th2;
                ALog.e(TAG, str4 + " [decryptNoDeps] fail!  error=" + th.toString(), null, new Object[0]);
                return str5;
            }
        } catch (Throwable th3) {
            th = th3;
            str5 = null;
        }
        return str5;
    }

    public static String encryptNoDeps(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f408cca7", new Object[]{str, str2, str3, str4});
        }
        String str5 = null;
        try {
            byte[] keyAndIvBytes = getKeyAndIvBytes(str);
            SecretKeySpec secretKeySpec = new SecretKeySpec(keyAndIvBytes, "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(keyAndIvBytes);
            Cipher instance = Cipher.getInstance(AES_CBC_PKCS5_PADDING);
            instance.init(1, secretKeySpec, ivParameterSpec);
            str5 = Base64.encodeToString(instance.doFinal(str2.getBytes(Charset.forName("UTF-8"))), 0);
            ALog.e(TAG, str4 + " [encryptNoDeps] success! ", str3, "encrypt", str5);
            return str5;
        } catch (Throwable th) {
            ALog.e(TAG, str4 + " [encryptNoDeps] fail!  error=" + th.toString(), str3, new Object[0]);
            return str5;
        }
    }

    private static byte[] getKeyAndIvBytes(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("f690c8fc", new Object[]{str});
        }
        return StringUtils.md5ToHex(str).substring(0, 16).getBytes();
    }

    public static String getSecretKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d7c7136", new Object[]{str});
        }
        return StringUtils.md5ToHex(GlobalAppRuntimeInfo.getAppkey() + str);
    }
}
