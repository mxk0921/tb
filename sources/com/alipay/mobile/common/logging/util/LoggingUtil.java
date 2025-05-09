package com.alipay.mobile.common.logging.util;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.ProcessInfo;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.zip.GZIPOutputStream;
import tb.f7l;
import tb.jcq;
import tb.wqx;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class LoggingUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static int f3992a = -1;
    public static int b = -1;
    public static int c = -1;
    public static int d = -1;
    public static Boolean e;
    public static final String[] f = {"com.eg.android.AlipayGphone"};
    public static Random g;

    /* compiled from: Taobao */
    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface FillBufferHandler {
        Object handleKey(Object obj);

        Object handleValue(Object obj);
    }

    public static String acquireThreadsStackTrace() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("572a7b09", new Object[0]);
        }
        return getThreadsStackTrace(false)[0];
    }

    public static StringBuilder appendExtParam(StringBuilder sb, Map<String, String> map) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StringBuilder) ipChange.ipc$dispatch("a7b53fc2", new Object[]{sb, map});
        }
        if (sb == null) {
            return null;
        }
        sb.append(',');
        if (!(map == null || map.size() == 0)) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (value == null) {
                    value = "";
                }
                if (key != null) {
                    String fliterChar = fliterChar(value);
                    if (z) {
                        z = false;
                    } else {
                        sb.append('^');
                    }
                    sb.append(key.replace(',', ' ').replace('^', ' ').replace('=', ' '));
                    sb.append('=');
                    sb.append(fliterChar.replace(',', ' ').replace('^', ' '));
                }
            }
        }
        return sb;
    }

    public static StringBuilder appendParam(StringBuilder sb, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StringBuilder) ipChange.ipc$dispatch("3ca85b76", new Object[]{sb, str});
        }
        if (sb == null) {
            return null;
        }
        sb.append(',');
        if (str != null) {
            sb.append(str.replace(',', ' '));
        }
        return sb;
    }

    public static Pair<String, String> backTrackInvoker() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Pair) ipChange.ipc$dispatch("a7d36447", new Object[0]) : backTrackInvoker(2);
    }

    public static String concatArray(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8442705", new Object[]{str, objArr});
        }
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        if (objArr.length == 1) {
            return String.valueOf(objArr[0]);
        }
        if (objArr.length == 2) {
            return String.valueOf(objArr[0]) + str + String.valueOf(objArr[1]);
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Object obj : objArr) {
            if (z) {
                z = false;
            } else {
                sb.append(str);
            }
            sb.append(obj);
        }
        return sb.toString();
    }

    public static void fillBufferWithParams(StringBuilder sb, Map<?, ?> map, FillBufferHandler fillBufferHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788a0abc", new Object[]{sb, map, fillBufferHandler});
        } else if (sb != null && map != null && map.size() != 0) {
            try {
                for (Map.Entry<?, ?> entry : map.entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if (fillBufferHandler != null) {
                        key = fillBufferHandler.handleKey(key);
                        value = fillBufferHandler.handleKey(value);
                        if (key != null) {
                        }
                    }
                    sb.append(", ");
                    sb.append(key);
                    sb.append(": ");
                    sb.append(value);
                }
            } catch (Throwable th) {
                LoggerFactory.getTraceLogger().error("LoggingUtil", "fillBufferWithParams.outer", th);
            }
        }
    }

    public static String fliterChar(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("57275a5b", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            return str.replace("\r\n", "###").replace("\n", "###").replace("\r", "###");
        }
        return str;
    }

    public static String formatTimespanToHHmmssSSS(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("295a6aed", new Object[]{new Long(j)});
        }
        if (j < 0) {
            return "";
        }
        long j2 = j % 1000;
        long j3 = j / 1000;
        long j4 = j3 / 60;
        return (j4 / 60) + "h:" + (j4 % 60) + "m:" + (j3 % 60) + "s:" + j2;
    }

    public static File getCommonExternalStorageDir() {
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("ffe74aa8", new Object[0]);
        }
        try {
            file = new File(Environment.getExternalStorageDirectory(), "alipay");
        } catch (Throwable th) {
            th.toString();
            file = new File("/sdcard/alipay");
        }
        try {
            if (!file.exists()) {
                file.mkdirs();
            } else if (file.isFile()) {
                FileUtil.deleteFileNotDir(file);
                file.mkdirs();
            }
        } catch (Throwable unused) {
        }
        return file;
    }

    public static String getCommonExternalStoragePath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("924a09a5", new Object[0]);
        }
        File commonExternalStorageDir = getCommonExternalStorageDir();
        if (commonExternalStorageDir == null) {
            return null;
        }
        return commonExternalStorageDir.getAbsolutePath();
    }

    public static Random getCommonRandom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Random) ipChange.ipc$dispatch("2ecda417", new Object[0]);
        }
        if (g == null) {
            g = new Random();
        }
        return g;
    }

    public static String getMdapStyleName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28e4b76f", new Object[]{str});
        }
        return System.currentTimeMillis() + "_" + str;
    }

    public static String getNowTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bfbca9f0", new Object[]{new Long(j)});
        }
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone(wqx.SHANGHAI_ZONE_ID_NAME));
        instance.setTimeInMillis(j);
        StringBuilder sb = new StringBuilder();
        int i = instance.get(1);
        int i2 = instance.get(2) + 1;
        int i3 = instance.get(5);
        int i4 = instance.get(11);
        int i5 = instance.get(12);
        int i6 = instance.get(13);
        int i7 = instance.get(14);
        sb.append(i);
        sb.append('-');
        if (i2 < 10) {
            sb.append('0');
        }
        sb.append(i2);
        sb.append('-');
        if (i3 < 10) {
            sb.append('0');
        }
        sb.append(i3);
        sb.append(' ');
        if (i4 < 10) {
            sb.append('0');
        }
        sb.append(i4);
        sb.append(f7l.CONDITION_IF_MIDDLE);
        if (i5 < 10) {
            sb.append('0');
        }
        sb.append(i5);
        sb.append(f7l.CONDITION_IF_MIDDLE);
        if (i6 < 10) {
            sb.append('0');
        }
        sb.append(i6);
        sb.append(f7l.CONDITION_IF_MIDDLE);
        if (i7 < 100) {
            sb.append('0');
        }
        if (i7 < 10) {
            sb.append('0');
        }
        sb.append(i7);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.io.File getStorageFilesDir(android.content.Context r4, java.lang.String r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.mobile.common.logging.util.LoggingUtil.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "26d867bd"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r4 = 1
            r2[r4] = r5
            java.lang.Object r4 = r0.ipc$dispatch(r1, r2)
            java.io.File r4 = (java.io.File) r4
            return r4
        L_0x0018:
            boolean r0 = isOfflineForExternalFile()
            if (r0 == 0) goto L_0x0037
            boolean r0 = com.alipay.mobile.common.logging.util.FileUtil.isCanUseSdCard()
            if (r0 == 0) goto L_0x0037
            java.io.File r0 = getCommonExternalStorageDir()     // Catch: all -> 0x0037
            java.io.File r1 = new java.io.File     // Catch: all -> 0x0037
            java.lang.String r2 = r4.getPackageName()     // Catch: all -> 0x0037
            r1.<init>(r0, r2)     // Catch: all -> 0x0037
            java.io.File r0 = new java.io.File     // Catch: all -> 0x0037
            r0.<init>(r1, r5)     // Catch: all -> 0x0037
            goto L_0x0038
        L_0x0037:
            r0 = 0
        L_0x0038:
            if (r0 != 0) goto L_0x0046
            java.io.File r1 = new java.io.File     // Catch: all -> 0x0045
            java.io.File r4 = r4.getFilesDir()     // Catch: all -> 0x0045
            r1.<init>(r4, r5)     // Catch: all -> 0x0045
            r0 = r1
            goto L_0x0046
        L_0x0045:
        L_0x0046:
            if (r0 == 0) goto L_0x0051
            boolean r4 = r0.exists()
            if (r4 != 0) goto L_0x0051
            r0.mkdirs()
        L_0x0051:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.util.LoggingUtil.getStorageFilesDir(android.content.Context, java.lang.String):java.io.File");
    }

    public static String getTopActivity() {
        ComponentName componentName;
        ComponentName componentName2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1fac116b", new Object[0]);
        }
        try {
            List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) LoggerFactory.getLogContext().getApplicationContext().getSystemService("activity")).getRunningTasks(3);
            if (runningTasks == null || runningTasks.size() <= 0) {
                return null;
            }
            String str = null;
            for (ActivityManager.RunningTaskInfo runningTaskInfo : runningTasks) {
                if (runningTaskInfo != null) {
                    componentName = runningTaskInfo.topActivity;
                    if (componentName.getPackageName().equals(LoggerFactory.getProcessInfo().getPackageName())) {
                        componentName2 = runningTaskInfo.topActivity;
                        str = componentName2.getClassName();
                    }
                }
            }
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static byte[] gzipDataByBytes(byte[] bArr, int i, int i2) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("38482e9f", new Object[]{bArr, new Integer(i), new Integer(i2)});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream2.write(bArr, i, i2);
                gZIPOutputStream2.finish();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    gZIPOutputStream2.close();
                } catch (Throwable unused) {
                }
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable unused2) {
                }
                return byteArray;
            } catch (Throwable th2) {
                th = th2;
                gZIPOutputStream = gZIPOutputStream2;
                try {
                    throw new IllegalStateException(th);
                } catch (Throwable th3) {
                    if (gZIPOutputStream != null) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable unused4) {
                    }
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static byte[] gzipDataByString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("fe4f8f60", new Object[]{str});
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return gzipDataByBytes(bytes, 0, bytes.length);
        } catch (Throwable th) {
            throw new IllegalStateException(th);
        }
    }

    public static boolean isDebuggable(Context context) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e5a578d", new Object[]{context})).booleanValue();
        }
        if (f3992a < 0) {
            if (context == null) {
                return false;
            }
            try {
                if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 16384).flags & 2) == 2) {
                    i = 1;
                } else {
                    i = 0;
                }
                f3992a = i;
            } catch (Throwable unused) {
                f3992a = 0;
            }
        }
        if (f3992a == 1) {
            return true;
        }
        return false;
    }

    public static final boolean isInAlipayClient(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c322f61", new Object[]{context})).booleanValue();
        }
        Boolean bool = e;
        if (bool != null) {
            return bool.booleanValue();
        }
        String packageName = context.getPackageName();
        if (TextUtils.isEmpty(packageName)) {
            return false;
        }
        if (packageName.contains(f[0])) {
            e = Boolean.TRUE;
            return true;
        }
        e = Boolean.FALSE;
        return false;
    }

    public static boolean isOfflineAppendMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef29ffa1", new Object[0])).booleanValue();
        }
        if (d < 0) {
            String releaseType = LoggerFactory.getLogContext().getReleaseType();
            d = (LogContext.RELEASETYPE_DEV.equals(releaseType) || "test".equals(releaseType) || LogContext.RELEASETYPE_TESTPRE.equals(releaseType) || LogContext.RELEASETYPE_RC.equals(releaseType)) ? 1 : 0;
        }
        return d == 1;
    }

    public static boolean isOfflineForExternalFile() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e4a21c2", new Object[0])).booleanValue();
        }
        if (c < 0) {
            String releaseType = LoggerFactory.getLogContext().getReleaseType();
            c = (isOfflineMode() || LogContext.RELEASETYPE_RC.equals(releaseType) || LogContext.RELEASETYPE_RCPRE.equals(releaseType)) ? 1 : 0;
        }
        return c == 1;
    }

    public static boolean isOfflineMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1a08527", new Object[0])).booleanValue();
        }
        if (b < 0) {
            String releaseType = LoggerFactory.getLogContext().getReleaseType();
            b = (LogContext.RELEASETYPE_DEV.equals(releaseType) || "test".equals(releaseType) || LogContext.RELEASETYPE_TESTPRE.equals(releaseType)) ? 1 : 0;
        }
        return b == 1;
    }

    public static boolean isProcessStartByClickLauncherIcon() {
        Map<String, String> startupReason;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3c7f98", new Object[0])).booleanValue();
        }
        if (LoggerFactory.getProcessInfo().isMainProcess() && (startupReason = LoggerFactory.getProcessInfo().getStartupReason()) != null) {
            return "com.eg.android.AlipayGphone.AlipayLogin".equals(startupReason.get(ProcessInfo.SR_COMPONENT_NAME));
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002f A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:6:0x0019, B:7:0x0029, B:9:0x002f, B:11:0x003f), top: B:17:0x0019 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isWalletProcessRuning(android.content.Context r5) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.alipay.mobile.common.logging.util.LoggingUtil.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "a407d042"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            java.lang.Object r5 = r2.ipc$dispatch(r3, r1)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L_0x0019:
            java.lang.String r2 = "activity"
            java.lang.Object r5 = r5.getSystemService(r2)     // Catch: all -> 0x004a
            android.app.ActivityManager r5 = (android.app.ActivityManager) r5     // Catch: all -> 0x004a
            java.util.List r5 = r5.getRunningAppProcesses()     // Catch: all -> 0x004a
            java.util.Iterator r5 = r5.iterator()     // Catch: all -> 0x004a
        L_0x0029:
            boolean r2 = r5.hasNext()     // Catch: all -> 0x004a
            if (r2 == 0) goto L_0x0056
            java.lang.Object r2 = r5.next()     // Catch: all -> 0x004a
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2     // Catch: all -> 0x004a
            java.lang.String r3 = "com.eg.android.AlipayGphone"
            java.lang.String r4 = r2.processName     // Catch: all -> 0x004a
            boolean r3 = r3.equals(r4)     // Catch: all -> 0x004a
            if (r3 != 0) goto L_0x004c
            java.lang.String r3 = "com.eg.android.AlipayGphoneRC"
            java.lang.String r2 = r2.processName     // Catch: all -> 0x004a
            boolean r2 = r3.equals(r2)     // Catch: all -> 0x004a
            if (r2 == 0) goto L_0x0029
            goto L_0x004c
        L_0x004a:
            r5 = move-exception
            goto L_0x004d
        L_0x004c:
            return r1
        L_0x004d:
            com.alipay.mobile.common.logging.api.trace.TraceLogger r1 = com.alipay.mobile.common.logging.api.LoggerFactory.getTraceLogger()
            java.lang.String r2 = "LoggingUtil"
            r1.error(r2, r5)
        L_0x0056:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.util.LoggingUtil.isWalletProcessRuning(android.content.Context):boolean");
    }

    public static String[] obtainThreadsStackTrace() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("92133fd7", new Object[0]);
        }
        return getThreadsStackTrace(true);
    }

    public static int randomInteger(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a5b759d5", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        return i + ((int) (getCommonRandom().nextFloat() * (i2 - i)));
    }

    public static void reflectErrorLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dda573ca", new Object[]{str});
        } else if (str != null) {
            reflectErrorLog("LoggingUtil", str, true);
        }
    }

    public static void reflectErrorLogAutomationCrash(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a53b50e8", new Object[]{str});
            return;
        }
        reflectErrorLog("automationcrash", "Force Start parse for automation", false);
        reflectErrorLog(str);
        reflectErrorLog("automationcrash", "Force End parse for automation", false);
    }

    public static String stackTraceToString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("93fba4e6", new Object[]{str});
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-StackTrace:");
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append("###\tat ");
            sb.append(stackTraceElement);
        }
        sb.append("###");
        return sb.toString();
    }

    public static String throwableToString(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8235015e", new Object[]{th});
        }
        String stackTraceString = Log.getStackTraceString(th);
        if (stackTraceString != null) {
            return stackTraceString.replace("$$", "<2$>");
        }
        return stackTraceString;
    }

    public static Pair<String, String> backTrackInvoker(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("909f9830", new Object[]{new Integer(i)});
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null) {
            return Pair.create("", "");
        }
        if (i <= 0) {
            i = 1;
        }
        int i2 = i + 3;
        if (i2 >= stackTrace.length) {
            i2 = stackTrace.length - 1;
        }
        StackTraceElement stackTraceElement = stackTrace[i2];
        if (stackTraceElement == null) {
            return Pair.create("", "");
        }
        return Pair.create(stackTraceElement.getClassName(), stackTraceElement.getMethodName());
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
        if (r2.isClosed() == false) goto L_0x0051;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getZhizhiSetting(android.content.Context r9, java.lang.String r10, java.lang.String r11) {
        /*
            r0 = 0
            java.lang.String r1 = "LoggingUtil"
            com.android.alibaba.ip.runtime.IpChange r2 = com.alipay.mobile.common.logging.util.LoggingUtil.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001d
            java.lang.String r1 = "c62b1165"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r9
            r9 = 1
            r3[r9] = r10
            r9 = 2
            r3[r9] = r11
            java.lang.Object r9 = r2.ipc$dispatch(r1, r3)
            java.lang.String r9 = (java.lang.String) r9
            return r9
        L_0x001d:
            if (r9 == 0) goto L_0x0094
            boolean r2 = android.text.TextUtils.isEmpty(r10)
            if (r2 == 0) goto L_0x0026
            goto L_0x0094
        L_0x0026:
            r2 = 0
            android.net.Uri r4 = android.net.Uri.parse(r10)     // Catch: all -> 0x0047
            android.content.ContentResolver r3 = r9.getContentResolver()     // Catch: all -> 0x0047
            r7 = 0
            r8 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8)     // Catch: all -> 0x0047
            if (r2 == 0) goto L_0x0049
            int r9 = r2.getCount()     // Catch: all -> 0x0047
            if (r9 <= 0) goto L_0x0049
            r2.moveToFirst()     // Catch: all -> 0x0047
            java.lang.String r11 = r2.getString(r0)     // Catch: all -> 0x0047
            goto L_0x0049
        L_0x0047:
            r9 = move-exception
            goto L_0x0055
        L_0x0049:
            if (r2 == 0) goto L_0x0068
            boolean r9 = r2.isClosed()
            if (r9 != 0) goto L_0x0068
        L_0x0051:
            r2.close()     // Catch: all -> 0x0068
            goto L_0x0068
        L_0x0055:
            com.alipay.mobile.common.logging.api.trace.TraceLogger r0 = com.alipay.mobile.common.logging.api.LoggerFactory.getTraceLogger()     // Catch: all -> 0x0087
            java.lang.String r3 = "getZhizhiSetting"
            r0.error(r1, r3, r9)     // Catch: all -> 0x0087
            if (r2 == 0) goto L_0x0068
            boolean r9 = r2.isClosed()
            if (r9 != 0) goto L_0x0068
            goto L_0x0051
        L_0x0068:
            com.alipay.mobile.common.logging.api.trace.TraceLogger r9 = com.alipay.mobile.common.logging.api.LoggerFactory.getTraceLogger()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "getZhizhiSetting, uri: "
            r0.<init>(r2)
            r0.append(r10)
            java.lang.String r10 = ", value: "
            r0.append(r10)
            r0.append(r11)
            java.lang.String r10 = r0.toString()
            r9.info(r1, r10)
            return r11
        L_0x0087:
            r9 = move-exception
            if (r2 == 0) goto L_0x0093
            boolean r10 = r2.isClosed()
            if (r10 != 0) goto L_0x0093
            r2.close()     // Catch: all -> 0x0093
        L_0x0093:
            throw r9
        L_0x0094:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.util.LoggingUtil.getZhizhiSetting(android.content.Context, java.lang.String, java.lang.String):java.lang.String");
    }

    public static void reflectErrorLog(String str, String str2, boolean z) {
        try {
            StringBuilder sb = new StringBuilder();
            if (z) {
                sb.append('[');
                sb.append(Thread.currentThread().getName());
                sb.append(']');
            }
            sb.append(str2);
            Class.forName("android.util.Log").getMethod("e", String.class, String.class).invoke(null, str, sb.toString());
        } catch (Throwable unused) {
        }
    }

    public static String[] getThreadsStackTrace(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("f2bf384c", new Object[]{new Boolean(z)});
        }
        StringBuilder sb = new StringBuilder(40000);
        StringBuilder sb2 = z ? new StringBuilder() : null;
        try {
            boolean z2 = true;
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                try {
                    StackTraceElement[] value = entry.getValue();
                    String name = entry.getKey().getName();
                    sb.append('\n');
                    sb.append("ThreadName=");
                    sb.append(name);
                    sb.append("\n");
                    if (sb2 != null) {
                        if (z2) {
                            z2 = false;
                        } else {
                            sb2.append("|");
                        }
                        sb2.append(name);
                    }
                    for (StackTraceElement stackTraceElement : value) {
                        sb.append(String.valueOf(stackTraceElement));
                        sb.append("\n");
                    }
                    sb.append("\n");
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
        return new String[]{sb.toString(), String.valueOf(sb2)};
    }

    public static boolean isScreenOn(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acfc6e90", new Object[]{context})).booleanValue();
        }
        try {
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            if (powerManager != null) {
                if (!powerManager.isScreenOn()) {
                    return false;
                }
            }
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("LoggingUtil", "isScreenOn error", th);
        }
        return true;
    }

    public static boolean loadLibrary(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d11b031a", new Object[]{context, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            System.loadLibrary(str);
            LoggerFactory.getTraceLogger().info("LoggingUtil", "success to System.loadLibrary : ".concat(String.valueOf(str)));
            return true;
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("LoggingUtil", "failed to System.loadLibrary : ".concat(String.valueOf(str)), th);
            if (context == null) {
                return false;
            }
            String str2 = "";
            try {
                File dir = context.getDir("plugins_lib", 0);
                str2 = new File(dir, "lib" + str + jcq.SO_EXTENSION).getAbsolutePath();
                System.load(str2);
                LoggerFactory.getTraceLogger().info("LoggingUtil", "success to System.load : ".concat(String.valueOf(str2)));
                return true;
            } catch (Throwable th2) {
                LoggerFactory.getTraceLogger().error("LoggingUtil", "failed to System.load : ".concat(String.valueOf(str2)), th2);
                return false;
            }
        }
    }

    public static String getSystemProperty(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        try {
            return (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("LoggingUtil", "getSystemProperty", th);
            return str2;
        }
    }

    public static void reflectErrorLog(String str, Throwable th) {
        if (!(str == null || th == null)) {
            try {
                Class.forName("android.util.Log").getMethod("e", String.class, String.class, Throwable.class).invoke(null, "LoggingUtil", "[" + Thread.currentThread().getName() + ']' + str, th);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    public static void fillBufferWithParams(StringBuilder sb, Bundle bundle, FillBufferHandler fillBufferHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fabc304d", new Object[]{sb, bundle, fillBufferHandler});
        } else if (sb != 0 && bundle != 0 && bundle.size() != 0) {
            try {
                for (String str : bundle.keySet()) {
                    Object obj = bundle.get(str);
                    if (fillBufferHandler != 0) {
                        str = fillBufferHandler.handleKey(str);
                        obj = fillBufferHandler.handleKey(obj);
                        if (str != 0) {
                        }
                    }
                    sb.append(", ");
                    sb.append(str);
                    sb.append(": ");
                    sb.append(obj);
                }
            } catch (Throwable th) {
                LoggerFactory.getTraceLogger().error("LoggingUtil", "fillBufferWithParams.outer", th);
            }
        }
    }

    public static String getNowTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9980e68c", new Object[0]) : getNowTime(System.currentTimeMillis());
    }
}
