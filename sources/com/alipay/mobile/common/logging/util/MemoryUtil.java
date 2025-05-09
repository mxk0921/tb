package com.alipay.mobile.common.logging.util;

import android.content.Context;
import android.content.Intent;
import android.os.Debug;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.trace.TraceLogger;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MemoryUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f3993a;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
        if (r5.mkdirs() == false) goto L_0x0053;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.io.File a(android.content.Context r5) {
        /*
            java.lang.String r0 = "getMemHeapDir"
            java.lang.String r1 = "MemoryUtil"
            com.android.alibaba.ip.runtime.IpChange r2 = com.alipay.mobile.common.logging.util.MemoryUtil.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001a
            java.lang.String r0 = "72147cad"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r5
            java.lang.Object r5 = r2.ipc$dispatch(r0, r1)
            java.io.File r5 = (java.io.File) r5
            return r5
        L_0x001a:
            r2 = 0
            java.io.File r3 = com.alipay.mobile.common.logging.util.LoggingUtil.getCommonExternalStorageDir()     // Catch: all -> 0x0031
            java.io.File r4 = new java.io.File     // Catch: all -> 0x0031
            java.lang.String r5 = r5.getPackageName()     // Catch: all -> 0x0031
            r4.<init>(r3, r5)     // Catch: all -> 0x0031
            java.io.File r5 = new java.io.File     // Catch: all -> 0x0031
            java.lang.String r3 = "memHeaps"
            r5.<init>(r4, r3)     // Catch: all -> 0x0031
            goto L_0x003a
        L_0x0031:
            r5 = move-exception
            com.alipay.mobile.common.logging.api.trace.TraceLogger r3 = com.alipay.mobile.common.logging.api.LoggerFactory.getTraceLogger()
            r3.error(r1, r0, r5)
            r5 = r2
        L_0x003a:
            if (r5 == 0) goto L_0x0052
            boolean r3 = r5.exists()     // Catch: all -> 0x0049
            if (r3 != 0) goto L_0x0052
            boolean r0 = r5.mkdirs()     // Catch: all -> 0x0049
            if (r0 != 0) goto L_0x0052
            goto L_0x0053
        L_0x0049:
            r2 = move-exception
            com.alipay.mobile.common.logging.api.trace.TraceLogger r3 = com.alipay.mobile.common.logging.api.LoggerFactory.getTraceLogger()
            r3.error(r1, r0, r2)
            goto L_0x0054
        L_0x0052:
            r2 = r5
        L_0x0053:
            r5 = r2
        L_0x0054:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.util.MemoryUtil.a(android.content.Context):java.io.File");
    }

    public static synchronized void clearExpiredFiles(Context context, boolean z) {
        boolean z2;
        synchronized (MemoryUtil.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3aa352d2", new Object[]{context, new Boolean(z)});
            } else if (context == null) {
                LoggerFactory.getTraceLogger().info("MemoryUtil", "clearExpiredFiles() context:null, just return.");
            } else {
                File[] listFiles = a(context).listFiles();
                if (listFiles != null && listFiles.length > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    TimeUnit timeUnit = TimeUnit.DAYS;
                    long millis = currentTimeMillis - timeUnit.toMillis(3L);
                    long millis2 = currentTimeMillis + timeUnit.toMillis(3L);
                    for (File file : listFiles) {
                        if (file != null && file.exists() && file.isFile()) {
                            long parseLong = Long.parseLong(file.getName().split("_")[0]);
                            if (parseLong < millis || parseLong > millis2) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (z2) {
                                if (file.delete()) {
                                    LoggerFactory.getTraceLogger().warn("MemoryUtil", "cleanExpiresFile: " + file.getName() + " success!");
                                } else {
                                    LoggerFactory.getTraceLogger().warn("MemoryUtil", "cleanExpiresFile: " + file.getName() + " failed !");
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static boolean isShouldDumpOOMHeap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7dc4253", new Object[0])).booleanValue();
        }
        return f3993a;
    }

    public static void setShouldDumpOOMHeap(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf8aaf9d", new Object[]{new Boolean(z)});
        } else {
            f3993a = z;
        }
    }

    public static synchronized void dumpMemHeap(Context context) {
        synchronized (MemoryUtil.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("33efd374", new Object[]{context});
            } else if (!f3993a) {
                LoggerFactory.getTraceLogger().info("MemoryUtil", "mShouldDumpOOMHeap:false, just return.");
            } else if (context == null) {
                LoggerFactory.getTraceLogger().info("MemoryUtil", "dumpMemHeap() context:null, just return.");
            } else {
                File a2 = a(context);
                long currentTimeMillis = System.currentTimeMillis();
                File file = new File(a2, currentTimeMillis + "_dump.hprof");
                File file2 = new File(a2, currentTimeMillis + "_dump.zip");
                clearExpiredFiles(context, true);
                long currentTimeMillis2 = System.currentTimeMillis();
                LoggerFactory.getTraceLogger().info("MemoryUtil", "dump start time = ".concat(String.valueOf(currentTimeMillis2)));
                try {
                    Debug.dumpHprofData(file.getAbsolutePath());
                } catch (IOException e) {
                    LoggerFactory.getTraceLogger().warn("MemoryUtil", e);
                }
                long currentTimeMillis3 = System.currentTimeMillis();
                TraceLogger traceLogger = LoggerFactory.getTraceLogger();
                traceLogger.info("MemoryUtil", "dump end time = " + currentTimeMillis3 + " use time : " + (currentTimeMillis3 - currentTimeMillis2));
                if (file.exists()) {
                    long currentTimeMillis4 = System.currentTimeMillis();
                    LoggerFactory.getTraceLogger().info("MemoryUtil", "zip start time = ".concat(String.valueOf(currentTimeMillis4)));
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(file);
                    ZipUtil.zipFile(arrayList, file2.getAbsolutePath(), null, null);
                    long currentTimeMillis5 = System.currentTimeMillis();
                    TraceLogger traceLogger2 = LoggerFactory.getTraceLogger();
                    traceLogger2.info("MemoryUtil", "zip end time = " + currentTimeMillis5 + " use time : " + (currentTimeMillis5 - currentTimeMillis4));
                } else {
                    LoggerFactory.getTraceLogger().info("MemoryUtil", "dump nothing");
                }
                Intent intent = new Intent();
                intent.setPackage("com.alipay.android.automonkey");
                intent.setAction("ACTION_DUMP_HPROF_FINISHED");
                context.sendBroadcast(intent);
                TraceLogger traceLogger3 = LoggerFactory.getTraceLogger();
                traceLogger3.info("MemoryUtil", "hprofFile:" + file.getAbsolutePath() + " delete:" + file.delete());
            }
        }
    }
}
