package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.security.MessageDigest;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class nd9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final nd9 INSTANCE = new nd9();

    static {
        t2o.a(849346588);
    }

    @JvmStatic
    public static final String a(String str) {
        MessageDigest messageDigest;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a46456c7", new Object[]{str});
        }
        ckf.g(str, "text");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            e.printStackTrace();
            messageDigest = null;
        }
        if (messageDigest == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        ckf.f(charArray, "this as java.lang.String).toCharArray()");
        byte[] bArr = new byte[charArray.length];
        int length = charArray.length;
        int i2 = 0;
        while (i2 < length) {
            i2++;
            bArr[i2] = (byte) charArray[i2];
        }
        byte[] digest = messageDigest.digest(bArr);
        StringBuffer stringBuffer = new StringBuffer();
        int length2 = digest.length;
        while (i < length2) {
            i++;
            int i3 = digest[i] & 255;
            if (i3 < 16) {
                stringBuffer.append("0");
            }
            stringBuffer.append(Integer.toHexString(i3));
        }
        return stringBuffer.toString();
    }
}
