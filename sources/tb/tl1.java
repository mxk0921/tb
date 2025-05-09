package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class tl1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Random f28780a = new Random();

    static {
        t2o.a(401604634);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("467ad1", new Object[]{str});
        }
        String trim = str.trim();
        try {
            return xp1.a(MessageDigest.getInstance("SHA-1").digest((trim + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").getBytes("UTF-8")));
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4ae41f74", new Object[0]);
        }
        byte[] bArr = new byte[16];
        f28780a.nextBytes(bArr);
        return xp1.a(bArr);
    }

    public static ByteBuffer c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("2ffa2da7", new Object[0]);
        }
        return ByteBuffer.allocate(0);
    }

    public static byte[] d(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("14824781", new Object[]{bArr});
        }
        if (bArr != null && bArr.length >= 4) {
            for (int i = 0; i <= bArr.length - 4; i++) {
                if (bArr[i] == 13 && bArr[i + 1] == 10 && bArr[i + 2] == 13 && bArr[i + 3] == 10) {
                    if ((bArr.length - i) - 4 == 0) {
                        return null;
                    } else {
                        byte[] bArr2 = new byte[(bArr.length - i) - 4];
                        System.arraycopy(bArr, i + 4, bArr2, 0, (bArr.length - i) - 4);
                        return bArr2;
                    }
                }
            }
        }
        return null;
    }

    public static byte[] e(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("6f462805", new Object[]{bArr});
        }
        if (bArr == null || bArr.length < 4) {
            return null;
        }
        for (int i = 0; i <= bArr.length - 4; i++) {
            if (bArr[i] == 13 && bArr[i + 1] == 10 && bArr[i + 2] == 13 && bArr[i + 3] == 10) {
                if ((bArr.length - i) - 4 == 0) {
                    return bArr;
                } else {
                    int i2 = i + 4;
                    byte[] bArr2 = new byte[i2];
                    System.arraycopy(bArr, 0, bArr2, 0, i2);
                    return bArr2;
                }
            }
        }
        return null;
    }
}
