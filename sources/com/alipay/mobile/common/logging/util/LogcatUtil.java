package com.alipay.mobile.common.logging.util;

import android.content.Context;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.trace.TraceLogger;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class LogcatUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Context context) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        try {
            File c = c(context);
            File e = e(context);
            if (!(c == null || e == null)) {
                b(e);
                for (File file : c.listFiles()) {
                    if (file != null && file.exists() && file.isFile() && file.length() != 0) {
                        File file2 = new File(e, file.getName());
                        if (file2.isDirectory()) {
                            LoggerFactory.getTraceLogger().error("LogcatUtil", "backupLogcatFiles, bakFile should not be directory: ".concat(String.valueOf(file2)));
                        } else if (!file2.exists() || !file2.isFile() || file2.length() != file.length()) {
                            LoggerFactory.getTraceLogger().info("LogcatUtil", "backupLogcatFiles: ".concat(String.valueOf(file)));
                            FileUtil.copyFile(file, file2);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("LogcatUtil", "backupOtherFiles", th);
        }
    }

    public static void b(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a979fdf", new Object[]{file});
            return;
        }
        d(file);
        f(file);
        g(file);
    }

    public static File c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("5755eb6e", new Object[]{context});
        }
        File file = new File(context.getFilesDir(), LogCategory.CATEGORY_LOGCAT);
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public static void d(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("584201a0", new Object[]{file});
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            TimeUnit timeUnit = TimeUnit.DAYS;
            long millis = currentTimeMillis - timeUnit.toMillis(7L);
            long millis2 = currentTimeMillis + timeUnit.toMillis(7L);
            for (File file2 : listFiles) {
                if (file2 != null && file2.exists() && file2.isFile()) {
                    try {
                        long parseLong = Long.parseLong(file2.getName().split("_")[0]);
                        if (parseLong < millis || parseLong > millis2) {
                            if (file2.delete()) {
                                LoggerFactory.getTraceLogger().warn("LogcatUtil", "cleanExpiresFile: " + file2.getName() + " is too old !");
                            } else {
                                LoggerFactory.getTraceLogger().warn("LogcatUtil", "cleanExpiresFile: " + file2.getName() + " failed !");
                            }
                        }
                    } catch (Throwable th) {
                        LoggerFactory.getTraceLogger().warn("LogcatUtil", file2.getName(), th);
                    }
                }
            }
        }
    }

    public static void dumpLogcatForException(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1356fad5", new Object[]{context});
            return;
        }
        try {
            File c = c(context);
            if (c != null) {
                b(c);
                dumpLogcat(new File(c, System.currentTimeMillis() + "_logcat"), 3000);
                a(context);
            }
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().warn("LogcatUtil", "dumpLogcatForException", th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        if (r5.mkdirs() == false) goto L_0x0052;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.io.File e(android.content.Context r5) {
        /*
            java.lang.String r0 = "getBackupLogcatsDir"
            java.lang.String r1 = "LogcatUtil"
            com.android.alibaba.ip.runtime.IpChange r2 = com.alipay.mobile.common.logging.util.LogcatUtil.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r0 = "3c975a2f"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r5
            java.lang.Object r5 = r2.ipc$dispatch(r0, r1)
            java.io.File r5 = (java.io.File) r5
            return r5
        L_0x0019:
            r2 = 0
            java.io.File r3 = com.alipay.mobile.common.logging.util.LoggingUtil.getCommonExternalStorageDir()     // Catch: all -> 0x0030
            java.io.File r4 = new java.io.File     // Catch: all -> 0x0030
            java.lang.String r5 = r5.getPackageName()     // Catch: all -> 0x0030
            r4.<init>(r3, r5)     // Catch: all -> 0x0030
            java.io.File r5 = new java.io.File     // Catch: all -> 0x0030
            java.lang.String r3 = "logcatic"
            r5.<init>(r4, r3)     // Catch: all -> 0x0030
            goto L_0x0039
        L_0x0030:
            r5 = move-exception
            com.alipay.mobile.common.logging.api.trace.TraceLogger r3 = com.alipay.mobile.common.logging.api.LoggerFactory.getTraceLogger()
            r3.error(r1, r0, r5)
            r5 = r2
        L_0x0039:
            if (r5 == 0) goto L_0x0051
            boolean r3 = r5.exists()     // Catch: all -> 0x0048
            if (r3 != 0) goto L_0x0051
            boolean r0 = r5.mkdirs()     // Catch: all -> 0x0048
            if (r0 != 0) goto L_0x0051
            goto L_0x0052
        L_0x0048:
            r2 = move-exception
            com.alipay.mobile.common.logging.api.trace.TraceLogger r3 = com.alipay.mobile.common.logging.api.LoggerFactory.getTraceLogger()
            r3.error(r1, r0, r2)
            goto L_0x0053
        L_0x0051:
            r2 = r5
        L_0x0052:
            r5 = r2
        L_0x0053:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.util.LogcatUtil.e(android.content.Context):java.io.File");
    }

    public static void f(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ec6361", new Object[]{file});
            return;
        }
        file.listFiles();
        Comparator<File> comparator = new Comparator<File>() { // from class: com.alipay.mobile.common.logging.util.LogcatUtil.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public final int compare(File file2, File file3) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("f3a0238d", new Object[]{this, file2, file3})).intValue() : file2.getName().compareTo(file3.getName());
            }
        };
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length >= 5) {
            Arrays.sort(listFiles, comparator);
            for (int i = 0; i < listFiles.length - 4; i++) {
                File file2 = listFiles[i];
                if (file2 != null && file2.exists() && file2.isFile()) {
                    if (file2.delete()) {
                        TraceLogger traceLogger = LoggerFactory.getTraceLogger();
                        traceLogger.warn("LogcatUtil", "cleanExpiresFile: " + file2.getName() + " is over 5 !");
                    } else {
                        TraceLogger traceLogger2 = LoggerFactory.getTraceLogger();
                        traceLogger2.warn("LogcatUtil", "cleanExpiresFile: " + file2.getName() + " failed !");
                    }
                }
            }
        }
    }

    public static void g(File file) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f396c522", new Object[]{file});
            return;
        }
        file.listFiles();
        Comparator<File> comparator = new Comparator<File>() { // from class: com.alipay.mobile.common.logging.util.LogcatUtil.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public final int compare(File file2, File file3) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("f3a0238d", new Object[]{this, file2, file3})).intValue() : file2.getName().compareTo(file3.getName());
            }
        };
        long folderSize = FileUtil.getFolderSize(file);
        if (folderSize >= 2097152 && (listFiles = file.listFiles()) != null && listFiles.length > 0) {
            long j = folderSize - 1048576;
            Arrays.sort(listFiles, comparator);
            for (File file2 : listFiles) {
                if (file2 != null && file2.exists() && file2.isFile()) {
                    long length = file2.length();
                    if (file2.delete()) {
                        j -= length;
                        LoggerFactory.getTraceLogger().warn("LogcatUtil", "cleanExpiresFile: " + file2.getName() + " is too large !");
                    } else {
                        LoggerFactory.getTraceLogger().warn("LogcatUtil", "cleanExpiresFile: " + file2.getName() + " failed !");
                    }
                    if (j <= 0) {
                        return;
                    }
                }
            }
        }
    }

    public static void dumpLogcat(File file, int i) {
        Process process;
        Throwable th;
        BufferedReader bufferedReader;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b5a821f", new Object[]{file, new Integer(i)});
            return;
        }
        if (i <= 0) {
            i = 3000;
        }
        LoggerFactory.getTraceLogger().info("LogcatUtil", "start logcatDump for " + i + " lines.");
        if (file == null || file.isDirectory()) {
            LoggerFactory.getTraceLogger().info("LogcatUtil", "targetFile is null or dir.");
            return;
        }
        if (file.exists()) {
            FileUtil.deleteFileNotDir(file);
        }
        File parentFile = file.getParentFile();
        if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
            FileWriter fileWriter = null;
            try {
                process = Runtime.getRuntime().exec("logcat -v time -d -t ".concat(String.valueOf(i)));
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                    try {
                        FileWriter fileWriter2 = new FileWriter(file);
                        while (true) {
                            try {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                fileWriter2.write(readLine + "\n");
                                i2++;
                            } catch (Throwable th2) {
                                th = th2;
                                fileWriter = fileWriter2;
                                try {
                                    LoggerFactory.getTraceLogger().error("LogcatUtil", "dumpLog", th);
                                    if (fileWriter != null) {
                                        try {
                                            fileWriter.close();
                                        } catch (Throwable th3) {
                                            LoggerFactory.getTraceLogger().warn("LogcatUtil", "close fileWriter", th3);
                                        }
                                    }
                                    if (process != null) {
                                        try {
                                            process.destroy();
                                        } catch (Throwable th4) {
                                            LoggerFactory.getTraceLogger().warn("LogcatUtil", "close logcatProc", th4);
                                        }
                                    }
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                            return;
                                        } catch (Throwable th5) {
                                            LoggerFactory.getTraceLogger().warn("LogcatUtil", "close bufferedReader", th5);
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                } catch (Throwable th6) {
                                    if (fileWriter != null) {
                                        try {
                                            fileWriter.close();
                                        } catch (Throwable th7) {
                                            LoggerFactory.getTraceLogger().warn("LogcatUtil", "close fileWriter", th7);
                                        }
                                    }
                                    if (process != null) {
                                        try {
                                            process.destroy();
                                        } catch (Throwable th8) {
                                            LoggerFactory.getTraceLogger().warn("LogcatUtil", "close logcatProc", th8);
                                        }
                                    }
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (Throwable th9) {
                                            LoggerFactory.getTraceLogger().warn("LogcatUtil", "close bufferedReader", th9);
                                        }
                                    }
                                    throw th6;
                                }
                            }
                        }
                        fileWriter2.flush();
                        LoggerFactory.getTraceLogger().info("LogcatUtil", "end logcatDump: ".concat(String.valueOf(i2)));
                        try {
                            fileWriter2.close();
                        } catch (Throwable th10) {
                            LoggerFactory.getTraceLogger().warn("LogcatUtil", "close fileWriter", th10);
                        }
                        try {
                            process.destroy();
                        } catch (Throwable th11) {
                            LoggerFactory.getTraceLogger().warn("LogcatUtil", "close logcatProc", th11);
                        }
                        try {
                            bufferedReader.close();
                        } catch (Throwable th12) {
                            LoggerFactory.getTraceLogger().warn("LogcatUtil", "close bufferedReader", th12);
                        }
                    } catch (Throwable th13) {
                        th = th13;
                    }
                } catch (Throwable th14) {
                    th = th14;
                    bufferedReader = null;
                }
            } catch (Throwable th15) {
                th = th15;
                process = null;
                bufferedReader = null;
            }
        } else {
            LoggerFactory.getTraceLogger().info("LogcatUtil", "targetFile's parent make failed.");
        }
    }
}
