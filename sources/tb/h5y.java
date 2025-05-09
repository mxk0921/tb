package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.unionpay.utils.UPUtils;
import java.util.UUID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class h5y {
    public static String a() {
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str)) {
            return str.trim();
        }
        return "";
    }

    public static String b(Context context) {
        String str;
        try {
            if (context instanceof Activity) {
                str = ((Activity) context).getPackageName();
            } else {
                str = "";
            }
            if (str == null) {
                return "";
            }
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String c(android.content.Context r3, java.lang.String r4, java.lang.String r5) {
        /*
            java.lang.String r0 = ""
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: Exception -> 0x000e
            r1 = 64
            r2 = 0
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r4, r1)     // Catch: Exception -> 0x000e, NameNotFoundException -> 0x0011
            goto L_0x0016
        L_0x000e:
            r3 = move-exception
            goto L_0x006d
        L_0x0011:
            r3 = move-exception
            r3.printStackTrace()     // Catch: Exception -> 0x000e
            r3 = r2
        L_0x0016:
            if (r3 == 0) goto L_0x0070
            android.content.pm.Signature[] r3 = r3.signatures     // Catch: Exception -> 0x000e
            r4 = 0
            r3 = r3[r4]     // Catch: Exception -> 0x000e
            byte[] r3 = r3.toByteArray()     // Catch: Exception -> 0x000e
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch: Exception -> 0x000e
            r4.<init>(r3)     // Catch: Exception -> 0x000e
            java.lang.String r3 = "X509"
            java.security.cert.CertificateFactory r3 = java.security.cert.CertificateFactory.getInstance(r3)     // Catch: Exception -> 0x000e, CertificateException -> 0x002d
            goto L_0x0032
        L_0x002d:
            r3 = move-exception
            r3.printStackTrace()     // Catch: Exception -> 0x000e
            r3 = r2
        L_0x0032:
            if (r3 == 0) goto L_0x0044
            java.security.cert.Certificate r3 = r3.generateCertificate(r4)     // Catch: Exception -> 0x000e, CertificateException -> 0x0040
            boolean r4 = r3 instanceof java.security.cert.X509Certificate     // Catch: Exception -> 0x000e, CertificateException -> 0x0040
            if (r4 == 0) goto L_0x0044
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3     // Catch: Exception -> 0x000e, CertificateException -> 0x0040
            r2 = r3
            goto L_0x0044
        L_0x0040:
            r3 = move-exception
            r3.printStackTrace()     // Catch: Exception -> 0x000e
        L_0x0044:
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r5)     // Catch: Exception -> 0x000e, CertificateEncodingException -> 0x0057, NoSuchAlgorithmException -> 0x0059
            if (r2 == 0) goto L_0x005d
            byte[] r4 = r2.getEncoded()     // Catch: Exception -> 0x000e, CertificateEncodingException -> 0x0057, NoSuchAlgorithmException -> 0x0059
            byte[] r3 = r3.digest(r4)     // Catch: Exception -> 0x000e, CertificateEncodingException -> 0x0057, NoSuchAlgorithmException -> 0x0059
            java.lang.String r3 = d(r3)     // Catch: Exception -> 0x000e, CertificateEncodingException -> 0x0057, NoSuchAlgorithmException -> 0x0059
            goto L_0x005e
        L_0x0057:
            r3 = move-exception
            goto L_0x005a
        L_0x0059:
            r3 = move-exception
        L_0x005a:
            r3.printStackTrace()     // Catch: Exception -> 0x000e
        L_0x005d:
            r3 = r0
        L_0x005e:
            if (r3 == 0) goto L_0x006b
            java.lang.String r4 = ":"
            java.lang.String r0 = r3.replaceAll(r4, r0)     // Catch: Exception -> 0x0067
            goto L_0x0070
        L_0x0067:
            r4 = move-exception
            r0 = r3
            r3 = r4
            goto L_0x006d
        L_0x006b:
            r0 = r3
            goto L_0x0070
        L_0x006d:
            r3.printStackTrace()
        L_0x0070:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.h5y.c(android.content.Context, java.lang.String, java.lang.String):java.lang.String");
    }

    public static String d(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            String hexString = Integer.toHexString(bArr[i]);
            int length = hexString.length();
            if (length == 1) {
                hexString = "0".concat(hexString);
            }
            if (length > 2) {
                hexString = hexString.substring(length - 2, length);
            }
            sb.append(hexString.toUpperCase());
            if (i < bArr.length - 1) {
                sb.append(f7l.CONDITION_IF_MIDDLE);
            }
        }
        return sb.toString();
    }

    public static String e() {
        String str = Build.MODEL;
        if (!TextUtils.isEmpty(str)) {
            String trim = str.trim();
            if (!TextUtils.isEmpty(trim)) {
                return trim.replace(" ", "");
            }
        }
        return "";
    }

    public static String f(Context context) {
        if (context == null) {
            return "";
        }
        try {
            String c = UPUtils.c(context, "merchant_id");
            if (TextUtils.isEmpty(c)) {
                c = UUID.randomUUID().toString();
                if (!TextUtils.isEmpty(c)) {
                    c = c.replaceAll("-", "");
                    UPUtils.g(context, c, "merchant_id");
                }
            }
            return c;
        } catch (Exception unused) {
            return "";
        }
    }
}
