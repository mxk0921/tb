package com.alibaba.android.split.core.internal;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class SplitLoadException extends RuntimeException {
    static {
        t2o.a(677380164);
    }

    public SplitLoadException() {
        super("Failed to bind to the service.");
    }

    public SplitLoadException(String str) {
        super(str);
    }

    public SplitLoadException(String str, Throwable th) {
        super(str, th);
    }
}
