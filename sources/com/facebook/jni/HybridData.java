package com.facebook.jni;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class HybridData {
    private long mNativePointer = 0;

    static {
        t2o.a(503316484);
    }

    public void finalize() throws Throwable {
        resetNative();
        super.finalize();
    }

    public boolean isValid() {
        if (this.mNativePointer != 0) {
            return true;
        }
        return false;
    }

    public native void resetNative();
}
