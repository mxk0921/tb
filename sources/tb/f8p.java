package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.TypeReference;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateFactory;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class f8p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_TRUST_SIGNATURES = "trust_signatures";

    /* renamed from: a  reason: collision with root package name */
    public static final HashSet<Integer> f19104a = new HashSet<>();
    public static final HashMap<String, String> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends TypeReference<HashSet<String>> {
    }

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        b = hashMap;
        hashMap.put("19446e81f05a3243e11f00bd51b62f9a18d11b8c", "sso_demo");
        hashMap.put("ff4c78842c83ae30235bcf04b8a749e28811ad3a", "debug_taote");
        hashMap.put("18d47b466ca927509834929e7897d9d703944e54", "release_taote");
    }

    public static Certificate b(Context context, String str) {
        ByteArrayInputStream byteArrayInputStream;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Certificate) ipChange.ipc$dispatch("5723e48d", new Object[]{context, str});
        }
        try {
            byteArrayInputStream = new ByteArrayInputStream(context.getPackageManager().getPackageInfo(str, 64).signatures[0].toByteArray());
            try {
                Certificate generateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(byteArrayInputStream);
                try {
                    byteArrayInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return generateCertificate;
            } catch (Throwable th2) {
                th = th2;
                try {
                    nhh.u("SecurityUtil", th, new Object[0]);
                    return null;
                } finally {
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayInputStream = null;
        }
    }

    public static String c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c957df03", new Object[]{context, str});
        }
        Certificate b2 = b(context, str);
        if (b2 == null) {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(b2.getEncoded());
            return f(instance.digest(), false);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        } catch (CertificateEncodingException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String e(android.content.Context r5, int r6) {
        /*
            java.lang.String r0 = "/proc/"
            com.android.alibaba.ip.runtime.IpChange r1 = tb.f8p.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x001f
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r6)
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r2 = 0
            r6[r2] = r5
            r5 = 1
            r6[r5] = r0
            java.lang.String r5 = "6ec675fa"
            java.lang.Object r5 = r1.ipc$dispatch(r5, r6)
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L_0x001f:
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: all -> 0x005d, Exception -> 0x005f
            java.io.FileReader r3 = new java.io.FileReader     // Catch: all -> 0x005d, Exception -> 0x005f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: all -> 0x005d, Exception -> 0x005f
            r4.<init>(r0)     // Catch: all -> 0x005d, Exception -> 0x005f
            r4.append(r6)     // Catch: all -> 0x005d, Exception -> 0x005f
            java.lang.String r0 = "/cmdline"
            r4.append(r0)     // Catch: all -> 0x005d, Exception -> 0x005f
            java.lang.String r0 = r4.toString()     // Catch: all -> 0x005d, Exception -> 0x005f
            r3.<init>(r0)     // Catch: all -> 0x005d, Exception -> 0x005f
            r2.<init>(r3)     // Catch: all -> 0x005d, Exception -> 0x005f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: all -> 0x004b, Exception -> 0x004e
            r0.<init>()     // Catch: all -> 0x004b, Exception -> 0x004e
        L_0x0040:
            int r3 = r2.read()     // Catch: all -> 0x004b, Exception -> 0x004e
            if (r3 <= 0) goto L_0x0050
            char r3 = (char) r3     // Catch: all -> 0x004b, Exception -> 0x004e
            r0.append(r3)     // Catch: all -> 0x004b, Exception -> 0x004e
            goto L_0x0040
        L_0x004b:
            r5 = move-exception
            r1 = r2
            goto L_0x0092
        L_0x004e:
            r0 = move-exception
            goto L_0x0061
        L_0x0050:
            java.lang.String r1 = r0.toString()     // Catch: all -> 0x004b, Exception -> 0x004e
            r2.close()     // Catch: Exception -> 0x0058
            goto L_0x0069
        L_0x0058:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0069
        L_0x005d:
            r5 = move-exception
            goto L_0x0092
        L_0x005f:
            r0 = move-exception
            r2 = r1
        L_0x0061:
            r0.printStackTrace()     // Catch: all -> 0x004b
            if (r2 == 0) goto L_0x0069
            r2.close()     // Catch: Exception -> 0x0058
        L_0x0069:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0091
            java.lang.String r0 = "activity"
            java.lang.Object r5 = r5.getSystemService(r0)
            android.app.ActivityManager r5 = (android.app.ActivityManager) r5
            java.util.List r5 = r5.getRunningAppProcesses()
            java.util.Iterator r5 = r5.iterator()
        L_0x007f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0091
            java.lang.Object r0 = r5.next()
            android.app.ActivityManager$RunningAppProcessInfo r0 = (android.app.ActivityManager.RunningAppProcessInfo) r0
            int r2 = r0.pid
            if (r2 != r6) goto L_0x007f
            java.lang.String r1 = r0.processName
        L_0x0091:
            return r1
        L_0x0092:
            if (r1 == 0) goto L_0x009c
            r1.close()     // Catch: Exception -> 0x0098
            goto L_0x009c
        L_0x0098:
            r6 = move-exception
            r6.printStackTrace()
        L_0x009c:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.f8p.e(android.content.Context, int):java.lang.String");
    }

    public static String f(byte[] bArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5491182b", new Object[]{bArr, new Boolean(z)});
        }
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (z) {
                hexString = hexString.toUpperCase();
            }
            if (hexString.length() == 1) {
                sb.append("0");
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0105, code lost:
        if (r14.contains(r7) != false) goto L_0x00c1;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(android.content.Context r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.f8p.a(android.content.Context, java.lang.String):boolean");
    }

    public static String d(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a301e6c3", new Object[]{context, new Integer(i)});
        }
        String e = e(context, i);
        nhh.f("SecurityUtil", "getPackageName pid", Integer.valueOf(i), "processName", e);
        if (TextUtils.isEmpty(e)) {
            return null;
        }
        int indexOf = e.indexOf(58);
        return indexOf >= 0 ? e.substring(0, indexOf) : e;
    }
}
