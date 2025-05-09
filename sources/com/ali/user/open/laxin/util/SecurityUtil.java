package com.ali.user.open.laxin.util;

import android.content.Context;
import android.text.TextUtils;
import com.ali.user.open.core.trace.SDKLogger;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.media.MediaConstant;
import com.taobao.orange.OrangeConfig;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateFactory;
import java.util.HashMap;
import java.util.HashSet;
import tb.f8p;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class SecurityUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String AES_INIT_IV = "0122030405660708";
    public static final String DEFAULT_AUTH_CODE = "";
    private static final String LOGIN_DATA = ".logindata";
    private static final String TAG = "SecurityUtil";
    private static final HashSet<Integer> sGrantedCacheSet = new HashSet<>();
    private static String sPkgKeyDigest;
    private static final HashMap<String, String> sSignMap;
    private static volatile boolean sUmidTokenInited;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00de, code lost:
        if (r10.contains(r4) != false) goto L_0x00e2;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean checkPermission(android.content.Context r10, java.lang.String r11) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.ali.user.open.laxin.util.SecurityUtil.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = "a7e6b2d8"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r10
            r4[r0] = r11
            java.lang.Object r10 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            return r10
        L_0x001c:
            int r2 = android.os.Binder.getCallingUid()
            java.util.HashSet<java.lang.Integer> r3 = com.ali.user.open.laxin.util.SecurityUtil.sGrantedCacheSet
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            boolean r4 = r3.contains(r4)
            java.lang.String r5 = "SecurityUtil"
            if (r4 == 0) goto L_0x0035
            java.lang.String r10 = "has been granted"
            com.ali.user.open.core.trace.SDKLogger.d(r5, r10)
            return r0
        L_0x0035:
            if (r10 != 0) goto L_0x0038
            return r1
        L_0x0038:
            android.content.pm.PackageManager r4 = r10.getPackageManager()
            long r6 = android.os.SystemClock.elapsedRealtime()
            boolean r8 = android.text.TextUtils.isEmpty(r11)
            if (r8 == 0) goto L_0x004a
            java.lang.String r11 = r4.getNameForUid(r2)
        L_0x004a:
            java.lang.String r4 = getFingerprint(r10, r11)
            boolean r8 = android.text.TextUtils.isEmpty(r4)
            if (r8 == 0) goto L_0x0067
            int r8 = android.os.Binder.getCallingPid()
            java.lang.String r8 = getPackageName(r10, r8)
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 != 0) goto L_0x0067
            java.lang.String r4 = getFingerprint(r10, r8)
            r11 = r8
        L_0x0067:
            long r8 = android.os.SystemClock.elapsedRealtime()
            long r8 = r8 - r6
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r6 = "check calling package signature package:"
            r10.<init>(r6)
            r10.append(r11)
            java.lang.String r6 = ",signDigest:"
            r10.append(r6)
            r10.append(r4)
            java.lang.String r6 = ",costs:"
            r10.append(r6)
            r10.append(r8)
            java.lang.String r10 = r10.toString()
            com.ali.user.open.core.trace.SDKLogger.e(r5, r10)
            boolean r10 = android.text.TextUtils.isEmpty(r4)
            if (r10 != 0) goto L_0x00e1
            java.util.HashMap<java.lang.String, java.lang.String> r10 = com.ali.user.open.laxin.util.SecurityUtil.sSignMap
            boolean r10 = r10.containsKey(r4)
            if (r10 == 0) goto L_0x009c
            goto L_0x00e2
        L_0x009c:
            java.lang.String r10 = getTrustSignaturesOrange()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "content:"
            r6.<init>(r7)
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "load trust signatures"
            com.ali.user.open.core.trace.SDKLogger.d(r7, r6)
            boolean r6 = android.text.TextUtils.isEmpty(r10)
            if (r6 != 0) goto L_0x00e1
            com.ali.user.open.laxin.util.SecurityUtil$1 r6 = new com.ali.user.open.laxin.util.SecurityUtil$1
            r6.<init>()
            com.alibaba.fastjson.parser.Feature[] r8 = new com.alibaba.fastjson.parser.Feature[r1]
            java.lang.Object r10 = com.alibaba.fastjson.JSON.parseObject(r10, r6, r8)
            java.util.HashSet r10 = (java.util.HashSet) r10
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "contentSet:"
            r6.<init>(r8)
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            com.ali.user.open.core.trace.SDKLogger.d(r7, r6)
            if (r10 == 0) goto L_0x00e1
            boolean r10 = r10.contains(r4)
            if (r10 == 0) goto L_0x00e1
            goto L_0x00e2
        L_0x00e1:
            r0 = 0
        L_0x00e2:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r1 = "check result:package:"
            r10.<init>(r1)
            r10.append(r11)
            java.lang.String r11 = ",granted:"
            r10.append(r11)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            com.ali.user.open.core.trace.SDKLogger.e(r5, r10)
            if (r0 == 0) goto L_0x0104
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            r3.add(r10)
        L_0x0104:
            java.lang.String r10 = "before leave checkPermission"
            com.ali.user.open.core.trace.SDKLogger.e(r5, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.open.laxin.util.SecurityUtil.checkPermission(android.content.Context, java.lang.String):boolean");
    }

    public static String encryptMD5(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9855096", new Object[]{str, new Boolean(z)});
        }
        try {
            return encryptMD5(str.getBytes(), z);
        } catch (Exception e) {
            SDKLogger.w(TAG, "encryptMD5 Exception:" + e.getMessage());
            return "";
        }
    }

    private static Certificate getCertificate(Context context, String str) {
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
                    SDKLogger.w(TAG, th.getMessage());
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

    public static String getFingerprint(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c957df03", new Object[]{context, str});
        }
        Certificate certificate = getCertificate(context, str);
        if (certificate == null) {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(certificate.getEncoded());
            return toHexString(instance.digest(), false);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        } catch (CertificateEncodingException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String getPackageName(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a301e6c3", new Object[]{context, new Integer(i)});
        }
        String processName = getProcessName(context, i);
        SDKLogger.d(TAG, "getPackageName pid:" + i + ",processName:" + processName);
        if (TextUtils.isEmpty(processName)) {
            return null;
        }
        int indexOf = processName.indexOf(58);
        if (indexOf >= 0) {
            return processName.substring(0, indexOf);
        }
        return processName;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getProcessName(android.content.Context r5, int r6) {
        /*
            java.lang.String r0 = "/proc/"
            com.android.alibaba.ip.runtime.IpChange r1 = com.ali.user.open.laxin.util.SecurityUtil.$ipChange
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
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.open.laxin.util.SecurityUtil.getProcessName(android.content.Context, int):java.lang.String");
    }

    public static String getTrustSignaturesOrange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("33f7a64e", new Object[0]);
        }
        try {
            return OrangeConfig.getInstance().getConfig(LoginSwitch.CONFIG_GROUP_LOGIN, f8p.KEY_TRUST_SIGNATURES, MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
        } catch (Throwable unused) {
            return MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264;
        }
    }

    public static String toHexString(byte[] bArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5491182b", new Object[]{bArr, new Boolean(z)});
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
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

    static {
        t2o.a(73400346);
        HashMap<String, String> hashMap = new HashMap<>();
        sSignMap = hashMap;
        hashMap.put("baa4ebc0a3504b3acabdbcefc36ba4fbb2c2a54e", "ottvideochat");
        hashMap.put("ad2b6f15319cb0d7866678210a6c6915db4be4c0", "ottvideochat_debug");
    }

    public static String encryptMD5(byte[] bArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("695cb653", new Object[]{bArr, new Boolean(z)});
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.reset();
            instance.update(bArr);
            return toHexString(instance.digest(), z);
        } catch (NoSuchAlgorithmException e) {
            SDKLogger.w(TAG, "encryptMD5 Exception" + e.getMessage());
            return "";
        }
    }
}
