package tb;

import com.alipay.android.msp.framework.okio.SegmentPool;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class yai {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f31938a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        t2o.a(577765446);
    }

    public static String a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("33bf8aac", new Object[]{bArr});
        }
        return b(bArr, null);
    }

    public static String b(byte[] bArr, Character ch) {
        int i = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a16e0628", new Object[]{bArr, ch});
        }
        int length = bArr.length;
        if (ch != null) {
            i = 3;
        }
        StringBuffer stringBuffer = new StringBuffer(length * i);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b = bArr[i2];
            int i3 = (b >>> 4) & 15;
            int i4 = b & 15;
            if (i2 > 0 && ch != null) {
                stringBuffer.append(ch.charValue());
            }
            char[] cArr = f31938a;
            stringBuffer.append(cArr[i3]);
            stringBuffer.append(cArr[i4]);
        }
        return stringBuffer.toString();
    }

    public static MessageDigest c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MessageDigest) ipChange.ipc$dispatch("e247ea89", new Object[0]);
        }
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static byte[] d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("9d45252e", new Object[]{str});
        }
        return e(str.getBytes());
    }

    public static byte[] e(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("3a604fd1", new Object[]{bArr});
        }
        return c().digest(bArr);
    }

    public static String f(File file) throws IOException {
        Throwable th;
        FileInputStream fileInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d4054c5", new Object[]{file});
        }
        if (file.exists()) {
            FileInputStream fileInputStream2 = null;
            if (file.isDirectory()) {
                return null;
            }
            try {
                try {
                    fileInputStream = new FileInputStream(file);
                } catch (IOException e) {
                    throw e;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                String g = g(fileInputStream);
                try {
                    fileInputStream.close();
                } catch (Exception unused) {
                }
                return g;
            } catch (IOException e2) {
                throw e2;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (Exception unused2) {
                    }
                }
                throw th;
            }
        } else {
            throw new FileNotFoundException(file.toString());
        }
    }

    public static String g(InputStream inputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9418a31", new Object[]{inputStream});
        }
        long available = inputStream.available();
        if (available < 512) {
            available = 512;
        }
        if (available > SegmentPool.MAX_SIZE) {
            available = 65536;
        }
        byte[] bArr = new byte[(int) available];
        MessageDigest c = c();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return a(c.digest());
            }
            c.update(bArr, 0, read);
        }
    }

    public static String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dea3c6d2", new Object[]{str});
        }
        return a(d(str));
    }
}
