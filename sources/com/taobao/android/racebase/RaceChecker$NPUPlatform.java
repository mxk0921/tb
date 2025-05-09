package com.taobao.android.racebase;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum RaceChecker$NPUPlatform {
    UNKNOWN,
    HIAI,
    SNPE,
    NEURON;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(RaceChecker$NPUPlatform raceChecker$NPUPlatform, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/racebase/RaceChecker$NPUPlatform");
    }

    public static RaceChecker$NPUPlatform valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RaceChecker$NPUPlatform) ipChange.ipc$dispatch("179e1fbe", new Object[]{str});
        }
        return (RaceChecker$NPUPlatform) Enum.valueOf(RaceChecker$NPUPlatform.class, str);
    }
}
