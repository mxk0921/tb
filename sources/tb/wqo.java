package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.ability.MegaUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.security.MessageDigest;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class wqo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final wqo INSTANCE = new wqo();

    static {
        t2o.a(140509196);
    }

    @JvmStatic
    public static final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("63bc253d", new Object[]{str});
        }
        ckf.g(str, "businessId");
        return b() + "/Mega/" + c(str) + wh6.DIR;
    }

    @JvmStatic
    public static final String b() {
        File filesDir;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("adbb409e", new Object[0]);
        }
        Context f = MegaUtils.f();
        if (!(f == null || (filesDir = f.getFilesDir()) == null)) {
            if (!filesDir.exists()) {
                filesDir.mkdirs();
            }
            String absolutePath = filesDir.getAbsolutePath();
            if (absolutePath != null) {
                return absolutePath;
            }
        }
        return "";
    }

    @JvmStatic
    public static final String d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("69965ac", new Object[]{str, str2});
        }
        ckf.g(str, "businessId");
        ckf.g(str2, "virtualPath");
        String E = tsq.E(str2, "file://", "", false, 4, null);
        return a(str) + E;
    }

    @JvmStatic
    public static final String c(String str) {
        MessageDigest messageDigest;
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
        ckf.f(charArray, "(this as java.lang.String).toCharArray()");
        byte[] bArr = new byte[charArray.length];
        int length = charArray.length;
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) charArray[i];
        }
        byte[] digest = messageDigest.digest(bArr);
        StringBuffer stringBuffer = new StringBuffer();
        ckf.f(digest, "md5Bytes");
        for (byte b : digest) {
            int i2 = b & 255;
            if (i2 < 16) {
                stringBuffer.append("0");
            }
            stringBuffer.append(Integer.toHexString(i2));
        }
        return stringBuffer.toString();
    }
}
