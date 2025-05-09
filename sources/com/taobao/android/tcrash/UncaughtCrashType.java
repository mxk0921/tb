package com.taobao.android.tcrash;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum UncaughtCrashType {
    JAVA_ONLY,
    ANR_ONLY,
    NATIVE_ONLY,
    ALL;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(UncaughtCrashType uncaughtCrashType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tcrash/UncaughtCrashType");
    }

    public static UncaughtCrashType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UncaughtCrashType) ipChange.ipc$dispatch("e81418c7", new Object[]{str});
        }
        return (UncaughtCrashType) Enum.valueOf(UncaughtCrashType.class, str);
    }
}
