package com.unionpay.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.huawei.hms.android.SystemUtils;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.f7l;
import tb.g9y;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f14542a = new c();

    public static int a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0090, code lost:
        if (r0.equals(r9) != false) goto L_0x0094;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(android.content.Context r9) {
        /*
            java.lang.String r0 = "sePayConf"
            java.lang.String r1 = "configs"
            java.lang.String r2 = com.unionpay.utils.UPUtils.c(r9, r1)
            java.lang.String r3 = "mode"
            java.lang.String r3 = com.unionpay.utils.UPUtils.c(r9, r3)
            java.lang.String r4 = "or"
            java.lang.String r9 = com.unionpay.utils.UPUtils.c(r9, r4)
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            r5 = 0
            r6 = 2
            java.lang.String r7 = ""
            if (r4 != 0) goto L_0x0093
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x0093
            boolean r4 = android.text.TextUtils.isEmpty(r9)
            if (r4 != 0) goto L_0x0093
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: Exception -> 0x0093
            r4.<init>(r2)     // Catch: Exception -> 0x0093
            java.lang.String r2 = "sign"
            java.lang.String r2 = tb.g9y.b(r4, r2)     // Catch: Exception -> 0x0093
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: Exception -> 0x003e
            goto L_0x003f
        L_0x003e:
            r3 = 0
        L_0x003f:
            java.lang.String r8 = new java.lang.String     // Catch: Exception -> 0x0093
            java.lang.String r1 = r4.getString(r1)     // Catch: Exception -> 0x0093
            byte[] r1 = android.util.Base64.decode(r1, r6)     // Catch: Exception -> 0x0093
            r8.<init>(r1)     // Catch: Exception -> 0x0093
            boolean r1 = r4.has(r0)     // Catch: Exception -> 0x0093
            if (r1 == 0) goto L_0x0060
            java.lang.String r1 = new java.lang.String     // Catch: Exception -> 0x0093
            java.lang.String r0 = r4.getString(r0)     // Catch: Exception -> 0x0093
            byte[] r0 = android.util.Base64.decode(r0, r6)     // Catch: Exception -> 0x0093
            r1.<init>(r0)     // Catch: Exception -> 0x0093
            goto L_0x0061
        L_0x0060:
            r1 = r7
        L_0x0061:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: Exception -> 0x0093
            if (r0 == 0) goto L_0x0068
            r1 = r7
        L_0x0068:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: Exception -> 0x0093
            r0.<init>()     // Catch: Exception -> 0x0093
            r0.append(r8)     // Catch: Exception -> 0x0093
            r0.append(r1)     // Catch: Exception -> 0x0093
            r0.append(r9)     // Catch: Exception -> 0x0093
            java.lang.String r9 = r0.toString()     // Catch: Exception -> 0x0093
            java.lang.String r9 = com.unionpay.utils.UPUtils.d(r9)     // Catch: Exception -> 0x0093
            java.lang.String r9 = m(r9)     // Catch: Exception -> 0x0093
            java.lang.String r0 = com.unionpay.utils.UPUtils.b(r3, r2)     // Catch: Exception -> 0x0093
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: Exception -> 0x0093
            if (r1 != 0) goto L_0x0093
            boolean r9 = r0.equals(r9)     // Catch: Exception -> 0x0093
            if (r9 == 0) goto L_0x0093
            goto L_0x0094
        L_0x0093:
            r8 = r7
        L_0x0094:
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch: Exception -> 0x00c9
            r9.<init>(r8)     // Catch: Exception -> 0x00c9
            int r0 = r9.length()
        L_0x009d:
            if (r5 >= r0) goto L_0x00c9
            java.lang.Object r1 = tb.g9y.a(r9, r5)
            if (r1 == 0) goto L_0x00c6
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            java.lang.String r2 = "type"
            java.lang.String r2 = tb.g9y.b(r1, r2)
            java.lang.String r3 = "app"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x00c6
            java.lang.String r9 = "ca"
            java.lang.String r9 = tb.g9y.b(r1, r9)
            java.lang.String r0 = new java.lang.String
            byte[] r9 = android.util.Base64.decode(r9, r6)
            r0.<init>(r9)
            return r0
        L_0x00c6:
            int r5 = r5 + 1
            goto L_0x009d
        L_0x00c9:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unionpay.utils.a.b(android.content.Context):java.lang.String");
    }

    public static String c(InputStream inputStream, String str) {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[2048];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    return byteArrayOutputStream.toString(str);
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public static String d(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String b = g9y.b(jSONObject, "sign");
            String b2 = g9y.b(jSONObject, "configs");
            if (TextUtils.isEmpty(b) || TextUtils.isEmpty(b2)) {
                return null;
            }
            String str3 = new String(Base64.decode(b2, 2));
            String m = m(UPUtils.d(str3));
            String b3 = UPUtils.b(a(str2), b);
            if (TextUtils.isEmpty(b3)) {
                return null;
            }
            if (b3.equals(m)) {
                return str3;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String e(byte[] bArr) {
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

    public static boolean f() {
        try {
            return SystemUtils.PRODUCT_HUAWEI.equalsIgnoreCase(Build.MANUFACTURER);
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean g(Context context, String str) {
        PackageInfo packageInfo = null;
        if (context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && !TextUtils.isEmpty(str)) {
                    packageInfo = packageManager.getPackageInfo(str, 0);
                }
            } catch (Exception unused) {
            }
        }
        if (packageInfo != null) {
            return true;
        }
        return false;
    }

    public static boolean h(Context context, String str, String str2) {
        int i;
        int s = s(context, str);
        try {
            i = u(str2);
        } catch (Exception unused) {
            i = Integer.MAX_VALUE;
        }
        if (s >= i) {
            return true;
        }
        return false;
    }

    public static boolean i(Context context, String str, String str2, String str3) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                    int s = s(context, str);
                    int u = u(str3);
                    if (g(context, str) && s >= u) {
                        if (str2.equalsIgnoreCase(l(context, str, "SHA256"))) {
                            return true;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean j(Context context, String str, String str2, String str3, String str4) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                    if (str4 == null || TextUtils.isEmpty(str4)) {
                        str4 = "11";
                    }
                    String q = q(context, str);
                    if ((!t(str4) || !TextUtils.isEmpty(q)) && g(context, str) && ((("11".equals(str4) || "10".equals(str4)) && str2.equalsIgnoreCase(l(context, str, "SHA1"))) || str2.equalsIgnoreCase(l(context, str, "SHA256")))) {
                        if (t(str4) && q.matches(str3)) {
                            return true;
                        }
                        if (h(context, str, str3)) {
                            return true;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:19|39|20|(6:45|25|47|29|(1:31)|(2:35|36))|28|47|29|(0)|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
        r3.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0050 A[Catch: NoSuchAlgorithmException | CertificateEncodingException -> 0x005d, NoSuchAlgorithmException -> 0x005f, Exception -> 0x006c, TRY_LEAVE, TryCatch #1 {Exception -> 0x006c, blocks: (B:4:0x0005, B:8:0x000f, B:10:0x0015, B:13:0x001b, B:15:0x001f, B:17:0x0022, B:19:0x0027, B:20:0x0030, B:22:0x0038, B:25:0x003e, B:27:0x0046, B:29:0x004a, B:31:0x0050, B:33:0x0060, B:35:0x0065), top: B:41:0x0005, inners: #0, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065 A[Catch: Exception -> 0x006c, TRY_LEAVE, TryCatch #1 {Exception -> 0x006c, blocks: (B:4:0x0005, B:8:0x000f, B:10:0x0015, B:13:0x001b, B:15:0x001f, B:17:0x0022, B:19:0x0027, B:20:0x0030, B:22:0x0038, B:25:0x003e, B:27:0x0046, B:29:0x004a, B:31:0x0050, B:33:0x0060, B:35:0x0065), top: B:41:0x0005, inners: #0, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String l(android.content.Context r3, java.lang.String r4, java.lang.String r5) {
        /*
            java.lang.String r0 = ""
            r1 = 0
            if (r3 == 0) goto L_0x000a
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: Exception -> 0x006c
            goto L_0x000b
        L_0x000a:
            r3 = r1
        L_0x000b:
            if (r3 == 0) goto L_0x0018
            r2 = 64
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r4, r2)     // Catch: NameNotFoundException -> 0x0014, Exception -> 0x006c
            goto L_0x0019
        L_0x0014:
            r3 = move-exception
            r3.printStackTrace()     // Catch: Exception -> 0x006c
        L_0x0018:
            r3 = r1
        L_0x0019:
            if (r3 == 0) goto L_0x006c
            android.content.pm.Signature[] r3 = r3.signatures     // Catch: Exception -> 0x006c
            if (r3 == 0) goto L_0x006c
            int r4 = r3.length     // Catch: Exception -> 0x006c
            if (r4 <= 0) goto L_0x006c
            r4 = 0
            r3 = r3[r4]     // Catch: Exception -> 0x006c
            if (r3 == 0) goto L_0x006c
            byte[] r3 = r3.toByteArray()     // Catch: Exception -> 0x006c
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch: Exception -> 0x006c
            r4.<init>(r3)     // Catch: Exception -> 0x006c
            java.lang.String r3 = "X509"
            java.security.cert.CertificateFactory r3 = java.security.cert.CertificateFactory.getInstance(r3)     // Catch: CertificateException -> 0x0037, Exception -> 0x006c
            goto L_0x003c
        L_0x0037:
            r3 = move-exception
            r3.printStackTrace()     // Catch: Exception -> 0x006c
            r3 = r1
        L_0x003c:
            if (r3 == 0) goto L_0x0049
            java.security.cert.Certificate r3 = r3.generateCertificate(r4)     // Catch: CertificateException -> 0x0045, Exception -> 0x006c
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3     // Catch: CertificateException -> 0x0045, Exception -> 0x006c
            goto L_0x004a
        L_0x0045:
            r3 = move-exception
            r3.printStackTrace()     // Catch: Exception -> 0x006c
        L_0x0049:
            r3 = r1
        L_0x004a:
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r5)     // Catch: CertificateEncodingException -> 0x005d, NoSuchAlgorithmException -> 0x005f, Exception -> 0x006c
            if (r3 == 0) goto L_0x0063
            byte[] r3 = r3.getEncoded()     // Catch: CertificateEncodingException -> 0x005d, NoSuchAlgorithmException -> 0x005f, Exception -> 0x006c
            byte[] r3 = r4.digest(r3)     // Catch: CertificateEncodingException -> 0x005d, NoSuchAlgorithmException -> 0x005f, Exception -> 0x006c
            java.lang.String r1 = e(r3)     // Catch: CertificateEncodingException -> 0x005d, NoSuchAlgorithmException -> 0x005f, Exception -> 0x006c
            goto L_0x0063
        L_0x005d:
            r3 = move-exception
            goto L_0x0060
        L_0x005f:
            r3 = move-exception
        L_0x0060:
            r3.printStackTrace()     // Catch: Exception -> 0x006c
        L_0x0063:
            if (r1 == 0) goto L_0x006c
            java.lang.String r3 = ":"
            java.lang.String r3 = r1.replaceAll(r3, r0)     // Catch: Exception -> 0x006c
            return r3
        L_0x006c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unionpay.utils.a.l(android.content.Context, java.lang.String, java.lang.String):java.lang.String");
    }

    public static String m(String str) {
        byte[] bytes;
        if (str == null) {
            return "";
        }
        char[] charArray = "0123456789ABCDEF".toCharArray();
        StringBuilder sb = new StringBuilder("");
        for (byte b : str.getBytes()) {
            sb.append(charArray[(b & 240) >> 4]);
            sb.append(charArray[b & 15]);
        }
        return sb.toString().trim();
    }

    public static String o(Context context, String str) {
        return l(context, str, "SHA1");
    }

    public static String p(String str) {
        HashMap hashMap = f14542a;
        if (!TextUtils.isEmpty((CharSequence) hashMap.get(str))) {
            return (String) hashMap.get(str);
        }
        return str;
    }

    public static String q(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo != null) {
                return packageInfo.versionName;
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static String r(String str) {
        if (str == null) {
            return "";
        }
        try {
            return Pattern.compile("[\":,\\[\\]{}]").matcher(str).replaceAll("").trim();
        } catch (Exception unused) {
            return "";
        }
    }

    public static int s(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo != null) {
                return packageInfo.versionCode;
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static boolean t(String str) {
        if ("11".equals(str) || "01".equals(str)) {
            return true;
        }
        return false;
    }

    public static int u(String str) {
        try {
            return Integer.valueOf(str, 10).intValue();
        } catch (Exception unused) {
            return Integer.MAX_VALUE;
        }
    }

    public static ArrayList n(Context context, String str) {
        ArrayList arrayList = null;
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                Object a2 = g9y.a(jSONArray, i);
                if (a2 instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) a2;
                    if ("app".equals(g9y.b(jSONObject, "type"))) {
                        JSONArray c = g9y.c(jSONObject, "package_info");
                        ArrayList arrayList2 = new ArrayList();
                        int i2 = 0;
                        while (c != null) {
                            try {
                                if (i2 >= c.length()) {
                                    break;
                                }
                                Object a3 = g9y.a(c, i2);
                                if ((a3 instanceof JSONObject) && k(context, (JSONObject) a3)) {
                                    arrayList2.add(g9y.b((JSONObject) a3, "appEnAbbr"));
                                }
                                i2++;
                            } catch (Exception unused) {
                                return arrayList2;
                            }
                        }
                        arrayList = arrayList2;
                    } else {
                        continue;
                    }
                }
            }
            return arrayList;
        } catch (Exception unused2) {
            return arrayList;
        }
    }

    public static boolean k(Context context, JSONObject jSONObject) {
        if (context == null || jSONObject == null) {
            return false;
        }
        return j(context, g9y.b(jSONObject, "schema"), g9y.b(jSONObject, "sign"), g9y.b(jSONObject, "version"), g9y.b(jSONObject, "checkMode"));
    }
}
