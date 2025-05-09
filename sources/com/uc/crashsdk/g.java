package com.uc.crashsdk;

import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import com.android.alibaba.ip.server.InstantPatcher;
import com.uc.crashsdk.a.a;
import com.uc.crashsdk.a.d;
import com.uc.crashsdk.a.h;
import com.uc.crashsdk.export.CustomInfo;
import com.uc.crashsdk.export.VersionInfo;
import java.io.File;
import java.lang.reflect.Field;
import java.util.zip.ZipFile;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f14245a = true;
    private static CustomInfo b;
    private static VersionInfo c;
    private static String e;
    private static String f;
    private static String g;
    private static String h;
    private static final Object d = new Object();
    private static final Object i = new Object();

    public static long A() {
        return b.mMaxUploadBytesPerDay;
    }

    public static int B() {
        return b.mMaxUploadBuiltinLogCountPerDay;
    }

    public static int C() {
        return b.mMaxUploadCustomLogCountPerDay;
    }

    public static int D() {
        return b.mMaxCustomLogCountPerTypePerDay;
    }

    public static int E() {
        return b.mInfoUpdateInterval;
    }

    public static int F() {
        return b.mInfoSaveFrequency;
    }

    public static int G() {
        return b.mReservedJavaFileHandleCount;
    }

    public static int H() {
        return b.mFdDumpMinLimit;
    }

    public static int I() {
        return b.mThreadsDumpMinLimit;
    }

    public static boolean J() {
        return b.mAutoDetectLifeCycle;
    }

    public static boolean K() {
        return b.mMonitorBattery;
    }

    public static int L() {
        return b.mAnrTraceStrategy;
    }

    public static boolean M() {
        CustomInfo customInfo = b;
        if (customInfo == null || customInfo.mDebug) {
            return true;
        }
        return false;
    }

    public static boolean N() {
        CustomInfo customInfo = b;
        if (customInfo == null || customInfo.mPrintStackInfos) {
            return true;
        }
        return false;
    }

    public static boolean O() {
        return b.mEnableStatReport;
    }

    public static boolean P() {
        return b.mIsInternational;
    }

    public static int Q() {
        return b.mProductHardcode;
    }

    public static boolean R() {
        return b.mAddPvForNewDay;
    }

    public static String S() {
        if (com.uc.crashsdk.a.g.a(c.mVersion)) {
            return a.a();
        }
        return a(c.mVersion);
    }

    public static String T() {
        if (com.uc.crashsdk.a.g.a(c.mSubVersion)) {
            return "release";
        }
        return c.mSubVersion;
    }

    public static String U() {
        if (com.uc.crashsdk.a.g.a(c.mBuildId)) {
            return Y();
        }
        return a(c.mBuildId);
    }

    public static String V() {
        if (f == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(com.uc.crashsdk.a.g.b());
            char c2 = File.separatorChar;
            sb.append(c2);
            sb.append(b.mTagFilesFolderName);
            sb.append(c2);
            f = sb.toString();
        }
        return f;
    }

    public static String W() {
        if (g == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(com.uc.crashsdk.a.g.b());
            char c2 = File.separatorChar;
            sb.append(c2);
            sb.append(b.mCrashLogsFolderName);
            sb.append(c2);
            g = sb.toString();
        }
        return g;
    }

    public static String X() {
        String path;
        if (h == null) {
            if (!com.uc.crashsdk.a.g.a(b.mLogsBackupPathName)) {
                String trim = b.mLogsBackupPathName.trim();
                String str = File.separator;
                if (!trim.endsWith(str)) {
                    trim = trim + str;
                }
                h = trim;
            } else {
                if (!b.M()) {
                    try {
                        path = Environment.getExternalStorageDirectory().getPath();
                    } catch (Throwable th) {
                        com.uc.crashsdk.a.g.a(th);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(path);
                    char c2 = File.separatorChar;
                    sb.append(c2);
                    sb.append(b.mCrashLogsFolderName);
                    sb.append(c2);
                    h = sb.toString();
                }
                path = "/sdcard";
                StringBuilder sb2 = new StringBuilder();
                sb2.append(path);
                char c22 = File.separatorChar;
                sb2.append(c22);
                sb2.append(b.mCrashLogsFolderName);
                sb2.append(c22);
                h = sb2.toString();
            }
        }
        return h;
    }

    private static String Y() {
        Throwable th;
        String str = e;
        if (str != null) {
            return str;
        }
        ZipFile zipFile = null;
        try {
            try {
                zipFile = new ZipFile(com.uc.crashsdk.a.g.c());
                try {
                    e = Long.toHexString(zipFile.getEntry(InstantPatcher.CLASSES_DEX).getCrc());
                    a.a("crashsdk", "version unique build id: " + e);
                    zipFile.close();
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        e = "";
                        com.uc.crashsdk.a.g.a(th);
                        if (zipFile != null) {
                            zipFile.close();
                        }
                        return e;
                    } catch (Throwable th3) {
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (Throwable unused) {
                            }
                        }
                        throw th3;
                    }
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable th4) {
            th = th4;
        }
        return e;
    }

    private static void Z() {
        if (b.d) {
            JNIBridge.nativeSet(24, 1L, a.b, null);
        }
    }

    public static void a(CustomInfo customInfo, VersionInfo versionInfo) {
        CustomInfo customInfo2 = new CustomInfo(customInfo);
        b = customInfo2;
        c(customInfo2);
        c = new VersionInfo(versionInfo);
        if (!b.M()) {
            try {
                a();
            } catch (Throwable th) {
                com.uc.crashsdk.a.g.a(th);
            }
        }
    }

    public static void b() {
        JNIBridge.set(103, com.uc.crashsdk.a.g.b());
        JNIBridge.set(104, b.mTagFilesFolderName);
        JNIBridge.set(105, b.mCrashLogsFolderName);
        JNIBridge.set(106, X());
        JNIBridge.set(107, e.h());
        JNIBridge.set(108, b.a());
        JNIBridge.set(109, S());
        JNIBridge.set(110, T());
        JNIBridge.set(111, U());
        JNIBridge.set(112, "230821205034");
        JNIBridge.set(116, Build.MODEL);
        JNIBridge.set(117, Build.VERSION.RELEASE);
        JNIBridge.set(118, e.q());
        JNIBridge.set(5, b.mCallNativeDefaultHandler);
        JNIBridge.set(6, b.mDumpUserSolibBuildId);
        JNIBridge.set(7, b.mReservedNativeMemoryBytes);
        JNIBridge.set(100, b.mNativeCrashLogFileName);
        JNIBridge.set(101, b.mUnexpCrashLogFileName);
        JNIBridge.set(35, b.mEnableMemoryGroup);
        JNIBridge.set(36, b.mEnableLibcMallocDetail);
        JNIBridge.set(131, b.mLibcMallocDetailConfig);
        JNIBridge.set(102, b.mAppId);
    }

    private static void c(CustomInfo customInfo) {
        if (customInfo.mZippedLogExtension == null) {
            customInfo.mZippedLogExtension = "";
        }
        if (!customInfo.mZippedLogExtension.equals(".tmp")) {
            if (customInfo.mOmitJavaCrash) {
                customInfo.mCallJavaDefaultHandler = false;
            }
            if (customInfo.mOmitNativeCrash) {
                customInfo.mCallNativeDefaultHandler = false;
            }
            long b2 = e.b();
            if (b2 >= 1) {
                customInfo.mMaxBuiltinLogFilesCount = 200;
                customInfo.mMaxCustomLogFilesCount = 100;
                customInfo.mMaxUploadBytesPerDay = 268435456L;
                customInfo.mMaxUploadBuiltinLogCountPerDay = 2000;
                customInfo.mMaxUploadCustomLogCountPerDay = 2000;
                customInfo.mMaxCustomLogCountPerTypePerDay = 100;
                customInfo.mMaxAnrLogCountPerProcess = 100;
                customInfo.mAnrTraceStrategy = 2;
                if (b2 >= 2) {
                    customInfo.mSyncUploadSetupCrashLogs = true;
                    customInfo.mSyncUploadLogs = true;
                    if (b2 >= 3) {
                        customInfo.mBackupLogs = true;
                        customInfo.mPrintStackInfos = true;
                        customInfo.mDebug = true;
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("mZippedLogExtension can not be '.tmp'!");
    }

    public static void d() {
        JNIBridge.set(23, b.mIsInternational);
        JNIBridge.set(37, b.mProductHardcode);
        if (b.I()) {
            JNIBridge.set(34, true);
        }
        if (e.i()) {
            JNIBridge.set(1, true);
        }
        JNIBridge.set(10, b.mFdDumpMinLimit);
        JNIBridge.nativeCmd(3, b.mReservedNativeFileHandleCount, null, null);
        JNIBridge.nativeSetForeground(b.C());
        JNIBridge.set(2, b.G());
        a.e();
        a.g();
        a.i();
        a.k();
        JNIBridge.set(113, a.f14228a);
        JNIBridge.cmd(1);
        JNIBridge.set(22, b.mThreadsDumpMinLimit);
        JNIBridge.set(122, a.a());
        JNIBridge.set(33, a.c());
        Z();
        b.L();
        b.E();
        com.uc.crashsdk.a.g.k();
    }

    public static String e() {
        return b.mAppId;
    }

    public static boolean f() {
        if (!com.uc.crashsdk.a.g.b(b.mJavaCrashLogFileName) && !com.uc.crashsdk.a.g.b(b.mNativeCrashLogFileName)) {
            return com.uc.crashsdk.a.g.b(b.mUnexpCrashLogFileName);
        }
        return true;
    }

    public static String g() {
        return b.mJavaCrashLogFileName;
    }

    public static int h() {
        return b.mCrashRestartInterval;
    }

    public static boolean i() {
        return b.mCallJavaDefaultHandler;
    }

    public static boolean j() {
        return b.mDumpHprofDataForJavaOOM;
    }

    public static boolean k() {
        return b.mRenameFileToDefaultName;
    }

    public static int l() {
        return b.mMaxBuiltinLogFilesCount;
    }

    public static int m() {
        return b.mMaxCustomLogFilesCount;
    }

    public static int n() {
        return b.mMaxJavaLogcatLineCount;
    }

    public static int o() {
        return b.mUnexpDelayMillSeconds;
    }

    public static int p() {
        return b.mUnexpSubTypes;
    }

    public static boolean q() {
        return b.mBackupLogs;
    }

    public static boolean r() {
        return b.mSyncUploadSetupCrashLogs;
    }

    public static boolean s() {
        return b.mSyncUploadLogs;
    }

    public static boolean t() {
        return b.mOmitJavaCrash;
    }

    public static boolean u() {
        return b.mAutoDeleteOldVersionStats;
    }

    public static boolean v() {
        return b.mZipLog;
    }

    public static String w() {
        return b.mZippedLogExtension;
    }

    public static boolean x() {
        return b.mEncryptLog;
    }

    public static int y() {
        return b.mLogMaxBytesLimit;
    }

    public static int z() {
        return b.mLogMaxUploadBytesLimit;
    }

    public static void a(CustomInfo customInfo) {
        boolean z = f14245a;
        if (!z && customInfo.mTagFilesFolderName == null) {
            throw new AssertionError();
        } else if (!z && customInfo.mCrashLogsFolderName == null) {
            throw new AssertionError();
        } else if (customInfo.mTagFilesFolderName.equals(customInfo.mCrashLogsFolderName)) {
            throw new IllegalArgumentException("mTagFilesFolderName and mCrashLogsFolderName can not be set to the same!");
        }
    }

    public static void a(VersionInfo versionInfo) {
        synchronized (d) {
            try {
                c = new VersionInfo(versionInfo);
                e.c();
                if (b.d) {
                    JNIBridge.set(109, S());
                    JNIBridge.set(110, T());
                    JNIBridge.set(111, U());
                    JNIBridge.set(112, "230821205034");
                    JNIBridge.cmd(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a() {
        b.z();
        b.y();
        if (b.mBackupLogs) {
            File file = new File(X());
            if (!file.exists()) {
                file.mkdirs();
            }
        }
    }

    private static String a(String str) {
        return (str == null || !str.contains("_")) ? str : str.replaceAll("_", "-");
    }

    public static CustomInfo a(CustomInfo customInfo, Bundle bundle) {
        if (customInfo == null) {
            CustomInfo customInfo2 = b;
            if (customInfo2 == null) {
                customInfo = new CustomInfo();
            } else {
                customInfo = new CustomInfo(customInfo2);
            }
        }
        Field[] fields = customInfo.getClass().getFields();
        for (String str : bundle.keySet()) {
            for (Field field : fields) {
                if (field.getName().equals(str)) {
                    Object obj = bundle.get(str);
                    try {
                        field.set(customInfo, obj);
                    } catch (Exception e2) {
                        com.uc.crashsdk.a.g.a(e2);
                        StringBuilder sb = new StringBuilder("Field ");
                        sb.append(str);
                        sb.append(" must be a ");
                        sb.append(field.getType().getName());
                        sb.append(", but give a ");
                        sb.append(obj != null ? obj.getClass().getName() : "(null)");
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            }
        }
        return customInfo;
    }

    public static int b(CustomInfo customInfo) {
        int i2;
        boolean z;
        synchronized (i) {
            i2 = 0;
            if (customInfo != null) {
                try {
                    c(customInfo);
                    if (b == null) {
                        b = new CustomInfo();
                    }
                    CustomInfo customInfo2 = b;
                    boolean z2 = true;
                    if (!a(customInfo.mAppId, customInfo2.mAppId)) {
                        String str = customInfo.mAppId;
                        customInfo2.mAppId = str;
                        if (b.d) {
                            JNIBridge.set(102, str);
                        }
                        i2 = 1;
                        z = true;
                    } else {
                        i2 = 0;
                        z = false;
                    }
                    if (!a(customInfo.mJavaCrashLogFileName, customInfo2.mJavaCrashLogFileName)) {
                        customInfo2.mJavaCrashLogFileName = customInfo.mJavaCrashLogFileName;
                        i2++;
                    }
                    if (!a(customInfo.mNativeCrashLogFileName, customInfo2.mNativeCrashLogFileName)) {
                        String str2 = customInfo.mNativeCrashLogFileName;
                        customInfo2.mNativeCrashLogFileName = str2;
                        if (b.d) {
                            JNIBridge.set(100, str2);
                        }
                        i2++;
                        z = true;
                    }
                    if (!a(customInfo.mUnexpCrashLogFileName, customInfo2.mUnexpCrashLogFileName)) {
                        String str3 = customInfo.mUnexpCrashLogFileName;
                        customInfo2.mUnexpCrashLogFileName = str3;
                        if (b.d) {
                            JNIBridge.set(101, str3);
                        }
                        i2++;
                        z = true;
                    }
                    if (z) {
                        e.c();
                        if (b.d) {
                            JNIBridge.cmd(2);
                        }
                    }
                    boolean z3 = customInfo2.mPrintStackInfos;
                    boolean z4 = customInfo.mPrintStackInfos;
                    if (z3 != z4) {
                        customInfo2.mPrintStackInfos = z4;
                        if (b.d) {
                            JNIBridge.set(11, z4);
                        }
                        i2++;
                    }
                    boolean z5 = customInfo2.mDebug;
                    boolean z6 = customInfo.mDebug;
                    if (z5 != z6) {
                        customInfo2.mDebug = z6;
                        if (b.d) {
                            JNIBridge.set(18, z6);
                        }
                        i2++;
                    }
                    boolean z7 = customInfo2.mBackupLogs;
                    boolean z8 = customInfo.mBackupLogs;
                    if (z7 != z8) {
                        customInfo2.mBackupLogs = z8;
                        if (b.d) {
                            JNIBridge.set(12, z8);
                        }
                        i2++;
                    }
                    boolean z9 = customInfo2.mOmitNativeCrash;
                    boolean z10 = customInfo.mOmitNativeCrash;
                    if (z9 != z10) {
                        customInfo2.mOmitNativeCrash = z10;
                        if (b.d) {
                            JNIBridge.set(21, z10);
                        }
                        i2++;
                    }
                    int i3 = customInfo2.mCrashRestartInterval;
                    int i4 = customInfo.mCrashRestartInterval;
                    if (i3 != i4) {
                        customInfo2.mCrashRestartInterval = i4;
                        if (b.d) {
                            JNIBridge.set(13, i4);
                        }
                        if (customInfo2.mCrashRestartInterval >= 0) {
                            b.N();
                        }
                        i2++;
                    }
                    int i5 = customInfo2.mMaxBuiltinLogFilesCount;
                    int i6 = customInfo.mMaxBuiltinLogFilesCount;
                    if (i5 != i6) {
                        customInfo2.mMaxBuiltinLogFilesCount = i6;
                        if (b.d) {
                            JNIBridge.set(14, i6);
                        }
                        i2++;
                    }
                    int i7 = customInfo2.mMaxNativeLogcatLineCount;
                    int i8 = customInfo.mMaxNativeLogcatLineCount;
                    if (i7 != i8) {
                        customInfo2.mMaxNativeLogcatLineCount = i8;
                        if (b.d) {
                            JNIBridge.set(15, i8);
                        }
                        i2++;
                    }
                    int i9 = customInfo2.mMaxJavaLogcatLineCount;
                    int i10 = customInfo.mMaxJavaLogcatLineCount;
                    if (i9 != i10) {
                        customInfo2.mMaxJavaLogcatLineCount = i10;
                        i2++;
                    }
                    int i11 = customInfo2.mMaxUnexpLogcatLineCount;
                    int i12 = customInfo.mMaxUnexpLogcatLineCount;
                    if (i11 != i12) {
                        customInfo2.mMaxUnexpLogcatLineCount = i12;
                        if (b.d) {
                            JNIBridge.set(16, i12);
                        }
                        i2++;
                    }
                    int i13 = customInfo2.mMaxAnrLogcatLineCount;
                    int i14 = customInfo.mMaxAnrLogcatLineCount;
                    if (i13 != i14) {
                        customInfo2.mMaxAnrLogcatLineCount = i14;
                        if (b.d) {
                            JNIBridge.set(31, i14);
                        }
                        i2++;
                    }
                    boolean z11 = customInfo2.mZipLog;
                    boolean z12 = customInfo.mZipLog;
                    if (z11 != z12) {
                        customInfo2.mZipLog = z12;
                        i2++;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!a(customInfo.mZippedLogExtension, customInfo2.mZippedLogExtension)) {
                        customInfo2.mZippedLogExtension = customInfo.mZippedLogExtension;
                        i2++;
                    }
                    if (z2 && b.d) {
                        JNIBridge.nativeSet(3, customInfo2.mZipLog ? 1L : 0L, customInfo2.mZippedLogExtension, null);
                    }
                    int i15 = customInfo2.mLogMaxBytesLimit;
                    int i16 = customInfo.mLogMaxBytesLimit;
                    if (i15 != i16) {
                        customInfo2.mLogMaxBytesLimit = i16;
                        if (b.d) {
                            JNIBridge.set(4, i16);
                        }
                        i2++;
                    }
                    boolean z13 = customInfo2.mEncryptLog;
                    boolean z14 = customInfo.mEncryptLog;
                    if (z13 != z14) {
                        customInfo2.mEncryptLog = z14;
                        i2++;
                    }
                    boolean z15 = customInfo2.mSyncUploadSetupCrashLogs;
                    boolean z16 = customInfo.mSyncUploadSetupCrashLogs;
                    if (z15 != z16) {
                        customInfo2.mSyncUploadSetupCrashLogs = z16;
                        i2++;
                    }
                    boolean z17 = customInfo2.mSyncUploadLogs;
                    boolean z18 = customInfo.mSyncUploadLogs;
                    if (z17 != z18) {
                        customInfo2.mSyncUploadLogs = z18;
                        i2++;
                    }
                    int i17 = customInfo2.mMaxCustomLogFilesCount;
                    int i18 = customInfo.mMaxCustomLogFilesCount;
                    if (i17 != i18) {
                        customInfo2.mMaxCustomLogFilesCount = i18;
                        i2++;
                    }
                    boolean z19 = customInfo2.mOmitJavaCrash;
                    boolean z20 = customInfo.mOmitJavaCrash;
                    if (z19 != z20) {
                        customInfo2.mOmitJavaCrash = z20;
                        i2++;
                    }
                    int i19 = customInfo2.mLogMaxUploadBytesLimit;
                    int i20 = customInfo.mLogMaxUploadBytesLimit;
                    if (i19 != i20) {
                        customInfo2.mLogMaxUploadBytesLimit = i20;
                        i2++;
                    }
                    long j = customInfo2.mMaxUploadBytesPerDay;
                    long j2 = customInfo.mMaxUploadBytesPerDay;
                    if (j != j2) {
                        customInfo2.mMaxUploadBytesPerDay = j2;
                        i2++;
                    }
                    int i21 = customInfo2.mMaxUploadBuiltinLogCountPerDay;
                    int i22 = customInfo.mMaxUploadBuiltinLogCountPerDay;
                    if (i21 != i22) {
                        customInfo2.mMaxUploadBuiltinLogCountPerDay = i22;
                        i2++;
                    }
                    int i23 = customInfo2.mMaxUploadCustomLogCountPerDay;
                    int i24 = customInfo.mMaxUploadCustomLogCountPerDay;
                    if (i23 != i24) {
                        customInfo2.mMaxUploadCustomLogCountPerDay = i24;
                        i2++;
                    }
                    int i25 = customInfo2.mMaxCustomLogCountPerTypePerDay;
                    int i26 = customInfo.mMaxCustomLogCountPerTypePerDay;
                    if (i25 != i26) {
                        customInfo2.mMaxCustomLogCountPerTypePerDay = i26;
                        i2++;
                    }
                    int i27 = customInfo2.mMaxAnrLogCountPerProcess;
                    int i28 = customInfo.mMaxAnrLogCountPerProcess;
                    if (i27 != i28) {
                        customInfo2.mMaxAnrLogCountPerProcess = i28;
                        if (b.d) {
                            JNIBridge.set(32, b.mMaxAnrLogCountPerProcess);
                        }
                        i2++;
                    }
                    boolean z21 = customInfo2.mCallJavaDefaultHandler;
                    boolean z22 = customInfo.mCallJavaDefaultHandler;
                    if (z21 != z22) {
                        customInfo2.mCallJavaDefaultHandler = z22;
                        i2++;
                    }
                    boolean z23 = customInfo2.mCallNativeDefaultHandler;
                    boolean z24 = customInfo.mCallNativeDefaultHandler;
                    if (z23 != z24) {
                        customInfo2.mCallNativeDefaultHandler = z24;
                        i2++;
                        if (b.d) {
                            JNIBridge.set(5, b.mCallNativeDefaultHandler);
                        }
                    }
                    boolean z25 = customInfo2.mDumpUserSolibBuildId;
                    boolean z26 = customInfo.mDumpUserSolibBuildId;
                    if (z25 != z26) {
                        customInfo2.mDumpUserSolibBuildId = z26;
                        i2++;
                        if (b.d) {
                            JNIBridge.set(6, b.mDumpUserSolibBuildId);
                        }
                    }
                    boolean z27 = customInfo2.mDumpHprofDataForJavaOOM;
                    boolean z28 = customInfo.mDumpHprofDataForJavaOOM;
                    if (z27 != z28) {
                        customInfo2.mDumpHprofDataForJavaOOM = z28;
                        i2++;
                    }
                    boolean z29 = customInfo2.mRenameFileToDefaultName;
                    boolean z30 = customInfo.mRenameFileToDefaultName;
                    if (z29 != z30) {
                        customInfo2.mRenameFileToDefaultName = z30;
                        i2++;
                    }
                    boolean z31 = customInfo2.mAutoDeleteOldVersionStats;
                    boolean z32 = customInfo.mAutoDeleteOldVersionStats;
                    if (z31 != z32) {
                        customInfo2.mAutoDeleteOldVersionStats = z32;
                        i2++;
                    }
                    int i29 = customInfo2.mFdDumpMinLimit;
                    int i30 = customInfo.mFdDumpMinLimit;
                    if (i29 != i30) {
                        customInfo2.mFdDumpMinLimit = i30;
                        if (b.d) {
                            JNIBridge.set(10, i30);
                        }
                        i2++;
                    }
                    int i31 = customInfo2.mThreadsDumpMinLimit;
                    int i32 = customInfo.mThreadsDumpMinLimit;
                    if (i31 != i32) {
                        customInfo2.mThreadsDumpMinLimit = i32;
                        if (b.d) {
                            JNIBridge.set(22, i32);
                        }
                        i2++;
                    }
                    int i33 = customInfo2.mInfoUpdateInterval;
                    int i34 = customInfo.mInfoUpdateInterval;
                    if (i33 != i34) {
                        if (i33 <= 0 && i34 > 0) {
                            a.a(false);
                        }
                        customInfo2.mInfoUpdateInterval = customInfo.mInfoUpdateInterval;
                        i2++;
                    }
                    int i35 = customInfo2.mInfoSaveFrequency;
                    int i36 = customInfo.mInfoSaveFrequency;
                    if (i35 != i36) {
                        customInfo2.mInfoSaveFrequency = i36;
                        i2++;
                    }
                    long j3 = customInfo2.mDisableBackgroundSignals;
                    long j4 = customInfo.mDisableBackgroundSignals;
                    if (j3 != j4) {
                        customInfo2.mDisableBackgroundSignals = j4;
                        if (b.d) {
                            JNIBridge.set(9, j4);
                        }
                        i2++;
                    }
                    boolean z33 = customInfo2.mEnableStatReport;
                    boolean z34 = customInfo.mEnableStatReport;
                    if (z33 != z34) {
                        customInfo2.mEnableStatReport = z34;
                        if (z34) {
                            e.B();
                        }
                        i2++;
                    }
                    boolean z35 = customInfo2.mIsInternational;
                    boolean z36 = customInfo.mIsInternational;
                    if (z35 != z36) {
                        customInfo2.mIsInternational = z36;
                        if (b.d) {
                            JNIBridge.set(23, z36);
                        }
                        e.l();
                        d.c();
                        h.k();
                        i2++;
                    }
                    int i37 = customInfo2.mProductHardcode;
                    int i38 = customInfo.mProductHardcode;
                    if (i37 != i38) {
                        customInfo2.mProductHardcode = i38;
                        if (b.d) {
                            JNIBridge.set(37, i38);
                        }
                        e.l();
                        d.c();
                        h.k();
                        i2++;
                    }
                    boolean z37 = customInfo2.mAutoDetectLifeCycle;
                    boolean z38 = customInfo.mAutoDetectLifeCycle;
                    if (z37 != z38) {
                        customInfo2.mAutoDetectLifeCycle = z38;
                        if (z38) {
                            b.D();
                        }
                        i2++;
                    }
                    boolean z39 = customInfo2.mMonitorBattery;
                    boolean z40 = customInfo.mMonitorBattery;
                    if (z39 != z40) {
                        customInfo2.mMonitorBattery = z40;
                        e.c(b.C());
                        i2++;
                    }
                    int i39 = customInfo2.mUnexpSubTypes;
                    int i40 = customInfo.mUnexpSubTypes;
                    if (i39 != i40) {
                        customInfo2.mUnexpSubTypes = i40;
                        i2++;
                    }
                    boolean z41 = customInfo2.mEnableMemoryGroup;
                    boolean z42 = customInfo.mEnableMemoryGroup;
                    if (z41 != z42) {
                        customInfo2.mEnableMemoryGroup = z42;
                        if (b.d) {
                            JNIBridge.set(35, z42);
                        }
                        i2++;
                    }
                    boolean z43 = customInfo2.mEnableLibcMallocDetail;
                    boolean z44 = customInfo.mEnableLibcMallocDetail;
                    if (z43 != z44) {
                        customInfo2.mEnableLibcMallocDetail = z44;
                        if (b.d) {
                            JNIBridge.set(36, z44);
                        }
                        i2++;
                    }
                    String str4 = customInfo2.mLibcMallocDetailConfig;
                    String str5 = customInfo.mLibcMallocDetailConfig;
                    if (str4 != str5) {
                        customInfo2.mLibcMallocDetailConfig = str5;
                        if (b.d) {
                            JNIBridge.set(131, str5);
                        }
                        i2++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return i2;
    }

    public static void c() {
        JNIBridge.set(11, N());
        JNIBridge.set(12, b.mBackupLogs);
        JNIBridge.set(13, b.mCrashRestartInterval);
        JNIBridge.set(14, b.mMaxBuiltinLogFilesCount);
        JNIBridge.set(15, b.mMaxNativeLogcatLineCount);
        JNIBridge.set(16, b.mMaxUnexpLogcatLineCount);
        JNIBridge.set(31, b.mMaxAnrLogcatLineCount);
        JNIBridge.set(18, M());
        JNIBridge.set(20, Build.VERSION.SDK_INT);
        JNIBridge.set(21, b.mOmitNativeCrash);
        JNIBridge.set(32, b.mMaxAnrLogCountPerProcess);
        JNIBridge.set(8, b.mDisableSignals);
        JNIBridge.set(9, b.mDisableBackgroundSignals);
        CustomInfo customInfo = b;
        JNIBridge.nativeSet(3, customInfo.mZipLog ? 1L : 0L, customInfo.mZippedLogExtension, null);
        JNIBridge.set(4, b.mLogMaxBytesLimit);
        JNIBridge.set(119, Build.FINGERPRINT);
    }

    public static VersionInfo a(Bundle bundle) {
        VersionInfo versionInfo;
        VersionInfo versionInfo2 = c;
        if (versionInfo2 == null) {
            versionInfo = new VersionInfo();
        } else {
            versionInfo = new VersionInfo(versionInfo2);
        }
        String string = bundle.getString("mVersion");
        if (!com.uc.crashsdk.a.g.a(string)) {
            versionInfo.mVersion = string;
        }
        String string2 = bundle.getString("mSubVersion");
        if (!com.uc.crashsdk.a.g.a(string2)) {
            versionInfo.mSubVersion = string2;
        }
        String string3 = bundle.getString("mBuildId");
        if (!com.uc.crashsdk.a.g.a(string3)) {
            versionInfo.mBuildId = string3;
        }
        String string4 = bundle.getString("crver");
        if (!com.uc.crashsdk.a.g.a(string4)) {
            a.b = string4;
            Z();
        }
        return versionInfo;
    }

    private static boolean a(String str, String str2) {
        if (str == str2) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2);
    }
}
