package anet.channel.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class HMacUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.HMacUtil";

    static {
        t2o.a(607125942);
    }

    private static byte[] hmacSha1(byte[] bArr, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("f9756e9c", new Object[]{bArr, bArr2});
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "HmacSHA256");
        try {
            Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(secretKeySpec);
            return instance.doFinal(bArr2);
        } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static String hmacSha1Hex(byte[] bArr, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80a7e55c", new Object[]{bArr, bArr2});
        }
        try {
            return StringUtils.bytesToHexString(hmacSha1(bArr, bArr2));
        } catch (Throwable th) {
            ALog.e(TAG, "hmacSha1Hex", null, "result", "", th);
            return "";
        }
    }
}
