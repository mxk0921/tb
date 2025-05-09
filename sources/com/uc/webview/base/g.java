package com.uc.webview.base;

import com.uc.webview.base.cyclone.Cpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class g implements AutoCloseable {
    private g() {
        Cpu.setPreferPerformanceCpu();
    }

    public static g a() {
        if (!GlobalSettings.getBoolValue(94)) {
            return null;
        }
        return new g();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Cpu.resetCpuAffinity();
    }
}
