package com.alipay.mobile.intelligentdecision;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.mobile.intelligentdecision.log.DecisionLogcat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class IDeviceInfoUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static int f4229a = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum BiometryType {
        NONE,
        TOUCH,
        FACE,
        ALL;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(BiometryType biometryType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/intelligentdecision/IDeviceInfoUtil$BiometryType");
        }

        public static BiometryType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BiometryType) ipChange.ipc$dispatch("3b4a6a70", new Object[]{str});
            }
            return (BiometryType) Enum.valueOf(BiometryType.class, str);
        }
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : Build.BRAND;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        return Build.MODEL;
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
        }
        return Build.VERSION.RELEASE;
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[0]);
        }
        DecisionLogcat.b("IDeviceInfoUtil", "getNetworkName:");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) DecisionContext.getInstance().getContext().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
            int type = activeNetworkInfo.getType();
            if (type == 1) {
                return "WIFI";
            }
            if (type == 0) {
                return "4G/3G";
            }
        }
        return "-";
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]);
        }
        Context context = DecisionContext.getInstance().getContext();
        if (context != null) {
            return context.getPackageName();
        }
        DecisionLogcat.a("IDeviceInfoUtil", "getAppName failed!");
        return "";
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[0]);
        }
        Context context = DecisionContext.getInstance().getContext();
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Throwable th) {
            DecisionLogcat.a("IDeviceInfoUtil", th.getMessage());
            return "";
        }
    }

    public static String a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cd4d069b", new Object[]{new Integer(i), str});
        }
        if (i > 0 && !TextUtils.isEmpty(str) && str.length() > i) {
            return str.substring(str.length() - i, str.length());
        }
        return "";
    }

    public static Object a(Bundle bundle, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("34a853bc", new Object[]{bundle, str});
        }
        if (bundle == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return bundle.get(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0064 A[Catch: all -> 0x0049, TryCatch #1 {all -> 0x0049, blocks: (B:9:0x001f, B:11:0x002d, B:13:0x0035, B:15:0x0041, B:23:0x0059, B:25:0x0064, B:27:0x006f, B:20:0x004c), top: B:31:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(android.content.Context r4) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.alipay.mobile.intelligentdecision.IDeviceInfoUtil.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "9e1d6453"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            java.lang.Object r4 = r2.ipc$dispatch(r3, r1)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            return r4
        L_0x0019:
            int r2 = com.alipay.mobile.intelligentdecision.IDeviceInfoUtil.f4229a
            r3 = -1
            if (r2 == r3) goto L_0x001f
            return r2
        L_0x001f:
            com.alipay.mobile.intelligentdecision.IDeviceInfoUtil$BiometryType r2 = com.alipay.mobile.intelligentdecision.IDeviceInfoUtil.BiometryType.NONE     // Catch: all -> 0x0049
            int r2 = r2.ordinal()     // Catch: all -> 0x0049
            com.alipay.mobile.intelligentdecision.IDeviceInfoUtil.f4229a = r2     // Catch: all -> 0x0049
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: all -> 0x0049
            r3 = 23
            if (r2 < r3) goto L_0x004b
            java.lang.String r2 = "android.permission.USE_FINGERPRINT"
            int r2 = tb.o9k.a(r4, r2)     // Catch: all -> 0x0049
            if (r2 != 0) goto L_0x004b
            java.lang.String r2 = "fingerprint"
            java.lang.Object r4 = r4.getSystemService(r2)     // Catch: all -> 0x0049
            android.hardware.fingerprint.FingerprintManager r4 = tb.cj9.a(r4)     // Catch: all -> 0x0049
            if (r4 == 0) goto L_0x004b
            boolean r4 = tb.lzb.a(r4)     // Catch: all -> 0x0049
            if (r4 == 0) goto L_0x004b
            r4 = 1
            goto L_0x004c
        L_0x0049:
            r4 = move-exception
            goto L_0x0078
        L_0x004b:
            r4 = 0
        L_0x004c:
            int r0 = android.hardware.Camera.getNumberOfCameras()     // Catch: all -> 0x0051
            goto L_0x0055
        L_0x0051:
            r2 = move-exception
            r2.printStackTrace()     // Catch: all -> 0x0049
        L_0x0055:
            if (r4 == 0) goto L_0x0062
            if (r0 <= r1) goto L_0x0062
            com.alipay.mobile.intelligentdecision.IDeviceInfoUtil$BiometryType r4 = com.alipay.mobile.intelligentdecision.IDeviceInfoUtil.BiometryType.ALL     // Catch: all -> 0x0049
            int r4 = r4.ordinal()     // Catch: all -> 0x0049
            com.alipay.mobile.intelligentdecision.IDeviceInfoUtil.f4229a = r4     // Catch: all -> 0x0049
            goto L_0x0081
        L_0x0062:
            if (r4 == 0) goto L_0x006d
            com.alipay.mobile.intelligentdecision.IDeviceInfoUtil$BiometryType r4 = com.alipay.mobile.intelligentdecision.IDeviceInfoUtil.BiometryType.TOUCH     // Catch: all -> 0x0049
            int r4 = r4.ordinal()     // Catch: all -> 0x0049
            com.alipay.mobile.intelligentdecision.IDeviceInfoUtil.f4229a = r4     // Catch: all -> 0x0049
            goto L_0x0081
        L_0x006d:
            if (r0 <= r1) goto L_0x0081
            com.alipay.mobile.intelligentdecision.IDeviceInfoUtil$BiometryType r4 = com.alipay.mobile.intelligentdecision.IDeviceInfoUtil.BiometryType.FACE     // Catch: all -> 0x0049
            int r4 = r4.ordinal()     // Catch: all -> 0x0049
            com.alipay.mobile.intelligentdecision.IDeviceInfoUtil.f4229a = r4     // Catch: all -> 0x0049
            goto L_0x0081
        L_0x0078:
            java.lang.String r0 = "IDeviceInfoUtil"
            java.lang.String r4 = r4.getMessage()
            com.alipay.mobile.intelligentdecision.log.DecisionLogcat.a(r0, r4)
        L_0x0081:
            int r4 = com.alipay.mobile.intelligentdecision.IDeviceInfoUtil.f4229a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.intelligentdecision.IDeviceInfoUtil.a(android.content.Context):int");
    }
}
