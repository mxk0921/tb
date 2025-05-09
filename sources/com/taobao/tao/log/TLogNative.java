package com.taobao.tao.log;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.statistics.TLogEventHelper;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import tb.a6s;
import tb.j5s;
import tb.o5s;
import tb.odh;
import tb.q4s;
import tb.s4s;
import tb.t2o;
import tb.v4s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TLogNative {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TLOG.TLogNative";
    private static final ConcurrentLinkedCache<XLoggerInfo> sInitCache = new ConcurrentLinkedCache<>();
    private static int pid = -1;
    private static volatile boolean sOpenSoSuccess = false;
    private static int initRet = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class XLoggerInfo {
        public LogCategory category;
        public LogLevel level;
        public String log;
        public String module;
        public long pid;
        public String tag;
        public long tid;
        public long ts;

        static {
            t2o.a(767557653);
        }
    }

    static {
        t2o.a(767557652);
    }

    @Deprecated
    public static native void addModuleFilter(String str, int i);

    public static native void appenderClose();

    public static native void appenderFlush(boolean z);

    public static void appenderFlushData(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("578c1446", new Object[]{new Boolean(z)});
            return;
        }
        try {
            if (pid == Process.myPid()) {
                appenderFlush(z);
            }
        } catch (Exception e) {
            Log.e("TLogNative", "appenderFlushData failure", e);
        } catch (UnsatisfiedLinkError e2) {
            Log.e("TLogNative", "appenderFlushData failure, unsatisfied link error", e2);
        }
    }

    public static void appenderOpen(int i, String str, String str2, String str3, String str4, String str5, long j, long j2, boolean z, int i2, int i3, boolean z2, long j3, long j4) {
        Object obj;
        String str6;
        String str7;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7853f11d", new Object[]{new Integer(i), str, str2, str3, str4, str5, new Long(j), new Long(j2), new Boolean(z), new Integer(i2), new Integer(i3), new Boolean(z2), new Long(j3), new Long(j4)});
            return;
        }
        try {
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(str2);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            System.loadLibrary("c++_shared");
            Log.e(TAG, "loadLibrary AliHALogEngine");
            System.loadLibrary("AliHALogEngine");
            try {
                int initNative = initNative(i, str, str2, str3, str4, str5, j * 1048576, q4s.k, j2 * 1024, z, i2, i3, z2, j3 * 1048576, j4 * 1048576, q4s.E, q4s.x, q4s.c());
                initRet = initNative;
                sOpenSoSuccess = initNative == 1;
                int myPid = Process.myPid();
                pid = myPid;
                String format = String.format("Init TLOG at process %d result %d", Integer.valueOf(myPid), Integer.valueOf(initRet));
                str7 = TAG;
                try {
                    Log.e(str7, format);
                    if (!sOpenSoSuccess) {
                        HashMap hashMap = new HashMap();
                        obj = "errMsg";
                        try {
                            hashMap.put(obj, String.valueOf(initRet));
                            str6 = v4s.UT_TLOG_INIT_ERR;
                        } catch (Throwable th2) {
                            th = th2;
                            str6 = v4s.UT_TLOG_INIT_ERR;
                            Log.e(str7, "appenderOpen exception: ", th);
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put(obj, th.getMessage());
                            TLogEventHelper.g(str6, hashMap2);
                        }
                        try {
                            TLogEventHelper.g(str6, hashMap);
                        } catch (Throwable th3) {
                            th = th3;
                            Log.e(str7, "appenderOpen exception: ", th);
                            HashMap hashMap22 = new HashMap();
                            hashMap22.put(obj, th.getMessage());
                            TLogEventHelper.g(str6, hashMap22);
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    obj = "errMsg";
                }
            } catch (Throwable th5) {
                th = th5;
                obj = "errMsg";
                str6 = v4s.UT_TLOG_INIT_ERR;
                str7 = TAG;
            }
        } catch (Throwable th6) {
            th = th6;
            str7 = TAG;
            obj = "errMsg";
            str6 = v4s.UT_TLOG_INIT_ERR;
        }
    }

    @Deprecated
    public static native void cleanModuleFilter();

    public static native int clearLogFiles(int i);

    public static void eventForNative(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b93517c", new Object[]{str, hashMap});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                TLogEventHelper.g(str, hashMap);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static native int getLogLevel();

    public static String getRc4EncryptSecretyKeyValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ac8e7d76", new Object[0]);
        }
        try {
            return a6s.a().b(q4s.m);
        } catch (Exception e) {
            Log.e(TAG, "getRc4EncryptSecretyKeyValue", e);
            return null;
        }
    }

    public static String getRsaPublicKeyMd5Value() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2346325a", new Object[0]);
        }
        return a6s.a().c();
    }

    public static String getSecurityKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("876e28d0", new Object[0]);
        }
        String str = q4s.m;
        return TextUtils.isEmpty(str) ? "t_remote_debugger" : str;
    }

    private static native int initNative(int i, String str, String str2, String str3, String str4, String str5, long j, int i2, long j2, boolean z, int i3, int i4, boolean z2, long j3, long j4, int i5, String str6, int i6);

    public static boolean isSoOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6dc8c91b", new Object[0])).booleanValue();
        }
        return sOpenSoSuccess;
    }

    @Deprecated
    public static native void setAppenderMode(int i);

    @Deprecated
    public static native void setConsoleLogOpen(boolean z);

    public static native void setLogLevel(int i);

    public static native int writeMiniTLogToFile(String str);

    private static native void writeTLogNative(long j, long j2, long j3, int i, int i2, String str, String str2, String str3);

    public static void writeTraceLog(LogLevel logLevel, String str, String str2, String str3, String str4, String str5, long j, String str6, String str7, String str8, int i, String str9, String str10) {
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        LogLevel logLevel2;
        int i2;
        String str18;
        String str19;
        String str20;
        String str21;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ac575f8", new Object[]{logLevel, str, str2, str3, str4, str5, new Long(j), str6, str7, str8, new Integer(i), str9, str10});
        } else if (!TextUtils.isEmpty(str6)) {
            if (j5s.j().i() == 2) {
                writeCacheTLog();
                if (pid != Process.myPid()) {
                    str18 = str;
                    Log.e(TAG, String.format("在fork的进程%d, 写tlog (%d). Module=%s", Integer.valueOf(Process.myPid()), Integer.valueOf(pid), str18));
                    logLevel2 = logLevel;
                } else if (!sOpenSoSuccess) {
                    Log.e(TAG, String.format("[TRACE-ERR:%d] [%s][%s] %s", Integer.valueOf(initRet), str, str2, str6));
                    return;
                } else {
                    try {
                        int index = logLevel.getIndex();
                        str21 = TAG;
                        try {
                            writeTraceLogNative(index, str, str2, str3, str4, str5, j, str6, str7, str8, i, str9, str10);
                            o5s.o(logLevel, str, str2, str3, str4, str5, j, str6, str7, str8, i, str9, str10);
                        } catch (Throwable th2) {
                            th = th2;
                            Log.e(str21, "writeTraceLog.writeTraceLogNative", th);
                            logLevel2 = logLevel;
                            str18 = str;
                            str11 = str2;
                            str14 = str3;
                            str13 = str4;
                            str19 = str5;
                            str20 = str6;
                            str17 = str7;
                            str16 = str8;
                            i2 = i;
                            str12 = str9;
                            str15 = str10;
                            if (j5s.j().u()) {
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        str21 = TAG;
                    }
                    logLevel2 = logLevel;
                    str18 = str;
                }
                str11 = str2;
                str14 = str3;
                str13 = str4;
                str19 = str5;
                str20 = str6;
                str17 = str7;
                str16 = str8;
                i2 = i;
                str12 = str9;
                str15 = str10;
            } else {
                str18 = str;
                StringBuilder sb = new StringBuilder();
                str20 = str6;
                sb.append(str20);
                sb.append((char) 31);
                i2 = i;
                sb.append(i2);
                sb.append((char) 31);
                sb.append(str10);
                sb.append((char) 31);
                str17 = str7;
                sb.append(str17);
                sb.append((char) 31);
                str16 = str8;
                sb.append(str16);
                sb.append((char) 31);
                sb.append(j);
                sb.append((char) 31);
                str15 = str10;
                sb.append(str9);
                sb.append((char) 31);
                str14 = str3;
                sb.append(str14);
                sb.append((char) 31);
                str13 = str4;
                sb.append(str13);
                sb.append((char) 31);
                str19 = str5;
                sb.append(str19);
                String sb2 = sb.toString();
                XLoggerInfo xLoggerInfo = new XLoggerInfo();
                str12 = str9;
                logLevel2 = logLevel;
                xLoggerInfo.level = logLevel2;
                xLoggerInfo.ts = System.currentTimeMillis();
                xLoggerInfo.category = LogCategory.TraceEventLog;
                xLoggerInfo.module = str18;
                str11 = str2;
                xLoggerInfo.tag = str11;
                xLoggerInfo.log = sb2;
                xLoggerInfo.pid = q4s.G;
                xLoggerInfo.tid = Process.myTid();
                sInitCache.add(xLoggerInfo);
            }
            if (j5s.j().u() && !"empty".equals(str13)) {
                odh.a(logLevel2, str18, str11, "event=" + str20 + ", ext=" + str15 + ", eventType=" + i2 + ", eventCode=" + str17 + ", codeMsg=" + str16 + ", sceneID=" + str19 + ", cntID=" + str14 + ", refID=" + str13 + ", bizCode=" + str12);
            }
        }
    }

    private static native void writeTraceLogNative(int i, String str, String str2, String str3, String str4, String str5, long j, String str6, String str7, String str8, int i2, String str9, String str10);

    private static void writeCacheTLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d97e1eba", new Object[0]);
        } else if (sOpenSoSuccess) {
            ConcurrentLinkedCache<XLoggerInfo> concurrentLinkedCache = sInitCache;
            if (concurrentLinkedCache.size() > 0) {
                Iterator<XLoggerInfo> iteratorAndClear = concurrentLinkedCache.getIteratorAndClear();
                while (iteratorAndClear.hasNext()) {
                    XLoggerInfo next = iteratorAndClear.next();
                    o5s.l(next.tid, next.ts, next.level, next.category, next.module, next.tag, next.log);
                    if (!q4s.j && q4s.i) {
                        odh.a(next.level, next.module, next.tag, next.log);
                    }
                    if (next.category != LogCategory.CodeLog || isModuleEnabledForLevel(next.level.getIndex(), next.module)) {
                        if (next.pid != pid) {
                            Log.e(TAG, String.format("在fork的进程%d, 写tlog (%d). Module=%s", Integer.valueOf(Process.myPid()), Integer.valueOf(pid), next.module));
                        } else if (!TextUtils.isEmpty(next.log)) {
                            try {
                                writeTLogNative(next.pid, next.tid, next.ts, next.category.getIndex(), next.level.getIndex(), next.module, next.tag, next.log);
                            } catch (Throwable th) {
                                Log.e(TAG, "writeCacheTLog.writeTLogNative", th);
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    private static boolean isModuleEnabledForLevel(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb8633e4", new Object[]{new Integer(i), str})).booleanValue();
        }
        if (s4s.e().f("").getIndex() <= i) {
            return true;
        }
        LogLevel f = s4s.e().f(str);
        return f != null && f.getIndex() <= i;
    }

    public static void writeCodeLog(LogLevel logLevel, String str, String str2, String str3, boolean z, long j) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21f50425", new Object[]{logLevel, str, str2, str3, new Boolean(z), new Long(j)});
        } else if (!TextUtils.isEmpty(str3)) {
            if (j5s.j().i() == 2) {
                writeCacheTLog();
                if (pid != Process.myPid()) {
                    Log.e(TAG, String.format("在fork的进程%d, 写CodeLog (%d). Module=%s", Integer.valueOf(Process.myPid()), Integer.valueOf(pid), str));
                } else if (!sOpenSoSuccess) {
                    Log.e(TAG, String.format("[ERR:%d] [%s][%s] log.length=%s", Integer.valueOf(initRet), str, str2, Integer.valueOf(str3.length())));
                } else {
                    if (z) {
                        LogCategory logCategory = LogCategory.CodeLog;
                        str4 = TAG;
                        o5s.l(pid, j, logLevel, logCategory, str, str2, str3);
                    } else {
                        str4 = TAG;
                        o5s.m(logLevel, LogCategory.CodeLog, str, str2, str3);
                    }
                    try {
                        if (isModuleEnabledForLevel(logLevel.getIndex(), str)) {
                            writeTLogNative(pid, z ? pid : 0L, j, LogCategory.CodeLog.getIndex(), logLevel.getIndex(), str, str2, str3);
                        }
                    } catch (Throwable th) {
                        Log.e(str4, "writeCodeLog.writeTLogNative", th);
                    }
                }
            } else {
                XLoggerInfo xLoggerInfo = new XLoggerInfo();
                xLoggerInfo.level = logLevel;
                xLoggerInfo.ts = z ? j : System.currentTimeMillis();
                xLoggerInfo.category = LogCategory.CodeLog;
                long j2 = q4s.G;
                xLoggerInfo.pid = j2;
                if (!z) {
                    j2 = Process.myTid();
                }
                xLoggerInfo.tid = j2;
                xLoggerInfo.module = str;
                xLoggerInfo.tag = str2;
                xLoggerInfo.log = str3;
                sInitCache.add(xLoggerInfo);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void writeLog(com.taobao.tao.log.LogCategory r17, com.taobao.tao.log.LogLevel r18, java.lang.String r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.log.TLogNative.writeLog(com.taobao.tao.log.LogCategory, com.taobao.tao.log.LogLevel, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
