package com.taobao.android.tcrash;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface UncaughtCrashManager {
    void addAnrUncaughtListener(AnrUncaughtListener anrUncaughtListener);

    void addJvmUncaughtCrashListener(JvmUncaughtCrashListener jvmUncaughtCrashListener);

    void addOnFileCreatedListener(UncaughtCrashType uncaughtCrashType, OnFileCreatedListener onFileCreatedListener);

    UncaughtCrashHeader getUncaughtCrashHeader();

    UncaughtCrashHeader getUncaughtCrashHeaderByType(UncaughtCrashType uncaughtCrashType);

    void removeAnrUncaughtListener(AnrUncaughtListener anrUncaughtListener);

    void removeJvmUncaughtCrashListener(JvmUncaughtCrashListener jvmUncaughtCrashListener);

    void removeOnFileCreatedListener(UncaughtCrashType uncaughtCrashType, OnFileCreatedListener onFileCreatedListener);
}
