package com.alibaba.wireless.security.framework.utils;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import tb.kgd;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static String[] f3430a = {"armeabi", kgd.ABI_ARM, "x86", kgd.ABI_ARM64, "x86_64"};
    private static boolean b = true;
    private static boolean c = false;
    private static boolean d = true;
    private static boolean e = false;
    private static boolean f = true;
    private static boolean g;

    private static String a() {
        try {
            Method declaredMethod = Class.forName(ProcessUtils.ACTIVITY_THREAD, false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            if (invoke instanceof String) {
                return (String) invoke;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : Build.VERSION.SDK_INT >= 24;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
        if ((r4 & 128) == 0) goto L_0x0039;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(android.content.Context r4) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.alibaba.wireless.security.framework.utils.e.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "9f76bba2"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            java.lang.Object r4 = r2.ipc$dispatch(r3, r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L_0x0019:
            boolean r2 = com.alibaba.wireless.security.framework.utils.e.b
            if (r2 == 0) goto L_0x003d
            android.content.pm.PackageManager r2 = r4.getPackageManager()
            java.lang.String r4 = r4.getPackageName()     // Catch: all -> 0x0038
            android.content.pm.PackageInfo r4 = r2.getPackageInfo(r4, r0)     // Catch: all -> 0x0038
            if (r4 == 0) goto L_0x0038
            android.content.pm.ApplicationInfo r4 = r4.applicationInfo     // Catch: all -> 0x0038
            int r4 = r4.flags     // Catch: all -> 0x0038
            r2 = r4 & 1
            if (r2 == 0) goto L_0x0038
            r4 = r4 & 128(0x80, float:1.794E-43)
            if (r4 != 0) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r1 = 0
        L_0x0039:
            com.alibaba.wireless.security.framework.utils.e.c = r1
            com.alibaba.wireless.security.framework.utils.e.b = r0
        L_0x003d:
            boolean r4 = com.alibaba.wireless.security.framework.utils.e.c
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.utils.e.c(android.content.Context):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
        if ((r4.applicationInfo.flags & 128) != 0) goto L_0x0035;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean d(android.content.Context r4) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.alibaba.wireless.security.framework.utils.e.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "a0236741"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            java.lang.Object r4 = r2.ipc$dispatch(r3, r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L_0x0019:
            boolean r2 = com.alibaba.wireless.security.framework.utils.e.d
            if (r2 == 0) goto L_0x0039
            android.content.pm.PackageManager r2 = r4.getPackageManager()
            java.lang.String r4 = r4.getPackageName()     // Catch: all -> 0x0034
            android.content.pm.PackageInfo r4 = r2.getPackageInfo(r4, r0)     // Catch: all -> 0x0034
            if (r4 == 0) goto L_0x0034
            android.content.pm.ApplicationInfo r4 = r4.applicationInfo     // Catch: all -> 0x0034
            int r4 = r4.flags     // Catch: all -> 0x0034
            r4 = r4 & 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r1 = 0
        L_0x0035:
            com.alibaba.wireless.security.framework.utils.e.e = r1
            com.alibaba.wireless.security.framework.utils.e.d = r0
        L_0x0039:
            boolean r4 = com.alibaba.wireless.security.framework.utils.e.e
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.utils.e.d(android.content.Context):boolean");
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        String a2 = a();
        if (a2 != null) {
            return a2;
        }
        try {
            int myPid = Process.myPid();
            if (context == null) {
                return "";
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    String str = runningAppProcessInfo.processName;
                    return str != null ? str : "";
                }
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        if (f) {
            try {
                g = a(context).equals(context.getPackageName());
                f = false;
            } catch (Exception unused) {
            }
        }
        return g;
    }

    public static String a(ClassLoader classLoader, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de868bd4", new Object[]{classLoader, str});
        }
        if (classLoader == null || str == null || "".equals(str)) {
            return null;
        }
        String a2 = a(classLoader, str, true);
        return a2 == null ? a(classLoader, str, false) : a2;
    }

    static {
        t2o.a(659554347);
    }

    private static String a(ClassLoader classLoader, String str, boolean z) {
        if (classLoader != null) {
            try {
                Method method = z ? classLoader.getClass().getMethod("findLibrary", String.class) : classLoader.getClass().getDeclaredMethod("findLibrary", String.class);
                if (method != null) {
                    if (!method.isAccessible()) {
                        method.setAccessible(true);
                    }
                    Object invoke = method.invoke(classLoader, str);
                    if (invoke != null && (invoke instanceof String)) {
                        return (String) invoke;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static boolean a(String str, String str2, File file) {
        boolean z;
        ZipFile zipFile;
        Throwable th;
        IOException e2;
        String[] strArr;
        boolean z2 = false;
        z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acf94df7", new Object[]{str, str2, file})).booleanValue();
        }
        ZipFile zipFile2 = null;
        try {
            try {
                zipFile = new ZipFile(str);
            } catch (IOException e3) {
                e2 = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            try {
                z = false;
                for (String str3 : f3430a) {
                    try {
                        StringBuilder sb = new StringBuilder();
                        sb.append("lib");
                        String str4 = File.separator;
                        sb.append(str4);
                        sb.append(str3);
                        sb.append(str4);
                        sb.append(str2);
                        ZipEntry entry = zipFile.getEntry(sb.toString());
                        if (!(entry == null || entry.getSize() == 0 || !a.a(entry.getName()))) {
                            z = a(zipFile, entry, file);
                        }
                    } catch (IOException e4) {
                        e2 = e4;
                        z2 = z;
                        zipFile2 = zipFile;
                        FLOG.w("", e2);
                        if (zipFile2 == null) {
                            return z2;
                        }
                        z = z2;
                        zipFile = zipFile2;
                        zipFile.close();
                        return z;
                    }
                }
            } catch (IOException e5) {
                e2 = e5;
            }
            try {
                zipFile.close();
            } catch (IOException unused) {
            }
            return z;
        } catch (Throwable th3) {
            th = th3;
            zipFile2 = zipFile;
            if (zipFile2 != null) {
                try {
                    zipFile2.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.OutputStream, java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Unknown variable types count: 3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(java.util.zip.ZipFile r9, java.util.zip.ZipEntry r10, java.io.File r11) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.utils.e.a(java.util.zip.ZipFile, java.util.zip.ZipEntry, java.io.File):boolean");
    }
}
