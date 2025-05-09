package tb;

import com.alibaba.security.ccrc.service.build.C1180n;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ebi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f18448a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX WARN: Multi-variable type inference failed */
    public static String a(File file) throws Throwable {
        Throwable th;
        FileChannel fileChannel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef8d90f6", new Object[]{file});
        }
        FileChannel fileChannel2 = null;
        if (!file.isFile()) {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                fileChannel2 = fileInputStream.getChannel();
                ByteBuffer allocate = ByteBuffer.allocate(C1180n.b);
                int i = 0;
                while (true) {
                    int read = fileChannel2.read(allocate);
                    if (read != -1) {
                        instance.update(allocate.array(), 0, read);
                        allocate.position(0);
                        i++;
                        if (i % 20 == 19) {
                            Thread.yield();
                        }
                    } else {
                        String c = c(instance.digest());
                        y1d.a(fileInputStream);
                        y1d.a(fileChannel2);
                        return c;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                fileChannel = fileChannel2;
                fileChannel2 = fileInputStream;
                y1d.a(fileChannel2);
                y1d.a(fileChannel);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileChannel = null;
        }
    }

    public static String b(String str) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2a58283", new Object[]{str});
        }
        return a(new File(str));
    }

    public static String c(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b00ac246", new Object[]{bArr});
        }
        char[] cArr = new char[32];
        int i = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            byte b = bArr[i2];
            int i3 = i + 1;
            char[] cArr2 = f18448a;
            cArr[i] = cArr2[(b >>> 4) & 15];
            i += 2;
            cArr[i3] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public static boolean d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aad8d698", new Object[]{str, str2})).booleanValue();
        }
        if (trq.c(str) || trq.c(str2)) {
            rbn.e("md5-utils.matchMd5", "md5 = " + str + ", filePath = " + str2);
            return false;
        }
        try {
            return trq.d(str.toLowerCase(), b(str2));
        } catch (Throwable th) {
            rbn.g("md5-utils.matchMd5", th);
            return false;
        }
    }
}
