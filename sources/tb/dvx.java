package tb;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.alibaba.security.realidentity.g4;
import com.alipay.apmobilesecuritysdk.face.APSecDirInterface;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY;
import com.huawei.hms.android.SystemUtils;
import com.taobao.adaemon.power.APower;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.network.NetParam;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class dvx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final dvx f18103a = new dvx();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements FileFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(dvx dvxVar) {
        }

        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("50e018ca", new Object[]{this, file})).booleanValue();
            }
            if (Pattern.matches("cpu[0-9]+", file.getName())) {
                return true;
            }
            return false;
        }
    }

    public static String A() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77b5ea0d", new Object[0]);
        }
        try {
            str = Locale.getDefault().toString();
        } catch (Throwable unused) {
            str = "";
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public static String C() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[0]);
        }
        try {
            str = TimeZone.getDefault().getDisplayName(false, 0);
        } catch (Throwable unused) {
            str = "";
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public static String E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84c15f4b", new Object[0]);
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
            StringBuilder sb = new StringBuilder();
            sb.append(currentTimeMillis - (currentTimeMillis % 1000));
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String F(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b2f9cd8d", new Object[]{context});
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                return String.valueOf(ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getNetworkType(telephonyManager));
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4719ea", new Object[0]);
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(SystemClock.elapsedRealtime());
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String I() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91ccd489", new Object[0]);
        }
        try {
            StringBuilder sb = new StringBuilder();
            String[] strArr = {"/dev/qemu_pipe", "/dev/socket/qemud", "/system/lib/libc_malloc_debug_qemu.so", "/sys/qemu_trace", "/system/bin/qemu-props", "/dev/socket/genyd", "/dev/socket/baseband_genyd"};
            sb.append("00:");
            for (int i = 0; i < 7; i++) {
                if (new File(strArr[i]).exists()) {
                    str = "1";
                } else {
                    str = "0";
                }
                sb.append(str);
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0032 -> B:9:0x0023). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String J(android.content.Context r4) {
        /*
            java.lang.String r0 = ""
            com.android.alibaba.ip.runtime.IpChange r1 = tb.dvx.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0017
            java.lang.String r0 = "9dee1a0f"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            java.lang.Object r4 = r1.ipc$dispatch(r0, r2)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L_0x0017:
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()
            int r4 = r4.targetSdkVersion
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: all -> 0x0032
            r2 = 29
            if (r1 < r2) goto L_0x0025
        L_0x0023:
            r4 = r0
            goto L_0x0036
        L_0x0025:
            r2 = 26
            if (r1 < r2) goto L_0x0034
            r1 = 28
            if (r4 < r1) goto L_0x0034
            java.lang.String r4 = com.android.taobao.aop.ANDROID_OS_BUILD_PROXY.proxy_getSerial()     // Catch: all -> 0x0032
            goto L_0x0036
        L_0x0032:
            goto L_0x0023
        L_0x0034:
            java.lang.String r4 = android.os.Build.SERIAL     // Catch: all -> 0x0032
        L_0x0036:
            if (r4 != 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r0 = r4
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dvx.J(android.content.Context):java.lang.String");
    }

    public static String K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18528f28", new Object[0]);
        }
        String[] strArr = {"dalvik.system.Taint"};
        StringBuilder sb = new StringBuilder("00:");
        for (int i = 0; i <= 0; i++) {
            try {
                Class.forName(strArr[0]);
                sb.append("1");
            } catch (Throwable unused) {
                sb.append("0");
            }
        }
        return sb.toString();
    }

    public static String L(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13684050", new Object[]{context});
        }
        try {
            String R = R(context);
            String S = S();
            if (!vux.f(R) || !vux.f(S)) {
                return "";
            }
            return R + ":" + S();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String M() {
        LineNumberReader lineNumberReader;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ed849c7", new Object[0]);
        }
        StringBuilder sb = new StringBuilder("00:");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("/system/build.prop", "ro.product.name=sdk");
        linkedHashMap.put("/proc/tty/drivers", "goldfish");
        linkedHashMap.put("/proc/cpuinfo", "goldfish");
        for (String str : linkedHashMap.keySet()) {
            char c = '0';
            try {
                lineNumberReader = new LineNumberReader(new InputStreamReader(new FileInputStream(str)));
                while (true) {
                    try {
                        String readLine = lineNumberReader.readLine();
                        if (readLine != null) {
                            if (readLine.toLowerCase().contains((CharSequence) linkedHashMap.get(str))) {
                                c = '1';
                                break;
                            }
                        } else {
                            break;
                        }
                    } catch (Throwable unused) {
                        sb.append('0');
                        if (lineNumberReader == null) {
                        }
                        lineNumberReader.close();
                    }
                }
                sb.append(c);
            } catch (Throwable unused2) {
                lineNumberReader = null;
            }
            try {
                lineNumberReader.close();
            } catch (Throwable unused3) {
            }
        }
        return sb.toString();
    }

    public static String O() {
        StringBuilder sb = new StringBuilder("00:");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(oeh.BRAND, "generic");
        linkedHashMap.put(o78.SWITCH_TYPE_BOARD, "unknown");
        linkedHashMap.put("DEVICE", "generic");
        linkedHashMap.put("HARDWARE", "goldfish");
        linkedHashMap.put(Mtop.Id.PRODUCT, g4.a.f2721a);
        linkedHashMap.put("MODEL", g4.a.f2721a);
        for (String str : linkedHashMap.keySet()) {
            char c = '0';
            try {
                String str2 = null;
                String str3 = (String) Build.class.getField(str).get(null);
                String str4 = (String) linkedHashMap.get(str);
                if (str3 != null) {
                    str2 = str3.toLowerCase();
                }
                if (str2 != null && str2.contains(str4)) {
                    c = '1';
                }
            } catch (Throwable unused) {
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public static String Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("abe3bf05", new Object[0]);
        }
        StringBuilder sb = new StringBuilder("00:");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("ro.hardware", "goldfish");
        linkedHashMap.put("ro.kernel.qemu", "1");
        linkedHashMap.put("ro.product.device", "generic");
        linkedHashMap.put("ro.product.model", g4.a.f2721a);
        linkedHashMap.put(SystemUtils.PRODUCT_BRAND, "generic");
        linkedHashMap.put("ro.product.name", g4.a.f2721a);
        linkedHashMap.put("ro.build.fingerprint", "test-keys");
        linkedHashMap.put("ro.product.manufacturer", "unknow");
        for (String str : linkedHashMap.keySet()) {
            String str2 = (String) linkedHashMap.get(str);
            String e = vux.e(str, "");
            sb.append((e == null || !e.contains(str2)) ? '0' : '1');
        }
        return sb.toString();
    }

    public static String R(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("73d6b313", new Object[]{context});
        }
        if (d(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return "";
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return null;
            }
            if (activeNetworkInfo.getType() == 1) {
                return "WIFI";
            }
            if (activeNetworkInfo.getType() != 0) {
                return null;
            }
            int subtype = activeNetworkInfo.getSubtype();
            if (!(subtype == 4 || subtype == 1 || subtype == 2 || subtype == 7 || subtype == 11)) {
                if (!(subtype == 3 || subtype == 5 || subtype == 6 || subtype == 8 || subtype == 9 || subtype == 10 || subtype == 12 || subtype == 14 || subtype == 15)) {
                    if (subtype == 13) {
                        return "4G";
                    }
                    return "UNKNOW";
                }
                return "3G";
            }
            return "2G";
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("326979a4", new Object[0]);
        }
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet4Address)) {
                        return nextElement.getHostAddress().toString();
                    }
                }
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (str == null) {
            return "0";
        }
        long j = 0;
        try {
            if ("mounted".equals(str2)) {
                StatFs statFs = new StatFs(str);
                j = statFs.getBlockSize() * statFs.getAvailableBlocks();
            }
        } catch (Throwable unused) {
        }
        return String.valueOf(j);
    }

    public static dvx c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dvx) ipChange.ipc$dispatch("541f97a4", new Object[0]);
        }
        return f18103a;
    }

    public static boolean d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue();
        }
        if (!h(context, str)) {
            return true;
        }
        return false;
    }

    public static String e() {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            j = statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (Throwable unused) {
            j = 0;
        }
        return String.valueOf(j);
    }

    public static String g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2});
        }
        if (str == null) {
            return "0";
        }
        long j = 0;
        try {
            if ("mounted".equals(str2)) {
                StatFs statFs = new StatFs(str);
                j = statFs.getBlockSize() * statFs.getBlockCount();
            }
        } catch (Throwable unused) {
        }
        return String.valueOf(j);
    }

    public static boolean h(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b80d80d", new Object[]{context, str})).booleanValue();
        }
        if (context.getPackageManager().checkPermission(str, context.getPackageName()) == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007c, code lost:
        if (r2 == null) goto L_0x007f;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String i() {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.dvx.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0012
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "bd025a76"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0012:
            java.lang.String r0 = "0000000000000000"
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: all -> 0x006b
            java.io.File r3 = new java.io.File     // Catch: all -> 0x006b
            java.lang.String r4 = "/proc/cpuinfo"
            r3.<init>(r4)     // Catch: all -> 0x006b
            r2.<init>(r3)     // Catch: all -> 0x006b
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: all -> 0x0068
            r3.<init>(r2)     // Catch: all -> 0x0068
            java.io.LineNumberReader r4 = new java.io.LineNumberReader     // Catch: all -> 0x0066
            r4.<init>(r3)     // Catch: all -> 0x0066
            r1 = 1
            r5 = 1
        L_0x002d:
            r6 = 100
            if (r5 >= r6) goto L_0x005a
            java.lang.String r6 = r4.readLine()     // Catch: all -> 0x0053
            if (r6 == 0) goto L_0x005a
            java.lang.String r7 = "Serial"
            int r7 = r6.indexOf(r7)     // Catch: all -> 0x0053
            if (r7 < 0) goto L_0x0055
            java.lang.String r5 = ":"
            int r5 = r6.indexOf(r5)     // Catch: all -> 0x0053
            int r5 = r5 + r1
            int r1 = r6.length()     // Catch: all -> 0x0053
            java.lang.String r1 = r6.substring(r5, r1)     // Catch: all -> 0x0053
            java.lang.String r0 = r1.trim()     // Catch: all -> 0x0053
            goto L_0x005a
        L_0x0053:
            goto L_0x0058
        L_0x0055:
            int r5 = r5 + 1
            goto L_0x002d
        L_0x0058:
            r1 = r4
            goto L_0x006e
        L_0x005a:
            r4.close()     // Catch: all -> 0x005d
        L_0x005d:
            r3.close()     // Catch: all -> 0x0060
        L_0x0060:
            r2.close()     // Catch: all -> 0x0064
            goto L_0x007f
        L_0x0064:
            goto L_0x007f
        L_0x0066:
            goto L_0x006e
        L_0x0068:
            r3 = r1
            goto L_0x006e
        L_0x006b:
            r2 = r1
            r3 = r2
        L_0x006e:
            if (r1 == 0) goto L_0x0075
            r1.close()     // Catch: all -> 0x0074
            goto L_0x0075
        L_0x0074:
        L_0x0075:
            if (r3 == 0) goto L_0x007c
            r3.close()     // Catch: all -> 0x007b
            goto L_0x007c
        L_0x007b:
        L_0x007c:
            if (r2 == 0) goto L_0x007f
            goto L_0x0060
        L_0x007f:
            if (r0 != 0) goto L_0x0083
            java.lang.String r0 = ""
        L_0x0083:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dvx.i():java.lang.String");
    }

    public static String j(Context context) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6ba28c2", new Object[]{context});
        }
        try {
            i = Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0);
        } catch (Throwable unused) {
        }
        if (i == 1) {
            return "1";
        }
        return "0";
    }

    public static String m() {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String readLine;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]);
        }
        BufferedReader bufferedReader2 = null;
        try {
            fileReader = new FileReader("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq");
            try {
                bufferedReader = new BufferedReader(fileReader, 8192);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            fileReader = null;
        }
        try {
            readLine = bufferedReader.readLine();
        } catch (Throwable unused3) {
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (Throwable unused4) {
                }
            }
            if (fileReader == null) {
                return "";
            }
            try {
                fileReader.close();
            } catch (Throwable unused5) {
                return "";
            }
        }
        if (!vux.c(readLine)) {
            String trim = readLine.trim();
            try {
                bufferedReader.close();
            } catch (Throwable unused6) {
            }
            try {
                fileReader.close();
            } catch (Throwable unused7) {
            }
            return trim;
        }
        try {
            bufferedReader.close();
        } catch (Throwable unused8) {
        }
        fileReader.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
        r1 = r3[1].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
        if (r0 == null) goto L_0x0066;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String o() {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.dvx.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L_0x0012
            java.lang.String r1 = "50938a53"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r0 = r0.ipc$dispatch(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0012:
            java.lang.String r0 = "/proc/cpuinfo"
            java.lang.String r1 = ""
            r3 = 0
            java.io.FileReader r4 = new java.io.FileReader     // Catch: all -> 0x005a
            r4.<init>(r0)     // Catch: all -> 0x005a
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: all -> 0x0057
            r5 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r4, r5)     // Catch: all -> 0x0057
        L_0x0023:
            java.lang.String r3 = r0.readLine()     // Catch: all -> 0x004c
            if (r3 == 0) goto L_0x004e
            boolean r5 = tb.vux.c(r3)     // Catch: all -> 0x004c
            if (r5 != 0) goto L_0x0023
            java.lang.String r5 = ":"
            java.lang.String[] r3 = r3.split(r5)     // Catch: all -> 0x004c
            if (r3 == 0) goto L_0x0023
            int r5 = r3.length     // Catch: all -> 0x004c
            r6 = 1
            if (r5 <= r6) goto L_0x0023
            r5 = r3[r2]     // Catch: all -> 0x004c
            java.lang.String r7 = "BogoMIPS"
            boolean r5 = r5.contains(r7)     // Catch: all -> 0x004c
            if (r5 == 0) goto L_0x0023
            r2 = r3[r6]     // Catch: all -> 0x004c
            java.lang.String r1 = r2.trim()     // Catch: all -> 0x004c
            goto L_0x004e
        L_0x004c:
            goto L_0x0055
        L_0x004e:
            r4.close()     // Catch: all -> 0x0051
        L_0x0051:
            r0.close()     // Catch: all -> 0x0066
            goto L_0x0066
        L_0x0055:
            r3 = r4
            goto L_0x005c
        L_0x0057:
            r0 = r3
            goto L_0x0055
        L_0x005a:
            r0 = r3
        L_0x005c:
            if (r3 == 0) goto L_0x0063
            r3.close()     // Catch: all -> 0x0062
            goto L_0x0063
        L_0x0062:
        L_0x0063:
            if (r0 == 0) goto L_0x0066
            goto L_0x0051
        L_0x0066:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dvx.o():java.lang.String");
    }

    public static String p(Context context) {
        List<Sensor> sensorList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7289b85", new Object[]{context});
        }
        String str = null;
        if (context != null) {
            try {
                SensorManager sensorManager = (SensorManager) context.getSystemService(APower.TYPE_SENSOR);
                if (!(sensorManager == null || (sensorList = sensorManager.getSensorList(-1)) == null || sensorList.size() <= 0)) {
                    StringBuilder sb = new StringBuilder();
                    for (Sensor sensor : sensorList) {
                        sb.append(sensor.getName());
                        sb.append(sensor.getVersion());
                        sb.append(sensor.getVendor());
                    }
                    str = vux.i(sb.toString());
                }
            } catch (Throwable unused) {
            }
        }
        return str == null ? "" : str;
    }

    public static String q() {
        BufferedReader bufferedReader;
        FileReader fileReader;
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[0]);
        }
        FileReader fileReader2 = null;
        try {
            fileReader = new FileReader("/proc/cpuinfo");
            try {
                bufferedReader = new BufferedReader(fileReader);
            } catch (Throwable unused) {
                bufferedReader = null;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
        }
        try {
            split = bufferedReader.readLine().split(":\\s+", 2);
        } catch (Throwable unused3) {
            fileReader2 = fileReader;
            if (fileReader2 != null) {
                try {
                    fileReader2.close();
                } catch (Throwable unused4) {
                }
            }
            if (bufferedReader == null) {
                return "";
            }
            try {
                bufferedReader.close();
            } catch (Throwable unused5) {
                return "";
            }
        }
        if (split == null || split.length <= 1) {
            try {
                fileReader.close();
            } catch (Throwable unused6) {
            }
            bufferedReader.close();
        } else {
            String str = split[1];
            try {
                fileReader.close();
            } catch (Throwable unused7) {
            }
            try {
                bufferedReader.close();
            } catch (Throwable unused8) {
            }
            return str;
        }
    }

    public static String r(Context context) {
        List<Sensor> sensorList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ca2c1c6", new Object[]{context});
        }
        JSONArray jSONArray = new JSONArray();
        if (context != null) {
            try {
                SensorManager sensorManager = (SensorManager) context.getSystemService(APower.TYPE_SENSOR);
                if (!(sensorManager == null || (sensorList = sensorManager.getSensorList(-1)) == null || sensorList.size() <= 0)) {
                    for (Sensor sensor : sensorList) {
                        if (sensor != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("name", sensor.getName());
                            jSONObject.put("version", sensor.getVersion());
                            jSONObject.put("vendor", sensor.getVendor());
                            jSONArray.put(jSONObject);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return jSONArray.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
        if (r0 == null) goto L_0x0052;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String s() {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.dvx.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0012
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "5d9eff91"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0012:
            java.lang.String r0 = "/proc/meminfo"
            r1 = 0
            r2 = 0
            java.io.FileReader r4 = new java.io.FileReader     // Catch: all -> 0x0046
            r4.<init>(r0)     // Catch: all -> 0x0046
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: all -> 0x0043
            r5 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r4, r5)     // Catch: all -> 0x0043
            java.lang.String r1 = r0.readLine()     // Catch: all -> 0x0038
            if (r1 == 0) goto L_0x003a
            java.lang.String r5 = "\\s+"
            java.lang.String[] r1 = r1.split(r5)     // Catch: all -> 0x0038
            r5 = 1
            r1 = r1[r5]     // Catch: all -> 0x0038
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: all -> 0x0038
            long r2 = (long) r1
            goto L_0x003a
        L_0x0038:
            goto L_0x0041
        L_0x003a:
            r4.close()     // Catch: all -> 0x003d
        L_0x003d:
            r0.close()     // Catch: all -> 0x0052
            goto L_0x0052
        L_0x0041:
            r1 = r4
            goto L_0x0048
        L_0x0043:
            r0 = r1
            goto L_0x0041
        L_0x0046:
            r0 = r1
        L_0x0048:
            if (r1 == 0) goto L_0x004f
            r1.close()     // Catch: all -> 0x004e
            goto L_0x004f
        L_0x004e:
        L_0x004f:
            if (r0 == 0) goto L_0x0052
            goto L_0x003d
        L_0x0052:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dvx.s():java.lang.String");
    }

    public static String t(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f21ce807", new Object[]{context});
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            return Integer.toString(displayMetrics.widthPixels) + "*" + Integer.toString(displayMetrics.heightPixels);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String u() {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[0]);
        }
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            j = statFs.getBlockCount() * statFs.getBlockSize();
        } catch (Throwable unused) {
            j = 0;
        }
        return String.valueOf(j);
    }

    public static String v(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67970e48", new Object[]{context});
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            StringBuilder sb = new StringBuilder();
            sb.append(displayMetrics.widthPixels);
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String w(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd113489", new Object[]{context});
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            StringBuilder sb = new StringBuilder();
            sb.append(displayMetrics.heightPixels);
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static Map<String, String> x() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("db121866", new Object[0]);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sdcard", "0");
        hashMap.put("sdcardavailable", "0");
        APSecDirInterface aPSecDirInterface = APSecuritySdk.dirInterface;
        if (aPSecDirInterface != null) {
            str2 = aPSecDirInterface.getExternalStorageState();
            File externalStorageDirectory = APSecuritySdk.dirInterface.getExternalStorageDirectory();
            str = externalStorageDirectory != null ? externalStorageDirectory.getPath() : null;
        } else {
            str2 = Environment.getExternalStorageState();
            str = "/sdcard";
        }
        try {
            String g = g(str, str2);
            String b = b(str, str2);
            hashMap.put("sdcard", g);
            hashMap.put("sdcardavailable", b);
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    public final synchronized String B(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c805810b", new Object[]{this, context});
        }
        String a2 = fvx.a("SimSerial");
        if (a2 != null) {
            return a2;
        }
        if (APSecuritySdk.getInstance(context).isBackgroundRunning()) {
            return "";
        }
        if (d(context, "android.permission.READ_PHONE_STATE")) {
            return "";
        }
        fvx.b("SimSerial", a2);
        return a2;
    }

    public final synchronized String D(Context context) {
        String str;
        String androidId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d7fa74c", new Object[]{this, context});
        }
        if (APSecuritySdk.getDeviceInfo() != null && (androidId = APSecuritySdk.getDeviceInfo().getAndroidId()) != null) {
            return androidId;
        }
        String a2 = fvx.a("ANDROIDID");
        if (a2 != null) {
            return a2;
        }
        if (APSecuritySdk.getInstance(context).isBackgroundRunning()) {
            return "";
        }
        try {
            str = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable unused) {
        }
        if (str == null) {
            str = "";
        }
        fvx.b("ANDROIDID", str);
        return str;
    }

    public final synchronized String H(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2873f3ce", new Object[]{this, context});
        }
        String a2 = fvx.a(NetParam.NetParamKey.BSSID);
        if (a2 != null) {
            return a2;
        }
        if (d(context, "android.permission.ACCESS_WIFI_STATE")) {
            return "";
        }
        if (a2 == null) {
            a2 = "";
        }
        fvx.b(NetParam.NetParamKey.BSSID, a2);
        return a2;
    }

    public final synchronized String a(Context context) {
        String imei;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{this, context});
        }
        if (APSecuritySdk.getDeviceInfo() != null && (imei = APSecuritySdk.getDeviceInfo().getImei()) != null) {
            return imei;
        }
        String a2 = fvx.a("imei");
        if (a2 != null) {
            return a2;
        }
        if (APSecuritySdk.getInstance(context).isBackgroundRunning()) {
            return "";
        }
        if (d(context, "android.permission.READ_PHONE_STATE")) {
            return "";
        }
        if (context != null) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null) {
                    a2 = ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getDeviceId(telephonyManager);
                }
            } catch (Throwable unused) {
            }
        }
        if (a2 == null) {
            a2 = "";
        }
        fvx.b("imei", a2);
        return a2;
    }

    public final synchronized String f(Context context) {
        String subscriberId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{this, context});
        }
        if (APSecuritySdk.getDeviceInfo() != null && (subscriberId = APSecuritySdk.getDeviceInfo().getSubscriberId()) != null) {
            return subscriberId;
        }
        String a2 = fvx.a("imsi");
        if (a2 != null) {
            return a2;
        }
        if (APSecuritySdk.getInstance(context).isBackgroundRunning()) {
            return "";
        }
        if (d(context, "android.permission.READ_PHONE_STATE")) {
            return "";
        }
        if (context != null) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null) {
                    a2 = ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getSubscriberId(telephonyManager);
                }
            } catch (Throwable unused) {
            }
        }
        if (a2 == null) {
            a2 = "";
        }
        fvx.b("imsi", a2);
        return a2;
    }

    public final String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        try {
            return String.valueOf(new File("/sys/devices/system/cpu/").listFiles(new a(this)).length);
        } catch (Throwable unused) {
            return "1";
        }
    }

    public final synchronized String n(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91ae7544", new Object[]{this, context});
        }
        String a2 = fvx.a("NetworkOperatorName");
        if (a2 != null) {
            return a2;
        }
        if (context != null) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null) {
                    a2 = telephonyManager.getNetworkOperatorName();
                }
            } catch (Throwable unused) {
            }
        }
        if (a2 == null || "null".equals(a2)) {
            a2 = "";
        }
        fvx.b("NetworkOperatorName", a2);
        return a2;
    }

    public final synchronized String z(Context context) {
        String hardwareAddress;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("528b5aca", new Object[]{this, context});
        }
        if (APSecuritySdk.getDeviceInfo() != null && (hardwareAddress = APSecuritySdk.getDeviceInfo().getHardwareAddress()) != null) {
            return hardwareAddress;
        }
        String a2 = fvx.a("mac");
        if (a2 != null) {
            return a2;
        }
        if (d(context, "android.permission.ACCESS_WIFI_STATE")) {
            return "";
        }
        fvx.b("mac", a2);
        return a2;
    }

    public static String N(Context context) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("88e26691", new Object[]{context});
        }
        try {
            if (!((KeyguardManager) context.getSystemService("keyguard")).isKeyguardSecure()) {
                return "0:0";
            }
            String[] strArr = {"/data/system/password.key", "/data/system/gesture.key", "/data/system/gatekeeper.password.key", "/data/system/gatekeeper.gesture.key", "/data/system/gatekeeper.pattern.key"};
            long j2 = 0;
            for (int i = 0; i < 5; i++) {
                try {
                    j = new File(strArr[i]).lastModified();
                } catch (Throwable unused) {
                    j = -1;
                }
                j2 = Math.max(j, j2);
            }
            return "1:".concat(String.valueOf(j2));
        } catch (Throwable unused2) {
            return "";
        }
    }

    public static String P(Context context) {
        String str;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe5c8cd2", new Object[]{context});
        }
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver.getIntExtra(m09.TASK_TYPE_LEVEL, -1);
            int intExtra2 = registerReceiver.getIntExtra("status", -1);
            if (intExtra2 == 2 || intExtra2 == 5) {
                z = true;
            }
            StringBuilder sb = new StringBuilder();
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            sb.append(str);
            sb.append(":");
            sb.append(intExtra);
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c344f03", new Object[]{context});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            int i = audioManager.getRingerMode() == 0 ? 1 : 0;
            int streamVolume = audioManager.getStreamVolume(0);
            int streamVolume2 = audioManager.getStreamVolume(1);
            int streamVolume3 = audioManager.getStreamVolume(2);
            int streamVolume4 = audioManager.getStreamVolume(3);
            int streamVolume5 = audioManager.getStreamVolume(4);
            jSONObject.put("ringermode", String.valueOf(i));
            jSONObject.put("call", String.valueOf(streamVolume));
            jSONObject.put("system", String.valueOf(streamVolume2));
            jSONObject.put("ring", String.valueOf(streamVolume3));
            jSONObject.put("music", String.valueOf(streamVolume4));
            jSONObject.put("alarm", String.valueOf(streamVolume5));
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    public static String y() {
        String str;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str = (String) cls.getMethod("get", String.class, String.class).invoke(cls.newInstance(), "gsm.version.baseband", "no message");
        } catch (Throwable unused) {
            str = "";
        }
        return str == null ? "" : str;
    }
}
