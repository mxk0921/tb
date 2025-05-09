package com.uc.webview.export.multiprocess.helper;

import android.os.StrictMode;
import java.io.Closeable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class d implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final StrictMode.ThreadPolicy f14336a;
    private final StrictMode.VmPolicy b;

    private d(StrictMode.ThreadPolicy threadPolicy) {
        this.f14336a = threadPolicy;
        this.b = null;
    }

    public static d a() {
        return new d(StrictMode.allowThreadDiskReads(), (byte) 0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        StrictMode.ThreadPolicy threadPolicy = this.f14336a;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        StrictMode.VmPolicy vmPolicy = this.b;
        if (vmPolicy != null) {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    private d(StrictMode.ThreadPolicy threadPolicy, byte b) {
        this(threadPolicy);
    }
}
