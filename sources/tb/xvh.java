package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class xvh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(982516247);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("670559f5", new Object[]{str});
        }
        return str.replace('#', '_').replace('.', '_').replace('@', '_').replace(f7l.CONDITION_IF_MIDDLE, '_').replace(wh6.DIR, '_').replace('\\', '_').replace(f7l.CONDITION_IF, '_').replace('&', '_');
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("257656f1", new Object[]{str});
        }
        if (str == null) {
            return "";
        }
        try {
            return c(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            dwh.i(e);
            return "";
        }
    }

    public static String c(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6725db94", new Object[]{bArr});
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            return new BigInteger(1, instance.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            dwh.i(e);
            return "";
        }
    }

    public static boolean d(String str, byte[] bArr, Context context) {
        Throwable th;
        Exception e;
        FileOutputStream fileOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe988c3b", new Object[]{str, bArr, context})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || bArr == null || context == null) {
            return false;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(str);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
        try {
            fileOutputStream.write(bArr);
            try {
                fileOutputStream.close();
            } catch (IOException e3) {
                dwh.i(e3);
            }
            return true;
        } catch (Exception e4) {
            e = e4;
            fileOutputStream2 = fileOutputStream;
            dwh.h("MUSFileUtil saveFile: path is " + str, e);
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e5) {
                    dwh.i(e5);
                }
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e6) {
                    dwh.i(e6);
                }
            }
            throw th;
        }
    }
}
