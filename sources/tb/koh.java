package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class koh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f22800a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final MessageDigest b;

    public static void a(byte b2, StringBuffer stringBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e43f7c4", new Object[]{new Byte(b2), stringBuffer});
            return;
        }
        char[] cArr = f22800a;
        char c = cArr[(b2 & 240) >> 4];
        char c2 = cArr[b2 & 15];
        stringBuffer.append(c);
        stringBuffer.append(c2);
    }

    public static String b(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a580ec92", new Object[]{bArr});
        }
        return c(bArr, 0, bArr.length);
    }

    public static String c(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("78d523b2", new Object[]{bArr, new Integer(i), new Integer(i2)});
        }
        StringBuffer stringBuffer = new StringBuffer(i2 * 2);
        int i3 = i2 + i;
        while (i < i3) {
            a(bArr[i], stringBuffer);
            i++;
        }
        return stringBuffer.toString();
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("61c4d376", new Object[]{str});
        }
        return e(str.getBytes());
    }

    public static String e(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8400219", new Object[]{bArr});
        }
        MessageDigest messageDigest = b;
        messageDigest.update(bArr);
        return b(messageDigest.digest());
    }

    static {
        t2o.a(912262812);
        b = null;
        try {
            b = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            System.err.println(koh.class.getName().concat("初始化失败，MessageDigest不支持MD5Util。"));
            e.printStackTrace();
        }
    }
}
