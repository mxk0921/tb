package com.loc;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import anet.channel.entity.ConnType;
import com.loc.w;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONObject;
import tb.kgd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    static String f5764a;
    private static final String[] b = {kgd.ABI_ARM64, "x86_64"};
    private static final String[] c = {"arm", "x86"};

    static {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 80; i++) {
            sb.append("=");
        }
        f5764a = sb.toString();
    }

    public static w a() throws k {
        return new w.a("collection", "1.0", "AMap_collection_1.0").a(new String[]{"com.amap.api.collection"}).a();
    }

    public static w b() throws k {
        return new w.a("co", "1.0.0", "AMap_co_1.0.0").a(new String[]{"com.amap.co", "com.amap.opensdk.co", "com.amap.location"}).a();
    }

    public static String c(String str) {
        return str.length() < 2 ? "" : p.a(str.substring(1));
    }

    public static PublicKey d() throws CertificateException, InvalidKeySpecException, NoSuchAlgorithmException, NullPointerException, IOException {
        ByteArrayInputStream byteArrayInputStream;
        try {
            byteArrayInputStream = new ByteArrayInputStream(p.b("MIICnjCCAgegAwIBAgIJAJ0Pdzos7ZfYMA0GCSqGSIb3DQEBBQUAMGgxCzAJBgNVBAYTAkNOMRMwEQYDVQQIDApTb21lLVN0YXRlMRAwDgYDVQQHDAdCZWlqaW5nMREwDwYDVQQKDAhBdXRvbmF2aTEfMB0GA1UEAwwWY29tLmF1dG9uYXZpLmFwaXNlcnZlcjAeFw0xMzA4MTUwNzU2NTVaFw0yMzA4MTMwNzU2NTVaMGgxCzAJBgNVBAYTAkNOMRMwEQYDVQQIDApTb21lLVN0YXRlMRAwDgYDVQQHDAdCZWlqaW5nMREwDwYDVQQKDAhBdXRvbmF2aTEfMB0GA1UEAwwWY29tLmF1dG9uYXZpLmFwaXNlcnZlcjCBnzANBgkqhkiG9w0BAQEFAAOBjQAwgYkCgYEA8eWAyHbFPoFPfdx5AD+D4nYFq4dbJ1p7SIKt19Oz1oivF/6H43v5Fo7s50pD1UF8+Qu4JoUQxlAgOt8OCyQ8DYdkaeB74XKb1wxkIYg/foUwN1CMHPZ9O9ehgna6K4EJXZxR7Y7XVZnbjHZIVn3VpPU/Rdr2v37LjTw+qrABJxMCAwEAAaNQME4wHQYDVR0OBBYEFOM/MLGP8xpVFuVd+3qZkw7uBvOTMB8GA1UdIwQYMBaAFOM/MLGP8xpVFuVd+3qZkw7uBvOTMAwGA1UdEwQFMAMBAf8wDQYJKoZIhvcNAQEFBQADgYEA4LY3g8aAD8JkxAOqUXDDyLuCCGOc2pTIhn0TwMNaVdH4hZlpTeC/wuRD5LJ0z3j+IQ0vLvuQA5uDjVyEOlBrvVIGwSem/1XGUo13DfzgAJ5k1161S5l+sFUo5TxpHOXr8Z5nqJMjieXmhnE/I99GFyHpQmw4cC6rhYUhdhtg+Zk="));
            try {
                CertificateFactory instance = CertificateFactory.getInstance(c("IWC41MDk"));
                KeyFactory instance2 = KeyFactory.getInstance(c("EUlNB"));
                Certificate generateCertificate = instance.generateCertificate(byteArrayInputStream);
                if (!(generateCertificate == null || instance2 == null)) {
                    PublicKey generatePublic = instance2.generatePublic(new X509EncodedKeySpec(generateCertificate.getPublicKey().getEncoded()));
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    return generatePublic;
                }
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                return null;
            } catch (Throwable unused) {
                if (byteArrayInputStream != null) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th3) {
                        th3.printStackTrace();
                    }
                }
                return null;
            }
        } catch (Throwable unused2) {
            byteArrayInputStream = null;
        }
    }

    private static String e(String str) {
        try {
        } catch (Throwable th) {
            as.a(th, BHRTaskConfigBase.TYPE_CONFIG_UT, "sPa");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] split = str.split("&");
        Arrays.sort(split);
        StringBuffer stringBuffer = new StringBuffer();
        for (String str2 : split) {
            stringBuffer.append(str2);
            stringBuffer.append("&");
        }
        String stringBuffer2 = stringBuffer.toString();
        if (stringBuffer2.length() > 1) {
            return (String) stringBuffer2.subSequence(0, stringBuffer2.length() - 1);
        }
        return str;
    }

    public static String f(byte[] bArr) {
        try {
            return g(bArr);
        } catch (Throwable th) {
            as.a(th, BHRTaskConfigBase.TYPE_CONFIG_UT, "csb2h");
            return null;
        }
    }

    public static String g(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        if (bArr == null) {
            return null;
        }
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                hexString = "0".concat(hexString);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    private static byte[] h(byte[] bArr) throws IOException, Throwable {
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        GZIPOutputStream gZIPOutputStream2 = null;
        if (bArr == null) {
            return null;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
        try {
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.finish();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th4) {
            th = th4;
            gZIPOutputStream2 = gZIPOutputStream;
            try {
                throw th;
            } catch (Throwable th5) {
                if (gZIPOutputStream2 != null) {
                    gZIPOutputStream2.close();
                }
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                throw th5;
            }
        }
    }

    public static String a(long j) {
        return a(j, "yyyyMMdd HH:mm:ss:SSS");
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        String c2 = p.c(a(str));
        try {
            return ((char) ((c2.length() % 26) + 65)) + c2;
        } catch (Throwable th) {
            as.a(th, BHRTaskConfigBase.TYPE_CONFIG_UT, "tsfb64");
            return "";
        }
    }

    public static byte[] c() {
        try {
            String[] split = new StringBuffer("16,16,18,77,15,911,121,77,121,911,38,77,911,99,86,67,611,96,48,77,84,911,38,67,021,301,86,67,611,98,48,77,511,77,48,97,511,58,48,97,511,84,501,87,511,96,48,77,221,911,38,77,121,37,86,67,25,301,86,67,021,96,86,67,021,701,86,67,35,56,86,67,611,37,221,87").reverse().toString().split(",");
            byte[] bArr = new byte[split.length];
            for (int i = 0; i < split.length; i++) {
                bArr[i] = Byte.parseByte(split[i]);
            }
            String[] split2 = new StringBuffer(new String(p.b(new String(bArr)))).reverse().toString().split(",");
            byte[] bArr2 = new byte[split2.length];
            for (int i2 = 0; i2 < split2.length; i2++) {
                bArr2[i2] = Byte.parseByte(split2[i2]);
            }
            return bArr2;
        } catch (Throwable th) {
            as.a(th, BHRTaskConfigBase.TYPE_CONFIG_UT, "gIV");
            return new byte[16];
        }
    }

    public static byte[] d(String str) {
        if (str.length() % 2 != 0) {
            str = "0".concat(str);
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) Integer.parseInt(str.substring(i2, i2 + 2), 16);
        }
        return bArr;
    }

    public static String e(byte[] bArr) {
        try {
            return g(bArr);
        } catch (Throwable th) {
            as.a(th, BHRTaskConfigBase.TYPE_CONFIG_UT, ConnType.H2S);
            return null;
        }
    }

    private static void f(String str) {
        int i;
        while (true) {
            if (str.length() < 78) {
                break;
            }
            String substring = str.substring(0, 78);
            StringBuilder sb = new StringBuilder("|");
            sb.append(substring);
            sb.append("|");
            str = str.substring(78);
        }
        StringBuilder sb2 = new StringBuilder("|");
        sb2.append(str);
        for (i = 0; i < 78 - str.length(); i++) {
            sb2.append(" ");
        }
        sb2.append("|");
    }

    public static String a(long j, String str) {
        try {
            return new SimpleDateFormat(str, Locale.CHINA).format(new Date(j));
        } catch (Throwable th) {
            as.a(th, BHRTaskConfigBase.TYPE_CONFIG_UT, "ctt");
            return null;
        }
    }

    public static String b(Map<String, String> map) {
        String str;
        if (map != null) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (sb.length() > 0) {
                    sb.append("&");
                }
                sb.append(entry.getKey());
                sb.append("=");
                sb.append(entry.getValue());
            }
            str = sb.toString();
        } else {
            str = null;
        }
        return e(str);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003f -> B:55:0x0060). Please submit an issue!!! */
    public static byte[] c(byte[] bArr) {
        Throwable th;
        ZipOutputStream zipOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr2 = null;
        if (bArr != null) {
            try {
            } catch (Throwable th2) {
                as.a(th2, BHRTaskConfigBase.TYPE_CONFIG_UT, "zp2");
            }
            if (bArr.length != 0) {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        zipOutputStream = new ZipOutputStream(byteArrayOutputStream);
                        try {
                            zipOutputStream.putNextEntry(new ZipEntry("log"));
                            zipOutputStream.write(bArr);
                            zipOutputStream.closeEntry();
                            zipOutputStream.finish();
                            bArr2 = byteArrayOutputStream.toByteArray();
                            try {
                                zipOutputStream.close();
                            } catch (Throwable th3) {
                                as.a(th3, BHRTaskConfigBase.TYPE_CONFIG_UT, "zp1");
                            }
                            byteArrayOutputStream.close();
                        } catch (Throwable th4) {
                            th = th4;
                            try {
                                as.a(th, BHRTaskConfigBase.TYPE_CONFIG_UT, "zp");
                                if (zipOutputStream != null) {
                                    try {
                                        zipOutputStream.close();
                                    } catch (Throwable th5) {
                                        as.a(th5, BHRTaskConfigBase.TYPE_CONFIG_UT, "zp1");
                                    }
                                }
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.close();
                                }
                                return bArr2;
                            } catch (Throwable th6) {
                                if (zipOutputStream != null) {
                                    try {
                                        zipOutputStream.close();
                                    } catch (Throwable th7) {
                                        as.a(th7, BHRTaskConfigBase.TYPE_CONFIG_UT, "zp1");
                                    }
                                }
                                if (byteArrayOutputStream != null) {
                                    try {
                                        byteArrayOutputStream.close();
                                    } catch (Throwable th8) {
                                        as.a(th8, BHRTaskConfigBase.TYPE_CONFIG_UT, "zp2");
                                    }
                                }
                                throw th6;
                            }
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        zipOutputStream = null;
                    }
                } catch (Throwable th10) {
                    th = th10;
                    byteArrayOutputStream = null;
                    zipOutputStream = null;
                }
                return bArr2;
            }
        }
        return null;
    }

    public static byte[] d(byte[] bArr) {
        try {
            return h(bArr);
        } catch (Throwable th) {
            th.printStackTrace();
            return new byte[0];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.content.Context r8) {
        /*
            java.lang.Class<android.os.Build> r0 = android.os.Build.class
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.String r2 = "ut"
            r3 = 1
            r4 = 28
            if (r1 >= r4) goto L_0x0031
            android.content.pm.ApplicationInfo r1 = r8.getApplicationInfo()     // Catch: all -> 0x002b
            java.lang.Class<android.content.pm.ApplicationInfo> r5 = android.content.pm.ApplicationInfo.class
            java.lang.String r5 = r5.getName()     // Catch: all -> 0x002b
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: all -> 0x002b
            java.lang.String r6 = "primaryCpuAbi"
            java.lang.reflect.Field r5 = r5.getDeclaredField(r6)     // Catch: all -> 0x002b
            r5.setAccessible(r3)     // Catch: all -> 0x002b
            java.lang.Object r1 = r5.get(r1)     // Catch: all -> 0x002b
            java.lang.String r1 = (java.lang.String) r1     // Catch: all -> 0x002b
            goto L_0x0033
        L_0x002b:
            r1 = move-exception
            java.lang.String r5 = "gct"
            com.loc.as.a(r1, r2, r5)
        L_0x0031:
            java.lang.String r1 = ""
        L_0x0033:
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r4) goto L_0x009e
            java.lang.String r4 = "SUPPORTED_ABIS"
            java.lang.reflect.Field r4 = r0.getDeclaredField(r4)     // Catch: all -> 0x004d
            r5 = 0
            java.lang.Object r4 = r4.get(r5)     // Catch: all -> 0x004d
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch: all -> 0x004d
            r6 = 0
            if (r4 == 0) goto L_0x004f
            int r7 = r4.length     // Catch: all -> 0x004d
            if (r7 <= 0) goto L_0x004f
            r1 = r4[r6]     // Catch: all -> 0x004d
            goto L_0x004f
        L_0x004d:
            r8 = move-exception
            goto L_0x0099
        L_0x004f:
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: all -> 0x004d
            if (r4 != 0) goto L_0x009e
            java.lang.String[] r4 = com.loc.x.b     // Catch: all -> 0x004d
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: all -> 0x004d
            boolean r4 = r4.contains(r1)     // Catch: all -> 0x004d
            if (r4 == 0) goto L_0x009e
            android.content.pm.ApplicationInfo r8 = r8.getApplicationInfo()     // Catch: all -> 0x004d
            java.lang.String r8 = r8.nativeLibraryDir     // Catch: all -> 0x004d
            boolean r4 = android.text.TextUtils.isEmpty(r8)     // Catch: all -> 0x004d
            if (r4 != 0) goto L_0x009e
            java.lang.String r4 = java.io.File.separator     // Catch: all -> 0x004d
            int r4 = r8.lastIndexOf(r4)     // Catch: all -> 0x004d
            int r4 = r4 + r3
            java.lang.String r8 = r8.substring(r4)     // Catch: all -> 0x004d
            java.lang.String[] r3 = com.loc.x.c     // Catch: all -> 0x004d
            java.util.List r3 = java.util.Arrays.asList(r3)     // Catch: all -> 0x004d
            boolean r8 = r3.contains(r8)     // Catch: all -> 0x004d
            if (r8 == 0) goto L_0x009e
            java.lang.String r8 = "SUPPORTED_32_BIT_ABIS"
            java.lang.reflect.Field r8 = r0.getDeclaredField(r8)     // Catch: all -> 0x004d
            java.lang.Object r8 = r8.get(r5)     // Catch: all -> 0x004d
            java.lang.String[] r8 = (java.lang.String[]) r8     // Catch: all -> 0x004d
            if (r8 == 0) goto L_0x009e
            int r0 = r8.length     // Catch: all -> 0x004d
            if (r0 <= 0) goto L_0x009e
            r8 = r8[r6]     // Catch: all -> 0x004d
            r1 = r8
            goto L_0x009e
        L_0x0099:
            java.lang.String r0 = "gct_p"
            com.loc.as.a(r8, r2, r0)
        L_0x009e:
            boolean r8 = android.text.TextUtils.isEmpty(r1)
            if (r8 == 0) goto L_0x00a6
            java.lang.String r1 = android.os.Build.CPU_ABI
        L_0x00a6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.x.a(android.content.Context):java.lang.String");
    }

    public static boolean b(Context context) {
        return ap.a(context);
    }

    public static String a(Throwable th) {
        Throwable th2;
        PrintWriter printWriter;
        StringWriter stringWriter;
        try {
            stringWriter = new StringWriter();
            try {
                printWriter = new PrintWriter(stringWriter);
                try {
                    th.printStackTrace(printWriter);
                    while (true) {
                        th = th.getCause();
                        if (th == null) {
                            break;
                        }
                        th.printStackTrace(printWriter);
                    }
                    String obj = stringWriter.toString();
                    try {
                        stringWriter.close();
                    } catch (Throwable th3) {
                        th3.printStackTrace();
                    }
                    try {
                        printWriter.close();
                    } catch (Throwable th4) {
                        th4.printStackTrace();
                    }
                    return obj;
                } catch (Throwable th5) {
                    th2 = th5;
                    try {
                        th2.printStackTrace();
                        return null;
                    } finally {
                        if (stringWriter != null) {
                            try {
                                stringWriter.close();
                            } catch (Throwable th6) {
                                th6.printStackTrace();
                            }
                        }
                        if (printWriter != null) {
                            try {
                                printWriter.close();
                            } catch (Throwable th7) {
                                th7.printStackTrace();
                            }
                        }
                    }
                }
            } catch (Throwable th8) {
                th2 = th8;
                printWriter = null;
            }
        } catch (Throwable th9) {
            th2 = th9;
            stringWriter = null;
            printWriter = null;
        }
    }

    public static byte[] b(byte[] bArr) {
        try {
            return h(bArr);
        } catch (Throwable th) {
            as.a(th, BHRTaskConfigBase.TYPE_CONFIG_UT, "gZp");
            return new byte[0];
        }
    }

    public static String a(Map<String, String> map) {
        if (map.size() == 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            boolean z = true;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (z) {
                    stringBuffer.append(entry.getKey());
                    stringBuffer.append("=");
                    stringBuffer.append(entry.getValue());
                    z = false;
                } else {
                    stringBuffer.append("&");
                    stringBuffer.append(entry.getKey());
                    stringBuffer.append("=");
                    stringBuffer.append(entry.getValue());
                }
            }
        } catch (Throwable th) {
            as.a(th, BHRTaskConfigBase.TYPE_CONFIG_UT, "abP");
        }
        return stringBuffer.toString();
    }

    public static String a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return new String(bArr);
        }
    }

    public static Calendar a(String str, String str2) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, Locale.CHINA);
            Calendar instance = Calendar.getInstance();
            Calendar instance2 = Calendar.getInstance();
            instance2.setTime(simpleDateFormat.parse(str));
            instance.set(instance.get(1), instance.get(2), instance.get(5), instance2.get(11), instance2.get(12), instance2.get(13));
            return instance;
        } catch (ParseException e) {
            as.a(e, BHRTaskConfigBase.TYPE_CONFIG_UT, "ctt");
            return null;
        }
    }

    public static void a(Context context, String str, String str2, JSONObject jSONObject) {
        String str3;
        String e = l.e(context);
        String a2 = s.a(e);
        String a3 = l.a(context);
        try {
            String str4 = "";
            if (jSONObject.has("info")) {
                str3 = jSONObject.getString("info");
                StringBuilder sb = new StringBuilder("请在高德开放平台官网中搜索\"");
                sb.append(str3);
                sb.append("\"相关内容进行解决");
            } else {
                str3 = str4;
            }
            if ("INVALID_USER_SCODE".equals(str3)) {
                String string = jSONObject.has("sec_code") ? jSONObject.getString("sec_code") : str4;
                if (jSONObject.has("sec_code_debug")) {
                    str4 = jSONObject.getString("sec_code_debug");
                }
                if (a2.equals(string) || a2.equals(str4)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(c("C6K+35Zyo6auY5b635byA5pS+5bmz5Y+w5a6Y572R5Lit5pCc57Si"));
                    sb2.append("\"请求内容过长导致业务调用失败\"相关内容进行解决");
                }
            } else if ("INVALID_USER_KEY".equals(str3)) {
                if (jSONObject.has("key")) {
                    str4 = jSONObject.getString("key");
                }
                if (str4.length() > 0 && !a3.equals(str4)) {
                    c("C6K+35Zyo6auY5b635byA5pS+5bmz5Y+w5a6Y572R5LiK5Y+R6LW35oqA5pyv5ZKo6K+i5bel5Y2V4oCUPui0puWPt+S4jktleemXrumimO+8jOWSqOivoklOVkFMSURfVVNFUl9LRVnlpoLkvZXop6PlhrM=");
                }
            }
        } catch (Throwable unused) {
        }
        f("SHA1Package:".concat(String.valueOf(e)));
        f("key:".concat(String.valueOf(a3)));
        f("csid:".concat(String.valueOf(str)));
        f("gsid:".concat(String.valueOf(str2)));
        f("json:" + jSONObject.toString());
    }

    public static void a(ByteArrayOutputStream byteArrayOutputStream, byte b2, byte[] bArr) {
        try {
            byteArrayOutputStream.write(new byte[]{b2});
            int i = b2 & 255;
            if (i < 255 && i > 0) {
                byteArrayOutputStream.write(bArr);
            } else if (i == 255) {
                byteArrayOutputStream.write(bArr, 0, 255);
            }
        } catch (IOException e) {
            as.a(e, BHRTaskConfigBase.TYPE_CONFIG_UT, "wFie");
        }
    }

    public static void a(ByteArrayOutputStream byteArrayOutputStream, String str) {
        if (TextUtils.isEmpty(str)) {
            try {
                byteArrayOutputStream.write(new byte[]{0});
            } catch (IOException e) {
                as.a(e, BHRTaskConfigBase.TYPE_CONFIG_UT, "wsf");
            }
        } else {
            int length = str.length();
            if (length > 255) {
                length = 255;
            }
            a(byteArrayOutputStream, (byte) length, a(str));
        }
    }

    public static boolean a(Context context, String str) {
        if (context == null || context.checkCallingOrSelfPermission(str) != 0) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 23 && context.getApplicationInfo().targetSdkVersion >= 23) {
            try {
                if (((Integer) context.getClass().getMethod("checkSelfPermission", String.class).invoke(context, str)).intValue() != 0) {
                    return false;
                }
            } catch (Throwable th) {
                as.a(th, BHRTaskConfigBase.TYPE_CONFIG_UT, "cpm");
            }
        }
        return true;
    }

    public static boolean a(JSONObject jSONObject, String str) {
        return jSONObject != null && jSONObject.has(str);
    }

    public static byte[] a(int i) {
        return new byte[]{(byte) (i / 256), (byte) (i % 256)};
    }

    public static byte[] a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes();
        }
    }
}
