package com.uc.webview.base.cyclone;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class Cpu {
    public static int resetCpuAffinity() {
        int i = a.f14264a;
        if (i != -1000) {
            return i;
        }
        return resetCpuAffinityImpl();
    }

    private static native int resetCpuAffinityImpl();

    public static int setPreferEfficiencyCpu() {
        int i = a.f14264a;
        if (i != -1000) {
            return i;
        }
        return setPreferEfficiencyCpuImpl();
    }

    private static native int setPreferEfficiencyCpuImpl();

    public static int setPreferPerformanceCpu() {
        int i = a.f14264a;
        if (i != -1000) {
            return i;
        }
        return setPreferPerformanceCpuImpl();
    }

    private static native int setPreferPerformanceCpuImpl();
}
