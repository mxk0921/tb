package com.facebook.jni;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class NativeRunnable implements Runnable {
    private final HybridData mHybridData;

    static {
        t2o.a(503316487);
    }

    private NativeRunnable(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // java.lang.Runnable
    public native void run();
}
