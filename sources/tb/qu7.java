package tb;

import android.os.StatFs;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qu7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static long a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9a75c98", new Object[]{str})).longValue();
        }
        if (str == null) {
            return 0L;
        }
        StatFs statFs = new StatFs(str);
        long availableBlocks = statFs.getAvailableBlocks() * statFs.getBlockSize();
        StringBuilder sb = new StringBuilder("path=");
        sb.append(str);
        sb.append(", availableSize=");
        sb.append(availableBlocks);
        return availableBlocks;
    }

    public static String b(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a9320d6", new Object[]{file});
        }
        if (file.exists() && file.isFile()) {
            byte[] bArr = new byte[1024];
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                FileInputStream fileInputStream = new FileInputStream(file);
                while (true) {
                    int read = fileInputStream.read(bArr, 0, 1024);
                    if (read != -1) {
                        instance.update(bArr, 0, read);
                    } else {
                        fileInputStream.close();
                        return c(instance.digest());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static String c(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ecf228e1", new Object[]{bArr});
        }
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }
}
