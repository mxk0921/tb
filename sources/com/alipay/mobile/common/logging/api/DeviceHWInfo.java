package com.alipay.mobile.common.logging.api;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.power.APower;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DeviceHWInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEVICEINFO_NO_INIT = -100;
    public static final int DEVICEINFO_UNKNOWN = -1;
    public static final String TAG = "DeviceHWInfo";
    public static int sCoreNum = -100;
    public static String sCpuHardware = "-100";
    public static String sCpuName = "-100";
    public static int sFrequency = -100;
    public static int sMinFrequency = Integer.MAX_VALUE;
    public static long sRamSize = -100;
    public static String[] sCpuHardwareArray = {"-1", "-1"};
    public static int sHeapSize = -100;
    public static int sLargeHeapSize = -100;
    public static long sTotalStorage = -100;
    public static long sFreeStorageInterval = 0;
    public static long sFreeStorage = -100;
    public static long sUseMemSize = -1;
    public static long sUseMemSizeInterval = 0;
    public static int sDeviceRootedFlag = -1;
    public static final String[] SU_PATHS = {"/system/bin/su", "/system/xbin/su", "/system/sbin/su", "/sbin/su", "/vendor/bin/su"};
    public static int sPssState = -1;
    public static long sPssInterval = 0;
    public static int[] pssArray = new int[3];

    /* renamed from: a  reason: collision with root package name */
    public static final FileFilter f3943a = new FileFilter() { // from class: com.alipay.mobile.common.logging.api.DeviceHWInfo.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("50e018ca", new Object[]{this, file})).booleanValue();
            }
            String name = file.getName();
            if (!name.startsWith(APower.TYPE_CPU)) {
                return false;
            }
            for (int i = 3; i < name.length(); i++) {
                if (!Character.isDigit(name.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    };

    public static int a(String str) {
        Throwable th;
        FileInputStream fileInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        int i = -1;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (IOException unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            String readLine = new BufferedReader(new InputStreamReader(fileInputStream)).readLine();
            if (readLine != null && readLine.matches("0-[\\d]+$")) {
                i = Integer.valueOf(readLine.substring(2)).intValue() + 1;
            }
            try {
                fileInputStream.close();
            } catch (Throwable unused2) {
            }
            return i;
        } catch (IOException unused3) {
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (Throwable unused4) {
                }
            }
            return -1;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (Throwable unused5) {
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
        if (r6 >= 1024) goto L_0x006e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
        r11 = r3[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (r11 == 10) goto L_0x006e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
        if (java.lang.Character.isDigit(r11) == false) goto L_0x006c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
        r11 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
        if (r11 >= 1024) goto L_0x0061;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
        if (java.lang.Character.isDigit(r3[r11]) == false) goto L_0x0061;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
        return java.lang.Integer.parseInt(new java.lang.String(r3, 0, r6, r11 - r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006e, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0071, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b(java.lang.String r11, java.io.FileInputStream r12) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.alipay.mobile.common.logging.api.DeviceHWInfo.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = "7133b0b0"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r0] = r11
            r4[r1] = r12
            java.lang.Object r11 = r2.ipc$dispatch(r3, r4)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            return r11
        L_0x001c:
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r2]
            r4 = -1
            int r12 = r12.read(r3)     // Catch: IOException | NumberFormatException -> 0x0073
            r5 = 0
        L_0x0026:
            if (r5 >= r12) goto L_0x0073
            r6 = r3[r5]     // Catch: IOException | NumberFormatException -> 0x0073
            r7 = 10
            if (r6 == r7) goto L_0x0030
            if (r5 != 0) goto L_0x0071
        L_0x0030:
            if (r6 != r7) goto L_0x0033
            int r5 = r5 + r1
        L_0x0033:
            r6 = r5
        L_0x0034:
            if (r6 >= r12) goto L_0x0071
            int r8 = r6 - r5
            r9 = r3[r6]     // Catch: IOException | NumberFormatException -> 0x0073
            char r10 = r11.charAt(r8)     // Catch: IOException | NumberFormatException -> 0x0073
            if (r9 != r10) goto L_0x0071
            int r9 = r11.length()     // Catch: IOException | NumberFormatException -> 0x0073
            int r9 = r9 - r1
            if (r8 != r9) goto L_0x006f
        L_0x0047:
            if (r6 >= r2) goto L_0x006e
            r11 = r3[r6]     // Catch: IOException | NumberFormatException -> 0x0073
            if (r11 == r7) goto L_0x006e
            boolean r11 = java.lang.Character.isDigit(r11)     // Catch: IOException | NumberFormatException -> 0x0073
            if (r11 == 0) goto L_0x006c
            int r11 = r6 + 1
        L_0x0055:
            if (r11 >= r2) goto L_0x0061
            r12 = r3[r11]     // Catch: IOException | NumberFormatException -> 0x0073
            boolean r12 = java.lang.Character.isDigit(r12)     // Catch: IOException | NumberFormatException -> 0x0073
            if (r12 == 0) goto L_0x0061
            int r11 = r11 + r1
            goto L_0x0055
        L_0x0061:
            java.lang.String r12 = new java.lang.String     // Catch: IOException | NumberFormatException -> 0x0073
            int r11 = r11 - r6
            r12.<init>(r3, r0, r6, r11)     // Catch: IOException | NumberFormatException -> 0x0073
            int r11 = java.lang.Integer.parseInt(r12)     // Catch: IOException | NumberFormatException -> 0x0073
            return r11
        L_0x006c:
            int r6 = r6 + r1
            goto L_0x0047
        L_0x006e:
            return r4
        L_0x006f:
            int r6 = r6 + r1
            goto L_0x0034
        L_0x0071:
            int r5 = r5 + r1
            goto L_0x0026
        L_0x0073:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.api.DeviceHWInfo.b(java.lang.String, java.io.FileInputStream):int");
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        try {
            if (LoggerFactory.getLogContext() != null && LoggerFactory.getLogContext().getApplicationContext() != null) {
                ActivityManager activityManager = (ActivityManager) LoggerFactory.getLogContext().getApplicationContext().getSystemService("activity");
                sHeapSize = activityManager.getMemoryClass();
                sLargeHeapSize = activityManager.getLargeMemoryClass();
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    public static int[] e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("a9d5fa1b", new Object[0]);
        }
        try {
            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
            return new int[]{memoryInfo.getTotalPss(), memoryInfo.nativePss, memoryInfo.dalvikPss};
        } catch (Throwable th) {
            th.toString();
            return new int[]{-2, -2, -2};
        }
    }

    public static int getCPUMaxFreqKHz() {
        FileInputStream fileInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9cb47a4d", new Object[0])).intValue();
        }
        int i = sFrequency;
        if (i == -1) {
            return i;
        }
        if (i == -100) {
            synchronized (DeviceHWInfo.class) {
                for (int i2 = 0; i2 < getNumberOfCPUCores(); i2++) {
                    try {
                        try {
                            File file = new File("/sys/devices/system/cpu/cpu" + i2 + "/cpufreq/cpuinfo_max_freq");
                            if (file.exists()) {
                                byte[] bArr = new byte[128];
                                fileInputStream = new FileInputStream(file);
                                try {
                                    fileInputStream.read(bArr);
                                    int i3 = 0;
                                    while (Character.isDigit(bArr[i3]) && i3 < 128) {
                                        i3++;
                                    }
                                    int parseInt = Integer.parseInt(new String(bArr, 0, i3));
                                    if (parseInt > sFrequency) {
                                        sFrequency = parseInt;
                                    }
                                    if (parseInt < sMinFrequency) {
                                        sMinFrequency = parseInt;
                                    }
                                } catch (NumberFormatException unused) {
                                } catch (Throwable th) {
                                    throw th;
                                }
                                try {
                                    fileInputStream.close();
                                } catch (Throwable unused2) {
                                }
                            }
                        } finally {
                        }
                    } catch (IOException unused3) {
                        sFrequency = -1;
                        sMinFrequency = -1;
                    }
                }
                if (sFrequency == -100) {
                    fileInputStream = new FileInputStream("/proc/cpuinfo");
                    try {
                        int b = b("cpu MHz", fileInputStream) * 1000;
                        if (b > sFrequency) {
                            sFrequency = b;
                        }
                        if (b < sMinFrequency) {
                            sMinFrequency = b;
                        }
                        try {
                            fileInputStream.close();
                        } catch (Throwable unused4) {
                        }
                    } finally {
                        try {
                            fileInputStream.close();
                        } catch (Throwable unused5) {
                        }
                    }
                }
            }
        }
        return sFrequency;
    }

    public static int getCPUMinFreqKHz() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3dc389f", new Object[0])).intValue();
        }
        int i = sMinFrequency;
        if (i == -1) {
            return i;
        }
        if (i == Integer.MAX_VALUE) {
            getCPUMaxFreqKHz();
        }
        return sMinFrequency;
    }

    public static String getCpuBrand() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("afdff1e4", new Object[0]);
        }
        initCpuHardware();
        return sCpuHardwareArray[0];
    }

    public static String getCpuModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c419bb82", new Object[0]);
        }
        initCpuHardware();
        return sCpuHardwareArray[1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
        if (r3 == null) goto L_0x007e;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getCpuName() {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.mobile.common.logging.api.DeviceHWInfo.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0012
            java.lang.String r1 = "7cf5bafc"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r0 = r0.ipc$dispatch(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0012:
            java.lang.String r0 = com.alipay.mobile.common.logging.api.DeviceHWInfo.sCpuName
            java.lang.String r1 = "-1"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = com.alipay.mobile.common.logging.api.DeviceHWInfo.sCpuName
            return r0
        L_0x001f:
            java.lang.String r0 = com.alipay.mobile.common.logging.api.DeviceHWInfo.sCpuName
            java.lang.String r1 = "-100"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x0092
            java.lang.Class<com.alipay.mobile.common.logging.api.DeviceHWInfo> r0 = com.alipay.mobile.common.logging.api.DeviceHWInfo.class
            monitor-enter(r0)
            r1 = 0
            java.io.FileReader r2 = new java.io.FileReader     // Catch: all -> 0x006f
            java.lang.String r3 = "/proc/cpuinfo"
            r2.<init>(r3)     // Catch: all -> 0x006f
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: all -> 0x006d
            r3.<init>(r2)     // Catch: all -> 0x006d
            java.lang.String r1 = r3.readLine()     // Catch: all -> 0x006b
            java.lang.String r4 = ":\\s+"
            r5 = 2
            java.lang.String[] r1 = r1.split(r4, r5)     // Catch: all -> 0x006b
            r4 = 1
            r1 = r1[r4]     // Catch: all -> 0x006b
            com.alipay.mobile.common.logging.api.DeviceHWInfo.sCpuName = r1     // Catch: all -> 0x006b
            java.lang.String r6 = "0"
            boolean r1 = r6.equals(r1)     // Catch: all -> 0x006b
            if (r1 == 0) goto L_0x0064
            java.lang.String r1 = r3.readLine()     // Catch: all -> 0x006b
            if (r1 == 0) goto L_0x0064
            java.lang.String r6 = ":\\s+"
            java.lang.String[] r1 = r1.split(r6, r5)     // Catch: all -> 0x006b
            int r5 = r1.length     // Catch: all -> 0x006b
            if (r5 <= r4) goto L_0x0064
            r1 = r1[r4]     // Catch: all -> 0x006b
            com.alipay.mobile.common.logging.api.DeviceHWInfo.sCpuName = r1     // Catch: all -> 0x006b
        L_0x0064:
            r2.close()     // Catch: all -> 0x0067
        L_0x0067:
            r3.close()     // Catch: all -> 0x007e
            goto L_0x007e
        L_0x006b:
            r1 = r2
            goto L_0x0070
        L_0x006d:
            r3 = r1
            goto L_0x006b
        L_0x006f:
            r3 = r1
        L_0x0070:
            java.lang.String r2 = "-1"
            com.alipay.mobile.common.logging.api.DeviceHWInfo.sCpuName = r2     // Catch: all -> 0x0082
            if (r1 == 0) goto L_0x007b
            r1.close()     // Catch: all -> 0x007a
            goto L_0x007b
        L_0x007a:
        L_0x007b:
            if (r3 == 0) goto L_0x007e
            goto L_0x0067
        L_0x007e:
            monitor-exit(r0)     // Catch: all -> 0x0080
            goto L_0x0092
        L_0x0080:
            r1 = move-exception
            goto L_0x0090
        L_0x0082:
            r2 = move-exception
            if (r1 == 0) goto L_0x008a
            r1.close()     // Catch: all -> 0x0089
            goto L_0x008a
        L_0x0089:
        L_0x008a:
            if (r3 == 0) goto L_0x008f
            r3.close()     // Catch: all -> 0x008f
        L_0x008f:
            throw r2     // Catch: all -> 0x0080
        L_0x0090:
            monitor-exit(r0)     // Catch: all -> 0x0080
            throw r1
        L_0x0092:
            java.lang.String r0 = com.alipay.mobile.common.logging.api.DeviceHWInfo.sCpuName
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.api.DeviceHWInfo.getCpuName():java.lang.String");
    }

    public static int getDeviceRootedState() {
        Throwable th;
        IpChange ipChange = $ipChange;
        boolean z = false;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb99219e", new Object[0])).intValue();
        }
        if (sDeviceRootedFlag < 0) {
            try {
                z = "0".equals(d("ro.secure"));
                if (!z) {
                    while (true) {
                        try {
                            String[] strArr = SU_PATHS;
                            if (i >= strArr.length) {
                                break;
                            }
                            File file = new File(strArr[i]);
                            if (file.exists() && file.isFile()) {
                                z = true;
                                break;
                            }
                            i++;
                        } catch (Throwable th2) {
                            th = th2;
                            boolean z2 = z ? 1 : 0;
                            Object[] objArr = z ? 1 : 0;
                            Object[] objArr2 = z ? 1 : 0;
                            Object[] objArr3 = z ? 1 : 0;
                            z = z2;
                            LoggerFactory.getTraceLogger().error(TAG, th);
                            int i2 = z ? 1 : 0;
                            int i3 = z ? 1 : 0;
                            int i4 = z ? 1 : 0;
                            int i5 = z ? 1 : 0;
                            sDeviceRootedFlag = i2;
                            return sDeviceRootedFlag;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
            int i22 = z ? 1 : 0;
            int i32 = z ? 1 : 0;
            int i42 = z ? 1 : 0;
            int i52 = z ? 1 : 0;
            sDeviceRootedFlag = i22;
        }
        return sDeviceRootedFlag;
    }

    public static long getFreeStorage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad5d7934", new Object[0])).longValue();
        }
        if (sFreeStorage == -100) {
            long freeStorageEvent = getFreeStorageEvent();
            sFreeStorage = freeStorageEvent;
            return freeStorageEvent;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - sFreeStorageInterval < TimeUnit.SECONDS.toMillis(30L)) {
            return sFreeStorage;
        }
        sFreeStorageInterval = currentTimeMillis;
        long freeStorageEvent2 = getFreeStorageEvent();
        sFreeStorage = freeStorageEvent2;
        return freeStorageEvent2;
    }

    public static long getFreeStorageEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9a8050dc", new Object[0])).longValue();
        }
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return (statFs.getBlockSize() * statFs.getAvailableBlocks()) / 1048576;
        } catch (Throwable th) {
            th.toString();
            return -1L;
        }
    }

    public static int getHeapSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e360947d", new Object[0])).intValue();
        }
        int i = sHeapSize;
        if (i != -100) {
            return i;
        }
        c();
        return sHeapSize;
    }

    public static int getLargeHeapSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cff982c", new Object[0])).intValue();
        }
        int i = sLargeHeapSize;
        if (i != -100) {
            return i;
        }
        c();
        return sLargeHeapSize;
    }

    public static int getNumberOfCPUCores() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("466e95fc", new Object[0])).intValue();
        }
        int i = sCoreNum;
        if (i == -1) {
            return i;
        }
        if (i == -100) {
            synchronized (DeviceHWInfo.class) {
                int a2 = a("/sys/devices/system/cpu/possible");
                sCoreNum = a2;
                if (a2 == -1) {
                    sCoreNum = a("/sys/devices/system/cpu/present");
                }
                if (sCoreNum == -1) {
                    sCoreNum = new File("/sys/devices/system/cpu/").listFiles(f3943a).length;
                }
            }
        }
        return sCoreNum;
    }

    public static int[] getPss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("78a2d9e3", new Object[0]);
        }
        if (sPssState == -1) {
            sPssState = 0;
            int[] e = e();
            pssArray = e;
            return e;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - sPssInterval < TimeUnit.SECONDS.toMillis(30L)) {
            return pssArray;
        }
        sPssInterval = currentTimeMillis;
        int[] e2 = e();
        pssArray = e2;
        return e2;
    }

    public static long getTotalMemory(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e13c9746", new Object[]{context})).longValue();
        }
        long j = sRamSize;
        if (j == -1) {
            return j;
        }
        if (j == -100) {
            synchronized (DeviceHWInfo.class) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                sRamSize = memoryInfo.totalMem;
            }
        }
        return sRamSize;
    }

    public static long getTotalStorage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f2e5308", new Object[0])).longValue();
        }
        long j = sTotalStorage;
        if (j != -100) {
            return j;
        }
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            sTotalStorage = (statFs.getBlockSize() * statFs.getBlockCount()) / 1048576;
        } catch (Throwable th) {
            th.toString();
        }
        return sTotalStorage;
    }

    public static long getUseMemEvent(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec803d9f", new Object[]{context})).longValue();
        }
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            return (memoryInfo.totalMem - memoryInfo.availMem) / 1048576;
        } catch (Throwable th) {
            th.toString();
            return -1L;
        }
    }

    public static long getUseMemSize(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f6a92750", new Object[]{context})).longValue();
        }
        if (sUseMemSize == -1) {
            long useMemEvent = getUseMemEvent(context);
            sUseMemSize = useMemEvent;
            return useMemEvent;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - sUseMemSizeInterval < TimeUnit.SECONDS.toMillis(30L)) {
            return sUseMemSize;
        }
        sUseMemSizeInterval = currentTimeMillis;
        long useMemEvent2 = getUseMemEvent(context);
        sUseMemSize = useMemEvent2;
        return useMemEvent2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:29:0x0081
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:90)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public static void initCpuHardware() {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.api.DeviceHWInfo.initCpuHardware():void");
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class, String.class).invoke(null, str, null);
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error(TAG, "getSystemProperty", th);
            return null;
        }
    }
}
