package com.facebook.jni;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class Countable {
    private long mInstance = 0;

    static {
        t2o.a(503316481);
    }

    public native void dispose();

    public void finalize() throws Throwable {
        dispose();
        super.finalize();
    }
}
