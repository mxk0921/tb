package com.alipay.sdk.util;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Process;
import android.text.TextUtils;
import com.alipay.sdk.app.statistic.StatisticRecord;
import com.alipay.sdk.data.DynamicConfig;
import com.alipay.sdk.sys.BizContext;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class Utils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALIPAY_PACKAGE_NAME = "com.eg.android.AlipayGphone";
    public static final int ALIPAY_VERSIONCODE_START_Activity = 460;

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f4540a = {"10.1.5.1013151", "10.1.5.1013148"};

    public static ActivityInfo activityInfoForCtx(Context context) {
        ActivityInfo[] activityInfoArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActivityInfo) ipChange.ipc$dispatch("c2185cde", new Object[]{context});
        }
        try {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                for (ActivityInfo activityInfo : context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities) {
                    if (TextUtils.equals(activityInfo.name, activity.getClass().getName())) {
                        return activityInfo;
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            LogUtils.printExceptionStackTrace(th);
            return null;
        }
    }

    public static Map<String, String> convertArgs(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("83e57436", new Object[]{str});
        }
        HashMap hashMap = new HashMap();
        for (String str2 : str.split("&")) {
            int indexOf = str2.indexOf("=", 1);
            if (-1 != indexOf) {
                hashMap.put(str2.substring(0, indexOf), URLDecoder.decode(str2.substring(indexOf + 1)));
            }
        }
        return hashMap;
    }

    public static String getAlipayPkgName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("deb39642", new Object[0]);
        }
        return "com.eg.android.AlipayGphone";
    }

    public static String getAlipayServiceActionName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b357e059", new Object[]{str});
        }
        return "com.eg.android.AlipayGphone.IAlixPay";
    }

    public static ExpectedPkg getExpectedPkg(BizContext bizContext, Context context, List<DynamicConfig.LaunchAppSwitchItem> list) {
        ExpectedPkg a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExpectedPkg) ipChange.ipc$dispatch("5e34ccd8", new Object[]{bizContext, context, list});
        }
        if (list == null) {
            return null;
        }
        for (DynamicConfig.LaunchAppSwitchItem launchAppSwitchItem : list) {
            if (!(launchAppSwitchItem == null || (a2 = a(context, launchAppSwitchItem.pn, launchAppSwitchItem.v, launchAppSwitchItem.pk)) == null || a2.isSignIllegal(bizContext) || a2.isVersionIllegal())) {
                return a2;
            }
        }
        return null;
    }

    public static int getProcessUid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf849c51", new Object[0])).intValue();
        }
        try {
            return Process.myUid();
        } catch (Throwable th) {
            LogUtils.printExceptionStackTrace(th);
            return -200;
        }
    }

    public static String getRandomString(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e176e26e", new Object[]{new Integer(i)});
        }
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            int nextInt = random.nextInt(3);
            if (nextInt == 0) {
                sb.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 65.0d)));
            } else if (nextInt == 1) {
                sb.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 97.0d)));
            } else if (nextInt == 2) {
                sb.append(String.valueOf(new Random().nextInt(10)));
            }
        }
        return sb.toString();
    }

    public static boolean isAlipay1015ErrorVersion(PackageInfo packageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4515dc9", new Object[]{packageInfo})).booleanValue();
        }
        if (packageInfo == null) {
            return false;
        }
        try {
            String str = packageInfo.versionName;
            String[] strArr = f4540a;
            if (!TextUtils.equals(str, strArr[0])) {
                if (!TextUtils.equals(str, strArr[1])) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean isAlipayVersionBefore991(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("115f9477", new Object[]{context})).booleanValue();
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(getAlipayPkgName(), 128);
            if (packageInfo == null) {
                return false;
            }
            if (packageInfo.versionCode < 99) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            LogUtils.printExceptionStackTrace(th);
            return false;
        }
    }

    public static String md5Hash(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("991d9903", new Object[]{str});
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder(digest.length * 2);
            for (byte b : digest) {
                sb.append(Character.forDigit((b & 240) >> 4, 16));
                sb.append(Character.forDigit(b & 15, 16));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static String subString(String str, String str2, String str3) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b95f350a", new Object[]{str, str2, str3});
        }
        try {
            int indexOf = str3.indexOf(str) + str.length();
            if (indexOf < str.length()) {
                return "";
            }
            if (!TextUtils.isEmpty(str2)) {
                i = str3.indexOf(str2, indexOf);
            }
            if (i <= 0) {
                return str3.substring(indexOf);
            }
            return str3.substring(indexOf, i);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class ExpectedPkg {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final String expectedSignHex;
        public final int expectedVersionCode;
        public final PackageInfo pkgInfo;

        public ExpectedPkg(PackageInfo packageInfo, int i, String str) {
            this.pkgInfo = packageInfo;
            this.expectedVersionCode = i;
            this.expectedSignHex = str;
        }

        public final boolean isVersionIllegal() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6fab13d3", new Object[]{this})).booleanValue();
            }
            if (this.pkgInfo.versionCode < this.expectedVersionCode) {
                return true;
            }
            return false;
        }

        public final boolean isSignIllegal(BizContext bizContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6014fd85", new Object[]{this, bizContext})).booleanValue();
            }
            Signature[] signatureArr = this.pkgInfo.signatures;
            if (signatureArr == null || signatureArr.length == 0) {
                return false;
            }
            for (Signature signature : signatureArr) {
                String publicKey = Utils.getPublicKey(bizContext, signature.toByteArray());
                if (publicKey != null && !TextUtils.equals(publicKey, this.expectedSignHex)) {
                    LogUtils.i("mspl", "biz", StatisticRecord.EC_PUBLIC_KEY_UNMATCH, "Got " + publicKey + ", expected " + this.expectedSignHex);
                    return true;
                }
            }
            return false;
        }
    }

    public static String getPublicKey(BizContext bizContext, byte[] bArr) {
        BigInteger modulus;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("88e30de9", new Object[]{bizContext, bArr});
        }
        try {
            PublicKey publicKey = ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr))).getPublicKey();
            if (!(publicKey instanceof RSAPublicKey) || (modulus = ((RSAPublicKey) publicKey).getModulus()) == null) {
                return null;
            }
            return modulus.toString(16);
        } catch (Exception e) {
            LogUtils.e("mspl", e, "auth", StatisticRecord.EC_GET_PUBLIC_KEY_FROM_SIGN_EX);
            return null;
        }
    }

    public static boolean isExistAnyExpectedPackage(BizContext bizContext, Context context, List<DynamicConfig.LaunchAppSwitchItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2eb5e69c", new Object[]{bizContext, context, list})).booleanValue();
        }
        try {
            for (DynamicConfig.LaunchAppSwitchItem launchAppSwitchItem : list) {
                if (launchAppSwitchItem != null) {
                    try {
                        if (context.getPackageManager().getPackageInfo(launchAppSwitchItem.pn, 128) != null) {
                            return true;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        continue;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            LogUtils.e("mspl", th, "biz", StatisticRecord.EC_CHECK_LAUNCH_APP_EXIST_EX);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.alipay.sdk.util.Utils.ExpectedPkg a(android.content.Context r8, java.lang.String r9, int r10, java.lang.String r11) {
        /*
            r0 = 3
            r1 = 2
            r2 = 1
            r3 = 0
            java.lang.String r4 = "auth"
            java.lang.String r5 = "mspl"
            com.android.alibaba.ip.runtime.IpChange r6 = com.alipay.sdk.util.Utils.$ipChange
            boolean r7 = r6 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r7 == 0) goto L_0x0028
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r10)
            r10 = 4
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r3] = r8
            r10[r2] = r9
            r10[r1] = r4
            r10[r0] = r11
            java.lang.String r8 = "d6d9a54"
            java.lang.Object r8 = r6.ipc$dispatch(r8, r10)
            com.alipay.sdk.util.Utils$ExpectedPkg r8 = (com.alipay.sdk.util.Utils.ExpectedPkg) r8
            return r8
        L_0x0028:
            r6 = 0
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch: all -> 0x0034
            r7 = 192(0xc0, float:2.69E-43)
            android.content.pm.PackageInfo r8 = r8.getPackageInfo(r9, r7)     // Catch: all -> 0x0034
            goto L_0x0041
        L_0x0034:
            r8 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r1]
            r9[r3] = r4
            java.lang.String r7 = "GetPackageInfoEx"
            r9[r2] = r7
            com.alipay.sdk.util.LogUtils.e(r5, r8, r9)
            r8 = r6
        L_0x0041:
            if (r8 != 0) goto L_0x0048
            java.lang.String r9 = "info == null"
        L_0x0046:
            r7 = 0
            goto L_0x005a
        L_0x0048:
            android.content.pm.Signature[] r9 = r8.signatures
            if (r9 != 0) goto L_0x0050
            java.lang.String r9 = "info.signatures == null"
            goto L_0x0046
        L_0x0050:
            int r9 = r9.length
            if (r9 > 0) goto L_0x0057
            java.lang.String r9 = "info.signatures.length <= 0"
            goto L_0x0046
        L_0x0057:
            java.lang.String r9 = ""
            r7 = 1
        L_0x005a:
            if (r7 != 0) goto L_0x0069
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r3] = r4
            java.lang.String r3 = "NotIncludeSignatures"
            r0[r2] = r3
            r0[r1] = r9
            com.alipay.sdk.util.LogUtils.i(r5, r0)
        L_0x0069:
            if (r7 != 0) goto L_0x006c
            return r6
        L_0x006c:
            if (r8 != 0) goto L_0x006f
            return r6
        L_0x006f:
            com.alipay.sdk.util.Utils$ExpectedPkg r9 = new com.alipay.sdk.util.Utils$ExpectedPkg
            r9.<init>(r8, r10, r11)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.util.Utils.a(android.content.Context, java.lang.String, int, java.lang.String):com.alipay.sdk.util.Utils$ExpectedPkg");
    }
}
