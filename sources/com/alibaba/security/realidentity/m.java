package com.alibaba.security.realidentity;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.DeviceProperty;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String A = "ro.build.uiversion";
    public static final String B = "ro.build.MiFavor_version";
    public static final String C = "ro.rom.version";
    public static final String D = "ro.build.rom.id";
    public static final String E = "unknown";
    public static a F = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f2759a = "SystemUtils";
    public static final String[] b = {"huawei"};
    public static final String[] c = {"vivo"};
    public static final String[] d = {"xiaomi"};
    public static final String[] e = {"oppo"};
    public static final String[] f = {DeviceProperty.ALIAS_LEECO, "letv"};
    public static final String[] g = {"360", DeviceProperty.ALIAS_QIKU};
    public static final String[] h = {DeviceProperty.ALIAS_ZTE};
    public static final String[] i = {DeviceProperty.ALIAS_ONEPLUS};
    public static final String[] j = {DeviceProperty.ALIAS_NUBIA};
    public static final String[] k = {DeviceProperty.ALIAS_COOLPAD, "yulong"};
    public static final String[] l = {"lg", "lge"};
    public static final String[] m = {"google"};
    public static final String[] n = {"samsung"};
    public static final String[] o = {"meizu"};
    public static final String[] p = {"lenovo"};
    public static final String[] q = {"smartisan"};
    public static final String[] r = {"htc"};
    public static final String[] s = {"sony"};
    public static final String[] t = {"gionee", "amigo"};
    public static final String[] u = {"motorola"};
    public static final String v = "ro.build.version.emui";
    public static final String w = "ro.vivo.os.build.display.id";
    public static final String x = "ro.build.version.incremental";
    public static final String y = "ro.build.version.opporom";
    public static final String z = "ro.letv.release.version";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f2760a;
        public String b;

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6d75c44c", new Object[]{aVar}) : aVar.f2760a;
        }

        public static /* synthetic */ String b(a aVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2790f703", new Object[]{aVar, str});
            }
            aVar.b = str;
            return str;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "RomInfo{name=" + this.f2760a + ", version=" + this.b + "}";
        }

        public static /* synthetic */ String a(a aVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("206814c2", new Object[]{aVar, str});
            }
            aVar.f2760a = str;
            return str;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f2760a;
        }
    }

    public static boolean a(String str, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("434e6e27", new Object[]{str, str2, strArr})).booleanValue();
        }
        for (String str3 : strArr) {
            if (str.contains(str3) || str2.contains(str3)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v0, types: [boolean] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(java.lang.String r7) {
        /*
            java.lang.String r0 = "Exception while closing InputStream"
            java.lang.String r1 = "SystemUtils"
            java.lang.String r2 = "Unable to read sysprop "
            java.lang.String r3 = "getprop "
            com.android.alibaba.ip.runtime.IpChange r4 = com.alibaba.security.realidentity.m.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x001d
            java.lang.String r0 = "6111438d"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r7
            java.lang.Object r7 = r4.ipc$dispatch(r0, r1)
            java.lang.String r7 = (java.lang.String) r7
            return r7
        L_0x001d:
            r4 = 0
            java.lang.Runtime r5 = java.lang.Runtime.getRuntime()     // Catch: all -> 0x005d, IOException -> 0x005f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: all -> 0x005d, IOException -> 0x005f
            r6.<init>(r3)     // Catch: all -> 0x005d, IOException -> 0x005f
            r6.append(r7)     // Catch: all -> 0x005d, IOException -> 0x005f
            java.lang.String r3 = r6.toString()     // Catch: all -> 0x005d, IOException -> 0x005f
            java.lang.Process r3 = r5.exec(r3)     // Catch: all -> 0x005d, IOException -> 0x005f
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: all -> 0x005d, IOException -> 0x005f
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch: all -> 0x005d, IOException -> 0x005f
            java.io.InputStream r3 = r3.getInputStream()     // Catch: all -> 0x005d, IOException -> 0x005f
            r6.<init>(r3)     // Catch: all -> 0x005d, IOException -> 0x005f
            r3 = 1024(0x400, float:1.435E-42)
            r5.<init>(r6, r3)     // Catch: all -> 0x005d, IOException -> 0x005f
            java.lang.String r3 = r5.readLine()     // Catch: all -> 0x0058, IOException -> 0x005b
            r5.close()     // Catch: all -> 0x0058, IOException -> 0x005b
            r5.close()     // Catch: IOException -> 0x004d
            goto L_0x0057
        L_0x004d:
            r7 = move-exception
            boolean r2 = com.alibaba.security.realidentity.a.a()
            if (r2 == 0) goto L_0x0057
            com.alibaba.security.realidentity.a.a(r1, r0, r7)
        L_0x0057:
            return r3
        L_0x0058:
            r7 = move-exception
            r4 = r5
            goto L_0x0087
        L_0x005b:
            r3 = move-exception
            goto L_0x0061
        L_0x005d:
            r7 = move-exception
            goto L_0x0087
        L_0x005f:
            r3 = move-exception
            r5 = r4
        L_0x0061:
            boolean r6 = com.alibaba.security.realidentity.a.a()     // Catch: all -> 0x0058
            if (r6 == 0) goto L_0x0076
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: all -> 0x0058
            r6.<init>(r2)     // Catch: all -> 0x0058
            r6.append(r7)     // Catch: all -> 0x0058
            java.lang.String r7 = r6.toString()     // Catch: all -> 0x0058
            com.alibaba.security.realidentity.a.a(r1, r7, r3)     // Catch: all -> 0x0058
        L_0x0076:
            if (r5 == 0) goto L_0x0086
            r5.close()     // Catch: IOException -> 0x007c
            goto L_0x0086
        L_0x007c:
            r7 = move-exception
            boolean r2 = com.alibaba.security.realidentity.a.a()
            if (r2 == 0) goto L_0x0086
            com.alibaba.security.realidentity.a.a(r1, r0, r7)
        L_0x0086:
            return r4
        L_0x0087:
            if (r4 == 0) goto L_0x0097
            r4.close()     // Catch: IOException -> 0x008d
            goto L_0x0097
        L_0x008d:
            r2 = move-exception
            boolean r3 = com.alibaba.security.realidentity.a.a()
            if (r3 == 0) goto L_0x0097
            com.alibaba.security.realidentity.a.a(r1, r0, r2)
        L_0x0097:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.security.realidentity.m.b(java.lang.String):java.lang.String");
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
        }
        try {
            String str = Build.MANUFACTURER;
            if (!TextUtils.isEmpty(str)) {
                return str.toLowerCase();
            }
            return "unknown";
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    public static a d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("3fc0057", new Object[0]);
        }
        a aVar = F;
        if (aVar != null) {
            return aVar;
        }
        F = new a();
        String a2 = a();
        String c2 = c();
        String[] strArr = b;
        if (a(a2, c2, strArr)) {
            a.a(F, strArr[0]);
            String a3 = a(v);
            String[] split = a3.split("_");
            if (split.length > 1) {
                a.b(F, split[1]);
            } else {
                a.b(F, a3);
            }
            return F;
        }
        String[] strArr2 = c;
        if (a(a2, c2, strArr2)) {
            a.a(F, strArr2[0]);
            a.b(F, a(w));
            return F;
        }
        String[] strArr3 = d;
        if (a(a2, c2, strArr3)) {
            a.a(F, strArr3[0]);
            a.b(F, a(x));
            return F;
        }
        String[] strArr4 = e;
        if (a(a2, c2, strArr4)) {
            a.a(F, strArr4[0]);
            a.b(F, a(y));
            return F;
        }
        String[] strArr5 = f;
        if (a(a2, c2, strArr5)) {
            a.a(F, strArr5[0]);
            a.b(F, a(z));
            return F;
        }
        String[] strArr6 = g;
        if (a(a2, c2, strArr6)) {
            a.a(F, strArr6[0]);
            a.b(F, a(A));
            return F;
        }
        String[] strArr7 = h;
        if (a(a2, c2, strArr7)) {
            a.a(F, strArr7[0]);
            a.b(F, a(B));
            return F;
        }
        String[] strArr8 = i;
        if (a(a2, c2, strArr8)) {
            a.a(F, strArr8[0]);
            a.b(F, a(C));
            return F;
        }
        String[] strArr9 = j;
        if (a(a2, c2, strArr9)) {
            a.a(F, strArr9[0]);
            a.b(F, a(D));
            return F;
        }
        String[] strArr10 = k;
        if (a(a2, c2, strArr10)) {
            a.a(F, strArr10[0]);
        } else {
            String[] strArr11 = l;
            if (a(a2, c2, strArr11)) {
                a.a(F, strArr11[0]);
            } else {
                String[] strArr12 = m;
                if (a(a2, c2, strArr12)) {
                    a.a(F, strArr12[0]);
                } else {
                    String[] strArr13 = n;
                    if (a(a2, c2, strArr13)) {
                        a.a(F, strArr13[0]);
                    } else {
                        String[] strArr14 = o;
                        if (a(a2, c2, strArr14)) {
                            a.a(F, strArr14[0]);
                        } else {
                            String[] strArr15 = p;
                            if (a(a2, c2, strArr15)) {
                                a.a(F, strArr15[0]);
                            } else {
                                String[] strArr16 = q;
                                if (a(a2, c2, strArr16)) {
                                    a.a(F, strArr16[0]);
                                } else {
                                    String[] strArr17 = r;
                                    if (a(a2, c2, strArr17)) {
                                        a.a(F, strArr17[0]);
                                    } else {
                                        String[] strArr18 = s;
                                        if (a(a2, c2, strArr18)) {
                                            a.a(F, strArr18[0]);
                                        } else {
                                            String[] strArr19 = t;
                                            if (a(a2, c2, strArr19)) {
                                                a.a(F, strArr19[0]);
                                            } else {
                                                String[] strArr20 = u;
                                                if (a(a2, c2, strArr20)) {
                                                    a.a(F, strArr20[0]);
                                                } else {
                                                    a.a(F, c2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        a.b(F, a(""));
        return F;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue();
        }
        if ("x86".equalsIgnoreCase(Build.CPU_ABI) || "x86".equalsIgnoreCase(Build.CPU_ABI2)) {
            return true;
        }
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr != null) {
            for (String str : strArr) {
                if (str != null && str.toLowerCase().contains("x86")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue();
        }
        return b[0].equals(a.a(d()));
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue();
        }
        return o[0].equals(a.a(d()));
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue();
        }
        return e[0].equals(a.a(d()));
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue();
        }
        return c[0].equals(a.a(d()));
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue();
        }
        return d[0].equals(a.a(d()));
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x00ee -> B:88:0x00f1). Please submit an issue!!! */
    public static boolean k() {
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader;
        Throwable th;
        String lowerCase;
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue();
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream("/proc/cpuinfo");
                try {
                    inputStreamReader = new InputStreamReader(fileInputStream2);
                    try {
                        bufferedReader = new BufferedReader(inputStreamReader);
                        try {
                            do {
                                try {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine != null) {
                                        lowerCase = readLine.trim().toLowerCase();
                                    }
                                    break;
                                } catch (Exception unused) {
                                    fileInputStream = fileInputStream2;
                                    if (fileInputStream != null) {
                                        try {
                                            fileInputStream.close();
                                        } catch (IOException e2) {
                                            e2.printStackTrace();
                                        }
                                    }
                                    if (inputStreamReader != null) {
                                        try {
                                            inputStreamReader.close();
                                        } catch (IOException e3) {
                                            e3.printStackTrace();
                                        }
                                    }
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                    }
                                    return false;
                                } catch (Throwable th2) {
                                    th = th2;
                                    fileInputStream = fileInputStream2;
                                    if (fileInputStream != null) {
                                        try {
                                            fileInputStream.close();
                                        } catch (IOException e4) {
                                            e4.printStackTrace();
                                        }
                                    }
                                    if (inputStreamReader != null) {
                                        try {
                                            inputStreamReader.close();
                                        } catch (IOException e5) {
                                            e5.printStackTrace();
                                        }
                                    }
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (IOException e6) {
                                            e6.printStackTrace();
                                        }
                                    }
                                    throw th;
                                }
                            } while (!lowerCase.startsWith("features"));
                            break;
                            fileInputStream2.close();
                        } catch (IOException e7) {
                            e7.printStackTrace();
                        }
                        for (String str : lowerCase.split(" ")) {
                            if (str.contains("neon") || "asimd".equals(str)) {
                                try {
                                    fileInputStream2.close();
                                } catch (IOException e8) {
                                    e8.printStackTrace();
                                }
                                try {
                                    inputStreamReader.close();
                                } catch (IOException e9) {
                                    e9.printStackTrace();
                                }
                                try {
                                    bufferedReader.close();
                                    return true;
                                } catch (IOException e10) {
                                    e10.printStackTrace();
                                    return true;
                                }
                            }
                        }
                        try {
                            inputStreamReader.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                        bufferedReader.close();
                    } catch (Exception unused2) {
                        bufferedReader = null;
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedReader = null;
                    }
                } catch (Exception unused3) {
                    inputStreamReader = null;
                    bufferedReader = null;
                } catch (Throwable th4) {
                    th = th4;
                    inputStreamReader = null;
                    bufferedReader = null;
                }
            } catch (IOException e12) {
                e12.printStackTrace();
            }
        } catch (Exception unused4) {
            inputStreamReader = null;
            bufferedReader = null;
        } catch (Throwable th5) {
            th = th5;
            inputStreamReader = null;
            bufferedReader = null;
        }
        return false;
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        try {
            String str = Build.BRAND;
            return !TextUtils.isEmpty(str) ? str.toLowerCase() : "unknown";
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    public static String a(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            str2 = b(str);
        } else {
            str2 = "";
        }
        if (TextUtils.isEmpty(str2) || str2.equals("unknown")) {
            try {
                String str3 = Build.DISPLAY;
                if (!TextUtils.isEmpty(str3)) {
                    str2 = str3.toLowerCase();
                }
            } catch (Throwable unused) {
            }
        }
        return TextUtils.isEmpty(str2) ? "unknown" : str2;
    }

    public static long a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6454", new Object[]{context})).longValue();
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return 0L;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        String[] strArr = Build.SUPPORTED_ABIS;
        StringBuffer stringBuffer = new StringBuffer();
        if (strArr != null) {
            for (String str : strArr) {
                stringBuffer.append(str);
                stringBuffer.append(";");
            }
        }
        return stringBuffer.toString();
    }

    public static long b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9eca0ff3", new Object[]{context})).longValue();
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), 2048);
            String readLine = bufferedReader.readLine();
            if (TextUtils.isEmpty(readLine)) {
                bufferedReader.close();
                return 0L;
            }
            String substring = readLine.substring(readLine.indexOf("MemTotal:"));
            if (TextUtils.isEmpty(substring)) {
                bufferedReader.close();
                return 0L;
            }
            bufferedReader.close();
            return Long.parseLong(substring.replaceAll("\\D+", "")) * 1024;
        } catch (Exception unused) {
            return 0L;
        }
    }
}
