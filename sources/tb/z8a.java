package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class z8a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806355854);
    }

    public static void a(File file) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("807b73c5", new Object[]{file});
        } else if (file != null && file.exists()) {
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    a(file2);
                }
            }
            file.delete();
        }
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9be3a42a", new Object[]{str});
        }
        return new BigInteger(h(str.getBytes())).abs().toString(36);
    }

    public static byte[] c(File file) {
        Throwable th;
        Exception e;
        StringBuilder sb;
        FileInputStream fileInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("e8653ca1", new Object[]{file});
        }
        byte[] bArr = new byte[(int) file.length()];
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            fileInputStream.read(bArr);
            try {
                fileInputStream.close();
            } catch (IOException e3) {
                e = e3;
                sb = new StringBuilder("getByte IOException exception: e = ");
                sb.append(e.getMessage());
                j("fileUtils", sb.toString());
                return bArr;
            }
        } catch (Exception e4) {
            e = e4;
            fileInputStream2 = fileInputStream;
            j("fileUtils", "getByte exception: e = " + e.getMessage());
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException e5) {
                    e = e5;
                    sb = new StringBuilder("getByte IOException exception: e = ");
                    sb.append(e.getMessage());
                    j("fileUtils", sb.toString());
                    return bArr;
                }
            }
            return bArr;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException e6) {
                    j("fileUtils", "getByte IOException exception: e = " + e6.getMessage());
                }
            }
            throw th;
        }
        return bArr;
    }

    public static String d(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d268cb06", new Object[]{bArr});
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            byte[] digest = instance.digest();
            char[] cArr2 = new char[digest.length * 2];
            int i = 0;
            for (byte b : digest) {
                int i2 = i + 1;
                cArr2[i] = cArr[(b >>> 4) & 15];
                i += 2;
                cArr2[i2] = cArr[b & 15];
            }
            return new String(cArr2);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String e(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7eca63f2", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            Uri parse = Uri.parse(str);
            String host = parse.getHost();
            String path = parse.getPath();
            str2 = b(host + path);
        } catch (Exception unused) {
            str2 = "";
        }
        return "" + str2;
    }

    public static String f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("208dba66", new Object[]{context});
        }
        if (context == null) {
            return "";
        }
        String absolutePath = context.getFilesDir().getAbsolutePath();
        return absolutePath + File.separator + "biggift";
    }

    public static String g(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c149273a", new Object[]{file});
        }
        return d(c(file));
    }

    public static byte[] h(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a01327a7", new Object[]{bArr});
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            return instance.digest();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean i(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ab63202", new Object[]{context, str, str2})).booleanValue();
        }
        File file = new File(f(context), e(str));
        if (!file.exists()) {
            return false;
        }
        if (TextUtils.isEmpty(str2) || str2.equals(g(file))) {
            return true;
        }
        a(file);
        return false;
    }

    public static void j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6495106b", new Object[]{str, str2});
        } else if (v2s.o().A() != null) {
            cwd A = v2s.o().A();
            A.c("TaoliveInteractive_" + str, str2);
        }
    }
}
