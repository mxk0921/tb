package com.alipay.android.msp.framework.sys;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.pay.GlobalConstant;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.MspContextUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import tb.slo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DeviceInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static DeviceInfo e;
    public static NetConnectionType f = NetConnectionType.NETWORK_TYPE_16;
    public static long g = 0;

    /* renamed from: a  reason: collision with root package name */
    public String f3674a;
    public String b;
    public final String c;
    public WifiManager d;

    public DeviceInfo(Context context) {
        try {
            this.c = context.getPackageManager().getPackageInfo(context.getPackageName(), 128).versionName;
        } catch (Exception e2) {
            LogUtil.printExceptionStackTrace(e2);
        }
        if (TextUtils.isEmpty(this.c)) {
            this.c = "10.0.0";
        }
        e(context);
    }

    public static /* synthetic */ void access$000(DeviceInfo deviceInfo, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db8b79f1", new Object[]{deviceInfo, context});
        } else {
            deviceInfo.e(context);
        }
    }

    public static String c(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("47058030", new Object[]{bArr});
        }
        try {
            String obj = ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr))).getPublicKey().toString();
            if (obj.contains("modulus")) {
                return obj.substring(obj.indexOf("modulus") + 8, obj.lastIndexOf(",")).trim();
            }
            return null;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return null;
        }
    }

    public static boolean canUseHardwareAcceleration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21f07dca", new Object[0])).booleanValue();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
        if (r2 == null) goto L_0x0052;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String d(java.lang.String[] r4) {
        /*
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = com.alipay.android.msp.framework.sys.DeviceInfo.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = "d79cb5cd"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r4
            java.lang.Object r4 = r1.ipc$dispatch(r2, r3)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L_0x0015:
            java.lang.String r1 = ""
            r2 = 0
            java.lang.ProcessBuilder r3 = new java.lang.ProcessBuilder     // Catch: all -> 0x0049, Exception -> 0x004b
            r3.<init>(r4)     // Catch: all -> 0x0049, Exception -> 0x004b
            r3.redirectErrorStream(r0)     // Catch: all -> 0x0049, Exception -> 0x004b
            java.lang.Process r2 = r3.start()     // Catch: all -> 0x0049, Exception -> 0x004b
            java.io.DataOutputStream r4 = new java.io.DataOutputStream     // Catch: all -> 0x0049, Exception -> 0x004b
            java.io.OutputStream r0 = r2.getOutputStream()     // Catch: all -> 0x0049, Exception -> 0x004b
            r4.<init>(r0)     // Catch: all -> 0x0049, Exception -> 0x004b
            java.io.DataInputStream r0 = new java.io.DataInputStream     // Catch: all -> 0x0049, Exception -> 0x004b
            java.io.InputStream r3 = r2.getInputStream()     // Catch: all -> 0x0049, Exception -> 0x004b
            r0.<init>(r3)     // Catch: all -> 0x0049, Exception -> 0x004b
            java.lang.String r1 = r0.readLine()     // Catch: all -> 0x0049, Exception -> 0x004b
            java.lang.String r0 = "exit\n"
            r4.writeBytes(r0)     // Catch: all -> 0x0049, Exception -> 0x004b
            r4.flush()     // Catch: all -> 0x0049, Exception -> 0x004b
            r2.waitFor()     // Catch: all -> 0x0049, Exception -> 0x004b
        L_0x0045:
            r2.destroy()     // Catch: Exception -> 0x0052
            goto L_0x0052
        L_0x0049:
            r4 = move-exception
            goto L_0x0053
        L_0x004b:
            r4 = move-exception
            com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r4)     // Catch: all -> 0x0049
            if (r2 == 0) goto L_0x0052
            goto L_0x0045
        L_0x0052:
            return r1
        L_0x0053:
            if (r2 == 0) goto L_0x0058
            r2.destroy()     // Catch: Exception -> 0x0058
        L_0x0058:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.sys.DeviceInfo.d(java.lang.String[]):java.lang.String");
    }

    public static byte[] f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("b8fc348", new Object[]{context});
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.eg.android.AlipayGphone", 64);
            if (packageInfo != null) {
                return packageInfo.signatures[0].toByteArray();
            }
            return null;
        } catch (Exception e2) {
            LogUtil.printExceptionStackTrace(e2);
            return null;
        }
    }

    public static String getAPN() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("902da3b0", new Object[0]);
        }
        try {
            return getNetConnectionType().getName().toLowerCase();
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return "-";
        }
    }

    public static DeviceInfo getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeviceInfo) ipChange.ipc$dispatch("905348f4", new Object[]{context});
        }
        if (e == null) {
            synchronized (DeviceInfo.class) {
                try {
                    if (e == null) {
                        e = new DeviceInfo(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public static String getLocal(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("553d2e94", new Object[]{context});
        }
        if (context == null) {
            return "";
        }
        try {
            return context.getResources().getConfiguration().locale.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String getModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a78b0366", new Object[0]);
        }
        String str = Build.MODEL;
        if (TextUtils.isEmpty(str)) {
            return "unknow";
        }
        return str.replace(";", " ");
    }

    public static NetConnectionType getNetConnectionType() {
        NetworkInfo networkInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetConnectionType) ipChange.ipc$dispatch("8228a419", new Object[0]);
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - g < 15000) {
            return f;
        }
        g = currentTimeMillis;
        ConnectivityManager connectivityManager = (ConnectivityManager) MspContextUtil.getContext().getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.getType() == 0) {
            f = NetConnectionType.getTypeByCode(networkInfo.getSubtype());
        } else if (networkInfo == null || networkInfo.getType() != 1) {
            f = NetConnectionType.NETWORK_TYPE_16;
        } else {
            f = NetConnectionType.WIFI;
        }
        return f;
    }

    public static String getOS() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50288b7f", new Object[0]);
        }
        return "android";
    }

    public static String getOSVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3514bdfb", new Object[0]);
        }
        String str = Build.VERSION.RELEASE;
        return TextUtils.isEmpty(str) ? "unknow" : str;
    }

    public static String getOsInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cad59051", new Object[0]);
        }
        return "android " + Build.VERSION.RELEASE;
    }

    public static String getRoot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb1a0ca1", new Object[0]);
        }
        String[] strArr = {"/system/xbin/", "/system/bin/", "/system/sbin/", "/sbin/", "/vendor/bin/"};
        for (int i = 0; i < 5; i++) {
            try {
                String str = strArr[i] + "su";
                if (new File(str).exists()) {
                    String d = d(new String[]{RVStartParams.KEY_LANDSCAPE_SHORT, "-l", str});
                    if (!TextUtils.isEmpty(d)) {
                        if (d.indexOf("root") != d.lastIndexOf("root")) {
                            return "1";
                        }
                    }
                    return "0";
                }
            } catch (Exception e2) {
                LogUtil.printExceptionStackTrace(e2);
            }
        }
        return "0";
    }

    public static String getSIM(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7b881580", new Object[]{context});
        }
        if (context == null || PhoneCashierMspEngine.getMspWallet().isBackgroundRunning(context)) {
            LogUtil.record(4, "DeviceInfo:getSIM", "getSIM null ctx:".concat(String.valueOf(context)));
            return "-1";
        } else if (Build.VERSION.SDK_INT >= 29) {
            return "-1";
        } else {
            String str = null;
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null && ContextCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") == 0) {
                    if (TextUtils.equals(PhoneCashierMspEngine.getMspWallet().getWalletConfig("MQP_disable_imsi_10556"), slo.VALUE_YES)) {
                        return "-1";
                    }
                    str = ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getSubscriberId(telephonyManager);
                }
            } catch (Exception unused) {
            }
            if (str == null) {
                return "-1";
            }
            if (str.startsWith("46000") || str.startsWith("46002")) {
                return "0";
            }
            if (str.startsWith("46001")) {
                return "1";
            }
            if (str.startsWith("46003")) {
                return "2";
            }
            return "-1";
        }
    }

    public static String getUid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea2ce1f", new Object[0]);
        }
        try {
            return String.valueOf(Process.myUid());
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return "e";
        }
    }

    public static String getWifiSSID(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3351f8a5", new Object[]{context});
        }
        if (context == null || PhoneCashierMspEngine.getMspWallet().isBackgroundRunning(context)) {
            LogUtil.record(4, "DeviceInfo:getWifiSSID", "getWifiSSID null by ctx + ".concat(String.valueOf(context)));
            return "00";
        } else if (TextUtils.equals(PhoneCashierMspEngine.getMspWallet().getWalletConfig("MQP_disable_ssid_10556"), slo.VALUE_YES)) {
            return "00";
        } else {
            try {
                WifiManager wifiManager = PhoneCashierMspEngine.getMspWallet().getWifiManager(context);
                WifiInfo connectionInfo = wifiManager != null ? wifiManager.getConnectionInfo() : null;
                if (connectionInfo != null) {
                    return connectionInfo.getSSID();
                }
                return "00";
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
                return "00";
            }
        }
    }

    public static boolean hasAlipayWallet(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d271c3a8", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            packageManager.getPackageGids("com.eg.android.AlipayGphone");
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            LogUtil.printExceptionStackTrace(e2);
            try {
                packageManager.getPackageGids("com.eg.android.AlipayGphoneRC");
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        }
    }

    public static boolean isInAlipayWallet(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fb6da5f3", new Object[]{context})).booleanValue() : isInAlipayWallet(context.getApplicationContext().getPackageName());
    }

    public static boolean isInTaobao(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4e760d2", new Object[]{str})).booleanValue();
        }
        return TextUtils.equals("com.taobao.taobao", str);
    }

    public static boolean isM836Device() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94b4d759", new Object[0])).booleanValue();
        }
        String str = Build.MODEL;
        if (str == null || !str.contains("M836")) {
            return false;
        }
        return true;
    }

    public static boolean isProcessExit(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f20d9ac", new Object[]{context, str})).booleanValue();
        }
        try {
            File[] listFiles = new File("/proc").listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File file : listFiles) {
                    if (file.isDirectory()) {
                        try {
                            if (TextUtils.equals(str, String.valueOf(Integer.parseInt(file.getName())))) {
                                return true;
                            }
                        } catch (NumberFormatException e2) {
                            LogUtil.printExceptionStackTrace(e2);
                        }
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return false;
        }
    }

    public static boolean isSupportCertPay(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("229388a6", new Object[]{context})).booleanValue();
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.eg.android.AlipayGphone", 128);
            if (packageInfo == null) {
                return false;
            }
            String c = c(f(context));
            if (c != null && !TextUtils.equals(c, "b6cbad6cbd5ed0d209afc69ad3b7a617efaae9b3c47eabe0be42d924936fa78c8001b1fd74b079e5ff9690061dacfa4768e981a526b9ca77156ca36251cf2f906d105481374998a7e6e6e18f75ca98b8ed2eaf86ff402c874cca0a263053f22237858206867d210020daa38c48b20cc9dfd82b44a51aeb5db459b22794e2d649")) {
                return false;
            }
            if (packageInfo.versionCode >= 96) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return false;
        }
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c07efd5", new Object[]{this, str});
            return;
        }
        if (str != null) {
            str = str.concat("000000000000000").substring(0, 15);
        }
        if (TextUtils.isEmpty(this.f3674a)) {
            this.f3674a = str;
        }
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6398916", new Object[]{this, str});
            return;
        }
        if (str != null) {
            byte[] bytes = str.getBytes();
            for (int i = 0; i < bytes.length; i++) {
                byte b = bytes[i];
                if (b < 48 || b > 57) {
                    bytes[i] = 48;
                }
            }
            str = new String(bytes).concat("000000000000000").substring(0, 15);
        }
        if (TextUtils.isEmpty(this.b)) {
            this.b = str;
        }
    }

    public final void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4dc1896", new Object[]{this, context});
            return;
        }
        try {
            if (PhoneCashierMspEngine.getMspWallet().isBackgroundRunning(context)) {
                LogUtil.record(4, "DeviceInfo:initIMEIAndIMSI", "return context: ".concat(String.valueOf(context)));
                return;
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null && Build.VERSION.SDK_INT < 29 && ContextCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") == 0 && !TextUtils.equals(PhoneCashierMspEngine.getMspWallet().getWalletConfig("MQP_disable_imei_10556"), slo.VALUE_YES)) {
                b(ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getDeviceId(telephonyManager));
            }
            boolean isSimImsi = isSimImsi();
            boolean isSimNoImsi = isSimNoImsi();
            if (isSimImsi) {
                a("460011234567890");
            } else if (isSimNoImsi) {
                a("000000000000000");
            } else if (telephonyManager != null && Build.VERSION.SDK_INT < 29 && ContextCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") == 0) {
                if (TextUtils.equals(PhoneCashierMspEngine.getMspWallet().getWalletConfig("MQP_disable_imsi_10556"), slo.VALUE_YES)) {
                    a("000000000000000");
                } else {
                    a(ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getSubscriberId(telephonyManager));
                }
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public String getIMEI(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("95cf663d", new Object[]{this, context});
        }
        if (TextUtils.isEmpty(this.b) && Build.VERSION.SDK_INT < 29 && !PhoneCashierMspEngine.getMspWallet().isBackgroundRunning(context)) {
            TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.sys.DeviceInfo.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        DeviceInfo.access$000(DeviceInfo.this, context);
                    }
                }
            });
        }
        if (TextUtils.isEmpty(this.b)) {
            this.b = "000000000000000";
        }
        return this.b;
    }

    public String getIMSI(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bee4406f", new Object[]{this, context});
        }
        if (TextUtils.isEmpty(this.f3674a) && !PhoneCashierMspEngine.getMspWallet().isBackgroundRunning(context)) {
            TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.sys.DeviceInfo.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        DeviceInfo.access$000(DeviceInfo.this, context);
                    }
                }
            });
        }
        if (TextUtils.isEmpty(this.f3674a)) {
            this.f3674a = "000000000000000";
        }
        return this.f3674a;
    }

    public static boolean isInAlipayWallet(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("79181d87", new Object[]{str})).booleanValue() : TextUtils.equals("com.eg.android.AlipayGphone", str) || TextUtils.equals("com.eg.android.AlipayGphoneRC", str);
    }

    public boolean isSimImsi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d14b1072", new Object[]{this})).booleanValue();
        }
        Context context = GlobalHelper.getInstance().getContext();
        if (context == null) {
            return false;
        }
        return context.getSharedPreferences(GlobalConstant.GLOBAL_SETTINGS, 0).getBoolean("is_sim_imsi", false);
    }

    public boolean isSimNoImsi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dabc4a13", new Object[]{this})).booleanValue();
        }
        Context context = GlobalHelper.getInstance().getContext();
        if (context == null) {
            return false;
        }
        return context.getSharedPreferences(GlobalConstant.GLOBAL_SETTINGS, 0).getBoolean("is_sim_no_imsi", false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cc, code lost:
        if (android.text.TextUtils.isEmpty(r5) == false) goto L_0x00cf;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00dc, code lost:
        if (android.text.TextUtils.isEmpty(r5) == false) goto L_0x00cf;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00df, code lost:
        return r4.replaceAll(";", ":");
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getMacAddress(android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.sys.DeviceInfo.getMacAddress(android.content.Context):java.lang.String");
    }
}
