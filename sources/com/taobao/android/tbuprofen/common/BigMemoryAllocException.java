package com.taobao.android.tbuprofen.common;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class BigMemoryAllocException extends Throwable {
    static {
        t2o.a(824180785);
    }

    public BigMemoryAllocException(StackTraceElement[] stackTraceElementArr, String str, long j) {
        super(String.format("allocated %s (%d byte)", str, Long.valueOf(j)));
        setStackTrace(stackTraceElementArr);
    }
}
