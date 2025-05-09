package tb;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.common.PackageConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class af2 {

    /* renamed from: a  reason: collision with root package name */
    public static final Uri f15705a = Uri.parse("content://com.huawei.hwid");
    public static final String[] b = {"B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05", PackageConstants.SERVICES_SIGNATURE_V3};

    public static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        File file = new File(str);
        if (file.exists()) {
            x5y.e("BksUtil", "The directory  has already exists");
            return 1;
        } else if (file.mkdirs()) {
            return 0;
        } else {
            x5y.c("BksUtil", "create directory  failed");
            return -1;
        }
    }

    public static String b(Context context) {
        Context createDeviceProtectedStorageContext;
        if (Build.VERSION.SDK_INT >= 24) {
            StringBuilder sb = new StringBuilder();
            createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
            sb.append(createDeviceProtectedStorageContext.getFilesDir());
            sb.append(File.separator);
            sb.append("aegis");
            return sb.toString();
        }
        return context.getApplicationContext().getFilesDir() + File.separator + "aegis";
    }

    public static String c(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static void d(InputStream inputStream, Context context) {
        Throwable th;
        FileOutputStream fileOutputStream;
        if (inputStream != null && context != null) {
            String b2 = b(context);
            if (!new File(b2).exists()) {
                a(b2);
            }
            File file = new File(b2, "hmsrootcas.bks");
            if (file.exists()) {
                file.delete();
            }
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    x5y.d("BksUtil", "write output stream ");
                    fileOutputStream = new FileOutputStream(file);
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException unused) {
            }
            try {
                byte[] bArr = new byte[2048];
                while (true) {
                    int read = inputStream.read(bArr, 0, 2048);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        r3y.c(fileOutputStream);
                        return;
                    }
                }
            } catch (IOException unused2) {
                fileOutputStream2 = fileOutputStream;
                x5y.c("BksUtil", " IOException");
                r3y.c(fileOutputStream2);
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream2 = fileOutputStream;
                r3y.c(fileOutputStream2);
                throw th;
            }
        }
    }

    public static byte[] e(Context context, String str) {
        PackageInfo packageInfo;
        if (context == null || TextUtils.isEmpty(str)) {
            Log.e("BksUtil", "packageName is null or context is null");
            return new byte[0];
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (!(packageManager == null || (packageInfo = packageManager.getPackageInfo(str, 64)) == null)) {
                return packageInfo.signatures[0].toByteArray();
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("BksUtil", "PackageManager.NameNotFoundException : " + e.getMessage());
        } catch (Exception e2) {
            Log.e("BksUtil", "get pm exception : " + e2.getMessage());
        }
        return new byte[0];
    }

    public static String f(Context context) {
        return b(context) + File.separator + "hmsrootcas.bks";
    }

    public static String g(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(bArr);
            return c(instance.digest());
        } catch (NoSuchAlgorithmException unused) {
            x5y.c("BksUtil", "inputstraem exception");
            return "";
        }
    }

    public static boolean h(Context context, String str) {
        return PackageConstants.SERVICES_SIGNATURE_V3.equalsIgnoreCase(j(e(context, str)));
    }

    public static boolean i(String str) {
        int parseInt;
        int i;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        x5y.d("BksUtil", "hms version code is : " + str);
        String[] split = str.split("\\.");
        String[] split2 = "4.0.2.300".split("\\.");
        int length = split.length;
        int length2 = split2.length;
        int max = Math.max(length, length2);
        for (int i2 = 0; i2 < max; i2++) {
            if (i2 < length) {
                try {
                    parseInt = Integer.parseInt(split[i2]);
                } catch (Exception e) {
                    x5y.c("BksUtil", " exception : " + e.getMessage());
                    if (i2 >= length2) {
                        return true;
                    }
                    return false;
                }
            } else {
                parseInt = 0;
            }
            if (i2 < length2) {
                i = Integer.parseInt(split2[i2]);
            } else {
                i = 0;
            }
            if (parseInt < i) {
                return false;
            }
            if (parseInt > i) {
                return true;
            }
        }
        return true;
    }

    public static String j(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        try {
            return c(MessageDigest.getInstance("SHA-256").digest(bArr));
        } catch (NoSuchAlgorithmException e) {
            Log.e("BksUtil", "NoSuchAlgorithmException" + e.getMessage());
            return "";
        }
    }

    public static boolean k(Context context) {
        return new File(b(context) + File.separator + "hmsrootcas.bks").exists();
    }

    public static boolean l(Context context, String str) {
        byte[] e = e(context, str);
        for (String str2 : b) {
            if (str2.equalsIgnoreCase(j(e))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.OutputStream, java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r3v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean] */
    /* JADX WARN: Unknown variable types count: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized java.io.InputStream m(android.content.Context r9) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.af2.m(android.content.Context):java.io.InputStream");
    }

    public static InputStream n(Context context) {
        if (!k(context)) {
            return null;
        }
        x5y.d("BksUtil", "getFilesBksIS ");
        try {
            return new FileInputStream(f(context));
        } catch (FileNotFoundException unused) {
            x5y.c("BksUtil", "FileNotFoundExceptio: ");
            return null;
        }
    }
}
