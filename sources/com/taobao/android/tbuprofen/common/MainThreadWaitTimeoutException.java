package com.taobao.android.tbuprofen.common;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MainThreadWaitTimeoutException extends Throwable {
    static {
        t2o.a(824180787);
    }

    public MainThreadWaitTimeoutException(StackTraceElement[] stackTraceElementArr, String str, long j) {
        super(String.format("main thread wait on %s (%dms)", str, Long.valueOf(j)));
        setStackTrace(stackTraceElementArr);
    }
}
