package tb;

import java.security.MessageDigest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class abi {
    static {
        t2o.a(693108795);
    }

    public static String a(String str) {
        try {
            return b(MessageDigest.getInstance("MD5").digest(str.getBytes("utf-8")));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String b(byte[] bArr) {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(charArray[(bArr[i] >> 4) & 15]);
            sb.append(charArray[bArr[i] & 15]);
        }
        return sb.toString();
    }
}
