package com.alipay.mobile.common.logging.helper;

import android.text.TextUtils;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ClientIdHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
        if (r4.startsWith(r6) == false) goto L_0x008c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b1, code lost:
        if (r1.startsWith(r4) == false) goto L_0x00b5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.content.Context r8) {
        /*
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = com.alipay.mobile.common.logging.helper.ClientIdHelper.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = "bbc5dc40"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r8
            java.lang.Object r8 = r1.ipc$dispatch(r2, r3)
            java.lang.String r8 = (java.lang.String) r8
            return r8
        L_0x0015:
            com.alipay.mobile.common.logging.util.LoggingSPCache r1 = com.alipay.mobile.common.logging.util.LoggingSPCache.getInstance()
            r2 = 0
            java.lang.String r3 = "clientID"
            java.lang.String r1 = r1.getString(r3, r2)
            com.alipay.mobile.common.logging.util.LoggingSPCache r2 = com.alipay.mobile.common.logging.util.LoggingSPCache.getInstance()
            java.lang.String r4 = "clientIMEI"
            java.lang.String r5 = ""
            java.lang.String r2 = r2.getString(r4, r5)
            java.lang.String r6 = "android.permission.READ_PHONE_STATE"
            int r6 = r8.checkCallingOrSelfPermission(r6)     // Catch: all -> 0x0059
            if (r6 != 0) goto L_0x005a
            java.lang.String r6 = "phone"
            java.lang.Object r8 = r8.getSystemService(r6)     // Catch: all -> 0x0059
            android.telephony.TelephonyManager r8 = (android.telephony.TelephonyManager) r8     // Catch: all -> 0x0059
            java.lang.String r5 = com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getSubscriberId(r8)     // Catch: all -> 0x0059
            boolean r6 = android.text.TextUtils.isEmpty(r2)     // Catch: all -> 0x0059
            if (r6 == 0) goto L_0x005a
            java.lang.String r2 = com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getDeviceId(r8)     // Catch: all -> 0x0059
            boolean r8 = android.text.TextUtils.isEmpty(r2)     // Catch: all -> 0x0059
            if (r8 != 0) goto L_0x005a
            com.alipay.mobile.common.logging.util.LoggingSPCache r8 = com.alipay.mobile.common.logging.util.LoggingSPCache.getInstance()     // Catch: all -> 0x0059
            r8.putStringApply(r4, r2)     // Catch: all -> 0x0059
            goto L_0x005a
        L_0x0059:
        L_0x005a:
            boolean r8 = android.text.TextUtils.isEmpty(r1)
            if (r8 == 0) goto L_0x0062
            r8 = 0
            goto L_0x0068
        L_0x0062:
            java.lang.String r8 = "[[a-z][A-Z][0-9]]{15}\\|[[a-z][A-Z][0-9]]{15}"
            boolean r8 = r1.matches(r8)
        L_0x0068:
            if (r8 == 0) goto L_0x00c1
            r8 = 15
            java.lang.String r4 = r1.substring(r0, r8)
            boolean r6 = d(r5)
            if (r6 == 0) goto L_0x008b
            java.lang.String r6 = f(r5)
            int r7 = r6.length()
            if (r7 <= r8) goto L_0x0084
            java.lang.String r6 = r6.substring(r0, r8)
        L_0x0084:
            boolean r6 = r4.startsWith(r6)
            if (r6 != 0) goto L_0x008b
            goto L_0x008c
        L_0x008b:
            r5 = r4
        L_0x008c:
            int r4 = r1.length()
            int r4 = r4 - r8
            int r6 = r1.length()
            java.lang.String r1 = r1.substring(r4, r6)
            boolean r4 = d(r2)
            if (r4 == 0) goto L_0x00b4
            java.lang.String r4 = f(r2)
            int r6 = r4.length()
            if (r6 <= r8) goto L_0x00ad
            java.lang.String r4 = r4.substring(r0, r8)
        L_0x00ad:
            boolean r8 = r1.startsWith(r4)
            if (r8 != 0) goto L_0x00b4
            goto L_0x00b5
        L_0x00b4:
            r2 = r1
        L_0x00b5:
            java.lang.String r8 = b(r5, r2)
            com.alipay.mobile.common.logging.util.LoggingSPCache r0 = com.alipay.mobile.common.logging.util.LoggingSPCache.getInstance()
            r0.putStringApply(r3, r8)
            goto L_0x00e0
        L_0x00c1:
            boolean r8 = d(r2)
            if (r8 != 0) goto L_0x00cb
            java.lang.String r2 = a()
        L_0x00cb:
            boolean r8 = d(r5)
            if (r8 != 0) goto L_0x00d5
            java.lang.String r5 = a()
        L_0x00d5:
            java.lang.String r8 = b(r5, r2)
            com.alipay.mobile.common.logging.util.LoggingSPCache r0 = com.alipay.mobile.common.logging.util.LoggingSPCache.getInstance()
            r0.putStringApply(r3, r8)
        L_0x00e0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.helper.ClientIdHelper.a(android.content.Context):java.lang.String");
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        return e(str) + "|" + e(str2);
    }

    public static boolean c(byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8217958", new Object[]{new Byte(b)})).booleanValue();
        }
        if ((b < 48 || b > 57) && ((b < 97 || b > 122) && (b < 65 || b > 90))) {
            return false;
        }
        return true;
    }

    public static String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (!d(str)) {
            str = a();
        }
        return f((str + "123456789012345").substring(0, 15));
    }

    public static String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        byte[] bytes = str.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            if (!c(bytes[i])) {
                bytes[i] = 48;
            }
        }
        return new String(bytes);
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (!(str == null || str.trim().length() == 0)) {
            String trim = str.trim();
            return !trim.equalsIgnoreCase("unknown") && !trim.equalsIgnoreCase("null") && !trim.matches("[0]+") && trim.length() > 5;
        }
        return false;
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : new SimpleDateFormat("yyMMddHHmmssSSS").format(Long.valueOf(System.currentTimeMillis()));
    }
}
