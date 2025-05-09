package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.security.MessageDigest;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class g8p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_WUA_FLAG = 0;
    public static final int GENERAL_WUA_FLAG = 4;
    public static final int MINI_WUA_FLAG = 8;

    static {
        t2o.a(589300078);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7fb45886", new Object[]{str});
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3869b6e7", new Object[]{str});
        }
        if (StringUtils.isBlank(str)) {
            return str;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes("utf-8"));
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                StringBuilder sb2 = new StringBuilder(Integer.toHexString(b & 255));
                while (sb2.length() < 2) {
                    sb2.insert(0, "0");
                }
                sb.append((CharSequence) sb2);
            }
            return sb.toString();
        } catch (Exception e) {
            TBSdkLog.e("mtopsdk.SecurityUtils", "[getMd5] compute md5 value failed for source str=" + str, e);
            return null;
        }
    }
}
