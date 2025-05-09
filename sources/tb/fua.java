package tb;

import com.alipay.birdnest.platform.ConnectionUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.zip.CRC32;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class fua {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static long a(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a979fd3", new Object[]{file})).longValue();
        }
        CRC32 crc32 = new CRC32();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    crc32.update(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    return crc32.getValue();
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static String c(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b03f151", new Object[]{bArr});
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            return ConnectionUtils.a(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            pgh.m(e, "error while md5");
            return null;
        }
    }

    public static boolean d(boolean z, long j, String... strArr) throws UnsupportedEncodingException {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9a9154b", new Object[]{new Boolean(z), new Long(j), strArr})).booleanValue();
        }
        long b = b(strArr);
        if (b != j) {
            z2 = false;
        }
        if (z) {
            pgh.e("checkCrcChecksum", "exp = " + j + ", real = " + b + ", ret " + z2);
        }
        return z2;
    }

    public static byte[] e(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("affe333d", new Object[]{file});
        }
        try {
            byte[] bArr = new byte[(int) file.length()];
            FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.read(bArr);
            fileInputStream.close();
            return bArr;
        } catch (Throwable th) {
            pgh.m(th, "error while reading file");
            return null;
        }
    }

    public static long b(String... strArr) throws UnsupportedEncodingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3b26fab", new Object[]{strArr})).longValue();
        }
        CRC32 crc32 = new CRC32();
        for (String str : strArr) {
            if (str != null) {
                crc32.update(str.getBytes("utf-8"));
            }
        }
        return crc32.getValue();
    }
}
