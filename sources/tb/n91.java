package tb;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.security.MessageDigest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class n91 {

    /* renamed from: a  reason: collision with root package name */
    public static String f24578a;
    public static String b;
    public static String c;
    public static final char[] d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static synchronized String a(Context context) {
        String str;
        synchronized (n91.class) {
            d(context);
            str = f24578a;
        }
        return str;
    }

    public static synchronized String b(Context context) {
        String str;
        synchronized (n91.class) {
            try {
                try {
                    if (c == null) {
                        c = c(context.getPackageManager().getPackageInfo(a(context), 64).signatures[0].toByteArray());
                    }
                    str = c;
                } catch (Exception e) {
                    e.printStackTrace();
                    return "";
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public static String c(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            byte[] digest = instance.digest();
            char[] cArr = new char[32];
            int i = 0;
            for (int i2 = 0; i2 < 16; i2++) {
                byte b2 = digest[i2];
                int i3 = i + 1;
                char[] cArr2 = d;
                cArr[i] = cArr2[(b2 >>> 4) & 15];
                i += 2;
                cArr[i3] = cArr2[b2 & 15];
            }
            return new String(cArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void d(Context context) {
        if (f24578a == null || b == null) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                b = packageInfo.versionName;
                f24578a = packageInfo.packageName;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
