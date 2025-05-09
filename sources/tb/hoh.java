package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.security.MessageDigest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class hoh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(157286495);
    }

    public static String a(String str) {
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e7133b64", new Object[]{str});
        }
        try {
            bArr = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
        } catch (Throwable th) {
            UnifyLog.e("MD5Utils", "md5Decode32 error: " + th.toString());
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            if (i < 16) {
                sb.append("0");
            }
            sb.append(Integer.toHexString(i));
        }
        return sb.toString();
    }
}
